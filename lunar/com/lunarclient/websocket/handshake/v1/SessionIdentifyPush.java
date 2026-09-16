package com.lunarclient.websocket.handshake.v1;

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

public final class SessionIdentifyPush extends GeneratedMessageV3 implements SessionIdentifyPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SESSION_ID_FIELD_NUMBER = 1;
   private Uuid sessionId_;
   private byte memoizedIsInitialized = -1;
   private static final SessionIdentifyPush DEFAULT_INSTANCE = new SessionIdentifyPush();
   private static final Parser<SessionIdentifyPush> PARSER = new AbstractParser<SessionIdentifyPush>() {
      public SessionIdentifyPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SessionIdentifyPush.Builder var3 = SessionIdentifyPush.newBuilder();

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

   private SessionIdentifyPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SessionIdentifyPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SessionIdentifyPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SessionIdentifyPush.class, SessionIdentifyPush.Builder.class);
   }

   @Override
   public boolean hasSessionId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getSessionId() {
      return this.sessionId_ == null ? Uuid.getDefaultInstance() : this.sessionId_;
   }

   @Override
   public UuidOrBuilder getSessionIdOrBuilder() {
      return this.sessionId_ == null ? Uuid.getDefaultInstance() : this.sessionId_;
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
         var1.writeMessage(1, this.getSessionId());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSessionId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SessionIdentifyPush)) {
         return super.equals(var1);
      } else {
         SessionIdentifyPush var2 = (SessionIdentifyPush)var1;
         if (this.hasSessionId() != var2.hasSessionId()) {
            return false;
         } else {
            return this.hasSessionId() && !this.getSessionId().equals(var2.getSessionId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSessionId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSessionId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SessionIdentifyPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SessionIdentifyPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SessionIdentifyPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SessionIdentifyPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SessionIdentifyPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SessionIdentifyPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SessionIdentifyPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SessionIdentifyPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SessionIdentifyPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SessionIdentifyPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SessionIdentifyPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SessionIdentifyPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SessionIdentifyPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SessionIdentifyPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SessionIdentifyPush.Builder newBuilder(SessionIdentifyPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SessionIdentifyPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SessionIdentifyPush.Builder() : new SessionIdentifyPush.Builder().mergeFrom(this);
   }

   protected SessionIdentifyPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SessionIdentifyPush.Builder(var1);
   }

   public static SessionIdentifyPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SessionIdentifyPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<SessionIdentifyPush> getParserForType() {
      return PARSER;
   }

   public SessionIdentifyPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SessionIdentifyPush.Builder> implements SessionIdentifyPushOrBuilder {
      private int bitField0_;
      private Uuid sessionId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> sessionIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SessionIdentifyPush.class, SessionIdentifyPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SessionIdentifyPush.alwaysUseFieldBuilders) {
            this.getSessionIdFieldBuilder();
         }
      }

      public SessionIdentifyPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sessionId_ = null;
         if (this.sessionIdBuilder_ != null) {
            this.sessionIdBuilder_.dispose();
            this.sessionIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_descriptor;
      }

      public SessionIdentifyPush getDefaultInstanceForType() {
         return SessionIdentifyPush.getDefaultInstance();
      }

      public SessionIdentifyPush build() {
         SessionIdentifyPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SessionIdentifyPush buildPartial() {
         SessionIdentifyPush var1 = new SessionIdentifyPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SessionIdentifyPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.sessionId_ = this.sessionIdBuilder_ == null ? this.sessionId_ : this.sessionIdBuilder_.build();
            var3 |= 1;
         }

         SessionIdentifyPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SessionIdentifyPush.Builder clone() {
         return (SessionIdentifyPush.Builder)super.clone();
      }

      public SessionIdentifyPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SessionIdentifyPush.Builder)super.setField(var1, var2);
      }

      public SessionIdentifyPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SessionIdentifyPush.Builder)super.clearField(var1);
      }

      public SessionIdentifyPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SessionIdentifyPush.Builder)super.clearOneof(var1);
      }

      public SessionIdentifyPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SessionIdentifyPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SessionIdentifyPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SessionIdentifyPush.Builder)super.addRepeatedField(var1, var2);
      }

      public SessionIdentifyPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof SessionIdentifyPush) {
            return this.mergeFrom((SessionIdentifyPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SessionIdentifyPush.Builder mergeFrom(SessionIdentifyPush var1) {
         if (var1 == SessionIdentifyPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSessionId()) {
            this.mergeSessionId(var1.getSessionId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SessionIdentifyPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSessionIdFieldBuilder().getBuilder(), var2);
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
      public boolean hasSessionId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getSessionId() {
         if (this.sessionIdBuilder_ == null) {
            return this.sessionId_ == null ? Uuid.getDefaultInstance() : this.sessionId_;
         } else {
            return this.sessionIdBuilder_.getMessage();
         }
      }

      public SessionIdentifyPush.Builder setSessionId(Uuid var1) {
         if (this.sessionIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sessionId_ = var1;
         } else {
            this.sessionIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SessionIdentifyPush.Builder setSessionId(Uuid.Builder var1) {
         if (this.sessionIdBuilder_ == null) {
            this.sessionId_ = var1.build();
         } else {
            this.sessionIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SessionIdentifyPush.Builder mergeSessionId(Uuid var1) {
         if (this.sessionIdBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.sessionId_ != null && this.sessionId_ != Uuid.getDefaultInstance()) {
               this.getSessionIdBuilder().mergeFrom(var1);
            } else {
               this.sessionId_ = var1;
            }
         } else {
            this.sessionIdBuilder_.mergeFrom(var1);
         }

         if (this.sessionId_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SessionIdentifyPush.Builder clearSessionId() {
         this.bitField0_ &= -2;
         this.sessionId_ = null;
         if (this.sessionIdBuilder_ != null) {
            this.sessionIdBuilder_.dispose();
            this.sessionIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getSessionIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSessionIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getSessionIdOrBuilder() {
         if (this.sessionIdBuilder_ != null) {
            return this.sessionIdBuilder_.getMessageOrBuilder();
         } else {
            return this.sessionId_ == null ? Uuid.getDefaultInstance() : this.sessionId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getSessionIdFieldBuilder() {
         if (this.sessionIdBuilder_ == null) {
            this.sessionIdBuilder_ = new SingleFieldBuilderV3<>(this.getSessionId(), this.getParentForChildren(), this.isClean());
            this.sessionId_ = null;
         }

         return this.sessionIdBuilder_;
      }

      public final SessionIdentifyPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SessionIdentifyPush.Builder)super.setUnknownFields(var1);
      }

      public final SessionIdentifyPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SessionIdentifyPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
