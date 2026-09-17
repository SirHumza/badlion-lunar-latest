import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

class uxgHDcIBxH79jIkWHiKLqm9BWrKc3y5hiNKrHJPHLD3i1iPzSWhyyQrD5tDzaKc06K3DWjUyygPYQSUOYRIpt6MjaBLkWp3iSbLI implements FutureCallback {
   uxgHDcIBxH79jIkWHiKLqm9BWrKc3y5hiNKrHJPHLD3i1iPzSWhyyQrD5tDzaKc06K3DWjUyygPYQSUOYRIpt6MjaBLkWp3iSbLI(
      CbObeQLYxAMWk6v1eXx4q28XmeQdfaLSGr1rGnk8ScyDNMMgaCRkwLn7YXWVobebhmaxTZYYKtmgVqEcxaJ9nbSLRHK2OCEyP2Wr var1, File var2, SettableFuture var3
   ) {
      this.CustomSpinner = var1;
      this.BatModClient = var2;
      this.Button = var3;
   }

   public void onSuccess(Object var1) {
      this.CustomSpinner
         .BatModClient(
            this.BatModClient
         );
      this.Button.set(null);
   }

   public void onFailure(Throwable var1) {
      this.Button.setException(var1);
   }
}
