package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.controller.AnimationController.IAnimationPredicate;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends AnimationController<IAnimatable> {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(IAnimatable var1, String var2, float var3, final CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4) {
      super(var1, var2, var3, new IAnimationPredicate<IAnimatable>() {
         public PlayState test(AnimationEvent var1) {
            return var4.test((IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1);
         }
      });
   }

   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      PlayState test(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1);
   }
}
