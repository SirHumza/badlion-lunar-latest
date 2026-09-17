package com.typesafe.config.impl;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class SerializedConfigValue extends AbstractConfigValue implements Externalizable {
   private static final long serialVersionUID = 1L;
   private ConfigValue value;
   private boolean wasConfig;

   public SerializedConfigValue() {
      super(null);
   }

   SerializedConfigValue(ConfigValue var1) {
      this();
      this.value = var1;
      this.wasConfig = false;
   }

   SerializedConfigValue(Config var1) {
      this(var1.root());
      this.wasConfig = true;
   }

   private Object readResolve() {
      return this.wasConfig ? ((ConfigObject)this.value).toConfig() : this.value;
   }

   private static void writeOriginField(DataOutput var0, SerializedConfigValue.SerializedField var1, Object var2) {
      switch (var1) {
         case ORIGIN_DESCRIPTION:
            var0.writeUTF((String)var2);
            break;
         case ORIGIN_LINE_NUMBER:
            var0.writeInt((Integer)var2);
            break;
         case ORIGIN_END_LINE_NUMBER:
            var0.writeInt((Integer)var2);
            break;
         case ORIGIN_TYPE:
            var0.writeByte((Integer)var2);
            break;
         case ORIGIN_URL:
            var0.writeUTF((String)var2);
            break;
         case ORIGIN_RESOURCE:
            var0.writeUTF((String)var2);
            break;
         case ORIGIN_COMMENTS:
            List var3 = (List)var2;
            int var4 = var3.size();
            var0.writeInt(var4);

            for (String var6 : var3) {
               var0.writeUTF(var6);
            }
         case ORIGIN_NULL_URL:
         case ORIGIN_NULL_RESOURCE:
         case ORIGIN_NULL_COMMENTS:
            break;
         default:
            throw new IOException("Unhandled field from origin: " + var1);
      }
   }

   static void writeOrigin(DataOutput var0, SimpleConfigOrigin var1, SimpleConfigOrigin var2) {
      Map var3;
      if (var1 != null) {
         var3 = var1.toFieldsDelta(var2);
      } else {
         var3 = Collections.emptyMap();
      }

      for (Entry var5 : var3.entrySet()) {
         SerializedConfigValue.FieldOut var6 = new SerializedConfigValue.FieldOut((SerializedConfigValue.SerializedField)var5.getKey());
         Object var7 = var5.getValue();
         writeOriginField(var6.data, var6.code, var7);
         writeField(var0, var6);
      }

      writeEndMarker(var0);
   }

   static SimpleConfigOrigin readOrigin(DataInput var0, SimpleConfigOrigin var1) {
      EnumMap var2 = new EnumMap<>(SerializedConfigValue.SerializedField.class);

      while (true) {
         Serializable var3 = null;
         SerializedConfigValue.SerializedField var4 = readCode(var0);
         switch (var4) {
            case ORIGIN_DESCRIPTION:
               var0.readInt();
               var3 = var0.readUTF();
               break;
            case ORIGIN_LINE_NUMBER:
               var0.readInt();
               var3 = var0.readInt();
               break;
            case ORIGIN_END_LINE_NUMBER:
               var0.readInt();
               var3 = var0.readInt();
               break;
            case ORIGIN_TYPE:
               var0.readInt();
               var3 = var0.readUnsignedByte();
               break;
            case ORIGIN_URL:
               var0.readInt();
               var3 = var0.readUTF();
               break;
            case ORIGIN_RESOURCE:
               var0.readInt();
               var3 = var0.readUTF();
               break;
            case ORIGIN_COMMENTS:
               var0.readInt();
               int var5 = var0.readInt();
               ArrayList var6 = new ArrayList(var5);

               for (int var7 = 0; var7 < var5; var7++) {
                  var6.add(var0.readUTF());
               }

               var3 = var6;
               break;
            case ORIGIN_NULL_URL:
            case ORIGIN_NULL_RESOURCE:
            case ORIGIN_NULL_COMMENTS:
               var0.readInt();
               var3 = "";
               break;
            case END_MARKER:
               return SimpleConfigOrigin.fromBase(var1, var2);
            case ROOT_VALUE:
            case ROOT_WAS_CONFIG:
            case VALUE_DATA:
            case VALUE_ORIGIN:
               throw new IOException("Not expecting this field here: " + var4);
            case UNKNOWN:
               skipField(var0);
         }

         if (var3 != null) {
            var2.put(var4, var3);
         }
      }
   }

   private static void writeValueData(DataOutput var0, ConfigValue var1) {
      SerializedConfigValue.SerializedValueType var2 = SerializedConfigValue.SerializedValueType.forValue(var1);
      var0.writeByte(var2.ordinal());
      switch (var2) {
         case BOOLEAN:
            var0.writeBoolean(((ConfigBoolean)var1).unwrapped());
         case NULL:
         default:
            break;
         case INT:
            var0.writeInt(((ConfigInt)var1).unwrapped());
            var0.writeUTF(((ConfigNumber)var1).transformToString());
            break;
         case LONG:
            var0.writeLong(((ConfigLong)var1).unwrapped());
            var0.writeUTF(((ConfigNumber)var1).transformToString());
            break;
         case DOUBLE:
            var0.writeDouble(((ConfigDouble)var1).unwrapped());
            var0.writeUTF(((ConfigNumber)var1).transformToString());
            break;
         case STRING:
            var0.writeUTF(((ConfigString)var1).unwrapped());
            break;
         case LIST:
            ConfigList var3 = (ConfigList)var1;
            var0.writeInt(var3.size());

            for (ConfigValue var8 : var3) {
               writeValue(var0, var8, (SimpleConfigOrigin)var3.origin());
            }
            break;
         case OBJECT:
            ConfigObject var4 = (ConfigObject)var1;
            var0.writeInt(var4.size());

            for (Entry var6 : var4.entrySet()) {
               var0.writeUTF((String)var6.getKey());
               writeValue(var0, (ConfigValue)var6.getValue(), (SimpleConfigOrigin)var4.origin());
            }
      }
   }

   private static AbstractConfigValue readValueData(DataInput var0, SimpleConfigOrigin var1) {
      int var2 = var0.readUnsignedByte();
      SerializedConfigValue.SerializedValueType var3 = SerializedConfigValue.SerializedValueType.forInt(var2);
      if (var3 == null) {
         throw new IOException("Unknown serialized value type: " + var2);
      }

      switch (var3) {
         case BOOLEAN:
            return new ConfigBoolean(var1, var0.readBoolean());
         case NULL:
            return new ConfigNull(var1);
         case INT:
            int var4 = var0.readInt();
            String var5 = var0.readUTF();
            return new ConfigInt(var1, var4, var5);
         case LONG:
            long var6 = var0.readLong();
            String var8 = var0.readUTF();
            return new ConfigLong(var1, var6, var8);
         case DOUBLE:
            double var9 = var0.readDouble();
            String var11 = var0.readUTF();
            return new ConfigDouble(var1, var9, var11);
         case STRING:
            return new ConfigString.Quoted(var1, var0.readUTF());
         case LIST:
            int var12 = var0.readInt();
            ArrayList var13 = new ArrayList(var12);

            for (int var19 = 0; var19 < var12; var19++) {
               AbstractConfigValue var20 = readValue(var0, var1);
               var13.add(var20);
            }

            return new SimpleConfigList(var1, var13);
         case OBJECT:
            int var14 = var0.readInt();
            HashMap var15 = new HashMap(var14);

            for (int var16 = 0; var16 < var14; var16++) {
               String var17 = var0.readUTF();
               AbstractConfigValue var18 = readValue(var0, var1);
               var15.put(var17, var18);
            }

            return new SimpleConfigObject(var1, var15);
         default:
            throw new IOException("Unhandled serialized value type: " + var3);
      }
   }

   private static void writeValue(DataOutput var0, ConfigValue var1, SimpleConfigOrigin var2) {
      SerializedConfigValue.FieldOut var3 = new SerializedConfigValue.FieldOut(SerializedConfigValue.SerializedField.VALUE_ORIGIN);
      writeOrigin(var3.data, (SimpleConfigOrigin)var1.origin(), var2);
      writeField(var0, var3);
      SerializedConfigValue.FieldOut var4 = new SerializedConfigValue.FieldOut(SerializedConfigValue.SerializedField.VALUE_DATA);
      writeValueData(var4.data, var1);
      writeField(var0, var4);
      writeEndMarker(var0);
   }

   private static AbstractConfigValue readValue(DataInput var0, SimpleConfigOrigin var1) {
      AbstractConfigValue var2 = null;
      SimpleConfigOrigin var3 = null;

      while (true) {
         SerializedConfigValue.SerializedField var4 = readCode(var0);
         if (var4 == SerializedConfigValue.SerializedField.END_MARKER) {
            if (var2 == null) {
               throw new IOException("No value data found in serialization of value");
            }

            return var2;
         }

         if (var4 == SerializedConfigValue.SerializedField.VALUE_DATA) {
            if (var3 == null) {
               throw new IOException("Origin must be stored before value data");
            }

            var0.readInt();
            var2 = readValueData(var0, var3);
         } else if (var4 == SerializedConfigValue.SerializedField.VALUE_ORIGIN) {
            var0.readInt();
            var3 = readOrigin(var0, var1);
         } else {
            skipField(var0);
         }
      }
   }

   private static void writeField(DataOutput var0, SerializedConfigValue.FieldOut var1) {
      byte[] var2 = var1.bytes.toByteArray();
      var0.writeByte(var1.code.ordinal());
      var0.writeInt(var2.length);
      var0.write(var2);
   }

   private static void writeEndMarker(DataOutput var0) {
      var0.writeByte(SerializedConfigValue.SerializedField.END_MARKER.ordinal());
   }

   private static SerializedConfigValue.SerializedField readCode(DataInput var0) {
      int var1 = var0.readUnsignedByte();
      if (var1 == SerializedConfigValue.SerializedField.UNKNOWN.ordinal()) {
         throw new IOException("field code " + var1 + " is not supposed to be on the wire");
      } else {
         return SerializedConfigValue.SerializedField.forInt(var1);
      }
   }

   private static void skipField(DataInput var0) {
      int var1 = var0.readInt();
      int var2 = var0.skipBytes(var1);
      if (var2 < var1) {
         byte[] var3 = new byte[var1 - var2];
         var0.readFully(var3);
      }
   }

   @Override
   public void writeExternal(ObjectOutput var1) {
      if (((AbstractConfigValue)this.value).resolveStatus() != ResolveStatus.RESOLVED) {
         throw new NotSerializableException("tried to serialize a value with unresolved substitutions, need to Config#resolve() first, see API docs");
      }

      SerializedConfigValue.FieldOut var2 = new SerializedConfigValue.FieldOut(SerializedConfigValue.SerializedField.ROOT_VALUE);
      writeValue(var2.data, this.value, null);
      writeField(var1, var2);
      var2 = new SerializedConfigValue.FieldOut(SerializedConfigValue.SerializedField.ROOT_WAS_CONFIG);
      var2.data.writeBoolean(this.wasConfig);
      writeField(var1, var2);
      writeEndMarker(var1);
   }

   @Override
   public void readExternal(ObjectInput var1) {
      while (true) {
         SerializedConfigValue.SerializedField var2 = readCode(var1);
         if (var2 == SerializedConfigValue.SerializedField.END_MARKER) {
            return;
         }

         DataInput var3 = this.fieldIn(var1);
         if (var2 == SerializedConfigValue.SerializedField.ROOT_VALUE) {
            this.value = readValue(var3, null);
         } else if (var2 == SerializedConfigValue.SerializedField.ROOT_WAS_CONFIG) {
            this.wasConfig = var3.readBoolean();
         }
      }
   }

   private DataInput fieldIn(ObjectInput var1) {
      byte[] var2 = new byte[var1.readInt()];
      var1.readFully(var2);
      return new DataInputStream(new ByteArrayInputStream(var2));
   }

   private static ConfigException shouldNotBeUsed() {
      return new ConfigException.BugOrBroken(SerializedConfigValue.class.getName() + " should not exist outside of serialization");
   }

   @Override
   public ConfigValueType valueType() {
      throw shouldNotBeUsed();
   }

   @Override
   public Object unwrapped() {
      throw shouldNotBeUsed();
   }

   protected SerializedConfigValue newCopy(ConfigOrigin var1) {
      throw shouldNotBeUsed();
   }

   @Override
   public final String toString() {
      return this.getClass().getSimpleName() + "(value=" + this.value + ",wasConfig=" + this.wasConfig + ")";
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof SerializedConfigValue)
         ? false
         : this.canEqual(var1) && this.wasConfig == ((SerializedConfigValue)var1).wasConfig && this.value.equals(((SerializedConfigValue)var1).value);
   }

   @Override
   public int hashCode() {
      int var1 = 41 * (41 + this.value.hashCode());
      return 41 * (var1 + (this.wasConfig ? 1 : 0));
   }

   private static class FieldOut {
      final SerializedConfigValue.SerializedField code;
      final ByteArrayOutputStream bytes;
      final DataOutput data;

      FieldOut(SerializedConfigValue.SerializedField var1) {
         this.code = var1;
         this.bytes = new ByteArrayOutputStream();
         this.data = new DataOutputStream(this.bytes);
      }
   }

   enum SerializedField {
      UNKNOWN,
      END_MARKER,
      ROOT_VALUE,
      ROOT_WAS_CONFIG,
      VALUE_DATA,
      VALUE_ORIGIN,
      ORIGIN_DESCRIPTION,
      ORIGIN_LINE_NUMBER,
      ORIGIN_END_LINE_NUMBER,
      ORIGIN_TYPE,
      ORIGIN_URL,
      ORIGIN_COMMENTS,
      ORIGIN_NULL_URL,
      ORIGIN_NULL_COMMENTS,
      ORIGIN_RESOURCE,
      ORIGIN_NULL_RESOURCE;

      static SerializedConfigValue.SerializedField forInt(int var0) {
         return var0 < values().length ? values()[var0] : UNKNOWN;
      }
   }

   private enum SerializedValueType {
      NULL(ConfigValueType.NULL),
      BOOLEAN(ConfigValueType.BOOLEAN),
      INT(ConfigValueType.NUMBER),
      LONG(ConfigValueType.NUMBER),
      DOUBLE(ConfigValueType.NUMBER),
      STRING(ConfigValueType.STRING),
      LIST(ConfigValueType.LIST),
      OBJECT(ConfigValueType.OBJECT);

      ConfigValueType configType;

      SerializedValueType(ConfigValueType var3) {
         this.configType = var3;
      }

      static SerializedConfigValue.SerializedValueType forInt(int var0) {
         return var0 < values().length ? values()[var0] : null;
      }

      static SerializedConfigValue.SerializedValueType forValue(ConfigValue var0) {
         ConfigValueType var1 = var0.valueType();
         if (var1 == ConfigValueType.NUMBER) {
            if (var0 instanceof ConfigInt) {
               return INT;
            }

            if (var0 instanceof ConfigLong) {
               return LONG;
            }

            if (var0 instanceof ConfigDouble) {
               return DOUBLE;
            }
         } else {
            for (SerializedConfigValue.SerializedValueType var5 : values()) {
               if (var5.configType == var1) {
                  return var5;
               }
            }
         }

         throw new ConfigException.BugOrBroken("don't know how to serialize " + var0);
      }
   }
}
