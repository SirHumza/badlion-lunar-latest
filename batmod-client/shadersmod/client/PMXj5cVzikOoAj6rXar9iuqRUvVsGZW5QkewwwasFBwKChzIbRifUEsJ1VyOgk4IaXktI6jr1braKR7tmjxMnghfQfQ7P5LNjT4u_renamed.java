package shadersmod.client;

public class ButtonAction {
   private int BatModClient = -1;
   private String Button = null;
   private sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc CustomSpinner = null;

   public ButtonAction(
      int var1, String var2, sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public String Button() {
      return this.Button;
   }

   public sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc CustomSpinner() {
      return this.CustomSpinner;
   }

   @Override
   public String toString() {
      return "textureUnit: "
         + this.BatModClient
         + ", path: "
         + this.Button
         + ", glTextureId: "
         + this.CustomSpinner.c_();
   }
}
