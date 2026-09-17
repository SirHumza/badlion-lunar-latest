public class ofInTcag4rlAjs1LMGdeJNlNHZAcu0O7X9qexN2GiLvGWFO7ja3U9X65yADZ1SQOfnBX74Ul4NFXfPZzPoAoLWBsO7qFBGeFuD3N
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private boolean BatModClient;
   private boolean Button;
   private boolean CustomSpinner;
   private boolean ButtonAction;
   private float Spinner;
   private float Checkbox;

   public ofInTcag4rlAjs1LMGdeJNlNHZAcu0O7X9qexN2GiLvGWFO7ja3U9X65yADZ1SQOfnBX74Ul4NFXfPZzPoAoLWBsO7qFBGeFuD3N() {
   }

   public ofInTcag4rlAjs1LMGdeJNlNHZAcu0O7X9qexN2GiLvGWFO7ja3U9X65yADZ1SQOfnBX74Ul4NFXfPZzPoAoLWBsO7qFBGeFuD3N(
      oZwwM95fsfc2dbcznQ4anQrneIHMgvPZkEqfnJuRxfoGp3fnnmDccijByy77ioJkcQh7yfsoWxikaf6y9IAryDixoGvTLTg7aUzV var1
   ) {
      this.BatModClient(
         var1.BatModClient
      );
      this.Button(
         var1.Button
      );
      this.CustomSpinner(
         var1.CustomSpinner
      );
      this.ButtonAction(
         var1.ButtonAction
      );
      this.BatModClient(
         var1.BatModClient()
      );
      this.Button(
         var1.Button()
      );
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      byte var2 = var1.readByte();
      this.BatModClient((var2 & 1) > 0);
      this.Button((var2 & 2) > 0);
      this.CustomSpinner((var2 & 4) > 0);
      this.ButtonAction((var2 & 8) > 0);
      this.BatModClient(var1.readFloat());
      this.Button(var1.readFloat());
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      byte var2 = 0;
      if (this.BatModClient()) {
         var2 = (byte)(var2 | 1);
      }

      if (this.Button()) {
         var2 = (byte)(var2 | 2);
      }

      if (this.CustomSpinner()) {
         var2 = (byte)(var2 | 4);
      }

      if (this.ButtonAction()) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeFloat(this.Spinner);
      var1.writeFloat(this.Checkbox);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public boolean BatModClient() {
      return this.BatModClient;
   }

   public void BatModClient(boolean var1) {
      this.BatModClient = var1;
   }

   public boolean Button() {
      return this.Button;
   }

   public void Button(boolean var1) {
      this.Button = var1;
   }

   public boolean CustomSpinner() {
      return this.CustomSpinner;
   }

   public void CustomSpinner(boolean var1) {
      this.CustomSpinner = var1;
   }

   public boolean ButtonAction() {
      return this.ButtonAction;
   }

   public void ButtonAction(boolean var1) {
      this.ButtonAction = var1;
   }

   public float Spinner() {
      return this.Spinner;
   }

   public void BatModClient(float var1) {
      this.Spinner = var1;
   }

   public float Checkbox() {
      return this.Checkbox;
   }

   public void Button(float var1) {
      this.Checkbox = var1;
   }
}
