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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationReference extends GeneratedMessageV3 implements ConversationReferenceOrBuilder {
   private static final long serialVersionUID = 0L;
   private int targetCase_ = 0;
   private Object target_;
   public static final int FRIEND_UUID_FIELD_NUMBER = 1;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final ConversationReference DEFAULT_INSTANCE = new ConversationReference();
   private static final Parser<ConversationReference> PARSER = new AbstractParser<ConversationReference>() {
      public ConversationReference parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationReference.Builder var3 = ConversationReference.newBuilder();

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

   private ConversationReference(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationReference() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationReference();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationReference_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationReference_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationReference.class, ConversationReference.Builder.class);
   }

   @Override
   public ConversationReference.TargetCase getTargetCase() {
      return ConversationReference.TargetCase.forNumber(this.targetCase_);
   }

   @Override
   public boolean hasFriendUuid() {
      return this.targetCase_ == 1;
   }

   @Override
   public Uuid getFriendUuid() {
      return this.targetCase_ == 1 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
   }

   @Override
   public UuidOrBuilder getFriendUuidOrBuilder() {
      return this.targetCase_ == 1 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
   }

   @Override
   public boolean hasConversationReference() {
      return this.targetCase_ == 2;
   }

   @Override
   public Uuid getConversationReference() {
      return this.targetCase_ == 2 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
   }

   @Override
   public UuidOrBuilder getConversationReferenceOrBuilder() {
      return this.targetCase_ == 2 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
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
      if (this.targetCase_ == 1) {
         var1.writeMessage(1, (Uuid)this.target_);
      }

      if (this.targetCase_ == 2) {
         var1.writeMessage(2, (Uuid)this.target_);
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
      if (this.targetCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (Uuid)this.target_);
      }

      if (this.targetCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (Uuid)this.target_);
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

      if (!(var1 instanceof ConversationReference)) {
         return super.equals(var1);
      }

      ConversationReference var2 = (ConversationReference)var1;
      if (!this.getTargetCase().equals(var2.getTargetCase())) {
         return false;
      }

      switch (this.targetCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getFriendUuid().equals(var2.getFriendUuid())) {
               return false;
            }
            break;
         case 2:
            if (!this.getConversationReference().equals(var2.getConversationReference())) {
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
      switch (this.targetCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getFriendUuid().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getConversationReference().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationReference parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationReference parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationReference parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationReference parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationReference parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationReference parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationReference parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationReference parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationReference parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationReference parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationReference parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationReference parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationReference.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationReference.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationReference.Builder newBuilder(ConversationReference var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationReference.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationReference.Builder() : new ConversationReference.Builder().mergeFrom(this);
   }

   protected ConversationReference.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationReference.Builder(var1);
   }

   public static ConversationReference getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationReference> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationReference> getParserForType() {
      return PARSER;
   }

   public ConversationReference getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationReference.Builder> implements ConversationReferenceOrBuilder {
      private int targetCase_ = 0;
      private Object target_;
      private int bitField0_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> friendUuidBuilder_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> conversationReferenceBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationReference_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationReference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationReference.class, ConversationReference.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ConversationReference.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.friendUuidBuilder_ != null) {
            this.friendUuidBuilder_.clear();
         }

         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.clear();
         }

         this.targetCase_ = 0;
         this.target_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationReference_descriptor;
      }

      public ConversationReference getDefaultInstanceForType() {
         return ConversationReference.getDefaultInstance();
      }

      public ConversationReference build() {
         ConversationReference var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationReference buildPartial() {
         ConversationReference var1 = new ConversationReference(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationReference var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(ConversationReference var1) {
         var1.targetCase_ = this.targetCase_;
         var1.target_ = this.target_;
         if (this.targetCase_ == 1 && this.friendUuidBuilder_ != null) {
            var1.target_ = this.friendUuidBuilder_.build();
         }

         if (this.targetCase_ == 2 && this.conversationReferenceBuilder_ != null) {
            var1.target_ = this.conversationReferenceBuilder_.build();
         }
      }

      public ConversationReference.Builder clone() {
         return (ConversationReference.Builder)super.clone();
      }

      public ConversationReference.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationReference.Builder)super.setField(var1, var2);
      }

      public ConversationReference.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationReference.Builder)super.clearField(var1);
      }

      public ConversationReference.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationReference.Builder)super.clearOneof(var1);
      }

      public ConversationReference.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationReference.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationReference.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationReference.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationReference.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationReference) {
            return this.mergeFrom((ConversationReference)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationReference.Builder mergeFrom(ConversationReference var1) {
         if (var1 == ConversationReference.getDefaultInstance()) {
            return this;
         }

         switch (var1.getTargetCase()) {
            case FRIEND_UUID:
               this.mergeFriendUuid(var1.getFriendUuid());
               break;
            case CONVERSATION_REFERENCE:
               this.mergeConversationReference(var1.getConversationReference());
            case TARGET_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationReference.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getFriendUuidFieldBuilder().getBuilder(), var2);
                     this.targetCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getConversationReferenceFieldBuilder().getBuilder(), var2);
                     this.targetCase_ = 2;
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
      public ConversationReference.TargetCase getTargetCase() {
         return ConversationReference.TargetCase.forNumber(this.targetCase_);
      }

      public ConversationReference.Builder clearTarget() {
         this.targetCase_ = 0;
         this.target_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasFriendUuid() {
         return this.targetCase_ == 1;
      }

      @Override
      public Uuid getFriendUuid() {
         if (this.friendUuidBuilder_ == null) {
            return this.targetCase_ == 1 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
         } else {
            return this.targetCase_ == 1 ? this.friendUuidBuilder_.getMessage() : Uuid.getDefaultInstance();
         }
      }

      public ConversationReference.Builder setFriendUuid(Uuid var1) {
         if (this.friendUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
            this.onChanged();
         } else {
            this.friendUuidBuilder_.setMessage(var1);
         }

         this.targetCase_ = 1;
         return this;
      }

      public ConversationReference.Builder setFriendUuid(Uuid.Builder var1) {
         if (this.friendUuidBuilder_ == null) {
            this.target_ = var1.build();
            this.onChanged();
         } else {
            this.friendUuidBuilder_.setMessage(var1.build());
         }

         this.targetCase_ = 1;
         return this;
      }

      public ConversationReference.Builder mergeFriendUuid(Uuid var1) {
         if (this.friendUuidBuilder_ == null) {
            if (this.targetCase_ == 1 && this.target_ != Uuid.getDefaultInstance()) {
               this.target_ = Uuid.newBuilder((Uuid)this.target_).mergeFrom(var1).buildPartial();
            } else {
               this.target_ = var1;
            }

            this.onChanged();
         } else if (this.targetCase_ == 1) {
            this.friendUuidBuilder_.mergeFrom(var1);
         } else {
            this.friendUuidBuilder_.setMessage(var1);
         }

         this.targetCase_ = 1;
         return this;
      }

      public ConversationReference.Builder clearFriendUuid() {
         if (this.friendUuidBuilder_ == null) {
            if (this.targetCase_ == 1) {
               this.targetCase_ = 0;
               this.target_ = null;
               this.onChanged();
            }
         } else {
            if (this.targetCase_ == 1) {
               this.targetCase_ = 0;
               this.target_ = null;
            }

            this.friendUuidBuilder_.clear();
         }

         return this;
      }

      public Uuid.Builder getFriendUuidBuilder() {
         return this.getFriendUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getFriendUuidOrBuilder() {
         if (this.targetCase_ == 1 && this.friendUuidBuilder_ != null) {
            return this.friendUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.targetCase_ == 1 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getFriendUuidFieldBuilder() {
         if (this.friendUuidBuilder_ == null) {
            if (this.targetCase_ != 1) {
               this.target_ = Uuid.getDefaultInstance();
            }

            this.friendUuidBuilder_ = new SingleFieldBuilderV3<>((Uuid)this.target_, this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         this.targetCase_ = 1;
         this.onChanged();
         return this.friendUuidBuilder_;
      }

      @Override
      public boolean hasConversationReference() {
         return this.targetCase_ == 2;
      }

      @Override
      public Uuid getConversationReference() {
         if (this.conversationReferenceBuilder_ == null) {
            return this.targetCase_ == 2 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
         } else {
            return this.targetCase_ == 2 ? this.conversationReferenceBuilder_.getMessage() : Uuid.getDefaultInstance();
         }
      }

      public ConversationReference.Builder setConversationReference(Uuid var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
            this.onChanged();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1);
         }

         this.targetCase_ = 2;
         return this;
      }

      public ConversationReference.Builder setConversationReference(Uuid.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.target_ = var1.build();
            this.onChanged();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.targetCase_ = 2;
         return this;
      }

      public ConversationReference.Builder mergeConversationReference(Uuid var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if (this.targetCase_ == 2 && this.target_ != Uuid.getDefaultInstance()) {
               this.target_ = Uuid.newBuilder((Uuid)this.target_).mergeFrom(var1).buildPartial();
            } else {
               this.target_ = var1;
            }

            this.onChanged();
         } else if (this.targetCase_ == 2) {
            this.conversationReferenceBuilder_.mergeFrom(var1);
         } else {
            this.conversationReferenceBuilder_.setMessage(var1);
         }

         this.targetCase_ = 2;
         return this;
      }

      public ConversationReference.Builder clearConversationReference() {
         if (this.conversationReferenceBuilder_ == null) {
            if (this.targetCase_ == 2) {
               this.targetCase_ = 0;
               this.target_ = null;
               this.onChanged();
            }
         } else {
            if (this.targetCase_ == 2) {
               this.targetCase_ = 0;
               this.target_ = null;
            }

            this.conversationReferenceBuilder_.clear();
         }

         return this;
      }

      public Uuid.Builder getConversationReferenceBuilder() {
         return this.getConversationReferenceFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getConversationReferenceOrBuilder() {
         if (this.targetCase_ == 2 && this.conversationReferenceBuilder_ != null) {
            return this.conversationReferenceBuilder_.getMessageOrBuilder();
         } else {
            return this.targetCase_ == 2 ? (Uuid)this.target_ : Uuid.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getConversationReferenceFieldBuilder() {
         if (this.conversationReferenceBuilder_ == null) {
            if (this.targetCase_ != 2) {
               this.target_ = Uuid.getDefaultInstance();
            }

            this.conversationReferenceBuilder_ = new SingleFieldBuilderV3<>((Uuid)this.target_, this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         this.targetCase_ = 2;
         this.onChanged();
         return this.conversationReferenceBuilder_;
      }

      public final ConversationReference.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationReference.Builder)super.setUnknownFields(var1);
      }

      public final ConversationReference.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationReference.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum TargetCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      FRIEND_UUID(1),
      CONVERSATION_REFERENCE(2),
      TARGET_NOT_SET(0);

      private final int value;

      TargetCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ConversationReference.TargetCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConversationReference.TargetCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return TARGET_NOT_SET;
            case 1:
               return FRIEND_UUID;
            case 2:
               return CONVERSATION_REFERENCE;
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
