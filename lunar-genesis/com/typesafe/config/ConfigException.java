package com.typesafe.config;

import com.typesafe.config.impl.ConfigImplUtil;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

public abstract class ConfigException extends RuntimeException implements Serializable {
   private static final long serialVersionUID = 1L;
   private final transient ConfigOrigin origin;

   protected ConfigException(ConfigOrigin var1, String var2, Throwable var3) {
      super(var1.description() + ": " + var2, var3);
      this.origin = var1;
   }

   protected ConfigException(ConfigOrigin var1, String var2) {
      this(var1.description() + ": " + var2, null);
   }

   protected ConfigException(String var1, Throwable var2) {
      super(var1, var2);
      this.origin = null;
   }

   protected ConfigException(String var1) {
      this(var1, null);
   }

   public ConfigOrigin origin() {
      return this.origin;
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      ConfigImplUtil.writeOrigin(var1, this.origin);
   }

   private static <T> void setOriginField(T var0, Class<T> var1, ConfigOrigin var2) {
      Field var3;
      try {
         var3 = var1.getDeclaredField("origin");
      } catch (NoSuchFieldException var7) {
         throw new IOException(var1.getSimpleName() + " has no origin field?", var7);
      } catch (SecurityException var8) {
         throw new IOException("unable to fill out origin field in " + var1.getSimpleName(), var8);
      }

      var3.setAccessible(true);

      try {
         var3.set(var0, var2);
      } catch (IllegalArgumentException var5) {
         throw new IOException("unable to set origin field", var5);
      } catch (IllegalAccessException var6) {
         throw new IOException("unable to set origin field", var6);
      }
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      ConfigOrigin var2 = ConfigImplUtil.readOrigin(var1);
      setOriginField(this, ConfigException.class, var2);
   }

   public static class BadBean extends ConfigException.BugOrBroken {
      private static final long serialVersionUID = 1L;

      public BadBean(String var1, Throwable var2) {
         super(var1, var2);
      }

      public BadBean(String var1) {
         this(var1, null);
      }
   }

   public static class BadPath extends ConfigException {
      private static final long serialVersionUID = 1L;

      public BadPath(ConfigOrigin var1, String var2, String var3, Throwable var4) {
         super(var1, var2 != null ? "Invalid path '" + var2 + "': " + var3 : var3, var4);
      }

      public BadPath(ConfigOrigin var1, String var2, String var3) {
         this(var1, var2, var3, null);
      }

      public BadPath(String var1, String var2, Throwable var3) {
         super(var1 != null ? "Invalid path '" + var1 + "': " + var2 : var2, var3);
      }

      public BadPath(String var1, String var2) {
         this(var1, var2, null);
      }

      public BadPath(ConfigOrigin var1, String var2) {
         this(var1, null, var2);
      }
   }

   public static class BadValue extends ConfigException {
      private static final long serialVersionUID = 1L;

      public BadValue(ConfigOrigin var1, String var2, String var3, Throwable var4) {
         super(var1, "Invalid value at '" + var2 + "': " + var3, var4);
      }

      public BadValue(ConfigOrigin var1, String var2, String var3) {
         this(var1, var2, var3, null);
      }

      public BadValue(String var1, String var2, Throwable var3) {
         super("Invalid value at '" + var1 + "': " + var2, var3);
      }

      public BadValue(String var1, String var2) {
         this(var1, var2, null);
      }
   }

   public static class BugOrBroken extends ConfigException {
      private static final long serialVersionUID = 1L;

      public BugOrBroken(String var1, Throwable var2) {
         super(var1, var2);
      }

      public BugOrBroken(String var1) {
         this(var1, null);
      }
   }

   public static class Generic extends ConfigException {
      private static final long serialVersionUID = 1L;

      public Generic(String var1, Throwable var2) {
         super(var1, var2);
      }

      public Generic(String var1) {
         this(var1, null);
      }
   }

   public static class IO extends ConfigException {
      private static final long serialVersionUID = 1L;

      public IO(ConfigOrigin var1, String var2, Throwable var3) {
         super(var1, var2, var3);
      }

      public IO(ConfigOrigin var1, String var2) {
         this(var1, var2, null);
      }
   }

   public static class Missing extends ConfigException {
      private static final long serialVersionUID = 1L;

      public Missing(String var1, Throwable var2) {
         super("No configuration setting found for key '" + var1 + "'", var2);
      }

      public Missing(ConfigOrigin var1, String var2) {
         this(var1, "No configuration setting found for key '" + var2 + "'", null);
      }

      public Missing(String var1) {
         this(var1, null);
      }

      protected Missing(ConfigOrigin var1, String var2, Throwable var3) {
         super(var1, var2, var3);
      }
   }

