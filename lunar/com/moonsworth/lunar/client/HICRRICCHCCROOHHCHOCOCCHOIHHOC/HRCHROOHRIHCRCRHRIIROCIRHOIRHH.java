package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC;

import com.google.common.io.Files;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import io.sentry.Attachment;
import io.sentry.Hint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC();

   default File CCOICRRHOHHHHROOOROIHIRHHCCIHI() {
      return new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI, this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC());
   }

   default boolean CRCRRCIIHIRCOHOOORROOCOROOHCRR() {
      return false;
   }

   default boolean RROCHHOICHHIRRHICHORHRCOHCROHI() {
      return false;
   }

   default boolean OHRRCRHHCOHOHHCORRROHROOCOCCHH() {
      File var1 = this.CCOICRRHOHHHHROOOROIHIRHHCCIHI();
      if (!var1.exists()) {
         return false;
      }

      try (BufferedReader var2 = Files.newReader(var1, Charset.defaultCharset())) {
         JsonElement var3 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var2, JsonElement.class);
         if (var3 != null && var3.isJsonObject()) {
            this.load(var3.getAsJsonObject());
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               "Loaded File: [%s]", this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC()
            );
         }

         return true;
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Couldn't load file %s [%s]", this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC(), var7.getMessage()
         );
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var1);
         return false;
      }
   }

   default void HRIIIOIIRHOHORIRICIOIORRIRCHHO() {
      this.RHHIIRORCOIORHIOHRHCIHRHHIRCRH(false);
   }

   default void RHHIIRORCOIORHIOHRHCIHRHHIRCRH(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() == null
         || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() == null
         || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || this == IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROIHOHCHRCCRRCROCIIHOCHICCOO()) {
         File var2 = this.CCOICRRHOHHHHROOOROIHIRHHCCIHI();
         boolean var3 = var2.exists();
         JsonObject var4 = new JsonObject();

         try {
            if (!var1 && this.RROCHHOICHHIRRHICHORHRCOHCROHI() && var3) {
               try (BufferedReader var5 = Files.newReader(var2, Charset.defaultCharset())) {
                  JsonElement var6 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var5, JsonElement.class);
                  if (var6 != null && var6.isJsonObject()) {
                     var4 = var6.getAsJsonObject();
                  }
               }
            }
         } catch (Exception var13) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Couldn't load file %s [%s]", this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC(), var13.getMessage()
            );
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var2);
         }

         try {
            if (!var3 && !var2.createNewFile()) {
               return;
            }

            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);

            try (FileWriter var14 = new FileWriter(var2)) {
               if (this.CRCRRCIIHIRCOHOOORROOCOROOHCRR()) {
                  IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRCCROROOHROIRIHCICROOIHHOOICI.toJson(var4, var14);
               } else {
                  IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var4, var14);
               }

               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  "Saved File: [%s]", this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC()
               );
            }
         } catch (Exception var10) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Couldn't save to " + this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() + " [%s]", var10.getMessage()
            );
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var2);
         }
      }
   }

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Exception var1, File var2) {
      com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         "Savable",
         !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR,
         var2 == null ? null : Hint.withAttachment(new Attachment(var2.getAbsolutePath()))
      );
   }
}
