package com.moonsworth.lunar.client.util;

public class HOCCCIICRCIIIIRHHICOCOOIICHIOR {
   public float x;
   public float y;

   public HOCCCIICRCIIIIRHHICOCOOIICHIOR() {
   }

   public HOCCCIICRCIIIIRHHICOCOOIICHIOR(float var1, float var2) {
      this.x = var1;
      this.y = var2;
   }

   public void set(float var1, float var2) {
      this.x = var1;
      this.y = var2;
   }

   public HOCCCIICRCIIIIRHHICOCOOIICHIOR CICHCCRRCHRIHOORRCOHRHRHOORHII() {
      float var1 = this.x * this.x + this.y * this.y;
      if (var1 > 0.0F) {
         var1 = 1.0F / (float)Math.sqrt(var1);
         this.x *= var1;
         this.y *= var1;
      }

      return this;
   }
}
