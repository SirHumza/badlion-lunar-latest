package shadersmod.client;

import org.lwjgl.opengl.ARBShaderObjects;

public abstract class ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV {
   private String BatModClient;
   private int Button = -1;
   private int CustomSpinner = -1;

   public ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV(String var1) {
      this.BatModClient = var1;
   }

   public void BatModClient(int var1) {
      if (this.Button != var1) {
         this.Button = var1;
         this.CustomSpinner = ARBShaderObjects.glGetUniformLocationARB(
            var1, this.BatModClient
         );
         this.BatModClient();
      }
   }

   protected abstract void BatModClient();

   public String Button() {
      return this.BatModClient;
   }

   public int CustomSpinner() {
      return this.Button;
   }

   public int ButtonAction() {
      return this.CustomSpinner;
   }

   public boolean Spinner() {
      return this.CustomSpinner >= 0;
   }
}
