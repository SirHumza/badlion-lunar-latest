package com.moonsworth.lunar.ichor;

import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.ichor.util.FatalIchorError;
import com.moonsworth.lunar.ichor.util.FlawlessFrames;
import com.moonsworth.lunar.ichor.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.ichor.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.ichor.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.Generated;
import net.minecraft.launchwrapper.IClassTransformer;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.provider.ClassProvider;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.service.IMixinServiceBootstrap;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends URLClassLoader
   implements com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH,
   RIROICHCRROROHCCROOCCCCOCHCCRI,
   InheritanceProvider,
   ClassProvider {
   public static final String IOIRROHCHOOIOCOICROIIIOIOROIRC = "org.spongepowered.asm.";
   private static final OCOHORHCROHICRRIHCIHHRRCIHICRI OHOHHRCHRIIIIHCOCRROOHROIROORR = OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
   private static final HashSet<String> HRHOIIIRHRHROHHRORRICIHHCIOROC = new HashSet<>();
   public static boolean HIOHOHOIRICOOCHHCRCRRHRHIHRRIR = false;
   public static boolean ICOHIRRHOOCHOOHHHHOIHHIRCROOOO = true;
   private static final Map<Path, Path> HCICHHCRIORHRCOICCCHRHCHIOHOIO = new ConcurrentHashMap<>();
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO IHHORCHORIORRRIOOCOCIOIIOOIIHI;
   private final InheritanceProvider OOCOOOIRRRICOCOHHIOOOCROOIICIR;
   private final CORCOCICIRIOHROHROIIOOHICCHCRR RHCHCCHOIIRIRHIOORCRHCRCOIIHHC;
   boolean ORCRORCORHRHRCHHIOIIICRCHCIHIH = false;
   private static final AtomicBoolean IOORRHRCCOHROCRCORCHCORIIICCOC;
   private com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH HRCOOOOOIIRHCHOHHORRRIIORHOOOR;
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH OORCRCICRRRRCCHHRHCCIOIHOOIOOH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, CORCOCICIRIOHROHROIIOOHICCHCRR var2, ClassLoader var3) {
      super("IchorClassLoader(" + var2.name() + ")", new URL[0], var3);
      this.IHHORCHORIORRRIOOCOCIOIIOOIIHI = var1;
      this.OOCOOOIRRRICOCOHHIOOOCROOIICIR = new com.moonsworth.lunar.ichor.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH(this)
      );
      this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC = var2;
      if (!var1.IHIRRIIORRHORHRORIHOROIRCORCOO().IOICIHIIHIOIROHCHROROHRIRHIHIH().contains(var2)) {
         throw new IllegalStateException(
            "Tried to initialize an IchorClassLoader with stage " + var2.name() + " but that stage isn't in the supplied IchorInjector's pipeline."
         );
      }
   }

   public void OHORIHRHRROOOCRCHOCORRHCRCRIHH() {
      try {
         if (!this.ORCRORCORHRHRCHHIOIIICRCHCIHIH && this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC.hasMixinRuntime() && !IOORRHRCCOHROCRCORCHCORIIICCOC.get()) {
            IOORRHRCCOHROCRCORCHCORIIICCOC.set(true);

            try {
               this.ORCRORCORHRHRCHHIOIIICRCHCIHIH = true;
               com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC.shouldUseParentAsMixinRuntime()
                     && this.getParent() instanceof com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
                  ? var2
                  : this;
               var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this);
               Class var11 = var1.loadClass("org.spongepowered.asm.launch.MixinBootstrap", true);
               var11.getMethod("init").invoke(null);
               if (this.HRCOOOOOIIRHCHOHHORRRIIORHOOOR == null) {
                  throw new IllegalStateException(this.getName() + ": MixinProxy is null");
               }
            } catch (Throwable var8) {
               System.err
                  .println(
                     this.getName()
                        + ".loadSandboxedMixin: loadedMixin: "
                        + this.ORCRORCORHRHRCHHIOIIICRCHCIHIH
                        + " loadingMixin: "
                        + this.ORCRORCORHRHRCHHIOIIICRCHCIHIH
                  );
               var8.printStackTrace();
               throw var8;
            } finally {
               IOORRHRCCOHROCRCORCHCORIIICCOC.set(false);
            }
         }
      } catch (Throwable var10) {
         throw var10;
      }
   }

   public void IROOROHHIIHHCCCIORCCIRORCIIIIO() {
      try {
         if (this.HRCOOOOOIIRHCHOHHORRRIIORHOOOR == null) {
            throw new IllegalStateException(this.getName() + ": MixinProxy is null");
         }

         for (com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 : this.IHHORCHORIORRRIOOCOCIOIIOOIIHI
            .CCOICROHIIHCCRRRRCCICIRCCHCHRO()) {
            var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC, this.HRCOOOOOIIRHCHOHHORRRIIORHOOOR, this);
         }
      } catch (Throwable var3) {
         System.err.println(this.getName() + ".setupMixins: error occurred " + var3.getMessage());
         var3.printStackTrace();
         throw var3;
      }
   }

   @Override
   public Class<?> loadClass(String var1, boolean var2) {
      synchronized (this.getClassLoadingLock(var1)) {
         Class var4 = this.findLoadedClass(var1);
         if (var4 != null) {
            return var4;
         }

         if (var1.equals(this.getClass().getName())) {
            return this.getClass();
         }

         boolean var5 = false;
         if (this.getParent() instanceof com.moonsworth.lunar.ichor.api.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6) {
            var5 = var6.isExcluded(var1);
         }

         if (IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.IHIRRIIORRHORHRORIHOROIRCORCOO())
            && !var5
            && !CCIOHCIIORCIOIHHCOHHIHIHCHOCRC(var1)
            && (!this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC.hasMixinRuntime() || !this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC.shouldUseParentAsMixinRuntime())) {
            try {
               Class var11 = this.findClass(var1);
               if (var11 != null) {
                  return var11;
               }
            } catch (Exception var9) {
               if (!(var9 instanceof ClassNotFoundException)) {
                  OHOHHRCHRIIIIHCOCRROOHROIROORR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR, "IchorClassLoader.loadClass: Failed to find class " + var1
                  );
                  var9.printStackTrace();
               }
            }
         }

         return super.loadClass(var1.replace('/', '.'), var2);
      }
   }

   @Override
   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OORCRCICRRRRCCHHRHCCIOIHOOIOOH = var1;
   }

   @Override
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IHIIOIIICRCHHHCOIRIIICIRIRIICO() {
      return this.OORCRCICRRRRCCHHRHCCIOIHOOIOOH;
   }

   private boolean HROORRHRIICCHICHORHOHCCORICIIH(String var1) {
      return !var1.startsWith("org.spongepowered.asm.")
         && !var1.startsWith("com.moonsworth.lunar.genesis.lib.google.common")
         && !var1.startsWith("org.apache.logging.log4j");
   }

   @Override
   protected Class<?> findClass(String var1) {
      try {
         IRRCCOICORICIHCHRHIHIHROIRHOCR var2 = this.CRHROHHHCIHHCOHCOORCRIHHIICROR(var1, true);
         if (var2.RIHCHIRRIHRROCIHICHIORICCOOCHH() != null) {
            ProtectionDomain var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, this.getParent(), var1);
            return this.defineClass(var2.className(), var2.RIHCHIRRIHRROCIHICHIORICCOOCHH(), 0, var2.RIHCHIRRIHRROCIHICHIORICCOOCHH().length, var3);
         } else {
            return super.findClass(var1);
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public ClassNode CCIHHRIOOOOCOHRCIHOHROOICIORCC(String var1, boolean var2) {
      try {
         if (var2) {
            this.OHORIHRHRROOOCRCHOCORRHCRCRIHH();
         }

         long var3 = System.currentTimeMillis();
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.IHIRRIIORRHORHRORIHOROIRCORCOO();
         List var6 = var5.IOICIHIIHIOIROHCHROROHRIRHIHIH();
         int var7 = var6.indexOf(this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC);
         int var8 = 0;
         Set var9 = this.IHHORCHORIORRRIOOCOCIOIIOOIIHI
            .CRRRICCRROCOHHOHIICIHORCOORRRH(
               this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC,
               this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC, var1)
            );
         byte[] var10 = null;
         String var11 = var1;
         Optional var12 = var5.ICRROHROHHOHRRRIIHORIRICHRCOIC().OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var9);
         if (var12.isPresent()) {
            com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var12.get();
            int var14 = var6.indexOf(var13.RCRIHIICHHIHHRIIROHORHHICCOOOO());
            if (var14 <= var7) {
               var10 = var13.RIHCHIRRIHRROCIHICHIORICCOOCHH();
               var11 = var13.className();
               var8 = var14 + 1;
            }
         }

         if (var10 == null) {
            for (String var20 : var9) {
               String var15 = var20.replace('.', '/') + ".class";
               InputStream var16 = this.getResourceAsStream(var15);
               if (var16 != null) {
                  var10 = com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var16);
                  break;
               }
            }
         }

         com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH var19 = null;
         if (var10 != null) {
            var19 = new com.moonsworth.lunar.ichor.util.CRRRICCRROCOHHOHIICIHORCOORRRH(var10);
         }

         if (var8 < var7) {
            CORCOCICIRIOHROHROIIOOHICCHCRR[] var21 = new CORCOCICIRIOHROHROIIOOHICCHCRR[var7 - var8];

            for (int var24 = var8; var24 < var7; var24++) {
               var21[var24 - var8] = (CORCOCICIRIOHROHROIIOOHICCHCRR)var6.get(var24);
            }

            boolean var25 = var2 && this.HROORRHRIICCHICHORHOHCCORICIIH(var1);
            var19 = this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21, this.getParent(), var25, var11, var19);
         }

         if (var19 != null && !var19.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
            var19.CIHCCCOIHHCIOCIOCORRIHROROIIOI(0);
         }

         if (!var2 && var19 != null && var5.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH().get("computeFrames") == Boolean.TRUE) {
            byte[] var22 = this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var19.getClassNode(), true);
            var19.IOIICIRIICICIIOORHCIIIIRRIHRHI(com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var22, 0));
         }

         long var23 = System.currentTimeMillis() - var3;
         if (var23 > 0L && OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
            this.IHIRRIIORRHORHRORIHOROIRCORCOO().ICRRROORIRORIHIOHCRCIIIHOORCIO().COCIIROHIIIHCIRCIIHOCIOIROHRRR.getAndAdd(var23);
            String var26 = Thread.currentThread().getName();
            if (var26.equals("Client thread") || var26.equals("Render thread")) {
               this.IHIRRIIORRHORHRORIHOROIRCORCOO().ICRRROORIRORIHIOHCRCIIIHOORCIO().ORRHHIOCIORRROIHROCROCIROOIRCC.getAndAdd(var23);
            }
         }

         if (var19 == null) {
            throw new ClassNotFoundException(this.getName() + " couldn't find class bytes for " + var1 + " (checked " + var9 + ").");
         } else {
            return var19.getClassNode();
         }
      } catch (Throwable var17) {
         throw var17;
      }
   }

   public IRRCCOICORICIHCHRHIHIHROIRHOCR CRHROHHHCIHHCOHCOORCRIHHIICROR(String var1, boolean var2) {
      try {
         ClassNode var3 = this.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, var2);
         byte[] var4 = this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var3, true);
         return new IRRCCOICORICIHCHRHIHIHROIRHOCR(var3.name.replace('/', '.'), var4);
      } catch (Throwable var5) {
         throw var5;
      }
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1)) {
         return null;
      }

      ClassLoader var2 = this.getParent();
      InputStream var3;
      if (var2 instanceof RIROICHCRROROHCCROOCCCCOCHCCRI var4) {
         var3 = var4.HOHOICCIHCHHOCRCIRRHRROCRCCRCH(var1);
      } else {
         var3 = var2.getResourceAsStream(var1);
      }

      return var3 != null ? var3 : super.getResourceAsStream(var1);
   }

   @Override
   public InputStream HOHOICCIHCHHOCRCIRRHRROCRCCRCH(String var1) {
      return this.getResourceAsStream(var1);
   }

   @Override
   public String toString() {
      return "IchorClassLoader(" + this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC + ")";
   }

   @Deprecated
   @Override
   public byte[] get(String var1) {
      try {
         try {
            IRRCCOICORICIHCHRHIHIHROIRHOCR var2 = this.CRHROHHHCIHHCOHCOORCRIHHIICROR(var1, true);
            return var2.RIHCHIRRIHRROCIHICHIORICCOOCHH();
         } catch (Exception var3) {
            return null;
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   @Override
   public ClassNode getAsNode(String var1) {
      try {
         return this.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, true);
      } catch (Exception var3) {
         return null;
      }
   }

   @Override
   public ClassNode getAsNode(String var1, int var2) {
      try {
         return this.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, true);
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      return this.OOCOOOIRRRICOCOHHIOOOCROOIICIR.provide(var1);
   }

   @Override
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR IHIRRIIORRHORHRORIHOROIRCORCOO() {
      return this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.IHIRRIIORRHORHRORIHOROIRCORCOO();
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return !var0.startsWith("java.")
         && (!var0.startsWith("javax.") || var0.startsWith("javax.script."))
         && (!var0.startsWith("kotlin.") || !var1.hasModule("forge"))
         && !var0.startsWith("jdk.")
         && !var0.startsWith("org.graalvm.")
         && !var0.startsWith("com.oracle.truffle.")
         && !var0.startsWith("com.yourkit.")
         && !var0.startsWith("org.w3c.")
         && !var0.startsWith("org.xml.")
         && !var0.startsWith("com.fasterxml.")
         && !var0.startsWith("com.sun.")
         && !var0.startsWith("sun.")
         && !var0.startsWith("org.objectweb.asm.")
         && !var0.startsWith("com.moonsworth.lunar.genesis.lib.google.common.")
         && !var0.startsWith("javafx.")
         && !HRHOIIIRHRHROHHRORRICIHHCIOROC.contains(var0)
         && !var0.startsWith("net.fabricmc.api.")
         && !var0.startsWith("net.fabricmc.loader.")
         && !var0.startsWith("org.apache.")
         && !var0.startsWith("org.slf4j.")
         && (!var0.startsWith("com.replaymod.lib.") || var0.startsWith("com.replaymod.lib.de.johni0702.minecraft.gui."));
   }

   private static boolean CCIOHCIIORCIOIHHCOHHIHIHCHOCRC(String var0) {
      return var0.startsWith("com.llamalad7.mixinextras.sugar.impl.ref.generated.");
   }

   public boolean hasClass(String var1) {
      try {
         for (String var4 : this.IHHORCHORIORRRIOOCOCIOIIOOIIHI
            .CRRRICCRROCOHHOHIICIHORCOORRRH(
               this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC,
               this.IHHORCHORIORRRIOOCOCIOIIOOIIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC, var1)
            )) {
            String var5 = var4.replace('.', '/') + ".class";
            if (this.getResource(var5) != null) {
               return true;
            }
         }

         return false;
      } catch (Throwable var6) {
         throw var6;
      }
   }

   @Override
   public void addURL(URL var1) {
      try {
         super.addURL(var1);
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.getParent(), this.IHIRRIIORRHORHRORIHOROIRCORCOO(), var1
         );
      } catch (Throwable var3) {
         throw var3;
      }
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, String var1) {
      boolean var2 = !var0.IHIRRIIORRHORHRORIHOROIRCORCOO().hasModule("fabric") || HIOHOHOIRICOOCHHCRCRRHRHIHRRIR && !ICOHIRRHOOCHOOHHHHOIHHIRCROOOO;
      return var2 && var1.contains("refmap") && var1.endsWith(".json");
   }

   public static ProtectionDomain RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassLoader var0, ClassLoader var1, String var2) {
      long var3 = System.nanoTime();
      ProtectionDomain var5 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2);
      long var6 = System.nanoTime();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOIOHOHRCHRCOCRICHIICIRCCIROI += var6 - var3;
      return var5;
   }

   public static ProtectionDomain IRCIIHHICIHRCOCRROCOICRIHHCCHH(ClassLoader var0, ClassLoader var1, String var2) {
      try {
         String var3 = var2.replace(".", "/").concat(".class");
         URL var4 = var1.getResource(var3);
         if (var4 != null && (var4.getProtocol().equals("file") || var4.getProtocol().equals("jar"))) {
            Path var5 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
            Path var6 = HCICHHCRIORHRCOICCCHRHCHIOHOIO.get(var5);
            if (var6 == null) {
               var6 = var5.toRealPath();
               HCICHHCRIORHRCOICCCHRHCHIOHOIO.put(var5, var6);
            }

            return new ProtectionDomain(new CodeSource(var6.toUri().toURL(), (Certificate[])null), null, var0, null);
         } else {
            return null;
         }
      } catch (Exception var7) {
         OHOHHRCHRIIIIHCOCRROOHROIROORR.warn("Failed to find codesource for %s: %s %s", var2, var7.getClass().getName(), var7.getMessage());
         return null;
      }
   }

   private static Path RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL var0, String var1) {
      if (var0.openConnection() instanceof JarURLConnection var3) {
         return Paths.get(var3.getJarFileURL().toURI());
      } else {
         URI var4 = var0.toURI();
         String var5 = var4.getPath();
         if (var5.endsWith(var1)) {
            String var6 = var5.substring(0, var5.length() - var1.length());
            URI var7 = new URI(var4.getScheme(), var4.getUserInfo(), var4.getHost(), var4.getPort(), var6, var4.getQuery(), var4.getFragment());
            return Paths.get(var7);
         } else {
            throw new IllegalArgumentException("Could not figure out code source for file '" + var1 + "' in URL '" + var0 + "'!");
         }
      }
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO CHIOHRROCCRCCHHCCRRHCROOOICCOI() {
      return this.IHHORCHORIORRRIOOCOCIOIIOOIIHI;
   }

   @Generated
   public InheritanceProvider HOIIOIHICHOCHRCICHOIOOCCCOOCRH() {
      return this.OOCOOOIRRRICOCOHHIOOOCROOIICIR;
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR OCOIIRHCCOOHRHHCOCHIHIICRORRHR() {
      return this.RHCHCCHOIIRIRHIOORCRHCRCOIIHHC;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.HRCOOOOOIIRHCHOHHORRRIIORHOOOR = var1;
   }

   @Generated
   public com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH() {
      return this.HRCOOOOOIIRHCHOHHORRRIIORHOOOR;
   }

   static {
      try {
         Class.forName("com.moonsworth.lunar.magnify.ichor.ParameterAnnotationIchor");
         HIOHOHOIRICOOCHHCRCRRHRHIHRRIR = true;
         ICOHIRRHOOCHOOHHHHOIHHIRCROOOO = System.getProperty("ichor.fabric.intermediary") != null;
      } catch (ClassNotFoundException var1) {
      }

      IOORRHRCCOHROCRCORCHCORIIICCOC = new AtomicBoolean(false);
      registerAsParallelCapable();
      List.of(
            com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
            CORCOCICIRIOHROHROIIOOHICCHCRR.class,
            IRRCCOICORICIHCHRHIHIHROIRHOCR.class,
            IchorAPI.class,
            com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            com.moonsworth.lunar.ichor.api.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
            CRRRICCRROCOHHOHIICIHORCOORRRH.class,
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.class,
            com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class,
            com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
            CIOHHCORHRCCRICCCORIHCRHCCCRRR.class,
            CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            FatalIchorError.class,
            com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            IClassTransformer.class,
            com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            IIHRRHORCRCROCHHOHORCHCROCIHRO.class,
            IMixinServiceBootstrap.class,
            com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            FlawlessFrames.class
         )
         .forEach(var0 -> HRHOIIIRHRHROHHRORRICIHHCIOROC.add(var0.getName()));
      HRHOIIIRHRHROHHRORRICIHHCIOROC.addAll(
         List.of("org.apache.logging.log4j.core.impl.ThreadContextDataInjector", "org.objectweb.asm.commons.RemappingClassAdapter")
      );
   }
}
