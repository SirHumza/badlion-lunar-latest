package com.moonsworth.lunar.ichor;

import com.moonsworth.lunar.ichor.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.ichor.util.FatalIchorError;
import com.moonsworth.lunar.ichor.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.ichor.util.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.ichor.util.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import lombok.Generated;
import org.cadixdev.lorenz.MappingSet;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements AutoCloseable {
   private static final int RCIOOHHIIROCIOICHCIRRORHOOHHRH = 250;
   private static final boolean OOHIHHRHOHIROCHRRRHRIOIOIOOHRC = Boolean.parseBoolean(System.getProperty("ichor.failOnMixinError", "true"));
   private static final String[] OOHCICRRRHOOCOOIRRRCOCRHCIRCIO = Arrays.stream(System.getProperty("ichor.dumpClasses", "").split(";"))
      .map(var0 -> var0.replace('.', '/'))
      .toArray(String[]::new);
   private static final boolean RCOIIHRHRCICHRRHRHCRORHHRHICHI = Boolean.parseBoolean(System.getProperty("ichor.markClasses", "false"));
   private static final boolean OOCCOORIIICICIOOHIOOCCHCRCHRCI = Boolean.parseBoolean(System.getProperty("ichor.testWriteNodesToBytes", "false"));
   private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR HRICOHOICHHOOOIOHHHOIIOHCOOCCO;
   private final Map<CORCOCICIRIOHROHROIIOOHICCHCRR, List<CRRRICCRROCOHHOHIICIHORCOORRRH>> IOIRRROORIHCRORHHCIHHCOOCOHHCR;
   private final Map<RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHOCICIOHHRCIORRCCOIIOICCOICHO;
   private final Map<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, WeakReference<com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> IHCCICORHRCRHOCHOOHHCHCCCIRICO;
   final Set<CORCOCICIRIOHROHROIIOOHICCHCRR> OHHOHCOHHOICOROCHRIIOOORHICIIO = Collections.newSetFromMap(new ConcurrentHashMap<>(5, 1.0F));
   final AtomicBoolean CRHHHCCRHHIRCIOOCICIRIOCROIIIH = new AtomicBoolean(false);
   private final List<com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> RCOOOOOIHORHIOHIIHCRRIOCHCORHI;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO = var1;
      this.IOIRRROORIHCRORHHCIHHCOOCOHHCR = new ConcurrentHashMap<>(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH().size());
      this.HHOCICIOHHRCIORRCCOIIOICCOICHO = new ConcurrentHashMap<>();
      this.IHCCICORHRCRHOCHOOHHCHCCCIRICO = Collections.synchronizedMap(new IOIICIRIICICIIOORHCIIIIRRIHRHI<>(250));

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var3 : this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH()) {
         this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.put(var3, new CopyOnWriteArrayList<>());
      }

      this.RCOOOOOIHORHIOHIIHCRRIOCHCORHI = new ArrayList<>();

      try {
         Path var9 = Paths.get("./.ichor/dump");
         if (Files.exists(var9)) {
            try (Stream var10 = Files.walk(var9)) {
               var10.forEach(var0 -> {
                  try {
                     Files.deleteIfExists(var0);
                  } catch (IOException var2) {
                  }
               });
            }
         }
      } catch (IOException var8) {
      }
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.RCIRRRCCRHRCICHOIORCHHHORCRHRC().add(var1.getClass().getName());
      CRRRICCRROCOHHOHIICIHORCOORRRH var2 = new CRRRICCRROCOHHOHIICIHORCOORRRH(var1, this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO);

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var6 : var1.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH()) {
         List var7 = this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.get(var6);
         if (var7 != null) {
            var7.add(var2);
         }
      }

      return var2;
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(ClassLoader var1) {
      if (!this.CRHHHCCRHHIRCIOOCICIRIOCROIIIH.get()) {
         this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
      }
   }

   private synchronized void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ClassLoader var1) {
      if (!this.CRHHHCCRHHIRCIOOCICIRIOCROIIIH.getAndSet(true)) {
         long var2 = System.currentTimeMillis();
         long var4 = System.currentTimeMillis();

         for (CORCOCICIRIOHROHROIIOOHICCHCRR var7 : this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH()) {
            if (var7.hasMixinRuntime()) {
               RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var7, var1
               );
               com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this.HHOCICIOHHRCIORRCCOIIOICCOICHO
                  .computeIfAbsent(var8, var3 -> new com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var7, var1));
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Loading Mixin runtime for " + var7);
               var9.OHORIHRHRROOOCRCHOCORRHCRCRIHH();
            }
         }

         long var13 = System.currentTimeMillis() - var4;
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Done loading Mixin runtimes in " + var13 + "ms");
         var4 = System.currentTimeMillis();

         for (CORCOCICIRIOHROHROIIOOHICCHCRR var18 : this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH()) {
            if (var18.hasMixinRuntime()) {
               RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var20 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var18, var1
               );
               com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var22 = this.HHOCICIOHHRCIORRCCOIIOICCOICHO.get(var20);
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Setting up mixins for " + var18);
               var22.IROOROHHIIHHCCCIORCCIRORCIIIIO();
            }
         }

         var13 = System.currentTimeMillis() - var4;
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Done registering Mixins in " + var13 + "ms");
         var4 = System.currentTimeMillis();

         for (CORCOCICIRIOHROHROIIOOHICCHCRR var19 : this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH()) {
            if (var19.hasMixinRuntime()) {
               RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var21 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var19, var1
               );
               com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var23 = this.HHOCICIOHHRCIORRCCOIIOICCOICHO.get(var21);
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Going to default mixins stage for " + var19);
               var23.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().gotoDefaultPhase();
               this.OHHOHCOHHOICOROCHRIIOOORHICIIO.add(var19);
               com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR(var23);
            }
         }

         var13 = System.currentTimeMillis() - var4;
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Mixin runtimes prepared in " + var13 + "ms");
         if (this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.hasModule("fabric")) {
            this.triggerFabricPreLaunch();
         }

         var4 = System.currentTimeMillis() - var2;
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Initialized Mixin in " + var4 + "ms");
      }
   }

   private void triggerFabricPreLaunch() {
      try {
         Class var1 = Class.forName("net.fabricmc.loader.impl.FabricLoaderImpl");
         Object var2 = var1.getDeclaredField("INSTANCE").get(null);
         var2.getClass().getDeclaredMethod("triggerFabricPreLaunch").invoke(var2);
      } catch (Throwable var3) {
         throw var3;
      }
   }

   @Override
   public void close() {
      for (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : this.HHOCICIOHHRCIORRCCOIIOICCOICHO.values()) {
         var2.close();
      }

      for (List var6 : this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.values()) {
         for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var6) {
            var4.close();
         }

         var6.clear();
      }

      this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.clear();
      this.HHOCICIOHHRCIORRCCOIIOICCOICHO.clear();
      this.IHCCICORHRCRHOCHOOHHCHCCCIRICO.clear();
      this.RCOOOOOIHORHIOHIIHCRRIOCHCORHI.clear();
   }

   public com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      CORCOCICIRIOHROHROIIOOHICCHCRR[] var1,
      ClassLoader var2,
      boolean var3,
      String var4,
      @Nullable com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH var5
   ) {
      try {
         String var6 = var4;

         for (int var7 = var1.length - 1; var7 >= 0; var7--) {
            var6 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1[var7], var6);
         }

         String var21 = var6;

         for (CORCOCICIRIOHROHROIIOOHICCHCRR var11 : var1) {
            var21 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11, var21);
            var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var2, var3, var21, var5, null);
            if (var5 != null) {
               byte[] var12 = null;
               if (OOCCOORIIICICIOOHIOOCCHCRCHRCI) {
                  try {
                     if (var5.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
                        var12 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var2, var5.getClassNode(), false);
                        com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var5.getClassNode(), com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var12, 0)
                        );
                     }
                  } catch (Throwable var18) {
                     throw new FatalIchorError("Failed to write " + var4 + " to bytes at " + var11, var18);
                  }
               }

               String var13 = var21.replace('.', '/').replace('$', '_');
               if (CCCIOOHOCOCHCRIRHIIORCRIOOIRHO(var13)) {
                  try {
                     if (var12 == null) {
                        if (var5.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
                           var12 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var2, var5.getClassNode(), false);
                        } else {
                           var12 = var5.getClassBytes();
                        }
                     }

                     String var14 = this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH().indexOf(var11) + "_" + var11.name();
                     String var15 = var13.substring(0, var13.lastIndexOf(47));
                     String var16 = var13.substring(var13.lastIndexOf(47) + 1);
                     Path var17 = Paths.get(".ichor/dump/" + var15 + "/" + var14 + "/" + var16 + ".class");
                     Files.createDirectories(var17.getParent());
                     Files.write(var17, var12);
                  } catch (Throwable var19) {
                     new IllegalStateException("Failed to write bytes for " + var21 + " at " + var11, var19).printStackTrace();
                  }
               }
            }
         }

         return var5;
      } catch (Throwable var20) {
         throw var20;
      }
   }

   private com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      CORCOCICIRIOHROHROIIOOHICCHCRR var1,
      ClassLoader var2,
      boolean var3,
      String var4,
      @Nullable com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH var5,
      @Nullable CIOHHCORHRCCRICCCORIHCRHCCCRRR var6
   ) {
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      if (var5 != null) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5);
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8;
         if (!var1.shouldUseClassBytes()) {
            if (!var5.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
               var5.CIHCCCOIHHCIOCIOCORRIHROROIIOI(0);
            }

            var8 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var5.getClassNode().name, var5, var7);
         } else {
            var8 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var5.getClassName(), var5, var7);
         }

         List var9 = this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.get(var1);
         if (var9 != null) {
            for (CRRRICCRROCOHHOHIICIHORCOORRRH var11 : var9) {
               var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8);
            }
         }

         if (var6 != null) {
            var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO, var1, var5);
         }
      }

      try {
         if (this.OHHOHCOHHOICOROCHRIIOOORHICIIO.contains(var1)
            && var1.hasMixinRuntime()
            && (
               var3
                  || !var1.shouldUseParentAsMixinRuntime()
                     && var5 != null
                     && var5.IHCIIRORHIHHCIROOHHROCCHRIOHCR()
                     && com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var5.getClassNode())
            )
            && var7.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH() != null) {
            if (var5 == null) {
               ClassNode var14 = var7.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().transformClassNode(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO, var4, var4, null);
               if (var14 != null) {
                  var5 = new com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH(var14);
               }
            } else {
               var5.IOIICIRIICICIIOORHCIIIIRRIHRHI(
                  var7.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().transformClassNode(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO, var4, var4, var5.getClassNode())
               );
            }
         }
      } catch (Throwable var12) {
         Throwable var13 = var12;
         if (var12 instanceof FatalIchorError
            || OOHIHHRHOHIROCHRRRHRIOIOIOOHRC && var12 instanceof com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            throw new FatalIchorError("Failed to apply " + var1 + " to " + var4, var12);
         }

         boolean var15 = var12 instanceof IllegalArgumentException && var12.getMessage().contains("JSR/RET are not supported with computeFrames option");
         if (!var15) {
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR,
                  " Failed to apply " + var1 + " to " + var4 + ": " + var12.getClass().getName() + " " + var12.getMessage()
               );
            if (var12 instanceof ClassCircularityError var16) {
               var13 = new RuntimeException(
                  "IchorInjector#transform: On stage " + var1 + " using " + var2.getName() + " trying to transform " + var4 + " we exploded???", var16
               );
            }

            var7.IHIRRIIORRHORHRORIHOROIRCORCOO().CCHORCOOOCRRRHHCRCRRCIHIICICCH().CIOHHCORHRCCRICCCORIHCRHCCCRRR(var13);
         }
      }

      return var5;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var0, com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      if (RCOIIHRHRCICHRRHRHCRORHHRHICHI && var1.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
         ClassNode var2 = var1.getClassNode();
         AnnotationNode var3 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class, Map.of("stage", var0.name(), "time", System.currentTimeMillis())
         );
         List var4 = var2.visibleAnnotations;
         if (var4 == null) {
            var4 = new ArrayList();
         }

         var4.add(var3);
         var2.visibleAnnotations = var4;
      }
   }

   @NotNull
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, ClassLoader var2) {
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.HHOCICIOHHRCIORRCCOIIOICCOICHO
         .computeIfAbsent(
            new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2),
            var3x -> new com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var1, var2)
         );
      if (var1.hasMixinRuntime() && !this.OHHOHCOHHOICOROCHRIIOOORHICIIO.contains(var1)) {
         this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var2);
      }

      return var3;
   }

   public byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, ClassLoader var2, @Nullable ClassNode var3, boolean var4) {
      if (var3 == null) {
         return null;
      }

      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var3, var4);
   }

   public byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, @Nullable ClassNode var2, boolean var3) {
      if (var2 == null) {
         return null;
      }

      int var5 = var3 ? 2 : 0;
      com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = new com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var5, this, var1
      );

      try {
         try {
            var2.accept(var6);
         } catch (IllegalArgumentException var11) {
            if (!var11.getMessage().contains("JSR/RET")) {
               throw var11;
            }

            var6 = new com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, this, var1);
            var2.accept(new IIRHCHHOICHRICOOCRORCCIOOIHOIR(589824, var6));
         }
      } catch (Exception var12) {
         FatalIchorError var8 = new FatalIchorError("Failed to write class " + var2.name + " with COMPUTE_FRAMES", var12);

         try {
            var2.accept(new CheckClassAdapter(null, true));
         } catch (Throwable var10) {
            var8.addSuppressed(var10);
         }

         throw var8;
      }

      return var6.toByteArray();
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      CORCOCICIRIOHROHROIIOOHICCHCRR var1, ClassLoader var2, com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      String var4 = var3.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO();
      WeakReference var5 = this.IHCCICORHRCRHOCHOOHHCHCCCIRICO.get(new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4));
      if (var5 != null) {
         com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.get();
         if (var6 != null) {
            return var6;
         }
      }

      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = this.HHOCICIOHHRCIORRCCOIIOICCOICHO
         .computeIfAbsent(
            new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2),
            var3x -> new com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var1, var2)
         );
      List var7 = this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.get(var1);
      if (var7 != null) {
         for (CRRRICCRROCOHHOHIICIHORCOORRRH var9 : var7) {
            var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var10);
         }
      }

      if (var3.CIIRICRCHCORHRIOHCHHCOHCOROIOR() != null) {
         this.IHCCICORHRCRHOCHOOHHCHCCCIRICO.put(new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4), new WeakReference<>(var3));
      }

      return var3;
   }

   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, String var2) {
      if (var2 == null) {
         return null;
      }

      var2 = var2.replace('.', '/');
      List var3 = this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.get(var1);
      if (var3 != null) {
         for (CRRRICCRROCOHHOHIICIHORCOORRRH var5 : var3) {
            for (com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : var5.HRRICOIHHHHOIIIIIHIIORROICRIIC()) {
               var2 = var7.remap(var2);
            }
         }
      }

      var2 = var2.replace('/', '.');
      return var2.intern();
   }

   public String HHCCIRHCCCIIRHCROHIORHIRHHIORH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, String var2) {
      if (var2 == null) {
         return null;
      }

      var2 = var2.replace('.', '/');
      List var3 = this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.get(var1);
      if (var3 != null) {
         ArrayList var4 = new ArrayList(var3);
         Collections.reverse(var4);

         for (CRRRICCRROCOHHOHIICIHORCOORRRH var6 : var4) {
            ArrayList var7 = new ArrayList<>(var6.HRRICOIHHHHOIIIIIHIIORROICRIIC());
            Collections.reverse(var7);

            for (com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 : var7) {
               var2 = var9.unmap(var2);
            }
         }
      }

      var2 = var2.replace('/', '.');
      return var2.intern();
   }

   public Set<String> CRRRICCRROCOHHOHIICIHORCOORRRH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, String var2) {
      HashSet var3 = new HashSet();
      var3.add(var2);
      ArrayList var4 = new ArrayList<>(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH());
      Collections.reverse(var4);

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var6 : var4) {
         HashSet var7 = new HashSet();

         for (String var9 : var3) {
            var7.add(this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6, var9));
         }

         var3.addAll(var7);
      }

      return var3;
   }

   public String OCHRCCCICRIOCRCOORCIRCHRIHOIRO(String var1) {
      ArrayList var2 = new ArrayList<>(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH());
      Collections.reverse(var2);

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var4 : var2) {
         var1 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var1);
      }

      return var1;
   }

   public String RRCRRCORICCHOHHIRCHIROOHIIOHCO(CORCOCICIRIOHROHROIIOOHICCHCRR var1, String var2) {
      for (CORCOCICIRIOHROHROIIOOHICCHCRR var5 : new ArrayList<>(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH())) {
         var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var2);
         if (var5 == var1) {
            break;
         }
      }

      return var2;
   }

   public String HRIOCRHIOOHOHOCRCROIIRORHICICC(String var1) {
      for (CORCOCICIRIOHROHROIIOOHICCHCRR var4 : new ArrayList<>(this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO.IOICIHIIHIOIROHCHROROHRIRHIHIH())) {
         var1 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var1);
      }

      return var1;
   }

   public List<MappingSet> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      List var2 = this.IOIRRROORIHCRORHHCIHHCOOCOHHCR.get(var1);
      if (var2 == null) {
         return List.of();
      }

      ArrayList var3 = new ArrayList();

      for (CRRRICCRROCOHHOHIICIHORCOORRRH var5 : var2) {
         var3.addAll(var5.CHRHHCIIRCOOIRICHIOHHHROOHIRRO());
      }

      return var3;
   }

   public static boolean CCCIOOHOCOCHCRIRHIIORCRIOOIRHO(String var0) {
      for (String var4 : OOHCICRRRHOOCOOIRRRCOCRHCIRCIO) {
         if (!var4.isBlank() && var0.startsWith(var4)) {
            return true;
         }
      }

      return false;
   }

   Collection<com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CRHHRIRORCRRIIRCRIOICHIRHRIROR() {
      return this.HHOCICIOHHRCIORRCCOIIOICCOICHO.values();
   }

   @Generated
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR IHIRRIIORRHORHRORIHOROIRCORCOO() {
      return this.HRICOHOICHHOOOIOHHHOIIOHCOOCCO;
   }

   @Generated
   public Map<CORCOCICIRIOHROHROIIOOHICCHCRR, List<CRRRICCRROCOHHOHIICIHORCOORRRH>> IORCCOCHCIHRRRCIHHRCOOCRCCOCIR() {
      return this.IOIRRROORIHCRORHHCIHHCOOCOHHCR;
   }

   @Generated
   public List<com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> CCOICROHIIHCCRRRRCCICIRCCHCHRO() {
      return this.RCOOOOOIHORHIOHIIHCRRIOCHCORHI;
   }

   public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      private final CORCOCICIRIOHROHROIIOOHICCHCRR OOHROOROCRHHHRHCRHROIOIOORRIHI;
      private final String RICOCIRIOIIHHHHCHOCOHRRHHROHOC;
      private final com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH OIROHHIHRHCIHRRHHHRRHIORRCCRRO;
      private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH OHICHROOHHCRIRCRRIOHCCIHICHHOO;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         CORCOCICIRIOHROHROIIOOHICCHCRR var1,
         String var2,
         com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH var3,
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
      ) {
         this.OOHROOROCRHHHRHCRHROIOIOORRIHI = var1;
         this.RICOCIRIOIIHHHHCHOCOHRRHHROHOC = var2;
         this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO = var3;
         this.OHICHROOHHCRIRCRRIOHCCIHICHHOO = var4;
      }

      public byte[] RRHOOOORORHHOOIHRCCHIIHHIIIIOH(Class<?> var1) {
         if (this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
            throw new IllegalStateException(
               "Trying to get class bytes at a not-early stage: " + this.OOHROOROCRHHHRHCRHROIOIOORRIHI + " -> " + var1.getSimpleName()
            );
         } else {
            return this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.getClassBytes();
         }
      }

      public void COIHORRCHRRCHOCIRHHRRIOIHRIHCC(byte[] var1) {
         if (this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
            throw new IllegalStateException("Trying to set class name at a not-early stage: " + this.OOHROOROCRHHHRHCRHROIOIOORRIHI);
         }

         this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.getClassName());
      }

      public ClassNode HIHHOCRHHRORRHHRORRRIIHHORIHOC(Class<?> var1) {
         if (this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
            return this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO.getClassNode();
         } else {
            throw new IllegalStateException("Trying to get ClassNode at an early stage: " + this.OOHROOROCRHHHRHCRHROIOIOORRIHI + " -> " + var1.getSimpleName());
         }
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR HIROOCHIIOHRICIOCIRCRRRRRHIRHI() {
         return this.OOHROOROCRHHHRHCRHROIOIOORRIHI;
      }

      public String className() {
         return this.RICOCIRIOIIHHHHCHOCOHRRHHROHOC;
      }

      public com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH HRIIICRHCHOOCHRIHICHRROORRHIOR() {
         return this.OIROHHIHRHCIHRRHHHRRHIORRCCRRO;
      }

      public com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCRHICROCOCICCOCCCCHRCCCIORRRH() {
         return this.OHICHROOHHCRIRCRRIOHCCIHICHHOO;
      }
   }

   private record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final CORCOCICIRIOHROHROIIOOHICCHCRR IOCIORCIHIOCRCICHRRRIHIOOICIIC;
      private final ClassLoader HCOOICOCOOORHOROHCCOIROCOOHORC;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, ClassLoader var2) {
         this.IOCIORCIHIOCRCICHRRRIHIOOICIIC = var1;
         this.HCOOICOCOOORHOROHCCOIROCOOHORC = var2;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR RCRIHIICHHIHHRIIROHORHHICCOOOO() {
         return this.IOCIORCIHIOCRCICHRRRIHIOOICIIC;
      }

      public ClassLoader OOOCIHRIRHHRCORCCIOHOIICIHOIRH() {
         return this.HCOOICOCOOORHOROHCCOIROCOOHORC;
      }
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final CORCOCICIRIOHROHROIIOOHICCHCRR IHCCCRHHCRRICIHROOHHRROICOHHHH;
      private final String HCHRIORHCCICRROCICHOCHOHOHRRCO;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, String var2) {
         this.IHCCCRHHCRRICIHROOHHRROICOHHHH = var1;
         this.HCHRIORHCCICRROCICHOCHOHOHRRCO = var2;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR RCRIHIICHHIHHRIIROHORHHICCOOOO() {
         return this.IHCCCRHHCRRICIHROOHHRROICOHHHH;
      }

      public String className() {
         return this.HCHRIORHCCICRROCICHOCHOHOHRRCO;
      }
   }
}
