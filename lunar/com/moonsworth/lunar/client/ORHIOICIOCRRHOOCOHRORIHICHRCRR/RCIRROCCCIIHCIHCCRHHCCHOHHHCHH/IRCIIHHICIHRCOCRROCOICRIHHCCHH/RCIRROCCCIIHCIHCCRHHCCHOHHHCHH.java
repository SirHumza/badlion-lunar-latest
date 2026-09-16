package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   LINEAR("linear") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH.lerp(var1, var2, var3);
      }
   },
   QUAD_IN("quad_in") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         return var1 + (var2 - var1) * var3 * var3;
      }
   },
   QUAD_OUT("quad_out") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         return var1 - (var2 - var1) * var3 * (var3 - 2.0F);
      }
   },
   QUAD_INOUT("quad_inout") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         var3 *= 2.0F;
         if (var3 < 1.0F) {
            return var1 + (var2 - var1) / 2.0F * var3 * var3;
         }

         var3--;
         return var1 - (var2 - var1) / 2.0F * (var3 * (var3 - 2.0F) - 1.0F);
      }
   },
   CUBIC_IN("cubic_in") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         return var1 + (var2 - var1) * var3 * var3 * var3;
      }
   },
   CUBIC_OUT("cubic_out") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         var3--;
         return var1 + (var2 - var1) * (var3 * var3 * var3 + 1.0F);
      }
   },
   CUBIC_INOUT("cubic_inout") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         var3 *= 2.0F;
         if (var3 < 1.0F) {
            return var1 + (var2 - var1) / 2.0F * var3 * var3 * var3;
         }

         var3 -= 2.0F;
         return var1 + (var2 - var1) / 2.0F * (var3 * var3 * var3 + 2.0F);
      }
   },
   EXP_IN("exp_in") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         return var1 + (var2 - var1) * (float)Math.pow(2.0, 10.0F * (var3 - 1.0F));
      }
   },
   EXP_OUT("exp_out") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         return var1 + (var2 - var1) * (float)(-Math.pow(2.0, -10.0F * var3) + 1.0);
      }
   },
   EXP_INOUT("exp_inout") {
      @Override
      public float interpolate(float var1, float var2, float var3) {
         if (var3 == 0.0F) {
            return var1;
         }

         if (var3 == 1.0F) {
            return var2;
         }

         var3 *= 2.0F;
         if (var3 < 1.0F) {
            return var1 + (var2 - var1) / 2.0F * (float)Math.pow(2.0, 10.0F * (var3 - 1.0F));
         }

         var3--;
         return var1 + (var2 - var1) / 2.0F * (float)(-Math.pow(2.0, -10.0F * var3) + 2.0);
      }
   };

   public final String key;

   public abstract float interpolate(float var1, float var2, float var3);

   public String getName() {
      return "mclib.interpolations." + this.key;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3) {
      this.key = var3;
   }
}
