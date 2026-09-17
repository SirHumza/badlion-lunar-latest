package com.lunarclient.websocket.store.v1;

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

public final class SetIncomingGiftPrivacyRequest extends GeneratedMessageV3 implements SetIncomingGiftPrivacyRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int INCOMING_GIFT_PRIVACY_FIELD_NUMBER = 1;
   private int incomingGiftPrivacy_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetIncomingGiftPrivacyRequest DEFAULT_INSTANCE = new SetIncomingGiftPrivacyRequest();
   private static final Parser<SetIncomingGiftPrivacyRequest> PARSER = new AbstractParser<SetIncomingGiftPrivacyRequest>() {
      public SetIncomingGiftPrivacyRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetIncomingGiftPrivacyRequest.Builder var3 = SetIncomingGiftPrivacyRequest.newBuilder();

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

   private SetIncomingGiftPrivacyRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetIncomingGiftPrivacyRequest() {
      this.incomingGiftPrivacy_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetIncomingGiftPrivacyRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetIncomingGiftPrivacyRequest.class, SetIncomingGiftPrivacyRequest.Builder.class);
   }

   @Override
   public int getIncomingGiftPrivacyValue() {
      return this.incomingGiftPrivacy_;
   }

   @Override
   public IncomingGiftPrivacy getIncomingGiftPrivacy() {
      IncomingGiftPrivacy var1 = IncomingGiftPrivacy.forNumber(this.incomingGiftPrivacy_);
      return var1 == null ? IncomingGiftPrivacy.UNRECOGNIZED : var1;
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
      if (this.incomingGiftPrivacy_ != IncomingGiftPrivacy.INCOMING_GIFT_PRIVACY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.incomingGiftPrivacy_);
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
      if (this.incomingGiftPrivacy_ != IncomingGiftPrivacy.INCOMING_GIFT_PRIVACY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.incomingGiftPrivacy_);
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

      if (!(var1 instanceof SetIncomingGiftPrivacyRequest)) {
         return super.equals(var1);
      }

      SetIncomingGiftPrivacyRequest var2 = (SetIncomingGiftPrivacyRequest)var1;
      return this.incomingGiftPrivacy_ != var2.incomingGiftPrivacy_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.incomingGiftPrivacy_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetIncomingGiftPrivacyRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetIncomingGiftPrivacyRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetIncomingGiftPrivacyRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetIncomingGiftPrivacyRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetIncomingGiftPrivacyRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetIncomingGiftPrivacyRequest.Builder newBuilder(SetIncomingGiftPrivacyRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetIncomingGiftPrivacyRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetIncomingGiftPrivacyRequest.Builder() : new SetIncomingGiftPrivacyRequest.Builder().mergeFrom(this);
   }

   protected SetIncomingGiftPrivacyRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetIncomingGiftPrivacyRequest.Builder(var1);
   }

   public static SetIncomingGiftPrivacyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetIncomingGiftPrivacyRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetIncomingGiftPrivacyRequest> getParserForType() {
      return PARSER;
   }

   public SetIncomingGiftPrivacyRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetIncomingGiftPrivacyRequest.Builder>
      implements SetIncomingGiftPrivacyRequestOrBuilder {
      private int bitField0_;
      private int incomingGiftPrivacy_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetIncomingGiftPrivacyRequest.class, SetIncomingGiftPrivacyRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetIncomingGiftPrivacyRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.incomingGiftPrivacy_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_descriptor;
      }

      public SetIncomingGiftPrivacyRequest getDefaultInstanceForType() {
         return SetIncomingGiftPrivacyRequest.getDefaultInstance();
      }

      public SetIncomingGiftPrivacyRequest build() {
         SetIncomingGiftPrivacyRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetIncomingGiftPrivacyRequest buildPartial() {
         SetIncomingGiftPrivacyRequest var1 = new SetIncomingGiftPrivacyRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetIncomingGiftPrivacyRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.incomingGiftPrivacy_ = this.incomingGiftPrivacy_;
         }
      }

      public SetIncomingGiftPrivacyRequest.Builder clone() {
         return (SetIncomingGiftPrivacyRequest.Builder)super.clone();
      }

      public SetIncomingGiftPrivacyRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.setField(var1, var2);
      }

      public SetIncomingGiftPrivacyRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.clearField(var1);
      }

      public SetIncomingGiftPrivacyRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.clearOneof(var1);
      }

      public SetIncomingGiftPrivacyRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetIncomingGiftPrivacyRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetIncomingGiftPrivacyRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetIncomingGiftPrivacyRequest) {
            return this.mergeFrom((SetIncomingGiftPrivacyRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetIncomingGiftPrivacyRequest.Builder mergeFrom(SetIncomingGiftPrivacyRequest var1) {
         if (var1 == SetIncomingGiftPrivacyRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.incomingGiftPrivacy_ != 0) {
            this.setIncomingGiftPrivacyValue(var1.getIncomingGiftPrivacyValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetIncomingGiftPrivacyRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.incomingGiftPrivacy_ = var1.readEnum();
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
      public int getIncomingGiftPrivacyValue() {
         return this.incomingGiftPrivacy_;
      }

      public SetIncomingGiftPrivacyRequest.Builder setIncomingGiftPrivacyValue(int var1) {
         this.incomingGiftPrivacy_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public IncomingGiftPrivacy getIncomingGiftPrivacy() {
         IncomingGiftPrivacy var1 = IncomingGiftPrivacy.forNumber(this.incomingGiftPrivacy_);
         return var1 == null ? IncomingGiftPrivacy.UNRECOGNIZED : var1;
      }

      public SetIncomingGiftPrivacyRequest.Builder setIncomingGiftPrivacy(IncomingGiftPrivacy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.incomingGiftPrivacy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetIncomingGiftPrivacyRequest.Builder clearIncomingGiftPrivacy() {
         this.bitField0_ &= -2;
         this.incomingGiftPrivacy_ = 0;
         this.onChanged();
         return this;
      }

      public final SetIncomingGiftPrivacyRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetIncomingGiftPrivacyRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetIncomingGiftPrivacyRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
