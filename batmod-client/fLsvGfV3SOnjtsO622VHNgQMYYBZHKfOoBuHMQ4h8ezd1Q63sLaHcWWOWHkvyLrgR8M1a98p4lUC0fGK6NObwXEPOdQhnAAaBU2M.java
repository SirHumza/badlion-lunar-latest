public class fLsvGfV3SOnjtsO622VHNgQMYYBZHKfOoBuHMQ4h8ezd1Q63sLaHcWWOWHkvyLrgR8M1a98p4lUC0fGK6NObwXEPOdQhnAAaBU2M {
   private final jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi BatModClient;
   private final float Button;

   public fLsvGfV3SOnjtsO622VHNgQMYYBZHKfOoBuHMQ4h8ezd1Q63sLaHcWWOWHkvyLrgR8M1a98p4lUC0fGK6NObwXEPOdQhnAAaBU2M(
      jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi var1, long var2, long var4, float var6
   ) {
      this.BatModClient = var1;
      this.Button = this.BatModClient(
         var1, var2, var4, var6
      );
   }

   public float BatModClient() {
      return this.Button;
   }

   public float Button() {
      return this.Button < 2.0F
         ? 0.0F
         : (
            this.Button > 4.0F
               ? 1.0F
               : (this.Button - 2.0F) / 2.0F
         );
   }

   private float BatModClient(
      jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi var1, long var2, long var4, float var6
   ) {
      if (var1
         == jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.BatModClient
         )
       {
         return 0.0F;
      }

      boolean var7 = var1
         == jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.ButtonAction;
      float var8 = 0.75F;
      float var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            ((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F
         )
         * 0.25F;
      var8 += var9;
      float var10 = 0.0F;
      var10 += u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            (float)var4 / 3600000.0F, 0.0F, 1.0F
         )
         * (var7 ? 1.0F : 0.75F);
      var10 += u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var6 * 0.25F, 0.0F, var9
      );
      if (var1
         == jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.Button
         )
       {
         var10 *= 0.5F;
      }

      var8 += var10;
      return var1.BatModClient() * var8;
   }
}
