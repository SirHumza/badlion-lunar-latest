package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import io.sentry.Attachment;
import io.sentry.Sentry;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import software.bernie.geckolib3.core.builder.Animation;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      JsonObject var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      if (var4 == null) {
         return var3;
      }

      for (Entry var7 : com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(
         var4
      )) {
         String var8 = (String)var7.getKey();

         try {
            Animation var9 = com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                  var4, var8
               ),
               var1
            );
            var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var9);
         } catch (JSONException var11) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Could not load animation: {}", var8, var11
            );
            throw new RuntimeException(var11);
         }
      }

      return var3;
   }

   private JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2) {
      String var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);

      try {
         JsonReader var4 = new JsonReader(new StringReader(var3));
         return new Gson().getAdapter(JsonObject.class).read(var4);
      } catch (Exception var7) {
         if (var3 != null) {
            byte[] var5 = var3.getBytes(StandardCharsets.UTF_8);
            Attachment var6 = new Attachment(var5, "animation-file-loader.json");
            Sentry.configureScope(var1x -> var1x.addAttachment(var6));
         }

         throw var7;
      }
   }

   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = var1.bridge$getResource(var0);
      if (var2 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Couldn't find: " + var0);
         throw new RuntimeException(new FileNotFoundException(var0.toString()));
      }

      try (InputStream var3 = var2.bridge$getInputStream()) {
         return IOUtils.toString(var3, StandardCharsets.UTF_8);
      } catch (Exception var8) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn("Couldn't load: " + var0, var8);
         throw new RuntimeException("Failed to load " + var0.toString(), var8);
      }
   }
}
