package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import lombok.Generated;
import org.joml.Matrix3x2fStack;
import org.joml.Quaternionf;

public interface RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   void bridge$translate(double var1, double var3, double var5);

   void bridge$scale(float var1, float var2, float var3);

   void bridge$rotateDegrees(float var1, float var2, float var3);

   void bridge$rotate(float var1, float var2, float var3);

   boolean bridge$clear();

   void bridge$popPose();

   void bridge$pushPose();

   CRRRICCRROCOHHOHIICIHORCOORRRH bridge$last();

   RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$copy();

   void bridge$mulPose(Quaternionf var1);

   void bridge$mulPose(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   );

   void bridge$loadIdentity();

   void bridge$setPose(CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 30)
   default void bridge$bindToGuiGraphics(Matrix3x2fStack var1) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 30)
   default Matrix3x2fStack bridge$unbindGuiGraphics() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCICRRIRIIHROCCOOCOICRCRROOIOC() {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final RRCRRCORICCHOHHIRCHIROOHIIOHCO OHHOHCRIHHOOICHHHHIHRHRCCCHHHC;

      @Override
      public void translate(double var1, double var3, double var5) {
         this.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC.bridge$translate(var1, var3, var5);
      }

      @Override
      public void scale(float var1, float var2, float var3) {
         this.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC.bridge$scale(var1, var2, var3);
      }

      @Override
      public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, float var2, float var3) {
         this.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC.bridge$rotateDegrees(var1, var2, var3);
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
         this.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC = var1;
      }
   }
}
