import java.util.List;

public class UVLeidwlZgvhKuuLHLWs7c7NLUVuZLov2tMqwFBRuHenvENYquQIdlW9KGnshkSA4uzmmwsbHn6SzTpOFzLzfCsT4XDYnWcRrqdf
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "enchant";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.enchant.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 2) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.enchant.usage");
      }

      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var3 = BatModClient(
         var1, var2[0]
      );
      var1.BatModClient(
         OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.ButtonAction,
         0
      );

      int var4;
      try {
         var4 = BatModClient(var2[1], 0);
      } catch (AC7DHVQ77uvXF5QCLMnJsah5UmUnPopMXXEx6PtFJK7ErlEaGWbe3YW49QICJyfOJolaoUELWqAzC1t1DKTl1VKnsy46hxAXVYxR var12) {
         Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq var6 = Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq.BatModClient(
            var2[1]
         );
         if (var6 == null) {
            throw var12;
         }

         var4 = var6.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
      }

      int var5 = 1;
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var13 = var3.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP();
      if (var13 == null) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.enchant.noItem");
      }

      Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq var7 = Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq.BatModClient(
         var4
      );
      if (var7 == null) {
         throw new AC7DHVQ77uvXF5QCLMnJsah5UmUnPopMXXEx6PtFJK7ErlEaGWbe3YW49QICJyfOJolaoUELWqAzC1t1DKTl1VKnsy46hxAXVYxR("commands.enchant.notFound", var4);
      }

      if (!var7.BatModClient(var13)) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.enchant.cantEnchant");
      }

      if (var2.length >= 3) {
         var5 = BatModClient(
            var2[2],
            var7.CustomSpinner(),
            var7.ButtonAction()
         );
      }

      if (var13.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()) {
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var8 = var13.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
         if (var8 != null) {
            for (int var9 = 0; var9 < var8.Spinner(); var9++) {
               short var10 = var8.Button(var9)
                  .Spinner("id");
               if (Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq.BatModClient(
                     var10
                  )
                  != null) {
                  Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq var11 = Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq.BatModClient(
                     var10
                  );
                  if (!var11.BatModClient(var7)) {
                     throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                        "commands.enchant.cantCombine",
                        var7.ButtonAction(var5),
                        var11.ButtonAction(
                           var8.Button(var9)
                              .Spinner("lvl")
                        )
                     );
                  }
               }
            }
         }
      }

      var13.BatModClient(var7, var5);
      BatModClient(var1, this, "commands.enchant.success");
      var1.BatModClient(
         OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.ButtonAction,
         1
      );
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(
            var2, this.ButtonAction()
         )
         : (
            var2.length == 2
               ? BatModClient(
                  var2,
                  Zgcd9xUva6Y31NUIo9GrBj4bcvFq6wmBwzsENwf7ETQ1Ild1AMGhUQorHX3dWwlxc56bzJPZyd79rMu9ySru2cSleirJ9Ev2jkq.BatModClient()
               )
               : null
         );
   }

   protected String[] ButtonAction() {
      return TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var2 == 0;
   }
}
