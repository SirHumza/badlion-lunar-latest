import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Atr3xY8UipJLSVfIMPnLBqzu2R0RJ3TteBZqRMfO7qrTkPxwpxvrj2fN6TNeT92WYvWhLQeg7OprHfVJ4CtDmTiTwKnhzJp150fx {
   private static final ExecutorService BatModClient = new ThreadPoolExecutor(
      0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<>()
   );
   private final falnvbnON9Yos1uc5Fb8Ya024Nj6kT8CIeZPcJ2aRWmnl3ydNppGk0tR5f0fVfO8Hx5dYDe9saJ4vN81axRqHk1dN0O0Np0uRlke Button;
   private final File CustomSpinner;
   private final MinecraftSessionService ButtonAction;
   private final LoadingCache Spinner;

   public Atr3xY8UipJLSVfIMPnLBqzu2R0RJ3TteBZqRMfO7qrTkPxwpxvrj2fN6TNeT92WYvWhLQeg7OprHfVJ4CtDmTiTwKnhzJp150fx(
      falnvbnON9Yos1uc5Fb8Ya024Nj6kT8CIeZPcJ2aRWmnl3ydNppGk0tR5f0fVfO8Hx5dYDe9saJ4vN81axRqHk1dN0O0Np0uRlke var1, File var2, MinecraftSessionService var3
   ) {
      this.Button = var1;
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
      this.Spinner = CacheBuilder.newBuilder()
         .expireAfterAccess(15L, TimeUnit.SECONDS)
         .build(new UsZWwOVFWWgGtOZsqVOdWF0H93di6pi9HYcziZCCVpb9OUmP93qURNsecMr7h1DDN3CsIFiBYo0VU4Yld11zMEnXuVOPoobJjjKO(this));
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient(
      MinecraftProfileTexture var1, Type var2
   ) {
      return this.BatModClient(
         var1, var2, (tCJ41aSmSXoiOYvQ3DRtQh1eMoJTpivGF84Qfu2WLaAHZSV1wh3qoU5fQdnb7BWbb5LEoYNA18wi16B8Q5mZ5sfl2rSlMOvnCOnw)null
      );
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient(
      MinecraftProfileTexture var1, Type var2, tCJ41aSmSXoiOYvQ3DRtQh1eMoJTpivGF84Qfu2WLaAHZSV1wh3qoU5fQdnb7BWbb5LEoYNA18wi16B8Q5mZ5sfl2rSlMOvnCOnw var3
   ) {
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var4 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "skins/" + var1.getHash()
      );
      sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc var5 = this.Button
         .Button(var4);
      if (var5 != null) {
         if (var3 != null) {
            var3.skinAvailable(var2, var4, var1);
         }
      } else {
         File var6 = new File(
            this.CustomSpinner,
            var1.getHash().length() > 2 ? var1.getHash().substring(0, 2) : "xx"
         );
         File var7 = new File(var6, var1.getHash());
         net.minecraft.client.renderer.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY var8 = var2
               == Type.SKIN
            ? new net.minecraft.client.renderer.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY()
            : null;
         net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var9 = new net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR(
            var7,
            var1.getUrl(),
            L4uaVMCd3oGSH0oCjM3VDqaD9VO3BiV9lih4UOOYQ3zS9zoArGhufbuPZuU1skykagKo9dxU6loDnqdolcTTJAvcLcmbD5ukewav.BatModClient(),
            new uA9lSv60OpI4J5wO3Tt2YBp8uEOKbGTiYrRwGNvRztmvwwsyR8pCrwOP5k7LBo1xpMk3PtYrg5vtLai5AOJoijoj758tKhbRI9c6(this, var8, var3, var2, var4, var1)
         );
         this.Button
            .BatModClient(var4, var9);
      }

      return var4;
   }

   public void BatModClient(
      GameProfile var1, tCJ41aSmSXoiOYvQ3DRtQh1eMoJTpivGF84Qfu2WLaAHZSV1wh3qoU5fQdnb7BWbb5LEoYNA18wi16B8Q5mZ5sfl2rSlMOvnCOnw var2, boolean var3
   ) {
      BatModClient.submit(
         new vG3I2BpGBn2vgRER2Hoprqe2GssyJ6Nkm13XlIamLWqVMxBYdSFdn18QG022OuTr0zHSyi9gkT1dqNQ9h3AwB18bURQQF9XH36X(this, var1, var3, var2)
      );
   }

   public Map BatModClient(GameProfile var1) {
      return (Map)this.Spinner.getUnchecked(var1);
   }
}
