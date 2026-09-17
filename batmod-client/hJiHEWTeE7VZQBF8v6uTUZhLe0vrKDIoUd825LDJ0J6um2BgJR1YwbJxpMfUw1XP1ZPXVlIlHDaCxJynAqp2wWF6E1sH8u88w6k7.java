public class hJiHEWTeE7VZQBF8v6uTUZhLe0vrKDIoUd825LDJ0J6um2BgJR1YwbJxpMfUw1XP1ZPXVlIlHDaCxJynAqp2wWF6E1sH8u88w6k7 {
   public final byte[] BatModClient;
   private final int Button;
   private final int CustomSpinner;

   public hJiHEWTeE7VZQBF8v6uTUZhLe0vrKDIoUd825LDJ0J6um2BgJR1YwbJxpMfUw1XP1ZPXVlIlHDaCxJynAqp2wWF6E1sH8u88w6k7(byte[] var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var2 + 4;
   }

   public int BatModClient(int var1, int var2, int var3) {
      int var4 = var1 << this.CustomSpinner
         | var3 << this.Button
         | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0
         ? this.BatModClient[var5] & 15
         : this.BatModClient[var5] >> 4 & 15;
   }
}
