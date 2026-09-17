package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public interface RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<N> {
   @Override
   Set<N> nodes();

   @Override
   Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> edges();

   IRRCCOICORICIHCHRHIHIHROIRHOCR<N> CRCOCCRIOIHIRRROHCCRIRIICOICCO();

   @Override
   boolean isDirected();

   @Override
   boolean allowsSelfLoops();

   @Override
   OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RIHHOCIHIOCCRRCRRRICCOROCCRHHC();

   @Override
   OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RHHOOIICORCROOHHHRIOIIHRCORRHO();

   @Override
   Set<N> adjacentNodes(N var1);

   @Override
   Set<N> predecessors(N var1);

   @Override
   Set<N> successors(N var1);

   @Override
   Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> incidentEdges(N var1);

   @Override
   int degree(N var1);

   @Override
   int inDegree(N var1);

   @Override
   int outDegree(N var1);

   @Override
   boolean hasEdgeConnecting(N var1, N var2);

   @Override
   boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1);

   Optional<V> edgeValue(N var1, N var2);

   Optional<V> CORCOCICIRIOHROHROIIOOHICCHCRR(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1);

   @Nullable V edgeValueOrDefault(N var1, N var2, @Nullable V var3);

   @Nullable V RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1, @Nullable V var2);

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();
}
