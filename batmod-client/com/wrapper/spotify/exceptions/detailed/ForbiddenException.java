package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class ForbiddenException extends SpotifyWebApiException {
   public ForbiddenException() {
   }

   public ForbiddenException(String message) {
      super(message);
   }

   public ForbiddenException(String message, Throwable cause) {
      super(message, cause);
   }
}
