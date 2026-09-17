package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI implements Serializable {
   private static final long OHIROCOCCHORRCCHIOICOCOHRHORCC = 1L;
   public static final String RCHHCIOCRICRORCCOIOIOIHROHCRCH = "duration_ms";
   @SerializedName("duration_ms")
   private BigDecimal OCCHHIHOOOHHORHHOHRCHRCCIOCOCI;
   public static final String IRHOOCHROIOHRROIOIIIHORCICOOCH = "properties";
   @SerializedName("properties")
   private List<String> RCIICICHIIRIIRHHROCOOOHRROOIIC = new ArrayList<>();
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(BigDecimal var1) {
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

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI IIHRRHORCRCROCHHOHORCHCROCIHRO(List<String> var1) {
      this.RCIICICHIIRIIRHHROCOOOHRROOIIC = var1;
      return this;
   }

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI OHRRIORRCRIRORHRIOOCORIIRRRRRO(String var1) {
      if (this.RCIICICHIIRIIRHHROCOOOHRROOIIC == null) {
         this.RCIICICHIIRIIRHHROCOOOHRROOIIC = new ArrayList<>();
      }

      this.RCIICICHIIRIIRHHROCOOOHRROOIIC.add(var1);
      return this;
   }

   @Nullable
   public List<String> HHOIOCRIRIOCOIHHOOHICIOIIOHCOR() {
      return this.RCIICICHIIRIIRHHROCOOOHRROOIIC;
   }

   public void OCOHORHCROHICRRIHCIHHRRCIHICRI(List<String> var1) {
      this.RCIICICHIIRIIRHHROCOOOHRROOIIC = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = (OHHRIOHROOIHOROCIRHCHORIHRRRRI)var1;
         return Objects.equals(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI, var2.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)
            && Objects.equals(this.RCIICICHIIRIIRHHROCOOOHRROOIIC, var2.RCIICICHIIRIIRHHROCOOOHRROOIIC);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI, this.RCIICICHIIRIIRHHROCOOOHRROOIIC);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindBaseLayer {\n");
      var1.append("    durationMs: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OCCHHIHOOOHHORHHOHRCHRCCIOCOCI)).append("\n");
      var1.append("    properties: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RCIICICHIIRIIRHHROCOOOHRROOIIC)).append("\n");
      var1.append("}");
      return var1.toString();
   }

   private String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var1) {
      return var1 == null ? "null" : var1.toString().replace("\n", "\n    ");
   }

   public static void validateJsonElement(JsonElement var0) {
      if (var0 == null && !CIIIIIHIHRHCOOHOIORCHHCORHRCCO.isEmpty()) {
         throw new IllegalArgumentException(
            String.format("The required field(s) %s in GameRewindBaseLayer is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString())
         );
      }

      JsonObject var1 = var0.getAsJsonObject();
      if (var1.get("properties") != null && !var1.get("properties").isJsonNull() && !var1.get("properties").isJsonArray()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", var1.get("properties").toString())
         );
      }
   }

   public static OHHRIOHROOIHOROCIRHCHORIHRRRRI CICOIHIRIIHHCIOICHRHICRIRCIOHC(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, OHHRIOHROOIHOROCIRHCHORIHRRRRI.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("duration_ms");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("properties");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("duration_ms");
   }
}
