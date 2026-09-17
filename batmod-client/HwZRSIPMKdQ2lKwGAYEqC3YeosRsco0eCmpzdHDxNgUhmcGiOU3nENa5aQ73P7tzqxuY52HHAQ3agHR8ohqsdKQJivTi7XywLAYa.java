import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa {
   private static final Logger BatModClient = LogManager.getLogger();
   private final E3m2US9F56PD3ZlmVNv7gXDceU4Nes1aICknJWdjpztCABQvNASpLHhLsp5RLrW9lExrxfRLXdovaEGTTSGrIOWwhzT6XU7OSOIO Button;
   private final lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6 CustomSpinner;
   private int ButtonAction;
   private int Spinner;

   public HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa(
      int var1,
      E3m2US9F56PD3ZlmVNv7gXDceU4Nes1aICknJWdjpztCABQvNASpLHhLsp5RLrW9lExrxfRLXdovaEGTTSGrIOWwhzT6XU7OSOIO var2,
      lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6 var3,
      int var4
   ) {
      if (!this.BatModClient(var1, var3)) {
         BatModClient.warn(
            "Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV."
         );
         this.CustomSpinner = lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6.ButtonAction;
      } else {
         this.CustomSpinner = var3;
      }

      this.Button = var2;
      this.ButtonAction = var1;
      this.Spinner = var4;
   }

   private final boolean BatModClient(
      int var1, lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6 var2
   ) {
      return var1 == 0
         || var2
            == lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6.ButtonAction;
   }

   public final E3m2US9F56PD3ZlmVNv7gXDceU4Nes1aICknJWdjpztCABQvNASpLHhLsp5RLrW9lExrxfRLXdovaEGTTSGrIOWwhzT6XU7OSOIO BatModClient() {
      return this.Button;
   }

   public final lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6 Button() {
      return this.CustomSpinner;
   }

   public final int CustomSpinner() {
      return this.Spinner;
   }

   public final int ButtonAction() {
      return this.ButtonAction;
   }

   @Override
   public String toString() {
      return this.Spinner
         + ","
         + this.CustomSpinner
            .BatModClient()
         + ","
         + this.Button
            .Button();
   }

   public final int Spinner() {
      return this.Button
            .BatModClient()
         * this.Spinner;
   }

   public final boolean Checkbox() {
      return this.CustomSpinner
         == lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6.BatModClient;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa var2 = (HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa)var1;
         return this.Spinner
               != var2.Spinner
            ? false
            : (
               this.ButtonAction
                     != var2.ButtonAction
                  ? false
                  : (
                     this.Button
                           != var2.Button
                        ? false
                        : this.CustomSpinner
                           == var2.CustomSpinner
                  )
            );
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.Button.hashCode();
      var1 = 31 * var1 + this.CustomSpinner.hashCode();
      var1 = 31 * var1 + this.ButtonAction;
      return 31 * var1 + this.Spinner;
   }
}
