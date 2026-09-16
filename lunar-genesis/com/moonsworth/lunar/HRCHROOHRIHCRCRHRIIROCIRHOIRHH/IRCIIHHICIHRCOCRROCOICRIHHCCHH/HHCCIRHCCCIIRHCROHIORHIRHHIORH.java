package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private transient HHCCIRHCCCIIRHCROHIORHIRHHIORH HOCIOHOHICRIOCIHIOOCHHHICHIIRR = null;
   @SerializedName("id")
   private String id;
   @SerializedName("type")
   private String type;
   @SerializedName("url")
   private String url;
   @SerializedName("time")
   private String OHRCOIHHHCOOOCROHHIOIHOHCORORI;
   @SerializedName("releaseTime")
   private String IOIIOCCICOHORCHHCIHIHCIRCHOIIH;

   @Override
   public String toString() {
      String var1 = this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR == null ? "none" : this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR.id;
      return "VersionInfo{" + this.id + ", " + this.type + ", parent=" + var1 + "}";
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IRCCOROOCOIRRIICHRCICCOOHRHHOI() {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOHIIHOCCHOROCICHHHOCRHHHCOOII
         .fromJson(CORCOCICIRIOHROHROIIOOHICCHCRR.COORORIOCRROOOCIORRCHRHRCRHRCR(this.url), IRCIIHHICIHRCOCRROCOICRIHHCCHH.class);
      var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR);
      return var1;
   }

   public boolean HHORRRCRRROHHRCCOCOOCIOHCCCCCR() {
      return this.id.compareTo("26") >= 0;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH IIHCHCIOHIOOHIIRHROCRCIRHIHHCO() {
      return this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public String getType() {
      return this.type;
   }

   @Generated
   public String getUrl() {
      return this.url;
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
   public void setId(String var1) {
      this.id = var1;
   }

   @Generated
   public void setType(String var1) {
      this.type = var1;
   }

   @Generated
   public void setUrl(String var1) {
      this.url = var1;
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
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         String var3 = this.getId();
         String var4 = var2.getId();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.getType();
            String var6 = var2.getType();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.getUrl();
               String var8 = var2.getUrl();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  String var9 = this.IIROIIIIICHCROIIORRHCOOHHHCOHH();
                  String var10 = var2.IIROIIIIICHCROIIORRHCOOHHHCOHH();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     String var11 = this.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI();
                     String var12 = var2.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI();
                     return var11 == null ? var12 == null : var11.equals(var12);
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
      return var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getId();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getType();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.getUrl();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      String var6 = this.IIROIIIIICHCROIIORRHCOOHHHCOHH();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI();
      return var2 * 59 + (var7 == null ? 43 : var7.hashCode());
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.HOCIOHOHICRIOCIHIOOCHHHICHIIRR = var1;
   }
}
