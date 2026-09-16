package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import javax.vecmath.Matrix4f;
import org.jetbrains.annotations.Contract;
import org.joml.Vector3f;
import org.joml.Vector4f;

@com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
   OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
         @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(version = 1, RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("net/minecraft/util/Matrix4f")),
         @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            version = 5,
            RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("net/minecraft/client/renderer/Matrix4f")
         ),
         @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(version = 6, RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("com/mojang/math/Matrix4f")),
         @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(version = 15, RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("org/joml/Matrix4f"))
   }
)
public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("<init>()V")
   static IRCIIHHICIHRCOCRROCOICRIHHCCHH RIIRCHROOOOORRCIRIOCHCOIOHRRHH() {
      throw new CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = @RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         version = 15,
         RIOOCHOIIRROHCORCROHCHCHIIIIOO = @RRCRRCORICCHOHHIRCHIROOHIIOHCO("<init>(FFFFFFFFFFFFFFFF)V")
      )
   )
   static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var16 = RIIRCHROOOOORRCIRIOCHCOIOHRRHH();
      var16.bridge$setDirect(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
      return var16;
   }

   static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Matrix4f var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.m00,
         var0.m01,
         var0.m02,
         var0.m03,
         var0.m10,
         var0.m11,
         var0.m12,
         var0.m13,
         var0.m20,
         var0.m21,
         var0.m22,
         var0.m23,
         var0.m30,
         var0.m31,
         var0.m32,
         var0.m33
      );
   }

   static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(org.joml.Matrix4f var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.m00(),
         var0.m01(),
         var0.m02(),
         var0.m03(),
         var0.m10(),
         var0.m11(),
         var0.m12(),
         var0.m13(),
         var0.m20(),
         var0.m21(),
         var0.m22(),
         var0.m23(),
         var0.m30(),
         var0.m31(),
         var0.m32(),
         var0.m33()
      );
   }

   void bridge$setDirect(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   );

   void bridge$setIdentity();

   void bridge$transpose();

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$truncateToMatrix3f();

   boolean bridge$invert();

   void bridge$multiply(Matrix4f var1);

   void bridge$multiply(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1);

   IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$copy();

   float bridge$getTransformX(float var1, float var2, float var3, float var4);

   float bridge$getTransformY(float var1, float var2, float var3, float var4);

   float bridge$getTransformZ(float var1, float var2, float var3, float var4);

   float bridge$getTransformW(float var1, float var2, float var3, float var4);

   @Contract("_,_,_,_ -> new")
   default Vector4f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var1, float var2, float var3, float var4) {
      return new Vector4f(
         this.bridge$getTransformX(var1, var2, var3, var4),
         this.bridge$getTransformY(var1, var2, var3, var4),
         this.bridge$getTransformZ(var1, var2, var3, var4),
         this.bridge$getTransformW(var1, var2, var3, var4)
      );
   }

   @Contract("_ -> new")
   default Vector4f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector4f var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.x(), var1.y(), var1.z(), var1.w());
   }

   @Contract("_ -> new")
   default Vector4f IRCIIHHICIHRCOCRROCOICRIHHCCHH(Vector3f var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.x(), var1.y(), var1.z(), 1.0F);
   }

   void bridge$translate(float var1, float var2, float var3);

   boolean bridge$isIdentity();

   float bridge$m00();

   float bridge$m01();

   float bridge$m02();

   float bridge$m03();

   float bridge$m10();

   float bridge$m11();

   float bridge$m12();

   float bridge$m13();

   float bridge$m20();

   float bridge$m21();

   float bridge$m22();

   float bridge$m23();

   float bridge$m30();

   float bridge$m31();

   float bridge$m32();

   float bridge$m33();

   org.joml.Matrix4f bridge$toJoml();

   default org.joml.Matrix4f RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(boolean var1) {
      return var1
            && !com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
               .ORHIOICIOCRRHOOCOHRORIHICHRCRR(
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOORIRCCOHIHOHCHCRHCCOCCOICROH
               )
         ? this.bridge$toJoml().transpose()
         : this.bridge$toJoml();
   }
}
