import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class nfUsbTb7fA25uhDMuNq8Tfoep3rMkMkh1BMuhtYOoADqBKWTjWEt2mtHBK07coPRxEG8yYE1JajEXprEAMZrbw9kDWOLMLJvEOa implements Map {
   private final Map BatModClient = Maps.newLinkedHashMap();

   @Override
   public int size() {
      return this.BatModClient.size();
   }

   @Override
   public boolean isEmpty() {
      return this.BatModClient.isEmpty();
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.BatModClient
         .containsKey(var1.toString().toLowerCase());
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.BatModClient.containsKey(var1);
   }

   @Override
   public Object get(Object var1) {
      return this.BatModClient.get(var1.toString().toLowerCase());
   }

   public Object BatModClient(String var1, Object var2) {
      return this.BatModClient.put(var1.toLowerCase(), var2);
   }

   @Override
   public Object remove(Object var1) {
      return this.BatModClient.remove(var1.toString().toLowerCase());
   }

   @Override
   public void putAll(Map var1) {
      for (Entry var3 : var1.entrySet()) {
         this.BatModClient((String)var3.getKey(), var3.getValue());
      }
   }

   @Override
   public void clear() {
      this.BatModClient.clear();
   }

   @Override
   public Set keySet() {
      return this.BatModClient.keySet();
   }

   @Override
   public Collection values() {
      return this.BatModClient.values();
   }

   @Override
   public Set entrySet() {
      return this.BatModClient.entrySet();
   }
}
