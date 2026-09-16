package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationSender extends GeneratedMessageV3 implements ConversationSenderOrBuilder {
   private static final long serialVersionUID = 0L;
   private int senderCase_ = 0;
   private Object sender_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private byte memoizedIsInitialized = -1;
   private static final ConversationSender DEFAULT_INSTANCE = new ConversationSender();
   private static final Parser<ConversationSender> PARSER = new AbstractParser<ConversationSender>() {
      public ConversationSender parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationSender.Builder var3 = ConversationSender.newBuilder();

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

   private ConversationSender(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationSender() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationSender();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationSender_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationSender_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationSender.class, ConversationSender.Builder.class);
   }

   @Override
   public ConversationSender.SenderCase getSenderCase() {
      return ConversationSender.SenderCase.forNumber(this.senderCase_);
   }

   @Override
   public boolean hasPlayer() {
      return this.senderCase_ == 1;
   }

   @Override
   public UuidAndUsername getPlayer() {
      return this.senderCase_ == 1 ? (UuidAndUsername)this.sender_ : UuidAndUsername.getDefaultInstance();
   }

   @Override
   public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
      return this.senderCase_ == 1 ? (UuidAndUsername)this.sender_ : UuidAndUsername.getDefaultInstance();
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
      if (this.senderCase_ == 1) {
         var1.writeMessage(1, (UuidAndUsername)this.sender_);
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
      if (this.senderCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (UuidAndUsername)this.sender_);
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

      if (!(var1 instanceof ConversationSender)) {
         return super.equals(var1);
      }

      ConversationSender var2 = (ConversationSender)var1;
      if (!this.getSenderCase().equals(var2.getSenderCase())) {
         return false;
      }

      switch (this.senderCase_) {
         case 1:
            if (!this.getPlayer().equals(var2.getPlayer())) {
               return false;
            }
         case 0:
         default:
            return this.getUnknownFields().equals(var2.getUnknownFields());
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.senderCase_) {
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getPlayer().hashCode();
         case 0:
         default:
            var1 = 29 * var1 + this.getUnknownFields().hashCode();
            this.memoizedHashCode = var1;
            return var1;
      }
   }

   public static ConversationSender parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationSender parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationSender parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationSender parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationSender parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationSender parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationSender parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationSender parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationSender parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationSender parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationSender parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationSender parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationSender.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationSender.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationSender.Builder newBuilder(ConversationSender var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationSender.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationSender.Builder() : new ConversationSender.Builder().mergeFrom(this);
   }

   protected ConversationSender.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationSender.Builder(var1);
   }

   public static ConversationSender getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationSender> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationSender> getParserForType() {
      return PARSER;
   }

   public ConversationSender getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationSender.Builder> implements ConversationSenderOrBuilder {
      private int senderCase_ = 0;
      private Object sender_;
      private int bitField0_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationSender_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationSender_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationSender.class, ConversationSender.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ConversationSender.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.clear();
         }

         this.senderCase_ = 0;
         this.sender_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationSender_descriptor;
      }

      public ConversationSender getDefaultInstanceForType() {
         return ConversationSender.getDefaultInstance();
      }

      public ConversationSender build() {
         ConversationSender var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationSender buildPartial() {
         ConversationSender var1 = new ConversationSender(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationSender var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(ConversationSender var1) {
         var1.senderCase_ = this.senderCase_;
         var1.sender_ = this.sender_;
         if (this.senderCase_ == 1 && this.playerBuilder_ != null) {
            var1.sender_ = this.playerBuilder_.build();
         }
      }

      public ConversationSender.Builder clone() {
         return (ConversationSender.Builder)super.clone();
      }

      public ConversationSender.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationSender.Builder)super.setField(var1, var2);
      }

      public ConversationSender.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationSender.Builder)super.clearField(var1);
      }

      public ConversationSender.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationSender.Builder)super.clearOneof(var1);
      }

      public ConversationSender.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationSender.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationSender.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationSender.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationSender.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationSender) {
            return this.mergeFrom((ConversationSender)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationSender.Builder mergeFrom(ConversationSender var1) {
         if (var1 == ConversationSender.getDefaultInstance()) {
            return this;
         }

         switch (var1.getSenderCase()) {
            case PLAYER:
               this.mergePlayer(var1.getPlayer());
            case SENDER_NOT_SET:
            default:
               this.mergeUnknownFields(var1.getUnknownFields());
               this.onChanged();
               return this;
         }
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationSender.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.senderCase_ = 1;
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
      public ConversationSender.SenderCase getSenderCase() {
         return ConversationSender.SenderCase.forNumber(this.senderCase_);
      }

      public ConversationSender.Builder clearSender() {
         this.senderCase_ = 0;
         this.sender_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPlayer() {
         return this.senderCase_ == 1;
      }

      @Override
      public UuidAndUsername getPlayer() {
         if (this.playerBuilder_ == null) {
            return this.senderCase_ == 1 ? (UuidAndUsername)this.sender_ : UuidAndUsername.getDefaultInstance();
         } else {
            return this.senderCase_ == 1 ? this.playerBuilder_.getMessage() : UuidAndUsername.getDefaultInstance();
         }
      }

      public ConversationSender.Builder setPlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sender_ = var1;
            this.onChanged();
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.senderCase_ = 1;
         return this;
      }

      public ConversationSender.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.sender_ = var1.build();
            this.onChanged();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.senderCase_ = 1;
         return this;
      }

      public ConversationSender.Builder mergePlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if (this.senderCase_ == 1 && this.sender_ != UuidAndUsername.getDefaultInstance()) {
               this.sender_ = UuidAndUsername.newBuilder((UuidAndUsername)this.sender_).mergeFrom(var1).buildPartial();
            } else {
               this.sender_ = var1;
            }

            this.onChanged();
         } else if (this.senderCase_ == 1) {
            this.playerBuilder_.mergeFrom(var1);
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.senderCase_ = 1;
         return this;
      }

      public ConversationSender.Builder clearPlayer() {
         if (this.playerBuilder_ == null) {
            if (this.senderCase_ == 1) {
               this.senderCase_ = 0;
               this.sender_ = null;
               this.onChanged();
            }
         } else {
            if (this.senderCase_ == 1) {
               this.senderCase_ = 0;
               this.sender_ = null;
            }

            this.playerBuilder_.clear();
         }

         return this;
      }

      public UuidAndUsername.Builder getPlayerBuilder() {
         return this.getPlayerFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
         if (this.senderCase_ == 1 && this.playerBuilder_ != null) {
            return this.playerBuilder_.getMessageOrBuilder();
         } else {
            return this.senderCase_ == 1 ? (UuidAndUsername)this.sender_ : UuidAndUsername.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getPlayerFieldBuilder() {
         if (this.playerBuilder_ == null) {
            if (this.senderCase_ != 1) {
               this.sender_ = UuidAndUsername.getDefaultInstance();
            }

            this.playerBuilder_ = new SingleFieldBuilderV3<>((UuidAndUsername)this.sender_, this.getParentForChildren(), this.isClean());
            this.sender_ = null;
         }

         this.senderCase_ = 1;
         this.onChanged();
         return this.playerBuilder_;
      }

      public final ConversationSender.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationSender.Builder)super.setUnknownFields(var1);
      }

      public final ConversationSender.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationSender.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum SenderCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      PLAYER(1),
      SENDER_NOT_SET(0);

      private final int value;

      SenderCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ConversationSender.SenderCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConversationSender.SenderCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return SENDER_NOT_SET;
            case 1:
               return PLAYER;
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
