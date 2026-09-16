package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ClientSetting extends GeneratedMessageV3 implements ClientSettingOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int VALUE_FIELD_NUMBER = 2;
   private Any value_;
   public static final int CHANGED_VALUE_FIELD_NUMBER = 3;
   private boolean changedValue_ = false;
   public static final int DEFAULT_VALUE_FIELD_NUMBER = 4;
   private boolean defaultValue_ = false;
   private byte memoizedIsInitialized = -1;
   private static final ClientSetting DEFAULT_INSTANCE = new ClientSetting();
   private static final Parser<ClientSetting> PARSER = new AbstractParser<ClientSetting>() {
      public ClientSetting parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClientSetting.Builder var3 = ClientSetting.newBuilder();

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

   private ClientSetting(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClientSetting() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClientSetting();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_setting_v1_ClientSetting_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_setting_v1_ClientSetting_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClientSetting.class, ClientSetting.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasValue() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Any getValue() {
      return this.value_ == null ? Any.getDefaultInstance() : this.value_;
   }

   @Override
   public AnyOrBuilder getValueOrBuilder() {
      return this.value_ == null ? Any.getDefaultInstance() : this.value_;
   }

   @Override
   public boolean getChangedValue() {
      return this.changedValue_;
   }

   @Override
   public boolean getDefaultValue() {
      return this.defaultValue_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getValue());
      }

      if (this.changedValue_) {
         var1.writeBool(3, this.changedValue_);
      }

      if (this.defaultValue_) {
         var1.writeBool(4, this.defaultValue_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getValue());
      }

      if (this.changedValue_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.changedValue_);
      }

      if (this.defaultValue_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.defaultValue_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ClientSetting)) {
         return super.equals(var1);
      } else {
         ClientSetting var2 = (ClientSetting)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasValue() != var2.hasValue()) {
            return false;
         } else if (this.hasValue() && !this.getValue().equals(var2.getValue())) {
            return false;
         } else if (this.getChangedValue() != var2.getChangedValue()) {
            return false;
         } else {
            return this.getDefaultValue() != var2.getDefaultValue() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getId().hashCode();
      if (this.hasValue()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getValue().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getChangedValue());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getDefaultValue());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ClientSetting parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClientSetting parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClientSetting parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClientSetting parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClientSetting parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClientSetting parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClientSetting parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClientSetting parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClientSetting parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClientSetting parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClientSetting parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClientSetting parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClientSetting.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClientSetting.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClientSetting.Builder newBuilder(ClientSetting var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClientSetting.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClientSetting.Builder() : new ClientSetting.Builder().mergeFrom(this);
   }

   protected ClientSetting.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClientSetting.Builder(var1);
   }

   public static ClientSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClientSetting> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClientSetting> getParserForType() {
      return PARSER;
   }

   public ClientSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ClientSetting.Builder> implements ClientSettingOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Any value_;
      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> valueBuilder_;
      private boolean changedValue_;
      private boolean defaultValue_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_setting_v1_ClientSetting_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_setting_v1_ClientSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClientSetting.class, ClientSetting.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ClientSetting.alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
         }
      }

      public ClientSetting.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.value_ = null;
         if (this.valueBuilder_ != null) {
            this.valueBuilder_.dispose();
            this.valueBuilder_ = null;
         }

         this.changedValue_ = false;
         this.defaultValue_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_setting_v1_ClientSetting_descriptor;
      }

      public ClientSetting getDefaultInstanceForType() {
         return ClientSetting.getDefaultInstance();
      }

      public ClientSetting build() {
         ClientSetting var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClientSetting buildPartial() {
         ClientSetting var1 = new ClientSetting(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClientSetting var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.value_ = this.valueBuilder_ == null ? this.value_ : this.valueBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.changedValue_ = this.changedValue_;
         }

         if ((var2 & 8) != 0) {
            var1.defaultValue_ = this.defaultValue_;
         }

         ClientSetting var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ClientSetting.Builder clone() {
         return (ClientSetting.Builder)super.clone();
      }

      public ClientSetting.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClientSetting.Builder)super.setField(var1, var2);
      }

      public ClientSetting.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClientSetting.Builder)super.clearField(var1);
      }

      public ClientSetting.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClientSetting.Builder)super.clearOneof(var1);
      }

      public ClientSetting.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClientSetting.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClientSetting.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClientSetting.Builder)super.addRepeatedField(var1, var2);
      }

      public ClientSetting.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClientSetting) {
            return this.mergeFrom((ClientSetting)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClientSetting.Builder mergeFrom(ClientSetting var1) {
         if (var1 == ClientSetting.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasValue()) {
            this.mergeValue(var1.getValue());
         }

         if (var1.getChangedValue()) {
            this.setChangedValue(var1.getChangedValue());
         }

         if (var1.getDefaultValue()) {
            this.setDefaultValue(var1.getDefaultValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ClientSetting.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getValueFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.changedValue_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.defaultValue_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ClientSetting.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ClientSetting.Builder clearId() {
         this.id_ = ClientSetting.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ClientSetting.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ClientSetting.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasValue() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Any getValue() {
         if (this.valueBuilder_ == null) {
            return this.value_ == null ? Any.getDefaultInstance() : this.value_;
         } else {
            return this.valueBuilder_.getMessage();
         }
      }

      public ClientSetting.Builder setValue(Any var1) {
         if (this.valueBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.value_ = var1;
         } else {
            this.valueBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ClientSetting.Builder setValue(Any.Builder var1) {
         if (this.valueBuilder_ == null) {
            this.value_ = var1.build();
         } else {
            this.valueBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ClientSetting.Builder mergeValue(Any var1) {
         if (this.valueBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != Any.getDefaultInstance()) {
               this.getValueBuilder().mergeFrom(var1);
            } else {
               this.value_ = var1;
            }
         } else {
            this.valueBuilder_.mergeFrom(var1);
         }

         if (this.value_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ClientSetting.Builder clearValue() {
         this.bitField0_ &= -3;
         this.value_ = null;
         if (this.valueBuilder_ != null) {
            this.valueBuilder_.dispose();
            this.valueBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Any.Builder getValueBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getValueFieldBuilder().getBuilder();
      }

      @Override
      public AnyOrBuilder getValueOrBuilder() {
         if (this.valueBuilder_ != null) {
            return this.valueBuilder_.getMessageOrBuilder();
         } else {
            return this.value_ == null ? Any.getDefaultInstance() : this.value_;
         }
      }

      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getValueFieldBuilder() {
         if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new SingleFieldBuilderV3<>(this.getValue(), this.getParentForChildren(), this.isClean());
            this.value_ = null;
         }

         return this.valueBuilder_;
      }

      @Override
      public boolean getChangedValue() {
         return this.changedValue_;
      }

      public ClientSetting.Builder setChangedValue(boolean var1) {
         this.changedValue_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ClientSetting.Builder clearChangedValue() {
         this.bitField0_ &= -5;
         this.changedValue_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getDefaultValue() {
         return this.defaultValue_;
      }

      public ClientSetting.Builder setDefaultValue(boolean var1) {
         this.defaultValue_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ClientSetting.Builder clearDefaultValue() {
         this.bitField0_ &= -9;
         this.defaultValue_ = false;
         this.onChanged();
         return this;
      }

      public final ClientSetting.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClientSetting.Builder)super.setUnknownFields(var1);
      }

      public final ClientSetting.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClientSetting.Builder)super.mergeUnknownFields(var1);
      }
   }
}
