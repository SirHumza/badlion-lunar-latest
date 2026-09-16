package org.yaml.snakeyaml.inspector;

import org.yaml.snakeyaml.nodes.Tag;

public final class TrustedTagInspector implements TagInspector {
   @Override
   public boolean isGlobalTagAllowed(Tag var1) {
      return true;
   }
}
