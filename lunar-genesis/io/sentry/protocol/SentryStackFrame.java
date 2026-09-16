package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLockReason;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryStackFrame implements JsonSerializable, JsonUnknown {
   @Nullable
   private List<String> preContext;
   @Nullable
   private List<String> postContext;
   @Nullable
   private Map<String, String> vars;
   @Nullable
   private List<Integer> framesOmitted;
   @Nullable
   private String filename;
   @Nullable
   private String function;
   @Nullable
   private String module;
   @Nullable
   private Integer lineno;
   @Nullable
   private Integer colno;
   @Nullable
   private String absPath;
   @Nullable
   private String contextLine;
   @Nullable
   private Boolean inApp;
   @Nullable
   private String _package;
   @Nullable
   private Boolean _native;
   @Nullable
   private String platform;
   @Nullable
   private String imageAddr;
   @Nullable
   private String symbolAddr;
   @Nullable
   private String instructionAddr;
   @Nullable
   private String symbol;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private String rawFunction;
   @Nullable
   private SentryLockReason lock;

   @Nullable
   public List<String> getPreContext() {
      return this.preContext;
   }

   public void setPreContext(@Nullable List<String> var1) {
      this.preContext = var1;
   }

   @Nullable
   public List<String> getPostContext() {
      return this.postContext;
   }

   public void setPostContext(@Nullable List<String> var1) {
      this.postContext = var1;
   }

   @Nullable
   public Map<String, String> getVars() {
      return this.vars;
   }

   public void setVars(@Nullable Map<String, String> var1) {
      this.vars = var1;
   }

   @Nullable
   public List<Integer> getFramesOmitted() {
      return this.framesOmitted;
   }

   public void setFramesOmitted(@Nullable List<Integer> var1) {
      this.framesOmitted = var1;
   }

   @Nullable
   public String getFilename() {
      return this.filename;
   }

   public void setFilename(@Nullable String var1) {
      this.filename = var1;
   }

   @Nullable
   public String getFunction() {
      return this.function;
   }

   public void setFunction(@Nullable String var1) {
      this.function = var1;
   }

   @Nullable
   public String getModule() {
      return this.module;
   }

   public void setModule(@Nullable String var1) {
      this.module = var1;
   }

   @Nullable
   public Integer getLineno() {
      return this.lineno;
   }

   public void setLineno(@Nullable Integer var1) {
      this.lineno = var1;
   }

   @Nullable
   public Integer getColno() {
      return this.colno;
   }

   public void setColno(@Nullable Integer var1) {
      this.colno = var1;
   }

   @Nullable
   public String getAbsPath() {
      return this.absPath;
   }

   public void setAbsPath(@Nullable String var1) {
      this.absPath = var1;
   }

   @Nullable
   public String getContextLine() {
      return this.contextLine;
   }

   public void setContextLine(@Nullable String var1) {
      this.contextLine = var1;
   }

   @Nullable
   public Boolean isInApp() {
      return this.inApp;
   }

   public void setInApp(@Nullable Boolean var1) {
      this.inApp = var1;
   }

   @Nullable
   public String getPackage() {
      return this._package;
   }

   public void setPackage(@Nullable String var1) {
      this._package = var1;
   }

   @Nullable
   public String getPlatform() {
      return this.platform;
   }

   public void setPlatform(@Nullable String var1) {
      this.platform = var1;
   }

   @Nullable
   public String getImageAddr() {
      return this.imageAddr;
   }

   public void setImageAddr(@Nullable String var1) {
      this.imageAddr = var1;
   }

   @Nullable
   public String getSymbolAddr() {
      return this.symbolAddr;
   }

   public void setSymbolAddr(@Nullable String var1) {
      this.symbolAddr = var1;
   }

   @Nullable
   public String getInstructionAddr() {
      return this.instructionAddr;
   }

   public void setInstructionAddr(@Nullable String var1) {
      this.instructionAddr = var1;
   }

   @Nullable
   public Boolean isNative() {
      return this._native;
   }

   public void setNative(@Nullable Boolean var1) {
      this._native = var1;
   }

   @Nullable
   public String getRawFunction() {
      return this.rawFunction;
   }

   public void setRawFunction(@Nullable String var1) {
      this.rawFunction = var1;
   }

   @Nullable
   public String getSymbol() {
      return this.symbol;
   }

   public void setSymbol(@Nullable String var1) {
      this.symbol = var1;
   }

   @Nullable
   public SentryLockReason getLock() {
      return this.lock;
   }

   public void setLock(@Nullable SentryLockReason var1) {
      this.lock = var1;
   }

   @Nullable
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.filename != null) {
         var1.name("filename").value(this.filename);
      }

      if (this.function != null) {
         var1.name("function").value(this.function);
      }

      if (this.module != null) {
         var1.name("module").value(this.module);
      }

      if (this.lineno != null) {
         var1.name("lineno").value(this.lineno);
      }

      if (this.colno != null) {
         var1.name("colno").value(this.colno);
      }

      if (this.absPath != null) {
         var1.name("abs_path").value(this.absPath);
      }

      if (this.contextLine != null) {
         var1.name("context_line").value(this.contextLine);
      }

      if (this.inApp != null) {
         var1.name("in_app").value(this.inApp);
      }

      if (this._package != null) {
         var1.name("package").value(this._package);
      }

      if (this._native != null) {
         var1.name("native").value(this._native);
      }

      if (this.platform != null) {
         var1.name("platform").value(this.platform);
      }

      if (this.imageAddr != null) {
         var1.name("image_addr").value(this.imageAddr);
      }

      if (this.symbolAddr != null) {
         var1.name("symbol_addr").value(this.symbolAddr);
      }

      if (this.instructionAddr != null) {
         var1.name("instruction_addr").value(this.instructionAddr);
      }

      if (this.rawFunction != null) {
         var1.name("raw_function").value(this.rawFunction);
      }

      if (this.symbol != null) {
         var1.name("symbol").value(this.symbol);
      }

      if (this.lock != null) {
         var1.name("lock").value(var2, this.lock);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<SentryStackFrame> {
      @NotNull
      public SentryStackFrame deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryStackFrame var3 = new SentryStackFrame();
         ConcurrentHashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "filename":
                  var3.filename = var1.nextStringOrNull();
                  break;
               case "function":
                  var3.function = var1.nextStringOrNull();
                  break;
               case "module":
                  var3.module = var1.nextStringOrNull();
                  break;
               case "lineno":
                  var3.lineno = var1.nextIntegerOrNull();
                  break;
               case "colno":
                  var3.colno = var1.nextIntegerOrNull();
                  break;
               case "abs_path":
                  var3.absPath = var1.nextStringOrNull();
                  break;
               case "context_line":
                  var3.contextLine = var1.nextStringOrNull();
                  break;
               case "in_app":
                  var3.inApp = var1.nextBooleanOrNull();
                  break;
               case "package":
                  var3._package = var1.nextStringOrNull();
                  break;
               case "native":
                  var3._native = var1.nextBooleanOrNull();
                  break;
               case "platform":
                  var3.platform = var1.nextStringOrNull();
                  break;
               case "image_addr":
                  var3.imageAddr = var1.nextStringOrNull();
                  break;
               case "symbol_addr":
                  var3.symbolAddr = var1.nextStringOrNull();
                  break;
               case "instruction_addr":
                  var3.instructionAddr = var1.nextStringOrNull();
                  break;
               case "raw_function":
                  var3.rawFunction = var1.nextStringOrNull();
                  break;
               case "symbol":
                  var3.symbol = var1.nextStringOrNull();
                  break;
               case "lock":
                  var3.lock = var1.nextOrNull(var2, new SentryLockReason.Deserializer());
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String FILENAME = "filename";
      public static final String FUNCTION = "function";
      public static final String MODULE = "module";
      public static final String LINENO = "lineno";
      public static final String COLNO = "colno";
      public static final String ABS_PATH = "abs_path";
      public static final String CONTEXT_LINE = "context_line";
      public static final String IN_APP = "in_app";
      public static final String PACKAGE = "package";
      public static final String NATIVE = "native";
      public static final String PLATFORM = "platform";
      public static final String IMAGE_ADDR = "image_addr";
      public static final String SYMBOL_ADDR = "symbol_addr";
      public static final String INSTRUCTION_ADDR = "instruction_addr";
      public static final String RAW_FUNCTION = "raw_function";
      public static final String SYMBOL = "symbol";
      public static final String LOCK = "lock";
   }
}
