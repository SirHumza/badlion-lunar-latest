package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class RHOCHHIRRCHHHOHOIRROIROHHHIHIO<N, V> extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<N, V> {
   protected abstract RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> HHCCCCCHIHOOOICCHRRRIHIOICHIRH();

   @Override
   public Set<N> nodes() {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().nodes();
   }

   @Override
   protected long edgeCount() {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().edges().size();
   }

   @Override
   public boolean isDirected() {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().isDirected();
   }

   @Override
   public boolean allowsSelfLoops() {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().allowsSelfLoops();
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RIHHOCIHIOCCRRCRRRICCOROCCRHHC() {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().RIHHOCIHIOCCRRCRRRICCOROCCRHHC();
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RHHOOIICORCROOHHHRIOIIHRCORRHO() {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().RHHOOIICORCROOHHHRIOIIHRCORRHO();
   }

   @Override
   public Set<N> adjacentNodes(N var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().adjacentNodes((N)var1);
   }

   @Override
   public Set<N> predecessors(N var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().predecessors((N)var1);
   }

   @Override
   public Set<N> successors(N var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().successors((N)var1);
   }

   @Override
   public int degree(N var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().degree((N)var1);
   }

   @Override
   public int inDegree(N var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().inDegree((N)var1);
   }

   @Override
   public int outDegree(N var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().outDegree((N)var1);
   }

   @Override
   public boolean hasEdgeConnecting(N var1, N var2) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().hasEdgeConnecting((N)var1, (N)var2);
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Override
   public Optional<V> edgeValue(N var1, N var2) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().edgeValue((N)var1, (N)var2);
   }

   @Override
   public Optional<V> CORCOCICIRIOHROHROIIOOHICCHCRR(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
   }

   @Override
   public @Nullable V edgeValueOrDefault(N var1, N var2, @Nullable V var3) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().edgeValueOrDefault((N)var1, (N)var2, (V)var3);
   }

   @Override
   public @Nullable V RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1, @Nullable V var2) {
      return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (V)var2);
   }
}
