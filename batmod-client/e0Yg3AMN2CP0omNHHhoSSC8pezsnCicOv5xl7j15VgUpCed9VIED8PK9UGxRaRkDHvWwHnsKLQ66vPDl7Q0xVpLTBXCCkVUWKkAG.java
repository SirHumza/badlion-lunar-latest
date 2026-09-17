import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.apache.commons.io.IOUtils;

public enum e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG {
   BatModClient,
   Button,
   CustomSpinner,
   ButtonAction,
   Spinner;

   e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG() {
   }

   public void BatModClient(URL var1) {
      try {
         Process var2 = AccessController.doPrivileged(
            () -> Runtime.getRuntime().exec(this.Button(var1))
         );

         for (String var4 : IOUtils.readLines(var2.getErrorStream())) {
            uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
               .error(var4);
         }

         var2.getInputStream().close();
         var2.getErrorStream().close();
         var2.getOutputStream().close();
      } catch (IOException | PrivilegedActionException var5) {
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
            .error("Couldn't open url '{}'", new Object[]{var1, var5});
      }
   }

   public void BatModClient(URI var1) {
      try {
         this.BatModClient(var1.toURL());
      } catch (MalformedURLException var3) {
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
            .error("Couldn't open uri '{}'", new Object[]{var1, var3});
      }
   }

   public void BatModClient(File var1) {
      try {
         this.BatModClient(var1.toURI().toURL());
      } catch (MalformedURLException var3) {
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
            .error("Couldn't open file '{}'", new Object[]{var1, var3});
      }
   }

   protected String[] Button(URL var1) {
      String var2 = var1.toString();
      if ("file".equals(var1.getProtocol())) {
         var2 = var2.replace("file:", "file://");
      }

      return new String[]{"xdg-open", var2};
   }

   public void BatModClient(String var1) {
      try {
         this.BatModClient(new URI(var1).toURL());
      } catch (MalformedURLException | IllegalArgumentException | URISyntaxException var3) {
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
            .error("Couldn't open uri '{}'", new Object[]{var1, var3});
      }
   }
}
