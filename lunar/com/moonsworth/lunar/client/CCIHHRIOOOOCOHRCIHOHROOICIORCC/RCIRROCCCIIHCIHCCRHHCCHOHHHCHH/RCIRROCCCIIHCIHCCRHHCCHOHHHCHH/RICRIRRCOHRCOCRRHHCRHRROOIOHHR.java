package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;

public class RICRIRRCOHRCOCRRHHCRHRROOIOHHR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.CRRRICCRROCOHHOHIICIHORCOORRRH
         )
       {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, "options").ifPresent(var2x -> {
            JsonObject var3x = new JsonObject();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("showBloodParticles", var2x, "enabled", var3x);
            JsonObject var4 = new JsonObject();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("bloodMultiplier", var2x, "particleMultiplier", var4);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("playerBloodParticles", var2x, var4);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("entityBloodParticles", var2x, var4);
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH("playBloodSound", var2x, var4);
            if (!var4.isEmpty()) {
               var3x.add("options", var4);
            }

            if (!var3x.isEmpty()) {
               var3.add("PARTICLE_CHANGER_BLOOD_CHILD", var3x);
            }
         });
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, JsonObject var2, String var3, JsonObject var4) {
      if (var2.has(var1)) {
         var4.add(var3, var2.remove(var1));
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, JsonObject var2, JsonObject var3) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var1, var3);
   }
}
