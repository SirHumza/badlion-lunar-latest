package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use GraphBuilder to create a real instance")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public interface IRRCCOICORICIHCHRHIHIHROIRHOCR<N> extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<N> {
   @Override
   Set<N> nodes();

   @Override
   Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> edges();

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

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();
}
