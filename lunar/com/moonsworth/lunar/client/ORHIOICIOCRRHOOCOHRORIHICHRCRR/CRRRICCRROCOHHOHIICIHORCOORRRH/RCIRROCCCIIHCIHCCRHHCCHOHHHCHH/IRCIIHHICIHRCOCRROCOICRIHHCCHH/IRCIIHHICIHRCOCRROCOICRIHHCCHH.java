package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import javax.vecmath.Matrix3f;
import javax.vecmath.Vector3f;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static Vector3f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Matrix3f var0) {
      Matrix3f var1 = new Matrix3f(var0);
      Matrix3f var2 = new Matrix3f();
      Matrix3f var3 = new Matrix3f();
      var3.setIdentity();
      var2.setIdentity();
      var2.mul(2.0F);
      var1.add(var3);
      var1.invert();
      var1.mul(4.0F);
      var2.sub(var1);
      return new Vector3f(var2.m21, -var2.m20, var2.m10);
   }
}
