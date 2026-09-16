package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use NetworkBuilder to create a real instance")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public interface IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> extends IOHHOIIOCRHCHHCRORICCOHOHROOIH<N>, OHIIIOHIRIRCCRRIOIICCHHIORRHOH<N> {
   Set<N> nodes();

   Set<E> edges();

   IRRCCOICORICIHCHRHIHIHROIRHOCR<N> CRCOCCRIOIHIRRROHCCRIRIICOICCO();

   boolean isDirected();

   boolean allowsParallelEdges();

   boolean allowsSelfLoops();

   OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RIHHOCIHIOCCRRCRRRICCOROCCRHHC();

   OCOHORHCROHICRRIHCIHHRRCIHICRI<E> IROHIOOIROOOCROCOHORORHRIHRCRC();

   Set<N> adjacentNodes(N var1);

   Set<N> predecessors(N var1);

   Set<N> successors(N var1);

   Set<E> incidentEdges(N var1);

   Set<E> inEdges(N var1);

   Set<E> outEdges(N var1);

   int degree(N var1);

   int inDegree(N var1);

   int outDegree(N var1);

   CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HIRIHCORIRIORCCHCOORIHIOIICOIH(E var1);

   Set<E> adjacentEdges(E var1);

   Set<E> edgesConnecting(N var1, N var2);

   Set<E> CRRRICCRROCOHHOHIICIHORCOORRRH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1);

   Optional<E> edgeConnecting(N var1, N var2);

   Optional<E> RRCRRCORICCHOHHIRCHIROOHIIOHCO(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1);

   @Nullable E edgeConnectingOrNull(N var1, N var2);

   @Nullable E RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1);

   boolean hasEdgeConnecting(N var1, N var2);

   boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1);

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();
}
