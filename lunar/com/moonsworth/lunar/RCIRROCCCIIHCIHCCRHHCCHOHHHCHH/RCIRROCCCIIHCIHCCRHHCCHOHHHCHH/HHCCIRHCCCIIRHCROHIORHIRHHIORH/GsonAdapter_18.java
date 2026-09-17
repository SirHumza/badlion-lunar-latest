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

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements Serializable {
   private static final long CCHCOROOHHCIHOHOCHIHRHOHOCROII = 1L;
   public static final String RCICHHOCCHOROIORCOHOHIRRHCIIOR = "type";
   @SerializedName("type")
   private String type;
   public static final String RHCHRCCRRHORIOCIOHHCRHCHICRIHH = "server_ip";
   @SerializedName("server_ip")
   private String serverIp;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public CRRRICCRROCOHHOHIICIHORCOORRRH ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(String var1) {
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

   public CRRRICCRROCOHHOHIICIHORCOORRRH CHHIICHRIIROIOHIHIIROICOCCROCI(String var1) {
      this.serverIp = var1;
      return this;
   }

   @Nullable
   public String getServerIp() {
      return this.serverIp;
   }

   public void COOCCHICCCIIICRHIOCOCIOOORCOCC(String var1) {
      this.serverIp = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (CRRRICCRROCOHHOHIICIHORCOORRRH)var1;
         return Objects.equals(this.type, var2.type) && Objects.equals(this.serverIp, var2.serverIp);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.serverIp);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class BaseGameEventInboundLocation {\n");
      var1.append("    type: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.type)).append("\n");
      var1.append("    serverIp: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.serverIp)).append("\n");
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
               "The required field(s) %s in BaseGameEventInboundLocation is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `BaseGameEventInboundLocation` properties. JSON: %s", var3.getKey(), var0.toString()
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

      if (var5.get("server_ip") != null && !var5.get("server_ip").isJsonNull() && !var5.get("server_ip").isJsonPrimitive()) {
         throw new IllegalArgumentException(
            String.format("Expected the field `server_ip` to be a primitive type in the JSON string but got `%s`", var5.get("server_ip").toString())
         );
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, CRRRICCRROCOHHOHIICIHORCOORRRH.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("type");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("server_ip");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("type");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!CRRRICCRROCOHHOHIICIHORCOORRRH.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(CRRRICCRROCOHHOHIICIHORCOORRRH.class));
         return (TypeAdapter<T>)(new TypeAdapter<CRRRICCRROCOHHOHIICIHORCOORRRH>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, CRRRICCRROCOHHOHIICIHORCOORRRH var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public CRRRICCRROCOHHOHIICIHORCOORRRH RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               CRRRICCRROCOHHOHIICIHORCOORRRH.validateJsonElement(var2x);
               return (CRRRICCRROCOHHOHIICIHORCOORRRH)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
