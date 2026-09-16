package com.wrapper.spotify.requests.data;

import com.wrapper.spotify.requests.AbstractRequest;

public abstract class AbstractDataRequest extends AbstractRequest {
   protected AbstractDataRequest(AbstractDataRequest.Builder builder) {
      super(builder);
   }

   public abstract static class Builder<BuilderType extends AbstractDataRequest.Builder<?>> extends AbstractRequest.Builder<BuilderType> {
      protected Builder(String accessToken) {
         assert accessToken != null;
         assert !accessToken.equals("");
         this.setHeader("Authorization", "Bearer " + accessToken);
      }
   }
}
