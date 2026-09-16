package org.cadixdev.bombe.jar;

import java.util.Collections;
import java.util.List;

public interface JarEntryTransformer {
   default JarClassEntry transform(JarClassEntry var1) {
      return var1;
   }

   default JarResourceEntry transform(JarResourceEntry var1) {
      return var1;
   }

   default JarManifestEntry transform(JarManifestEntry var1) {
      return var1;
   }

   default JarServiceProviderConfigurationEntry transform(JarServiceProviderConfigurationEntry var1) {
      return var1;
   }

   default List<AbstractJarEntry> additions() {
      return Collections.emptyList();
   }
}
