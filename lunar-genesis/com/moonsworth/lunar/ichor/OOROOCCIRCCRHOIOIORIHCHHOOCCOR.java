package com.moonsworth.lunar.ichor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCCICOCCCHROHOCCHIHORIHHCOHOHH;
import com.moonsworth.lunar.ichor.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.ichor.util.FatalIchorError;
import com.moonsworth.lunar.ichor.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.ichor.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.ichor.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.ichor.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import lombok.Generated;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.MappingsReader;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements AutoCloseable {
   public static final boolean HOCHROOCRIRCRIORCOCIHICRIIIIHH = Boolean.parseBoolean(System.getProperty("ichor.debugPipelineTimings", "false"));
   public static final String CROHHIHHHHOHIOICORHOHHRCCCRHIH = "absolute::";
   public static final OCOHORHCROHICRRIHCIHHRRCIHICRI CHOCCCRCHIOCCOOICCOHOOIHROHIHI = new OCOHORHCROHICRRIHCIHHRRCIHICRI("IchorPipeline");
   private final ClassLoader IROIICIIRCORICCHCCRRORCCORHOIC;
   @Nullable
   private ClassLoader RHCHHCOIIHCICIHICRIHOIOHRRIIIR;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO IIHHOHHIHOCRHCIOCRHIRIRROOOHCR;
   private final Map<String, HRCHROOHRIHCRCRHRIIROCIRHOIRHH> CHRROROOCORIOIRRRIOHHHRICCRRIH;
   private final Map<Object, CRRRICCRROCOHHOHIICIHORCOORRRH> RIIORHCOICOROICIHIIRCOHIORORIO;
   private final List<CORCOCICIRIOHROHROIIOOHICCHCRR> ROOHRIHHIHICIHIIHICRRHRRRCHORI;
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH IRRICOHHCICOIOIRHOCCICHHIRICIO;
   private final RCCICOCCCHROHOCCHIHORIHHCOHOHH<String, String, String> RRHIHCRCROOIHIOOICCCRCCHHCHHOO;
   private final RCCICOCCCHROHOCCHIHORIHHCOHOHH<String, String, String> HICRHIIIOCRIIHOOCCHIRCCOHHHORC;
   private final List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> OOHROOHRHICIRCHRHRHHOCRCCHICIR;
   private final Set<String> CRHORICHRRCRHOOHHCRROORIRRIRRI;
   private final IIHRRHORCRCROCHHOHORCHCROCIHRO RRHCRCRHIICRHIICIIROHCHCCRHHIO;
   @Nullable
   private Path OCIICOCICCCHRCRCOHRRIIOHOCHROO;
   private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHIHIHHCORHIIRHICOHCHCICHCOHRR = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(List<CORCOCICIRIOHROHROIIOOHICCHCRR> var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2, ClassLoader var3) {
      if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Creating pipeline for " + var1);
      }

      this.ROOHRIHHIHICIHIIHICRRHRRRCHORI = var1;
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Must provide at least one InjectStage");
      }

      this.CHRROROOCORIOIRRRIOHHHRICCRRIH = new ConcurrentHashMap<>();
      this.RIIORHCOICOROICIHIIRCOHIORORIO = new ConcurrentHashMap<>();
      this.IRRICOHHCICOIOIRHOCCICHHIRICIO = var2;
      this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO = CRHHOOCRCOHHRHOOOCHCROOHIOOCOH.HIOIRRRCICRRRHRHHRHCCCCRRHORIO();
      this.HICRHIIIOCRIIHOOCCHIRCCOHHHORC = CRHHOOCRCOHHRHOOOCHCROOHIOOCOH.HIOIRRRCICRRRHRHHRHCCCCRRHORIO();
      this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
      this.CRHORICHRRCRHOOHHCRROORIRRIRRI = new HashSet<>();
      this.OOHROOHRHICIRCHRHRHHOCRCCHICIR = new ArrayList<>();
      this.RRHCRCRHIICRHIICIIROHCHCCRHHIO = new IIHRRHORCRCROCHHOHORCHCROCIHRO();
      long var4 = System.currentTimeMillis();
      this.IROIICIIRCORICCHCCRRORCCORHOIC = var3;
      if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("attempting to load IchorModules using " + var3);
      }

      Iterator var6 = ServiceLoader.load(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class, var3).iterator();
      ArrayList var7 = new ArrayList();
      var6.forEachRemaining(var7::add);
      Collections.sort(var7);
      var7.forEach(var1x -> {
         if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
            CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("found IchorModule " + var1x.getClass().getName());
         }

         this.CRHORICHRRCRHOOHHCRROORIRRIRRI.add(var1x.getClass().getName());
         this.CHRROROOCORIOIRRRIOHHHRICCRRIH.put(var1x.getId(), var1x);

         for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3x : var1x.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this)) {
            this.CRHORICHRRCRHOOHHCRROORIRRIRRI.add(var3x.getClass().getName());
            this.OOHROOHRHICIRCHRHRHHOCRCCHICIR.add(var3x);
         }

         Map var4x = var1x.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this);
         if (var4x != null) {
            this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO.row(var1x.getId()).putAll(var4x);
         }
      });
      if (HOCHROOCRIRCRIORCOCIHICRIIIIHH && this.CHRROROOCORIOIRRRIOHHHRICCRRIH.isEmpty()) {
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR,
            "Couldn't find any IchorModules on the classpath! This is likely a fatal error."
         );
      }

      this.OOHROOHRHICIRCHRHRHHOCRCCHICIR.forEach(var1x -> var1x.loadIchor(this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR));
      this.IOCHHHHCCOOHCROOIHHCCCHCORHHHC();
      if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
         long var8 = System.currentTimeMillis() - var4;
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info(
            "Found " + this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO.size() + " external files and " + this.OOHROOHRHICIRCHRHRHHOCRCCHICIR.size() + " IchorLoaders."
         );
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Done creating IchorPipeline in " + var8 + "ms.");
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      this.CRHORICHRRCRHOOHHCRROORIRRIRRI.add(var1.getClass().getName());
      this.OOHROOHRHICIRCHRHRHHOCRCCHICIR.add(var1);
      var1.loadIchor(this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR);
   }

   private void IOCHHHHCCOOHCROOIHHCCCHCORHHHC() {
      for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 : this.OOHROOHRHICIRCHRHRHHOCRCCHICIR) {
         if (var2 instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3) {
            for (JsonObject var6 : var3.CRRRICCRROCOHHOHIICIHORCOORRRH(this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR)) {
               try {
                  JsonElement var7 = var6.get("mappings");
                  if (var7 != null) {
                     JsonObject var8 = var7.getAsJsonObject();

                     for (String var10 : var8.keySet()) {
                        JsonElement var11 = var8.get(var10);
                        if (var11 != null) {
                           JsonObject var12 = var11.getAsJsonObject();

                           for (String var14 : var12.keySet()) {
                              String var15 = var12.get(var14).getAsString();
                              this.HICRHIIIOCRIIHOOCCHIRCCOHHHORC.put(var10, var14, var15);
                           }
                        }
                     }
                  }
               } catch (Exception var16) {
                  CHOCCCRCHIOCCOOICCOHOOIHROHIHI.warn("Failed reading refmap json from %s: %s %s", var3.getId(), var16.getClass().getName(), var16.getMessage());
               }
            }
         }
      }
   }

   public IRRCCOICORICIHCHRHIHIHROIRHOCR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, @Nullable byte[] var2, ClassLoader var3) {
      try {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, null, null);
      } catch (Throwable var5) {
         throw var5;
      }
   }

   public IRRCCOICORICIHCHRHIHIHROIRHOCR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, @Nullable byte[] var2, ClassLoader var3, @Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var4, @Nullable CORCOCICIRIOHROHROIIOOHICCHCRR var5
   ) {
      try {
         if (var1.endsWith("module-info")) {
            return new IRRCCOICORICIHCHRHIHIHROIRHOCR(var1, var2);
         }

         this.CORCOCICIRIOHROHROIIOOHICCHCRR(var3);
         long var6 = System.currentTimeMillis();
         String var8 = var1;
         HashSet var9 = new HashSet();
         var9.add(var8);
         List var10 = this.ROOHRIHHIHICIHIIHICRRHRRRCHORI;
         if (var4 != null) {
            int var11 = var10.indexOf(var4);
            if (var11 != -1 && var11 != var10.size() - 1) {
               var10 = var10.subList(var11 + 1, var10.size());
            }
         }

         if (var5 != null) {
            int var22 = var10.indexOf(var5);
            if (var22 != -1) {
               var10 = var10.subList(0, var22 + 1);
            }
         }

         for (int var23 = var10.size() - 1; var23 >= 0; var23--) {
            CORCOCICIRIOHROHROIIOOHICCHCRR var12 = (CORCOCICIRIOHROHROIIOOHICCHCRR)var10.get(var23);
            var8 = this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var12, var8);
            var9.add(var8);
         }

         for (CORCOCICIRIOHROHROIIOOHICCHCRR var26 : var10) {
            HashSet var13 = new HashSet();

            for (String var15 : var9) {
               var13.add(this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var26, var15));
            }

            var9.addAll(var13);
         }

         int var25 = 0;
         String var27 = var8;
         byte[] var29 = var2;
         Optional var30 = this.IRRICOHHCICOIOIRHOCCICHHIRICIO.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var9);
         if (var30.isPresent()) {
            com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var31 = (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var30.get();
            var25 = var10.indexOf(var31.RCRIHIICHHIHHRIIROHORHHICCOOOO()) + 1;
            var27 = var31.className();
            var29 = var31.RIHCHIRRIHRROCIHICHIORICCOOCHH();
         }

         if (var29 == null) {
            Function var32;
            if (var3 instanceof RIROICHCRROROHCCROOCCCCOCHCCRI var16) {
               var32 = var16::HOHOICCIHCHHOCRCIRRHRROCRCCRCH;
            } else {
               var32 = var3::getResourceAsStream;
            }

            InputStream var34 = (InputStream)var32.apply(var8.replace('.', '/').concat(".class"));
            if (var34 == null) {
               var34 = (InputStream)var32.apply(var1.replace('.', '/').concat(".class"));
            }

            if (var34 == null) {
               for (String var18 : var9) {
                  var34 = (InputStream)var32.apply(var18.replace('.', '/').concat(".class"));
                  if (var34 != null) {
                     break;
                  }
               }
            }

            if (var34 == null) {
               for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var40 : this.OOHROOHRHICIRCHRHRHHOCRCCHICIR) {
                  if (var40 instanceof ClassProvider var19) {
                     var29 = var19.get(var8.replace('.', '/'));
                     if (var29 != null) {
                        break;
                     }
                  }
               }
            }

            if (var29 == null && var34 != null) {
               var29 = var34.readAllBytes();
               var34.close();
            }
         }

         com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH var33 = null;
         if (var29 != null) {
            var33 = new com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH(var29);
         }

         CORCOCICIRIOHROHROIIOOHICCHCRR[] var35 = new CORCOCICIRIOHROHROIIOOHICCHCRR[var10.size() - var25];

         for (int var37 = var25; var37 < var10.size(); var37++) {
            var35[var37 - var25] = (CORCOCICIRIOHROHROIIOOHICCHCRR)var10.get(var37);
         }

         if (var33 == null || !var1.startsWith("org.spongepowered.asm.mixin.") && !var1.startsWith("com.llamalad7.mixinextras.") && !var1.startsWith("kotlin.")
            )
          {
            try {
               var33 = this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var35, var3, true, var27, var33);
            } catch (Throwable var20) {
               throw new FatalIchorError("Failed to transform " + var1, var20);
            }
         }

         if (var33 != null && !var33.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
            var33.CIHCCCOIHHCIOCIOCORRIHROROIIOI(0);
         }

         if (var33 != null) {
            var29 = this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var35[var35.length - 1], var3, var33.getClassNode(), var5 == null);
         }

         if (var29 == null) {
            String var39 = var1;
            if (!var8.equals(var1)) {
               var39 = var8 + "(" + var1 + ")";
            }

            throw new ClassNotFoundException("IchorPipeline can't find class in " + var3.getName() + ": " + var39);
         } else {
            var27 = var33.getClassNode().name.replace('/', '.');
            long var38 = System.currentTimeMillis() - var6;
            if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
               this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.RIIRIIHOROCOCHIRHIIROHRHOHHCHH.put(var27, var38);
            }

            return new IRRCCOICORICIHCHRHIHIHROIRHOCR(var27, var29);
         }
      } catch (Throwable var21) {
         throw var21;
      }
   }

   public void HHCCOOHOOHRCRHHCRRHIHCROOCHOCI() {
      if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("========= Debugging class transformation times =========");
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info(
            "Time since IchorPipeline init: " + (System.currentTimeMillis() - this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.CICHORHROOOHCROCORHICOOHIIHOII) + "ms"
         );
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info(
            "Time spent in IchorClassLoader.getTransformedClass(): " + this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.COCIIROHIIIHCIRCIIHOCIOIROHRRR.get() + "ms"
         );
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info(
            "Time spent in IchorClassLoader.getTransformedClass() on the main thread: "
               + this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.ORRHHIOCIORRROIHROCROCIROOIRCC.get()
               + "ms"
         );
         long var1 = this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.RIIRIIHOROCOCHIRHIIROHRHOHHCHH.values().stream().mapToLong(var0 -> var0).sum();
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("classes: " + var1 + "ms");
         this.RHIHIHHCORHIIRHICOHCHCICHCOHRR
            .RIIRIIHOROCOCHIRHIIROHRHOHHCHH
            .entrySet()
            .stream()
            .sorted(Entry.<String, Long>comparingByValue().reversed())
            .limit(5L)
            .forEach(var1x -> {
               long var2 = this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.CIICOHCCHCCICCRRORHOIICCHHIRRH.getOrDefault(var1x.getKey(), 0L);
               CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("- " + var1x.getKey() + ": " + var1x.getValue() + "ms" + (var2 > 0L ? " (mixin: " + var2 + "ms)" : ""));
            });
         HashMap var3 = new HashMap();
         this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.RIIRIIHOROCOCHIRHIIROHRHOHHCHH.forEach((var1x, var2) -> {
            StringBuilder var3x;
            if (var1x.contains(".")) {
               String[] var4x = var1x.split("\\.");
               var3x = new StringBuilder(var4x[0]);

               for (int var5 = 1; var5 < Math.min(2, var4x.length - 1); var5++) {
                  var3x.append(".").append(var4x[var5]);
               }
            } else {
               var3x = new StringBuilder(var1x);
            }

            var3.merge(var3x.toString(), var2, Long::sum);
         });
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("packages:");
         var3.entrySet()
            .stream()
            .sorted(Entry.comparingByValue().reversed())
            .limit(10L)
            .forEach(var0 -> CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("- " + (String)var0.getKey() + ": " + var0.getValue() + "ms"));
         long var4 = this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.CRIOIRIORRCIRHROOCIIIOOCROHHCC.values().stream().mapToLong(var0 -> var0).sum();
         if (var4 > 2000L) {
            CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("remapping: " + var4 + "ms");
            this.RHIHIHHCORHIIRHICOHCHCICHCOHRR
               .CRIOIRIORRCIRHROOCIIIOOCROHHCC
               .entrySet()
               .stream()
               .sorted(Entry.<String, Long>comparingByValue().reversed())
               .limit(15L)
               .forEach(var0 -> CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("- " + var0.getKey() + ": " + var0.getValue() + "ms"));
         }

         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("nectar timings:");
         this.RHIHIHHCORHIIRHICOHCHCICHCOHRR
            .CORORRIICIRHIOCHIIOOICCCORCHCR
            .entrySet()
            .stream()
            .sorted(Entry.<String, Long>comparingByValue().reversed())
            .limit(10L)
            .filter(var0 -> var0.getValue() > 200L)
            .forEach(var0 -> CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("- " + var0.getKey() + ": " + var0.getValue() + "ms"));
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("nectar matches:");
         this.RHIHIHHCORHIIRHICOHCHCICHCOHRR
            .OROICIOHCCCCRIHIHIOOIHORIIHIRR
            .entrySet()
            .stream()
            .sorted(Entry.<String, Long>comparingByValue().reversed())
            .limit(10L)
            .filter(var0 -> var0.getValue() > 500L)
            .forEach(var0 -> CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("- " + var0.getKey() + ": " + var0.getValue()));
         CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("========================================================");
      }
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, @Nullable byte[] var2, ClassLoader var3
   ) {
      com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var2
      );

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var6 : this.ROOHRIHHIHICIHIIHICRRHRRRCHORI) {
         var4 = this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var3, var4);
      }

      return var4;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var1, Path var2, ClassLoader var3) {
      try {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            var2,
            (var3x, var4) -> {
               String var5x = var3x.replace('.', '/').concat(".class");
               com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var5x, var4, var3
               );
               String var7 = var6.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO().replace(".class", "").replace('/', '.');

               IRRCCOICORICIHCHRHIHIHROIRHOCR var8;
               try {
                  var8 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var6.CIIRICRCHCORHRIOHCHHCOHCOROIOR(), var3);
               } catch (Throwable var11) {
                  CHOCCCRCHIOCCOOICCOHOOIHROHIHI.warn("Failed to transform " + var7 + " from " + var1 + ": " + var11.getMessage());
                  var8 = new IRRCCOICORICIHCHRHIHIHROIRHOCR(var7, var4);
               }

               IRRCCOICORICIHCHRHIHIHROIRHOCR var9 = var8;
               String var10 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOIOHIORIROHRRCOOOHCROHORCOIIH(
                     var8.RIHCHIRRIHRROCIHICHIORICCOOCHH()
                  )
                  .orElseGet(
                     () -> this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.IOICIHIIHIOIROHCHROROHRIRHIHIH().get(0), var9.className())
                  );
               return new IRRCCOICORICIHCHRHIHIHROIRHOCR(var10, var8.RIHCHIRRIHRROCIHICHIORICCOOCHH());
            }
         );
      } catch (IOException var5) {
         throw var5;
      }
   }

   public Optional<com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this.ICRROHROHHOHRRRIIHORIRICHRCOIC().CCIHOOIRHRHHHCRCIHOCHICHRROCRO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   public Optional<MappingSet> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      Function<Reader, MappingsReader> var2
   ) {
      return this.ICRROHROHHOHRRRIIHORIRICHRCOIC()
         .CCIHOOIRHRHHHCRCIHOCHICHRROCRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1)
         .map(
            var2x -> {
               MappingsReader var3 = (MappingsReader)var2.apply(
                  new InputStreamReader(new ByteArrayInputStream(var2x.RIHHCROROROHHROICCIRHOICCOOIHC()), StandardCharsets.UTF_8)
               );

               try {
                  MappingSet var4 = var3.read();
                  var3.close();
                  return var4;
               } catch (IOException var6) {
                  throw new FatalIchorError("Failed to parse mappings from " + var1.OIHOOHOHHOICRIOOCICCHCHHOROCIH(), var6);
               }
            }
         );
   }

   public Optional<MappingSet> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return this.ICRROHROHHOHRRRIIHORIRICHRCOIC()
         .CCIHOOIRHRHHHCRCIHOCHICHRROCRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1)
         .map(
            var1x -> {
               try (MappingsReader var2 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRORROHOCCHCICCCRIRCHRHROCIIC
                     .createReader(new ByteArrayInputStream(var1x.RIHHCROROROHHROICCIRHOICCOOIHC()))) {
                  return var2.read();
               } catch (IOException var7) {
                  throw new FatalIchorError("Failed to parse mappings from " + var1.OIHOOHOHHOICRIOOCICCHCHHOROCIH(), var7);
               }
            }
         );
   }

   public Optional<Path> OHIROHHCCHRIIORCHRCOIICOHOOCOO(String var1) {
      return this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO.column(var1).values().stream().findAny().flatMap(this::HROHRRCRRHOIRHIRICOOROHRRRORIH);
   }

   public Optional<Path> HROHRRCRRHOIRHIRICOOROHRRRORIH(String var1) {
      try {
         Path var2 = this.IRRICOHHCICOIOIRHOCCICHHIRICIO.classpathDir();
         Path var3 = this.IRRICOHHCICOIOIRHOCCICHHIRICIO.overridesDir();
         boolean var4 = var3 != null;
         Path var5 = null;
         if (var1.startsWith("absolute::")) {
            var5 = Paths.get(var1.substring("absolute::".length()));
         } else if (var1.endsWith(".jar")) {
            if (var4) {
               var5 = var3.resolve(var1);
               if (Files.notExists(var5)) {
                  var5 = var2.resolve(var1);
               }
            } else {
               var5 = var2.resolve(var1);
            }
         } else {
            var5 = this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2);
            if (var4) {
               Path var6 = this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var3);
               if (var6 != null) {
                  var5 = var6;
               }
            }
         }

         return Optional.ofNullable(var5);
      } catch (Throwable var7) {
         throw var7;
      }
   }

   private Path CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, Path var2) {
      try {
         Path var3 = null;

         try (Stream var4 = Files.list(var2)) {
            Optional var5 = var4.filter(var1x -> var1x.getFileName().toString().startsWith(var1)).filter(var1x -> {
               boolean var2x = this.IRRICOHHCICOIOIRHOCCICHHIRICIO.HCRHCROHCRHIHICHCCOCCOCHIHCOCC() == null;
               String var3x = var1x.getFileName().toString();
               return var2x || this.IRRICOHHCICOIOIRHOCCICHHIRICIO.HCRHCROHCRHIHICHCCOCCOCHIHCOCC().contains(var3x);
            }).findFirst();
            if (var5.isPresent()) {
               var3 = (Path)var5.get();
            }
         }

         return var3;
      } catch (Throwable var9) {
         throw var9;
      }
   }

   public Collection<Path> ICHCRHCIRCHCRIIHHCICIROCOOCHRC() {
      return this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO
         .values()
         .stream()
         .sorted()
         .map(this::HROHRRCRRHOIRHIRICOOROHRRRORIH)
         .flatMap(Optional::stream)
         .collect(Collectors.toList());
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH IOHOCCRORRHOHRROHCIHIIROIHRHOO(String var1) {
      return this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO
         .column(var1)
         .keySet()
         .stream()
         .findAny()
         .flatMap(this::CHIOCHOIHHHCHOIHHIIHIOHCRHRIII)
         .orElseThrow(() -> new IllegalArgumentException("No module found for file key " + var1));
   }

   public List<JsonObject> HHIIOCCROIROHIOCOIIHHCORRICOIH() {
      ArrayList var1 = new ArrayList();

      for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 : this.OOHROOHRHICIRCHRHRHHOCRCCHICIR) {
         if (var3 instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4) {
            var1.addAll(var4.CRRRICCRROCOHHOHIICIHORCOORRRH(this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR));
         }
      }

      return var1;
   }

   public String HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(String var1, String var2) {
      String var3 = this.HICRHIIIOCRIIHOOCCHIRCCOHHHORC.get(var1, var2);
      return var3 == null ? var2 : var3;
   }

   public Stream<com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> OICHHOCICHCIIOCHRIIRRHRHRIIIIR() {
      return this.OOHROOHRHICIRCHRHRHHOCRCCHICIR
         .stream()
         .filter(var0 -> var0 instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)
         .map(var0 -> (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var0);
   }

   public <T extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> Optional<T> OOCHRIIIRIHRRCRIORHCROIIHCRRIC(Class<T> var1) {
      return this.OOHROOHRHICIRCHRHRHHOCRCCHICIR.stream().filter(var1::isInstance).map(var1::cast).findFirst();
   }

   public <T extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI & com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<T> var1, MappingSet var2, ClassProvider var3
   ) {
      this.<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI>OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var1)
         .ifPresent(
            var2x -> ((com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var2x)
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3)
         );
   }

   public boolean hasModule(String var1) {
      return this.CHRROROOCORIOIRRRIOHHHRICCRRIH.containsKey(var1);
   }

   public Optional<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> CHIOCHOIHHHCHOIHHIIHIOHCRHRIII(String var1) {
      return Optional.ofNullable(this.CHRROROOCORIOIRRRIOHHHRICCRRIH.get(var1));
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(ClassLoader var1) {
      if (this.RHCHHCOIIHCICIHICRIHOIOHRRIIIR != var1) {
         if (this.RHCHHCOIIHCICIHICRIHOIOHRRIIIR != null) {
            CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Switching running ClassLoader from " + this.RHCHHCOIIHCICIHICRIHOIOHRRIIIR.getName() + " to " + var1.getName());
         }

         this.RHCHHCOIIHCICIHICRIHOIOHRRIIIR = var1;
         if (var1 instanceof com.moonsworth.lunar.ichor.api.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
            var2.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(this.CRHORICHRRCRHOOHHCRROORIRRIRRI);
         }
      }
   }

   @Override
   public void close() {
      this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.close();
      this.RIIORHCOICOROICIHIIRCOHIORORIO.clear();
      this.CHRROROOCORIOIRRRIOHHHRICCRRIH.clear();
      this.OOHROOHRHICIRCHRHRHHOCRCCHICIR.clear();
      this.CRHORICHRRCRHOOHHCRROORIRRIRRI.clear();
      this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO.clear();
      if (HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
         this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.HCOROIOCROCRHOIHORRHOCOHORRHHI.clear();
      }
   }

   public Set<String> CRICCOOHHHCHOORCICOCOHIHOIRHOO(ClassLoader var1) {
      this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      return this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR
         .CRHHRIRORCRRIIRCRIOICHIRHRIROR()
         .stream()
         .filter(var0 -> var0.OCOIIRHCCOOHRHHCOCHIHIICRORRHR().hasMixinRuntime())
         .flatMap(var0 -> var0.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().getMixinAndTargetClasses().stream())
         .collect(Collectors.toSet());
   }

   public Set<String> getSyntheticClasses() {
      HashSet var1 = new HashSet();

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.CRHHRIRORCRRIIRCRIOICHIRHRIROR()) {
         if (var3.OCOIIRHCCOOHRHHCOCHIHIICRORRHR().hasMixinRuntime()) {
            var1.addAll(var3.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().getSyntheticClasses());
         }
      }

      return var1;
   }

   public Map<String, byte[]> getExtraClassDefinitions() {
      HashMap var1 = new HashMap();

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.CRHHRIRORCRRIIRCRIOICHIRHRIROR()) {
         if (var3.OCOIIRHCCOOHRHHCOCHIHIICRORRHR().hasMixinRuntime()) {
            var1.putAll(var3.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().getExtraClassDefinitions());
         }
      }

      return var1;
   }

   public void OICHHOHCIHROHHCRCIICIIRRCCICIH() {
      this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.CRHHHCCRHHIRCIOOCICIRIOCROIIIH.set(true);

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var2 : this.IOICIHIIHIOIROHCHROROHRIRHIHIH()) {
         if (var2.hasMixinRuntime()) {
            this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.OHHOHCOHHOICOROCHRIIOOORHICIIO.add(var2);
         }
      }

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR.CRHHRIRORCRRIIRCRIOICHIRHRIROR()) {
         var4.ORCRORCORHRHRCHHIOIIICRCHCIHIH = true;
      }
   }

   public Set<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassLoader var1, Path var2) {
      Set var3 = this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1);
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3);

      for (Path var5 : this.ICHCRHCIRCHCRIIHHCICIROCOOCHRC()) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3);
      }

      return var3;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH ORIHOCRRHHCCOIHICIOHCIOCIIHOOO(Object var1) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var2 = this.RIIORHCOICOROICIHIIRCOHIORORIO.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException(var1.toString() + " isn't an instance of an Ichor injection!");
      } else {
         return var2;
      }
   }

   @Nullable
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR OIORROROOROHHRIIORIHHHOCIIHRRC(String var1) {
      return !HOCHROOCRIRCRIORCOCIHICRIIIIHH ? null : this.RHIHIHHCORHIIRHICOHCHCICHCOHRR.HCOROIOCROCRHOIHORRHOCOHORRHHI.get(var1);
   }

   @Generated
   public ClassLoader HRHCHHIIOIIRROOHOHCCRHOIHOCOCC() {
      return this.IROIICIIRCORICCHCCRRORCCORHOIC;
   }

   @Nullable
   @Generated
   public ClassLoader HCCHROOOCOOCRORRORIRIHIHCCHIIH() {
      return this.RHCHHCOIIHCICIHICRIHOIOHRRIIIR;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO CHIOHRROCCRCCHHCCRRHCROOOICCOI() {
      return this.IIHHOHHIHOCRHCIOCRHIRIRROOOHCR;
   }

   @Generated
   public Map<String, HRCHROOHRIHCRCRHRIIROCIRHOIRHH> HCCIOOOIRIRHCOHOIRCHIIOHCRRIIR() {
      return this.CHRROROOCORIOIRRRIOHHHRICCRRIH;
   }

   @Generated
   public Map<Object, CRRRICCRROCOHHOHIICIHORCOORRRH> HRCIICIHHICHORROOIRRRORIHRHRIR() {
      return this.RIIORHCOICOROICIHIIRCOHIORORIO;
   }

   @Generated
   public List<CORCOCICIRIOHROHROIIOOHICCHCRR> IOICIHIIHIOIROHCHROROHRIRHIHIH() {
      return this.ROOHRIHHIHICIHIIHICRRHRRRCHORI;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH ICRROHROHHOHRRRIIHORIRICHRCOIC() {
      return this.IRRICOHHCICOIOIRHOCCICHHIRICIO;
   }

   @Generated
   public RCCICOCCCHROHOCCHIHORIHHCOHOHH<String, String, String> HROOHHOHOIRRRCRHCORCRHORRIOIIR() {
      return this.RRHIHCRCROOIHIOOICCCRCCHHCHHOO;
   }

   @Generated
   public List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> OICRIROHIORCRHOCCRIIRHHRCOIHII() {
      return this.OOHROOHRHICIRCHRHRHHOCRCCHICIR;
   }

   @Generated
   public Set<String> RCIRRRCCRHRCICHOIORCHHHORCRHRC() {
      return this.CRHORICHRRCRHOOHHCRROORIRRIRRI;
   }

   @Generated
   public IIHRRHORCRCROCHHOHORCHCROCIHRO CCHORCOOOCRRRHHCRCRRCIHIICICCH() {
      return this.RRHCRCRHIICRHIICIIROHCHCCRHHIO;
   }

   @Nullable
   @Generated
   public Path OIHCRHOORHCHRCOIRHIIROROCHIOOO() {
      return this.OCIICOCICCCHRCRCOHRRIIOHOCHROO;
   }

   @Generated
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICRRROORIRORIHIOHCRCIIIHOORCIO() {
      return this.RHIHIHHCORHIIRHICOHCHCICHCOHRR;
   }

   @Generated
   public void ORHIOICIOCRRHOOCOHRORIHICHRCRR(@Nullable Path var1) {
      this.OCIICOCICCCHRCRCOHRRIIOHOCHROO = var1;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      @Nullable
      private final Map<String, Long> CORORRIICIRHIOCHIIOOICCCORCHCR = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH
         ? new ConcurrentHashMap<>()
         : null;
      @Nullable
      private final Map<String, Long> OROICIOHCCCCRIHIHIOOIHORIIHIRR = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH
         ? new ConcurrentHashMap<>()
         : null;
      @Nullable
      private final Map<String, Long> RIIRIIHOROCOCHIRHIIROHRHOHHCHH = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH
         ? new ConcurrentHashMap<>()
         : null;
      @Nullable
      public final Map<String, Long> CIICOHCCHCCICCRRORHOIICCHHIRRH = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH
         ? new ConcurrentHashMap<>()
         : null;
      @Nullable
      public final Map<String, Long> CRIOIRIORRCIRHROOCIIIOOCROHHCC = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH
         ? new ConcurrentHashMap<>()
         : null;
      @Nullable
      private final Map<String, CIOHHCORHRCCRICCCORIHCRHCCCRRR> HCOROIOCROCRHOIHORRHOCOHORRHHI = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH
         ? new ConcurrentHashMap<>()
         : null;
      final AtomicLong COCIIROHIIIHCIRCIIHOCIOIROHRRR = new AtomicLong(0L);
      final AtomicLong ORRHHIOCIORRROIHROCROCIROOIRCC = new AtomicLong(0L);
      private final long CICHORHROOOHCROCORHICOOHIIHOII = System.currentTimeMillis();

      @Nullable
      @Generated
      public Map<String, Long> IIRRHIIHRORCRCOHRHIIRRIOHCIHRO() {
         return this.CORORRIICIRHIOCHIIOOICCCORCHCR;
      }

      @Nullable
      @Generated
      public Map<String, Long> CROORIIHCOICHOHHHHROCCCIORCIHO() {
         return this.OROICIOHCCCCRIHIHIOOIHORIIHIRR;
      }

      @Nullable
      @Generated
      public Map<String, Long> CIRRRIHCICHOROHOOCRCIRRHICROHO() {
         return this.RIIRIIHOROCOCHIRHIIROHRHOHHCHH;
      }

      @Nullable
      @Generated
      public Map<String, Long> HOCHOIHCRIRICHHHICIHHCICOIOROO() {
         return this.CIICOHCCHCCICCRRORHOIICCHHIRRH;
      }

      @Nullable
      @Generated
      public Map<String, Long> COCORIORRHHOICHOHCHOCOIRCCOHRC() {
         return this.CRIOIRIORRCIRHROOCIIIOOCROHHCC;
      }

      @Nullable
      @Generated
      public Map<String, CIOHHCORHRCCRICCCORIHCRHCCCRRR> HHHIICIIIIORHIIRCOCCOICRIORIIR() {
         return this.HCOROIOCROCRHOIHORRHOCOHORRHHI;
      }

      @Generated
      public AtomicLong RORCHCCIROICCHIIIRCCORRHIIOIHO() {
         return this.COCIIROHIIIHCIRCIIHOCIOIROHRRR;
      }

      @Generated
      public AtomicLong HHRIOOIIICOIOHROHCIIRRRHRIRHOR() {
         return this.ORRHHIOCIORRROIHROCROCIROOIRCC;
      }

      @Generated
      public long OHROOIOHHHHOOHHHOIRCIOIROIHHCC() {
         return this.CICHORHROOOHCROCORHICOOHIIHOII;
      }
   }
}
