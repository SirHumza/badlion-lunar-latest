package net.minecraft.client.renderer;

import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP implements Callable {
   private static final String ButtonAction = "CL_00000950";

   z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP(EntityRenderer var1, int var2, int var3) {
      this.CustomSpinner = var1;
      this.BatModClient = var2;
      this.Button = var3;
   }

   public String BatModClient() {
      return String.format(
         "Scaled: (%d, %d). Absolute: (%d, %d)",
         this.BatModClient,
         this.Button,
         Mouse.getX(),
         Mouse.getY()
      );
   }
}
