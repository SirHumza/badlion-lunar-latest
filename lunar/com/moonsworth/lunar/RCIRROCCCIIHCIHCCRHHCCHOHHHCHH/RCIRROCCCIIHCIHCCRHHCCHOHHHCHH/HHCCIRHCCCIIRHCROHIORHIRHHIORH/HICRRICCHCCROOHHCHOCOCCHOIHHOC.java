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
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nonnull;

public class HICRRICCHCCROOHHCHOCOCCHOIHHOC implements Serializable {
   private static final long RRIRHIRRCRIIHCCIOORCCIOCICOCHI = 1L;
   public static final String RHRHIHHRHRHRIIRCCOCIHHHOHCIOCH = "channels";
   @SerializedName("channels")
   private HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HORCCIOICHOIHHCOCHIHIHOROHRROO;
   public static final String IOOORHIIOIRRCRIHHCHIRCCHCRRCCR = "frequency";
   @SerializedName("frequency")
   private BigDecimal HOHCOOORCOCOCIIOIORHCRCRCRHOOI;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.HORCCIOICHOIHHCOCHIHIHOROHRROO = var1;
      return this;
   }

   @Nonnull
   public HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCROCOHHHICRHIHHOOCIIRRRCCIRR() {
      return this.HORCCIOICHOIHHCOCHIHIHOROHRROO;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.HORCCIOICHOIHHCOCHIHIHOROHRROO = var1;
   }

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(BigDecimal var1) {
      this.HOHCOOORCOCOCIIOIORHCRCRCRHOOI = var1;
      return this;
   }

   @Nonnull
   public BigDecimal RICHHRCCHRIICHROOROCCICOIRRHCR() {
      return this.HOHCOOORCOCOCIIOIORHCRCRCRHOOI;
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(BigDecimal var1) {
      this.HOHCOOORCOCOCIIOIORHCRCRCRHOOI = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HICRRICCHCCROOHHCHOCOCCHOIHHOC var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC)var1;
         return Objects.equals(this.HORCCIOICHOIHHCOCHIHIHOROHRROO, var2.HORCCIOICHOIHHCOCHIHIHOROHRROO)
            && Objects.equals(this.HOHCOOORCOCOCIIOIORHCRCRCRHOOI, var2.HOHCOOORCOCOCIIOIORHCRCRCRHOOI);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.HORCCIOICHOIHHCOCHIHIHOROHRROO, this.HOHCOOORCOCOCIIOIORHCRCRCRHOOI);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindExportAudio {\n");
      var1.append("    channels: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HORCCIOICHOIHHCOCHIHIHOROHRROO)).append("\n");
      var1.append("    frequency: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((Object)this.HOHCOOORCOCOCIIOIORHCRCRCRHOOI)).append("\n");
      var1.append("}");
      return var1.toString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var1) {
      return var1 == null ? "null" : var1.toString().replace("\n", "\n    ");
   }

   public static void validateJsonElement(JsonElement var0) {
      if (var0 == null && !CIIIIIHIHRHCOOHOIORCHHCORHRCCO.isEmpty()) {
         throw new IllegalArgumentException(
            String.format("The required field(s) %s in GameRewindExportAudio is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString())
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindExportAudio` properties. JSON: %s", var3.getKey(), var0.toString()
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
      if (!var5.get("channels").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `channels` to be a primitive type in the JSON string but got `%s`", var5.get("channels").toString())
         );
      }

      HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.validateJsonElement(var5.get("channels"));
   }

   public static HICRRICCHCCROOHHCHOCOCCHOIHHOC CIOORRCRICOIICROHRHRHHOHRCCRII(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, HICRRICCHCCROOHHCHOCOCCHOIHHOC.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("channels");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("frequency");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("channels");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("frequency");
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!HICRRICCHCCROOHHCHOCOCCHOIHHOC.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(HICRRICCHCCROOHHCHOCOCCHOIHHOC.class));
         return (TypeAdapter<T>)(new TypeAdapter<HICRRICCHCCROOHHCHOCOCCHOIHHOC>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, HICRRICCHCCROOHHCHOCOCCHOIHHOC var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public HICRRICCHCCROOHHCHOCOCCHOIHHOC IHCRORHRORIICHRHRCHRRIRRHHOCOO(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (HICRRICCHCCROOHHCHOCOCCHOIHHOC)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }

   @JsonAdapter(HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      MONO("mono"),
      STEREO("stereo");

      private String value;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
         this.value = var3;
      }

      public String getValue() {
         return this.value;
      }

      @Override
      public String toString() {
         return String.valueOf(this.value);
      }

      public static HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromValue(String var0) {
         for (HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
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

      public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
            var1.value(var2.getValue());
         }

         public HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(JsonReader var1) {
            String var2 = var1.nextString();
            return HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromValue(var2);
         }
      }
   }
}
