package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.IOException;
import java.io.Serializable;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR implements Serializable {
   private static final long HRCOHIIICOHOCIOIHHHROCRHIRCICR = 1L;
   protected byte[] OOIICRRROORHRCCHRCHCRORIOOIRRH;
   protected CharSequence IIHRCORHIICHICCRCOICCRIRRRRIHI;
   protected String ICCRIRRCIIRIRIRICCIHHRHRCHIHRI;

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(byte[] var1, String var2) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      }

      this.OOIICRRROORHRCCHRCHCRORIOOIRRH = var1;
      this.ICCRIRRCIIRIRIRICCIHHRHRCHIHRI = var2 != null && !var2.isEmpty() ? var2 : "UTF-8";
   }

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(CharSequence var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      }

      this.IIHRCORHIICHICCRCOICCRIRRRRIHI = var1;
   }

   public Object CRCIRRIHIIOIOCOIOHHIOCIRIRCCIH() {
      return this.OOIICRRROORHRCCHRCHCRORIOOIRRH != null ? this.OOIICRRROORHRCCHRCHCRORIOOIRRH : this.IIHRCORHIICHICCRCOICCRIRRRRIHI;
   }

   @Override
   public String toString() {
      if (this.OOIICRRROORHRCCHRCHCRORIOOIRRH != null) {
         try {
            return new String(this.OOIICRRROORHRCCHRCHCRORIOOIRRH, this.ICCRIRRCIIRIRIRICCIHHRHRCHIHRI);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }
      } else {
         return this.IIHRCORHIICHICCRCOICCRIRRRRIHI.toString();
      }
   }
}
