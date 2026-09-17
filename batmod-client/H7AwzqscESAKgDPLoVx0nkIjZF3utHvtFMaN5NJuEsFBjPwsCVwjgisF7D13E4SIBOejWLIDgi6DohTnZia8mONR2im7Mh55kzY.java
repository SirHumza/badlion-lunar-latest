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
   private static final Logger Spinner = LogManager.getLogger();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 BatModClient = new dgQGABH5kz31gkMe4mHaveFWu6ZNmNhE30FbzdMNmwOH2DEs6Ypir0Y1TVr0kogapH9s3Km0wpeoWHZinKL87Mex5VUlK2s4xl7();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 Button = new t2w5JvjoTtaI4XgQpYoFfzQeK5bYwOe1x9judt6c2eUgburGVUdut4lFAl78LFkrPYdecC1mCyG7K1Pl38PwvqGuz69xQ4WDgDDN();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 CustomSpinner = new idthg7mIDiTzGdOygwzQt3cm4VqsNfCujov2RRtzo38FtY3vEhyMAAZ8TVLfkVUHAgGSLsEEZZjuyEniCR7pDpMzNjCishnAia9B();
   private final TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD Checkbox;
   public volatile boolean ButtonAction;
   private final List ProgressBar = Collections.synchronizedList(
      Lists.newArrayList()
   );
   private final List BatModProgressBar = Collections.synchronizedList(
      Lists.newArrayList()
   );

   public H7AwzqscESAKgDPLoVx0nkIjZF3utHvtFMaN5NJuEsFBjPwsCVwjgisF7D13E4SIBOejWLIDgi6DohTnZia8mONR2im7Mh55kzY(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1
   ) {
      this.Checkbox = var1;
      this.ButtonAction = true;
   }

   public void BatModClient(InetAddress var1, int var2) {
      synchronized (this.ProgressBar) {
         Class<EpollServerSocketChannel> var4;
         z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 var5;
         if (Epoll.isAvailable()
            && this.Checkbox
               .keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9()) {
            var4 = EpollServerSocketChannel.class;
            var5 = Button;
            Spinner.info("Using epoll channel type");
         } else {
            var4 = NioServerSocketChannel.class;
            var5 = BatModClient;
            Spinner.info("Using default channel type");
         }

         this.ProgressBar
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var4))
                     .childHandler(new mVVmHmwCoXaRlFSZCV6PrwWWHcpE5kZHiVw8xwoVKZbIkxxrsMMuDIMFDCq1yv3sVwsuYCdv1wd2maukunrpamVjKFvX4Km4zP2p(this))
                     .group((EventLoopGroup)var5.CustomSpinner())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress BatModClient() {
      ChannelFuture var1;
      synchronized (this.ProgressBar) {
         var1 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new RRRwcvnkChlpFQS2PoDdLT52m3UfoxD8k0YF6VIHdlYijFrH0ureypwjYkyQOdEpDigpQbikCYXnPErO4aGof0ajGmIDZadBkD39(this))
               .group(
                  (EventLoopGroup)BatModClient.CustomSpinner()
               )
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.ProgressBar.add(var1);
      }

      return var1.channel().localAddress();
   }

   public void Button() {
      this.ButtonAction = false;

      for (ChannelFuture var2 : this.ProgressBar) {
         try {
            var2.channel().close().sync();
         } catch (InterruptedException var4) {
            Spinner.error("Interrupted whilst closing channel");
         }
      }
   }

   public void CustomSpinner() {
      synchronized (this.BatModProgressBar) {
         Iterator var2 = this.BatModProgressBar.iterator();

         while (var2.hasNext()) {
            fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var3 = (fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS)var2.next();
            if (!var3.Checkbox()) {
               if (!var3.Spinner()) {
                  var2.remove();
                  var3.IntegerSpinner();
               } else {
                  try {
                     var3.BatModClient();
                  } catch (Exception var8) {
                     if (var3.CustomSpinner()) {
                        dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK var10 = dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK.BatModClient(
                           var8, "Ticking memory connection"
                        );
                        jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var6 = var10.BatModClient(
                           "Ticking connection"
                        );
                        var6.BatModClient(
                           "Connection", new LQFYCjLKaKj8T6UQUy7wgv2SEM2wDqfM8AccW9UJQBaSEywTn76f1NpYFKFQkipwIdySByHQ3Uz5yOZpnCgwzhjQlrohA8WeJBNT(this, var3)
                        );
                        throw new Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg(var10);
                     }

                     Spinner.warn(
                        "Failed to handle packet for "
                           + var3.Button(),
                        var8
                     );
                     E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl var5 = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
                        "Internal server error"
                     );
                     var3.BatModClient(
                        new FY2IxLW9nLtcpR86dJB8dGNxNhmhwx0sqi0K1KIhI2TsGSZWLqVMqOw46QRsiwOWTKBI3Eo3eWNgh7M2D9npHovdllYbCmwx5OOW(var5),
                        new y1bB6AoLQBCMQX576m9fYbKZsK4gAV6EjWeE5InfN4qSdUnlvansIsO9Ahi2ChlaFeW4KmQBToWfRTaGc1aFEUQKkYhm2CCAwttm(this, var3, var5)
                     );
                     var3.ColorChooser();
                  }
               }
            }
         }
      }
   }

   public TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD ButtonAction() {
      return this.Checkbox;
   }
}
