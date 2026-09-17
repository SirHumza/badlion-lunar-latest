import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class dnQqxPAZeW7A7Up0mHUIp0nixncRfEag0rdE0ixpoI3Tru8QP8jF0AysL66xdm3nsTCRGXInY6MGU1TEsrTgK2wZAR7iNtzJio8y {
   private static final Logger BatModClient = LogManager.getLogger();
   private int Button;
   private final int CustomSpinner;
   private final int ButtonAction;
   private final IntBuffer Spinner;
   private final FloatBuffer Checkbox;
   private final String ProgressBar;
   private boolean BatModProgressBar;
   private final TrA8vuOwmqa3Q04T2N5R7RjlgDM68DXJrz51T2QZhMLNq5jrmQV5rFnUdYfW1nh4IaNSaWSPtmlR3qKB5LF3CnZ0rnfKH84T9AQ4 ColorChooser;

   public dnQqxPAZeW7A7Up0mHUIp0nixncRfEag0rdE0ixpoI3Tru8QP8jF0AysL66xdm3nsTCRGXInY6MGU1TEsrTgK2wZAR7iNtzJio8y(
      String var1, int var2, int var3, TrA8vuOwmqa3Q04T2N5R7RjlgDM68DXJrz51T2QZhMLNq5jrmQV5rFnUdYfW1nh4IaNSaWSPtmlR3qKB5LF3CnZ0rnfKH84T9AQ4 var4
   ) {
      this.ProgressBar = var1;
      this.CustomSpinner = var3;
      this.ButtonAction = var2;
      this.ColorChooser = var4;
      if (var2 <= 3) {
         this.Spinner = BufferUtils.createIntBuffer(var3);
         this.Checkbox = null;
      } else {
         this.Spinner = null;
         this.Checkbox = BufferUtils.createFloatBuffer(var3);
      }

      this.Button = -1;
      this.CustomSpinner();
   }

   private void CustomSpinner() {
      this.BatModProgressBar = true;
      if (this.ColorChooser != null) {
         this.ColorChooser
            .Spinner();
      }
   }

   public static int BatModClient(String var0) {
      byte var1 = -1;
      if (var0.equals("int")) {
         var1 = 0;
      } else if (var0.equals("float")) {
         var1 = 4;
      } else if (var0.startsWith("matrix")) {
         if (var0.endsWith("2x2")) {
            var1 = 8;
         } else if (var0.endsWith("3x3")) {
            var1 = 9;
         } else if (var0.endsWith("4x4")) {
            var1 = 10;
         }
      }

      return var1;
   }

   public void BatModClient(int var1) {
      this.Button = var1;
   }

   public String BatModClient() {
      return this.ProgressBar;
   }

   public void BatModClient(float var1) {
      ((Buffer)this.Checkbox).position(0);
      this.Checkbox.put(0, var1);
      this.CustomSpinner();
   }

   public void BatModClient(float var1, float var2) {
      ((Buffer)this.Checkbox).position(0);
      this.Checkbox.put(0, var1);
      this.Checkbox.put(1, var2);
      this.CustomSpinner();
   }

   public void BatModClient(float var1, float var2, float var3) {
      ((Buffer)this.Checkbox).position(0);
      this.Checkbox.put(0, var1);
      this.Checkbox.put(1, var2);
      this.Checkbox.put(2, var3);
      this.CustomSpinner();
   }

   public void BatModClient(
      float var1, float var2, float var3, float var4
   ) {
      ((Buffer)this.Checkbox).position(0);
      this.Checkbox.put(var1);
      this.Checkbox.put(var2);
      this.Checkbox.put(var3);
      this.Checkbox.put(var4);
      ((Buffer)this.Checkbox).flip();
      this.CustomSpinner();
   }

   public void Button(
      float var1, float var2, float var3, float var4
   ) {
      ((Buffer)this.Checkbox).position(0);
      if (this.ButtonAction >= 4) {
         this.Checkbox.put(0, var1);
      }

      if (this.ButtonAction >= 5) {
         this.Checkbox.put(1, var2);
      }

      if (this.ButtonAction >= 6) {
         this.Checkbox.put(2, var3);
      }

      if (this.ButtonAction >= 7) {
         this.Checkbox.put(3, var4);
      }

      this.CustomSpinner();
   }

   public void BatModClient(int var1, int var2, int var3, int var4) {
      ((Buffer)this.Spinner).position(0);
      if (this.ButtonAction >= 0) {
         this.Spinner.put(0, var1);
      }

      if (this.ButtonAction >= 1) {
         this.Spinner.put(1, var2);
      }

      if (this.ButtonAction >= 2) {
         this.Spinner.put(2, var3);
      }

      if (this.ButtonAction >= 3) {
         this.Spinner.put(3, var4);
      }

      this.CustomSpinner();
   }

   public void BatModClient(float[] var1) {
      if (var1.length < this.CustomSpinner) {
         BatModClient.warn(
            "Uniform.set called with a too-small value array (expected "
               + this.CustomSpinner
               + ", got "
               + var1.length
               + "). Ignoring."
         );
      } else {
         ((Buffer)this.Checkbox).position(0);
         this.Checkbox.put(var1);
         ((Buffer)this.Checkbox).position(0);
         this.CustomSpinner();
      }
   }

   public void BatModClient(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      ((Buffer)this.Checkbox).position(0);
      this.Checkbox.put(0, var1);
      this.Checkbox.put(1, var2);
      this.Checkbox.put(2, var3);
      this.Checkbox.put(3, var4);
      this.Checkbox.put(4, var5);
      this.Checkbox.put(5, var6);
      this.Checkbox.put(6, var7);
      this.Checkbox.put(7, var8);
      this.Checkbox.put(8, var9);
      this.Checkbox.put(9, var10);
      this.Checkbox.put(10, var11);
      this.Checkbox.put(11, var12);
      this.Checkbox.put(12, var13);
      this.Checkbox.put(13, var14);
      this.Checkbox.put(14, var15);
      this.Checkbox.put(15, var16);
      this.CustomSpinner();
   }

   public void BatModClient(Matrix4f var1) {
      this.BatModClient(
         var1.m00,
         var1.m01,
         var1.m02,
         var1.m03,
         var1.m10,
         var1.m11,
         var1.m12,
         var1.m13,
         var1.m20,
         var1.m21,
         var1.m22,
         var1.m23,
         var1.m30,
         var1.m31,
         var1.m32,
         var1.m33
      );
   }

   public void Button() {
      if (!this.BatModProgressBar) {
      }

      this.BatModProgressBar = false;
      if (this.ButtonAction <= 3) {
         this.ButtonAction();
      } else if (this.ButtonAction <= 7) {
         this.Spinner();
      } else {
         if (this.ButtonAction > 10) {
            BatModClient.warn(
               "Uniform.upload called, but type value ("
                  + this.ButtonAction
                  + ") is not "
                  + "a valid type. Ignoring."
            );
            return;
         }

         this.Checkbox();
      }
   }

   private void ButtonAction() {
      switch (this.ButtonAction) {
         case 0:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.BatModClient(
               this.Button,
               this.Spinner
            );
            break;
         case 1:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Button(
               this.Button,
               this.Spinner
            );
            break;
         case 2:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.CustomSpinner(
               this.Button,
               this.Spinner
            );
            break;
         case 3:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ButtonAction(
               this.Button,
               this.Spinner
            );
            break;
         default:
            BatModClient.warn(
               "Uniform.upload called, but count value ("
                  + this.CustomSpinner
                  + ") is "
                  + " not in the range of 1 to 4. Ignoring."
            );
      }
   }

   private void Spinner() {
      switch (this.ButtonAction) {
         case 4:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.BatModClient(
               this.Button,
               this.Checkbox
            );
            break;
         case 5:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Button(
               this.Button,
               this.Checkbox
            );
            break;
         case 6:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.CustomSpinner(
               this.Button,
               this.Checkbox
            );
            break;
         case 7:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ButtonAction(
               this.Button,
               this.Checkbox
            );
            break;
         default:
            BatModClient.warn(
               "Uniform.upload called, but count value ("
                  + this.CustomSpinner
                  + ") is "
                  + "not in the range of 1 to 4. Ignoring."
            );
      }
   }

   private void Checkbox() {
      switch (this.ButtonAction) {
         case 8:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.BatModClient(
               this.Button,
               true,
               this.Checkbox
            );
            break;
         case 9:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Button(
               this.Button,
               true,
               this.Checkbox
            );
            break;
         case 10:
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.CustomSpinner(
               this.Button,
               true,
               this.Checkbox
            );
      }
   }
}
