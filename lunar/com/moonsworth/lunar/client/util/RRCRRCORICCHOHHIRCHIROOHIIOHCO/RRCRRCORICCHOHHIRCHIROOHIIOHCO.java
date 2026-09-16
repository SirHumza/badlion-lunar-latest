package com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.awt.Color;
import org.jetbrains.annotations.Range;

public interface RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   void RHIOICROIRRRIROHIHICIRRHCCIRHO(int var1);

   void CRCCHRRRHCCCIHORHHICRROIHCOROC(int var1);

   void OIRHCOIHHOHOIORCOCIOOHHIOOHRCC(@Range(from = 0L, to = 255L) int var1);

   void ORCRROIICCROIRHHCIOIOHOORCRCIO(@Range(from = 0L, to = 255L) int var1);

   void HCOIOOOHROCHCIIIORRICCHRRRHRHC(@Range(from = 0L, to = 255L) int var1);

   void RIOOHOOHOOHHROHRCCRIRCICOROORI(@Range(from = 0L, to = 255L) int var1);

   default void CRHROHHHCIHHCOHCOORCRIHHIICROR(@Range(from = 0L, to = 1L) float var1) {
      this.OIRHCOIHHOHOIORCOCIOOHHIOOHRCC((int)(var1 * 255.0F));
   }

   default void RORCHCIIICOHIRROOORHOCCCCIOCCI(@Range(from = 0L, to = 1L) float var1) {
      this.ORCRROIICCROIRHHCIOIOHOORCRCIO((int)(var1 * 255.0F));
   }

   default void IOHHOIIOCRHCHHCRORICCOHOHROOIH(@Range(from = 0L, to = 1L) float var1) {
      this.HCOIOOOHROCHCIIIORRICCHRRRHRHC((int)(var1 * 255.0F));
   }

   default void RRCRRIIRHHRCCICHOCOIHROROCICHC(@Range(from = 0L, to = 1L) float var1) {
      this.RIOOHOOHOOHHROHRCCRIRCICOROORI((int)(var1 * 255.0F));
   }

   void CRIIOOIHIOHHRRRHIOROOCHCHHCCCI(@Range(from = 0L, to = 1L) float var1);

   void CCRIHCIIOOIOHIRCCHIICCRHIROORC(@Range(from = 0L, to = 1L) float var1);

   void IHHCCRIROCRCRROCCRIHCCHOOOOIRC(@Range(from = 0L, to = 1L) float var1);

   default void IOHIHIIHCCCCCIHRORIOIOORCIOHII(
      @Range(from = 0L, to = 1L) float var1, @Range(from = 0L, to = 1L) float var2, @Range(from = 0L, to = 1L) float var3
   ) {
      this.CRCCHRRRHCCCIHORHHICRROIHCOROC(Color.HSBtoRGB(var1, var2, var3));
   }
}
