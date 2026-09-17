package com.lunarclient.websocket.conversation.v1;

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

public final class SystemPinnedMessageEvent extends GeneratedMessageV3 implements SystemPinnedMessageEventOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PINNED_MESSAGE_ID_FIELD_NUMBER = 1;
   private Uuid pinnedMessageId_;
   private byte memoizedIsInitialized = -1;
   private static final SystemPinnedMessageEvent DEFAULT_INSTANCE = new SystemPinnedMessageEvent();
   private static final Parser<SystemPinnedMessageEvent> PARSER = new AbstractParser<SystemPinnedMessageEvent>() {
      public SystemPinnedMessageEvent parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SystemPinnedMessageEvent.Builder var3 = SystemPinnedMessageEvent.newBuilder();

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

   private SystemPinnedMessageEvent(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SystemPinnedMessageEvent() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SystemPinnedMessageEvent();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SystemPinnedMessageEvent.class, SystemPinnedMessageEvent.Builder.class);
   }

   @Override
   public boolean hasPinnedMessageId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPinnedMessageId() {
      return this.pinnedMessageId_ == null ? Uuid.getDefaultInstance() : this.pinnedMessageId_;
   }

   @Override
   public UuidOrBuilder getPinnedMessageIdOrBuilder() {
      return this.pinnedMessageId_ == null ? Uuid.getDefaultInstance() : this.pinnedMessageId_;
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
         var1.writeMessage(1, this.getPinnedMessageId());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPinnedMessageId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SystemPinnedMessageEvent)) {
         return super.equals(var1);
      } else {
         SystemPinnedMessageEvent var2 = (SystemPinnedMessageEvent)var1;
         if (this.hasPinnedMessageId() != var2.hasPinnedMessageId()) {
            return false;
         } else {
            return this.hasPinnedMessageId() && !this.getPinnedMessageId().equals(var2.getPinnedMessageId())
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
      if (this.hasPinnedMessageId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPinnedMessageId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SystemPinnedMessageEvent parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemPinnedMessageEvent parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemPinnedMessageEvent parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemPinnedMessageEvent parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemPinnedMessageEvent parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemPinnedMessageEvent parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemPinnedMessageEvent parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemPinnedMessageEvent parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SystemPinnedMessageEvent parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SystemPinnedMessageEvent parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SystemPinnedMessageEvent parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemPinnedMessageEvent parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SystemPinnedMessageEvent.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SystemPinnedMessageEvent.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SystemPinnedMessageEvent.Builder newBuilder(SystemPinnedMessageEvent var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SystemPinnedMessageEvent.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SystemPinnedMessageEvent.Builder() : new SystemPinnedMessageEvent.Builder().mergeFrom(this);
   }

   protected SystemPinnedMessageEvent.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SystemPinnedMessageEvent.Builder(var1);
   }

   public static SystemPinnedMessageEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SystemPinnedMessageEvent> parser() {
      return PARSER;
   }

   @Override
   public Parser<SystemPinnedMessageEvent> getParserForType() {
      return PARSER;
   }

   public SystemPinnedMessageEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SystemPinnedMessageEvent.Builder> implements SystemPinnedMessageEventOrBuilder {
      private int bitField0_;
      private Uuid pinnedMessageId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> pinnedMessageIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SystemPinnedMessageEvent.class, SystemPinnedMessageEvent.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SystemPinnedMessageEvent.alwaysUseFieldBuilders) {
            this.getPinnedMessageIdFieldBuilder();
         }
      }

      public SystemPinnedMessageEvent.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.pinnedMessageId_ = null;
         if (this.pinnedMessageIdBuilder_ != null) {
            this.pinnedMessageIdBuilder_.dispose();
            this.pinnedMessageIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemPinnedMessageEvent_descriptor;
      }

      public SystemPinnedMessageEvent getDefaultInstanceForType() {
         return SystemPinnedMessageEvent.getDefaultInstance();
      }

      public SystemPinnedMessageEvent build() {
         SystemPinnedMessageEvent var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SystemPinnedMessageEvent buildPartial() {
         SystemPinnedMessageEvent var1 = new SystemPinnedMessageEvent(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SystemPinnedMessageEvent var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.pinnedMessageId_ = this.pinnedMessageIdBuilder_ == null ? this.pinnedMessageId_ : this.pinnedMessageIdBuilder_.build();
            var3 |= 1;
         }

         SystemPinnedMessageEvent var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SystemPinnedMessageEvent.Builder clone() {
         return (SystemPinnedMessageEvent.Builder)super.clone();
      }

      public SystemPinnedMessageEvent.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemPinnedMessageEvent.Builder)super.setField(var1, var2);
      }

      public SystemPinnedMessageEvent.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SystemPinnedMessageEvent.Builder)super.clearField(var1);
      }

      public SystemPinnedMessageEvent.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SystemPinnedMessageEvent.Builder)super.clearOneof(var1);
      }

      public SystemPinnedMessageEvent.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SystemPinnedMessageEvent.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SystemPinnedMessageEvent.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemPinnedMessageEvent.Builder)super.addRepeatedField(var1, var2);
      }

      public SystemPinnedMessageEvent.Builder mergeFrom(Message var1) {
         if (var1 instanceof SystemPinnedMessageEvent) {
            return this.mergeFrom((SystemPinnedMessageEvent)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SystemPinnedMessageEvent.Builder mergeFrom(SystemPinnedMessageEvent var1) {
         if (var1 == SystemPinnedMessageEvent.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPinnedMessageId()) {
            this.mergePinnedMessageId(var1.getPinnedMessageId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SystemPinnedMessageEvent.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPinnedMessageIdFieldBuilder().getBuilder(), var2);
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
      public boolean hasPinnedMessageId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPinnedMessageId() {
         if (this.pinnedMessageIdBuilder_ == null) {
            return this.pinnedMessageId_ == null ? Uuid.getDefaultInstance() : this.pinnedMessageId_;
         } else {
            return this.pinnedMessageIdBuilder_.getMessage();
         }
      }

      public SystemPinnedMessageEvent.Builder setPinnedMessageId(Uuid var1) {
         if (this.pinnedMessageIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.pinnedMessageId_ = var1;
         } else {
            this.pinnedMessageIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SystemPinnedMessageEvent.Builder setPinnedMessageId(Uuid.Builder var1) {
         if (this.pinnedMessageIdBuilder_ == null) {
            this.pinnedMessageId_ = var1.build();
         } else {
            this.pinnedMessageIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SystemPinnedMessageEvent.Builder mergePinnedMessageId(Uuid var1) {
         if (this.pinnedMessageIdBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.pinnedMessageId_ != null && this.pinnedMessageId_ != Uuid.getDefaultInstance()) {
               this.getPinnedMessageIdBuilder().mergeFrom(var1);
            } else {
               this.pinnedMessageId_ = var1;
            }
         } else {
            this.pinnedMessageIdBuilder_.mergeFrom(var1);
         }

         if (this.pinnedMessageId_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SystemPinnedMessageEvent.Builder clearPinnedMessageId() {
         this.bitField0_ &= -2;
         this.pinnedMessageId_ = null;
         if (this.pinnedMessageIdBuilder_ != null) {
            this.pinnedMessageIdBuilder_.dispose();
            this.pinnedMessageIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPinnedMessageIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPinnedMessageIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPinnedMessageIdOrBuilder() {
         if (this.pinnedMessageIdBuilder_ != null) {
            return this.pinnedMessageIdBuilder_.getMessageOrBuilder();
         } else {
            return this.pinnedMessageId_ == null ? Uuid.getDefaultInstance() : this.pinnedMessageId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPinnedMessageIdFieldBuilder() {
         if (this.pinnedMessageIdBuilder_ == null) {
            this.pinnedMessageIdBuilder_ = new SingleFieldBuilderV3<>(this.getPinnedMessageId(), this.getParentForChildren(), this.isClean());
            this.pinnedMessageId_ = null;
         }

         return this.pinnedMessageIdBuilder_;
      }

      public final SystemPinnedMessageEvent.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SystemPinnedMessageEvent.Builder)super.setUnknownFields(var1);
      }

      public final SystemPinnedMessageEvent.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SystemPinnedMessageEvent.Builder)super.mergeUnknownFields(var1);
      }
   }
}
