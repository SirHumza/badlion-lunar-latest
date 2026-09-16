package com.wrapper.spotify.requests.authorization;

import com.wrapper.spotify.Base64;
import com.wrapper.spotify.requests.AbstractRequest;

public abstract class AbstractAthorizationRequest extends AbstractRequest {
   protected AbstractAthorizationRequest(AbstractAthorizationRequest.Builder builder) {
      super(builder);
   }

   public abstract static class Builder<BuilderType extends AbstractAthorizationRequest.Builder<?>> extends AbstractRequest.Builder<BuilderType> {
      protected Builder(String clientId, String clientSecret) {
         assert clientId != null;
         assert clientSecret != null;
         assert !clientId.equals("");
         assert !clientSecret.equals("");
         this.setHeader("Authorization", "Basic " + Base64.encode((clientId + ":" + clientSecret).getBytes()));
      }
   }
}
