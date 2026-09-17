import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

final class SdGWOUC439PXbgLlRW4CLKvwMEX06Ldc7Hs7lVWC93kYxE3qGcjkw2VStrTtpRWamXr8qtqTrzt6gyvnQxmt1Gn3U1birAeUMj extends ForkJoinWorkerThread {
   SdGWOUC439PXbgLlRW4CLKvwMEX06Ldc7Hs7lVWC93kYxE3qGcjkw2VStrTtpRWamXr8qtqTrzt6gyvnQxmt1Gn3U1birAeUMj(ForkJoinPool var1) {
      super(var1);
   }

   @Override
   protected void onTermination(Throwable var1) {
      if (var1 != null) {
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
            .warn("{} died", new Object[]{this.getName(), var1});
      } else {
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ColorChooser()
            .debug("{} shutdown", new Object[]{this.getName()});
      }

      super.onTermination(var1);
   }
}
