public enum DQ9GO4TqPxdtuWA9WcyzggJzpcJ7CbklC1jaDulNJ3zzunxv3v4Vh8igSAIeJFhktc6kpHlZxJpvZ0Z99l6DLNc6onBoZUFgxV41 {
   BatModClient("POSITIVE", 0, 1, "Towards positive"),
   Button("NEGATIVE", 1, -1, "Towards negative");

   private final int CustomSpinner;
   private final String ButtonAction;
   private static final DQ9GO4TqPxdtuWA9WcyzggJzpcJ7CbklC1jaDulNJ3zzunxv3v4Vh8igSAIeJFhktc6kpHlZxJpvZ0Z99l6DLNc6onBoZUFgxV41[] Spinner = new DQ9GO4TqPxdtuWA9WcyzggJzpcJ7CbklC1jaDulNJ3zzunxv3v4Vh8igSAIeJFhktc6kpHlZxJpvZ0Z99l6DLNc6onBoZUFgxV41[]{
      BatModClient,
      Button
   };
   private static final String Checkbox = "CL_00002320";

   DQ9GO4TqPxdtuWA9WcyzggJzpcJ7CbklC1jaDulNJ3zzunxv3v4Vh8igSAIeJFhktc6kpHlZxJpvZ0Z99l6DLNc6onBoZUFgxV41(String var3, int var4, int var5, String var6) {
      this.CustomSpinner = var5;
      this.ButtonAction = var6;
   }

   public int BatModClient() {
      return this.CustomSpinner;
   }

   @Override
   public String toString() {
      return this.ButtonAction;
   }
}
