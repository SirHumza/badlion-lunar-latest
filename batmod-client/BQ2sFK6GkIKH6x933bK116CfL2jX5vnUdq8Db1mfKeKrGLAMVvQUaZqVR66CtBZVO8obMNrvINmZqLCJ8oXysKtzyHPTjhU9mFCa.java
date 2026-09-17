class BQ2sFK6GkIKH6x933bK116CfL2jX5vnUdq8Db1mfKeKrGLAMVvQUaZqVR66CtBZVO8obMNrvINmZqLCJ8oXysKtzyHPTjhU9mFCa {
   private final YAqw0XSG6lzJzR5XVUmJ6KZNHbGoUDLKanDb14Kp6UYYTGBg528SyaY4mA4qAK9CHBrOmCtDKp7Lf5NyKWPGfm6dq8nP5ruuxI91 BatModClient;
   private int Button;
   private int CustomSpinner;
   private final int ButtonAction;

   public BQ2sFK6GkIKH6x933bK116CfL2jX5vnUdq8Db1mfKeKrGLAMVvQUaZqVR66CtBZVO8obMNrvINmZqLCJ8oXysKtzyHPTjhU9mFCa(
      YAqw0XSG6lzJzR5XVUmJ6KZNHbGoUDLKanDb14Kp6UYYTGBg528SyaY4mA4qAK9CHBrOmCtDKp7Lf5NyKWPGfm6dq8nP5ruuxI91 var1, int var2, int var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
   }

   public void BatModClient(int var1) {
      if (var1 < this.Button) {
         this.Button = var1;
      } else if (var1 > this.CustomSpinner) {
         this.CustomSpinner = var1;
      }
   }

   public YAqw0XSG6lzJzR5XVUmJ6KZNHbGoUDLKanDb14Kp6UYYTGBg528SyaY4mA4qAK9CHBrOmCtDKp7Lf5NyKWPGfm6dq8nP5ruuxI91 BatModClient() {
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
