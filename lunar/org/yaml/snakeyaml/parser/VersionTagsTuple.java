package org.yaml.snakeyaml.parser;

import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;

class VersionTagsTuple {
   private final DumperOptions.Version version;
   private final Map<String, String> tags;

   public VersionTagsTuple(DumperOptions.Version var1, Map<String, String> var2) {
      this.version = var1;
      this.tags = var2;
   }

   public DumperOptions.Version getVersion() {
      return this.version;
   }

   public Map<String, String> getTags() {
      return this.tags;
   }

   @Override
   public String toString() {
      return String.format("VersionTagsTuple<%s, %s>", this.version, this.tags);
   }
}
