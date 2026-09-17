package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.nio.FloatBuffer;
import javax.vecmath.Matrix3f;
import org.jetbrains.annotations.Contract;
import org.joml.Vector3f;

@com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
   OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
         @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(version = 6, RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("com/mojang/math/Matrix3f")),
         @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(version = 15, RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("org/joml/Matrix3f"))
   }
)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("<init>()V")
   static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COHHIICIHHROCRHIROHOHHIRRHCROC() {
      throw new CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   void bridge$setDirect(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9);

   void bridge$setIdentity();

   float bridge$getTransformX(float var1, float var2, float var3);

   float bridge$getTransformY(float var1, float var2, float var3);

   float bridge$getTransformZ(float var1, float var2, float var3);

   @Contract("_,_,_ -> new")
   default Vector3f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var1, float var2, float var3) {
      return new Vector3f(this.bridge$getTransformX(var1, var2, var3), this.bridge$getTransformY(var1, var2, var3), this.bridge$getTransformZ(var1, var2, var3));
   }

   @Contract("_ -> new")
   default Vector3f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3f var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.x(), var1.y(), var1.z());
   }

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$copy();

   boolean bridge$invert();

   void bridge$transpose();

   void bridge$mul(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   void bridge$multiply(Matrix3f var1);

   void bridge$scale(float var1);

   void bridge$getColumnMajorBuffer(FloatBuffer var1);

   org.joml.Matrix3f bridge$toJoml();
}
