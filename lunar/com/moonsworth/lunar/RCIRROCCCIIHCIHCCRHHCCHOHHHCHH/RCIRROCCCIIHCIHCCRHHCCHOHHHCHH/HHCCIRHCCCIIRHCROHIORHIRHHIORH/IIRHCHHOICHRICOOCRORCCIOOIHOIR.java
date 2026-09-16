package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.Gson;
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
import java.util.HashSet;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nonnull;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR
   extends com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements Serializable {
   private static final long HIOCCRCCCRICORCIIHHRIRROICHRIC = 1L;
   public static final String IHCICHIIIHORHRIICHOHOHHOCHRORO = "interaction_type";
   @SerializedName("interaction_type")
   private IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOIHOHCIIRORIOHIRRRORHHHIIIHCH;
   public static final String ICHHRRHHCCCCIRHCORIHIRHHOCHIOO = "promotion_type";
   @SerializedName("promotion_type")
   private String RHIOICROIRRRIROHIHICIRRHCCIRHO;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH = var1;
      return this;
   }

   @Nonnull
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CRHRHRIOIHRCHRIORHRRCHHIHCOCCC() {
      return this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH = var1;
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR HOCCCIICRCIIIIRHHICOCOOIICHIOR(String var1) {
      this.RHIOICROIRRRIROHIHICIRRHCCIRHO = var1;
      return this;
   }

   @Nonnull
   public String RROIIRROOOOHIORHRICHOCHIHCRRCH() {
      return this.RHIOICROIRRRIROHIHICIRRHCCIRHO;
   }

   public void HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(String var1) {
      this.RHIOICROIRRRIROHIHICIRRHCCIRHO = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1;
         return Objects.equals(this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH, var2.OOIHOHCIIRORIOHIRRRORHHHIIIHCH)
            && Objects.equals(this.RHIOICROIRRRIROHIHICIRRHCCIRHO, var2.RHIOICROIRRRIROHIHICIRRHCCIRHO)
            && super.equals(var1);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH, this.RHIOICROIRRRIROHIHICIRRHCCIRHO, super.hashCode());
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GamePromotionInteractionEventData {\n");
      var1.append("    ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(super.toString())).append("\n");
      var1.append("    interactionType: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH)).append("\n");
      var1.append("    promotionType: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RHIOICROIRRRIROHIHICIRRHCCIRHO)).append("\n");
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
               "The required field(s) %s in GamePromotionInteractionEventData is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GamePromotionInteractionEventData` properties. JSON: %s",
                  var3.getKey(),
                  var0.toString()
               )
            );
         }
      }

      for (String var6 : CIIIIIHIHRHCOOHOIORCHHCORHRCCO) {
         if (var0.getAsJsonObject().get(var6) == null) {
            throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", var6, var0.toString()));
         }
      }

      JsonObject var5 = var0.getAsJsonObject();
      if (!var5.get("interaction_type").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format(
               "Expected the field `interaction_type` to be a primitive type in the JSON string but got `%s`", var5.get("interaction_type").toString()
            )
         );
      }

      IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.validateJsonElement(var5.get("interaction_type"));
      if (!var5.get("promotion_type").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `promotion_type` to be a primitive type in the JSON string but got `%s`", var5.get("promotion_type").toString())
         );
      }
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR CCHHRHRHCRHIHIHRIOICROHCHIIIHI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, IIRHCHHOICHRICOOCRORCCIOOIHOIR.class);
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
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("interaction_type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("promotion_type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("interaction_type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("promotion_type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installation_id");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installed_mods");
   }

   @JsonAdapter(IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      IMPRESSION("impression"),
      CLICK("click");

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

      public static IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH fromValue(String var0) {
         for (IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
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

      public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
            var1.value(var2.getValue());
         }

         public IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonReader var1) {
            String var2 = var1.nextString();
            return IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.fromValue(var2);
         }
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!IIRHCHHOICHRICOOCRORCCIOOIHOIR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(IIRHCHHOICHRICOOCRORCCIOOIHOIR.class));
         return (TypeAdapter<T>)(new TypeAdapter<IIRHCHHOICHRICOOCRORCCIOOIHOIR>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public IIRHCHHOICHRICOOCRORCCIOOIHOIR RICRIRRCOHRCOCRRHHCRHRROOIOHHR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
