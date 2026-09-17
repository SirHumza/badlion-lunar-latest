import java.io.DataInput;
import java.io.DataOutput;

public class ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP
   extends BJyn3fSMRxbkOizCuL45mSeF4RAtIbNOnKqrGMOEOSDqFPQRXozhthv6mFW0yMaPPL5STPWyQtCg2P0BFF8CgnXKnDujY1m67DW1 {
   private byte Button;

   ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP() {
   }

   public ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP(byte var1) {
      this.Button = var1;
   }

   @Override
   void BatModClient(DataOutput var1) {
      var1.writeByte(this.Button);
   }

   @Override
   void BatModClient(
      DataInput var1, int var2, pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre var3
   ) {
      var3.BatModClient(72L);
      this.Button = var1.readByte();
   }

   @Override
   public byte BatModClient() {
      return 1;
   }

   @Override
   public String toString() {
      return "" + this.Button + "b";
   }

   @Override
   public NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju Button() {
      return new ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP(
         this.Button
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP var2 = (ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP)var1;
         return this.Button
            == var2.Button;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ this.Button;
   }

   @Override
   public long Spinner() {
      return this.Button;
   }

   @Override
   public int Checkbox() {
      return this.Button;
   }

   @Override
   public short ProgressBar() {
      return this.Button;
   }

   @Override
   public byte BatModProgressBar() {
      return this.Button;
   }

   @Override
   public double ColorChooser() {
      return this.Button;
   }

   @Override
   public float IntegerSpinner() {
      return this.Button;
   }
}
