public class ufUkNvXxPYHboFIRmj8v02j2jBXcs5iDVIf0FTLmVf2MdCOyYiu8HENrDhf7oMr4M7BUj6R37hUz9GYDygElS2ydDmlsIzNehir8 {
   private final double BatModClient;
   private final double Button;
   private int CustomSpinner;
   private int ButtonAction;
   private int Spinner;

   public ufUkNvXxPYHboFIRmj8v02j2jBXcs5iDVIf0FTLmVf2MdCOyYiu8HENrDhf7oMr4M7BUj6R37hUz9GYDygElS2ydDmlsIzNehir8(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1
   ) {
      this.CustomSpinner = var1.ButtonAction;
      this.ButtonAction = var1.Spinner;
      this.Spinner = 1;
      boolean var2 = var1.ButtonAction();
      int var3 = var1.InstallationLogger.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g;
      if (var3 == 0) {
         var3 = 1000;
      }

      while (
         this.Spinner < var3
            && this.CustomSpinner
                  / (this.Spinner + 1)
               >= 320
            && this.ButtonAction
                  / (this.Spinner + 1)
               >= 240
      ) {
         this.Spinner++;
      }

      if (var2
         && this.Spinner % 2 != 0
         && this.Spinner != 1) {
         this.Spinner--;
      }

      this.BatModClient = (double)this.CustomSpinner
         / this.Spinner;
      this.Button = (double)this.ButtonAction
         / this.Spinner;
      this.CustomSpinner = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Checkbox(
         this.BatModClient
      );
      this.ButtonAction = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Checkbox(
         this.Button
      );
   }

   public int BatModClient() {
      return this.CustomSpinner;
   }

   public int Button() {
      return this.ButtonAction;
   }

   public double CustomSpinner() {
      return this.BatModClient;
   }

   public double ButtonAction() {
      return this.Button;
   }

   public int Spinner() {
      return this.Spinner;
   }
}
