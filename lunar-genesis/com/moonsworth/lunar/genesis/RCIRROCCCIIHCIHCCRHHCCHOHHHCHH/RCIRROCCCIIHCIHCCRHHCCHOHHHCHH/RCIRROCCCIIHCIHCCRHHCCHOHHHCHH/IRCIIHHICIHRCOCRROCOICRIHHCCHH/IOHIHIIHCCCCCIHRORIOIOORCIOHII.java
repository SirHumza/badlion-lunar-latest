package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.BitSet;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class IOHIHIIHCCCCCIHRORIOIOORCIOHII
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   static final int IOHOCOCHCOHCHIOIIHHHIRICHOORCC = 1023;
   private final char[] IHRICIRCHCHRCIRROCHIIIIHCOOCOI;
   private final boolean CIHORICRCHOCCRRHCCIHICOROHCORO;
   private final long IHOIOCIIORORRIIRHICCOIROHRIIHI;
   private static final int ORCIRORICCIHORRIHHRHCHCRICICIR = -862048943;
   private static final int OCIORHHCHRICOHIHIRIIHORHHHRHIO = 461845907;
   private static final double COOHHCCCIIORIHRIORROIOOHIORCIC = 0.5;

   private IOHIHIIHCCCCCIHRORIOIOORCIOHII(char[] var1, long var2, boolean var4, String var5) {
      super(var5);
      this.IHRICIRCHCHRCIRROCHIIIIHCOOCOI = var1;
      this.IHOIOCIIORORRIIRHICCOIROHRIIHI = var2;
      this.CIHORICRCHOCCRRHCCIHICOROHCORO = var4;
   }

   static int smear(int var0) {
      return 461845907 * Integer.rotateLeft(var0 * -862048943, 15);
   }

   private boolean checkFilter(int var1) {
      return 1L == (1L & this.IHOIOCIIORORRIIRHICCOIROHRIIHI >> var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static int chooseTableSize(int var0) {
      if (var0 == 1) {
         return 2;
      }

      int var1 = Integer.highestOneBit(var0 - 1) << 1;

      while (var1 * 0.5 < var0) {
         var1 <<= 1;
      }

      return var1;
   }

   static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      BitSet var0, String var1
   ) {
      long var2 = 0L;
      int var4 = var0.cardinality();
      boolean var5 = var0.get(0);
      char[] var6 = new char[chooseTableSize(var4)];
      int var7 = var6.length - 1;

      for (int var8 = var0.nextSetBit(0); var8 != -1; var8 = var0.nextSetBit(var8 + 1)) {
         var2 |= 1L << var8;
         int var9 = smear(var8) & var7;

         while (var6[var9] != 0) {
            var9 = var9 + 1 & var7;
         }

         var6[var9] = (char)var8;
      }

      return new IOHIHIIHCCCCCIHRORIOIOORCIOHII(var6, var2, var5, var1);
   }

   @Override
   public boolean matches(char var1) {
      if (var1 == 0) {
         return this.CIHORICRCHOCCRRHCCIHICOROHCORO;
      }

      if (!this.checkFilter(var1)) {
         return false;
      }

      int var2 = this.IHRICIRCHCHRCIRROCHIIIIHCOOCOI.length - 1;
      int var3 = smear(var1) & var2;
      int var4 = var3;

      while (this.IHRICIRCHCHRCIRROCHIIIIHCOOCOI[var4] != 0) {
         if (this.IHRICIRCHCHRCIRROCHIIIIHCOOCOI[var4] == var1) {
            return true;
         }

         var4 = var4 + 1 & var2;
         if (var4 == var3) {
            return false;
         }
      }

      return false;
   }

   @Override
   void setBits(BitSet var1) {
      if (this.CIHORICRCHOCCRRHCCIHICOROHCORO) {
         var1.set(0);
      }

      for (char var5 : this.IHRICIRCHCHRCIRROCHIIIIHCOOCOI) {
         if (var5 != 0) {
            var1.set(var5);
         }
      }
   }
}
