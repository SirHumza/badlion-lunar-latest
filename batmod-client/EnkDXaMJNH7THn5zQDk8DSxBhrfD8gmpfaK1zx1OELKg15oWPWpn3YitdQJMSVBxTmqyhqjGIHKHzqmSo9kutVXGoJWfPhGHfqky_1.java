public class lfuVf9ivYoX6jns6oAWg261RoLODj0sHsRCH8GpDyPaR6t2f9SMNt6gAeSpQDHi4obVwTThyoFvUTj5cqrfCEnifjBw757sXk8aP
   extends EnkDXaMJNH7THn5zQDk8DSxBhrfD8gmpfaK1zx1OELKg15oWPWpn3YitdQJMSVBxTmqyhqjGIHKHzqmSo9kutVXGoJWfPhGHfqky {
   public lfuVf9ivYoX6jns6oAWg261RoLODj0sHsRCH8GpDyPaR6t2f9SMNt6gAeSpQDHi4obVwTThyoFvUTj5cqrfCEnifjBw757sXk8aP() {
      this.BatModProgressBar = true;
   }

   public lfuVf9ivYoX6jns6oAWg261RoLODj0sHsRCH8GpDyPaR6t2f9SMNt6gAeSpQDHi4obVwTThyoFvUTj5cqrfCEnifjBw757sXk8aP(float var1, float var2, boolean var3) {
      this.ButtonAction = var1;
      this.Spinner = var2;
      this.Checkbox = var3;
      this.BatModProgressBar = true;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.ButtonAction = var1.readFloat();
      this.Spinner = var1.readFloat();
      super.BatModClient(var1);
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeFloat(this.ButtonAction);
      var1.writeFloat(this.Spinner);
      super.Button(var1);
   }
}
