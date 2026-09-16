import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class gVsAIOZMHPqkycYKYfSAYVuslANDLqlH1SRLf9pkpfuSy8wAaIVsU6zq8uThwS0goeOegmi17hny0Bh015rMrUMgXpmgSxtYAyzq {
   public static Map Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Iterable var0, Iterable var1) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, Maps.newLinkedHashMap());
   }

   public static Map Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
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
