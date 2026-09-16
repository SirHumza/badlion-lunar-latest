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
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SystemLeaveEvent extends GeneratedMessageV3 implements SystemLeaveEventOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   private byte memoizedIsInitialized = -1;
   private static final SystemLeaveEvent DEFAULT_INSTANCE = new SystemLeaveEvent();
   private static final Parser<SystemLeaveEvent> PARSER = new AbstractParser<SystemLeaveEvent>() {
      public SystemLeaveEvent parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SystemLeaveEvent.Builder var3 = SystemLeaveEvent.newBuilder();

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

   private SystemLeaveEvent(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SystemLeaveEvent() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SystemLeaveEvent();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SystemLeaveEvent.class, SystemLeaveEvent.Builder.class);
   }

   @Override
   public boolean hasPlayer() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getPlayer() {
      return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
   }

   @Override
   public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
      return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
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
         var1.writeMessage(1, this.getPlayer());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayer());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SystemLeaveEvent)) {
         return super.equals(var1);
      } else {
         SystemLeaveEvent var2 = (SystemLeaveEvent)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else {
            return this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayer()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayer().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SystemLeaveEvent parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemLeaveEvent parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemLeaveEvent parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemLeaveEvent parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemLeaveEvent parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemLeaveEvent parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemLeaveEvent parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemLeaveEvent parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SystemLeaveEvent parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SystemLeaveEvent parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SystemLeaveEvent parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemLeaveEvent parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SystemLeaveEvent.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SystemLeaveEvent.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SystemLeaveEvent.Builder newBuilder(SystemLeaveEvent var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SystemLeaveEvent.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SystemLeaveEvent.Builder() : new SystemLeaveEvent.Builder().mergeFrom(this);
   }

   protected SystemLeaveEvent.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SystemLeaveEvent.Builder(var1);
   }

   public static SystemLeaveEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SystemLeaveEvent> parser() {
      return PARSER;
   }

   @Override
   public Parser<SystemLeaveEvent> getParserForType() {
      return PARSER;
   }

   public SystemLeaveEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SystemLeaveEvent.Builder> implements SystemLeaveEventOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SystemLeaveEvent.class, SystemLeaveEvent.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SystemLeaveEvent.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
         }
      }

      public SystemLeaveEvent.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemLeaveEvent_descriptor;
      }

      public SystemLeaveEvent getDefaultInstanceForType() {
         return SystemLeaveEvent.getDefaultInstance();
      }

      public SystemLeaveEvent build() {
         SystemLeaveEvent var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SystemLeaveEvent buildPartial() {
         SystemLeaveEvent var1 = new SystemLeaveEvent(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SystemLeaveEvent var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         SystemLeaveEvent var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SystemLeaveEvent.Builder clone() {
         return (SystemLeaveEvent.Builder)super.clone();
      }

      public SystemLeaveEvent.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemLeaveEvent.Builder)super.setField(var1, var2);
      }

      public SystemLeaveEvent.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SystemLeaveEvent.Builder)super.clearField(var1);
      }

      public SystemLeaveEvent.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SystemLeaveEvent.Builder)super.clearOneof(var1);
      }

      public SystemLeaveEvent.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SystemLeaveEvent.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SystemLeaveEvent.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemLeaveEvent.Builder)super.addRepeatedField(var1, var2);
      }

      public SystemLeaveEvent.Builder mergeFrom(Message var1) {
         if (var1 instanceof SystemLeaveEvent) {
            return this.mergeFrom((SystemLeaveEvent)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SystemLeaveEvent.Builder mergeFrom(SystemLeaveEvent var1) {
         if (var1 == SystemLeaveEvent.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SystemLeaveEvent.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerFieldBuilder().getBuilder(), var2);
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
      public boolean hasPlayer() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getPlayer() {
         if (this.playerBuilder_ == null) {
            return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
         } else {
            return this.playerBuilder_.getMessage();
         }
      }

      public SystemLeaveEvent.Builder setPlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.player_ = var1;
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SystemLeaveEvent.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SystemLeaveEvent.Builder mergePlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.player_ != null && this.player_ != UuidAndUsername.getDefaultInstance()) {
               this.getPlayerBuilder().mergeFrom(var1);
            } else {
               this.player_ = var1;
            }
         } else {
            this.playerBuilder_.mergeFrom(var1);
         }

         if (this.player_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SystemLeaveEvent.Builder clearPlayer() {
         this.bitField0_ &= -2;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getPlayerBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
         if (this.playerBuilder_ != null) {
            return this.playerBuilder_.getMessageOrBuilder();
         } else {
            return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getPlayerFieldBuilder() {
         if (this.playerBuilder_ == null) {
            this.playerBuilder_ = new SingleFieldBuilderV3<>(this.getPlayer(), this.getParentForChildren(), this.isClean());
            this.player_ = null;
         }

         return this.playerBuilder_;
      }

      public final SystemLeaveEvent.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SystemLeaveEvent.Builder)super.setUnknownFields(var1);
      }

      public final SystemLeaveEvent.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SystemLeaveEvent.Builder)super.mergeUnknownFields(var1);
      }
   }
}
