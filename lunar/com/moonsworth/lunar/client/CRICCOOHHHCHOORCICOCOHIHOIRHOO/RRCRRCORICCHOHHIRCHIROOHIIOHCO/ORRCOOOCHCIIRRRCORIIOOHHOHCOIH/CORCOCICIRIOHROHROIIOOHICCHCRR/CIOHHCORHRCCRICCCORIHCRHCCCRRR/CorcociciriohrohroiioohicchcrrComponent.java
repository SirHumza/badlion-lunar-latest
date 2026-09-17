package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.google.common.collect.ImmutableList;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   private final List<Component> RHCHHHIHOORICOOIRHCHOCCCOHCRCH;
   private final List<String> CHCICOOIIIHOOHOIORHHRHIIHOCCHO;
   private static final Pattern CRRRIOCIHHHOICIRICCIHIHHHHHRCC = Pattern.compile("^ [^ ].+");

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(List<Component> var1, List<String> var2) {
      this.RHCHHHIHOORICOOIRHCHOCCCOHCRCH = var1;
      this.CHCICOOIIIHOOHOIORHHRHIIHOCCHO = var2;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var0, int var1) {
      ImmutableList var2 = var0.IORHOIRCHCRCCIOORRCCIROIRORROO();
      ImmutableList var3 = var0.IRHHRCCHCIOOOIRHHCHROHROHOHCII();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      var4.add((Component)var2.get(var1));
      var5.add((String)var3.get(var1));

      for (int var6 = var1 + 1; var6 < var3.size() && var6 < var2.size(); var6++) {
         Component var7 = (Component)var2.get(var6);
         String var8 = (String)var3.get(var6);
         if (!var8.equals("               Info")) {
            if (!CRRRIOCIHHHOICIRICCIHIHHHHHRCC.matcher(var8).matches()) {
               break;
            }

            var4.add(var7);
            var5.add(var8);
         }
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4, var5);
   }

   public List<Component> RCOOOHHIRHHOOIIOIOOCCHIOCRRHCC() {
      return this.RHCHHHIHOORICOOIRHCHOCCCOHCRCH;
   }

   public List<String> ROOCIIOIIRORHHOCRCCROICOHRHIIC() {
      return this.CHCICOOIIIHOOHOIORHHRHIIHOCCHO;
   }
}
