package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import org.apache.commons.lang3.mutable.MutableObject;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      super(var1);
   }

   @Override
   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var1.HOCCHIRHIIOOOIHIHHICHRIRIHHHRO();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var2.OHORIIHICICROHHOCRCHOCOCROIIHR()
         .HRCHIOCHOCOHHHHHIRHIHICOIIOROC();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var2.OHORIIHICICROHHOCRCHOCOCROIIHR()
         .IHIIICICOOIOIHRRRRCRCOCCOCOOIH();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var2.RROHROIOCRIORIOIRIHRRRRHRIHRII();
      JsonArray var6 = new JsonArray();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var2.RCIIHIRCRCOCIICOHICIOIOHHCHIOI();
      var7.CCCOHCHHOCROOHORRHHRRHCCRHICOR();

      for (Entry var9 : var3.HORCROOORRICHHOHROIHCRIRRCIRIO()) {
         JsonObject var10 = new JsonObject();
         var10.addProperty("id", ((UUID)var9.getKey()).toString());
         var10.addProperty("name", (String)var9.getValue());
         var10.addProperty("type", "folder");
         UUID var11 = var3.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC((UUID)var9.getKey());
         if (var11 != null) {
            var10.addProperty("parent", var11.toString());
         }

         var6.add(var10);
      }

      for (Entry var19 : var3.entrySet()) {
         if (!var7.CIHRIRCOIROOCHCCRHOIHHIICRIRRC().contains(((File)var19.getValue()).getName())) {
            JsonObject var21 = new JsonObject();
            var21.addProperty("id", ((UUID)var19.getKey()).toString());
            File var23 = (File)var19.getValue();
            var21.addProperty("name", var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH((UUID)var19.getKey(), var23));
            UUID var12 = var3.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC((UUID)var19.getKey());
            if (var12 != null) {
               var21.addProperty("parent", var12.toString());
            }

            MutableObject var13 = new MutableObject("media");
            if (var23.isDirectory()) {
               var13.setValue("folder");
            }

            try {
               if (var4.HRRHRCCOOIOIIIRORIOOORORHOORIH((UUID)var19.getKey())) {
                  String var14 = var2.IOCRRHCRIIIHHOCRRCRHHHOCHRRRIH().IRCIIHHICIHRCOCRROCOICRIHHCCHH((UUID)var19.getKey(), 0);
                  if (var14 != null) {
                     var21.addProperty("thumbnail", var14);
                  }
               }
            } catch (IOException var16) {
               throw new RuntimeException(var16);
            }

            JsonObject var27 = new JsonObject();
            var27.addProperty("max", 10000);
            if (var5 != null && var23.isFile()) {
               var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var23,
                  () -> {
                     try {
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6x = var4.HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(
                           (UUID)var19.getKey()
                        );
                        if (var6x != null) {
                           var13.setValue("gameplay");
                           var27.addProperty("max", var6x.HOCHIRHHHIIIIRRORHOOIRRORROHCI().CIRIRCOIICICIHICIOIICCOHHORICR());
                           String var7x = var2.IOCRRHCRIIIHHOCRRCRHHHOCHRRRIH().IRCIIHHICIHRCOCRROCOICRIHHCCHH((UUID)var19.getKey(), 0);
                           if (var7x != null) {
                              var21.addProperty("thumbnail", var7x);
                              var27.addProperty("thumbnail", var7x);
                           }
                        }
                     } catch (Exception var8) {
                     }
                  },
                  () -> {
                     try {
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5x = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var2.IIOCOIROCRRRHICCRIICCRICCHHIRR(),
                           "media://" + var19.getKey(),
                           var2.HHHCCHCCOHROOHHIRHHCRRHCHCCRHR(),
                           var3,
                           var2.RCIIHIRCRCOCIICOHICIOIOHHCHIOI()
                        );
                        if (var5x.isValid()) {
                           var27.addProperty("max", var5x.CHCRRCICCCHRHCCHICOCIIIHRORHIC());
                        }

                        var13.setValue("audio");
                     } catch (Exception var6x) {
                        var6x.printStackTrace();
                     }
                  },
                  () -> {
                     var13.setValue("image");
                     var21.addProperty(
                        "thumbnail",
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO(
                           var23
                        )
                     );
                     var27.addProperty(
                        "thumbnail",
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO(
                           var23
                        )
                     );
                  }
               );
               var27.addProperty("id", ((UUID)var19.getKey()).toString());
               var27.addProperty("type", (String)var13.getValue());
               var27.addProperty("min", 0);
               var21.addProperty("type", ((String)var13.getValue()).equals("gameplay") ? "media" : (String)var13.getValue());
               var21.add("layer", var27);
            }

            var6.add(var21);
         }
      }

      this.IIHRRHORCRCROCHHOHORCHCROCIHRO("media", var6);
      JsonArray var18 = new JsonArray();
      if (var7.IRIHHHOROHICICOCIOOIHHRRRCOHIO()) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 : var7.OIROCRCCRRRIHIROOROHHRCIOHRCCR()) {
            UUID var24 = var3.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(new File(var2.IIOCOIROCRRRHICCRIICCRICCHHIRR(), var22.name()));
            JsonObject var25 = new JsonObject();
            var25.addProperty("id", var24.toString());
            var25.addProperty("name", var22.name());

            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var26;
            try {
               var26 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var2.IIOCOIROCRRRHICCRIICCRICCHHIRR(), "media://" + var24, var2.HHHCCHCCOHROOHHIRHHCRRHCHCCRHR(), var3, var2.RCIIHIRCRCOCIICOHICIOIOHHCHIOI()
               );
            } catch (IOException var15) {
               throw new RuntimeException(var15);
            }

            JsonObject var28 = new JsonObject();
            var28.addProperty("id", var24.toString());
            var28.addProperty("type", "audio");
            var28.addProperty("min", 0);
            var28.addProperty("max", var26.isValid() ? var26.CHCRRCICCCHRHCCHICOCIIIHRORHIC() : 10000L);
            var25.addProperty("type", "audio");
            var25.addProperty("thumbnail", var22.HICIIHRCRCRICHHORCHCOROIIROCCO());
            var25.add("layer", var28);
            var18.add(var25);
         }
      }

      this.IIHRRHORCRCROCHHOHORCHCROCIHRO("provided", var18);
   }
}
