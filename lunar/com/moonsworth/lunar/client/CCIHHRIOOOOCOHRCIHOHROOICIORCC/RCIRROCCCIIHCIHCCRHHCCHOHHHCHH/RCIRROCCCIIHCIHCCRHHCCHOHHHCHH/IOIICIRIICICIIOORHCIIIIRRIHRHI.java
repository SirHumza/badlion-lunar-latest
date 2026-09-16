package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;

public class IOIICIRIICICIIOORHCIIIIRRIHRHI
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCOCRROHHROHHOCRCCCHCIROIIOORC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
         )
       {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, "options").ifPresent(var0 -> {
            boolean var1x = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOIICIRIICICIIOORHCIIIIRRIHRHI(var0, "minimalMode").orElse(false);
            if (var1x) {
               var0.addProperty("potionEffectsMode", "minimal");
            }

            OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var0, "durationColor").ifPresent(var1xx -> {
               var0.remove("durationColor");
               var0.add("infoColor", var1xx);
            });
         });
      }
   }
}
