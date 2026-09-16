package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import org.jetbrains.annotations.Contract;
import org.joml.Vector3i;
import org.joml.Vector3ic;

public interface RORCHCIIICOHIRROOORHOCCCCIOCCI {
   RORCHCIIICOHIRROOORHOCCCCIOCCI HCHIOICHRIRIRIIOCICIORRHOCHIHH = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
      .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(0, 0, 0);

   int bridge$getX();

   int bridge$getY();

   int bridge$getZ();

   @Contract("_,_,_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$offset(int var1, int var2, int var3) {
      return this.bridge$add(new Vector3i(var1, var2, var3));
   }

   @Contract("_ -> new")
   RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$add(Vector3ic var1);

   default Vector3i bridge$toJoml() {
      return new Vector3i(this.bridge$getX(), this.bridge$getY(), this.bridge$getZ());
   }

   default boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return var1 == null
         ? false
         : this.bridge$getX() == var1.bridge$getX() && this.bridge$getY() == var1.bridge$getY() && this.bridge$getZ() == var1.bridge$getZ();
   }

   default double OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double var1, double var3, double var5) {
      double var7 = this.bridge$getX() - var1;
      double var9 = this.bridge$getY() - var3;
      double var11 = this.bridge$getZ() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI HRCHROOHRIHCRCRHRIIROCIRHOIRHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.bridge$getY() * var1.bridge$getZ() - this.bridge$getZ() * var1.bridge$getY(),
            this.bridge$getZ() * var1.bridge$getX() - this.bridge$getX() * var1.bridge$getZ(),
            this.bridge$getX() * var1.bridge$getY() - this.bridge$getY() * var1.bridge$getX()
         );
   }

   default boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1, double var2) {
      return this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1) < var2 * var2;
   }

   default boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1, double var2) {
      return this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1) < var2 * var2;
   }

   default boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRHROHHHCIHHCOHCOORCRIHHIICROR var1, double var2) {
      return this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1) < var2 * var2;
   }

   default double OOROOCCIRCCRHOIOIORIHCHHOOCCOR(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
   }

   default double CORCOCICIRIOHROHROIIOOHICCHCRR(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return this.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
   }

   default double CRICCOOHHHCHOORCICOCOHIHOIRHOO(CRHROHHHCIHHCOHCOORCRIHHIICROR var1) {
      return this.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1.bridge$xCoord(), var1.bridge$yCoord(), var1.bridge$zCoord());
   }

   default double IRRCCOICORICIHCHRHIHIHROIRHOCR(double var1, double var3, double var5) {
      double var7 = this.bridge$getX() + 0.5 - var1;
      double var9 = this.bridge$getY() + 0.5 - var3;
      double var11 = this.bridge$getZ() + 0.5 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   default double RICRIRRCOHRCOCRRHHCRHRROOIOHHR(double var1, double var3, double var5) {
      double var7 = this.bridge$getX() - var1;
      double var9 = this.bridge$getY() - var3;
      double var11 = this.bridge$getZ() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   default int CRICCOOHHHCHOORCICOCOHIHOIRHOO(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      float var2 = Math.abs(var1.bridge$getX() - this.bridge$getX());
      float var3 = Math.abs(var1.bridge$getY() - this.bridge$getY());
      float var4 = Math.abs(var1.bridge$getZ() - this.bridge$getZ());
      return (int)(var2 + var3 + var4);
   }

   default RORCHCIIICOHIRROOORHOCCCCIOCCI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 1);
   }

   default RORCHCIIICOHIRROOORHOCCCCIOCCI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2
   ) {
      return var2 == 0
         ? this
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.bridge$getX() + var1.getOffsetX() * var2, this.bridge$getY() + var1.getOffsetY() * var2, this.bridge$getZ() + var1.getOffsetZ() * var2
            );
   }

   default RORCHCIIICOHIRROOORHOCCCCIOCCI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2
   ) {
      return var2 == 0
         ? this
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.bridge$getX()
                  + (
                     var1
                           == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.X
                        ? var2
                        : 0
                  ),
               this.bridge$getY()
                  + (
                     var1
                           == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Y
                        ? var2
                        : 0
                  ),
               this.bridge$getZ()
                  + (
                     var1
                           == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.Z
                        ? var2
                        : 0
                  )
            );
   }

   @Contract("-> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$above() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY() + 1, this.bridge$getZ());
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI CRHROHHHCIHHCOHCOORCRIHHIICROR(int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY() + var1, this.bridge$getZ());
   }

   @Contract("-> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$below() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY() - 1, this.bridge$getZ());
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI RORCHCIIICOHIRROOORHOCCCCIOCCI(int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY() - var1, this.bridge$getZ());
   }

   @Contract("-> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI RHOCOOIRORICHIHOORCHIOICRHIORI() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY(), this.bridge$getZ() - 1);
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI IOHHOIIOCRHCHHCRORICCOHOHROOIH(int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY(), this.bridge$getZ() - var1);
   }

   @Contract("-> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI ICICRRIRHICOOCHHOICHROHCROROOR() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY(), this.bridge$getZ() + 1);
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY(), this.bridge$getZ() + var1);
   }

   @Contract("-> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI CRHCHIHOIOCRICRRRROICOROOHIROO() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX() - 1, this.bridge$getY(), this.bridge$getZ());
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI RHCHRCOCCOIIIHCHRHIRCORHRHRICR(int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX() - var1, this.bridge$getY(), this.bridge$getZ());
   }

   @Contract("-> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI HOCOCCIICIOICHIOCHORCORCHIHRRR() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX() + 1, this.bridge$getY(), this.bridge$getZ());
   }

   @Contract("_ -> new")
   default RORCHCIIICOHIRROOORHOCCCCIOCCI RCCCROCHCICCROHCOCCRRROCIIHCCH(int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX() + var1, this.bridge$getY(), this.bridge$getZ());
   }

   interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RORCHCIIICOHIRROOORHOCCCCIOCCI {
      void bridge$setPos(int var1, int var2, int var3);

      default void HICRRICCHCCROOHHCHOCOCCHOIHHOC(double var1, double var3, double var5) {
         this.bridge$setPos((int)Math.floor(var1), (int)Math.floor(var3), (int)Math.floor(var5));
      }

      default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1, int var2, int var3, int var4) {
         this.bridge$setPos(var1.bridge$getX() + var2, var1.bridge$getY() + var3, var1.bridge$getZ() + var4);
      }

      default HHCCIRHCCCIIRHCROHIORHIRHHIORH RCOOHIIRCICOCRRRCCCIROCRRORIIC() {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getX(), this.bridge$getY(), this.bridge$getZ());
      }

      @Contract("-> this")
      @Override
      default RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$above() {
         this.bridge$setPos(this.bridge$getX(), this.bridge$getY() + 1, this.bridge$getZ());
         return this;
      }

      @Contract("-> this")
      @Override
      default RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$below() {
         this.bridge$setPos(this.bridge$getX(), this.bridge$getY() - 1, this.bridge$getZ());
         return this;
      }
   }
}
