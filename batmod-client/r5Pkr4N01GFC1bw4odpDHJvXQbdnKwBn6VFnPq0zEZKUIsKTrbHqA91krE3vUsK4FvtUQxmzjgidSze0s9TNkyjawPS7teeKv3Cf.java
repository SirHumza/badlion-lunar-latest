public abstract class r5Pkr4N01GFC1bw4odpDHJvXQbdnKwBn6VFnPq0zEZKUIsKTrbHqA91krE3vUsK4FvtUQxmzjgidSze0s9TNkyjawPS7teeKv3Cf
   implements sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD {
   private final sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD BatModClient;
   private final String Button;
   private final double CustomSpinner;
   private boolean ButtonAction;

   protected r5Pkr4N01GFC1bw4odpDHJvXQbdnKwBn6VFnPq0zEZKUIsKTrbHqA91krE3vUsK4FvtUQxmzjgidSze0s9TNkyjawPS7teeKv3Cf(
      sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD var1, String var2, double var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      if (var2 == null) {
         throw new IllegalArgumentException("Name cannot be null!");
      }
   }

   @Override
   public String BatModClient() {
      return this.Button;
   }

   @Override
   public double Button() {
      return this.CustomSpinner;
   }

   @Override
   public boolean CustomSpinner() {
      return this.ButtonAction;
   }

   public r5Pkr4N01GFC1bw4odpDHJvXQbdnKwBn6VFnPq0zEZKUIsKTrbHqA91krE3vUsK4FvtUQxmzjgidSze0s9TNkyjawPS7teeKv3Cf BatModClient(
      boolean var1
   ) {
      this.ButtonAction = var1;
      return this;
   }

   @Override
   public sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD ButtonAction() {
      return this.BatModClient;
   }

   @Override
   public int hashCode() {
      return this.Button.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD
         && this.Button
            .equals(
               ((sZDEP6t4IsLak2NXGih7CmabMDZ6FBEx8w4YeUqkEVAcThDTPtQENNYNRgjSLTxAr5b4AlgYmcFSKf2CarODG3ohxMiwcWtJHVzD)var1)
                  .BatModClient()
            );
   }
}
