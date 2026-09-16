package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   void translate(double var1, double var3, double var5);

   void scale(float var1, float var2, float var3);

   default void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(float var1, float var2) {
      this.scale(var1, var2, 1.0F);
   }

   default void RRCRRCORICCHOHHIRCHIROOHIIOHCO(float var1, float var2, float var3, float var4) {
      this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((float)Math.toDegrees(var1), var2, var3, var4);
   }

   default void CRRRICCRROCOHHOHIICIHORCOORRRH(float var1, float var2, float var3) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH((float)Math.toDegrees(var1), (float)Math.toDegrees(var2), (float)Math.toDegrees(var3));
   }

   default void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(float var1, float var2, float var3, float var4) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1 * var2, var1 * var3, var1 * var4);
   }

   void IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, float var2, float var3);
}
