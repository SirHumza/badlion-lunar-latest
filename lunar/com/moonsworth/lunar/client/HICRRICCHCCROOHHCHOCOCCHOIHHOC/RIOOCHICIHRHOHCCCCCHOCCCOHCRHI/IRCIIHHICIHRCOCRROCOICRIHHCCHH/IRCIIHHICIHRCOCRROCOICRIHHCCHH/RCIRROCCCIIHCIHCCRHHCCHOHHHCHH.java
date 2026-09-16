package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.Random;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   double CCCOCOORHCOCCRIOOOIIORROCCCOOH();

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      return var1.getMalus();
   }

   float RIIRRIORRHICOCCIHOHHCIRRHOORHR();

   float RRHOIHCOCIOIOIHORHORCORCIICCCH();

   boolean HHICIORROHIIIOIICORIRCORICOCOO();

   boolean isInWater();

   boolean CCIOIIHRIOHRCHOHRICHRIIOORIIHI();

   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIHICRIICHCHIROIOHRRCHICOCOCO() {
      double var1 = this.bridge$getWidth() / 2.0;
      double var3 = this.bridge$getPosX() - var1;
      double var5 = this.bridge$getPosY();
      double var7 = this.bridge$getPosZ() - var1;
      double var9 = this.bridge$getPosX() + var1;
      double var11 = this.bridge$getPosY() + this.bridge$getHeight();
      double var13 = this.bridge$getPosZ() + var1;
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         var3, var5, var7, var9, var11, var13
      );
   }

   double bridge$getPosX();

   double bridge$getPosY();

   double bridge$getPosZ();

   @Nullable
   HHCCIRHCCCIIRHCROHIORHIRHHIORH HHIRHRHIORICHOHOCOICCRCCIRHIOO();

   float bridge$getWidth();

   float bridge$getHeight();

   Random HIOIOIRRCIOIOOCRHIRHIRHHCROORO();

   void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Vector3d var1);
}
