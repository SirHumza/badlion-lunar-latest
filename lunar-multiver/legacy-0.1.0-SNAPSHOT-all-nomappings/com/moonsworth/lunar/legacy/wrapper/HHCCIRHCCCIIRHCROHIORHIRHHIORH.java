package com.moonsworth.lunar.legacy.wrapper;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.joml.Vector3d;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends Tessellator
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static HHCCIRHCCCIIRHCROHIORHIRHHIORH IHCHOCCRRHIHCCHIICHRHIIRCCCIIH;
   private double OHIIOCOIIIRHCHORRHCCHCOICOIOOH;

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      this(2097152);
   }

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1) {
      super(var1);
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH IIOCCIOHIIHHRICICRHCROCOOIHCCR() {
      if (IHCHOCCRRHIHCCHIICHRHIIRCCCIIH == null) {
         IHCHOCCRRHIHCCHIICHRHIIRCCCIIH = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      }

      return IHCHOCCRRHIHCCHIICHRHIIRCCCIIH;
   }

   public void bridge$setTranslation(double var1, double var3, double var5) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.buffer$v1_8.setTranslation$v1_8(var1, var3, var5);
      } else {
         this.setTranslation$v1_7(var1, var3, var5);
      }
   }

   public void HRHIOCRORCHCCOIHCCHHIHOOCOCHIC() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.buffer$v1_8.begin$v1_8(1, DefaultVertexFormats.POSITION_COLOR);
      } else {
         this.startDrawing$v1_7(1);
      }
   }

   public void OIICIRRCOOCIHRHOIOIOOROCRHCHIC(double var1) {
      this.OHIIOCOIIIRHCHORRHCCHCOICOIOOH = var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3d var1, int var2, int var3) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1, var2, var3);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3d var1, Vector3d var2, int var3, int var4) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, this.OHIIOCOIIIRHCHORRHCCHCOICOIOOH);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3d var1, Vector3d var2, int var3, int var4, double var5) {
      int var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.buffer$v1_8.getDrawMode$v1_8() : this.drawMode$v1_7;
      if (var7 != -1 && var3 != 0) {
         double var8 = var1.x() - var5;
         double var10 = var1.y() - var5;
         double var12 = var1.z() - var5;
         double var14 = var2.x() + 1.0 + var5;
         double var16 = var2.y() + 1.0 + var5;
         double var18 = var2.z() + 1.0 + var5;
         switch (var7) {
            case 1:
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var8, var10, var12, var14, var16, var18, var3, var4);
               break;
            case 7:
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, var10, var12, var14, var16, var18, var3, var4);
               break;
            default:
               throw new IllegalStateException("Unsupported mode for " + var7);
         }
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14) {
      int var15 = var14 >>> 24 & 0xFF;
      int var16 = var14 >>> 16 & 0xFF;
      int var17 = var14 >>> 8 & 0xFF;
      int var18 = var14 & 0xFF;
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var7, var9, var11, var13, var15, var16, var17, var18);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14, int var15, int var16, int var17
   ) {
      if ((var13 & 1) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var15, var16, var17, var14);
      }

      if ((var13 & 2) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var15, var16, var17, var14);
      }

      if ((var13 & 4) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var5, var15, var16, var17, var14);
      }

      if ((var13 & 8) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var16, var17, var14);
      }

      if ((var13 & 16) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5, var15, var16, var17, var14);
      }

      if ((var13 & 32) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var15, var16, var17, var14);
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14) {
      int var15 = var14 >>> 24 & 0xFF;
      int var16 = var14 >>> 16 & 0xFF;
      int var17 = var14 >>> 8 & 0xFF;
      int var18 = var14 & 0xFF;
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var3, var5, var7, var9, var11, var13, var15, var16, var17, var18);
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14, int var15, int var16, int var17
   ) {
      if ((var13 & 17) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var11, var15, var16, var17, var14);
      }

      if ((var13 & 18) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var16, var17, var14);
      }

      if ((var13 & 33) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var11, var15, var16, var17, var14);
      }

      if ((var13 & 34) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var15, var16, var17, var14);
      }

      if ((var13 & 5) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var5, var15, var16, var17, var14);
      }

      if ((var13 & 6) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var5, var15, var16, var17, var14);
      }

      if ((var13 & 9) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var11, var15, var16, var17, var14);
      }

      if ((var13 & 10) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var15, var16, var17, var14);
      }

      if ((var13 & 20) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5, var15, var16, var17, var14);
      }

      if ((var13 & 36) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var5, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var5, var15, var16, var17, var14);
      }

      if ((var13 & 24) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var11, var15, var16, var17, var14);
      }

      if ((var13 & 40) != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var3, var11, var15, var16, var17, var14);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var15, var16, var17, var14);
      }
   }

   public void RCIROOOOICRHCCRRCIORHHIRCOIIIC(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.buffer$v1_8.begin$v1_8(var1, DefaultVertexFormats.POSITION_COLOR);
      } else {
         this.startDrawing$v1_7(var1);
      }
   }

   public void CRIHOCIIHHRCIIIHHCICCIHIHRICRI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.draw$v1_8();
      } else {
         this.draw$v1_7();
      }
   }

   public boolean bridge$isDrawing() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.buffer$v1_8.isDrawing : this.isDrawing$v1_7;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, double var3, double var5, int var7, int var8, int var9, int var10) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.buffer$v1_8.pos$v1_8(var1, var3, var5).color$v1_8(var7, var8, var9, var10).endVertex$v1_8();
      } else {
         this.setColorRGBA$v1_7(var7, var8, var9, var10);
         this.addVertex$v1_7(var1, var3, var5);
      }
   }
}
