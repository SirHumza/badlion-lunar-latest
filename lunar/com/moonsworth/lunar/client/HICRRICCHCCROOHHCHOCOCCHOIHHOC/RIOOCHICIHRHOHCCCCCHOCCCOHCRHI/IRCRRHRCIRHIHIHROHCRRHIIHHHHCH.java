package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

public class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private List<Pattern> OIHRCIOCHCRRORCIRRRRICCHICRHCO = new ArrayList<>();
   private List<Pattern> CHORRIRIHHRRIICRICRRIOICHRRHCI = new ArrayList<>();
   @Nullable
   private Pattern HCIOIRCOIHHRIIRCOCIIHROROOOCHH;
   @Nullable
   private Pattern CCROCOCCOHICRHOCROHHCOORCOCOHC;
   private static final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC ICHROHIORIRCORIHCHHHOCOCHICCIC = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar:profanity/profanity_filter.json"
   );

   @Override
   public void close() {
   }

   @Override
   public void init() {
      try {
         Gson var1 = new Gson();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getResourceManager()
            .bridge$getResource(ICHROHIORIRCORIHCHHHOCOCHICCIC);
         if (var2 == null) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Could not find profanity filter json file: " + ICHROHIORIRCORIHCHHHOCOCHICCIC
            );
         } else {
            InputStream var3 = var2.bridge$getInputStream();
            JsonReader var4 = new JsonReader(new InputStreamReader(var3));
            com.moonsworth.lunar.client.OHIIIOHIRIRCCRRIOIICCHHIORRHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = var1.fromJson(
               var4, com.moonsworth.lunar.client.OHIIIOHIRIRCCRRIOIICCHHIORRHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
            );
            var5.HHIOIOOIOHOHHIOCCOHROHOOOCRCIH()
               .RCOROHCIRHICIOHROICCOOCRRHHCIO()
               .stream()
               .map(var0 -> Pattern.compile(var0, 2))
               .forEach(this.OIHRCIOCHCRRORCIRRRRICCHICRHCO::add);
            var5.HHIOIOOIOHOHHIOCCOHROHOOOCRCIH()
               .HIOOCRHCIRCOHCHIOCIIORHCIIRHOC()
               .stream()
               .map(var0 -> Pattern.compile(var0, 2))
               .forEach(this.CHORRIRIHHRRIICRICRRIOICHRRHCI::add);
            String var6 = "\\b(";
            String var7 = ")\\b";
            this.HCIOIRCOIHHRIIRCOCIIHROROOOCHH = Pattern.compile(
               var6 + StringUtils.join(var5.CIIRIHROOOCOHOHOIRROOROHHCHHHH().RCOROHCIRHICIOHROICCOOCRRHHCIO(), "|") + var7, 2
            );
            this.CCROCOCCOHICRHOCROHHCOORCOCOHC = Pattern.compile(
               var6 + StringUtils.join(var5.CIIRIHROOOCOHOHOIRROOROHHCHHHH().HIOOCRHCIRCOHCHIOCIIORHCIIRHOC(), "|") + var7, 2
            );
         }
      } catch (Throwable var8) {
         throw var8;
      }
   }

   @Generated
   public List<Pattern> HHCIRRCCORCIRIHCCIIRRCIOOIOHCR() {
      return this.OIHRCIOCHCRRORCIRRRRICCHICRHCO;
   }

   @Generated
   public List<Pattern> OIIHIIHCCCHOOICHROHOIOROORCIII() {
      return this.CHORRIRIHHRRIICRICRRIOICHRRHCI;
   }

   @Nullable
   @Generated
   public Pattern IRRIRCCIRORIICCIRHHCOCCRRCRORI() {
      return this.HCIOIRCOIHHRIIRCOCIIHROROOOCHH;
   }

   @Nullable
   @Generated
   public Pattern ORCIRORHHRHCCOCCHHIIHCCOHRHHHO() {
      return this.CCROCOCCOHICRHOCROHHCOORCOCOHC;
   }
}
