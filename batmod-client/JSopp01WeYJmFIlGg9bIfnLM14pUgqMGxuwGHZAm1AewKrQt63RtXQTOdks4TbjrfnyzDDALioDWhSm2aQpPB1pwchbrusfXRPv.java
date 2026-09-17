import java.util.Arrays;

public enum JSopp01WeYJmFIlGg9bIfnLM14pUgqMGxuwGHZAm1AewKrQt63RtXQTOdks4TbjrfnyzDDALioDWhSm2aQpPB1pwchbrusfXRPv {
   BatModClient("hud"),
   Button("gameplay"),
   CustomSpinner("graphics"),
   ButtonAction("interface"),
   Spinner("animations"),
   Checkbox("cosmetics");

   private String ProgressBar;
   private String BatModProgressBar;

   public static void BatModClient() {
      Arrays.stream(values())
         .forEach(
            JSopp01WeYJmFIlGg9bIfnLM14pUgqMGxuwGHZAm1AewKrQt63RtXQTOdks4TbjrfnyzDDALioDWhSm2aQpPB1pwchbrusfXRPv::ButtonAction
         );
   }

   JSopp01WeYJmFIlGg9bIfnLM14pUgqMGxuwGHZAm1AewKrQt63RtXQTOdks4TbjrfnyzDDALioDWhSm2aQpPB1pwchbrusfXRPv(String var3) {
      this.ProgressBar = var3;
      this.ButtonAction();
   }

   private void ButtonAction() {
      this.BatModProgressBar = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
         "bm.options.category." + this.ProgressBar
      );
   }

   public String Button() {
      return this.ProgressBar;
   }

   public String CustomSpinner() {
      return this.BatModProgressBar;
   }

   @Override
   public String toString() {
      return this.ProgressBar;
   }
}
