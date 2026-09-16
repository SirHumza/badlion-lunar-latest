package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.lang.reflect.ParameterizedType;

public class PagingCursorbased<T> extends AbstractModelObject {
   private final String href;
   private final T[] items;
   private final Integer limit;
   private final String next;
   private final Cursor[] cursors;
   private final Integer total;

   private PagingCursorbased(PagingCursorbased.Builder<T> builder) {
      super(builder);
      this.href = builder.href;
      this.items = builder.items;
      this.limit = builder.limit;
      this.next = builder.next;
      this.cursors = builder.cursors;
      this.total = builder.total;
   }

   public String getHref() {
      return this.href;
   }

   public T[] getItems() {
      return this.items;
   }

   public Integer getLimit() {
      return this.limit;
   }

   public String getNext() {
      return this.next;
   }

   public Cursor[] getCursors() {
      return this.cursors;
   }

   public Integer getTotal() {
      return this.total;
   }

   public PagingCursorbased.Builder<T> builder() {
      return new PagingCursorbased.Builder<>();
   }

   public static final class Builder<T> extends AbstractModelObject.Builder {
      private String href;
      private T[] items;
      private Integer limit;
      private String next;
      private Cursor[] cursors;
      private Integer total;

      public PagingCursorbased.Builder<T> setHref(String href) {
         this.href = href;
         return this;
      }

      public PagingCursorbased.Builder<T> setItems(T[] items) {
         this.items = items;
         return this;
      }

      public PagingCursorbased.Builder<T> setLimit(Integer limit) {
         this.limit = limit;
         return this;
      }

      public PagingCursorbased.Builder<T> setNext(String next) {
         this.next = next;
         return this;
      }

      public PagingCursorbased.Builder<T> setCursors(Cursor... cursors) {
         this.cursors = cursors;
         return this;
      }

      public PagingCursorbased.Builder<T> setTotal(Integer total) {
         this.total = total;
         return this;
      }

      public PagingCursorbased<T> build() {
         return new PagingCursorbased<>(this);
      }
   }

   public static final class JsonUtil<X> extends AbstractModelObject.JsonUtil<PagingCursorbased<X>> {
      public PagingCursorbased<X> createModelObject(JsonObject jsonObject) {
         return (PagingCursorbased<X>)(jsonObject != null && !jsonObject.isJsonNull()
            ? new PagingCursorbased.Builder<Object>()
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setItems(
                  this.hasAndNotNull(jsonObject, "items")
                     ? this.createModelObjectArray(
                        jsonObject.getAsJsonArray("items"),
                        (Class<Object>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]
                     )
                     : null
               )
               .setLimit(this.hasAndNotNull(jsonObject, "limit") ? jsonObject.get("limit").getAsInt() : null)
               .setNext(this.hasAndNotNull(jsonObject, "next") ? jsonObject.get("next").getAsString() : null)
               .setCursors(
                  this.hasAndNotNull(jsonObject, "cursors") ? new Cursor.JsonUtil().createModelObjectArray(jsonObject.getAsJsonArray("cursors")) : null
               )
               .setTotal(this.hasAndNotNull(jsonObject, "total") ? jsonObject.get("total").getAsInt() : null)
               .build()
            : null);
      }
   }
}
