package com.lunarclient.websocket.hostedworld.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class JoinHostedWorldPush extends GeneratedMessageV3 implements JoinHostedWorldPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RELAY_FIELD_NUMBER = 1;
   private AddressAndPort relay_;
   public static final int RELAY_SESSION_ID_FIELD_NUMBER = 2;
   private volatile Object relaySessionId_ = "";
   public static final int JOINER_UUID_FIELD_NUMBER = 3;
   private Uuid joinerUuid_;
   public static final int SIMPLE_VOICE_CHAT_ENDPOINT_FIELD_NUMBER = 4;
   private AddressAndPort simpleVoiceChatEndpoint_;
   private byte memoizedIsInitialized = -1;
   private static final JoinHostedWorldPush DEFAULT_INSTANCE = new JoinHostedWorldPush();
   private static final Parser<JoinHostedWorldPush> PARSER = new AbstractParser<JoinHostedWorldPush>() {
      public JoinHostedWorldPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         JoinHostedWorldPush.Builder var3 = JoinHostedWorldPush.newBuilder();

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

   private JoinHostedWorldPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private JoinHostedWorldPush() {
      this.relaySessionId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new JoinHostedWorldPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(JoinHostedWorldPush.class, JoinHostedWorldPush.Builder.class);
   }

   @Override
   public boolean hasRelay() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public AddressAndPort getRelay() {
      return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
   }

   @Override
   public AddressAndPortOrBuilder getRelayOrBuilder() {
      return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
   }

   @Override
   public String getRelaySessionId() {
      Object var1 = this.relaySessionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.relaySessionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getRelaySessionIdBytes() {
      Object var1 = this.relaySessionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.relaySessionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasJoinerUuid() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Uuid getJoinerUuid() {
      return this.joinerUuid_ == null ? Uuid.getDefaultInstance() : this.joinerUuid_;
   }

   @Override
   public UuidOrBuilder getJoinerUuidOrBuilder() {
      return this.joinerUuid_ == null ? Uuid.getDefaultInstance() : this.joinerUuid_;
   }

   @Override
   public boolean hasSimpleVoiceChatEndpoint() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public AddressAndPort getSimpleVoiceChatEndpoint() {
      return this.simpleVoiceChatEndpoint_ == null ? AddressAndPort.getDefaultInstance() : this.simpleVoiceChatEndpoint_;
   }

   @Override
   public AddressAndPortOrBuilder getSimpleVoiceChatEndpointOrBuilder() {
      return this.simpleVoiceChatEndpoint_ == null ? AddressAndPort.getDefaultInstance() : this.simpleVoiceChatEndpoint_;
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
         var1.writeMessage(1, this.getRelay());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.relaySessionId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.relaySessionId_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getJoinerUuid());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getSimpleVoiceChatEndpoint());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getRelay());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.relaySessionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.relaySessionId_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getJoinerUuid());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getSimpleVoiceChatEndpoint());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof JoinHostedWorldPush)) {
         return super.equals(var1);
      } else {
         JoinHostedWorldPush var2 = (JoinHostedWorldPush)var1;
         if (this.hasRelay() != var2.hasRelay()) {
            return false;
         } else if (this.hasRelay() && !this.getRelay().equals(var2.getRelay())) {
            return false;
         } else if (!this.getRelaySessionId().equals(var2.getRelaySessionId())) {
            return false;
         } else if (this.hasJoinerUuid() != var2.hasJoinerUuid()) {
            return false;
         } else if (this.hasJoinerUuid() && !this.getJoinerUuid().equals(var2.getJoinerUuid())) {
            return false;
         } else if (this.hasSimpleVoiceChatEndpoint() != var2.hasSimpleVoiceChatEndpoint()) {
            return false;
         } else {
            return this.hasSimpleVoiceChatEndpoint() && !this.getSimpleVoiceChatEndpoint().equals(var2.getSimpleVoiceChatEndpoint())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasRelay()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getRelay().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getRelaySessionId().hashCode();
      if (this.hasJoinerUuid()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getJoinerUuid().hashCode();
      }

      if (this.hasSimpleVoiceChatEndpoint()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getSimpleVoiceChatEndpoint().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static JoinHostedWorldPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static JoinHostedWorldPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static JoinHostedWorldPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public JoinHostedWorldPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static JoinHostedWorldPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static JoinHostedWorldPush.Builder newBuilder(JoinHostedWorldPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public JoinHostedWorldPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new JoinHostedWorldPush.Builder() : new JoinHostedWorldPush.Builder().mergeFrom(this);
   }

   protected JoinHostedWorldPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new JoinHostedWorldPush.Builder(var1);
   }

   public static JoinHostedWorldPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<JoinHostedWorldPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<JoinHostedWorldPush> getParserForType() {
      return PARSER;
   }

   public JoinHostedWorldPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<JoinHostedWorldPush.Builder> implements JoinHostedWorldPushOrBuilder {
      private int bitField0_;
      private AddressAndPort relay_;
      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> relayBuilder_;
      private Object relaySessionId_ = "";
      private Uuid joinerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> joinerUuidBuilder_;
      private AddressAndPort simpleVoiceChatEndpoint_;
      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> simpleVoiceChatEndpointBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(JoinHostedWorldPush.class, JoinHostedWorldPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (JoinHostedWorldPush.alwaysUseFieldBuilders) {
            this.getRelayFieldBuilder();
            this.getJoinerUuidFieldBuilder();
            this.getSimpleVoiceChatEndpointFieldBuilder();
         }
      }

      public JoinHostedWorldPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.relay_ = null;
         if (this.relayBuilder_ != null) {
            this.relayBuilder_.dispose();
            this.relayBuilder_ = null;
         }

         this.relaySessionId_ = "";
         this.joinerUuid_ = null;
         if (this.joinerUuidBuilder_ != null) {
            this.joinerUuidBuilder_.dispose();
            this.joinerUuidBuilder_ = null;
         }

         this.simpleVoiceChatEndpoint_ = null;
         if (this.simpleVoiceChatEndpointBuilder_ != null) {
            this.simpleVoiceChatEndpointBuilder_.dispose();
            this.simpleVoiceChatEndpointBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldPush_descriptor;
      }

      public JoinHostedWorldPush getDefaultInstanceForType() {
         return JoinHostedWorldPush.getDefaultInstance();
      }

      public JoinHostedWorldPush build() {
         JoinHostedWorldPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public JoinHostedWorldPush buildPartial() {
         JoinHostedWorldPush var1 = new JoinHostedWorldPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(JoinHostedWorldPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.relay_ = this.relayBuilder_ == null ? this.relay_ : this.relayBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.relaySessionId_ = this.relaySessionId_;
         }

         if ((var2 & 4) != 0) {
            var1.joinerUuid_ = this.joinerUuidBuilder_ == null ? this.joinerUuid_ : this.joinerUuidBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.simpleVoiceChatEndpoint_ = this.simpleVoiceChatEndpointBuilder_ == null
               ? this.simpleVoiceChatEndpoint_
               : this.simpleVoiceChatEndpointBuilder_.build();
            var3 |= 4;
         }

         JoinHostedWorldPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public JoinHostedWorldPush.Builder clone() {
         return (JoinHostedWorldPush.Builder)super.clone();
      }

      public JoinHostedWorldPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinHostedWorldPush.Builder)super.setField(var1, var2);
      }

      public JoinHostedWorldPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (JoinHostedWorldPush.Builder)super.clearField(var1);
      }

      public JoinHostedWorldPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (JoinHostedWorldPush.Builder)super.clearOneof(var1);
      }

      public JoinHostedWorldPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (JoinHostedWorldPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public JoinHostedWorldPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinHostedWorldPush.Builder)super.addRepeatedField(var1, var2);
      }

      public JoinHostedWorldPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof JoinHostedWorldPush) {
            return this.mergeFrom((JoinHostedWorldPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public JoinHostedWorldPush.Builder mergeFrom(JoinHostedWorldPush var1) {
         if (var1 == JoinHostedWorldPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasRelay()) {
            this.mergeRelay(var1.getRelay());
         }

         if (!var1.getRelaySessionId().isEmpty()) {
            this.relaySessionId_ = var1.relaySessionId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.hasJoinerUuid()) {
            this.mergeJoinerUuid(var1.getJoinerUuid());
         }

         if (var1.hasSimpleVoiceChatEndpoint()) {
            this.mergeSimpleVoiceChatEndpoint(var1.getSimpleVoiceChatEndpoint());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public JoinHostedWorldPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getRelayFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.relaySessionId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getJoinerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getSimpleVoiceChatEndpointFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
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
      public boolean hasRelay() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public AddressAndPort getRelay() {
         if (this.relayBuilder_ == null) {
            return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
         } else {
            return this.relayBuilder_.getMessage();
         }
      }

      public JoinHostedWorldPush.Builder setRelay(AddressAndPort var1) {
         if (this.relayBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.relay_ = var1;
         } else {
            this.relayBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder setRelay(AddressAndPort.Builder var1) {
         if (this.relayBuilder_ == null) {
            this.relay_ = var1.build();
         } else {
            this.relayBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder mergeRelay(AddressAndPort var1) {
         if (this.relayBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.relay_ != null && this.relay_ != AddressAndPort.getDefaultInstance()) {
               this.getRelayBuilder().mergeFrom(var1);
            } else {
               this.relay_ = var1;
            }
         } else {
            this.relayBuilder_.mergeFrom(var1);
         }

         if (this.relay_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public JoinHostedWorldPush.Builder clearRelay() {
         this.bitField0_ &= -2;
         this.relay_ = null;
         if (this.relayBuilder_ != null) {
            this.relayBuilder_.dispose();
            this.relayBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder getRelayBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getRelayFieldBuilder().getBuilder();
      }

      @Override
      public AddressAndPortOrBuilder getRelayOrBuilder() {
         if (this.relayBuilder_ != null) {
            return this.relayBuilder_.getMessageOrBuilder();
         } else {
            return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
         }
      }

      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getRelayFieldBuilder() {
         if (this.relayBuilder_ == null) {
            this.relayBuilder_ = new SingleFieldBuilderV3<>(this.getRelay(), this.getParentForChildren(), this.isClean());
            this.relay_ = null;
         }

         return this.relayBuilder_;
      }

      @Override
      public String getRelaySessionId() {
         Object var1 = this.relaySessionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.relaySessionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRelaySessionIdBytes() {
         Object var1 = this.relaySessionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.relaySessionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public JoinHostedWorldPush.Builder setRelaySessionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.relaySessionId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder clearRelaySessionId() {
         this.relaySessionId_ = JoinHostedWorldPush.getDefaultInstance().getRelaySessionId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder setRelaySessionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         JoinHostedWorldPush.checkByteStringIsUtf8(var1);
         this.relaySessionId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasJoinerUuid() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Uuid getJoinerUuid() {
         if (this.joinerUuidBuilder_ == null) {
            return this.joinerUuid_ == null ? Uuid.getDefaultInstance() : this.joinerUuid_;
         } else {
            return this.joinerUuidBuilder_.getMessage();
         }
      }

      public JoinHostedWorldPush.Builder setJoinerUuid(Uuid var1) {
         if (this.joinerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.joinerUuid_ = var1;
         } else {
            this.joinerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder setJoinerUuid(Uuid.Builder var1) {
         if (this.joinerUuidBuilder_ == null) {
            this.joinerUuid_ = var1.build();
         } else {
            this.joinerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder mergeJoinerUuid(Uuid var1) {
         if (this.joinerUuidBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.joinerUuid_ != null && this.joinerUuid_ != Uuid.getDefaultInstance()) {
               this.getJoinerUuidBuilder().mergeFrom(var1);
            } else {
               this.joinerUuid_ = var1;
            }
         } else {
            this.joinerUuidBuilder_.mergeFrom(var1);
         }

         if (this.joinerUuid_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public JoinHostedWorldPush.Builder clearJoinerUuid() {
         this.bitField0_ &= -5;
         this.joinerUuid_ = null;
         if (this.joinerUuidBuilder_ != null) {
            this.joinerUuidBuilder_.dispose();
            this.joinerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getJoinerUuidBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getJoinerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getJoinerUuidOrBuilder() {
         if (this.joinerUuidBuilder_ != null) {
            return this.joinerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.joinerUuid_ == null ? Uuid.getDefaultInstance() : this.joinerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getJoinerUuidFieldBuilder() {
         if (this.joinerUuidBuilder_ == null) {
            this.joinerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getJoinerUuid(), this.getParentForChildren(), this.isClean());
            this.joinerUuid_ = null;
         }

         return this.joinerUuidBuilder_;
      }

      @Override
      public boolean hasSimpleVoiceChatEndpoint() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public AddressAndPort getSimpleVoiceChatEndpoint() {
         if (this.simpleVoiceChatEndpointBuilder_ == null) {
            return this.simpleVoiceChatEndpoint_ == null ? AddressAndPort.getDefaultInstance() : this.simpleVoiceChatEndpoint_;
         } else {
            return this.simpleVoiceChatEndpointBuilder_.getMessage();
         }
      }

      public JoinHostedWorldPush.Builder setSimpleVoiceChatEndpoint(AddressAndPort var1) {
         if (this.simpleVoiceChatEndpointBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.simpleVoiceChatEndpoint_ = var1;
         } else {
            this.simpleVoiceChatEndpointBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder setSimpleVoiceChatEndpoint(AddressAndPort.Builder var1) {
         if (this.simpleVoiceChatEndpointBuilder_ == null) {
            this.simpleVoiceChatEndpoint_ = var1.build();
         } else {
            this.simpleVoiceChatEndpointBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldPush.Builder mergeSimpleVoiceChatEndpoint(AddressAndPort var1) {
         if (this.simpleVoiceChatEndpointBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.simpleVoiceChatEndpoint_ != null && this.simpleVoiceChatEndpoint_ != AddressAndPort.getDefaultInstance()) {
               this.getSimpleVoiceChatEndpointBuilder().mergeFrom(var1);
            } else {
               this.simpleVoiceChatEndpoint_ = var1;
            }
         } else {
            this.simpleVoiceChatEndpointBuilder_.mergeFrom(var1);
         }

         if (this.simpleVoiceChatEndpoint_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public JoinHostedWorldPush.Builder clearSimpleVoiceChatEndpoint() {
         this.bitField0_ &= -9;
         this.simpleVoiceChatEndpoint_ = null;
         if (this.simpleVoiceChatEndpointBuilder_ != null) {
            this.simpleVoiceChatEndpointBuilder_.dispose();
            this.simpleVoiceChatEndpointBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder getSimpleVoiceChatEndpointBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getSimpleVoiceChatEndpointFieldBuilder().getBuilder();
      }

      @Override
      public AddressAndPortOrBuilder getSimpleVoiceChatEndpointOrBuilder() {
         if (this.simpleVoiceChatEndpointBuilder_ != null) {
            return this.simpleVoiceChatEndpointBuilder_.getMessageOrBuilder();
         } else {
            return this.simpleVoiceChatEndpoint_ == null ? AddressAndPort.getDefaultInstance() : this.simpleVoiceChatEndpoint_;
         }
      }

      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getSimpleVoiceChatEndpointFieldBuilder() {
         if (this.simpleVoiceChatEndpointBuilder_ == null) {
            this.simpleVoiceChatEndpointBuilder_ = new SingleFieldBuilderV3<>(this.getSimpleVoiceChatEndpoint(), this.getParentForChildren(), this.isClean());
            this.simpleVoiceChatEndpoint_ = null;
         }

         return this.simpleVoiceChatEndpointBuilder_;
      }

      public final JoinHostedWorldPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (JoinHostedWorldPush.Builder)super.setUnknownFields(var1);
      }

      public final JoinHostedWorldPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (JoinHostedWorldPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
