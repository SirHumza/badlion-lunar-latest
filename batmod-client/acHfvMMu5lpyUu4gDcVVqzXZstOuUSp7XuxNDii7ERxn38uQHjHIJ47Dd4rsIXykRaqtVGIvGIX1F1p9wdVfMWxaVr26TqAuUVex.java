public class acHfvMMu5lpyUu4gDcVVqzXZstOuUSp7XuxNDii7ERxn38uQHjHIJ47Dd4rsIXykRaqtVGIvGIX1F1p9wdVfMWxaVr26TqAuUVex
   extends iHs4au2YY51yRafmHUL4gDGIruOEsMK6nk7pcI2R5DQGh7CqqoqidAzqhhXnyqbMQUCUmAahBkTfCDung39Ej9MigBsNGxfexrx {
   public float Button = 1.0F;
   public boolean CustomSpinner;
   private final float ButtonAction;
   private final float Spinner;
   private int Checkbox;

   public acHfvMMu5lpyUu4gDcVVqzXZstOuUSp7XuxNDii7ERxn38uQHjHIJ47Dd4rsIXykRaqtVGIvGIX1F1p9wdVfMWxaVr26TqAuUVex(
      int var1, int var2, int var3, int var4, int var5, int var6
   ) {
      this(var1, var2, var3, var4, var6, 0, 1.0F, var5);
   }

   public acHfvMMu5lpyUu4gDcVVqzXZstOuUSp7XuxNDii7ERxn38uQHjHIJ47Dd4rsIXykRaqtVGIvGIX1F1p9wdVfMWxaVr26TqAuUVex(
      int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8
   ) {
      super(var1, var2, var3, var4, 20, "");
      this.ButtonAction = var7;
      this.Spinner = var8;
      this.Button = this.BatModClient(
         var6
      );
      this.BatModClient().ButtonAction = this.ProgressBar();
   }

   public String ProgressBar() {
      return "";
   }

   public float BatModClient(float var1) {
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         (
               this.CustomSpinner(var1)
                  - this.ButtonAction
            )
            / (
               this.Spinner
                  - this.ButtonAction
            ),
         0.0F,
         1.0F
      );
   }

   public float Button(float var1) {
      return this.CustomSpinner(
         this.ButtonAction
            + (
                  this.Spinner
                     - this.ButtonAction
               )
               * u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                  var1, 0.0F, 1.0F
               )
      );
   }

   public float CustomSpinner(float var1) {
      var1 = this.ButtonAction(var1);
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var1,
         this.ButtonAction,
         this.Spinner
      );
   }

   protected float ButtonAction(float var1) {
      if (this.Checkbox > 0) {
         var1 = this.Checkbox
            * Math.round(var1 / this.Checkbox);
      }

      return var1;
   }

   @Override
   public int Button(boolean var1) {
      return 0;
   }

   @Override
   public void ButtonAction(int var1, int var2) {
      if (this.BatModClient().ProgressBar
         )
       {
         if (this.CustomSpinner) {
            this.Button = (float)(
                  var1
                     - (
                        this.BatModClient().Button
                           + 4
                     )
               )
               / (
                  this.BatModClient()
                        .ColorTextPane()
                     - 8
               );
            this.Button = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               this.Button, 0.0F, 1.0F
            );
            float var3 = this.Button(
               this.Button
            );
            this.Spinner(var3);
            this.Button = this.BatModClient(
               var3
            );
            this.BatModClient().ButtonAction = this.ProgressBar();
         }

         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
            .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               BatModClient
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         this.BatModClient(
            this.BatModClient().Button
               + (int)(
                  this.Button
                     * (
                        this.BatModClient()
                              .ColorTextPane()
                           - 8
                     )
               ),
            this.BatModClient().CustomSpinner,
            0,
            66,
            4,
            20
         );
         this.BatModClient(
            this.BatModClient().Button
               + (int)(
                  this.Button
                     * (
                        this.BatModClient()
                              .ColorTextPane()
                           - 8
                     )
               )
               + 4,
            this.BatModClient().CustomSpinner,
            196,
            66,
            4,
            20
         );
      }
   }

   @Override
   public void Button(int var1, int var2) {
      this.Button = (float)(
            var1
               - (
                  this.BatModClient().Button
                     + 4
               )
         )
         / (
            this.BatModClient()
                  .ColorTextPane()
               - 8
         );
      this.Button = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         this.Button, 0.0F, 1.0F
      );
      this.Spinner(
         this.Button(
            this.Button
         )
      );
      this.BatModClient().ButtonAction = this.ProgressBar();
      this.CustomSpinner = true;
   }

   public void Spinner(float var1) {
   }

   @Override
   public void CustomSpinner(int var1, int var2) {
      this.CustomSpinner = false;
   }
}
