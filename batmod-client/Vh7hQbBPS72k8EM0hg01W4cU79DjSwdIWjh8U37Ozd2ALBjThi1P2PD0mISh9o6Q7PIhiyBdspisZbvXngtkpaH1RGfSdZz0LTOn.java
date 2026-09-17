import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn {
   private static final Logger BatModClient = LogManager.getLogger();
   private int Button;
   private int CustomSpinner;
   private int ButtonAction;
   private boolean Spinner;
   private boolean Checkbox;
   private boolean ProgressBar;
   private boolean BatModProgressBar;

   public Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn(int var1, int var2) {
      this(var1, var2, 0);
   }

   public Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn(int var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn(
      int var1, int var2, int var3, boolean var4, boolean var5
   ) {
      this.Button = var1;
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
      this.Checkbox = var4;
      this.BatModProgressBar = var5;
   }

   public Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn(
      Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var1
   ) {
      this.Button = var1.Button;
      this.CustomSpinner = var1.CustomSpinner;
      this.ButtonAction = var1.ButtonAction;
      this.Checkbox = var1.Checkbox;
      this.BatModProgressBar = var1.BatModProgressBar;
   }

   public void BatModClient(
      Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var1
   ) {
      if (this.Button
         != var1.Button) {
         BatModClient.warn(
            "This method should only be called for matching effects!"
         );
      }

      if (var1.ButtonAction
         > this.ButtonAction) {
         this.ButtonAction = var1.ButtonAction;
         this.CustomSpinner = var1.CustomSpinner;
      } else if (var1.ButtonAction
            == this.ButtonAction
         && this.CustomSpinner
            < var1.CustomSpinner) {
         this.CustomSpinner = var1.CustomSpinner;
      } else if (!var1.Checkbox
         && this.Checkbox) {
         this.Checkbox = var1.Checkbox;
      }

      this.BatModProgressBar = var1.BatModProgressBar;
   }

   public int BatModClient() {
      return this.Button;
   }

   public int Button() {
      return this.CustomSpinner;
   }

   public int CustomSpinner() {
      return this.ButtonAction;
   }

   public void BatModClient(boolean var1) {
      this.Spinner = var1;
   }

   public boolean ButtonAction() {
      return this.Checkbox;
   }

   public boolean Spinner() {
      return this.BatModProgressBar;
   }

   public boolean BatModClient(
      B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R var1
   ) {
      if (this.CustomSpinner > 0) {
         if (ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[this.Button]
            .Button(
               this.CustomSpinner,
               this.ButtonAction
            )) {
            this.Button(var1);
         }

         this.BatModProgressBar();
      }

      return this.CustomSpinner > 0;
   }

   private int BatModProgressBar() {
      return --this.CustomSpinner;
   }

   public void Button(
      B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R var1
   ) {
      if (this.CustomSpinner > 0) {
         ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[this.Button]
            .BatModClient(
               var1, this.ButtonAction
            );
      }
   }

   public String Checkbox() {
      return ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[this.Button]
         .ButtonAction();
   }

   @Override
   public int hashCode() {
      return this.Button;
   }

   @Override
   public String toString() {
      String var1 = "";
      if (this.CustomSpinner() > 0) {
         var1 = this.Checkbox()
            + " x "
            + (this.CustomSpinner() + 1)
            + ", Duration: "
            + this.Button();
      } else {
         var1 = this.Checkbox()
            + ", Duration: "
            + this.Button();
      }

      if (this.Spinner) {
         var1 = var1 + ", Splash: true";
      }

      if (!this.BatModProgressBar) {
         var1 = var1 + ", Particles: false";
      }

      return ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[this.Button]
            .ColorChooser()
         ? "(" + var1 + ")"
         : var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn)) {
         return false;
      }

      Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var2 = (Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn)var1;
      return this.Button
            == var2.Button
         && this.ButtonAction
            == var2.ButtonAction
         && this.CustomSpinner
            == var2.CustomSpinner
         && this.Spinner
            == var2.Spinner
         && this.Checkbox
            == var2.Checkbox;
   }

   public YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      var1.BatModClient(
         "Id", (byte)this.BatModClient()
      );
      var1.BatModClient(
         "Amplifier", (byte)this.CustomSpinner()
      );
      var1.BatModClient(
         "Duration", this.Button()
      );
      var1.BatModClient(
         "Ambient", this.ButtonAction()
      );
      var1.BatModClient(
         "ShowParticles", this.Spinner()
      );
      return var1;
   }

   public static Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn Button(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0
   ) {
      byte var1 = var0.ButtonAction("Id");
      if (var1 >= 0
         && var1
            < ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient.length
         && ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[var1]
            != null) {
         byte var2 = var0.ButtonAction("Amplifier");
         int var3 = var0.Checkbox("Duration");
         boolean var4 = var0.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("Ambient");
         boolean var5 = true;
         if (var0.Button("ShowParticles", 1)) {
            var5 = var0.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("ShowParticles");
         }

         return new Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn(var1, var3, var2, var4, var5);
      } else {
         return null;
      }
   }

   public void Button(boolean var1) {
      this.ProgressBar = var1;
   }

   public boolean ProgressBar() {
      return this.ProgressBar;
   }
}
