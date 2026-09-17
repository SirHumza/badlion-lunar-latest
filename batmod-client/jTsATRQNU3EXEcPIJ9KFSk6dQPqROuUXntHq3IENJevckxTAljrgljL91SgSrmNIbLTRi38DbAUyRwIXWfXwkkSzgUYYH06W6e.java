import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class jTsATRQNU3EXEcPIJ9KFSk6dQPqROuUXntHq3IENJevckxTAljrgljL91SgSrmNIbLTRi38DbAUyRwIXWfXwkkSzgUYYH06W6e
   implements pVpDIJy3OIRtoZU1zWfJGTvvunwPi54ypdjA5S3wE64GHNFy1uOUsIZiFeyXmtT26mOoPrwIObSLs8IryodA5cSVwDzq2mzEFjC7 {
   private final k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient;
   private final List Button;

   public jTsATRQNU3EXEcPIJ9KFSk6dQPqROuUXntHq3IENJevckxTAljrgljL91SgSrmNIbLTRi38DbAUyRwIXWfXwkkSzgUYYH06W6e(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1, List var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Button() {
      return this.BatModClient;
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
      ArrayList var3 = Lists.newArrayList(this.Button);

      for (int var4 = 0; var4 < var1.ButtonAction(); var4++) {
         for (int var5 = 0; var5 < var1.Checkbox(); var5++) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var6 = var1.CustomSpinner(
               var5, var4
            );
            if (var6 != null) {
               boolean var7 = false;

               for (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var9 : var3) {
                  if (var6.BatModClient()
                        == var9.BatModClient()
                     && (
                        var9.BatModProgressBar() == 32767
                           || var6.BatModProgressBar()
                              == var9.BatModProgressBar()
                     )) {
                     var7 = true;
                     var3.remove(var9);
                     break;
                  }
               }

               if (!var7) {
                  return false;
               }
            }
         }
      }

      return var3.isEmpty();
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModClient(
      lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i var1
   ) {
      return this.BatModClient
         .IntegerSpinner();
   }

   @Override
   public int BatModClient() {
      return this.Button.size();
   }
}
