package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.ArrayList;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.util.text.TextComponentKeybind;
import net.minecraft.util.text.TextComponentScore;
import net.minecraft.util.text.TextComponentSelector;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(TextComponentBase.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Unique
   private Component bridge$adventureComponent;

   public Component moonBridge$asAdventureComponent() {
      if (this.bridge$adventureComponent == null) {
         TextComponentBase var2 = (TextComponentBase)this;
         Style var3 = null;
         Object var1;
         if (var2 instanceof TextComponentString var5) {
            String var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var5.getText$v1_12() : var5.text;
            TextComponent var10 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(var9);
            var3 = var10.style();
            var1 = var10.toBuilder();
         } else if (var2 instanceof TextComponentTranslation var6) {
            ArrayList var20 = new ArrayList(var6.formatArgs.length);

            for (Object var13 : var6.formatArgs) {
               if ((IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1 || !(var13 instanceof ITextComponent))
                  && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 0 || !(var13 instanceof IChatComponent))) {
                  var20.add(Component.text(var13.toString()));
               } else {
                  var20.add(
                     RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                        (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var13
                     )
                  );
               }
            }

            var1 = Component.translatable().key(var6.getKey()).args(var20.toArray(new Component[0]));
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 && var2 instanceof TextComponentKeybind var7) {
            var1 = Component.keybind().keybind(var7.keybind);
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && var2 instanceof TextComponentScore var8) {
            var1 = Component.score().name(var8.getName()).objective(var8.getObjective());
         } else {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1 || !(var2 instanceof TextComponentSelector var4)) {
               throw new UnsupportedOperationException("Don't know how to convert " + this.getClass().getName() + " to adventure");
            }

            var1 = Component.selector().pattern(var4.selector);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            for (ITextComponent var18 : var2.getSiblings$v1_8()) {
               var1.append(
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var18
                  )
               );
            }
         } else {
            for (IChatComponent var19 : var2.getSiblings$v1_7()) {
               var1.append(
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var19
                  )
               );
            }
         }

         Style var16 = ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var2.getStyle$v1_12() : var2.getChatStyle$v1_7()))
            .moonBridge$asAdventureStyle();
         var1.style(var3 != null ? var16.merge(var3) : var16);
         this.bridge$adventureComponent = var1.build();
      }

      return this.bridge$adventureComponent;
   }
}
