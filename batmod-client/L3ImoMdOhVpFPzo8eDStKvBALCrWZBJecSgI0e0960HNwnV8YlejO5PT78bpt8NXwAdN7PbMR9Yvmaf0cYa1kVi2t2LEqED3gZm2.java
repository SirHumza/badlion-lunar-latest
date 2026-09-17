import java.util.List;

public class L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2 {
   private final String BatModClient;
   private final List Button;

   public L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2(String var1, List var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public List BatModClient() {
      return this.Button;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)) {
         return false;
      }

      L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2 var2 = (L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)var1;
      return !this.BatModClient
            .equals(var2.BatModClient)
         ? false
         : this.Button
            .equals(var2.Button);
   }

   @Override
   public int hashCode() {
      int var1 = this.BatModClient.hashCode();
      return 31 * var1 + this.Button.hashCode();
   }
}
