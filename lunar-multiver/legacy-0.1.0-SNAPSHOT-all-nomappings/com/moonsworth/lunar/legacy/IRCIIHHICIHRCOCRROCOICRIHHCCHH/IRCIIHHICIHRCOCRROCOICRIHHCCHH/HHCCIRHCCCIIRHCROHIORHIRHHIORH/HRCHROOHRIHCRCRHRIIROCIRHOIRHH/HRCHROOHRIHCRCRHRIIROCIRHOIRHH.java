package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.lunarclient.apollo.module.inventory.InventoryModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.inventory.Container;
import net.minecraft.potion.PotionEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InventoryEffectRenderer.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends GuiContainer {
   @Shadow
   public boolean hasActivePotionEffects;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private boolean lunar$adjustedSearchField;
   @Unique
   private int lunar$inventoryButtonsShift;

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Container var1) {
      super(var1);
   }

   @Inject(method = "drawScreen", at = @At("RETURN"))
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private void lunar$onDrawScreen$v1_7(CallbackInfo var1) {
      if (this.lunar$adjustGuiLeft() && this instanceof GuiContainerCreative var2 && !this.lunar$adjustedSearchField) {
         var2.searchField.x -= 60;
         this.lunar$adjustedSearchField = true;
      }
   }

   @Inject(method = "updateActivePotionEffects$v1_8", at = @At("RETURN"))
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   private void lunar$updateActivePotionEffects(CallbackInfo var1) {
      this.lunar$adjustGuiLeft();
   }

   @Unique
   private boolean lunar$adjustGuiLeft() {
      Collection var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.mc.player$v1_8.getActivePotionEffects$v1_8()
         : this.mc.thePlayer$v1_7.getActivePotionEffects$v1_7();
      if (!var1.isEmpty()
         && (Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .OCHRIOHIIOHHCICRHIIORHCHHRICIO()
            .get()) {
         this.guiLeft = (this.width - this.xSize) / 2;
         return true;
      } else {
         return false;
      }
   }

   @Inject(method = "drawActivePotionEffects", at = @At("HEAD"), cancellable = true)
   private void impl$drawActivePotionEffects(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().OIORCIOIHCCICRHOCRICOROHRCIRRI().isEnabled()
         && !(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OIORCIOIHCCICRHOCRICOROHRCIRRI()
            .ROIOROCCHIOIHCRHHCHHRCHRROCCRH()
            .get()) {
         var1.cancel();
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(InventoryModule.class)
            .ifPresent(
               var2 -> {
                  int var3 = ((CIOHHCORHRCCRICCCORIHCRHCCCRRR)var2)
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this
                     );
                  if (var3 > 0 && this.guiLeft - 124 - var3 < 0) {
                     var1.cancel();
                  } else {
                     this.lunar$inventoryButtonsShift = var3;
                     this.guiLeft -= var3;
                  }
               }
            );
      }
   }

   @Inject(method = "drawActivePotionEffects", at = @At("RETURN"))
   private void lunar$restoreEffectsShift(CallbackInfo var1) {
      this.guiLeft = this.guiLeft + this.lunar$inventoryButtonsShift;
      this.lunar$inventoryButtonsShift = 0;
   }

   @WrapOperation(
      method = "drawActivePotionEffects",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/InventoryEffectRenderer;drawTexturedModalRect(IIIIII)V", ordinal = 0)
   )
   private void lunar$effectDurationBarHook(
      InventoryEffectRenderer var1, int var2, int var3, int var4, int var5, int var6, int var7, Operation<Void> var8, @Local PotionEffect var9
   ) {
      var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCOCRROHHROHHOCRCCCHCIROIIOORC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OIORCIOIHCCICRHOCRICOROHRCIRRI();
      if (var10.HHHCCICOIICOIIIOHORROORROICHOI()) {
         var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var9,
            var2 + 3,
            var3 + 3,
            114.0F,
            26.0F
         );
      }
   }
}
