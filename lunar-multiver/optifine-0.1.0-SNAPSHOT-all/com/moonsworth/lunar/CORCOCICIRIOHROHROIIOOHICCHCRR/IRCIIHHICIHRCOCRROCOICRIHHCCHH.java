package com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public static final String HIIHOHRCOROCRIIOICRIHRROHHHCCH = "optifine";
   public static final OCOHORHCROHICRRIHCIHHRRCIHICRI OIIOOIIHICRRIOHCCRCOIICICRRCRO = OCOHORHCROHICRRIHCIHHRRCIHICRI.CRHHIRIIHRRIRCOHRIORHORCOCIHHI("OptiFine");
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROOIOIRCHOCHRHIROOOHIIRCRCHIOI;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      super("optifine");
   }

   public List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      if (!com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
            var1.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
         )
         .HOHOICRHCHRRIRIROCIRHRRIOROCRH()) {
         return List.of();
      }

      var1.ICRROHROHHOHRRRIIHORIRICHRCOIC()
         .CCIHOOIRHRHHHCRCIHOCHICHRROCRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRIICRCIROIHCRICOIHRRCHRCOICRR
         );
      this.ROOIOIRCHOCHRHIROOOHIIRCRCHIOI = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      return List.of(this.ROOIOIRCHOCHRHIROOOHIIRCRCHIOI);
   }

   public Map<String, String> IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
         var1.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
      );
      return !var2.HOHOICRHCHRRIRIROCIRHRRIOROCRH() ? Map.of() : Map.of("optifine", "OptiFine_" + var2.getId() + ".jar");
   }

   public static boolean ICIHOIHROICHIHRIIOOCHOCCOHRIRR(String var0) {
      return var0.startsWith("net/optifine/") || var0.startsWith("net/minecraftforge/");
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2, BiConsumer<String, Supplier<byte[]>> var3) {
      if (com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
               var1.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
            )
            .HOHOICRHCHRRIRIROCIRHRRIOROCRH()
         && var2.equals("optifine")) {
         Path var4 = (Path)var1.OHIROHHCCHRIIORCHRCOIICOHOOCOO(var2).orElseThrow();

         try (ZipFile var5 = new ZipFile(var4.toFile())) {
            Enumeration var6 = var5.entries();

            while (var6.hasMoreElements()) {
               ZipEntry var7 = (ZipEntry)var6.nextElement();
               String var8 = var7.getName();
               this.ROOIOIRCHOCHRHIROOOHIIRCRCHIOI.IORHOOROCROCRIIICROCIHHCIRHHRI().getFileFilter().apply(var8).ifPresent(var4x -> var3.accept(var4x, () -> {
                  try {
                     return var5.getInputStream(var7).readAllBytes();
                  } catch (IOException var4xx) {
                     throw new RuntimeException("couldn't read file " + var8, var4xx);
                  }
               }));
            }
         } catch (Exception var11) {
            throw new IllegalStateException("Failed to open entries of " + var4, var11);
         }
      } else {
         super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3);
      }
   }

   public com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      return com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INIT;
   }
}
