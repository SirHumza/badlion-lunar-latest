package com.wrapper.spotify.exceptions.detailed;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;

public class TooManyRequestsException extends SpotifyWebApiException {
   private int retryAfter;

   public TooManyRequestsException() {
   }

   public TooManyRequestsException(String message, int retryAfter) {
      super(message);
      this.setRetryAfter(retryAfter);
   }

   public TooManyRequestsException(String message) {
      super(message);
   }

   public TooManyRequestsException(String message, Throwable cause) {
      super(message, cause);
   }

   public int getRetryAfter() {
      return this.retryAfter;
   }

   public void setRetryAfter(int retryAfter) {
      this.retryAfter = retryAfter;
   }
}
