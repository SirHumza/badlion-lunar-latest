public class BowAGxnBwZmxlIx58EiEUgj0OVBykCpqeCc0esNopvvoZKtElPAvhlfQVvfpC3yoU9WVy0TvPvqZKxwj4SYbKTz7Q4JY5WEzAyzU {
   private final Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb BatModClient;
   private final WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY Button;

   public BowAGxnBwZmxlIx58EiEUgj0OVBykCpqeCc0esNopvvoZKtElPAvhlfQVvfpC3yoU9WVy0TvPvqZKxwj4SYbKTz7Q4JY5WEzAyzU(
      Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb var1,
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public Qlq1GJJUZa73pr1FXgMq21HMmCsWeGMb7fakBKqGdFb9bNNt1ZqfL4t557nl3UyN1cclAk4sOBYlg0qg2wU6BJTBpQTyJFZY0GXb BatModClient() {
      return this.BatModClient;
   }

   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY Button() {
      return this.Button;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         BowAGxnBwZmxlIx58EiEUgj0OVBykCpqeCc0esNopvvoZKtElPAvhlfQVvfpC3yoU9WVy0TvPvqZKxwj4SYbKTz7Q4JY5WEzAyzU var2 = (BowAGxnBwZmxlIx58EiEUgj0OVBykCpqeCc0esNopvvoZKtElPAvhlfQVvfpC3yoU9WVy0TvPvqZKxwj4SYbKTz7Q4JY5WEzAyzU)var1;
         if (this.BatModClient
            != var2.BatModClient) {
            return false;
         }

         if (this.Button != null) {
            if (!this.Button
               .equals(var2.Button)) {
               return false;
            }
         } else if (var2.Button != null) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "HoverEvent{action="
         + this.BatModClient
         + ", value='"
         + this.Button
         + '\''
         + '}';
   }

   @Override
   public int hashCode() {
      int var1 = this.BatModClient.hashCode();
      return 31 * var1
         + (
            this.Button != null
               ? this.Button.hashCode()
               : 0
         );
   }
}
