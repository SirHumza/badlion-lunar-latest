import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

class tqgjH9ASsUFJHBPZnNG0LAluAvinw1zds2RLIZQhf7jbGa4mLEjJD4swswkRTLPKHytNCKI5u0LeeMo2N4bXzWWkJdznufhVDepK extends UnmodifiableIterator {
   private int BatModClient = -2;
   private final Iterable[] Button;
   private final Iterator[] CustomSpinner;
   private final Object[] ButtonAction;

   private tqgjH9ASsUFJHBPZnNG0LAluAvinw1zds2RLIZQhf7jbGa4mLEjJD4swswkRTLPKHytNCKI5u0LeeMo2N4bXzWWkJdznufhVDepK(Class var1, Iterable[] var2) {
      this.Button = var2;
      this.CustomSpinner = (Iterator[])HIfXjEWGjUeCitlVG0MA9Bwzhk3OIuTgzMB8SBhJ0gLEIJiZgW83y3qVLbGVx3ESZHeKQtuUvT9nVBHl3mnScYcqOsiNsvjUNvgW.BatModClient(
         Iterator.class, this.Button.length
      );

      for (int var3 = 0; var3 < this.Button.length; var3++) {
         this.CustomSpinner[var3] = var2[var3].iterator();
      }

      this.ButtonAction = HIfXjEWGjUeCitlVG0MA9Bwzhk3OIuTgzMB8SBhJ0gLEIJiZgW83y3qVLbGVx3ESZHeKQtuUvT9nVBHl3mnScYcqOsiNsvjUNvgW.BatModClient(
         var1, this.CustomSpinner.length
      );
   }

   private void Button() {
      this.BatModClient = -1;
      Arrays.fill(this.CustomSpinner, null);
      Arrays.fill(this.ButtonAction, null);
   }

   public boolean hasNext() {
      if (this.BatModClient == -2) {
         this.BatModClient = 0;

         for (Iterator var4 : this.CustomSpinner) {
            if (!var4.hasNext()) {
               this.Button();
               break;
            }
         }

         return true;
      } else {
         if (this.BatModClient
            >= this.CustomSpinner.length) {
            for (this.BatModClient = this.CustomSpinner.length
                  - 1;
               this.BatModClient >= 0;
               this.BatModClient--
            ) {
               Iterator var1 = this.CustomSpinner[this.BatModClient];
               if (var1.hasNext()) {
                  break;
               }

               if (this.BatModClient == 0) {
                  this.Button();
                  break;
               }

               var1 = this.Button[this.BatModClient]
                  .iterator();
               this.CustomSpinner[this.BatModClient] = var1;
               if (!var1.hasNext()) {
                  this.Button();
                  break;
               }
            }
         }

         return this.BatModClient >= 0;
      }
   }

   public Object[] BatModClient() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      while (
         this.BatModClient
            < this.CustomSpinner.length
      ) {
         this.ButtonAction[this.BatModClient] = this.CustomSpinner[this.BatModClient]
            .next();
         this.BatModClient++;
      }

      return (Object[])this.ButtonAction.clone();
   }
}
