import com.google.common.collect.Lists;
import java.util.List;

public class F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja {
   private final int BatModClient;
   private final int Button;
   private final int CustomSpinner;
   private final int ButtonAction;
   private List Spinner;
   private TwQXzHbe93tdiVipCXSQFyhNDMl38Lbdfh0ZDcSOODH5tUEv0VeP1KuQhVbwJzTvaMPnUQZZy3Fw5jwR0vQ2nDaLLPOXxebrc0VN Checkbox;
   private static final String ProgressBar = "CL_00001056";

   public F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(int var1, int var2, int var3, int var4) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   public TwQXzHbe93tdiVipCXSQFyhNDMl38Lbdfh0ZDcSOODH5tUEv0VeP1KuQhVbwJzTvaMPnUQZZy3Fw5jwR0vQ2nDaLLPOXxebrc0VN BatModClient() {
      return this.Checkbox;
   }

   public int Button() {
      return this.BatModClient;
   }

   public int CustomSpinner() {
      return this.Button;
   }

   public boolean BatModClient(
      TwQXzHbe93tdiVipCXSQFyhNDMl38Lbdfh0ZDcSOODH5tUEv0VeP1KuQhVbwJzTvaMPnUQZZy3Fw5jwR0vQ2nDaLLPOXxebrc0VN var1
   ) {
      if (this.Checkbox != null) {
         return false;
      }

      int var2 = var1.Button();
      int var3 = var1.CustomSpinner();
      if (var2 <= this.CustomSpinner
         && var3 <= this.ButtonAction) {
         if (var2 == this.CustomSpinner
            && var3 == this.ButtonAction) {
            this.Checkbox = var1;
            return true;
         }

         if (this.Spinner == null) {
            this.Spinner = Lists.newArrayListWithCapacity(1);
            this.Spinner
               .add(
                  new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                     this.BatModClient,
                     this.Button,
                     var2,
                     var3
                  )
               );
            int var4 = this.CustomSpinner - var2;
            int var5 = this.ButtonAction - var3;
            if (var5 > 0 && var4 > 0) {
               int var6 = Math.max(this.ButtonAction, var4);
               int var7 = Math.max(this.CustomSpinner, var5);
               if (var6 >= var7) {
                  this.Spinner
                     .add(
                        new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                           this.BatModClient,
                           this.Button + var3,
                           var2,
                           var5
                        )
                     );
                  this.Spinner
                     .add(
                        new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                           this.BatModClient + var2,
                           this.Button,
                           var4,
                           this.ButtonAction
                        )
                     );
               } else {
                  this.Spinner
                     .add(
                        new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                           this.BatModClient + var2,
                           this.Button,
                           var4,
                           var3
                        )
                     );
                  this.Spinner
                     .add(
                        new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                           this.BatModClient,
                           this.Button + var3,
                           this.CustomSpinner,
                           var5
                        )
                     );
               }
            } else if (var4 == 0) {
               this.Spinner
                  .add(
                     new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                        this.BatModClient,
                        this.Button + var3,
                        var2,
                        var5
                     )
                  );
            } else if (var5 == 0) {
               this.Spinner
                  .add(
                     new F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja(
                        this.BatModClient + var2,
                        this.Button,
                        var4,
                        var3
                     )
                  );
            }
         }

         for (Object var9 : this.Spinner) {
            if (((F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja)var9)
               .BatModClient(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void BatModClient(List var1) {
      if (this.Checkbox != null) {
         var1.add(this);
      } else if (this.Spinner != null) {
         for (Object var3 : this.Spinner) {
            ((F9PligtvsADsFv28bJ3iTvaFWBabH5C7KSPAlgqqrIyP1V0BnIpyAr6sdWvDOQdukRQ5K866nOPI111jkfvqHYKbQMi7fnP0tdja)var3)
               .BatModClient(var1);
         }
      }
   }

   @Override
   public String toString() {
      return "Slot{originX="
         + this.BatModClient
         + ", originY="
         + this.Button
         + ", width="
         + this.CustomSpinner
         + ", height="
         + this.ButtonAction
         + ", texture="
         + this.Checkbox
         + ", subSlots="
         + this.Spinner
         + '}';
   }
}
