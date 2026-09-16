package com.wrapper.spotify.requests;

import com.wrapper.spotify.IHttpManager;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.concurrent.Future;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;

public interface IRequest {
   IHttpManager getHttpManager();

   URI getUri();

   List<Header> getHeaders();

   ContentType getContentType();

   HttpEntity getBody();

   List<NameValuePair> getBodyParameters();

   <T> T execute() throws IOException, SpotifyWebApiException;

   <T> Future<T> executeAsync();

   String getJson() throws IOException, SpotifyWebApiException;

   String postJson() throws IOException, SpotifyWebApiException;

   String putJson() throws IOException, SpotifyWebApiException;

   String deleteJson() throws IOException, SpotifyWebApiException;

   interface Builder {
      IRequest.Builder setHttpManager(IHttpManager var1);

      IRequest.Builder setScheme(String var1);

      IRequest.Builder setHost(String var1);

      IRequest.Builder setPort(Integer var1);

      IRequest.Builder setPath(String var1);

      IRequest.Builder setPathParameter(String var1, String var2);

      IRequest.Builder setDefaults(IHttpManager var1, String var2, String var3, Integer var4);

      <T> IRequest.Builder setQueryParameter(String var1, T var2);

      <T> IRequest.Builder setHeader(String var1, T var2);

      IRequest.Builder setContentType(ContentType var1);

      IRequest.Builder setBody(HttpEntity var1);

      <T> IRequest.Builder setBodyParameter(String var1, T var2);

      AbstractRequest build();
   }
}
