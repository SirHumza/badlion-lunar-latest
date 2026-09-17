import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class g4XNl0TQADjZdAB7b1Xr8tdENN1GvhtLA83IBW8x3PfAGlCKGU8n9SnODCIbxvHm9pWGIAbalHRgjAa7FolOxO8FkuDG9okHzaq extends InputStream {
   private final InputStream BatModClient;
   private final String Button;
   private boolean CustomSpinner = false;

   public g4XNl0TQADjZdAB7b1Xr8tdENN1GvhtLA83IBW8x3PfAGlCKGU8n9SnODCIbxvHm9pWGIAbalHRgjAa7FolOxO8FkuDG9okHzaq(
      InputStream var1, p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2, String var3
   ) {
      this.BatModClient = var1;
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(var4));
      this.Button = "Leaked resource: '"
         + var2
         + "' loaded from pack: '"
         + var3
         + "'\n"
         + var4.toString();
   }

   @Override
   public void close() {
      this.BatModClient.close();
      this.CustomSpinner = true;
   }

   @Override
   protected void finalize() {
      if (!this.CustomSpinner) {
         aRbtbUR3MTzoc4uJ60sMu5OXGYjhoUFGtccKYsFSEDC7RZbljJC9Uo3OQz9RdqqH1zueCyhxyMr9nVeZLE3lU8ScicnFawNrMCQE.Button()
            .warn(this.Button);
      }

      super.finalize();
   }

   @Override
   public int read() {
      return this.BatModClient.read();
   }
}
