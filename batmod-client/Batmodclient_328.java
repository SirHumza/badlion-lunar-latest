class WY4QfNYgfX3R9Z8zFQM5OgPDUF3jFi3JumRJSLFBxiZWmyN0u6U3g6y97nHuFp3Uxo3nYBNJyzTLd42knM3f2WZd3xfCtiWwOahX {
   private String BatModClient;
   private boolean Button;
   private int CustomSpinner;
   private double ButtonAction;
   private final vz7UMVco7nWylDcNfYuYizZbQlbgvlZYV5TfMX56UtzIrOM7xuCQJdzgpdQjBLTcNpSWajiGREh6GpXVkNuwfnzXCYJE7VND8RB4 Spinner;
   private static final String Checkbox = "CL_00000137";

   public WY4QfNYgfX3R9Z8zFQM5OgPDUF3jFi3JumRJSLFBxiZWmyN0u6U3g6y97nHuFp3Uxo3nYBNJyzTLd42knM3f2WZd3xfCtiWwOahX(
      String var1, vz7UMVco7nWylDcNfYuYizZbQlbgvlZYV5TfMX56UtzIrOM7xuCQJdzgpdQjBLTcNpSWajiGREh6GpXVkNuwfnzXCYJE7VND8RB4 var2
   ) {
      this.Spinner = var2;
      this.BatModClient(var1);
   }

   public void BatModClient(String var1) {
      this.BatModClient = var1;
      if (var1 != null) {
         if (var1.equals("false")) {
            this.Button = false;
            return;
         }

         if (var1.equals("true")) {
            this.Button = true;
            return;
         }
      }

      this.Button = Boolean.parseBoolean(var1);
      this.CustomSpinner = this.Button
         ? 1
         : 0;

      try {
         this.CustomSpinner = Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
      }

      try {
         this.ButtonAction = Double.parseDouble(var1);
      } catch (NumberFormatException var3) {
      }
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public vz7UMVco7nWylDcNfYuYizZbQlbgvlZYV5TfMX56UtzIrOM7xuCQJdzgpdQjBLTcNpSWajiGREh6GpXVkNuwfnzXCYJE7VND8RB4 ButtonAction() {
      return this.Spinner;
   }
}
