package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class SimpleConfigOrigin implements ConfigOrigin {
   private final String description;
   private final int lineNumber;
   private final int endLineNumber;
   private final OriginType originType;
   private final String urlOrNull;
   private final String resourceOrNull;
   private final List<String> commentsOrNull;
   static final String MERGE_OF_PREFIX = "merge of ";

   protected SimpleConfigOrigin(String var1, int var2, int var3, OriginType var4, String var5, String var6, List<String> var7) {
      if (var1 == null) {
         throw new ConfigException.BugOrBroken("description may not be null");
      }

      this.description = var1;
      this.lineNumber = var2;
      this.endLineNumber = var3;
      this.originType = var4;
      this.urlOrNull = var5;
      this.resourceOrNull = var6;
      this.commentsOrNull = var7;
   }

   static SimpleConfigOrigin newSimple(String var0) {
      return new SimpleConfigOrigin(var0, -1, -1, OriginType.GENERIC, null, null, null);
   }

   static SimpleConfigOrigin newFile(String var0) {
      String var1;
      try {
         var1 = new File(var0).toURI().toURL().toExternalForm();
      } catch (MalformedURLException var3) {
         var1 = null;
      }

      return new SimpleConfigOrigin(var0, -1, -1, OriginType.FILE, var1, null, null);
   }

   static SimpleConfigOrigin newURL(URL var0) {
      String var1 = var0.toExternalForm();
      return new SimpleConfigOrigin(var1, -1, -1, OriginType.URL, var1, null, null);
   }

   static SimpleConfigOrigin newResource(String var0, URL var1) {
      String var2;
      if (var1 != null) {
         var2 = var0 + " @ " + var1.toExternalForm();
      } else {
         var2 = var0;
      }

      return new SimpleConfigOrigin(var2, -1, -1, OriginType.RESOURCE, var1 != null ? var1.toExternalForm() : null, var0, null);
   }

   static SimpleConfigOrigin newResource(String var0) {
      return newResource(var0, null);
   }

   public SimpleConfigOrigin withLineNumber(int var1) {
      return var1 == this.lineNumber && var1 == this.endLineNumber
         ? this
         : new SimpleConfigOrigin(this.description, var1, var1, this.originType, this.urlOrNull, this.resourceOrNull, this.commentsOrNull);
   }

   SimpleConfigOrigin addURL(URL var1) {
      return new SimpleConfigOrigin(
         this.description,
         this.lineNumber,
         this.endLineNumber,
         this.originType,
         var1 != null ? var1.toExternalForm() : null,
         this.resourceOrNull,
         this.commentsOrNull
      );
   }

   public SimpleConfigOrigin withComments(List<String> var1) {
      return ConfigImplUtil.equalsHandlingNull(var1, this.commentsOrNull)
         ? this
         : new SimpleConfigOrigin(this.description, this.lineNumber, this.endLineNumber, this.originType, this.urlOrNull, this.resourceOrNull, var1);
   }

   SimpleConfigOrigin prependComments(List<String> var1) {
      if (ConfigImplUtil.equalsHandlingNull(var1, this.commentsOrNull) || var1 == null) {
         return this;
      }

      if (this.commentsOrNull == null) {
         return this.withComments(var1);
      }

      ArrayList var2 = new ArrayList(var1.size() + this.commentsOrNull.size());
      var2.addAll(var1);
      var2.addAll(this.commentsOrNull);
      return this.withComments(var2);
   }

   SimpleConfigOrigin appendComments(List<String> var1) {
      if (ConfigImplUtil.equalsHandlingNull(var1, this.commentsOrNull) || var1 == null) {
         return this;
      }

      if (this.commentsOrNull == null) {
         return this.withComments(var1);
      }

      ArrayList var2 = new ArrayList(var1.size() + this.commentsOrNull.size());
      var2.addAll(this.commentsOrNull);
      var2.addAll(var1);
      return this.withComments(var2);
   }

   @Override
   public String description() {
      if (this.lineNumber < 0) {
         return this.description;
      } else {
         return this.endLineNumber == this.lineNumber
            ? this.description + ": " + this.lineNumber
            : this.description + ": " + this.lineNumber + "-" + this.endLineNumber;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof SimpleConfigOrigin)) {
         return false;
      }

      SimpleConfigOrigin var2 = (SimpleConfigOrigin)var1;
      return this.description.equals(var2.description)
         && this.lineNumber == var2.lineNumber
         && this.endLineNumber == var2.endLineNumber
         && this.originType == var2.originType
         && ConfigImplUtil.equalsHandlingNull(this.urlOrNull, var2.urlOrNull)
         && ConfigImplUtil.equalsHandlingNull(this.resourceOrNull, var2.resourceOrNull);
   }

   @Override
   public int hashCode() {
      int var1 = 41 * (41 + this.description.hashCode());
      var1 = 41 * (var1 + this.lineNumber);
      var1 = 41 * (var1 + this.endLineNumber);
      var1 = 41 * (var1 + this.originType.hashCode());
      if (this.urlOrNull != null) {
         var1 = 41 * (var1 + this.urlOrNull.hashCode());
      }

      if (this.resourceOrNull != null) {
         var1 = 41 * (var1 + this.resourceOrNull.hashCode());
      }

      return var1;
   }

   @Override
   public String toString() {
      return "ConfigOrigin(" + this.description + ")";
   }

   @Override
   public String filename() {
      if (this.originType == OriginType.FILE) {
         return this.description;
      }

      if (this.urlOrNull != null) {
         URL var1;
         try {
            var1 = new URL(this.urlOrNull);
         } catch (MalformedURLException var3) {
            return null;
         }

         return var1.getProtocol().equals("file") ? var1.getFile() : null;
      } else {
         return null;
      }
   }

   @Override
   public URL url() {
      if (this.urlOrNull == null) {
         return null;
      }

      try {
         return new URL(this.urlOrNull);
      } catch (MalformedURLException var2) {
         return null;
      }
   }

   @Override
   public String resource() {
      return this.resourceOrNull;
   }

   @Override
   public int lineNumber() {
      return this.lineNumber;
   }

   @Override
   public List<String> comments() {
      return this.commentsOrNull != null ? Collections.unmodifiableList(this.commentsOrNull) : Collections.emptyList();
   }

   private static SimpleConfigOrigin mergeTwo(SimpleConfigOrigin var0, SimpleConfigOrigin var1) {
      OriginType var6;
      if (var0.originType == var1.originType) {
         var6 = var0.originType;
      } else {
         var6 = OriginType.GENERIC;
      }

      String var7 = var0.description;
      String var8 = var1.description;
      if (var7.startsWith("merge of ")) {
         var7 = var7.substring("merge of ".length());
      }

      if (var8.startsWith("merge of ")) {
         var8 = var8.substring("merge of ".length());
      }

      String var2;
      int var3;
      int var4;
      if (var7.equals(var8)) {
         var2 = var7;
         if (var0.lineNumber < 0) {
            var3 = var1.lineNumber;
         } else if (var1.lineNumber < 0) {
            var3 = var0.lineNumber;
         } else {
            var3 = Math.min(var0.lineNumber, var1.lineNumber);
         }

         var4 = Math.max(var0.endLineNumber, var1.endLineNumber);
      } else {
         String var9 = var0.description();
         String var10 = var1.description();
         if (var9.startsWith("merge of ")) {
            var9 = var9.substring("merge of ".length());
         }

         if (var10.startsWith("merge of ")) {
            var10 = var10.substring("merge of ".length());
         }

         var2 = "merge of " + var9 + "," + var10;
         var3 = -1;
         var4 = -1;
      }

      String var11;
      if (ConfigImplUtil.equalsHandlingNull(var0.urlOrNull, var1.urlOrNull)) {
         var11 = var0.urlOrNull;
      } else {
         var11 = null;
      }

      String var12;
      if (ConfigImplUtil.equalsHandlingNull(var0.resourceOrNull, var1.resourceOrNull)) {
         var12 = var0.resourceOrNull;
      } else {
         var12 = null;
      }

      List var5;
      if (ConfigImplUtil.equalsHandlingNull(var0.commentsOrNull, var1.commentsOrNull)) {
         var5 = var0.commentsOrNull;
      } else {
         var5 = new ArrayList();
         if (var0.commentsOrNull != null) {
            var5.addAll(var0.commentsOrNull);
         }

         if (var1.commentsOrNull != null) {
            var5.addAll(var1.commentsOrNull);
         }
      }

      return new SimpleConfigOrigin(var2, var3, var4, var6, var11, var12, var5);
   }

   private static int similarity(SimpleConfigOrigin var0, SimpleConfigOrigin var1) {
      int var2 = 0;
      if (var0.originType == var1.originType) {
         var2++;
      }

      if (var0.description.equals(var1.description)) {
         var2++;
         if (var0.lineNumber == var1.lineNumber) {
            var2++;
         }

         if (var0.endLineNumber == var1.endLineNumber) {
            var2++;
         }

         if (ConfigImplUtil.equalsHandlingNull(var0.urlOrNull, var1.urlOrNull)) {
            var2++;
         }

         if (ConfigImplUtil.equalsHandlingNull(var0.resourceOrNull, var1.resourceOrNull)) {
            var2++;
         }
      }

      return var2;
   }

   private static SimpleConfigOrigin mergeThree(SimpleConfigOrigin var0, SimpleConfigOrigin var1, SimpleConfigOrigin var2) {
      return similarity(var0, var1) >= similarity(var1, var2) ? mergeTwo(mergeTwo(var0, var1), var2) : mergeTwo(var0, mergeTwo(var1, var2));
   }

   static ConfigOrigin mergeOrigins(ConfigOrigin var0, ConfigOrigin var1) {
      return mergeTwo((SimpleConfigOrigin)var0, (SimpleConfigOrigin)var1);
   }

   static ConfigOrigin mergeOrigins(List<? extends AbstractConfigValue> var0) {
      ArrayList var1 = new ArrayList(var0.size());

      for (AbstractConfigValue var3 : var0) {
         var1.add(var3.origin());
      }

      return mergeOrigins(var1);
   }

   static ConfigOrigin mergeOrigins(Collection<? extends ConfigOrigin> var0) {
      if (var0.isEmpty()) {
         throw new ConfigException.BugOrBroken("can't merge empty list of origins");
      }

      if (var0.size() == 1) {
         return (ConfigOrigin)var0.iterator().next();
      }

      if (var0.size() == 2) {
         Iterator var6 = var0.iterator();
         return mergeTwo((SimpleConfigOrigin)var6.next(), (SimpleConfigOrigin)var6.next());
      }

      ArrayList var1 = new ArrayList(var0.size());

      for (ConfigOrigin var3 : var0) {
         var1.add((SimpleConfigOrigin)var3);
      }

      while (var1.size() > 2) {
         SimpleConfigOrigin var7 = (SimpleConfigOrigin)var1.get(var1.size() - 1);
         var1.remove(var1.size() - 1);
         SimpleConfigOrigin var8 = (SimpleConfigOrigin)var1.get(var1.size() - 1);
         var1.remove(var1.size() - 1);
         SimpleConfigOrigin var4 = (SimpleConfigOrigin)var1.get(var1.size() - 1);
         var1.remove(var1.size() - 1);
         SimpleConfigOrigin var5 = mergeThree(var4, var8, var7);
         var1.add(var5);
      }

      return mergeOrigins(var1);
   }

   Map<SerializedConfigValue.SerializedField, Object> toFields() {
      EnumMap var1 = new EnumMap<>(SerializedConfigValue.SerializedField.class);
      var1.put(SerializedConfigValue.SerializedField.ORIGIN_DESCRIPTION, this.description);
      if (this.lineNumber >= 0) {
         var1.put(SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER, this.lineNumber);
      }

      if (this.endLineNumber >= 0) {
         var1.put(SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER, this.endLineNumber);
      }

      var1.put(SerializedConfigValue.SerializedField.ORIGIN_TYPE, this.originType.ordinal());
      if (this.urlOrNull != null) {
         var1.put(SerializedConfigValue.SerializedField.ORIGIN_URL, this.urlOrNull);
      }

      if (this.resourceOrNull != null) {
         var1.put(SerializedConfigValue.SerializedField.ORIGIN_RESOURCE, this.resourceOrNull);
      }

      if (this.commentsOrNull != null) {
         var1.put(SerializedConfigValue.SerializedField.ORIGIN_COMMENTS, this.commentsOrNull);
      }

      return var1;
   }

   Map<SerializedConfigValue.SerializedField, Object> toFieldsDelta(SimpleConfigOrigin var1) {
      Map var2;
      if (var1 != null) {
         var2 = var1.toFields();
      } else {
         var2 = Collections.emptyMap();
      }

      return fieldsDelta(var2, this.toFields());
   }

   static Map<SerializedConfigValue.SerializedField, Object> fieldsDelta(
      Map<SerializedConfigValue.SerializedField, Object> var0, Map<SerializedConfigValue.SerializedField, Object> var1
   ) {
      EnumMap var2 = new EnumMap(var1);

      for (Entry var4 : var0.entrySet()) {
         SerializedConfigValue.SerializedField var5 = (SerializedConfigValue.SerializedField)var4.getKey();
         if (var2.containsKey(var5) && ConfigImplUtil.equalsHandlingNull(var4.getValue(), var2.get(var5))) {
            var2.remove(var5);
         } else if (!var2.containsKey(var5)) {
            switch (var5) {
               case ORIGIN_DESCRIPTION:
                  throw new ConfigException.BugOrBroken("origin missing description field? " + var1);
               case ORIGIN_LINE_NUMBER:
                  var2.put(SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER, -1);
                  break;
               case ORIGIN_END_LINE_NUMBER:
                  var2.put(SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER, -1);
                  break;
               case ORIGIN_TYPE:
                  throw new ConfigException.BugOrBroken("should always be an ORIGIN_TYPE field");
               case ORIGIN_URL:
                  var2.put(SerializedConfigValue.SerializedField.ORIGIN_NULL_URL, "");
                  break;
               case ORIGIN_RESOURCE:
                  var2.put(SerializedConfigValue.SerializedField.ORIGIN_NULL_RESOURCE, "");
                  break;
               case ORIGIN_COMMENTS:
                  var2.put(SerializedConfigValue.SerializedField.ORIGIN_NULL_COMMENTS, "");
                  break;
               case ORIGIN_NULL_URL:
               case ORIGIN_NULL_RESOURCE:
               case ORIGIN_NULL_COMMENTS:
                  throw new ConfigException.BugOrBroken("computing delta, base object should not contain " + var5 + " " + var0);
               case END_MARKER:
               case ROOT_VALUE:
               case ROOT_WAS_CONFIG:
               case UNKNOWN:
               case VALUE_DATA:
               case VALUE_ORIGIN:
                  throw new ConfigException.BugOrBroken("should not appear here: " + var5);
            }
         }
      }

      return var2;
   }

   static SimpleConfigOrigin fromFields(Map<SerializedConfigValue.SerializedField, Object> var0) {
      if (var0.isEmpty()) {
         return null;
      }

      String var1 = (String)var0.get(SerializedConfigValue.SerializedField.ORIGIN_DESCRIPTION);
      Integer var2 = (Integer)var0.get(SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER);
      Integer var3 = (Integer)var0.get(SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER);
      Number var4 = (Number)var0.get(SerializedConfigValue.SerializedField.ORIGIN_TYPE);
      if (var4 == null) {
         throw new IOException("Missing ORIGIN_TYPE field");
      }

      OriginType var5 = OriginType.values()[var4.byteValue()];
      String var6 = (String)var0.get(SerializedConfigValue.SerializedField.ORIGIN_URL);
      String var7 = (String)var0.get(SerializedConfigValue.SerializedField.ORIGIN_RESOURCE);
      List var8 = (List)var0.get(SerializedConfigValue.SerializedField.ORIGIN_COMMENTS);
      if (var5 == OriginType.RESOURCE && var7 == null) {
         var7 = var1;
      }

      return new SimpleConfigOrigin(var1, var2 != null ? var2 : -1, var3 != null ? var3 : -1, var5, var6, var7, var8);
   }

   static Map<SerializedConfigValue.SerializedField, Object> applyFieldsDelta(
      Map<SerializedConfigValue.SerializedField, Object> var0, Map<SerializedConfigValue.SerializedField, Object> var1
   ) {
      EnumMap var2 = new EnumMap(var1);

      for (Entry var4 : var0.entrySet()) {
         SerializedConfigValue.SerializedField var5 = (SerializedConfigValue.SerializedField)var4.getKey();
         if (!var1.containsKey(var5)) {
            switch (var5) {
               case ORIGIN_DESCRIPTION:
                  var2.put(var5, var0.get(var5));
                  break;
               case ORIGIN_LINE_NUMBER:
               case ORIGIN_END_LINE_NUMBER:
               case ORIGIN_TYPE:
                  var2.put(var5, var0.get(var5));
                  break;
               case ORIGIN_URL:
                  if (var1.containsKey(SerializedConfigValue.SerializedField.ORIGIN_NULL_URL)) {
                     var2.remove(SerializedConfigValue.SerializedField.ORIGIN_NULL_URL);
                  } else {
                     var2.put(var5, var0.get(var5));
                  }
                  break;
               case ORIGIN_RESOURCE:
                  if (var1.containsKey(SerializedConfigValue.SerializedField.ORIGIN_NULL_RESOURCE)) {
                     var2.remove(SerializedConfigValue.SerializedField.ORIGIN_NULL_RESOURCE);
                  } else {
                     var2.put(var5, var0.get(var5));
                  }
                  break;
               case ORIGIN_COMMENTS:
                  if (var1.containsKey(SerializedConfigValue.SerializedField.ORIGIN_NULL_COMMENTS)) {
                     var2.remove(SerializedConfigValue.SerializedField.ORIGIN_NULL_COMMENTS);
                  } else {
                     var2.put(var5, var0.get(var5));
                  }
                  break;
               case ORIGIN_NULL_URL:
               case ORIGIN_NULL_RESOURCE:
               case ORIGIN_NULL_COMMENTS:
                  throw new ConfigException.BugOrBroken("applying fields, base object should not contain " + var5 + " " + var0);
               case END_MARKER:
               case ROOT_VALUE:
               case ROOT_WAS_CONFIG:
               case UNKNOWN:
               case VALUE_DATA:
               case VALUE_ORIGIN:
                  throw new ConfigException.BugOrBroken("should not appear here: " + var5);
            }
         }
      }

      return var2;
   }

   static SimpleConfigOrigin fromBase(SimpleConfigOrigin var0, Map<SerializedConfigValue.SerializedField, Object> var1) {
      Map var2;
      if (var0 != null) {
         var2 = var0.toFields();
      } else {
         var2 = Collections.emptyMap();
      }

      Map var3 = applyFieldsDelta(var2, var1);
      return fromFields(var3);
   }
}
