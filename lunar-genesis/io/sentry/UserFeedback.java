package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class UserFeedback implements JsonSerializable, JsonUnknown {
   private final SentryId eventId;
   @Nullable
   private String name;
   @Nullable
   private String email;
   @Nullable
   private String comments;
   @Nullable
   private Map<String, Object> unknown;

   public UserFeedback(SentryId var1) {
      this(var1, null, null, null);
   }

   public UserFeedback(SentryId var1, @Nullable String var2, @Nullable String var3, @Nullable String var4) {
      this.eventId = var1;
      this.name = var2;
      this.email = var3;
      this.comments = var4;
   }

   public SentryId getEventId() {
      return this.eventId;
   }

   @Nullable
   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   @Nullable
   public String getEmail() {
      return this.email;
   }

   public void setEmail(@Nullable String var1) {
      this.email = var1;
   }

   @Nullable
   public String getComments() {
      return this.comments;
   }

   public void setComments(@Nullable String var1) {
      this.comments = var1;
   }

   @Override
   public String toString() {
      return "UserFeedback{eventId="
         + this.eventId
         + ", name='"
         + this.name
         + '\''
         + ", email='"
         + this.email
         + '\''
         + ", comments='"
         + this.comments
         + '\''
         + '}';
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
      var1.name("event_id");
      this.eventId.serialize(var1, var2);
      if (this.name != null) {
         var1.name("name").value(this.name);
      }

      if (this.email != null) {
         var1.name("email").value(this.email);
      }

      if (this.comments != null) {
         var1.name("comments").value(this.comments);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<UserFeedback> {
      @NotNull
      public UserFeedback deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryId var3 = null;
         String var4 = null;
         String var5 = null;
         String var6 = null;
         HashMap var7 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var8 = var1.nextName();
            switch (var8) {
               case "event_id":
                  var3 = new SentryId.Deserializer().deserialize(var1, var2);
                  break;
               case "name":
                  var4 = var1.nextStringOrNull();
                  break;
               case "email":
                  var5 = var1.nextStringOrNull();
                  break;
               case "comments":
                  var6 = var1.nextStringOrNull();
                  break;
               default:
                  if (var7 == null) {
                     var7 = new HashMap();
                  }

                  var1.nextUnknown(var2, var7, var8);
            }
         }

         var1.endObject();
         if (var3 == null) {
            String var12 = "Missing required field \"event_id\"";
            IllegalStateException var13 = new IllegalStateException(var12);
            var2.log(SentryLevel.ERROR, var12, var13);
            throw var13;
         } else {
            UserFeedback var11 = new UserFeedback(var3, var4, var5, var6);
            var11.setUnknown(var7);
            return var11;
         }
      }
   }

   public static final class JsonKeys {
      public static final String EVENT_ID = "event_id";
      public static final String NAME = "name";
      public static final String EMAIL = "email";
      public static final String COMMENTS = "comments";
   }
}
