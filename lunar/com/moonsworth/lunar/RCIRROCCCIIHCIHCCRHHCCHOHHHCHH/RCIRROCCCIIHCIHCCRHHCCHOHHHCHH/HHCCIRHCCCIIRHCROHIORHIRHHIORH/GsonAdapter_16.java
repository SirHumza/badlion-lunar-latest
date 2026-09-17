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

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements Serializable {
   private static final long RHHRICHORHROCCOCCRCRIRHIIOORCH = 1L;
   public static final String OCRHCRHICOCOOOHIROIHCIHIRICRCI = "host_uuid";
   @SerializedName("host_uuid")
   private String HICROROICOCOHOOHHCRCROOCCRCIHR;
   public static final String OOHCHIOCOOORHOHOCRCOOIICCICIHI = "host_username";
   @SerializedName("host_username")
   private String OCICRRIRIIHROCCOOCOICRCRROOIOC;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH HRHRORCIRICHCCCCCHICOOICIRHRIO(String var1) {
      this.HICROROICOCOHOOHHCRCROOCCRCIHR = var1;
      return this;
   }

   @Nullable
   public String ICCIIIRHHOOIHCCHIRRCRHICHIHRIH() {
      return this.HICROROICOCOHOOHHCRCROOCCRCIHR;
   }

   public void ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(String var1) {
      this.HICROROICOCOHOOHHCRCROOCCRCIHR = var1;
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH HOHCCHOIOHOHHOROHOIIHOOHORRHRO(String var1) {
      this.OCICRRIRIIHROCCOOCOICRCRROOIOC = var1;
      return this;
   }

   @Nullable
   public String ICOHIIIRCIORCORHRRROOOOCOOROIC() {
      return this.OCICRRIRIIHROCCOOCOICRCRROOIOC;
   }

   public void IICCOOCHCHROORHHIIHROHCCRHRCOR(String var1) {
      this.OCICRRIRIIHROCCOOCOICRCRROOIOC = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1;
         return Objects.equals(this.HICROROICOCOHOOHHCRCROOCCRCIHR, var2.HICROROICOCOHOOHHCRCROOCCRCIHR)
            && Objects.equals(this.OCICRRIRIIHROCCOOCOICRCRROOIOC, var2.OCICRRIRIIHROCCOOCOICRCRROOIOC);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.HICROROICOCOHOOHHCRCROOCCRCIHR, this.OCICRRIRIIHROCCOOCOICRCRROOIOC);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class BaseGameEventLocationHostedWorld {\n");
      var1.append("    hostUuid: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HICROROICOCOHOOHHCRCROOCCRCIHR)).append("\n");
      var1.append("    hostUsername: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OCICRRIRIIHROCCOOCOICRCRROOIOC)).append("\n");
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
               "The required field(s) %s in BaseGameEventLocationHostedWorld is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `BaseGameEventLocationHostedWorld` properties. JSON: %s",
                  var3.getKey(),
                  var0.toString()
               )
            );
         }
      }

      JsonObject var4 = var0.getAsJsonObject();
      if (var4.get("host_uuid") != null && !var4.get("host_uuid").isJsonNull() && !var4.get("host_uuid").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `host_uuid` to be a primitive type in the JSON string but got `%s`", var4.get("host_uuid").toString())
         );
      }

      if (var4.get("host_username") != null && !var4.get("host_username").isJsonNull() && !var4.get("host_username").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `host_username` to be a primitive type in the JSON string but got `%s`", var4.get("host_username").toString())
         );
      }
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH IROCHOHCORHCOCCCOCHORCICRORIIC(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("host_uuid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("host_username");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class));
         return (TypeAdapter<T>)(new TypeAdapter<HRCHROOHRIHCRCRHRIIROCIRHOIRHH>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public HRCHROOHRIHCRCRHRIIROCIRHOIRHH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.validateJsonElement(var2x);
               return (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
