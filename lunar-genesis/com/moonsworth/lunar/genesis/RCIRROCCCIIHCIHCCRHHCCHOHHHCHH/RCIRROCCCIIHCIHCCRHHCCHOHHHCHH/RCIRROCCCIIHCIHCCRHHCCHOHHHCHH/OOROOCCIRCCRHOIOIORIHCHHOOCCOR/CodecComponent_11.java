package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable
final class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Serializable {
   static final IHHCHHHCRIHOOCOIOOCRIIICIOROIR OCHCRCIHHCCIROOORCIIRRHIRORHCH = new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
      2, 4, 506097522914230528L, 1084818905618843912L
   );
   private final int IHOOHIICRCROCCRCCCRIICHRHHOCOO;
   private final int CHCHIOCCIIRRORIHRIHRRHCIICROIC;
   private final long RRRIHORCCCCICCIORCCOIRHIHHIRII;
   private final long IOCOIORIOHCIIIOOOIHHIORCORICOO;
   private static final long COOHOHIICIOHHHCHCOHICHOIOOCROO = 0L;

   IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(int var1, int var2, long var3, long var5) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", var2
      );
      this.IHOOHIICRCROCCRCCCRIICHRHHOCOO = var1;
      this.CHCHIOCCIIRRORIHRIHRRHCIICROIC = var2;
      this.RRRIHORCCCCICCIORCCOIRHIHHIRII = var3;
      this.IOCOIORIOHCIIIOOOIHHIORCORICOO = var5;
   }

   @Override
   public int bits() {
      return 64;
   }

   @Override
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR OHRIHRCROOCROOIIOHROROHCCHHOCR() {
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.IHOOHIICRCROCCRCCCRIICHRHHOCOO, this.CHCHIOCCIIRRORIHRIHRRHCIICROIC, this.RRRIHORCCCCICCIORCCOIRHIHHIRII, this.IOCOIORIOHCIIIOOOIHHIORCORICOO
      );
   }

   @Override
   public String toString() {
      return "Hashing.sipHash"
         + this.IHOOHIICRCROCCRCCCRIICHRHHOCOO
         + ""
         + this.CHCHIOCCIIRRORIHRIHRRHCIICROIC
         + "("
         + this.RRRIHORCCCCICCIORCCOIRHIHHIRII
         + ", "
         + this.IOCOIORIOHCIIIOOOIHHIORCORICOO
         + ")";
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (!(var1 instanceof IRCRRHRCIRHIHIHROHCRRHIIHHHHCH)) {
         return false;
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var2 = (IRCRRHRCIRHIHIHROHCRRHIIHHHHCH)var1;
      return this.IHOOHIICRCROCCRCCCRIICHRHHOCOO == var2.IHOOHIICRCROCCRCCCRIICHRHHOCOO
         && this.CHCHIOCCIIRRORIHRIHRRHCIICROIC == var2.CHCHIOCCIIRRORIHRIHRRHCIICROIC
         && this.RRRIHORCCCCICCIORCCOIRHIHHIRII == var2.RRRIHORCCCCICCIORCCOIRHIHHIRII
         && this.IOCOIORIOHCIIIOOOIHHIORCORICOO == var2.IOCOIORIOHCIIIOOOIHHIORCORICOO;
   }

   @Override
   public int hashCode() {
      return (int)(
         this.getClass().hashCode() ^ this.IHOOHIICRCROCCRCCCRIICHRHHOCOO ^ this.CHCHIOCCIIRRORIHRIHRRHCIICROIC
            ^ this.RRRIHORCCCCICCIORCCOIRHIHHIRII
            ^ this.IOCOIORIOHCIIIOOOIHHIORCORICOO
      );
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
      private static final int HICCIHRRRRCRIRIIIRHOIIIICCHIIR = 8;
      private final int ICROCCRROIIIHORICOHRCIICHCHOII;
      private final int IHOCHIRCCOIIRRCOCHOIHIIIHCRCOI;
      private long v0 = 8317987319222330741L;
      private long v1 = 7237128888997146477L;
      private long v2 = 7816392313619706465L;
      private long v3 = 8387220255154660723L;
      private long b = 0L;
      private long finalM = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, long var3, long var5) {
         super(8);
         this.ICROCCRROIIIHORICOHRCIICHCHOII = var1;
         this.IHOCHIRCCOIIRRCOCHOIHIIIHCRCOI = var2;
         this.v0 ^= var3;
         this.v1 ^= var5;
         this.v2 ^= var3;
         this.v3 ^= var5;
      }

      @Override
      protected void process(ByteBuffer var1) {
         this.b += 8L;
         this.processM(var1.getLong());
      }

      @Override
      protected void processRemaining(ByteBuffer var1) {
         this.b = this.b + var1.remaining();

         for (byte var2 = 0; var1.hasRemaining(); var2 += 8) {
            this.finalM = this.finalM ^ (var1.get() & 255L) << var2;
         }
      }

      @Override
      protected CIOHHCORHRCCRICCCORIHCRHCCCRRR RICOORIHCRORRORHICRROHIHROORHO() {
         this.finalM = this.finalM ^ this.b << 56;
         this.processM(this.finalM);
         this.v2 ^= 255L;
         this.sipRound(this.IHOCHIRCCOIIRRCOCHOIHIIIHCRCOI);
         return CIOHHCORHRCCRICCCORIHCRHCCCRRR.CCRHRROIOIIRROHCOOCCCRRIOIHHHO(this.v0 ^ this.v1 ^ this.v2 ^ this.v3);
      }

      private void processM(long var1) {
         this.v3 ^= var1;
         this.sipRound(this.ICROCCRROIIIHORICOHRCIICHCHOII);
         this.v0 ^= var1;
      }

      private void sipRound(int var1) {
         for (int var2 = 0; var2 < var1; var2++) {
            this.v0 = this.v0 + this.v1;
            this.v2 = this.v2 + this.v3;
            this.v1 = Long.rotateLeft(this.v1, 13);
            this.v3 = Long.rotateLeft(this.v3, 16);
            this.v1 = this.v1 ^ this.v0;
            this.v3 = this.v3 ^ this.v2;
            this.v0 = Long.rotateLeft(this.v0, 32);
            this.v2 = this.v2 + this.v1;
            this.v0 = this.v0 + this.v3;
            this.v1 = Long.rotateLeft(this.v1, 17);
            this.v3 = Long.rotateLeft(this.v3, 21);
            this.v1 = this.v1 ^ this.v2;
            this.v3 = this.v3 ^ this.v0;
            this.v2 = Long.rotateLeft(this.v2, 32);
         }
      }
   }
}
