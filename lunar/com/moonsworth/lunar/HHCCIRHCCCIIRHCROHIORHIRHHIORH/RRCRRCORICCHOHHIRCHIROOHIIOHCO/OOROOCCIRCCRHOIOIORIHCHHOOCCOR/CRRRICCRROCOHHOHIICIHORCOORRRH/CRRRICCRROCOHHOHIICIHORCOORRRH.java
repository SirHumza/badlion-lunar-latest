package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static final ThreadLocal<RRCRRCORICCHOHHIRCHIROOHIIOHCO> OCIICROHRICIICCHOOCHORCRCCIHIC = new ThreadLocal<>();
   @Nullable
   private ShortArrayList HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI;
   @Nullable
   private ByteArrayList OIHCIORCRIOHRIRRORHRRIROCORIHR;

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      int var3,
      int var4
   ) {
      ShortArrayList var5 = this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI;
      if (var5 == null) {
         this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI = var5 = new ShortArrayList();
      }

      ByteArrayList var6 = this.OIHCIORCRIOHRIRRORHRRIROCORIHR;
      if (var6 == null) {
         this.OIHCIORCRIOHRIRRORHRRIROCORIHR = var6 = new ByteArrayList();
      }

      int var7 = var2.bridge$getX() - var1.bridge$getX();
      int var8 = var2.bridge$getY() - var1.bridge$getY() - 1;
      int var9 = var2.bridge$getZ() - var1.bridge$getZ();
      short var10 = (short)((var7 & 15) << 8 | (var8 & 15) << 4 | var9 & 15);
      byte var11 = (byte)((var3 & 15) << 4 | var4 & 15);
      var5.add(var10);
      var6.add(var11);
   }

   public void reset() {
      if (this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI != null) {
         this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI.clear();
      }

      if (this.OIHCIORCRIOHRIRRORHRRIROCORIHR != null) {
         this.OIHCIORCRIOHRIRRORHRRIROCORIHR.clear();
      }
   }

   public void clear() {
      this.reset();
      this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI = null;
      this.OIHCIORCRIOHRIRRORHRRIROCORIHR = null;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      ShortArrayList var2 = this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI;
      this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI = null;
      var1.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI = var2;
      ByteArrayList var3 = this.OIHCIORCRIOHRIRRORHRRIROCORIHR;
      this.OIHCIORCRIOHRIRRORHRRIROCORIHR = null;
      var1.OIHCIORCRIOHRIRRORHRRIROCORIHR = var3;
   }

   @Nullable
   @Generated
   public ShortArrayList CHOICHHHCCCHCCOCICIHHIOCHRHOOH() {
      return this.HIHOIHIOHOOIIHHRCOCOOOCOHOHOHI;
   }

   @Nullable
   @Generated
   public ByteArrayList IOHHHRIOHHOIHORHRHIHRIHCICIIHR() {
      return this.OIHCIORCRIOHRIRRORHRRIROCORIHR;
   }
}
