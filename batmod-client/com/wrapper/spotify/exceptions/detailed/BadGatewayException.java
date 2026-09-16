package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class BadGatewayException extends SpotifyWebApiException {
   public BadGatewayException() {
   }

   public BadGatewayException(String message) {
      super(message);
   }

   public BadGatewayException(String message, Throwable cause) {
      super(message, cause);
   }
}
