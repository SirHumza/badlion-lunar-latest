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

public class RICRIRRCOHRCOCRRHHCRHRROOIOHHR implements Serializable {
   private static final long OOIRIOIHHIOOIHIHHIHROCIHHIRCHI = 1L;
   public static final String HCOOCHIICIIHIHHOHOORCHOIRRIRIO = "duration_ms";
   @SerializedName("duration_ms")
   private BigDecimal OCCHHIHOOOHHORHHOHRCHRCCIOCOCI;
   public static final String HOHHCRCHCORRIOHROCIOOHOOROIRCI = "layers";
   @SerializedName("layers")
   private List<IHIRRIIORRHORHRORIHOROIRCORCOO> layers = new ArrayList<>();
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR RRCRRCORICCHOHHIRCHIROOHIIOHCO(BigDecimal var1) {
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

   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR IIRHCHHOICHRICOOCRORCCIOOIHOIR(List<IHIRRIIORRHORHRORIHOROIRCORCOO> var1) {
      this.layers = var1;
      return this;
   }

   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO var1) {
      if (this.layers == null) {
         this.layers = new ArrayList<>();
      }

      this.layers.add(var1);
      return this;
   }

   @Nonnull
   public List<IHIRRIIORRHORHRORIHOROIRCORCOO> getLayers() {
      return this.layers;
   }

   public void OHHRIOHROOIHOROCIRHCHORIHRRRRI(List<IHIRRIIORRHORHRORIHOROIRCORCOO> var1) {
      this.layers = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         RICRIRRCOHRCOCRRHHCRHRROOIOHHR var2 = (RICRIRRCOHRCOCRRHHCRHRROOIOHHR)var1;
         return Objects.equals(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI, var2.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI) && Objects.equals(this.layers, var2.layers);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI, this.layers);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindEditorTimeline {\n");
      var1.append("    durationMs: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)).append("\n");
      var1.append("    layers: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.layers)).append("\n");
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
               "The required field(s) %s in GameRewindEditorTimeline is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindEditorTimeline` properties. JSON: %s", var3.getKey(), var0.toString()
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
      if (!var6.get("layers").isJsonArray()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `layers` to be an array in the JSON string but got `%s`", var6.get("layers").toString())
         );
      }

      JsonArray var8 = var6.getAsJsonArray("layers");

      for (int var4 = 0; var4 < var8.size(); var4++) {
         IHIRRIIORRHORHRORIHOROIRCORCOO.validateJsonElement(var8.get(var4));
      }
   }

   public static RICRIRRCOHRCOCRRHHCRHRROOIOHHR RCHHHORIRORROOHRRHHIIIOIROHHCC(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("duration_ms");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("layers");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("duration_ms");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("layers");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class));
         return (TypeAdapter<T>)(new TypeAdapter<RICRIRRCOHRCOCRRHHCRHRROOIOHHR>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, RICRIRRCOHRCOCRRHHCRHRROOIOHHR var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public RICRIRRCOHRCOCRRHHCRHRROOIOHHR ORHIOICIOCRRHOOCOHRORIHICHRCRR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (RICRIRRCOHRCOCRRHHCRHRROOIOHHR)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
