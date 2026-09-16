package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final File OHICOOCOIOCHRCHRIHCRIIRCROCCOH = new File(
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "resourcepacks"
   );
   private long RHIORORRRRCCRORIOCHRRHOCHHRCIO = 0L;
   private JsonArray IOROOIHRHHORIHRIRORICIHCCCRHOR = new JsonArray();

   @Override
   public JsonElement provide() {
      return this.HRRORHCRHHRROHIOROOOORRIRRCCIC();
   }

   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      if (System.currentTimeMillis() - this.RHIORORRRRCCRORIOCHRRHOCHHRCIO < 2000L) {
         return this.IOROOIHRHHORIHRIRORICIHCCCRHOR;
      }

      this.RHIORORRRRCCRORIOCHRRHOCHHRCIO = System.currentTimeMillis();
      JsonArray var1 = new JsonArray();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OHICOOCOIOCHRCHRIHCRIIRCROCCOH, var1);
      File var2 = new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "assets");

      for (File var4 : IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getAllBuiltInPacksFiles()) {
         JsonObject var5 = new JsonObject();
         String var6 = var4.getName();
         String var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getBuiltInPackName(new File(var4.getName()).getName());
         if (var7 != null) {
            var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("rewind", var7);
         }

         var5.addProperty("name", var6);
         var5.addProperty("path", HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var2));
         var5.addProperty("type", "pack");
         var1.add(var5);
      }

      return this.IOROOIHRHHORIHRIRORICIHCCCRHOR = var1;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, JsonArray var2) {
      File[] var3 = var1.listFiles();
      if (var3 != null) {
         for (File var7 : var3) {
            JsonObject var8 = new JsonObject();
            var8.addProperty("name", var7.getName());
            if (var7.isDirectory() && !new File(var7, "pack.mcmeta").exists()) {
               JsonArray var9 = new JsonArray();
               var8.addProperty("type", "folder");
               var8.add("packs", var9);
               var2.add(var8);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9);
            } else if (!var7.isDirectory() && var7.getName().endsWith(".zip") || var7.isDirectory() && new File(var7, "pack.mcmeta").exists()) {
               var8.addProperty("path", HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, this.OHICOOCOIOCHRCHRIHCRIIRCROCCOH));
               var8.addProperty("type", "pack");
               var2.add(var8);
            }
         }
      }
   }
}