   public static class NotResolved extends ConfigException.BugOrBroken {
      private static final long serialVersionUID = 1L;

      public NotResolved(String var1, Throwable var2) {
         super(var1, var2);
      }

      public NotResolved(String var1) {
         this(var1, null);
      }
   }

   public static class Null extends ConfigException.Missing {
      private static final long serialVersionUID = 1L;

      private static String makeMessage(String var0, String var1) {
         return var1 != null ? "Configuration key '" + var0 + "' is set to null but expected " + var1 : "Configuration key '" + var0 + "' is null";
      }

      public Null(ConfigOrigin var1, String var2, String var3, Throwable var4) {
         super(var1, makeMessage(var2, var3), var4);
      }

      public Null(ConfigOrigin var1, String var2, String var3) {
         this(var1, var2, var3, null);
      }
   }

   public static class Parse extends ConfigException {
      private static final long serialVersionUID = 1L;

      public Parse(ConfigOrigin var1, String var2, Throwable var3) {
         super(var1, var2, var3);
      }

      public Parse(ConfigOrigin var1, String var2) {
         this(var1, var2, null);
      }
   }

   public static class UnresolvedSubstitution extends ConfigException.Parse {
      private static final long serialVersionUID = 1L;
      private final String detail;

      public UnresolvedSubstitution(ConfigOrigin var1, String var2, Throwable var3) {
         super(var1, "Could not resolve substitution to a value: " + var2, var3);
         this.detail = var2;
      }

      public UnresolvedSubstitution(ConfigOrigin var1, String var2) {
         this(var1, var2, null);
      }

      private UnresolvedSubstitution(ConfigException.UnresolvedSubstitution var1, ConfigOrigin var2, String var3) {
         super(var2, var3, var1);
         this.detail = var1.detail;
      }

      public ConfigException.UnresolvedSubstitution addExtraDetail(String var1) {
         return new ConfigException.UnresolvedSubstitution(this, this.origin(), String.format(var1, this.detail));
      }
   }

   public static class ValidationFailed extends ConfigException {
      private static final long serialVersionUID = 1L;
      private final Iterable<ConfigException.ValidationProblem> problems;

      public ValidationFailed(Iterable<ConfigException.ValidationProblem> var1) {
         super(makeMessage(var1), null);
         this.problems = var1;
      }

      public Iterable<ConfigException.ValidationProblem> problems() {
         return this.problems;
      }

      private static String makeMessage(Iterable<ConfigException.ValidationProblem> var0) {
         StringBuilder var1 = new StringBuilder();

         for (ConfigException.ValidationProblem var3 : var0) {
            var1.append(var3.origin().description());
            var1.append(": ");
            var1.append(var3.path());
            var1.append(": ");
            var1.append(var3.problem());
            var1.append(", ");
         }

         if (var1.length() == 0) {
            throw new ConfigException.BugOrBroken("ValidationFailed must have a non-empty list of problems");
         }

         var1.setLength(var1.length() - 2);
         return var1.toString();
      }
   }

   public static class ValidationProblem implements Serializable {
      private final String path;
      private final transient ConfigOrigin origin;
      private final String problem;

      public ValidationProblem(String var1, ConfigOrigin var2, String var3) {
         this.path = var1;
         this.origin = var2;
         this.problem = var3;
      }

      public String path() {
         return this.path;
      }

      public ConfigOrigin origin() {
         return this.origin;
      }

      public String problem() {
         return this.problem;
      }

      private void writeObject(ObjectOutputStream var1) {
         var1.defaultWriteObject();
         ConfigImplUtil.writeOrigin(var1, this.origin);
      }

      private void readObject(ObjectInputStream var1) {
         var1.defaultReadObject();
         ConfigOrigin var2 = ConfigImplUtil.readOrigin(var1);
         ConfigException.setOriginField(this, ConfigException.ValidationProblem.class, var2);
      }

      @Override
      public String toString() {
         return "ValidationProblem(" + this.path + "," + this.origin + "," + this.problem + ")";
      }
   }

   public static class WrongType extends ConfigException {
      private static final long serialVersionUID = 1L;

      public WrongType(ConfigOrigin var1, String var2, String var3, String var4, Throwable var5) {
         super(var1, var2 + " has type " + var4 + " rather than " + var3, var5);
      }

      public WrongType(ConfigOrigin var1, String var2, String var3, String var4) {
         this(var1, var2, var3, var4, null);
      }

      public WrongType(ConfigOrigin var1, String var2, Throwable var3) {
         super(var1, var2, var3);
      }

      public WrongType(ConfigOrigin var1, String var2) {
         super(var1, var2, null);
      }
   }
}
