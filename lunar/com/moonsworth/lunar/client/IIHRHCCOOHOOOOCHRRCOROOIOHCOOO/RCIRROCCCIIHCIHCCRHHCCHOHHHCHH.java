package com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;

import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import lombok.Generated;
import org.apache.commons.io.FileUtils;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Runnable {
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH RRRRHRHRIRROCCCHOORCCROOIRRRCC;

   @Override
   public void run() {
      Path var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.RHOIRIICHCIRHHOORORIIRCRCRRIHH;
      String var2 = this.RRRRHRHRIRROCCCHOORCCROOIRRRCC.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().toString() + ".png";
      String var3 = RIROICHCRROROHCCROOCCCCOCHCCRI.IICOOHORRRRHICOCRHCRCHCOHRHRHC()
         + "/face/"
         + this.RRRRHRHRIRROCCCHOORCCROOIRRRCC.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI();
      File var4 = var1.resolve(var2).toFile();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Avatar", "Downloading http texture from %s to %s", var3, var4.getName()
      );
      HttpURLConnection var5 = null;

      try {
         var5 = (HttpURLConnection)new URL(var3).openConnection();
         var5.setDoInput(true);
         var5.setDoOutput(false);
         var5.connect();
         if (var5.getResponseCode() == 200) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               "Avatar", "Updated user avatar successfully"
            );
            FileUtils.copyInputStreamToFile(var5.getInputStream(), var4);
            this.RRRRHRHRIRROCCCHOORCCROOIRRRCC.HROICORRORCIOIHHOROICROHIOCHIO(var4.getName());
         }
      } catch (Exception var10) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Avatar", "Couldn't download http texture", var10
         );
      } finally {
         if (var5 != null) {
            var5.disconnect();
         }
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.RRRRHRHRIRROCCCHOORCCROOIRRRCC = var1;
   }
}
