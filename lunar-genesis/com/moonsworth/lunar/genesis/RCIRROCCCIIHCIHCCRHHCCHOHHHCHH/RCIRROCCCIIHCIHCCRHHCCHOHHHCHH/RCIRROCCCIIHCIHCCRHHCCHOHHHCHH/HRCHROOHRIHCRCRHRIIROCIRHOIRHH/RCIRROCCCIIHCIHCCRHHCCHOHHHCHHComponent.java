package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROCHRRCORRCOOOOOCOICOCROIIHIHH;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<N, V> extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<N> implements RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> {
   @Override
   public IRRCCOICORICIHCHRHIHIHROIRHOCR<N> CRCOCCRIOIHIRRROHCCRIRIICOICCO() {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH<N>() {
         @Override
         public Set<N> nodes() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.nodes();
         }

         @Override
         public Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> edges() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.edges();
         }

         @Override
         public boolean isDirected() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.isDirected();
         }

         @Override
         public boolean allowsSelfLoops() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.allowsSelfLoops();
         }

         @Override
         public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RIHHOCIHIOCCRRCRRRICCOROCCRHHC() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.RIHHOCIHIOCCRRCRRRICCOROCCRHHC();
         }

         @Override
         public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RHHOOIICORCROOHHHRIOIIHRCORRHO() {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.RHHOOIICORCROOHHHRIOIIHRCORRHO();
         }

         @Override
         public Set<N> adjacentNodes(N var1) {
            return (Set<N>)HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.adjacentNodes(var1);
         }

         @Override
         public Set<N> predecessors(N var1) {
            return (Set<N>)HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.predecessors(var1);
         }

         @Override
         public Set<N> successors(N var1) {
            return (Set<N>)HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.successors(var1);
         }

         @Override
         public int degree(N var1) {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.degree(var1);
         }

         @Override
         public int inDegree(N var1) {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.inDegree(var1);
         }

         @Override
         public int outDegree(N var1) {
            return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.outDegree(var1);
         }
      };
   }

   @Override
   public Optional<V> edgeValue(N var1, N var2) {
      return Optional.ofNullable(this.edgeValueOrDefault((N)var1, (N)var2, null));
   }

   @Override
   public Optional<V> CORCOCICIRIOHROHROIIOOHICCHCRR(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      return Optional.ofNullable(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null));
   }

   @Override
   public final boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof RHRRHOHCRCHCCRRHOHHIRCCHOCICHC)) {
         return false;
      }

      RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var2 = (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC)var1;
      return this.isDirected() == var2.isDirected()
         && this.nodes().equals(var2.nodes())
         && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this).equals(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2));
   }

   @Override
   public final int hashCode() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this).hashCode();
   }

   @Override
   public String toString() {
      return "isDirected: "
         + this.isDirected()
         + ", allowsSelfLoops: "
         + this.allowsSelfLoops()
         + ", nodes: "
         + this.nodes()
         + ", edges: "
         + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   private static <N, V> Map<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR var1 = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>, V>(
         
      ) {
         public V CRICCOOHHHCHOORCICOCOHIHOIRHOO(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
            return (V)var0.edgeValueOrDefault(var1.RHICCHICCROOHCCCIRICICRCOIIIOO(), var1.HORHROCIIOHIICOIHOIOOIICCHHCCO(), null);
         }
      };
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.edges(), var1);
   }
}
