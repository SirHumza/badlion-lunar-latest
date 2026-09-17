import java.io.IOException;

public class ZcbhnCZyLiiA9zHh5dRks0Gn6rwrmP0AY6nZq25RGcUvT29Ua4Lx2ikKYCDRd6omNJlMrAr3YkeUsYfXWH7fhZWfEZKabwMKWOu9
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private String BatModClient;
   private LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx Button;

   public ZcbhnCZyLiiA9zHh5dRks0Gn6rwrmP0AY6nZq25RGcUvT29Ua4Lx2ikKYCDRd6omNJlMrAr3YkeUsYfXWH7fhZWfEZKabwMKWOu9() {
   }

   public ZcbhnCZyLiiA9zHh5dRks0Gn6rwrmP0AY6nZq25RGcUvT29Ua4Lx2ikKYCDRd6omNJlMrAr3YkeUsYfXWH7fhZWfEZKabwMKWOu9(
      String var1, LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      if (var2.writerIndex() > 32767) {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.CustomSpinner(
         20
      );
      int var2 = var1.readableBytes();
      if (var2 >= 0 && var2 <= 32767) {
         this.Button = new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(
            var1.readBytes(var2)
         );
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.BatModClient(
         this.BatModClient
      );
      var1.writeBytes(this.Button);
   }

   public void BatModClient(
      jd1UHCmzVHuD5ZneEIeTLT5Remfkv7gUaHdafrw3DCDp0i41GXNSGz8qOpX0zdN2dh03gpkqwmwA2uRLDZmHuYpWgk7EL6w0WsnO var1
   ) {
      var1.BatModClient(this);
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx Button() {
      return this.Button;
   }
}
