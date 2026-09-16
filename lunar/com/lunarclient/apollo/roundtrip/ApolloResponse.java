package com.lunarclient.apollo.roundtrip;

import com.lunarclient.apollo.api.ApiResponse;
import java.util.UUID;
import lombok.Generated;

public class ApolloResponse implements ApiResponse {
   UUID packetId;

   @Generated
   protected ApolloResponse(ApolloResponse.ApolloResponseBuilder<?, ?> var1) {
      this.packetId = var1.packetId;
   }

   @Generated
   public static ApolloResponse.ApolloResponseBuilder<?, ?> builder() {
      return new ApolloResponse.ApolloResponseBuilderImpl();
   }

   @Generated
   public UUID getPacketId() {
      return this.packetId;
   }

   @Generated
   public abstract static class ApolloResponseBuilder<C extends ApolloResponse, B extends ApolloResponse.ApolloResponseBuilder<C, B>> {
      @Generated
      private UUID packetId;

      @Generated
      public B packetId(UUID var1) {
         this.packetId = var1;
         return this.self();
      }

      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "ApolloResponse.ApolloResponseBuilder(packetId=" + this.packetId + ")";
      }
   }

   @Generated
   private static final class ApolloResponseBuilderImpl extends ApolloResponse.ApolloResponseBuilder<ApolloResponse, ApolloResponse.ApolloResponseBuilderImpl> {
      @Generated
      private ApolloResponseBuilderImpl() {
      }

      @Generated
      protected ApolloResponse.ApolloResponseBuilderImpl self() {
         return this;
      }

      @Generated
      @Override
      public ApolloResponse build() {
         return new ApolloResponse(this);
      }
   }
}
