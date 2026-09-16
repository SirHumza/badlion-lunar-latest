package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.COIOORHCRHCRCOROOHCHIRRIIOIOHR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import io.leangen.geantyref.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import lombok.Generated;
import org.apache.commons.io.FilenameUtils;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Gson IOROOHOHHRIHOORIHHHHROIHHRORHO = new GsonBuilder().create();
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC COICCROOIRHIHOIHCHCRIOCCHRHRRR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar-jit", "downloaded_index.json"
   );
   private final Map<String, String> IOCOOHIIROHCCHIHOHHHCCICOIIORR = new ConcurrentHashMap<>();
   private final com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOIOOCCORROCRRHCOCCRRORORCCCHR;

   public void start() {
      try {
         Path var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC.resolve(COICCROOIRHIHOIHCHCRIOCCHRHRRR.bridge$getPath());
         if (Files.notExists(var1)) {
            Files.createDirectories(var1.getParent());
            Files.createFile(var1);
         }

         try (BufferedReader var2 = Files.newBufferedReader(var1)) {
            TypeToken var3 = new TypeToken<Map<String, String>>() {};
            this.IOCOOHIIROHCCHIHOHHHCCICOIIORR
               .putAll(Objects.requireNonNullElse(IOROOHOHHRIHOORIHHHHROIHHRORHO.fromJson(var2, var3.getType()), new HashMap<>()));
         }

         ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(this::CIHCCIICHICIOCOIIICIIIHRRICCIO);
      } catch (IOException var7) {
         throw var7;
      }
   }

   public void stop() {
      try {
         Path var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC.resolve(COICCROOIRHIHOIHCHCRIOCCHRHRRR.bridge$getPath());

         try (BufferedWriter var2 = Files.newBufferedWriter(var1, StandardCharsets.UTF_8)) {
            IOROOHOHHRIHOORIHHHHROIHHRORHO.toJson(this.IOCOOHIIROHCCHIHOHHHCCICOIIORR, var2);
         }
      } catch (IOException var7) {
         throw var7;
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, boolean var2) {
      String var3 = CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
      this.HOIOOCCORROCRRHCOCCRRORORCCCHR.CHHOOCORICIHCOHRRCOIRRCIOORRIC(var3).ifPresent(var2x -> this.IOCOOHIIROHCCHIHOHHHCCICOIIORR.put(var3, var2x));
   }

   private void CIHCCIICHICIOCOIIICIIIHRRICCIO() {
      Path var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC.resolve(COICCROOIRHIHOIHCHCRIOCCHRHRRR.bridge$getPath());

      try (Stream var2 = Files.walk(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC)) {
         int var3 = var2.filter(var0 -> Files.isRegularFile(var0))
            .filter(var1x -> !var1x.equals(var1))
            .filter(this::RHOCHHIRRCHHHOHOIRROIROHHHIHIO)
            .map(COIOORHCRHCRCOROOHCHIRRIIOIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Files::deleteIfExists))
            .mapToInt(var0 -> var0 ? 1 : 0)
            .sum();
         if (var3 > 0) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "JIT", "Cleaned up %d JIT files!", var3
            );
         }
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "JIT", "Could not clean up JIT files!" + var7.getMessage()
         );
      }
   }

   private boolean RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Path var1) {
      Path var2 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC.relativize(var1);
      String var3 = FilenameUtils.separatorsToUnix(var2.toString());
      Optional var4 = this.HOIOOCCORROCRRHCOCCRRORORCCCHR.CHHOOCORICIHCOHRRCOIRRCIOORRIC(var3);
      if (var4.isEmpty()) {
         return true;
      }

      String var5 = this.IOCOOHIIROHCCHIHOHHHCCICOIIORR.get(var3);
      return var5 == null ? true : var4.<Boolean>map(var1x -> !var1x.equals(var5)).get();
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.HOIOOCCORROCRRHCOCCRRORORCCCHR = var1;
   }
}
