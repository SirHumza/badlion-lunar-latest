package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private transient HHCCIRHCCCIIRHCROHIORHIRHHIORH HOCIOHOHICRIOCIHIOOCHHHICHIIRR = null;
   @SerializedName("id")
   private String id;
   @SerializedName("javaVersion")
   private JsonObject OHICCRCROCROORROCCROOIIIRCCHOH;
   @SerializedName("assetIndex")
   private com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIOIRHOHOIHRRCICOOOOCCHROHHCCC;
   @SerializedName("mainClass")
   private String mainClass;
   @SerializedName("type")
   private String type;
   @SerializedName("time")
   private String OHRCOIHHHCOOOCROHHIOIHOHCORORI;
   @SerializedName("releaseTime")
   private String IOIIOCCICOHORCHHCIHIHCIRCHOIIH;
   @SerializedName("downloads")
   private Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCOIIIHOCHOHOOCCIHIHHOOIRHROCI;

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH IIHCHCIOHIOOHIIRHROCRCIRHIHHCO() {
      return this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public JsonObject HRHHRICOROIIHRIHOCIOIORRORORIH() {
      return this.OHICCRCROCROORROCCROOIIIRCCHOH;
   }

   @Generated
   public com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOCHHHCHIRROIRIRIRRRCCRHROHIOO() {
      return this.HIOIRHOHOIHRRCICOOOOCCHROHHCCC;
   }

   @Generated
   public String RIIOIOIIHHHHRCIIHRHHOOHRHHRROO() {
      return this.mainClass;
   }

   @Generated
   public String getType() {
      return this.type;
   }

   @Generated
   public String IIROIIIIICHCROIIORRHCOOHHHCOHH() {
      return this.OHRCOIHHHCOOOCROHHIOIHOHCORORI;
   }

   @Generated
   public String HICIHRHHIHIIRRRHHRHHHCCIIHOCOI() {
      return this.IOIIOCCICOHORCHHCIHIHCIRCHOIIH;
   }

   @Generated
   public Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IRCIIIRRIOIHICRCIHHOOCRROOOOCO() {
      return this.RCOIIIHOCHOHOOCCIHIHHOOIRHROCI;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR = var1;
   }

   @Generated
   public void setId(String var1) {
      this.id = var1;
   }

   @Generated
   public void IOHOOIOHCHICOCHIICHCICCOHRCIII(JsonObject var1) {
      this.OHICCRCROCROORROCCROOIIIRCCHOH = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.HIOIRHOHOIHRRCICOOOOCCHROHHCCC = var1;
   }

   @Generated
   public void ROOCCHRHHIIOICICHIIRRHCOCOCIHC(String var1) {
      this.mainClass = var1;
   }

   @Generated
   public void setType(String var1) {
      this.type = var1;
   }

   @Generated
   public void HOHHIHRHOHIIHRHCHHIRORRRCOIHCC(String var1) {
      this.OHRCOIHHHCOOOCROHHIOIHOHCORORI = var1;
   }

   @Generated
   public void CHOIOCOIICHHRRIIRROOOHHHCHOCOR(String var1) {
      this.IOIIOCCICOHORCHHCIHIHCIRCHOIIH = var1;
   }

   @Generated
   public void CCHORHIOORICCIRIHRIIHIICORIORO(Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
      this.RCOIIIHOCHOHOOCCIHIHHOOIRHROCI = var1;
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

         String var3 = this.getId();
         String var4 = var2.getId();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            JsonObject var5 = this.HRHHRICOROIIHRIHOCIOIORRORORIH();
            JsonObject var6 = var2.HRHHRICOROIIHRIHOCIOIORRORORIH();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = this.HOCHHHCHIRROIRIRIRRRCCRHROHIOO();
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = var2.HOCHHHCHIRROIRIRIRRRCCRHROHIOO();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  String var9 = this.RIIOIOIIHHHHRCIIHRHHOOHRHHRROO();
                  String var10 = var2.RIIOIOIIHHHHRCIIHRHHOOHRHHRROO();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     String var11 = this.getType();
                     String var12 = var2.getType();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        String var13 = this.IIROIIIIICHCROIIORRHCOOHHHCOHH();
                        String var14 = var2.IIROIIIIICHCROIIORRHCOOHHHCOHH();
                        if (var13 == null ? var14 == null : var13.equals(var14)) {
                           String var15 = this.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI();
                           String var16 = var2.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI();
                           if (var15 == null ? var16 == null : var15.equals(var16)) {
                              Map var17 = this.IRCIIIRRIOIHICRCIHHOOCRROOOOCO();
                              Map var18 = var2.IRCIIIRRIOIHICRCIHHOOCRROOOOCO();
                              return var17 == null ? var18 == null : var17.equals(var18);
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
      String var3 = this.getId();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      JsonObject var4 = this.HRHHRICOROIIHRIHOCIOIORRORORIH();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.HOCHHHCHIRROIRIRIRRRCCRHROHIOO();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.RIIOIOIIHHHHRCIIHRHHOOHRHHRROO();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.getType();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      String var8 = this.IIROIIIIICHCROIIORRHCOOHHHCOHH();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      String var9 = this.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI();
      var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
      Map var10 = this.IRCIIIRRIOIHICRCIHHOOCRROOOOCO();
      return var2 * 59 + (var10 == null ? 43 : var10.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ResolvedVersion(parent="
         + this.IIHCHCIOHIOOHIIRHROCRCIRHIHHCO()
         + ", id="
         + this.getId()
         + ", javaVersion="
         + this.HRHHRICOROIIHRIHOCIOIORRORORIH()
         + ", assetIndex="
         + this.HOCHHHCHIRROIRIRIRRRCCRHROHIOO()
         + ", mainClass="
         + this.RIIOIOIIHHHHRCIIHRHHOOHRHHRROO()
         + ", type="
         + this.getType()
         + ", time="
         + this.IIROIIIIICHCROIIORRHCOOHHHCOHH()
         + ", releaseTime="
         + this.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI()
         + ", downloads="
         + this.IRCIIIRRIOIHICRCIHHOOCRROOOOCO()
         + ")";
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      @SerializedName("sha1")
      private String CIHICOOIOIHRHOORRICCIORRRCICHC;
      @SerializedName("url")
      private String url;

      @Generated
      public String IOHCOORHIHCRCRIIHHRHCCHORCOIRC() {
         return this.CIHICOOIOIHRHOORRICCIORRRCICHC;
      }

      @Generated
      public String getUrl() {
         return this.url;
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
         } else if (!(var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
            return false;
         } else {
            String var3 = this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC();
            String var4 = var2.IOHCOORHIHCRCRIIHHRHCCHORCOIRC();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.getUrl();
               String var6 = var2.getUrl();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         String var3 = this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         String var4 = this.getUrl();
         return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "ResolvedVersion.DownloadInfo(sha1=" + this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC() + ", url=" + this.getUrl() + ")";
      }
   }
}
