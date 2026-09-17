import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kIEmAXkGWrKa6WgAaD9RdUxNmBgFErVhqQxlhumSQcw69apmdFXdlXgb4cDsQ09Z872QbEqnhZQ8kH3N4EizIv89IiQWvxa1HJm3
   implements MIhWEF0Lmu8kDXveHvHNGS6xXNmLbQ5tjSM7NVwSiEnKHSAiP2xxi3lLXjXjqCrcMwicGQBy2oEg2vFgNCvcmVnOAd8JCgS95Gj {
   private static final Logger BatModClient = LogManager.getLogger();
   protected final Map CustomSpinner = this.BatModClient();

   protected Map BatModClient() {
      return Maps.newHashMap();
   }

   @Override
   public Object BatModClient(Object var1) {
      return this.CustomSpinner.get(var1);
   }

   @Override
   public void BatModClient(Object var1, Object var2) {
      Validate.notNull(var1);
      Validate.notNull(var2);
      if (this.CustomSpinner.containsKey(var1)) {
         BatModClient.debug(
            "Adding duplicate key '" + var1 + "' to registry"
         );
      }

      this.CustomSpinner.put(var1, var2);
   }

   public Set CustomSpinner() {
      return Collections.unmodifiableSet(this.CustomSpinner.keySet());
   }

   public boolean CustomSpinner(Object var1) {
      return this.CustomSpinner.containsKey(var1);
   }

   @Override
   public Iterator iterator() {
      return this.CustomSpinner.values().iterator();
   }
}
