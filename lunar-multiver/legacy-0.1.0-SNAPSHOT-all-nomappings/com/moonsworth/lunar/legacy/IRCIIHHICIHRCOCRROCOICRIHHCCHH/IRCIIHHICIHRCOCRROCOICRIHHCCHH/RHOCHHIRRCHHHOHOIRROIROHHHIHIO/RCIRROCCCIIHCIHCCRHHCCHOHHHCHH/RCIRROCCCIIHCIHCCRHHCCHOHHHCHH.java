package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent.Action;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.format.Style.Builder;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration.State;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Style.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Unique
   private com.moonsworth.lunar.lib.adventure.text.format.Style bridge$adventure;

   public com.moonsworth.lunar.lib.adventure.text.format.Style moonBridge$asAdventureStyle() {
      if (this.bridge$adventure == null) {
         Builder var1 = com.moonsworth.lunar.lib.adventure.text.format.Style.style();
         Style var2 = (Style)this;
         NamedTextColor var3 = com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.getColor()
         );
         var1.color(var3);
         var1.decoration(TextDecoration.OBFUSCATED, State.byBoolean(var2.obfuscated));
         var1.decoration(TextDecoration.BOLD, State.byBoolean(var2.bold));
         var1.decoration(TextDecoration.STRIKETHROUGH, State.byBoolean(var2.strikethrough));
         var1.decoration(TextDecoration.UNDERLINED, State.byBoolean(var2.underlined));
         var1.decoration(TextDecoration.ITALIC, State.byBoolean(var2.italic));
         HoverEvent var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var2.getHoverEvent$v1_12() : var2.getChatHoverEvent$v1_7();
         if (var4 != null) {
            var1.hoverEvent(
               com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4)
            );
         }

         ClickEvent var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var2.getClickEvent$v1_12() : var2.getChatClickEvent$v1_7();
         if (var5 != null) {
            Action var6 = com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var5.getAction()
            );
            if (var6 != null) {
               var1.clickEvent(com.moonsworth.lunar.lib.adventure.text.event.ClickEvent.clickEvent(var6, var5.getValue()));
            }
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            var1.insertion(var2.getInsertion$v1_8());
         }

         this.bridge$adventure = var1.build();
      }

      return this.bridge$adventure;
   }
}
