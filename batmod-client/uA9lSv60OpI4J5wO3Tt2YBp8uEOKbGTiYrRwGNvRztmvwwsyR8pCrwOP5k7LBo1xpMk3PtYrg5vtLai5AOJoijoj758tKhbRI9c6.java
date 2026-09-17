import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;

class uA9lSv60OpI4J5wO3Tt2YBp8uEOKbGTiYrRwGNvRztmvwwsyR8pCrwOP5k7LBo1xpMk3PtYrg5vtLai5AOJoijoj758tKhbRI9c6
   implements net.minecraft.client.renderer.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj {
   uA9lSv60OpI4J5wO3Tt2YBp8uEOKbGTiYrRwGNvRztmvwwsyR8pCrwOP5k7LBo1xpMk3PtYrg5vtLai5AOJoijoj758tKhbRI9c6(
      Atr3xY8UipJLSVfIMPnLBqzu2R0RJ3TteBZqRMfO7qrTkPxwpxvrj2fN6TNeT92WYvWhLQeg7OprHfVJ4CtDmTiTwKnhzJp150fx var1,
      net.minecraft.client.renderer.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj var2,
      tCJ41aSmSXoiOYvQ3DRtQh1eMoJTpivGF84Qfu2WLaAHZSV1wh3qoU5fQdnb7BWbb5LEoYNA18wi16B8Q5mZ5sfl2rSlMOvnCOnw var3,
      Type var4,
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5,
      MinecraftProfileTexture var6
   ) {
      this.Checkbox = var1;
      this.BatModClient = var2;
      this.Button = var3;
      this.CustomSpinner = var4;
      this.ButtonAction = var5;
      this.Spinner = var6;
   }

   @Override
   public BufferedImage BatModClient(BufferedImage var1) {
      if (this.BatModClient != null) {
         var1 = this.BatModClient
            .BatModClient(var1);
      }

      return var1;
   }

   @Override
   public void BatModClient() {
      if (this.BatModClient != null) {
         this.BatModClient
            .BatModClient();
      }

      if (this.Button != null) {
         this.Button
            .skinAvailable(
               this.CustomSpinner,
               this.ButtonAction,
               this.Spinner
            );
      }
   }
}
