package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import java.io.IOException;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   VERSION_1_12_0,
   VERSION_1_14_0,
   VERSION_1_21_20;

   @OHIIIOHIRIRCCRRIOIICCHHIORRHOH
   public String toValue() {
      switch (this) {
         case VERSION_1_12_0:
            return "1.12.0";
         case VERSION_1_14_0:
            return "1.14.0";
         case VERSION_1_21_20:
            return "1.21.20";
         default:
            return null;
      }
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO forValue(String var0) {
      if (var0.equals("1.12.0")) {
         return VERSION_1_12_0;
      } else if (var0.equals("1.14.0")) {
         return VERSION_1_14_0;
      } else if (var0.equals("1.21.20")) {
         return VERSION_1_21_20;
      } else {
         throw new IOException("Cannot deserialize FormatVersion");
      }
   }
}
