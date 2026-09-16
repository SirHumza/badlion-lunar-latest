package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.AbstractComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.ScoreComponent;
import com.moonsworth.lunar.lib.adventure.text.SelectorComponent;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslationArgument;
import java.util.ArrayList;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentKeybind;
import net.minecraft.util.text.TextComponentScore;
import net.minecraft.util.text.TextComponentSelector;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(AbstractComponent.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private ITextComponent bridge$vanillaComponent$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Unique
   private IChatComponent bridge$vanillaComponent$v1_7;

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH moonBridge$asBridgeComponent() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.moonBridge$asBridgeComponent$v1_12();
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.moonBridge$asBridgeComponent$v1_8() : this.moonBridge$asBridgeComponent$v1_7();
      }
   }

   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH moonBridge$asBridgeComponent$v1_12() {
      if (this.bridge$vanillaComponent$v1_8 == null) {
         if (this instanceof TextComponent var1) {
            this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentString(var1.content()));
         } else if (!(this instanceof TranslatableComponent var2)) {
            if (this instanceof KeybindComponent var3) {
               this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentKeybind(var3.keybind()));
            } else if (this instanceof ScoreComponent var4) {
               this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentScore(var4.name(), var4.objective()));
            } else if (this instanceof SelectorComponent var5) {
               this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentSelector(var5.pattern()));
            }
         } else {
            ArrayList var14 = new ArrayList(var2.arguments().size());

            for (TranslationArgument var8 : var2.arguments()) {
               var14.add(
                  (ITextComponent)((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var8.asComponent())
                     .moonBridge$asBridgeComponent()
               );
            }

            this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentTranslation(var2.key(), var14.toArray(new Object[0])));
         }

         for (Component var11 : ((Component)this).children()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var11)
               .moonBridge$asBridgeComponent();
            this.bridge$vanillaComponent$v1_8.appendSibling((ITextComponent)var12);
         }

         Style var10 = (Style)((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)((Component)this)
               .style())
            .moonBridge$asBridgeStyle();
         this.bridge$vanillaComponent$v1_8.setStyle$v1_12(var10);
      }

      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.bridge$vanillaComponent$v1_8
         .createCopy();
   }

   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1, max = 1)
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH moonBridge$asBridgeComponent$v1_8() {
      if (this.bridge$vanillaComponent$v1_8 == null) {
         if (this instanceof TextComponent var1) {
            this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentString(var1.content()));
         } else if (!(this instanceof TranslatableComponent var2)) {
            if (this instanceof ScoreComponent var3) {
               this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentScore(var3.name(), var3.objective()));
            } else if (this instanceof SelectorComponent var4) {
               this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentSelector(var4.pattern()));
            }
         } else {
            ArrayList var13 = new ArrayList(var2.arguments().size());

            for (TranslationArgument var7 : var2.arguments()) {
               var13.add(
                  (ITextComponent)((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var7.asComponent())
                     .moonBridge$asBridgeComponent()
               );
            }

            this.bridge$vanillaComponent$v1_8 = (ITextComponent)(new TextComponentTranslation(var2.key(), var13.toArray(new Object[0])));
         }

         for (Component var10 : ((Component)this).children()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var10)
               .moonBridge$asBridgeComponent();
            this.bridge$vanillaComponent$v1_8.appendSibling((ITextComponent)var11);
         }

         Style var9 = (Style)((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)((Component)this)
               .style())
            .moonBridge$asBridgeStyle();
         this.bridge$vanillaComponent$v1_8.setChatStyle$v1_8(var9);
      }

      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.bridge$vanillaComponent$v1_8
         .createCopy();
   }

   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH moonBridge$asBridgeComponent$v1_7() {
      if (this.bridge$vanillaComponent$v1_7 == null) {
         if (this instanceof TextComponent var1) {
            this.bridge$vanillaComponent$v1_7 = (IChatComponent)(new TextComponentString(var1.content()));
         } else if (!(this instanceof TranslatableComponent var2)) {
            if (this instanceof ScoreComponent var3) {
               this.bridge$vanillaComponent$v1_7 = (IChatComponent)(new TextComponentString(var3.name() + ":" + var3.objective()));
            } else if (this instanceof SelectorComponent var4) {
               this.bridge$vanillaComponent$v1_7 = (IChatComponent)(new TextComponentString(var4.pattern()));
            }
         } else {
            ArrayList var13 = new ArrayList(var2.arguments().size());

            for (TranslationArgument var7 : var2.arguments()) {
               var13.add(
                  (IChatComponent)((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var7.asComponent())
                     .moonBridge$asBridgeComponent()
               );
            }

            this.bridge$vanillaComponent$v1_7 = (IChatComponent)(new TextComponentTranslation(var2.key(), var13.toArray(new Object[0])));
         }

         for (Component var10 : ((Component)this).children()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var10)
               .moonBridge$asBridgeComponent();
            this.bridge$vanillaComponent$v1_7.appendSibling((IChatComponent)var11);
         }

         Style var9 = (Style)((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)((Component)this)
               .style())
            .moonBridge$asBridgeStyle();
         this.bridge$vanillaComponent$v1_7.setChatStyle(var9);
      }

      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.bridge$vanillaComponent$v1_7
         .createCopy();
   }
}
