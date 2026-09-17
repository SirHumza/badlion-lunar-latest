public class EnkDXaMJNH7THn5zQDk8DSxBhrfD8gmpfaK1zx1OELKg15oWPWpn3YitdQJMSVBxTmqyhqjGIHKHzqmSo9kutVXGoJWfPhGHfqky
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   protected double BatModClient;
   protected double Button;
   protected double CustomSpinner;
   protected float ButtonAction;
   protected float Spinner;
   protected boolean Checkbox;
   protected boolean ProgressBar;
   protected boolean BatModProgressBar;

   public EnkDXaMJNH7THn5zQDk8DSxBhrfD8gmpfaK1zx1OELKg15oWPWpn3YitdQJMSVBxTmqyhqjGIHKHzqmSo9kutVXGoJWfPhGHfqky() {
   }

   public EnkDXaMJNH7THn5zQDk8DSxBhrfD8gmpfaK1zx1OELKg15oWPWpn3YitdQJMSVBxTmqyhqjGIHKHzqmSo9kutVXGoJWfPhGHfqky(boolean var1) {
      this.Checkbox = var1;
   }

   public void BatModClient(
      jd1UHCmzVHuD5ZneEIeTLT5Remfkv7gUaHdafrw3DCDp0i41GXNSGz8qOpX0zdN2dh03gpkqwmwA2uRLDZmHuYpWgk7EL6w0WsnO var1
   ) {
      var1.BatModClient(this);
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.Checkbox = var1.readUnsignedByte() != 0;
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.Checkbox ? 1 : 0);
   }

   public double BatModClient() {
      return this.BatModClient;
   }

   public double Button() {
      return this.Button;
   }

   public double CustomSpinner() {
      return this.CustomSpinner;
   }

   public float ButtonAction() {
      return this.ButtonAction;
   }

   public float Spinner() {
      return this.Spinner;
   }

   public boolean Checkbox() {
      return this.Checkbox;
   }

   public boolean ProgressBar() {
      return this.ProgressBar;
   }

   public boolean BatModProgressBar() {
      return this.BatModProgressBar;
   }

   public void BatModClient(boolean var1) {
      this.ProgressBar = var1;
   }
}
