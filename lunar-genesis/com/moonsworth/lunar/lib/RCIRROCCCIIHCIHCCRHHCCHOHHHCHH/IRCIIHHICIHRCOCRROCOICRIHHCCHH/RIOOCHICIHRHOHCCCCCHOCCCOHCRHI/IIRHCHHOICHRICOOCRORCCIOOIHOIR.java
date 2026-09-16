package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR implements RIROICHCRROROHCCROOCCCCOCHCCRI, Serializable {
   private static final long OCOHIOOIHIHCICRCHCOIRCIHCHHRCH = 1L;
   private static final CRICCOOHHHCHOORCICOCOHIHOIRHOO IHIIHOICORROOICOCIRHRCRCCOOHCR = CRICCOOHHHCHOORCICOCOHIHOIRHOO.CICIHRHCIHOROOIHHCRHIIOHRIRRII();
   protected final String CIOHHOORIIOCIRRRIIOHIOIOHCHHRI;
   protected byte[] OIOCROIOICRCROCIICRRCOCHRIRHOO;
   protected byte[] ROCCHHHRRICHCIHRRHOHCORHRICRCC;
   protected char[] OHOIHOHCHOOOHOOICRIIIIOCIOROHI;
   protected transient String ICIICHIRIORCHCROIHCOOOIIICRIIO;

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR(String var1) {
      if (var1 == null) {
         throw new IllegalStateException("Null String illegal for SerializedString");
      }

      this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI = var1;
   }

   private void readObject(ObjectInputStream var1) {
      this.ICIICHIRIORCHCROIHCOOOIIICRIIO = var1.readUTF();
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.writeUTF(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
   }

   protected Object readResolve() {
      return new IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.ICIICHIRIORCHCROIHCOOOIIICRIIO);
   }

   @Override
   public final String getValue() {
      return this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI;
   }

   @Override
   public final int RRCRCIRHCRRIIOOORRCIOOICOCHIRC() {
      return this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI.length();
   }

   @Override
   public final char[] ICHICIICCOORRIICHRHHCOHRHHCIII() {
      char[] var1 = this.OHOIHOHCHOOOHOOICRIIIIOCIOROHI;
      if (var1 == null) {
         this.OHOIHOHCHOOOHOOICRIIIIOCIOROHI = var1 = IHIIHOICORROOICOCIRHRCRCCOOHCR.HCHROROOIIORIORRIOHOIROCHORCRO(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      return var1;
   }

   @Override
   public final byte[] HCRIIRIRRIOORICCCIHCOCCCHCROCO() {
      byte[] var1 = this.OIOCROIOICRCROCIICRRCOCHRIRHOO;
      if (var1 == null) {
         this.OIOCROIOICRCROCIICRRCOCHRIRHOO = var1 = IHIIHOICORROOICOCIRHRCRCCOOHCR.OORRIHOOCIIOHROHCIIRCROOHIIRCH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      return var1;
   }

   @Override
   public final byte[] CCROIRHOCRHRHOCHIHICRRRRHOOIIH() {
      byte[] var1 = this.ROCCHHHRRICHCIHRRHOHCORHRICRCC;
      if (var1 == null) {
         this.ROCCHHHRRICHCIHRRHOHCORHRICRCC = var1 = IHIIHOICORROOICOCIRHRCRCCOOHCR.COCHRHOIROOOHHROCCIICHCOCOCCHH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      return var1;
   }

   @Override
   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1, int var2) {
      char[] var3 = this.OHOIHOHCHOOOHOOICRIIIIOCIOROHI;
      if (var3 == null) {
         this.OHOIHOHCHOOOHOOICRIIIIOCIOROHI = var3 = IHIIHOICORROOICOCIRHRCRCCOOHCR.HCHROROOIIORIORRIOHOIROCHORCRO(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var4 = var3.length;
      if (var2 + var4 > var1.length) {
         return -1;
      }

      System.arraycopy(var3, 0, var1, var2, var4);
      return var4;
   }

   @Override
   public int IRRCCOICORICIHCHRHIHIHROIRHOCR(byte[] var1, int var2) {
      byte[] var3 = this.OIOCROIOICRCROCIICRRCOCHRIRHOO;
      if (var3 == null) {
         this.OIOCROIOICRCROCIICRRCOCHRIRHOO = var3 = IHIIHOICORROOICOCIRHRCRCCOOHCR.OORRIHOOCIIOHROHCIIRCROOHIIRCH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var4 = var3.length;
      if (var2 + var4 > var1.length) {
         return -1;
      }

      System.arraycopy(var3, 0, var1, var2, var4);
      return var4;
   }

   @Override
   public int IRCIIHHICIHRCOCRROCOICRIHHCCHH(char[] var1, int var2) {
      String var3 = this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI;
      int var4 = var3.length();
      if (var2 + var4 > var1.length) {
         return -1;
      }

      var3.getChars(0, var4, var1, var2);
      return var4;
   }

   @Override
   public int RICRIRRCOHRCOCRRHHCRHRROOIOHHR(byte[] var1, int var2) {
      byte[] var3 = this.ROCCHHHRRICHCIHRRHOHCORHRICRCC;
      if (var3 == null) {
         this.ROCCHHHRRICHCIHRRHOHCORHRICRCC = var3 = IHIIHOICORROOICOCIRHRCRCCOOHCR.COCHRHOIROOOHHROCCIICHCOCOCCHH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var4 = var3.length;
      if (var2 + var4 > var1.length) {
         return -1;
      }

      System.arraycopy(var3, 0, var1, var2, var4);
      return var4;
   }

   @Override
   public int RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(OutputStream var1) {
      byte[] var2 = this.OIOCROIOICRCROCIICRRCOCHRIRHOO;
      if (var2 == null) {
         this.OIOCROIOICRCROCIICRRCOCHRIRHOO = var2 = IHIIHOICORROOICOCIRHRCRCCOOHCR.OORRIHOOCIIOHROHCIIRCROOHIIRCH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var3 = var2.length;
      var1.write(var2, 0, var3);
      return var3;
   }

   @Override
   public int IHCRORHRORIICHRHRCHRRIRRHHOCOO(OutputStream var1) {
      byte[] var2 = this.ROCCHHHRRICHCIHRRHOHCORHRICRCC;
      if (var2 == null) {
         this.ROCCHHHRRICHCIHRRHOHCORHRICRCC = var2 = IHIIHOICORROOICOCIRHRCRCCOOHCR.COCHRHOIROOOHHROCCIICHCOCOCCHH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var3 = var2.length;
      var1.write(var2, 0, var3);
      return var3;
   }

   @Override
   public int IRRCCOICORICIHCHRHIHIHROIRHOCR(ByteBuffer var1) {
      byte[] var2 = this.OIOCROIOICRCROCIICRRCOCHRIRHOO;
      if (var2 == null) {
         this.OIOCROIOICRCROCIICRRCOCHRIRHOO = var2 = IHIIHOICORROOICOCIRHRCRCCOOHCR.OORRIHOOCIIOHROHCIIRCROOHIIRCH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var3 = var2.length;
      if (var3 > var1.remaining()) {
         return -1;
      }

      var1.put(var2, 0, var3);
      return var3;
   }

   @Override
   public int RICRIRRCOHRCOCRRHHCRHRROOIOHHR(ByteBuffer var1) {
      byte[] var2 = this.ROCCHHHRRICHCIHRRHOHCORHRICRCC;
      if (var2 == null) {
         this.ROCCHHHRRICHCIHRRHOHCORHRICRCC = var2 = IHIIHOICORROOICOCIRHRCRCCOOHCR.COCHRHOIROOOHHROCCIICHCOCOCCHH(this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      }

      int var3 = var2.length;
      if (var3 > var1.remaining()) {
         return -1;
      }

      var1.put(var2, 0, var3);
      return var3;
   }

   @Override
   public final String toString() {
      return this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI;
   }

   @Override
   public final int hashCode() {
      return this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI.hashCode();
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1;
         return this.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI.equals(var2.CIOHHOORIIOCIRRRIIOHIOIOHCHHRI);
      } else {
         return false;
      }
   }
}
