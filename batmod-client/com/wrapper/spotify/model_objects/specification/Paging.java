package com.wrapper.spotify.model_objects.specification;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;
import java.lang.reflect.ParameterizedType;

public class Paging<T> extends AbstractModelObject {
   private final String href;
   private final T[] items;
   private final Integer limit;
   private final String next;
   private final Integer offset;
   private final String previous;
   private final Integer total;

   private Paging(Paging.Builder<T> builder) {
      super(builder);
      this.href = builder.href;
      this.items = builder.items;
      this.limit = builder.limit;
      this.next = builder.next;
      this.offset = builder.offset;
      this.previous = builder.previous;
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

   public Integer getOffset() {
      return this.offset;
   }

   public String getPrevious() {
      return this.previous;
   }

   public Integer getTotal() {
      return this.total;
   }

   public Paging.Builder<T> builder() {
      return new Paging.Builder<>();
   }

   public static final class Builder<T> extends AbstractModelObject.Builder {
      private String href;
      private T[] items;
      private Integer limit;
      private String next;
      private Integer offset;
      private String previous;
      private Integer total;

      public Paging.Builder<T> setHref(String href) {
         this.href = href;
         return this;
      }

      public Paging.Builder<T> setItems(T[] items) {
         this.items = items;
         return this;
      }

      public Paging.Builder<T> setLimit(Integer limit) {
         this.limit = limit;
         return this;
      }

      public Paging.Builder<T> setNext(String next) {
         this.next = next;
         return this;
      }

      public Paging.Builder<T> setOffset(Integer offset) {
         this.offset = offset;
         return this;
      }

      public Paging.Builder<T> setPrevious(String previous) {
         this.previous = previous;
         return this;
      }

      public Paging.Builder<T> setTotal(Integer total) {
         this.total = total;
         return this;
      }

      public Paging<T> build() {
         return new Paging<>(this);
      }
   }

   public static final class JsonUtil<X> extends AbstractModelObject.JsonUtil<Paging<X>> {
      public Paging<X> createModelObject(JsonObject jsonObject) {
         return (Paging<X>)(jsonObject != null && !jsonObject.isJsonNull()
            ? new Paging.Builder<Object>()
               .setHref(this.hasAndNotNull(jsonObject, "href") ? jsonObject.get("href").getAsString() : null)
               .setItems(
                  this.createModelObjectArray(
                     jsonObject.getAsJsonArray("items"), (Class<Object>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]
                  )
               )
               .setLimit(this.hasAndNotNull(jsonObject, "limit") ? jsonObject.get("limit").getAsInt() : null)
               .setNext(this.hasAndNotNull(jsonObject, "next") ? jsonObject.get("next").getAsString() : null)
               .setOffset(this.hasAndNotNull(jsonObject, "offset") ? jsonObject.get("offset").getAsInt() : null)
               .setPrevious(this.hasAndNotNull(jsonObject, "previous") ? jsonObject.get("previous").getAsString() : null)
               .setTotal(this.hasAndNotNull(jsonObject, "total") ? jsonObject.get("total").getAsInt() : null)
               .build()
            : null);
      }
   }
}
