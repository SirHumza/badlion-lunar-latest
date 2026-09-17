package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.awt.Color;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   private int RHRHICHIOROICRCCRCCCCOCCIHHRCI;
   private int OROHRRIOCHIHCIIRIORHOCICOHIOIR;
   private boolean OCRIIORCHOIHORIRRHRRIIIIORHHOR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(long var1, int var3, int var4) {
      super(var1);
      this.RHRHICHIOROICRCCRCCCCOCCIHHRCI = var3;
      this.OROHRRIOCHIHCIIRIORHOCICOHIOIR = var4;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2) {
      this(125L, var1, var2);
   }

   public float COOCCCHCCRCCORRICRHCRROIOCOOIH(boolean var1) {
      this.COCCHRIOCIHRCRRHICICHIIRCCHIHO(var1);
      if (this.HROOIHCCIIORCIHIORHCOROHIROICH()) {
         float var2 = super.OICICHCIIHCIHHRRROIIIIHIIICCRI();
         return this.OCRIIORCHOIHORIRRHRRIIIIORHHOR ? var2 : 1.0F - var2;
      } else {
         return this.OCRIIORCHOIHORIRRHRRIIIIORHHOR ? 1.0F : 0.0F;
      }
   }

   public int CCRCIRCCOCHRCROCCOIORCIOHROCRH(boolean var1) {
      this.COCCHRIOCIHRCRRHICICHIIRCCHIHO(var1);
      if (this.HROOIHCCIIORCIHIORHCOROHIROICH()) {
         float var2 = super.OICICHCIIHCIHHRRROIIIIHIIICCRI();
         Color var3 = new Color(this.OCRIIORCHOIHORIRRHRRIIIIORHHOR ? this.RHRHICHIOROICRCCRCCCCOCCIHHRCI : this.OROHRRIOCHIHCIIRIORHOCICOHIOIR, true);
         Color var4 = new Color(this.OCRIIORCHOIHORIRRHRRIIIIORHHOR ? this.OROHRRIOCHIHCIIRIORHOCICOHIOIR : this.RHRHICHIOROICRCCRCCCCOCCIHHRCI, true);
         int var5 = (int)Math.abs(var2 * var4.getRed() + (1.0F - var2) * var3.getRed());
         int var6 = (int)Math.abs(var2 * var4.getGreen() + (1.0F - var2) * var3.getGreen());
         int var7 = (int)Math.abs(var2 * var4.getBlue() + (1.0F - var2) * var3.getBlue());
         int var8 = (int)Math.abs(var2 * var4.getAlpha() + (1.0F - var2) * var3.getAlpha());
         return (var8 & 0xFF) << 24 | (var5 & 0xFF) << 16 | (var6 & 0xFF) << 8 | var7 & 0xFF;
      } else {
         return var1 ? this.OROHRRIOCHIHCIIRIORHOCICOHIOIR : this.RHRHICHIOROICRCCRCCCCOCCIHHRCI;
      }
   }

   private void COCCHRIOCIHRCRRHICICHIIRCCHIHO(boolean var1) {
      if (var1 && !this.OCRIIORCHOIHORIRRHRRIIIIORHHOR) {
         this.OCRIIORCHOIHORIRRHRRIIIIORHHOR = true;
         this.start();
      } else if (this.OCRIIORCHOIHORIRRHRRIIIIORHHOR && !var1) {
         this.OCRIIORCHOIHORIRRHRRIIIIORHHOR = false;
         this.start();
      }
   }

   @Generated
   public void RRIOOIOROCIRHRORIRHIRHIHOCHICH(int var1) {
      this.RHRHICHIOROICRCCRCCCCOCCIHHRCI = var1;
   }

   @Generated
   public void OCRRIOHCHCCRRHRCCOHCIORRRORCRH(int var1) {
      this.OROHRRIOCHIHCIIRIORHOCICOHIOIR = var1;
   }

   @Generated
   public int RCIRICIRRRROCROOORCOCHCRRCRHRR() {
      return this.OROHRRIOCHIHCIIRIORHOCICOHIOIR;
   }
}
