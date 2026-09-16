package org.cadixdev.lorenz.impl.model;

import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;

public class MethodParameterMappingImpl extends AbstractMemberMappingImpl<MethodParameterMapping, MethodMapping> implements MethodParameterMapping {
   private final int index;

   public MethodParameterMappingImpl(MethodMapping var1, int var2, String var3) {
      super(var1, String.valueOf(var2), var3);
      this.index = var2;
   }

   @Override
   public int getIndex() {
      return this.index;
   }

   @Override
   public String getFullObfuscatedName() {
      return this.getObfuscatedName();
   }

   @Override
   public String getFullDeobfuscatedName() {
      return this.getDeobfuscatedName();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || super.equals(var1) && var1 instanceof MethodParameterMapping;
   }
}
