import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class iESmtXeE7FkCixBqk550O0Ob9Vsttn3HTCxh3ps5AIkdbQ2vuPAcjBR5UnjRLmlnz6hm3rOxzx4N4gRrSM6bQsVMdYVOGe2SidCI
   implements ekvu75e7FVWt9b4abEiI2jk2nQrZt3qCnMLKYJAFwhNwwVNJ44RAwZ2wwtnHe7TbGTB4FruqYsN5yzWEV733PRnAijITO6qEKAkq {
   private final IdentityHashMap BatModClient = new IdentityHashMap(512);
   private final List Button = Lists.newArrayList();
   private static final String CustomSpinner = "CL_00001203";

   public void BatModClient(Object var1, int var2) {
      this.BatModClient.put(var1, var2);

      while (this.Button.size() <= var2) {
         this.Button.add(null);
      }

      this.Button.set(var2, var1);
   }

   public int BatModClient(Object var1) {
      Integer var2 = (Integer)this.BatModClient.get(var1);
      return var2 == null ? -1 : var2;
   }

   public final Object BatModClient(int var1) {
      return var1 >= 0 && var1 < this.Button.size()
         ? this.Button.get(var1)
         : null;
   }

   @Override
   public Iterator iterator() {
      return Iterators.filter(
         this.Button.iterator(), Predicates.notNull()
      );
   }

   public List BatModClient() {
      return this.Button;
   }
}
