package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;
import org.joml.Vector2i;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   A(false, false, false),
   B(true, false, false),
   C(false, true, false),
   D(true, true, false),
   E(false, false, true),
   F(true, false, true),
   G(false, true, true),
   H(true, true, true);

   private final boolean swapXY;
   private final boolean flipX;
   private final boolean flipY;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3, boolean var4, boolean var5) {
      this.swapXY = var3;
      this.flipX = var4;
      this.flipY = var5;
   }

   public Vector2i transform(int var1, int var2, int var3, int var4) {
      var3--;
      var4--;
      if (this.swapXY) {
         int var5 = var2;
         var2 = var1;
         var1 = var5;
      }

      if (this.flipX) {
         var1 = var3 - var1;
      }

      if (this.flipY) {
         var2 = var4 - var2;
      }

      return new Vector2i(var1, var2);
   }

   @Generated
   public boolean isSwapXY() {
      return this.swapXY;
   }
}
