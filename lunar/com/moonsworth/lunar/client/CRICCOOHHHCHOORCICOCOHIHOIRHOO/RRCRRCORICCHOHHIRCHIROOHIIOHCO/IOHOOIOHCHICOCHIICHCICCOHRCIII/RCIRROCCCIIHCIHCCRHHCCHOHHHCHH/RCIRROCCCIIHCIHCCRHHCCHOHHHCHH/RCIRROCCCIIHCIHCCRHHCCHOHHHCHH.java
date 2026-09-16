package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import org.apache.commons.lang3.text.WordUtils;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final int RHHRROCRICCICHHHHHOHCOIHIIHIIR = 0;
   private final File IRHCRRORRCICOOHCIHRRHIIICOCRRO = new File(
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "BLClient-Mod-Profiles"
   );
   private DataInputStream CCRROCOCHRICHHRHOICHOCHOIRCHOR;
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH OCIHICCHCORORHHHHICCRHICICOOHH;
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH CHHIHCCCCCCORCIRHCIRCHCRHHIOCH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
      super(var1, var2);
   }

   @Override
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO<String, String>> OIHCRRRHIRROIIOORHCCOHOCROIICC() {
      if (this.IRHCRRORRCICOOHCIHRRHIIICOCRRO != null && this.IRHCRRORRCICOOHCIHRRHIIICOCRRO.exists() && this.IRHCRRORRCICOOHCIHRRHIIICOCRRO.isDirectory()) {
         File[] var1 = this.IRHCRRORRCICOOHCIHRRHIIICOCRRO.listFiles();
         if (var1 == null) {
            return Collections.emptyList();
         }

         ArrayList var2 = new ArrayList();

         for (File var6 : var1) {
            if (this.RIROICHCRROROHCCROOCCCCOCHCCRI(var6)) {
               String var7 = this.IHIRRIIORRHORHRORIHOROIRCORCOO(var6);
               if (var7 != null) {
                  var2.add(RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(var6.getName(), var7));
               }
            }
         }

         return var2;
      } else {
         return Collections.emptyList();
      }
   }

   private boolean RIROICHCRROROHCCROOCCCCOCHCCRI(File var1) {
      if (!var1.isFile()) {
         return false;
      }

      try (ZipFile var2 = new ZipFile(var1)) {
         return true;
      } catch (IOException var7) {
         return false;
      }
   }

   private String IHIRRIIORRHORHRORIHOROIRCORCOO(File var1) {
      try (ZipFile var2 = new ZipFile(var1)) {
         ZipEntry var3 = var2.getEntry("data.json");
         if (var3 != null) {
            try (
               InputStream var4 = var2.getInputStream(var3);
               BufferedReader var5 = new BufferedReader(new InputStreamReader(var4));
            ) {
               StringBuilder var6 = new StringBuilder();

               String var7;
               while ((var7 = var5.readLine()) != null) {
                  var6.append(var7);
               }

               return var6.toString();
            }
         }
      } catch (IOException var15) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Waypoints", "Failed to extract JSON from zip file: " + var1.getPath(), var15
         );
      }

      return null;
   }

   @Override
   public Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHRRHHOCROROCCIRROIHOCCHCIHCIR(
      @Nullable String var1, String var2
   ) {
      if (var2.startsWith("BLCWP:") && var2.endsWith(";")) {
         return this.OCOOOIIHORIIIOIORRRRRHHRROHICC(var2);
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Waypoints", "Importing waypoints from Badlion: " + var1
      );

      try {
         JsonObject var3 = JsonParser.parseString(var2).getAsJsonObject();
         return this.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var3);
      } catch (JsonParseException var4) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Waypoints", "Failed to parse BLC JSON data: " + var4.getMessage(), var4
         );
         return Collections.emptyList();
      }
   }

   private Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(
      JsonObject var1
   ) {
      if (!var1.has("waypoints")) {
         return Collections.emptyList();
      }

      JsonObject var2 = var1.getAsJsonObject("waypoints");
      if (!var2.has("newWaypoints")) {
         return Collections.emptyList();
      }

      JsonArray var3 = var2.getAsJsonArray("newWaypoints");
      ArrayList var4 = new ArrayList();

      for (JsonElement var6 : var3) {
         JsonObject var7 = var6.getAsJsonObject();
         if (var7.has("waypoints")) {
            for (JsonElement var10 : var7.getAsJsonArray("waypoints")) {
               JsonObject var11 = var10.getAsJsonObject();
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = this.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  var11, var7
               );
               if (var12 != null) {
                  var4.add(var12);
               }
            }
         }
      }

      return var4;
   }

   private com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRRRICCRROCOHHOHIICIHORCOORRRH(
      JsonObject var1, JsonObject var2
   ) {
      try {
         JsonObject var3 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2);
         String var4 = var3.get("TYPE").getAsString();
         String var5 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, var3);
         String var6 = this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var4, var3);
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
            .RRHCHIHOIRICOICHIHOIRIOHHRHOOI(var1.get("name").getAsString())
            .RRROCCOIROROHIRRHOHIRRIHOCIIRO(var1.getAsJsonObject("enabled").getAsJsonPrimitive("value").getAsBoolean())
            .OCOHORHCROHICRRIHCIHHRRCIHICRI(
               CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                  var1.get("x").getAsDouble(), var1.get("y").getAsDouble(), var1.get("z").getAsDouble()
               )
            )
            .HRIOHRORCHIICCICIHRIIHHCHHOHHO(this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4, var3))
            .RCOROOHHCORIRCRHOHRCCIHRCORCHH(this.OHHCCHCROIIRIOHRICRIHHHIIRCOHI(var6))
            .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC(var5)
            .OOCHIIROORIOCCCCCOORRIRIOHOORH(false)
            .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Waypoints", "Failed to create waypoint from JSON: " + var7.getMessage(), var7
         );
         return null;
      }
   }

   private String RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, JsonObject var2) {
      return var1.equals("Singleplayer") ? "sp:" + var2.get("WORLD").getAsString() : "mp:" + var2.get("SERVER").getAsString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(String var1, JsonObject var2) {
      return var1.equals("Singleplayer") ? WordUtils.capitalize(var2.get("WORLD").getAsString()) : WordUtils.capitalize(var2.get("SERVER").getAsString());
   }

   private String HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var1, JsonObject var2) {
      return var1.equals("Singleplayer")
         ? WordUtils.capitalize(var2.get("WORLD_DIMENSION").getAsString())
         : WordUtils.capitalize(var2.get("SERVER_DIMENSION").getAsString());
   }

   private int OHHCCHCROIIRIOHRICRIHHHIIRCOHI(String var1) {
      String var2 = var1.toLowerCase();
      if (var2.contains("nether")) {
         return -1;
      } else {
         return var2.contains("end") ? 1 : 0;
      }
   }

   private JsonObject RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonObject var1, JsonObject var2) {
      return var1.has("renderConditions")
         ? var1.getAsJsonObject("renderConditions").getAsJsonObject("values")
         : var2.getAsJsonObject("renderConditions").getAsJsonObject("values");
   }

   public Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OCOOOIIHORIIIOIORRRRRHHRROHICC(
      String var1
   ) {
      byte[] var2 = Base64.getDecoder().decode(var1.substring(6, var1.length() - 1));
      this.CCRROCOCHRICHHRHOICHOCHOIRCHOR = new DataInputStream(new ByteArrayInputStream(var2));
      int var3 = this.readUnsignedByte();
      if (var3 > 0) {
         throw new IOException("Unsupported data version: " + var3);
      }

      this.OCIHICCHCORORHHHHICCRHICICOOHH = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this);

      try {
         this.CHHIHCCCCCCORCIRHCIRCHCRHHIOCH = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
      } catch (DataFormatException var5) {
         throw new IOException("Failed to initialize string decoder", var5);
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         "Waypoints", "Compressed BLC waypoint format not fully implemented"
      );
      return Collections.emptyList();
   }

   public String readString() {
      return this.CHHIHCCCCCCORCIRHCIRCHCRHHIOCH.readString();
   }

   public boolean readBool() {
      return this.OCIHICCHCORORHHHHICCRHICICOOHH.IIHHHCIIIIIHIHORIIOHHHCHOROCRI();
   }

   public int readInt() {
      return this.CCRROCOCHRICHHRHOICHOCHOIRCHOR.readInt();
   }

   public long HIHHCRRHHORCOHOCIRCRHHICCCIIHO() {
      boolean var1 = this.readBool();
      if (!var1) {
         return this.readUnsignedByte();
      }

      boolean var2 = this.readBool();
      return !var2 ? this.readUnsignedShort() : this.readUnsignedInt();
   }

   private int readUnsignedShort() {
      return this.CCRROCOCHRICHHRHOICHOCHOIRCHOR.readShort() - -32768;
   }

   public long readUnsignedInt() {
      return this.CCRROCOCHRICHHRHOICHOCHOIRCHOR.readInt() - Integer.MIN_VALUE;
   }

   public int readUnsignedByte() {
      return this.CCRROCOCHRICHHRHOICHOCHOIRCHOR.readByte() - -128;
   }

   public byte[] RIROOOIRCIRHOHIHROCICIOICCRICR(int var1) {
      byte[] var2 = new byte[var1];
      this.CCRROCOCHRICHHRHOICHOCHOIRCHOR.read(var2);
      return var2;
   }
}
