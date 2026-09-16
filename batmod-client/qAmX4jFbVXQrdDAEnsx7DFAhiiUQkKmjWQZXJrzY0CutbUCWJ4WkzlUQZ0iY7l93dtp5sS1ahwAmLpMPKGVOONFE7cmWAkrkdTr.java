import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

final class qAmX4jFbVXQrdDAEnsx7DFAhiiUQkKmjWQZXJrzY0CutbUCWJ4WkzlUQZ0iY7l93dtp5sS1ahwAmLpMPKGVOONFE7cmWAkrkdTr extends ChannelInitializer {
   qAmX4jFbVXQrdDAEnsx7DFAhiiUQkKmjWQZXJrzY0CutbUCWJ4WkzlUQZ0iY7l93dtp5sS1ahwAmLpMPKGVOONFE7cmWAkrkdTr(
      fAs5KLOOmwUcVodVl3FCZBbWUdYlZXFBVyIMCxKQwU7bmWE8yO6HgaePXLQjMD7xMv8xLYSBB8SfoWbOyu2N6CKhX7GsYcvgaATS var1
   ) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new kjUk17RQutmaBLOMntCVOe3p3Gz4ghUuNfFObJ1iqoCWFHcV15IA0dKJH7xlVl6amCaGhXTY05MCDJlaPr1UfXw9qrtsNSygwx3Z())
         .addLast(
            "decoder",
            new QtKUwAugJnPMVD3KLSOTjIvna9Kma5JUKk6uV5pgREuWR3pNTbY6VIuhwoOueNYuz8GqpS3WrYzZJkS9sY6oOne0zRNVFJ9RUBTt(
               xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
            )
         )
         .addLast("prepender", new lAKqNhMqZGM0Cxmm0phoB3lHfM77nEhwgOnZHiVZjzXdu59XKzrY2HDqlNwYcBkWwYrvt4ufgkfpmfK5t6MhfYoJJf3iRGCkgDQa())
         .addLast(
            "encoder",
            new lnptP7CaCG6HkcTadHQSxFMH9qVeNP3q7GH6mwDeT25iZtpRFljtIIpYBOOEE0HBqZjwPB5JdriNXXvXW2GP0SKLFVs58vdXgxtv(
               xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            )
         )
         .addLast("packet_handler", this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I);
   }
}
