package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Set;

abstract class IIRHCHHOICHRICOOCRORCCIOOIHOIR<N> extends HHCCIRHCCCIIRHCROHIORHIRHHIORH<N> {
   protected abstract OOROOCCIRCCRHOIOIORIHCHHOOCCOR<N> RICIHORHRCRHRRHIIIRIIHHOHHCRRR();

   @Override
   public Set<N> nodes() {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().nodes();
   }

   @Override
   protected long edgeCount() {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().edges().size();
   }

   @Override
   public boolean isDirected() {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().isDirected();
   }

   @Override
   public boolean allowsSelfLoops() {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().allowsSelfLoops();
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RIHHOCIHIOCCRRCRRRICCOROCCRHHC() {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().RIHHOCIHIOCCRRCRRRICCOROCCRHHC();
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RHHOOIICORCROOHHHRIOIIHRCORRHO() {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().RHHOOIICORCROOHHHRIOIIHRCORRHO();
   }

   @Override
   public Set<N> adjacentNodes(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().adjacentNodes((N)var1);
   }

   @Override
   public Set<N> predecessors(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().predecessors((N)var1);
   }

   @Override
   public Set<N> successors(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().successors((N)var1);
   }

   @Override
   public Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> incidentEdges(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().incidentEdges((N)var1);
   }

   @Override
   public int degree(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().degree((N)var1);
   }

   @Override
   public int inDegree(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().inDegree((N)var1);
   }

   @Override
   public int outDegree(N var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().outDegree((N)var1);
   }

   @Override
   public boolean hasEdgeConnecting(N var1, N var2) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().hasEdgeConnecting((N)var1, (N)var2);
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      return this.RICIHORHRCRHRRHIIIRIIHHOHHCRRR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }
}
