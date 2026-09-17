import com.batmod.gui.button.GuiColorPicker;
import com.google.gson.JsonElement;
import java.awt.Color;

final class S95dhcHRNOgVDVUKGszA8wyUelgvL1lRaUQOcnUos58vwTniTaDfB3C5u8QJep2iBYHi6Nute7MTlmgwfVEFHjKsrukZJH707IX
   implements uE2zjvktXW34xtNui9lYr2byCqgVmr9tVZQGbUZfvW1VkTNnYzgpaU2x9IBZQ8RLJXtbx39wPvN5dcJTZ9EU2KGe9ZYXRqAmHNKF {
   S95dhcHRNOgVDVUKGszA8wyUelgvL1lRaUQOcnUos58vwTniTaDfB3C5u8QJep2iBYHi6Nute7MTlmgwfVEFHjKsrukZJH707IX(
      ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1
   ) {
      this.BatModClient = var1;
   }

   @Override
   public dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR BatModClient() {
      JsonElement var1 = CustomSpinner.Button()
         .Button()
         .BatModClient(
            this.BatModClient, "color"
         );
      String var2 = var1 == null ? "chroma" : var1.getAsString();
      DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW var3 = new DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(
         var2.equals("chroma") ? new Color(1.0F, 1.0F, 1.0F, 1.0F) : new Color(Integer.parseInt(var2), false)
      );
      if (var2.equals("chroma")) {
         var3.BatModClient(true);
      }

      return new GuiColorPicker(1, 0, 0, var3, true, false);
   }

   @Override
   public void BatModClient(
      dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR var1
   ) {
      GuiColorPicker var2 = (GuiColorPicker)var1;
      DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW var3 = var2.BatModClient();
      Color var4 = new Color(
         var3.BatModClient().getRed(),
         var3.BatModClient().getGreen(),
         var3.BatModClient().getBlue()
      );
      CustomSpinner.Button()
         .Button()
         .BatModClient(
            this.BatModClient,
            "color",
            var3.ButtonAction()
               ? "chroma"
               : String.valueOf(var4.getRGB())
         );
   }
}
