package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<N, E> implements OOCCRCRCOHIIORCCORCRCIRRROIOOR<N, E> {
   protected final Map<E, N> COCROIHHCIIIHRROIIHIRHRHHCCRCI;

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Map<E, N> var1) {
      this.COCROIHHCIIIHRROIIHIRHRHHCCRCI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
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
   public Set<E> incidentEdges() {
      return Collections.unmodifiableSet(this.COCROIHHCIIIHRROIIHIRHRHHCCRCI.keySet());
   }

   @Override
   public Set<E> inEdges() {
      return this.incidentEdges();
   }

   @Override
   public Set<E> outEdges() {
      return this.incidentEdges();
   }

   @Override
   public N adjacentNode(E var1) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         this.COCROIHHCIIIHRROIIHIRHRHHCCRCI.get(var1)
      );
   }

   @Override
   public N removeInEdge(E var1, boolean var2) {
      return !var2 ? this.removeOutEdge((E)var1) : null;
   }

   @Override
   public N removeOutEdge(E var1) {
      Object var2 = this.COCROIHHCIIIHRROIIHIRHRHHCCRCI.remove(var1);
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (N)var2
      );
   }

   @Override
   public void addInEdge(E var1, N var2, boolean var3) {
      if (!var3) {
         this.addOutEdge((E)var1, (N)var2);
      }
   }

   @Override
   public void addOutEdge(E var1, N var2) {
      Object var3 = this.COCROIHHCIIIHRROIIHIRHRHHCCRCI.put((E)var1, (N)var2);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         var3 == null
      );
   }
}
