package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
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

public class IRRCCOICORICIHCHRHIHIHROIRHOCR
   extends com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements Serializable {
   private static final long HHIHIIOICHCCHIIRRCCRHHHOOCOOCO = 1L;
   public static final String HROOORICCCOROOORORCORRHRHORIRC = "session_type";
   @SerializedName("session_type")
   private IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OIOCHROIHRRIORCCCIIORRHICHORCR;
   public static final String RHCCCHORORCCOIRIRHCRRHOIRHCCIH = "duration_ms";
   @SerializedName("duration_ms")
   private BigDecimal OCCHHIHOOOHHORHHOHRCHRCCIOCOCI;
   public static final String HRCOHHCIOHCHRHHCOCHOCIHROOIRIH = "timelines";
   @SerializedName("timelines")
   private List<RICRIRRCOHRCOCRRHHCRHRROOIOHHR> IOICICOROHHHOHROOOHCRCCOIRIOHO = new ArrayList<>();
   public static final String RCCOIIHIHORORRRIRROICICOROOCCO = "fast_rewind";
   @SerializedName("fast_rewind")
   private Boolean HHOOIRORCCOOORRIIIOCRCRHIICOCH;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public IRRCCOICORICIHCHRHIHIHROIRHOCR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OIOCHROIHRRIORCCCIIORRHICHORCR = var1;
      return this;
   }

   @Nonnull
   public IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HIHCHCORCCRCOHCRROHOHOOCHOROCC() {
      return this.OIOCHROIHRRIORCCCIIORRHICHORCR;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OIOCHROIHRRIORCCCIIORRHICHORCR = var1;
   }

   public IRRCCOICORICIHCHRHIHIHROIRHOCR CRRRICCRROCOHHOHIICIHORCOORRRH(BigDecimal var1) {
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

   public IRRCCOICORICIHCHRHIHIHROIRHOCR CIOHHCORHRCCRICCCORIHCRHCCCRRR(List<RICRIRRCOHRCOCRRHHCRHRROOIOHHR> var1) {
      this.IOICICOROHHHOHROOOHCRCCOIRIOHO = var1;
      return this;
   }

   public IRRCCOICORICIHCHRHIHIHROIRHOCR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RICRIRRCOHRCOCRRHHCRHRROOIOHHR var1) {
      if (this.IOICICOROHHHOHROOOHCRCCOIRIOHO == null) {
         this.IOICICOROHHHOHROOOHCRCCOIRIOHO = new ArrayList<>();
      }

      this.IOICICOROHHHOHROOOHCRCCOIRIOHO.add(var1);
      return this;
   }

   @Nullable
   public List<RICRIRRCOHRCOCRRHHCRHRROOIOHHR> OCIHRICRHRRHIOHIIHIROCRIRHCCIR() {
      return this.IOICICOROHHHOHROOOHCRCCOIRIOHO;
   }

   public void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(List<RICRIRRCOHRCOCRRHHCRHRROOIOHHR> var1) {
      this.IOICICOROHHHOHROOOHCRCCOIRIOHO = var1;
   }

   public IRRCCOICORICIHCHRHIHIHROIRHOCR HHCCIRHCCCIIRHCROHIORHIRHHIORH(Boolean var1) {
      this.HHOOIRORCCOOORRIIIOCRCRHIICOCH = var1;
      return this;
   }

   @Nullable
   public Boolean IRIHOIRCHIRRCRIOORCOICORHHORHH() {
      return this.HHOOIRORCCOOORRIIIOCRCRHIICOCH;
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(Boolean var1) {
      this.HHOOIRORCCOOORRIIIOCRCRHIICOCH = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         IRRCCOICORICIHCHRHIHIHROIRHOCR var2 = (IRRCCOICORICIHCHRHIHIHROIRHOCR)var1;
         return Objects.equals(this.OIOCHROIHRRIORCCCIIORRHICHORCR, var2.OIOCHROIHRRIORCCCIIORRHICHORCR)
            && Objects.equals(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI, var2.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)
            && Objects.equals(this.IOICICOROHHHOHROOOHCRCCOIRIOHO, var2.IOICICOROHHHOHROOOHCRCCOIRIOHO)
            && Objects.equals(this.HHOOIRORCCOOORRIIIOCRCRHIICOCH, var2.HHOOIRORCCOOORRIIIOCRCRHIICOCH)
            && super.equals(var1);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.OIOCHROIHRRIORCCCIIORRHICHORCR,
         this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI,
         this.IOICICOROHHHOHROOOHCRCCOIRIOHO,
         this.HHOOIRORCCOOORRIIIOCRCRHIICOCH,
         super.hashCode()
      );
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindEditorSessionEventData {\n");
      var1.append("    ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(super.toString())).append("\n");
      var1.append("    sessionType: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OIOCHROIHRRIORCCCIIORRHICHORCR)).append("\n");
      var1.append("    durationMs: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)).append("\n");
      var1.append("    timelines: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.IOICICOROHHHOHROOOHCRCCOIRIOHO)).append("\n");
      var1.append("    fastRewind: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HHOOIRORCCOOORRIIIOCRCRHIICOCH)).append("\n");
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
               "The required field(s) %s in GameRewindEditorSessionEventData is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindEditorSessionEventData` properties. JSON: %s",
                  var3.getKey(),
                  var0.toString()
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
      if (!var6.get("session_type").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `session_type` to be a primitive type in the JSON string but got `%s`", var6.get("session_type").toString())
         );
      }

      IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.validateJsonElement(var6.get("session_type"));
      if (var6.get("timelines") != null && !var6.get("timelines").isJsonNull()) {
         JsonArray var8 = var6.getAsJsonArray("timelines");
         if (var8 != null) {
            if (!var6.get("timelines").isJsonArray()) {
               throw new IllegalArgumentException(
                  String.format("Expected the field `timelines` to be an array in the JSON string but got `%s`", var6.get("timelines").toString())
               );
            }

            for (int var4 = 0; var4 < var8.size(); var4++) {
               RICRIRRCOHRCOCRRHHCRHRROOIOHHR.validateJsonElement(var8.get(var4));
            }
         }
      }
   }

   public static IRRCCOICORICIHCHRHIHIHROIRHOCR HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, IRRCCOICORICIHCHRHIHIHROIRHOCR.class);
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
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("session_type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("duration_ms");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("timelines");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("fast_rewind");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("session_type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("duration_ms");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installation_id");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installed_mods");
   }

   @JsonAdapter(IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      PROJECT("project"),
      QUICK_VIEW("quick_view");

      private String value;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3) {
         this.value = var3;
      }

      public String getValue() {
         return this.value;
      }

      @Override
      public String toString() {
         return String.valueOf(this.value);
      }

      public static IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH fromValue(String var0) {
         for (IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
            if (var4.value.equals(var0)) {
               return var4;
            }
         }

         throw new IllegalArgumentException("Unexpected value '" + var0 + "'");
      }

      public static void validateJsonElement(JsonElement var0) {
         String var1 = var0.getAsString();
         fromValue(var1);
      }

      public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
            var1.value(var2.getValue());
         }

         public IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HHRIICOIOORCHCOIICOOIHIRHHICRI(JsonReader var1) {
            String var2 = var1.nextString();
            return IRRCCOICORICIHCHRHIHIHROIRHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.fromValue(var2);
         }
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!IRRCCOICORICIHCHRHIHIHROIRHOCR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(IRRCCOICORICIHCHRHIHIHROIRHOCR.class));
         return (TypeAdapter<T>)(new TypeAdapter<IRRCCOICORICIHCHRHIHIHROIRHOCR>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IRRCCOICORICIHCHRHIHIHROIRHOCR var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public IRRCCOICORICIHCHRHIHIHROIRHOCR IOIICIRIICICIIOORHCIIIIRRIHRHI(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (IRRCCOICORICIHCHRHIHIHROIRHOCR)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
