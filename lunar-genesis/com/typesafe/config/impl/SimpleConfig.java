package com.typesafe.config.impl;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigMemorySize;
import com.typesafe.config.ConfigMergeable;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigResolveOptions;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

final class SimpleConfig implements Config, MergeableValue, Serializable {
   private static final long serialVersionUID = 1L;
   private final AbstractConfigObject object;

   SimpleConfig(AbstractConfigObject var1) {
      this.object = var1;
   }

   public AbstractConfigObject root() {
      return this.object;
   }

   @Override
   public ConfigOrigin origin() {
      return this.object.origin();
   }

   public SimpleConfig resolve() {
      return this.resolve(ConfigResolveOptions.defaults());
   }

   public SimpleConfig resolve(ConfigResolveOptions var1) {
      return this.resolveWith(this, var1);
   }

   public SimpleConfig resolveWith(Config var1) {
      return this.resolveWith(var1, ConfigResolveOptions.defaults());
   }

   public SimpleConfig resolveWith(Config var1, ConfigResolveOptions var2) {
      AbstractConfigValue var3 = ResolveContext.resolve(this.object, ((SimpleConfig)var1).object, var2);
      return var3 == this.object ? this : new SimpleConfig((AbstractConfigObject)var3);
   }

   private ConfigValue hasPathPeek(String var1) {
      Path var2 = Path.newPath(var1);

      try {
         return this.object.peekPath(var2);
      } catch (ConfigException.NotResolved var5) {
         throw ConfigImpl.improveNotResolved(var2, var5);
      }
   }

   @Override
   public boolean hasPath(String var1) {
      ConfigValue var2 = this.hasPathPeek(var1);
      return var2 != null && var2.valueType() != ConfigValueType.NULL;
   }

   @Override
   public boolean hasPathOrNull(String var1) {
      ConfigValue var2 = this.hasPathPeek(var1);
      return var2 != null;
   }

   @Override
   public boolean isEmpty() {
      return this.object.isEmpty();
   }

   private static void findPaths(Set<Entry<String, ConfigValue>> var0, Path var1, AbstractConfigObject var2) {
      for (Entry var4 : var2.entrySet()) {
         String var5 = (String)var4.getKey();
         ConfigValue var6 = (ConfigValue)var4.getValue();
         Path var7 = Path.newKey(var5);
         if (var1 != null) {
            var7 = var7.prepend(var1);
         }

         if (var6 instanceof AbstractConfigObject) {
            findPaths(var0, var7, (AbstractConfigObject)var6);
         } else if (!(var6 instanceof ConfigNull)) {
            var0.add(new SimpleImmutableEntry<>(var7.render(), var6));
         }
      }
   }

   @Override
   public Set<Entry<String, ConfigValue>> entrySet() {
      HashSet var1 = new HashSet();
      findPaths(var1, null, this.object);
      return var1;
   }

   private static AbstractConfigValue throwIfNull(AbstractConfigValue var0, ConfigValueType var1, Path var2) {
      if (var0.valueType() == ConfigValueType.NULL) {
         throw new ConfigException.Null(var0.origin(), var2.render(), var1 != null ? var1.name() : null);
      } else {
         return var0;
      }
   }

   private static AbstractConfigValue findKey(AbstractConfigObject var0, String var1, ConfigValueType var2, Path var3) {
      return throwIfNull(findKeyOrNull(var0, var1, var2, var3), var2, var3);
   }

   private static AbstractConfigValue findKeyOrNull(AbstractConfigObject var0, String var1, ConfigValueType var2, Path var3) {
      AbstractConfigValue var4 = var0.peekAssumingResolved(var1, var3);
      if (var4 == null) {
         throw new ConfigException.Missing(var0.origin(), var3.render());
      }

      if (var2 != null) {
         var4 = DefaultTransformer.transform(var4, var2);
      }

      if (var2 != null && var4.valueType() != var2 && var4.valueType() != ConfigValueType.NULL) {
         throw new ConfigException.WrongType(var4.origin(), var3.render(), var2.name(), var4.valueType().name());
      } else {
         return var4;
      }
   }

