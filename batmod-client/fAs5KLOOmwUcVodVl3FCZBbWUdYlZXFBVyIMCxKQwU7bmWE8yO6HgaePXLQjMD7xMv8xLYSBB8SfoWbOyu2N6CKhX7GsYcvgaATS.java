import com.google.common.collect.Queues;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS extends SimpleChannelInboundHandler {
   private static final Logger kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ = LogManager.getLogger();
   public static final Marker Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = MarkerManager.getMarker(
      "NETWORK"
   );
   public static final Marker BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = MarkerManager.getMarker(
      "NETWORK_PACKETS", Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
   );
   public static final AttributeKey vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = AttributeKey.valueOf(
      "protocol"
   );
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = new GejgMLTLB5kAx5UWez5lFSPWqGaUr7PT8gv7htUE0Wity08XQ0UR4LNnmBxe34WYQw8EXdL8h1XYkDJcdctq3fseSgNj3Xc55Ov();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = new pHGP3nWb86TEJvtdd72CaDn8b9rBKsbCVzZ2I9JGJoyDExwjjaZeTqVyiSF8z9Ndzid5oyppymtZJAN0vMeVkT81gRqA9GCp6bhU();
   public static final z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0 = new zP0a9p5eSQtGu6uTxZnCPIUzVQ23PqIQwikfGni3NfVH5X1gAa6il4Q9uloZbwQmwQvAK9ThmftsuMyT1OJZaHcFVWunoxU4JI8w();
   private final xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY;
   private final Queue sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 = Queues.newConcurrentLinkedQueue();
   private final ReentrantReadWriteLock lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ = new ReentrantReadWriteLock();
   private Channel agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x;
   private SocketAddress uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk;
   private UEFc3CYFG3NbXhtjyffKTuaYzRNORb0cixdiVE4Xz5YHqaMEu9wEBjiRP0Ems6qBE1RiXZSEWm7fI7d7hNnky9pHngLRvZz5E6dL Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ;
   private WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   private boolean LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
   private boolean G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;

   public fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS(
      xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE var1
   ) {
      this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY = var1;
   }

   public void channelActive(ChannelHandlerContext var1) {
      super.channelActive(var1);
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x = var1.channel();
      this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk = this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .remoteAddress();

      try {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         );
      } catch (Throwable var3) {
         kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.fatal(var3);
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di var1
   ) {
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .attr(vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5)
         .set(var1);
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.config().setAutoRead(true);
      kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext var1) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("disconnect.endOfStream")
      );
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var3;
      if (var2 instanceof TimeoutException) {
         var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("disconnect.timeout");
      } else {
         var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "disconnect.genericReason", "Internal Exception: " + var2
         );
      }

      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3);
   }

   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      ChannelHandlerContext var1, fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var2
   ) {
      if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.isOpen()) {
         try {
            var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
            );
         } catch (HcccLQsWoW9mL0femCBlA1W3lXE6M2meHRGFAkbIVRNxv04XuufjDbTMaJVH2cZ5afYj95OKnaSjI8RelluA6Y32X678uAXDP0zs var4) {
         }
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      UEFc3CYFG3NbXhtjyffKTuaYzRNORb0cixdiVE4Xz5YHqaMEu9wEBjiRP0Ems6qBE1RiXZSEWm7fI7d7hNnky9pHngLRvZz5E6dL var1
   ) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.debug(
         "Set listener of {} to {}", new Object[]{this, var1}
      );
      this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ = var1;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var1
   ) {
      if (this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()) {
         this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x();
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, (GenericFutureListener[])null);
      } else {
         this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.writeLock().lock();

         try {
            this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .add(
                  new NI4uBhHkYlsPASUTH1km6mrBwmk7kPDaFFiuHiERMofNxfMuAM2VqrEfgoBNBdu3ImYjeo9Mm3i3RGK1we34zI2IkOn2B62BiJfM(var1, (GenericFutureListener[])null)
               );
         } finally {
            this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.writeLock().unlock();
         }
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var1,
      GenericFutureListener var2,
      GenericFutureListener... var3
   ) {
      if (this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()) {
         this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x();
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1, (GenericFutureListener[])ArrayUtils.add(var3, 0, var2)
         );
      } else {
         this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.writeLock().lock();

         try {
            this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
               .add(
                  new NI4uBhHkYlsPASUTH1km6mrBwmk7kPDaFFiuHiERMofNxfMuAM2VqrEfgoBNBdu3ImYjeo9Mm3i3RGK1we34zI2IkOn2B62BiJfM(
                     var1, (GenericFutureListener[])ArrayUtils.add(var3, 0, var2)
                  )
               );
         } finally {
            this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.writeLock().unlock();
         }
      }
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var1, GenericFutureListener[] var2
   ) {
      J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di var3 = J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1
      );
      J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di var4 = (J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di)this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .attr(vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5)
         .get();
      if (var4 != var3) {
         kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.debug("Disabled auto read");
         this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.config().setAutoRead(false);
      }

      if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.eventLoop().inEventLoop()) {
         if (var3 != var4) {
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3);
         }

         ChannelFuture var5 = this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.writeAndFlush(var1);
         if (var2 != null) {
            var5.addListeners(var2);
         }

         var5.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
            .eventLoop()
            .execute(new cXt4evsIRpc4d0NVzcoTMkfZnPR60ROkIpMN9HumIz6OK2KO028Qu9wcz9c5fmCY8Vs99NSlD76GulrI3PTFhfHpAyXheuPVI3tG(this, var3, var4, var1, var2));
      }
   }

   private void agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x() {
      if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x != null
         && this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.isOpen()) {
         this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.readLock().lock();

         try {
            while (!this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9.isEmpty()) {
               NI4uBhHkYlsPASUTH1km6mrBwmk7kPDaFFiuHiERMofNxfMuAM2VqrEfgoBNBdu3ImYjeo9Mm3i3RGK1we34zI2IkOn2B62BiJfM var1 = (NI4uBhHkYlsPASUTH1km6mrBwmk7kPDaFFiuHiERMofNxfMuAM2VqrEfgoBNBdu3ImYjeo9Mm3i3RGK1we34zI2IkOn2B62BiJfM)this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
                  .poll();
               this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  NI4uBhHkYlsPASUTH1km6mrBwmk7kPDaFFiuHiERMofNxfMuAM2VqrEfgoBNBdu3ImYjeo9Mm3i3RGK1we34zI2IkOn2B62BiJfM.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var1
                  ),
                  NI4uBhHkYlsPASUTH1km6mrBwmk7kPDaFFiuHiERMofNxfMuAM2VqrEfgoBNBdu3ImYjeo9Mm3i3RGK1we34zI2IkOn2B62BiJfM.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
                     var1
                  )
               );
            }
         } finally {
            this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ.readLock().unlock();
         }
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x();
      if (this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ instanceof oobbgPu04Z1a1Bb3M8CaBJMc3JhqB9IsHToXd2VsYpcbyuRQvcR4cFnKaSbUBRPYIvIN7rBiwDujZGA7wIJvkjJKmwKy5C3YMLVl
         )
       {
         ((oobbgPu04Z1a1Bb3M8CaBJMc3JhqB9IsHToXd2VsYpcbyuRQvcR4cFnKaSbUBRPYIvIN7rBiwDujZGA7wIJvkjJKmwKy5C3YMLVl)this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ)
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
      }

      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.flush();
   }

   public SocketAddress BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      return this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1
   ) {
      if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.isOpen()) {
         this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.close().awaitUninterruptibly();
         this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = var1;
      }
   }

   public boolean vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      return this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x instanceof LocalChannel
         || this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x instanceof LocalServerChannel;
   }

   public static fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      InetAddress var0, int var1, boolean var2
   ) {
      fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var3 = new fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS(
         xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
      );
      Class<EpollSocketChannel> var4;
      z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 var5;
      if (Epoll.isAvailable() && var2) {
         var4 = EpollSocketChannel.class;
         var5 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590;
      } else {
         var4 = NioSocketChannel.class;
         var5 = PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap()
                  .group((EventLoopGroup)var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()))
               .handler(new qAmX4jFbVXQrdDAEnsx7DFAhiiUQkKmjWQZXJrzY0CutbUCWJ4WkzlUQZ0iY7l93dtp5sS1ahwAmLpMPKGVOONFE7cmWAkrkdTr(var3)))
            .channel(var4))
         .connect(var0, var1)
         .syncUninterruptibly();
      return var3;
   }

   public static fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      SocketAddress var0
   ) {
      fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var1 = new fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS(
         xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
      );
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap()
                  .group(
                     (EventLoopGroup)QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                  ))
               .handler(new PHx8DlBVaEjV0d6e5I2zSzCHPnfjxsYZGIWPkElICNerQuoRxzsoqlv7JK3f3kmd4M5C3LYMbxcnwld0CNYH0IOjfuWgJRRcGDP(var1)))
            .channel(LocalChannel.class))
         .connect(var0)
         .syncUninterruptibly();
      return var1;
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(SecretKey var1) {
      this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = true;
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .pipeline()
         .addBefore(
            "splitter",
            "decrypt",
            new p3GEHfnHFaU46n9PNV4fqRicS0o4qHpY27wpPhlk0gQruABjC1crpJW1h8jC8ufk7QrW0mmHVl1J1MRnixNR0EFUoGpLob2DxTn7(
               pRqXsNXt8hLGcv0lcUd0C5FGxUO6Q9tSaZHpP5M5Dk3nGx8vnImEBleHG8XFl5i2HCC8VYGTIM6ESqEyHb0nk1IabDCfVds6py6w.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  2, var1
               )
            )
         );
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         .pipeline()
         .addBefore(
            "prepender",
            "encrypt",
            new o5ODtbVmkkiKIz7ZU3i3yO1gEM9nrTqarr1mN2jdQEKT5a1K5Z5HVG9Ezgitz1PdDPGAL7dAGEo8sQPvqym56WuHDkLcMOMcTCr(
               pRqXsNXt8hLGcv0lcUd0C5FGxUO6Q9tSaZHpP5M5Dk3nGx8vnImEBleHG8XFl5i2HCC8VYGTIM6ESqEyHb0nk1IabDCfVds6py6w.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  1, var1
               )
            )
         );
   }

   public boolean PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      return this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
   }

   public boolean uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      return this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x != null
         && this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.isOpen();
   }

   public boolean QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0() {
      return this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x == null;
   }

   public UEFc3CYFG3NbXhtjyffKTuaYzRNORb0cixdiVE4Xz5YHqaMEu9wEBjiRP0Ems6qBE1RiXZSEWm7fI7d7hNnky9pHngLRvZz5E6dL kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ() {
      return this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ;
   }

   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY() {
      return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   }

   public void sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9() {
      this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.config().setAutoRead(false);
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(int var1) {
      if (var1 >= 0) {
         if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.pipeline().get("decompress") instanceof Elbw9xBVk4Qxfnd5Ur6Zq208KqGbhYVgIsF1954bvR36rKWyYNdpF0uhBOp0dTgjtNPJHO7cYBEQhP16R1fUOFDQnHZxyvHxvKrH
            )
          {
            ((Elbw9xBVk4Qxfnd5Ur6Zq208KqGbhYVgIsF1954bvR36rKWyYNdpF0uhBOp0dTgjtNPJHO7cYBEQhP16R1fUOFDQnHZxyvHxvKrH)this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
                  .pipeline()
                  .get("decompress"))
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
         } else {
            this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
               .pipeline()
               .addBefore(
                  "decoder", "decompress", new Elbw9xBVk4Qxfnd5Ur6Zq208KqGbhYVgIsF1954bvR36rKWyYNdpF0uhBOp0dTgjtNPJHO7cYBEQhP16R1fUOFDQnHZxyvHxvKrH(var1)
               );
         }

         if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.pipeline().get("compress") instanceof JGY3Y46Y6p9PEaPqKfg2I8O0YcZ2HOj8SNp98b34Ju6QwOctBTvwq16vulHo2ufla8fAZOV4mOsNZdDy1WEbNNF2dNr8OKquGviQ
            )
          {
            ((JGY3Y46Y6p9PEaPqKfg2I8O0YcZ2HOj8SNp98b34Ju6QwOctBTvwq16vulHo2ufla8fAZOV4mOsNZdDy1WEbNNF2dNr8OKquGviQ)this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
                  .pipeline()
                  .get("decompress"))
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
         } else {
            this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
               .pipeline()
               .addBefore("encoder", "compress", new JGY3Y46Y6p9PEaPqKfg2I8O0YcZ2HOj8SNp98b34Ju6QwOctBTvwq16vulHo2ufla8fAZOV4mOsNZdDy1WEbNNF2dNr8OKquGviQ(var1));
         }
      } else {
         if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.pipeline().get("decompress") instanceof Elbw9xBVk4Qxfnd5Ur6Zq208KqGbhYVgIsF1954bvR36rKWyYNdpF0uhBOp0dTgjtNPJHO7cYBEQhP16R1fUOFDQnHZxyvHxvKrH
            )
          {
            this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.pipeline().remove("decompress");
         }

         if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.pipeline().get("compress") instanceof JGY3Y46Y6p9PEaPqKfg2I8O0YcZ2HOj8SNp98b34Ju6QwOctBTvwq16vulHo2ufla8fAZOV4mOsNZdDy1WEbNNF2dNr8OKquGviQ
            )
          {
            this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.pipeline().remove("compress");
         }
      }
   }

   public void lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ() {
      if (this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x != null
         && !this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x.isOpen()) {
         if (!this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr) {
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = true;
            if (this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY() != null) {
               this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY()
                  );
            } else if (this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ() != null) {
               this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl("Disconnected")
                  );
            }
         } else {
            kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ.warn("handleDisconnection() called twice");
         }
      }
   }
}
