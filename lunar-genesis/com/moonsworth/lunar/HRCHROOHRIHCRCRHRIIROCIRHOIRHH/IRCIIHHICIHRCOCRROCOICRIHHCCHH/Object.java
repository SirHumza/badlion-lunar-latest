package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @SerializedName("id")
   private String id;
   @SerializedName("sha1")
   private String CIHICOOIOIHRHOORRICCIORRRCICHC;
   @SerializedName("url")
   private String url;

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public String IOHCOORHIHCRCRIIHHRHCCHORCOIRC() {
      return this.CIHICOOIOIHRHOORRICCIORRRCICHC;
   }

   @Generated
   public String getUrl() {
      return this.url;
   }

   @Generated
   public void setId(String var1) {
      this.id = var1;
   }

   @Generated
   public void IHCHHOHHOHCRHHCOCICHRIIRROIOHH(String var1) {
      this.CIHICOOIOIHRHOORRICCIORRRCICHC = var1;
   }

   @Generated
   public void setUrl(String var1) {
      this.url = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         String var3 = this.getId();
         String var4 = var2.getId();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC();
            String var6 = var2.IOHCOORHIHCRCRIIHHRHCCHORCOIRC();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.getUrl();
               String var8 = var2.getUrl();
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
      return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getId();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.getUrl();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "AssetIndex(id=" + this.getId() + ", sha1=" + this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC() + ", url=" + this.getUrl() + ")";
   }
}
