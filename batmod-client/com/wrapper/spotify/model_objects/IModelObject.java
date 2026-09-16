package com.wrapper.spotify.model_objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PagingCursorbased;

public interface IModelObject {
   IModelObject.Builder builder();

   interface Builder {
      IModelObject build();
   }

   interface IJsonUtil<T> {
      boolean hasAndNotNull(JsonObject var1, String var2);

      T createModelObject(JsonObject var1);

      T createModelObject(String var1);

      T[] createModelObjectArray(JsonArray var1);

      T[] createModelObjectArray(String var1);

      T[] createModelObjectArray(String var1, String var2);

      <X> X[] createModelObjectArray(JsonArray var1, Class<X> var2);

      Paging<T> createModelObjectPaging(JsonObject var1);

      Paging<T> createModelObjectPaging(String var1);

      Paging<T> createModelObjectPaging(String var1, String var2);

      PagingCursorbased<T> createModelObjectPagingCursorbased(JsonObject var1);

      PagingCursorbased<T> createModelObjectPagingCursorbased(String var1);

      PagingCursorbased<T> createModelObjectPagingCursorbased(String var1, String var2);
   }
}
