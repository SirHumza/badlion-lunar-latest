package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.AbstractParser;
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateClientSettingRequest extends GeneratedMessageV3 implements UpdateClientSettingRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SETTING_FIELD_NUMBER = 1;
   private ClientSetting setting_;
   public static final int INITIATOR_FIELD_NUMBER = 2;
   private int initiator_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UpdateClientSettingRequest DEFAULT_INSTANCE = new UpdateClientSettingRequest();
   private static final Parser<UpdateClientSettingRequest> PARSER = new AbstractParser<UpdateClientSettingRequest>() {
      public UpdateClientSettingRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateClientSettingRequest.Builder var3 = UpdateClientSettingRequest.newBuilder();

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

   private UpdateClientSettingRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateClientSettingRequest() {
      this.initiator_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateClientSettingRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateClientSettingRequest.class, UpdateClientSettingRequest.Builder.class);
   }

   @Override
   public boolean hasSetting() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ClientSetting getSetting() {
      return this.setting_ == null ? ClientSetting.getDefaultInstance() : this.setting_;
   }

   @Override
   public ClientSettingOrBuilder getSettingOrBuilder() {
      return this.setting_ == null ? ClientSetting.getDefaultInstance() : this.setting_;
   }

   @Override
   public int getInitiatorValue() {
      return this.initiator_;
   }

   @Override
   public UpdateClientSettingRequest.Initiator getInitiator() {
      UpdateClientSettingRequest.Initiator var1 = UpdateClientSettingRequest.Initiator.forNumber(this.initiator_);
      return var1 == null ? UpdateClientSettingRequest.Initiator.UNRECOGNIZED : var1;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getSetting());
      }

      if (this.initiator_ != UpdateClientSettingRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.initiator_);
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getSetting());
      }

      if (this.initiator_ != UpdateClientSettingRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.initiator_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateClientSettingRequest)) {
         return super.equals(var1);
      } else {
         UpdateClientSettingRequest var2 = (UpdateClientSettingRequest)var1;
         if (this.hasSetting() != var2.hasSetting()) {
            return false;
         } else if (this.hasSetting() && !this.getSetting().equals(var2.getSetting())) {
            return false;
         } else {
            return this.initiator_ != var2.initiator_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSetting()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSetting().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.initiator_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateClientSettingRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateClientSettingRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateClientSettingRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateClientSettingRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateClientSettingRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateClientSettingRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateClientSettingRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateClientSettingRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateClientSettingRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateClientSettingRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateClientSettingRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateClientSettingRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateClientSettingRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateClientSettingRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateClientSettingRequest.Builder newBuilder(UpdateClientSettingRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateClientSettingRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateClientSettingRequest.Builder() : new UpdateClientSettingRequest.Builder().mergeFrom(this);
   }

   protected UpdateClientSettingRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateClientSettingRequest.Builder(var1);
   }

   public static UpdateClientSettingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateClientSettingRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateClientSettingRequest> getParserForType() {
      return PARSER;
   }

   public UpdateClientSettingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateClientSettingRequest.Builder> implements UpdateClientSettingRequestOrBuilder {
      private int bitField0_;
      private ClientSetting setting_;
      private SingleFieldBuilderV3<ClientSetting, ClientSetting.Builder, ClientSettingOrBuilder> settingBuilder_;
      private int initiator_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateClientSettingRequest.class, UpdateClientSettingRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateClientSettingRequest.alwaysUseFieldBuilders) {
            this.getSettingFieldBuilder();
         }
      }

      public UpdateClientSettingRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.setting_ = null;
         if (this.settingBuilder_ != null) {
            this.settingBuilder_.dispose();
            this.settingBuilder_ = null;
         }

         this.initiator_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_descriptor;
      }

      public UpdateClientSettingRequest getDefaultInstanceForType() {
         return UpdateClientSettingRequest.getDefaultInstance();
      }

      public UpdateClientSettingRequest build() {
         UpdateClientSettingRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateClientSettingRequest buildPartial() {
         UpdateClientSettingRequest var1 = new UpdateClientSettingRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateClientSettingRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.setting_ = this.settingBuilder_ == null ? this.setting_ : this.settingBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.initiator_ = this.initiator_;
         }

         UpdateClientSettingRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateClientSettingRequest.Builder clone() {
         return (UpdateClientSettingRequest.Builder)super.clone();
      }

      public UpdateClientSettingRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateClientSettingRequest.Builder)super.setField(var1, var2);
      }

      public UpdateClientSettingRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateClientSettingRequest.Builder)super.clearField(var1);
      }

      public UpdateClientSettingRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateClientSettingRequest.Builder)super.clearOneof(var1);
      }

      public UpdateClientSettingRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateClientSettingRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateClientSettingRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateClientSettingRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateClientSettingRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateClientSettingRequest) {
            return this.mergeFrom((UpdateClientSettingRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateClientSettingRequest.Builder mergeFrom(UpdateClientSettingRequest var1) {
         if (var1 == UpdateClientSettingRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSetting()) {
            this.mergeSetting(var1.getSetting());
         }

         if (var1.initiator_ != 0) {
            this.setInitiatorValue(var1.getInitiatorValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateClientSettingRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSettingFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.initiator_ = var1.readEnum();
                     this.bitField0_ |= 2;
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
      public boolean hasSetting() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ClientSetting getSetting() {
         if (this.settingBuilder_ == null) {
            return this.setting_ == null ? ClientSetting.getDefaultInstance() : this.setting_;
         } else {
            return this.settingBuilder_.getMessage();
         }
      }

      public UpdateClientSettingRequest.Builder setSetting(ClientSetting var1) {
         if (this.settingBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.setting_ = var1;
         } else {
            this.settingBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateClientSettingRequest.Builder setSetting(ClientSetting.Builder var1) {
         if (this.settingBuilder_ == null) {
            this.setting_ = var1.build();
         } else {
            this.settingBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateClientSettingRequest.Builder mergeSetting(ClientSetting var1) {
         if (this.settingBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.setting_ != null && this.setting_ != ClientSetting.getDefaultInstance()) {
               this.getSettingBuilder().mergeFrom(var1);
            } else {
               this.setting_ = var1;
            }
         } else {
            this.settingBuilder_.mergeFrom(var1);
         }

         if (this.setting_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UpdateClientSettingRequest.Builder clearSetting() {
         this.bitField0_ &= -2;
         this.setting_ = null;
         if (this.settingBuilder_ != null) {
            this.settingBuilder_.dispose();
            this.settingBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ClientSetting.Builder getSettingBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSettingFieldBuilder().getBuilder();
      }

      @Override
      public ClientSettingOrBuilder getSettingOrBuilder() {
         if (this.settingBuilder_ != null) {
            return this.settingBuilder_.getMessageOrBuilder();
         } else {
            return this.setting_ == null ? ClientSetting.getDefaultInstance() : this.setting_;
         }
      }

      private SingleFieldBuilderV3<ClientSetting, ClientSetting.Builder, ClientSettingOrBuilder> getSettingFieldBuilder() {
         if (this.settingBuilder_ == null) {
            this.settingBuilder_ = new SingleFieldBuilderV3<>(this.getSetting(), this.getParentForChildren(), this.isClean());
            this.setting_ = null;
         }

         return this.settingBuilder_;
      }

      @Override
      public int getInitiatorValue() {
         return this.initiator_;
      }

      public UpdateClientSettingRequest.Builder setInitiatorValue(int var1) {
         this.initiator_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public UpdateClientSettingRequest.Initiator getInitiator() {
         UpdateClientSettingRequest.Initiator var1 = UpdateClientSettingRequest.Initiator.forNumber(this.initiator_);
         return var1 == null ? UpdateClientSettingRequest.Initiator.UNRECOGNIZED : var1;
      }

      public UpdateClientSettingRequest.Builder setInitiator(UpdateClientSettingRequest.Initiator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.initiator_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UpdateClientSettingRequest.Builder clearInitiator() {
         this.bitField0_ &= -3;
         this.initiator_ = 0;
         this.onChanged();
         return this;
      }

      public final UpdateClientSettingRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateClientSettingRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateClientSettingRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateClientSettingRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Initiator implements ProtocolMessageEnum {
      INITIATOR_UNSPECIFIED(0),
      INITIATOR_RESET(1),
      INITIATOR_SET(2),
      UNRECOGNIZED(-1);

      public static final int INITIATOR_UNSPECIFIED_VALUE = 0;
      public static final int INITIATOR_RESET_VALUE = 1;
      public static final int INITIATOR_SET_VALUE = 2;
      private static final Internal.EnumLiteMap<UpdateClientSettingRequest.Initiator> internalValueMap = new Internal.EnumLiteMap<UpdateClientSettingRequest.Initiator>() {
         public UpdateClientSettingRequest.Initiator findValueByNumber(int var1) {
            return UpdateClientSettingRequest.Initiator.forNumber(var1);
         }
      };
      private static final UpdateClientSettingRequest.Initiator[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static UpdateClientSettingRequest.Initiator valueOf(int var0) {
         return forNumber(var0);
      }

      public static UpdateClientSettingRequest.Initiator forNumber(int var0) {
         switch (var0) {
            case 0:
               return INITIATOR_UNSPECIFIED;
            case 1:
               return INITIATOR_RESET;
            case 2:
               return INITIATOR_SET;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<UpdateClientSettingRequest.Initiator> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return UpdateClientSettingRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static UpdateClientSettingRequest.Initiator valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Initiator(int var3) {
         this.value = var3;
      }
   }
}
