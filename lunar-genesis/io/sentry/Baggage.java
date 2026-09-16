package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.User;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class Baggage {
   @NotNull
   static final String CHARSET = "UTF-8";
   @NotNull
   static final Integer MAX_BAGGAGE_STRING_LENGTH = 8192;
   @NotNull
   static final Integer MAX_BAGGAGE_LIST_MEMBER_COUNT = 64;
   @NotNull
   static final String SENTRY_BAGGAGE_PREFIX = "sentry-";
   @NotNull
   final Map<String, String> keyValues;
   @Nullable
   final String thirdPartyHeader;
   private boolean mutable;
   @NotNull
   final ILogger logger;

   @NotNull
   public static Baggage fromHeader(@Nullable String var0) {
      return fromHeader(var0, false, HubAdapter.getInstance().getOptions().getLogger());
   }

   @NotNull
   public static Baggage fromHeader(@Nullable List<String> var0) {
      return fromHeader(var0, false, HubAdapter.getInstance().getOptions().getLogger());
   }

   @ApiStatus.Internal
   @NotNull
   public static Baggage fromHeader(String var0, @NotNull ILogger var1) {
      return fromHeader(var0, false, var1);
   }

   @ApiStatus.Internal
   @NotNull
   public static Baggage fromHeader(@Nullable List<String> var0, @NotNull ILogger var1) {
      return fromHeader(var0, false, var1);
   }

   @ApiStatus.Internal
   @NotNull
   public static Baggage fromHeader(@Nullable List<String> var0, boolean var1, @NotNull ILogger var2) {
      return var0 != null ? fromHeader(StringUtils.join(",", var0), var1, var2) : fromHeader((String)null, var1, var2);
   }

   @ApiStatus.Internal
   @NotNull
   public static Baggage fromHeader(@Nullable String var0, boolean var1, @NotNull ILogger var2) {
      HashMap var3 = new HashMap();
      ArrayList var4 = new ArrayList();
      boolean var5 = true;
      if (var0 != null) {
         try {
            String[] var6 = var0.split(",", -1);

            for (String var10 : var6) {
               if (var10.trim().startsWith("sentry-")) {
                  try {
                     int var11 = var10.indexOf("=");
                     String var12 = var10.substring(0, var11).trim();
                     String var13 = decode(var12);
                     String var14 = var10.substring(var11 + 1).trim();
                     String var15 = decode(var14);
                     var3.put(var13, var15);
                     var5 = false;
                  } catch (Throwable var16) {
                     var2.log(SentryLevel.ERROR, var16, "Unable to decode baggage key value pair %s", var10);
                  }
               } else if (var1) {
                  var4.add(var10.trim());
               }
            }
         } catch (Throwable var17) {
            var2.log(SentryLevel.ERROR, var17, "Unable to decode baggage header %s", var0);
         }
      }

      String var18 = var4.isEmpty() ? null : StringUtils.join(",", var4);
      return new Baggage(var3, var18, var5, var2);
   }

   @ApiStatus.Internal
   @NotNull
   public static Baggage fromEvent(@NotNull SentryEvent var0, @NotNull SentryOptions var1) {
      Baggage var2 = new Baggage(var1.getLogger());
      SpanContext var3 = var0.getContexts().getTrace();
      var2.setTraceId(var3 != null ? var3.getTraceId().toString() : null);
      var2.setPublicKey(var1.retrieveParsedDsn().getPublicKey());
      var2.setRelease(var0.getRelease());
      var2.setEnvironment(var0.getEnvironment());
      User var4 = var0.getUser();
      var2.setUserSegment(var4 != null ? getSegment(var4) : null);
      var2.setTransaction(var0.getTransaction());
      var2.setSampleRate(null);
      var2.setSampled(null);
      Object var5 = var0.getContexts().get("replay_id");
      if (var5 != null && !var5.toString().equals(SentryId.EMPTY_ID.toString())) {
         var2.setReplayId(var5.toString());
         var0.getContexts().remove("replay_id");
      }

      var2.freeze();
      return var2;
   }

   @ApiStatus.Internal
   public Baggage(@NotNull ILogger var1) {
      this(new HashMap<>(), null, true, var1);
   }

   @ApiStatus.Internal
   public Baggage(@NotNull Baggage var1) {
      this(var1.keyValues, var1.thirdPartyHeader, var1.mutable, var1.logger);
   }

   @ApiStatus.Internal
   public Baggage(@NotNull Map<String, String> var1, @Nullable String var2, boolean var3, @NotNull ILogger var4) {
      this.keyValues = var1;
      this.logger = var4;
      this.mutable = var3;
      this.thirdPartyHeader = var2;
   }

   @ApiStatus.Internal
   public void freeze() {
      this.mutable = false;
   }

   @ApiStatus.Internal
   public boolean isMutable() {
      return this.mutable;
   }

   @Nullable
   public String getThirdPartyHeader() {
      return this.thirdPartyHeader;
   }

   @NotNull
   public String toHeaderString(@Nullable String var1) {
      StringBuilder var2 = new StringBuilder();
      String var3 = "";
      int var4 = 0;
      if (var1 != null && !var1.isEmpty()) {
         var2.append(var1);
         var4 = StringUtils.countOf(var1, ',') + 1;
         var3 = ",";
      }

      for (String var7 : new TreeSet<>(this.keyValues.keySet())) {
         String var8 = this.keyValues.get(var7);
         if (var8 != null) {
            if (var4 >= MAX_BAGGAGE_LIST_MEMBER_COUNT) {
               this.logger
                  .log(
                     SentryLevel.ERROR,
                     "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.",
                     var7,
                     MAX_BAGGAGE_LIST_MEMBER_COUNT
                  );
            } else {
               try {
                  String var9 = this.encode(var7);
                  String var10 = this.encode(var8);
                  String var11 = var3 + var9 + "=" + var10;
                  int var12 = var11.length();
                  int var13 = var2.length() + var12;
                  if (var13 > MAX_BAGGAGE_STRING_LENGTH) {
                     this.logger
                        .log(
                           SentryLevel.ERROR,
                           "Not adding baggage value %s as the total header value length would exceed the maximum of %s.",
                           var7,
                           MAX_BAGGAGE_STRING_LENGTH
                        );
                  } else {
                     var4++;
                     var2.append(var11);
                     var3 = ",";
                  }
               } catch (Throwable var14) {
                  this.logger.log(SentryLevel.ERROR, var14, "Unable to encode baggage key value pair (key=%s,value=%s).", var7, var8);
               }
            }
         }
      }

      return var2.toString();
   }

   private String encode(@NotNull String var1) {
      return URLEncoder.encode(var1, "UTF-8").replaceAll("\\+", "%20");
   }

   private static String decode(@NotNull String var0) {
      return URLDecoder.decode(var0, "UTF-8");
   }

   @ApiStatus.Internal
   @Nullable
   public String get(@Nullable String var1) {
      return var1 == null ? null : this.keyValues.get(var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getTraceId() {
      return this.get("sentry-trace_id");
   }

   @ApiStatus.Internal
   public void setTraceId(@Nullable String var1) {
      this.set("sentry-trace_id", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getPublicKey() {
      return this.get("sentry-public_key");
   }

   @ApiStatus.Internal
   public void setPublicKey(@Nullable String var1) {
      this.set("sentry-public_key", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getEnvironment() {
      return this.get("sentry-environment");
   }

   @ApiStatus.Internal
   public void setEnvironment(@Nullable String var1) {
      this.set("sentry-environment", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getRelease() {
      return this.get("sentry-release");
   }

   @ApiStatus.Internal
   public void setRelease(@Nullable String var1) {
      this.set("sentry-release", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getUserId() {
      return this.get("sentry-user_id");
   }

   @ApiStatus.Internal
   public void setUserId(@Nullable String var1) {
      this.set("sentry-user_id", var1);
   }

   @Deprecated
   @ApiStatus.Internal
   @Nullable
   public String getUserSegment() {
      return this.get("sentry-user_segment");
   }

   @Deprecated
   @ApiStatus.Internal
   public void setUserSegment(@Nullable String var1) {
      this.set("sentry-user_segment", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getTransaction() {
      return this.get("sentry-transaction");
   }

   @ApiStatus.Internal
   public void setTransaction(@Nullable String var1) {
      this.set("sentry-transaction", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getSampleRate() {
      return this.get("sentry-sample_rate");
   }

   @ApiStatus.Internal
   @Nullable
   public String getSampled() {
      return this.get("sentry-sampled");
   }

   @ApiStatus.Internal
   public void setSampleRate(@Nullable String var1) {
      this.set("sentry-sample_rate", var1);
   }

   @ApiStatus.Internal
   public void setSampled(@Nullable String var1) {
      this.set("sentry-sampled", var1);
   }

   @ApiStatus.Internal
   @Nullable
   public String getReplayId() {
      return this.get("sentry-replay_id");
   }

   @ApiStatus.Internal
   public void setReplayId(@Nullable String var1) {
      this.set("sentry-replay_id", var1);
   }

   @ApiStatus.Internal
   public void set(@NotNull String var1, @Nullable String var2) {
      if (this.mutable) {
         this.keyValues.put(var1, var2);
      }
   }

   @ApiStatus.Internal
   @NotNull
   public Map<String, Object> getUnknown() {
      ConcurrentHashMap var1 = new ConcurrentHashMap();

      for (Entry var3 : this.keyValues.entrySet()) {
         String var4 = (String)var3.getKey();
         String var5 = (String)var3.getValue();
         if (!Baggage.DSCKeys.ALL.contains(var4) && var5 != null) {
            String var6 = var4.replaceFirst("sentry-", "");
            var1.put(var6, var5);
         }
      }

      return var1;
   }

   @ApiStatus.Internal
   public void setValuesFromTransaction(
      @NotNull ITransaction var1, @Nullable User var2, @Nullable SentryId var3, @NotNull SentryOptions var4, @Nullable TracesSamplingDecision var5
   ) {
      this.setTraceId(var1.getSpanContext().getTraceId().toString());
      this.setPublicKey(var4.retrieveParsedDsn().getPublicKey());
      this.setRelease(var4.getRelease());
      this.setEnvironment(var4.getEnvironment());
      this.setUserSegment(var2 != null ? getSegment(var2) : null);
      this.setTransaction(isHighQualityTransactionName(var1.getTransactionNameSource()) ? var1.getName() : null);
      if (var3 != null && !SentryId.EMPTY_ID.equals(var3)) {
         this.setReplayId(var3.toString());
      }

      this.setSampleRate(sampleRateToString(sampleRate(var5)));
      this.setSampled(StringUtils.toString(sampled(var5)));
   }

   @ApiStatus.Internal
   public void setValuesFromScope(@NotNull IScope var1, @NotNull SentryOptions var2) {
      PropagationContext var3 = var1.getPropagationContext();
      User var4 = var1.getUser();
      SentryId var5 = var1.getReplayId();
      this.setTraceId(var3.getTraceId().toString());
      this.setPublicKey(var2.retrieveParsedDsn().getPublicKey());
      this.setRelease(var2.getRelease());
      this.setEnvironment(var2.getEnvironment());
      if (!SentryId.EMPTY_ID.equals(var5)) {
         this.setReplayId(var5.toString());
      }

      this.setUserSegment(var4 != null ? getSegment(var4) : null);
      this.setTransaction(null);
      this.setSampleRate(null);
      this.setSampled(null);
   }

   @Deprecated
   @Nullable
   private static String getSegment(@NotNull User var0) {
      if (var0.getSegment() != null) {
         return var0.getSegment();
      }

      Map var1 = var0.getData();
      return var1 != null ? (String)var1.get("segment") : null;
   }

   @Nullable
   private static Double sampleRate(@Nullable TracesSamplingDecision var0) {
      return var0 == null ? null : var0.getSampleRate();
   }

   @Nullable
   private static String sampleRateToString(@Nullable Double var0) {
      if (!SampleRateUtils.isValidTracesSampleRate(var0, false)) {
         return null;
      }

      DecimalFormat var1 = new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
      return var1.format(var0);
   }

   @Nullable
   private static Boolean sampled(@Nullable TracesSamplingDecision var0) {
      return var0 == null ? null : var0.getSampled();
   }

   private static boolean isHighQualityTransactionName(@Nullable TransactionNameSource var0) {
      return var0 != null && !TransactionNameSource.URL.equals(var0);
   }

   @ApiStatus.Internal
   @Nullable
   public Double getSampleRateDouble() {
      String var1 = this.getSampleRate();
      if (var1 != null) {
         try {
            double var2 = Double.parseDouble(var1);
            if (SampleRateUtils.isValidTracesSampleRate(var2, false)) {
               return var2;
            }
         } catch (NumberFormatException var4) {
            return null;
         }
      }

      return null;
   }

   @ApiStatus.Internal
   @Nullable
   public TraceContext toTraceContext() {
      String var1 = this.getTraceId();
      String var2 = this.getReplayId();
      String var3 = this.getPublicKey();
      if (var1 != null && var3 != null) {
         TraceContext var4 = new TraceContext(
            new SentryId(var1),
            var3,
            this.getRelease(),
            this.getEnvironment(),
            this.getUserId(),
            this.getUserSegment(),
            this.getTransaction(),
            this.getSampleRate(),
            this.getSampled(),
            var2 == null ? null : new SentryId(var2)
         );
         var4.setUnknown(this.getUnknown());
         return var4;
      } else {
         return null;
      }
   }

   @ApiStatus.Internal
   public static final class DSCKeys {
      public static final String TRACE_ID = "sentry-trace_id";
      public static final String PUBLIC_KEY = "sentry-public_key";
      public static final String RELEASE = "sentry-release";
      public static final String USER_ID = "sentry-user_id";
      public static final String ENVIRONMENT = "sentry-environment";
      public static final String USER_SEGMENT = "sentry-user_segment";
      public static final String TRANSACTION = "sentry-transaction";
      public static final String SAMPLE_RATE = "sentry-sample_rate";
      public static final String SAMPLED = "sentry-sampled";
      public static final String REPLAY_ID = "sentry-replay_id";
      public static final List<String> ALL = Arrays.asList(
         "sentry-trace_id",
         "sentry-public_key",
         "sentry-release",
         "sentry-user_id",
         "sentry-environment",
         "sentry-user_segment",
         "sentry-transaction",
         "sentry-sample_rate",
         "sentry-sampled",
         "sentry-replay_id"
      );
   }
}
