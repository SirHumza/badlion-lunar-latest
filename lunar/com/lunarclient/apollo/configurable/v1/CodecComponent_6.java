package com.lunarclient.apollo.configurable.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class OverrideConfigurableSettingsMessage extends GeneratedMessageV3 implements OverrideConfigurableSettingsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CONFIGURABLE_SETTINGS_FIELD_NUMBER = 1;
   private List<ConfigurableSettings> configurableSettings_;
   private byte memoizedIsInitialized = -1;
   private static final OverrideConfigurableSettingsMessage DEFAULT_INSTANCE = new OverrideConfigurableSettingsMessage();
   private static final Parser<OverrideConfigurableSettingsMessage> PARSER = new AbstractParser<OverrideConfigurableSettingsMessage>() {
      public OverrideConfigurableSettingsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideConfigurableSettingsMessage.Builder var3 = OverrideConfigurableSettingsMessage.newBuilder();

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

   private OverrideConfigurableSettingsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideConfigurableSettingsMessage() {
      this.configurableSettings_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideConfigurableSettingsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideConfigurableSettingsMessage.class, OverrideConfigurableSettingsMessage.Builder.class);
   }

   @Override
   public List<ConfigurableSettings> getConfigurableSettingsList() {
      return this.configurableSettings_;
   }

   @Override
   public List<? extends ConfigurableSettingsOrBuilder> getConfigurableSettingsOrBuilderList() {
      return this.configurableSettings_;
   }

   @Override
   public int getConfigurableSettingsCount() {
      return this.configurableSettings_.size();
   }

   @Override
   public ConfigurableSettings getConfigurableSettings(int var1) {
      return this.configurableSettings_.get(var1);
   }

   @Override
   public ConfigurableSettingsOrBuilder getConfigurableSettingsOrBuilder(int var1) {
      return this.configurableSettings_.get(var1);
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
      for (int var2 = 0; var2 < this.configurableSettings_.size(); var2++) {
         var1.writeMessage(1, this.configurableSettings_.get(var2));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;

      for (int var2 = 0; var2 < this.configurableSettings_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.configurableSettings_.get(var2));
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

      if (!(var1 instanceof OverrideConfigurableSettingsMessage)) {
         return super.equals(var1);
      }

      OverrideConfigurableSettingsMessage var2 = (OverrideConfigurableSettingsMessage)var1;
      return !this.getConfigurableSettingsList().equals(var2.getConfigurableSettingsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getConfigurableSettingsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConfigurableSettingsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideConfigurableSettingsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideConfigurableSettingsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideConfigurableSettingsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideConfigurableSettingsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideConfigurableSettingsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideConfigurableSettingsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideConfigurableSettingsMessage.Builder newBuilder(OverrideConfigurableSettingsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideConfigurableSettingsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideConfigurableSettingsMessage.Builder() : new OverrideConfigurableSettingsMessage.Builder().mergeFrom(this);
   }

   protected OverrideConfigurableSettingsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideConfigurableSettingsMessage.Builder(var1);
   }

   public static OverrideConfigurableSettingsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideConfigurableSettingsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideConfigurableSettingsMessage> getParserForType() {
      return PARSER;
   }

   public OverrideConfigurableSettingsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OverrideConfigurableSettingsMessage.Builder>
      implements OverrideConfigurableSettingsMessageOrBuilder {
      private int bitField0_;
      private List<ConfigurableSettings> configurableSettings_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConfigurableSettings, ConfigurableSettings.Builder, ConfigurableSettingsOrBuilder> configurableSettingsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideConfigurableSettingsMessage.class, OverrideConfigurableSettingsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OverrideConfigurableSettingsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.configurableSettingsBuilder_ == null) {
            this.configurableSettings_ = Collections.emptyList();
         } else {
            this.configurableSettings_ = null;
            this.configurableSettingsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_descriptor;
      }

      public OverrideConfigurableSettingsMessage getDefaultInstanceForType() {
         return OverrideConfigurableSettingsMessage.getDefaultInstance();
      }

      public OverrideConfigurableSettingsMessage build() {
         OverrideConfigurableSettingsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideConfigurableSettingsMessage buildPartial() {
         OverrideConfigurableSettingsMessage var1 = new OverrideConfigurableSettingsMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(OverrideConfigurableSettingsMessage var1) {
         if (this.configurableSettingsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.configurableSettings_ = Collections.unmodifiableList(this.configurableSettings_);
               this.bitField0_ &= -2;
            }

            var1.configurableSettings_ = this.configurableSettings_;
         } else {
            var1.configurableSettings_ = this.configurableSettingsBuilder_.build();
         }
      }

      private void buildPartial0(OverrideConfigurableSettingsMessage var1) {
         int var2 = this.bitField0_;
      }

      public OverrideConfigurableSettingsMessage.Builder clone() {
         return (OverrideConfigurableSettingsMessage.Builder)super.clone();
      }

      public OverrideConfigurableSettingsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideConfigurableSettingsMessage.Builder)super.setField(var1, var2);
      }

      public OverrideConfigurableSettingsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideConfigurableSettingsMessage.Builder)super.clearField(var1);
      }

      public OverrideConfigurableSettingsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideConfigurableSettingsMessage.Builder)super.clearOneof(var1);
      }

      public OverrideConfigurableSettingsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideConfigurableSettingsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideConfigurableSettingsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideConfigurableSettingsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideConfigurableSettingsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideConfigurableSettingsMessage) {
            return this.mergeFrom((OverrideConfigurableSettingsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder mergeFrom(OverrideConfigurableSettingsMessage var1) {
         if (var1 == OverrideConfigurableSettingsMessage.getDefaultInstance()) {
            return this;
         }

         if (this.configurableSettingsBuilder_ == null) {
            if (!var1.configurableSettings_.isEmpty()) {
               if (this.configurableSettings_.isEmpty()) {
                  this.configurableSettings_ = var1.configurableSettings_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureConfigurableSettingsIsMutable();
                  this.configurableSettings_.addAll(var1.configurableSettings_);
               }

               this.onChanged();
            }
         } else if (!var1.configurableSettings_.isEmpty()) {
            if (this.configurableSettingsBuilder_.isEmpty()) {
               this.configurableSettingsBuilder_.dispose();
               this.configurableSettingsBuilder_ = null;
               this.configurableSettings_ = var1.configurableSettings_;
               this.bitField0_ &= -2;
               this.configurableSettingsBuilder_ = OverrideConfigurableSettingsMessage.alwaysUseFieldBuilders
                  ? this.getConfigurableSettingsFieldBuilder()
                  : null;
            } else {
               this.configurableSettingsBuilder_.addAllMessages(var1.configurableSettings_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OverrideConfigurableSettingsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ConfigurableSettings var5 = var1.readMessage(ConfigurableSettings.parser(), var2);
                     if (this.configurableSettingsBuilder_ == null) {
                        this.ensureConfigurableSettingsIsMutable();
                        this.configurableSettings_.add(var5);
                     } else {
                        this.configurableSettingsBuilder_.addMessage(var5);
                     }
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

      private void ensureConfigurableSettingsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.configurableSettings_ = new ArrayList<>(this.configurableSettings_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ConfigurableSettings> getConfigurableSettingsList() {
         return this.configurableSettingsBuilder_ == null
            ? Collections.unmodifiableList(this.configurableSettings_)
            : this.configurableSettingsBuilder_.getMessageList();
      }

      @Override
      public int getConfigurableSettingsCount() {
         return this.configurableSettingsBuilder_ == null ? this.configurableSettings_.size() : this.configurableSettingsBuilder_.getCount();
      }

      @Override
      public ConfigurableSettings getConfigurableSettings(int var1) {
         return this.configurableSettingsBuilder_ == null ? this.configurableSettings_.get(var1) : this.configurableSettingsBuilder_.getMessage(var1);
      }

      public OverrideConfigurableSettingsMessage.Builder setConfigurableSettings(int var1, ConfigurableSettings var2) {
         if (this.configurableSettingsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.set(var1, var2);
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder setConfigurableSettings(int var1, ConfigurableSettings.Builder var2) {
         if (this.configurableSettingsBuilder_ == null) {
            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder addConfigurableSettings(ConfigurableSettings var1) {
         if (this.configurableSettingsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.add(var1);
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.addMessage(var1);
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder addConfigurableSettings(int var1, ConfigurableSettings var2) {
         if (this.configurableSettingsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.add(var1, var2);
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder addConfigurableSettings(ConfigurableSettings.Builder var1) {
         if (this.configurableSettingsBuilder_ == null) {
            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.add(var1.build());
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder addConfigurableSettings(int var1, ConfigurableSettings.Builder var2) {
         if (this.configurableSettingsBuilder_ == null) {
            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder addAllConfigurableSettings(Iterable<? extends ConfigurableSettings> var1) {
         if (this.configurableSettingsBuilder_ == null) {
            this.ensureConfigurableSettingsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.configurableSettings_);
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder clearConfigurableSettings() {
         if (this.configurableSettingsBuilder_ == null) {
            this.configurableSettings_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.clear();
         }

         return this;
      }

      public OverrideConfigurableSettingsMessage.Builder removeConfigurableSettings(int var1) {
         if (this.configurableSettingsBuilder_ == null) {
            this.ensureConfigurableSettingsIsMutable();
            this.configurableSettings_.remove(var1);
            this.onChanged();
         } else {
            this.configurableSettingsBuilder_.remove(var1);
         }

         return this;
      }

      public ConfigurableSettings.Builder getConfigurableSettingsBuilder(int var1) {
         return this.getConfigurableSettingsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConfigurableSettingsOrBuilder getConfigurableSettingsOrBuilder(int var1) {
         return this.configurableSettingsBuilder_ == null ? this.configurableSettings_.get(var1) : this.configurableSettingsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConfigurableSettingsOrBuilder> getConfigurableSettingsOrBuilderList() {
         return this.configurableSettingsBuilder_ != null
            ? this.configurableSettingsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.configurableSettings_);
      }

      public ConfigurableSettings.Builder addConfigurableSettingsBuilder() {
         return this.getConfigurableSettingsFieldBuilder().addBuilder(ConfigurableSettings.getDefaultInstance());
      }

      public ConfigurableSettings.Builder addConfigurableSettingsBuilder(int var1) {
         return this.getConfigurableSettingsFieldBuilder().addBuilder(var1, ConfigurableSettings.getDefaultInstance());
      }

      public List<ConfigurableSettings.Builder> getConfigurableSettingsBuilderList() {
         return this.getConfigurableSettingsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ConfigurableSettings, ConfigurableSettings.Builder, ConfigurableSettingsOrBuilder> getConfigurableSettingsFieldBuilder() {
         if (this.configurableSettingsBuilder_ == null) {
            this.configurableSettingsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.configurableSettings_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.configurableSettings_ = null;
         }

         return this.configurableSettingsBuilder_;
      }

      public final OverrideConfigurableSettingsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideConfigurableSettingsMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideConfigurableSettingsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideConfigurableSettingsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
