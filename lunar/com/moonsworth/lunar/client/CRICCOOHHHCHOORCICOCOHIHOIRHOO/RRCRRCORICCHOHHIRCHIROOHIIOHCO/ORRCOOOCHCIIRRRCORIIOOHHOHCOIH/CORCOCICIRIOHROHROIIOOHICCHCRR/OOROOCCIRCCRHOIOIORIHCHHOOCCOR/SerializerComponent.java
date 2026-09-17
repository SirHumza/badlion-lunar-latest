package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements JsonDeserializer<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> {
   private static final Pattern OIICIHCOORRCCIRRRCRHCHIHHCCRRC = Pattern.compile("^[0-9a-fA-F]{30,100}$");

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR RHOCHHIRRCHHHOHOIRROIROHHHIHIO(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = var1.getAsJsonObject();
      HashMap var5 = new HashMap();
      int var6 = 0;

      for (Entry var8 : var4.entrySet()) {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH((JsonElement)var8.getValue());
         if (var9 == null) {
            var6++;
         } else {
            var5.put((String)var8.getKey(), var9);
         }
      }

      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var5, var6);
   }

   @Nullable
   private static OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonElement var0) {
      try {
         JsonObject var1 = var0.getAsJsonObject();
         JsonElement var2 = var1.get("item");
         if (var2 == null) {
            return null;
         }

         JsonElement var3 = var1.get("color");
         Integer var4 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var3);
         if (var3 != null && var4 == null) {
            return null;
         }

         JsonElement var5 = var1.get("skin");
         String var6 = var5 == null ? null : var5.getAsString();
         return var6 != null && !OIICIHCOORRCCIRRRCRHCHIHHCCRRC.matcher(var6).matches()
            ? null
            : new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getAsString(), var4, var6);
      } catch (RuntimeException var7) {
         return null;
      }
   }

   @Nullable
   private static Integer OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@Nullable JsonElement var0) {
      if (var0 == null) {
         return null;
      }

      String[] var1 = var0.getAsString().split(",");
      if (var1.length != 3) {
         return null;
      }

      try {
         int var2 = Integer.parseInt(var1[0].trim());
         int var3 = Integer.parseInt(var1[1].trim());
         int var4 = Integer.parseInt(var1[2].trim());
         return ROCHIOHIOIOCIIHRORROHIHICOHOCC(var2) && ROCHIOHIOIOCIIHRORROHIHICOHOCC(var3) && ROCHIOHIOIOCIIHRORROHIHICOHOCC(var4)
            ? var2 << 16 | var3 << 8 | var4
            : null;
      } catch (NumberFormatException var5) {
         return null;
      }
   }

   private static boolean ROCHIOHIOIOCIIHRORROHIHICOHOCC(int var0) {
      return var0 >= 0 && var0 <= 255;
   }
}
