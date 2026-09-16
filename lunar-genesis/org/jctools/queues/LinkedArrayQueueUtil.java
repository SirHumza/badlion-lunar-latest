package org.jctools.queues;

import org.jctools.util.UnsafeRefArrayAccess;

public final class LinkedArrayQueueUtil {
   public static int length(Object[] var0) {
      return var0.length;
   }

   public static long modifiedCalcCircularRefElementOffset(long var0, long var2) {
      return UnsafeRefArrayAccess.REF_ARRAY_BASE + ((var0 & var2) << UnsafeRefArrayAccess.REF_ELEMENT_SHIFT - 1);
   }

   public static long nextArrayOffset(Object[] var0) {
      return UnsafeRefArrayAccess.REF_ARRAY_BASE + ((long)(length(var0) - 1) << UnsafeRefArrayAccess.REF_ELEMENT_SHIFT);
   }
}
