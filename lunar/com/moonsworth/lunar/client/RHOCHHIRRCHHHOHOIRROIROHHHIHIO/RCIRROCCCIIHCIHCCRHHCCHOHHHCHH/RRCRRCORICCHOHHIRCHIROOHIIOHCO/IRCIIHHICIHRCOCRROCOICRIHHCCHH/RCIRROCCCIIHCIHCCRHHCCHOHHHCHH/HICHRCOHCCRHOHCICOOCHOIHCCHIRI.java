package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import java.io.IOException;

public enum HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   QUAD_LIST,
   TRI_LIST;

   @OHIIIOHIRIRCCRRIOIICCHHIORRHOH
   public String toValue() {
      switch (this) {
         case QUAD_LIST:
            return "quad_list";
         case TRI_LIST:
            return "tri_list";
         default:
            return null;
      }
   }

   @com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI forValue(String var0) {
      if (var0.equals("quad_list")) {
         return QUAD_LIST;
      } else if (var0.equals("tri_list")) {
         return TRI_LIST;
      } else {
         throw new IOException("Cannot deserialize PolysEnum");
      }
   }
}
