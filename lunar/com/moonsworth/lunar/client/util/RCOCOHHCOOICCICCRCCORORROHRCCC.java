package com.moonsworth.lunar.client.util;

import lombok.Generated;

public class RCOCOHHCOOICCICCRCCORORROHRCCC {
   private final String HHCIHRRCIIOOORHCIHROIRRROIOHCC;
   private int cursor;

   public RCOCOHHCOOICCICCRCCORORROHRCCC(String var1) {
      this.HHCIHRRCIIOOORHCIHROIRRROIOHCC = var1;
   }

   public int HRROOOIHIHHHRRHCROHCHCRIORICHO() {
      return this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.length() - this.cursor;
   }

   public boolean ICRRHCIHROICCROIIRHRCRRIHRRCCC() {
      return this.cursor < this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.length();
   }

   public boolean CHIRHHIORIOROICCRCHHROCCIRHOHI(int var1) {
      return this.cursor + var1 <= this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.length();
   }

   public char peek() {
      return this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.charAt(this.cursor);
   }

   public char peek(int var1) {
      return this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.charAt(this.cursor + var1);
   }

   public char ICCCHICRCHHCORHIHOIORHHHOHIHOR() {
      return this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.charAt(this.cursor++);
   }

   public void skip() {
      this.cursor++;
   }

   public void skipWhitespace() {
      while (this.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && this.peek() == ' ') {
         this.skip();
      }
   }

   public String CIHCOIIRIOOCOCRHHHHRCCIOHCRCCH() {
      return this.HHCIHRRCIIOOORHCIHROIRRROIOHCC.substring(this.cursor);
   }

   @Generated
   public String getString() {
      return this.HHCIHRRCIIOOORHCIHROIRRROIOHCC;
   }

   @Generated
   public int getCursor() {
      return this.cursor;
   }

   @Generated
   public void RIRCCRRRCOROICICCOORORHCHICRCC(int var1) {
      this.cursor = var1;
   }
}
