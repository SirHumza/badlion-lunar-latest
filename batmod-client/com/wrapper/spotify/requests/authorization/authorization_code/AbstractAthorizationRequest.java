package com.wrapper.spotify.requests.authorization.authorization_code;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import com.wrapper.spotify.requests.authorization.AbstractAthorizationRequest;
import java.io.IOException;
import org.apache.http.entity.ContentType;

public class AuthorizationCodeRefreshRequest extends AbstractAthorizationRequest {
   private AuthorizationCodeRefreshRequest(AuthorizationCodeRefreshRequest.Builder builder) {
      super(builder);
   }

   public AuthorizationCodeCredentials execute() throws IOException, SpotifyWebApiException {
      return new AuthorizationCodeCredentials.JsonUtil().createModelObject(this.postJson());
   }

   public static final class Builder extends AbstractAthorizationRequest.Builder<AuthorizationCodeRefreshRequest.Builder> {
      public Builder(String clientId, String clientSecret) {
         super(clientId, clientSecret);
      }

      public AuthorizationCodeRefreshRequest.Builder grant_type(String grant_type) {
         assert grant_type != null;
         assert grant_type.equals("refresh_token");
         return this.setBodyParameter("grant_type", grant_type);
      }

      public AuthorizationCodeRefreshRequest.Builder refresh_token(String refresh_token) {
         assert refresh_token != null;
         assert !refresh_token.equals("");
         return this.setBodyParameter("refresh_token", refresh_token);
      }

      public AuthorizationCodeRefreshRequest build() {
         this.setContentType(ContentType.APPLICATION_FORM_URLENCODED);
         this.setHost("accounts.spotify.com");
         this.setPort(443);
         this.setScheme("https");
         this.setPath("/api/token");
         return new AuthorizationCodeRefreshRequest(this);
      }
   }
}
