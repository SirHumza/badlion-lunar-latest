package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class UnauthorizedException extends SpotifyWebApiException {
   public UnauthorizedException() {
   }

   public UnauthorizedException(String message) {
      super(message);
   }

   public UnauthorizedException(String message, Throwable cause) {
      super(message, cause);
   }
}
