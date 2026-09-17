package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH<N> extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<N> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<N> {
   @Override
   public final boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR)) {
         return false;
      }

      IRRCCOICORICIHCHRHIHIHROIRHOCR var2 = (IRRCCOICORICIHCHRHIHIHROIRHOCR)var1;
      return this.isDirected() == var2.isDirected() && this.nodes().equals(var2.nodes()) && this.edges().equals(var2.edges());
   }

   @Override
   public final int hashCode() {
      return this.edges().hashCode();
   }

   @Override
   public String toString() {
      return "isDirected: " + this.isDirected() + ", allowsSelfLoops: " + this.allowsSelfLoops() + ", nodes: " + this.nodes() + ", edges: " + this.edges();
   }
}