   private static AbstractConfigValue findOrNull(AbstractConfigObject var0, Path var1, ConfigValueType var2, Path var3) {
      try {
         String var4 = var1.first();
         Path var5 = var1.remainder();
         if (var5 == null) {
            return findKeyOrNull(var0, var4, var2, var3);
         }

         AbstractConfigObject var6 = (AbstractConfigObject)findKey(var0, var4, ConfigValueType.OBJECT, var3.subPath(0, var3.length() - var5.length()));
         assert var6 != null;
         return findOrNull(var6, var5, var2, var3);
      } catch (ConfigException.NotResolved var7) {
         throw ConfigImpl.improveNotResolved(var1, var7);
      }
   }

   AbstractConfigValue find(Path var1, ConfigValueType var2, Path var3) {
      return throwIfNull(findOrNull(this.object, var1, var2, var3), var2, var3);
   }

   AbstractConfigValue find(String var1, ConfigValueType var2) {
      Path var3 = Path.newPath(var1);
      return this.find(var3, var2, var3);
   }

   private AbstractConfigValue findOrNull(Path var1, ConfigValueType var2, Path var3) {
      return findOrNull(this.object, var1, var2, var3);
   }

   private AbstractConfigValue findOrNull(String var1, ConfigValueType var2) {
      Path var3 = Path.newPath(var1);
      return this.findOrNull(var3, var2, var3);
   }

   public AbstractConfigValue getValue(String var1) {
      return this.find(var1, null);
   }

   @Override
   public boolean getIsNull(String var1) {
      AbstractConfigValue var2 = this.findOrNull(var1, null);
      return var2.valueType() == ConfigValueType.NULL;
   }

