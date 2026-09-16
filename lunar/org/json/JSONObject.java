package org.json;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Map.Entry;

public class JSONObject {
   private final Map<String, Object> map;
   public static final Object NULL = new JSONObject.Null();

   public JSONObject() {
      this.map = new HashMap<>();
   }

   public JSONObject(JSONObject var1, String[] var2) {
      this(var2.length);

      for (int var3 = 0; var3 < var2.length; var3++) {
         try {
            this.putOnce(var2[var3], var1.opt(var2[var3]));
         } catch (Exception var5) {
         }
      }
   }

   public JSONObject(JSONTokener var1) {
      this();
      if (var1.nextClean() != '{') {
         throw var1.syntaxError("A JSONObject text must begin with '{'");
      }

      while (true) {
         char var2 = var1.nextClean();
         switch (var2) {
            case '\u0000':
               throw var1.syntaxError("A JSONObject text must end with '}'");
            case '}':
               return;
            default:
               var1.back();
               String var3 = var1.nextValue().toString();
               var2 = var1.nextClean();
               if (var2 != ':') {
                  throw var1.syntaxError("Expected a ':' after a key");
               }

               if (var3 != null) {
                  if (this.opt(var3) != null) {
                     throw var1.syntaxError("Duplicate key \"" + var3 + "\"");
                  }

                  Object var4 = var1.nextValue();
                  if (var4 != null) {
                     this.put(var3, var4);
                  }
               }

               switch (var1.nextClean()) {
                  case ',':
                  case ';':
                     if (var1.nextClean() == '}') {
                        return;
                     }

                     var1.back();
                     break;
                  case '}':
                     return;
                  default:
                     throw var1.syntaxError("Expected a ',' or '}'");
               }
         }
      }
   }

   public JSONObject(Map<?, ?> var1) {
      if (var1 == null) {
         this.map = new HashMap<>();
      } else {
         this.map = new HashMap<>(var1.size());

         for (Entry var3 : var1.entrySet()) {
            if (var3.getKey() == null) {
               throw new NullPointerException("Null key.");
            }

            Object var4 = var3.getValue();
            if (var4 != null) {
               this.map.put(String.valueOf(var3.getKey()), wrap(var4));
            }
         }
      }
   }

   public JSONObject(Object var1) {
      this();
      this.populateMap(var1);
   }

   public JSONObject(Object var1, String[] var2) {
      this(var2.length);
      Class var3 = var1.getClass();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];

