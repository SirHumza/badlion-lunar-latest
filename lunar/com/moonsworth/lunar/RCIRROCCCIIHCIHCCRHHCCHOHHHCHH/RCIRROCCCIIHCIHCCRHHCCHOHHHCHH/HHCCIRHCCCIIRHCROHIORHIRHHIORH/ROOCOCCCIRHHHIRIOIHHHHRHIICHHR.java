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
import javax.annotation.Nullable;

public class ROOCOCCCIRHHHIRIOIHHHHRHIICHHR implements Serializable {
   private static final long ICIOIHRIHCHCIRRHROHOCOCCRHIHHH = 1L;
   public static final String CROHOOOIIOCCRHIIIRHICIIHRRRCCC = "type";
   @SerializedName("type")
   private ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH ICICICORIIHROIOIRIRORIHIHHOHOO;
   public static final String IIHRCHIORHRROORIHICCHROHHCIIHO = "name";
   @SerializedName("name")
   private String name;
   public static final String HCRRCORHCHHHCOCRROROIIROROROHO = "ip";
   @SerializedName("ip")
   private String ip;
   public static final String OIIIOOOIICOHROCROICIIIRCRCHHHO = "server_mappings_id";
   @SerializedName("server_mappings_id")
   private String OOCHIIROORIOCCCCCOORRIRIOHOORH;
   public static final String IRIHHHOROHICICOCIOOIHHRRRCOHIO = "live_experience_id";
   @SerializedName("live_experience_id")
   private String CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.ICICICORIIHROIOIRIRORIHIHHOHOO = var1;
      return this;
   }

   @Nonnull
   public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IOIHHIORCICCHIIHOIOIOHHRICRHIO() {
      return this.ICICICORIIHROIOIRIRORIHIHHOHOO;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.ICICICORIIHROIOIRIRORIHIHHOHOO = var1;
   }

   public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR ROCHRRCORRCOOOOOCOICOCROIIHIHH(String var1) {
      this.name = var1;
      return this;
   }

   @Nullable
   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR IOHCRRIIHCIHORROOCHCCORIHRHCII(String var1) {
      this.ip = var1;
      return this;
   }

   @Nullable
   public String IRIRICIHHCOICHHCHCOCCHHOROOCHH() {
      return this.ip;
   }

   public void HIOHICORCIOOHORHORIHHRIOCRCCRR(String var1) {
      this.ip = var1;
   }

   public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR CRIHRCICOICHCHCHIHRHROCCHCCCII(String var1) {
      this.OOCHIIROORIOCCCCCOORRIRIOHOORH = var1;
      return this;
   }

   @Nullable
   public String getServerMappingsId() {
      return this.OOCHIIROORIOCCCCCOORRIRIOHOORH;
   }

   public void IHROCRRIRIROCCCRCRRROCRRCRIIHH(String var1) {
      this.OOCHIIROORIOCCCCCOORRIRIOHOORH = var1;
   }

   public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR HIRIHCORIRIORCCHCOORIHIOIICOIH(String var1) {
      this.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH = var1;
      return this;
   }

   @Nullable
   public String IHHRRRRCOCHIIOIOHORHCIRRRCHCCR() {
      return this.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH;
   }

   public void HORCRRHOCRRICHROCIOOIORIOHCIHH(String var1) {
      this.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var2 = (ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)var1;
         return Objects.equals(this.ICICICORIIHROIOIRIRORIHIHHOHOO, var2.ICICICORIIHROIOIRIRORIHIHHOHOO)
            && Objects.equals(this.name, var2.name)
            && Objects.equals(this.ip, var2.ip)
            && Objects.equals(this.OOCHIIROORIOCCCCCOORRIRIOHOORH, var2.OOCHIIROORIOCCCCCOORRIRIOHOORH)
            && Objects.equals(this.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH, var2.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.ICICICORIIHROIOIRIRORIHIHHOHOO, this.name, this.ip, this.OOCHIIROORIOCCCCCOORRIRIOHOORH, this.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindRecordingLocation {\n");
      var1.append("    type: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.ICICICORIIHROIOIRIRORIHIHHOHOO)).append("\n");
      var1.append("    name: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.name)).append("\n");
      var1.append("    ip: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.ip)).append("\n");
      var1.append("    serverMappingsId: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OOCHIIROORIOCCCCCOORRIRIOHOORH)).append("\n");
      var1.append("    liveExperienceId: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH)).append("\n");
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
               "The required field(s) %s in GameRewindRecordingLocation is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindRecordingLocation` properties. JSON: %s", var3.getKey(), var0.toString()
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
      if (!var5.get("type").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", var5.get("type").toString())
         );
      }

      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.validateJsonElement(var5.get("type"));
      if (var5.get("name") != null && !var5.get("name").isJsonNull() && !var5.get("name").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", var5.get("name").toString())
         );
      }

      if (var5.get("ip") != null && !var5.get("ip").isJsonNull() && !var5.get("ip").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", var5.get("ip").toString())
         );
      }

      if (var5.get("server_mappings_id") != null && !var5.get("server_mappings_id").isJsonNull() && !var5.get("server_mappings_id").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format(
               "Expected the field `server_mappings_id` to be a primitive type in the JSON string but got `%s`", var5.get("server_mappings_id").toString()
            )
         );
      }

      if (var5.get("live_experience_id") != null && !var5.get("live_experience_id").isJsonNull() && !var5.get("live_experience_id").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format(
               "Expected the field `live_experience_id` to be a primitive type in the JSON string but got `%s`", var5.get("live_experience_id").toString()
            )
         );
      }
   }

   public static ROOCOCCCIRHHHIRIOIHHHHRHIICHHR CRIIOOIHIOHHRRRHIOROOCHCHHCCCI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("name");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("ip");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("server_mappings_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("live_experience_id");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("type");
   }

   @JsonAdapter(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      LIVE_EXPERIENCE("LIVE_EXPERIENCE"),
      HOSTED_WORLD("HOSTED_WORLD"),
      SINGLE_PLAYER("SINGLE_PLAYER"),
      SERVER("SERVER");

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

      public static ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH fromValue(String var0) {
         for (ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
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

      public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
            var1.value(var2.getValue());
         }

         public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(JsonReader var1) {
            String var2 = var1.nextString();
            return ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.fromValue(var2);
         }
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.class));
         return (TypeAdapter<T>)(new TypeAdapter<ROOCOCCCIRHHHIRIOIHHHHRHIICHHR>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public ROOCOCCCIRHHHIRIOIHHHHRHIICHHR RCCCROCHCICCROHCOCCRRROCIIHCCH(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
