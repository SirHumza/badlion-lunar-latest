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

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Serializable {
   private static final long HRICIORORHCRHCCCIIIHRRHCICOHOR = 1L;
   public static final String IHHCHIIHOOHRROCRRRHHHCOOHCOORC = "city";
   @SerializedName("city")
   private String city;
   public static final String CICOOHICHIROHIRCRRIOIIRRIHCCHC = "continent";
   @SerializedName("continent")
   private String IRRIHROCORIOOCHHCHCHOHCIOHHRRI;
   public static final String IHRCROHROHOCCHIHOHRROHOCOIRHIO = "country";
   @SerializedName("country")
   private String ORCORCRRIRIROIORRCCCCHRHRCOHOH;
   public static final String COOOIIOHIRCRCHIHRHHICOOHIOORRR = "region";
   @SerializedName("region")
   private String region;
   public static final String ROIHROCROORRCCOIRRIHHORCROOORO = "region_code";
   @SerializedName("region_code")
   private String OHHHIRCIIIRRCORHHRICIRCOORORCH;
   public static final String RHCICHRICRIIIHRRCICHOOOIOOOICH = "postal_code";
   @SerializedName("postal_code")
   private String HIORIIIIOCCCRCHCOROROCCOIOOIIR;
   public static final String RHCHHROCORIHCIORRRIIOHIRHCRIOH = "metro_code";
   @SerializedName("metro_code")
   private String OOOOCHIHOOCHCCIHHRRICIRIOHOCRO;
   public static final String RCCICOCCCHROHOCCHIHORIHHCOHOHH = "timezone";
   @SerializedName("timezone")
   private String timezone;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RCOCRROHHROHHOCRCCCHCIROIIOORC(String var1) {
      this.city = var1;
      return this;
   }

   @Nonnull
   public String getCity() {
      return this.city;
   }

   public void setCity(String var1) {
      this.city = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH ORCOCORROHIROCCIORORRRRCHIOOCH(String var1) {
      this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI = var1;
      return this;
   }

   @Nonnull
   public String IHORRHOROHHHIORCCHRCRIRRHHCCCO() {
      return this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI;
   }

   public void HOIHOROOIOOCOIHCRIRIRIRRICIIHC(String var1) {
      this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(String var1) {
      this.ORCORCRRIRIROIORRCCCCHRHRCOHOH = var1;
      return this;
   }

   @Nonnull
   public String CRHHOOCRCOHHRHOOOCHCROOHIOOCOH() {
      return this.ORCORCRRIRIROIORRCCCCHRHRCOHOH;
   }

   public void RRORCOIRRIICOOICOIOCORHORCHCOC(String var1) {
      this.ORCORCRRIRIROIORRCCCCHRHRCOHOH = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(String var1) {
      this.region = var1;
      return this;
   }

   @Nonnull
   public String getRegion() {
      return this.region;
   }

   public void setRegion(String var1) {
      this.region = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RRHOOOORORHHOOIHRCCHIIHHIIIIOH(String var1) {
      this.OHHHIRCIIIRRCORHHRICIRCOORORCH = var1;
      return this;
   }

   @Nonnull
   public String IOCCCRIHOCHRCHRHCRHROIRIRHHHIR() {
      return this.OHHHIRCIIIRRCORHHRICIRCOORORCH;
   }

   public void HIHHOCRHHRORRHHRORRRIIHHORIHOC(String var1) {
      this.OHHHIRCIIIRRCORHHRICIRCOORORCH = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OOCHRIIIRIHRRCRIORHCROIIHCRRIC(String var1) {
      this.HIORIIIIOCCCRCHCOROROCCOIOOIIR = var1;
      return this;
   }

   @Nonnull
   public String CHRCRHHRCCOICCOOIIRIOHCOHCHHIC() {
      return this.HIORIIIIOCCCRCHCOROROCCOIOOIIR;
   }

   public void OCIROOIHIHRHOCCHIIIROOCRIIOCRR(String var1) {
      this.HIORIIIIOCCCRCHCOROROCCOIOOIIR = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH HRCOCHHHCCIORCORCHIOOOCCCCHICH(String var1) {
      this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO = var1;
      return this;
   }

   @Nonnull
   public String ROCRHIOCHIIOCROIHHOHHROCHCIHCH() {
      return this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO;
   }

   public void IIHHICHCCCOHCHROIRIHICCHHOROCR(String var1) {
      this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH IIIIRHIHROIRCROHHROIHIIHRCRRHO(String var1) {
      this.timezone = var1;
      return this;
   }

   @Nonnull
   public String getTimezone() {
      return this.timezone;
   }

   public void setTimezone(String var1) {
      this.timezone = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
         return Objects.equals(this.city, var2.city)
            && Objects.equals(this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI, var2.IRRIHROCORIOOCHHCHCHOHCIOHHRRI)
            && Objects.equals(this.ORCORCRRIRIROIORRCCCCHRHRCOHOH, var2.ORCORCRRIRIROIORRCCCCHRHRCOHOH)
            && Objects.equals(this.region, var2.region)
            && Objects.equals(this.OHHHIRCIIIRRCORHHRICIRCOORORCH, var2.OHHHIRCIIIRRCORHHRICIRCOORORCH)
            && Objects.equals(this.HIORIIIIOCCCRCHCOROROCCOIOOIIR, var2.HIORIIIIOCCCRCHCOROROCCOIOOIIR)
            && Objects.equals(this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO, var2.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO)
            && Objects.equals(this.timezone, var2.timezone);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.city,
         this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI,
         this.ORCORCRRIRIROIORRCCCCHRHRCOHOH,
         this.region,
         this.OHHHIRCIIIRRCORHHRICIRCOORORCH,
         this.HIORIIIIOCCCRCHCOROROCCOIOOIIR,
         this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO,
         this.timezone
      );
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class BaseGameEventGeoLocation {\n");
      var1.append("    city: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.city)).append("\n");
      var1.append("    continent: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.IRRIHROCORIOOCHHCHCHOHCIOHHRRI)).append("\n");
      var1.append("    country: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.ORCORCRRIRIROIORRCCCCHRHRCOHOH)).append("\n");
      var1.append("    region: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.region)).append("\n");
      var1.append("    regionCode: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OHHHIRCIIIRRCORHHRICIRCOORORCH)).append("\n");
      var1.append("    postalCode: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HIORIIIIOCCCRCHCOROROCCOIOOIIR)).append("\n");
      var1.append("    metroCode: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OOOOCHIHOOCHCCIHHRRICIRIOHOCRO)).append("\n");
      var1.append("    timezone: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.timezone)).append("\n");
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
               "The required field(s) %s in BaseGameEventGeoLocation is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `BaseGameEventGeoLocation` properties. JSON: %s", var3.getKey(), var0.toString()
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
      if (!var5.get("city").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", var5.get("city").toString())
         );
      }

      if (!var5.get("continent").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `continent` to be a primitive type in the JSON string but got `%s`", var5.get("continent").toString())
         );
      }

      if (!var5.get("country").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", var5.get("country").toString())
         );
      }

      if (!var5.get("region").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", var5.get("region").toString())
         );
      }

      if (!var5.get("region_code").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `region_code` to be a primitive type in the JSON string but got `%s`", var5.get("region_code").toString())
         );
      }

      if (!var5.get("postal_code").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", var5.get("postal_code").toString())
         );
      }

      if (!var5.get("metro_code").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `metro_code` to be a primitive type in the JSON string but got `%s`", var5.get("metro_code").toString())
         );
      }

      if (!var5.get("timezone").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", var5.get("timezone").toString())
         );
      }
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RRRHHIRORHCHHCOOCIHOICORHHCHHO(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, HHCCIRHCCCIIRHCROHIORHIRHHIORH.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("city");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("continent");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("country");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("region");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("region_code");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("postal_code");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("metro_code");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("timezone");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("city");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("continent");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("country");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("region");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("region_code");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("postal_code");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("metro_code");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("timezone");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!HHCCIRHCCCIIRHCROHIORHIRHHIORH.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(HHCCIRHCCCIIRHCROHIORHIRHHIORH.class));
         return (TypeAdapter<T>)(new TypeAdapter<HHCCIRHCCCIIRHCROHIORHIRHHIORH>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public HHCCIRHCCCIIRHCROHIORHIRHHIORH CRRRICCRROCOHHOHIICIHORCOORRRH(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               HHCCIRHCCCIIRHCROHIORHIRHHIORH.validateJsonElement(var2x);
               return (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
