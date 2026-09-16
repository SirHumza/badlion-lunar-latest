package com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

@CORCOCICIRIOHROHROIIOOHICCHCRR
public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   FABRIC_LOADER("0.1.5", "0.19.5", new String[]{"net.fabricmc:fabric-loader"}) {
      @Override
      public void loadIchor(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
         );
      }
   },
   ADVENTURE(
      "0.0",
      "4.13.1",
      new String[]{
         "net.kyori:adventure-api",
         "net.kyori:adventure-text-serializer-gson",
         "net.kyori:adventure-text-serializer-legacy",
         "net.kyori:adventure-text-serializer-plain"
      }
   ) {
      @Override
      public void loadIchor(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      }
   };

   private final String transformerVersion;
   private final String recommendedVersion;
   private final String[] mavenIds;

   public String[] mavenIds(@Nullable String var1) {
      if (var1 == null) {
         var1 = this.recommendedVersion;
      }

      String[] var2 = new String[this.mavenIds.length];

      for (int var3 = 0; var3 < this.mavenIds.length; var3++) {
         var2[var3] = this.mavenIds[var3] + ":" + var1;
      }

      return var2;
   }

   public String[] rawMavenPrefixes() {
      return this.mavenIds;
   }

   @Override
   public boolean hasMixinRuntime() {
      return false;
   }

   @Override
   public boolean shouldUseParentAsMixinRuntime() {
      return false;
   }

   @Override
   public boolean shouldUseClassBytes() {
      return false;
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, String var4, String[] var5) {
      this.transformerVersion = var3;
      this.recommendedVersion = var4;
      this.mavenIds = var5;
   }

   @Generated
   public String getTransformerVersion() {
      return this.transformerVersion;
   }

   @Generated
   public String getRecommendedVersion() {
      return this.recommendedVersion;
   }
}
