package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public interface IRRCCOICORICIHCHRHIHIHROIRHOCR {
   boolean RROCRHIIHORCOCIRICHOCCICORCCCO();

   boolean HHROHRHRRCORIHOCRCOHRRORHIHCCH();

   boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   boolean HCICCOORCOCCRORHCCIIOROCCOOORR();

   void setFlipped(boolean var1);

   static IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIIRIOCHOHRIHOCHIIOHIROCCOROOO() {
      return new IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR<IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>,
      OOHRIIOOHROIOHCIRIHRHRRICRRHOI<IRRCCOICORICIHCHRHIHIHROIRHOCR> {
      private boolean IOHCHOHHRCCHHHOCOCHIORCHHOHOOI;
      private boolean HHRCHCCOOIIOHHHHOOIOICCRCRCORH = true;
      @Nullable
      private String[] IHIOHHHHIRHRHIHHHHRICRIHCHOOCO = null;
      @Nullable
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHOIICROCHCROCIOHOIIIRCRCOOOCH = null;

      public IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(int... var1) {
         int var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().getOrdinal();

         for (int var6 : var1) {
            if (var6 == var2) {
               this.HHRCHCCOOIIOHHHHOOIOICCRCRCORH = true;
               return this;
            }
         }

         this.HHRCHCCOOIIOHHHHOOIOICCRCRCORH = false;
         return this;
      }

      public IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(int... var1) {
         int var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().getOrdinal();

         for (int var6 : var1) {
            if (var6 == var2) {
               this.HHRCHCCOOIIOHHHHOOIOICCRCRCORH = false;
               return this;
            }
         }

         this.HHRCHCCOOIIOHHHHOOIOICCRCRCORH = true;
         return this;
      }

      public IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CORCOCICIRIOHROHROIIOOHICCHCRR(String... var1) {
         if (this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO != null) {
            throw new UnsupportedOperationException("You are only allowed to set modules once!");
         }

         this.IOHCHOHHRCCHHHOCOCHIORCHHOHOOI = false;
         this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO = var1;
         return this;
      }

      public IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRICCOOHHHCHOORCICOCOHIHOIRHOO(String... var1) {
         if (this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO != null) {
            throw new UnsupportedOperationException("You are only allowed to set modules once!");
         }

         this.IOHCHOHHRCCHHHOCOCHIORCHHOHOOI = true;
         this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO = var1;
         return this;
      }

      public IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         if (this.HHOIICROCHCROCIOHOIIIRCRCOOOCH != null) {
            throw new UnsupportedOperationException("You are only allowed to set a single server!");
         }

         this.HHOIICROCHCROCIOHOIIIRCRCOOOCH = var1;
         return this;
      }

      public IRRCCOICORICIHCHRHIHIHROIRHOCR RRIIHIRRCRIRROCOCRRIOOCIRICHOR() {
         if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIHCCICIHOOIOHOIHHROOCCCRHRIH
            != null) {
            return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               true, null
            );
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRRIHCHRHCCROOHIHROIHHOROCHRH) {
            return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               true, this.HHOIICROCHCROCIOHOIIIRCRCOOOCH
            );
         }

         boolean var1 = this.HHRCHCCOOIIOHHHHOOIOICCRCRCORH;
         if (var1 && this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO != null && this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO.length > 0) {
            boolean var2 = false;

            for (String var6 : this.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO) {
               if (this.IOHCHOHHRCCHHHOCOCHIORCHHOHOOI == IICCOOCHCHROORHHIIHROHCCRHRCOR.hasModule(var6)) {
                  var2 = true;
                  break;
               }
            }

            var1 = var2;
         }

         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1, this.HHOIICROCHCROCIOHOIIIRCRCOOOCH
         );
      }
   }
}
