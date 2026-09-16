package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.util.List;
import java.util.Optional;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements IRRCCOICORICIHCHRHIHIHROIRHOCR {
   @NotNull
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH RCHIICHOOICCCRCCRHORHIRIRCOHIC;
   private final String RCRROCCCOHIRCHRIHICRCRCHICIRIO;
   private final List<OHHRIOHROOIHOROCIRHCHORIHRRRRI> HIHOCOIRICCHCRHRRHIHHHHHHICHRI;

   public String bridge$getName() {
      return this.RCRROCCCOHIRCHRIHICRCRCHICIRIO;
   }

   public void bridge$setupRenderState() {
      for (OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 : this.HIHOCOIRICCHCRHRRHIHHHHHHICHRI) {
         var2.bridge$setupState();
      }
   }

   public void bridge$clearRenderState() {
      for (OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 : this.HIHOCOIRICCHCRHRRHIHHHHHHICHRI) {
         var2.bridge$clearState();
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getVertexFormatMode() {
      return this.RCHIICHOOICCCRCCRHORHIRIRCOHIC.bridge$vertexFormatMode();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getVertexFormat() {
      return this.RCHIICHOOICCCRCCRHORHIRIRCOHIC.bridge$vertexFormat();
   }

   @NotNull
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getRenderPipeline() {
      return this.RCHIICHOOICCCRCCRHORHIRIRCOHIC;
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> bridge$getShaderUniforms() {
      for (OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 : this.HIHOCOIRICCHCRHRRHIHHHHHHICHRI) {
         if (var2 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var3) {
            return Optional.of(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var3.IHRRRRROICIIICRRHRROIOOIRRIHHC
                  .manager
            );
         }
      }

      return Optional.empty();
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CRICCOOHHHCHOORCICOCOHIHOIRHOO var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.RCHIICHOOICCCRCCRHORHIRIRCOHIC;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var2.RCHIICHOOICCCRCCRHORHIRIRCOHIC;
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.RCRROCCCOHIRCHRIHICRCRCHICIRIO;
            String var6 = var2.RCRROCCCOHIRCHRIHICRCRCHICIRIO;
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               List var7 = this.HIHOCOIRICCHCRHRRHIHHHHHHICHRI;
               List var8 = var2.HIHOCOIRICCHCRHRRHIHHHHHHICHRI;
               return var7 == null ? var8 == null : var7.equals(var8);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof CRICCOOHHHCHOORCICOCOHIHOIRHOO;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.RCHIICHOOICCCRCCRHORHIRIRCOHIC;
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.RCRROCCCOHIRCHRIHICRCRCHICIRIO;
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      List var5 = this.HIHOCOIRICCHCRHRRHIHHHHHHICHRI;
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(@NotNull IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2, List<OHHRIOHROOIHOROCIRHCHORIHRRRRI> var3) {
      if (var1 == null) {
         throw new NullPointerException("renderPipeline is marked non-null but is null");
      }

      this.RCHIICHOOICCCRCCRHORHIRIRCOHIC = var1;
      this.RCRROCCCOHIRCHRIHICRCRCHICIRIO = var2;
      this.HIHOCOIRICCHCRHRRHIHHHHHHICHRI = var3;
   }
}
