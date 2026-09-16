package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.function.Supplier;

public class CRRRICCRROCOHHOHIICIHORCOORRRH<T> {
   private final boolean IICCOHOIROCIHRRORCHROIHCICCCIR;
   private final boolean CCHHHOIICIRCIICIIRORIOOOICRHHO;
   private boolean HCCRHCICRHRCCRICCIRRROHHRCOROH = false;
   private T OCIRRRCOOIRIIHOCICCHHOOOORRCIR;
   private Supplier<T> supplier = null;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(T var1, boolean var2) {
      this((T)var1, var2, false);
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH(T var1, boolean var2, boolean var3) {
      this.IICCOHOIROCIHRRORCHROIHCICCCIR = var2;
      this.OCIRRRCOOIRIIHOCICCHHOOOORRCIR = (T)var1;
      this.CCHHHOIICIRCIICIIRORIOOOICRHHO = var3;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH<T> IRRCCOICORICIHCHRHIHIHROIRHOCR(T var1) {
      if (!this.IICCOHOIROCIHRRORCHROIHCICCCIR && var1 == null) {
         throw new NullPointerException();
      }

      this.supplier = null;
      this.OCIRRRCOOIRIIHOCICCHHOOOORRCIR = (T)var1;
      return this;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH<T> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Supplier<T> var1) {
      if (!this.IICCOHOIROCIHRRORCHROIHCICCCIR && var1 == null) {
         throw new NullPointerException();
      }

      this.supplier = var1;
      return this;
   }

   public T get() {
      if (this.supplier != null) {
         if (this.CCHHHOIICIRCIICIIRORIOOOICRHHO && this.HCCRHCICRHRCCRICCIRRROHHRCOROH) {
            return this.OCIRRRCOOIRIIHOCICCHHOOOORRCIR;
         }

         Object var1 = this.supplier.get();
         if (var1 == null && !this.IICCOHOIROCIHRRORCHROIHCICCCIR) {
            throw new NullPointerException();
         }

         if (this.CCHHHOIICIRCIICIIRORIOOOICRHHO) {
            this.OCIRRRCOOIRIIHOCICCHHOOOORRCIR = (T)var1;
            this.HCCRHCICRHRCCRICCIRRROHHRCOROH = true;
         }

         return (T)var1;
      } else {
         return this.OCIRRRCOOIRIIHOCICCHHOOOORRCIR;
      }
   }

   public void clearCache() {
      if (!this.CCHHHOIICIRCIICIIRORIOOOICRHHO) {
         throw new IllegalStateException("Not a caching HudComponentValue!");
      }

      if (this.supplier != null) {
         this.HCCRHCICRHRCCRICCIRRROHHRCOROH = false;
         this.OCIRRRCOOIRIIHOCICCHHOOOORRCIR = null;
      }
   }
}
