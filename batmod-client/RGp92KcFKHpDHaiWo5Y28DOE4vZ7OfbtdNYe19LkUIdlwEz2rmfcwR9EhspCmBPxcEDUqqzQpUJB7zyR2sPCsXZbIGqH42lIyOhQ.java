public class RGp92KcFKHpDHaiWo5Y28DOE4vZ7OfbtdNYe19LkUIdlwEz2rmfcwR9EhspCmBPxcEDUqqzQpUJB7zyR2sPCsXZbIGqH42lIyOhQ
   extends l4aKZYxvxMw2fci0nI6ETMviA2t0pHfj8vm7BK8qhJNotEJJbatsAXs9drWQaOmzvbM4dv2DwowpVJ6gr0ggT2jKAJBdD02ONoDk {
   public RGp92KcFKHpDHaiWo5Y28DOE4vZ7OfbtdNYe19LkUIdlwEz2rmfcwR9EhspCmBPxcEDUqqzQpUJB7zyR2sPCsXZbIGqH42lIyOhQ(
      B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R var1,
      B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R var2
   ) {
      super("player_combat");
      this.BatModClient("player", var1.C_());
      if (var2 != null) {
         this.BatModClient("primary_opponent", var2.C_());
      }

      if (var2 != null) {
         this.BatModClient(
            "Combat between " + var1.C_() + " and " + var2.C_()
         );
      } else {
         this.BatModClient(
            "Combat between " + var1.C_() + " and others"
         );
      }
   }
}
