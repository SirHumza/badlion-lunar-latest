package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.Arrays;
import javax.annotation.Nullable;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final String IOHRRIHCHOCOROCCHIRHORCRICRHRR;
   private final String OORRCOOCHRROHCHOHOCICCRRHHCOCH;
   @Nullable
   private String[] CCCRRCHRRRHIOIHCIHRHROIROCIRRI;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(String var1) {
      this.IOHRRIHCHOCOROCCHIRHORCRICRHRR = var1;
      int var2 = var1.indexOf(32);
      this.OORRCOOCHRROHCHOHOCICCRRHHCOCH = var2 > 2 ? var1.substring(0, var2) : var1;
   }

   public boolean IRCRIHCRIRIRICRCRCROHORIROOOIO(String var1) {
      return var1.equals(this.OORRCOOCHRROHCHOHOCICCRRHHCOCH);
   }

   public String get(int var1) {
      if (this.CCCRRCHRRRHIOIHCIHRHROIROCIRRI == null) {
         String[] var2 = this.IOHRRIHCHOCOROCCHIRHORCRICRHRR.split(" ");
         this.CCCRRCHRRRHIOIHCIHRHROIROCIRRI = Arrays.copyOfRange(var2, 1, var2.length);
      }

      return var1 < this.CCCRRCHRRRHIOIHCIHRHROIROCIRRI.length ? this.CCCRRCHRRRHIOIHCIHRHROIROCIRRI[var1] : "";
   }

   @Generated
   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable String[] var1) {
      this.CCCRRCHRRRHIOIHCIHRHROIROCIRRI = var1;
   }

   @Generated
   public String getCommand() {
      return this.IOHRRIHCHOCOROCCHIRHORCRICRHRR;
   }

   @Generated
   public String HRRROCOCCRCHHIIRROCRICIICCOOHC() {
      return this.OORRCOOCHRROHCHOHOCICCRRHHCOCH;
   }

   @Nullable
   @Generated
   public String[] CRHRCIRIOHCRRHIIOIOCRHCRRRIORR() {
      return this.CCCRRCHRRRHIOIHCIHRHROIROCIRRI;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final String HOCIIHOCHHORRHHOIOOHOCIRCOOIHR;
      private final String HRRCHHRHIROOCIROCOHRCOHHHCIHIR;
      private boolean valid;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
         this.HOCIIHOCHHORRHHOIOOHOCIRCOOIHR = var1;
         int var2 = var1.indexOf(32);
         this.HRRCHHRHIROOCIROCOHRCOHHHCIHIR = var2 > 2 ? var1.substring(0, var2) : var1;
      }

      public boolean IRCRIHCRIRIRICRCRCROHORIROOOIO(String var1) {
         return var1.equals(this.HRRCHHRHIROOCIROCOHRCOHHHCIHIR);
      }

      public void OHCOROOHHRHOIOCHIOOHIIOHROOCCO() {
         this.valid = true;
      }

      @Generated
      public String getCommand() {
         return this.HOCIIHOCHHORRHHOIOOHOCIRCOOIHR;
      }

      @Generated
      public boolean isValid() {
         return this.valid;
      }
   }
}
