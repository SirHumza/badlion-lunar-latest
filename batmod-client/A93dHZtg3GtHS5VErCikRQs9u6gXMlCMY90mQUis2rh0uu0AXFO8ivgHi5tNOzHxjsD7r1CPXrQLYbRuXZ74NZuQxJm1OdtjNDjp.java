class A93dHZtg3GtHS5VErCikRQs9u6gXMlCMY90mQUis2rh0uu0AXFO8ivgHi5tNOzHxjsD7r1CPXrQLYbRuXZ74NZuQxJm1OdtjNDjp {
   private final String BatModClient;
   private final String Button;

   public A93dHZtg3GtHS5VErCikRQs9u6gXMlCMY90mQUis2rh0uu0AXFO8ivgHi5tNOzHxjsD7r1CPXrQLYbRuXZ74NZuQxJm1OdtjNDjp(String var1, Object var2) {
      this.BatModClient = var1;
      if (var2 == null) {
         this.Button = "~~NULL~~";
      } else if (var2 instanceof Throwable) {
         Throwable var3 = (Throwable)var2;
         this.Button = "~~ERROR~~ "
            + var3.getClass().getSimpleName()
            + ": "
            + var3.getMessage();
      } else {
         this.Button = var2.toString();
      }
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public String Button() {
      return this.Button;
   }
}
