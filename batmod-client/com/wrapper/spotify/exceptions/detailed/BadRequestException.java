package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class BadRequestException extends SpotifyWebApiException {
   public BadRequestException() {
   }

   public BadRequestException(String message) {
      super(message);
   }

   public BadRequestException(String message, Throwable cause) {
      super(message, cause);
   }
}
