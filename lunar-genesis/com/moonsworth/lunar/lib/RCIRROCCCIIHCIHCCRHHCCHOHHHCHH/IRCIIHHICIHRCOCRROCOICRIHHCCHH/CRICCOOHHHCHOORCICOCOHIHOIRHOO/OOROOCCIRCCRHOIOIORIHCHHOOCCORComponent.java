package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

public final class CORCOCICIRIOHROHROIIOOHICCHCRR<F extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR> {
   protected int ROIOHCOOIIOHOORRIIOHCHCOCOCRIC;

   protected CORCOCICIRIOHROHROIIOOHICCHCRR(int var1) {
      this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC = var1;
   }

   public static <F extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR> CORCOCICIRIOHROHROIIOOHICCHCRR<F> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(F[] var0) {
      if (var0.length > 31) {
         String var6 = var0[0].getClass().getName();
         throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", var6, var0.length));
      }

      int var1 = 0;

      for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 : var0) {
         if (var5.enabledByDefault()) {
            var1 |= var5.getMask();
         }
      }

      return new CORCOCICIRIOHROHROIIOOHICCHCRR<>(var1);
   }

   public static <F extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR> CORCOCICIRIOHROHROIIOOHICCHCRR<F> CCICHCHCRRROOCCCHRRHHRCHOIOIHO(int var0) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR<>(var0);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR<F> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(F var1) {
      int var2 = this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC | var1.getMask();
      return var2 == this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC ? this : new CORCOCICIRIOHROHROIIOOHICCHCRR<>(var2);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR<F> IRCIIHHICIHRCOCRROCOICRIHHCCHH(F var1) {
      int var2 = this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC & ~var1.getMask();
      return var2 == this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC ? this : new CORCOCICIRIOHROHROIIOOHICCHCRR<>(var2);
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(F var1) {
      return (var1.getMask() & this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC) != 0;
   }

   public int CCRHCROCRCOCHOHRIOHICHCHOHORRI() {
      return this.ROIOHCOOIIOHOORRIIOHCHCOCOCRIC;
   }
}
