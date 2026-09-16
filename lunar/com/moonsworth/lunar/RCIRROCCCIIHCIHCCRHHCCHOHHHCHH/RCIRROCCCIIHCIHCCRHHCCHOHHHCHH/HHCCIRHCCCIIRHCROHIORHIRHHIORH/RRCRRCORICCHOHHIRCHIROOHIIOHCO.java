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
import javax.annotation.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements Serializable {
   private static final long HIIRCRROICHCOROOCCCCOIOOOCCIIC = 1L;
   public static final String IRRCHIRICCIHCCIHOHRCHRHRHCRCOH = "id";
   @SerializedName("id")
   private String id;
   public static final String RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC = "name";
   @SerializedName("name")
   private String name;
   public static final String ORICICIICROCRICRHRHHRCHHRCRHOR = "version";
   @SerializedName("version")
   private String version;
   public static final String HOCRHOROHIHRCRHCRIIIHCHRRHOIIC = "type";
   @SerializedName("type")
   private String type;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(String var1) {
      this.id = var1;
      return this;
   }

   @Nullable
   public String getId() {
      return this.id;
   }

   public void setId(String var1) {
      this.id = var1;
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO HRHIHIRHRCHHRORRRCORHOCIRHRIOR(String var1) {
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

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO OCOROCROIRCHIHIHHOOIRIIIRRCRHI(String var1) {
      this.version = var1;
      return this;
   }

   @Nullable
   public String getVersion() {
      return this.version;
   }

   public void setVersion(String var1) {
      this.version = var1;
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO IOCIIROIRCOHIRHHHROHCOOHIICIHI(String var1) {
      this.type = var1;
      return this;
   }

   @Nullable
   public String getType() {
      return this.type;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = (RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1;
         return Objects.equals(this.id, var2.id)
            && Objects.equals(this.name, var2.name)
            && Objects.equals(this.version, var2.version)
            && Objects.equals(this.type, var2.type);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id, this.name, this.version, this.type);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class BaseGameEventInstalledModsInner {\n");
      var1.append("    id: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id)).append("\n");
      var1.append("    name: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.name)).append("\n");
      var1.append("    version: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.version)).append("\n");
      var1.append("    type: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.type)).append("\n");
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
               "The required field(s) %s in BaseGameEventInstalledModsInner is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `BaseGameEventInstalledModsInner` properties. JSON: %s",
                  var3.getKey(),
                  var0.toString()
               )
            );
         }
      }

      JsonObject var4 = var0.getAsJsonObject();
      if (var4.get("id") != null && !var4.get("id").isJsonNull() && !var4.get("id").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", var4.get("id").toString())
         );
      }

      if (var4.get("name") != null && !var4.get("name").isJsonNull() && !var4.get("name").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", var4.get("name").toString())
         );
      }

      if (var4.get("version") != null && !var4.get("version").isJsonNull() && !var4.get("version").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", var4.get("version").toString())
         );
      }

      if (var4.get("type") != null && !var4.get("type").isJsonNull() && !var4.get("type").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", var4.get("type").toString())
         );
      }
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO CCRHOICIRORRHOOOCIHHHHCHCICHOH(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, RRCRRCORICCHOHHIRCHIROOHIIOHCO.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("name");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("version");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("type");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!RRCRRCORICCHOHHIRCHIROOHIIOHCO.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(RRCRRCORICCHOHHIRCHIROOHIIOHCO.class));
         return (TypeAdapter<T>)(new TypeAdapter<RRCRRCORICCHOHHIRCHIROOHIIOHCO>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public RRCRRCORICCHOHHIRCHIROOHIIOHCO RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               RRCRRCORICCHOHHIRCHIROOHIIOHCO.validateJsonElement(var2x);
               return (RRCRRCORICCHOHHIRCHIROOHIIOHCO)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
