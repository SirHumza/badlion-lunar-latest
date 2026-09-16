package org.cadixdev.lorenz.impl.model;

import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public class TopLevelClassMappingImpl extends AbstractClassMappingImpl<TopLevelClassMapping, MappingSet> implements TopLevelClassMapping {
   public TopLevelClassMappingImpl(MappingSet var1, String var2, String var3) {
      super(var1, var2.replace('.', '/'), var3.replace('.', '/'));
   }

   public TopLevelClassMapping setDeobfuscatedName(String var1) {
      return (TopLevelClassMapping)super.setDeobfuscatedName(var1.replace('.', '/'));
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || super.equals(var1) && var1 instanceof TopLevelClassMapping;
   }
}
