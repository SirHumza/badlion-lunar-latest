import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.util.vector.Vector3f;

public class aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM {
   public final Vector3f BatModClient;
   public final Vector3f Button;
   public final Map CustomSpinner;
   public final J7IQIDkJBXDmohBfxy4U1H2qA5ond7mZMkgbkJwUgi44g83SruSZFpdl4U63pLROuvdB8tA8Gji4lbm7QsQrZIMY3X4khPsPwsKz ButtonAction;
   public final boolean Spinner;

   public aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM(
      Vector3f var1,
      Vector3f var2,
      Map var3,
      J7IQIDkJBXDmohBfxy4U1H2qA5ond7mZMkgbkJwUgi44g83SruSZFpdl4U63pLROuvdB8tA8Gji4lbm7QsQrZIMY3X4khPsPwsKz var4,
      boolean var5
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.BatModClient();
   }

   private void BatModClient() {
      for (Entry var2 : this.CustomSpinner.entrySet()) {
         float[] var3 = this.BatModClient(
            (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn)var2.getKey()
         );
         ((q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3)var2.getValue())
            .Spinner
            .BatModClient(var3);
      }
   }

   private float[] BatModClient(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1
   ) {
      float[] var2;
      switch (var1) {
         case BatModClient:
         case Button:
            var2 = new float[]{
               this.BatModClient.x,
               this.BatModClient.z,
               this.Button.x,
               this.Button.z
            };
            break;
         case CustomSpinner:
         case ButtonAction:
            var2 = new float[]{
               this.BatModClient.x,
               16.0F - this.Button.y,
               this.Button.x,
               16.0F - this.BatModClient.y
            };
            break;
         case Spinner:
         case Checkbox:
            var2 = new float[]{
               this.BatModClient.z,
               16.0F - this.Button.y,
               this.Button.z,
               16.0F - this.BatModClient.y
            };
            break;
         default:
            throw new NullPointerException();
      }

      return var2;
   }
}
