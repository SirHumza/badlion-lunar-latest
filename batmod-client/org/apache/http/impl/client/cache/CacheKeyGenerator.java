package org.apache.http.impl.client.cache;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.cache.HttpCacheEntry;
import org.apache.http.client.utils.URIUtils;

@Immutable
class CacheKeyGenerator {
   private static final URI BASE_URI = URI.create("http://example.com/");

   public String getURI(HttpHost host, HttpRequest req) {
      return this.isRelativeRequest(req)
         ? this.canonicalizeUri(String.format("%s%s", host.toString(), req.getRequestLine().getUri()))
         : this.canonicalizeUri(req.getRequestLine().getUri());
   }

   public String canonicalizeUri(String uri) {
      try {
         URI normalized = URIUtils.resolve(BASE_URI, uri);
         URL u = new URL(normalized.toASCIIString());
         String protocol = u.getProtocol();
         String hostname = u.getHost();
         int port = this.canonicalizePort(u.getPort(), protocol);
         String path = u.getPath();
         String query = u.getQuery();
         String file = query != null ? path + "?" + query : path;
         URL out = new URL(protocol, hostname, port, file);
         return out.toString();
      } catch (IllegalArgumentException e) {
         return uri;
      } catch (MalformedURLException e) {
         return uri;
      }
   }

   private int canonicalizePort(int port, String protocol) {
      if (port == -1 && "http".equalsIgnoreCase(protocol)) {
         return 80;
      } else {
         return port == -1 && "https".equalsIgnoreCase(protocol) ? 443 : port;
      }
   }

   private boolean isRelativeRequest(HttpRequest req) {
      String requestUri = req.getRequestLine().getUri();
      return "*".equals(requestUri) || requestUri.startsWith("/");
   }

   protected String getFullHeaderValue(Header[] headers) {
      if (headers == null) {
         return "";
      }

      StringBuilder buf = new StringBuilder("");
      boolean first = true;

      for (Header hdr : headers) {
         if (!first) {
            buf.append(", ");
         }

         buf.append(hdr.getValue().trim());
         first = false;
      }

      return buf.toString();
   }

   public String getVariantURI(HttpHost host, HttpRequest req, HttpCacheEntry entry) {
      return !entry.hasVariants() ? this.getURI(host, req) : this.getVariantKey(req, entry) + this.getURI(host, req);
   }

   public String getVariantKey(HttpRequest req, HttpCacheEntry entry) {
      List<String> variantHeaderNames = new ArrayList<>();

      for (Header varyHdr : entry.getHeaders("Vary")) {
         for (HeaderElement elt : varyHdr.getElements()) {
            variantHeaderNames.add(elt.getName());
         }
      }

      Collections.sort(variantHeaderNames);

      StringBuilder buf;
      try {
         buf = new StringBuilder("{");
         boolean first = true;

         for (String headerName : variantHeaderNames) {
            if (!first) {
               buf.append("&");
            }

            buf.append(URLEncoder.encode(headerName, Consts.UTF_8.name()));
            buf.append("=");
            buf.append(URLEncoder.encode(this.getFullHeaderValue(req.getHeaders(headerName)), Consts.UTF_8.name()));
            first = false;
         }

         buf.append("}");
      } catch (UnsupportedEncodingException uee) {
         throw new RuntimeException("couldn't encode to UTF-8", uee);
      }

      return buf.toString();
   }
}
