package com.wrapper.spotify.requests.authorization.authorization_code;

import com.wrapper.spotify.requests.AbstractRequest;
import java.net.URI;

public class AuthorizationCodeUriRequest extends AbstractRequest {
   private AuthorizationCodeUriRequest(AuthorizationCodeUriRequest.Builder builder) {
      super(builder);
   }

   public URI execute() {
      return this.getUri();
   }

   public static final class Builder extends AbstractRequest.Builder<AuthorizationCodeUriRequest.Builder> {
      public AuthorizationCodeUriRequest.Builder client_id(String client_id) {
         assert client_id != null;
         assert !client_id.equals("");
         return this.setQueryParameter("client_id", client_id);
      }

      public AuthorizationCodeUriRequest.Builder response_type(String response_type) {
         assert response_type != null;
         assert !response_type.equals("");
         return this.setQueryParameter("response_type", response_type);
      }

      public AuthorizationCodeUriRequest.Builder redirect_uri(URI redirect_uri) {
         assert redirect_uri != null;
         return this.setQueryParameter("redirect_uri", redirect_uri.toString());
      }

      public AuthorizationCodeUriRequest.Builder state(String state) {
         assert state != null;
         assert !state.equals("");
         return this.setQueryParameter("state", state);
      }

      public AuthorizationCodeUriRequest.Builder scope(String scope) {
         assert scope != null;
         assert !scope.equals("");
         return this.setQueryParameter("scope", scope);
      }

      public AuthorizationCodeUriRequest.Builder show_dialog(boolean show_dialog) {
         return this.setQueryParameter("show_dialog", show_dialog);
      }

      public AuthorizationCodeUriRequest build() {
         this.setHost("accounts.spotify.com");
         this.setPort(443);
         this.setScheme("https");
         this.setPath("/authorize");
         return new AuthorizationCodeUriRequest(this);
      }
   }
}
