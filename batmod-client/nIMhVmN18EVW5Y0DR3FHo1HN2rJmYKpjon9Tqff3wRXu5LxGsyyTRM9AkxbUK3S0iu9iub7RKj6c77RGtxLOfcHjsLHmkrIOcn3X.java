import java.util.Random;

public class nIMhVmN18EVW5Y0DR3FHo1HN2rJmYKpjon9Tqff3wRXu5LxGsyyTRM9AkxbUK3S0iu9iub7RKj6c77RGtxLOfcHjsLHmkrIOcn3X
   extends gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE {
   private final k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient;
   private float Button;
   private boolean ButtonAction;

   public nIMhVmN18EVW5Y0DR3FHo1HN2rJmYKpjon9Tqff3wRXu5LxGsyyTRM9AkxbUK3S0iu9iub7RKj6c77RGtxLOfcHjsLHmkrIOcn3X(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1, int var2
   ) {
      super(var2);
      this.BatModClient = var1;
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient(
      Random var1
   ) {
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2 = this.BatModClient
         .IntegerSpinner();
      if (this.Button > 0.0F) {
         int var3 = (int)(
            this.Button
               * this.BatModClient
                  .ColorChooser()
         );
         int var4 = var2.ColorChooser()
            - var1.nextInt(var1.nextInt(var3) + 1);
         if (var4 > var3) {
            var4 = var3;
         }

         if (var4 < 1) {
            var4 = 1;
         }

         var2.Button(var4);
      }

      if (this.ButtonAction) {
         s34IlAUzdXH6Y6rwOju8zK4mlDAaea8khD0Euhzp6Xjxa81UoAzPnNFtYytUYDHMeTbC57TPfoQ6Mlwlio6v9IWKd5DwRzZD6mtP.BatModClient(
            var1, var2, 30
         );
      }

      return var2;
   }

   public nIMhVmN18EVW5Y0DR3FHo1HN2rJmYKpjon9Tqff3wRXu5LxGsyyTRM9AkxbUK3S0iu9iub7RKj6c77RGtxLOfcHjsLHmkrIOcn3X BatModClient(
      float var1
   ) {
      this.Button = var1;
      return this;
   }

   public nIMhVmN18EVW5Y0DR3FHo1HN2rJmYKpjon9Tqff3wRXu5LxGsyyTRM9AkxbUK3S0iu9iub7RKj6c77RGtxLOfcHjsLHmkrIOcn3X BatModClient() {
      this.ButtonAction = true;
      return this;
   }
}
