package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final StringBuilder RCROOHHCROORIIICHORIHRROIOOHHC = new StringBuilder();
   private Style CROHIOCIRCHHOROIOOROHIRHRHRORR = Style.empty();

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.RCROOHHCROORIIICHORIHRROIOOHHC.append('§');
      this.RCROOHHCROORIIICHORIHRROIOOHHC.append(var1.getFormattingCode());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Style var1) {
      TextColor var2 = var1.color();
      if (var2 != null) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var3;
         if (var2 instanceof NamedTextColor var4) {
            var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getFromAdventure(var4);
         } else {
            var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.nearestTo(var2.value());
         }

         if (var3 != null) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         }
      } else {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.RESET);
      }

      if (var1.hasDecoration(TextDecoration.BOLD)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOLD);
      }

      if (var1.hasDecoration(TextDecoration.ITALIC)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.ITALIC);
      }

      if (var1.hasDecoration(TextDecoration.OBFUSCATED)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.OBFUSCATED);
      }

      if (var1.hasDecoration(TextDecoration.STRIKETHROUGH)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.STRIKETHROUGH);
      }

      if (var1.hasDecoration(TextDecoration.UNDERLINED)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.UNDERLINE);
      }
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, Style var2, int var3) {
      if (!var2.equals(this.CROHIOCIRCHHOROIOOROHIRHRHRORR)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         this.CROHIOCIRCHHOROIOOROHIRHRHRORR = var2;
      }

      this.RCROOHHCROORIIICHORIHRROIOOHHC.appendCodePoint(var3);
      return true;
   }

   public String getResult() {
      return this.RCROOHHCROORIIICHORIHRROIOOHHC.toString();
   }
}
