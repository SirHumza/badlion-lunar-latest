package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigIncludeContext;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigParseable;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.parser.ConfigDocument;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;

public abstract class Parseable implements ConfigParseable {
   private ConfigIncludeContext includeContext;
   private ConfigParseOptions initialOptions;
   private ConfigOrigin initialOrigin;
   private static final ThreadLocal<LinkedList<Parseable>> parseStack = new ThreadLocal<LinkedList<Parseable>>() {
      protected LinkedList<Parseable> initialValue() {
         return new LinkedList<>();
      }
   };
   private static final int MAX_INCLUDE_DEPTH = 50;
   private static final String jsonContentType = "application/json";
   private static final String propertiesContentType = "text/x-java-properties";
   private static final String hoconContentType = "application/hocon";

   protected Parseable() {
   }

   private ConfigParseOptions fixupOptions(ConfigParseOptions var1) {
      ConfigSyntax var2 = var1.getSyntax();
      if (var2 == null) {
         var2 = this.guessSyntax();
      }

      if (var2 == null) {
         var2 = ConfigSyntax.CONF;
      }

      ConfigParseOptions var3 = var1.setSyntax(var2);
      var3 = var3.appendIncluder(ConfigImpl.defaultIncluder());
      return var3.setIncluder(SimpleIncluder.makeFull(var3.getIncluder()));
   }

   protected void postConstruct(ConfigParseOptions var1) {
      this.initialOptions = this.fixupOptions(var1);
      this.includeContext = new SimpleIncludeContext(this);
      if (this.initialOptions.getOriginDescription() != null) {
         this.initialOrigin = SimpleConfigOrigin.newSimple(this.initialOptions.getOriginDescription());
      } else {
         this.initialOrigin = this.createOrigin();
      }
   }

   protected abstract Reader reader();

   protected Reader reader(ConfigParseOptions var1) {
      return this.reader();
   }

   protected static void trace(String var0) {
      if (ConfigImpl.traceLoadsEnabled()) {
         ConfigImpl.trace(var0);
      }
   }

   ConfigSyntax guessSyntax() {
      return null;
   }

   ConfigSyntax contentType() {
      return null;
   }

   ConfigParseable relativeTo(String var1) {
      String var2 = var1;
      if (var1.startsWith("/")) {
         var2 = var1.substring(1);
      }

      return newResources(var2, this.options().setOriginDescription(null));
   }

   ConfigIncludeContext includeContext() {
      return this.includeContext;
   }

   static AbstractConfigObject forceParsedToObject(ConfigValue var0) {
      if (var0 instanceof AbstractConfigObject) {
         return (AbstractConfigObject)var0;
      } else {
         throw new ConfigException.WrongType(var0.origin(), "", "object at file root", var0.valueType().name());
      }
   }

   @Override
   public ConfigObject parse(ConfigParseOptions var1) {
      LinkedList var2 = parseStack.get();
      if (var2.size() >= 50) {
         throw new ConfigException.Parse(
            this.initialOrigin, "include statements nested more than 50 times, you probably have a cycle in your includes. Trace: " + var2
         );
      }

      var2.addFirst(this);

      try {
         return forceParsedToObject(this.parseValue(var1));
      } finally {
         var2.removeFirst();
         if (var2.isEmpty()) {
            parseStack.remove();
         }
      }
   }

   final AbstractConfigValue parseValue(ConfigParseOptions var1) {
      ConfigParseOptions var2 = this.fixupOptions(var1);
      ConfigOrigin var3;
      if (var2.getOriginDescription() != null) {
         var3 = SimpleConfigOrigin.newSimple(var2.getOriginDescription());
      } else {
         var3 = this.initialOrigin;
      }

      return this.parseValue(var3, var2);
   }

   private final AbstractConfigValue parseValue(ConfigOrigin var1, ConfigParseOptions var2) {
      try {
         return this.rawParseValue(var1, var2);
      } catch (IOException var4) {
         if (var2.getAllowMissing()) {
            trace(var4.getMessage() + ". Allowing Missing File, this can be turned off by setting ConfigParseOptions.allowMissing = false");
            return SimpleConfigObject.emptyMissing(var1);
         } else {
            trace("exception loading " + var1.description() + ": " + var4.getClass().getName() + ": " + var4.getMessage());
            throw new ConfigException.IO(var1, var4.getClass().getName() + ": " + var4.getMessage(), var4);
         }
      }
   }

