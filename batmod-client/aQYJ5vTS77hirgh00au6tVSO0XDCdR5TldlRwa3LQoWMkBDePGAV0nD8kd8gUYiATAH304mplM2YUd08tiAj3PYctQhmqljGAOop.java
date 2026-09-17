import org.apache.commons.lang3.Validate;

public class aQYJ5vTS77hirgh00au6tVSO0XDCdR5TldlRwa3LQoWMkBDePGAV0nD8kd8gUYiATAH304mplM2YUd08tiAj3PYctQhmqljGAOop
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private String BatModClient;
   private int Button;
   private int CustomSpinner = Integer.MAX_VALUE;
   private int ButtonAction;
   private float Spinner;
   private int Checkbox;

   public aQYJ5vTS77hirgh00au6tVSO0XDCdR5TldlRwa3LQoWMkBDePGAV0nD8kd8gUYiATAH304mplM2YUd08tiAj3PYctQhmqljGAOop() {
   }

   public aQYJ5vTS77hirgh00au6tVSO0XDCdR5TldlRwa3LQoWMkBDePGAV0nD8kd8gUYiATAH304mplM2YUd08tiAj3PYctQhmqljGAOop(
      String var1, double var2, double var4, double var6, float var8, float var9
   ) {
      Validate.notNull(var1, "name", new Object[0]);
      this.BatModClient = var1;
      this.Button = (int)(var2 * 8.0);
      this.CustomSpinner = (int)(var4 * 8.0);
      this.ButtonAction = (int)(var6 * 8.0);
      this.Spinner = var8;
      this.Checkbox = (int)(var9 * 63.0F);
      var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var9, 0.0F, 255.0F
      );
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.CustomSpinner(
         256
      );
      this.Button = var1.readInt();
      this.CustomSpinner = var1.readInt();
      this.ButtonAction = var1.readInt();
      this.Spinner = var1.readFloat();
      this.Checkbox = var1.readUnsignedByte();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.BatModClient(
         this.BatModClient
      );
      var1.writeInt(this.Button);
      var1.writeInt(this.CustomSpinner);
      var1.writeInt(this.ButtonAction);
      var1.writeFloat(this.Spinner);
      var1.writeByte(this.Checkbox);
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public double Button() {
      return this.Button / 8.0F;
   }

   public double CustomSpinner() {
      return this.CustomSpinner / 8.0F;
   }

   public double ButtonAction() {
      return this.ButtonAction / 8.0F;
   }

   public float Spinner() {
      return this.Spinner;
   }

   public float Checkbox() {
      return this.Checkbox / 63.0F;
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }
}
