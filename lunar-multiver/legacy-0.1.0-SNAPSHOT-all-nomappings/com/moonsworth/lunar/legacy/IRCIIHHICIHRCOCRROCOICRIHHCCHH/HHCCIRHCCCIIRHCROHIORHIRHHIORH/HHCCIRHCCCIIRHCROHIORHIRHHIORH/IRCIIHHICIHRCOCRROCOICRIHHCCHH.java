package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import net.minecraft.client.renderer.Tessellator;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements IGuiListEntry {
   private final Minecraft minecraft = Minecraft.getMinecraft();

   private void HCIOIIHCHIHRHOHRICRIOCIRHRICOR(int var1, int var2) {
      if (this.minecraft.currentScreen != null) {
         FontRenderer var3 = this.minecraft.fontRenderer;
         String var4 = "Hosted Worlds";
         var3.drawString(var4, this.minecraft.currentScreen.width / 2 - var3.getStringWidth(var4) / 2, var1 + var2 / 2 - 2, 16777215);

         String var5 = switch ((int)(Minecraft.getSystemTime() / 300L % 4L)) {
            case 1, 3 -> "o O o";
            case 2 -> "o o O";
            default -> "O o o";
         };
         var3.drawString(var5, this.minecraft.currentScreen.width / 2 - var3.getStringWidth(var5) / 2, var1 + var2 / 2 + 9 - 2, 8421504);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void drawEntry$v1_7(int var1, int var2, int var3, int var4, int var5, Tessellator var6, int var7, int var8, boolean var9) {
      this.HCIOIIHCHIHRHOHRICRIOCIRHRICOR(var3, var5);
   }

   public boolean mousePressed(int var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   public void mouseReleased(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   public void setSelected$v1_8(int var1, int var2, int var3) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   public void drawEntry$v1_8(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      this.HCIOIIHCHIHRHOHRICRIOCIRHRICOR(var3, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public void updatePosition$v1_12(int var1, int var2, int var3, float var4) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public void drawEntry$v1_12(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      this.HCIOIIHCHIHRHOHRICRIOCIRHRICOR(var3, var5);
   }
}
