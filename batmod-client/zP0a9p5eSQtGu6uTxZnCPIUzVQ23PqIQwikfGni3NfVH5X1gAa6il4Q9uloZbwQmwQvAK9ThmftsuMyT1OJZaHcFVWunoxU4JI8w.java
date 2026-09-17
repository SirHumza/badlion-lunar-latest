import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;

final class zP0a9p5eSQtGu6uTxZnCPIUzVQ23PqIQwikfGni3NfVH5X1gAa6il4Q9uloZbwQmwQvAK9ThmftsuMyT1OJZaHcFVWunoxU4JI8w
   extends z3qaPFLrbIiB8UGpICXvdI7eKGt21QNJstP2xHWMPXePTUZ336HZVC6DTnRE9QWdWCcbxJQwq3SootuYYtwLwEivojfQTU4Hpq03 {
   protected LocalEventLoopGroup BatModClient() {
      return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
   }
}
