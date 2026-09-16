package com.lunarclient.apollo.module.modsetting;

import com.lunarclient.apollo.client.mod.LunarClientMod;
import com.lunarclient.apollo.roundtrip.pagination.ApolloPaginatedResponse;
import java.util.List;
import java.util.UUID;
import lombok.Generated;

public final class InstalledModsResponse extends ApolloPaginatedResponse<LunarClientMod> {
   @Override
   public ApolloPaginatedResponse<LunarClientMod> combine(UUID var1, List<LunarClientMod> var2) {
      return builder().packetId(var1).elements(var2).build();
   }

   @Generated
   protected InstalledModsResponse(InstalledModsResponse.InstalledModsResponseBuilder<?, ?> var1) {
      super(var1);
   }

   @Generated
   public static InstalledModsResponse.InstalledModsResponseBuilder<?, ?> builder() {
      return new InstalledModsResponse.InstalledModsResponseBuilderImpl();
   }

   @Generated
   public abstract static class InstalledModsResponseBuilder<C extends InstalledModsResponse, B extends InstalledModsResponse.InstalledModsResponseBuilder<C, B>>
      extends ApolloPaginatedResponse.ApolloPaginatedResponseBuilder<LunarClientMod, C, B> {
      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "InstalledModsResponse.InstalledModsResponseBuilder(super=" + super.toString() + ")";
      }
   }

   @Generated
   private static final class InstalledModsResponseBuilderImpl
      extends InstalledModsResponse.InstalledModsResponseBuilder<InstalledModsResponse, InstalledModsResponse.InstalledModsResponseBuilderImpl> {
      @Generated
      private InstalledModsResponseBuilderImpl() {
      }

      @Generated
      protected InstalledModsResponse.InstalledModsResponseBuilderImpl self() {
         return this;
      }

      @Generated
      @Override
      public InstalledModsResponse build() {
         return new InstalledModsResponse(this);
      }
   }
}
