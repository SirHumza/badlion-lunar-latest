package com.lunarclient.websocket.conversation.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateConversationIconResponse extends GeneratedMessageV3 implements UpdateConversationIconResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UpdateConversationIconResponse DEFAULT_INSTANCE = new UpdateConversationIconResponse();
   private static final Parser<UpdateConversationIconResponse> PARSER = new AbstractParser<UpdateConversationIconResponse>() {
      public UpdateConversationIconResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateConversationIconResponse.Builder var3 = UpdateConversationIconResponse.newBuilder();

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

   private UpdateConversationIconResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateConversationIconResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateConversationIconResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateConversationIconResponse.class, UpdateConversationIconResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public UpdateConversationIconResponse.Status getStatus() {
      UpdateConversationIconResponse.Status var1 = UpdateConversationIconResponse.Status.forNumber(this.status_);
      return var1 == null ? UpdateConversationIconResponse.Status.UNRECOGNIZED : var1;
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
      if (this.status_ != UpdateConversationIconResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
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
      if (this.status_ != UpdateConversationIconResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
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

      if (!(var1 instanceof UpdateConversationIconResponse)) {
         return super.equals(var1);
      }

      UpdateConversationIconResponse var2 = (UpdateConversationIconResponse)var1;
      return this.status_ != var2.status_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.status_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateConversationIconResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationIconResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationIconResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationIconResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationIconResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationIconResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationIconResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationIconResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationIconResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateConversationIconResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationIconResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationIconResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateConversationIconResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateConversationIconResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateConversationIconResponse.Builder newBuilder(UpdateConversationIconResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateConversationIconResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateConversationIconResponse.Builder() : new UpdateConversationIconResponse.Builder().mergeFrom(this);
   }

   protected UpdateConversationIconResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateConversationIconResponse.Builder(var1);
   }

   public static UpdateConversationIconResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateConversationIconResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateConversationIconResponse> getParserForType() {
      return PARSER;
   }

   public UpdateConversationIconResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<UpdateConversationIconResponse.Builder>
      implements UpdateConversationIconResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateConversationIconResponse.class, UpdateConversationIconResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateConversationIconResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconResponse_descriptor;
      }

      public UpdateConversationIconResponse getDefaultInstanceForType() {
         return UpdateConversationIconResponse.getDefaultInstance();
      }

      public UpdateConversationIconResponse build() {
         UpdateConversationIconResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateConversationIconResponse buildPartial() {
         UpdateConversationIconResponse var1 = new UpdateConversationIconResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateConversationIconResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }
      }

      public UpdateConversationIconResponse.Builder clone() {
         return (UpdateConversationIconResponse.Builder)super.clone();
      }

      public UpdateConversationIconResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationIconResponse.Builder)super.setField(var1, var2);
      }

      public UpdateConversationIconResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateConversationIconResponse.Builder)super.clearField(var1);
      }

      public UpdateConversationIconResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateConversationIconResponse.Builder)super.clearOneof(var1);
      }

      public UpdateConversationIconResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateConversationIconResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateConversationIconResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationIconResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateConversationIconResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateConversationIconResponse) {
            return this.mergeFrom((UpdateConversationIconResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateConversationIconResponse.Builder mergeFrom(UpdateConversationIconResponse var1) {
         if (var1 == UpdateConversationIconResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateConversationIconResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
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
      public int getStatusValue() {
         return this.status_;
      }

      public UpdateConversationIconResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public UpdateConversationIconResponse.Status getStatus() {
         UpdateConversationIconResponse.Status var1 = UpdateConversationIconResponse.Status.forNumber(this.status_);
         return var1 == null ? UpdateConversationIconResponse.Status.UNRECOGNIZED : var1;
      }

      public UpdateConversationIconResponse.Builder setStatus(UpdateConversationIconResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UpdateConversationIconResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      public final UpdateConversationIconResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationIconResponse.Builder)super.setUnknownFields(var1);
      }

      public final UpdateConversationIconResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationIconResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_NOT_IN_CONVERSATION(2),
      STATUS_ICON_POLICY_DISABLED(3),
      STATUS_INNAPPROPRIATE(4),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_NOT_IN_CONVERSATION_VALUE = 2;
      public static final int STATUS_ICON_POLICY_DISABLED_VALUE = 3;
      public static final int STATUS_INNAPPROPRIATE_VALUE = 4;
      private static final Internal.EnumLiteMap<UpdateConversationIconResponse.Status> internalValueMap = new Internal.EnumLiteMap<UpdateConversationIconResponse.Status>() {
         public UpdateConversationIconResponse.Status findValueByNumber(int var1) {
            return UpdateConversationIconResponse.Status.forNumber(var1);
         }
      };
      private static final UpdateConversationIconResponse.Status[] VALUES = values();
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
      public static UpdateConversationIconResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static UpdateConversationIconResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_NOT_IN_CONVERSATION;
            case 3:
               return STATUS_ICON_POLICY_DISABLED;
            case 4:
               return STATUS_INNAPPROPRIATE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<UpdateConversationIconResponse.Status> internalGetValueMap() {
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
         return UpdateConversationIconResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static UpdateConversationIconResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
