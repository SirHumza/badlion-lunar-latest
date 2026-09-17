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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nonnull;

public class CIOHHCORHRCCRICCCORIHCRHCCCRRR implements Serializable {
   private static final long HOORIORICHOORIIRRRCOHCIRIICOCI = 1L;
   public static final String RHIIHOIIRICHOIHRIRRRIRORCCICRO = "timestamp";
   @SerializedName("timestamp")
   private OffsetDateTime COCCRCRCRHROIRCCHOHRICCCIOCICI;
   private Map<String, Object> ICRICICCRIHIRCRIOROCCOCOHHCIRC;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR HHCCIRHCCCIIRHCROHIORHIRHHIORH(OffsetDateTime var1) {
      this.COCCRCRCRHROIRCCHOHRICCCIOCICI = var1;
      return this;
   }

   @Nonnull
   public OffsetDateTime CHHIICHRIIROIOHIHIIROICOCCROCI() {
      return this.COCCRCRCRHROIRCCHOHRICCCIOCICI;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OffsetDateTime var1) {
      this.COCCRCRCRHROIRCCHOHRICCCIOCICI = var1;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Object var2) {
      if (this.ICRICICCRIHIRCRIOROCCOCOHHCIRC == null) {
         this.ICRICICCRIHIRCRIOROCCOCOHHCIRC = new HashMap<>();
      }

      this.ICRICICCRIHIRCRIOROCCOCOHHCIRC.put(var1, var2);
      return this;
   }

   public Map<String, Object> HHIOCIRHCHIRHHRIRCHOIRORHCRCRI() {
      return this.ICRICICCRIHIRCRIOROCCOCOHHCIRC;
   }

   public Object RHRCRCIOIOICRHRCCROIICCRRCOOOI(String var1) {
      return this.ICRICICCRIHIRCRIOROCCOCOHHCIRC == null ? null : this.ICRICICCRIHIRCRIOROCCOCOHHCIRC.get(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
         return Objects.equals(this.COCCRCRCRHROIRCCHOHRICCCIOCICI, var2.COCCRCRCRHROIRCCHOHRICCCIOCICI)
            && Objects.equals(this.ICRICICCRIHIRCRIOROCCOCOHHCIRC, var2.ICRICICCRIHIRCRIOROCCOCOHHCIRC);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.COCCRCRCRHROIRCCHOHRICCCIOCICI, this.ICRICICCRIHIRCRIOROCCOCOHHCIRC);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameFailedParseEventData {\n");
      var1.append("    timestamp: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.COCCRCRCRHROIRCCHOHRICCCIOCICI)).append("\n");
      var1.append("    additionalProperties: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.ICRICICCRIHIRCRIOROCCOCOHHCIRC)).append("\n");
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
               "The required field(s) %s in GameFailedParseEventData is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (String var2 : CIIIIIHIHRHCOOHOIORCHHCORHRCCO) {
         if (var0.getAsJsonObject().get(var2) == null) {
            throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", var2, var0.toString()));
         }
      }

      JsonObject var3 = var0.getAsJsonObject();
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR HORHCHIIOCRROHOHRCORCCICCRCCHO(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, CIOHHCORHRCCRICCCORIHCRHCCCRRR.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("timestamp");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("timestamp");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(final Gson var1, TypeToken<T> var2) {
         if (!CIOHHCORHRCCRICCCORIHCRHCCCRRR.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(CIOHHCORHRCCRICCCORIHCRHCCCRRR.class));
         return (TypeAdapter<T>)(new TypeAdapter<CIOHHCORHRCCRICCCORIHCRHCCCRRR>() {
               public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1x, CIOHHCORHRCCRICCCORIHCRHCCCRRR var2x) {
                  JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
                  var3x.remove("additionalProperties");
                  if (var2x.HHIOCIRHCHIRHHRIRCHOIRORHCRCRI() != null) {
                     for (Entry var5 : var2x.HHIOCIRHCHIRHHRIRCHOIRORHCRCRI().entrySet()) {
                        if (var5.getValue() instanceof String) {
                           var3x.addProperty((String)var5.getKey(), (String)var5.getValue());
                        } else if (var5.getValue() instanceof Number) {
                           var3x.addProperty((String)var5.getKey(), (Number)var5.getValue());
                        } else if (var5.getValue() instanceof Boolean) {
                           var3x.addProperty((String)var5.getKey(), (Boolean)var5.getValue());
                        } else if (var5.getValue() instanceof Character) {
                           var3x.addProperty((String)var5.getKey(), (Character)var5.getValue());
                        } else {
                           JsonElement var6 = var1.toJsonTree(var5.getValue());
                           if (var6.isJsonArray()) {
                              var3x.add((String)var5.getKey(), var6.getAsJsonArray());
                           } else {
                              var3x.add((String)var5.getKey(), var6.getAsJsonObject());
                           }
                        }
                     }
                  }

                  var3.write(var1x, var3x);
               }

               public CIOHHCORHRCCRICCCORIHCRHCCCRRR OHHRIOHROOIHOROCIRHCHORIHRRRRI(JsonReader var1x) {
                  JsonElement var2x = (JsonElement)var3.read(var1x);
                  JsonObject var3x = var2x.getAsJsonObject();
                  CIOHHCORHRCCRICCCORIHCRHCCCRRR var4x = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var4.fromJsonTree(var3x);

                  for (Entry var6 : var3x.entrySet()) {
                     if (!CIOHHCORHRCCRICCCORIHCRHCCCRRR.OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var6.getKey())) {
                        if (((JsonElement)var6.getValue()).isJsonPrimitive()) {
                           if (((JsonElement)var6.getValue()).getAsJsonPrimitive().isString()) {
                              var4x.IRCIIHHICIHRCOCRROCOICRIHHCCHH((String)var6.getKey(), ((JsonElement)var6.getValue()).getAsString());
                           } else if (((JsonElement)var6.getValue()).getAsJsonPrimitive().isNumber()) {
                              var4x.IRCIIHHICIHRCOCRROCOICRIHHCCHH((String)var6.getKey(), ((JsonElement)var6.getValue()).getAsNumber());
                           } else {
                              if (!((JsonElement)var6.getValue()).getAsJsonPrimitive().isBoolean()) {
                                 throw new IllegalArgumentException(
                                    String.format(
                                       "The field `%s` has unknown primitive type. Value: %s", var6.getKey(), ((JsonElement)var6.getValue()).toString()
                                    )
                                 );
                              }

                              var4x.IRCIIHHICIHRCOCRROCOICRIHHCCHH((String)var6.getKey(), ((JsonElement)var6.getValue()).getAsBoolean());
                           }
                        } else if (((JsonElement)var6.getValue()).isJsonArray()) {
                           var4x.IRCIIHHICIHRCOCRROCOICRIHHCCHH((String)var6.getKey(), var1.fromJson((JsonElement)var6.getValue(), List.class));
                        } else {
                           var4x.IRCIIHHICIHRCOCRROCOICRIHHCCHH((String)var6.getKey(), var1.fromJson((JsonElement)var6.getValue(), HashMap.class));
                        }
                     }
                  }

                  return var4x;
               }
            })
            .nullSafe();
      }
   }
}
