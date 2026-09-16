package com.moonsworth.lunar.client.util;

import java.nio.IntBuffer;
import org.joml.Vector3f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL15;

public final class HRCOCHHHCCIORCORCHIOOOCCCCHICH {
   public static final float[] CCIRHIIOORHOHHOCOIIHRHHOCOCHHH = new float[]{
      0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
   };
   public static final int[] RRRRHROICRHHHHCROIOOHIIHRIHORI = new int[]{0, 3, 2, 2, 1, 0};
   public static int ICCCRHIRCHHIIOIHCHROIHCCRRCCIC = 0;

   public static void ROICIIOIOCORRORCIRIIRHHRHIIIHC() {
      if (ICCCRHIRCHHIIOIHCHROIHCCRRCCIC == 0) {
         ICCCRHIRCHHIIOIHCHROIHCCRRCCIC = GL15.glGenBuffers();
         IntBuffer var0 = BufferUtils.createIntBuffer(RRRRHROICRHHHHCROIOOHIIHRIHORI.length);
         var0.put(RRRRHROICRHHHHCROIOOHIIHRIHORI);
         var0.flip();
         GL15.glBindBuffer(34963, ICCCRHIRCHHIIOIHCHROIHCCRRCCIC);
         GL15.glBufferData(34963, var0, 35044);
      }
   }

   public static float lerp(float var0, float var1, float var2) {
      return var0 + var2 * (var1 - var0);
   }

   public static float ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(float var0, float var1, float var2) {
      return Math.abs(var1 - var0) < Float.MIN_VALUE ? var0 : (var2 - var0) / (var1 - var0);
   }

   public static float[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 1.0F / var2;
      float var8 = 1.0F / var3;
      float var9 = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(0.0F, var7, (float)var0 / var2);
      float var10 = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(0.0F, var7, (float)(var0 + var4) / var2);
      float var11 = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(0.0F, var8, (float)var1 / var3);
      float var12 = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(0.0F, var8, (float)(var1 + var5) / var3);
      return new float[]{
         lerp(var9, var10, 0.0F) / var2,
         lerp(var11, var12, 1.0F) / var3,
         lerp(var9, var10, 1.0F) / var2,
         lerp(var11, var12, 1.0F) / var3,
         lerp(var9, var10, 1.0F) / var2,
         lerp(var11, var12, 0.0F) / var3,
         lerp(var9, var10, 0.0F) / var2,
         lerp(var11, var12, 0.0F) / var3
      };
   }

   public static Vector3f[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(Vector3f var0, Vector3f var1) {
      return new Vector3f[]{
         new Vector3f(var1.x, var0.y, var1.z),
         new Vector3f(var0.x, var0.y, var1.z),
         new Vector3f(var0.x, var1.y, var1.z),
         new Vector3f(var1.x, var1.y, var1.z),
         new Vector3f(var1.x, var0.y, var0.z),
         new Vector3f(var0.x, var0.y, var0.z),
         new Vector3f(var0.x, var0.y, var1.z),
         new Vector3f(var1.x, var0.y, var1.z),
         new Vector3f(var1.x, var1.y, var1.z),
         new Vector3f(var0.x, var1.y, var1.z),
         new Vector3f(var0.x, var1.y, var0.z),
         new Vector3f(var1.x, var1.y, var0.z),
         new Vector3f(var0.x, var0.y, var1.z),
         new Vector3f(var0.x, var0.y, var0.z),
         new Vector3f(var0.x, var1.y, var0.z),
         new Vector3f(var0.x, var1.y, var1.z),
         new Vector3f(var1.x, var0.y, var0.z),
         new Vector3f(var1.x, var0.y, var1.z),
         new Vector3f(var1.x, var1.y, var1.z),
         new Vector3f(var1.x, var1.y, var0.z),
         new Vector3f(var0.x, var0.y, var0.z),
         new Vector3f(var1.x, var0.y, var0.z),
         new Vector3f(var1.x, var1.y, var0.z),
         new Vector3f(var0.x, var1.y, var0.z)
      };
   }

   private HRCOCHHHCCIORCORCHIOOOCCCCHICH() {
   }
}
