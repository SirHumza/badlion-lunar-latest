import com.batmod.gui.button.GuiToggleButton;
import org.apache.commons.lang3.StringUtils;

final class ubWCwiPeeGXCBLdWH753YvPZKUjFvHUExMPCKxWalRecTEd0jTib049joevBcLU4jHfYB7NDOk2r5wqG7SuN58YCG9ADsEMTwomo
   implements uE2zjvktXW34xtNui9lYr2byCqgVmr9tVZQGbUZfvW1VkTNnYzgpaU2x9IBZQ8RLJXtbx39wPvN5dcJTZ9EU2KGe9ZYXRqAmHNKF {
   ubWCwiPeeGXCBLdWH753YvPZKUjFvHUExMPCKxWalRecTEd0jTib049joevBcLU4jHfYB7NDOk2r5wqG7SuN58YCG9ADsEMTwomo(int var1) {
      this.BatModClient = var1;
   }

   @Override
   public void BatModClient(
      dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR var1
   ) {
      atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 var2 = atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15.values()[this.BatModClient];
      if (var2 == null) {
         BatModClient.CustomSpinner(
            "Could not toggle keystrokes type (skipping)"
         );
      } else {
         if (jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()
            .keystrokesTypes
            .contains(var2)) {
            jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()
               .keystrokesTypes
               .remove(var2);
         } else {
            jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()
               .keystrokesTypes
               .add(var2);
         }
      }
   }

   @Override
   public dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR BatModClient() {
      atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 var1 = atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15.values()[this.BatModClient];
      if (var1 == null) {
         BatModClient.CustomSpinner(
            "Could not assign keystrokes type to toggle button (skipping)"
         );
         return new GuiToggleButton(
            this.BatModClient + 2,
            false,
            true,
            "§cError: assign keystrokes"
         );
      } else {
         return new GuiToggleButton(
            this.BatModClient + 2,
            jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()
               .keystrokesTypes
               .contains(var1),
            true,
            rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  var1.BatModClient()
               )
               + " ("
               + (
                  this.BatModClient < 3
                     ? var1.name()
                     : StringUtils.capitalize(var1.name().toLowerCase())
               )
               + ")"
         );
      }
   }
}
