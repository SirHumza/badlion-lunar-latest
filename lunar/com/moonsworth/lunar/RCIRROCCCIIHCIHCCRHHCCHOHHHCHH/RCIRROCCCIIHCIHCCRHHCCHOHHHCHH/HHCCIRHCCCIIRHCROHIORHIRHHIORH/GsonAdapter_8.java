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

public class ORHIOICIOCRRHOOCOHRORIHICHRCRR extends OHHRIOHROOIHOROCIRHCHORIHRRRRI implements Serializable {
   private static final long RICOIROIIOCOHICCHOHOICRHRCROHC = 1L;
   public static final String RIHHRRORHHCCICCCRCOROCIHOHIOHC = "type";
   @SerializedName("type")
   private ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCRRRHHIRICORHROOHHHROIRHHOHRC = ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AUDIO;
   public static final String RIOHROIOCHOICOOIOCHHOCCCCICCOI = "name";
   @SerializedName("name")
   private String name;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.CCRRRHHIRICORHROOHHHROIRHHOHRC = var1;
      return this;
   }

   @Nonnull
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RICHIIOOOHORCHORORHIHIRRHCOOIH() {
      return this.CCRRRHHIRICORHROOHHHROIRHHOHRC;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.CCRRRHHIRICORHROOHHHROIRHHOHRC = var1;
   }

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR IOOCHIRHCRICHIHORCRCHCRHCICROH(String var1) {
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

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ORHIOICIOCRRHOOCOHRORIHICHRCRR var2 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var1;
         return Objects.equals(this.CCRRRHHIRICORHROOHHHROIRHHOHRC, var2.CCRRRHHIRICORHROOHHHROIRHHOHRC)
            && Objects.equals(this.name, var2.name)
            && super.equals(var1);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.CCRRRHHIRICORHROOHHHROIRHHOHRC, this.name, super.hashCode());
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindLayerAudio {\n");
      var1.append("    ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(super.toString())).append("\n");
      var1.append("    type: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.CCRRRHHIRICORHROOHHHROIRHHOHRC)).append("\n");
      var1.append("    name: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.name)).append("\n");
      var1.append("}");
      return var1.toString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var1) {
      return var1 == null ? "null" : var1.toString().replace("\n", "\n    ");
   }

   public static void validateJsonElement(JsonElement var0) {
      if (var0 == null && !CIIIIIHIHRHCOOHOIORCHHCORHRCCO.isEmpty()) {
         throw new IllegalArgumentException(
            String.format("The required field(s) %s in GameRewindLayerAudio is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString())
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindLayerAudio` properties. JSON: %s", var3.getKey(), var0.toString()
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

      ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.validateJsonElement(var5.get("type"));
      if (var5.get("name") != null && !var5.get("name").isJsonNull() && !var5.get("name").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", var5.get("name").toString())
         );
      }
   }

   public static ORHIOICIOCRRHOOCOHRORIHICHRCRR RHCHROORRHOOORICIHIOCRCOORCIRI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, ORHIOICIOCRRHOOCOHRORIHICHRCRR.class);
   }

   @Override
   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("duration_ms");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("properties");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("name");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("duration_ms");
   }

   @JsonAdapter(ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      AUDIO("audio");

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

      public static ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH fromValue(String var0) {
         for (ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
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

      public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
            var1.value(var2.getValue());
         }

         public ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIROOOOICRHCCRRCIORHHIRCOIIIC(JsonReader var1) {
            String var2 = var1.nextString();
            return ORHIOICIOCRRHOOCOHRORIHICHRCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.fromValue(var2);
         }
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!ORHIOICIOCRRHOOCOHRORIHICHRCRR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(ORHIOICIOCRRHOOCOHRORIHICHRCRR.class));
         return (TypeAdapter<T>)(new TypeAdapter<ORHIOICIOCRRHOOCOHRORIHICHRCRR>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, ORHIOICIOCRRHOOCOHRORIHICHRCRR var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public ORHIOICIOCRRHOOCOHRORIHICHRCRR IOHIHIIHCCCCCIHRORIOIOORCIOHII(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
