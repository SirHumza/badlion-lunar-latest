package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR<T> {
   private final Deque<Collection<T>> RHICIRCCHCRHOOOCCCIIOOIRRIORHO = new ArrayDeque<>();
   private Collection<T> IOOOROOIRRRIOORHRHROHCIHCORCIR = new ArrayList<>();

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(int var1) {
      for (int var2 = 0; var2 < var1 + 1; var2++) {
         this.RHICIRCCHCRHOOOCCCIIOOIRRIORHO.add(new ArrayList<>());
      }
   }

   public void add(T var1) {
      this.RHICIRCCHCRHOOOCCCIIOOIRRIORHO.getLast().add((T)var1);
   }

   public Collection<T> ICHIIOCIOCRCOHIRCOOCHOIHIIHHOO() {
      this.IOOOROOIRRRIOORHRHROHCIHCORCIR.clear();
      this.RHICIRCCHCRHOOOCCCIIOOIRRIORHO.addLast(this.IOOOROOIRRRIOORHRHROHCIHCORCIR);
      this.IOOOROOIRRRIOORHRHROHCIHCORCIR = this.RHICIRCCHCRHOOOCCCIIOOIRRIORHO.pollFirst();
      return this.IOOOROOIRRRIOORHRHROHCIHCORCIR;
   }

   public void clear() {
      this.RHICIRCCHCRHOOOCCCIIOOIRRIORHO.forEach(Collection::clear);
      this.IOOOROOIRRRIOORHRHROHCIHCORCIR.clear();
   }
}
