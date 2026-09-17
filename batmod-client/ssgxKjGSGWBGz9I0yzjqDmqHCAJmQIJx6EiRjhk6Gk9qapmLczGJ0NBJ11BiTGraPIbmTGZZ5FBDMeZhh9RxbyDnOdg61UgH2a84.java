import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ssgxKjGSGWBGz9I0yzjqDmqHCAJmQIJx6EiRjhk6Gk9qapmLczGJ0NBJ11BiTGraPIbmTGZZ5FBDMeZhh9RxbyDnOdg61UgH2a84
   implements hzmaJc5xZSuB44Ya2IggREPbO44AxnQhimxx16jMKnbe2xLSjEu9JaDFuuH2THsv6pOt6nGV2unZ3P169nsSNmL6PeFvKfCmtd0s,
   nHjY09oBC8pmaq5B4wtsQUagpZk2EFsC1TXk8OLYGYqBCzlRExe9LR7ewBkIkYDxWBGpdDgPCqNGSyztABVqtUKUSvHescVqSecT {
   private static final Logger BatModClient = LogManager.getLogger();
   private final File Button;
   private final File CustomSpinner;
   private final File ButtonAction;
   private final long Spinner = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2();
   private final String Checkbox;

   public ssgxKjGSGWBGz9I0yzjqDmqHCAJmQIJx6EiRjhk6Gk9qapmLczGJ0NBJ11BiTGraPIbmTGZZ5FBDMeZhh9RxbyDnOdg61UgH2a84(File var1, String var2, boolean var3) {
      this.Button = new File(var1, var2);
      this.Button.mkdirs();
      this.CustomSpinner = new File(
         this.Button, "playerdata"
      );
      this.ButtonAction = new File(
         this.Button, "data"
      );
      this.ButtonAction.mkdirs();
      this.Checkbox = var2;
      if (var3) {
         this.CustomSpinner.mkdirs();
      }

      this.BatModProgressBar();
   }

   private void BatModProgressBar() {
      try {
         File var1 = new File(this.Button, "session.lock");
         DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

         try {
            var2.writeLong(this.Spinner);
         } finally {
            var2.close();
         }
      } catch (IOException var7) {
         var7.printStackTrace();
         throw new RuntimeException("Failed to check session lock, aborting");
      }
   }

   @Override
   public File Checkbox() {
      return this.Button;
   }

   @Override
   public void ButtonAction() {
      try {
         File var1 = new File(this.Button, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if (var2.readLong() != this.Spinner) {
               throw new zfGFVx3br2Bjuzxro82hwP1Mo3r4BLgIc7qh6cszMs1wfwTEohX7b8n1iXJPKjErnm1b2s7nPYM0Ml2YS23xeTgpEEoAKZEF8oi2(
                  "The save is being accessed from another location, aborting"
               );
            }
         } finally {
            var2.close();
         }
      } catch (IOException var7) {
         throw new zfGFVx3br2Bjuzxro82hwP1Mo3r4BLgIc7qh6cszMs1wfwTEohX7b8n1iXJPKjErnm1b2s7nPYM0Ml2YS23xeTgpEEoAKZEF8oi2(
            "Failed to check session lock, aborting"
         );
      }
   }

   @Override
   public xgpbwxfSWg5zurxDBddfJxTd11emu2LZXoNqVWqy5q4i2qYRAggyTUXBWPzlkkny80zxYQDCdwsNqIV88fVxivfrTcWrc1rTjEgB BatModClient(
      yMnigY3u7ccbWVr3u5h1dfMYS4RxHxDOh4ifymvT6atESWbEtdvSdDp453kq6kwCDocAVWDcHL3RafiPJ18zJFL075EAfM06vlgT var1
   ) {
      throw new RuntimeException("Old Chunk Storage is no longer supported.");
   }

   @Override
   public KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC CustomSpinner() {
      File var1 = new File(this.Button, "level.dat");
      if (var1.exists()) {
         try {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var7 = CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
               new FileInputStream(var1)
            );
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var8 = var7.BatModInstallerMain(
               "Data"
            );
            return new KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC(var8);
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      var1 = new File(this.Button, "level.dat_old");
      if (var1.exists()) {
         try {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
               new FileInputStream(var1)
            );
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = var2.BatModInstallerMain(
               "Data"
            );
            return new KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC(var3);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public void BatModClient(
      KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC var1,
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2
   ) {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = var1.BatModClient(
         var2
      );
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
      var4.BatModClient("Data", var3);

      try {
         File var5 = new File(this.Button, "level.dat_new");
         File var6 = new File(this.Button, "level.dat_old");
         File var7 = new File(this.Button, "level.dat");
         CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
            var4, new FileOutputStream(var5)
         );
         if (var6.exists()) {
            var6.delete();
         }

         var7.renameTo(var6);
         if (var7.exists()) {
            var7.delete();
         }

         var5.renameTo(var7);
         if (var5.exists()) {
            var5.delete();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   @Override
   public void BatModClient(
      KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC var1
   ) {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = var1.BatModClient();
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
      var3.BatModClient("Data", var2);

      try {
         File var4 = new File(this.Button, "level.dat_new");
         File var5 = new File(this.Button, "level.dat_old");
         File var6 = new File(this.Button, "level.dat");
         CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
            var3, new FileOutputStream(var4)
         );
         if (var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if (var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if (var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   @Override
   public void BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      try {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         var1.Spinner(var2);
         File var3 = new File(
            this.CustomSpinner,
            var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString() + ".dat.tmp"
         );
         File var4 = new File(
            this.CustomSpinner,
            var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString() + ".dat"
         );
         CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
            var2, new FileOutputStream(var3)
         );
         if (var4.exists()) {
            var4.delete();
         }

         var3.renameTo(var4);
      } catch (Exception var5) {
         BatModClient.warn(
            "Failed to save player data for " + var1.C_()
         );
      }
   }

   @Override
   public YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Button(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = null;

      try {
         File var3 = new File(
            this.CustomSpinner,
            var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString() + ".dat"
         );
         if (var3.exists() && var3.isFile()) {
            var2 = CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G.BatModClient(
               new FileInputStream(var3)
            );
         }
      } catch (Exception var4) {
         BatModClient.warn(
            "Failed to load player data for " + var1.C_()
         );
      }

      if (var2 != null) {
         var1.Checkbox(var2);
      }

      return var2;
   }

   @Override
   public hzmaJc5xZSuB44Ya2IggREPbO44AxnQhimxx16jMKnbe2xLSjEu9JaDFuuH2THsv6pOt6nGV2unZ3P169nsSNmL6PeFvKfCmtd0s Spinner() {
      return this;
   }

   @Override
   public String[] Button() {
      String[] var1 = this.CustomSpinner.list();
      if (var1 == null) {
         var1 = new String[0];
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].endsWith(".dat")) {
            var1[var2] = var1[var2].substring(0, var1[var2].length() - 4);
         }
      }

      return var1;
   }

   @Override
   public void BatModClient() {
   }

   @Override
   public File BatModClient(String var1) {
      return new File(this.ButtonAction, var1 + ".dat");
   }

   @Override
   public String ProgressBar() {
      return this.Checkbox;
   }
}
