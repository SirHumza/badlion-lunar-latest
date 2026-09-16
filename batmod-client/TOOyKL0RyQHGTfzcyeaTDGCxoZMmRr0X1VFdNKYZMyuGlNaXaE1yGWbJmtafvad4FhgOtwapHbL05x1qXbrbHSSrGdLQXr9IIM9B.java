import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

class TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B extends ChannelInitializer {
   TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B(
      jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD var1
   ) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, Boolean.TRUE);
      } catch (ChannelException var3) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP())
         .addLast("decoder", new dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11())
         .addLast("prepender", new ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu())
         .addLast("encoder", new lXnIKHX4LL4UVZqpHxViO6OjyXkTlTDY0epCVxu6ttLtuKke8pmpW0wcG0kcTCIzpgn9rnvQu9HzpRoIlINbDt0LmkQkzj7PO192())
         .addLast("packet_handler", this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I);
   }
}
