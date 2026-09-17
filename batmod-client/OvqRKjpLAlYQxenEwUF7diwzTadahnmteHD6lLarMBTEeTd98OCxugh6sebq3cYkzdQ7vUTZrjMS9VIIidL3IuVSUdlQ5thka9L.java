public class OvqRKjpLAlYQxenEwUF7diwzTadahnmteHD6lLarMBTEeTd98OCxugh6sebq3cYkzdQ7vUTZrjMS9VIIidL3IuVSUdlQ5thka9L
   extends knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 {
   private boolean ColorChooser;
   private String IntegerSpinner;
   private final dPWfrBbXVnvmF8DqMJ0eiFgoGuuStVex0qRTdLMxpsUwtMoemJjOFmugsiEvgsECP51pO08IKfa2OkPyC6Kw5murEkTgqlSNbES4 TextField;

   public OvqRKjpLAlYQxenEwUF7diwzTadahnmteHD6lLarMBTEeTd98OCxugh6sebq3cYkzdQ7vUTZrjMS9VIIidL3IuVSUdlQ5thka9L(
      dPWfrBbXVnvmF8DqMJ0eiFgoGuuStVex0qRTdLMxpsUwtMoemJjOFmugsiEvgsECP51pO08IKfa2OkPyC6Kw5murEkTgqlSNbES4 var1,
      int var2,
      int var3,
      int var4,
      String var5,
      boolean var6
   ) {
      super(var2, var3, var4, 150, 20, "");
      this.IntegerSpinner = var5;
      this.ColorChooser = var6;
      this.ButtonAction = this.BatModClient();
      this.TextField = var1;
   }

   private String BatModClient() {
      return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            this.IntegerSpinner
         )
         + ": "
         + (
            this.ColorChooser
               ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "gui.yes"
               )
               : rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "gui.no"
               )
         );
   }

   public void BatModClient(boolean var1) {
      this.ColorChooser = var1;
      this.ButtonAction = this.BatModClient();
      this.TextField
         .BatModClient(
            this.Spinner, var1
         );
   }

   @Override
   public boolean Button(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (super.Button(var1, var2, var3)) {
         this.ColorChooser = !this.ColorChooser;
         this.ButtonAction = this.BatModClient();
         this.TextField
            .BatModClient(
               this.Spinner,
               this.ColorChooser
            );
         return true;
      } else {
         return false;
      }
   }
}
