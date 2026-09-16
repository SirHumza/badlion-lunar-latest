package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import net.minecraft.util.text.Style;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(targets = "com.moonsworth.lunar.lib.adventure.text.format.StyleImpl")
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Unique
   private Style bridge$vanilla;

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH moonBridge$asBridgeStyle() {
      if (this == com.moonsworth.lunar.lib.adventure.text.format.Style.empty()) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)(
            new Style()
         );
      }

      if (this.bridge$vanilla == null) {
         com.moonsworth.lunar.lib.adventure.text.format.Style var1 = (com.moonsworth.lunar.lib.adventure.text.format.Style)this;
         this.bridge$vanilla = new Style()
            .setBold(RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBoolean(var1.decoration(TextDecoration.BOLD)))
            .setItalic(RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBoolean(var1.decoration(TextDecoration.ITALIC)))
            .setUnderlined(RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBoolean(var1.decoration(TextDecoration.UNDERLINED)))
            .setStrikethrough(RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBoolean(var1.decoration(TextDecoration.STRIKETHROUGH)))
            .setObfuscated(RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBoolean(var1.decoration(TextDecoration.OBFUSCATED)))
            .setColor(
               com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1.color())
            );
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.bridge$vanilla
               .setClickEvent$v1_12(
                  com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1.clickEvent()
                  )
               )
               .setHoverEvent$v1_12(
                  com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1.hoverEvent()
                  )
               );
         } else {
            this.bridge$vanilla
               .setChatClickEvent$v1_7(
                  com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1.clickEvent()
                  )
               )
               .setChatHoverEvent$v1_7(
                  com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1.hoverEvent()
                  )
               );
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.bridge$vanilla.setInsertion$v1_8(var1.insertion());
         }
      }

      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.bridge$vanilla;
   }
}
