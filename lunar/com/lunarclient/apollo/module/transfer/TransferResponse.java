package com.lunarclient.apollo.module.transfer;

import com.lunarclient.apollo.roundtrip.ApolloResponse;
import lombok.Generated;

public final class TransferResponse extends ApolloResponse {
   TransferResponse.Status status;

   @Generated
   protected TransferResponse(TransferResponse.TransferResponseBuilder<?, ?> var1) {
      super(var1);
      this.status = var1.status;
   }

   @Generated
   public static TransferResponse.TransferResponseBuilder<?, ?> builder() {
      return new TransferResponse.TransferResponseBuilderImpl();
   }

   @Generated
   public TransferResponse.Status getStatus() {
      return this.status;
   }

   public enum Status {
      ACCEPTED,
      REJECTED;
   }

   @Generated
   public abstract static class TransferResponseBuilder<C extends TransferResponse, B extends TransferResponse.TransferResponseBuilder<C, B>>
      extends ApolloResponse.ApolloResponseBuilder<C, B> {
      @Generated
      private TransferResponse.Status status;

      @Generated
      public B status(TransferResponse.Status var1) {
         this.status = var1;
         return this.self();
      }

      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "TransferResponse.TransferResponseBuilder(super=" + super.toString() + ", status=" + this.status + ")";
      }
   }

   @Generated
   private static final class TransferResponseBuilderImpl
      extends TransferResponse.TransferResponseBuilder<TransferResponse, TransferResponse.TransferResponseBuilderImpl> {
      @Generated
      private TransferResponseBuilderImpl() {
      }

      @Generated
      protected TransferResponse.TransferResponseBuilderImpl self() {
         return this;
      }

      @Generated
      @Override
      public TransferResponse build() {
         return new TransferResponse(this);
      }
   }
}
