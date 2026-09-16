package org.yaml.snakeyaml.extensions.compactnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompactData {
   private final String prefix;
   private final List<String> arguments = new ArrayList<>();
   private final Map<String, String> properties = new HashMap<>();

   public CompactData(String var1) {
      this.prefix = var1;
   }

   public String getPrefix() {
      return this.prefix;
   }

   public Map<String, String> getProperties() {
      return this.properties;
   }

   public List<String> getArguments() {
      return this.arguments;
   }

   @Override
   public String toString() {
      return "CompactData: " + this.prefix + " " + this.properties;
   }
}
