package com.moonsworth.lunar.client.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.recipebook.GuiButtonRecipe;
import net.minecraft.client.gui.recipebook.GuiButtonRecipeTab;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({GuiButtonRecipe.class, GuiButtonRecipeTab.class})
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @WrapMethod(method = "drawButton")
   private void lunar$tintRecipeSlot(Minecraft var1, int var2, int var3, float var4, Operation<Void> var5) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (!var6.CHHRRIICRCCRCCHOORHHOOICCROCII()) {
         var5.call(new Object[]{var1, var2, var3, var4});
      } else {
         CRRRICCRROCOHHOHIICIHORCOORRRH.RHRCRCIOIOICRHRCCROIICCRRCOOOI(var6.COOHOIRCOIRRRHICRIRHHCORRHRIOR());

         try {
            var5.call(new Object[]{var1, var2, var3, var4});
         } finally {
            CRRRICCRROCOHHOHIICIHORCOORRRH.CCIIOOICCOIRIOOOCRHCHRRIOCRHIC();
         }
      }
   }
}
