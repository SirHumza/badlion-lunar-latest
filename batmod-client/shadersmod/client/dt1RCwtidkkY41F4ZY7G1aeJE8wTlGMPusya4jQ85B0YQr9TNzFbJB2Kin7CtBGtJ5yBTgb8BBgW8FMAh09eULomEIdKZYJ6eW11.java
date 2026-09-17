package shadersmod.client;

import org.lwjgl.opengl.ARBShaderObjects;

public class dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11
   extends shadersmod.client.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV {
   private int BatModClient = -1;

   public dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11(String var1) {
      super(var1);
   }

   @Override
   protected void BatModClient() {
      this.BatModClient = -1;
   }

   public void Button(int var1) {
      if (this.ButtonAction() >= 0
         && this.BatModClient != var1) {
         ARBShaderObjects.glUniform1iARB(this.ButtonAction(), var1);
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Spinner(
            this.Button()
         );
         this.BatModClient = var1;
      }
   }

   public int Checkbox() {
      return this.BatModClient;
   }
}
