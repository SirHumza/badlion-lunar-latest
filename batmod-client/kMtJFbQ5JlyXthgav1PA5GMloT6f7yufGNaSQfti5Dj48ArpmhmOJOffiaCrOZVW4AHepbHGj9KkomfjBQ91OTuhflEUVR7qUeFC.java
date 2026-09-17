public class kMtJFbQ5JlyXthgav1PA5GMloT6f7yufGNaSQfti5Dj48ArpmhmOJOffiaCrOZVW4AHepbHGj9KkomfjBQ91OTuhflEUVR7qUeFC
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private byte Button;
   private byte CustomSpinner;
   private int ButtonAction;
   private byte Spinner;

   public kMtJFbQ5JlyXthgav1PA5GMloT6f7yufGNaSQfti5Dj48ArpmhmOJOffiaCrOZVW4AHepbHGj9KkomfjBQ91OTuhflEUVR7qUeFC() {
   }

   public kMtJFbQ5JlyXthgav1PA5GMloT6f7yufGNaSQfti5Dj48ArpmhmOJOffiaCrOZVW4AHepbHGj9KkomfjBQ91OTuhflEUVR7qUeFC(
      int var1, Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var2
   ) {
      this.BatModClient = var1;
      this.Button = (byte)(
         var2.BatModClient() & 0xFF
      );
      this.CustomSpinner = (byte)(
         var2.CustomSpinner() & 0xFF
      );
      if (var2.Button() > 32767) {
         this.ButtonAction = 32767;
      } else {
         this.ButtonAction = var2.Button();
      }

      this.Spinner = (byte)(
         var2.Spinner() ? 1 : 0
      );
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.ButtonAction();
      this.Button = var1.readByte();
      this.CustomSpinner = var1.readByte();
      this.ButtonAction = var1.ButtonAction();
      this.Spinner = var1.readByte();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.Button(
         this.BatModClient
      );
      var1.writeByte(this.Button);
      var1.writeByte(this.CustomSpinner);
      var1.Button(
         this.ButtonAction
      );
      var1.writeByte(this.Spinner);
   }

   public boolean BatModClient() {
      return this.ButtonAction == 32767;
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int Button() {
      return this.BatModClient;
   }

   public byte CustomSpinner() {
      return this.Button;
   }

   public byte ButtonAction() {
      return this.CustomSpinner;
   }

   public int Spinner() {
      return this.ButtonAction;
   }

   public boolean Checkbox() {
      return this.Spinner != 0;
   }
}
