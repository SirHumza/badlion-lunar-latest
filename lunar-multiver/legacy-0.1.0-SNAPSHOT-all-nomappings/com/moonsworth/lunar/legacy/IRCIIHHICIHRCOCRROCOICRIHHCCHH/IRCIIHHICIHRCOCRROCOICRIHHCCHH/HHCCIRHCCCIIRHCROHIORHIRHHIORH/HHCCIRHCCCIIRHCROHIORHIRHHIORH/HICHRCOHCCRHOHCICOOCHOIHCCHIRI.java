package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map;
import net.minecraft.client.gui.GuiLanguage.List;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.Language_v1_7;
import net.minecraft.client.resources.Language_v1_8;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(List.class)
public abstract class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   @Final
   @Shadow
   public java.util.List field_148176_l$v1_7;
   @Final
   @Shadow
   public java.util.List<String> langCodeList$v1_8;
   @Final
   @Shadow
   public Map<String, Language_v1_8> languageMap$v1_8;
   @Final
   @Shadow
   public Map field_148177_m$v1_7;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "drawSlot$v1_12", at = @At("TAIL"))
   private void lunar$drawSlot$v1_12(int var1, int var2, int var3, int var4, int var5, int var6, float var7, CallbackInfo var8) {
      this.lunar$onDrawSlot(var1, var2, var3);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "drawSlot$v1_8", at = @At("TAIL"))
   private void impl$drawSlot$v1_8(int var1, int var2, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      this.lunar$onDrawSlot(var1, var2, var3);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "drawSlot$v1_7", at = @At("TAIL"))
   private void lunar$onDrawSlot(int var1, int var2, int var3, int var4, Tessellator var5, int var6, int var7, CallbackInfo var8) {
      this.lunar$onDrawSlot(var1, var2, var3);
   }

   @Unique
   private void lunar$onDrawSlot(int var1, int var2, int var3) {
      String var4;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         Language_v1_8 var5 = this.languageMap$v1_8.get(this.langCodeList$v1_8.get(var1));
         var4 = var5.languageCode;
      } else {
         Language_v1_7 var10 = (Language_v1_7)this.field_148177_m$v1_7.get(this.field_148176_l$v1_7.get(var1));
         var4 = var10.languageCode;
      }

      boolean var11 = false;

      for (com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 : com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.values()) {
         if (var9.getFileName().equals(var4)) {
            var11 = true;
            break;
         }
      }

      if (var11) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCORRCCCOIHCHROHHORHIOOCCHOHRO,
            var2,
            var3,
            14.0F,
            14.0F,
            -1
         );
      }
   }
}
