package org.yaml.snakeyaml.inspector;

import java.util.List;
import org.yaml.snakeyaml.nodes.Tag;

public final class TrustedPrefixesTagInspector implements TagInspector {
   private final List<String> trustedList;

   public TrustedPrefixesTagInspector(List<String> var1) {
      this.trustedList = var1;
   }

   @Override
   public boolean isGlobalTagAllowed(Tag var1) {
      for (String var3 : this.trustedList) {
         if (var1.getClassName().startsWith(var3)) {
            return true;
         }
      }

      return false;
   }
}
