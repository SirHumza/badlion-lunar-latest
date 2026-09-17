public class wwX5RPkEXMt0nNfq6kL5YOtS9xqw4oIsKfpxaiUXqEp2JeYogd5QEZeJ8bFli6gTW8wzIN6ZrM3VAPJWLpHudV3Tiys0v55wLs1O
   extends r5Pkr4N01GFC1bw4odpDHJvXQbdnKwBn6VFnPq0zEZKUIsKTrbHqA91krE3vUsK4FvtUQxmzjgidSze0s9TNkyjawPS7teeKv3Cf {
   private final double BatModClient;
   private final double Button;
   private String CustomSpinner;

   public wwX5RPkEXMt0nNfq6kL5YOtS9xqw4oIsKfpxaiUXqEp2JeYogd5QEZeJ8bFli6gTW8wzIN6ZrM3VAPJWLpHudV3Tiys0v55wLs1O(
      sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD var1,
      String var2,
      double var3,
      double var5,
      double var7
   ) {
      super(var1, var2, var3);
      this.BatModClient = var5;
      this.Button = var7;
      if (var5 > var7) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      }

      if (var3 < var5) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      }

      if (var3 > var7) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   public wwX5RPkEXMt0nNfq6kL5YOtS9xqw4oIsKfpxaiUXqEp2JeYogd5QEZeJ8bFli6gTW8wzIN6ZrM3VAPJWLpHudV3Tiys0v55wLs1O BatModClient(
      String var1
   ) {
      this.CustomSpinner = var1;
      return this;
   }

   public String Spinner() {
      return this.CustomSpinner;
   }

   @Override
   public double BatModClient(double var1) {
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var1,
         this.BatModClient,
         this.Button
      );
   }
}