   final ConfigDocument parseDocument(ConfigParseOptions var1) {
      ConfigParseOptions var2 = this.fixupOptions(var1);
      ConfigOrigin var3;
      if (var2.getOriginDescription() != null) {
         var3 = SimpleConfigOrigin.newSimple(var2.getOriginDescription());
      } else {
         var3 = this.initialOrigin;
      }

      return this.parseDocument(var3, var2);
   }

   private final ConfigDocument parseDocument(ConfigOrigin var1, ConfigParseOptions var2) {
      try {
         return this.rawParseDocument(var1, var2);
      } catch (IOException var5) {
         if (var2.getAllowMissing()) {
            ArrayList var4 = new ArrayList();
            var4.add(new ConfigNodeObject(new ArrayList<>()));
            return new SimpleConfigDocument(new ConfigNodeRoot(var4, var1), var2);
         } else {
            trace("exception loading " + var1.description() + ": " + var5.getClass().getName() + ": " + var5.getMessage());
            throw new ConfigException.IO(var1, var5.getClass().getName() + ": " + var5.getMessage(), var5);
         }
      }
   }

   protected AbstractConfigValue rawParseValue(ConfigOrigin var1, ConfigParseOptions var2) {
      Reader var3 = this.reader(var2);
      ConfigSyntax var4 = this.contentType();
      ConfigParseOptions var5;
      if (var4 != null) {
         if (ConfigImpl.traceLoadsEnabled() && var2.getSyntax() != null) {
            trace("Overriding syntax " + var2.getSyntax() + " with Content-Type which specified " + var4);
         }

         var5 = var2.setSyntax(var4);
      } else {
         var5 = var2;
      }

      try {
         return this.rawParseValue(var3, var1, var5);
      } finally {
         var3.close();
      }
   }

   private AbstractConfigValue rawParseValue(Reader var1, ConfigOrigin var2, ConfigParseOptions var3) {
      if (var3.getSyntax() == ConfigSyntax.PROPERTIES) {
         return PropertiesParser.parse(var1, var2);
      }

      Iterator var4 = Tokenizer.tokenize(var2, var1, var3.getSyntax());
      ConfigNodeRoot var5 = ConfigDocumentParser.parse(var4, var2, var3);
      return ConfigParser.parse(var5, var2, var3, this.includeContext());
   }

   protected ConfigDocument rawParseDocument(ConfigOrigin var1, ConfigParseOptions var2) {
      Reader var3 = this.reader(var2);
      ConfigSyntax var4 = this.contentType();
      ConfigParseOptions var5;
      if (var4 != null) {
         if (ConfigImpl.traceLoadsEnabled() && var2.getSyntax() != null) {
            trace("Overriding syntax " + var2.getSyntax() + " with Content-Type which specified " + var4);
         }

         var5 = var2.setSyntax(var4);
      } else {
         var5 = var2;
      }

      try {
         return this.rawParseDocument(var3, var1, var5);
      } finally {
         var3.close();
      }
   }

   private ConfigDocument rawParseDocument(Reader var1, ConfigOrigin var2, ConfigParseOptions var3) {
      Iterator var4 = Tokenizer.tokenize(var2, var1, var3.getSyntax());
      return new SimpleConfigDocument(ConfigDocumentParser.parse(var4, var2, var3), var3);
   }

   public ConfigObject parse() {
      return forceParsedToObject(this.parseValue(this.options()));
   }

   public ConfigDocument parseConfigDocument() {
      return this.parseDocument(this.options());
   }

   AbstractConfigValue parseValue() {
      return this.parseValue(this.options());
   }

   @Override
   public final ConfigOrigin origin() {
      return this.initialOrigin;
   }

   protected abstract ConfigOrigin createOrigin();

