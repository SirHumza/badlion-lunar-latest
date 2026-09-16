package org.apache.commons.logging;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public abstract class LogFactory {
   public static final String PRIORITY_KEY = "priority";
   public static final String TCCL_KEY = "use_tccl";
   public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
   public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
   public static final String FACTORY_PROPERTIES = "commons-logging.properties";
   protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
   public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
   private static PrintStream diagnosticsStream = null;
   private static String diagnosticPrefix;
   public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
   private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
   private static ClassLoader thisClassLoader = getClassLoader(
      LogFactory.class$org$apache$commons$logging$LogFactory == null
         ? (LogFactory.class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
         : LogFactory.class$org$apache$commons$logging$LogFactory
   );
   protected static Hashtable factories = null;
   protected static LogFactory nullClassLoaderFactory = null;
   static Class class$java$lang$Thread;
   static Class class$org$apache$commons$logging$LogFactory;

   protected LogFactory() {
   }

   public abstract Object getAttribute(String var1);

   public abstract String[] getAttributeNames();

   public abstract Log getInstance(Class var1);

   public abstract Log getInstance(String var1);

   public abstract void release();

   public abstract void removeAttribute(String var1);

   public abstract void setAttribute(String var1, Object var2);

   private static final Hashtable createFactoryStore() {
      Hashtable var0 = null;

      String var1;
      try {
         var1 = getSystemProperty("org.apache.commons.logging.LogFactory.HashtableImpl", null);
      } catch (SecurityException var3) {
         var1 = null;
      }

      if (var1 == null) {
         var1 = "org.apache.commons.logging.impl.WeakHashtable";
      }

      try {
         Class var2 = Class.forName(var1);
         var0 = (Hashtable)var2.newInstance();
      } catch (Throwable var4) {
         if (!"org.apache.commons.logging.impl.WeakHashtable".equals(var1)) {
            if (isDiagnosticsEnabled()) {
               logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
            } else {
               System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
            }
         }
      }

      if (var0 == null) {
         var0 = new Hashtable();
      }

      return var0;
   }

   private static String trim(String var0) {
      return var0 == null ? null : var0.trim();
   }

   public static LogFactory getFactory() {
      ClassLoader var0 = getContextClassLoaderInternal();
      if (var0 == null && isDiagnosticsEnabled()) {
         logDiagnostic("Context classloader is null.");
      }

      LogFactory var1 = getCachedFactory(var0);
      if (var1 != null) {
         return var1;
      }

      if (isDiagnosticsEnabled()) {
         logDiagnostic("[LOOKUP] LogFactory implementation requested for the first time for context classloader " + objectId(var0));
         logHierarchy("[LOOKUP] ", var0);
      }

      Properties var2 = getConfigurationFile(var0, "commons-logging.properties");
      ClassLoader var3 = var0;
      if (var2 != null) {
         String var4 = var2.getProperty("use_tccl");
         if (var4 != null && !Boolean.valueOf(var4)) {
            var3 = thisClassLoader;
         }
      }

      if (isDiagnosticsEnabled()) {
         logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
      }

      try {
         String var11 = getSystemProperty("org.apache.commons.logging.LogFactory", null);
         if (var11 != null) {
            if (isDiagnosticsEnabled()) {
               logDiagnostic(
                  "[LOOKUP] Creating an instance of LogFactory class '"
                     + var11
                     + "' as specified by system property "
                     + "org.apache.commons.logging.LogFactory"
               );
            }

            var1 = newFactory(var11, var3, var0);
         } else if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
         }
      } catch (SecurityException var9) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic(
               "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
                  + trim(var9.getMessage())
                  + "]. Trying alternative implementations..."
            );
         }
      } catch (RuntimeException var10) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic(
               "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
                  + trim(var10.getMessage())
                  + "] as specified by a system property."
            );
         }

         throw var10;
      }

      if (var1 == null) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic(
               "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            );
         }

         try {
            InputStream var12 = getResourceAsStream(var0, "META-INF/services/org.apache.commons.logging.LogFactory");
            if (var12 != null) {
               BufferedReader var5;
               try {
                  var5 = new BufferedReader(new InputStreamReader(var12, "UTF-8"));
               } catch (UnsupportedEncodingException var7) {
                  var5 = new BufferedReader(new InputStreamReader(var12));
               }

               String var6 = var5.readLine();
               var5.close();
               if (var6 != null && !"".equals(var6)) {
                  if (isDiagnosticsEnabled()) {
                     logDiagnostic(
                        "[LOOKUP]  Creating an instance of LogFactory class "
                           + var6
                           + " as specified by file '"
                           + "META-INF/services/org.apache.commons.logging.LogFactory"
                           + "' which was present in the path of the context"
                           + " classloader."
                     );
                  }

                  var1 = newFactory(var6, var3, var0);
               }
            } else if (isDiagnosticsEnabled()) {
               logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
            }
         } catch (Exception var8) {
            if (isDiagnosticsEnabled()) {
               logDiagnostic(
                  "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
                     + trim(var8.getMessage())
                     + "]. Trying alternative implementations..."
               );
            }
         }
      }

      if (var1 == null) {
         if (var2 != null) {
            if (isDiagnosticsEnabled()) {
               logDiagnostic(
                  "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
               );
            }

            String var13 = var2.getProperty("org.apache.commons.logging.LogFactory");
            if (var13 != null) {
               if (isDiagnosticsEnabled()) {
                  logDiagnostic("[LOOKUP] Properties file specifies LogFactory subclass '" + var13 + "'");
               }

               var1 = newFactory(var13, var3, var0);
            } else if (isDiagnosticsEnabled()) {
               logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
            }
         } else if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
         }
      }

      if (var1 == null) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic(
               "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            );
         }

         var1 = newFactory("org.apache.commons.logging.impl.LogFactoryImpl", thisClassLoader, var0);
      }

      if (var1 != null) {
         cacheFactory(var0, var1);
         if (var2 != null) {
            Enumeration var14 = var2.propertyNames();

            while (var14.hasMoreElements()) {
               String var15 = (String)var14.nextElement();
               String var16 = var2.getProperty(var15);
               var1.setAttribute(var15, var16);
            }
         }
      }

      return var1;
   }

   public static Log getLog(Class var0) {
      return getFactory().getInstance(var0);
   }

   public static Log getLog(String var0) {
      return getFactory().getInstance(var0);
   }

   public static void release(ClassLoader var0) {
      if (isDiagnosticsEnabled()) {
         logDiagnostic("Releasing factory for classloader " + objectId(var0));
      }

      synchronized (factories) {
         if (var0 == null) {
            if (nullClassLoaderFactory != null) {
               nullClassLoaderFactory.release();
               nullClassLoaderFactory = null;
            }
         } else {
            LogFactory var2 = (LogFactory)factories.get(var0);
            if (var2 != null) {
               var2.release();
               factories.remove(var0);
            }
         }
      }
   }

   public static void releaseAll() {
      if (isDiagnosticsEnabled()) {
         logDiagnostic("Releasing factory for all classloaders.");
      }

      synchronized (factories) {
         Enumeration var1 = factories.elements();

         while (var1.hasMoreElements()) {
            LogFactory var2 = (LogFactory)var1.nextElement();
            var2.release();
         }

         factories.clear();
         if (nullClassLoaderFactory != null) {
            nullClassLoaderFactory.release();
            nullClassLoaderFactory = null;
         }
      }
   }

   protected static ClassLoader getClassLoader(Class var0) {
      try {
         return var0.getClassLoader();
      } catch (SecurityException var2) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic("Unable to get classloader for class '" + var0 + "' due to security restrictions - " + var2.getMessage());
         }

         throw var2;
      }
   }

   protected static ClassLoader getContextClassLoader() {
      return directGetContextClassLoader();
   }

   private static ClassLoader getContextClassLoaderInternal() {
      return AccessController.doPrivileged(new LogFactory$1());
   }

   protected static ClassLoader directGetContextClassLoader() {
      ClassLoader var0 = null;

      try {
         Method var1 = (class$java$lang$Thread == null ? (class$java$lang$Thread = class$("java.lang.Thread")) : class$java$lang$Thread)
            .getMethod("getContextClassLoader", (Class<?>[])null);

         try {
            var0 = (ClassLoader)var1.invoke(Thread.currentThread(), (Object[])null);
         } catch (IllegalAccessException var3) {
            throw new LogConfigurationException("Unexpected IllegalAccessException", var3);
         } catch (InvocationTargetException var4) {
            if (!(var4.getTargetException() instanceof SecurityException)) {
               throw new LogConfigurationException("Unexpected InvocationTargetException", var4.getTargetException());
            }
         }
      } catch (NoSuchMethodException var5) {
         var0 = getClassLoader(
            class$org$apache$commons$logging$LogFactory == null
               ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
               : class$org$apache$commons$logging$LogFactory
         );
      }

      return var0;
   }

   private static LogFactory getCachedFactory(ClassLoader var0) {
      LogFactory var1 = null;
      if (var0 == null) {
         var1 = nullClassLoaderFactory;
      } else {
         var1 = (LogFactory)factories.get(var0);
      }

      return var1;
   }

   private static void cacheFactory(ClassLoader var0, LogFactory var1) {
      if (var1 != null) {
         if (var0 == null) {
            nullClassLoaderFactory = var1;
         } else {
            factories.put(var0, var1);
         }
      }
   }

   protected static LogFactory newFactory(String var0, ClassLoader var1, ClassLoader var2) {
      Object var3 = AccessController.doPrivileged(new LogFactory$2(var0, var1));
      if (var3 instanceof LogConfigurationException) {
         LogConfigurationException var4 = (LogConfigurationException)var3;
         if (isDiagnosticsEnabled()) {
            logDiagnostic("An error occurred while loading the factory class:" + var4.getMessage());
         }

         throw var4;
      } else {
         if (isDiagnosticsEnabled()) {
            logDiagnostic("Created object " + objectId(var3) + " to manage classloader " + objectId(var2));
         }

         return (LogFactory)var3;
      }
   }

   protected static LogFactory newFactory(String var0, ClassLoader var1) {
      return newFactory(var0, var1, null);
   }

   protected static Object createFactory(String var0, ClassLoader var1) {
      Class var2 = null;

      try {
         if (var1 != null) {
            try {
               var2 = var1.loadClass(var0);
               if ((class$org$apache$commons$logging$LogFactory == null
                     ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
                     : class$org$apache$commons$logging$LogFactory)
                  .isAssignableFrom(var2)) {
                  if (isDiagnosticsEnabled()) {
                     logDiagnostic("Loaded class " + var2.getName() + " from classloader " + objectId(var1));
                  }
               } else if (isDiagnosticsEnabled()) {
                  logDiagnostic(
                     "Factory class "
                        + var2.getName()
                        + " loaded from classloader "
                        + objectId(var2.getClassLoader())
                        + " does not extend '"
                        + (class$org$apache$commons$logging$LogFactory == null
                              ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
                              : class$org$apache$commons$logging$LogFactory)
                           .getName()
                        + "' as loaded by this classloader."
                  );
                  logHierarchy("[BAD CL TREE] ", var1);
               }

               return (LogFactory)var2.newInstance();
            } catch (ClassNotFoundException var7) {
               if (var1 == thisClassLoader) {
                  if (isDiagnosticsEnabled()) {
                     logDiagnostic("Unable to locate any class called '" + var0 + "' via classloader " + objectId(var1));
                  }

                  throw var7;
               }
            } catch (NoClassDefFoundError var8) {
               if (var1 == thisClassLoader) {
                  if (isDiagnosticsEnabled()) {
                     logDiagnostic(
                        "Class '"
                           + var0
                           + "' cannot be loaded"
                           + " via classloader "
                           + objectId(var1)
                           + " - it depends on some other class that cannot"
                           + " be found."
                     );
                  }

                  throw var8;
               }
            } catch (ClassCastException var9) {
               if (var1 == thisClassLoader) {
                  boolean var4 = implementsLogFactory(var2);
                  String var5 = "The application has specified that a custom LogFactory implementation should be used but Class '"
                     + var0
                     + "' cannot be converted to '"
                     + (class$org$apache$commons$logging$LogFactory == null
                           ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
                           : class$org$apache$commons$logging$LogFactory)
                        .getName()
                     + "'. ";
                  if (var4) {
                     var5 = var5
                        + "The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. "
                        + "Background can be found in http://commons.apache.org/logging/tech.html. "
                        + "If you have not explicitly specified a custom LogFactory then it is likely that "
                        + "the container has set one without your knowledge. "
                        + "In this case, consider using the commons-logging-adapters.jar file or "
                        + "specifying the standard LogFactory from the command line. ";
                  } else {
                     var5 = var5 + "Please check the custom implementation. ";
                  }

                  var5 = var5 + "Help can be found @http://commons.apache.org/logging/troubleshooting.html.";
                  if (isDiagnosticsEnabled()) {
                     logDiagnostic(var5);
                  }

                  ClassCastException var6 = new ClassCastException(var5);
                  throw var6;
               }
            }
         }

         if (isDiagnosticsEnabled()) {
            logDiagnostic("Unable to load factory class via classloader " + objectId(var1) + " - trying the classloader associated with this LogFactory.");
         }

         var2 = Class.forName(var0);
         return (LogFactory)var2.newInstance();
      } catch (Exception var10) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic("Unable to create LogFactory instance.");
         }

         return var2 != null
               && !(class$org$apache$commons$logging$LogFactory == null
                     ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
                     : class$org$apache$commons$logging$LogFactory)
                  .isAssignableFrom(var2)
            ? new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", var10)
            : new LogConfigurationException(var10);
      }
   }

   private static boolean implementsLogFactory(Class var0) {
      boolean var1 = false;
      if (var0 != null) {
         try {
            ClassLoader var2 = var0.getClassLoader();
            if (var2 == null) {
               logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
            } else {
               logHierarchy("[CUSTOM LOG FACTORY] ", var2);
               Class var3 = Class.forName("org.apache.commons.logging.LogFactory", false, var2);
               var1 = var3.isAssignableFrom(var0);
               if (var1) {
                  logDiagnostic("[CUSTOM LOG FACTORY] " + var0.getName() + " implements LogFactory but was loaded by an incompatible classloader.");
               } else {
                  logDiagnostic("[CUSTOM LOG FACTORY] " + var0.getName() + " does not implement LogFactory.");
               }
            }
         } catch (SecurityException var4) {
            logDiagnostic(
               "[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: "
                  + var4.getMessage()
            );
         } catch (LinkageError var5) {
            logDiagnostic(
               "[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: "
                  + var5.getMessage()
            );
         } catch (ClassNotFoundException var6) {
            logDiagnostic(
               "[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?"
            );
         }
      }

      return var1;
   }

   private static InputStream getResourceAsStream(ClassLoader var0, String var1) {
      return AccessController.doPrivileged(new LogFactory$3(var0, var1));
   }

   private static Enumeration getResources(ClassLoader var0, String var1) {
      LogFactory$4 var2 = new LogFactory$4(var0, var1);
      Object var3 = AccessController.doPrivileged(var2);
      return (Enumeration)var3;
   }

   private static Properties getProperties(URL var0) {
      LogFactory$5 var1 = new LogFactory$5(var0);
      return AccessController.doPrivileged(var1);
   }

   private static final Properties getConfigurationFile(ClassLoader var0, String var1) {
      Properties var2 = null;
      double var3 = 0.0;
      URL var5 = null;

      try {
         Enumeration var6 = getResources(var0, var1);
         if (var6 == null) {
            return null;
         }

         while (var6.hasMoreElements()) {
            URL var7 = (URL)var6.nextElement();
            Properties var8 = getProperties(var7);
            if (var8 != null) {
               if (var2 == null) {
                  var5 = var7;
                  var2 = var8;
                  String var9 = var2.getProperty("priority");
                  var3 = 0.0;
                  if (var9 != null) {
                     var3 = Double.parseDouble(var9);
                  }

                  if (isDiagnosticsEnabled()) {
                     logDiagnostic("[LOOKUP] Properties file found at '" + var7 + "'" + " with priority " + var3);
                  }
               } else {
                  String var13 = var8.getProperty("priority");
                  double var10 = 0.0;
                  if (var13 != null) {
                     var10 = Double.parseDouble(var13);
                  }

                  if (var10 > var3) {
                     if (isDiagnosticsEnabled()) {
                        logDiagnostic(
                           "[LOOKUP] Properties file at '"
                              + var7
                              + "'"
                              + " with priority "
                              + var10
                              + " overrides file at '"
                              + var5
                              + "'"
                              + " with priority "
                              + var3
                        );
                     }

                     var5 = var7;
                     var2 = var8;
                     var3 = var10;
                  } else if (isDiagnosticsEnabled()) {
                     logDiagnostic(
                        "[LOOKUP] Properties file at '"
                           + var7
                           + "'"
                           + " with priority "
                           + var10
                           + " does not override file at '"
                           + var5
                           + "'"
                           + " with priority "
                           + var3
                     );
                  }
               }
            }
         }
      } catch (SecurityException var12) {
         if (isDiagnosticsEnabled()) {
            logDiagnostic("SecurityException thrown while trying to find/read config files.");
         }
      }

      if (isDiagnosticsEnabled()) {
         if (var2 == null) {
            logDiagnostic("[LOOKUP] No properties file of name '" + var1 + "' found.");
         } else {
            logDiagnostic("[LOOKUP] Properties file of name '" + var1 + "' found at '" + var5 + '"');
         }
      }

      return var2;
   }

   private static String getSystemProperty(String var0, String var1) {
      return AccessController.doPrivileged(new LogFactory$6(var0, var1));
   }

   private static void initDiagnostics() {
      String var0;
      try {
         var0 = getSystemProperty("org.apache.commons.logging.diagnostics.dest", null);
         if (var0 == null) {
            return;
         }
      } catch (SecurityException var5) {
         return;
      }

      if (var0.equals("STDOUT")) {
         diagnosticsStream = System.out;
      } else if (var0.equals("STDERR")) {
         diagnosticsStream = System.err;
      } else {
         try {
            FileOutputStream var1 = new FileOutputStream(var0, true);
            diagnosticsStream = new PrintStream(var1);
         } catch (IOException var4) {
            return;
         }
      }

      String var6;
      try {
         ClassLoader var2 = thisClassLoader;
         if (thisClassLoader == null) {
            var6 = "BOOTLOADER";
         } else {
            var6 = objectId(var2);
         }
      } catch (SecurityException var3) {
         var6 = "UNKNOWN";
      }

      diagnosticPrefix = "[LogFactory from " + var6 + "] ";
   }

   protected static boolean isDiagnosticsEnabled() {
      return diagnosticsStream != null;
   }

   private static final void logDiagnostic(String var0) {
      if (diagnosticsStream != null) {
         diagnosticsStream.print(diagnosticPrefix);
         diagnosticsStream.println(var0);
         diagnosticsStream.flush();
      }
   }

   protected static final void logRawDiagnostic(String var0) {
      if (diagnosticsStream != null) {
         diagnosticsStream.println(var0);
         diagnosticsStream.flush();
      }
   }

   private static void logClassLoaderEnvironment(Class var0) {
      if (isDiagnosticsEnabled()) {
         try {
            logDiagnostic("[ENV] Extension directories (java.ext.dir): " + System.getProperty("java.ext.dir"));
            logDiagnostic("[ENV] Application classpath (java.class.path): " + System.getProperty("java.class.path"));
         } catch (SecurityException var5) {
            logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
         }

         String var1 = var0.getName();

         ClassLoader var2;
         try {
            var2 = getClassLoader(var0);
         } catch (SecurityException var4) {
            logDiagnostic("[ENV] Security forbids determining the classloader for " + var1);
            return;
         }

         logDiagnostic("[ENV] Class " + var1 + " was loaded via classloader " + objectId(var2));
         logHierarchy("[ENV] Ancestry of classloader which loaded " + var1 + " is ", var2);
      }
   }

   private static void logHierarchy(String var0, ClassLoader var1) {
      if (isDiagnosticsEnabled()) {
         if (var1 != null) {
            String var3 = var1.toString();
            logDiagnostic(var0 + objectId(var1) + " == '" + var3 + "'");
         }

         ClassLoader var2;
         try {
            var2 = ClassLoader.getSystemClassLoader();
         } catch (SecurityException var5) {
            logDiagnostic(var0 + "Security forbids determining the system classloader.");
            return;
         }

         if (var1 != null) {
            StringBuffer var7 = new StringBuffer(var0 + "ClassLoader tree:");

            while (true) {
               var7.append(objectId(var1));
               if (var1 == var2) {
                  var7.append(" (SYSTEM) ");
               }

               try {
                  var1 = var1.getParent();
               } catch (SecurityException var6) {
                  var7.append(" --> SECRET");
                  break;
               }

               var7.append(" --> ");
               if (var1 == null) {
                  var7.append("BOOT");
                  break;
               }
            }

            logDiagnostic(var7.toString());
         }
      }
   }

   public static String objectId(Object var0) {
      return var0 == null ? "null" : var0.getClass().getName() + "@" + System.identityHashCode(var0);
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static void access$000(String var0) {
      logDiagnostic(var0);
   }

   static {
      initDiagnostics();
      logClassLoaderEnvironment(
         class$org$apache$commons$logging$LogFactory == null
            ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
            : class$org$apache$commons$logging$LogFactory
      );
      factories = createFactoryStore();
      if (isDiagnosticsEnabled()) {
         logDiagnostic("BOOTSTRAP COMPLETED");
      }
   }
}
