package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCROCOHHHICRHIHHOOCIIRRRCCIRR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class RHCHRCOCCOIIIHCHRHIRCORHRHRICR<N, V> implements HICRRICCHCCROOHHCHOCOCCHOIHHOC<N, V> {
   private final Map<N, V> RIOHOCOIRICRCHCHRIICHHROICRRCO;

   private RHCHRCOCCOIIIHCHRHIRCORHRHRICR(Map<N, V> var1) {
      this.RIOHOCOIRICRCHCHRIICHHROICRRCO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   static <N, V> RHCHRCOCCOIIIHCHRHIRCORHRHRICR<N, V> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(OCOHORHCROHICRRIHCIHHRRCIHICRI<N> var0) {
      switch (var0.IROIICIHOCCHCRIRHRORRIIIHHRCCC()) {
         case UNORDERED:
            return new RHCHRCOCCOIIIHCHRHIRCORHRHRICR<>(new HashMap<>(2, 1.0F));
         case STABLE:
            return new RHCHRCOCCOIIIHCHRHIRCORHRHRICR<>(new LinkedHashMap<>(2, 1.0F));
         default:
            throw new AssertionError(var0.IROIICIHOCCHCRIRHRORRIIIHHRCCC());
      }
   }

   static <N, V> RHCHRCOCCOIIIHCHRHIRCORHRHRICR<N, V> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(Map<N, V> var0) {
      return new RHCHRCOCCOIIIHCHRHIRCORHRHRICR<>(OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var0));
   }

   @Override
   public Set<N> adjacentNodes() {
      return Collections.unmodifiableSet(this.RIOHOCOIRICRCHCHRIICHHROICRRCO.keySet());
   }

   @Override
   public Set<N> predecessors() {
      return this.adjacentNodes();
   }

   @Override
   public Set<N> successors() {
      return this.adjacentNodes();
   }

   @Override
   public Iterator<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> incidentEdgeIterator(final N var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.RIOHOCOIRICRCHCHRIICHHROICRRCO.keySet().iterator(),
         new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<N, CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>>(
            
         ) {
            public CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HIOHICORCIOOHORHORIHHRIOCRCCRR(N var1x) {
               return CIOHHCORHRCCRICCCORIHCRHCCCRRR.HCHRIROHHHCORIOCROOCHRCIOROOCI((N)var1, (N)var1x);
            }
         }
      );
   }

   @Override
   public V value(N var1) {
      return this.RIOHOCOIRICRCHCHRIICHHROICRRCO.get(var1);
   }

   @Override
   public void removePredecessor(N var1) {
      Object var2 = this.removeSuccessor((N)var1);
   }

   @Override
   public V removeSuccessor(N var1) {
      return this.RIOHOCOIRICRCHCHRIICHHROICRRCO.remove(var1);
   }

   @Override
   public void addPredecessor(N var1, V var2) {
      Object var3 = this.addSuccessor((N)var1, (V)var2);
   }

   @Override
   public V addSuccessor(N var1, V var2) {
      return this.RIOHOCOIRICRCHCHRIICHHROICRRCO.put((N)var1, (V)var2);
   }
}
