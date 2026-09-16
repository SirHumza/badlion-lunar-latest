package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         )
       {
         if (var3.has("options")) {
            var3 = var3.getAsJsonObject("options");
            if (var3.has("fullBright")) {
               try {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.valueOf(
                     var3.get("fullBright").getAsString()
                  );
               } catch (IllegalArgumentException | NullPointerException var5) {
                  return;
               }

               this.CORCOCICIRIOHROHROIIOOHICCHCRR("", var3);
               this.CORCOCICIRIOHROHROIIOOHICCHCRR("Shift", var3);
               this.CORCOCICIRIOHROHROIIOOHICCHCRR("Control", var3);
               this.CORCOCICIRIOHROHROIIOOHICCHCRR("Alt", var3);
            }
         }
      }
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(String var1, JsonObject var2) {
      String var3 = "fullBright" + var1;
      if (var2.has(var3)) {
         String var4 = "fullBrightToggle" + var1;
         var2.add(var4, var2.remove(var3));
      }
   }
}
