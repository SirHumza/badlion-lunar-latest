package com.lunarclient.apollo.roundtrip.pagination;

import com.lunarclient.apollo.roundtrip.ApolloResponse;
import java.util.List;
import java.util.UUID;
import lombok.Generated;

public abstract class ApolloPaginatedResponse<T> extends ApolloResponse {
   int page;
   int totalPages;
   List<T> elements;

   public boolean isLastPage() {
      return this.page == this.totalPages - 1;
   }

   public abstract ApolloPaginatedResponse<T> combine(UUID var1, List<T> var2);

   @Generated
   protected ApolloPaginatedResponse(ApolloPaginatedResponse.ApolloPaginatedResponseBuilder<T, ?, ?> var1) {
      super(var1);
      this.page = var1.page;
      this.totalPages = var1.totalPages;
      this.elements = var1.elements;
   }

   @Generated
   public List<T> getElements() {
      return this.elements;
   }

   @Generated
   protected int getPage() {
      return this.page;
   }

   @Generated
   protected int getTotalPages() {
      return this.totalPages;
   }

   @Generated
   public abstract static class ApolloPaginatedResponseBuilder<T, C extends ApolloPaginatedResponse<T>, B extends ApolloPaginatedResponse.ApolloPaginatedResponseBuilder<T, C, B>>
      extends ApolloResponse.ApolloResponseBuilder<C, B> {
      @Generated
      private int page;
      @Generated
      private int totalPages;
      @Generated
      private List<T> elements;

      @Generated
      public B page(int var1) {
         this.page = var1;
         return this.self();
      }

      @Generated
      public B totalPages(int var1) {
         this.totalPages = var1;
         return this.self();
      }

      @Generated
      public B elements(List<T> var1) {
         this.elements = var1;
         return this.self();
      }

      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "ApolloPaginatedResponse.ApolloPaginatedResponseBuilder(super="
            + super.toString()
            + ", page="
            + this.page
            + ", totalPages="
            + this.totalPages
            + ", elements="
            + this.elements
            + ")";
      }
   }
}
