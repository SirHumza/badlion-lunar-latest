import java.io.IOException;

public class wzHSiLlwxwPmIS7PvcF39PGD5dZWnIczHQE1bTYq9BWy1z1DLxdTDoEnBwWSumYGReZjzK0Z2rJzkYPrrTR2d4f7NjRK7ZRSLmQZ
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private String BatModClient;
   private LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx Button;

   public wzHSiLlwxwPmIS7PvcF39PGD5dZWnIczHQE1bTYq9BWy1z1DLxdTDoEnBwWSumYGReZjzK0Z2rJzkYPrrTR2d4f7NjRK7ZRSLmQZ() {
   }

   public wzHSiLlwxwPmIS7PvcF39PGD5dZWnIczHQE1bTYq9BWy1z1DLxdTDoEnBwWSumYGReZjzK0Z2rJzkYPrrTR2d4f7NjRK7ZRSLmQZ(
      String var1, LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      if (var2.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
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
      if (var2 >= 0 && var2 <= 1048576) {
         this.Button = new LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx(
            var1.readBytes(var2)
         );
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
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
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
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
