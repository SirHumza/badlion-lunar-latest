public class sMkOJrrg3LS418Vm9nl0gtniAYuzN34UaUTd7WVsw6wzJJfBgo463sMQtyibHKBJ9vq7uWU2ODlGMWvWkUwpbk3mOL8KFzZL4fc7
   implements pVpDIJy3OIRtoZU1zWfJGTvvunwPi54ypdjA5S3wE64GHNFy1uOUsIZiFeyXmtT26mOoPrwIObSLs8IryodA5cSVwDzq2mzEFjC7 {
   private final int BatModClient;
   private final int Button;
   private final k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] CustomSpinner;
   private final k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 ButtonAction;
   private boolean Spinner;

   public sMkOJrrg3LS418Vm9nl0gtniAYuzN34UaUTd7WVsw6wzJJfBgo463sMQtyibHKBJ9vq7uWU2ODlGMWvWkUwpbk3mOL8KFzZL4fc7(
      int var1,
      int var2,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] var3,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Button() {
      return this.ButtonAction;
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] Button(
      lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i var1
   ) {
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] var2 = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[var1.ColorChooser()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = var1.ColorTextPane(
            var3
         );
         if (var4 != null
            && var4.BatModClient()
               .TextField()) {
            var2[var3] = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65(
               var4.BatModClient()
                  .IntegerSpinner()
            );
         }
      }

      return var2;
   }

   @Override
   public boolean BatModClient(
      lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2
   ) {
      for (int var3 = 0; var3 <= 3 - this.BatModClient; var3++) {
         for (int var4 = 0; var4 <= 3 - this.Button; var4++) {
            if (this.BatModClient(var1, var3, var4, true)) {
               return true;
            }

            if (this.BatModClient(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean BatModClient(
      lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i var1, int var2, int var3, boolean var4
   ) {
      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 3; var6++) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var9 = null;
            if (var7 >= 0
               && var8 >= 0
               && var7 < this.BatModClient
               && var8 < this.Button) {
               if (var4) {
                  var9 = this.CustomSpinner[this.BatModClient
                     - var7
                     - 1
                     + var8 * this.BatModClient];
               } else {
                  var9 = this.CustomSpinner[var7
                     + var8 * this.BatModClient];
               }
            }

            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var10 = var1.CustomSpinner(
               var5, var6
            );
            if (var10 != null || var9 != null) {
               if (var10 == null && var9 != null || var10 != null && var9 == null) {
                  return false;
               }

               if (var9.BatModClient()
                  != var10.BatModClient()) {
                  return false;
               }

               if (var9.BatModProgressBar() != 32767
                  && var9.BatModProgressBar()
                     != var10.BatModProgressBar()) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient(
      lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i var1
   ) {
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2 = this.Button()
         .IntegerSpinner();
      if (this.Spinner) {
         for (int var3 = 0; var3 < var1.ColorChooser(); var3++) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = var1.ColorTextPane(
               var3
            );
            if (var4 != null && var4.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()) {
               var2.ButtonAction(
                  (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)var4.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()
                     .Button()
               );
            }
         }
      }

      return var2;
   }

   @Override
   public int BatModClient() {
      return this.BatModClient
         * this.Button;
   }
}