         try {
            this.putOpt(var5, var3.getField(var5).get(var1));
         } catch (Exception var7) {
         }
      }
   }

   public JSONObject(String var1) {
      this(new JSONTokener(var1));
   }

   public JSONObject(String var1, Locale var2) {
      this();
      ResourceBundle var3 = ResourceBundle.getBundle(var1, var2, Thread.currentThread().getContextClassLoader());
      Enumeration var4 = var3.getKeys();

      while (var4.hasMoreElements()) {
         Object var5 = var4.nextElement();
         if (var5 != null) {
            String[] var6 = ((String)var5).split("\\.");
            int var7 = var6.length - 1;
            JSONObject var8 = this;

            for (int var9 = 0; var9 < var7; var9++) {
               String var10 = var6[var9];
               JSONObject var11 = var8.optJSONObject(var10);
               if (var11 == null) {
                  var11 = new JSONObject();
                  var8.put(var10, var11);
               }

               var8 = var11;
            }

            var8.put(var6[var7], var3.getString((String)var5));
         }
      }
   }

   protected JSONObject(int var1) {
      this.map = new HashMap<>(var1);
   }

   public JSONObject accumulate(String var1, Object var2) {
      testValidity(var2);
      Object var3 = this.opt(var1);
      if (var3 == null) {
         this.put(var1, var2 instanceof JSONArray ? new JSONArray().put(var2) : var2);
      } else if (var3 instanceof JSONArray) {
         ((JSONArray)var3).put(var2);
      } else {
         this.put(var1, new JSONArray().put(var3).put(var2));
      }

      return this;
   }

   public JSONObject append(String var1, Object var2) {
      testValidity(var2);
      Object var3 = this.opt(var1);
      if (var3 == null) {
         this.put(var1, new JSONArray().put(var2));
      } else {
         if (!(var3 instanceof JSONArray)) {
            throw new JSONException("JSONObject[" + var1 + "] is not a JSONArray.");
         }

         this.put(var1, ((JSONArray)var3).put(var2));
      }

      return this;
   }

   public static String doubleToString(double var0) {
      if (!Double.isInfinite(var0) && !Double.isNaN(var0)) {
         String var2 = Double.toString(var0);
         if (var2.indexOf(46) > 0 && var2.indexOf(101) < 0 && var2.indexOf(69) < 0) {
            while (var2.endsWith("0")) {
               var2 = var2.substring(0, var2.length() - 1);
            }

            if (var2.endsWith(".")) {
               var2 = var2.substring(0, var2.length() - 1);
            }
         }

         return var2;
      } else {
         return "null";
      }
   }

   public Object get(String var1) {
      if (var1 == null) {
         throw new JSONException("Null key.");
      } else {
         Object var2 = this.opt(var1);
         if (var2 == null) {
            throw new JSONException("JSONObject[" + quote(var1) + "] not found.");
         } else {
            return var2;
         }
      }
   }

   public <E extends Enum<E>> E getEnum(Class<E> var1, String var2) {
      Enum var3 = this.optEnum(var1, var2);
      if (var3 == null) {
         throw new JSONException("JSONObject[" + quote(var2) + "] is not an enum of type " + quote(var1.getSimpleName()) + ".");
      } else {
         return (E)var3;
      }
   }

   public boolean getBoolean(String var1) {
      Object var2 = this.get(var1);
      if (!var2.equals(Boolean.FALSE) && (!(var2 instanceof String) || !((String)var2).equalsIgnoreCase("false"))) {
         if (!var2.equals(Boolean.TRUE) && (!(var2 instanceof String) || !((String)var2).equalsIgnoreCase("true"))) {
            throw new JSONException("JSONObject[" + quote(var1) + "] is not a Boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public BigInteger getBigInteger(String var1) {
      Object var2 = this.get(var1);

      try {
         return new BigInteger(var2.toString());
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] could not be converted to BigInteger.", var4);
      }
   }

   public BigDecimal getBigDecimal(String var1) {
      Object var2 = this.get(var1);
      if (var2 instanceof BigDecimal) {
         return (BigDecimal)var2;
      }

      try {
         return new BigDecimal(var2.toString());
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] could not be converted to BigDecimal.", var4);
      }
   }

   public double getDouble(String var1) {
      Object var2 = this.get(var1);

      try {
         return var2 instanceof Number ? ((Number)var2).doubleValue() : Double.parseDouble(var2.toString());
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not a number.", var4);
      }
   }

   public float getFloat(String var1) {
      Object var2 = this.get(var1);

      try {
         return var2 instanceof Number ? ((Number)var2).floatValue() : Float.parseFloat(var2.toString());
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not a number.", var4);
      }
   }

   public Number getNumber(String var1) {
      Object var2 = this.get(var1);

      try {
         return var2 instanceof Number ? (Number)var2 : stringToNumber(var2.toString());
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not a number.", var4);
      }
   }

   public int getInt(String var1) {
      Object var2 = this.get(var1);

      try {
         return var2 instanceof Number ? ((Number)var2).intValue() : Integer.parseInt((String)var2);
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not an int.", var4);
      }
   }

   public JSONArray getJSONArray(String var1) {
      Object var2 = this.get(var1);
      if (var2 instanceof JSONArray) {
         return (JSONArray)var2;
      } else {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not a JSONArray.");
      }
   }

   public JSONObject getJSONObject(String var1) {
      Object var2 = this.get(var1);
      if (var2 instanceof JSONObject) {
         return (JSONObject)var2;
      } else {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not a JSONObject.");
      }
   }

   public long getLong(String var1) {
      Object var2 = this.get(var1);

      try {
         return var2 instanceof Number ? ((Number)var2).longValue() : Long.parseLong((String)var2);
      } catch (Exception var4) {
         throw new JSONException("JSONObject[" + quote(var1) + "] is not a long.", var4);
      }
   }

   public static String[] getNames(JSONObject var0) {
      return var0.isEmpty() ? null : var0.keySet().toArray(new String[var0.length()]);
   }

   public static String[] getNames(Object var0) {
      if (var0 == null) {
         return null;
      }

      Class var1 = var0.getClass();
      Field[] var2 = var1.getFields();
      int var3 = var2.length;
      if (var3 == 0) {
         return null;
      }

      String[] var4 = new String[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var4[var5] = var2[var5].getName();
      }

      return var4;
   }

   public String getString(String var1) {
      Object var2 = this.get(var1);
      if (var2 instanceof String) {
         return (String)var2;
      } else {
         throw new JSONException("JSONObject[" + quote(var1) + "] not a string.");
      }
   }

   public boolean has(String var1) {
      return this.map.containsKey(var1);
   }

   public JSONObject increment(String var1) {
      Object var2 = this.opt(var1);
      if (var2 == null) {
         this.put(var1, 1);
      } else if (var2 instanceof BigInteger) {
         this.put(var1, ((BigInteger)var2).add(BigInteger.ONE));
      } else if (var2 instanceof BigDecimal) {
         this.put(var1, ((BigDecimal)var2).add(BigDecimal.ONE));
      } else if (var2 instanceof Integer) {
         this.put(var1, (Integer)var2 + 1);
      } else if (var2 instanceof Long) {
         this.put(var1, (Long)var2 + 1L);
      } else if (var2 instanceof Double) {
         this.put(var1, (Double)var2 + 1.0);
      } else {
         if (!(var2 instanceof Float)) {
            throw new JSONException("Unable to increment [" + quote(var1) + "].");
         }

         this.put(var1, (Float)var2 + 1.0F);
      }

      return this;
   }

   public boolean isNull(String var1) {
      return NULL.equals(this.opt(var1));
   }

   public Iterator<String> keys() {
      return this.keySet().iterator();
   }

   public Set<String> keySet() {
      return this.map.keySet();
   }

   protected Set<Entry<String, Object>> entrySet() {
      return this.map.entrySet();
   }

   public int length() {
      return this.map.size();
   }

   public boolean isEmpty() {
      return this.map.isEmpty();
   }

   public JSONArray names() {
      return this.map.isEmpty() ? null : new JSONArray(this.map.keySet());
   }

   public static String numberToString(Number var0) {
      if (var0 == null) {
         throw new JSONException("Null pointer");
      }

      testValidity(var0);
      String var1 = var0.toString();
      if (var1.indexOf(46) > 0 && var1.indexOf(101) < 0 && var1.indexOf(69) < 0) {
         while (var1.endsWith("0")) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         if (var1.endsWith(".")) {
            var1 = var1.substring(0, var1.length() - 1);
         }
      }

      return var1;
   }

   public Object opt(String var1) {
      return var1 == null ? null : this.map.get(var1);
   }

   public <E extends Enum<E>> E optEnum(Class<E> var1, String var2) {
      return this.optEnum(var1, var2, null);
   }

   public <E extends Enum<E>> E optEnum(Class<E> var1, String var2, E var3) {
      try {
         Object var4 = this.opt(var2);
         if (NULL.equals(var4)) {
            return (E)var3;
         } else {
            return (E)(var1.isAssignableFrom(var4.getClass()) ? var4 : Enum.valueOf(var1, var4.toString()));
         }
      } catch (IllegalArgumentException var6) {
         return (E)var3;
      } catch (NullPointerException var7) {
         return (E)var3;
      }
   }

   public boolean optBoolean(String var1) {
      return this.optBoolean(var1, false);
   }

   public boolean optBoolean(String var1, boolean var2) {
      Object var3 = this.opt(var1);
      if (NULL.equals(var3)) {
         return var2;
      }

      if (var3 instanceof Boolean) {
         return (Boolean)var3;
      }

      try {
         return this.getBoolean(var1);
      } catch (Exception var5) {
         return var2;
      }
   }

   public BigDecimal optBigDecimal(String var1, BigDecimal var2) {
      Object var3 = this.opt(var1);
      if (NULL.equals(var3)) {
         return var2;
      }

      if (var3 instanceof BigDecimal) {
         return (BigDecimal)var3;
      }

      if (var3 instanceof BigInteger) {
         return new BigDecimal((BigInteger)var3);
      }

      if (var3 instanceof Double || var3 instanceof Float) {
         return new BigDecimal(((Number)var3).doubleValue());
      }

      if (!(var3 instanceof Long) && !(var3 instanceof Integer) && !(var3 instanceof Short) && !(var3 instanceof Byte)) {
         try {
            return new BigDecimal(var3.toString());
         } catch (Exception var5) {
            return var2;
         }
      } else {
         return new BigDecimal(((Number)var3).longValue());
      }
   }

   public BigInteger optBigInteger(String var1, BigInteger var2) {
      Object var3 = this.opt(var1);
      if (NULL.equals(var3)) {
         return var2;
      }

      if (var3 instanceof BigInteger) {
         return (BigInteger)var3;
      }

      if (var3 instanceof BigDecimal) {
         return ((BigDecimal)var3).toBigInteger();
      }

      if (var3 instanceof Double || var3 instanceof Float) {
         return new BigDecimal(((Number)var3).doubleValue()).toBigInteger();
      }

      if (!(var3 instanceof Long) && !(var3 instanceof Integer) && !(var3 instanceof Short) && !(var3 instanceof Byte)) {
         try {
            String var4 = var3.toString();
            return isDecimalNotation(var4) ? new BigDecimal(var4).toBigInteger() : new BigInteger(var4);
         } catch (Exception var5) {
            return var2;
         }
      } else {
         return BigInteger.valueOf(((Number)var3).longValue());
      }
   }

   public double optDouble(String var1) {
      return this.optDouble(var1, Double.NaN);
   }

   public double optDouble(String var1, double var2) {
      Object var4 = this.opt(var1);
      if (NULL.equals(var4)) {
         return var2;
      }

      if (var4 instanceof Number) {
         return ((Number)var4).doubleValue();
      }

      if (var4 instanceof String) {
         try {
            return Double.parseDouble((String)var4);
         } catch (Exception var6) {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public float optFloat(String var1) {
      return this.optFloat(var1, Float.NaN);
   }

   public float optFloat(String var1, float var2) {
      Object var3 = this.opt(var1);
      if (NULL.equals(var3)) {
         return var2;
      }

      if (var3 instanceof Number) {
         return ((Number)var3).floatValue();
      }

      if (var3 instanceof String) {
         try {
            return Float.parseFloat((String)var3);
         } catch (Exception var5) {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public int optInt(String var1) {
      return this.optInt(var1, 0);
   }

   public int optInt(String var1, int var2) {
      Object var3 = this.opt(var1);
      if (NULL.equals(var3)) {
         return var2;
      }

      if (var3 instanceof Number) {
         return ((Number)var3).intValue();
      }

      if (var3 instanceof String) {
         try {
            return new BigDecimal((String)var3).intValue();
         } catch (Exception var5) {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public JSONArray optJSONArray(String var1) {
      Object var2 = this.opt(var1);
      return var2 instanceof JSONArray ? (JSONArray)var2 : null;
   }

   public JSONObject optJSONObject(String var1) {
      Object var2 = this.opt(var1);
      return var2 instanceof JSONObject ? (JSONObject)var2 : null;
   }

   public long optLong(String var1) {
      return this.optLong(var1, 0L);
   }

   public long optLong(String var1, long var2) {
      Object var4 = this.opt(var1);
      if (NULL.equals(var4)) {
         return var2;
      }

      if (var4 instanceof Number) {
         return ((Number)var4).longValue();
      }

      if (var4 instanceof String) {
         try {
            return new BigDecimal((String)var4).longValue();
         } catch (Exception var6) {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public Number optNumber(String var1) {
      return this.optNumber(var1, null);
   }

   public Number optNumber(String var1, Number var2) {
      Object var3 = this.opt(var1);
      if (NULL.equals(var3)) {
         return var2;
      }

      if (var3 instanceof Number) {
         return (Number)var3;
      }

      if (var3 instanceof String) {
         try {
            return stringToNumber((String)var3);
         } catch (Exception var5) {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public String optString(String var1) {
      return this.optString(var1, "");
   }

   public String optString(String var1, String var2) {
      Object var3 = this.opt(var1);
      return NULL.equals(var3) ? var2 : var3.toString();
   }

   private void populateMap(Object var1) {
      Class var2 = var1.getClass();
      boolean var3 = var2.getClassLoader() != null;
      Method[] var4 = var3 ? var2.getMethods() : var2.getDeclaredMethods();

      for (Method var8 : var4) {
         int var9 = var8.getModifiers();
         if (Modifier.isPublic(var9)
            && !Modifier.isStatic(var9)
            && var8.getParameterTypes().length == 0
            && !var8.isBridge()
            && var8.getReturnType() != void.class
            && this.isValidMethodName(var8.getName())) {
            String var10 = this.getKeyNameFromMethod(var8);
            if (var10 != null && !var10.isEmpty()) {
               try {
                  Object var11 = var8.invoke(var1);
                  if (var11 != null) {
                     this.map.put(var10, wrap(var11));
                     if (var11 instanceof Closeable) {
                        try {
                           ((Closeable)var11).close();
                        } catch (IOException var13) {
                        }
                     }
                  }
               } catch (IllegalAccessException var14) {
               } catch (IllegalArgumentException var15) {
               } catch (InvocationTargetException var16) {
               }
            }
         }
      }
   }

   private boolean isValidMethodName(String var1) {
      return !"getClass".equals(var1) && !"getDeclaringClass".equals(var1);
   }

   private String getKeyNameFromMethod(Method var1) {
      int var2 = getAnnotationDepth(var1, JSONPropertyIgnore.class);
      if (var2 > 0) {
         int var3 = getAnnotationDepth(var1, JSONPropertyName.class);
         if (var3 < 0 || var2 <= var3) {
            return null;
         }
      }

      JSONPropertyName var6 = getAnnotation(var1, JSONPropertyName.class);
      if (var6 != null && var6.value() != null && !var6.value().isEmpty()) {
         return var6.value();
      }

      String var5 = var1.getName();
      String var4;
      if (var5.startsWith("get") && var5.length() > 3) {
         var4 = var5.substring(3);
      } else {
         if (!var5.startsWith("is") || var5.length() <= 2) {
            return null;
         }

         var4 = var5.substring(2);
      }

      if (Character.isLowerCase(var4.charAt(0))) {
         return null;
      }

      if (var4.length() == 1) {
         var4 = var4.toLowerCase(Locale.ROOT);
      } else if (!Character.isUpperCase(var4.charAt(1))) {
         var4 = var4.substring(0, 1).toLowerCase(Locale.ROOT) + var4.substring(1);
      }

      return var4;
   }

   private static <A extends Annotation> A getAnnotation(Method var0, Class<A> var1) {
      if (var0 == null || var1 == null) {
         return null;
      }

      if (var0.isAnnotationPresent(var1)) {
         return var0.getAnnotation(var1);
      }

      Class var2 = var0.getDeclaringClass();
      if (var2.getSuperclass() == null) {
         return null;
      }

      for (Class var6 : var2.getInterfaces()) {
         try {
            Method var7 = var6.getMethod(var0.getName(), var0.getParameterTypes());
            return getAnnotation(var7, var1);
         } catch (SecurityException var10) {
         } catch (NoSuchMethodException var11) {
         }
      }

      try {
         return getAnnotation(var2.getSuperclass().getMethod(var0.getName(), var0.getParameterTypes()), var1);
      } catch (SecurityException var8) {
         return null;
      } catch (NoSuchMethodException var9) {
         return null;
      }
   }

   private static int getAnnotationDepth(Method var0, Class<? extends Annotation> var1) {
      if (var0 == null || var1 == null) {
         return -1;
      }

      if (var0.isAnnotationPresent(var1)) {
         return 1;
      }

      Class var2 = var0.getDeclaringClass();
      if (var2.getSuperclass() == null) {
         return -1;
      }

      for (Class var6 : var2.getInterfaces()) {
         try {
            Method var7 = var6.getMethod(var0.getName(), var0.getParameterTypes());
            int var8 = getAnnotationDepth(var7, var1);
            if (var8 > 0) {
               return var8 + 1;
            }
         } catch (SecurityException var11) {
         } catch (NoSuchMethodException var12) {
         }
      }

      try {
         int var13 = getAnnotationDepth(var2.getSuperclass().getMethod(var0.getName(), var0.getParameterTypes()), var1);
         return var13 > 0 ? var13 + 1 : -1;
      } catch (SecurityException var9) {
         return -1;
      } catch (NoSuchMethodException var10) {
         return -1;
      }
   }

   public JSONObject put(String var1, boolean var2) {
      return this.put(var1, var2 ? Boolean.TRUE : Boolean.FALSE);
   }

   public JSONObject put(String var1, Collection<?> var2) {
      return this.put(var1, new JSONArray(var2));
   }

   public JSONObject put(String var1, double var2) {
      return this.put(var1, Double.valueOf(var2));
   }

   public JSONObject put(String var1, float var2) {
      return this.put(var1, Float.valueOf(var2));
   }

   public JSONObject put(String var1, int var2) {
      return this.put(var1, Integer.valueOf(var2));
   }

   public JSONObject put(String var1, long var2) {
      return this.put(var1, Long.valueOf(var2));
   }

   public JSONObject put(String var1, Map<?, ?> var2) {
      return this.put(var1, new JSONObject(var2));
   }

   public JSONObject put(String var1, Object var2) {
      if (var1 == null) {
         throw new NullPointerException("Null key.");
      }

      if (var2 != null) {
         testValidity(var2);
         this.map.put(var1, var2);
      } else {
         this.remove(var1);
      }

      return this;
   }

   public JSONObject putOnce(String var1, Object var2) {
      if (var1 == null || var2 == null) {
         return this;
      } else if (this.opt(var1) != null) {
         throw new JSONException("Duplicate key \"" + var1 + "\"");
      } else {
         return this.put(var1, var2);
      }
   }

   public JSONObject putOpt(String var1, Object var2) {
      return var1 != null && var2 != null ? this.put(var1, var2) : this;
   }

   public Object query(String var1) {
      return this.query(new JSONPointer(var1));
   }

   public Object query(JSONPointer var1) {
      return var1.queryFrom(this);
   }

   public Object optQuery(String var1) {
      return this.optQuery(new JSONPointer(var1));
   }

   public Object optQuery(JSONPointer var1) {
      try {
         return var1.queryFrom(this);
      } catch (JSONPointerException var3) {
         return null;
      }
   }

   public static String quote(String var0) {
      StringWriter var1 = new StringWriter();
      synchronized (var1.getBuffer()) {
         String var10000;
         try {
            var10000 = quote(var0, var1).toString();
         } catch (IOException var5) {
            return "";
         }

         return var10000;
      }
   }

   public static Writer quote(String var0, Writer var1) {
      if (var0 != null && !var0.isEmpty()) {
         char var3 = 0;
         int var6 = var0.length();
         var1.write(34);

         for (int var5 = 0; var5 < var6; var5++) {
            char var2 = var3;
            var3 = var0.charAt(var5);
            switch (var3) {
               case '\b':
                  var1.write("\\b");
                  break;
               case '\t':
                  var1.write("\\t");
                  break;
               case '\n':
                  var1.write("\\n");
                  break;
               case '\f':
                  var1.write("\\f");
                  break;
               case '\r':
                  var1.write("\\r");
                  break;
               case '"':
               case '\\':
                  var1.write(92);
                  var1.write(var3);
                  break;
               case '/':
                  if (var2 == '<') {
                     var1.write(92);
                  }

                  var1.write(var3);
                  break;
               default:
                  if (var3 >= ' ' && (var3 < 128 || var3 >= 160) && (var3 < 8192 || var3 >= 8448)) {
                     var1.write(var3);
                  } else {
                     var1.write("\\u");
                     String var4 = Integer.toHexString(var3);
                     var1.write("0000", 0, 4 - var4.length());
                     var1.write(var4);
                  }
            }
         }

         var1.write(34);
         return var1;
      } else {
         var1.write("\"\"");
         return var1;
      }
   }

   public Object remove(String var1) {
      return this.map.remove(var1);
   }

   public boolean similar(Object var1) {
      try {
         if (!(var1 instanceof JSONObject)) {
            return false;
         }

         if (!this.keySet().equals(((JSONObject)var1).keySet())) {
            return false;
         }

         for (Entry var3 : this.entrySet()) {
            String var4 = (String)var3.getKey();
            Object var5 = var3.getValue();
            Object var6 = ((JSONObject)var1).get(var4);
            if (var5 != var6) {
               if (var5 == null) {
                  return false;
               }

               if (var5 instanceof JSONObject) {
                  if (!((JSONObject)var5).similar(var6)) {
                     return false;
                  }
               } else if (var5 instanceof JSONArray) {
                  if (!((JSONArray)var5).similar(var6)) {
                     return false;
                  }
               } else if (!var5.equals(var6)) {
                  return false;
               }
            }
         }

         return true;
      } catch (Throwable var7) {
         return false;
      }
   }

   protected static boolean isDecimalNotation(String var0) {
      return var0.indexOf(46) > -1 || var0.indexOf(101) > -1 || var0.indexOf(69) > -1 || "-0".equals(var0);
   }

   protected static Number stringToNumber(String var0) {
      char var1 = var0.charAt(0);
      if ((var1 < '0' || var1 > '9') && var1 != '-') {
         throw new NumberFormatException("val [" + var0 + "] is not a valid number.");
      }

      if (isDecimalNotation(var0)) {
         if (var0.length() > 14) {
            return new BigDecimal(var0);
         }

         Double var3 = Double.valueOf(var0);
         return !var3.isInfinite() && !var3.isNaN() ? var3 : new BigDecimal(var0);
      } else {
         BigInteger var2 = new BigInteger(var0);
         if (var2.bitLength() <= 31) {
            return var2.intValue();
         } else {
            return var2.bitLength() <= 63 ? var2.longValue() : var2;
         }
      }
   }

   public static Object stringToValue(String var0) {
      if (var0.equals("")) {
         return var0;
      }

      if (var0.equalsIgnoreCase("true")) {
         return Boolean.TRUE;
      }

      if (var0.equalsIgnoreCase("false")) {
         return Boolean.FALSE;
      }

      if (var0.equalsIgnoreCase("null")) {
         return NULL;
      }

      char var1 = var0.charAt(0);
      if (var1 >= '0' && var1 <= '9' || var1 == '-') {
         try {
            if (isDecimalNotation(var0)) {
               Double var2 = Double.valueOf(var0);
               if (!var2.isInfinite() && !var2.isNaN()) {
                  return var2;
               }
            } else {
               Long var4 = Long.valueOf(var0);
               if (var0.equals(var4.toString())) {
                  if (var4 == var4.intValue()) {
                     return var4.intValue();
                  }

                  return var4;
               }
            }
         } catch (Exception var3) {
         }
      }

      return var0;
   }

   public static void testValidity(Object var0) {
      if (var0 != null) {
         if (var0 instanceof Double) {
            if (((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
               throw new JSONException("JSON does not allow non-finite numbers.");
            }
         } else if (var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
            throw new JSONException("JSON does not allow non-finite numbers.");
         }
      }
   }

   public JSONArray toJSONArray(JSONArray var1) {
      if (var1 != null && !var1.isEmpty()) {
         JSONArray var2 = new JSONArray();

         for (int var3 = 0; var3 < var1.length(); var3++) {
            var2.put(this.opt(var1.getString(var3)));
         }

         return var2;
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      try {
         return this.toString(0);
      } catch (Exception var2) {
         return null;
      }
   }

   public String toString(int var1) {
      StringWriter var2 = new StringWriter();
      synchronized (var2.getBuffer()) {
         return this.write(var2, var1, 0).toString();
      }
   }

   public static String valueToString(Object var0) {
      return JSONWriter.valueToString(var0);
   }

   public static Object wrap(Object var0) {
      try {
         if (var0 == null) {
            return NULL;
         } else if (var0 instanceof JSONObject
            || var0 instanceof JSONArray
            || NULL.equals(var0)
            || var0 instanceof JSONString
            || var0 instanceof Byte
            || var0 instanceof Character
            || var0 instanceof Short
            || var0 instanceof Integer
            || var0 instanceof Long
            || var0 instanceof Boolean
            || var0 instanceof Float
            || var0 instanceof Double
            || var0 instanceof String
            || var0 instanceof BigInteger
            || var0 instanceof BigDecimal
            || var0 instanceof Enum) {
            return var0;
         } else if (var0 instanceof Collection) {
            Collection var5 = (Collection)var0;
            return new JSONArray(var5);
         } else if (var0.getClass().isArray()) {
            return new JSONArray(var0);
         } else if (var0 instanceof Map) {
            Map var4 = (Map)var0;
            return new JSONObject(var4);
         } else {
            Package var1 = var0.getClass().getPackage();
            String var2 = var1 != null ? var1.getName() : "";
            return !var2.startsWith("java.") && !var2.startsWith("javax.") && var0.getClass().getClassLoader() != null ? new JSONObject(var0) : var0.toString();
         }
      } catch (Exception var3) {
         return null;
      }
   }

   public Writer write(Writer var1) {
      return this.write(var1, 0, 0);
   }

   static final Writer writeValue(Writer var0, Object var1, int var2, int var3) {
      if (var1 == null || var1.equals(null)) {
         var0.write("null");
      } else if (var1 instanceof JSONString) {
         String var4;
         try {
            var4 = ((JSONString)var1).toJSONString();
         } catch (Exception var7) {
            throw new JSONException(var7);
         }

         var0.write(var4 != null ? var4.toString() : quote(var1.toString()));
      } else if (var1 instanceof Number) {
         String var8 = numberToString((Number)var1);

         try {
            new BigDecimal(var8);
            var0.write(var8);
         } catch (NumberFormatException var6) {
            quote(var8, var0);
         }
      } else if (var1 instanceof Boolean) {
         var0.write(var1.toString());
      } else if (var1 instanceof Enum) {
         var0.write(quote(((Enum)var1).name()));
      } else if (var1 instanceof JSONObject) {
         ((JSONObject)var1).write(var0, var2, var3);
      } else if (var1 instanceof JSONArray) {
         ((JSONArray)var1).write(var0, var2, var3);
      } else if (var1 instanceof Map) {
         Map var9 = (Map)var1;
         new JSONObject(var9).write(var0, var2, var3);
      } else if (var1 instanceof Collection) {
         Collection var10 = (Collection)var1;
         new JSONArray(var10).write(var0, var2, var3);
      } else if (var1.getClass().isArray()) {
         new JSONArray(var1).write(var0, var2, var3);
      } else {
         quote(var1.toString(), var0);
      }

      return var0;
   }

   static final void indent(Writer var0, int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         var0.write(32);
      }
   }

   public Writer write(Writer var1, int var2, int var3) {
      try {
         boolean var4 = false;
         int var5 = this.length();
         var1.write(123);
         if (var5 == 1) {
            Entry var6 = this.entrySet().iterator().next();
            String var7 = (String)var6.getKey();
            var1.write(quote(var7));
            var1.write(58);
            if (var2 > 0) {
               var1.write(32);
            }

            try {
               writeValue(var1, var6.getValue(), var2, var3);
            } catch (Exception var12) {
               throw new JSONException("Unable to write JSONObject value for key: " + var7, var12);
            }
         } else if (var5 != 0) {
            int var14 = var3 + var2;

            for (Entry var8 : this.entrySet()) {
               if (var4) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               indent(var1, var14);
               String var9 = (String)var8.getKey();
               var1.write(quote(var9));
               var1.write(58);
               if (var2 > 0) {
                  var1.write(32);
               }

               try {
                  writeValue(var1, var8.getValue(), var2, var14);
               } catch (Exception var11) {
                  throw new JSONException("Unable to write JSONObject value for key: " + var9, var11);
               }

               var4 = true;
            }

            if (var2 > 0) {
               var1.write(10);
            }

            indent(var1, var3);
         }

         var1.write(125);
         return var1;
      } catch (IOException var13) {
         throw new JSONException(var13);
      }
   }

   public Map<String, Object> toMap() {
      HashMap var1 = new HashMap();

      for (Entry var3 : this.entrySet()) {
         Object var4;
         if (var3.getValue() == null || NULL.equals(var3.getValue())) {
            var4 = null;
         } else if (var3.getValue() instanceof JSONObject) {
            var4 = ((JSONObject)var3.getValue()).toMap();
         } else if (var3.getValue() instanceof JSONArray) {
            var4 = ((JSONArray)var3.getValue()).toList();
         } else {
            var4 = var3.getValue();
         }

         var1.put(var3.getKey(), var4);
      }

      return var1;
   }

   private static final class Null {
      private Null() {
      }

      @Override
      protected final Object clone() {
         return this;
      }

      @Override
      public boolean equals(Object var1) {
         return var1 == null || var1 == this;
      }

      @Override
      public int hashCode() {
         return 0;
      }

      @Override
      public String toString() {
         return "null";
      }
   }
}
