package org.slf4j;

import java.io.Closeable;
import java.util.Deque;
import java.util.Map;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Reporter;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

public class MDC {
   static final String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
   private static final String MDC_APAPTER_CANNOT_BE_NULL_MESSAGE = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA";
   static final String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
   static MDCAdapter mdcAdapter;

   private MDC() {
   }

   public static void put(String var0, String var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("key parameter cannot be null");
      }

      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      }

      mdcAdapter.put(var0, var1);
   }

   public static MDC.MDCCloseable putCloseable(String var0, String var1) {
      put(var0, var1);
      return new MDC.MDCCloseable(var0);
   }

   public static String get(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("key parameter cannot be null");
      } else if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      } else {
         return mdcAdapter.get(var0);
      }
   }

   public static void remove(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("key parameter cannot be null");
      }

      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      }

      mdcAdapter.remove(var0);
   }

   public static void clear() {
      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      }

      mdcAdapter.clear();
   }

   public static Map<String, String> getCopyOfContextMap() {
      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      } else {
         return mdcAdapter.getCopyOfContextMap();
      }
   }

   public static void setContextMap(Map<String, String> var0) {
      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      }

      mdcAdapter.setContextMap(var0);
   }

   public static MDCAdapter getMDCAdapter() {
      return mdcAdapter;
   }

   public static void pushByKey(String var0, String var1) {
      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      }

      mdcAdapter.pushByKey(var0, var1);
   }

   public static String popByKey(String var0) {
      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      } else {
         return mdcAdapter.popByKey(var0);
      }
   }

   public Deque<String> getCopyOfDequeByKey(String var1) {
      if (mdcAdapter == null) {
         throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
      } else {
         return mdcAdapter.getCopyOfDequeByKey(var1);
      }
   }

   static {
      SLF4JServiceProvider var0 = LoggerFactory.getProvider();
      if (var0 != null) {
         mdcAdapter = var0.getMDCAdapter();
      } else {
         Reporter.error("Failed to find provider.");
         Reporter.error("Defaulting to no-operation MDCAdapter implementation.");
         mdcAdapter = new NOPMDCAdapter();
      }
   }

   public static class MDCCloseable implements Closeable {
      private final String key;

      private MDCCloseable(String var1) {
         this.key = var1;
      }

      @Override
      public void close() {
         MDC.remove(this.key);
      }
   }
}
