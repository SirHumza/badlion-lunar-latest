package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayDeque;
import java.util.Deque;
import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final int RRHRRORHIHRIHRCIOICCHHHOOOHIRH = 1000;
   private final Deque<Object[]> queue = new ArrayDeque<>(1000);
   private boolean CHHRHCOCROHICCRHCOCRHHOOCIOHIH;

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object... var1) {
      if (!this.CHHRHCOCROHICCRHCOCRHHOOCIOHIH) {
         while (this.queue.size() >= 1000) {
            this.queue.removeLast();
         }

         this.queue.push(var1);
      }
   }

   public Object[] RHCHHCIOOOIHCCRCROCRHORRRIRHOR() {
      return this.queue.pop();
   }

   public void clear() {
      this.queue.clear();
   }

   public boolean isEmpty() {
      return this.queue.isEmpty();
   }

   @Generated
   public void IIHROHOIOHICCRRHRICHCIHRCROOIO(boolean var1) {
      this.CHHRHCOCROHICCRHCOCRHHOOCIOHIH = var1;
   }
}
