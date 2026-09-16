package org.cadixdev.lorenz.impl.model;

import java.util.Objects;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MemberMapping;

public abstract class AbstractMemberMappingImpl<M extends MemberMapping, P extends Mapping> extends AbstractMappingImpl<M, P> implements MemberMapping<M, P> {
   private final P parent;

   protected AbstractMemberMappingImpl(P var1, String var2, String var3) {
      super(var1.getMappings(), var2, var3);
      this.parent = (P)var1;
   }

   @Override
   public P getParent() {
      return this.parent;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!super.equals(var1)) {
         return false;
      }

      if (!(var1 instanceof MemberMapping)) {
         return false;
      }

      MemberMapping var2 = (MemberMapping)var1;
      return Objects.equals(this.parent, var2.getParent());
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.parent.getFullObfuscatedName(), this.parent.getFullDeobfuscatedName());
   }
}
