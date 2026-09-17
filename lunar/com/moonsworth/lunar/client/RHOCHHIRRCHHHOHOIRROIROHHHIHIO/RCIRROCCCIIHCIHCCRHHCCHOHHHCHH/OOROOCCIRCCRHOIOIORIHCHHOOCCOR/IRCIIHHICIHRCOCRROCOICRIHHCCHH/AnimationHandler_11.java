package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.manager.AnimationData;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @ORHIOICIOCRRHOOCOHRORIHICHRCRR(value = "anims", required = true)
   public AnimationBuilder[] CCIRCCHRIHCOOIRRCROOOHIOCCRIRR;

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IAnimatable var1, AnimationData var2) {
      for (int var3 = 0; var3 < this.CCIRCCHRIHCOOIRRCROOOHIOCCRIRR.length; var3++) {
         int var4 = var3;
         var2.addAnimationController(
            new com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var1,
               "controller" + var3,
               this.HRCRIICRHICRRICRRIHCCIRROORHCH,
               var2x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CCIRCCHRIHCOOIRRCROOOHIOCCRIRR[var4], var2x)
            )
         );
      }
   }

   private <T extends IAnimatable> PlayState RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      AnimationBuilder var1,
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1);
      return PlayState.CONTINUE;
   }
}
