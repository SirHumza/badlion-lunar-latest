public class gu27iteMyB2lW2nyt5m5oRZ1Iy2wIYJIBfrcAvBAFLKqXq3QStJDMpBpDKIPtVxxL6O8UaInLKoJ08p6hWzepu55JI9qGEaYgs77
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Button;
   private int CustomSpinner;
   private boolean ButtonAction;

   public gu27iteMyB2lW2nyt5m5oRZ1Iy2wIYJIBfrcAvBAFLKqXq3QStJDMpBpDKIPtVxxL6O8UaInLKoJ08p6hWzepu55JI9qGEaYgs77() {
   }

   public gu27iteMyB2lW2nyt5m5oRZ1Iy2wIYJIBfrcAvBAFLKqXq3QStJDMpBpDKIPtVxxL6O8UaInLKoJ08p6hWzepu55JI9qGEaYgs77(
      int var1, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2, int var3, boolean var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readInt();
      this.Button = var1.Button();
      this.CustomSpinner = var1.readInt();
      this.ButtonAction = var1.readBoolean();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeInt(this.BatModClient);
      var1.BatModClient(
         this.Button
      );
      var1.writeInt(this.CustomSpinner);
      var1.writeBoolean(this.ButtonAction);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public boolean BatModClient() {
      return this.ButtonAction;
   }

   public int Button() {
      return this.BatModClient;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW ButtonAction() {
      return this.Button;
   }
}