   @Override
   public ConfigParseOptions options() {
      return this.initialOptions;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   private static Reader readerFromStream(InputStream var0) {
      return readerFromStream(var0, "UTF-8");
   }

   private static Reader readerFromStream(InputStream var0, String var1) {
      try {
         InputStreamReader var2 = new InputStreamReader(var0, var1);
         return new BufferedReader(var2);
      } catch (UnsupportedEncodingException var3) {
         throw new ConfigException.BugOrBroken("Java runtime does not support UTF-8", var3);
      }
   }

   private static Reader doNotClose(Reader var0) {
      return new FilterReader(var0) {
         @Override
         public void close() {
         }
      };
   }

   static URL relativeTo(URL var0, String var1) {
      if (new File(var1).isAbsolute()) {
         return null;
      }

      try {
         URI var2 = var0.toURI();
         URI var3 = new URI(var1);
         return var2.resolve(var3).toURL();
      } catch (MalformedURLException var5) {
         return null;
      } catch (URISyntaxException var6) {
         return null;
      } catch (IllegalArgumentException var7) {
         return null;
      }
   }

   static File relativeTo(File var0, String var1) {
      File var2 = new File(var1);
      if (var2.isAbsolute()) {
         return null;
      }

      File var3 = var0.getParentFile();
      return var3 == null ? null : new File(var3, var1);
   }

   public static Parseable newNotFound(String var0, String var1, ConfigParseOptions var2) {
      return new Parseable.ParseableNotFound(var0, var1, var2);
   }

   public static Parseable newReader(Reader var0, ConfigParseOptions var1) {
      return new Parseable.ParseableReader(doNotClose(var0), var1);
   }

   public static Parseable newString(String var0, ConfigParseOptions var1) {
      return new Parseable.ParseableString(var0, var1);
   }

   public static Parseable newURL(URL var0, ConfigParseOptions var1) {
      return var0.getProtocol().equals("file") ? newFile(ConfigImplUtil.urlToFile(var0), var1) : new Parseable.ParseableURL(var0, var1);
   }

   public static Parseable newFile(File var0, ConfigParseOptions var1) {
      return new Parseable.ParseableFile(var0, var1);
   }

   private static Parseable newResourceURL(URL var0, ConfigParseOptions var1, String var2, Parseable.Relativizer var3) {
      return new Parseable.ParseableResourceURL(var0, var1, var2, var3);
   }

   public static Parseable newResources(Class<?> var0, String var1, ConfigParseOptions var2) {
      return newResources(convertResourceName(var0, var1), var2.setClassLoader(var0.getClassLoader()));
   }

   private static String convertResourceName(Class<?> var0, String var1) {
      if (var1.startsWith("/")) {
         return var1.substring(1);
      }

      String var2 = var0.getName();
      int var3 = var2.lastIndexOf(46);
      if (var3 < 0) {
         return var1;
      }

      String var4 = var2.substring(0, var3);
      String var5 = var4.replace('.', '/');
      return var5 + "/" + var1;
   }

   public static Parseable newResources(String var0, ConfigParseOptions var1) {
      if (var1.getClassLoader() == null) {
         throw new ConfigException.BugOrBroken("null class loader; pass in a class loader or use Thread.currentThread().setContextClassLoader()");
      } else {
         return new Parseable.ParseableResources(var0, var1);
      }
   }

   public static Parseable newProperties(Properties var0, ConfigParseOptions var1) {
      return new Parseable.ParseableProperties(var0, var1);
   }

   private static final class ParseableFile extends Parseable {
      private final File input;

      ParseableFile(File var1, ConfigParseOptions var2) {
         this.input = var1;
         this.postConstruct(var2);
      }

      @Override
      protected Reader reader() {
         if (ConfigImpl.traceLoadsEnabled()) {
            trace("Loading config from a file: " + this.input);
         }

         FileInputStream var1 = new FileInputStream(this.input);
         return Parseable.readerFromStream(var1);
      }

      @Override
      ConfigSyntax guessSyntax() {
         return ConfigImplUtil.syntaxFromExtension(this.input.getName());
      }

      @Override
      ConfigParseable relativeTo(String var1) {
         File var2;
         if (new File(var1).isAbsolute()) {
            var2 = new File(var1);
         } else {
            var2 = relativeTo(this.input, var1);
         }

         if (var2 == null) {
            return null;
         } else if (var2.exists()) {
            trace(var2 + " exists, so loading it as a file");
            return newFile(var2, this.options().setOriginDescription(null));
         } else {
            trace(var2 + " does not exist, so trying it as a classpath resource");
            return super.relativeTo(var1);
         }
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newFile(this.input.getPath());
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName() + "(" + this.input.getPath() + ")";
      }
   }

   private static final class ParseableNotFound extends Parseable {
      private final String what;
      private final String message;

      ParseableNotFound(String var1, String var2, ConfigParseOptions var3) {
         this.what = var1;
         this.message = var2;
         this.postConstruct(var3);
      }

      @Override
      protected Reader reader() {
         throw new FileNotFoundException(this.message);
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newSimple(this.what);
      }
   }

   private static final class ParseableProperties extends Parseable {
      private final Properties props;

      ParseableProperties(Properties var1, ConfigParseOptions var2) {
         this.props = var1;
         this.postConstruct(var2);
      }

      @Override
      protected Reader reader() {
         throw new ConfigException.BugOrBroken("reader() should not be called on props");
      }

      protected AbstractConfigObject rawParseValue(ConfigOrigin var1, ConfigParseOptions var2) {
         if (ConfigImpl.traceLoadsEnabled()) {
            trace("Loading config from properties " + this.props);
         }

         return PropertiesParser.fromProperties(var1, this.props);
      }

      @Override
      ConfigSyntax guessSyntax() {
         return ConfigSyntax.PROPERTIES;
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newSimple("properties");
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName() + "(" + this.props.size() + " props)";
      }
   }

   private static final class ParseableReader extends Parseable {
      private final Reader reader;

      ParseableReader(Reader var1, ConfigParseOptions var2) {
         this.reader = var1;
         this.postConstruct(var2);
      }

      @Override
      protected Reader reader() {
         if (ConfigImpl.traceLoadsEnabled()) {
            trace("Loading config from reader " + this.reader);
         }

         return this.reader;
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newSimple("Reader");
      }
   }

   private static final class ParseableResourceURL extends Parseable.ParseableURL {
      private final Parseable.Relativizer relativizer;
      private final String resource;

      ParseableResourceURL(URL var1, ConfigParseOptions var2, String var3, Parseable.Relativizer var4) {
         super(var1);
         this.relativizer = var4;
         this.resource = var3;
         this.postConstruct(var2);
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newResource(this.resource, this.input);
      }

      @Override
      ConfigParseable relativeTo(String var1) {
         return this.relativizer.relativeTo(var1);
      }
   }

   private static final class ParseableResources extends Parseable implements Parseable.Relativizer {
      private final String resource;

      ParseableResources(String var1, ConfigParseOptions var2) {
         this.resource = var1;
         this.postConstruct(var2);
      }

      @Override
      protected Reader reader() {
         throw new ConfigException.BugOrBroken("reader() should not be called on resources");
      }

      protected AbstractConfigObject rawParseValue(ConfigOrigin var1, ConfigParseOptions var2) {
         ClassLoader var3 = var2.getClassLoader();
         if (var3 == null) {
            throw new ConfigException.BugOrBroken("null class loader; pass in a class loader or use Thread.currentThread().setContextClassLoader()");
         }

         Enumeration var4 = var3.getResources(this.resource);
         if (!var4.hasMoreElements()) {
            if (ConfigImpl.traceLoadsEnabled()) {
               trace("Loading config from class loader " + var3 + " but there were no resources called " + this.resource);
            }

            throw new IOException("resource not found on classpath: " + this.resource);
         } else {
            AbstractConfigObject var5 = SimpleConfigObject.empty(var1);

            while (var4.hasMoreElements()) {
               URL var6 = (URL)var4.nextElement();
               if (ConfigImpl.traceLoadsEnabled()) {
                  trace("Loading config from resource '" + this.resource + "' URL " + var6.toExternalForm() + " from class loader " + var3);
               }

               Parseable var7 = Parseable.newResourceURL(var6, var2, this.resource, this);
               AbstractConfigValue var8 = var7.parseValue();
               var5 = var5.withFallback(var8);
            }

            return var5;
         }
      }

      @Override
      ConfigSyntax guessSyntax() {
         return ConfigImplUtil.syntaxFromExtension(this.resource);
      }

      static String parent(String var0) {
         int var1 = var0.lastIndexOf(47);
         return var1 < 0 ? null : var0.substring(0, var1);
      }

      @Override
      public ConfigParseable relativeTo(String var1) {
         if (var1.startsWith("/")) {
            return newResources(var1.substring(1), this.options().setOriginDescription(null));
         }

         String var2 = parent(this.resource);
         return var2 == null
            ? newResources(var1, this.options().setOriginDescription(null))
            : newResources(var2 + "/" + var1, this.options().setOriginDescription(null));
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newResource(this.resource);
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName() + "(" + this.resource + ")";
      }
   }

   private static final class ParseableString extends Parseable {
      private final String input;

      ParseableString(String var1, ConfigParseOptions var2) {
         this.input = var1;
         this.postConstruct(var2);
      }

      @Override
      protected Reader reader() {
         if (ConfigImpl.traceLoadsEnabled()) {
            trace("Loading config from a String " + this.input);
         }

         return new StringReader(this.input);
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newSimple("String");
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName() + "(" + this.input + ")";
      }
   }

   private static class ParseableURL extends Parseable {
      protected final URL input;
      private String contentType = null;

      protected ParseableURL(URL var1) {
         this.input = var1;
      }

      ParseableURL(URL var1, ConfigParseOptions var2) {
         this(var1);
         this.postConstruct(var2);
      }

      @Override
      protected Reader reader() {
         throw new ConfigException.BugOrBroken("reader() without options should not be called on ParseableURL");
      }

      private static String acceptContentType(ConfigParseOptions var0) {
         if (var0.getSyntax() == null) {
            return null;
         }

         switch (var0.getSyntax()) {
            case JSON:
               return "application/json";
            case CONF:
               return "application/hocon";
            case PROPERTIES:
               return "text/x-java-properties";
            default:
               return null;
         }
      }

      @Override
      protected Reader reader(ConfigParseOptions var1) {
         try {
            if (ConfigImpl.traceLoadsEnabled()) {
               trace("Loading config from a URL: " + this.input.toExternalForm());
            }

            URLConnection var2 = this.input.openConnection();
            String var3 = acceptContentType(var1);
            if (var3 != null) {
               var2.setRequestProperty("Accept", var3);
            }

            var2.connect();
            this.contentType = var2.getContentType();
            if (this.contentType != null) {
               if (ConfigImpl.traceLoadsEnabled()) {
                  trace("URL sets Content-Type: '" + this.contentType + "'");
               }

               this.contentType = this.contentType.trim();
               int var4 = this.contentType.indexOf(59);
               if (var4 >= 0) {
                  this.contentType = this.contentType.substring(0, var4);
               }
            }

            InputStream var7 = var2.getInputStream();
            return Parseable.readerFromStream(var7);
         } catch (FileNotFoundException var5) {
            throw var5;
         } catch (IOException var6) {
            throw new ConfigException.BugOrBroken("Cannot load config from URL: " + this.input.toExternalForm(), var6);
         }
      }

      @Override
      ConfigSyntax guessSyntax() {
         return ConfigImplUtil.syntaxFromExtension(this.input.getPath());
      }

      @Override
      ConfigSyntax contentType() {
         if (this.contentType != null) {
            if (this.contentType.equals("application/json")) {
               return ConfigSyntax.JSON;
            }

            if (this.contentType.equals("text/x-java-properties")) {
               return ConfigSyntax.PROPERTIES;
            }

            if (this.contentType.equals("application/hocon")) {
               return ConfigSyntax.CONF;
            }

            if (ConfigImpl.traceLoadsEnabled()) {
               trace("'" + this.contentType + "' isn't a known content type");
            }

            return null;
         } else {
            return null;
         }
      }

      @Override
      ConfigParseable relativeTo(String var1) {
         URL var2 = relativeTo(this.input, var1);
         return var2 == null ? null : newURL(var2, this.options().setOriginDescription(null));
      }

      @Override
      protected ConfigOrigin createOrigin() {
         return SimpleConfigOrigin.newURL(this.input);
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName() + "(" + this.input.toExternalForm() + ")";
      }
   }

   protected interface Relativizer {
      ConfigParseable relativeTo(String var1);
   }
}
