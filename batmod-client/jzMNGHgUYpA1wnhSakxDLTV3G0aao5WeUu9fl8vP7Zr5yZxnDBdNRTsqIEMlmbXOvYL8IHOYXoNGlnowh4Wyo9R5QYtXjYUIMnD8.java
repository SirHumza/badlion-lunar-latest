class jzMNGHgUYpA1wnhSakxDLTV3G0aao5WeUu9fl8vP7Zr5yZxnDBdNRTsqIEMlmbXOvYL8IHOYXoNGlnowh4Wyo9R5QYtXjYUIMnD8 {
   public Class BatModClient;
   public final int Button;
   public int CustomSpinner;
   public int ButtonAction;

   public jzMNGHgUYpA1wnhSakxDLTV3G0aao5WeUu9fl8vP7Zr5yZxnDBdNRTsqIEMlmbXOvYL8IHOYXoNGlnowh4Wyo9R5QYtXjYUIMnD8(Class var1, int var2, int var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.ButtonAction = var3;
   }

   public boolean BatModClient(int var1) {
      return this.ButtonAction == 0
         || this.CustomSpinner
            < this.ButtonAction;
   }

   public boolean BatModClient() {
      return this.ButtonAction == 0
         || this.CustomSpinner
            < this.ButtonAction;
   }
}
