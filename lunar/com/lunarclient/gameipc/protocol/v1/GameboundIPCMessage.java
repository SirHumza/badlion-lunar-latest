package com.lunarclient.gameipc.protocol.v1;

import com.google.protobuf.AbstractMessageLite;
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

public final class GameboundIPCMessage extends GeneratedMessageV3 implements GameboundIPCMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int RPC_RESPONSE_FIELD_NUMBER = 1;
   public static final int PUSH_NOTIFICATION_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final GameboundIPCMessage DEFAULT_INSTANCE = new GameboundIPCMessage();
   private static final Parser<GameboundIPCMessage> PARSER = new AbstractParser<GameboundIPCMessage>() {
      public GameboundIPCMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GameboundIPCMessage.Builder var3 = GameboundIPCMessage.newBuilder();

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

   private GameboundIPCMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GameboundIPCMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GameboundIPCMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GameboundIPCMessage.class, GameboundIPCMessage.Builder.class);
   }

   @Override
   public GameboundIPCMessage.ContentsCase getContentsCase() {
      return GameboundIPCMessage.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasRpcResponse() {
      return this.contentsCase_ == 1;
   }

   @Override
   public IPCRpcResponse getRpcResponse() {
      return this.contentsCase_ == 1 ? (IPCRpcResponse)this.contents_ : IPCRpcResponse.getDefaultInstance();
   }

   @Override
   public IPCRpcResponseOrBuilder getRpcResponseOrBuilder() {
      return this.contentsCase_ == 1 ? (IPCRpcResponse)this.contents_ : IPCRpcResponse.getDefaultInstance();
   }

   @Override
   public boolean hasPushNotification() {
      return this.contentsCase_ == 2;
   }

   @Override
   public Any getPushNotification() {
      return this.contentsCase_ == 2 ? (Any)this.contents_ : Any.getDefaultInstance();
   }

   @Override
   public AnyOrBuilder getPushNotificationOrBuilder() {
      return this.contentsCase_ == 2 ? (Any)this.contents_ : Any.getDefaultInstance();
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
      if (this.contentsCase_ == 1) {
         var1.writeMessage(1, (IPCRpcResponse)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1.writeMessage(2, (Any)this.contents_);
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
      if (this.contentsCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (IPCRpcResponse)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (Any)this.contents_);
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

      if (!(var1 instanceof GameboundIPCMessage)) {
         return super.equals(var1);
      }

      GameboundIPCMessage var2 = (GameboundIPCMessage)var1;
      if (!this.getContentsCase().equals(var2.getContentsCase())) {
         return false;
      }

      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getRpcResponse().equals(var2.getRpcResponse())) {
               return false;
            }
            break;
         case 2:
            if (!this.getPushNotification().equals(var2.getPushNotification())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getRpcResponse().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getPushNotification().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GameboundIPCMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameboundIPCMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameboundIPCMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameboundIPCMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameboundIPCMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameboundIPCMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameboundIPCMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GameboundIPCMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GameboundIPCMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GameboundIPCMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GameboundIPCMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GameboundIPCMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GameboundIPCMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GameboundIPCMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GameboundIPCMessage.Builder newBuilder(GameboundIPCMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GameboundIPCMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GameboundIPCMessage.Builder() : new GameboundIPCMessage.Builder().mergeFrom(this);
   }

   protected GameboundIPCMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GameboundIPCMessage.Builder(var1);
   }

   public static GameboundIPCMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GameboundIPCMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<GameboundIPCMessage> getParserForType() {
      return PARSER;
   }

   public GameboundIPCMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GameboundIPCMessage.Builder> implements GameboundIPCMessageOrBuilder {
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<IPCRpcResponse, IPCRpcResponse.Builder, IPCRpcResponseOrBuilder> rpcResponseBuilder_;
      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> pushNotificationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GameboundIPCMessage.class, GameboundIPCMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GameboundIPCMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.rpcResponseBuilder_ != null) {
            this.rpcResponseBuilder_.clear();
         }

         if (this.pushNotificationBuilder_ != null) {
            this.pushNotificationBuilder_.clear();
         }

         this.contentsCase_ = 0;
         this.contents_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_descriptor;
      }

      public GameboundIPCMessage getDefaultInstanceForType() {
         return GameboundIPCMessage.getDefaultInstance();
      }

      public GameboundIPCMessage build() {
         GameboundIPCMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GameboundIPCMessage buildPartial() {
         GameboundIPCMessage var1 = new GameboundIPCMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GameboundIPCMessage var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(GameboundIPCMessage var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 1 && this.rpcResponseBuilder_ != null) {
            var1.contents_ = this.rpcResponseBuilder_.build();
         }

         if (this.contentsCase_ == 2 && this.pushNotificationBuilder_ != null) {
            var1.contents_ = this.pushNotificationBuilder_.build();
         }
      }

      public GameboundIPCMessage.Builder clone() {
         return (GameboundIPCMessage.Builder)super.clone();
      }

      public GameboundIPCMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GameboundIPCMessage.Builder)super.setField(var1, var2);
      }

      public GameboundIPCMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GameboundIPCMessage.Builder)super.clearField(var1);
      }

      public GameboundIPCMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GameboundIPCMessage.Builder)super.clearOneof(var1);
      }

      public GameboundIPCMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GameboundIPCMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GameboundIPCMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GameboundIPCMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public GameboundIPCMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof GameboundIPCMessage) {
            return this.mergeFrom((GameboundIPCMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GameboundIPCMessage.Builder mergeFrom(GameboundIPCMessage var1) {
         if (var1 == GameboundIPCMessage.getDefaultInstance()) {
            return this;
         }

         switch (var1.getContentsCase()) {
            case RPC_RESPONSE:
               this.mergeRpcResponse(var1.getRpcResponse());
               break;
            case PUSH_NOTIFICATION:
               this.mergePushNotification(var1.getPushNotification());
            case CONTENTS_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GameboundIPCMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getRpcResponseFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getPushNotificationFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 2;
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
      public GameboundIPCMessage.ContentsCase getContentsCase() {
         return GameboundIPCMessage.ContentsCase.forNumber(this.contentsCase_);
      }

      public GameboundIPCMessage.Builder clearContents() {
         this.contentsCase_ = 0;
         this.contents_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasRpcResponse() {
         return this.contentsCase_ == 1;
      }

      @Override
      public IPCRpcResponse getRpcResponse() {
         if (this.rpcResponseBuilder_ == null) {
            return this.contentsCase_ == 1 ? (IPCRpcResponse)this.contents_ : IPCRpcResponse.getDefaultInstance();
         } else {
            return this.contentsCase_ == 1 ? this.rpcResponseBuilder_.getMessage() : IPCRpcResponse.getDefaultInstance();
         }
      }

      public GameboundIPCMessage.Builder setRpcResponse(IPCRpcResponse var1) {
         if (this.rpcResponseBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.rpcResponseBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public GameboundIPCMessage.Builder setRpcResponse(IPCRpcResponse.Builder var1) {
         if (this.rpcResponseBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.rpcResponseBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 1;
         return this;
      }

      public GameboundIPCMessage.Builder mergeRpcResponse(IPCRpcResponse var1) {
         if (this.rpcResponseBuilder_ == null) {
            if (this.contentsCase_ == 1 && this.contents_ != IPCRpcResponse.getDefaultInstance()) {
               this.contents_ = IPCRpcResponse.newBuilder((IPCRpcResponse)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 1) {
            this.rpcResponseBuilder_.mergeFrom(var1);
         } else {
            this.rpcResponseBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public GameboundIPCMessage.Builder clearRpcResponse() {
         if (this.rpcResponseBuilder_ == null) {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.rpcResponseBuilder_.clear();
         }

         return this;
      }

      public IPCRpcResponse.Builder getRpcResponseBuilder() {
         return this.getRpcResponseFieldBuilder().getBuilder();
      }

      @Override
      public IPCRpcResponseOrBuilder getRpcResponseOrBuilder() {
         if (this.contentsCase_ == 1 && this.rpcResponseBuilder_ != null) {
            return this.rpcResponseBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 1 ? (IPCRpcResponse)this.contents_ : IPCRpcResponse.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<IPCRpcResponse, IPCRpcResponse.Builder, IPCRpcResponseOrBuilder> getRpcResponseFieldBuilder() {
         if (this.rpcResponseBuilder_ == null) {
            if (this.contentsCase_ != 1) {
               this.contents_ = IPCRpcResponse.getDefaultInstance();
            }

            this.rpcResponseBuilder_ = new SingleFieldBuilderV3<>((IPCRpcResponse)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 1;
         this.onChanged();
         return this.rpcResponseBuilder_;
      }

      @Override
      public boolean hasPushNotification() {
         return this.contentsCase_ == 2;
      }

      @Override
      public Any getPushNotification() {
         if (this.pushNotificationBuilder_ == null) {
            return this.contentsCase_ == 2 ? (Any)this.contents_ : Any.getDefaultInstance();
         } else {
            return this.contentsCase_ == 2 ? this.pushNotificationBuilder_.getMessage() : Any.getDefaultInstance();
         }
      }

      public GameboundIPCMessage.Builder setPushNotification(Any var1) {
         if (this.pushNotificationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.pushNotificationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public GameboundIPCMessage.Builder setPushNotification(Any.Builder var1) {
         if (this.pushNotificationBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.pushNotificationBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 2;
         return this;
      }

      public GameboundIPCMessage.Builder mergePushNotification(Any var1) {
         if (this.pushNotificationBuilder_ == null) {
            if (this.contentsCase_ == 2 && this.contents_ != Any.getDefaultInstance()) {
               this.contents_ = Any.newBuilder((Any)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 2) {
            this.pushNotificationBuilder_.mergeFrom(var1);
         } else {
            this.pushNotificationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public GameboundIPCMessage.Builder clearPushNotification() {
         if (this.pushNotificationBuilder_ == null) {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.pushNotificationBuilder_.clear();
         }

         return this;
      }

      public Any.Builder getPushNotificationBuilder() {
         return this.getPushNotificationFieldBuilder().getBuilder();
      }

      @Override
      public AnyOrBuilder getPushNotificationOrBuilder() {
         if (this.contentsCase_ == 2 && this.pushNotificationBuilder_ != null) {
            return this.pushNotificationBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 2 ? (Any)this.contents_ : Any.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getPushNotificationFieldBuilder() {
         if (this.pushNotificationBuilder_ == null) {
            if (this.contentsCase_ != 2) {
               this.contents_ = Any.getDefaultInstance();
            }

            this.pushNotificationBuilder_ = new SingleFieldBuilderV3<>((Any)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 2;
         this.onChanged();
         return this.pushNotificationBuilder_;
      }

      public final GameboundIPCMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GameboundIPCMessage.Builder)super.setUnknownFields(var1);
      }

      public final GameboundIPCMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GameboundIPCMessage.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      RPC_RESPONSE(1),
      PUSH_NOTIFICATION(2),
      CONTENTS_NOT_SET(0);

      private final int value;

      ContentsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static GameboundIPCMessage.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static GameboundIPCMessage.ContentsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENTS_NOT_SET;
            case 1:
               return RPC_RESPONSE;
            case 2:
               return PUSH_NOTIFICATION;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
