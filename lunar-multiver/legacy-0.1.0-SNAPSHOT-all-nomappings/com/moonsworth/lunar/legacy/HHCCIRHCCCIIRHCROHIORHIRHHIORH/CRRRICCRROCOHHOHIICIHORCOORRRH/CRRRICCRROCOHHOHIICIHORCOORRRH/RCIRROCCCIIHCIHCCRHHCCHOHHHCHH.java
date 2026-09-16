package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.RRHHORICORICIRHICOHHROHIIHICCH;
import java.io.File;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(Main.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Unique
   private static OptionSpec<String> lunar$installationId;
   @Unique
   private static OptionSpec<String> lunar$overwolfMuid;
   @Unique
   private static OptionSpec<String> lunar$launcherVersion;
   @Unique
   private static OptionSpec<String> lunar$texturesDir;
   @Unique
   private static OptionSpec<String> lunar$jitDir;
   @Unique
   private static OptionSpec<String> lunar$sentryTraceId;
   @Unique
   private static OptionSpec<String> lunar$modrinthModpackProjectId;
   @Unique
   private static OptionSpec<String> lunar$modrinthModpackVersionId;
   @Unique
   private static OptionSpec<String> lunar$curseforgeModpackModId;
   @Unique
   private static OptionSpec<String> lunar$curseforgeModpackFileId;
   @Unique
   private static OptionSpec<Integer> lunar$ipcPort;
   @Unique
   private static OptionSpec<String> lunar$uiDir;
   @Unique
   private static OptionSpec<String> lunar$webosrDir;
   @Unique
   private static OptionSpec<String> lunar$launchId;
   @Unique
   private static OptionSpec<String> lunar$canaryToken;
   @Unique
   private static OptionSpec<String> lunar$launcherFeatureFlags;

   @Inject(method = "main([Ljava/lang/String;)V", at = @At("HEAD"))
   private static void lunar$main(String[] var0, CallbackInfo var1) {
      System.setProperty("apple.awt.application.name", "Lunar Client");
      System.setProperty("jna.library.path", System.getProperty("java.library.path"));
      System.setProperty("gson.allowCapturingTypeVariables", "true");
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH());
   }

   @Redirect(
      method = "main([Ljava/lang/String;)V",
      at = @At(value = "INVOKE", target = "Ljoptsimple/OptionParser;parse([Ljava/lang/String;)Ljoptsimple/OptionSet;")
   )
   private static OptionSet lunar$main$parse(OptionParser var0, String... var1) {
      OptionSet var2 = var0.parse(var1);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.ORCCHCHHORORRHCHRRCCHICHIHCCCO = (String)var2.valueOf(lunar$launcherVersion);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR = (String)var2.valueOf(lunar$installationId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC = (String)var2.valueOf(lunar$overwolfMuid);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CCHHHCROHRCOCHHORCORROCIIOOHOC = (String)var2.valueOf(lunar$sentryTraceId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.HOOHROHCIHOICOCOIICCOCOICROIRR = (String)var2.valueOf(lunar$modrinthModpackProjectId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IOHHIIICRCIOHCHHORCHRCRHCHCRIO = (String)var2.valueOf(lunar$modrinthModpackVersionId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RHHRRICCIHHIHRHIORRRRRROCHIHHH = (String)var2.valueOf(lunar$curseforgeModpackModId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IRHCRHIORHIRHOCRROCRICRIIRCIOR = (String)var2.valueOf(lunar$curseforgeModpackFileId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOHOHIOIORIORCHRORCHIOCHOIRCCO = (String)var2.valueOf(lunar$launchId);
      IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RCIROCRHCOHOCCCCIIIHCORRRRCORI = (String)var2.valueOf(lunar$canaryToken);
      String var3 = (String)var2.valueOf(lunar$launcherFeatureFlags);
      if (!var3.equals("not supplied")) {
         try {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.registerFromJson(
               (JsonObject)new Gson().fromJson(var3, JsonObject.class)
            );
         } catch (Exception var10) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, "Launcher Feature Flag Parse");
         }
      }

      String var4 = (String)var2.valueOf(lunar$texturesDir);
      if (var4 != null) {
         File var5 = new File(var4);
         System.out.println("[Bridge] Found textures dir: " + var5.getAbsolutePath());
         RRHHORICORICIRHICOHHROHIIHICCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH("lunar", var5.toPath());
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)(
               new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Lunar Cosmetics", "lunar", "Lunar Client cosmetics and assets", var5
               )
            )
         );
         IRRCHICCRHCHRRCHIOHIIRIORIRHRI.ORHOOOCOOHROHRCOCOOHIRIHIIOROI = var5;
      }

      String var11 = (String)var2.valueOf(lunar$jitDir);
      if (var11 != null) {
         File var6 = new File(var11);
         System.out.println("[Bridge] Found JIT dir: " + var6.getAbsolutePath());
         RRHHORICORICIRHICOHHROHIIHICCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH("lunar-jit", var6.toPath());
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)(
               new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Lunar JIT Assets", "lunar-jit", "Lunar Client JIT assets", var6
               )
            )
         );
         IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OHRRIHCCHIOOOHRORORIHHHOOIOOII = var6;
      }

      Integer var12 = (Integer)var2.valueOf(lunar$ipcPort);
      if (var12 != null) {
         System.out.println("[Bridge] Found IPC port: " + var12);
         IRRCHICCRHCHRRCHIOHIIRIORIRHRI.IRIICHIROOICIIOCCCIOHRRCIIHCCR = var12;
      }

      String var7 = (String)var2.valueOf(lunar$uiDir);
      if (var7 != null) {
         File var8 = new File(var7);
         System.out.println("[Bridge] Found ui dir: " + var8.getAbsolutePath());
         IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CHHRCIOCRCCOOCIRCRRCCHOCOHOIOC = var8;
      }

      String var13 = (String)var2.valueOf(lunar$webosrDir);
      if (var13 != null) {
         File var9 = new File(var13);
         System.out.println("[Bridge] Found webosr dir: " + var9.getAbsolutePath());
         IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RRRICIIICRIICCOHRRROCHIORHCRCR = var9;
         return var2;
      } else {
         throw new RuntimeException("webosrDir not found");
      }
   }

   @Inject(
      method = "main([Ljava/lang/String;)V",
      at = @At(value = "INVOKE", target = "Ljoptsimple/OptionParser;allowsUnrecognizedOptions()V"),
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private static void lunar$main$(String[] var0, CallbackInfo var1, OptionParser var2) {
      lunar$launcherFeatureFlags = var2.accepts("launcherFeatureFlags").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$launcherVersion = var2.accepts("launcherVersion").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$installationId = var2.accepts("installationId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$overwolfMuid = var2.accepts("overwolfMuid").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$texturesDir = var2.accepts("texturesDir").withRequiredArg();
      lunar$jitDir = var2.accepts("jitDir").withRequiredArg();
      lunar$sentryTraceId = var2.accepts("sentryTraceId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$modrinthModpackProjectId = var2.accepts("modrinthModpackProjectId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$modrinthModpackVersionId = var2.accepts("modrinthModpackVersionId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$curseforgeModpackModId = var2.accepts("curseforgeModpackModId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$curseforgeModpackFileId = var2.accepts("curseforgeModpackFileId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$ipcPort = var2.accepts("ipcPort").withOptionalArg().ofType(Integer.class);
      lunar$uiDir = var2.accepts("uiDir").withRequiredArg();
      lunar$webosrDir = var2.accepts("webosrDir").withRequiredArg();
      lunar$launchId = var2.accepts("launchId").withRequiredArg().defaultsTo("not supplied", new String[0]);
      lunar$canaryToken = var2.accepts("canaryToken").withRequiredArg().defaultsTo("", new String[0]);
   }
}
