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

public final class SetGroupChatInvitePrivacyResponse extends GeneratedMessageV3 implements SetGroupChatInvitePrivacyResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final SetGroupChatInvitePrivacyResponse DEFAULT_INSTANCE = new SetGroupChatInvitePrivacyResponse();
   private static final Parser<SetGroupChatInvitePrivacyResponse> PARSER = new AbstractParser<SetGroupChatInvitePrivacyResponse>() {
      public SetGroupChatInvitePrivacyResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetGroupChatInvitePrivacyResponse.Builder var3 = SetGroupChatInvitePrivacyResponse.newBuilder();

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

   private SetGroupChatInvitePrivacyResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetGroupChatInvitePrivacyResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetGroupChatInvitePrivacyResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetGroupChatInvitePrivacyResponse.class, SetGroupChatInvitePrivacyResponse.Builder.class);
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
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var2 = 0;
      var2 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var2;
      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof SetGroupChatInvitePrivacyResponse)) {
         return super.equals(var1);
      }

      SetGroupChatInvitePrivacyResponse var2 = (SetGroupChatInvitePrivacyResponse)var1;
      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetGroupChatInvitePrivacyResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetGroupChatInvitePrivacyResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetGroupChatInvitePrivacyResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetGroupChatInvitePrivacyResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetGroupChatInvitePrivacyResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetGroupChatInvitePrivacyResponse.Builder newBuilder(SetGroupChatInvitePrivacyResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetGroupChatInvitePrivacyResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetGroupChatInvitePrivacyResponse.Builder() : new SetGroupChatInvitePrivacyResponse.Builder().mergeFrom(this);
   }

   protected SetGroupChatInvitePrivacyResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetGroupChatInvitePrivacyResponse.Builder(var1);
   }

   public static SetGroupChatInvitePrivacyResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetGroupChatInvitePrivacyResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetGroupChatInvitePrivacyResponse> getParserForType() {
      return PARSER;
   }

   public SetGroupChatInvitePrivacyResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetGroupChatInvitePrivacyResponse.Builder>
      implements SetGroupChatInvitePrivacyResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetGroupChatInvitePrivacyResponse.class, SetGroupChatInvitePrivacyResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetGroupChatInvitePrivacyResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_descriptor;
      }

      public SetGroupChatInvitePrivacyResponse getDefaultInstanceForType() {
         return SetGroupChatInvitePrivacyResponse.getDefaultInstance();
      }

      public SetGroupChatInvitePrivacyResponse build() {
         SetGroupChatInvitePrivacyResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetGroupChatInvitePrivacyResponse buildPartial() {
         SetGroupChatInvitePrivacyResponse var1 = new SetGroupChatInvitePrivacyResponse(this);
         this.onBuilt();
         return var1;
      }

      public SetGroupChatInvitePrivacyResponse.Builder clone() {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.clone();
      }

      public SetGroupChatInvitePrivacyResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.setField(var1, var2);
      }

      public SetGroupChatInvitePrivacyResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.clearField(var1);
      }

      public SetGroupChatInvitePrivacyResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.clearOneof(var1);
      }

      public SetGroupChatInvitePrivacyResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetGroupChatInvitePrivacyResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public SetGroupChatInvitePrivacyResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetGroupChatInvitePrivacyResponse) {
            return this.mergeFrom((SetGroupChatInvitePrivacyResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetGroupChatInvitePrivacyResponse.Builder mergeFrom(SetGroupChatInvitePrivacyResponse var1) {
         if (var1 == SetGroupChatInvitePrivacyResponse.getDefaultInstance()) {
            return this;
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetGroupChatInvitePrivacyResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final SetGroupChatInvitePrivacyResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.setUnknownFields(var1);
      }

      public final SetGroupChatInvitePrivacyResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetGroupChatInvitePrivacyResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
