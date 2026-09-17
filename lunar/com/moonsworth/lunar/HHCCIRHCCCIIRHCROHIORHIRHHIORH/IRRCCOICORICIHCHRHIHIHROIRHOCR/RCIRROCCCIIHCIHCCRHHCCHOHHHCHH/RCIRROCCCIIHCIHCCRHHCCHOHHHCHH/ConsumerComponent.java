package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.util.function.Consumer;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Consumer<String> {
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHIIORHOIHHICHORHRIRHIIROCHOHO;
   private boolean RCCIROHIHIOOOIOOCIRORHCRROIROR = false;
   private Style style = Style.empty();
   private int position = 0;

   public void accept(String var1) {
      var1.codePoints().forEach(this::accept);
   }

   public void accept(int var1) {
      if (this.RCCIROHIHIOOOIOOCIRORHCRROIROR) {
         this.RCCIROHIHIOOOIOOCIRORHCRROIROR = false;
         if (Character.isBmpCodePoint(var1)) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getByCode((char)var1);
            if (var2 != null) {
               this.style = switch (var2) {
                  case OBFUSCATED -> this.style.decorate(TextDecoration.OBFUSCATED);
                  case BOLD -> this.style.decorate(TextDecoration.BOLD);
                  case STRIKETHROUGH -> this.style.decorate(TextDecoration.STRIKETHROUGH);
                  case UNDERLINE -> this.style.decorate(TextDecoration.UNDERLINED);
                  case ITALIC -> this.style.decorate(TextDecoration.ITALIC);
                  case RESET -> Style.empty();
                  default -> Style.empty().color(var2.getAdventureColor());
               };
            }
         }
      } else if (var1 == 167) {
         this.RCCIROHIHIOOOIOOCIRORHCRROIROR = true;
      } else {
         this.RHIIORHOIHHICHORHRIRHIIROCHOHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.position, this.style, var1);
         this.position++;
      }
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.RHIIORHOIHHICHORHRIRHIIROCHOHO = var1;
   }
}
