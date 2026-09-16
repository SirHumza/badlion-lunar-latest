package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiCommandBlock;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.client.gui.GuiRepair;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenAddServer;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.gui.GuiScreenServerList;
import net.minecraft.client.gui.GuiWorldEdit;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiEditSign;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiScreen.class)
public abstract class IHCRORHRORIICHRHRCHRRIRRHHOCOO
   extends Gui
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Shadow
   public int width;
   @Shadow
   public int height;
   @Shadow
   public FontRenderer fontRenderer;
   @Shadow
   public Minecraft mc;
   @Shadow
   public boolean allowUserInput;
   @Unique
   private int lunar$inventoryScale = 0;
   @Unique
   private float lunar$inventoryScaleFactor = 1.0F;

   @Shadow
   public abstract void drawScreen(int var1, int var2, float var3);

   @Shadow
   public abstract void setWorldAndResolution(Minecraft var1, int var2, int var3);

   @Shadow
   public abstract void updateScreen();

   @Shadow
   public abstract void actionPerformed(GuiButton var1);

   @Shadow
   public abstract void mouseClickMove(int var1, int var2, int var3, long var4);

   @Shadow
   public static boolean isShiftKeyDown() {
      return false;
   }

   @Shadow
   public static boolean isCtrlKeyDown() {
      return false;
   }

   @Shadow
   public abstract void mouseClicked(int var1, int var2, int var3);

   @Shadow
   public abstract void handleMouseInput();

   @Shadow
   public abstract void mouseReleased(int var1, int var2, int var3);

   @Shadow
   public abstract void keyTyped(char var1, int var2);

   @Shadow
   public abstract void initGui();

   public void bridge$drawScreen(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      int var2,
      int var3,
      float var4
   ) {
      this.drawScreen(var2, var3, var4);
   }

   public void bridge$setWorldAndResolution(int var1, int var2) {
      this.setWorldAndResolution(Minecraft.instance, var1, var2);
   }

   public void bridge$updateScreen() {
      this.updateScreen();
   }

   public int bridge$getWidth() {
      return this.width;
   }

   public int bridge$getHeight() {
      return this.height;
   }

   public boolean bridge$hasTextFieldFocused() {
      if (this instanceof GuiScreenAddServer var9) {
         return var9.serverNameField.isFocused || var9.serverIPField.isFocused;
      } else if (this instanceof GuiCreateWorld var8) {
         return var8.worldNameField.isFocused;
      } else if (this instanceof GuiWorldEdit var7) {
         return var7.nameEdit.isFocused;
      } else if (this instanceof GuiScreenServerList var6) {
         return var6.ipEdit.isFocused;
      } else if (this instanceof GuiContainerCreative var5) {
         return var5.searchField.isFocused;
      } else if (this instanceof GuiEditSign || this instanceof GuiScreenBook var1 && var1.bookIsUnsigned) {
         return true;
      } else if (this instanceof GuiCommandBlock var4) {
         return var4.commandTextField.isFocused;
      } else {
         return this instanceof GuiRepair var3 ? var3.nameField.isFocused : false;
      }
   }

   @Inject(method = {"mouseClicked", "mouseReleased", "mouseClickMove"}, at = @At("HEAD"), cancellable = true, require = 3, expect = 3)
   private void lunar$webosr$disableMouseInputs(CallbackInfo var1) {
      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            != null
         && com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .ROHCORIRIRHCCCOROHIOOOCHHCICCR()
         && this.mc != null
         && this == this.mc.currentScreen) {
         var1.cancel();
      }
   }

   public void bridge$mouseClicked(int var1, int var2, int var3) {
      this.mouseClicked(var1, var2, var3);
   }

   public void bridge$mouseReleased(int var1, int var2, int var3) {
      this.mouseReleased(var1, var2, var3);
   }

   public void bridge$mouseClickMove(int var1, int var2, int var3, long var4, double var6, double var8) {
      this.mouseClickMove(var1, var2, var3, var4);
   }

   public boolean bridge$isShiftKeyDown() {
      return isShiftKeyDown();
   }

   public boolean bridge$isCtrlKeyDown() {
      return isCtrlKeyDown();
   }

   public void bridge$mouseScrolled(int var1, int var2, double var3, double var5) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HIORIIIIOCCCRCHCOROROCCOIOOIIR()
         .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, var2, (int)var5);
   }

   public void bridge$keyTyped(char var1, int var2, int var3) {
      this.keyTyped(var1, var2);
   }

   public boolean bridge$allowUserInput() {
      return this.allowUserInput;
   }

   public void bridge$setAllowUserInput(boolean var1) {
      this.allowUserInput = var1;
   }

   public int bridge$getInventoryScale() {
      return this.lunar$inventoryScale;
   }

   public void bridge$setInventoryScale(int var1) {
      this.lunar$inventoryScale = var1;
   }

   public float bridge$getInventoryScaleFactor() {
      return this.lunar$inventoryScaleFactor;
   }

   public void bridge$setInventoryScaleFactor(float var1) {
      this.lunar$inventoryScaleFactor = var1;
   }
}
