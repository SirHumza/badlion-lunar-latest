package com.mxgraph.io;

import com.mxgraph.util.mxUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class mxObjectCodec {
   private static final Logger log = Logger.getLogger(mxObjectCodec.class.getName());
   private static Set<String> EMPTY_SET = new HashSet<>();
   protected Object template;
   protected Set<String> exclude;
   protected Set<String> idrefs;
   protected Map<String, String> mapping;
   protected Map<String, String> reverse;
   protected Map<String, Method> accessors;
   protected Map<Class, Map<String, Field>> fields;

   public mxObjectCodec(Object var1) {
      this(var1, null, null, null);
   }

   public mxObjectCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4) {
      this.template = var1;
      if (var2 != null) {
         this.exclude = new HashSet<>();

         for (int var5 = 0; var5 < var2.length; var5++) {
            this.exclude.add(var2[var5]);
         }
      } else {
         this.exclude = EMPTY_SET;
      }

      if (var3 != null) {
         this.idrefs = new HashSet<>();

         for (int var7 = 0; var7 < var3.length; var7++) {
            this.idrefs.add(var3[var7]);
         }
      } else {
         this.idrefs = EMPTY_SET;
      }

      if (var4 == null) {
         var4 = new Hashtable();
      }

      this.mapping = var4;
      this.reverse = new Hashtable<>();

      for (Entry var6 : var4.entrySet()) {
         this.reverse.put((String)var6.getValue(), (String)var6.getKey());
      }
   }

   public String getName() {
      return mxCodecRegistry.getName(this.getTemplate());
   }

   public Object getTemplate() {
      return this.template;
   }

   protected Object cloneTemplate(Node var1) {
      Object var2 = null;

      try {
         if (this.template.getClass().isEnum()) {
            var2 = this.template.getClass().getEnumConstants()[0];
         } else {
            var2 = this.template.getClass().newInstance();
         }

         if (var2 instanceof Collection) {
            var1 = var1.getFirstChild();

            while (var1 != null && !(var1 instanceof Element)) {
               var1 = var1.getNextSibling();
            }

            if (var1 != null && var1 instanceof Element && ((Element)var1).hasAttribute("as")) {
               var2 = new Hashtable();
            }
         }
      } catch (InstantiationException var4) {
         log.log(Level.FINEST, "Failed to clone the template", var4);
      } catch (IllegalAccessException var5) {
         log.log(Level.FINEST, "Failed to clone the template", var5);
      }

      return var2;
   }

   public boolean isExcluded(Object var1, String var2, Object var3, boolean var4) {
      return this.exclude.contains(var2);
   }

   public boolean isReference(Object var1, String var2, Object var3, boolean var4) {
      return this.idrefs.contains(var2);
   }

   public Node encode(mxCodec var1, Object var2) {
      Element var3 = var1.document.createElement(this.getName());
      var2 = this.beforeEncode(var1, var2, var3);
      this.encodeObject(var1, var2, var3);
      return this.afterEncode(var1, var2, var3);
   }

   protected void encodeObject(mxCodec var1, Object var2, Node var3) {
      mxCodec.setAttribute(var3, "id", var1.getId(var2));
      this.encodeFields(var1, var2, var3);
      this.encodeElements(var1, var2, var3);
   }

   protected void encodeFields(mxCodec var1, Object var2, Node var3) {
      for (Class var4 = var2.getClass(); var4 != null; var4 = var4.getSuperclass()) {
         Field[] var5 = var4.getDeclaredFields();

         for (int var6 = 0; var6 < var5.length; var6++) {
            Field var7 = var5[var6];
            if ((var7.getModifiers() & 128) != 128) {
               String var8 = var7.getName();
               Object var9 = this.getFieldValue(var2, var8);
               this.encodeValue(var1, var2, var8, var9, var3);
            }
         }
      }
   }

   protected void encodeElements(mxCodec var1, Object var2, Node var3) {
      if (var2.getClass().isArray()) {
         Object[] var4 = (Object[])var2;

         for (int var5 = 0; var5 < var4.length; var5++) {
            this.encodeValue(var1, var2, null, var4[var5], var3);
         }
      } else if (var2 instanceof Map) {
         for (Entry var8 : ((Map)var2).entrySet()) {
            this.encodeValue(var1, var2, String.valueOf(var8.getKey()), var8.getValue(), var3);
         }
      } else if (var2 instanceof Collection) {
         for (Object var9 : (Collection)var2) {
            this.encodeValue(var1, var2, null, var9, var3);
         }
      }
   }

   protected void encodeValue(mxCodec var1, Object var2, String var3, Object var4, Node var5) {
      if (var4 != null && !this.isExcluded(var2, var3, var4, true)) {
         if (this.isReference(var2, var3, var4, true)) {
            String var6 = var1.getId(var4);
            if (var6 == null) {
               log.log(Level.FINEST, "mxObjectCodec.encode: No ID for " + this.getName() + "." + var3 + "=" + var4);
               return;
            }

            var4 = var6;
         }

         Object var7 = this.getFieldValue(this.template, var3);
         if (var3 == null || var1.isEncodeDefaults() || var7 == null || !var7.equals(var4)) {
            this.writeAttribute(var1, var2, this.getAttributeName(var3), var4, var5);
         }
      }
   }

   protected boolean isPrimitiveValue(Object var1) {
      return var1 instanceof String
         || var1 instanceof Boolean
         || var1 instanceof Character
         || var1 instanceof Byte
         || var1 instanceof Short
         || var1 instanceof Integer
         || var1 instanceof Long
         || var1 instanceof Float
         || var1 instanceof Double
         || var1.getClass().isPrimitive();
   }

   protected void writeAttribute(mxCodec var1, Object var2, String var3, Object var4, Node var5) {
      var4 = this.convertValueToXml(var4);
      if (this.isPrimitiveValue(var4)) {
         this.writePrimitiveAttribute(var1, var2, var3, var4, var5);
      } else {
         this.writeComplexAttribute(var1, var2, var3, var4, var5);
      }
   }

   protected void writePrimitiveAttribute(mxCodec var1, Object var2, String var3, Object var4, Node var5) {
      if (var3 != null && !(var2 instanceof Map)) {
         mxCodec.setAttribute(var5, var3, var4);
      } else {
         Element var6 = var1.document.createElement("add");
         if (var3 != null) {
            mxCodec.setAttribute(var6, "as", var3);
         }

         mxCodec.setAttribute(var6, "value", var4);
         var5.appendChild(var6);
      }
   }

   protected void writeComplexAttribute(mxCodec var1, Object var2, String var3, Object var4, Node var5) {
      Node var6 = var1.encode(var4);
      if (var6 != null) {
         if (var3 != null) {
            mxCodec.setAttribute(var6, "as", var3);
         }

         var5.appendChild(var6);
      } else {
         log.log(Level.FINEST, "mxObjectCodec.encode: No node for " + this.getName() + "." + var3 + ": " + var4);
      }
   }

   protected Object convertValueToXml(Object var1) {
      if (var1 instanceof Boolean) {
         var1 = (Boolean)var1 ? "1" : "0";
      }

      return var1;
   }

   protected Object convertValueFromXml(Class<?> var1, Object var2) {
      if (var2 instanceof String) {
         String var3 = (String)var2;
         if (!var1.equals(boolean.class) && var1 != Boolean.class) {
            if (var1.equals(char.class) || var1 == Character.class) {
               var2 = var3.charAt(0);
            } else if (var1.equals(byte.class) || var1 == Byte.class) {
               var2 = Byte.valueOf(var3);
            } else if (var1.equals(short.class) || var1 == Short.class) {
               var2 = Short.valueOf(var3);
            } else if (var1.equals(int.class) || var1 == Integer.class) {
               var2 = Integer.valueOf(var3);
            } else if (var1.equals(long.class) || var1 == Long.class) {
               var2 = Long.valueOf(var3);
            } else if (var1.equals(float.class) || var1 == Float.class) {
               var2 = Float.valueOf(var3);
            } else if (var1.equals(double.class) || var1 == Double.class) {
               var2 = Double.valueOf(var3);
            }
         } else {
            if (var3.equals("1") || var3.equals("0")) {
               var3 = var3.equals("1") ? "true" : "false";
            }

            var2 = Boolean.valueOf(var3);
         }
      }

      return var2;
   }

   protected String getAttributeName(String var1) {
      if (var1 != null) {
         Object var2 = this.mapping.get(var1);
         if (var2 != null) {
            var1 = var2.toString();
         }
      }

      return var1;
   }

   protected String getFieldName(String var1) {
      if (var1 != null) {
         Object var2 = this.reverse.get(var1);
         if (var2 != null) {
            var1 = var2.toString();
         }
      }

      return var1;
   }

   protected Field getField(Object var1, String var2) {
      Class var3 = var1.getClass();
      if (this.fields == null) {
         this.fields = new HashMap<>();
      }

      Map var4 = this.fields.get(var3);
      if (var4 == null) {
         var4 = new HashMap();
         this.fields.put(var3, var4);
      }

      Field var5 = (Field)var4.get(var2);
      if (var5 != null) {
         return var5;
      }

      for (; var3 != null; var3 = var3.getSuperclass()) {
         try {
            var5 = var3.getDeclaredField(var2);
            if (var5 != null) {
               var4.put(var2, var5);
               return var5;
            }
         } catch (Exception var7) {
            log.log(Level.FINEST, "Failed to get field " + var2 + " in class " + var3, var7);
         }
      }

      log.log(Level.FINEST, "Field " + var2 + " not found in " + var1);
      return null;
   }

   protected Method getAccessor(Object var1, Field var2, boolean var3) {
      String var4 = var2.getName();
      var4 = var4.substring(0, 1).toUpperCase() + var4.substring(1);
      if (!var3) {
         var4 = "set" + var4;
      } else if (boolean.class.isAssignableFrom(var2.getType())) {
         var4 = "is" + var4;
      } else {
         var4 = "get" + var4;
      }

      Method var5 = this.accessors != null ? this.accessors.get(var4) : null;
      if (var5 == null) {
         try {
            if (var3) {
               var5 = this.getMethod(var1, var4, null);
            } else {
               var5 = this.getMethod(var1, var4, new Class[]{var2.getType()});
            }
         } catch (Exception var7) {
            log.log(Level.FINEST, "Failed to get method " + var4 + " from " + var1, var7);
         }

         if (var5 != null) {
            if (this.accessors == null) {
               this.accessors = new Hashtable<>();
            }

            this.accessors.put(var4, var5);
         }
      }

      if (var5 == null && log.isLoggable(Level.FINER)) {
         log.finer("Failed to find accessor for " + var2 + " in " + var1);
      }

      return var5;
   }

   protected Method getMethod(Object var1, String var2, Class[] var3) {
      for (Class var4 = var1.getClass(); var4 != null; var4 = var4.getSuperclass()) {
         try {
            Method var5 = var4.getDeclaredMethod(var2, var3);
            if (var5 != null) {
               return var5;
            }
         } catch (Exception var6) {
            log.log(Level.FINEST, "Failed to get method " + var2 + " in class " + var4, var6);
         }
      }

      return null;
   }

   protected Object getFieldValue(Object var1, String var2) {
      Object var3 = null;
      if (var1 != null && var2 != null) {
         Field var4 = this.getField(var1, var2);

         try {
            if (var4 != null) {
               if (Modifier.isPublic(var4.getModifiers())) {
                  var3 = var4.get(var1);
               } else {
                  var3 = this.getFieldValueWithAccessor(var1, var4);
               }
            }
         } catch (IllegalAccessException var6) {
            var3 = this.getFieldValueWithAccessor(var1, var4);
         } catch (Exception var7) {
            log.log(Level.FINEST, "Failed to get value from field " + var2 + " in " + var1, var7);
         }
      }

      return var3;
   }

   protected Object getFieldValueWithAccessor(Object var1, Field var2) {
      Object var3 = null;
      if (var2 != null) {
         try {
            Method var4 = this.getAccessor(var1, var2, true);
            if (var4 != null) {
               var3 = var4.invoke(var1, (Object[])null);
            }
         } catch (Exception var5) {
            log.log(Level.FINEST, "Failed to get value from field " + var2 + " in " + var1, var5);
         }
      }

      return var3;
   }

   protected void setFieldValue(Object var1, String var2, Object var3) {
      Field var4 = null;

      try {
         var4 = this.getField(var1, var2);
         if (var4 != null) {
            if (var4.getType() == Boolean.class) {
               var3 = !var3.equals("1") && !String.valueOf(var3).equalsIgnoreCase("true") ? Boolean.FALSE : Boolean.TRUE;
            }

            if (Modifier.isPublic(var4.getModifiers())) {
               var4.set(var1, var3);
            } else {
               this.setFieldValueWithAccessor(var1, var4, var3);
            }
         }
      } catch (IllegalAccessException var6) {
         this.setFieldValueWithAccessor(var1, var4, var3);
      } catch (Exception var7) {
         log.log(Level.FINEST, "Failed to set value \"" + var3 + "\" to field " + var2 + " in " + var1, var7);
      }
   }

   protected void setFieldValueWithAccessor(Object var1, Field var2, Object var3) {
      if (var2 != null) {
         try {
            Method var4 = this.getAccessor(var1, var2, false);
            if (var4 != null) {
               Class var5 = var4.getParameterTypes()[0];
               var3 = this.convertValueFromXml(var5, var3);
               if (var5.isArray() && var3 instanceof Collection) {
                  Collection var6 = (Collection)var3;
                  var3 = var6.toArray((Object[])Array.newInstance(var5.getComponentType(), var6.size()));
               }

               var4.invoke(var1, var3);
            }
         } catch (Exception var7) {
            log.log(
               Level.FINEST,
               "setFieldValue: "
                  + var7
                  + " on "
                  + var1.getClass().getSimpleName()
                  + "."
                  + var2.getName()
                  + " ("
                  + var2.getType().getSimpleName()
                  + ") = "
                  + var3
                  + " ("
                  + var3.getClass().getSimpleName()
                  + ")",
               var7
            );
         }
      }
   }

   public Object beforeEncode(mxCodec var1, Object var2, Node var3) {
      return var2;
   }

   public Node afterEncode(mxCodec var1, Object var2, Node var3) {
      return var3;
   }

   public Object decode(mxCodec var1, Node var2) {
      return this.decode(var1, var2, null);
   }

   public Object decode(mxCodec var1, Node var2, Object var3) {
      Object var4 = null;
      if (var2 instanceof Element) {
         String var5 = ((Element)var2).getAttribute("id");
         var4 = var1.objects.get(var5);
         if (var4 == null) {
            var4 = var3;
            if (var4 == null) {
               var4 = this.cloneTemplate(var2);
            }

            if (var5 != null && var5.length() > 0) {
               var1.putObject(var5, var4);
            }
         }

         var2 = this.beforeDecode(var1, var2, var4);
         this.decodeNode(var1, var2, var4);
         var4 = this.afterDecode(var1, var2, var4);
      }

      return var4;
   }

   protected void decodeNode(mxCodec var1, Node var2, Object var3) {
      if (var2 != null) {
         this.decodeAttributes(var1, var2, var3);
         this.decodeChildren(var1, var2, var3);
      }
   }

   protected void decodeAttributes(mxCodec var1, Node var2, Object var3) {
      NamedNodeMap var4 = var2.getAttributes();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.getLength(); var5++) {
            Node var6 = var4.item(var5);
            this.decodeAttribute(var1, var6, var3);
         }
      }
   }

   protected void decodeAttribute(mxCodec var1, Node var2, Object var3) {
      String var4 = var2.getNodeName();
      if (!var4.equalsIgnoreCase("as") && !var4.equalsIgnoreCase("id")) {
         Object var5 = var2.getNodeValue();
         String var6 = this.getFieldName(var4);
         if (this.isReference(var3, var6, var5, false)) {
            Object var7 = var1.getObject(String.valueOf(var5));
            if (var7 == null) {
               log.log(Level.FINEST, "mxObjectCodec.decode: No object for " + this.getName() + "." + var6 + "=" + var5);
               return;
            }

            var5 = var7;
         }

         if (!this.isExcluded(var3, var6, var5, false)) {
            this.setFieldValue(var3, var6, var5);
         }
      }
   }

   protected void decodeChildren(mxCodec var1, Node var2, Object var3) {
      for (Node var4 = var2.getFirstChild(); var4 != null; var4 = var4.getNextSibling()) {
         if (var4.getNodeType() == 1 && !this.processInclude(var1, var4, var3)) {
            this.decodeChild(var1, var4, var3);
         }
      }
   }

   protected void decodeChild(mxCodec var1, Node var2, Object var3) {
      String var4 = this.getFieldName(((Element)var2).getAttribute("as"));
      if (var4 == null || !this.isExcluded(var3, var4, var2, false)) {
         Object var5 = this.getFieldTemplate(var3, var4, var2);
         Object var6 = null;
         if (var2.getNodeName().equals("add")) {
            var6 = ((Element)var2).getAttribute("value");
            if (var6 == null) {
               var6 = var2.getTextContent();
            }
         } else {
            var6 = var1.decode(var2, var5);
         }

         this.addObjectValue(var3, var4, var6, var5);
      }
   }

   protected Object getFieldTemplate(Object var1, String var2, Node var3) {
      Object var4 = this.getFieldValue(var1, var2);
      if (var4 != null && var4.getClass().isArray()) {
         var4 = null;
      } else if (var4 instanceof Collection) {
         ((Collection)var4).clear();
      }

      return var4;
   }

   protected void addObjectValue(Object var1, String var2, Object var3, Object var4) {
      if (var3 != null && !var3.equals(var4)) {
         if (var2 != null && var1 instanceof Map) {
            ((Map)var1).put(var2, var3);
         } else if (var2 != null && var2.length() > 0) {
            this.setFieldValue(var1, var2, var3);
         } else if (var1 instanceof Collection) {
            ((Collection)var1).add(var3);
         }
      }
   }

   public boolean processInclude(mxCodec var1, Node var2, Object var3) {
      if (var2.getNodeType() == 1 && var2.getNodeName().equalsIgnoreCase("include")) {
         String var4 = ((Element)var2).getAttribute("name");
         if (var4 != null) {
            try {
               Element var5 = mxUtils.loadDocument(mxObjectCodec.class.getResource(var4).toString()).getDocumentElement();
               if (var5 != null) {
                  var1.decode(var5, var3);
               }
            } catch (Exception var6) {
               log.log(Level.FINEST, "Cannot process include: " + var4, var6);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public Node beforeDecode(mxCodec var1, Node var2, Object var3) {
      return var2;
   }

   public Object afterDecode(mxCodec var1, Node var2, Object var3) {
      return var3;
   }
}
