class sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs {
   final long BatModClient;
   Object Button;
   sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs CustomSpinner;
   final int ButtonAction;
   private static final String Spinner = "CL_00001493";

   sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs(
      int var1, long var2, Object var4, sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs var5
   ) {
      this.Button = var4;
      this.CustomSpinner = var5;
      this.BatModClient = var2;
      this.ButtonAction = var1;
   }

   public final long BatModClient() {
      return this.BatModClient;
   }

   public final Object Button() {
      return this.Button;
   }

   @Override
   public final boolean equals(Object var1) {
      if (!(var1 instanceof sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs)) {
         return false;
      }

      sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs var2 = (sJafnh7BatqOEPFH2gvnDIAhCjE1kRkbkBEx3RCJYvEWendGV3fvlIV3W9BlG0ByDZAMjuR1W2EJCZY2SywFLCXuaYPY1LGHjFvs)var1;
      Long var3 = this.BatModClient();
      Long var4 = var2.BatModClient();
      if (var3 == var4 || var3 != null && var3.equals(var4)) {
         Object var5 = this.Button();
         Object var6 = var2.Button();
         if (var5 == var6 || var5 != null && var5.equals(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final int hashCode() {
      return u78ZFnNTGnUWOu0AHQpJzOux3MDwTEyj8xh3gWL2e9SnoKHBb1bv0jmUEWiXK5mtQzBxs48CU9IrHApFZg1s9X15jKnyBXYnG83d.Checkbox(
         this.BatModClient
      );
   }

   @Override
   public final String toString() {
      return this.BatModClient()
         + "="
         + this.Button();
   }
}
