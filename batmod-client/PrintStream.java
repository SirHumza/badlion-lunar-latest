import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RlK5wQoGUsm4JMl3XSu2tAtnN1y5sDbRWg2cPKiaQdxEB0Z52dO9u28ERFBaoSI2ulZGENuycjGaMH7Q2GuVrYXowDopYeuTMQn7 extends PrintStream {
   private static final Logger BatModClient = LogManager.getLogger();
   private final String Button;

   public RlK5wQoGUsm4JMl3XSu2tAtnN1y5sDbRWg2cPKiaQdxEB0Z52dO9u28ERFBaoSI2ulZGENuycjGaMH7Q2GuVrYXowDopYeuTMQn7(String var1, OutputStream var2) {
      super(var2);
      this.Button = var1;
   }

   @Override
   public void println(String var1) {
      this.BatModClient(var1);
   }

   @Override
   public void println(Object var1) {
      this.BatModClient(String.valueOf(var1));
   }

   private void BatModClient(String var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      StackTraceElement var3 = var2[Math.min(3, var2.length)];
      BatModClient.info(
         "[{}]@.({}:{}): {}",
         new Object[]{
            this.Button,
            var3.getFileName(),
            var3.getLineNumber(),
            var1
         }
      );
   }
}
