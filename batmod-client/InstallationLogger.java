import java.util.Map;
import java.util.UUID;

public class InstallationLogger {
   private long BatModClient;
   private UUID Button;
   private String CustomSpinner;
   private Map ButtonAction;

   public InstallationLogger(long var1, UUID var3, String var4, Map var5) {
      this.BatModClient = var1;
      this.Button = var3;
      this.CustomSpinner = var4;
      this.ButtonAction = var5;
   }

   public long BatModClient() {
      return this.BatModClient;
   }

   public UUID Button() {
      return this.Button;
   }

   public String CustomSpinner() {
      return this.CustomSpinner;
   }

   public Map ButtonAction() {
      return this.ButtonAction;
   }
}
