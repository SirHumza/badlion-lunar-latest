package org.apache.commons.logging.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class LogFactoryImpl extends LogFactory {
   private static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
   private static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
   private static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
   private static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
   private static final String PKG_IMPL = "org.apache.commons.logging.impl.";
   private static final int PKG_LEN = "org.apache.commons.logging.impl.".length();
   public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
   protected static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
   public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
   public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
   public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
   private static final String[] classesToDiscover = new String[]{
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.logging.impl.Jdk13LumberjackLogger",
      "org.apache.commons.logging.impl.SimpleLog"
   };
   private boolean useTCCL = true;
   private String diagnosticPrefix;
   protected Hashtable attributes = new Hashtable();
   protected Hashtable instances = new Hashtable();
   private String logClassName;
   protected Constructor logConstructor = null;
   protected Class[] logConstructorSignature;
   protected Method logMethod;
   protected Class[] logMethodSignature;
   private boolean allowFlawedContext;
   private boolean allowFlawedDiscovery;
   private boolean allowFlawedHierarchy;
   static Class class$java$lang$String;
   static Class class$org$apache$commons$logging$LogFactory;
   static Class class$org$apache$commons$logging$impl$LogFactoryImpl;
   static Class class$org$apache$commons$logging$Log;

   public LogFactoryImpl() {
      this.logConstructorSignature = new Class[]{
         class$java$lang$String == null ? (class$java$lang$String = class$("java.lang.String")) : class$java$lang$String
      };
      this.logMethod = null;
      this.logMethodSignature = new Class[]{
         class$org$apache$commons$logging$LogFactory == null
            ? (class$org$apache$commons$logging$LogFactory = class$("org.apache.commons.logging.LogFactory"))
            : class$org$apache$commons$logging$LogFactory
      };
      this.initDiagnostics();
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("Instance created.");
      }
   }

   public Object getAttribute(String var1) {
      return this.attributes.get(var1);
   }

   public String[] getAttributeNames() {
      Vector var1 = new Vector();
      Enumeration var2 = this.attributes.keys();

      while (var2.hasMoreElements()) {
         var1.addElement((String)var2.nextElement());
      }

      String[] var3 = new String[var1.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = (String)var1.elementAt(var4);
      }

      return var3;
   }

   public Log getInstance(Class var1) {
      return this.getInstance(var1.getName());
   }

   public Log getInstance(String var1) {
      Log var2 = (Log)this.instances.get(var1);
      if (var2 == null) {
         var2 = this.newInstance(var1);
         this.instances.put(var1, var2);
      }

      return var2;
   }

   public void release() {
      this.logDiagnostic("Releasing all known loggers");
      this.instances.clear();
   }

   public void removeAttribute(String var1) {
      this.attributes.remove(var1);
   }

   public void setAttribute(String var1, Object var2) {
      if (this.logConstructor != null) {
         this.logDiagnostic("setAttribute: call too late; configuration already performed.");
      }

      if (var2 == null) {
         this.attributes.remove(var1);
      } else {
         this.attributes.put(var1, var2);
      }

      if (var1.equals("use_tccl")) {
         this.useTCCL = Boolean.valueOf(var2.toString());
      }
   }

   protected static ClassLoader getContextClassLoader() {
      return LogFactory.getContextClassLoader();
   }

   protected static boolean isDiagnosticsEnabled() {
      return LogFactory.isDiagnosticsEnabled();
   }

   protected static ClassLoader getClassLoader(Class var0) {
      return LogFactory.getClassLoader(var0);
   }

   private void initDiagnostics() {
      Class var1 = this.getClass();
      ClassLoader var2 = getClassLoader(var1);

      String var3;
      try {
         if (var2 == null) {
            var3 = "BOOTLOADER";
         } else {
            var3 = LogFactory.objectId(var2);
         }
      } catch (SecurityException var5) {
         var3 = "UNKNOWN";
      }

      this.diagnosticPrefix = "[LogFactoryImpl@" + System.identityHashCode(this) + " from " + var3 + "] ";
   }

   protected void logDiagnostic(String var1) {
      if (isDiagnosticsEnabled()) {
         LogFactory.logRawDiagnostic(this.diagnosticPrefix + var1);
      }
   }

   protected String getLogClassName() {
      if (this.logClassName == null) {
         this.discoverLogImplementation(this.getClass().getName());
      }

      return this.logClassName;
   }

   protected Constructor getLogConstructor() {
      if (this.logConstructor == null) {
         this.discoverLogImplementation(this.getClass().getName());
      }

      return this.logConstructor;
   }

   protected boolean isJdk13LumberjackAvailable() {
      return this.isLogLibraryAvailable("Jdk13Lumberjack", "org.apache.commons.logging.impl.Jdk13LumberjackLogger");
   }

   protected boolean isJdk14Available() {
      return this.isLogLibraryAvailable("Jdk14", "org.apache.commons.logging.impl.Jdk14Logger");
   }

   protected boolean isLog4JAvailable() {
      return this.isLogLibraryAvailable("Log4J", "org.apache.commons.logging.impl.Log4JLogger");
   }

   protected Log newInstance(String var1) {
      Log var2 = null;

      try {
         if (this.logConstructor == null) {
            var2 = this.discoverLogImplementation(var1);
         } else {
            Object[] var3 = new Object[]{var1};
            var2 = (Log)this.logConstructor.newInstance(var3);
         }

         if (this.logMethod != null) {
            Object[] var9 = new Object[]{this};
            this.logMethod.invoke(var2, var9);
         }

         return var2;
      } catch (LogConfigurationException var5) {
         throw var5;
      } catch (InvocationTargetException var6) {
         Throwable var4 = var6.getTargetException();
         if (var4 != null) {
            throw new LogConfigurationException(var4);
         } else {
            throw new LogConfigurationException(var6);
         }
      } catch (Throwable var7) {
         throw new LogConfigurationException(var7);
      }
   }

   private static ClassLoader getContextClassLoaderInternal() {
      return AccessController.doPrivileged(new LogFactoryImpl$1());
   }

   private static String getSystemProperty(String var0, String var1) {
      return AccessController.doPrivileged(new LogFactoryImpl$2(var0, var1));
   }

   private ClassLoader getParentClassLoader(ClassLoader var1) {
      try {
         return AccessController.doPrivileged(new LogFactoryImpl$3(this, var1));
      } catch (SecurityException var3) {
         this.logDiagnostic("[SECURITY] Unable to obtain parent classloader");
         return null;
      }
   }

   private boolean isLogLibraryAvailable(String var1, String var2) {
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("Checking for '" + var1 + "'.");
      }

      try {
         Log var3 = this.createLogFromClass(var2, this.getClass().getName(), false);
         if (var3 == null) {
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic("Did not find '" + var1 + "'.");
            }

            return false;
         } else {
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic("Found '" + var1 + "'.");
            }

            return true;
         }
      } catch (LogConfigurationException var4) {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("Logging system '" + var1 + "' is available but not useable.");
         }

         return false;
      }
   }

   private String getConfigurationValue(String var1) {
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("[ENV] Trying to get configuration for item " + var1);
      }

      Object var2 = this.getAttribute(var1);
      if (var2 != null) {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("[ENV] Found LogFactory attribute [" + var2 + "] for " + var1);
         }

         return var2.toString();
      } else {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("[ENV] No LogFactory attribute found for " + var1);
         }

         try {
            String var3 = getSystemProperty(var1, null);
            if (var3 != null) {
               if (isDiagnosticsEnabled()) {
                  this.logDiagnostic("[ENV] Found system property [" + var3 + "] for " + var1);
               }

               return var3;
            }

            if (isDiagnosticsEnabled()) {
               this.logDiagnostic("[ENV] No system property found for property " + var1);
            }
         } catch (SecurityException var4) {
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic("[ENV] Security prevented reading system property " + var1);
            }
         }

         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("[ENV] No configuration defined for item " + var1);
         }

         return null;
      }
   }

   private boolean getBooleanConfiguration(String var1, boolean var2) {
      String var3 = this.getConfigurationValue(var1);
      return var3 == null ? var2 : Boolean.valueOf(var3);
   }

   private void initConfiguration() {
      this.allowFlawedContext = this.getBooleanConfiguration("org.apache.commons.logging.Log.allowFlawedContext", true);
      this.allowFlawedDiscovery = this.getBooleanConfiguration("org.apache.commons.logging.Log.allowFlawedDiscovery", true);
      this.allowFlawedHierarchy = this.getBooleanConfiguration("org.apache.commons.logging.Log.allowFlawedHierarchy", true);
   }

   private Log discoverLogImplementation(String var1) {
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("Discovering a Log implementation...");
      }

      this.initConfiguration();
      Log var2 = null;
      String var3 = this.findUserSpecifiedLogClassName();
      if (var3 != null) {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("Attempting to load user-specified log class '" + var3 + "'...");
         }

         var2 = this.createLogFromClass(var3, var1, true);
         if (var2 == null) {
            StringBuffer var6 = new StringBuffer("User-specified log class '");
            var6.append(var3);
            var6.append("' cannot be found or is not useable.");
            if (var3 != null) {
               this.informUponSimilarName(var6, var3, "org.apache.commons.logging.impl.Log4JLogger");
               this.informUponSimilarName(var6, var3, "org.apache.commons.logging.impl.Jdk14Logger");
               this.informUponSimilarName(var6, var3, "org.apache.commons.logging.impl.Jdk13LumberjackLogger");
               this.informUponSimilarName(var6, var3, "org.apache.commons.logging.impl.SimpleLog");
            }

            throw new LogConfigurationException(var6.toString());
         } else {
            return var2;
         }
      } else {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
         }

         for (int var4 = 0; var4 < classesToDiscover.length && var2 == null; var4++) {
            var2 = this.createLogFromClass(classesToDiscover[var4], var1, true);
         }

         if (var2 == null) {
            throw new LogConfigurationException("No suitable Log implementation");
         } else {
            return var2;
         }
      }
   }

   private void informUponSimilarName(StringBuffer var1, String var2, String var3) {
      if (!var2.equals(var3)) {
         if (var2.regionMatches(true, 0, var3, 0, PKG_LEN + 5)) {
            var1.append(" Did you mean '");
            var1.append(var3);
            var1.append("'?");
         }
      }
   }

   private String findUserSpecifiedLogClassName() {
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
      }

      String var1 = (String)this.getAttribute("org.apache.commons.logging.Log");
      if (var1 == null) {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
         }

         var1 = (String)this.getAttribute("org.apache.commons.logging.log");
      }

      if (var1 == null) {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
         }

         try {
            var1 = getSystemProperty("org.apache.commons.logging.Log", null);
         } catch (SecurityException var4) {
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic("No access allowed to system property 'org.apache.commons.logging.Log' - " + var4.getMessage());
            }
         }
      }

      if (var1 == null) {
         if (isDiagnosticsEnabled()) {
            this.logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
         }

         try {
            var1 = getSystemProperty("org.apache.commons.logging.log", null);
         } catch (SecurityException var3) {
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic("No access allowed to system property 'org.apache.commons.logging.log' - " + var3.getMessage());
            }
         }
      }

      if (var1 != null) {
         var1 = var1.trim();
      }

      return var1;
   }

   private Log createLogFromClass(String var1, String var2, boolean var3) {
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("Attempting to instantiate '" + var1 + "'");
      }

      Object[] var4 = new Object[]{var2};
      Log var5 = null;
      Constructor var6 = null;
      Class var7 = null;
      ClassLoader var8 = this.getBaseClassLoader();

      while (true) {
         this.logDiagnostic("Trying to load '" + var1 + "' from classloader " + LogFactory.objectId(var8));

         try {
            if (isDiagnosticsEnabled()) {
               String var23 = var1.replace('.', '/') + ".class";
               URL var9;
               if (var8 != null) {
                  var9 = var8.getResource(var23);
               } else {
                  var9 = ClassLoader.getSystemResource(var23 + ".class");
               }

               if (var9 == null) {
                  this.logDiagnostic("Class '" + var1 + "' [" + var23 + "] cannot be found.");
               } else {
                  this.logDiagnostic("Class '" + var1 + "' was found at '" + var9 + "'");
               }
            }

            Class var20 = null;

            try {
               var20 = Class.forName(var1, true, var8);
            } catch (ClassNotFoundException var15) {
               String var11 = "" + var15.getMessage();
               this.logDiagnostic("The log adapter '" + var1 + "' is not available via classloader " + LogFactory.objectId(var8) + ": " + var11.trim());

               try {
                  var20 = Class.forName(var1);
               } catch (ClassNotFoundException var14) {
                  var11 = "" + var14.getMessage();
                  this.logDiagnostic("The log adapter '" + var1 + "' is not available via the LogFactoryImpl class classloader: " + var11.trim());
                  break;
               }
            }

            var6 = var20.getConstructor(this.logConstructorSignature);
            Object var24 = var6.newInstance(var4);
            if (var24 instanceof Log) {
               var7 = var20;
               var5 = (Log)var24;
               break;
            }

            this.handleFlawedHierarchy(var8, var20);
         } catch (NoClassDefFoundError var16) {
            String var22 = "" + var16.getMessage();
            this.logDiagnostic(
               "The log adapter '" + var1 + "' is missing dependencies when loaded via classloader " + LogFactory.objectId(var8) + ": " + var22.trim()
            );
            break;
         } catch (ExceptionInInitializerError var17) {
            String var10 = "" + var17.getMessage();
            this.logDiagnostic(
               "The log adapter '" + var1 + "' is unable to initialize itself when loaded via classloader " + LogFactory.objectId(var8) + ": " + var10.trim()
            );
            break;
         } catch (LogConfigurationException var18) {
            throw var18;
         } catch (Throwable var19) {
            this.handleFlawedDiscovery(var1, var8, var19);
         }

         if (var8 == null) {
            break;
         }

         var8 = this.getParentClassLoader(var8);
      }

      if (var5 != null && var3) {
         this.logClassName = var1;
         this.logConstructor = var6;

         try {
            this.logMethod = var7.getMethod("setLogFactory", this.logMethodSignature);
            this.logDiagnostic("Found method setLogFactory(LogFactory) in '" + var1 + "'");
         } catch (Throwable var13) {
            this.logMethod = null;
            this.logDiagnostic(
               "[INFO] '" + var1 + "' from classloader " + LogFactory.objectId(var8) + " does not declare optional method " + "setLogFactory(LogFactory)"
            );
         }

         this.logDiagnostic("Log adapter '" + var1 + "' from classloader " + LogFactory.objectId(var7.getClassLoader()) + " has been selected for use.");
      }

      return var5;
   }

   private ClassLoader getBaseClassLoader() {
      ClassLoader var1 = getClassLoader(
         class$org$apache$commons$logging$impl$LogFactoryImpl == null
            ? (class$org$apache$commons$logging$impl$LogFactoryImpl = class$("org.apache.commons.logging.impl.LogFactoryImpl"))
            : class$org$apache$commons$logging$impl$LogFactoryImpl
      );
      if (!this.useTCCL) {
         return var1;
      }

      ClassLoader var2 = getContextClassLoaderInternal();
      ClassLoader var3 = this.getLowestClassLoader(var2, var1);
      if (var3 == null) {
         if (this.allowFlawedContext) {
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic(
                  "[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl."
               );
            }

            return var2;
         } else {
            throw new LogConfigurationException(
               "Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader."
            );
         }
      } else {
         if (var3 != var2) {
            if (!this.allowFlawedContext) {
               throw new LogConfigurationException(
                  "Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader."
               );
            }

            if (isDiagnosticsEnabled()) {
               this.logDiagnostic(
                  "Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly."
               );
            }
         }

         return var3;
      }
   }

   private ClassLoader getLowestClassLoader(ClassLoader var1, ClassLoader var2) {
      if (var1 == null) {
         return var2;
      }

      if (var2 == null) {
         return var1;
      }

      for (ClassLoader var3 = var1; var3 != null; var3 = var3.getParent()) {
         if (var3 == var2) {
            return var1;
         }
      }

      for (ClassLoader var4 = var2; var4 != null; var4 = var4.getParent()) {
         if (var4 == var1) {
            return var2;
         }
      }

      return null;
   }

   private void handleFlawedDiscovery(String var1, ClassLoader var2, Throwable var3) {
      if (isDiagnosticsEnabled()) {
         this.logDiagnostic("Could not instantiate Log '" + var1 + "' -- " + var3.getClass().getName() + ": " + var3.getLocalizedMessage());
         if (var3 instanceof InvocationTargetException) {
            InvocationTargetException var4 = (InvocationTargetException)var3;
            Throwable var5 = var4.getTargetException();
            if (var5 != null) {
               this.logDiagnostic("... InvocationTargetException: " + var5.getClass().getName() + ": " + var5.getLocalizedMessage());
               if (var5 instanceof ExceptionInInitializerError) {
                  ExceptionInInitializerError var6 = (ExceptionInInitializerError)var5;
                  Throwable var7 = var6.getException();
                  if (var7 != null) {
                     this.logDiagnostic("... ExceptionInInitializerError: " + var7.getClass().getName() + ": " + var7.getLocalizedMessage());
                  }
               }
            }
         }
      }

      if (!this.allowFlawedDiscovery) {
         throw new LogConfigurationException(var3);
      }
   }

   private void handleFlawedHierarchy(ClassLoader var1, Class var2) {
      boolean var3 = false;
      String var4 = (class$org$apache$commons$logging$Log == null
            ? (class$org$apache$commons$logging$Log = class$("org.apache.commons.logging.Log"))
            : class$org$apache$commons$logging$Log)
         .getName();
      Class[] var5 = var2.getInterfaces();

      for (int var6 = 0; var6 < var5.length; var6++) {
         if (var4.equals(var5[var6].getName())) {
            var3 = true;
            break;
         }
      }

      if (var3) {
         if (isDiagnosticsEnabled()) {
            try {
               ClassLoader var8 = getClassLoader(
                  class$org$apache$commons$logging$Log == null
                     ? (class$org$apache$commons$logging$Log = class$("org.apache.commons.logging.Log"))
                     : class$org$apache$commons$logging$Log
               );
               this.logDiagnostic(
                  "Class '"
                     + var2.getName()
                     + "' was found in classloader "
                     + LogFactory.objectId(var1)
                     + ". It is bound to a Log interface which is not"
                     + " the one loaded from classloader "
                     + LogFactory.objectId(var8)
               );
            } catch (Throwable var7) {
               this.logDiagnostic("Error while trying to output diagnostics about bad class '" + var2 + "'");
            }
         }

         if (!this.allowFlawedHierarchy) {
            StringBuffer var10 = new StringBuffer();
            var10.append("Terminating logging for this context ");
            var10.append("due to bad log hierarchy. ");
            var10.append("You have more than one version of '");
            var10.append(
               (class$org$apache$commons$logging$Log == null
                     ? (class$org$apache$commons$logging$Log = class$("org.apache.commons.logging.Log"))
                     : class$org$apache$commons$logging$Log)
                  .getName()
            );
            var10.append("' visible.");
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic(var10.toString());
            }

            throw new LogConfigurationException(var10.toString());
         }

         if (isDiagnosticsEnabled()) {
            StringBuffer var9 = new StringBuffer();
            var9.append("Warning: bad log hierarchy. ");
            var9.append("You have more than one version of '");
            var9.append(
               (class$org$apache$commons$logging$Log == null
                     ? (class$org$apache$commons$logging$Log = class$("org.apache.commons.logging.Log"))
                     : class$org$apache$commons$logging$Log)
                  .getName()
            );
            var9.append("' visible.");
            this.logDiagnostic(var9.toString());
         }
      } else {
         if (!this.allowFlawedDiscovery) {
            StringBuffer var12 = new StringBuffer();
            var12.append("Terminating logging for this context. ");
            var12.append("Log class '");
            var12.append(var2.getName());
            var12.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
               this.logDiagnostic(var12.toString());
            }

            throw new LogConfigurationException(var12.toString());
         }

         if (isDiagnosticsEnabled()) {
            StringBuffer var11 = new StringBuffer();
            var11.append("[WARNING] Log class '");
            var11.append(var2.getName());
            var11.append("' does not implement the Log interface.");
            this.logDiagnostic(var11.toString());
         }
      }
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static ClassLoader access$000() {
      return LogFactory.directGetContextClassLoader();
   }
}
