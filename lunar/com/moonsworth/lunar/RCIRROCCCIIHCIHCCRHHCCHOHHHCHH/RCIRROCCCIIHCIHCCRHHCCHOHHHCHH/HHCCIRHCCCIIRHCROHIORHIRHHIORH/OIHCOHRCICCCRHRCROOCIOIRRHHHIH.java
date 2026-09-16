package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class OIHCOHRCICCCRHRCROOCIOIRRHHHIH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Serializable {
   private static final long HOHOCIRCROOOROIOOHOHICORHIIOII = 1L;
   public static final String IOOHRICRRRCHOIROCOIORIHCRHIHRH = "duration_ms";
   @SerializedName("duration_ms")
   private BigDecimal OCCHHIHOOOHHORHHOHRCHRCCIOCOCI;
   public static final String HRROHICIHHOORRCHCOROORHCHRRHRO = "locations";
   @SerializedName("locations")
   private List<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR> RHCCOIHOHRIHRRIIRHICRRROCICORR = new ArrayList<>();
   public static final String HHIIOHOORHHCCHRHHRCIORCROORCOI = "shadow_rewind";
   @SerializedName("shadow_rewind")
   private Boolean COCIIOOCHHROHCIRRROOOOOROORRIC = false;
   public static final String OOOCHHHRCHRRIHCRICCIIOCHOCIHOC = "mic_recording";
   @SerializedName("mic_recording")
   private Boolean OHCRORHCICHHOORIRHHIORRHRCOCCR = false;
   public static final String ROICRIHIORCHOOCCHOOIHOHHROIORH = "system_audio_recording";
   @SerializedName("system_audio_recording")
   private Boolean RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH = false;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH IIRHCHHOICHRICOOCRORCCIOOIHOIR(BigDecimal var1) {
      this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI = var1;
      return this;
   }

   @Nonnull
   public BigDecimal HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH() {
      return this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(BigDecimal var1) {
      this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI = var1;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH RHOCHHIRRCHHHOHOIRROIROHHHIHIO(List<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR> var1) {
      this.RHCCOIHOHRIHRRIIRHICRRROCICORR = var1;
      return this;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var1) {
      if (this.RHCCOIHOHRIHRRIIRHICRRROCICORR == null) {
         this.RHCCOIHOHRIHRRIIRHICRRROCICORR = new ArrayList<>();
      }

      this.RHCCOIHOHRIHRRIIRHICRRROCICORR.add(var1);
      return this;
   }

   @Nonnull
   public List<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR> RRCRRIIRHHRCCICHOCOIHROROCICHC() {
      return this.RHCCOIHOHRIHRRIIRHICRRROCICORR;
   }

   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(List<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR> var1) {
      this.RHCCOIHOHRIHRRIIRHICRRROCICORR = var1;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH RRCRRCORICCHOHHIRCHIROOHIIOHCO(Boolean var1) {
      this.COCIIOOCHHROHCIRRROOOOOROORRIC = var1;
      return this;
   }

   @Nullable
   public Boolean RHIHRRICIHORIHHIHHOIIOHHRCIIIH() {
      return this.COCIIOOCHHROHCIRRROOOOOROORRIC;
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Boolean var1) {
      this.COCIIOOCHHROHCIRRROOOOOROORRIC = var1;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Boolean var1) {
      this.OHCRORHCICHHOORIRHHIORRHRCOCCR = var1;
      return this;
   }

   @Nullable
   public Boolean CHRHCRCCIICRORCOHCORHRROIHRCHO() {
      return this.OHCRORHCICHHOORIRHHIORRHRCOCCR;
   }

   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Boolean var1) {
      this.OHCRORHCICHHOORIRHHIORRHRCOCCR = var1;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH CORCOCICIRIOHROHROIIOOHICCHCRR(Boolean var1) {
      this.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH = var1;
      return this;
   }

   @Nullable
   public Boolean IOHCCIRCCICICHHHIOIOHCICICROIO() {
      return this.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH;
   }

   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(Boolean var1) {
      this.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         OIHCOHRCICCCRHRCROOCIOIRRHHHIH var2 = (OIHCOHRCICCCRHRCROOCIOIRRHHHIH)var1;
         return Objects.equals(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI, var2.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)
            && Objects.equals(this.RHCCOIHOHRIHRRIIRHICRRROCICORR, var2.RHCCOIHOHRIHRRIIRHICRRROCICORR)
            && Objects.equals(this.COCIIOOCHHROHCIRRROOOOOROORRIC, var2.COCIIOOCHHROHCIRRROOOOOROORRIC)
            && Objects.equals(this.OHCRORHCICHHOORIRHHIORRHRCOCCR, var2.OHCRORHCICHHOORIRHHIORRHRCOCCR)
            && Objects.equals(this.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH, var2.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH)
            && super.equals(var1);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI,
         this.RHCCOIHOHRIHRRIIRHICRRROCICORR,
         this.COCIIOOCHHROHCIRRROOOOOROORRIC,
         this.OHCRORHCICHHOORIRHHIORRHRCOCCR,
         this.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH,
         super.hashCode()
      );
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindRecordingEventData {\n");
      var1.append("    ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(super.toString())).append("\n");
      var1.append("    durationMs: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)).append("\n");
      var1.append("    locations: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RHCCOIHOHRIHRRIIRHICRRROCICORR)).append("\n");
      var1.append("    shadowRewind: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((Object)this.COCIIOOCHHROHCIRRROOOOOROORRIC)).append("\n");
      var1.append("    micRecording: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((Object)this.OHCRORHCICHHOORIRHHIORRHRCOCCR)).append("\n");
      var1.append("    systemAudioRecording: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((Object)this.RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH)).append("\n");
      var1.append("}");
      return var1.toString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var1) {
      return var1 == null ? "null" : var1.toString().replace("\n", "\n    ");
   }

   public static void validateJsonElement(JsonElement var0) {
      if (var0 == null && !CIIIIIHIHRHCOOHOIORCHHCORHRCCO.isEmpty()) {
         throw new IllegalArgumentException(
            String.format(
               "The required field(s) %s in GameRewindRecordingEventData is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindRecordingEventData` properties. JSON: %s", var3.getKey(), var0.toString()
               )
            );
         }
      }

      for (String var7 : CIIIIIHIHRHCOOHOIORCHHCORHRCCO) {
         if (var0.getAsJsonObject().get(var7) == null) {
            throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", var7, var0.toString()));
         }
      }

      JsonObject var6 = var0.getAsJsonObject();
      if (!var6.get("locations").isJsonArray()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `locations` to be an array in the JSON string but got `%s`", var6.get("locations").toString())
         );
      }

      JsonArray var8 = var6.getAsJsonArray("locations");

      for (int var4 = 0; var4 < var8.size(); var4++) {
         ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.validateJsonElement(var8.get(var4));
      }
   }

   public static OIHCOHRCICCCRHRCROOCIOIRRHHHIH RORRCRCHIRCHHOOIHCCHRCHORHCICI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.class);
   }

   @Override
   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("player_uuid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("installation_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("overwolf_muid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("timestamp");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("event_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("assetserver_session_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("launch_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("inbound_location");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("location");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("minecraft_version");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_git_commit");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_git_branch");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_semver");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_ui_git_commit");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_ui_git_branch");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("operating_system");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("operating_system_release");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("cpu_architecture");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("launcher_version");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("canary_token");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("ichor_modules");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("gl_extensions");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("installed_mods");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("wearer_uuid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("wearer_cosmetic_ids");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("wearer_outfit_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("trigger");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("geo_location");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("duration_ms");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("locations");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("shadow_rewind");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("mic_recording");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("system_audio_recording");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("duration_ms");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("locations");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installation_id");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installed_mods");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!OIHCOHRCICCCRHRCROOCIOIRRHHHIH.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.class));
         return (TypeAdapter<T>)(new TypeAdapter<OIHCOHRCICCCRHRCROOCIOIRRHHHIH>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, OIHCOHRCICCCRHRCROOCIOIRRHHHIH var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public OIHCOHRCICCCRHRCROOCIOIRRHHHIH RHCHRCOCCOIIIHCHRHIRCORHRHRICR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (OIHCOHRCICCCRHRCROOCIOIRRHHHIH)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
