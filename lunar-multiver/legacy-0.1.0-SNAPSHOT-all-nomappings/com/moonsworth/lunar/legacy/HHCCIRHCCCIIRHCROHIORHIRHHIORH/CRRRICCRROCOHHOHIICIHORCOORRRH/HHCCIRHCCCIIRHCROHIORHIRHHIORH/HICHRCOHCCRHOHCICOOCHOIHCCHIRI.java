package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IWorldNameable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiContainer.class)
public abstract class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public Container inventorySlots;
   @Shadow
   public int guiTop;
   @Shadow
   public int guiLeft;
   @Shadow
   public Slot hoveredSlot;
   @Unique
   private GuiTextField multiver$textField;

   @Shadow
   public abstract boolean checkHotbarKeys(int var1);

   @Shadow
   public abstract Slot getSlotAtPosition(int var1, int var2);

   @Shadow
   public abstract void handleMouseClick$v1_12(Slot var1, int var2, int var3, ClickType var4);

   @Shadow
   public abstract void handleMouseClick$v1_7(Slot var1, int var2, int var3, int var4);

   @Inject(method = "mouseClicked", at = @At("TAIL"))
   private void lunar$onMouseClicked(int var1, int var2, int var3, CallbackInfo var4) {
      this.checkHotbarKeys(var3 - 100);
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO> bridge$inventorySlots() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.inventorySlots.inventorySlots$v1_8 : this.inventorySlots.inventorySlots$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$title() {
      if (this.inventorySlots instanceof ContainerChest var1) {
         IInventory var3 = var1.lowerChestInventory;
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)((IWorldNameable)var3)
               .getDisplayName()
            : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new TextComponentString(var3.getInventoryName$v1_7())
            );
      } else {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
            new TextComponentString("")
         );
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getSlotAtPosition(
      int var1, int var2
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.getSlotAtPosition(
         var1, var2
      );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getHoveredSlot() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.hoveredSlot;
   }

   public int bridge$getGuiTop() {
      return this.guiTop;
   }

   public int bridge$getGuiLeft() {
      return this.guiLeft;
   }

   public void bridge$clickSlot(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.handleMouseClick$v1_12((Slot)var1, var1.bridge$getIndex(), 0, ClickType.PICKUP);
      } else {
         this.handleMouseClick$v1_7((Slot)var1, var1.bridge$getIndex(), 0, 0);
      }
   }

   public void bridge$clickSlot(
      int var1,
      int var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
   ) {
      Slot var4 = null;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         if (var1 >= 0 && var1 <= this.inventorySlots.inventorySlots$v1_7.size()) {
            var4 = this.inventorySlots.getSlot(var1);
         }
      } else if (var1 >= 0 && var1 <= this.inventorySlots.inventorySlots$v1_8.size()) {
         var4 = this.inventorySlots.getSlot(var1);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.handleMouseClick$v1_12(var4, var1, var2, (ClickType)var3.toVanilla(ClickType.values()));
      } else {
         this.handleMouseClick$v1_7(var4, var1, var2, var3.toId());
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getCursor() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer().bridge$getInventory() instanceof InventoryPlayer var1) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1.getItemStack();
         if (var3 != null) {
            return var3;
         }
      }

      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .ORIHOCRRHHCCOIHICIOHCIOCIIHOOO();
   }

   public void bridge$setHoveredSlot(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.hoveredSlot = (Slot)var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void lunar$handleKeyEventOnState(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (this.multiver$textField == null) {
         this.multiver$textField = new GuiTextField(0, this.fontRenderer, 0, 0, 0, 0);
      }

      ((OIHCOHRCICCCRHRCROOCIOIRRHHHIH)this.multiver$textField).bridge$setHeight(10);
      ((OIHCOHRCICCCRHRCROOCIOIRRHHHIH)this.multiver$textField).bridge$setWidth(var1.width * 10 / var1.height);
      this.multiver$textField.text = var1.text;
      this.multiver$textField.maxStringLength = var1.ROHRIRHHHRCORCIRCHCICIHCRICIHR;
      this.multiver$textField.lineScrollOffset = var1.ORHOOHRCIHIORCCRCOOOOCIROHRHCO;
      this.multiver$textField.cursorPosition = var1.IRCHOCHCRIOORIOOHCHOIOCHOHRROR;
      this.multiver$textField.selectionEnd = var1.RHCRCHICRORHICCHIRROIHIHOCHHRR;
      this.multiver$textField.setFocused(true);
      if (var2 instanceof IOHIHIIHCCCCCIHRORIOIOORCIOHII var3 && var3.RICRHCHRRCCIICRCHICCIHHHCIICOH()) {
         this.multiver$textField.textboxKeyTyped(var3.CIIICRIOHOOHOCRHOOHCOHOICCIHIH(), var3.code());
      }

      var1.text = this.multiver$textField.text;
      var1.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = this.multiver$textField.lineScrollOffset;
      var1.IRCHOCHCRIOORIOOHCHOIOCHOHRROR = this.multiver$textField.cursorPosition;
      var1.RHCRCHICRORHICCHIRROIHIHOCHHRR = this.multiver$textField.selectionEnd;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void lunar$handleMousePressOnState(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      int var2,
      int var3,
      int var4
   ) {
      if (this.multiver$textField == null) {
         this.multiver$textField = new GuiTextField(0, this.fontRenderer, 0, 0, 0, 0);
      }

      ((OIHCOHRCICCCRHRCROOCIOIRRHHHIH)this.multiver$textField).bridge$setHeight(10);
      ((OIHCOHRCICCCRHRCROOCIOIRRHHHIH)this.multiver$textField).bridge$setWidth(var1.width * 10 / var1.height);
      this.multiver$textField.text = var1.text;
      this.multiver$textField.maxStringLength = var1.ROHRIRHHHRCORCIRCHCICIHCRICIHR;
      this.multiver$textField.lineScrollOffset = var1.ORHOOHRCIHIORCCRCOOOOCIROHRHCO;
      this.multiver$textField.cursorPosition = var1.IRCHOCHCRIOORIOOHCHOIOCHOHRROR;
      this.multiver$textField.selectionEnd = var1.RHCRCHICRORHICCHIRROIHIHOCHHRR;
      this.multiver$textField.setFocused(true);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         this.multiver$textField.mouseClicked$v1_7(var3 * 10 / var1.height, var4, var2);
      } else {
         this.multiver$textField.mouseClicked$v1_12(var3 * 10 / var1.height, var4, var2);
      }

      var1.text = this.multiver$textField.text;
      var1.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = this.multiver$textField.lineScrollOffset;
      var1.IRCHOCHCRIOORIOOHCHOIOCHOHRROR = this.multiver$textField.cursorPosition;
      var1.RHCRCHICRORHICCHIRROIHIHOCHHRR = this.multiver$textField.selectionEnd;
   }

   public int bridge$getLowerChestSizeInventory() {
      return this.inventorySlots instanceof ContainerChest var1 ? var1.getLowerChestInventory().getSizeInventory() : 0;
   }
}
