import com.google.common.collect.Lists;
import java.util.List;

public class NTyCspZCNgfCDJi9YWxI6uTzILS0dJ28YL4Ag1S6WaAZ9laNdeT4Gt3tGKtePrxqNsFxykND0RMTp0Pl58g8FtIWSDAhLVPehUuU
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private double BatModClient;
   private double Button;
   private double CustomSpinner;
   private float ButtonAction;
   private List Spinner;
   private float Checkbox;
   private float ProgressBar;
   private float BatModProgressBar;

   public NTyCspZCNgfCDJi9YWxI6uTzILS0dJ28YL4Ag1S6WaAZ9laNdeT4Gt3tGKtePrxqNsFxykND0RMTp0Pl58g8FtIWSDAhLVPehUuU() {
   }

   public NTyCspZCNgfCDJi9YWxI6uTzILS0dJ28YL4Ag1S6WaAZ9laNdeT4Gt3tGKtePrxqNsFxykND0RMTp0Pl58g8FtIWSDAhLVPehUuU(
      double var1,
      double var3,
      double var5,
      float var7,
      List var8,
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var9
   ) {
      this.BatModClient = var1;
      this.Button = var3;
      this.CustomSpinner = var5;
      this.ButtonAction = var7;
      this.Spinner = Lists.newArrayList(var8);
      if (var9 != null) {
         this.Checkbox = (float)var9.BatModClient;
         this.ProgressBar = (float)var9.Button;
         this.BatModProgressBar = (float)var9.CustomSpinner;
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readFloat();
      this.Button = var1.readFloat();
      this.CustomSpinner = var1.readFloat();
      this.ButtonAction = var1.readFloat();
      int var2 = var1.readInt();
      this.Spinner = Lists.newArrayListWithCapacity(var2);
      int var3 = (int)this.BatModClient;
      int var4 = (int)this.Button;
      int var5 = (int)this.CustomSpinner;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1.readByte() + var3;
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         this.Spinner
            .add(new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var7, var8, var9));
      }

      this.Checkbox = var1.readFloat();
      this.ProgressBar = var1.readFloat();
      this.BatModProgressBar = var1.readFloat();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeFloat((float)this.BatModClient);
      var1.writeFloat((float)this.Button);
      var1.writeFloat((float)this.CustomSpinner);
      var1.writeFloat(this.ButtonAction);
      var1.writeInt(this.Spinner.size());
      int var2 = (int)this.BatModClient;
      int var3 = (int)this.Button;
      int var4 = (int)this.CustomSpinner;

      for (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var6 : this.Spinner) {
         int var7 = var6.BatModProgressBar() - var2;
         int var8 = var6.ColorChooser() - var3;
         int var9 = var6.IntegerSpinner() - var4;
         var1.writeByte(var7);
         var1.writeByte(var8);
         var1.writeByte(var9);
      }

      var1.writeFloat(this.Checkbox);
      var1.writeFloat(this.ProgressBar);
      var1.writeFloat(this.BatModProgressBar);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public float BatModClient() {
      return this.Checkbox;
   }

   public float Button() {
      return this.ProgressBar;
   }

   public float CustomSpinner() {
      return this.BatModProgressBar;
   }

   public double ButtonAction() {
      return this.BatModClient;
   }

   public double Spinner() {
      return this.Button;
   }

   public double Checkbox() {
      return this.CustomSpinner;
   }

   public float ProgressBar() {
      return this.ButtonAction;
   }

   public List BatModProgressBar() {
      return this.Spinner;
   }
}
