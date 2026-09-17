package shadersmod.client;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA {
   public int BatModClient = GL11.glGenTextures();
   public int Button = 15;

   public aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(int var1, int var2) {
      byte[] var3 = this.BatModClient(var1, var2);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var3.length);
      var4.put(var3);
      ((Buffer)var4).flip();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         this.BatModClient
      );
      GL11.glTexImage2D(3553, 0, 6407, var1, var2, 0, 6407, 5121, var4);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         0
      );
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public void Button() {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModProgressBar(
         this.BatModClient
      );
      this.BatModClient = 0;
   }

   private int BatModClient(int var1) {
      var1 ^= var1 << 13;
      var1 ^= var1 >> 17;
      return var1 ^ var1 << 5;
   }

   private byte BatModClient(int var1, int var2, int var3) {
      int var4 = (
               this.BatModClient(var1)
                  + this.BatModClient(var2 * 19)
            )
            * this.BatModClient(var3 * 23)
         - var3;
      return (byte)(this.BatModClient(var4) % 128);
   }

   private byte[] BatModClient(int var1, int var2) {
      byte[] var3 = new byte[var1 * var2 * 3];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 1; var7 < 4; var7++) {
               var3[var4++] = this.BatModClient(var6, var5, var7);
            }
         }
      }

      return var3;
   }
}
