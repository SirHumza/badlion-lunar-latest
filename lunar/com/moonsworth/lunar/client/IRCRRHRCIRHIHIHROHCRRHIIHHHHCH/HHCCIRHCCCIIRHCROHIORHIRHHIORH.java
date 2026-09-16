package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;
import org.apache.commons.io.FileUtils;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public static final ImmutableList<String> OCCCOCOICICIHHHIIROCRCRRHCCRRC = ImmutableList.of("Arena PvP", "Hypixel Skyblock", "UHC");
   private static final ImmutableList<String> RRIRIOOOHIOCHHOCHHHHOHHOHHIIHR = ImmutableList.of(
      "controls.json", "general.json", "mods.json", "performance.json"
   );
   private final List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHROHHOHORROHCHHHIROICOCRIROCI = new LinkedList<>();
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH HHHHHHOHHRRRHOIHIORORHRRRCCRII;
   private long IIHCROOHRHROIICCCRIOOHHOIOIRII;
   private boolean CCIRHOOHOIIIIIIORHRHRRHIIHORHC;
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH CHIRRRORHIHOHCRRHORCHRCHIHOIRO;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, var1 -> {
         if (this.CHIRRRORHIHOHCRRHORCHRCHIHOIRO != null) {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CHIRRRORHIHOHCRRHORCHRCHIHOIRO);
            this.CHIRRRORHIHOHCRRHORCHRCHIHOIRO = null;
         }
      });
   }

   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> RIIHCRRCIRICIHHHIROCRHCHCCCHHI() {
      LinkedList var1 = new LinkedList<>(this.HHROHHOHORROHCHHHIROICOCRIROCI);
      var1.sort((var0, var1x) -> var0.ICHIHRICHHCRIRHCRRHHIHORIIORIH() ? 1 : (var1x.ICHIHRICHHCRIRHCRRHHIHORIIORIH() ? -1 : 0));
      return var1;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CCORIIRRHRRHCOIOICCIHIHOOOHOOI() {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 : this.HHROHHOHORROHCHHHIROICOCRIROCI) {
         if (var2.ICHIHRICHHCRIRHCRRHHIHORIIORIH()) {
            return var2;
         }
      }

      return null;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      if (this.HHHHHHOHHRRRHOIHIORORHRRRCCRII.equals(var1)) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Profile", "We are attempt to switch to the current loaded profile."
         );
      } else {
         this.IIHCROOHRHROIICCCRIOOHHOIOIRII = System.currentTimeMillis();
         this.CCIRHOOHOIIIIIIORHRHRRHIIHORHC = true;

         try {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHHIHROORHHOOCCOOCHRIRHRHCRHIH().close();
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HRIIIOIIRHOHORIRICIOIORRIRCHHO();
            this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHHIHROORHHOOCCOOCHRIRHRHCRHIH().init();
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().OHRRCRHHCOHOHHCORRROHROOCOCCHH();
         } finally {
            this.CCIRHOOHOIIIIIIORHRHRRHIIHORHC = false;
         }
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.CHIRRRORHIHOHCRRHORCHRCHIHOIRO = var1;
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HHROHHOHORROHCHHHIROICOCRIROCI.remove(var1);

      try {
         FileUtils.deleteDirectory(var1.getFile());
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HIOHHOOIORRRIHRIRRIRROHCHCOHCI(String var1) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.IHHHHRRIICCICIIHIRHOORRICCHROO(), var1, false, false);
      this.HHROHHOHORROHCHHHIROICOCRIROCI.add(var2);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      return var2;
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HHHHHHOHHRRRHOIHIORORHRRRCCRII.setActive(false);
      var1.setActive(true);
      this.HHHHHHOHHRRRHOIHIORORHRRRCCRII = var1;
   }

   @Override
   public void close() {
      this.HIOCIHCOHORCROIOCRCCIRHCRHIICC();
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      boolean var2 = this.HHROHHOHORROHCHHHIROICOCRIROCI.stream().anyMatch(var1x -> var1x.getName().equalsIgnoreCase(var1.getName()));
      if (!var2) {
         this.HHROHHOHORROHCHHHIROICOCRIROCI.add(var1);
      }
   }

   public void HIOCIHCOHORCROIOCRCCIRHCRHIICC() {
      JsonArray var1 = this.IRRIORRHHRCHCCICHHHOHRIOHCICOO();
      File var2 = new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + "profile_manager.json");

      try {
         if (!var2.exists() && !var2.createNewFile()) {
            return;
         }

         try (FileWriter var3 = new FileWriter(var2)) {
            IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var1, var3);
         }
      } catch (Exception var8) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Couldn't save to file [%s]", var8.getMessage()
         );
      }
   }

   private JsonArray IRRIORRHHRCHCCICHHHOHRIOHCICOO() {
      JsonArray var1 = new JsonArray();

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.HHROHHOHORROHCHHHIROICOCRIROCI) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("name", var3.getName());
         var4.addProperty("displayName", var3.getDisplayName());
         var4.addProperty("default", var3.ICHIHRICHHCRIRHCRRHHIHORIIORIH());
         var4.addProperty("active", var3.isActive());
         var4.addProperty("iconName", var3.IIOIIHCOIHHRHROCRRHHRCICCIROOO());
         var4.addProperty("server", var3.getServer());
         var1.add(var4);
      }

      return var1;
   }

   @Override
   public void init() {
      File var1 = new File(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + "profile_manager.json");
      if (!var1.exists()) {
         this.HHHHHHOHHRRRHOIHIORORHRRRCCRII = new IRCIIHHICIHRCOCRROCOICRIHHCCHH("Default", true, true);
         this.HHROHHOHORROHCHHHIROICOCRIROCI.add(this.HHHHHHOHHRRRHOIHIORORHRRRCCRII);
         UnmodifiableIterator var11 = OCCCOCOICICIHHHIIROCRCRRHCCRRC.iterator();

         while (var11.hasNext()) {
            String var12 = (String)var11.next();
            this.OCIIIOHOHHRROOCROROHORIRHRRHIR(var12);
         }
      } else {
         try {
            JsonParser var2 = new JsonParser();
            JsonElement var3 = var2.parse(new FileReader(var1));
            if (var3.isJsonArray()) {
               for (JsonElement var5 : var3.getAsJsonArray()) {
                  JsonObject var6 = var5.getAsJsonObject();
                  String var7 = var6.has("iconName") && !var6.get("iconName").isJsonNull() ? var6.get("iconName").getAsString() : "";
                  String var8 = var6.has("server") && !var6.get("server").isJsonNull() ? var6.get("server").getAsString() : "";
                  IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var6.get("name").getAsString(),
                     var6.get("displayName").getAsString(),
                     var6.get("default").getAsBoolean(),
                     var6.get("active").getAsBoolean(),
                     var7
                  );
                  var9.IOHHICHRIHCRCIIIROCCHICCIRCIII(var8);
                  this.HHROHHOHORROHCHHHIROICOCRIROCI.add(var9);
                  if (var9.isActive()) {
                     this.HHHHHHOHHRRRHOIHIORORHRRRCCRII = var9;
                  }
               }
            }
         } catch (Exception var10) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Couldn't load file [" + var10.getMessage() + "]"
            );
         }

         if (this.HHHHHHOHHRRRHOIHIORORHRRRCCRII == null) {
            this.HHHHHHOHHRRRHOIHIORORHRRRCCRII = new IRCIIHHICIHRCOCRROCOICRIHHCCHH("Default", true, true);
            this.HHROHHOHORROHCHHHIROICOCRIROCI.add(this.HHHHHHOHHRRRHOIHIORORHRRRCCRII);
         }
      }
   }

   private void OCIIIOHOHHRROOCROROHORIRHRRHIR(String var1) {
      this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, -1);
   }

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RHOCHHIRRCHHHOHOIRROIROHHHIHIO(String var1, int var2) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, false, false);
      switch (var1) {
         case "Arena PvP":
            var3.HOOCCCHOCRCIIHRCICICIHHOHRCCRC("crossed-swords");
            break;
         case "Hypixel Skyblock":
            var3.HOOCCCHOCRCIIHRCICICIHHOHRCCRC("hypixel");
            break;
         case "UHC":
            var3.HOOCCCHOCRCIIHRCICICIHHOHRCCRC("apple");
      }

      UnmodifiableIterator var11 = RRIRIOOOHIOCHHOCHHHHOHHOHHIIHR.iterator();

      while (var11.hasNext()) {
         String var12 = (String)var11.next();

         try {
            InputStream var6 = this.getClass().getResourceAsStream("/assets/profiles/" + var1 + "/" + var12);
            byte[] var7 = new byte[var6.available()];
            var6.read(var7);
            File var8 = new File(var3.getFile() + File.separator + var12);
            FileOutputStream var9 = new FileOutputStream(var8);
            var9.write(var7);
         } catch (IOException var10) {
            var10.printStackTrace();
         }
      }

      if (var2 == -1) {
         this.HHROHHOHORROHCHHHIROICOCRIROCI.add(var3);
      } else {
         this.HHROHHOHORROHCHHHIROICOCRIROCI.add(var2, var3);
      }

      return var3;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      if (this.HHHHHHOHHRRRHOIHIORORHRRRCCRII != null) {
         var1.addProperty("activeProfile", this.HHHHHHOHHRRRHOIHIORORHRRRCCRII.getName());
      }

      JsonArray var2 = new JsonArray();
      UnmodifiableIterator var3 = OCCCOCOICICIHHHIIROCRCRRHCCRRC.iterator();

      while (var3.hasNext()) {
         String var4 = (String)var3.next();
         var2.add(var4);
      }

      var1.add("defaultProfiles", var2);
      var1.add("profiles", this.IRRIORRHHRCHCCICHHHOHRIOHCICOO());
      return var1;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      String var2 = var1.getName();
      if (!OCCCOCOICICIHHHIIROCRCRRHCCRRC.contains(var2)) {
         return null;
      }

      int var3 = this.HHROHHOHORROHCHHHIROICOCRIROCI.indexOf(var1);
      if (var1.isActive()) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CCORIIRRHRRHCOIOICCIHIHOOOHOOI());
      }

      this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      return this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var2, var3);
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH IHHHHRRIICCICIIHIRHOORRICCHROO() {
      return this.HHHHHHOHHRRRHOIHIORORHRRRCCRII;
   }

   @Generated
   public long CIHRHHRIHOIIIIIHROCOHCICRIIRIR() {
      return this.IIHCROOHRHROIICCCRIOOHHOIOIRII;
   }

   @Generated
   public boolean OORICICIOHCIIOHRHHCROCOHOOOCOI() {
      return this.CCIRHOOHOIIIIIIORHRHRRHIIHORHC;
   }
}
