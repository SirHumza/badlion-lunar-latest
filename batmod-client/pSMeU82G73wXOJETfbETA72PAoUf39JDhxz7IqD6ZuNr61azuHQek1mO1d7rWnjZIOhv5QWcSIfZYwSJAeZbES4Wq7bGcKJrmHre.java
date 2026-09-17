public class pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre {
   public static final pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre BatModClient = new UDXNk68Zj0mP3i9ob9IJNZ0kDP6xcmgXimg9gXoNtDM2Pas2XuBLdGPUPf1sRj3eTXC0ab4S0GmSFsi0UZXji84F0rzixSni8mF2(
      0L
   );
   private final long Button;
   private long CustomSpinner;

   public pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre(long var1) {
      this.Button = var1;
   }

   public void BatModClient(long var1) {
      this.CustomSpinner += var1 / 8L;
      if (this.CustomSpinner
         > this.Button) {
         throw new RuntimeException(
            "Tried to read NBT tag that was too big; tried to allocate: "
               + this.CustomSpinner
               + "bytes where max allowed: "
               + this.Button
         );
      }
   }
}
