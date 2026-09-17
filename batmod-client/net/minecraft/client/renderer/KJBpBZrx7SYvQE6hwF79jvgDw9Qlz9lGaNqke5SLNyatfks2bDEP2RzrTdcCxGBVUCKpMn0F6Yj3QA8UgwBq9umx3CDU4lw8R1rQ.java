package net.minecraft.client.renderer;

import org.lwjgl.opengl.GL11;

class KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ {
   private final int BatModClient;
   private boolean Button = false;
   private static final String CustomSpinner = "CL_00002554";

   public KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ(int var1) {
      this.BatModClient = var1;
   }

   public void BatModClient() {
      this.BatModClient(false);
   }

   public void Button() {
      this.BatModClient(true);
   }

   public void BatModClient(boolean var1) {
      if (var1 != this.Button) {
         this.Button = var1;
         if (var1) {
            GL11.glEnable(this.BatModClient);
         } else {
            GL11.glDisable(this.BatModClient);
         }
      }
   }
}
