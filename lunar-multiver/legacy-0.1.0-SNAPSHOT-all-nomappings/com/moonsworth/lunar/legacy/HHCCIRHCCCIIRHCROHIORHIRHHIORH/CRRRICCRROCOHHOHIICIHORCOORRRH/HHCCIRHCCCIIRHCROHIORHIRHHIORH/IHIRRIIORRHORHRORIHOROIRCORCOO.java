package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(GuiNewChat.class)
public abstract class IHIRRIIORRHORHRORIHOROIRCORCOO
   extends Gui
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO {
   @Final
   @Shadow
   public Minecraft mc;
   @Final
   @Shadow
   public List<ChatLine> drawnChatLines$v1_8;
   @Final
   @Shadow
   public List chatLines$v1_7;
   @Final
   @Shadow
   public List<ChatLine> chatLines$v1_8;
   @Final
   @Shadow
   public List field_146253_i$v1_7;
   @Unique
   private int lunar$messageId = -1;
   @Unique
   private boolean lunar$msgAddedByApollo = false;

   @Shadow
   public abstract boolean getChatOpen();

   @Shadow
   public abstract void printChatMessage$v1_8(ITextComponent var1);

   @Shadow
   public abstract void printChatMessage$v1_7(IChatComponent var1);

   @Shadow
   public abstract void printChatMessageWithOptionalDeletion$v1_8(ITextComponent var1, int var2);

   @Shadow
   public abstract void printChatMessageWithOptionalDeletion$v1_7(IChatComponent var1, int var2);

   @Shadow
   public abstract void clearChatMessages$v1_7();

   @Shadow
   public abstract void clearChatMessages$v1_12(boolean var1);

   @Shadow
   public abstract void refreshChat();

   public void bridge$addMessage(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.printChatMessage$v1_8((ITextComponent)var1);
      } else {
         this.printChatMessage$v1_7((IChatComponent)var1);
      }
   }

   public void bridge$addMessageWithLunarId(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      boolean var3
   ) {
      this.lunar$messageId = var2;
      this.lunar$msgAddedByApollo = var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.printChatMessage$v1_8((ITextComponent)var1);
      } else {
         this.printChatMessage$v1_7((IChatComponent)var1);
      }

      this.lunar$msgAddedByApollo = false;
      this.lunar$messageId = -1;
   }

   public int bridge$addMessageWithLunarId(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      int var2;
      do {
         var2 = ThreadLocalRandom.current().nextInt();
      } while (var2 == 0 || this.bridge$getMessageContentByLunarId(var2) != null);

      this.bridge$addMessageWithLunarId(var1, var2, false);
      return var2;
   }

   public void bridge$deleteMessageByLunarId(int var1, boolean var2) {
      Predicate var3 = var2x -> {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC var3x = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var2x;
         return var3x.bridge$getLunarID() == var1 && var3x.bridge$isAddedByApollo() == var2;
      };
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.chatLines$v1_8.removeIf(var3);
         this.drawnChatLines$v1_8.removeIf(var3);
      } else {
         this.chatLines$v1_7.removeIf(var3);
         this.field_146253_i$v1_7.removeIf(var3);
      }
   }

   @Nullable
   public Component bridge$getMessageContentByLunarId(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         for (ChatLine var3 : this.chatLines$v1_8) {
            if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var3)
                  .bridge$getLunarID()
               == var1) {
               return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.getChatComponent$v1_8()
               );
            }
         }
      } else {
         for (ChatLine var5 : this.chatLines$v1_7) {
            if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var5)
                  .bridge$getLunarID()
               == var1) {
               return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.getChatComponent$v1_7()
               );
            }
         }
      }

      return null;
   }

   public int bridge$getLunarId() {
      return this.lunar$messageId;
   }

   public void bridge$clearChatMessages() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.clearChatMessages$v1_12(true);
      } else {
         this.clearChatMessages$v1_7();
      }
   }

   public boolean bridge$messageAddedByApollo() {
      return this.lunar$msgAddedByApollo;
   }

   public boolean bridge$getChatOpen() {
      return this.getChatOpen();
   }

   public void bridge$rescaleChat() {
      this.refreshChat();
   }
}
