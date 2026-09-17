public class gbh4EWHrzTlzV9Tv4HZ0WUxAi8Gvb7qOlLZNL99Q2U3TQoTcuSmC1ObijJFajq5th1VlFEKSe3k8P9qnvCcQLAXEOjRFj4qi6uSg {
   private static final Integer[] BatModClient = new Integer[65535];

   public static Integer BatModClient(int var0) {
      return var0 > 0 && var0 < BatModClient.length
         ? BatModClient[var0]
         : var0;
   }

   static {
      int var0 = 0;

      for (int var1 = BatModClient.length; var0 < var1; var0++) {
         BatModClient[var0] = var0;
      }
   }
}
