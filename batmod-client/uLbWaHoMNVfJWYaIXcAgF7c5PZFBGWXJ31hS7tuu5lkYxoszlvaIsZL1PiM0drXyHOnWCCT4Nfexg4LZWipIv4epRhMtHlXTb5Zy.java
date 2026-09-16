import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy {
   private static final AtomicInteger BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new AtomicInteger(
      1
   );
   private static final ExecutorService vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      "Main"
   );
   public static LongSupplier Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = System::nanoTime;
   private static final Logger PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = LogManager.getLogger();
   private static final Pattern uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = Pattern.compile(
      ".*\\.|(?:CON|PRN|AUX|NUL|COM1|COM2|COM3|COM4|COM5|COM6|COM7|COM8|COM9|LPT1|LPT2|LPT3|LPT4|LPT5|LPT6|LPT7|LPT8|LPT9)(?:\\..*)?", 2
   );

   public static Collector Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      pmaYRMICclkAQYKkxNEIqvsKic8qANgyaBQS266gAaVuCwlZlMGzKhH09DJCxJqhoGRJwYBtAiPtfmjNC1T5aDFR7TaAtGDf7iIH var0, Object var1
   ) {
      return var0.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I((Comparable & Comparable)var1);
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0, @Nullable p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return var1 == null
         ? var0 + ".unregistered_sadface"
         : var0
            + '.'
            + var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
            + '.'
            + var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().replace('/', '.');
   }

   public static long BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      return vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() / 1000000L;
   }

   public static long vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.getAsLong();
   }

   public static long PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      return Instant.now().toEpochMilli();
   }

   public static Executor uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      return vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5;
   }

   public static void QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0() {
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
      );
   }

   private static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(ExecutorService var0) {
      var0.shutdown();

      boolean var1;
      try {
         var1 = var0.awaitTermination(3L, TimeUnit.SECONDS);
      } catch (InterruptedException var3) {
         var1 = false;
      }

      if (!var1) {
         var0.shutdownNow();
      }
   }

   private static ExecutorService Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0) {
      int var1 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         Runtime.getRuntime().availableProcessors() - 1, 1, 7
      );
      Object var2;
      if (var1 <= 0) {
         var2 = MoreExecutors.sameThreadExecutor();
      } else {
         var2 = new ForkJoinPool(
            var1,
            var1x -> {
               SdGWOUC439PXbgLlRW4CLKvwMEX06Ldc7Hs7lVWC93kYxE3qGcjkw2VStrTtpRWamXr8qtqTrzt6gyvnQxmt1Gn3U1birAeUMj var2x = new SdGWOUC439PXbgLlRW4CLKvwMEX06Ldc7Hs7lVWC93kYxE3qGcjkw2VStrTtpRWamXr8qtqTrzt6gyvnQxmt1Gn3U1birAeUMj(
                  var1x
               );
               var2x.setName(
                  "Worker-"
                     + var0
                     + "-"
                     + BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.getAndIncrement()
               );
               return var2x;
            },
            uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy::Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I,
            true
         );
      }

      return (ExecutorService)var2;
   }

   private static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Thread var0, Throwable var1) {
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      if (var1 instanceof CompletionException) {
         var1 = var1.getCause();
      }

      if (var1 instanceof Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg) {
         QwpLMHqLelYhb6Mh5fs5MQhAjzkQncbOKphwWeQvKNAD9sH2IR0vbOaECkpb40zpS9WU5vVbFdNTe6FZgTziLaJ7mGkCvGe4SAiF.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            ((Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg)var1)
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
               .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
         );
         System.exit(-1);
      }

      PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.error(
         String.format("Caught exception in thread %s", var0), var1
      );
   }

   public static Throwable Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Throwable var0) {
      if (Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         )
       {
         PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.error(
            "Trying to throw a fatal exception, pausing in IDE", var0
         );

         while (true) {
            try {
               Thread.sleep(1000L);
               PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u.error("paused");
            } catch (InterruptedException var2) {
               return var0;
            }
         }
      } else {
         return var0;
      }
   }

   public static CompletableFuture Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(List var0) {
      ArrayList var1 = Lists.newArrayListWithCapacity(var0.size());
      CompletableFuture[] var2 = new CompletableFuture[var0.size()];
      CompletableFuture var3 = new CompletableFuture();
      var0.forEach(var3x -> {
         int var4 = var1.size();
         var1.add(null);
         var2[var4] = var3x.whenComplete((var3xx, var4x) -> {
            if (var4x != null) {
               var3.completeExceptionally(var4x);
            } else {
               var1.set(var4, var3xx);
            }
         });
      });
      return CompletableFuture.allOf(var2).applyToEither(var3, var1x -> var1);
   }

   public static e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ() {
      String var0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (var0.contains("win")) {
         return e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5;
      } else if (var0.contains("mac")) {
         return e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u;
      } else if (var0.contains("solaris")) {
         return e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
      } else if (var0.contains("sunos")) {
         return e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
      } else if (var0.contains("linux")) {
         return e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
      } else {
         return var0.contains("unix")
            ? e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            : e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590;
      }
   }

   public static Stream y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY() {
      RuntimeMXBean var0 = ManagementFactory.getRuntimeMXBean();
      return var0.getInputArguments().stream().filter(var0x -> var0x.startsWith("-X"));
   }

   public static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Path var0) {
      Path var1 = var0.normalize();
      return var1.equals(var0);
   }

   public static boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Path var0) {
      for (Path var2 : var0) {
         if (uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590.matcher(var2.toString()).matches()) {
            return false;
         }
      }

      return true;
   }

   public static Path Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Path var0, String var1, String var2) {
      String var3 = var1 + var2;
      Path var4 = Paths.get(var3);
      if (var4.endsWith(var2)) {
         throw new InvalidPathException(var3, "empty resource name");
      } else {
         return var0.resolve(var4);
      }
   }

   @Nullable
   public static Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(FutureTask var0, Logger var1) {
      try {
         var0.run();
         return var0.get();
      } catch (ExecutionException var3) {
         var1.fatal("Error executing task", var3);
      } catch (InterruptedException var4) {
         var1.fatal("Error executing task", var4);
      }

      return null;
   }

   public static Object BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(List var0) {
      return var0.get(var0.size() - 1);
   }

   public static Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Iterable var0, @Nullable Object var1
   ) {
      Iterator var2 = var0.iterator();
      Object var3 = var2.next();
      if (var1 != null) {
         Object var4 = var3;

         while (var4 != var1) {
            if (var2.hasNext()) {
               var4 = var2.next();
            }
         }

         if (var2.hasNext()) {
            return var2.next();
         }
      }

      return var3;
   }

   public static Object BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      Iterable var0, @Nullable Object var1
   ) {
      Iterator var2 = var0.iterator();
      Object var3 = null;

      while (var2.hasNext()) {
         Object var4 = var2.next();
         if (var4 == var1) {
            if (var3 == null) {
               var3 = var2.hasNext() ? Iterators.getLast(var2) : var1;
            }
            break;
         }

         var3 = var4;
      }

      return var3;
   }

   public static Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Supplier var0) {
      return var0.get();
   }

   public static Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Object var0, Consumer var1) {
      var1.accept(var0);
      return var0;
   }
}
