package com.lunarclient.apollo.api;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface ApiRequest<T extends ApiResponse> {
   ApiServiceType getService();

   ApiRequestType getType();

   String getRoute();

   default Type getResponseType() {
      ParameterizedType var1 = (ParameterizedType)this.getClass().getGenericInterfaces()[0];
      return var1.getActualTypeArguments()[0];
   }
}
