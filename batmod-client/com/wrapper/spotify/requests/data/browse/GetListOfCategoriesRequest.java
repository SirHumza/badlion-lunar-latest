package com.wrapper.spotify.requests.data.browse;

import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.LanguageCode;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.specification.Category;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.requests.data.AbstractDataRequest;
import java.io.IOException;

public class GetListOfCategoriesRequest extends AbstractDataRequest {
   private GetListOfCategoriesRequest(GetListOfCategoriesRequest.Builder builder) {
      super(builder);
   }

   public Paging<Category> execute() throws IOException, SpotifyWebApiException {
      return new Category.JsonUtil().createModelObjectPaging(this.getJson(), "categories");
   }

   public static final class Builder extends AbstractDataRequest.Builder<GetListOfCategoriesRequest.Builder> {
      public Builder(String accessToken) {
         super(accessToken);
      }

      public GetListOfCategoriesRequest.Builder country(CountryCode country) {
         assert country != null;
         return this.setQueryParameter("country", country);
      }

      public GetListOfCategoriesRequest.Builder locale(String locale) {
         assert locale != null;
         assert locale.contains("_");
         String[] localeParts = locale.split("_");
         assert localeParts.length == 2;
         assert LanguageCode.getByCode(localeParts[0]) != null;
         assert CountryCode.getByCode(localeParts[1]) != null;
         return this.setQueryParameter("locale", locale);
      }

      public GetListOfCategoriesRequest.Builder limit(Integer limit) {
         assert 1 <= limit && limit <= 50;
         return this.setQueryParameter("limit", limit);
      }

      public GetListOfCategoriesRequest.Builder offset(Integer offset) {
         assert offset >= 0;
         return this.setQueryParameter("offset", offset);
      }

      public GetListOfCategoriesRequest build() {
         this.setPath("/v1/browse/categories");
         return new GetListOfCategoriesRequest(this);
      }
   }
}
