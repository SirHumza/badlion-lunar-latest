package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final int CHIHIRCORHIIOIRIORIIHROOROHOHO = 0;
   public static final int RHICRHHRCIHIOICORCICRCHOOOICHI = 1;
   public static final int RHHHIOHIRCHOHIHHIIHCCRIIIRHIHI = 2;
   public static final int RIHRCORHOHCHIICORIROHOCCRIIHIR = 3;
   public static final int HOIRCHCROOCRHCRIRCRCCHIRHCOCHI = 0;
   public static final int CRRCIHIHIIOOORHRORCOICRHOROOII = 1;
   public static final int IOCRIRHOROHOIHCCIIIHIORROCHCRC = 2;
   public static final int HICHRORCRHHICHOIROHHHRHHOHHOIR = 3;
   private static final int[] IRRIROORHOHICHCCRRCROHHIIIRCRR = new int[]{8000, 8000, 2000, 2000};
   private static final int[] RRORRRRHIRHOIOHHIOCOOOOICHICRO = new int[]{4000, 4000, 200, 200};
   protected final AtomicReferenceArray<byte[]> RIIORORROCCCIRRIROCIICRCIRIHIC;
   protected final AtomicReferenceArray<char[]> HRHRROHCCCCROOOOCIRHICOHRIRRRC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this(4, 4);
   }

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2) {
      this.RIIORORROCCCIRRIROCIICRCIRIHIC = new AtomicReferenceArray<>(var1);
      this.HRHRROHCCCCROOOOCIRHICOHRIRRRC = new AtomicReferenceArray<>(var2);
   }

   public final byte[] CHOIOICOCCRCOIHIRRHCRCIOHCHRHI(int var1) {
      return this.COOROCRCCHCIHRCCIROCICCIIIRHHC(var1, 0);
   }

   public byte[] COOROCRCCHCIHRCCIROCICCIIIRHHC(int var1, int var2) {
      int var3 = this.ICHCIRHOCHRIIOHCIOCOORROHIHICR(var1);
      if (var2 < var3) {
         var2 = var3;
      }

      byte[] var4 = this.RIIORORROCCCIRRIROCIICRCIRIHIC.getAndSet(var1, null);
      if (var4 == null || var4.length < var2) {
         var4 = this.IOCCCCRCICOHHCOCHOHHIHCOCHOIHI(var2);
      }

      return var4;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, byte[] var2) {
      this.RIIORORROCCCIRRIROCIICRCIRIHIC.set(var1, var2);
   }

   public final char[] OHRRICOOIRRRHCCOORHRHIHRHOOCRC(int var1) {
      return this.RCRCCORIIOICRIIRHCCIIOCICRHIOC(var1, 0);
   }

   public char[] RCRCCORIIOICRIIRHCCIIOCICRHIOC(int var1, int var2) {
      int var3 = this.IOCHRIRCHHIROCCHIIIIICRCHOIOHI(var1);
      if (var2 < var3) {
         var2 = var3;
      }

      char[] var4 = this.HRHRROHCCCCROOOOCIRHICOHRIRRRC.getAndSet(var1, null);
      if (var4 == null || var4.length < var2) {
         var4 = this.OICRHIOROCOIIHOHCCOOOICHIHIHRO(var2);
      }

      return var4;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, char[] var2) {
      this.HRHRROHCCCCROOOOCIRHICOHRIRRRC.set(var1, var2);
   }

   protected int ICHCIRHOCHRIIOHCIOCOORROHIHICR(int var1) {
      return IRRIROORHOHICHCCRRCROHHIIIRCRR[var1];
   }

   protected int IOCHRIRCHHIROCCHIIIIICRCHOIOHI(int var1) {
      return RRORRRRHIRHOIOHHIOCOOOOICHICRO[var1];
   }

   protected byte[] IOCCCCRCICOHHCOCHOHHIHCOCHOIHI(int var1) {
      return new byte[var1];
   }

   protected char[] OICRHIOROCOIIHOHCCOOOICHIHIHRO(int var1) {
      return new char[var1];
   }
}
