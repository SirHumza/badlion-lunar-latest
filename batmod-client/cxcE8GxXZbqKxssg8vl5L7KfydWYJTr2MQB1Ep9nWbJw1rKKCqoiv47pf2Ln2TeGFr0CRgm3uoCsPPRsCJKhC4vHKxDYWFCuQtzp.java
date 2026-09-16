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
   private static final Logger Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = LogManager.getLogger();
   private static final ThreadFactory BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new ThreadFactoryBuilder()
      .setNameFormat("Chunk Batcher %d")
      .setDaemon(true)
      .build();
   private final List vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = Lists.newArrayList();
   private final BlockingQueue PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = Queues.newArrayBlockingQueue(
      100
   );
   private final BlockingQueue uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = Queues.newArrayBlockingQueue(
      5
   );
   private final net.minecraft.client.renderer.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0 = new net.minecraft.client.renderer.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1();
   private final net.minecraft.client.renderer.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ = new net.minecraft.client.renderer.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n();
   private final Queue y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY = Queues.newArrayDeque();
   private final OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7 sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9;

   public cxcE8GxXZbqKxssg8vl5L7KfydWYJTr2MQB1Ep9nWbJw1rKKCqoiv47pf2Ln2TeGFr0CRgm3uoCsPPRsCJKhC4vHKxDYWFCuQtzp() {
      for (int var1 = 0; var1 < 2; var1++) {
         OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7 var2 = new OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7(
            this
         );
         Thread var3 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.newThread(var2);
         var3.start();
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.add(var2);
      }

      for (int var4 = 0; var4 < 5; var4++) {
         this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
            .add(new net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF());
      }

      this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 = new OwxMfYlx7yqyd0QVAO5SR3HySa8UVALTTFCKcgzs82MHmfKHXrikG8VrIQUg95bV1FehXKDg80CTIoi7teM8K1Ciy7jTDd2Me3H7(
         this, new net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
      );
   }

   public String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      return String.format(
         "pC: %03d, pU: %1d, aB: %1d",
         this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.size(),
         this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.size(),
         this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.size()
      );
   }

   public boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(long var1) {
      boolean var3 = false;

      long var8;
      do {
         boolean var4 = false;
         synchronized (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY) {
            if (!this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.isEmpty()) {
               ((ListenableFutureTask)this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.poll()).run();
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

   public boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().lock();

      boolean var2;
      try {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var3 = var1.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
         var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new lYcO2k2DOJsfyX8RT0c8koKRbtjTtFRF1HGnlHYZi2lRlCPrEJw7yAAJ2RZFK01TtXLK3zEaDZE1GZPWffhaXIhc06yWVNiJuzrR(this, var3)
         );
         boolean var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.offer(var3);
         if (!var4) {
            var3.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
         }

         var2 = var4;
      } finally {
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().unlock();
      }

      return var2;
   }

   public boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().lock();

      boolean var2;
      try {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var3 = var1.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();

         try {
            this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3);
         } catch (InterruptedException var8) {
         }

         var2 = true;
      } finally {
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().unlock();
      }

      return var2;
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();

      while (this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0L)) {
      }

      ArrayList var1 = Lists.newArrayList();

      while (var1.size() != 5) {
         try {
            var1.add(this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5());
         } catch (InterruptedException var3) {
         }
      }

      this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.addAll(var1);
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF var1
   ) {
      this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.add(var1);
   }

   public net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      return (net.minecraft.client.renderer.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF)this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
         .take();
   }

   public njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      return (njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1)this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
         .take();
   }

   public boolean vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().lock();

      boolean var2;
      try {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var3 = var1.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
         if (var3 == null) {
            return true;
         }

         var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new STGpcXi2dC5pLrNcz7LboNGiKw0moybxgfab4wPzXmYwF8GGjWEk0gfYNXJDXpPkM3IZExPLokklGNgwxdNlb9t7OkSssCPpamVg(this, var3)
         );
         var2 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.offer(var3);
      } finally {
         var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().unlock();
      }

      return var2;
   }

   public ListenableFuture Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi var1,
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2,
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var3,
      VRSEfKxgOkKR81ksNQDxJf8BUx6f498JzG7JC0vK3m49YW5QnWu8ZYlgJqT84t1862o0GIwNFrN8yd74yU5Ye7qPTFwV8CzwprMJ var4
   ) {
      if (AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU()
         .sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf()) {
         if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
            )
          {
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2, var3.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1.ordinal())
            );
         } else {
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2,
               ((m0RqtuyoDW3TZpy6D2SqztOYAQXu7dMPTlQUw6gduuYE9CSo9Tun9hQFFpdnuMew5IiiVhWiGXrdSWN5YeziY9Znn7t8Fl34UZ3)var3)
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var4),
               var3
            );
         }

         var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(0.0, 0.0, 0.0);
         return Futures.immediateFuture(null);
      } else {
         ListenableFutureTask var5 = ListenableFutureTask.create(
            new yZ7Q3lAhhYZRF1M6SHiL4b62QtLHH8ZdD3rkDeDsiP3vkpuwB0GDza2dvVnmLUniattDvWn5tgFZUuTBUbrDhq0N1ZMa1OAgiDmV(this, var1, var2, var3, var4), null
         );
         synchronized (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY) {
            this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.add(var5);
            return var5;
         }
      }
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1,
      int var2,
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var3
   ) {
      GL11.glNewList(var2, 4864);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
      var3.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0();
      this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      GL11.glEndList();
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1,
      JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu var2
   ) {
      this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
      this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
   }

   public void uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      while (!this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.isEmpty()) {
         njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1 var1 = (njoOdvSelY53wigAPuTJsCDJM7QoTWfJBjs0mvbQwtg95QzTJa6LkIAYKUmqubo9Go2p8pGUBUZ9FhMnq1bkGJgdusHUfHR3AfN1)this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
            .poll();
         if (var1 != null) {
            var1.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
         }
      }
   }
}
