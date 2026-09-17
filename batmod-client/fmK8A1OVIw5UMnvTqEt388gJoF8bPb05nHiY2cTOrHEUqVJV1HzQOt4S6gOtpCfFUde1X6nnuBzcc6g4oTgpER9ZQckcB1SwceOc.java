import com.google.common.collect.Lists;
import java.util.List;

public class fmK8A1OVIw5UMnvTqEt388gJoF8bPb05nHiY2cTOrHEUqVJV1HzQOt4S6gOtpCfFUde1X6nnuBzcc6g4oTgpER9ZQckcB1SwceOc {
   private static int BatModClient = 256;
   private static List Button = Lists.newArrayList();
   private static List CustomSpinner = Lists.newArrayList();
   private static List ButtonAction = Lists.newArrayList();
   private static List Spinner = Lists.newArrayList();

   public static synchronized int[] BatModClient(int var0) {
      if (var0 <= 256) {
         if (Button.isEmpty()) {
            int[] var5 = new int[256];
            CustomSpinner.add(var5);
            return var5;
         } else {
            int[] var4 = (int[])Button.remove(
               Button.size() - 1
            );
            CustomSpinner.add(var4);
            return var4;
         }
      } else if (var0 > BatModClient) {
         BatModClient = var0;
         ButtonAction.clear();
         Spinner.clear();
         int[] var3 = new int[BatModClient];
         Spinner.add(var3);
         return var3;
      } else if (ButtonAction.isEmpty()) {
         int[] var2 = new int[BatModClient];
         Spinner.add(var2);
         return var2;
      } else {
         int[] var1 = (int[])ButtonAction.remove(
            ButtonAction.size() - 1
         );
         Spinner.add(var1);
         return var1;
      }
   }

   public static synchronized void BatModClient() {
      if (!ButtonAction.isEmpty()) {
         ButtonAction.remove(
            ButtonAction.size() - 1
         );
      }

      if (!Button.isEmpty()) {
         Button.remove(
            Button.size() - 1
         );
      }

      ButtonAction.addAll(
         Spinner
      );
      Button.addAll(
         CustomSpinner
      );
      Spinner.clear();
      CustomSpinner.clear();
   }

   public static synchronized String Button() {
      return "cache: "
         + ButtonAction.size()
         + ", tcache: "
         + Button.size()
         + ", allocated: "
         + Spinner.size()
         + ", tallocated: "
         + CustomSpinner.size();
   }
}
