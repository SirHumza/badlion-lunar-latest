package com.lunarclient.apollo.configurable.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldBuilder;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Value;
import com.google.protobuf.ValueOrBuilder;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

public final class ConfigurableSettings extends GeneratedMessageV3 implements ConfigurableSettingsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int targetCase_ = 0;
   private Object target_;
   public static final int LUNAR_CLIENT_MOD_FIELD_NUMBER = 1;
   public static final int APOLLO_MODULE_FIELD_NUMBER = 2;
   public static final int ENABLE_FIELD_NUMBER = 3;
   private boolean enable_ = false;
   public static final int PROPERTIES_FIELD_NUMBER = 4;
   private MapField<String, Value> properties_;
   private byte memoizedIsInitialized = -1;
   private static final ConfigurableSettings DEFAULT_INSTANCE = new ConfigurableSettings();
   private static final Parser<ConfigurableSettings> PARSER = new AbstractParser<ConfigurableSettings>() {
      public ConfigurableSettings parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConfigurableSettings.Builder var3 = ConfigurableSettings.newBuilder();

         try {
            var3.mergeFrom(var1, var2);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (UninitializedMessageException var6) {
            throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var7) {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   };

   private ConfigurableSettings(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConfigurableSettings() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConfigurableSettings();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 4:
            return this.internalGetProperties();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConfigurableSettings.class, ConfigurableSettings.Builder.class);
   }

   @Override
   public ConfigurableSettings.TargetCase getTargetCase() {
      return ConfigurableSettings.TargetCase.forNumber(this.targetCase_);
   }

   @Override
   public boolean hasLunarClientMod() {
      return this.targetCase_ == 1;
   }

   @Override
   public String getLunarClientMod() {
      Object var1 = "";
      if (this.targetCase_ == 1) {
         var1 = this.target_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.targetCase_ == 1) {
         this.target_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getLunarClientModBytes() {
      Object var1 = "";
      if (this.targetCase_ == 1) {
         var1 = this.target_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.targetCase_ == 1) {
            this.target_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasApolloModule() {
      return this.targetCase_ == 2;
   }

   @Override
   public String getApolloModule() {
      Object var1 = "";
      if (this.targetCase_ == 2) {
         var1 = this.target_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.targetCase_ == 2) {
         this.target_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getApolloModuleBytes() {
      Object var1 = "";
      if (this.targetCase_ == 2) {
         var1 = this.target_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.targetCase_ == 2) {
            this.target_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getEnable() {
      return this.enable_;
   }

   private MapField<String, Value> internalGetProperties() {
      return this.properties_ == null ? MapField.emptyMapField(ConfigurableSettings.PropertiesDefaultEntryHolder.defaultEntry) : this.properties_;
   }

   @Override
   public int getPropertiesCount() {
      return this.internalGetProperties().getMap().size();
   }

   @Override
   public boolean containsProperties(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         return this.internalGetProperties().getMap().containsKey(var1);
      }
   }

   @Deprecated
   @Override
   public Map<String, Value> getProperties() {
      return this.getPropertiesMap();
   }

   @Override
   public Map<String, Value> getPropertiesMap() {
      return this.internalGetProperties().getMap();
   }

   @Override
   public Value getPropertiesOrDefault(String var1, Value var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetProperties().getMap();
      return var3.containsKey(var1) ? (Value)var3.get(var1) : var2;
   }

   @Override
   public Value getPropertiesOrThrow(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         Map var2 = this.internalGetProperties().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (Value)var2.get(var1);
         }
      }
   }

   @Override
   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      }

      if (var1 == 0) {
         return false;
      }

      this.memoizedIsInitialized = 1;
      return true;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if (this.targetCase_ == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.target_);
      }

      if (this.targetCase_ == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.target_);
      }

      if (this.enable_) {
         var1.writeBool(3, this.enable_);
      }

      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetProperties(), ConfigurableSettings.PropertiesDefaultEntryHolder.defaultEntry, 4);
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (this.targetCase_ == 1) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.target_);
      }

      if (this.targetCase_ == 2) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.target_);
      }

      if (this.enable_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.enable_);
      }

      for (Entry var3 : this.internalGetProperties().getMap().entrySet()) {
         MapEntry var4 = ConfigurableSettings.PropertiesDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var3.getKey())
            .setValue((Value)var3.getValue())
            .build();
         var1 += CodedOutputStream.computeMessageSize(4, var4);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ConfigurableSettings)) {
         return super.equals(var1);
      }

      ConfigurableSettings var2 = (ConfigurableSettings)var1;
      if (this.getEnable() != var2.getEnable()) {
         return false;
      }

      if (!this.internalGetProperties().equals(var2.internalGetProperties())) {
         return false;
      }

      if (!this.getTargetCase().equals(var2.getTargetCase())) {
         return false;
      }

      switch (this.targetCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getLunarClientMod().equals(var2.getLunarClientMod())) {
               return false;
            }
            break;
         case 2:
            if (!this.getApolloModule().equals(var2.getApolloModule())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getEnable());
      if (!this.internalGetProperties().getMap().isEmpty()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.internalGetProperties().hashCode();
      }

      switch (this.targetCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getLunarClientMod().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getApolloModule().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConfigurableSettings parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConfigurableSettings parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConfigurableSettings parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConfigurableSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConfigurableSettings parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConfigurableSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConfigurableSettings parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConfigurableSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConfigurableSettings parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConfigurableSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConfigurableSettings parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConfigurableSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConfigurableSettings.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConfigurableSettings.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConfigurableSettings.Builder newBuilder(ConfigurableSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConfigurableSettings.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConfigurableSettings.Builder() : new ConfigurableSettings.Builder().mergeFrom(this);
   }

   protected ConfigurableSettings.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConfigurableSettings.Builder(var1);
   }

   public static ConfigurableSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConfigurableSettings> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConfigurableSettings> getParserForType() {
      return PARSER;
   }

   public ConfigurableSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConfigurableSettings.Builder> implements ConfigurableSettingsOrBuilder {
      private int targetCase_ = 0;
      private Object target_;
      private int bitField0_;
      private boolean enable_;
      private static final ConfigurableSettings.Builder.PropertiesConverter propertiesConverter = new ConfigurableSettings.Builder.PropertiesConverter();
      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> properties_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 4:
               return this.internalGetProperties();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 4:
               return this.internalGetMutableProperties();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConfigurableSettings.class, ConfigurableSettings.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ConfigurableSettings.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.enable_ = false;
         this.internalGetMutableProperties().clear();
         this.targetCase_ = 0;
         this.target_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_descriptor;
      }

      public ConfigurableSettings getDefaultInstanceForType() {
         return ConfigurableSettings.getDefaultInstance();
      }

      public ConfigurableSettings build() {
         ConfigurableSettings var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConfigurableSettings buildPartial() {
         ConfigurableSettings var1 = new ConfigurableSettings(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConfigurableSettings var1) {
         int var2 = this.bitField0_;
         if ((var2 & 4) != 0) {
            var1.enable_ = this.enable_;
         }

         if ((var2 & 8) != 0) {
            var1.properties_ = this.internalGetProperties().build(ConfigurableSettings.PropertiesDefaultEntryHolder.defaultEntry);
         }
      }

      private void buildPartialOneofs(ConfigurableSettings var1) {
         var1.targetCase_ = this.targetCase_;
         var1.target_ = this.target_;
      }

      public ConfigurableSettings.Builder clone() {
         return (ConfigurableSettings.Builder)super.clone();
      }

      public ConfigurableSettings.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConfigurableSettings.Builder)super.setField(var1, var2);
      }

      public ConfigurableSettings.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConfigurableSettings.Builder)super.clearField(var1);
      }

      public ConfigurableSettings.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConfigurableSettings.Builder)super.clearOneof(var1);
      }

      public ConfigurableSettings.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConfigurableSettings.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConfigurableSettings.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConfigurableSettings.Builder)super.addRepeatedField(var1, var2);
      }

      public ConfigurableSettings.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConfigurableSettings) {
            return this.mergeFrom((ConfigurableSettings)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConfigurableSettings.Builder mergeFrom(ConfigurableSettings var1) {
         if (var1 == ConfigurableSettings.getDefaultInstance()) {
            return this;
         }

         if (var1.getEnable()) {
            this.setEnable(var1.getEnable());
         }

         this.internalGetMutableProperties().mergeFrom(var1.internalGetProperties());
         this.bitField0_ |= 8;
         switch (var1.getTargetCase()) {
            case LUNAR_CLIENT_MOD:
               this.targetCase_ = 1;
               this.target_ = var1.target_;
               this.onChanged();
               break;
            case APOLLO_MODULE:
               this.targetCase_ = 2;
               this.target_ = var1.target_;
               this.onChanged();
            case TARGET_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConfigurableSettings.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         try {
            boolean var3 = false;

            while (!var3) {
               int var4 = var1.readTag();
               switch (var4) {
                  case 0:
                     var3 = true;
                     break;
                  case 10:
                     String var12 = var1.readStringRequireUtf8();
                     this.targetCase_ = 1;
                     this.target_ = var12;
                     break;
                  case 18:
                     String var11 = var1.readStringRequireUtf8();
                     this.targetCase_ = 2;
                     this.target_ = var11;
                     break;
                  case 24:
                     this.enable_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     MapEntry var5 = var1.readMessage(ConfigurableSettings.PropertiesDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableProperties().ensureBuilderMap().put((String)var5.getKey(), (ValueOrBuilder)var5.getValue());
                     this.bitField0_ |= 8;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public ConfigurableSettings.TargetCase getTargetCase() {
         return ConfigurableSettings.TargetCase.forNumber(this.targetCase_);
      }

      public ConfigurableSettings.Builder clearTarget() {
         this.targetCase_ = 0;
         this.target_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLunarClientMod() {
         return this.targetCase_ == 1;
      }

      @Override
      public String getLunarClientMod() {
         Object var1 = "";
         if (this.targetCase_ == 1) {
            var1 = this.target_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.targetCase_ == 1) {
               this.target_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLunarClientModBytes() {
         Object var1 = "";
         if (this.targetCase_ == 1) {
            var1 = this.target_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.targetCase_ == 1) {
               this.target_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConfigurableSettings.Builder setLunarClientMod(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.targetCase_ = 1;
         this.target_ = var1;
         this.onChanged();
         return this;
      }

      public ConfigurableSettings.Builder clearLunarClientMod() {
         if (this.targetCase_ == 1) {
            this.targetCase_ = 0;
            this.target_ = null;
            this.onChanged();
         }

         return this;
      }

      public ConfigurableSettings.Builder setLunarClientModBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConfigurableSettings.checkByteStringIsUtf8(var1);
         this.targetCase_ = 1;
         this.target_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasApolloModule() {
         return this.targetCase_ == 2;
      }

      @Override
      public String getApolloModule() {
         Object var1 = "";
         if (this.targetCase_ == 2) {
            var1 = this.target_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.targetCase_ == 2) {
               this.target_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getApolloModuleBytes() {
         Object var1 = "";
         if (this.targetCase_ == 2) {
            var1 = this.target_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.targetCase_ == 2) {
               this.target_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConfigurableSettings.Builder setApolloModule(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.targetCase_ = 2;
         this.target_ = var1;
         this.onChanged();
         return this;
      }

      public ConfigurableSettings.Builder clearApolloModule() {
         if (this.targetCase_ == 2) {
            this.targetCase_ = 0;
            this.target_ = null;
            this.onChanged();
         }

         return this;
      }

      public ConfigurableSettings.Builder setApolloModuleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConfigurableSettings.checkByteStringIsUtf8(var1);
         this.targetCase_ = 2;
         this.target_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getEnable() {
         return this.enable_;
      }

      public ConfigurableSettings.Builder setEnable(boolean var1) {
         this.enable_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConfigurableSettings.Builder clearEnable() {
         this.bitField0_ &= -5;
         this.enable_ = false;
         this.onChanged();
         return this;
      }

      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> internalGetProperties() {
         return this.properties_ == null ? new MapFieldBuilder<>(propertiesConverter) : this.properties_;
      }

      private MapFieldBuilder<String, ValueOrBuilder, Value, Value.Builder> internalGetMutableProperties() {
         if (this.properties_ == null) {
            this.properties_ = new MapFieldBuilder<>(propertiesConverter);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this.properties_;
      }

      @Override
      public int getPropertiesCount() {
         return this.internalGetProperties().ensureBuilderMap().size();
      }

      @Override
      public boolean containsProperties(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            return this.internalGetProperties().ensureBuilderMap().containsKey(var1);
         }
      }

      @Deprecated
      @Override
      public Map<String, Value> getProperties() {
         return this.getPropertiesMap();
      }

      @Override
      public Map<String, Value> getPropertiesMap() {
         return this.internalGetProperties().getImmutableMap();
      }

      @Override
      public Value getPropertiesOrDefault(String var1, Value var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetMutableProperties().ensureBuilderMap();
         return var3.containsKey(var1) ? propertiesConverter.build((ValueOrBuilder)var3.get(var1)) : var2;
      }

      @Override
      public Value getPropertiesOrThrow(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            Map var2 = this.internalGetMutableProperties().ensureBuilderMap();
            if (!var2.containsKey(var1)) {
               throw new IllegalArgumentException();
            } else {
               return propertiesConverter.build((ValueOrBuilder)var2.get(var1));
            }
         }
      }

      public ConfigurableSettings.Builder clearProperties() {
         this.bitField0_ &= -9;
         this.internalGetMutableProperties().clear();
         return this;
      }

      public ConfigurableSettings.Builder removeProperties(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableProperties().ensureBuilderMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<String, Value> getMutableProperties() {
         this.bitField0_ |= 8;
         return this.internalGetMutableProperties().ensureMessageMap();
      }

      public ConfigurableSettings.Builder putProperties(String var1, Value var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         if (var2 == null) {
            throw new NullPointerException("map value");
         }

         this.internalGetMutableProperties().ensureBuilderMap().put(var1, var2);
         this.bitField0_ |= 8;
         return this;
      }

      public ConfigurableSettings.Builder putAllProperties(Map<String, Value> var1) {
         for (Entry var3 : var1.entrySet()) {
            if (var3.getKey() == null || var3.getValue() == null) {
               throw new NullPointerException();
            }
         }

         this.internalGetMutableProperties().ensureBuilderMap().putAll(var1);
         this.bitField0_ |= 8;
         return this;
      }

      public Value.Builder putPropertiesBuilderIfAbsent(String var1) {
         Map var2 = this.internalGetMutableProperties().ensureBuilderMap();
         ValueOrBuilder var3 = (ValueOrBuilder)var2.get(var1);
         if (var3 == null) {
            var3 = Value.newBuilder();
            var2.put(var1, var3);
         }

         if (var3 instanceof Value) {
            var3 = ((Value)var3).toBuilder();
            var2.put(var1, var3);
         }

         return (Value.Builder)var3;
      }

      public final ConfigurableSettings.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConfigurableSettings.Builder)super.setUnknownFields(var1);
      }

      public final ConfigurableSettings.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConfigurableSettings.Builder)super.mergeUnknownFields(var1);
      }

      private static final class PropertiesConverter implements MapFieldBuilder.Converter<String, ValueOrBuilder, Value> {
         private PropertiesConverter() {
         }

         public Value build(ValueOrBuilder var1) {
            return var1 instanceof Value ? (Value)var1 : ((Value.Builder)var1).build();
         }

         @Override
         public MapEntry<String, Value> defaultEntry() {
            return ConfigurableSettings.PropertiesDefaultEntryHolder.defaultEntry;
         }
      }
   }

   private static final class PropertiesDefaultEntryHolder {
      static final MapEntry<String, Value> defaultEntry = MapEntry.newDefaultInstance(
         SchemaProto.internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_PropertiesEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.MESSAGE,
         Value.getDefaultInstance()
      );
   }

   public enum TargetCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      LUNAR_CLIENT_MOD(1),
      APOLLO_MODULE(2),
      TARGET_NOT_SET(0);

      private final int value;

      TargetCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ConfigurableSettings.TargetCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConfigurableSettings.TargetCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return TARGET_NOT_SET;
            case 1:
               return LUNAR_CLIENT_MOD;
            case 2:
               return APOLLO_MODULE;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
