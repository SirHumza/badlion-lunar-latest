import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class gVsAIOZMHPqkycYKYfSAYVuslANDLqlH1SRLf9pkpfuSy8wAaIVsU6zq8uThwS0goeOegmi17hny0Bh015rMrUMgXpmgSxtYAyzq {
   public static Map BatModClient(Iterable var0, Iterable var1) {
      return BatModClient(var0, var1, Maps.newLinkedHashMap());
   }

   public static Map BatModClient(
      Iterable var0, Iterable var1, Map var2
   ) {
      Iterator var3 = var1.iterator();

      for (Object var5 : var0) {
         var2.put(var5, var3.next());
      }

      if (var3.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return var2;
      }
   }
}
