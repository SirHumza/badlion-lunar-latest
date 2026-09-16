package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import java.io.Serializable;
import java.util.Objects;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Serializable {
   private static final long RIOHCHROOIIIOORORHHHHCRROHCRIO = 1L;
   protected final Class<?> HRORIRIRICRRCCIOROHICIHHHRHCOO;
   protected final int RCIHICHRHCRRCOCCOHRRCCCIRHRRRC;
   protected String CCHHRCCROCROHIORROHORORICIHIII;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<?> var1) {
      this(var1, null);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<?> var1, String var2) {
      this.HRORIRIRICRRCCIOROHICIHHHRHCOO = var1;
      this.RCIHICHRHCRRCOCCOHRRCCCIRHRRRC = var1.getName().hashCode() + (var2 == null ? 0 : var2.hashCode());
      this.setName(var2);
   }

   public Class<?> getType() {
      return this.HRORIRIRICRRCCIOROHICIHHHRHCOO;
   }

   public String getName() {
      return this.CCHHRCCROCROHIORROHORORICIHIII;
   }

   public void setName(String var1) {
      this.CCHHRCCROCROHIORROHORORICIHIII = var1 != null && !var1.isEmpty() ? var1 : null;
   }

   public boolean hasName() {
      return this.CCHHRCCROCROHIORROHORORICIHIII != null;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (var1.getClass() != this.getClass()) {
         return false;
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
      return this.HRORIRIRICRRCCIOROHICIHHHRHCOO == var2.HRORIRIRICRRCCIOROHICIHHHRHCOO
         && Objects.equals(this.CCHHRCCROCROHIORROHORORICIHIII, var2.CCHHRCCROCROHIORROHORORICIHIII);
   }

   @Override
   public int hashCode() {
      return this.RCIHICHRHCRRCOCCOHRRCCCIRHRRRC;
   }

   @Override
   public String toString() {
      return "[NamedType, class "
         + this.HRORIRIRICRRCCIOROHICIHHHRHCOO.getName()
         + ", name: "
         + (this.CCHHRCCROCROHIORROHORORICIHIII == null ? "null" : "'" + this.CCHHRCCROCROHIORROHORORICIHIII + "'")
         + "]";
   }
}
