public class QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06
   extends tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5 {
   private boolean Checkbox = false;

   public QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06(float var1, float var2) {
      super(var1, var2 / 2.0F, 1.0F);
   }

   public double BatModClient() {
      if (this.Button
         <= this.ButtonAction) {
         this.Checkbox = false;
      }

      if (this.ButtonAction <= 0.0F) {
         this.Checkbox = true;
      }

      float var1 = this.ButtonAction
         / this.Button;
      double var2 = Math.pow(var1, 2.5);
      return var2 / (var2 + Math.pow(1.0F - var1, 2.5));
   }

   public void Button() {
      this.BatModClient(
         this.Checkbox
      );
   }
}
