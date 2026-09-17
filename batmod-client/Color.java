import java.awt.Color;

public class DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW {
   private Color BatModClient;
   private Color Button;
   private String CustomSpinner;
   private boolean ButtonAction;

   public static DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW BatModClient(
      String var0
   ) {
      String[] var1 = var0.split(",");

      try {
         return new DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(
               new Color(Integer.parseInt(var1[0]), Integer.parseInt(var1[1]), Integer.parseInt(var1[2]), Integer.parseInt(var1[3])),
               new Color(Integer.parseInt(var1[4]), Integer.parseInt(var1[5]), Integer.parseInt(var1[6]), Integer.parseInt(var1[7]))
            )
            .BatModClient(Boolean.parseBoolean(var1[8]));
      } catch (NumberFormatException var3) {
         return new DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW();
      }
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW() {
      this((String)null);
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(String var1) {
      this.BatModClient = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Button = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.CustomSpinner = var1;
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(Color var1) {
      this(var1, (String)null);
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(Color var1, Color var2) {
      this(var1, var2, null);
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(Color var1, String var2) {
      this(var1, var1, var2);
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(Color var1, Color var2, String var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   public Color BatModClient() {
      return this.ButtonAction
         ? BatModClient.BatModClient()
            .aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()
            .BatModClient(
               0.0F, this.BatModClient.getAlpha()
            )
         : this.BatModClient;
   }

   public void BatModClient(Color var1) {
      this.BatModClient = var1;
   }

   public Color Button() {
      return this.Button;
   }

   public void Button(Color var1) {
      this.Button = var1;
   }

   public String CustomSpinner() {
      return this.CustomSpinner;
   }

   public void Button(String var1) {
      this.CustomSpinner = var1;
   }

   public boolean ButtonAction() {
      return this.ButtonAction;
   }

   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW BatModClient(
      boolean var1
   ) {
      this.ButtonAction = var1;
      return this;
   }

   @Override
   public String toString() {
      return this.BatModClient.getRed()
         + ","
         + this.BatModClient.getGreen()
         + ","
         + this.BatModClient.getBlue()
         + ","
         + this.BatModClient.getAlpha()
         + ","
         + this.Button.getRed()
         + ","
         + this.Button.getGreen()
         + ","
         + this.Button.getBlue()
         + ","
         + this.Button.getAlpha()
         + ","
         + this.ButtonAction;
   }
}
