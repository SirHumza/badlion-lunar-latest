package com.wrapper.spotify.model_objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.wrapper.spotify.model_objects.specification.Cursor;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PagingCursorbased;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractModelObject implements IModelObject {
   protected AbstractModelObject(AbstractModelObject.Builder builder) {
      assert builder != null;
   }

   public abstract static class Builder implements IModelObject.Builder {
   }

   public abstract static class JsonUtil<T> implements IModelObject.IJsonUtil<T> {
      @Override
      public boolean hasAndNotNull(JsonObject jsonObject, String memberName) {
         return jsonObject.has(memberName) && !jsonObject.get(memberName).isJsonNull();
      }

      @Override
      public T createModelObject(String json) {
         return json == null ? null : this.createModelObject(new JsonParser().parse(json).getAsJsonObject());
      }

      @Override
      public T[] createModelObjectArray(JsonArray jsonArray) {
         T[] array = (T[])((Object[])Array.newInstance(
            (Class<?>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0], jsonArray.size()
         ));

         for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement instanceof JsonNull) {
               array[i] = null;
            } else {
               JsonObject jsonObject = jsonElement.getAsJsonObject();
               array[i] = this.createModelObject(jsonObject);
            }
         }

         return array;
      }

      @Override
      public T[] createModelObjectArray(String json) {
         return this.createModelObjectArray(new JsonParser().parse(json).getAsJsonArray());
      }

      @Override
      public T[] createModelObjectArray(String json, String key) {
         return this.createModelObjectArray(new JsonParser().parse(json).getAsJsonObject().get(key).getAsJsonArray());
      }

      @Override
      public <X> X[] createModelObjectArray(JsonArray jsonArray, Class<X> clazz) {
         X[] array = (X[])Array.newInstance(clazz, jsonArray.size());

         for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            array[i] = (X)this.createModelObject(jsonObject);
         }

         return array;
      }

      @Override
      public Paging<T> createModelObjectPaging(JsonObject jsonObject) {
         return new Paging.Builder<T>()
            .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
            .setItems(this.hasAndNotNull(jsonObject, "items") ? this.createModelObjectArray(jsonObject.getAsJsonArray("items")) : null)
            .setLimit(this.hasAndNotNull(jsonObject, "limit") ? jsonObject.get("limit").getAsInt() : null)
            .setNext(this.hasAndNotNull(jsonObject, "next") ? jsonObject.get("next").getAsString() : null)
            .setOffset(this.hasAndNotNull(jsonObject, "offset") ? jsonObject.get("offset").getAsInt() : null)
            .setPrevious(this.hasAndNotNull(jsonObject, "previous") ? jsonObject.get("previous").getAsString() : null)
            .setTotal(this.hasAndNotNull(jsonObject, "total") ? jsonObject.get("total").getAsInt() : null)
            .build();
      }

      @Override
      public Paging<T> createModelObjectPaging(String json) {
         return this.createModelObjectPaging(new JsonParser().parse(json).getAsJsonObject());
      }

      @Override
      public Paging<T> createModelObjectPaging(String json, String key) {
         return this.createModelObjectPaging(new JsonParser().parse(json).getAsJsonObject().get(key).getAsJsonObject());
      }

      @Override
      public PagingCursorbased<T> createModelObjectPagingCursorbased(JsonObject jsonObject) {
         return new PagingCursorbased.Builder<T>()
            .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
            .setItems(this.hasAndNotNull(jsonObject, "items") ? this.createModelObjectArray(jsonObject.getAsJsonArray("items")) : null)
            .setLimit(this.hasAndNotNull(jsonObject, "limit") ? jsonObject.get("limit").getAsInt() : null)
            .setNext(this.hasAndNotNull(jsonObject, "next") ? jsonObject.get("next").getAsString() : null)
            .setCursors(this.hasAndNotNull(jsonObject, "cursors") ? new Cursor.JsonUtil().createModelObject(jsonObject.getAsJsonObject("cursors")) : null)
            .setTotal(this.hasAndNotNull(jsonObject, "total") ? jsonObject.get("total").getAsInt() : null)
            .build();
      }

      @Override
      public PagingCursorbased<T> createModelObjectPagingCursorbased(String json) {
         return this.createModelObjectPagingCursorbased(new JsonParser().parse(json).getAsJsonObject());
      }

      @Override
      public PagingCursorbased<T> createModelObjectPagingCursorbased(String json, String key) {
         return this.createModelObjectPagingCursorbased(new JsonParser().parse(json).getAsJsonObject().get(key).getAsJsonObject());
      }
   }
}
