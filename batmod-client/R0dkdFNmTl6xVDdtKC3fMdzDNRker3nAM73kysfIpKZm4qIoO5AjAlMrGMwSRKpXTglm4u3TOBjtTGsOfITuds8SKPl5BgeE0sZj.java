public class R0dkdFNmTl6xVDdtKC3fMdzDNRker3nAM73kysfIpKZm4qIoO5AjAlMrGMwSRKpXTglm4u3TOBjtTGsOfITuds8SKPl5BgeE0sZj
   extends gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE {
   private final YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Button;
   private final String ButtonAction;

   public R0dkdFNmTl6xVDdtKC3fMdzDNRker3nAM73kysfIpKZm4qIoO5AjAlMrGMwSRKpXTglm4u3TOBjtTGsOfITuds8SKPl5BgeE0sZj(
      xXhHplV8nG1ANXuA6vGWW7HZfU7OU8DReBs2RaWaENEDBI9IxC6zIVMx9tjeYlEC9VaDUDMyL0TpYEY4j9NOxGptK34zMQhfCR8 var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2
   ) {
      this(
         var1,
         var2.BatModInstallerMain("Properties"),
         var2.IntegerSpinner("Type"),
         var2.Checkbox("Weight")
      );
   }

   public R0dkdFNmTl6xVDdtKC3fMdzDNRker3nAM73kysfIpKZm4qIoO5AjAlMrGMwSRKpXTglm4u3TOBjtTGsOfITuds8SKPl5BgeE0sZj(
      xXhHplV8nG1ANXuA6vGWW7HZfU7OU8DReBs2RaWaENEDBI9IxC6zIVMx9tjeYlEC9VaDUDMyL0TpYEY4j9NOxGptK34zMQhfCR8 var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2,
      String var3
   ) {
      this(var1, var2, var3, 1);
   }

   private R0dkdFNmTl6xVDdtKC3fMdzDNRker3nAM73kysfIpKZm4qIoO5AjAlMrGMwSRKpXTglm4u3TOBjtTGsOfITuds8SKPl5BgeE0sZj(
      xXhHplV8nG1ANXuA6vGWW7HZfU7OU8DReBs2RaWaENEDBI9IxC6zIVMx9tjeYlEC9VaDUDMyL0TpYEY4j9NOxGptK34zMQhfCR8 var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2,
      String var3,
      int var4
   ) {
      super(var4);
      this.BatModClient = var1;
      if (var3.equals("Minecart")) {
         if (var2 != null) {
            var3 = g0OId8nPjmFgi35NK335RfQahYozSk9smYTavCqCFG56HCCdPnB74Xv8DnAwxAmJm6pVPUQUcZ8ye9OlAASfuxuuBKQWFqaxeKAb.BatModClient(
                  var2.Checkbox("Type")
               )
               .Button();
         } else {
            var3 = "MinecartRideable";
         }
      }

      this.Button = var2;
      this.ButtonAction = var3;
   }

   public YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm BatModClient() {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
      var1.BatModClient(
         "Properties", this.Button
      );
      var1.BatModClient(
         "Type", this.ButtonAction
      );
      var1.BatModClient(
         "Weight", this.CustomSpinner
      );
      return var1;
   }
}
