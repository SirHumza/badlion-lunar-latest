package com.wrapper.spotify.requests.authorization.client_credentials;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.AbstractAthorizationRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class ClientCredentialsRequest extends AbstractAthorizationRequest {
   public ClientCredentialsRequest(ClientCredentialsRequest.Builder builder) {
      super(builder);
   }

   public ClientCredentials execute() throws IOException, SpotifyWebApiException {
      return new ClientCredentials.JsonUtil().createModelObject(this.postJson());
   }

   public static final class Builder extends AbstractAthorizationRequest.Builder<ClientCredentialsRequest.Builder> {
      public Builder(String clientId, String clientSecret) {
         super(clientId, clientSecret);
      }

      public ClientCredentialsRequest.Builder grant_type(String grant_type) {
         assert grant_type != null;
         assert grant_type.equals("client_credentials");
         return this.setBodyParameter("grant_type", grant_type);
      }

      public ClientCredentialsRequest build() {
         this.setContentType(ContentType.APPLICATION_FORM_URLENCODED);
         this.setHost("accounts.spotify.com");
         this.setPort(443);
         this.setScheme("https");
         this.setPath("/api/token");
         return new ClientCredentialsRequest(this);
      }
   }
}
