public enum Opb8SPz8Ja827gajedeAyGDTtNx3M9yWHhhlyuQl9mLxy8dEXVRV1tsOkR0d4ps1nXskuvOJyeHGM3DCavMt8Ri5cErae3TRy8b {
   BatModClient(0, 59, 2.0F, 0.0F, 15),
   Button(1, 131, 4.0F, 1.0F, 5),
   CustomSpinner(2, 250, 6.0F, 2.0F, 14),
   ButtonAction(3, 1561, 8.0F, 3.0F, 10),
   Spinner(0, 32, 12.0F, 0.0F, 22);

   private final int Checkbox;
   private final int ProgressBar;
   private final float BatModProgressBar;
   private final float ColorChooser;
   private final int IntegerSpinner;

   Opb8SPz8Ja827gajedeAyGDTtNx3M9yWHhhlyuQl9mLxy8dEXVRV1tsOkR0d4ps1nXskuvOJyeHGM3DCavMt8Ri5cErae3TRy8b(int var3, int var4, float var5, float var6, int var7) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
      this.ColorChooser = var6;
      this.IntegerSpinner = var7;
   }

   public int BatModClient() {
      return this.ProgressBar;
   }

   public float Button() {
      return this.BatModProgressBar;
   }

   public float CustomSpinner() {
      return this.ColorChooser;
   }

   public int ButtonAction() {
      return this.Checkbox;
   }

   public int Spinner() {
      return this.IntegerSpinner;
   }

   public q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 Checkbox() {
      return this == BatModClient
         ? q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
            fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Checkbox
         )
         : (
            this == Button
               ? q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
                  fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Spinner
               )
               : (
                  this == Spinner
                     ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.TextField
                     : (
                        this == CustomSpinner
                           ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.IntegerSpinner
                           : (
                              this == ButtonAction
                                 ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.ColorChooser
                                 : null
                           )
                     )
               )
         );
   }
}
