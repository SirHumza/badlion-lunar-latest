package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.Gson;
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
import java.util.HashSet;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class RIROICHCRROROHCCROOCCCCOCHCCRI implements Serializable {
   private static final long IOIIROROOICRCHCOHHIIHRCRIOIOOH = 1L;
   public static final String IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI = "width";
   @SerializedName("width")
   private BigDecimal OHORCCHOIOCRHROIRRHICHCIIOCRCH;
   public static final String OICIOHIRRIIOIHOOHOCHIIOHHIRCCO = "height";
   @SerializedName("height")
   private BigDecimal IHHOOOHOIIOHRROCHCOOIIHHCOIHII;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public RIROICHCRROROHCCROOCCCCOCHCCRI OOROOCCIRCCRHOIOIORIHCHHOOCCOR(BigDecimal var1) {
      this.OHORCCHOIOCRHROIRRHICHCIIOCRCH = var1;
      return this;
   }

   @Nullable
   public BigDecimal IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH() {
      return this.OHORCCHOIOCRHROIRRHICHCIIOCRCH;
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(BigDecimal var1) {
      this.OHORCCHOIOCRHROIRRHICHCIIOCRCH = var1;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI CRICCOOHHHCHOORCICOCOHIHOIRHOO(BigDecimal var1) {
      this.IHHOOOHOIIOHRROCHCOOIIHHCOIHII = var1;
      return this;
   }

   @Nullable
   public BigDecimal OCCORIIORHORROHHROHHOORHIHRIOO() {
      return this.IHHOOOHOIIOHRROCHCOOIIHHCOIHII;
   }

   public void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(BigDecimal var1) {
      this.IHHOOOHOIIOHRROCHCOOIIHHCOIHII = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         RIROICHCRROROHCCROOCCCCOCHCCRI var2 = (RIROICHCRROROHCCROOCCCCOCHCCRI)var1;
         return Objects.equals(this.OHORCCHOIOCRHROIRRHICHCIIOCRCH, var2.OHORCCHOIOCRHROIRRHICHCIIOCRCH)
            && Objects.equals(this.IHHOOOHOIIOHRROCHCOOIIHHCOIHII, var2.IHHOOOHOIIOHRROCHCOOIIHHCOIHII);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.OHORCCHOIOCRHROIRRHICHCIIOCRCH, this.IHHOOOHOIIOHRROCHCOOIIHHCOIHII);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindExportResolution {\n");
      var1.append("    width: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OHORCCHOIOCRHROIRRHICHCIIOCRCH)).append("\n");
      var1.append("    height: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.IHHOOOHOIIOHRROCHCOOIIHHCOIHII)).append("\n");
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
               "The required field(s) %s in GameRewindExportResolution is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindExportResolution` properties. JSON: %s", var3.getKey(), var0.toString()
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
   }

   public static RIROICHCRROROHCCROOCCCCOCHCCRI CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, RIROICHCRROROHCCROOCCCCOCHCCRI.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("width");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("height");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("width");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("height");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!RIROICHCRROROHCCROOCCCCOCHCCRI.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(RIROICHCRROROHCCROOCCCCOCHCCRI.class));
         return (TypeAdapter<T>)(new TypeAdapter<RIROICHCRROROHCCROOCCCCOCHCCRI>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, RIROICHCRROROHCCROOCCCCOCHCCRI var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public RIROICHCRROROHCCROOCCCCOCHCCRI ICICIOCHHHIHOCHCOHORIHRCOHHOCR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (RIROICHCRROROHCCROOCCCCOCHCCRI)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
