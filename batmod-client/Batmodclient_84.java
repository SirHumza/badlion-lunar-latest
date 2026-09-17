import com.google.common.collect.Maps;
import java.util.Map;

public enum TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht {
   BatModClient("integer"),
   Button("hearts");

   private static final Map CustomSpinner = Maps.newHashMap();
   private final String ButtonAction;

   TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht(String var3) {
      this.ButtonAction = var3;
   }

   public String BatModClient() {
      return this.ButtonAction;
   }

   public static TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht BatModClient(
      String var0
   ) {
      TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht var1 = (TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht)CustomSpinner.get(
         var0
      );
      return var1 == null ? BatModClient : var1;
   }

   static {
      for (TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht var3 : values()) {
         CustomSpinner.put(
            var3.BatModClient(), var3
         );
      }
   }
}
