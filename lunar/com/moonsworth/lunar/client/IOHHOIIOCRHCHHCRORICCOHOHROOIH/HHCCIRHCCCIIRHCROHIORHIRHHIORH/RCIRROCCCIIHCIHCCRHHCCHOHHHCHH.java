package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.javascript.CallbackJS;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final int RIRRCIIOOCHCOHHCCRHORIRORROCOI = 8;

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return null;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.add(
         "feather",
         OCOHORHCROHICRRIHCIHHRRCIHICRI(
            com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ROOHOOIICHIIRRHIORCRHRRCHRHRHC(), ".json"
         )
      );
      var1.add(
         "badlion",
         OCOHORHCROHICRRIHCIHHRRCIHICRI(
            com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORCHCHHICCIRIOCHIIRRRIRCOHCOCR(), ".zip"
         )
      );
      var1.addProperty(
         "maxImports",
         Math.max(
            0, 8 - IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCCIROHIHIOOOIOOCIRORHCRROIROR().RIIHCRRCIRICIHHHIROCRHCHCCCHHI().size()
         )
      );
      return var1;
   }

   private static JsonArray OCOHORHCROHICRRIHCIHHRRCIHICRI(List<File> var0, String var1) {
      JsonArray var2 = new JsonArray();

      for (File var4 : var0) {
         String var5 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, var1);
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5);
         var6.addProperty("file", var4.getAbsolutePath());
         var2.add(var6);
      }

      return var2;
   }

   private static String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(File var0, String var1) {
      if (var1.equals(".zip")) {
         String var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var0);
         if (var2 != null && !var2.isBlank()) {
            return var2;
         }
      }

      String var3 = var0.getName();
      return var3.length() > var1.length() ? var3.substring(0, var3.length() - var1.length()) : var3;
   }

   @CallbackJS("importProfiles")
   public static String IOCCCRIHOCHRCHRHCRHROIRIRHHHIR(String var0, String var1) {
      boolean var2 = "badlion".equals(var0);
      int var3 = 0;
      int var4 = 0;

      for (JsonElement var6 : JsonParser.parseString(var1).getAsJsonArray()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCCIROHIHIOOOIOOCIRORHCRROIROR().RIIHCRRCIRICIHHHIROCRHCHCCCHHI().size() >= 8) {
            var4++;
         } else {
            File var7 = new File(var6.getAsString());

            try {
               String var8 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var7, var2 ? ".zip" : ".json");
               if (var2) {
                  CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var7, var8);
               } else {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var7, var8);
               }

               var3++;
            } catch (Exception var9) {
               var4++;
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Failed to import profile from %s: %s", var7, var9.getMessage()
               );
            }
         }
      }

      JsonObject var10 = new JsonObject();
      var10.addProperty("imported", var3);
      var10.addProperty("failed", var4);
      return var10.toString();
   }

   @CallbackJS("close")
   public static void close() {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
      var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.OIIRHCIIOOOORRRORIICHOCOHCROIR);
      var0.IHHIROCCORIIICOHCHOOHIIIICIOCR()
         .add(
            () -> {
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0x = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  null
               );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$displayScreen(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null
                              ? new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                                 var0x
                              )
                              : var0x
                        )
                  );
            }
         );
   }
}
