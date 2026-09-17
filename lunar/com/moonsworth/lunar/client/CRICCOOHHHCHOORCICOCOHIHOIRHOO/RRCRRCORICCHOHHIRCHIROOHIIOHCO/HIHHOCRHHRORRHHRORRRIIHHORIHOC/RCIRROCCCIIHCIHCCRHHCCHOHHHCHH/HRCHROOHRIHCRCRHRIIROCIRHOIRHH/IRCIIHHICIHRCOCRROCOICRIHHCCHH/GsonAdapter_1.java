package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;

@RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final String[] CRCHOCHORIHICORHICHOIRIIOIRHRO = new String[]{
      "mp3", "wav", "aiff", "aif", "aifc", "au", "snd", "mid", "midi", "rmi", "ogg", "opus", "oga", "m4a", "caf"
   };
   public static final String[] ROIRRRROIIHOOIHHHCOORHOOCORIRI = new String[]{"rewind"};
   public static final String[] OCOCIOCIIOROHHHCHRHIRCOHIHHOOC = new String[]{"png", "jpg", "jpeg", "gif", "bmp", "tiff", "webp", "svg"};
   public static final String[] HCHRRRICHHOHRCROCIOIOROIHIIOCI = (String[])ArrayUtils.addAll(
      CRCHOCHORIHICORHICHOIRIIOIRHRO, (String[])ArrayUtils.addAll(ROIRRRROIIHOOIHHHCOORHOOCORIRI, OCOCIOCIIOROHHHCHRHIRCOHIHHOOC)
   );
   private final BiMap<UUID, File> OIRCRCICHHIIOORHIOIRCHCORCOCHR = HashBiMap.create();
   private final Map<UUID, String> IRRRIRCIIRROHHOIORCIHHOIRICRIH = new LinkedHashMap<>();
   private final Map<UUID, UUID> CCIHCCCCCOHOICOCHROCHOIOICCIRC = new HashMap<>();
   private final Map<UUID, String> OOORHHCCIHHCCRHHCRRIHOCRRRHHIH = new HashMap<>();

   public Set<Entry<UUID, File>> entrySet() {
      return this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.entrySet();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, File var2) {
      if (!this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.containsValue(var2)) {
         this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.put(var1, var2);
      }
   }

   public UUID HICHRCOHCCRHOHCICOOCHOIHCCHIRI(File var1) {
      UUID var2 = (UUID)this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.inverse().get(var1);
      if (var2 != null) {
         return var2;
      }

      var2 = UUID.randomUUID();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
      return var2;
   }

   public File IOHHOIIOCRHCHHCRORICCOHOHROOIH(UUID var1) {
      if (this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var1)) {
         this.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var1);
         return null;
      } else {
         this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.remove(var1);
         this.OOORHHCCIHHCCRHHCRRIHOCRRRHHIH.remove(var1);
         return (File)this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.remove(var1);
      }
   }

   private void IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(UUID var1) {
      for (UUID var3 : this.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var1)) {
         this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var3);
      }

      this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.remove(var1);
      this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.remove(var1);
      this.OOORHHCCIHHCCRHHCRRIHOCRRRHHIH.remove(var1);
   }

   private List<UUID> RHCHRCOCCOIIIHCHRHIRCORHRHRICR(UUID var1) {
      ArrayList var2 = new ArrayList();

      for (Entry var4 : this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.entrySet()) {
         if (((UUID)var4.getValue()).equals(var1)) {
            var2.add((UUID)var4.getKey());
         }
      }

      return var2;
   }

   public File RCCCROCHCICCROHCOCCRRROCIIHCCH(UUID var1) {
      return (File)this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.get(var1);
   }

   public Set<Entry<UUID, String>> HORCROOORRICHHOHROIHCRIRRCIRIO() {
      return this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.entrySet();
   }

   public boolean OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(UUID var1) {
      return this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var1);
   }

   public UUID RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(UUID var1) {
      return this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.get(var1);
   }

   public UUID RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, UUID var2) {
      UUID var3 = UUID.randomUUID();
      this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.put(var3, var1);
      if (var2 != null && this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var2)) {
         this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.put(var3, var2);
      }

      return var3;
   }

   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1, File var2) {
      if (this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var1)) {
         return this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.get(var1);
      } else {
         String var3 = this.OOORHHCCIHHCCRHHCRRIHOCRRRHHIH.get(var1);
         if (var3 != null) {
            return var3;
         } else {
            return var2 == null ? "" : var2.getName();
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1, String var2) {
      if (var2 != null && !var2.isEmpty()) {
         if (this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var1)) {
            this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.put(var1, var2);
         } else if (this.OIRCRCICHHIIOORHIOIRCHCORCOCHR.containsKey(var1)) {
            this.OOORHHCCIHHCCRHHCRRIHOCRRRHHIH.put(var1, var2);
         }
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(UUID var1, UUID var2) {
      if (!var1.equals(var2)) {
         if (!this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var1) || !this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var1)) {
            if (var2 == null) {
               this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.remove(var1);
            } else if (this.IRRRIRCIIRROHHOIORCIHHOIRICRIH.containsKey(var2)) {
               this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.put(var1, var2);
            }
         }
      }
   }

   private boolean CRRRICCRROCOHHOHIICIHORCOORRRH(UUID var1, UUID var2) {
      UUID var3 = var1;
      int var4 = 0;

      while (var3 != null && var4++ < 1000) {
         if (var3.equals(var2)) {
            return true;
         }

         var3 = this.CCIHCCCCCOHOICOCHROCHOIOICCIRC.get(var3);
      }

      return false;
   }

   public static String IIHRRHORCRCROCHHOHORCHCROCIHRO(File var0) {
      String var1 = var0.getAbsolutePath();
      return "file:///" + var1 + "?v=" + var0.lastModified();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      UUID var2,
      Runnable var3,
      Runnable var4,
      Runnable var5
   ) {
      File var6 = this.RCCCROCHCICCROHCOCCRRROCIIHCCH(var2);
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var1.RCIIHIRCRCOCIICOHICIOIOHHCHIOI();
      if (var6 != null && var7.CIHRIRCOIROOCHCCRHOIHHIICRIRRC().contains(var6.getName())) {
         var6 = new File(var7.IICHCHRCOCCCICCIIHIHRROOOOOIRH(), var6.getName());
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var3, var4, var5);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, Runnable var2, Runnable var3, Runnable var4) {
      if (var1 != null && var1.isFile()) {
         if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, ROIRRRROIIHOOIHHHCOORHOOCORIRI)) {
            var2.run();
         } else if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, CRCHOCHORIHICORHICHOIRIIOIRHRO)) {
            var3.run();
         } else if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, OCOCIOCIIOROHHHCHRHIRCOHIHHOOC)) {
            var4.run();
         }
      }
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, String[] var2) {
      for (String var6 : var2) {
         if (var1.getName().endsWith(var6)) {
            return true;
         }
      }

      return false;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
      private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRROHOOHRRORCCCHRIHRHCCOHCRHRO;

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         JsonObject var3 = new JsonObject();
         JsonObject var4 = new JsonObject();

         for (Entry var6 : var2.OIRCRCICHHIIOORHIOIRCHCORCOCHR.entrySet()) {
            String var7 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               (File)var6.getValue(), this.RRROHOOHRRORCCCHRIHRHCCOHCRHRO.IIOCOIROCRRRHICCRIICCRICCHHIRR()
            );
            var4.addProperty(((UUID)var6.getKey()).toString(), var7);
         }

         var3.add("media", var4);
         JsonObject var10 = new JsonObject();

         for (Entry var13 : var2.IRRRIRCIIRROHHOIORCIHHOIRICRIH.entrySet()) {
            var10.addProperty(((UUID)var13.getKey()).toString(), (String)var13.getValue());
         }

         var3.add("folders", var10);
         JsonObject var12 = new JsonObject();

         for (Entry var8 : var2.CCIHCCCCCOHOICOCHROCHOIOICCIRC.entrySet()) {
            var12.addProperty(((UUID)var8.getKey()).toString(), ((UUID)var8.getValue()).toString());
         }

         var3.add("parents", var12);
         JsonObject var15 = new JsonObject();

         for (Entry var9 : var2.OOORHHCCIHHCCRHHCRRIHOCRRRHHIH.entrySet()) {
            var15.addProperty(((UUID)var9.getKey()).toString(), (String)var9.getValue());
         }

         var3.add("names", var15);
         this.RRROHOOHRRORCCCHRIHRHCCOHCRHRO.RCOCRROHHROHHOCRCCCHCIROIIOORC().toJson(var3, var1);
      }

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH IIOIROIHIHHCCRICRCOOCHIICHRCOI(JsonReader var1) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
         JsonObject var3 = this.RRROHOOHRRORCCCHRIHRHCCOHCRHRO.RCOCRROHHROHHOCRCCCHCIROIIOORC().fromJson(var1, JsonObject.class);
         if (var3 == null) {
            return var2;
         }

         if (var3.has("media") && var3.get("media").isJsonObject()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3.getAsJsonObject("media"));
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "folders", var2.IRRRIRCIIRROHHOIORCIHHOIRICRIH);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "names", var2.OOORHHCCIHHCCRHHCRRIHOCRRRHHIH);
            if (var3.has("parents") && var3.get("parents").isJsonObject()) {
               for (Entry var5 : var3.getAsJsonObject("parents").entrySet()) {
                  try {
                     var2.CCIHCCCCCOHOICOCHROCHOIOICCIRC
                        .put(UUID.fromString((String)var5.getKey()), UUID.fromString(((JsonElement)var5.getValue()).getAsString()));
                  } catch (Exception var7) {
                     var7.printStackTrace();
                  }
               }
            }
         } else {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3);
         }

         return var2;
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, JsonObject var2) {
         for (Entry var4 : var2.entrySet()) {
            File var5 = this.RRROHOOHRRORCCCHRIHRHCCOHCRHRO
               .IIOCOIROCRRRHICCRIICCRICCHHIRR()
               .toPath()
               .resolve(((JsonElement)var4.getValue()).getAsString())
               .toFile();

            try {
               var1.OIRCRCICHHIIOORHIOIRCHCORCOCHR.put(UUID.fromString((String)var4.getKey()), var5);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, String var2, Map<UUID, String> var3) {
         if (var1.has(var2) && var1.get(var2).isJsonObject()) {
            for (Entry var5 : var1.getAsJsonObject(var2).entrySet()) {
               try {
                  var3.put(UUID.fromString((String)var5.getKey()), ((JsonElement)var5.getValue()).getAsString());
               } catch (Exception var7) {
                  var7.printStackTrace();
               }
            }
         }
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         this.RRROHOOHRRORCCCHRIHRHCCOHCRHRO = var1;
      }
   }
}
