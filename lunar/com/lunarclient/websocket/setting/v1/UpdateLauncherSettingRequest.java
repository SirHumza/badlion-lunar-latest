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

public final class UpdateLauncherSettingRequest extends GeneratedMessageV3 implements UpdateLauncherSettingRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SETTING_FIELD_NUMBER = 1;
   private LauncherSetting setting_;
   public static final int INITIATOR_FIELD_NUMBER = 2;
   private int initiator_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UpdateLauncherSettingRequest DEFAULT_INSTANCE = new UpdateLauncherSettingRequest();
   private static final Parser<UpdateLauncherSettingRequest> PARSER = new AbstractParser<UpdateLauncherSettingRequest>() {
      public UpdateLauncherSettingRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateLauncherSettingRequest.Builder var3 = UpdateLauncherSettingRequest.newBuilder();

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

   private UpdateLauncherSettingRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateLauncherSettingRequest() {
      this.initiator_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateLauncherSettingRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateLauncherSettingRequest.class, UpdateLauncherSettingRequest.Builder.class);
   }

   @Override
   public boolean hasSetting() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public LauncherSetting getSetting() {
      return this.setting_ == null ? LauncherSetting.getDefaultInstance() : this.setting_;
   }

   @Override
   public LauncherSettingOrBuilder getSettingOrBuilder() {
      return this.setting_ == null ? LauncherSetting.getDefaultInstance() : this.setting_;
   }

   @Override
   public int getInitiatorValue() {
      return this.initiator_;
   }

   @Override
   public UpdateLauncherSettingRequest.Initiator getInitiator() {
      UpdateLauncherSettingRequest.Initiator var1 = UpdateLauncherSettingRequest.Initiator.forNumber(this.initiator_);
      return var1 == null ? UpdateLauncherSettingRequest.Initiator.UNRECOGNIZED : var1;
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

      if (this.initiator_ != UpdateLauncherSettingRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
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

      if (this.initiator_ != UpdateLauncherSettingRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
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
      } else if (!(var1 instanceof UpdateLauncherSettingRequest)) {
         return super.equals(var1);
      } else {
         UpdateLauncherSettingRequest var2 = (UpdateLauncherSettingRequest)var1;
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

   public static UpdateLauncherSettingRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLauncherSettingRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLauncherSettingRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLauncherSettingRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLauncherSettingRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLauncherSettingRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLauncherSettingRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLauncherSettingRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateLauncherSettingRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateLauncherSettingRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateLauncherSettingRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLauncherSettingRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateLauncherSettingRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateLauncherSettingRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateLauncherSettingRequest.Builder newBuilder(UpdateLauncherSettingRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateLauncherSettingRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateLauncherSettingRequest.Builder() : new UpdateLauncherSettingRequest.Builder().mergeFrom(this);
   }

   protected UpdateLauncherSettingRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateLauncherSettingRequest.Builder(var1);
   }

   public static UpdateLauncherSettingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateLauncherSettingRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateLauncherSettingRequest> getParserForType() {
      return PARSER;
   }

   public UpdateLauncherSettingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateLauncherSettingRequest.Builder> implements UpdateLauncherSettingRequestOrBuilder {
      private int bitField0_;
      private LauncherSetting setting_;
      private SingleFieldBuilderV3<LauncherSetting, LauncherSetting.Builder, LauncherSettingOrBuilder> settingBuilder_;
      private int initiator_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateLauncherSettingRequest.class, UpdateLauncherSettingRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateLauncherSettingRequest.alwaysUseFieldBuilders) {
            this.getSettingFieldBuilder();
         }
      }

      public UpdateLauncherSettingRequest.Builder clear() {
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
         return ServiceProto.internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_descriptor;
      }

      public UpdateLauncherSettingRequest getDefaultInstanceForType() {
         return UpdateLauncherSettingRequest.getDefaultInstance();
      }

      public UpdateLauncherSettingRequest build() {
         UpdateLauncherSettingRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateLauncherSettingRequest buildPartial() {
         UpdateLauncherSettingRequest var1 = new UpdateLauncherSettingRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateLauncherSettingRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.setting_ = this.settingBuilder_ == null ? this.setting_ : this.settingBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.initiator_ = this.initiator_;
         }

         UpdateLauncherSettingRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateLauncherSettingRequest.Builder clone() {
         return (UpdateLauncherSettingRequest.Builder)super.clone();
      }

      public UpdateLauncherSettingRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLauncherSettingRequest.Builder)super.setField(var1, var2);
      }

      public UpdateLauncherSettingRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateLauncherSettingRequest.Builder)super.clearField(var1);
      }

      public UpdateLauncherSettingRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateLauncherSettingRequest.Builder)super.clearOneof(var1);
      }

      public UpdateLauncherSettingRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateLauncherSettingRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateLauncherSettingRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLauncherSettingRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateLauncherSettingRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateLauncherSettingRequest) {
            return this.mergeFrom((UpdateLauncherSettingRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateLauncherSettingRequest.Builder mergeFrom(UpdateLauncherSettingRequest var1) {
         if (var1 == UpdateLauncherSettingRequest.getDefaultInstance()) {
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

      public UpdateLauncherSettingRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
      public LauncherSetting getSetting() {
         if (this.settingBuilder_ == null) {
            return this.setting_ == null ? LauncherSetting.getDefaultInstance() : this.setting_;
         } else {
            return this.settingBuilder_.getMessage();
         }
      }

      public UpdateLauncherSettingRequest.Builder setSetting(LauncherSetting var1) {
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

      public UpdateLauncherSettingRequest.Builder setSetting(LauncherSetting.Builder var1) {
         if (this.settingBuilder_ == null) {
            this.setting_ = var1.build();
         } else {
            this.settingBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLauncherSettingRequest.Builder mergeSetting(LauncherSetting var1) {
         if (this.settingBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.setting_ != null && this.setting_ != LauncherSetting.getDefaultInstance()) {
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

      public UpdateLauncherSettingRequest.Builder clearSetting() {
         this.bitField0_ &= -2;
         this.setting_ = null;
         if (this.settingBuilder_ != null) {
            this.settingBuilder_.dispose();
            this.settingBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LauncherSetting.Builder getSettingBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSettingFieldBuilder().getBuilder();
      }

      @Override
      public LauncherSettingOrBuilder getSettingOrBuilder() {
         if (this.settingBuilder_ != null) {
            return this.settingBuilder_.getMessageOrBuilder();
         } else {
            return this.setting_ == null ? LauncherSetting.getDefaultInstance() : this.setting_;
         }
      }

      private SingleFieldBuilderV3<LauncherSetting, LauncherSetting.Builder, LauncherSettingOrBuilder> getSettingFieldBuilder() {
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

      public UpdateLauncherSettingRequest.Builder setInitiatorValue(int var1) {
         this.initiator_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public UpdateLauncherSettingRequest.Initiator getInitiator() {
         UpdateLauncherSettingRequest.Initiator var1 = UpdateLauncherSettingRequest.Initiator.forNumber(this.initiator_);
         return var1 == null ? UpdateLauncherSettingRequest.Initiator.UNRECOGNIZED : var1;
      }

      public UpdateLauncherSettingRequest.Builder setInitiator(UpdateLauncherSettingRequest.Initiator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.initiator_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UpdateLauncherSettingRequest.Builder clearInitiator() {
         this.bitField0_ &= -3;
         this.initiator_ = 0;
         this.onChanged();
         return this;
      }

      public final UpdateLauncherSettingRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateLauncherSettingRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateLauncherSettingRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateLauncherSettingRequest.Builder)super.mergeUnknownFields(var1);
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
      private static final Internal.EnumLiteMap<UpdateLauncherSettingRequest.Initiator> internalValueMap = new Internal.EnumLiteMap<UpdateLauncherSettingRequest.Initiator>() {
         public UpdateLauncherSettingRequest.Initiator findValueByNumber(int var1) {
            return UpdateLauncherSettingRequest.Initiator.forNumber(var1);
         }
      };
      private static final UpdateLauncherSettingRequest.Initiator[] VALUES = values();
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
      public static UpdateLauncherSettingRequest.Initiator valueOf(int var0) {
         return forNumber(var0);
      }

      public static UpdateLauncherSettingRequest.Initiator forNumber(int var0) {
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

      public static Internal.EnumLiteMap<UpdateLauncherSettingRequest.Initiator> internalGetValueMap() {
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
         return UpdateLauncherSettingRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static UpdateLauncherSettingRequest.Initiator valueOf(Descriptors.EnumValueDescriptor var0) {
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
