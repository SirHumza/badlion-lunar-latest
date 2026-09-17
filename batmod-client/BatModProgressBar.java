import java.util.UUID;

public class BatModProgressBar {
   private UUID BatModClient;
   private String Button;

   public BatModProgressBar(UUID var1, String var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public UUID BatModClient() {
      return this.BatModClient;
   }

   public void BatModClient(UUID var1) {
      this.BatModClient = var1;
   }

   public String Button() {
      return this.Button;
   }

   public void BatModClient(String var1) {
      this.Button = var1;
   }
}
