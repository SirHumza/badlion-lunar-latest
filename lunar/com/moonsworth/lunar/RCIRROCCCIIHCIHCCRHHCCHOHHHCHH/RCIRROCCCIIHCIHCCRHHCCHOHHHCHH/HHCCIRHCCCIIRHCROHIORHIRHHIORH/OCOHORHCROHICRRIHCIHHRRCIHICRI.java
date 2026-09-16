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
import java.util.HashSet;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI implements Serializable {
   private static final long IHCCOOCIIIIIIHIOHRICIIHCCIIIIH = 1L;
   public static final String RICCOIOIORIHORRIRIOCRICRHRRIRC = "type";
   @SerializedName("type")
   private String type;
   public static final String IRCRHHCRHIIIHROOCORCHHHRIIROIR = "data";
   @SerializedName("data")
   private CIOHHCORHRCCRICCCORIHCRHCCCRRR RRROIHOIHOORCCOHOOCHRRRCIIRHHH;
   public static final String IRIOOHCHIHIHRCOOHOCHOOOCIIICIO = "__failed_parse";
   @SerializedName("__failed_parse")
   private Boolean IIRRRHRHIRCCIIHORIHRHHHOIIHICH = true;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public OCOHORHCROHICRRIHCIHHRRCIHICRI RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(String var1) {
      this.type = var1;
      return this;
   }

   @Nonnull
   public String getType() {
      return this.type;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
      this.RRROIHOIHOORCCOHOOCHRRRCIIRHHH = var1;
      return this;
   }

   @Nonnull
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR CICOIHIRIIHHCIOICHRHICRIRCIOHC() {
      return this.RRROIHOIHOORCCOHOOCHRRRCIIRHHH;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
      this.RRROIHOIHOORCCOHOOCHRRRCIIRHHH = var1;
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Boolean var1) {
      this.IIRRRHRHIRCCIIHORIHRHHHOIIHICH = var1;
      return this;
   }

   @Nullable
   public Boolean HCOIOHCCHIHRCHCCICCIRCIOHCRIHH() {
      return this.IIRRRHRHIRCCIIHORIHRHHHOIIHICH;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Boolean var1) {
      this.IIRRRHRHIRCCIIHORIHRHHHOIIHICH = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         OCOHORHCROHICRRIHCIHHRRCIHICRI var2 = (OCOHORHCROHICRRIHCIHHRRCIHICRI)var1;
         return Objects.equals(this.type, var2.type)
            && Objects.equals(this.RRROIHOIHOORCCOHOOCHRRRCIIRHHH, var2.RRROIHOIHOORCCOHOOCHRRRCIIRHHH)
            && Objects.equals(this.IIRRRHRHIRCCIIHORIHRHHHOIIHICH, var2.IIRRRHRHIRCCIIHORIHRHHHOIIHICH);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.RRROIHOIHOORCCOHOOCHRRRCIIRHHH, this.IIRRRHRHIRCCIIHORIHRHHHOIIHICH);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameFailedParseEvent {\n");
      var1.append("    type: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.type)).append("\n");
      var1.append("    data: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RRROIHOIHOORCCOHOOCHRRRCIIRHHH)).append("\n");
      var1.append("    failedParse: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.IIRRRHRHIRCCIIHORIHRHHHOIIHICH)).append("\n");
      var1.append("}");
      return var1.toString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var1) {
      return var1 == null ? "null" : var1.toString().replace("\n", "\n    ");
   }

   public static void validateJsonElement(JsonElement var0) {
      if (var0 == null && !CIIIIIHIHRHCOOHOIORCHHCORHRCCO.isEmpty()) {
         throw new IllegalArgumentException(
            String.format("The required field(s) %s in GameFailedParseEvent is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString())
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameFailedParseEvent` properties. JSON: %s", var3.getKey(), var0.toString()
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
   }

   public static OCOHORHCROHICRRIHCIHHRRCIHICRI OCIOROHIHRROROOIRRHRRCCHHRRRHI(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, OCOHORHCROHICRRIHCIHHRRCIHICRI.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("data");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("__failed_parse");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("type");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("data");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!OCOHORHCROHICRRIHCIHHRRCIHICRI.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(OCOHORHCROHICRRIHCIHHRRCIHICRI.class));
         return (TypeAdapter<T>)(new TypeAdapter<OCOHORHCROHICRRIHCIHHRRCIHICRI>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, OCOHORHCROHICRRIHCIHHRRCIHICRI var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public OCOHORHCROHICRRIHCIHHRRCIHICRI IIRHCHHOICHRICOOCRORCCIOOIHOIR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (OCOHORHCROHICRRIHCIHHRRCIHICRI)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
