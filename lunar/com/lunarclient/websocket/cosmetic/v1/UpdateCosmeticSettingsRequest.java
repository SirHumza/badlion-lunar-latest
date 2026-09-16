package com.lunarclient.websocket.cosmetic.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateCosmeticSettingsRequest extends GeneratedMessageV3 implements UpdateCosmeticSettingsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SETTINGS_FIELD_NUMBER = 1;
   private CustomizableCosmeticSettings settings_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateCosmeticSettingsRequest DEFAULT_INSTANCE = new UpdateCosmeticSettingsRequest();
   private static final Parser<UpdateCosmeticSettingsRequest> PARSER = new AbstractParser<UpdateCosmeticSettingsRequest>() {
      public UpdateCosmeticSettingsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateCosmeticSettingsRequest.Builder var3 = UpdateCosmeticSettingsRequest.newBuilder();

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

   private UpdateCosmeticSettingsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateCosmeticSettingsRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateCosmeticSettingsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateCosmeticSettingsRequest.class, UpdateCosmeticSettingsRequest.Builder.class);
   }

   @Override
   public boolean hasSettings() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public CustomizableCosmeticSettings getSettings() {
      return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
   }

   @Override
   public CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder() {
      return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
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
         var1.writeMessage(1, this.getSettings());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSettings());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateCosmeticSettingsRequest)) {
         return super.equals(var1);
      } else {
         UpdateCosmeticSettingsRequest var2 = (UpdateCosmeticSettingsRequest)var1;
         if (this.hasSettings() != var2.hasSettings()) {
            return false;
         } else {
            return this.hasSettings() && !this.getSettings().equals(var2.getSettings()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSettings()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSettings().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateCosmeticSettingsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateCosmeticSettingsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateCosmeticSettingsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateCosmeticSettingsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateCosmeticSettingsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateCosmeticSettingsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateCosmeticSettingsRequest.Builder newBuilder(UpdateCosmeticSettingsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateCosmeticSettingsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateCosmeticSettingsRequest.Builder() : new UpdateCosmeticSettingsRequest.Builder().mergeFrom(this);
   }

   protected UpdateCosmeticSettingsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateCosmeticSettingsRequest.Builder(var1);
   }

   public static UpdateCosmeticSettingsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateCosmeticSettingsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateCosmeticSettingsRequest> getParserForType() {
      return PARSER;
   }

   public UpdateCosmeticSettingsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<UpdateCosmeticSettingsRequest.Builder>
      implements UpdateCosmeticSettingsRequestOrBuilder {
      private int bitField0_;
      private CustomizableCosmeticSettings settings_;
      private SingleFieldBuilderV3<CustomizableCosmeticSettings, CustomizableCosmeticSettings.Builder, CustomizableCosmeticSettingsOrBuilder> settingsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateCosmeticSettingsRequest.class, UpdateCosmeticSettingsRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateCosmeticSettingsRequest.alwaysUseFieldBuilders) {
            this.getSettingsFieldBuilder();
         }
      }

      public UpdateCosmeticSettingsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.settings_ = null;
         if (this.settingsBuilder_ != null) {
            this.settingsBuilder_.dispose();
            this.settingsBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_UpdateCosmeticSettingsRequest_descriptor;
      }

      public UpdateCosmeticSettingsRequest getDefaultInstanceForType() {
         return UpdateCosmeticSettingsRequest.getDefaultInstance();
      }

      public UpdateCosmeticSettingsRequest build() {
         UpdateCosmeticSettingsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateCosmeticSettingsRequest buildPartial() {
         UpdateCosmeticSettingsRequest var1 = new UpdateCosmeticSettingsRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateCosmeticSettingsRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.settings_ = this.settingsBuilder_ == null ? this.settings_ : this.settingsBuilder_.build();
            var3 |= 1;
         }

         UpdateCosmeticSettingsRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateCosmeticSettingsRequest.Builder clone() {
         return (UpdateCosmeticSettingsRequest.Builder)super.clone();
      }

      public UpdateCosmeticSettingsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateCosmeticSettingsRequest.Builder)super.setField(var1, var2);
      }

      public UpdateCosmeticSettingsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateCosmeticSettingsRequest.Builder)super.clearField(var1);
      }

      public UpdateCosmeticSettingsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateCosmeticSettingsRequest.Builder)super.clearOneof(var1);
      }

      public UpdateCosmeticSettingsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateCosmeticSettingsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateCosmeticSettingsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateCosmeticSettingsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateCosmeticSettingsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateCosmeticSettingsRequest) {
            return this.mergeFrom((UpdateCosmeticSettingsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateCosmeticSettingsRequest.Builder mergeFrom(UpdateCosmeticSettingsRequest var1) {
         if (var1 == UpdateCosmeticSettingsRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSettings()) {
            this.mergeSettings(var1.getSettings());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateCosmeticSettingsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSettingsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
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
      public boolean hasSettings() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public CustomizableCosmeticSettings getSettings() {
         if (this.settingsBuilder_ == null) {
            return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
         } else {
            return this.settingsBuilder_.getMessage();
         }
      }

      public UpdateCosmeticSettingsRequest.Builder setSettings(CustomizableCosmeticSettings var1) {
         if (this.settingsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.settings_ = var1;
         } else {
            this.settingsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticSettingsRequest.Builder setSettings(CustomizableCosmeticSettings.Builder var1) {
         if (this.settingsBuilder_ == null) {
            this.settings_ = var1.build();
         } else {
            this.settingsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticSettingsRequest.Builder mergeSettings(CustomizableCosmeticSettings var1) {
         if (this.settingsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.settings_ != null && this.settings_ != CustomizableCosmeticSettings.getDefaultInstance()) {
               this.getSettingsBuilder().mergeFrom(var1);
            } else {
               this.settings_ = var1;
            }
         } else {
            this.settingsBuilder_.mergeFrom(var1);
         }

         if (this.settings_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UpdateCosmeticSettingsRequest.Builder clearSettings() {
         this.bitField0_ &= -2;
         this.settings_ = null;
         if (this.settingsBuilder_ != null) {
            this.settingsBuilder_.dispose();
            this.settingsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder getSettingsBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSettingsFieldBuilder().getBuilder();
      }

      @Override
      public CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder() {
         if (this.settingsBuilder_ != null) {
            return this.settingsBuilder_.getMessageOrBuilder();
         } else {
            return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
         }
      }

      private SingleFieldBuilderV3<CustomizableCosmeticSettings, CustomizableCosmeticSettings.Builder, CustomizableCosmeticSettingsOrBuilder> getSettingsFieldBuilder() {
         if (this.settingsBuilder_ == null) {
            this.settingsBuilder_ = new SingleFieldBuilderV3<>(this.getSettings(), this.getParentForChildren(), this.isClean());
            this.settings_ = null;
         }

         return this.settingsBuilder_;
      }

      public final UpdateCosmeticSettingsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateCosmeticSettingsRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateCosmeticSettingsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateCosmeticSettingsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
