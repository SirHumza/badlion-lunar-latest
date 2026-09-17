import java.util.Collection;

public class uGuH9yAGWzFqpjIDbdEjYvO8qCB9RxzzTY6ZXvWE7aC978gKF42ux84zJRhsZSWaGrAHeuypPKti5taOSkTFDt9EJz92NVLiKdE
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private byte Button;
   private qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV[] CustomSpinner;
   private int ButtonAction;
   private int Spinner;
   private int Checkbox;
   private int ProgressBar;
   private byte[] BatModProgressBar;

   public uGuH9yAGWzFqpjIDbdEjYvO8qCB9RxzzTY6ZXvWE7aC978gKF42ux84zJRhsZSWaGrAHeuypPKti5taOSkTFDt9EJz92NVLiKdE() {
   }

   public uGuH9yAGWzFqpjIDbdEjYvO8qCB9RxzzTY6ZXvWE7aC978gKF42ux84zJRhsZSWaGrAHeuypPKti5taOSkTFDt9EJz92NVLiKdE(
      int var1, byte var2, Collection var3, byte[] var4, int var5, int var6, int var7, int var8
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3.toArray(
         new qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV[var3.size()]
      );
      this.ButtonAction = var5;
      this.Spinner = var6;
      this.Checkbox = var7;
      this.ProgressBar = var8;
      this.BatModProgressBar = new byte[var7 * var8];

      for (int var9 = 0; var9 < var7; var9++) {
         for (int var10 = 0; var10 < var8; var10++) {
            this.BatModProgressBar[var9 + var10 * var7] = var4[var5
               + var9
               + (var6 + var10) * 128];
         }
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.ButtonAction();
      this.Button = var1.readByte();
      this.CustomSpinner = new qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV[var1.ButtonAction()];

      for (int var2 = 0; var2 < this.CustomSpinner.length; var2++) {
         short var3 = var1.readByte();
         this.CustomSpinner[var2] = new qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV(
            (byte)(var3 >> 4 & 15), var1.readByte(), var1.readByte(), (byte)(var3 & 15)
         );
      }

      this.Checkbox = var1.readUnsignedByte();
      if (this.Checkbox > 0) {
         this.ProgressBar = var1.readUnsignedByte();
         this.ButtonAction = var1.readUnsignedByte();
         this.Spinner = var1.readUnsignedByte();
         this.BatModProgressBar = var1.BatModClient();
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.Button(
         this.BatModClient
      );
      var1.writeByte(this.Button);
      var1.Button(
         this.CustomSpinner.length
      );

      for (qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV var5 : this.CustomSpinner) {
         var1.writeByte(
            (var5.BatModClient() & 15) << 4
               | var5.ButtonAction() & 15
         );
         var1.writeByte(var5.Button());
         var1.writeByte(var5.CustomSpinner());
      }

      var1.writeByte(this.Checkbox);
      if (this.Checkbox > 0) {
         var1.writeByte(this.ProgressBar);
         var1.writeByte(this.ButtonAction);
         var1.writeByte(this.Spinner);
         var1.BatModClient(
            this.BatModProgressBar
         );
      }
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public void BatModClient(
      qlXEh8o8keRZEoFh2GZMTzmRXMEiLntx7zyJRpyX6ZeHl30RzVChFVgdOvKc8rzxqLm4JBkj8ijCohKOJNymRp0bajwInQi7DmZp var1
   ) {
      var1.Spinner = this.Button;
      var1.BatModProgressBar.clear();

      for (int var2 = 0; var2 < this.CustomSpinner.length; var2++) {
         qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV var3 = this.CustomSpinner[var2];
         var1.BatModProgressBar.put("icon-" + var2, var3);
      }

      for (int var4 = 0; var4 < this.Checkbox; var4++) {
         for (int var5 = 0; var5 < this.ProgressBar; var5++) {
            var1.Checkbox[this.ButtonAction
               + var4
               + (this.Spinner + var5) * 128] = this.BatModProgressBar[var4
               + var5 * this.Checkbox];
         }
      }
   }
}
