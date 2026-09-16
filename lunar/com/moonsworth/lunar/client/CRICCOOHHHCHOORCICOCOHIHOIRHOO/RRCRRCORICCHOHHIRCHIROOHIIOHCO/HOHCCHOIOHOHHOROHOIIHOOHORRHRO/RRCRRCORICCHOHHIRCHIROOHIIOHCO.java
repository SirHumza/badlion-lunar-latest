package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import lombok.Generated;

class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final CRRRICCRROCOHHOHIICIHORCOORRRH OOIIOROOIHRHRICIOHHCIHOOCHHCIC;

   public Component OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(int var1, int var2) {
      if (this.OOIIOROOIHRHRICIOHHCIHOOCHHCIC.IICCCOCIIOROCRIIOICHIROORRCIHR.HHIIHOHROCCHOHCRIOCIICIIRIHRRI().isTierTests()
         && !this.OOIIOROOIHRHRICIOHHCIHOOCHHCIC.RRIIHROCRRRCIRCIOCHICRRRCHCHOO.get()) {
         String var3 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO()
            .RIIHIHHCRHCHRCICHOROHCHIIHCICH(var1, var2);
         if (var3 != null) {
            return Component.text(var3).color(this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var1, var2));
         }
      }

      return Component.text(this.IIOCHOIICCIORCOROIROHICCHIOHIC(var1, var2)).color(this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var1, var2));
   }

   public TextColor IOIOHIORIROHRRCOOOHCROHORCOIIH(int var1, int var2) {
      if (var1 == -1 || var2 == -1) {
         return TextColor.color(16777215);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         return switch (var1) {
            case 1 -> NamedTextColor.YELLOW;
            case 2 -> var2 == 0 ? NamedTextColor.WHITE : NamedTextColor.GRAY;
            case 3 -> NamedTextColor.GOLD;
            case 4, 5 -> NamedTextColor.DARK_GRAY;
            default -> NamedTextColor.BLACK;
         };
      } else {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = this.OOIIOROOIHRHRICIOHHCIHOOCHHCIC
            .IHIHIHCORRHORCCCIRRHRIHCCOHOCC
            .get(this.IIOCHOIICCIORCOROIROHICCHIOHIC(var1, var2));
         return var3 == null ? TextColor.color(16777215) : TextColor.color(var3.CHRHCORIRCORHHIIROCRORHIROICOC());
      }
   }

   public String IIOCHOIICCIORCOROIROHICCHIOHIC(int var1, int var2) {
      String var3 = switch (var2) {
         case 0 -> "H";
         case 2 -> "M";
         default -> "L";
      };
      return var3 + "T" + var1;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.OOIIOROOIHRHRICIOHHCIHOOCHHCIC = var1;
   }
}
