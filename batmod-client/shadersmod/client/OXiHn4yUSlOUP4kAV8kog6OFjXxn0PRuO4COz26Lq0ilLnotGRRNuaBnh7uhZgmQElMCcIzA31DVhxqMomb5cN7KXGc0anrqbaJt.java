package shadersmod.client;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
   implements shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN {
   protected File BatModClient;
   protected ZipFile Button;

   public OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(String var1, File var2) {
      this.BatModClient = var2;
      this.Button = null;
   }

   @Override
   public void Button() {
      if (this.Button != null) {
         try {
            this.Button.close();
         } catch (Exception var2) {
         }

         this.Button = null;
      }
   }

   @Override
   public InputStream BatModClient(String var1) {
      try {
         if (this.Button == null) {
            this.Button = new ZipFile(
               this.BatModClient
            );
         }

         String var2 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
            var1, "/"
         );
         ZipEntry var3 = this.Button.getEntry(var2);
         return var3 == null
            ? null
            : this.Button.getInputStream(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   @Override
   public boolean Button(String var1) {
      try {
         if (this.Button == null) {
            this.Button = new ZipFile(
               this.BatModClient
            );
         }

         String var2 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
            var1, "/"
         );
         ZipEntry var3 = this.Button.getEntry(var2);
         return var3 != null;
      } catch (IOException var4) {
         return false;
      }
   }

   @Override
   public String BatModClient() {
      return this.BatModClient.getName();
   }
}
