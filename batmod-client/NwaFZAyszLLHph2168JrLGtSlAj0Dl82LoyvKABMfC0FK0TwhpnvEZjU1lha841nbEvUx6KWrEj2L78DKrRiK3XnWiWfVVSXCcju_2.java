import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class ka6Oni5Hkp3IspVE5IJ5JzpG6xTZ8ya3NqH74HoqJAGtJb07FqKhkwI1RAcGZ8PfhYjNdSN55U1vWsL4P5ebkeayt9Q2QxbPxKpz
   extends NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju {
   private byte[] Button;

   ka6Oni5Hkp3IspVE5IJ5JzpG6xTZ8ya3NqH74HoqJAGtJb07FqKhkwI1RAcGZ8PfhYjNdSN55U1vWsL4P5ebkeayt9Q2QxbPxKpz() {
   }

   public ka6Oni5Hkp3IspVE5IJ5JzpG6xTZ8ya3NqH74HoqJAGtJb07FqKhkwI1RAcGZ8PfhYjNdSN55U1vWsL4P5ebkeayt9Q2QxbPxKpz(byte[] var1) {
      this.Button = var1;
   }

   @Override
   void BatModClient(DataOutput var1) {
      var1.writeInt(this.Button.length);
      var1.write(this.Button);
   }

   @Override
   void BatModClient(
      DataInput var1, int var2, pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre var3
   ) {
      var3.BatModClient(192L);
      int var4 = var1.readInt();
      var3.BatModClient(8 * var4);
      this.Button = new byte[var4];
      var1.readFully(this.Button);
   }

   @Override
   public byte BatModClient() {
      return 7;
   }

   @Override
   public String toString() {
      return "[" + this.Button.length + " bytes]";
   }

   @Override
   public NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju Button() {
      byte[] var1 = new byte[this.Button.length];
      System.arraycopy(
         this.Button,
         0,
         var1,
         0,
         this.Button.length
      );
      return new ka6Oni5Hkp3IspVE5IJ5JzpG6xTZ8ya3NqH74HoqJAGtJb07FqKhkwI1RAcGZ8PfhYjNdSN55U1vWsL4P5ebkeayt9Q2QxbPxKpz(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return super.equals(var1)
         ? Arrays.equals(
            this.Button,
            ((ka6Oni5Hkp3IspVE5IJ5JzpG6xTZ8ya3NqH74HoqJAGtJb07FqKhkwI1RAcGZ8PfhYjNdSN55U1vWsL4P5ebkeayt9Q2QxbPxKpz)var1).Button
         )
         : false;
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.Button);
   }

   public byte[] Spinner() {
      return this.Button;
   }
}
