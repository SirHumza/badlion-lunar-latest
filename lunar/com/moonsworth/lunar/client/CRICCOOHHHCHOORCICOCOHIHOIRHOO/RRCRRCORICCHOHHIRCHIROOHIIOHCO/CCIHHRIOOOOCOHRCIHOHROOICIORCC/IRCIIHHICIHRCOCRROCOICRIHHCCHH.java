package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCIHHRIOOOOCOHRCIHOHROOICIORCC;

import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH IIOIOCOHCIRRRRICROIHRRHROOROOC;
   private int volume = 100;
   private String fileName;
   @Nullable
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORCIIICIOOOCHRHHCRORICRHHHRRHR;

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ORCIIICIOOOCHRHHCRORICRHHHRRHR = var1;
   }

   public boolean HICCHHHIOROHHHIHOIOCCROCCIOCOR() {
      return this.fileName != null && !this.fileName.isEmpty();
   }

   public boolean isEnabled() {
      return this.ORCIIICIOOOCHRHHCRORICRHHHRRHR != null && this.ORCIIICIOOOCHRHHCRORICRHHHRRHR.isEnabled();
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH HCCCORHIRRIOCIROICHRCCOORHICHC() {
      return this.IIOIOCOHCIRRRRICROIHRRHROOROOC;
   }

   @Generated
   public int getVolume() {
      return this.volume;
   }

   @Generated
   public String getFileName() {
      return this.fileName;
   }

   @Nullable
   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIIHOHCOICRCOHOOOHIHRIOCCCOOHI() {
      return this.ORCIIICIOOOCHRHHCRORICRHHHRRHR;
   }

   @Generated
   public void setVolume(int var1) {
      this.volume = var1;
   }

   @Generated
   public void HORHCHIRIOIOOCOHOIRIRICICHIORH(String var1) {
      this.fileName = var1;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ORCIIICIOOOCHRHHCRORICRHHHRRHR = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (this.getVolume() != var2.getVolume()) {
            return false;
         }

         HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.HCCCORHIRRIOCIROICHRCCOORHICHC();
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = var2.HCCCORHIRRIOCIROICHRCCOORHICHC();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.getFileName();
            String var6 = var2.getFileName();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = this.CIIHOHCOICRCOHOOOHIHRIOCCCOOHI();
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = var2.CIIHOHCOICRCOHOOOHIHRIOCCCOOHI();
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
      return var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getVolume();
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.HCCCORHIRRIOCIROICHRCCOORHICHC();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getFileName();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.CIIHOHCOICRCOHOOOHIHRIOCCCOOHI();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "KillSoundSettings(type="
         + this.HCCCORHIRRIOCIROICHRCCOORHICHC()
         + ", volume="
         + this.getVolume()
         + ", fileName="
         + this.getFileName()
         + ", linked="
         + this.CIIHOHCOICRCOHOOOHIHRIOCCCOOHI()
         + ")";
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.IIOIOCOHCIRRRRICROIHRRHROOROOC = var1;
   }
}
