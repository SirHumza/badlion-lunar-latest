package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MetricSummary implements JsonSerializable, JsonUnknown {
   private double min;
   private double max;
   private double sum;
   private int count;
   @Nullable
   private Map<String, String> tags;
   @Nullable
   private Map<String, Object> unknown;

   public MetricSummary() {
   }

   public MetricSummary(double var1, double var3, double var5, int var7, @Nullable Map<String, String> var8) {
      this.tags = var8;
      this.min = var1;
      this.max = var3;
      this.count = var7;
      this.sum = var5;
      this.unknown = null;
   }

   public void setTags(@Nullable Map<String, String> var1) {
      this.tags = var1;
   }

   public void setMin(double var1) {
      this.min = var1;
   }

   public void setMax(double var1) {
      this.max = var1;
   }

   public void setCount(int var1) {
      this.count = var1;
   }

   public void setSum(double var1) {
      this.sum = var1;
   }

   public double getMin() {
      return this.min;
   }

   public double getMax() {
      return this.max;
   }

   public double getSum() {
      return this.sum;
   }

   public int getCount() {
      return this.count;
   }

   @Nullable
   public Map<String, String> getTags() {
      return this.tags;
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
      var1.name("min").value(this.min);
      var1.name("max").value(this.max);
      var1.name("sum").value(this.sum);
      var1.name("count").value(this.count);
      if (this.tags != null) {
         var1.name("tags");
         var1.value(var2, this.tags);
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<MetricSummary> {
      @NotNull
      public MetricSummary deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         MetricSummary var3 = new MetricSummary();
         ConcurrentHashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "tags":
                  var3.tags = CollectionUtils.newConcurrentHashMap((Map<String, String>)var1.nextObjectOrNull());
                  break;
               case "min":
                  var3.setMin(var1.nextDouble());
                  break;
               case "max":
                  var3.setMax(var1.nextDouble());
                  break;
               case "sum":
                  var3.setSum(var1.nextDouble());
                  break;
               case "count":
                  var3.setCount(var1.nextInt());
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
      public static final String TAGS = "tags";
      public static final String MIN = "min";
      public static final String MAX = "max";
      public static final String COUNT = "count";
      public static final String SUM = "sum";
   }
}
