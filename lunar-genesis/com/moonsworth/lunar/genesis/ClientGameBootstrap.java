package com.moonsworth.lunar.genesis;

import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.ichor.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

@OOROOCCIRCCRHOIOIORIHCHHOOCCOR
public class ClientGameBootstrap implements Function<ClientGameBootstrap.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Void> {
   public static final Path LUNARCLIENT_DATA = Paths.get(System.getProperty("lunar.dataDir", System.getProperty("user.home") + File.separator + ".lunarclient"));
   public static final OCOHORHCROHICRRIHCIHHRRCIHICRI LOGGER = new OCOHORHCROHICRRIHCIHHRRCIHICRI("Genesis/GameBootstrap");

   public Void apply(ClientGameBootstrap.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      try {
         ClassLoader var2 = ClientGameBootstrap.class.getClassLoader();
         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(null);
         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(
               var1.mcVersionName()
            )
            .orElseThrow(() -> new IllegalArgumentException("Invalid Minecraft version: " + var1.mcVersionName()));
         LOGGER.info("Launching Minecraft " + var3.RIOHOIHIOORHIIICRCOCRCICORICRH() + " " + var3.getId() + " (parsed from " + var1.mcVersionName() + ")");
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
            new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  var1.mxCacheDir()
               )
            )
         );
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               "mcVer", var3.RIOHOIHIOORHIIICRCOCRCICORICRH()
            )
         );
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO("mcId", var3.getId())
         );
         ArrayList var5 = new ArrayList();
         if (var1.partialJarPath() != null) {
            LOGGER.info("Using partial jar " + var1.partialJarPath());
            com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EXTERNAL_REMAP,
               var1.partialJarPath(),
               var0 -> var0.startsWith("net.minecraft.") || var0.startsWith("com.mojang.")
            );
            var5.add(var6);
         }

         ArrayList var33 = new ArrayList();

         try (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var7 = new com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               Arrays.asList(com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()),
               new com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var1.classpathDir(),
                  var1.workingDirectory(),
                  var1.overridesDirectory(),
                  var4,
                  var5,
                  var1.classesToDump(),
                  var1.ichorExternalFiles() == null ? null : List.of(var1.ichorExternalFiles()),
                  Map.of(
                     "ichor.fabric.localModPath",
                     "./mods/",
                     "ichor.testing",
                     Boolean.toString(var1.runIntegrationTests()),
                     "mcVer",
                     var3.RIOHOIHIOORHIIICRCOCRCICORICRH(),
                     "computeFrames",
                     var3.OCICHHIIHCICRICROCIHHOCHOCIIHH()
                  )
               ),
               var2
            )) {
            if (var1.runIntegrationTests()) {
               com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var7);
            }

            ArrayList var8 = new ArrayList();
            var8.add(var3.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH());
            var8.addAll(var3.RHIROROIRROOROHRCOOOIRRIHRHROH());
            var8.addAll(var7.ICHCRHCIRCHCRIIHHCICIROCOOCHRC());
            URL[] var9 = new URL[var8.size()];

            try {
               int var10 = 0;

               for (Path var12 : var8) {
                  if (Files.notExists(var12)) {
                     throw new IllegalStateException("Failed to download dependency? " + var12);
                  }

                  var33.add(var12);
                  var9[var10++] = var12.toUri().toURL();
               }
            } catch (MalformedURLException var28) {
               throw new IllegalStateException("Couldn't build URL array", var28);
            }

            CRRRICCRROCOHHOHIICIHORCOORRRH var34 = new CRRRICCRROCOHHOHIICIHORCOORRRH(var9, var7);
            Thread.currentThread().setContextClassLoader(var34);
            Path var35 = null;
            if (IchorAPI.canCacheClasses()) {
               CORCOCICIRIOHROHROIIOOHICCHCRR var36 = IchorAPI.getClassCacheLevel();
               ArrayList var13 = new ArrayList();
               var13.add(var3);
               var13.addAll(new TreeSet<>(var7.HCCIOOOIRIRHCOHOIRCHIIOHCRRIIR().keySet()));
               if (var36 != null) {
                  var13.add(var36);
               }

               String var14 = hash(var13.toArray());
               TreeSet var15;
               if (var1.ichorClassPath() != null) {
                  var15 = new TreeSet();

                  for (String var19 : var1.ichorClassPath()) {
                     var15.add(var1.classpathDir().resolve(var19));
                  }

                  if (var1.ichorExternalFiles() != null) {
                     for (String var55 : var1.ichorExternalFiles()) {
                        if (var55.endsWith(".jar")) {
                           var15.add(var1.classpathDir().resolve(var55));
                        }
                     }
                  }
               } else {
                  var15 = new TreeSet(var33);

                  try (Stream var44 = Files.list(var1.classpathDir())) {
                     var44.forEach(var15::add);
                  }
               }

               if (Files.exists(var1.overridesDirectory()) && Files.isDirectory(var1.overridesDirectory())) {
                  try (Stream var45 = Files.list(var1.overridesDirectory())) {
                     var45.forEach(var15::add);
                  }
               }

               if (Boolean.parseBoolean(System.getProperty("ichor.debug.bakerhash", "false"))) {
                  var15.forEach(
                     var0 -> LOGGER.warn(
                        "Found file for baker hash %s: %s",
                        var0,
                        com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
                           var0
                        )
                     )
                  );
               }

               String var46 = hash(
                  var15.stream()
                     .map(
                        com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH::OOCCRCRCOHIIORCCORCRCIRRROIOOR
                     )
                     .toArray()
               );
               Path var49 = var1.classpathDir().resolve("cache").resolve(var14).resolve(var46);
               Files.createDirectories(var49);
               var7.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var49);
               var35 = var49.resolve("bake.zip");
               LOGGER.info("Config hash: " + var14 + "  File hash: " + var46);
               ConcurrentMap var52 = var34.IROICIIIHOCCCOHOCHHCRCRRRCOHHI();
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var34, var35, var52, var36);
            }

            try (var34) {
               System.out.println("LUNARCLIENT_STATUS_PREINIT");
               LOGGER.info("Starting game!");
               LOGGER.info("Branch: " + HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOIHCRHIIHIHCRIRRHOROCIICROIOC);
               LOGGER.info("Commit Hash: " + HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOOCICHHOCOOIIIORRIOCCHHHRCRCI);
               Class var39 = Class.forName(var3.ORIRIIOCIHRHIHHICHIRIRHICRICRC(), true, var34);
               Method var41 = var39.getMethod("main", String[].class);
               HashMap var42 = getLaunchArguments(var3);
               ArrayList var47 = new ArrayList();
               String[] var50 = var1.args();

               for (int var53 = 0; var53 < var50.length; var53++) {
                  boolean var56 = var53 == var50.length - 1;
                  String var20 = var50[var53];
                  if (var20.startsWith("--")) {
                     if (var56) {
                        var47.add(var20);
                     } else {
                        String var21 = var50[var53 + 1];
                        if (var21.startsWith("--")) {
                           var47.add(var20);
                        }
                     }
                  } else if (var53 != 0) {
                     String var60 = var50[var53 - 1];
                     if (var60.startsWith("--")) {
                        var42.put(var60, var20);
                        if ("--gameDir".equals(var60)) {
                           var42.put("--assetsDir", var20 + "/assets/");
                        }
                     }
                  }
               }

               String[] var54 = new String[var42.size() * 2 + var47.size()];
               int var57 = 0;

               for (Entry var61 : var42.entrySet()) {
                  var54[var57] = (String)var61.getKey();
                  var54[var57 + 1] = (String)var61.getValue();
                  var57 += 2;
               }

               for (String var62 : var47) {
                  var54[var57] = var62;
                  var57++;
               }

               var41.invoke(null, var54);
            } catch (Throwable var30) {
               if (var30.getCause() instanceof NoSuchMethodError var38 && IchorAPI.canCacheClasses() && Files.exists(var35)) {
                  LOGGER.info("Deleting cache at " + var35 + " because of " + var38.getMessage());
                  Files.delete(var35);
               }

               throw new IllegalStateException("Failed to boot Minecraft", var30);
            }
         }

         return null;
      } catch (Throwable var32) {
         throw var32;
      }
   }

   private static String hash(Object... var0) {
      return Integer.toHexString(Objects.hash(var0));
   }

   private static HashMap<String, String> getLaunchArguments(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      Path var1 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIIHCRRIRCHCIOOHRHIHIRIOCOIRH();
      HashMap var2 = new HashMap();
      var2.put("--version", "Lunar Client");
      var2.put("--accessToken", "0");
      var2.put("--assetIndex", var0.ROIHOHIRCRCICHHCRROOCCHRRCOHCH());
      var2.put("--userProperties", "{}");
      var2.put("--gameDir", var1.toString());
      var2.put("--assetsDir", var1.resolve("assets").toString());
      var2.put("--texturesDir", LUNARCLIENT_DATA.resolve("textures").toString());
      var2.put("--uiDir", LUNARCLIENT_DATA.resolve("ui").toString());
      var2.put("--jitDir", LUNARCLIENT_DATA.resolve("jit").toString());
      String var3 = System.getProperty("java.library.path");
      String[] var4 = var3.split(File.pathSeparator);
      var2.put("--webosrDir", var4[var4.length - 1] + "/web");
      return var2;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String[] args;
      private final Path classpathDir;
      private final Path mxCacheDir;
      private final Path overridesDirectory;
      private final String mcVersionName;
      private final String[] ichorClassPath;
      private final String[] ichorExternalFiles;
      private final boolean runIntegrationTests;
      private final Path workingDirectory;
      private final Path extraLibsDir;
      @Nullable
      private final Path partialJarPath;
      private final List<String> classesToDump;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String[] var1,
         Path var2,
         Path var3,
         Path var4,
         String var5,
         String[] var6,
         String[] var7,
         boolean var8,
         Path var9,
         Path var10,
         @Nullable Path var11,
         List<String> var12
      ) {
         this.args = var1;
         this.classpathDir = var2;
         this.mxCacheDir = var3;
         this.overridesDirectory = var4;
         this.mcVersionName = var5;
         this.ichorClassPath = var6;
         this.ichorExternalFiles = var7;
         this.runIntegrationTests = var8;
         this.workingDirectory = var9;
         this.extraLibsDir = var10;
         this.partialJarPath = var11;
         this.classesToDump = var12;
      }
   }
}
