import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gIBRYSDE1aamwqBz5AM6JAtjQqwtTRlJsgbKnm4fFuKKDYykiaZiAZ1kT1QZRi6pcOVBLOt0i8O6ht4cdm0L95Z3vwWTCjPJhbLK {
   private final Logger CustomSpinner = LogManager.getLogger();
   private File ButtonAction;
   public String BatModClient = "";
   public String Button = "";

   public gIBRYSDE1aamwqBz5AM6JAtjQqwtTRlJsgbKnm4fFuKKDYykiaZiAZ1kT1QZRi6pcOVBLOt0i8O6ht4cdm0L95Z3vwWTCjPJhbLK() {
      this.CustomSpinner();
      this.BatModClient();
   }

   private void CustomSpinner() {
      File var1 = new File(
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
            + "/BatMod"
      );
      if (!var1.isDirectory()) {
         var1.mkdir();
      }

      this.ButtonAction = new File(var1.getAbsolutePath(), "cache.txt");
      if (!this.ButtonAction.exists()) {
         try {
            this.ButtonAction.createNewFile();
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   public void BatModClient() {
      try {
         if (!this.ButtonAction.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(
            new FileReader(this.ButtonAction)
         );
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if (var3.length >= 2) {
                  if (var3[0].equals("refresh_token")) {
                     this.BatModClient = var3[1];
                  }

                  if (var3[0].equals("latest_changelog")) {
                     this.Button = var3[1];
                  }
               }
            } catch (Exception var4) {
               this.CustomSpinner
                  .warn("Skipping bad BatMod cache: " + var2);
               var4.printStackTrace();
            }
         }

         var1.close();
      } catch (Exception var5) {
         this.BatModClient("Failed to load BatMod cache :(", var5);
      }

      this.Button();
   }

   public void Button() {
      try {
         PrintWriter var1 = new PrintWriter(
            new FileWriter(this.ButtonAction)
         );
         var1.println("refresh_token:" + this.BatModClient);
         var1.println("latest_changelog:" + this.Button);
         var1.close();
      } catch (Exception var2) {
         this.BatModClient("Failed to save BatMod cache :(", var2);
      }
   }

   private void BatModClient(String var1, Exception var2) {
      this.CustomSpinner.error(var1, var2);
   }
}
