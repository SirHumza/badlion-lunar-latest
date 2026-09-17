package com.moonsworth.lunar.client.util;

import java.util.function.BooleanSupplier;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public enum CCIHHRIOOOOCOHRCIHOHROOICIORCC {
   ANY,
   TRUE,
   FALSE;

   public boolean isConditional() {
      return this == ANY;
   }

   public boolean isTrue() {
      return this == TRUE;
   }

   public boolean isFalse() {
      return this == FALSE;
   }

   public boolean isConditionalOrTrue(BooleanSupplier var1) {
      return this.isConditional() ? var1.getAsBoolean() : this.isTrue();
   }

   public boolean isConditionalOrFalse(BooleanSupplier var1) {
      return this.isConditional() ? var1.getAsBoolean() : this.isFalse();
   }

   public boolean isConditionalOrElse(BooleanSupplier var1, boolean var2) {
      return this.isConditional() ? var1.getAsBoolean() : var2;
   }

   public static CCIHHRIOOOOCOHRCIHOHROOICIORCC orDefault(@Nullable CCIHHRIOOOOCOHRCIHOHROOICIORCC var0) {
      return var0 == null ? ANY : var0;
   }

   public static class CRRRICCRROCOHHOHIICIHORCOORRRH extends CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final CCIHHRIOOOOCOHRCIHOHROOICIORCC CHIOICIIHHIOOCHIIRHCHIRICOIIIO;

      public CRRRICCRROCOHHOHIICIHORCOORRRH() {
         this.CHIOICIIHHIOOCHIIRHCHIRICOIIIO = CCIHHRIOOOOCOHRCIHOHROOICIORCC.ANY;
      }

      public CRRRICCRROCOHHOHIICIHORCOORRRH(boolean var1) {
         this.CHIOICIIHHIOOCHIIRHCHIRICOIIIO = var1 ? CCIHHRIOOOOCOHRCIHOHROOICIORCC.TRUE : CCIHHRIOOOOCOHRCIHOHROOICIORCC.FALSE;
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC HHCHCOIHCCOHCIROCRHCIOHCHCCIHH() {
         return this.CHIOICIIHHIOOCHIIRHCHIRICOIIIO;
      }

      @Generated
      public CRRRICCRROCOHHOHIICIHORCOORRRH(CCIHHRIOOOOCOHRCIHOHROOICIORCC var1) {
         this.CHIOICIIHHIOOCHIIRHCHIRICOIIIO = var1;
      }
   }

   public abstract static class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      public abstract CCIHHRIOOOOCOHRCIHOHROOICIORCC HHCHCOIHCCOHCIROCRHCIOHCHCCIHH();

      public static CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @Nullable CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
      ) {
         return var0 == null ? new CCIHHRIOOOOCOHRCIHOHROOICIORCC.CRRRICCRROCOHHOHIICIHORCOORRRH() : var0;
      }
   }

   public abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> extends CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      public abstract CCIHHRIOOOOCOHRCIHOHROOICIORCC IROCHOHCORHCOCCCOCHORCICRORIIC(T var1);
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> extends CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> {
      @Nullable
      private final Function<T, Boolean> IIRIHICORRROOHCHOHCIORIHOICORI;

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC IROCHOHCORHCOCCCOCHORCICRORIIC(T var1) {
         return this.IIRIHICORRROOHCHOHCIORIHOICORI == null
            ? CCIHHRIOOOOCOHRCIHOHROOICIORCC.ANY
            : (this.IIRIHICORRROOHCHOHCIORIHOICORI.apply((T)var1) ? CCIHHRIOOOOCOHRCIHOHROOICIORCC.TRUE : CCIHHRIOOOOCOHRCIHOHROOICIORCC.FALSE);
      }

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC HHCHCOIHCCOHCIROCRHCIOHCHCCIHH() {
         return CCIHHRIOOOOCOHRCIHOHROOICIORCC.ANY;
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable Function<T, Boolean> var1) {
         this.IIRIHICORRROOHCHOHCIORIHOICORI = var1;
      }
   }

   public static class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      @Nullable
      private final BooleanSupplier IHRCHOROHRIOOIOROOHCOCCHOCOIRR;

      @Override
      public CCIHHRIOOOOCOHRCIHOHROOICIORCC HHCHCOIHCCOHCIROCRHCIOHCHCCIHH() {
         return this.IHRCHOROHRIOOIOROOHCOCCHOCOIRR == null
            ? CCIHHRIOOOOCOHRCIHOHROOICIORCC.ANY
            : (this.IHRCHOROHRIOOIOROOHCOCCHOCOIRR.getAsBoolean() ? CCIHHRIOOOOCOHRCIHOHROOICIORCC.TRUE : CCIHHRIOOOOCOHRCIHOHROOICIORCC.FALSE);
      }

      @Generated
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable BooleanSupplier var1) {
         this.IHRCHOROHRIOOIOROOHCOCCHOCOIRR = var1;
      }
   }
}
