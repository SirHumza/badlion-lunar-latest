public class jeoIsG9ZdyPghp5H3qUOWeu8EBZIKXKVyKToJqz5mILUt3RpI5jMoUWu5CHhY0niaAYP5FEKrMUzRm7y4pMrLymrB7NWLdTTJcw
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private boolean Button;
   private UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc CustomSpinner;
   private int ButtonAction;
   private jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi Spinner;
   private int Checkbox;
   private X2Vr1O4DSTdlVzTHC08vBjTsnuTSx2f4ovgQB5BdrdVuUjiLxZQpM63guZCtKKDo69VpbFpWDdnO2VJHyfzVEj15IuHff0BmzY17 ProgressBar;
   private boolean BatModProgressBar;

   public jeoIsG9ZdyPghp5H3qUOWeu8EBZIKXKVyKToJqz5mILUt3RpI5jMoUWu5CHhY0niaAYP5FEKrMUzRm7y4pMrLymrB7NWLdTTJcw() {
   }

   public jeoIsG9ZdyPghp5H3qUOWeu8EBZIKXKVyKToJqz5mILUt3RpI5jMoUWu5CHhY0niaAYP5FEKrMUzRm7y4pMrLymrB7NWLdTTJcw(
      int var1,
      UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc var2,
      boolean var3,
      int var4,
      jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi var5,
      int var6,
      X2Vr1O4DSTdlVzTHC08vBjTsnuTSx2f4ovgQB5BdrdVuUjiLxZQpM63guZCtKKDo69VpbFpWDdnO2VJHyfzVEj15IuHff0BmzY17 var7,
      boolean var8
   ) {
      this.BatModClient = var1;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.CustomSpinner = var2;
      this.Checkbox = var6;
      this.Button = var3;
      this.ProgressBar = var7;
      this.BatModProgressBar = var8;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readInt();
      int var2 = var1.readUnsignedByte();
      this.Button = (var2 & 8) == 8;
      var2 &= -9;
      this.CustomSpinner = UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc.BatModClient(
         var2
      );
      this.ButtonAction = var1.readByte();
      this.Spinner = jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.BatModClient(
         var1.readUnsignedByte()
      );
      this.Checkbox = var1.readUnsignedByte();
      this.ProgressBar = X2Vr1O4DSTdlVzTHC08vBjTsnuTSx2f4ovgQB5BdrdVuUjiLxZQpM63guZCtKKDo69VpbFpWDdnO2VJHyfzVEj15IuHff0BmzY17.BatModClient(
         var1.CustomSpinner(16)
      );
      if (this.ProgressBar == null) {
         this.ProgressBar = X2Vr1O4DSTdlVzTHC08vBjTsnuTSx2f4ovgQB5BdrdVuUjiLxZQpM63guZCtKKDo69VpbFpWDdnO2VJHyfzVEj15IuHff0BmzY17.Button;
      }

      this.BatModProgressBar = var1.readBoolean();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeInt(this.BatModClient);
      int var2 = this.CustomSpinner
         .BatModClient();
      if (this.Button) {
         var2 |= 8;
      }

      var1.writeByte(var2);
      var1.writeByte(this.ButtonAction);
      var1.writeByte(
         this.Spinner
            .BatModClient()
      );
      var1.writeByte(this.Checkbox);
      var1.BatModClient(
         this.ProgressBar
            .BatModClient()
      );
      var1.writeBoolean(this.BatModProgressBar);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.Button;
   }

   public UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.ButtonAction;
   }

   public jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi Spinner() {
      return this.Spinner;
   }

   public int Checkbox() {
      return this.Checkbox;
   }

   public X2Vr1O4DSTdlVzTHC08vBjTsnuTSx2f4ovgQB5BdrdVuUjiLxZQpM63guZCtKKDo69VpbFpWDdnO2VJHyfzVEj15IuHff0BmzY17 ProgressBar() {
      return this.ProgressBar;
   }

   public boolean BatModProgressBar() {
      return this.BatModProgressBar;
   }
}
