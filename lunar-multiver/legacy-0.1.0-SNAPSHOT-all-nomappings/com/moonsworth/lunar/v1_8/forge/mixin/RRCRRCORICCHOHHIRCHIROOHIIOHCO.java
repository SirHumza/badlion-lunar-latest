package com.moonsworth.lunar.v1_8.forge.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.input.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ForgeHooksClient.class)
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Unique
   private static Integer lunar$inventoryGuiScale;
   @Unique
   private static float lunar$inventoryScaleFactor = 1.0F;

   @Redirect(method = "drawScreen", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V"))
   private static void lunar$updateCameraAndRender$drawScreen$forge(GuiScreen var0, int var1, int var2, float var3) {
      try {
         int var4;
         int var15;
         if (lunar$inventoryGuiScale$pre()) {
            var4 = (int)(var1 / lunar$inventoryScaleFactor);
            var15 = (int)(var2 / lunar$inventoryScaleFactor);
         } else {
            var4 = var1;
            var15 = var2;
         }

         boolean var16 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
               == null
            || !com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
               .ROHCORIRIRHCCCOROHIOOOCHHCICCR();
         int var17 = var16 ? var4 : 0;
         int var18 = var16 ? var15 : 0;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR var19 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();

         try {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
                  var5x -> var5x.wrapEvents(
                     () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var17, var18
                        ),
                        var3,
                        (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var0,
                        var19,
                        new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var19
                        )
                     ),
                     () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var17, var18
                        ),
                        var3,
                        (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var0,
                        var19,
                        new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var19
                        )
                     )
                  ),
                  () -> var0.drawScreen(var17, var18, var3)
               );
         } finally {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RIRRCORROOHICCHOHOORICRRCHRCOR();
         }

         lunar$inventoryGuiScale$post();
      } catch (Throwable var14) {
         Minecraft var5 = Minecraft.getMinecraft();
         CrashReport var6 = CrashReport.makeCrashReport(var14, "Rendering screen");
         CrashReportCategory var7 = var6.makeCategory("Screen render details");
         String var8 = var5.currentScreen.getClass().getCanonicalName();
         var7.addCrashSectionCallable("Screen name", () -> var8);
         String var9 = String.format("Scaled: (%d, %d). Absolute: (%d, %d)", var1, var2, Mouse.getX(), Mouse.getY());
         var7.addCrashSectionCallable("Mouse location", () -> var9);
         String var10 = String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", 0, 0, var5.displayWidth, var5.displayHeight, 0);
         var7.addCrashSectionCallable("Screen size", () -> var10);
         throw new ReportedException(var6);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "drawScreen", at = @At("HEAD"), cancellable = true)
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "optifine")
   private static void lunar$overwriteGuiRender$forgeOptifine$1_8(
      CallbackInfo var0,
      @Local(argsOnly = true) GuiScreen var1,
      @Local(argsOnly = true, ordinal = 0) LocalIntRef var2,
      @Local(argsOnly = true, ordinal = 1) LocalIntRef var3,
      @Local(argsOnly = true) float var4
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI();
      if (var5.HIOOIIICOCICOICOICCICCHRIORORI()) {
         var0.cancel();
      } else if (var5.OOOOIRIIOHIICOOHOHCCIOHCROCRCC()) {
         var2.set(-1);
         var3.set(-1);
      }

      var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(),
         new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
         ),
         var2.get(),
         var3.get(),
         var4
      );
   }

   @Unique
   private static boolean lunar$inventoryGuiScale$pre() {
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var0 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)Minecraft.getMinecraft().currentScreen;
      int var1 = var0 == null ? 0 : var0.bridge$getInventoryScale();
      if (var1 <= 0) {
         lunar$inventoryScaleFactor = 1.0F;
         return false;
      } else {
         lunar$inventoryGuiScale = Minecraft.getMinecraft().gameSettings.guiScale;
         Minecraft.getMinecraft().gameSettings.guiScale = var1;
         lunar$inventoryScaleFactor = (float)var1
            / com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH()
               .IOCIOIHIOOCRHHORHHCOOHIIHICOCH();
         var0.bridge$setInventoryScaleFactor(lunar$inventoryScaleFactor);
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .bridge$scale(lunar$inventoryScaleFactor, lunar$inventoryScaleFactor, 1.0F);
         return true;
      }
   }

   @Unique
   private static void lunar$inventoryGuiScale$post() {
      if (lunar$inventoryGuiScale != null) {
         Minecraft.getMinecraft().gameSettings.guiScale = lunar$inventoryGuiScale;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().HROOORICCCOROOORORCORRHRHORIRC();
         lunar$inventoryGuiScale = null;
         lunar$inventoryScaleFactor = 1.0F;
         ORHIOICIOCRRHOOCOHRORIHICHRCRR var0 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)Minecraft.getMinecraft().currentScreen;
         if (var0 != null) {
            var0.bridge$setInventoryScaleFactor(1.0F);
         }
      }
   }
}
