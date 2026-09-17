import java.util.ArrayList;

public class z8211jV4x58Ys8sxXT9BwHG0Fge5b2CT005CRQU7L3BsPapSiFIjzghCHcj7SPc2NUAnh7MTZjvTqKA7B3zWrOvN5kM77wt5eDgf {
   private ArrayList BatModClient = null;
   private int Button = 0;
   private float CustomSpinner = 1.0F;
   private int ButtonAction = 0;

   public z8211jV4x58Ys8sxXT9BwHG0Fge5b2CT005CRQU7L3BsPapSiFIjzghCHcj7SPc2NUAnh7MTZjvTqKA7B3zWrOvN5kM77wt5eDgf() {
      this(10, 0.75F);
   }

   public z8211jV4x58Ys8sxXT9BwHG0Fge5b2CT005CRQU7L3BsPapSiFIjzghCHcj7SPc2NUAnh7MTZjvTqKA7B3zWrOvN5kM77wt5eDgf(int var1) {
      this(var1, 0.75F);
   }

   public z8211jV4x58Ys8sxXT9BwHG0Fge5b2CT005CRQU7L3BsPapSiFIjzghCHcj7SPc2NUAnh7MTZjvTqKA7B3zWrOvN5kM77wt5eDgf(int var1, float var2) {
      this.BatModClient = new ArrayList(var1);
      this.Button = var1;
      this.CustomSpinner = var2;
   }

   public void BatModClient(int var1, Object var2) {
      if (var2 != null) {
         this.ButtonAction++;
      }

      this.BatModClient.add(var1, var2);
   }

   public boolean BatModClient(Object var1) {
      if (var1 != null) {
         this.ButtonAction++;
      }

      return this.BatModClient.add(var1);
   }

   public Object Button(int var1, Object var2) {
      Object var3 = this.BatModClient.set(var1, var2);
      if (var2 != var3) {
         if (var3 == null) {
            this.ButtonAction++;
         }

         if (var2 == null) {
            this.ButtonAction--;
         }
      }

      return var3;
   }

   public Object BatModClient(int var1) {
      Object var2 = this.BatModClient.remove(var1);
      if (var2 != null) {
         this.ButtonAction--;
      }

      return var2;
   }

   public void BatModClient() {
      this.BatModClient.clear();
      this.ButtonAction = 0;
   }

   public void Button() {
      if (this.ButtonAction <= 0
         && this.BatModClient.size() <= 0) {
         this.BatModClient();
      } else if (this.BatModClient.size()
         > this.Button) {
         float var1 = this.ButtonAction
            * 1.0F
            / this.BatModClient.size();
         if (var1 <= this.CustomSpinner) {
            int var2 = 0;

            for (int var3 = 0; var3 < this.BatModClient.size(); var3++) {
               Object var4 = this.BatModClient.get(var3);
               if (var4 != null) {
                  if (var3 != var2) {
                     this.BatModClient.set(var2, var4);
                  }

                  var2++;
               }
            }

            for (int var5 = this.BatModClient.size() - 1;
               var5 >= var2;
               var5--
            ) {
               this.BatModClient.remove(var5);
            }
         }
      }
   }

   public boolean Button(Object var1) {
      return this.BatModClient.contains(var1);
   }

   public Object Button(int var1) {
      return this.BatModClient.get(var1);
   }

   public boolean CustomSpinner() {
      return this.BatModClient.isEmpty();
   }

   public int ButtonAction() {
      return this.BatModClient.size();
   }

   public int Spinner() {
      return this.ButtonAction;
   }
}
