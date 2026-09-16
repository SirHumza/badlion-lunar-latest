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

public final class RemoveConversationParticipantResponse extends GeneratedMessageV3 implements RemoveConversationParticipantResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RemoveConversationParticipantResponse DEFAULT_INSTANCE = new RemoveConversationParticipantResponse();
   private static final Parser<RemoveConversationParticipantResponse> PARSER = new AbstractParser<RemoveConversationParticipantResponse>() {
      public RemoveConversationParticipantResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveConversationParticipantResponse.Builder var3 = RemoveConversationParticipantResponse.newBuilder();

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

   private RemoveConversationParticipantResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveConversationParticipantResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveConversationParticipantResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveConversationParticipantResponse.class, RemoveConversationParticipantResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public RemoveConversationParticipantResponse.Status getStatus() {
      RemoveConversationParticipantResponse.Status var1 = RemoveConversationParticipantResponse.Status.forNumber(this.status_);
      return var1 == null ? RemoveConversationParticipantResponse.Status.UNRECOGNIZED : var1;
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
      if (this.status_ != RemoveConversationParticipantResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
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
      if (this.status_ != RemoveConversationParticipantResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
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

      if (!(var1 instanceof RemoveConversationParticipantResponse)) {
         return super.equals(var1);
      }

      RemoveConversationParticipantResponse var2 = (RemoveConversationParticipantResponse)var1;
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

   public static RemoveConversationParticipantResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveConversationParticipantResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveConversationParticipantResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveConversationParticipantResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveConversationParticipantResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveConversationParticipantResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveConversationParticipantResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveConversationParticipantResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveConversationParticipantResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveConversationParticipantResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveConversationParticipantResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveConversationParticipantResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveConversationParticipantResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveConversationParticipantResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveConversationParticipantResponse.Builder newBuilder(RemoveConversationParticipantResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveConversationParticipantResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE
         ? new RemoveConversationParticipantResponse.Builder()
         : new RemoveConversationParticipantResponse.Builder().mergeFrom(this);
   }

   protected RemoveConversationParticipantResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveConversationParticipantResponse.Builder(var1);
   }

   public static RemoveConversationParticipantResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveConversationParticipantResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveConversationParticipantResponse> getParserForType() {
      return PARSER;
   }

   public RemoveConversationParticipantResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<RemoveConversationParticipantResponse.Builder>
      implements RemoveConversationParticipantResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveConversationParticipantResponse.class, RemoveConversationParticipantResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveConversationParticipantResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantResponse_descriptor;
      }

      public RemoveConversationParticipantResponse getDefaultInstanceForType() {
         return RemoveConversationParticipantResponse.getDefaultInstance();
      }

      public RemoveConversationParticipantResponse build() {
         RemoveConversationParticipantResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveConversationParticipantResponse buildPartial() {
         RemoveConversationParticipantResponse var1 = new RemoveConversationParticipantResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveConversationParticipantResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }
      }

      public RemoveConversationParticipantResponse.Builder clone() {
         return (RemoveConversationParticipantResponse.Builder)super.clone();
      }

      public RemoveConversationParticipantResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveConversationParticipantResponse.Builder)super.setField(var1, var2);
      }

      public RemoveConversationParticipantResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveConversationParticipantResponse.Builder)super.clearField(var1);
      }

      public RemoveConversationParticipantResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveConversationParticipantResponse.Builder)super.clearOneof(var1);
      }

      public RemoveConversationParticipantResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveConversationParticipantResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveConversationParticipantResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveConversationParticipantResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveConversationParticipantResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveConversationParticipantResponse) {
            return this.mergeFrom((RemoveConversationParticipantResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveConversationParticipantResponse.Builder mergeFrom(RemoveConversationParticipantResponse var1) {
         if (var1 == RemoveConversationParticipantResponse.getDefaultInstance()) {
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

      public RemoveConversationParticipantResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public RemoveConversationParticipantResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public RemoveConversationParticipantResponse.Status getStatus() {
         RemoveConversationParticipantResponse.Status var1 = RemoveConversationParticipantResponse.Status.forNumber(this.status_);
         return var1 == null ? RemoveConversationParticipantResponse.Status.UNRECOGNIZED : var1;
      }

      public RemoveConversationParticipantResponse.Builder setStatus(RemoveConversationParticipantResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RemoveConversationParticipantResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      public final RemoveConversationParticipantResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveConversationParticipantResponse.Builder)super.setUnknownFields(var1);
      }

      public final RemoveConversationParticipantResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveConversationParticipantResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_NOT_IN_CONVERSATION(2),
      STATUS_TARGET_NOT_IN_CONVERSATION(3),
      STATUS_TARGET_NOT_FOUND(4),
      STATUS_TARGET_IS_OWNER(5),
      STATUS_NOT_OWNER(6),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_NOT_IN_CONVERSATION_VALUE = 2;
      public static final int STATUS_TARGET_NOT_IN_CONVERSATION_VALUE = 3;
      public static final int STATUS_TARGET_NOT_FOUND_VALUE = 4;
      public static final int STATUS_TARGET_IS_OWNER_VALUE = 5;
      public static final int STATUS_NOT_OWNER_VALUE = 6;
      private static final Internal.EnumLiteMap<RemoveConversationParticipantResponse.Status> internalValueMap = new Internal.EnumLiteMap<RemoveConversationParticipantResponse.Status>() {
         public RemoveConversationParticipantResponse.Status findValueByNumber(int var1) {
            return RemoveConversationParticipantResponse.Status.forNumber(var1);
         }
      };
      private static final RemoveConversationParticipantResponse.Status[] VALUES = values();
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
      public static RemoveConversationParticipantResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static RemoveConversationParticipantResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_NOT_IN_CONVERSATION;
            case 3:
               return STATUS_TARGET_NOT_IN_CONVERSATION;
            case 4:
               return STATUS_TARGET_NOT_FOUND;
            case 5:
               return STATUS_TARGET_IS_OWNER;
            case 6:
               return STATUS_NOT_OWNER;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RemoveConversationParticipantResponse.Status> internalGetValueMap() {
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
         return RemoveConversationParticipantResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static RemoveConversationParticipantResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
