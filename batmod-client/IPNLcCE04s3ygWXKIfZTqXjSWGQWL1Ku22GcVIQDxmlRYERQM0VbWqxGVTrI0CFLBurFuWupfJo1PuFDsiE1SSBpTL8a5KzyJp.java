public class IPNLcCE04s3ygWXKIfZTqXjSWGQWL1Ku22GcVIQDxmlRYERQM0VbWqxGVTrI0CFLBurFuWupfJo1PuFDsiE1SSBpTL8a5KzyJp {
   public Class BatModClient;
   public final int Button;
   public int CustomSpinner;
   public int ButtonAction;

   public IPNLcCE04s3ygWXKIfZTqXjSWGQWL1Ku22GcVIQDxmlRYERQM0VbWqxGVTrI0CFLBurFuWupfJo1PuFDsiE1SSBpTL8a5KzyJp(Class var1, int var2, int var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.ButtonAction = var3;
   }

   public boolean BatModClient(int var1) {
      return this.ButtonAction == 0
         || this.CustomSpinner
            < this.ButtonAction;
   }

   public boolean BatModClient() {
      return this.ButtonAction == 0
         || this.CustomSpinner
            < this.ButtonAction;
   }
}
