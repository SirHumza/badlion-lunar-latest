package com.moonsworth.lunar.genesis;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.ichor.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends URLClassLoader
   implements com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH,
   com.moonsworth.lunar.ichor.api.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   RIROICHCRROROHCCROOCCCCOCHCCRI {
   static final boolean RCRRIROIOIIICICIOOCCCCCCOOCRRO = Boolean.parseBoolean(System.getProperty("ichor.debugPrebakedClasses", "false"));
   private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR OROOOHIOHOORRCOCHICHHRICHCIHHI;
   private Set<String> HICOIOCOCICIOCIICORIOOOIHOHOOO = new HashSet<>();
   private final ConcurrentMap<String, byte[]> HICOCORHROCOCHCCOICHRHRIIOOCCR = new ConcurrentHashMap<>();
   private volatile boolean HCHHOOCIRCHORCHIRRCOIHCCRRCIII;
   private com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH OORCRCICRRRRCCHHRHCCIOIHOOIOOH;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(URL[] var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2) {
      super("Genesis", var1, CRRRICCRROCOHHOHIICIHORCOORRRH.class.getClassLoader());
      this.OROOOHIOHOORRCOCHICHHRICHCIHHI = var2;
   }

   @Override
   public Class<?> loadClass(String var1, boolean var2) {
      if (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.OROOOHIOHOORRCOCHICHHRICHCIHHI)
         && !this.isExcluded(var1)
         && !var1.equals(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.getName())) {
         String var3 = this.HCHHOOCIRCHORCHIRRCOIHCCRRCIII ? this.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var1) : var1;
         synchronized (this.getClassLoadingLock(var3)) {
            Class var5 = this.findLoadedClass(var1);
            if (var5 != null) {
               return var5;
            }

            if (var1.equals(this.getClass().getName())) {
               return this.getClass();
            }

            try {
               Class var6 = this.findClass(var1);
               if (var6 != null) {
                  if (var2) {
                     this.resolveClass(var6);
                  }

                  return var6;
               } else {
                  return super.loadClass(var1.replace('/', '.'), var2);
               }
            } catch (Exception var8) {
               throw new ClassNotFoundException("Failed to find class " + var1, var8);
            }
         }
      } else {
         return super.loadClass(var1.replace('/', '.'), var2);
      }
   }

   @Override
   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OORCRCICRRRRCCHHRHCCIOIHOOIOOH = var1;
   }

   @Override
   public com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHIIOIIICRCHHHCOIRIIICIRIRIICO() {
      return this.OORCRCICRRRRCCHHRHCCIOIHOOIOOH;
   }

   @Override
   protected Class<?> findClass(String var1) {
      Class var2 = this.findLoadedClass(var1);
      if (var2 != null) {
         return var2;
      }

      if (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.OROOOHIOHOORRCOCHICHHRICHCIHHI)
         && !this.isExcluded(var1)) {
         String var3 = this.HCHHOOCIRCHORCHIRRCOIHCCRRCIII ? this.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var1) : var1;
         byte[] var4 = this.HICOCORHROCOCHCCOICHRHRIIOOCCR.get(var3);
         IRRCCOICORICIHCHRHIHIHROIRHOCR var5;
         if (var4 != null) {
            CORCOCICIRIOHROHROIIOOHICCHCRR var6 = IchorAPI.getClassCacheLevel();
            if (var6 != null) {
               var5 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var4, this, var6, null);
            } else {
               var5 = new IRRCCOICORICIHCHRHIHIHROIRHOCR(var3, var4);
            }
         } else if (this.HCHHOOCIRCHORCHIRRCOIHCCRRCIII && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHCIHRRRCCRHOOCCORIIRIICHHIRC(var1)) {
            CORCOCICIRIOHROHROIIOOHICCHCRR var15 = IchorAPI.getClassCacheLevel();
            CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               var1,
               () -> var15 != null
                  ? this.OROOOHIOHOORRCOCHICHHRICHCIHHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null, this, null, var15)
                  : this.OROOOHIOHOORRCOCHICHHRICHCIHHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null, this)
            );
            var5 = var7.IROOIICIRHCIIHROROHIORIIOOOICC();
            if (var15 != null) {
               var5 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.className(), var5.RIHCHIRRIHRROCIHICHIORICCOOCHH(), this, var15, null);
            }
         } else {
            var5 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null, this);
         }

         var2 = this.findLoadedClass(var5.className());
         if (var2 != null) {
            return var2;
         }

         try {
            ProtectionDomain var16 = com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, this, var1);
            return this.defineClass(var5.className(), var5.RIHCHIRRIHRROCIHICHIORICCOOCHH(), 0, var5.RIHCHIRRIHRROCIHICHIORICCOOCHH().length, var16);
         } catch (NoClassDefFoundError var13) {
            if (var13.getMessage().contains("wrong name: ")) {
               String var17 = var1;
               List var8 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.IOICIHIIHIOIROHCHROROHRIRHIHIH();

               for (int var9 = var8.size() - 1; var9 >= 0; var9--) {
                  CORCOCICIRIOHROHROIIOOHICCHCRR var10 = (CORCOCICIRIOHROHROIIOOHICCHCRR)var8.get(var9);
                  var17 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.CHIOHRROCCRCCHHCCRRHCROOOICCOI().HHCCIRHCCCIIRHCROHIORHIRHHIORH(var10, var17);
               }

               Genesis.LOGGER.fatal("Encountered mismatched name while loading " + var1 + "!");
               Genesis.LOGGER.fatal("  Error message: " + var13.getMessage());
               Genesis.LOGGER
                  .fatal(
                     "  Name from class bytes: "
                        + com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOIOHIORIROHRRCOOOHCROHORCOIIH(var5.RIHCHIRRIHRROCIHICHIORICCOOCHH())
                  );
               Genesis.LOGGER.fatal("Remap trace for " + var1 + " -> " + var5.className() + ":");
               int var18 = 1;

               for (CORCOCICIRIOHROHROIIOOHICCHCRR var11 : var8) {
                  String var12 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.CHIOHRROCCRCCHHCCRRHCROOOICCOI().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11, var17);
                  if (!var12.equals(var17)) {
                     Genesis.LOGGER.fatal(var18 + ". " + var11.name() + ": " + var17 + " -> " + var12);
                     var18++;
                  }

                  var17 = var12;
               }
            }

            throw var13;
         }
      } else {
         return super.findClass(var1);
      }
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      if (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1)) {
         return null;
      }

      try {
         InputStream var2 = super.getResourceAsStream(var1);
         if (var2 == null) {
            for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 : this.IHIRRIIORRHORHRORIHOROIRCORCOO().OICRIROHIORCRHOCCRIIRHHRCOIHII()) {
               if (var4 instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5) {
                  var2 = var5.getResourceAsStream(var1);
                  if (var2 != null) {
                     break;
                  }
               }
            }
         }

         byte[] var7 = var2 == null ? null : com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var2);
         byte[] var8 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var7, this).CIIRICRCHCORHRIOHCHHCOHCOROIOR();
         return var8 == null ? null : new ByteArrayInputStream(var8);
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      }
   }

   @Override
   public URL findResource(String var1) {
      if (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1)) {
         return null;
      }

      List var2;
      if (var1.endsWith(".class")) {
         String var3 = var1.substring(0, var1.length() - 6).replace('/', '.');
         Set var4 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.CHIOHRROCCRCCHHCCRRHCROOOICCOI().CRRRICCRROCOHHOHIICIHORCOORRRH(null, var3);
         var2 = new ArrayList(var4.size());

         for (String var6 : var4) {
            var2.add(var6.replace('.', '/') + ".class");
         }
      } else {
         var2 = Collections.singletonList(var1);
      }

      for (String var10 : var2) {
         URL var11 = super.findResource(var10);
         if (var11 == null) {
            for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var7 : this.IHIRRIIORRHORHRORIHOROIRCORCOO().OICRIROHIORCRHOCCRIIRHHRCOIHII()) {
               if (var7 instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8) {
                  var11 = var8.findResource(var10);
                  if (var11 != null) {
                     break;
                  }
               }
            }
         }

         if (var11 != null) {
            return var11;
         }
      }

      return null;
   }

   @Override
   public Enumeration<URL> findResources(String var1) {
      ArrayList var2 = Collections.list(super.findResources(var1));

      for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 : this.IHIRRIIORRHORHRORIHOROIRCORCOO().OICRIROHIORCRHOCCRIIRHHRCOIHII()) {
         if (var4 instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5) {
            URL var6 = var5.findResource(var1);
            if (var6 != null) {
               var2.add(var6);
            }
         }
      }

      return Collections.enumeration(var2);
   }

   @Override
   public InputStream HOHOICCIHCHHOCRCIRRHRROCRCCRCH(String var1) {
      if (com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1)) {
         return null;
      }

      try {
         InputStream var2 = super.getResourceAsStream(var1);
         if (var2 == null) {
            var2 = this.getResourceAsStream(var1);
         }

         return var2;
      } catch (SecurityException var3) {
         throw new RuntimeException("Failed to get raw resource stream for " + var1, var3);
      }
   }

   @Override
   public String toString() {
      String var1 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
            this.OROOOHIOHOORRCOCHICHHRICHCIHHI.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
         )
         .getId();
      return "GenesisClassLoader(" + var1 + ")";
   }

   @Override
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR IHIRRIIORRHORHRORIHOROIRCORCOO() {
      return this.OROOOHIOHOORRCOCHICHHRICHCIHHI;
   }

   @Override
   public void IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(Set<String> var1) {
      this.HICOIOCOCICIOCIICORIOOOIHOHOOO = var1;
      if (RCRRIROIOIIICICIOOCCCCCCOOCRRO) {
         Genesis.LOGGER.info("Excluding " + this.HICOIOCOCICIOCIICORIOOOIHOHOOO.size() + " classes from GenesisClassLoader");

         for (String var3 : this.HICOIOCOCICIOCIICORIOOOIHOHOOO) {
            Genesis.LOGGER.info("  excluding " + var3);
         }
      }
   }

   @Override
   public boolean isExcluded(String var1) {
      return this.HICOIOCOCICIOCIICORIOOOIHOHOOO.contains(var1.replace('/', '.'));
   }

   @Override
   public Optional<Class<?>> CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, byte[] var2) {
      try {
         return Optional.of(this.defineClass(var1, var2, 0, var2.length));
      } catch (ClassFormatError var4) {
         return Optional.empty();
      }
   }

   public ConcurrentMap<String, byte[]> IROICIIIHOCCCOHOCHHCRCRRRCOHHI() {
      return this.HICOCORHROCOCHCCOICHRHRIIOOCCR;
   }

   CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, Supplier<IRRCCOICORICIHCHRHIHIHROIRHOCR> var2) {
      String var3 = this.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var1);
      synchronized (this.getClassLoadingLock(var3)) {
         byte[] var5 = this.HICOCORHROCOCHCCOICHRHRIIOOCCR.get(var3);
         if (var5 != null) {
            return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new IRRCCOICORICIHCHRHIHIHROIRHOCR(var3, var5), false);
         }

         IRRCCOICORICIHCHRHIHIHROIRHOCR var6 = (IRRCCOICORICIHCHRHIHIHROIRHOCR)var2.get();
         String var7 = this.RRIHOCROCOOIIIOIRRHOICICHRHHRC(var6.className());
         if (!var7.equals(var3)) {
            throw new IllegalStateException("Cache transform renamed " + var3 + " to a different canonical key " + var7);
         }

         this.HICOCORHROCOCHCCOICHRHRIIOOCCR.put(var7, var6.RIHCHIRRIHRROCIHICHIORICCOOCHH());
         return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, true);
      }
   }

   String RRIHOCROCOOIIIOIRRHOICICHRHHRC(String var1) {
      if (this.OROOOHIOHOORRCOCHICHHRICHCIHHI != null) {
         var1 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.CHIOHRROCCRCCHHCCRRHCROOOICCOI().OCHRCCCICRIOCRCOORCIRCHRIHOIRO(var1);
         var1 = this.OROOOHIOHOORRCOCHICHHRICHCIHHI.CHIOHRROCCRCCHHCCRRHCROOOICCOI().HRIOCRHIOOHOHOCRCROIIRORHICICC(var1);
      }

      return var1.replace('/', '.');
   }

   public void CRCROIRHOCHHROOORCOIHHIOHRIHHI() {
      this.HCHHOOCIRCHORCHIRRCOIHCCRRCIII = true;
   }

   @Override
   public void close() {
      try {
         super.close();
         this.OROOOHIOHOORRCOCHICHHRICHCIHHI.close();
      } catch (Throwable var2) {
         throw var2;
      }
   }

   @Override
   public void addURL(URL var1) {
      try {
         super.addURL(var1);
         com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, this.IHIRRIIORRHORHRORIHOROIRCORCOO(), var1
         );
      } catch (Throwable var3) {
         throw var3;
      }
   }

   static {
      registerAsParallelCapable();
   }

   record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final IRRCCOICORICIHCHRHIHIHROIRHOCR IOHRRIIOOOICOCHRORCRCORHOROCII;
      private final boolean OCORRRHICORHHICRIRCICRCIHCOOIC;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR var1, boolean var2) {
         this.IOHRRIIOOOICOCHRORCRCORHOROCII = var1;
         this.OCORRRHICORHHICRIRCICRCIHCOOIC = var2;
      }

      public IRRCCOICORICIHCHRHIHIHROIRHOCR IROOIICIRHCIIHROROHIORIIOOOICC() {
         return this.IOHRRIIOOOICOCHRORCRCORHOROCII;
      }

      public boolean IORCHRRRROIRROCROCHIRHIHCOHRIC() {
         return this.OCORRRHICORHHICRIRCICRCIHCOOIC;
      }
   }
}
