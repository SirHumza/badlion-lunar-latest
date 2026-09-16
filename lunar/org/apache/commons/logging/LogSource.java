package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.NoOpLog;

public class LogSource {
   protected static Hashtable logs = new Hashtable();
   protected static boolean log4jIsAvailable = false;
   protected static boolean jdk14IsAvailable = false;
   protected static Constructor logImplctor = null;

   private LogSource() {
   }

   public static void setLogImplementation(String var0) {
      try {
         Class var1 = Class.forName(var0);
         Class[] var2 = new Class[]{"".getClass()};
         logImplctor = var1.getConstructor(var2);
      } catch (Throwable var3) {
         logImplctor = null;
      }
   }

   public static void setLogImplementation(Class var0) {
      Class[] var1 = new Class[]{"".getClass()};
      logImplctor = var0.getConstructor(var1);
   }

   public static Log getInstance(String var0) {
      Log var1 = (Log)logs.get(var0);
      if (null == var1) {
         var1 = makeNewLogInstance(var0);
         logs.put(var0, var1);
      }

      return var1;
   }

   public static Log getInstance(Class var0) {
      return getInstance(var0.getName());
   }

   public static Log makeNewLogInstance(String var0) {
      Log var1 = null;

      try {
         Object[] var2 = new Object[]{var0};
         var1 = (Log)logImplctor.newInstance(var2);
      } catch (Throwable var3) {
         var1 = null;
      }

      if (null == var1) {
         var1 = new NoOpLog(var0);
      }

      return var1;
   }

   public static String[] getLogNames() {
      return logs.keySet().toArray(new String[logs.size()]);
   }

   static {
      try {
         if (null != Class.forName("org.apache.log4j.Logger")) {
            log4jIsAvailable = true;
         } else {
            log4jIsAvailable = false;
         }
      } catch (Throwable var8) {
         log4jIsAvailable = false;
      }

      try {
         if (null != Class.forName("java.util.logging.Logger") && null != Class.forName("org.apache.commons.logging.impl.Jdk14Logger")) {
            jdk14IsAvailable = true;
         } else {
            jdk14IsAvailable = false;
         }
      } catch (Throwable var9) {
         jdk14IsAvailable = false;
      }

      String var0 = null;

      try {
         var0 = System.getProperty("org.apache.commons.logging.log");
         if (var0 == null) {
            var0 = System.getProperty("org.apache.commons.logging.Log");
         }
      } catch (Throwable var7) {
      }

      if (var0 != null) {
         try {
            setLogImplementation(var0);
         } catch (Throwable var6) {
            try {
               setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
            } catch (Throwable var5) {
            }
         }
      } else {
         try {
            if (log4jIsAvailable) {
               setLogImplementation("org.apache.commons.logging.impl.Log4JLogger");
            } else if (jdk14IsAvailable) {
               setLogImplementation("org.apache.commons.logging.impl.Jdk14Logger");
            } else {
               setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
            }
         } catch (Throwable var4) {
            try {
               setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
            } catch (Throwable var3) {
            }
         }
      }
   }
}
