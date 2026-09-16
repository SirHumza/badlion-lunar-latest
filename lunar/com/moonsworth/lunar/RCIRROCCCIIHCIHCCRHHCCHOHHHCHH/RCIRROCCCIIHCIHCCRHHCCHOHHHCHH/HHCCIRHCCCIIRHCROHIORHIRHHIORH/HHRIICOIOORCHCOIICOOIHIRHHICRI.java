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

public class HHRIICOIOORCHCOIICOOIHIRHHICRI extends IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Serializable {
   private static final long HRICOCOIOCCCICCIORHIIIIOROCOHC = 1L;
   public static final String COIIIOIIOHICCOCIOROOHIIHHIOIOR = "layer";
   @SerializedName("layer")
   private IHIRRIIORRHORHRORIHOROIRCORCOO IIIORCCOIHHRCIRHOCIIICOHOOCHIH;
   public static HashSet<String> OCCCCRRCROIRIHRROHCHCHORCOCICC = new HashSet<>();
   public static HashSet<String> CIIIIIHIHRHCOOHOIORCHHCORHRCCO = new HashSet<>();

   public HHRIICOIOORCHCOIICOOIHIRHHICRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(IHIRRIIORRHORHRORIHOROIRCORCOO var1) {
      this.IIIORCCOIHHRCIRHOCIIICOHOOCHIH = var1;
      return this;
   }

   @Nonnull
   public IHIRRIIORRHORHRORIHOROIRCORCOO COCCRCRCRHROIRCCHOHRICCCIOCICI() {
      return this.IIIORCCOIHHRCIRHOCIIICOHOOCHIH;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(IHIRRIIORRHORHRORIHOROIRCORCOO var1) {
      this.IIIORCCOIHHRCIRHOCIIICOHOOCHIH = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HHRIICOIOORCHCOIICOOIHIRHHICRI var2 = (HHRIICOIOORCHCOIICOOIHIRHHICRI)var1;
         return Objects.equals(this.IIIORCCOIHHRCIRHOCIIICOHOOCHIH, var2.IIIORCCOIHHRCIRHOCIIICOHOOCHIH) && super.equals(var1);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.IIIORCCOIHHRCIRHOCIIICOHOOCHIH, super.hashCode());
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("class GameRewindLayerAddEventData {\n");
      var1.append("    ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(super.toString())).append("\n");
      var1.append("    layer: ").append(this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.IIIORCCOIHHRCIRHOCIIICOHOOCHIH)).append("\n");
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
               "The required field(s) %s in GameRewindLayerAddEventData is not found in the empty JSON string", CIIIIIHIHRHCOOHOIORCHHCORHRCCO.toString()
            )
         );
      }

      for (Entry var3 : var0.getAsJsonObject().entrySet()) {
         if (!OCCCCRRCROIRIHRROHCHCHORCOCICC.contains(var3.getKey())) {
            throw new IllegalArgumentException(
               String.format(
                  "The field `%s` in the JSON string is not defined in the `GameRewindLayerAddEventData` properties. JSON: %s", var3.getKey(), var0.toString()
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
      IHIRRIIORRHORHRORIHOROIRCORCOO.validateJsonElement(var5.get("layer"));
   }

   public static HHRIICOIOORCHCOIICOOIHIRHHICRI HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, HHRIICOIOORCHCOIICOOIHIRHHICRI.class);
   }

   @Override
   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("player_uuid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("installation_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("overwolf_muid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("timestamp");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("event_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("assetserver_session_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("launch_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("inbound_location");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("location");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("minecraft_version");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_git_commit");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_git_branch");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_semver");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_ui_git_commit");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("lunar_client_ui_git_branch");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("operating_system");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("operating_system_release");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("cpu_architecture");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("launcher_version");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("canary_token");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("ichor_modules");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("gl_extensions");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("installed_mods");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("wearer_uuid");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("wearer_cosmetic_ids");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("wearer_outfit_id");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("trigger");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("geo_location");
      OCCCCRRCROIRIHRROHCHCHORCOCICC.add("layer");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("layer");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installation_id");
      CIIIIIHIHRHCOOHOIORCHHCORHRCCO.add("installed_mods");
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!HHRIICOIOORCHCOIICOOIHIRHHICRI.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(HHRIICOIOORCHCOIICOOIHIRHHICRI.class));
         return (TypeAdapter<T>)(new TypeAdapter<HHRIICOIOORCHCOIICOOIHIRHHICRI>() {
            public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, HHRIICOIOORCHCOIICOOIHIRHHICRI var2x) {
               JsonObject var3x = var4.toJsonTree(var2x).getAsJsonObject();
               var3.write(var1, var3x);
            }

            public HHRIICOIOORCHCOIICOOIHIRHHICRI ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(JsonReader var1) {
               JsonElement var2x = (JsonElement)var3.read(var1);
               return (HHRIICOIOORCHCOIICOOIHIRHHICRI)var4.fromJsonTree(var2x);
            }
         }).nullSafe();
      }
   }
}
