package com.moonsworth.lunar.genesis;

import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.ichor.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

@OOROOCCIRCCRHOIOIORIHCHHOOCCOR
public class PreLaunchLibraryBootstrap implements Function<PreLaunchLibraryBootstrap.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, List<Path>> {
   public static final OCOHORHCROHICRRIHCIHHRRCIHICRI LOGGER = new OCOHORHCROHICRRIHCIHHRRCIHICRI("Genesis/PreLaunch")
      .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(Paths.get(".ichor/genesis.log"));

   public List<Path> apply(PreLaunchLibraryBootstrap.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(null);
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(
            var1.mcVersionName()
         )
         .orElseThrow(() -> new IllegalArgumentException("Invalid Minecraft version: " + var1.mcVersionName()));
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var1.mxCacheDir()
            )
         )
      );
      var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            "mcVer", var2.RIOHOIHIOORHIIICRCOCRCICORICRH()
         )
      );
      var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO("mcId", var2.getId())
      );
      com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = new com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var1.classpathDir(),
         var1.classpathDir(),
         var1.overridesDir(),
         var3,
         null,
         null,
         null,
         Map.of("mcVer", var2.RIOHOIHIOORHIIICRCOCRCICORICRH(), "computeFrames", var2.OCICHHIIHCICRICROCIHHOCHOCIIHH())
      );
      String var5 = System.getProperty("ichor.launch.libraries", null);
      HashMap var6 = new HashMap();
      if (var5 != null) {
         String[] var7 = var5.split(",");

         for (String var11 : var7) {
            String[] var12 = var11.split("=");
            var6.put(var12[0], var12[1]);
         }
      }

      String var13 = System.getProperty("ichor.fabricLoaderVersion", null);
      if (var13 != null) {
         var6.put("FABRIC_LOADER", var13);
      }

      return download(var4, var6, var1.extraLibsDir());
   }

   public static Path[] download(
      com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0,
      com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      @Nullable String var2,
      Path var3,
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
   ) {
      Path var5 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIIHCRRIRCHCIOOHRHIHIRIOCOIRH().resolve("libraries");
      String[] var6 = var0.mavenIds(var2);
      Path[] var7 = new Path[var6.length];
      URL[] var8 = Arrays.stream(var6).map(var1x -> {
         try {
            return com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.download(var1x, var5).toUri().toURL();
         } catch (MalformedURLException | FileNotFoundException var3x) {
            throw new RuntimeException(var3x);
         }
      }).toList().toArray(new URL[0]);

      for (URL var12 : var8) {
         var4.addURL(var12);
      }

      Thread.currentThread().setContextClassLoader(var4);

      try (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var17 = new com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            List.of(var0), var1, var4
         )) {
         for (int var18 = 0; var18 < var6.length; var18++) {
            String var19 = var6[var18];
            Path var20 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.download(var19, var5);
            if (var20 == null) {
               throw new IllegalStateException("Couldn't download " + var19);
            }

            Path var13 = var3.resolve(var19.replaceAll("[:.-]+", "_") + "-lunar-" + var0.getTransformerVersion() + ".jar");
            var7[var18] = var13;
            if (Files.isRegularFile(var20)) {
               if (Files.exists(var13)) {
                  if (IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var13)) {
                     continue;
                  }

                  LOGGER.warn("Existing transformed output '%s' is corrupt, deleting", var13.getFileName());
               }

               var17.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var20, var13, var4);
            }
         }

         return var7;
      } catch (Exception var16) {
         throw new IllegalStateException("Failed to download and transform library " + var0.name() + " " + var2, var16);
      }
   }

   public static List<Path> download(com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0, Map<String, String> var1, Path var2) {
      try {
         Files.createDirectories(var2);
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
            .getClassLoader();
         HashSet var4 = new HashSet();

         try {
            ServiceLoader.load(com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.class, var3)
               .iterator()
               .forEachRemaining(var1x -> var4.addAll(Arrays.asList(var1x.CRRRICCRROCOHHOHIICIHORCOORRRH())));
         } catch (ServiceConfigurationError var6) {
            throw new ServiceConfigurationError(
               "Failed to find PreLaunchLibraryRequests! PreLaunchLibrary is loaded in "
                  + var3.getName()
                  + " and PreLaunchLibraryRequest is loaded in "
                  + com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.class.getClassLoader().getName()
                  + " (they should be the same).",
               var6
            );
         }

         return var4.isEmpty() ? List.of() : var4.stream().flatMap(var4x -> {
            Path[] var5 = download(var4x, var0, (String)var1.get(var4x.name()), var2, var3);
            return Stream.of(var5);
         }).collect(Collectors.toList());
      } catch (Throwable var7) {
         throw var7;
      }
   }

   @CORCOCICIRIOHROHROIIOOHICCHCRR
   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String mcVersionName;
      private final Path mxCacheDir;
      private final Path classpathDir;
      private final Path overridesDir;
      private final Path extraLibsDir;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Path var2, Path var3, Path var4, Path var5) {
         this.mcVersionName = var1;
         this.mxCacheDir = var2;
         this.classpathDir = var3;
         this.overridesDir = var4;
         this.extraLibsDir = var5;
      }
   }
}
