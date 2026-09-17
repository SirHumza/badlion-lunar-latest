import java.io.DataInput;
import java.io.DataOutput;

public class wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX
   extends BJyn3fSMRxbkOizCuL45mSeF4RAtIbNOnKqrGMOEOSDqFPQRXozhthv6mFW0yMaPPL5STPWyQtCg2P0BFF8CgnXKnDujY1m67DW1 {
   private double Button;

   wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX() {
   }

   public wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX(double var1) {
      this.Button = var1;
   }

   @Override
   void BatModClient(DataOutput var1) {
      var1.writeDouble(this.Button);
   }

   @Override
   void BatModClient(
      DataInput var1, int var2, pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre var3
   ) {
      var3.BatModClient(128L);
      this.Button = var1.readDouble();
   }

   @Override
   public byte BatModClient() {
      return 6;
   }

   @Override
   public String toString() {
      return "" + this.Button + "d";
   }

   @Override
   public NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju Button() {
      return new wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX(
         this.Button
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX var2 = (wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX)var1;
         return this.Button
            == var2.Button;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.Button);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }

   @Override
   public long Spinner() {
      return (long)Math.floor(this.Button);
   }

   @Override
   public int Checkbox() {
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         this.Button
      );
   }

   @Override
   public short ProgressBar() {
      return (short)(
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               this.Button
            )
            & 65535
      );
   }

   @Override
   public byte BatModProgressBar() {
      return (byte)(
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               this.Button
            )
            & 0xFF
      );
   }

   @Override
   public double ColorChooser() {
      return this.Button;
   }

   @Override
   public float IntegerSpinner() {
      return (float)this.Button;
   }
}
