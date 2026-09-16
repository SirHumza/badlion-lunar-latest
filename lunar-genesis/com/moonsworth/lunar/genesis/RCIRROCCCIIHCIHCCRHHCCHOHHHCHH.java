package com.moonsworth.lunar.genesis;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.ichor.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.jctools.queues.MpmcUnboundedXaddArrayQueue;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final OCOHORHCROHICRRIHCIHHRRCIHICRI OIHIRCICHOOCHCRCCRIIHCCRRHRIHH = new OCOHORHCROHICRRIHCIHHRRCIHICRI("Genesis/Baker")
      .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(Paths.get(".ichor/genesis.log"));
   static final boolean CCHRRIRRHCOHIHCCRCOIIOOHORIICO = Boolean.parseBoolean(System.getProperty("ichor.debugBakedClasses", "false"))
      || Boolean.parseBoolean(System.getProperty("ichor.debugPrebakedClasses", "false"));

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, CRRRICCRROCOHHOHIICIHORCOORRRH var1, Path var2, Map<String, byte[]> var3, CORCOCICIRIOHROHROIIOOHICCHCRR var4
   ) {
      try {
         if (!Files.exists(var2)) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2, var3, var4);
         } else {
            try (ZipFile var5 = new ZipFile(var2.toFile())) {
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Found class cache: " + var2);
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Loading baked classes...");
               Enumeration var6 = var5.entries();
               long var7 = System.nanoTime();

               while (var6.hasMoreElements()) {
                  ZipEntry var9 = (ZipEntry)var6.nextElement();
                  String var10 = var9.getName();
                  byte[] var11 = var5.getInputStream(var9).readAllBytes();
                  if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
                     OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Loading baked class " + var10 + " @ " + var11.length + " bytes");
                  }

                  var3.put(var10, var11);
               }

               long var18 = System.nanoTime();
               double var19 = (double)(var18 - var7) / Duration.ofSeconds(1L).toNanos();
               System.out.printf("Loaded baked classes in %.2f seconds \n", var19);
               if (var4 != null && var0.ICRROHROHHOHRRRIIHORIRICHRCOIC().RCOIIICIOOHRICOHOOCIOOOIRORCCC() != null) {
                  com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13 = new com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var4, var3, var0x -> true
                  );
                  var0.ICRROHROHHOHRRRIIHORIRICHRCOIC().RCOIIICIOOHRICOHOOCIOOOIRORCCC().add(var13);
               }

               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Loaded " + var3.size() + " baked classes.");
               if (var4 == null) {
                  var0.OICHHOHCIHROHHCRCIICIIRRCCICIH();
               }
            } catch (ZipException var16) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2, var3, var4);
            }
         }
      } catch (Throwable var17) {
         throw var17;
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, CRRRICCRROCOHHOHIICIHORCOORRRH var1, Path var2, Map<String, byte[]> var3, CORCOCICIRIOHROHROIIOOHICCHCRR var4
   ) {
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
         var0.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
      );
      OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Missing class cache: " + var2);
      OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Baking classes...");
      var1.CRCROIRHOCHHROOORCOIHHIOHRIHHI();
      long var6 = System.currentTimeMillis();
      System.out.println("LUNARCLIENT_STATUS_BUILD_CACHE");
      MpmcUnboundedXaddArrayQueue var8 = new MpmcUnboundedXaddArrayQueue(100, 4);
      Set var9 = var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5.OHCCHOHCCIIHCOHHHHOHHOCRCCROOH());
      if (var9.isEmpty()) {
         throw new IllegalStateException("No bake candidates found?? There are probably missing jars.");
      }

      for (String var11 : var9) {
         String var12 = var1.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var11);
         if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
            if (var11.equals(var12)) {
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Baking " + var11);
            } else {
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Baking " + var11 + " -> " + var12);
            }
         }

         var8.offer(var12);
      }

      int var21 = var9.size();
      OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Found " + var21 + " classes to bake.");
      AtomicLong var22 = new AtomicLong();
      KeySetView var23 = ConcurrentHashMap.newKeySet();
      Consumer var13 = var8x -> {
         String var9x = var8x.replace('/', '.');
         if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
            OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("[" + Thread.currentThread().getName() + "] Handling " + var8x);
         }

         if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9x) && var23.add(var8x)) {
            if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("[" + Thread.currentThread().getName() + "] Baking " + var8x + " (" + var3.size() + ")");
            }

            try {
               CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18x = var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                  var8x, () -> var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8x, null, var1, null, var4)
               );
               if (!var18x.IORCHRRRROIRROCROCHIRHIHCOHRIC()) {
                  if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
                     OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info(
                        "[" + Thread.currentThread().getName() + "] Baking " + var8x + " already baked by the game classloader"
                     );
                  }

                  return;
               }

               IRRCCOICORICIHCHRHIHIHROIRHOCR var11x = var18x.IROOIICIRHCIIHROROHIORIIOOOICC();
               byte[] var12x = var11x.RIHCHIRRIHRROCIHICHIORICCOOCHH();
               if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO && var12x == null) {
                  OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("[" + Thread.currentThread().getName() + "] Baking " + var8x + " returned null bytes");
               }

               int var13x = var3.size();
               if (var13x % 25 == 0) {
                  long var14x = System.currentTimeMillis();
                  if (var14x - var22.get() >= 1000L) {
                     var22.set(var14x);
                     float var16x = var21 + var8.size();
                     System.out.println("LUNARCLIENT_BAKE_PROGRESS " + Math.min(var13x / var16x * 100.0F, 100.0F));
                  }
               }

               for (String var20x : com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(var12x)) {
                  var20x = var1.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var20x);
                  if (!var23.contains(var20x) && !var3.containsKey(var20x) && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var20x)) {
                     if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
                        OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("[" + Thread.currentThread().getName() + "] Baking : " + var8x + " offers " + var20x);
                     }

                     var8.offer(var20x);
                  }
               }
            } catch (Exception var17x) {
               if (CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
                  OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.warn("Couldn't find class bytes for " + var8x + " : " + var17x.getMessage());
               }

               if (!(var17x instanceof ClassNotFoundException)) {
                  throw var17x;
               }
            }
         } else if (var3.containsKey(var8x) && CCHRRIRRHCOHIHCCRCOIIOOHORIICO) {
            byte[] var10 = (byte[])var3.get(var8x);
            OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info(
               "[" + Thread.currentThread().getName() + "] Baking " + var8x + " already baked :" + (var10 == null ? "null" : var10.length + " bytes")
            );
         }
      };
      AtomicBoolean var14 = new AtomicBoolean(false);
      var0.CCHORCOOOCRRRHHCRCRRCIHIICICCH()
         .RRHOOOORORHHOOIHRCCHIIHHIIIIOH(
            var1x -> {
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR,
                  "Cancelling prebaking class cache because of an error in the IchorPipeline.",
                  var1x
               );
               var14.set(true);
            }
         );
      Runnable var15 = () -> {
         if (!var14.get()) {
            for (String var9x : var0.getSyntheticClasses()) {
               var13.accept(var1.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var9x));
            }

            var3.putAll(var0.getExtraClassDefinitions());
            OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.info("Baked " + var3.size() + " classes in " + (System.currentTimeMillis() - var6) + "ms.");
            TreeMap var11x = new TreeMap(var3);

            try {
               System.out.println("LUNARCLIENT_STATUS_SAVING_CACHE");
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11x, var2.toFile());
            } catch (IOException var10) {
               OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR, "Failed to write class cache: ", var10
               );
            }
         }
      };
      int var16 = Runtime.getRuntime().availableProcessors();
      ExecutorService var17 = Executors.newFixedThreadPool(var16);
      AtomicInteger var18 = new AtomicInteger(var16);
      ArrayList var19 = new ArrayList();

      for (int var20 = 0; var20 < var16; var20++) {
         var19.add(
            () -> {
               Object var5x = null;

               while (!var8.isEmpty()) {
                  if (var14.get()) {
                     return null;
                  }

                  var5x = (String)var8.relaxedPoll();
                  if (var5x != null) {
                     try {
                        var13.accept(var5x);
                     } catch (Throwable var7) {
                        OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR, "Failed to bake " + var5x + ": ", var7
                        );
                     }
                  }
               }

               if (var18.decrementAndGet() == 0) {
                  var15.run();
               }

               return null;
            }
         );
      }

      List var24 = var19.stream().map(var17::submit).toList();
      Runtime.getRuntime()
         .addShutdownHook(
            new Thread(
               () -> {
                  try {
                     for (Future var2x : var24) {
                        var2x.get();
                     }
                  } catch (InterruptedException | ExecutionException var3x) {
                     OIHIRCICHOOCHCRCCRIIHCCRRHRIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR, "Failed to write class cache: ", var3x
                     );
                  }
               }
            )
         );
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0, String var1) {
      var1 = var1.replace('/', '.');
      return com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var0.IHIRRIIORRHORHRORIHOROIRCORCOO())
         && !var0.isExcluded(var1)
         && IIHCIHRRRCCRHOOCCORIIRIICHHIRC(var1);
   }

   public static boolean IIHCIHRRRCCRHOOCCORIIRIICHHIRC(String var0) {
      if (IchorAPI.getClassCacheLevel() == null) {
         return !var0.startsWith("srg.net.optifine") && !var0.startsWith("it.unimi.dsi.fastutil");
      }

      boolean var1 = var0.startsWith("net.minecraft.") || var0.startsWith("com.mojang.") || !var0.contains(".") || var0.startsWith("com.moonsworth.");
      return var1 & var0.indexOf(36) == var0.lastIndexOf(36);
   }
}
