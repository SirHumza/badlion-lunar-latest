package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class ServiceUnavailableException extends SpotifyWebApiException {
   public ServiceUnavailableException() {
   }

   public ServiceUnavailableException(String message) {
      super(message);
   }

   public ServiceUnavailableException(String message, Throwable cause) {
      super(message, cause);
   }
}
