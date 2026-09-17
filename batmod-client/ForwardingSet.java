import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Set;

public class L1NGPLaRs70O0okV3PkhNGSEiHHhz7l73O1ns17ZPyZxUINXLPWZaqTixYtamjITPJOS3TL4EDOstei4BvbQHTjoqQj6WK5mzc
   extends ForwardingSet
   implements GB37CLEsuUx5EKhyli7onI2b2bej0WKCG9dd8K2cZtwlffkXphIJHyik5Z0hzrILtPJjIMJv1HcMmJ73Tkji1BdUZRrgF4hVa5Ca {
   private final Set BatModClient = Sets.newHashSet();

   @Override
   public void BatModClient(JsonElement var1) {
      if (var1.isJsonArray()) {
         for (JsonElement var3 : var1.getAsJsonArray()) {
            this.add(var3.getAsString());
         }
      }
   }

   @Override
   public JsonElement BatModClient() {
      JsonArray var1 = new JsonArray();

      for (String var3 : this) {
         var1.add(new JsonPrimitive(var3));
      }

      return var1;
   }

   protected Set delegate() {
      return this.BatModClient;
   }
}
