import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn {
   private static ExecutorService BatModClient;
   private static ScheduledExecutorService Button;

   public HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn() {
      BatModClient = Executors.newCachedThreadPool();
      Button = Executors.newScheduledThreadPool(5);
   }

   public void BatModClient() {
      BatModClient.shutdown();
      Button.shutdown();
   }

   public static Future BatModClient(Runnable var0) {
      return BatModClient.submit(var0);
   }

   public static void Button(Runnable var0) {
      BatModClient.execute(var0);
   }

   public static SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj BatModClient(
      Runnable var0, long var1, TimeUnit var3
   ) {
      ScheduledFuture var4 = Button.schedule(var0, var1, var3);
      return () -> var4.cancel(false);
   }

   public static SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj BatModClient(
      Runnable var0, long var1, long var3, TimeUnit var5
   ) {
      ScheduledFuture var6 = Button.scheduleAtFixedRate(
         var0, var1, var3, var5
      );
      return () -> var6.cancel(false);
   }
}
