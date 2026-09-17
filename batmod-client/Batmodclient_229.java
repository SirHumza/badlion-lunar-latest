import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;

public enum J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di {
   BatModClient(-1),
   Button(0),
   CustomSpinner(1),
   ButtonAction(2);

   private static int Spinner = -1;
   private static int Checkbox = 2;
   private static final J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di[] ProgressBar = new J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di[Checkbox
      - Spinner
      + 1];
   private static final Map BatModProgressBar = Maps.newHashMap();
   private final int ColorChooser;
   private final Map IntegerSpinner = Maps.newEnumMap(
      xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE.class
   );

   J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di(int var3) {
      this.ColorChooser = var3;
   }

   protected J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di BatModClient(
      xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE var1, Class var2
   ) {
      Object var3 = (BiMap)this.IntegerSpinner.get(var1);
      if (var3 == null) {
         var3 = HashBiMap.create();
         this.IntegerSpinner.put(var1, var3);
      }

      if (var3.containsValue(var2)) {
         String var4 = var1 + " packet " + var2 + " is already known to ID " + var3.inverse().get(var2);
         LogManager.getLogger().fatal(var4);
         throw new IllegalArgumentException(var4);
      } else {
         var3.put(var3.size(), var2);
         return this;
      }
   }

   public Integer BatModClient(
      xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE var1,
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var2
   ) {
      return (Integer)((BiMap)this.IntegerSpinner.get(var1))
         .inverse()
         .get(var2.getClass());
   }

   public fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM BatModClient(
      xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE var1, int var2
   ) {
      Class var3 = (Class)((BiMap)this.IntegerSpinner.get(var1))
         .get(var2);
      return var3 == null ? null : (fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM)var3.newInstance();
   }

   public int BatModClient() {
      return this.ColorChooser;
   }

   public static J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di BatModClient(
      int var0
   ) {
      return var0 >= Spinner
            && var0 <= Checkbox
         ? ProgressBar[var0
            - Spinner]
         : null;
   }

   public static J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di BatModClient(
      fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM var0
   ) {
      return (J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di)BatModProgressBar.get(
         var0.getClass()
      );
   }

   static {
      for (J1wKJ3PDC9QySW9GR3QwKKYgxwWxKjBuP5OsbqBchQqSmgrD50OmsrBbMcThxWgW3BKRnW1kcq3YS7IJuSqgzgPdrigynzPQx4di var3 : values()) {
         int var4 = var3.BatModClient();
         if (var4 < Spinner
            || var4 > Checkbox) {
            throw new Error("Invalid protocol ID " + Integer.toString(var4));
         }

         ProgressBar[var4
            - Spinner] = var3;

         for (xqXQgMdo4Ee4P3F355Tr9CWVIxd9Hmf6gVC9AebFzSyKpfd5WNCcFQeZiNs5lxdleJdz9gzajNFCsYTT5QOB96FcptolrNp2jE var6 : var3.IntegerSpinner
            .keySet()) {
            for (Class var8 : ((BiMap)var3.IntegerSpinner.get(var6))
               .values()) {
               if (BatModProgressBar.containsKey(var8)
                  && BatModProgressBar.get(var8) != var3) {
                  throw new Error(
                     "Packet "
                        + var8
                        + " is already assigned to protocol "
                        + BatModProgressBar.get(var8)
                        + " - can't reassign to "
                        + var3
                  );
               }

               try {
                  var8.newInstance();
               } catch (Throwable var10) {
                  throw new Error("Packet " + var8 + " fails instantiation checks! " + var8);
               }

               BatModProgressBar.put(var8, var3);
            }
         }
      }
   }
}
