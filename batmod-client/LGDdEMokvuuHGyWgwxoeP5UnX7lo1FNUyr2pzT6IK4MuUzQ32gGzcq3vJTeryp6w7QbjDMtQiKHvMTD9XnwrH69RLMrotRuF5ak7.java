public class LGDdEMokvuuHGyWgwxoeP5UnX7lo1FNUyr2pzT6IK4MuUzQ32gGzcq3vJTeryp6w7QbjDMtQiKHvMTD9XnwrH69RLMrotRuF5ak7
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;
   private int CustomSpinner;
   private int ButtonAction;

   public LGDdEMokvuuHGyWgwxoeP5UnX7lo1FNUyr2pzT6IK4MuUzQ32gGzcq3vJTeryp6w7QbjDMtQiKHvMTD9XnwrH69RLMrotRuF5ak7() {
   }

   public LGDdEMokvuuHGyWgwxoeP5UnX7lo1FNUyr2pzT6IK4MuUzQ32gGzcq3vJTeryp6w7QbjDMtQiKHvMTD9XnwrH69RLMrotRuF5ak7(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      this(
         var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(),
         var1.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL,
         var1.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr,
         var1.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
      );
   }

   public LGDdEMokvuuHGyWgwxoeP5UnX7lo1FNUyr2pzT6IK4MuUzQ32gGzcq3vJTeryp6w7QbjDMtQiKHvMTD9XnwrH69RLMrotRuF5ak7(int var1, double var2, double var4, double var6) {
      this.BatModClient = var1;
      double var8 = 3.9;
      if (var2 < -var8) {
         var2 = -var8;
      }

      if (var4 < -var8) {
         var4 = -var8;
      }

      if (var6 < -var8) {
         var6 = -var8;
      }

      if (var2 > var8) {
         var2 = var8;
      }

      if (var4 > var8) {
         var4 = var8;
      }

      if (var6 > var8) {
         var6 = var8;
      }

      this.Button = (int)(var2 * 8000.0);
      this.CustomSpinner = (int)(var4 * 8000.0);
      this.ButtonAction = (int)(var6 * 8000.0);
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.ButtonAction();
      this.Button = var1.readShort();
      this.CustomSpinner = var1.readShort();
      this.ButtonAction = var1.readShort();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.Button(
         this.BatModClient
      );
      var1.writeShort(this.Button);
      var1.writeShort(this.CustomSpinner);
      var1.writeShort(this.ButtonAction);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.ButtonAction;
   }
}
