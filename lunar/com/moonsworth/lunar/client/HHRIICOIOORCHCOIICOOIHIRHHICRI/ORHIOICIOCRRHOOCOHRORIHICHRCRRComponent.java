package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import lombok.Generated;

public enum IIOIROIHIHHCCRICRCOOCHIICHRCOI implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   FALSE("false"),
   DEFAULT("default"),
   TRUE("true");

   private final String id;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   public boolean orElse(boolean var1) {
      return this == DEFAULT ? var1 : this == TRUE;
   }

   @Generated
   IIOIROIHIHHCCRICRCOOCHIICHRCOI(String var3) {
      this.id = var3;
   }
}
