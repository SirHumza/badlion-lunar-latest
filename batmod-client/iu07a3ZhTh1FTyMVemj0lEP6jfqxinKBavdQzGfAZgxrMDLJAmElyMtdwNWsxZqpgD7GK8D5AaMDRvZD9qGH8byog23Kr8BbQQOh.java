import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class iu07a3ZhTh1FTyMVemj0lEP6jfqxinKBavdQzGfAZgxrMDLJAmElyMtdwNWsxZqpgD7GK8D5AaMDRvZD9qGH8byog23Kr8BbQQOh {
   private List Button = Lists.newArrayList();
   boolean BatModClient;

   public synchronized boolean BatModClient() {
      return this.BatModClient;
   }

   public synchronized void Button() {
      this.BatModClient = false;
   }

   public synchronized List CustomSpinner() {
      return Collections.unmodifiableList(this.Button);
   }

   public synchronized void BatModClient(String var1, InetAddress var2) {
      String var3 = W0S7rWQLMet9bx1Q64ed8klcBH8kdnkggLtZRXU4TYjPvsO3HqR86kKnMo61zaQkTFWjv1OVUb0eQ0WbynMaKUOfHSJMBIohawPU.BatModClient(
         var1
      );
      String var4 = W0S7rWQLMet9bx1Q64ed8klcBH8kdnkggLtZRXU4TYjPvsO3HqR86kKnMo61zaQkTFWjv1OVUb0eQ0WbynMaKUOfHSJMBIohawPU.Button(
         var1
      );
      if (var4 != null) {
         var4 = var2.getHostAddress() + ":" + var4;
         boolean var5 = false;

         for (mmeqtzwoGP4dllaaOahmcvlEP54rxdfrT7m2LbOHdVtJhAXfzRyeJLgry8OltmR0iCLvQzYBkfr2lysSNXFqrT2BN5gHzrLfpDC2 var7 : this.Button) {
            if (var7.Button().equals(var4)) {
               var7.CustomSpinner();
               var5 = true;
               break;
            }
         }

         if (!var5) {
            this.Button
               .add(new mmeqtzwoGP4dllaaOahmcvlEP54rxdfrT7m2LbOHdVtJhAXfzRyeJLgry8OltmR0iCLvQzYBkfr2lysSNXFqrT2BN5gHzrLfpDC2(var3, var4));
            this.BatModClient = true;
         }
      }
   }
}
