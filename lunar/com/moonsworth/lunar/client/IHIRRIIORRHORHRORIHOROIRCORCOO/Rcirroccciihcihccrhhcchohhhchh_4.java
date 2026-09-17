package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO;

import com.eliotlash.molang.ast.Assignable;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   private final Object2IntMap<Assignable> RRHORCRHCHRROCRRRRIIOOOORRCOCC = new Object2IntOpenHashMap();
   private int OOHCOIOOHHOHRCHOHCCOCIHCCOHRIO = 2;

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Assignable var1, boolean var2) {
      if (this.RRHORCRHCHRROCRRRRIIOOOORRCOCC.containsKey(var1)) {
         return this.RRHORCRHCHRROCRRRRIIOOOORRCOCC.getInt(var1);
      }

      this.RRHORCRHCHRROCRRRRIIOOOORRCOCC.put(var1, this.OOHCOIOOHHOHRCHOHCCOCIHCCOHRIO);
      int var3 = this.OOHCOIOOHHOHRCHOHCCOCIHCCOHRIO;
      this.OOHCOIOOHHOHRCHOHCCOCIHCCOHRIO += var2 ? 2 : 1;
      return var3;
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Assignable var1) {
      return this.RRHORCRHCHRROCRRRRIIOOOORRCOCC.containsKey(var1);
   }

   public int RRHOHCOCHCCIHICOCIRCHICCRHIHHO() {
      return this.OOHCOIOOHHOHRCHOHCCOCIHCCOHRIO++;
   }

   @Override
   public String toString() {
      return "VariablesMap{assignableMap=" + this.RRHORCRHCHRROCRRRRIIOOOORRCOCC + ", nextVarId=" + this.OOHCOIOOHHOHRCHOHCCOCIHCCOHRIO + "}";
   }
}
