package com.lunarclient.websocket.notification.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OpenAlertRequest extends GeneratedMessageV3 implements OpenAlertRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ALERT_ID_FIELD_NUMBER = 1;
   private int alertId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OpenAlertRequest DEFAULT_INSTANCE = new OpenAlertRequest();
   private static final Parser<OpenAlertRequest> PARSER = new AbstractParser<OpenAlertRequest>() {
      public OpenAlertRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenAlertRequest.Builder var3 = OpenAlertRequest.newBuilder();

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

   private OpenAlertRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenAlertRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenAlertRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenAlertRequest.class, OpenAlertRequest.Builder.class);
   }

   @Override
   public int getAlertId() {
      return this.alertId_;
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
      if (this.alertId_ != 0) {
         var1.writeInt32(1, this.alertId_);
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
      if (this.alertId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.alertId_);
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

      if (!(var1 instanceof OpenAlertRequest)) {
         return super.equals(var1);
      }

      OpenAlertRequest var2 = (OpenAlertRequest)var1;
      return this.getAlertId() != var2.getAlertId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getAlertId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenAlertRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenAlertRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenAlertRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenAlertRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenAlertRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenAlertRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenAlertRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenAlertRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenAlertRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenAlertRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenAlertRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenAlertRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenAlertRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenAlertRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenAlertRequest.Builder newBuilder(OpenAlertRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenAlertRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenAlertRequest.Builder() : new OpenAlertRequest.Builder().mergeFrom(this);
   }

   protected OpenAlertRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenAlertRequest.Builder(var1);
   }

   public static OpenAlertRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenAlertRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenAlertRequest> getParserForType() {
      return PARSER;
   }

   public OpenAlertRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenAlertRequest.Builder> implements OpenAlertRequestOrBuilder {
      private int bitField0_;
      private int alertId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenAlertRequest.class, OpenAlertRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenAlertRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.alertId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_descriptor;
      }

      public OpenAlertRequest getDefaultInstanceForType() {
         return OpenAlertRequest.getDefaultInstance();
      }

      public OpenAlertRequest build() {
         OpenAlertRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenAlertRequest buildPartial() {
         OpenAlertRequest var1 = new OpenAlertRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenAlertRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.alertId_ = this.alertId_;
         }
      }

      public OpenAlertRequest.Builder clone() {
         return (OpenAlertRequest.Builder)super.clone();
      }

      public OpenAlertRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenAlertRequest.Builder)super.setField(var1, var2);
      }

      public OpenAlertRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenAlertRequest.Builder)super.clearField(var1);
      }

      public OpenAlertRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenAlertRequest.Builder)super.clearOneof(var1);
      }

      public OpenAlertRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenAlertRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenAlertRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenAlertRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenAlertRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenAlertRequest) {
            return this.mergeFrom((OpenAlertRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenAlertRequest.Builder mergeFrom(OpenAlertRequest var1) {
         if (var1 == OpenAlertRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getAlertId() != 0) {
            this.setAlertId(var1.getAlertId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OpenAlertRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.alertId_ = var1.readInt32();
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
      public int getAlertId() {
         return this.alertId_;
      }

      public OpenAlertRequest.Builder setAlertId(int var1) {
         this.alertId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenAlertRequest.Builder clearAlertId() {
         this.bitField0_ &= -2;
         this.alertId_ = 0;
         this.onChanged();
         return this;
      }

      public final OpenAlertRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenAlertRequest.Builder)super.setUnknownFields(var1);
      }

      public final OpenAlertRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenAlertRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
