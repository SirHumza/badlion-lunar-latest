import org.lwjgl.opengl.GL11;

public class s7nxx8drUU4cpiipNHBFKTyB9G830DIxHYTg4Wv4K3J2QPP9NcrbPIlaUP4MupK7miqQa0XNsjiepInFE0JRiM70Cl7FlPXAF63a {
   private AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB CustomSpinner;
   private boolean ButtonAction = false;
   private boolean Spinner = false;
   int BatModClient;
   float Button;
   private int Checkbox = -1;
   private int ProgressBar = 0;
   private double BatModProgressBar = 0.0;
   private double ColorChooser = 0.0;
   private double IntegerSpinner = 0.0;

   public s7nxx8drUU4cpiipNHBFKTyB9G830DIxHYTg4Wv4K3J2QPP9NcrbPIlaUP4MupK7miqQa0XNsjiepInFE0JRiM70Cl7FlPXAF63a(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1
   ) {
      this.CustomSpinner = var1;
      this.Checkbox = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.BatModClient(
         1
      );
   }

   public void BatModClient(boolean var1, int var2, float var3) {
      if (this.Spinner != var1) {
         this.ButtonAction = false;
      }

      this.Spinner = var1;
      this.BatModClient = var2;
      this.Button = var3;
   }

   public boolean BatModClient() {
      if (!this.ButtonAction) {
         return true;
      }

      if (this.BatModClient
         >= this.ProgressBar + 20) {
         return true;
      }

      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1 = this.CustomSpinner
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV();
      boolean var2 = this.ColorChooser
            + var1.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM()
         < 128.0
            + this.CustomSpinner
                  .InstallationLogger
                  .hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
               * 128.0F;
      boolean var3 = var1.BatModJson
            + var1.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM()
         < 128.0
            + this.CustomSpinner
                  .InstallationLogger
                  .hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
               * 128.0F;
      return var3 != var2;
   }

   public void Button() {
      GL11.glNewList(this.Checkbox, 4864);
   }

   public void CustomSpinner() {
      GL11.glEndList();
      this.ProgressBar = this.BatModClient;
      this.BatModProgressBar = this.CustomSpinner
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
         .ExitCode;
      this.ColorChooser = this.CustomSpinner
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
         .BatModJson;
      this.IntegerSpinner = this.CustomSpinner
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
         .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP;
      this.ButtonAction = true;
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
   }

   public void ButtonAction() {
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1 = this.CustomSpinner
         .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV();
      double var2 = var1.ExitCode
         + (
               var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  - var1.ExitCode
            )
            * this.Button;
      double var4 = var1.BatModJson
         + (
               var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                  - var1.BatModJson
            )
            * this.Button;
      double var6 = var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         + (
               var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                  - var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
            )
            * this.Button;
      double var8 = this.BatModClient
            - this.ProgressBar
         + this.Button;
      float var10 = (float)(var2 - this.BatModProgressBar + var8 * 0.03);
      float var11 = (float)(var4 - this.ColorChooser);
      float var12 = (float)(var6 - this.IntegerSpinner);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
      if (this.Spinner) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            -var10 / 12.0F, -var11, -var12 / 12.0F
         );
      } else {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            -var10, -var11, -var12
         );
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModInstallerMain(
         this.Checkbox
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
   }

   public void Spinner() {
      this.ButtonAction = false;
   }
}
