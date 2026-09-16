package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class NotFoundException extends SpotifyWebApiException {
   public NotFoundException() {
   }

   public NotFoundException(String message) {
      super(message);
   }

   public NotFoundException(String message, Throwable cause) {
      super(message, cause);
   }
}
