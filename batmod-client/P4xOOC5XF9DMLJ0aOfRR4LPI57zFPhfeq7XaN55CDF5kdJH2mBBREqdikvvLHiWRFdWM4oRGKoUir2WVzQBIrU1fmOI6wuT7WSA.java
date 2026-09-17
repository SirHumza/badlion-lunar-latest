class P4xOOC5XF9DMLJ0aOfRR4LPI57zFPhfeq7XaN55CDF5kdJH2mBBREqdikvvLHiWRFdWM4oRGKoUir2WVzQBIrU1fmOI6wuT7WSA {
   int BatModClient;
   P4xOOC5XF9DMLJ0aOfRR4LPI57zFPhfeq7XaN55CDF5kdJH2mBBREqdikvvLHiWRFdWM4oRGKoUir2WVzQBIrU1fmOI6wuT7WSA[] Button = new P4xOOC5XF9DMLJ0aOfRR4LPI57zFPhfeq7XaN55CDF5kdJH2mBBREqdikvvLHiWRFdWM4oRGKoUir2WVzQBIrU1fmOI6wuT7WSA[6];
   boolean[] CustomSpinner = new boolean[6];
   boolean ButtonAction;
   boolean Spinner;
   int Checkbox;

   public P4xOOC5XF9DMLJ0aOfRR4LPI57zFPhfeq7XaN55CDF5kdJH2mBBREqdikvvLHiWRFdWM4oRGKoUir2WVzQBIrU1fmOI6wuT7WSA(int var1) {
      this.BatModClient = var1;
   }

   public void BatModClient(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1,
      P4xOOC5XF9DMLJ0aOfRR4LPI57zFPhfeq7XaN55CDF5kdJH2mBBREqdikvvLHiWRFdWM4oRGKoUir2WVzQBIrU1fmOI6wuT7WSA var2
   ) {
      this.Button[var1.Button()] = var2;
      var2.Button[var1.Spinner()
         .Button()] = this;
   }

   public void BatModClient() {
      for (int var1 = 0; var1 < 6; var1++) {
         this.CustomSpinner[var1] = this.Button[var1]
            != null;
      }
   }

   public boolean BatModClient(int var1) {
      if (this.Spinner) {
         return true;
      }

      this.Checkbox = var1;

      for (int var2 = 0; var2 < 6; var2++) {
         if (this.Button[var2] != null
            && this.CustomSpinner[var2]
            && this.Button[var2].Checkbox
               != var1
            && this.Button[var2]
               .BatModClient(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean Button() {
      return this.BatModClient >= 75;
   }

   public int CustomSpinner() {
      int var1 = 0;

      for (int var2 = 0; var2 < 6; var2++) {
         if (this.CustomSpinner[var2]) {
            var1++;
         }
      }

      return var1;
   }
}
