package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getAsJsonObject(), null);
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, Predicate<String> var2) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RCRRCCORORHORHOOIOIRCROCIROOCR();

      for (Entry var5 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .entrySet()) {
         String var6 = ((CIOHHCORHRCCRICCCORIHCRHCCCRRR)var5.getKey()).name();
         if (var1.has(var6) && var1.get(var6).isJsonObject()) {
            JsonObject var7 = var1.get(var6).getAsJsonObject();

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var9 : ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH)var5.getValue())
               .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
               String var10 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9.getId(), var9, var7);
               if (var10 != null
                  && !var9.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRROHCRHORRICIOHCIIHHHORHHHHHH
                  )) {
                  com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var11 = var9.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
                  );
                  if (var11 != null) {
                     var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var10, var9, var9, var11, var2);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2, JsonObject var3) {
      if (var3.has(var1)) {
         return var1;
      }

      String var4 = com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var2, var3::has
      );
      return !var1.equals(var4) && var3.has(var4) ? var4 : null;
   }
}
