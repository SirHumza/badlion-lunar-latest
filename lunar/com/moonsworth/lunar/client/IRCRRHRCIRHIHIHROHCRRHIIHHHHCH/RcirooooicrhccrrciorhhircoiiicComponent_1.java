package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.File;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC OOIOHHIRCRHCHHOOICOCORRIIROHIH = null;
   private String name;
   private String displayName;
   private boolean RRCHOIIHOHORCCHCIIHCIRRRHHCICH;
   private boolean active;
   private String iconName;
   private String server;
   private File file;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, boolean var3, boolean var4, String var5) {
      this(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCCIROHIHIOOOIOOCIRORHCRROIROR().CCORIIRRHRRHCOIOICCIHIHOOOHOOI(),
         var1,
         var2,
         var3,
         var4,
         var5
      );
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2, String var3, boolean var4, boolean var5, String var6) {
      this.name = var2;
      this.displayName = var3;
      this.RRCHOIIHOHORCCHCIIHCIRRRHHCICH = var4;
      this.active = var5;
      this.iconName = var6;
      this.OOIOHHIRCRHCHHOOICOCORRIIROHIH = null;
      this.server = "";
      if (!var6.equalsIgnoreCase("")) {
         this.OOIOHHIRCRHCHHOOICOCORRIIROHIH = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "icons/profiles/" + var6 + ".png");
      }

      this.file = new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + var2);
      if (!this.file.exists()) {
         if (!var5 && !HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCCCOCOICICIHHHIIROCRCRRHCCRRC.contains(var2)) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCCIROHIHIOOOIOOCIRORHCRROIROR().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         }

         if (!this.file.mkdirs()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "Can't make directory for " + var2 + " profile."
            );
         }
      }
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2, boolean var3, boolean var4) {
      this(var1, var2, var2, var3, var4, "");
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, boolean var2, boolean var3) {
      this(var1, var1, var2, var3, "");
   }

   public void HOOCCCHOCRCIIHRCICICIHHOHRCCRC(String var1) {
      this.iconName = var1;
      if (var1.equalsIgnoreCase("")) {
         this.OOIOHHIRCRHCHHOOICOCORRIIROHIH = null;
      } else {
         this.OOIOHHIRCRHCHHOOICOCORRIIROHIH = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "icons/profiles/" + var1 + ".png");
      }
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getIcon() {
      return this.OOIOHHIRCRHCHHOOICOCORRIIROHIH;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String getDisplayName() {
      return this.displayName;
   }

   @Generated
   public boolean ICHIHRICHHCRIRHCRRHHIHORIIORIH() {
      return this.RRCHOIIHOHORCCHCIIHCIRRRHHCICH;
   }

   @Generated
   public boolean isActive() {
      return this.active;
   }

   @Generated
   public String IIOIIHCOIHHRHROCRRHHRCICCIROOO() {
      return this.iconName;
   }

   @Generated
   public String getServer() {
      return this.server;
   }

   @Generated
   public File getFile() {
      return this.file;
   }

   @Generated
   public void RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      this.OOIOHHIRCRHCHHOOICOCORRIIROHIH = var1;
   }

   @Generated
   public void setName(String var1) {
      this.name = var1;
   }

   @Generated
   public void setDisplayName(String var1) {
      this.displayName = var1;
   }

   @Generated
   public void ICOIOIRCHCIOCHCOHOHIOOCORIICRO(boolean var1) {
      this.RRCHOIIHOHORCCHCIIHCIRRRHHCICH = var1;
   }

   @Generated
   public void setActive(boolean var1) {
      this.active = var1;
   }

   @Generated
   public void IOHHICHRIHCRCIIIROCCHICCIRCIII(String var1) {
      this.server = var1;
   }

   @Generated
   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(File var1) {
      this.file = var1;
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

         if (this.ICHIHRICHHCRIRHCRRHHIHORIIORIH() != var2.ICHIHRICHHCRIRHCRRHHIHORIIORIH()) {
            return false;
         }

         if (this.isActive() != var2.isActive()) {
            return false;
         }

         RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = this.getIcon();
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var4 = var2.getIcon();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.getName();
            String var6 = var2.getName();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.getDisplayName();
               String var8 = var2.getDisplayName();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  String var9 = this.IIOIIHCOIHHRHROCRRHHRCICCIROOO();
                  String var10 = var2.IIOIIHCOIHHRHROCRRHHRCICCIROOO();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     String var11 = this.getServer();
                     String var12 = var2.getServer();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        File var13 = this.getFile();
                        File var14 = var2.getFile();
                        return var13 == null ? var14 == null : var13.equals(var14);
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
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
      var2 = var2 * 59 + (this.ICHIHRICHHCRIRHCRRHHIHORIIORIH() ? 79 : 97);
      var2 = var2 * 59 + (this.isActive() ? 79 : 97);
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = this.getIcon();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getName();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.getDisplayName();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.IIOIIHCOIHHRHROCRRHHRCICCIROOO();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.getServer();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      File var8 = this.getFile();
      return var2 * 59 + (var8 == null ? 43 : var8.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "Profile(icon="
         + this.getIcon()
         + ", name="
         + this.getName()
         + ", displayName="
         + this.getDisplayName()
         + ", defaultProfile="
         + this.ICHIHRICHHCRIRHCRRHHIHORIIORIH()
         + ", active="
         + this.isActive()
         + ", iconName="
         + this.IIOIIHCOIHHRHROCRRHHRCICCIROOO()
         + ", server="
         + this.getServer()
         + ", file="
         + this.getFile()
         + ")";
   }
}
