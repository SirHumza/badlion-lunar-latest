package com.wrapper.spotify;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import java.io.IOException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public interface IHttpManager {
   String get(URI var1, Header[] var2) throws IOException, SpotifyWebApiException;

   String post(URI var1, Header[] var2, HttpEntity var3) throws IOException, SpotifyWebApiException;

   String put(URI var1, Header[] var2, HttpEntity var3) throws IOException, SpotifyWebApiException;

   String delete(URI var1, Header[] var2, HttpEntity var3) throws IOException, SpotifyWebApiException;
}
