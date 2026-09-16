package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.cadixdev.lorenz.io.MappingsReader;
import org.cadixdev.lorenz.io.srg.SrgReader;
import org.cadixdev.lorenz.io.srg.csrg.CSrgReader;
import org.cadixdev.lorenz.io.srg.tsrg.TSrgReader;
import org.cadixdev.lorenz.io.srg.xsrg.XSrgReader;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Path CIRRHHCOCOIRHHOIRHRRCOIRORHRIC;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, Path var2) {
      super(var1);

      try {
         this.CIRRHHCOCOIRHHOIRHRRCOIRORHRIC = var2;
         if (!Files.exists(var2)) {
            Files.createDirectories(var2);
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public Path HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      String var3 = var1.OORIHCIIRICOCHRIRHHRHRIHHCHIIO().stream().filter(var0 -> var0.key().equals("mcVer")).findFirst().orElseThrow().value();
      String var4 = var3
         + "/"
         + var2.namespace()
         + "/"
         + var1.RIIROCCHOCICCICOHIOCRIIORCRRRC().getId()
         + "-"
         + Integer.toHexString(var1.RIIROCCHOCICCICOHIOCRIIORCRRRC().hashCode())
         + "/"
         + var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1).OIHOOHOHHOICRIOOCICCHCHHOROCIH();
      return this.CIRRHHCOCOIRHHOIRHRRCOIRORHRIC.resolve(var4);
   }

   @Override
   public Optional<com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      try {
         Path var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
         byte[] var4 = this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3);
         if (!var2.ICCRCOHHIHCRIOCRHHRCROICORRHHR() && var4 != null) {
            return Optional.of(
               new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4)
            );
         }

         Optional var5 = super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         var5.ifPresent(var2x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2x));
         return var5.isEmpty() && var4 != null
            ? Optional.of(new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4))
            : var5;
      } catch (Throwable var6) {
         throw var6;
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      try {
         if (var2.RCICIOOOHOCCORRRCOOCHICIRHOCHC() != null) {
            Path var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2.RCICIOOOHOCCORRRCOOCHICIRHOCHC());
            Files.createDirectories(var3.getParent());
            Files.write(var3, var2.RIHHCROROROHHROICCIRHOICCOOIHC());
         }

         super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      } catch (Throwable var4) {
         throw var4;
      }
   }

   @Nullable
   public byte[] ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(Path var1) {
      try {
         if (Files.exists(var1)) {
            try {
               byte[] var2 = Files.readAllBytes(var1);
               String var3 = var1.toString();
               if (var3.endsWith(".srg")) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, SrgReader::new);
               } else if (var3.endsWith(".xsrg")) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, XSrgReader::new);
               } else if (var3.endsWith(".csrg")) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, CSrgReader::new);
               } else if (var3.endsWith(".tsrg")) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, TSrgReader::new);
               } else if (var3.endsWith(".kin")) {
                  this.COOCCHICCCIIICRHIOCOCIOOORCOCC(var2);
               }

               return var2;
            } catch (Exception var4) {
               if (var4.getMessage() != null && !var4.getMessage().contains("tsrg2")) {
                  new IllegalStateException("Failed to read data in " + var1, var4).printStackTrace();
                  Files.delete(var1);
               }
            }
         }

         return null;
      } catch (Throwable var5) {
         throw var5;
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, Function<Reader, MappingsReader> var2) {
      try {
         MappingsReader var3 = (MappingsReader)var2.apply(new InputStreamReader(new ByteArrayInputStream(var1), StandardCharsets.UTF_8));
         var3.read();
         var3.close();
      } catch (Throwable var4) {
         throw var4;
      }
   }

   private void COOCCHICCCIIICRHIOCOCIOOORCOCC(byte[] var1) {
      try (MappingsReader var2 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRORROHOCCHCICCCRIRCHRHROCIIC
            .createReader(new ByteArrayInputStream(var1))) {
         var2.read();
      } catch (Throwable var7) {
         throw var7;
      }
   }
}
