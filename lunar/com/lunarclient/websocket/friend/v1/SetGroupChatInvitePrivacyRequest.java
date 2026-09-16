package com.lunarclient.websocket.friend.v1;

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

public final class SetGroupChatInvitePrivacyRequest extends GeneratedMessageV3 implements SetGroupChatInvitePrivacyRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PRIVACY_FIELD_NUMBER = 1;
   private int privacy_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetGroupChatInvitePrivacyRequest DEFAULT_INSTANCE = new SetGroupChatInvitePrivacyRequest();
   private static final Parser<SetGroupChatInvitePrivacyRequest> PARSER = new AbstractParser<SetGroupChatInvitePrivacyRequest>() {
      public SetGroupChatInvitePrivacyRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetGroupChatInvitePrivacyRequest.Builder var3 = SetGroupChatInvitePrivacyRequest.newBuilder();

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

   private SetGroupChatInvitePrivacyRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetGroupChatInvitePrivacyRequest() {
      this.privacy_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetGroupChatInvitePrivacyRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetGroupChatInvitePrivacyRequest.class, SetGroupChatInvitePrivacyRequest.Builder.class);
   }

   @Override
   public int getPrivacyValue() {
      return this.privacy_;
   }

   @Override
   public GroupChatInvitePrivacy getPrivacy() {
      GroupChatInvitePrivacy var1 = GroupChatInvitePrivacy.forNumber(this.privacy_);
      return var1 == null ? GroupChatInvitePrivacy.UNRECOGNIZED : var1;
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
      if (this.privacy_ != GroupChatInvitePrivacy.GROUP_CHAT_INVITE_PRIVACY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.privacy_);
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
      if (this.privacy_ != GroupChatInvitePrivacy.GROUP_CHAT_INVITE_PRIVACY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.privacy_);
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

      if (!(var1 instanceof SetGroupChatInvitePrivacyRequest)) {
         return super.equals(var1);
      }

      SetGroupChatInvitePrivacyRequest var2 = (SetGroupChatInvitePrivacyRequest)var1;
      return this.privacy_ != var2.privacy_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.privacy_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetGroupChatInvitePrivacyRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetGroupChatInvitePrivacyRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetGroupChatInvitePrivacyRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetGroupChatInvitePrivacyRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetGroupChatInvitePrivacyRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetGroupChatInvitePrivacyRequest.Builder newBuilder(SetGroupChatInvitePrivacyRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetGroupChatInvitePrivacyRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetGroupChatInvitePrivacyRequest.Builder() : new SetGroupChatInvitePrivacyRequest.Builder().mergeFrom(this);
   }

   protected SetGroupChatInvitePrivacyRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetGroupChatInvitePrivacyRequest.Builder(var1);
   }

   public static SetGroupChatInvitePrivacyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetGroupChatInvitePrivacyRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetGroupChatInvitePrivacyRequest> getParserForType() {
      return PARSER;
   }

   public SetGroupChatInvitePrivacyRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetGroupChatInvitePrivacyRequest.Builder>
      implements SetGroupChatInvitePrivacyRequestOrBuilder {
      private int bitField0_;
      private int privacy_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetGroupChatInvitePrivacyRequest.class, SetGroupChatInvitePrivacyRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetGroupChatInvitePrivacyRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.privacy_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_descriptor;
      }

      public SetGroupChatInvitePrivacyRequest getDefaultInstanceForType() {
         return SetGroupChatInvitePrivacyRequest.getDefaultInstance();
      }

      public SetGroupChatInvitePrivacyRequest build() {
         SetGroupChatInvitePrivacyRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetGroupChatInvitePrivacyRequest buildPartial() {
         SetGroupChatInvitePrivacyRequest var1 = new SetGroupChatInvitePrivacyRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetGroupChatInvitePrivacyRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.privacy_ = this.privacy_;
         }
      }

      public SetGroupChatInvitePrivacyRequest.Builder clone() {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.clone();
      }

      public SetGroupChatInvitePrivacyRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.setField(var1, var2);
      }

      public SetGroupChatInvitePrivacyRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.clearField(var1);
      }

      public SetGroupChatInvitePrivacyRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.clearOneof(var1);
      }

      public SetGroupChatInvitePrivacyRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetGroupChatInvitePrivacyRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetGroupChatInvitePrivacyRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetGroupChatInvitePrivacyRequest) {
            return this.mergeFrom((SetGroupChatInvitePrivacyRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetGroupChatInvitePrivacyRequest.Builder mergeFrom(SetGroupChatInvitePrivacyRequest var1) {
         if (var1 == SetGroupChatInvitePrivacyRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.privacy_ != 0) {
            this.setPrivacyValue(var1.getPrivacyValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetGroupChatInvitePrivacyRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.privacy_ = var1.readEnum();
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
      public int getPrivacyValue() {
         return this.privacy_;
      }

      public SetGroupChatInvitePrivacyRequest.Builder setPrivacyValue(int var1) {
         this.privacy_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public GroupChatInvitePrivacy getPrivacy() {
         GroupChatInvitePrivacy var1 = GroupChatInvitePrivacy.forNumber(this.privacy_);
         return var1 == null ? GroupChatInvitePrivacy.UNRECOGNIZED : var1;
      }

      public SetGroupChatInvitePrivacyRequest.Builder setPrivacy(GroupChatInvitePrivacy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.privacy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetGroupChatInvitePrivacyRequest.Builder clearPrivacy() {
         this.bitField0_ &= -2;
         this.privacy_ = 0;
         this.onChanged();
         return this;
      }

      public final SetGroupChatInvitePrivacyRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetGroupChatInvitePrivacyRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetGroupChatInvitePrivacyRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
