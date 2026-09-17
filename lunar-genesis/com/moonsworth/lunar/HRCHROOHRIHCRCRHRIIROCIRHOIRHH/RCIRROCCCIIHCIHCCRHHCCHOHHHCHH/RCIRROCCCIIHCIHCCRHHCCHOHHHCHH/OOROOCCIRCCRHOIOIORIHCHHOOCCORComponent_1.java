package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.lang.ref.SoftReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private final Path OORHRHCICHCCOOOIOICOOIIHOOCROC;
   private final boolean CICHRCOHIORRIHCCOOCOIRROCIRRCC;
   private static final Map<String, SoftReference<byte[]>> COOROHOHIROCRRIIHCIIHIOHHOOOIO = new ConcurrentHashMap<>();

   public CRRRICCRROCOHHOHIICIHORCOORRRH(Path var1) {
      this(var1, "true".equals(System.getProperty("mx.offline")));
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH(Path var1, boolean var2) {
      try {
         this.OORHRHCICHCCOOOIOICOOIIHOOCROC = var1;
         this.CICHRCOHIORRIHCCOOCOIRROCIRRCC = var2;
         Files.createDirectories(var1);
      } catch (Throwable var4) {
         throw var4;
      }
   }

   @Override
   public Optional<com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      String var3 = var2.url();
      if (var3 == null) {
         return Optional.empty();
      }

      if (var3.contains("${")) {
         return Optional.empty();
      }

      String var4 = this.OCHHROCHHOCHCCCHRHICROHCHROCCC(var3);
      Path var5 = this.OORHRHCICHCCOOOIOICOOIIHOOCROC.resolve(var4);
      SoftReference var6 = COOROHOHIROCRRIIHCIIHIOHHOOOIO.get(var4);
      byte[] var7 = var6 != null ? (byte[])var6.get() : null;

      try {
         if (var7 == null) {
            if (Files.exists(var5) && !var2.ICCRCOHHIHCRIOCRHHRCROICORRHHR()) {
               long var14 = System.currentTimeMillis();
               var7 = Files.readAllBytes(var5);
               long var15 = System.currentTimeMillis() - var14;
               if (var15 > 100L) {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OICICCHOOROHCCOIRHOROIOCHCCORI.info("Reading from file " + var5 + " took " + var15 + "ms");
               }
            } else {
               if (this.CICHRCOHIORRIHCCOOCOIRROCIRRCC) {
                  return Optional.empty();
               }

               long var8 = System.currentTimeMillis();

               try {
                  var7 = CORCOCICIRIOHROHROIIOOHICCHCRR.ICRCIIIHROCRHOHHHHRCCCOOCICHOO(var3);
               } catch (com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12) {
               }

               if (var7 == null) {
                  return Optional.empty();
               }

               long var10 = System.currentTimeMillis() - var8;
               if (var10 > 100L) {
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OICICCHOOROHCCOIRHOROIOCHCCORI.info("Reading from URL " + var3 + " took " + var10 + "ms");
               }

               if (!var2.ICCRCOHHIHCRIOCRHHRCROICORRHHR()) {
                  Files.write(var5, var7);
               }
            }

            COOROHOHIROCRRIIHCIIHIOHHOOOIO.put(var4, new SoftReference<>(var7));
         }

         return Optional.of(new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var7));
      } catch (Exception var13) {
         return Optional.empty();
      }
   }

   private String OCHHROCHHOCHCCCHRHICROHCHROCCC(String var1) {
      return var1.replaceAll("[^a-zA-Z0-9-_.]", "_");
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
   }
}
