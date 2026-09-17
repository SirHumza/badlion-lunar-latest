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

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, Serializable {
   private static final long CHIIIIIHRCROHOHHHRRIHHRIIICIIC = 1L;
   public static final String IRICRCROHROOORCOOHHCOCOCCHHOCI = "type";
   @SerializedName("type")
   private CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH HORRRHCCICIOCOOOCIHCCRCRIOCCHR = CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BLOGPOST_INTERACTION;
   public static final String IRCHOIROHOHHOIHCICOROOOHIOOIIR = "data";
   @SerializedName("data")
   private HICHRCOHCCRHOHCICOOCHOIHCCHIRI CROORRIIIHICOIHOOCRRHRCOIHHHCO;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR = var1;
      return this;
   }

   @Nonnull
   public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOCCCIICRCIIIIRHHICOCOOIICHIOR() {
      return this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR = var1;
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1) {
      this.CROORRIIIHICOIHOOCRRHRCOIHHHCO = var1;
      return this;
   }

   @Nonnull
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO() {
      return this.CROORRIIIHICOIHOOCRRHRCOIHHHCO;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1) {
      this.CROORRIIIHICOIHOOCRRHRCOIHHHCO = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 = (CRICCOOHHHCHOORCICOCOHIHOIRHOO)var1;
         return Objects.equals(this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR, var2.HORRRHCCICIOCOOOCIHCCRCRIOCCHR)
            && Objects.equals(this.CROORRIIIHICOIHOOCRRHRCOIHHHCO, var2.CROORRIIIHICOIHOOCRRHRCOIHHHCO);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR, this.CROORRIIIHICOIHOOCRRHRCOIHHHCO);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameBlogPostInteractionEvent {\n");
      var1.append("    type: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR)).append("\n");
      var1.append("    data: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.CROORRIIIHICOIHOOCRRHRCOIHHHCO)).append("\n");
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
               "The required field(s) %s in GameBlogPostInteractionEvent is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameBlogPostInteractionEvent` properties. JSON: %s", var3.getKey(), var0.toString()
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

      CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.validateJsonElement(var5.get("type"));
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.validateJsonElement(var5.get("data"));
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO HCHHOOOCRCRHHICHICORHOCHCCCHRH(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, CRICCOOHHHCHOORCICOCOHIHOIRHOO.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   @Override
   public com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCHRIROHHHCORIOCROOCHRCIOROOCI() {
      return this.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO();
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("data");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("data");
   }

   @JsonAdapter(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      BLOGPOST_INTERACTION("blogpost.interaction");

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

      public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH fromValue(String var0) {
         for (CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
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

      public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
            var1.value(var2.getValue());
         }

         public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH IIHRRHORCRCROCHHOHORCHCROCIHRO(JsonReader var1) {
            String var2 = var1.nextString();
            return CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.fromValue(var2);
         }
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!CRICCOOHHHCHOORCICOCOHIHOIRHOO.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(CRICCOOHHHCHOORCICOCOHIHOIRHOO.class));
         return (TypeAdapter<T>)(new TypeAdapter<CRICCOOHHHCHOORCICOCOHIHOIRHOO>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, CRICCOOHHHCHOORCICOCOHIHOIRHOO var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public CRICCOOHHHCHOORCICOCOHIHOIRHOO HICHRCOHCCRHOHCICOOCHOIHCCHIRI(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (CRICCOOHHHCHOORCICOCOHIHOIRHOO)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
