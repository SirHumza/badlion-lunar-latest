import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class cxcE8GxXZbqKxssg8vl5L7KfydWYJTr2MQB1Ep9nWbJw1rKKCqoiv47pf2Ln2TeGFr0CRgm3uoCsPPRsCJKhC4vHKxDYWFCuQtzp {
   private static final Logger BatModClient = LogManager.getLogger();
   private static final ThreadFactory Button = new ThreadFactoryBuilder()
      .setNameFormat("Chunk Batcher %d")
      .setDaemon(true)
      .build();
   private final List CustomSpinner = Lists.newArrayList();
   private final BlockingQueue ButtonAction = Queues.newArrayBlockingQueue(
      100
   );
   private final BlockingQueue Spinner = Queues.newArrayBlockingQueue(
      5
   );
   private final net.minecraft.client.renderer.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 Checkbox = new net.minecraft.client.renderer.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1();
   private final net.minecraft.client.renderer.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n ProgressBar = new net.minecraft.client.renderer.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n();
   private final Queue BatModProgressBar = Queues.newArrayDeque();
   private final OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7 ColorChooser;

   public cxcE8GxXZbqKxssg8vl5L7KfydWYJTr2MQB1Ep9nWbJw1rKKCqoiv47pf2Ln2TeGFr0CRgm3uoCsPPRsCJKhC4vHKxDYWFCuQtzp() {
      for (int var1 = 0; var1 < 2; var1++) {
         OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7 var2 = new OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7(
            this
         );
         Thread var3 = Button.newThread(var2);
         var3.start();
         this.CustomSpinner.add(var2);
      }

      for (int var4 = 0; var4 < 5; var4++) {
         this.Spinner
            .add(new net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF());
      }

      this.ColorChooser = new OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7(
         this, new net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
      );
   }

   public String BatModClient() {
      return String.format(
         "pC: %03d, pU: %1d, aB: %1d",
         this.ButtonAction.size(),
         this.BatModProgressBar.size(),
         this.Spinner.size()
      );
   }

   public boolean BatModClient(long var1) {
      boolean var3 = false;

      long var8;
      do {
         boolean var4 = false;
         synchronized (this.BatModProgressBar) {
            if (!this.BatModProgressBar.isEmpty()) {
               ((ListenableFutureTask)this.BatModProgressBar.poll()).run();
               var4 = true;
               var3 = true;
            }
         }

         if (var1 == 0L || !var4) {
            break;
         }

         var8 = var1 - System.nanoTime();
      } while (var8 >= 0L);

      return var3;
   }

   public boolean BatModClient(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      var1.CustomSpinner().lock();

      boolean var2;
      try {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var3 = var1.ButtonAction();
         var3.BatModClient(
            new lYcO2k2DOJsfyX8RT0c8koKRbtjTtFRF1HGnlHYZi2lRlCPrEJw7yAAJ2RZFK01TtXLK3zEaDZE1GZPWffhaXIhc06yWVNiJuzrR(this, var3)
         );
         boolean var4 = this.ButtonAction.offer(var3);
         if (!var4) {
            var3.Spinner();
         }

         var2 = var4;
      } finally {
         var1.CustomSpinner().unlock();
      }

      return var2;
   }

   public boolean Button(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      var1.CustomSpinner().lock();

      boolean var2;
      try {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var3 = var1.ButtonAction();

         try {
            this.ColorChooser
               .BatModClient(var3);
         } catch (InterruptedException var8) {
         }

         var2 = true;
      } finally {
         var1.CustomSpinner().unlock();
      }

      return var2;
   }

   public void Button() {
      this.Spinner();

      while (this.BatModClient(0L)) {
      }

      ArrayList var1 = Lists.newArrayList();

      while (var1.size() != 5) {
         try {
            var1.add(this.CustomSpinner());
         } catch (InterruptedException var3) {
         }
      }

      this.Spinner.addAll(var1);
   }

   public void BatModClient(
      net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF var1
   ) {
      this.Spinner.add(var1);
   }

   public net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF CustomSpinner() {
      return (net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF)this.Spinner
         .take();
   }

   public njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 ButtonAction() {
      return (njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1)this.ButtonAction
         .take();
   }

   public boolean CustomSpinner(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      var1.CustomSpinner().lock();

      boolean var2;
      try {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var3 = var1.Spinner();
         if (var3 == null) {
            return true;
         }

         var3.BatModClient(
            new STGpcXi2dC5pLrNcz7LboNGiKw0moybxgfab4wPzXmYwF8GGjWEk0gfYNXJDXpPkM3IZExPLokklGNgwxdNlb9t7OkSssCPpamVg(this, var3)
         );
         var2 = this.ButtonAction.offer(var3);
      } finally {
         var1.CustomSpinner().unlock();
      }

      return var2;
   }

   public ListenableFuture BatModClient(
      ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi var1,
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2,
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var3,
      VRSEfKxgOkKR81ksNQDxJf8BUx6f498JzG7JC0vK3m49YW5QnWu8ZYlgJqT84t1862o0GIwNFrN8yd74yU5Ye7qPTFwV8CzwprMJ var4
   ) {
      if (AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf()) {
         if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Checkbox()
            )
          {
            this.BatModClient(
               var2, var3.Button(var1.ordinal())
            );
         } else {
            this.BatModClient(
               var2,
               ((m0RqtuyoDW3TZpy6D2SqztOYAQXu7dMPTlQUw6gduuYE9CSo9Tun9hQFFpdnuMew5IiiVhWiGXrdSWN5YeziY9Znn7t8Fl34UZ3)var3)
                  .BatModClient(var1, var4),
               var3
            );
         }

         var2.CustomSpinner(0.0, 0.0, 0.0);
         return Futures.immediateFuture(null);
      } else {
         ListenableFutureTask var5 = ListenableFutureTask.create(
            new yZ7Q3lAhhYZRF1M6SHiL4b62QtLHH8ZdD3rkDeDsiP3vkpuwB0GDza2dvVnmLUniattDvWn5tgFZUuTBUbrDhq0N1ZMa1OAgiDmV(this, var1, var2, var3, var4), null
         );
         synchronized (this.BatModProgressBar) {
            this.BatModProgressBar.add(var5);
            return var5;
         }
      }
   }

   private void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1,
      int var2,
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var3
   ) {
      GL11.glNewList(var2, 4864);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
      var3.Checkbox();
      this.Checkbox
         .BatModClient(var1);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      GL11.glEndList();
   }

   private void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1,
      JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu var2
   ) {
      this.ProgressBar
         .BatModClient(var2);
      this.ProgressBar
         .BatModClient(var1);
   }

   public void Spinner() {
      while (!this.ButtonAction.isEmpty()) {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var1 = (njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1)this.ButtonAction
            .poll();
         if (var1 != null) {
            var1.Spinner();
         }
      }
   }
}
