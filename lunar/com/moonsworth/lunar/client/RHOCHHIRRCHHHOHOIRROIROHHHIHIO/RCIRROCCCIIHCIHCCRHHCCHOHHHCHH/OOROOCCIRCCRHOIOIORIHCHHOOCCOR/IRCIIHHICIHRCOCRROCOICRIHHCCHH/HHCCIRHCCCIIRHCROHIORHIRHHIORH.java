package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.eliotlash.molang.ast.Evaluator;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import java.util.List;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.easing.EasingType;
import software.bernie.geckolib3.core.manager.AnimationData;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @ORHIOICIOCRRHOOCOHRORIHICHRCRR(value = "controllers", required = true)
   private com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] OOROHOCOHCORHIHHROROHCCIOIOCHH;

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IAnimatable var1, AnimationData var2) {
      for (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : this.OOROHOCOHCORHIHHROROHCCIOIOCHH) {
         com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH var7 = new com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(
            var1, var6.getName(), var6.RRCOORRCICRRCCOOHCIIIOHIRRIRHI(), var2x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var2x)
         );
         var2.addAnimationController(var7);
         var7.registerCustomInstructionListener(var0 -> var0.molang.evaluate(var0.getExecutionContext().getEvaluator()));
      }
   }

   private <T extends IAnimatable> PlayState RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      Evaluator var3 = var2.COICOHIHHRIRRRHHRRRIIOROHOOCOC().getEvaluator();
      var2.getController().easingType = EasingType.NONE;
      var2.getController().easingArgs = null;
      var2.getController().transitionLengthTicks = var1.RRCOORRCICRRCCOOHCIIIOHIRRIRHI();

      for (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 : var1.COIHIHIHHRICCROCIIROIRIHIRRCIO()) {
         if (var7.CIIOIHOIHHICORRCOIOCOCRIHOIOHR().evaluate(var3) == 1.0) {
            if (var2.getController().getAnimationState() == AnimationState.Transitioning) {
               var2.getController().easingType = var7.RROHROCRRRIOICIRCICCIIHHOHCRIC();
            }

            var2.getController().transitionLengthTicks = var7.IOIIICHRRIOHCCIROOIOCIIOIRICRO() == null
               ? var1.RRCOORRCICRRCCOOHCIIIOHIRRIRHI()
               : var7.IOIIICHRRIOHCCIROOIOCIIOIRICRO().evaluate(var3);
            if (var7.COIOOIICHHOCCIHRIIRIIIHOROCCRR() != null) {
               var2.getController().easingArgs = List.of(var7.COIOOIICHHOCCIHRIIRIIIHOROCCRR());
            }

            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var7.HCCIHRRCRCICHRCCCIRCRRHCCRHIIR());
            return PlayState.CONTINUE;
         }
      }

      return PlayState.STOP;
   }
}
