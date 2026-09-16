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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nonnull;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO implements Serializable {
   private static final long RCCRRRIHRRHCIIHRIOHHROHIOOCRIC = 1L;
   public static final String OIROOCRCIRRRCICRHCCIRCCHRIRHRR = "events";
   @SerializedName("events")
   private List<CORCOCICIRIOHROHROIIOOHICCHCRR> HIHROCOCCHRHHRROHCRCCHOIRCHIHI = new ArrayList<>();
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public IIHRRHORCRCROCHHOHORCHCROCIHRO CRICCOOHHHCHOORCICOCOHIHOIRHOO(List<CORCOCICIRIOHROHROIIOOHICCHCRR> var1) {
      this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI = var1;
      return this;
   }

   public IIHRRHORCRCROCHHOHORCHCROCIHRO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      if (this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI == null) {
         this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI = new ArrayList<>();
      }

      this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI.add(var1);
      return this;
   }

   @Nonnull
   public List<CORCOCICIRIOHROHROIIOOHICCHCRR> getEvents() {
      return this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI;
   }

   public void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(List<CORCOCICIRIOHROHROIIOOHICCHCRR> var1) {
      this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         IIHRRHORCRCROCHHOHORCHCROCIHRO var2 = (IIHRRHORCRCROCHHOHORCHCROCIHRO)var1;
         return Objects.equals(this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI, var2.HIHROCOCCHRHHRROHCRCCHOIRCHIHI);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameEventBatchPostRequest {\n");
      var1.append("    events: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HIHROCOCCHRHHRROHCRCCHOIRCHIHI)).append("\n");
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
               "The required field(s) %s in GameEventBatchPostRequest is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameEventBatchPostRequest` properties. JSON: %s", var3.getKey(), var0.toString()
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
      if (!var6.get("events").isJsonArray()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `events` to be an array in the JSON string but got `%s`", var6.get("events").toString())
         );
      }

      JsonArray var8 = var6.getAsJsonArray("events");

      for (int var4 = 0; var4 < var8.size(); var4++) {
         CORCOCICIRIOHROHROIIOOHICCHCRR.validateJsonElement(var8.get(var4));
      }
   }

   public static IIHRRHORCRCROCHHOHORCHCROCIHRO OOHRIIOOHROIOHCIRIHRHRRICRRHOI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, IIHRRHORCRCROCHHOHORCHCROCIHRO.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("events");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("events");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!IIHRRHORCRCROCHHOHORCHCROCIHRO.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(IIHRRHORCRCROCHHOHORCHCROCIHRO.class));
         return (TypeAdapter<T>)(new TypeAdapter<IIHRRHORCRCROCHHOHORCHCROCIHRO>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IIHRRHORCRCROCHHOHORCHCROCIHRO var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public IIHRRHORCRCROCHHOHORCHCROCIHRO IHHCHHHCRIHOOCOIOOCRIIICIOROIR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (IIHRRHORCRCROCHHOHORCHCROCIHRO)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
