package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T extends Number & Comparable<T>> {
   T getMin();

   T getMax();

   boolean OCHHOOIIOIIHOIHCCOHCOOOHRICHIR();

   boolean HROIRIHCIHHCICRHIOHORRCOOHHROH();

   int RHCHHHCCIHOHOCHOIRORRHRCCRIRIR();

   String OCOCHIOCCCHOHOORHCCOIHICHRCRHO();

   T HIHHOCRHHRORRHHRORRRIIHHORIHOC(double var1);

   default boolean IRHOOHROCICOCIICROOROIICCCHIRC() {
      return this.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() <= 1;
   }

   default String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1) {
      return this.IRHOOHROCICOCIICROOROIICCCHIRC() ? Math.round(var1.doubleValue()) + "" : String.format("%.2f", var1.doubleValue());
   }

   default void RRHOOOORORHHOOIHRCCHIIHHIIIIOH(JsonObject var1) {
      var1.addProperty("min", this.getMin());
      var1.addProperty("max", this.getMax());
      var1.addProperty("forceMin", this.OCHHOOIIOIIHOIHCCOHCOOOHRICHIR());
      var1.addProperty("forceMax", this.HROIRIHCIHHCICRHIOHORRCOOHHROH());
      var1.addProperty("value_type", this.OCOCHIOCCCHOHOORHCCOIHICHRCRHO());
      var1.addProperty("roundTo", this.IRHOOHROCICOCIICROOROIICCCHIRC() ? 1 : this.RHCHHHCCIHOHOCHOIRORRHRCCRIRIR());
   }
}
