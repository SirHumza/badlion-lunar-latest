package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ResourcePackListEntry.class)
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Final
   @Shadow
   public GuiScreenResourcePacks resourcePacksGUI;

   @Shadow
   public abstract int getResourcePackFormat$v1_12();

   @Shadow
   public abstract int func_183019_a$v1_8();

   @Redirect(method = "mousePressed", at = @At(value = "INVOKE", target = "Ljava/util/List;add(ILjava/lang/Object;)V", ordinal = 1))
   private void impl$onAddAvailablePack(List<ResourcePackListEntry> var1, int var2, Object var3) {
      int var4;
      for (var4 = 0; var4 < var1.size(); var4++) {
         ResourcePackListEntry var5 = (ResourcePackListEntry)var1.get(var4);
         if (!(var5 instanceof com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)
            && !(
               var5 instanceof com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            )) {
            break;
         }
      }

      var1.add(var4, (ResourcePackListEntry)var3);
   }

   @Inject(method = "mousePressed", at = @At("RETURN"))
   private void impl$onMousePressed(CallbackInfoReturnable<Boolean> var1) {
      ((RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)this.resourcePacksGUI).bridge$handlePackSwapList();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(
      method = "drawEntry$v1_7",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;drawModalRectWithCustomSizedTexture(IIFFIIFF)V", ordinal = 1, shift = Shift.AFTER),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;drawModalRectWithCustomSizedTexture(IIFFIIFF)V", ordinal = 2, shift = Shift.AFTER)
      },
      cancellable = true
   )
   private void lunar$draw$v1_7(int var1, int var2, int var3, int var4, int var5, Tessellator var6, int var7, int var8, boolean var9, CallbackInfo var10) {
      this.lunar$renderPreview(var10, var2, var3, var4, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "drawEntry$v1_8",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;drawModalRectWithCustomSizedTexture(IIFFIIFF)V", ordinal = 1, shift = Shift.AFTER),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;drawModalRectWithCustomSizedTexture(IIFFIIFF)V", ordinal = 2, shift = Shift.AFTER)
      },
      cancellable = true
   )
   private void lunar$draw$v1_8(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, CallbackInfo var9) {
      if (this.func_183019_a$v1_8() == 1) {
         this.lunar$renderPreview(var9, var2, var3, var4, var5);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(
      method = "drawEntry$v1_12",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;drawModalRectWithCustomSizedTexture(IIFFIIFF)V", ordinal = 1, shift = Shift.AFTER),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;drawModalRectWithCustomSizedTexture(IIFFIIFF)V", ordinal = 2, shift = Shift.AFTER)
      },
      cancellable = true
   )
   private void lunar$draw$v1_12(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9, CallbackInfo var10) {
      if (this.getResourcePackFormat$v1_12() == 3) {
         this.lunar$renderPreview(var10, var2, var3, var4, var5);
      }
   }

   @Unique
   private void lunar$renderPreview(CallbackInfo var1, int var2, int var3, int var4, int var5) {
      if ((Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .RRCORRRCHHOHRRORHRHRHCRHORIOII()
         .get()) {
         if (this instanceof ResourcePackListEntryFound var6) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
                  == 5
               ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var6.getResourcePackEntry$v1_12()
                  .getResourcePack()
               : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var6.func_148318_i$v1_7()
                  .getResourcePack();
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .HCCICHICCIRRRHIIIIHOIOIRIOHCCI()
               .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8)
               .ifPresent(
                  var5x -> {
                     var1.cancel();
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .HCCICHICCIRRRHIIIIHOIOIRIOHCCI()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR().IRCRHHCRHIIIHROOCORCHHHRIIROIR(), var5x, var2, var3, var4, var5
                        );
                  }
               );
         }
      }
   }
}
