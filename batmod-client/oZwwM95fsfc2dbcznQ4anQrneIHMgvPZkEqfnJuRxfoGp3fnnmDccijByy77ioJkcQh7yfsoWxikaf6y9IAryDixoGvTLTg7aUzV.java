public class oZwwM95fsfc2dbcznQ4anQrneIHMgvPZkEqfnJuRxfoGp3fnnmDccijByy77ioJkcQh7yfsoWxikaf6y9IAryDixoGvTLTg7aUzV {
   public boolean BatModClient;
   public boolean Button;
   public boolean CustomSpinner;
   public boolean ButtonAction;
   public boolean Spinner = true;
   private float Checkbox = 0.05F;
   private float ProgressBar = 0.1F;

   public void BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
      var2.BatModClient(
         "invulnerable", this.BatModClient
      );
      var2.BatModClient(
         "flying", this.Button
      );
      var2.BatModClient(
         "mayfly", this.CustomSpinner
      );
      var2.BatModClient(
         "instabuild", this.ButtonAction
      );
      var2.BatModClient(
         "mayBuild", this.Spinner
      );
      var2.BatModClient(
         "flySpeed", this.Checkbox
      );
      var2.BatModClient(
         "walkSpeed", this.ProgressBar
      );
      var1.BatModClient("abilities", var2);
   }

   public void Button(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      if (var1.Button("abilities", 10)) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = var1.BatModInstallerMain(
            "abilities"
         );
         this.BatModClient = var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
            "invulnerable"
         );
         this.Button = var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
            "flying"
         );
         this.CustomSpinner = var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
            "mayfly"
         );
         this.ButtonAction = var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
            "instabuild"
         );
         if (var2.Button("flySpeed", 99)) {
            this.Checkbox = var2.BatModProgressBar(
               "flySpeed"
            );
            this.ProgressBar = var2.BatModProgressBar(
               "walkSpeed"
            );
         }

         if (var2.Button("mayBuild", 1)) {
            this.Spinner = var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
               "mayBuild"
            );
         }
      }
   }

   public float BatModClient() {
      return this.Checkbox;
   }

   public void BatModClient(float var1) {
      this.Checkbox = var1;
   }

   public float Button() {
      return this.ProgressBar;
   }

   public void Button(float var1) {
      this.ProgressBar = var1;
   }
}
