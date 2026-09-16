package io.sentry;

import io.sentry.clientreport.ClientReport;
import io.sentry.protocol.SentryTransaction;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public enum SentryItemType implements JsonSerializable {
   Session("session"),
   Event("event"),
   UserFeedback("user_report"),
   Attachment("attachment"),
   Transaction("transaction"),
   Profile("profile"),
   ClientReport("client_report"),
   ReplayEvent("replay_event"),
   ReplayRecording("replay_recording"),
   ReplayVideo("replay_video"),
   CheckIn("check_in"),
   Statsd("statsd"),
   Feedback("feedback"),
   Unknown("__unknown__");

   private final String itemType;

   public static SentryItemType resolve(Object var0) {
      if (var0 instanceof SentryEvent) {
         return Event;
      } else if (var0 instanceof SentryTransaction) {
         return Transaction;
      } else if (var0 instanceof Session) {
         return Session;
      } else {
         return var0 instanceof ClientReport ? ClientReport : Attachment;
      }
   }

   SentryItemType(String var3) {
      this.itemType = var3;
   }

   public String getItemType() {
      return this.itemType;
   }

   @NotNull
   public static SentryItemType valueOfLabel(String var0) {
      for (SentryItemType var4 : values()) {
         if (var4.itemType.equals(var0)) {
            return var4;
         }
      }

      return Unknown;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.value(this.itemType);
   }

   public static final class Deserializer implements JsonDeserializer<SentryItemType> {
      @NotNull
      public SentryItemType deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         return SentryItemType.valueOfLabel(var1.nextString().toLowerCase(Locale.ROOT));
      }
   }
}
