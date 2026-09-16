package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   EASE(0.25F, 0.1F, 0.25F, 1.0F, "ease"),
   LINEAR(0.0F, 0.0F, 1.0F, 1.0F, "linear"),
   EASE_IN(0.42F, 0.0F, 1.0F, 1.0F, "ease_in"),
   EASE_OUT(0.0F, 0.0F, 0.58F, 1.0F, "ease_out"),
   EASE_IN_OUT(0.42F, 0.0F, 0.58F, 1.0F, "ease_in_out");

   private static final Vector3dc p0 = new Vector3d(0.0, 0.0, 0.0);
   private static final Vector3dc p3 = new Vector3d(1.0, 1.0, 0.0);
   private final Vector3dc p1;
   private final Vector3dc p2;
   private final String id;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var3, float var4, float var5, float var6, String var7) {
      this.p1 = new Vector3d(var3, var4, 0.0);
      this.p2 = new Vector3d(var5, var6, 0.0);
      this.id = var7;
   }

   public float compute(float var1) {
      return RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((float)this.cubic(p0, this.p1, this.p2, p3, var1).y(), 0.0F, 1.0F);
   }

   private Vector3dc cubic(Vector3dc var1, Vector3dc var2, Vector3dc var3, Vector3dc var4, float var5) {
      double var6 = (1.0F - var5) * (1.0F - var5) * (1.0F - var5) * var1.x()
         + (1.0F - var5) * (1.0F - var5) * 3.0F * var5 * var2.x()
         + (1.0F - var5) * 3.0F * var5 * var5 * var3.x()
         + var5 * var5 * var5 * var4.x();
      double var8 = (1.0F - var5) * (1.0F - var5) * (1.0F - var5) * var1.y()
         + (1.0F - var5) * (1.0F - var5) * 3.0F * var5 * var2.y()
         + (1.0F - var5) * 3.0F * var5 * var5 * var3.y()
         + var5 * var5 * var5 * var4.y();
      double var10 = (1.0F - var5) * (1.0F - var5) * (1.0F - var5) * var1.z()
         + (1.0F - var5) * (1.0F - var5) * 3.0F * var5 * var2.z()
         + (1.0F - var5) * 3.0F * var5 * var5 * var3.z()
         + var5 * var5 * var5 * var4.z();
      return new Vector3d(var6, var8, var10);
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }
}
