import java.net.InetAddress;

public class CustomSpinner {
   private String BatModClient;
   private int Button;
   private boolean CustomSpinner = false;
   private boolean ButtonAction = false;
   private static S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 Spinner;
   private jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD Checkbox;

   public CustomSpinner(String var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
      Spinner = new S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1();
      this.Spinner();
   }

   private void Spinner() {
      this.BatModClient(0L);
   }

   private void BatModClient(long var1) {
      new Thread(
            () -> {
               try {
                  Thread.sleep(var1);
               } catch (InterruptedException var5) {
                  var5.printStackTrace();
               }

               try {
                  BatModClient.BatModClient(
                     "Connecting to server: "
                        + this.BatModClient
                        + ":"
                        + this.Button
                  );
                  this.Checkbox = new jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD(
                     InetAddress.getByName(this.BatModClient),
                     this.Button
                  );
                  this.CustomSpinner = false;
               } catch (Exception var4) {
                  BatModClient.Button(
                     "Could not connect to server due to unknown host: "
                        + this.BatModClient
                        + ":"
                        + this.Button
                  );
                  this.CustomSpinner = false;
                  this.BatModClient(
                     KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ.TextField
                  );
                  Thread.currentThread().stop();
               }
            },
            "BatMod Server Connector"
         )
         .start();
   }

   public void BatModClient(
      KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ var1
   ) {
      this.Button(var1);
      if (!this.CustomSpinner) {
         this.CustomSpinner = true;
         if (this.ButtonAction) {
            BatModClient.BatModClient(
               "Reconnecting to server cancelled (connection already killed by server)"
            );
         } else {
            new Thread(
                  () -> {
                     BatModClient.BatModClient(
                        "Reconnecting to server in 10 seconds..."
                     );
                     this.BatModClient(10000L);
                  },
                  "BatMod Server Connector"
               )
               .start();
         }
      }
   }

   public void BatModClient(
      TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ var1
   ) {
      if (this.BatModClient()) {
         BatModClient.Button(
            "Skipping packet: " + var1.getClass().getSimpleName()
         );
      } else {
         this.Checkbox
            .BatModClient(var1);
      }
   }

   public void Button(
      KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ var1
   ) {
      if (!this.BatModClient()) {
         this.Checkbox
            .BatModClient(
               new AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF(var1)
            );
         this.Checkbox
            .Button(var1);
      }
   }

   public boolean BatModClient() {
      return this.Checkbox == null
         || !this.Checkbox
            .ProgressBar();
   }

   public static S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 Button() {
      return Spinner;
   }

   public jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD CustomSpinner() {
      return this.Checkbox;
   }

   public void ButtonAction() {
      this.ButtonAction = true;
   }
}
