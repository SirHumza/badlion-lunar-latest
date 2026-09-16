package com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR;

import java.util.Optional;
import java.util.function.Function;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   NONE("", Optional::of),
   NOTCH("notch", var0 -> {
      if (var0.startsWith("notch/") || var0.startsWith("patch/notch/")) {
         var0 = var0.replace("notch/", "");
         return Optional.of(var0);
      } else {
         return !var0.startsWith("srg/") && !var0.startsWith("patch/srg/") ? Optional.of(var0) : Optional.empty();
      }
   }),
   SRG("srg", var0 -> {
      if (var0.startsWith("srg/") || var0.startsWith("patch/srg/")) {
         var0 = var0.replace("srg/", "");
         return Optional.of(var0);
      } else {
         return !var0.startsWith("net/optifine/") && !var0.startsWith("patch/") ? Optional.of(var0) : Optional.empty();
      }
   }),
   PATCH("patch", var0 -> {
      if (var0.startsWith("srg/") || var0.startsWith("patch/srg/")) {
         return Optional.empty();
      } else {
         return !var0.startsWith("net/optifine/") && !var0.startsWith("patch/") ? Optional.of(var0) : Optional.of(var0);
      }
   });

   private final String name;
   private final Function<String, Optional<String>> fileFilter;

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH from(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, boolean var1) {
      if (var0.OCICRRCHRIRORHIRHIHOIRCCIHCHRH()) {
         return NONE;
      } else {
         return var0.CIHIOROIHORIICOORRIOOHOORHRHIR() ? NOTCH : PATCH;
      }
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public Function<String, Optional<String>> getFileFilter() {
      return this.fileFilter;
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, Function<String, Optional<String>> var4) {
      this.name = var3;
      this.fileFilter = var4;
   }
}
