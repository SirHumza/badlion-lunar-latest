package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import org.jetbrains.annotations.Contract;
import org.joml.Vector3d;
import org.joml.Vector3f;

@com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
   OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
         @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            version = 0,
            RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               "net/minecraft/util/AxisAlignedBB"
            )
         ),
         @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            version = 5,
            RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               "net/minecraft/util/math/AxisAlignedBB"
            )
         ),
         @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            version = 6,
            RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               "net/minecraft/world/phys/AABB"
            )
         )
   }
)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRORRIIHRCOHRHCHCOCORRIIHIIOOR() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HOHOOIHHIHCRCCROOCIOOIHCRCHICR;
   }

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("<init>(DDDDDD)V")
   @Contract("_,_,_,_,_,_ -> new")
   static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      double var0, double var2, double var4, double var6, double var8, double var10
   ) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   @Contract("_,_,_,_,_,_ -> new")
   static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      double var0, double var2, double var4, double var6, double var8, double var10
   ) {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var2, var4, var0 + var6, var2 + var8, var4 + var10);
   }

   double bridge$getMinX();

   double bridge$getMinY();

   double bridge$getMinZ();

   double bridge$getMaxX();

   double bridge$getMaxY();

   double bridge$getMaxZ();

   @Contract("_,_,_ -> new")
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$expand(
      double var1, double var3, double var5
   );

   @Contract("_,_,_ -> new")
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$offset(
      double var1, double var3, double var5
   );

   @Contract("_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      CRHROHHHCIHHCOHCOORCRIHHIICROR var1
   ) {
      return this.bridge$offset(var1.bridge$xCoord(), var1.bridge$yCoord(), var1.bridge$zCoord());
   }

   @Contract("_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      RORCHCIIICOHIRROOORHOCCCCIOCCI var1
   ) {
      return this.bridge$offset(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
   }

   boolean bridge$intersectsWith(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   @Contract("_ -> new")
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$union(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   );

   @Contract("_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      double var2 = Math.min(this.bridge$getMinX(), var1.bridge$getMinX());
      double var4 = Math.min(this.bridge$getMinY(), var1.bridge$getMinY());
      double var6 = Math.min(this.bridge$getMinZ(), var1.bridge$getMinZ());
      double var8 = Math.max(this.bridge$getMaxX(), var1.bridge$getMaxX());
      double var10 = Math.max(this.bridge$getMaxY(), var1.bridge$getMaxY());
      double var12 = Math.max(this.bridge$getMaxZ(), var1.bridge$getMaxZ());
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4, var6, var8, var10, var12);
   }

   @Contract("_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRRRICCRROCOHHOHIICIHORCOORRRH(
      Vector3f var1
   ) {
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1.x, var1.y, var1.z);
   }

   @Contract("_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      CRHROHHHCIHHCOHCOORCRIHHIICROR var1
   ) {
      return this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1.bridge$xCoord(), var1.bridge$yCoord(), var1.bridge$zCoord());
   }

   @Contract("_,_,_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      double var1, double var3, double var5
   ) {
      double var7 = Math.min(this.bridge$getMinX(), var1);
      double var9 = Math.min(this.bridge$getMinY(), var3);
      double var11 = Math.min(this.bridge$getMinZ(), var5);
      double var13 = Math.max(this.bridge$getMaxX(), var1);
      double var15 = Math.max(this.bridge$getMaxY(), var3);
      double var17 = Math.max(this.bridge$getMaxZ(), var5);
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var9, var11, var13, var15, var17);
   }

   default boolean IIHRRHORCRCROCHHOHORCHCROCIHRO(double var1, double var3, double var5) {
      return var1 >= this.bridge$getMinX()
         && var1 <= this.bridge$getMaxX()
         && var3 >= this.bridge$getMinY()
         && var3 <= this.bridge$getMaxY()
         && var5 >= this.bridge$getMinZ()
         && var5 <= this.bridge$getMaxZ();
   }

   @Contract("_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      double var1
   ) {
      return this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1, var1, var1);
   }

   @Contract("_,_,_ -> new")
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOHORHCROHICRRIHCIHHRRCIHICRI(
      double var1, double var3, double var5
   ) {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.bridge$getMinX() - var1,
         this.bridge$getMinY() - var3,
         this.bridge$getMinZ() - var5,
         this.bridge$getMaxX() + var1,
         this.bridge$getMaxY() + var3,
         this.bridge$getMaxZ() + var5
      );
   }

   default String asString() {
      return String.format(
         "[%.2f, %.2f, %.2f, %.2f, %.2f, %.2f]",
         this.bridge$getMinX(),
         this.bridge$getMinY(),
         this.bridge$getMinZ(),
         this.bridge$getMaxX(),
         this.bridge$getMaxY(),
         this.bridge$getMaxZ()
      );
   }

   double bridge$calculateXOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, double var2
   );

   double bridge$calculateYOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, double var2
   );

   double bridge$calculateZOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, double var2
   );

   default Vector3d CHHOHOOOIHHHHIHCCOIRRRCCRHRIRI() {
      return new Vector3d(
         this.bridge$getMinX() + (this.bridge$getMaxX() - this.bridge$getMinX()) / 2.0,
         this.bridge$getMinY() + (this.bridge$getMaxY() - this.bridge$getMinY()) / 2.0,
         this.bridge$getMinZ() + (this.bridge$getMaxZ() - this.bridge$getMinZ()) / 2.0
      );
   }

   default double HHROCOOOROICCOOCHOHCIHOCORIIOO() {
      return this.bridge$getMaxX() - this.bridge$getMinX();
   }

   default double HIOOCIRHRRHCRHRCRCHHCICIRIHHCR() {
      return this.bridge$getMaxY() - this.bridge$getMinY();
   }

   default double CHHCCORHOROHRCHOROOHORCRHHHHCI() {
      return this.bridge$getMaxZ() - this.bridge$getMinZ();
   }

   default Vector3d RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      boolean var2
   ) {
      return new Vector3d(
         var1
               == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.X
            ? (var2 ? this.bridge$getMinX() : this.bridge$getMaxX())
            : this.bridge$getMinX() + (this.bridge$getMaxX() - this.bridge$getMinX()) / 2.0,
         var1
               == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Y
            ? (var2 ? this.bridge$getMinY() : this.bridge$getMaxY())
            : this.bridge$getMinY() + (this.bridge$getMaxY() - this.bridge$getMinY()) / 2.0,
         var1
               == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Z
            ? (var2 ? this.bridge$getMinZ() : this.bridge$getMaxZ())
            : this.bridge$getMinZ() + (this.bridge$getMaxZ() - this.bridge$getMinZ()) / 2.0
      );
   }

   boolean bridge$hasNaN();

   double bridge$getSize();

   static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHIROICRORCCHHIIHRCCCICCIOCOHI() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OIHHCIOCHOCOIHCICOOIOICCRICORH;
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      static final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOHOOIHHIHCRCCROOCIOOIHCRCHICR = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         0.0, 0.0, 0.0, 1.0, 1.0, 1.0
      );
      static final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIHHCIOCHOCOIHCICOOIOICCRICORH = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         0.0, 0.0, 0.0, 0.0, 0.0, 0.0
      );
   }
}
