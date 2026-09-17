package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHROCRRIRIROCCCRCRRROCRRCRIIHH;

import com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.util.Optional;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   FLYING("flying"),
   FLYING_BOOST("flying", "boost", true),
   RIDING("riding"),
   DESCENDING("descending"),
   DISMOUNTING("dismounting"),
   SNEAKING_TOGGLED("sneaking", "toggled"),
   SNEAKING_HELD("sneaking", "held"),
   SPRINTING_TOGGLED("sprinting", "toggled"),
   SPRINTING_HELD("sprinting", "held"),
   SPRINTING_VANILLA("sprinting", "vanilla"),
   HELD("held", null),
   TOGGLED("toggled", null),
   VANILLA("vanilla", null);

   private final String mainText;
   private final String partition;
   private final boolean hasExtraArguments;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
      this(var3, null, false);
   }

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, String var4) {
      this(var3, var4, false);
   }

   @Override
   public String getLanguagePath() {
      return "settings";
   }

   public String getMainText(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      if (!var1.OOHCOCOHHIICCOHOCIOHHOHCCHHOHR.isEmpty() && "sprinting".equals(this.mainText)) {
         return var1.OOHCOCOHHIICCOHOCIOHHOHCCHHOHR.get();
      } else if (!var1.OIRICIIHORIOCOOCOCHCORRRCHHHRC.isEmpty() && "sneaking".equals(this.mainText)) {
         return var1.OIRICIIHORIOCOOCOCHCORRRCHHHRC.get();
      } else {
         return !var1.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC.isEmpty() && "flying".equals(this.mainText)
            ? var1.IIHCRCCRHIOCRCHOHCIOOHRHORHCIC.get()
            : this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.mainText);
      }
   }

   public Optional<String> getPartition(Object... var1) {
      return this.partition != null && var1 != null && (!this.hasExtraArguments || var1.length != 0)
         ? Optional.of(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.partition, var1))
         : Optional.empty();
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, String var4, boolean var5) {
      this.mainText = var3;
      this.partition = var4;
      this.hasExtraArguments = var5;
   }
}
