package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.Arrays;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   private static final long HHHRICHHIOCROCHHOHHOIRCCRCHCCO = 2L;
   static final CRRRICCRROCOHHOHIICIHORCOORRRH ORCRORHIOHCIOCCCOIHCHOOCRCCHCI = new CRRRICCRROCOHHOHIICIHORCOORRRH(new byte[0]);
   protected final byte[] _data;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(byte[] var1) {
      this._data = var1;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH(byte[] var1, int var2, int var3) {
      if (var2 == 0 && var3 == var1.length) {
         this._data = var1;
      } else {
         this._data = new byte[var3];
         System.arraycopy(var1, var2, this._data, 0, var3);
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH IIHHICHCCCOHCHROIRIHICCHHOROCR(byte[] var0) {
      if (var0 == null) {
         return null;
      } else {
         return var0.length == 0 ? ORCRORHIOHCIOCCCOIHCHOOCRCCHCI : new CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH RHOORRIIOCHIRRHOHOOHIROHCRICRO(byte[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         return var2 == 0 ? ORCRORHIOHCIOCCCOIHCHOOCRCCHCI : new CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1, var2);
      }
   }

   @Override
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR OOHCIOIOCIOHOROHICIRCICHOCIHIC() {
      return CIOHHCORHRCCRICCCORIHCRHCCCRRR.BINARY;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI CORCIHIIIHCCCRORIHHIRHHIORCHOI() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_EMBEDDED_OBJECT;
   }

   @Override
   public byte[] HOIORRHRRCOORORRHOIOROHICCORIO() {
      return this._data;
   }

   @Override
   public String HICIIICICHHHRCORHRHHCCHOHHIROR() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCIIRCCOCICRIOOHOOORHRCRRIIIOR()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(this._data, false);
   }

   @Override
   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.RROOOCRCORCHCRRIRCRIIHHHHROOHO().RCCIOIICIOCROOHHORRHROIRRIOCOC(), this._data, 0, this._data.length);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 == null) {
         return false;
      } else {
         return !(var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH) ? false : Arrays.equals(((CRRRICCRROCOHHOHIICIHORCOORRRH)var1)._data, this._data);
      }
   }

   @Override
   public int hashCode() {
      return this._data == null ? -1 : this._data.length;
   }
}