   @Override
   public boolean getBoolean(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.BOOLEAN);
      return (Boolean)var2.unwrapped();
   }

   private ConfigNumber getConfigNumber(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.NUMBER);
      return (ConfigNumber)var2;
   }

   @Override
   public Number getNumber(String var1) {
      return this.getConfigNumber(var1).unwrapped();
   }

   @Override
   public int getInt(String var1) {
      ConfigNumber var2 = this.getConfigNumber(var1);
      return var2.intValueRangeChecked(var1);
   }

   @Override
   public long getLong(String var1) {
      return this.getNumber(var1).longValue();
   }

   @Override
   public double getDouble(String var1) {
      return this.getNumber(var1).doubleValue();
   }

   @Override
   public String getString(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.STRING);
      return (String)var2.unwrapped();
   }

   @Override
   public <T extends Enum<T>> T getEnum(Class<T> var1, String var2) {
      AbstractConfigValue var3 = this.find(var2, ConfigValueType.STRING);
      return this.getEnumValue(var2, var1, var3);
   }

   @Override
   public ConfigList getList(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.LIST);
      return (ConfigList)var2;
   }

   public AbstractConfigObject getObject(String var1) {
      return (AbstractConfigObject)this.find(var1, ConfigValueType.OBJECT);
   }

   public SimpleConfig getConfig(String var1) {
      return this.getObject(var1).toConfig();
   }

   @Override
   public Object getAnyRef(String var1) {
      AbstractConfigValue var2 = this.find(var1, null);
      return var2.unwrapped();
   }

   @Override
   public Long getBytes(String var1) {
      BigInteger var2 = this.getBytesBigInteger(var1);
      AbstractConfigValue var3 = this.find(var1, ConfigValueType.STRING);
      return this.toLong(var2, var3.origin(), var1);
   }

   private BigInteger getBytesBigInteger(String var1) {
      AbstractConfigValue var3 = this.find(var1, ConfigValueType.STRING);

      BigInteger var2;
      try {
         var2 = BigInteger.valueOf(this.getLong(var1));
      } catch (ConfigException.WrongType var5) {
         var2 = parseBytes((String)var3.unwrapped(), var3.origin(), var1);
      }

      if (var2.signum() < 0) {
         throw new ConfigException.BadValue(var3.origin(), var1, "Attempt to construct memory size with negative number: " + var2);
      } else {
         return var2;
      }
   }

   private List<BigInteger> getBytesListBigInteger(String var1) {
      ArrayList var2 = new ArrayList();

      for (ConfigValue var5 : this.getList(var1)) {
         BigInteger var6;
         if (var5.valueType() == ConfigValueType.NUMBER) {
            var6 = BigInteger.valueOf(((Number)var5.unwrapped()).longValue());
         } else {
            if (var5.valueType() != ConfigValueType.STRING) {
               throw new ConfigException.WrongType(var5.origin(), var1, "memory size string or number of bytes", var5.valueType().name());
            }

            String var7 = (String)var5.unwrapped();
            var6 = parseBytes(var7, var5.origin(), var1);
         }

         if (var6.signum() < 0) {
            throw new ConfigException.BadValue(var5.origin(), var1, "Attempt to construct ConfigMemorySize with negative number: " + var6);
         }

         var2.add(var6);
      }

      return var2;
   }

   @Override
   public ConfigMemorySize getMemorySize(String var1) {
      return ConfigMemorySize.ofBytes(this.getBytesBigInteger(var1));
   }

   @Deprecated
   @Override
   public Long getMilliseconds(String var1) {
      return this.getDuration(var1, TimeUnit.MILLISECONDS);
   }

   @Deprecated
   @Override
   public Long getNanoseconds(String var1) {
      return this.getDuration(var1, TimeUnit.NANOSECONDS);
   }

   @Override
   public long getDuration(String var1, TimeUnit var2) {
      AbstractConfigValue var3 = this.find(var1, ConfigValueType.STRING);
      return var2.convert(parseDuration((String)var3.unwrapped(), var3.origin(), var1), TimeUnit.NANOSECONDS);
   }

   @Override
   public Duration getDuration(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.STRING);
      long var3 = parseDuration((String)var2.unwrapped(), var2.origin(), var1);
      return Duration.ofNanos(var3);
   }

   @Override
   public Period getPeriod(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.STRING);
      return parsePeriod((String)var2.unwrapped(), var2.origin(), var1);
   }

   @Override
   public TemporalAmount getTemporal(String var1) {
      try {
         return this.getDuration(var1);
      } catch (ConfigException.BadValue var3) {
         return this.getPeriod(var1);
      }
   }

   private <T> List<T> getHomogeneousUnwrappedList(String var1, ConfigValueType var2) {
      ArrayList var3 = new ArrayList();

      for (ConfigValue var6 : this.getList(var1)) {
         AbstractConfigValue var7 = (AbstractConfigValue)var6;
         if (var2 != null) {
            var7 = DefaultTransformer.transform(var7, var2);
         }

         if (var7.valueType() != var2) {
            throw new ConfigException.WrongType(var7.origin(), var1, "list of " + var2.name(), "list of " + var7.valueType().name());
         }

         var3.add(var7.unwrapped());
      }

      return var3;
   }

   @Override
   public List<Boolean> getBooleanList(String var1) {
      return this.getHomogeneousUnwrappedList(var1, ConfigValueType.BOOLEAN);
   }

   @Override
   public List<Number> getNumberList(String var1) {
      return this.getHomogeneousUnwrappedList(var1, ConfigValueType.NUMBER);
   }

   @Override
   public List<Integer> getIntList(String var1) {
      ArrayList var2 = new ArrayList();

      for (AbstractConfigValue var5 : this.getHomogeneousWrappedList(var1, ConfigValueType.NUMBER)) {
         var2.add(((ConfigNumber)var5).intValueRangeChecked(var1));
      }

      return var2;
   }

   @Override
   public List<Long> getLongList(String var1) {
      ArrayList var2 = new ArrayList();

      for (Number var5 : this.getNumberList(var1)) {
         var2.add(var5.longValue());
      }

      return var2;
   }

   @Override
   public List<Double> getDoubleList(String var1) {
      ArrayList var2 = new ArrayList();

      for (Number var5 : this.getNumberList(var1)) {
         var2.add(var5.doubleValue());
      }

      return var2;
   }

   @Override
   public List<String> getStringList(String var1) {
      return this.getHomogeneousUnwrappedList(var1, ConfigValueType.STRING);
   }

   @Override
   public <T extends Enum<T>> List<T> getEnumList(Class<T> var1, String var2) {
      List var3 = this.getHomogeneousWrappedList(var2, ConfigValueType.STRING);
      ArrayList var4 = new ArrayList();

      for (ConfigString var6 : var3) {
         var4.add(this.getEnumValue(var2, var1, var6));
      }

      return var4;
   }

   private <T extends Enum<T>> T getEnumValue(String var1, Class<T> var2, ConfigValue var3) {
      String var4 = (String)var3.unwrapped();

      try {
         return Enum.valueOf(var2, var4);
      } catch (IllegalArgumentException var12) {
         ArrayList var6 = new ArrayList();
         Enum[] var7 = (Enum[])var2.getEnumConstants();
         if (var7 != null) {
            for (Enum var11 : var7) {
               var6.add(var11.name());
            }
         }

         throw new ConfigException.BadValue(
            var3.origin(), var1, String.format("The enum class %s has no constant of the name '%s' (should be one of %s.)", var2.getSimpleName(), var4, var6)
         );
      }
   }

   private <T extends ConfigValue> List<T> getHomogeneousWrappedList(String var1, ConfigValueType var2) {
      ArrayList var3 = new ArrayList();

      for (ConfigValue var6 : this.getList(var1)) {
         AbstractConfigValue var7 = (AbstractConfigValue)var6;
         if (var2 != null) {
            var7 = DefaultTransformer.transform(var7, var2);
         }

         if (var7.valueType() != var2) {
            throw new ConfigException.WrongType(var7.origin(), var1, "list of " + var2.name(), "list of " + var7.valueType().name());
         }

         var3.add(var7);
      }

      return var3;
   }

   @Override
   public List<ConfigObject> getObjectList(String var1) {
      return this.getHomogeneousWrappedList(var1, ConfigValueType.OBJECT);
   }

   @Override
   public List<? extends Config> getConfigList(String var1) {
      List var2 = this.getObjectList(var1);
      ArrayList var3 = new ArrayList();

      for (ConfigObject var5 : var2) {
         var3.add(var5.toConfig());
      }

      return var3;
   }

   @Override
   public List<? extends Object> getAnyRefList(String var1) {
      ArrayList var2 = new ArrayList();

      for (ConfigValue var5 : this.getList(var1)) {
         var2.add(var5.unwrapped());
      }

      return var2;
   }

   @Override
   public List<Long> getBytesList(String var1) {
      AbstractConfigValue var2 = this.find(var1, ConfigValueType.LIST);
      return this.getBytesListBigInteger(var1).stream().map(var3 -> this.toLong(var3, var2.origin(), var1)).collect(Collectors.toList());
   }

   private Long toLong(BigInteger var1, ConfigOrigin var2, String var3) {
      if (var1.bitLength() < 64) {
         return var1.longValue();
      } else {
         throw new ConfigException.BadValue(var2, var3, "size-in-bytes value is out of range for a 64-bit long: '" + var1 + "'");
      }
   }

   @Override
   public List<ConfigMemorySize> getMemorySizeList(String var1) {
      return this.getBytesListBigInteger(var1).stream().map(ConfigMemorySize::ofBytes).collect(Collectors.toList());
   }

   @Override
   public List<Long> getDurationList(String var1, TimeUnit var2) {
      ArrayList var3 = new ArrayList();

      for (ConfigValue var6 : this.getList(var1)) {
         if (var6.valueType() == ConfigValueType.NUMBER) {
            Long var7 = var2.convert(((Number)var6.unwrapped()).longValue(), TimeUnit.MILLISECONDS);
            var3.add(var7);
         } else {
            if (var6.valueType() != ConfigValueType.STRING) {
               throw new ConfigException.WrongType(var6.origin(), var1, "duration string or number of milliseconds", var6.valueType().name());
            }

            String var9 = (String)var6.unwrapped();
            Long var8 = var2.convert(parseDuration(var9, var6.origin(), var1), TimeUnit.NANOSECONDS);
            var3.add(var8);
         }
      }

      return var3;
   }

   @Override
   public List<Duration> getDurationList(String var1) {
      List var2 = this.getDurationList(var1, TimeUnit.NANOSECONDS);
      ArrayList var3 = new ArrayList(var2.size());

      for (Long var5 : var2) {
         var3.add(Duration.ofNanos(var5));
      }

      return var3;
   }

   @Deprecated
   @Override
   public List<Long> getMillisecondsList(String var1) {
      return this.getDurationList(var1, TimeUnit.MILLISECONDS);
   }

   @Deprecated
   @Override
   public List<Long> getNanosecondsList(String var1) {
      return this.getDurationList(var1, TimeUnit.NANOSECONDS);
   }

   public AbstractConfigObject toFallbackValue() {
      return this.object;
   }

   public SimpleConfig withFallback(ConfigMergeable var1) {
      return this.object.withFallback(var1).toConfig();
   }

   @Override
   public final boolean equals(Object var1) {
      return var1 instanceof SimpleConfig ? this.object.equals(((SimpleConfig)var1).object) : false;
   }

   @Override
   public final int hashCode() {
      return 41 * this.object.hashCode();
   }

   @Override
   public String toString() {
      return "Config(" + this.object.toString() + ")";
   }

   private static String getUnits(String var0) {
      int var1;
      for (var1 = var0.length() - 1; var1 >= 0; var1--) {
         char var2 = var0.charAt(var1);
         if (!Character.isLetter(var2)) {
            break;
         }
      }

      return var0.substring(var1 + 1);
   }

   public static Period parsePeriod(String var0, ConfigOrigin var1, String var2) {
      String var3 = ConfigImplUtil.unicodeTrim(var0);
      String var4 = getUnits(var3);
      String var5 = var4;
      String var6 = ConfigImplUtil.unicodeTrim(var3.substring(0, var3.length() - var5.length()));
      if (var6.length() == 0) {
         throw new ConfigException.BadValue(var1, var2, "No number in period value '" + var0 + "'");
      }

      if (var5.length() > 2 && !var5.endsWith("s")) {
         var5 = var5 + "s";
      }

      ChronoUnit var7;
      if (var5.equals("") || var5.equals("d") || var5.equals("days")) {
         var7 = ChronoUnit.DAYS;
      } else if (var5.equals("w") || var5.equals("weeks")) {
         var7 = ChronoUnit.WEEKS;
      } else if (!var5.equals("m") && !var5.equals("mo") && !var5.equals("months")) {
         if (!var5.equals("y") && !var5.equals("years")) {
            throw new ConfigException.BadValue(var1, var2, "Could not parse time unit '" + var4 + "' (try d, w, mo, y)");
         }

         var7 = ChronoUnit.YEARS;
      } else {
         var7 = ChronoUnit.MONTHS;
      }

      try {
         return periodOf(Integer.parseInt(var6), var7);
      } catch (NumberFormatException var9) {
         throw new ConfigException.BadValue(var1, var2, "Could not parse duration number '" + var6 + "'");
      }
   }

   private static Period periodOf(int var0, ChronoUnit var1) {
      if (var1.isTimeBased()) {
         throw new DateTimeException(var1 + " cannot be converted to a java.time.Period");
      }

      switch (var1) {
         case DAYS:
            return Period.ofDays(var0);
         case WEEKS:
            return Period.ofWeeks(var0);
         case MONTHS:
            return Period.ofMonths(var0);
         case YEARS:
            return Period.ofYears(var0);
         default:
            throw new DateTimeException(var1 + " cannot be converted to a java.time.Period");
      }
   }

   public static long parseDuration(String var0, ConfigOrigin var1, String var2) {
      String var3 = ConfigImplUtil.unicodeTrim(var0);
      String var4 = getUnits(var3);
      String var5 = var4;
      String var6 = ConfigImplUtil.unicodeTrim(var3.substring(0, var3.length() - var5.length()));
      TimeUnit var7 = null;
      if (var6.length() == 0) {
         throw new ConfigException.BadValue(var1, var2, "No number in duration value '" + var0 + "'");
      }

      if (var5.length() > 2 && !var5.endsWith("s")) {
         var5 = var5 + "s";
      }

      if (var5.equals("") || var5.equals("ms") || var5.equals("millis") || var5.equals("milliseconds")) {
         var7 = TimeUnit.MILLISECONDS;
      } else if (var5.equals("us") || var5.equals("micros") || var5.equals("microseconds")) {
         var7 = TimeUnit.MICROSECONDS;
      } else if (var5.equals("ns") || var5.equals("nanos") || var5.equals("nanoseconds")) {
         var7 = TimeUnit.NANOSECONDS;
      } else if (var5.equals("d") || var5.equals("days")) {
         var7 = TimeUnit.DAYS;
      } else if (var5.equals("h") || var5.equals("hours")) {
         var7 = TimeUnit.HOURS;
      } else if (!var5.equals("s") && !var5.equals("seconds")) {
         if (!var5.equals("m") && !var5.equals("minutes")) {
            throw new ConfigException.BadValue(var1, var2, "Could not parse time unit '" + var4 + "' (try ns, us, ms, s, m, h, d)");
         }

         var7 = TimeUnit.MINUTES;
      } else {
         var7 = TimeUnit.SECONDS;
      }

      try {
         if (var6.matches("[+-]?[0-9]+")) {
            return var7.toNanos(Long.parseLong(var6));
         }

         long var8 = var7.toNanos(1L);
         return (long)(Double.parseDouble(var6) * var8);
      } catch (NumberFormatException var10) {
         throw new ConfigException.BadValue(var1, var2, "Could not parse duration number '" + var6 + "'");
      }
   }

   public static BigInteger parseBytes(String var0, ConfigOrigin var1, String var2) {
      String var3 = ConfigImplUtil.unicodeTrim(var0);
      String var4 = getUnits(var3);
      String var5 = ConfigImplUtil.unicodeTrim(var3.substring(0, var3.length() - var4.length()));
      if (var5.length() == 0) {
         throw new ConfigException.BadValue(var1, var2, "No number in size-in-bytes value '" + var0 + "'");
      }

      SimpleConfig.MemoryUnit var6 = SimpleConfig.MemoryUnit.parseUnit(var4);
      if (var6 == null) {
         throw new ConfigException.BadValue(var1, var2, "Could not parse size-in-bytes unit '" + var4 + "' (try k, K, kB, KiB, kilobytes, kibibytes)");
      }

      try {
         BigInteger var7;
         if (var5.matches("[0-9]+")) {
            var7 = var6.bytes.multiply(new BigInteger(var5));
         } else {
            BigDecimal var8 = new BigDecimal(var6.bytes).multiply(new BigDecimal(var5));
            var7 = var8.toBigInteger();
         }

         return var7;
      } catch (NumberFormatException var9) {
         throw new ConfigException.BadValue(var1, var2, "Could not parse size-in-bytes number '" + var5 + "'");
      }
   }

   private AbstractConfigValue peekPath(Path var1) {
      return this.root().peekPath(var1);
   }

   private static void addProblem(List<ConfigException.ValidationProblem> var0, Path var1, ConfigOrigin var2, String var3) {
      var0.add(new ConfigException.ValidationProblem(var1.render(), var2, var3));
   }

   private static String getDesc(ConfigValueType var0) {
      return var0.name().toLowerCase();
   }

   private static String getDesc(ConfigValue var0) {
      if (var0 instanceof AbstractConfigObject) {
         AbstractConfigObject var1 = (AbstractConfigObject)var0;
         return !var1.isEmpty() ? "object with keys " + var1.keySet() : getDesc(var0.valueType());
      } else {
         return getDesc(var0.valueType());
      }
   }

   private static void addMissing(List<ConfigException.ValidationProblem> var0, String var1, Path var2, ConfigOrigin var3) {
      addProblem(var0, var2, var3, "No setting at '" + var2.render() + "', expecting: " + var1);
   }

   private static void addMissing(List<ConfigException.ValidationProblem> var0, ConfigValue var1, Path var2, ConfigOrigin var3) {
      addMissing(var0, getDesc(var1), var2, var3);
   }

   static void addMissing(List<ConfigException.ValidationProblem> var0, ConfigValueType var1, Path var2, ConfigOrigin var3) {
      addMissing(var0, getDesc(var1), var2, var3);
   }

   private static void addWrongType(List<ConfigException.ValidationProblem> var0, String var1, AbstractConfigValue var2, Path var3) {
      addProblem(var0, var3, var2.origin(), "Wrong value type at '" + var3.render() + "', expecting: " + var1 + " but got: " + getDesc(var2));
   }

   private static void addWrongType(List<ConfigException.ValidationProblem> var0, ConfigValue var1, AbstractConfigValue var2, Path var3) {
      addWrongType(var0, getDesc(var1), var2, var3);
   }

   private static void addWrongType(List<ConfigException.ValidationProblem> var0, ConfigValueType var1, AbstractConfigValue var2, Path var3) {
      addWrongType(var0, getDesc(var1), var2, var3);
   }

   private static boolean couldBeNull(AbstractConfigValue var0) {
      return DefaultTransformer.transform(var0, ConfigValueType.NULL).valueType() == ConfigValueType.NULL;
   }

   private static boolean haveCompatibleTypes(ConfigValue var0, AbstractConfigValue var1) {
      return couldBeNull((AbstractConfigValue)var0) ? true : haveCompatibleTypes(var0.valueType(), var1);
   }

   private static boolean haveCompatibleTypes(ConfigValueType var0, AbstractConfigValue var1) {
      if (var0 == ConfigValueType.NULL || couldBeNull(var1)) {
         return true;
      } else if (var0 == ConfigValueType.OBJECT) {
         return var1 instanceof AbstractConfigObject;
      } else if (var0 == ConfigValueType.LIST) {
         return var1 instanceof SimpleConfigList || var1 instanceof SimpleConfigObject;
      } else if (var0 == ConfigValueType.STRING) {
         return true;
      } else {
         return var1 instanceof ConfigString ? true : var0 == var1.valueType();
      }
   }

   private static void checkValidObject(Path var0, AbstractConfigObject var1, AbstractConfigObject var2, List<ConfigException.ValidationProblem> var3) {
      for (Entry var5 : var1.entrySet()) {
         String var6 = (String)var5.getKey();
         Path var7;
         if (var0 != null) {
            var7 = Path.newKey(var6).prepend(var0);
         } else {
            var7 = Path.newKey(var6);
         }

         AbstractConfigValue var8 = var2.get(var6);
         if (var8 == null) {
            addMissing(var3, (ConfigValue)var5.getValue(), var7, var2.origin());
         } else {
            checkValid(var7, (ConfigValue)var5.getValue(), var8, var3);
         }
      }
   }

   private static void checkListCompatibility(Path var0, SimpleConfigList var1, SimpleConfigList var2, List<ConfigException.ValidationProblem> var3) {
      if (!var1.isEmpty() && !var2.isEmpty()) {
         AbstractConfigValue var4 = var1.get(0);

         for (ConfigValue var6 : var2) {
            AbstractConfigValue var7 = (AbstractConfigValue)var6;
            if (!haveCompatibleTypes(var4, var7)) {
               addProblem(
                  var3,
                  var0,
                  var7.origin(),
                  "List at '" + var0.render() + "' contains wrong value type, expecting list of " + getDesc(var4) + " but got element of type " + getDesc(var7)
               );
               break;
            }
         }
      }
   }

   static void checkValid(Path var0, ConfigValueType var1, AbstractConfigValue var2, List<ConfigException.ValidationProblem> var3) {
      if (haveCompatibleTypes(var1, var2)) {
         if (var1 == ConfigValueType.LIST && var2 instanceof SimpleConfigObject) {
            AbstractConfigValue var4 = DefaultTransformer.transform(var2, ConfigValueType.LIST);
            if (!(var4 instanceof SimpleConfigList)) {
               addWrongType(var3, var1, var2, var0);
            }
         }
      } else {
         addWrongType(var3, var1, var2, var0);
      }
   }

   private static void checkValid(Path var0, ConfigValue var1, AbstractConfigValue var2, List<ConfigException.ValidationProblem> var3) {
      if (haveCompatibleTypes(var1, var2)) {
         if (var1 instanceof AbstractConfigObject && var2 instanceof AbstractConfigObject) {
            checkValidObject(var0, (AbstractConfigObject)var1, (AbstractConfigObject)var2, var3);
         } else if (var1 instanceof SimpleConfigList && var2 instanceof SimpleConfigList) {
            SimpleConfigList var6 = (SimpleConfigList)var1;
            SimpleConfigList var7 = (SimpleConfigList)var2;
            checkListCompatibility(var0, var6, var7, var3);
         } else if (var1 instanceof SimpleConfigList && var2 instanceof SimpleConfigObject) {
            SimpleConfigList var4 = (SimpleConfigList)var1;
            AbstractConfigValue var5 = DefaultTransformer.transform(var2, ConfigValueType.LIST);
            if (var5 instanceof SimpleConfigList) {
               checkListCompatibility(var0, var4, (SimpleConfigList)var5, var3);
            } else {
               addWrongType(var3, var1, var2, var0);
            }
         }
      } else {
         addWrongType(var3, var1, var2, var0);
      }
   }

   @Override
   public boolean isResolved() {
      return this.root().resolveStatus() == ResolveStatus.RESOLVED;
   }

   @Override
   public void checkValid(Config var1, String... var2) {
      SimpleConfig var3 = (SimpleConfig)var1;
      if (var3.root().resolveStatus() != ResolveStatus.RESOLVED) {
         throw new ConfigException.BugOrBroken(
            "do not call checkValid() with an unresolved reference config, call Config#resolve(), see Config#resolve() API docs"
         );
      }

      if (this.root().resolveStatus() != ResolveStatus.RESOLVED) {
         throw new ConfigException.NotResolved("need to Config#resolve() each config before using it, see the API docs for Config#resolve()");
      }

      ArrayList var4 = new ArrayList();
      if (var2.length == 0) {
         checkValidObject(null, var3.root(), this.root(), var4);
      } else {
         for (String var8 : var2) {
            Path var9 = Path.newPath(var8);
            AbstractConfigValue var10 = var3.peekPath(var9);
            if (var10 != null) {
               AbstractConfigValue var11 = this.peekPath(var9);
               if (var11 != null) {
                  checkValid(var9, var10, var11, var4);
               } else {
                  addMissing(var4, var10, var9, this.origin());
               }
            }
         }
      }

      if (!var4.isEmpty()) {
         throw new ConfigException.ValidationFailed(var4);
      }
   }

   public SimpleConfig withOnlyPath(String var1) {
      Path var2 = Path.newPath(var1);
      return new SimpleConfig(this.root().withOnlyPath(var2));
   }

   public SimpleConfig withoutPath(String var1) {
      Path var2 = Path.newPath(var1);
      return new SimpleConfig(this.root().withoutPath(var2));
   }

   public SimpleConfig withValue(String var1, ConfigValue var2) {
      Path var3 = Path.newPath(var1);
      return new SimpleConfig(this.root().withValue(var3, var2));
   }

   SimpleConfig atKey(ConfigOrigin var1, String var2) {
      return this.root().atKey(var1, var2);
   }

   public SimpleConfig atKey(String var1) {
      return this.root().atKey(var1);
   }

   @Override
   public Config atPath(String var1) {
      return this.root().atPath(var1);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }

   private enum MemoryUnit {
      BYTES("", 1024, 0),
      KILOBYTES("kilo", 1000, 1),
      MEGABYTES("mega", 1000, 2),
      GIGABYTES("giga", 1000, 3),
      TERABYTES("tera", 1000, 4),
      PETABYTES("peta", 1000, 5),
      EXABYTES("exa", 1000, 6),
      ZETTABYTES("zetta", 1000, 7),
      YOTTABYTES("yotta", 1000, 8),
      KIBIBYTES("kibi", 1024, 1),
      MEBIBYTES("mebi", 1024, 2),
      GIBIBYTES("gibi", 1024, 3),
      TEBIBYTES("tebi", 1024, 4),
      PEBIBYTES("pebi", 1024, 5),
      EXBIBYTES("exbi", 1024, 6),
      ZEBIBYTES("zebi", 1024, 7),
      YOBIBYTES("yobi", 1024, 8);

      final String prefix;
      final int powerOf;
      final int power;
      final BigInteger bytes;
      private static Map<String, SimpleConfig.MemoryUnit> unitsMap = makeUnitsMap();

      MemoryUnit(String var3, int var4, int var5) {
         this.prefix = var3;
         this.powerOf = var4;
         this.power = var5;
         this.bytes = BigInteger.valueOf(var4).pow(var5);
      }

      private static Map<String, SimpleConfig.MemoryUnit> makeUnitsMap() {
         HashMap var0 = new HashMap();

         for (SimpleConfig.MemoryUnit var4 : values()) {
            var0.put(var4.prefix + "byte", var4);
            var0.put(var4.prefix + "bytes", var4);
            if (var4.prefix.length() == 0) {
               var0.put("b", var4);
               var0.put("B", var4);
               var0.put("", var4);
            } else {
               String var5 = var4.prefix.substring(0, 1);
               String var6 = var5.toUpperCase();
               if (var4.powerOf == 1024) {
                  var0.put(var5, var4);
                  var0.put(var6, var4);
                  var0.put(var6 + "i", var4);
                  var0.put(var6 + "iB", var4);
               } else {
                  if (var4.powerOf != 1000) {
                     throw new RuntimeException("broken MemoryUnit enum");
                  }

                  if (var4.power == 1) {
                     var0.put(var5 + "B", var4);
                  } else {
                     var0.put(var6 + "B", var4);
                  }
               }
            }
         }

         return var0;
      }

      static SimpleConfig.MemoryUnit parseUnit(String var0) {
         return unitsMap.get(var0);
      }
   }
}
