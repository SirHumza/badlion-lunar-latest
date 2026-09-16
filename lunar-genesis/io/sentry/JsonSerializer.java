package io.sentry;

import io.sentry.clientreport.ClientReport;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.protocol.App;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import io.sentry.protocol.Gpu;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.Message;
import io.sentry.protocol.MetricSummary;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkInfo;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryPackage;
import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.protocol.ViewHierarchy;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.Objects;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonSerializer implements ISerializer {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   @NotNull
   private final SentryOptions options;
   @NotNull
   private final Map<Class<?>, JsonDeserializer<?>> deserializersByClass;

   public JsonSerializer(@NotNull SentryOptions var1) {
      this.options = var1;
      this.deserializersByClass = new HashMap<>();
      this.deserializersByClass.put(App.class, new App.Deserializer());
      this.deserializersByClass.put(Breadcrumb.class, new Breadcrumb.Deserializer());
      this.deserializersByClass.put(Browser.class, new Browser.Deserializer());
      this.deserializersByClass.put(Contexts.class, new Contexts.Deserializer());
      this.deserializersByClass.put(DebugImage.class, new DebugImage.Deserializer());
      this.deserializersByClass.put(DebugMeta.class, new DebugMeta.Deserializer());
      this.deserializersByClass.put(Device.class, new Device.Deserializer());
      this.deserializersByClass.put(Device.DeviceOrientation.class, new Device.DeviceOrientation.Deserializer());
      this.deserializersByClass.put(Gpu.class, new Gpu.Deserializer());
      this.deserializersByClass.put(MeasurementValue.class, new MeasurementValue.Deserializer());
      this.deserializersByClass.put(Mechanism.class, new Mechanism.Deserializer());
      this.deserializersByClass.put(Message.class, new Message.Deserializer());
      this.deserializersByClass.put(MetricSummary.class, new MetricSummary.Deserializer());
      this.deserializersByClass.put(OperatingSystem.class, new OperatingSystem.Deserializer());
      this.deserializersByClass.put(ProfilingTraceData.class, new ProfilingTraceData.Deserializer());
      this.deserializersByClass.put(ProfilingTransactionData.class, new ProfilingTransactionData.Deserializer());
      this.deserializersByClass.put(ProfileMeasurement.class, new ProfileMeasurement.Deserializer());
      this.deserializersByClass.put(ProfileMeasurementValue.class, new ProfileMeasurementValue.Deserializer());
      this.deserializersByClass.put(Request.class, new Request.Deserializer());
      this.deserializersByClass.put(ReplayRecording.class, new ReplayRecording.Deserializer());
      this.deserializersByClass.put(RRWebBreadcrumbEvent.class, new RRWebBreadcrumbEvent.Deserializer());
      this.deserializersByClass.put(RRWebEventType.class, new RRWebEventType.Deserializer());
      this.deserializersByClass.put(RRWebInteractionEvent.class, new RRWebInteractionEvent.Deserializer());
      this.deserializersByClass.put(RRWebInteractionMoveEvent.class, new RRWebInteractionMoveEvent.Deserializer());
      this.deserializersByClass.put(RRWebMetaEvent.class, new RRWebMetaEvent.Deserializer());
      this.deserializersByClass.put(RRWebSpanEvent.class, new RRWebSpanEvent.Deserializer());
      this.deserializersByClass.put(RRWebVideoEvent.class, new RRWebVideoEvent.Deserializer());
      this.deserializersByClass.put(SdkInfo.class, new SdkInfo.Deserializer());
      this.deserializersByClass.put(SdkVersion.class, new SdkVersion.Deserializer());
      this.deserializersByClass.put(SentryEnvelopeHeader.class, new SentryEnvelopeHeader.Deserializer());
      this.deserializersByClass.put(SentryEnvelopeItemHeader.class, new SentryEnvelopeItemHeader.Deserializer());
      this.deserializersByClass.put(SentryEvent.class, new SentryEvent.Deserializer());
      this.deserializersByClass.put(SentryException.class, new SentryException.Deserializer());
      this.deserializersByClass.put(SentryItemType.class, new SentryItemType.Deserializer());
      this.deserializersByClass.put(SentryLevel.class, new SentryLevel.Deserializer());
      this.deserializersByClass.put(SentryLockReason.class, new SentryLockReason.Deserializer());
      this.deserializersByClass.put(SentryPackage.class, new SentryPackage.Deserializer());
      this.deserializersByClass.put(SentryRuntime.class, new SentryRuntime.Deserializer());
      this.deserializersByClass.put(SentryReplayEvent.class, new SentryReplayEvent.Deserializer());
      this.deserializersByClass.put(SentrySpan.class, new SentrySpan.Deserializer());
      this.deserializersByClass.put(SentryStackFrame.class, new SentryStackFrame.Deserializer());
      this.deserializersByClass.put(SentryStackTrace.class, new SentryStackTrace.Deserializer());
      this.deserializersByClass.put(SentryAppStartProfilingOptions.class, new SentryAppStartProfilingOptions.Deserializer());
      this.deserializersByClass.put(SentryThread.class, new SentryThread.Deserializer());
      this.deserializersByClass.put(SentryTransaction.class, new SentryTransaction.Deserializer());
      this.deserializersByClass.put(Session.class, new Session.Deserializer());
      this.deserializersByClass.put(SpanContext.class, new SpanContext.Deserializer());
      this.deserializersByClass.put(SpanId.class, new SpanId.Deserializer());
      this.deserializersByClass.put(SpanStatus.class, new SpanStatus.Deserializer());
      this.deserializersByClass.put(User.class, new User.Deserializer());
      this.deserializersByClass.put(Geo.class, new Geo.Deserializer());
      this.deserializersByClass.put(UserFeedback.class, new UserFeedback.Deserializer());
      this.deserializersByClass.put(ClientReport.class, new ClientReport.Deserializer());
      this.deserializersByClass.put(ViewHierarchyNode.class, new ViewHierarchyNode.Deserializer());
      this.deserializersByClass.put(ViewHierarchy.class, new ViewHierarchy.Deserializer());
   }

   @Nullable
   @Override
   public <T, R> T deserializeCollection(@NotNull Reader var1, @NotNull Class<T> var2, @Nullable JsonDeserializer<R> var3) {
      try {
         JsonObjectReader var4 = new JsonObjectReader(var1);

         Object var11;
         label45: {
            label44: {
               try {
                  if (Collection.class.isAssignableFrom(var2)) {
                     if (var3 == null) {
                        var11 = var4.nextObjectOrNull();
                        break label45;
                     }

                     var11 = var4.nextListOrNull(this.options.getLogger(), var3);
                     break label44;
                  }

                  var11 = var4.nextObjectOrNull();
               } catch (Throwable var8) {
                  try {
                     var4.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }

                  throw var8;
               }

               var4.close();
               return (T)var11;
            }

            var4.close();
            return (T)var11;
         }

         var4.close();
         return (T)var11;
      } catch (Throwable var9) {
         this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing", var9);
         return null;
      }
   }

   @Nullable
   @Override
   public <T> T deserialize(@NotNull Reader var1, @NotNull Class<T> var2) {
      try {
         JsonObjectReader var3 = new JsonObjectReader(var1);

         Object var6;
         label45: {
            Object var10;
            label44: {
               try {
                  JsonDeserializer var4 = this.deserializersByClass.get(var2);
                  if (var4 != null) {
                     var10 = var4.deserialize(var3, this.options.getLogger());
                     var6 = var2.cast(var10);
                     break label45;
                  }

                  if (this.isKnownPrimitive(var2)) {
                     var10 = var3.nextObjectOrNull();
                     break label44;
                  }

                  var10 = null;
               } catch (Throwable var8) {
                  try {
                     var3.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }

                  throw var8;
               }

               var3.close();
               return (T)var10;
            }

            var3.close();
            return (T)var10;
         }

         var3.close();
         return (T)var6;
      } catch (Exception var9) {
         this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing", var9);
         return null;
      }
   }

   @Nullable
   @Override
   public SentryEnvelope deserializeEnvelope(@NotNull InputStream var1) {
      Objects.requireNonNull(var1, "The InputStream object is required.");

      try {
         return this.options.getEnvelopeReader().read(var1);
      } catch (IOException var3) {
         this.options.getLogger().log(SentryLevel.ERROR, "Error deserializing envelope.", var3);
         return null;
      }
   }

   @Override
   public <T> void serialize(@NotNull T var1, @NotNull Writer var2) {
      Objects.requireNonNull(var1, "The entity is required.");
      Objects.requireNonNull(var2, "The Writer object is required.");
      if (this.options.getLogger().isEnabled(SentryLevel.DEBUG)) {
         String var3 = this.serializeToString(var1, this.options.isEnablePrettySerializationOutput());
         this.options.getLogger().log(SentryLevel.DEBUG, "Serializing object: %s", var3);
      }

      JsonObjectWriter var4 = new JsonObjectWriter(var2, this.options.getMaxDepth());
      var4.value(this.options.getLogger(), var1);
      var2.flush();
   }

   @Override
   public void serialize(@NotNull SentryEnvelope var1, @NotNull OutputStream var2) {
      Objects.requireNonNull(var1, "The SentryEnvelope object is required.");
      Objects.requireNonNull(var2, "The Stream object is required.");
      BufferedOutputStream var3 = new BufferedOutputStream(var2);
      BufferedWriter var4 = new BufferedWriter(new OutputStreamWriter(var3, UTF_8));

      try {
         var1.getHeader().serialize(new JsonObjectWriter(var4, this.options.getMaxDepth()), this.options.getLogger());
         var4.write("\n");

         for (SentryEnvelopeItem var6 : var1.getItems()) {
            try {
               byte[] var7 = var6.getData();
               var6.getHeader().serialize(new JsonObjectWriter(var4, this.options.getMaxDepth()), this.options.getLogger());
               var4.write("\n");
               var4.flush();
               var2.write(var7);
               var4.write("\n");
            } catch (Exception var11) {
               this.options.getLogger().log(SentryLevel.ERROR, "Failed to create envelope item. Dropping it.", var11);
            }
         }
      } finally {
         var4.flush();
      }
   }

   @NotNull
   @Override
   public String serialize(@NotNull Map<String, Object> var1) {
      return this.serializeToString(var1, false);
   }

   @NotNull
   private String serializeToString(Object var1, boolean var2) {
      StringWriter var3 = new StringWriter();
      JsonObjectWriter var4 = new JsonObjectWriter(var3, this.options.getMaxDepth());
      if (var2) {
         var4.setIndent("\t");
      }

      var4.value(this.options.getLogger(), var1);
      return var3.toString();
   }

   private <T> boolean isKnownPrimitive(@NotNull Class<T> var1) {
      return var1.isArray() || Collection.class.isAssignableFrom(var1) || String.class.isAssignableFrom(var1) || Map.class.isAssignableFrom(var1);
   }
}
