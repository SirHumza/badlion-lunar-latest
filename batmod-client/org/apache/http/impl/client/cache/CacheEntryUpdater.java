package org.apache.http.impl.client.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.cache.HttpCacheEntry;
import org.apache.http.client.cache.Resource;
import org.apache.http.client.cache.ResourceFactory;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.util.Args;

@Immutable
class CacheEntryUpdater {
   private final ResourceFactory resourceFactory;

   CacheEntryUpdater() {
      this(new HeapResourceFactory());
   }

   CacheEntryUpdater(ResourceFactory resourceFactory) {
      this.resourceFactory = resourceFactory;
   }

   public HttpCacheEntry updateCacheEntry(String requestId, HttpCacheEntry entry, Date requestDate, Date responseDate, HttpResponse response) throws IOException {
      Args.check(response.getStatusLine().getStatusCode() == 304, "Response must have 304 status code");
      Header[] mergedHeaders = this.mergeHeaders(entry, response);
      Resource resource = null;
      if (entry.getResource() != null) {
         resource = this.resourceFactory.copy(requestId, entry.getResource());
      }

      return new HttpCacheEntry(requestDate, responseDate, entry.getStatusLine(), mergedHeaders, resource);
   }

   protected Header[] mergeHeaders(HttpCacheEntry entry, HttpResponse response) {
      if (this.entryAndResponseHaveDateHeader(entry, response) && this.entryDateHeaderNewerThenResponse(entry, response)) {
         return entry.getAllHeaders();
      }

      List<Header> cacheEntryHeaderList = new ArrayList<>(Arrays.asList(entry.getAllHeaders()));
      this.removeCacheHeadersThatMatchResponse(cacheEntryHeaderList, response);
      this.removeCacheEntry1xxWarnings(cacheEntryHeaderList, entry);
      cacheEntryHeaderList.addAll(Arrays.asList(response.getAllHeaders()));
      return cacheEntryHeaderList.toArray(new Header[cacheEntryHeaderList.size()]);
   }

   private void removeCacheHeadersThatMatchResponse(List<Header> cacheEntryHeaderList, HttpResponse response) {
      for (Header responseHeader : response.getAllHeaders()) {
         ListIterator<Header> cacheEntryHeaderListIter = cacheEntryHeaderList.listIterator();

         while (cacheEntryHeaderListIter.hasNext()) {
            String cacheEntryHeaderName = cacheEntryHeaderListIter.next().getName();
            if (cacheEntryHeaderName.equals(responseHeader.getName())) {
               cacheEntryHeaderListIter.remove();
            }
         }
      }
   }

   private void removeCacheEntry1xxWarnings(List<Header> cacheEntryHeaderList, HttpCacheEntry entry) {
      ListIterator<Header> cacheEntryHeaderListIter = cacheEntryHeaderList.listIterator();

      while (cacheEntryHeaderListIter.hasNext()) {
         String cacheEntryHeaderName = cacheEntryHeaderListIter.next().getName();
         if ("Warning".equals(cacheEntryHeaderName)) {
            for (Header cacheEntryWarning : entry.getHeaders("Warning")) {
               if (cacheEntryWarning.getValue().startsWith("1")) {
                  cacheEntryHeaderListIter.remove();
               }
            }
         }
      }
   }

   private boolean entryDateHeaderNewerThenResponse(HttpCacheEntry entry, HttpResponse response) {
      Date entryDate = DateUtils.parseDate(entry.getFirstHeader("Date").getValue());
      Date responseDate = DateUtils.parseDate(response.getFirstHeader("Date").getValue());
      return entryDate == null || responseDate == null ? false : entryDate.after(responseDate);
   }

   private boolean entryAndResponseHaveDateHeader(HttpCacheEntry entry, HttpResponse response) {
      return entry.getFirstHeader("Date") != null && response.getFirstHeader("Date") != null;
   }
}
