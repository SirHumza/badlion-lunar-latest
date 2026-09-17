import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ {
   private static final Logger BatModClient = LogManager.getLogger();
   private final List Button = Lists.newArrayList();
   private final List CustomSpinner = Lists.newArrayList();
   private int ButtonAction = 0;
   private int Spinner = -1;
   private List Checkbox = Lists.newArrayList();
   private int ProgressBar = -1;

   public Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ(
      Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ var1
   ) {
      this();

      for (int var2 = 0; var2 < var1.ColorChooser(); var2++) {
         this.BatModClient(
            var1.CustomSpinner(var2)
         );
      }

      this.ButtonAction = var1.ProgressBar();
   }

   public Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ() {
   }

   public void BatModClient() {
      this.Button.clear();
      this.CustomSpinner.clear();
      this.Spinner = -1;
      this.Checkbox.clear();
      this.ProgressBar = -1;
      this.ButtonAction = 0;
   }

   public Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ BatModClient(
      HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa var1
   ) {
      if (var1.Checkbox()
         && this.IntegerSpinner()) {
         BatModClient.warn(
            "VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring."
         );
         return this;
      }

      this.Button.add(var1);
      this.CustomSpinner
         .add(this.ButtonAction);
      switch (var1.Button()) {
         case Button:
            this.ProgressBar = this.ButtonAction;
            break;
         case CustomSpinner:
            this.Spinner = this.ButtonAction;
            break;
         case ButtonAction:
            this.Checkbox
               .add(
                  var1.ButtonAction(),
                  this.ButtonAction
               );
      }

      this.ButtonAction = this.ButtonAction
         + var1.Spinner();
      return this;
   }

   public boolean Button() {
      return this.ProgressBar >= 0;
   }

   public int CustomSpinner() {
      return this.ProgressBar;
   }

   public boolean ButtonAction() {
      return this.Spinner >= 0;
   }

   public int Spinner() {
      return this.Spinner;
   }

   public boolean BatModClient(int var1) {
      return this.Checkbox.size() - 1 >= var1;
   }

   public int Button(int var1) {
      return (Integer)this.Checkbox.get(var1);
   }

   @Override
   public String toString() {
      String var1 = "format: "
         + this.Button.size()
         + " elements: ";

      for (int var2 = 0; var2 < this.Button.size(); var2++) {
         var1 = var1
            + ((HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa)this.Button
                  .get(var2))
               .toString();
         if (var2 != this.Button.size() - 1) {
            var1 = var1 + " ";
         }
      }

      return var1;
   }

   private boolean IntegerSpinner() {
      int var1 = 0;

      for (int var2 = this.Button.size(); var1 < var2; var1++) {
         HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa var3 = (HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa)this.Button
            .get(var1);
         if (var3.Checkbox()) {
            return true;
         }
      }

      return false;
   }

   public int Checkbox() {
      return this.ProgressBar() / 4;
   }

   public int ProgressBar() {
      return this.ButtonAction;
   }

   public List BatModProgressBar() {
      return this.Button;
   }

   public int ColorChooser() {
      return this.Button.size();
   }

   public HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa CustomSpinner(
      int var1
   ) {
      return (HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa)this.Button
         .get(var1);
   }

   public int ButtonAction(int var1) {
      return (Integer)this.CustomSpinner.get(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ var2 = (Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ)var1;
         return this.ButtonAction
               != var2.ButtonAction
            ? false
            : (
               !this.Button
                     .equals(var2.Button)
                  ? false
                  : this.CustomSpinner
                     .equals(var2.CustomSpinner)
            );
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.Button.hashCode();
      var1 = 31 * var1 + this.CustomSpinner.hashCode();
      return 31 * var1 + this.ButtonAction;
   }
}
