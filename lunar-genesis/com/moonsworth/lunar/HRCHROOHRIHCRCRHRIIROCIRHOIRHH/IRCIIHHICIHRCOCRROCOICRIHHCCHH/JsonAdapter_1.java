package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Optional;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static final String CRORCICOORCCRHCICOOOICROHHROHC = "https://launchermeta.mojang.com/mc/game/version_manifest.json";
   private static String RROORCORRIOIRCRIRHCRIOIRCORHHO = null;
   @SerializedName("latest")
   private JsonObject IHHHOICRCRRHHIOCHIHIHHOCIHROOI;
   @SerializedName("versions")
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH[] OOIHRIHRIORORICOHRRHCIRRRCCCRH;

   public static CRRRICCRROCOHHOHIICIHORCOORRRH HRRICROOIRRCHIRHOIHOCRCICHIICO() {
      try {
         if (RROORCORRIOIRCRIRHCRIOIRCORHHO == null) {
            RROORCORRIOIRCRIRHCRIOIRCORHHO = CORCOCICIRIOHROHROIIOOHICCHCRR.COORORIOCRROOOCIORRCHRHRCRHRCR(
               "https://launchermeta.mojang.com/mc/game/version_manifest.json"
            );
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH var0 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOHIIHOCCHOROCICHHHOCRHHHCOOII
            .fromJson(RROORCORRIOIRCRIRHCRIOIRCORHHO, CRRRICCRROCOHHOHIICIHORCOORRRH.class);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
         return var0;
      } catch (Throwable var1) {
         throw var1;
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(byte[] var0) {
      return com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOHIIHOCCHOROCICHHHOCRHHHCOOII
         .fromJson(new String(var0, StandardCharsets.UTF_8), CRRRICCRROCOHHOHIICIHORCOORRRH.class);
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var1 = var0.OOIHRIHRIORORICOHRRHCIRRRCCCRH;
      Arrays.sort(
         var1,
         (var0x, var1x) -> !HIIRCCHHCIHROHCRICCOCIHRRHCRIH(var0x.getId()) && !HIIRCCHHCIHROHCRICCOCIHRRHCRIH(var1x.getId())
            ? OCCORIIORHORROHHROHHOORHIHRIOO(var0x.getId(), var1x.getId())
            : var0x.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI().compareTo(var1x.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI())
      );

      for (int var2 = 1; var2 < var1.length; var2++) {
         var1[var2].IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1[var2 - 1]);
      }
   }

   private static boolean HIIRCCHHCIHROHCRICCOCIHRRHCRIH(String var0) {
      return var0.startsWith("a") || var0.startsWith("b") || var0.startsWith("1") || !var0.contains(".") && var0.contains("w");
   }

   private static int OCCORIIORHORROHHROHHOORHIHRIOO(String var0, String var1) {
      int var2 = var0.indexOf(45);
      int var3 = var1.indexOf(45);
      String[] var4 = (var2 == -1 ? var0 : var0.substring(0, var2)).split("\\.");
      String[] var5 = (var3 == -1 ? var1 : var1.substring(0, var3)).split("\\.");
      String var6 = var2 == -1 ? "" : var0.substring(var2 + 1);
      String var7 = var3 == -1 ? "" : var1.substring(var3 + 1);

      for (int var8 = 0; var8 < Math.max(var4.length, var5.length); var8++) {
         int var9 = var8 < var4.length ? IOORROIRICCOCCOOCCIROIIIHRCCCC(var4[var8]) : 0;
         int var10 = var8 < var5.length ? IOORROIRICCOCCOOCCIROIIIHRCCCC(var5[var8]) : 0;
         if (var9 != var10) {
            return Integer.compare(var9, var10);
         }
      }

      int var11 = CICHIHIRRIRIICHCOCHIIOIIHRHROR(var6);
      int var12 = CICHIHIRRIRIICHCOCHIIOIIHRHROR(var7);
      return var11 != var12 ? Integer.compare(var11, var12) : Integer.compare(CIROCOHOCRHOHCCRIHIRHOICHRIRIR(var6), CIROCOHOCRHOHCCRIHIRHOICHRIRIR(var7));
   }

   private static int CICHIHIRRIRIICHCOCHIIOIIHRHROR(String var0) {
      if (var0.startsWith("snapshot-")) {
         return 0;
      } else if (var0.startsWith("pre-")) {
         return 1;
      } else {
         return var0.startsWith("rc-") ? 2 : 3;
      }
   }

   private static int CIROCOHOCRHOHCCRIHIRHOICHRIRIR(String var0) {
      int var1 = var0.lastIndexOf(45);
      return var1 == -1 ? 0 : IOORROIRICCOCCOOCCIROIIIHRCCCC(var0.substring(var1 + 1));
   }

   private static int IOORROIRICCOCCOOCCIROIIIHRCCCC(String var0) {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var2) {
         return 0;
      }
   }

   public Optional<HHCCIRHCCCIIRHCROHIORHIRHHIORH> CRIRICHHRCIORIOHOHHICHROIHOCRR(String var1) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 : this.OOIHRIHRIORORICOHRRHCIRRRCCCRH) {
         if (var5.getId().equals(var1)) {
            return Optional.of(var5);
         }
      }

      return Optional.empty();
   }

   @Generated
   public JsonObject RCHOCCIRCHHHICCHIIORIHHRICRHOH() {
      return this.IHHHOICRCRRHHIOCHIHIHHOCIHROOI;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH[] OCOOIICOHRRICHRCHCIHIIRIIROIIC() {
      return this.OOIHRIHRIORORICOHRRHCIRRRCCCRH;
   }

   @Generated
   public void IHORRHOROHHHIORCCHRCRIRRHHCCCO(JsonObject var1) {
      this.IHHHOICRCRRHHIOCHIHIHHOCIHROOI = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var1) {
      this.OOIHRIHRIORORICOHRRHCIRRRCCCRH = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         JsonObject var3 = this.RCHOCCIRCHHHICCHIIORIHHRICRHOH();
         JsonObject var4 = var2.RCHOCCIRCHHHICCHIIORIHHRICRHOH();
         return (var3 == null ? var4 == null : var3.equals(var4))
            ? Arrays.deepEquals(this.OCOOIICOHRRICHRCHCIHIIRIIROIIC(), var2.OCOOIICOHRRICHRCHCIHIIRIIROIIC())
            : false;
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      JsonObject var3 = this.RCHOCCIRCHHHICCHIIORIHHRICRHOH();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      return var2 * 59 + Arrays.deepHashCode(this.OCOOIICOHRRICHRCHCIHIIRIIROIIC());
   }

   @Generated
   @Override
   public String toString() {
      return "VersionManifest(latest="
         + this.RCHOCCIRCHHHICCHIIORIHHRICRHOH()
         + ", versions="
         + Arrays.deepToString(this.OCOOIICOHRRICHRCHCIHIIRIIROIIC())
         + ")";
   }
}
