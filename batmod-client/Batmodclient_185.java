import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class XwEDauLQmBAFm0z7hGpLcQEvJyYWBgLPTWe7YuMv9yYxbvUeOgW5tfEZWHNXqR5xdkpICp5EmXjhqFJrvTmdlZU7WLbhW0SYbYQy {
   private static final Joiner BatModClient = Joiner.on(",");
   private final List Button = Lists.newArrayList();
   private final Map CustomSpinner = Maps.newHashMap();
   private int ButtonAction;
   private int Spinner;

   private XwEDauLQmBAFm0z7hGpLcQEvJyYWBgLPTWe7YuMv9yYxbvUeOgW5tfEZWHNXqR5xdkpICp5EmXjhqFJrvTmdlZU7WLbhW0SYbYQy() {
      this.CustomSpinner.put(' ', Predicates.alwaysTrue());
   }

   public XwEDauLQmBAFm0z7hGpLcQEvJyYWBgLPTWe7YuMv9yYxbvUeOgW5tfEZWHNXqR5xdkpICp5EmXjhqFJrvTmdlZU7WLbhW0SYbYQy BatModClient(
      String... var1
   ) {
      if (!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.Button.isEmpty()) {
            this.ButtonAction = var1.length;
            this.Spinner = var1[0].length();
         }

         if (var1.length != this.ButtonAction) {
            throw new IllegalArgumentException(
               "Expected aisle with height of "
                  + this.ButtonAction
                  + ", but was given one with a height of "
                  + var1.length
                  + ")"
            );
         }

         for (String var5 : var1) {
            if (var5.length() != this.Spinner) {
               throw new IllegalArgumentException(
                  "Not all rows in the given aisle are the correct width (expected "
                     + this.Spinner
                     + ", found one with "
                     + var5.length()
                     + ")"
               );
            }

            for (char var9 : var5.toCharArray()) {
               if (!this.CustomSpinner.containsKey(var9)) {
                  this.CustomSpinner.put(var9, (Predicate)null);
               }
            }
         }

         this.Button.add(var1);
         return this;
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static XwEDauLQmBAFm0z7hGpLcQEvJyYWBgLPTWe7YuMv9yYxbvUeOgW5tfEZWHNXqR5xdkpICp5EmXjhqFJrvTmdlZU7WLbhW0SYbYQy BatModClient() {
      return new XwEDauLQmBAFm0z7hGpLcQEvJyYWBgLPTWe7YuMv9yYxbvUeOgW5tfEZWHNXqR5xdkpICp5EmXjhqFJrvTmdlZU7WLbhW0SYbYQy();
   }

   public XwEDauLQmBAFm0z7hGpLcQEvJyYWBgLPTWe7YuMv9yYxbvUeOgW5tfEZWHNXqR5xdkpICp5EmXjhqFJrvTmdlZU7WLbhW0SYbYQy BatModClient(
      char var1, Predicate var2
   ) {
      this.CustomSpinner.put(var1, var2);
      return this;
   }

   public y4RVf9xrblSa6XMoTqo38x3yDt9iLwsVKaSTROLpadXcZ7ZlMToPbSJZc3pF7kBaEa6NL19ZpMBs2DtDgjiWYqsv2jSXCaEhLdcc Button() {
      return new y4RVf9xrblSa6XMoTqo38x3yDt9iLwsVKaSTROLpadXcZ7ZlMToPbSJZc3pF7kBaEa6NL19ZpMBs2DtDgjiWYqsv2jSXCaEhLdcc(
         this.CustomSpinner()
      );
   }

   private Predicate[][][] CustomSpinner() {
      this.ButtonAction();
      Predicate[][][] var1 = (Predicate[][][])Array.newInstance(
         Predicate.class,
         this.Button.size(),
         this.ButtonAction,
         this.Spinner
      );

      for (int var2 = 0; var2 < this.Button.size(); var2++) {
         for (int var3 = 0; var3 < this.ButtonAction; var3++) {
            for (int var4 = 0; var4 < this.Spinner; var4++) {
               var1[var2][var3][var4] = (Predicate)this.CustomSpinner
                  .get(
                     ((String[])this.Button.get(var2))[var3]
                        .charAt(var4)
                  );
            }
         }
      }

      return var1;
   }

   private void ButtonAction() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.CustomSpinner.entrySet()) {
         if (var3.getValue() == null) {
            var1.add(var3.getKey());
         }
      }

      if (!var1.isEmpty()) {
         throw new IllegalStateException(
            "Predicates for character(s) "
               + BatModClient.join(var1)
               + " are missing"
         );
      }
   }
}
