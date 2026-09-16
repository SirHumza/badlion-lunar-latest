package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.moonsworth.webosr.javascript.CallbackJS;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @CallbackJS("updateWaypointSortIndexes")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var0) {
      for (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var0) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var4.IIOHRICOHCROOIIHIHRCCCOCOOIOHC, var4.OOHIOROOIHCCORIRRHCCOOHIOIIICI, var4.HRIIIRIOICROROIROCHOHHHOOOOCHH)
            .ifPresent(var1 -> var1.OCRHORIRHHHIIOCOOCHICOOCIHORCC(var4.ORHIRHORRCICCHRORHHHHHRRORRHRO));
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHHHORIIORRRROHRIIRCHCCICHHCI()
         .ROOCCICICICIRCOHOHCOCIHHCCHRII();
   }

   @CallbackJS("setActiveSortIndex")
   public static void HOIHOROOIOOCOIHCRIRIRIRRICIIHC(Integer var0) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHHHORIIORRRROHRIIRCHCCICHHCI()
         .OCRHORIRHHHIIOCOOCHICOOCIHORCC(var0);
   }

   private static Optional<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      String var0, String var1, String var2
   ) {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHHHORIIORRRROHRIIRCHCCICHHCI()
         .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0, var1, var2);
   }

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return null;
   }

   @Override
   public JsonElement provide() {
      return null;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      @SerializedName("server")
      private final String IIOHRICOHCROOIIHIHRCCCOCOOIOHC;
      @SerializedName("world")
      private final String OOHIOROOIHCCORIRRHCCOOHIOIIICI;
      @SerializedName("name")
      private final String HRIIIRIOICROROIROCHOHHHOOOOCHH;
      @SerializedName("sortIndex")
      private final Integer ORHIRHORRCICCHRORHHHHHRRORRHRO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, Integer var4) {
         this.IIOHRICOHCROOIIHIHRCCCOCOOIOHC = var1;
         this.OOHIOROOIHCCORIRRHCCOOHIOIIICI = var2;
         this.HRIIIRIOICROROIROCHOHHHOOOOCHH = var3;
         this.ORHIRHORRCICCHRORHHHHHRRORRHRO = var4;
      }

      @SerializedName("server")
      public String IHIOICOIHHRCICIIIOIHORIOCCIHOI() {
         return this.IIOHRICOHCROOIIHIHRCCCOCOOIOHC;
      }

      @SerializedName("world")
      public String RIHCICCCIIOIOIIRHOIORCHRCCIHHO() {
         return this.OOHIOROOIHCCORIRRHCCOOHIOIIICI;
      }

      @SerializedName("name")
      public String name() {
         return this.HRIIIRIOICROROIROCHOHHHOOOOCHH;
      }

      @SerializedName("sortIndex")
      public Integer ICRCHHIOOICOCHHIOCIRIROCRROCHI() {
         return this.ORHIRHORRCICCHRORHHHHHRRORRHRO;
      }
   }
}
