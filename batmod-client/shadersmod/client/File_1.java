package shadersmod.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl
   implements shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN {
   protected File BatModClient;

   public N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl(String var1, File var2) {
      this.BatModClient = var2;
   }

   @Override
   public void Button() {
   }

   @Override
   public InputStream BatModClient(String var1) {
      try {
         String var2 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.Button(
            var1, "/", "/"
         );
         File var3 = new File(this.BatModClient, var2);
         return !var3.exists() ? null : new BufferedInputStream(new FileInputStream(var3));
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public boolean Button(String var1) {
      File var2 = new File(this.BatModClient, var1.substring(1));
      return !var2.exists() ? false : var2.isDirectory();
   }

   @Override
   public String BatModClient() {
      return this.BatModClient.getName();
   }
}
