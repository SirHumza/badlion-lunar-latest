package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   default void CORCOCICIRIOHROHROIIOOHICCHCRR(int var1) {
      float var2 = (var1 >> 24 & 0xFF) / 255.0F;
      float var3 = (var1 >> 16 & 0xFF) / 255.0F;
      float var4 = (var1 >> 8 & 0xFF) / 255.0F;
      float var5 = (var1 & 0xFF) / 255.0F;
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3, var4, var5, var2);
   }

   void HHCCIRHCCCIIRHCROHIORHIRHHIORH(float var1, float var2, float var3, float var4);

   void IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var1, double var3, double var5, double var7, double var9, double var11);

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, double var3, double var5, double var7, double var9, double var11, int var13, int var14);

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   );

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20
   );

   void end();

   IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(double var1, double var3, double var5);

   IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      double var2,
      double var4,
      double var6
   );

   IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRRICCRROCOHHOHIICIHORCOORRRH(float var1, float var2, float var3, float var4);

   default IRCIIHHICIHRCOCRROCOICRIHHCCHH RIROICHCRROROHCCROOCCCCOCHCCRI(int var1) {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(
         (var1 >> 16 & 0xFF) / 255.0F, (var1 >> 8 & 0xFF) / 255.0F, (var1 & 0xFF) / 255.0F, (var1 >> 24 & 0xFF) / 255.0F
      );
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(float var1, float var2, float var3);

   IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      float var2,
      float var3,
      float var4
   );

   void endVertex();
}
