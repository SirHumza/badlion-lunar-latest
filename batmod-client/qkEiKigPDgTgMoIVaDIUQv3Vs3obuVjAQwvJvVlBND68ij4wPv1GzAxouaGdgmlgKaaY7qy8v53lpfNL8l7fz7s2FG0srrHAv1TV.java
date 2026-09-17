public class qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV {
   private byte BatModClient;
   private byte Button;
   private byte CustomSpinner;
   private byte ButtonAction;

   public qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV(byte var1, byte var2, byte var3, byte var4) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   public qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV(
      qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV var1
   ) {
      this.BatModClient = var1.BatModClient;
      this.Button = var1.Button;
      this.CustomSpinner = var1.CustomSpinner;
      this.ButtonAction = var1.ButtonAction;
   }

   public byte BatModClient() {
      return this.BatModClient;
   }

   public byte Button() {
      return this.Button;
   }

   public byte CustomSpinner() {
      return this.CustomSpinner;
   }

   public byte ButtonAction() {
      return this.ButtonAction;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV)) {
         return false;
      }

      qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV var2 = (qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV)var1;
      return this.BatModClient
            != var2.BatModClient
         ? false
         : (
            this.ButtonAction
                  != var2.ButtonAction
               ? false
               : (
                  this.Button
                        != var2.Button
                     ? false
                     : this.CustomSpinner
                        == var2.CustomSpinner
               )
         );
   }

   @Override
   public int hashCode() {
      int var1 = this.BatModClient;
      var1 = 31 * var1 + this.Button;
      var1 = 31 * var1 + this.CustomSpinner;
      return 31 * var1 + this.ButtonAction;
   }
}
