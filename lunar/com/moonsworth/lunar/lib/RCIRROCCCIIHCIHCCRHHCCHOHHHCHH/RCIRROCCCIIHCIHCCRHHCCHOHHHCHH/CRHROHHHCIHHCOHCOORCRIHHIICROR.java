package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.UUID;

public class CRHROHHHCIHHCOHCOORCRIHHIICROR {
   public abstract static class CRRRICCRROCOHHOHIICIHORCOORRRH extends CRHROHHHCIHHCOHCOORCRIHHIICROR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Object> {
      private static final long CHHCIHCRHIHOIHIROROICOIIIOCROO = 1L;

      protected CRRRICCRROCOHHOHIICIHORCOORRRH(Class<?> var1) {
         super(var1);
      }
   }

   public abstract static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CCIHHRIOOOOCOHRCIHOHROOICIORCC<Object> {
   }

   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CRHROHHHCIHHCOHCOORCRIHHIICROR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Integer> {
      private static final long OOCIHIHOHIRORCOIRHIRCHCHIIOCIH = 1L;
      protected transient int OHCRIOIHRIIHRICCOHCIHCIIOHRORC;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         this(Object.class, -1);
      }

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<?> var1, int var2) {
         super(var1);
         this.OHCRIOIHRIIHRICCOHCIHCIIOHRORC = var2;
      }

      protected int IRHIRRCHCIHCOOIHHIHIROHCCHCHIH() {
         return 1;
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC<Integer> RRRHHIRORHCHHCOOCIHOICORHHCHHO(Class<?> var1) {
         return this.HCOOOOIRCHIOCHCOICROIHCHIHIHRR == var1
            ? this
            : new CRHROHHHCIHHCOHCOORCRIHHIICROR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.OHCRIOIHRIIHRICCOHCIHCIIOHRORC);
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC<Integer> HOIRIRROOCICRHIRIHCIRCOHCIHHHO(Object var1) {
         return new CRHROHHHCIHHCOHCOORCRIHHIICROR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.HCOOOOIRCHIOCHCOICROIHCHIHIHRR, this.IRHIRRCHCIHCOOIHHIHIROHCCHCHIH());
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCROCCRIOIROHCCRCCIORICOCIOHC(Object var1) {
         return var1 == null
            ? null
            : new CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getClass(), this.HCOOOOIRCHIOCHCOICROIHCHIHIHRR, var1);
      }

      public Integer RCRCCORIIOICRIIRHCCIIOCICRHIOC(Object var1) {
         if (var1 == null) {
            return null;
         }

         int var2 = this.OHCRIOIHRIIHRICCOHCIHCIIOHRORC++;
         return var2;
      }
   }

   private abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> extends CCIHHRIOOOOCOHRCIHOHROOICIORCC<T> {
      protected final Class<?> HCOOOOIRCHIOCHCOICROIHCHIHIHRR;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var1) {
         this.HCOOOOIRCHIOCHCOICROIHCHIHIHRR = var1;
      }

      @Override
      public final Class<?> RRCOCIICOIRHOCRCHOHIOCCRICHOIH() {
         return this.HCOOOOIRCHIOCHCOICROIHCHIHIHRR;
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCIHHRIOOOOCOHRCIHOHROOICIORCC<?> var1) {
         return var1.getClass() == this.getClass() && var1.RRCOCIICOIRHOCRCHOHIOCCRICHOIH() == this.HCOOOOIRCHIOCHCOICROIHCHIHIHRR;
      }

      @Override
      public abstract T COOROCRCCHCIHRCCIROCICCIIIRHHC(Object var1);
   }

   public static final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends CRHROHHHCIHHCOHCOORCRIHHIICROR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<UUID> {
      private static final long OCOHRRCIRHICIIICHHOCHRIIHRHRIH = 1L;

      public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
         this(Object.class);
      }

      private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Class<?> var1) {
         super(Object.class);
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC<UUID> RRRHHIRORHCHHCOOCIHOICORHHCHHO(Class<?> var1) {
         return this;
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC<UUID> HOIRIRROOCICRHIRIHCIRCOHCIHHHO(Object var1) {
         return this;
      }

      public UUID CCRHRRIOCHCCIHRHRCIRRRCCCHHCCO(Object var1) {
         return UUID.randomUUID();
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCROCCRIOIROHCCRCCIORICOCIOHC(Object var1) {
         return var1 == null ? null : new CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getClass(), null, var1);
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCIHHRIOOOOCOHRCIHOHROOICIORCC<?> var1) {
         return var1.getClass() == this.getClass();
      }
   }

   public static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends CRHROHHHCIHHCOHCOORCRIHHIICROR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<String> {
      private static final long HCRRRCORHICHHHROIIROHCOCCIHIOO = 1L;

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
         this(Object.class);
      }

      private RRCRRCORICCHOHHIRCHIROOHIIOHCO(Class<?> var1) {
         super(Object.class);
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC<String> RRRHHIRORHCHHCOOCIHOICORHHCHHO(Class<?> var1) {
         return this;
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC<String> HOIRIRROOCICRHIRIHCIRCOHCIHHHO(Object var1) {
         return this;
      }

      public String ICRHCCCCOIICOCHHCRCOOIHICROIHI(Object var1) {
         return UUID.randomUUID().toString();
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCROCCRIOIROHCCRCCIORICOCIOHC(Object var1) {
         return var1 == null ? null : new CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getClass(), null, var1);
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCIHHRIOOOOCOHRCIHOHROOICIORCC<?> var1) {
         return var1 instanceof CRHROHHHCIHHCOHCOORCRIHHIICROR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
      }
   }
}
