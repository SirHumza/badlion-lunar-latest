package com.lunarclient.websocket.protocol.v1;

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

public final class ClientboundWebSocketMessage extends GeneratedMessageV3 implements ClientboundWebSocketMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int RPC_RESPONSE_FIELD_NUMBER = 1;
   public static final int PUSH_NOTIFICATION_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final ClientboundWebSocketMessage DEFAULT_INSTANCE = new ClientboundWebSocketMessage();
   private static final Parser<ClientboundWebSocketMessage> PARSER = new AbstractParser<ClientboundWebSocketMessage>() {
      public ClientboundWebSocketMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClientboundWebSocketMessage.Builder var3 = ClientboundWebSocketMessage.newBuilder();

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

   private ClientboundWebSocketMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClientboundWebSocketMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClientboundWebSocketMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClientboundWebSocketMessage.class, ClientboundWebSocketMessage.Builder.class);
   }

   @Override
   public ClientboundWebSocketMessage.ContentsCase getContentsCase() {
      return ClientboundWebSocketMessage.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasRpcResponse() {
      return this.contentsCase_ == 1;
   }

   @Override
   public WebSocketRpcResponse getRpcResponse() {
      return this.contentsCase_ == 1 ? (WebSocketRpcResponse)this.contents_ : WebSocketRpcResponse.getDefaultInstance();
   }

   @Override
   public WebSocketRpcResponseOrBuilder getRpcResponseOrBuilder() {
      return this.contentsCase_ == 1 ? (WebSocketRpcResponse)this.contents_ : WebSocketRpcResponse.getDefaultInstance();
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
         var1.writeMessage(1, (WebSocketRpcResponse)this.contents_);
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
         var1 += CodedOutputStream.computeMessageSize(1, (WebSocketRpcResponse)this.contents_);
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

      if (!(var1 instanceof ClientboundWebSocketMessage)) {
         return super.equals(var1);
      }

      ClientboundWebSocketMessage var2 = (ClientboundWebSocketMessage)var1;
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

   public static ClientboundWebSocketMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClientboundWebSocketMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClientboundWebSocketMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClientboundWebSocketMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClientboundWebSocketMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClientboundWebSocketMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClientboundWebSocketMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClientboundWebSocketMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClientboundWebSocketMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClientboundWebSocketMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClientboundWebSocketMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClientboundWebSocketMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClientboundWebSocketMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClientboundWebSocketMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClientboundWebSocketMessage.Builder newBuilder(ClientboundWebSocketMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClientboundWebSocketMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClientboundWebSocketMessage.Builder() : new ClientboundWebSocketMessage.Builder().mergeFrom(this);
   }

   protected ClientboundWebSocketMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClientboundWebSocketMessage.Builder(var1);
   }

   public static ClientboundWebSocketMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClientboundWebSocketMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClientboundWebSocketMessage> getParserForType() {
      return PARSER;
   }

   public ClientboundWebSocketMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ClientboundWebSocketMessage.Builder> implements ClientboundWebSocketMessageOrBuilder {
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<WebSocketRpcResponse, WebSocketRpcResponse.Builder, WebSocketRpcResponseOrBuilder> rpcResponseBuilder_;
      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> pushNotificationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClientboundWebSocketMessage.class, ClientboundWebSocketMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ClientboundWebSocketMessage.Builder clear() {
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
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ClientboundWebSocketMessage_descriptor;
      }

      public ClientboundWebSocketMessage getDefaultInstanceForType() {
         return ClientboundWebSocketMessage.getDefaultInstance();
      }

      public ClientboundWebSocketMessage build() {
         ClientboundWebSocketMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClientboundWebSocketMessage buildPartial() {
         ClientboundWebSocketMessage var1 = new ClientboundWebSocketMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClientboundWebSocketMessage var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(ClientboundWebSocketMessage var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 1 && this.rpcResponseBuilder_ != null) {
            var1.contents_ = this.rpcResponseBuilder_.build();
         }

         if (this.contentsCase_ == 2 && this.pushNotificationBuilder_ != null) {
            var1.contents_ = this.pushNotificationBuilder_.build();
         }
      }

      public ClientboundWebSocketMessage.Builder clone() {
         return (ClientboundWebSocketMessage.Builder)super.clone();
      }

      public ClientboundWebSocketMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClientboundWebSocketMessage.Builder)super.setField(var1, var2);
      }

      public ClientboundWebSocketMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClientboundWebSocketMessage.Builder)super.clearField(var1);
      }

      public ClientboundWebSocketMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClientboundWebSocketMessage.Builder)super.clearOneof(var1);
      }

      public ClientboundWebSocketMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClientboundWebSocketMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClientboundWebSocketMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClientboundWebSocketMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ClientboundWebSocketMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClientboundWebSocketMessage) {
            return this.mergeFrom((ClientboundWebSocketMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClientboundWebSocketMessage.Builder mergeFrom(ClientboundWebSocketMessage var1) {
         if (var1 == ClientboundWebSocketMessage.getDefaultInstance()) {
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

      public ClientboundWebSocketMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
      public ClientboundWebSocketMessage.ContentsCase getContentsCase() {
         return ClientboundWebSocketMessage.ContentsCase.forNumber(this.contentsCase_);
      }

      public ClientboundWebSocketMessage.Builder clearContents() {
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
      public WebSocketRpcResponse getRpcResponse() {
         if (this.rpcResponseBuilder_ == null) {
            return this.contentsCase_ == 1 ? (WebSocketRpcResponse)this.contents_ : WebSocketRpcResponse.getDefaultInstance();
         } else {
            return this.contentsCase_ == 1 ? this.rpcResponseBuilder_.getMessage() : WebSocketRpcResponse.getDefaultInstance();
         }
      }

      public ClientboundWebSocketMessage.Builder setRpcResponse(WebSocketRpcResponse var1) {
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

      public ClientboundWebSocketMessage.Builder setRpcResponse(WebSocketRpcResponse.Builder var1) {
         if (this.rpcResponseBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.rpcResponseBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 1;
         return this;
      }

      public ClientboundWebSocketMessage.Builder mergeRpcResponse(WebSocketRpcResponse var1) {
         if (this.rpcResponseBuilder_ == null) {
            if (this.contentsCase_ == 1 && this.contents_ != WebSocketRpcResponse.getDefaultInstance()) {
               this.contents_ = WebSocketRpcResponse.newBuilder((WebSocketRpcResponse)this.contents_).mergeFrom(var1).buildPartial();
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

      public ClientboundWebSocketMessage.Builder clearRpcResponse() {
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

      public WebSocketRpcResponse.Builder getRpcResponseBuilder() {
         return this.getRpcResponseFieldBuilder().getBuilder();
      }

      @Override
      public WebSocketRpcResponseOrBuilder getRpcResponseOrBuilder() {
         if (this.contentsCase_ == 1 && this.rpcResponseBuilder_ != null) {
            return this.rpcResponseBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 1 ? (WebSocketRpcResponse)this.contents_ : WebSocketRpcResponse.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<WebSocketRpcResponse, WebSocketRpcResponse.Builder, WebSocketRpcResponseOrBuilder> getRpcResponseFieldBuilder() {
         if (this.rpcResponseBuilder_ == null) {
            if (this.contentsCase_ != 1) {
               this.contents_ = WebSocketRpcResponse.getDefaultInstance();
            }

            this.rpcResponseBuilder_ = new SingleFieldBuilderV3<>((WebSocketRpcResponse)this.contents_, this.getParentForChildren(), this.isClean());
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

      public ClientboundWebSocketMessage.Builder setPushNotification(Any var1) {
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

      public ClientboundWebSocketMessage.Builder setPushNotification(Any.Builder var1) {
         if (this.pushNotificationBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.pushNotificationBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ClientboundWebSocketMessage.Builder mergePushNotification(Any var1) {
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

      public ClientboundWebSocketMessage.Builder clearPushNotification() {
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

      public final ClientboundWebSocketMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClientboundWebSocketMessage.Builder)super.setUnknownFields(var1);
      }

      public final ClientboundWebSocketMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClientboundWebSocketMessage.Builder)super.mergeUnknownFields(var1);
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
      public static ClientboundWebSocketMessage.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ClientboundWebSocketMessage.ContentsCase forNumber(int var0) {
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
