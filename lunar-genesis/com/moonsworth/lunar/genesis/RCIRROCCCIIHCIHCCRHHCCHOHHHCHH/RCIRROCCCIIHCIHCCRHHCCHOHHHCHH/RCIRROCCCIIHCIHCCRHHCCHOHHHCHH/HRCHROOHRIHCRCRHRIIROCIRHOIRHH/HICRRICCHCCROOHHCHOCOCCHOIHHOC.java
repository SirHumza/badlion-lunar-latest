package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

interface HICRRICCHCCROOHHCHOCOCCHOIHHOC<N, V> {
   Set<N> adjacentNodes();

   Set<N> predecessors();

   Set<N> successors();

   Iterator<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> incidentEdgeIterator(N var1);

   @Nullable V value(N var1);

   void removePredecessor(N var1);

   @CanIgnoreReturnValue
   V removeSuccessor(N var1);

   void addPredecessor(N var1, V var2);

   @CanIgnoreReturnValue
   V addSuccessor(N var1, V var2);
}
