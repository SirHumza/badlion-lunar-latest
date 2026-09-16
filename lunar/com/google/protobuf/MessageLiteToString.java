package com.google.protobuf;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

final class MessageLiteToString {
   private static final String LIST_SUFFIX = "List";
   private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
   private static final String MAP_SUFFIX = "Map";
   private static final String BYTES_SUFFIX = "Bytes";
   private static final char[] INDENT_BUFFER = new char[80];

   private MessageLiteToString() {
   }

   static String toString(MessageLite var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("# ").append(var1);
      reflectivePrintWithIndent(var0, var2, 0);
      return var2.toString();
   }

   private static void reflectivePrintWithIndent(MessageLite var0, StringBuilder var1, int var2) {
      HashSet var3 = new HashSet();
      HashMap var4 = new HashMap();
      TreeMap var5 = new TreeMap();

      for (java.lang.reflect.Method var9 : var0.getClass().getDeclaredMethods()) {
         if (!Modifier.isStatic(var9.getModifiers()) && var9.getName().length() >= 3) {
            if (var9.getName().startsWith("set")) {
               var3.add(var9.getName());
            } else if (Modifier.isPublic(var9.getModifiers()) && var9.getParameterTypes().length == 0) {
               if (var9.getName().startsWith("has")) {
                  var4.put(var9.getName(), var9);
               } else if (var9.getName().startsWith("get")) {
                  var5.put(var9.getName(), var9);
               }
            }
         }
      }

      for (Entry var15 : var5.entrySet()) {
         String var17 = ((String)var15.getKey()).substring(3);
         if (var17.endsWith("List") && !var17.endsWith("OrBuilderList") && !var17.equals("List")) {
            java.lang.reflect.Method var18 = (java.lang.reflect.Method)var15.getValue();
            if (var18 != null && var18.getReturnType().equals(List.class)) {
               printField(var1, var2, var17.substring(0, var17.length() - "List".length()), GeneratedMessageLite.invokeOrDie(var18, var0));
               continue;
            }
         }

         if (var17.endsWith("Map") && !var17.equals("Map")) {
            java.lang.reflect.Method var19 = (java.lang.reflect.Method)var15.getValue();
            if (var19 != null
               && var19.getReturnType().equals(Map.class)
               && !var19.isAnnotationPresent(Deprecated.class)
               && Modifier.isPublic(var19.getModifiers())) {
               printField(var1, var2, var17.substring(0, var17.length() - "Map".length()), GeneratedMessageLite.invokeOrDie(var19, var0));
               continue;
            }
         }

         if (var3.contains("set" + var17) && (!var17.endsWith("Bytes") || !var5.containsKey("get" + var17.substring(0, var17.length() - "Bytes".length())))) {
            java.lang.reflect.Method var20 = (java.lang.reflect.Method)var15.getValue();
            java.lang.reflect.Method var10 = (java.lang.reflect.Method)var4.get("has" + var17);
            if (var20 != null) {
               Object var11 = GeneratedMessageLite.invokeOrDie(var20, var0);
               boolean var12 = var10 == null ? !isDefaultValue(var11) : (Boolean)GeneratedMessageLite.invokeOrDie(var10, var0);
               if (var12) {
                  printField(var1, var2, var17, var11);
               }
            }
         }
      }

      if (var0 instanceof GeneratedMessageLite.ExtendableMessage) {
         for (Entry var16 : ((GeneratedMessageLite.ExtendableMessage)var0).extensions) {
            printField(var1, var2, "[" + ((GeneratedMessageLite.ExtensionDescriptor)var16.getKey()).getNumber() + "]", var16.getValue());
         }
      }

      if (((GeneratedMessageLite)var0).unknownFields != null) {
         ((GeneratedMessageLite)var0).unknownFields.printWithIndent(var1, var2);
      }
   }

   private static boolean isDefaultValue(Object var0) {
      if (var0 instanceof Boolean) {
         return !(Boolean)var0;
      } else if (var0 instanceof Integer) {
         return (Integer)var0 == 0;
      } else if (var0 instanceof Float) {
         return Float.floatToRawIntBits((Float)var0) == 0;
      } else if (var0 instanceof Double) {
         return Double.doubleToRawLongBits((Double)var0) == 0L;
      } else if (var0 instanceof String) {
         return var0.equals("");
      } else if (var0 instanceof ByteString) {
         return var0.equals(ByteString.EMPTY);
      } else if (var0 instanceof MessageLite) {
         return var0 == ((MessageLite)var0).getDefaultInstanceForType();
      } else {
         return var0 instanceof java.lang.Enum ? ((java.lang.Enum)var0).ordinal() == 0 : false;
      }
   }

   static void printField(StringBuilder var0, int var1, String var2, Object var3) {
      if (var3 instanceof List) {
         for (Object var10 : (List)var3) {
            printField(var0, var1, var2, var10);
         }
      } else if (!(var3 instanceof Map)) {
         var0.append('\n');
         indent(var1, var0);
         var0.append(pascalCaseToSnakeCase(var2));
         if (var3 instanceof String) {
            var0.append(": \"").append(TextFormatEscaper.escapeText((String)var3)).append('"');
         } else if (var3 instanceof ByteString) {
            var0.append(": \"").append(TextFormatEscaper.escapeBytes((ByteString)var3)).append('"');
         } else if (var3 instanceof GeneratedMessageLite) {
            var0.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite)var3, var0, var1 + 2);
            var0.append("\n");
            indent(var1, var0);
            var0.append("}");
         } else if (var3 instanceof Entry) {
            var0.append(" {");
            Entry var7 = (Entry)var3;
            printField(var0, var1 + 2, "key", var7.getKey());
            printField(var0, var1 + 2, "value", var7.getValue());
            var0.append("\n");
            indent(var1, var0);
            var0.append("}");
         } else {
            var0.append(": ").append(var3);
         }
      } else {
         Map var4 = (Map)var3;

         for (Entry var6 : var4.entrySet()) {
            printField(var0, var1, var2, var6);
         }
      }
   }

   private static void indent(int var0, StringBuilder var1) {
      while (var0 > 0) {
         int var2 = var0;
         if (var2 > INDENT_BUFFER.length) {
            var2 = INDENT_BUFFER.length;
         }

         var1.append(INDENT_BUFFER, 0, var2);
         var0 -= var2;
      }
   }

   private static String pascalCaseToSnakeCase(String var0) {
      if (var0.isEmpty()) {
         return var0;
      }

      StringBuilder var1 = new StringBuilder();
      var1.append(Character.toLowerCase(var0.charAt(0)));

      for (int var2 = 1; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (Character.isUpperCase(var3)) {
            var1.append("_");
         }

         var1.append(Character.toLowerCase(var3));
      }

      return var1.toString();
   }

   static {
      Arrays.fill(INDENT_BUFFER, ' ');
   }
}
