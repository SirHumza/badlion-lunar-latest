import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class qgx3Qmzh8CS84Sm7CA2rZqZbeeBvosivOUWuLM2xuTcPwXJ7ygUBp6sCrcWpJKpSpqHOSPuIAXYHnInkbt9QSYxUdTKPAqzQmako {
   private final Object[] BatModClient;
   private final Class Button;
   private final ReadWriteLock CustomSpinner = new ReentrantReadWriteLock();
   private int ButtonAction;
   private int Spinner;

   public qgx3Qmzh8CS84Sm7CA2rZqZbeeBvosivOUWuLM2xuTcPwXJ7ygUBp6sCrcWpJKpSpqHOSPuIAXYHnInkbt9QSYxUdTKPAqzQmako(Class var1, int var2) {
      this.Button = var1;
      this.BatModClient = (Object[])Array.newInstance(var1, var2);
   }

   public Object BatModClient(Object var1) {
      this.CustomSpinner.writeLock().lock();
      this.BatModClient[this.Spinner] = var1;
      this.Spinner = (
            this.Spinner + 1
         )
         % this.BatModClient();
      if (this.ButtonAction
         < this.BatModClient()) {
         this.ButtonAction++;
      }

      this.CustomSpinner.writeLock().unlock();
      return var1;
   }

   public int BatModClient() {
      this.CustomSpinner.readLock().lock();
      int var1 = this.BatModClient.length;
      this.CustomSpinner.readLock().unlock();
      return var1;
   }

   public Object[] Button() {
      Object[] var1 = (Object[])Array.newInstance(
         this.Button,
         this.ButtonAction
      );
      this.CustomSpinner.readLock().lock();

      for (int var2 = 0; var2 < this.ButtonAction; var2++) {
         int var3 = (
               this.Spinner
                  - this.ButtonAction
                  + var2
            )
            % this.BatModClient();
         if (var3 < 0) {
            var3 += this.BatModClient();
         }

         var1[var2] = this.BatModClient[var3];
      }

      this.CustomSpinner.readLock().unlock();
      return var1;
   }
}
