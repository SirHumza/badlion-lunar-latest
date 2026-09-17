import org.lwjgl.util.vector.Vector3f;

public class cABHM2cISWuH8zzi738vyUXPIJgEc8xmtK17vcKoHVd9RqAzihZ7wka9KcrhjwZBHRRyczO655KME88BnzN4jkXMvU49YPUIxlYJ {
   public static final cABHM2cISWuH8zzi738vyUXPIJgEc8xmtK17vcKoHVd9RqAzihZ7wka9KcrhjwZBHRRyczO655KME88BnzN4jkXMvU49YPUIxlYJ BatModClient = new cABHM2cISWuH8zzi738vyUXPIJgEc8xmtK17vcKoHVd9RqAzihZ7wka9KcrhjwZBHRRyczO655KME88BnzN4jkXMvU49YPUIxlYJ(
      new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F)
   );
   public final Vector3f Button;
   public final Vector3f CustomSpinner;
   public final Vector3f ButtonAction;

   public cABHM2cISWuH8zzi738vyUXPIJgEc8xmtK17vcKoHVd9RqAzihZ7wka9KcrhjwZBHRRyczO655KME88BnzN4jkXMvU49YPUIxlYJ(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.Button = new Vector3f(var1);
      this.CustomSpinner = new Vector3f(var2);
      this.ButtonAction = new Vector3f(var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (this.getClass() != var1.getClass()) {
         return false;
      }

      cABHM2cISWuH8zzi738vyUXPIJgEc8xmtK17vcKoHVd9RqAzihZ7wka9KcrhjwZBHRRyczO655KME88BnzN4jkXMvU49YPUIxlYJ var2 = (cABHM2cISWuH8zzi738vyUXPIJgEc8xmtK17vcKoHVd9RqAzihZ7wka9KcrhjwZBHRRyczO655KME88BnzN4jkXMvU49YPUIxlYJ)var1;
      return !this.Button
            .equals(var2.Button)
         ? false
         : (
            !this.ButtonAction
                  .equals(var2.ButtonAction)
               ? false
               : this.CustomSpinner
                  .equals(var2.CustomSpinner)
         );
   }

   @Override
   public int hashCode() {
      int var1 = this.Button.hashCode();
      var1 = 31 * var1 + this.CustomSpinner.hashCode();
      return 31 * var1 + this.ButtonAction.hashCode();
   }
}
