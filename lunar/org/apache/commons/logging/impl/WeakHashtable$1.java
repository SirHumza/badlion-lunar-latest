package org.apache.commons.logging.impl;

import java.util.Enumeration;

class WeakHashtable$1 implements Enumeration {
   private final Enumeration val$enumer;
   private final WeakHashtable this$0;

   WeakHashtable$1(WeakHashtable var1, Enumeration var2) {
      this.this$0 = var1;
      this.val$enumer = var2;
   }

   public boolean hasMoreElements() {
      return this.val$enumer.hasMoreElements();
   }

   public Object nextElement() {
      WeakHashtable.Referenced var1 = (WeakHashtable.Referenced)this.val$enumer.nextElement();
      return WeakHashtable.Referenced.access$100(var1);
   }
}
