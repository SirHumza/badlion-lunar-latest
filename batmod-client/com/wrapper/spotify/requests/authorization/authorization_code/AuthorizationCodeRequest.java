package com.wrapper.spotify.requests.authorization.authorization_code;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import com.wrapper.spotify.requests.authorization.AbstractAthorizationRequest;
import java.io.IOException;
import java.net.URI;
import org.apache.http.entity.ContentType;

public class AuthorizationCodeRequest extends AbstractAthorizationRequest {
   private AuthorizationCodeRequest(AuthorizationCodeRequest.Builder builder) {
      super(builder);
   }

   public AuthorizationCodeCredentials execute() throws IOException, SpotifyWebApiException {
      return new AuthorizationCodeCredentials.JsonUtil().createModelObject(this.postJson());
   }

   public static final class Builder extends AbstractAthorizationRequest.Builder<AuthorizationCodeRequest.Builder> {
      public Builder(String clientId, String clientSecret) {
         super(clientId, clientSecret);
      }

      public AuthorizationCodeRequest.Builder grant_type(String grant_type) {
         assert grant_type != null;
         assert grant_type.equals("authorization_code");
         return this.setBodyParameter("grant_type", grant_type);
      }

      public AuthorizationCodeRequest.Builder code(String code) {
         assert code != null;
         assert !code.equals("");
         return this.setBodyParameter("code", code);
      }

      public AuthorizationCodeRequest.Builder redirect_uri(URI redirect_uri) {
         assert redirect_uri != null;
         return this.setBodyParameter("redirect_uri", redirect_uri.toString());
      }

      public AuthorizationCodeRequest build() {
         this.setContentType(ContentType.APPLICATION_FORM_URLENCODED);
         this.setHost("accounts.spotify.com");
         this.setPort(443);
         this.setScheme("https");
         this.setPath("/api/token");
         return new AuthorizationCodeRequest(this);
      }
   }
}
