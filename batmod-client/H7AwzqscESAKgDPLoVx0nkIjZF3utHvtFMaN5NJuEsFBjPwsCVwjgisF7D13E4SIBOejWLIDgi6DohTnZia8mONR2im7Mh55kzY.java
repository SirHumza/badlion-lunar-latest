import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class H7AwzqscESAKgDPLoVx0nkIjZF3utHvtFMaN5NJuEsFBjPwsCVwjgisF7D13E4SIBOejWLIDgi6DohTnZia8mONR2im7Mh55kzY {
   private static final Logger uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = LogManager.getLogger();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = new dgQGABH5kz31gkMe4mHaveFWu6ZNmNhE30FbzdMNmwOH2DEs6Ypir0Y1TVr0kogapH9s3Km0wpeoWHZinKL87Mex5VUlK2s4xl7();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new t2w5JvjoTtaI4XgQpYoFfzQeK5bYwOe1x9judt6c2eUgburGVUdut4lFAl78LFkrPYdecC1mCyG7K1Pl38PwvqGuz69xQ4WDgDDN();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = new idthg7mIDiTzGdOygwzQt3cm4VqsNfCujov2RRtzo38FtY3vEhyMAAZ8TVLfkVUHAgGSLsEEZZjuyEniCR7pDpMzNjCishnAia9B();
   private final TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0;
   public volatile boolean PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u;
   private final List kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ = Collections.synchronizedList(
      Lists.newArrayList()
   );
   private final List y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY = Collections.synchronizedList(
      Lists.newArrayList()
   );

   public H7AwzqscESAKgDPLoVx0nkIjZF3utHvtFMaN5NJuEsFBjPwsCVwjgisF7D13E4SIBOejWLIDgi6DohTnZia8mONR2im7Mh55kzY(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1
   ) {
      this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0 = var1;
      this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = true;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(InetAddress var1, int var2) {
      synchronized (this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ) {
         Class<EpollServerSocketChannel> var4;
         z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 var5;
         if (Epoll.isAvailable()
            && this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
               .keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9()) {
            var4 = EpollServerSocketChannel.class;
            var5 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
            uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.info("Using epoll channel type");
         } else {
            var4 = NioServerSocketChannel.class;
            var5 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
            uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.info("Using default channel type");
         }

         this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var4))
                     .childHandler(new mVVmHmwCoXaRlFSZCV6PrwWWHcpE5kZHiVw8xwoVKZbIkxxrsMMuDIMFDCq1yv3sVwsuYCdv1wd2maukunrpamVjKFvX4Km4zP2p(this))
                     .group((EventLoopGroup)var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      ChannelFuture var1;
      synchronized (this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ) {
         var1 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new RRRwcvnkChlpFQS2PoDdLT52m3UfoxD8k0YF6VIHdlYijFrH0ureypwjYkyQOdEpDigpQbikCYXnPErO4aGof0ajGmIDZadBkD39(this))
               .group(
                  (EventLoopGroup)Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
               )
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.add(var1);
      }

      return var1.channel().localAddress();
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = false;

      for (ChannelFuture var2 : this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ) {
         try {
            var2.channel().close().sync();
         } catch (InterruptedException var4) {
            uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.error("Interrupted whilst closing channel");
         }
      }
   }

   public void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      synchronized (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY) {
         Iterator var2 = this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY.iterator();

         while (var2.hasNext()) {
            fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var3 = (fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS)var2.next();
            if (!var3.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()) {
               if (!var3.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()) {
                  var2.remove();
                  var3.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ();
               } else {
                  try {
                     var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
                  } catch (Exception var8) {
                     if (var3.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()) {
                        dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK var10 = dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                           var8, "Ticking memory connection"
                        );
                        jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var6 = var10.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                           "Ticking connection"
                        );
                        var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                           "Connection", new LQFYCjLKaKj8T6UQUy7wgv2SEM2wDqfM8AccW9UJQBaSEywTn76f1NpYFKFQkipwIdySByHQ3Uz5yOZpnCgwzhjQlrohA8WeJBNT(this, var3)
                        );
                        throw new Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg(var10);
                     }

                     uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.warn(
                        "Failed to handle packet for "
                           + var3.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
                        var8
                     );
                     E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl var5 = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
                        "Internal server error"
                     );
                     var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        new FY2IxLW9nLtcpR86dJB8dGNxNhmhwx0sqi0K1KIhI2TsGSZWLqVMqOw46QRsiwOWTKBI3Eo3eWNgh7M2D9npHovdllYbCmwx5OOW(var5),
                        new y1bB6AoLQBCMQX576m9fYbKZsK4gAV6EjWeE5InfN4qSdUnlvansIsO9Ahi2ChlaFeW4KmQBToWfRTaGc1aFEUQKkYhm2CCAwttm(this, var3, var5)
                     );
                     var3.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9();
                  }
               }
            }
         }
      }
   }

   public TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      return this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0;
   }
}
