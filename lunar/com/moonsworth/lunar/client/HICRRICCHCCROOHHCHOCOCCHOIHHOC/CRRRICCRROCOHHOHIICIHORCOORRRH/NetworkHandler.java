package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import lombok.Generated;
import org.apache.commons.io.FileUtils;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Runnable {
   private final List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHOICRHOIHOCHRRCCICCRCHHOHCROO;

   @Override
   public void run() {
      Path var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRHIIROORHCIHCHRIHHROOHRRIOHIH;

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : this.OHOICRHOIHOCHRRCCICCRCHHOHCROO) {
         File var4 = var1.resolve(var3.getHash() + "." + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIIOIOCRHCOHHCROOIIROICRCCIHHC.subtype()).toFile();
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            "BlogPost", "Downloading http texture from %s to %s", var3.getImageUrl(), var4.getName()
         );
         HttpURLConnection var5 = null;

         try {
            var5 = (HttpURLConnection)new URL(var3.getImageUrl()).openConnection();
            var5.setDoInput(true);
            var5.setDoOutput(false);
            var5.connect();
            if (var5.getResponseCode() == 200) {
               FileUtils.copyInputStreamToFile(var5.getInputStream(), var4);
               var3.HROICORRORCIOIHHOROICROHIOCHIO(var4.getName());
            }
         } catch (Exception var10) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "BlogPost", "Couldn't download http texture", var10
            );
         } finally {
            if (var5 != null) {
               var5.disconnect();
            }
         }
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHOOIHHIHCRCCROOCIOOIHCRCHICR()
         .IRCCIIIOCIRCCCROHOHOROORRHOHHI();
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
      this.OHOICRHOIHOCHRRCCICCRCHHOHCROO = var1;
   }
}
