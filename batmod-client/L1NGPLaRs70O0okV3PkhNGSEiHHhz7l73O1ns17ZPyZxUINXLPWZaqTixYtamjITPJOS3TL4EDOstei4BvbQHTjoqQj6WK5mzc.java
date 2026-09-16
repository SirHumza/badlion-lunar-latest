import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Set;

public class L1NGPLaRs70O0okV3PkhNGSEiHHhz7l73O1ns17ZPyZxUINXLPWZaqTixYtamjITPJOS3TL4EDOstei4BvbQHTjoqQj6WK5mzc
   extends ForwardingSet
   implements GB37CLEsuUx5EKhyli7onI2b2bej0WKCG9dd8K2cZtwlffkXphIJHyik5Z0hzrILtPJjIMJv1HcMmJ73Tkji1BdUZRrgF4hVa5Ca {
   private final Set Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = Sets.newHashSet();

   @Override
   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonElement var1) {
      if (var1.isJsonArray()) {
         for (JsonElement var3 : var1.getAsJsonArray()) {
            this.add(var3.getAsString());
         }
      }
   }

   @Override
   public JsonElement Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      JsonArray var1 = new JsonArray();

      for (String var3 : this) {
         var1.add(new JsonPrimitive(var3));
      }

      return var1;
   }

   protected Set delegate() {
      return this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
   }
}
