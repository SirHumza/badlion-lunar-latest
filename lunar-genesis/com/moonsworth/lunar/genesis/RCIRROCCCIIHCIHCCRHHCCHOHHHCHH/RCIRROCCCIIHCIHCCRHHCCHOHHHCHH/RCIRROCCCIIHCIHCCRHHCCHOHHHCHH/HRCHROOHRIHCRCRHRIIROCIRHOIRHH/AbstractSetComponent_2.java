package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.AbstractSet;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<N> extends AbstractSet<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> {
   protected final N ROIRIHRHCIHICOHRRIHICHCIOHICHI;
   protected final OOROOCCIRCCRHOIOIORIHCHHOOCCOR<N> ROOCOIHIIIHOHHROCIORORICCRHHOI;

   RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(OOROOCCIRCCRHOIOIORIHCHHOOCCOR<N> var1, N var2) {
      this.ROOCOIHIIIHOHHROCIORORICCRHHOI = var1;
      this.ROIRIHRHCIHICOHRRIHICHCIOHICHI = (N)var2;
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int size() {
      return this.ROOCOIHIIIHOHHROCIORORICCRHHOI.isDirected()
         ? this.ROOCOIHIIIHOHHROCIORORICCRHHOI.inDegree(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI)
            + this.ROOCOIHIIIHOHHROCIORORICCRHHOI.outDegree(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI)
            - (this.ROOCOIHIIIHOHHROCIORORICCRHHOI.successors(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI).contains(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI) ? 1 : 0)
         : this.ROOCOIHIIIHOHHROCIORORICCRHHOI.adjacentNodes(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI).size();
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      if (!(var1 instanceof CIOHHCORHRCCRICCCORIHCRHCCCRRR)) {
         return false;
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
      if (this.ROOCOIHIIIHOHHROCIORORICCRHHOI.isDirected()) {
         if (!var2.isOrdered()) {
            return false;
         }

         Object var6 = var2.source();
         Object var7 = var2.target();
         return this.ROIRIHRHCIHICOHRRIHICHCIOHICHI.equals(var6)
               && this.ROOCOIHIIIHOHHROCIORORICCRHHOI.successors(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI).contains(var7)
            || this.ROIRIHRHCIHICOHRRIHICHCIOHICHI.equals(var7)
               && this.ROOCOIHIIIHOHHROCIORORICCRHHOI.predecessors(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI).contains(var6);
      } else {
         if (var2.isOrdered()) {
            return false;
         }

         Set var3 = this.ROOCOIHIIIHOHHROCIORORICCRHHOI.adjacentNodes(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI);
         Object var4 = var2.RHICCHICCROOHCCCIRICICRCOIIIOO();
         Object var5 = var2.HORHROCIIOHIICOIHOIOOIICCHHCCO();
         return this.ROIRIHRHCIHICOHRRIHICHCIOHICHI.equals(var5) && var3.contains(var4)
            || this.ROIRIHRHCIHICOHRRIHICHCIOHICHI.equals(var4) && var3.contains(var5);
      }
   }
}
