package com.wrapper.spotify.requests.data.browse;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.LanguageCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Category;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetCategoryRequest extends AbstractDataRequest {
   private GetCategoryRequest(GetCategoryRequest.Builder builder) {
      super(builder);
   }

   public Category execute() throws IOException, SpotifyWebApiException {
      return new Category.JsonUtil().createModelObject(this.getJson());
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetCategoryRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetCategoryRequest.Builder category_id(String category_id) {
         assert category_id != null;
         assert category_id.matches("^[a-z]+$");
         return this.setPathParameter("category_id", category_id);
      }

      public GetCategoryRequest.Builder country(CountryCode country) {
         assert country != null;
         return this.setQueryParameter("country", country);
      }

      public GetCategoryRequest.Builder locale(String locale) {
         assert locale != null;
         assert locale.contains("_");
         String[] localeParts = locale.split("_");
         assert localeParts.length == 2;
         assert LanguageCode.getByCode(localeParts[0]) != null;
         assert CountryCode.getByCode(localeParts[1]) != null;
         return this.setQueryParameter("locale", locale);
      }

      public GetCategoryRequest build() {
         this.setPath("/v1/browse/categories/{category_id}");
         return new GetCategoryRequest(this);
      }
   }
}
