package io.sentry.clientreport;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ClientReport implements JsonSerializable, JsonUnknown {
   @NotNull
   private final Date timestamp;
   @NotNull
   private final List<DiscardedEvent> discardedEvents;
   @Nullable
   private Map<String, Object> unknown;

   public ClientReport(@NotNull Date var1, @NotNull List<DiscardedEvent> var2) {
      this.timestamp = var1;
      this.discardedEvents = var2;
   }

   @NotNull
   public Date getTimestamp() {
      return this.timestamp;
   }

   @NotNull
   public List<DiscardedEvent> getDiscardedEvents() {
      return this.discardedEvents;
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
      var1.name("timestamp").value(DateUtils.getTimestamp(this.timestamp));
      var1.name("discarded_events").value(var2, this.discardedEvents);
      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<ClientReport> {
      @NotNull
      public ClientReport deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         Date var3 = null;
         ArrayList var4 = new ArrayList();
         HashMap var5 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "timestamp":
                  var3 = var1.nextDateOrNull(var2);
                  break;
               case "discarded_events":
                  List var9 = var1.nextListOrNull(var2, new DiscardedEvent.Deserializer());
                  var4.addAll(var9);
                  break;
               default:
                  if (var5 == null) {
                     var5 = new HashMap();
                  }

                  var1.nextUnknown(var2, var5, var6);
            }
         }

         var1.endObject();
         if (var3 == null) {
            throw this.missingRequiredFieldException("timestamp", var2);
         }

         if (var4.isEmpty()) {
            throw this.missingRequiredFieldException("discarded_events", var2);
         }

         ClientReport var10 = new ClientReport(var3, var4);
         var10.setUnknown(var5);
         return var10;
      }

      private Exception missingRequiredFieldException(String var1, ILogger var2) {
         String var3 = "Missing required field \"" + var1 + "\"";
         IllegalStateException var4 = new IllegalStateException(var3);
         var2.log(SentryLevel.ERROR, var3, var4);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String TIMESTAMP = "timestamp";
      public static final String DISCARDED_EVENTS = "discarded_events";
   }
}
