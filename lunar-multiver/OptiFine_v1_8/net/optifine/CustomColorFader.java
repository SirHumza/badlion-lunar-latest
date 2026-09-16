package net.optifine;

public class CustomColorFader {
   private aui color = null;
   private long timeUpdate = System.currentTimeMillis();

   public aui getColor(double x, double y, double z) {
      if (this.color == null) {
         this.color = new aui(x, y, z);
         return this.color;
      }

      long timeNow = System.currentTimeMillis();
      long timeDiff = timeNow - this.timeUpdate;
      if (timeDiff == 0L) {
         return this.color;
      }

      this.timeUpdate = timeNow;
      if (Math.abs(x - this.color.a) < 0.004 && Math.abs(y - this.color.b) < 0.004 && Math.abs(z - this.color.c) < 0.004) {
         return this.color;
      }

      double k = timeDiff * 0.001;
      k = Config.limit(k, 0.0, 1.0);
      double dx = x - this.color.a;
      double dy = y - this.color.b;
      double dz = z - this.color.c;
      double xn = this.color.a + dx * k;
      double yn = this.color.b + dy * k;
      double zn = this.color.c + dz * k;
      this.color = new aui(xn, yn, zn);
      return this.color;
   }
}
