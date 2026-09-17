package com.lunarclient.apollo.module.transfer;

import com.lunarclient.apollo.roundtrip.ApolloResponse;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class PingResponse extends ApolloResponse {
   List<PingResponse.PingData> data;

   @Generated
   protected PingResponse(PingResponse.PingResponseBuilder<?, ?> var1) {
      super(var1);
      this.data = var1.data;
   }

   @Generated
   public static PingResponse.PingResponseBuilder<?, ?> builder() {
      return new PingResponse.PingResponseBuilderImpl();
   }

   @Generated
   public List<PingResponse.PingData> getData() {
      return this.data;
   }

   public static class PingData {
      String serverIp;
      PingResponse.PingData.Status status;
      @Range(from = 0L, to = 2147483647L) int pingMillis;

      @Generated
      PingData(String var1, PingResponse.PingData.Status var2, int var3) {
         this.serverIp = var1;
         this.status = var2;
         this.pingMillis = var3;
      }

      @Generated
      public static PingResponse.PingData.PingDataBuilder builder() {
         return new PingResponse.PingData.PingDataBuilder();
      }

      @Generated
      public String getServerIp() {
         return this.serverIp;
      }

      @Generated
      public PingResponse.PingData.Status getStatus() {
         return this.status;
      }

      @Generated
      public int getPingMillis() {
         return this.pingMillis;
      }

      @Generated
      public static class PingDataBuilder {
         @Generated
         private String serverIp;
         @Generated
         private PingResponse.PingData.Status status;
         @Generated
         private int pingMillis;

         @Generated
         PingDataBuilder() {
         }

         @Generated
         public PingResponse.PingData.PingDataBuilder serverIp(String var1) {
            this.serverIp = var1;
            return this;
         }

         @Generated
         public PingResponse.PingData.PingDataBuilder status(PingResponse.PingData.Status var1) {
            this.status = var1;
            return this;
         }

         @Generated
         public PingResponse.PingData.PingDataBuilder pingMillis(int var1) {
            this.pingMillis = var1;
            return this;
         }

         @Generated
         public PingResponse.PingData build() {
            return new PingResponse.PingData(this.serverIp, this.status, this.pingMillis);
         }

         @Generated
         @Override
         public String toString() {
            return "PingResponse.PingData.PingDataBuilder(serverIp=" + this.serverIp + ", status=" + this.status + ", pingMillis=" + this.pingMillis + ")";
         }
      }

      public enum Status {
         SUCCESS,
         TIMED_OUT;
      }
   }

   @Generated
   public abstract static class PingResponseBuilder<C extends PingResponse, B extends PingResponse.PingResponseBuilder<C, B>>
      extends ApolloResponse.ApolloResponseBuilder<C, B> {
      @Generated
      private List<PingResponse.PingData> data;

      @Generated
      public B data(List<PingResponse.PingData> var1) {
         this.data = var1;
         return this.self();
      }

      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "PingResponse.PingResponseBuilder(super=" + super.toString() + ", data=" + this.data + ")";
      }
   }

   @Generated
   private static final class PingResponseBuilderImpl extends PingResponse.PingResponseBuilder<PingResponse, PingResponse.PingResponseBuilderImpl> {
      @Generated
      private PingResponseBuilderImpl() {
      }

      @Generated
      protected PingResponse.PingResponseBuilderImpl self() {
         return this;
      }

      @Generated
      @Override
      public PingResponse build() {
         return new PingResponse(this);
      }
   }
}
