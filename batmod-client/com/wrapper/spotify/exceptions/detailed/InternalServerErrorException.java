package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class InternalServerErrorException extends SpotifyWebApiException {
   public InternalServerErrorException() {
   }

   public InternalServerErrorException(String message) {
      super(message);
   }

   public InternalServerErrorException(String message, Throwable cause) {
      super(message, cause);
   }
}
