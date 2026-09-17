import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.util.Map;

public class l4aKZYxvxMw2fci0nI6ETMviA2t0pHfj8vm7BK8qhJNotEJJbatsAXs9drWQaOmzvbM4dv2DwowpVJ6gr0ggT2jKAJBdD02ONoDk {
   private static final Gson BatModClient = new Gson();
   private final String Button;
   private String CustomSpinner;
   private Map ButtonAction;

   public l4aKZYxvxMw2fci0nI6ETMviA2t0pHfj8vm7BK8qhJNotEJJbatsAXs9drWQaOmzvbM4dv2DwowpVJ6gr0ggT2jKAJBdD02ONoDk(String var1, String var2) {
      this.Button = var1;
      this.CustomSpinner = var2;
   }

   public l4aKZYxvxMw2fci0nI6ETMviA2t0pHfj8vm7BK8qhJNotEJJbatsAXs9drWQaOmzvbM4dv2DwowpVJ6gr0ggT2jKAJBdD02ONoDk(String var1) {
      this(var1, (String)null);
   }

   public void BatModClient(String var1) {
      this.CustomSpinner = var1;
   }

   public String BatModClient() {
      return this.CustomSpinner == null
         ? this.Button
         : this.CustomSpinner;
   }

   public void BatModClient(String var1, String var2) {
      if (this.ButtonAction == null) {
         this.ButtonAction = Maps.newHashMap();
      }

      if (this.ButtonAction.size() > 50) {
         throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
      }

      if (var1 == null) {
         throw new IllegalArgumentException("Metadata payload key cannot be null!");
      }

      if (var1.length() > 255) {
         throw new IllegalArgumentException("Metadata payload key is too long!");
      }

      if (var2 == null) {
         throw new IllegalArgumentException("Metadata payload value cannot be null!");
      }

      if (var2.length() > 255) {
         throw new IllegalArgumentException("Metadata payload value is too long!");
      }

      this.ButtonAction.put(var1, var2);
   }

   public String Button() {
      return this.ButtonAction != null
            && !this.ButtonAction.isEmpty()
         ? BatModClient.toJson(
            this.ButtonAction
         )
         : null;
   }

   public String CustomSpinner() {
      return this.Button;
   }

   @Override
   public String toString() {
      return Objects.toStringHelper(this)
         .add("name", this.Button)
         .add("description", this.CustomSpinner)
         .add("data", this.Button())
         .toString();
   }
}
