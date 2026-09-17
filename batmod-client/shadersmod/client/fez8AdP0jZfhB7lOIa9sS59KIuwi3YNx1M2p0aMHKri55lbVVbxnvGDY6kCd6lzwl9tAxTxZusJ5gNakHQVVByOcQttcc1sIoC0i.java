package shadersmod.client;

import org.lwjgl.opengl.ARBShaderObjects;

public class fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
   extends shadersmod.client.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV {
   private float[] BatModClient = new float[4];

   public fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i(String var1) {
      super(var1);
   }

   @Override
   protected void BatModClient() {
      this.BatModClient[0] = 0.0F;
      this.BatModClient[1] = 0.0F;
      this.BatModClient[2] = 0.0F;
      this.BatModClient[3] = 0.0F;
   }

   public void BatModClient(
      float var1, float var2, float var3, float var4
   ) {
      if (this.ButtonAction() >= 0
         && (
            this.BatModClient[0] != var1
               || this.BatModClient[1] != var2
               || this.BatModClient[2] != var3
               || this.BatModClient[3] != var4
         )) {
         ARBShaderObjects.glUniform4fARB(
            this.ButtonAction(), var1, var2, var3, var4
         );
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Spinner(
            this.Button()
         );
         this.BatModClient[0] = var1;
         this.BatModClient[1] = var2;
         this.BatModClient[2] = var3;
         this.BatModClient[3] = var4;
      }
   }

   public float[] Checkbox() {
      return this.BatModClient;
   }
}
