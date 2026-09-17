public enum PKG774Rk7EDVwT9baoMmgOfDZj2rlikPVfG5zybZbhuULhFCIi4z7kF8Ajj7VX1JfUpV0yUmSLRvhkzRwhSfTjhowF0LIE5Dx4m4 {
   BatModClient(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.menu"), 20, 600
   ),
   Button(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.game"), 12000, 24000
   ),
   CustomSpinner(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.game.creative"), 1200, 3600
   ),
   ButtonAction(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.game.end.credits"),
      Integer.MAX_VALUE,
      Integer.MAX_VALUE
   ),
   Spinner(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.game.nether"), 1200, 3600
   ),
   Checkbox(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.game.end.dragon"), 0, 0
   ),
   ProgressBar(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("minecraft:music.game.end"), 6000, 24000
   );

   private final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModProgressBar;
   private final int ColorChooser;
   private final int IntegerSpinner;

   PKG774Rk7EDVwT9baoMmgOfDZj2rlikPVfG5zybZbhuULhFCIi4z7kF8Ajj7VX1JfUpV0yUmSLRvhkzRwhSfTjhowF0LIE5Dx4m4(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var3, int var4, int var5
   ) {
      this.BatModProgressBar = var3;
      this.ColorChooser = var4;
      this.IntegerSpinner = var5;
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient() {
      return this.BatModProgressBar;
   }

   public int Button() {
      return this.ColorChooser;
   }

   public int CustomSpinner() {
      return this.IntegerSpinner;
   }
}
