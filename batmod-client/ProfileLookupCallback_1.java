import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

final class NQLcwS8k0pLcRVmSFagKISyVXcUfauhO45vTfDK2ptOdvyBwRPnZ0LWt8o02WrKqau3oXtCv26ZuD1J8TzS6jvtPu3h33ZS2VBP7 implements ProfileLookupCallback {
   NQLcwS8k0pLcRVmSFagKISyVXcUfauhO45vTfDK2ptOdvyBwRPnZ0LWt8o02WrKqau3oXtCv26ZuD1J8TzS6jvtPu3h33ZS2VBP7(GameProfile[] var1) {
      this.BatModClient = var1;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.BatModClient[0] = var1;
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.BatModClient[0] = null;
   }
}
