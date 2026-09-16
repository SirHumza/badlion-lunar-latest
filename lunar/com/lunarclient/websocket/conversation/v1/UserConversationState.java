package com.lunarclient.websocket.conversation.v1;

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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UserConversationState extends GeneratedMessageV3 implements UserConversationStateOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LAST_SEEN_TIME_FIELD_NUMBER = 1;
   private Timestamp lastSeenTime_;
   public static final int UNREAD_COUNT_FIELD_NUMBER = 2;
   private int unreadCount_ = 0;
   public static final int PINNED_FIELD_NUMBER = 3;
   private boolean pinned_ = false;
   private byte memoizedIsInitialized = -1;
   private static final UserConversationState DEFAULT_INSTANCE = new UserConversationState();
   private static final Parser<UserConversationState> PARSER = new AbstractParser<UserConversationState>() {
      public UserConversationState parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UserConversationState.Builder var3 = UserConversationState.newBuilder();

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

   private UserConversationState(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UserConversationState() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UserConversationState();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UserConversationState_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UserConversationState_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UserConversationState.class, UserConversationState.Builder.class);
   }

   @Override
   public boolean hasLastSeenTime() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getLastSeenTime() {
      return this.lastSeenTime_ == null ? Timestamp.getDefaultInstance() : this.lastSeenTime_;
   }

   @Override
   public TimestampOrBuilder getLastSeenTimeOrBuilder() {
      return this.lastSeenTime_ == null ? Timestamp.getDefaultInstance() : this.lastSeenTime_;
   }

   @Override
   public int getUnreadCount() {
      return this.unreadCount_;
   }

   @Override
   public boolean getPinned() {
      return this.pinned_;
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
         var1.writeMessage(1, this.getLastSeenTime());
      }

      if (this.unreadCount_ != 0) {
         var1.writeInt32(2, this.unreadCount_);
      }

      if (this.pinned_) {
         var1.writeBool(3, this.pinned_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getLastSeenTime());
      }

      if (this.unreadCount_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.unreadCount_);
      }

      if (this.pinned_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.pinned_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UserConversationState)) {
         return super.equals(var1);
      } else {
         UserConversationState var2 = (UserConversationState)var1;
         if (this.hasLastSeenTime() != var2.hasLastSeenTime()) {
            return false;
         } else if (this.hasLastSeenTime() && !this.getLastSeenTime().equals(var2.getLastSeenTime())) {
            return false;
         } else if (this.getUnreadCount() != var2.getUnreadCount()) {
            return false;
         } else {
            return this.getPinned() != var2.getPinned() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasLastSeenTime()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getLastSeenTime().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getUnreadCount();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPinned());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UserConversationState parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UserConversationState parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UserConversationState parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UserConversationState parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UserConversationState parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UserConversationState parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UserConversationState parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserConversationState parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserConversationState parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserConversationState parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserConversationState parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserConversationState parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UserConversationState.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UserConversationState.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserConversationState.Builder newBuilder(UserConversationState var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UserConversationState.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UserConversationState.Builder() : new UserConversationState.Builder().mergeFrom(this);
   }

   protected UserConversationState.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UserConversationState.Builder(var1);
   }

   public static UserConversationState getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UserConversationState> parser() {
      return PARSER;
   }

   @Override
   public Parser<UserConversationState> getParserForType() {
      return PARSER;
   }

   public UserConversationState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UserConversationState.Builder> implements UserConversationStateOrBuilder {
      private int bitField0_;
      private Timestamp lastSeenTime_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastSeenTimeBuilder_;
      private int unreadCount_;
      private boolean pinned_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UserConversationState_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UserConversationState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UserConversationState.class, UserConversationState.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UserConversationState.alwaysUseFieldBuilders) {
            this.getLastSeenTimeFieldBuilder();
         }
      }

      public UserConversationState.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.lastSeenTime_ = null;
         if (this.lastSeenTimeBuilder_ != null) {
            this.lastSeenTimeBuilder_.dispose();
            this.lastSeenTimeBuilder_ = null;
         }

         this.unreadCount_ = 0;
         this.pinned_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_UserConversationState_descriptor;
      }

      public UserConversationState getDefaultInstanceForType() {
         return UserConversationState.getDefaultInstance();
      }

      public UserConversationState build() {
         UserConversationState var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UserConversationState buildPartial() {
         UserConversationState var1 = new UserConversationState(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UserConversationState var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.lastSeenTime_ = this.lastSeenTimeBuilder_ == null ? this.lastSeenTime_ : this.lastSeenTimeBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.unreadCount_ = this.unreadCount_;
         }

         if ((var2 & 4) != 0) {
            var1.pinned_ = this.pinned_;
         }

         UserConversationState var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UserConversationState.Builder clone() {
         return (UserConversationState.Builder)super.clone();
      }

      public UserConversationState.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UserConversationState.Builder)super.setField(var1, var2);
      }

      public UserConversationState.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UserConversationState.Builder)super.clearField(var1);
      }

      public UserConversationState.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UserConversationState.Builder)super.clearOneof(var1);
      }

      public UserConversationState.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UserConversationState.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UserConversationState.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UserConversationState.Builder)super.addRepeatedField(var1, var2);
      }

      public UserConversationState.Builder mergeFrom(Message var1) {
         if (var1 instanceof UserConversationState) {
            return this.mergeFrom((UserConversationState)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UserConversationState.Builder mergeFrom(UserConversationState var1) {
         if (var1 == UserConversationState.getDefaultInstance()) {
            return this;
         }

         if (var1.hasLastSeenTime()) {
            this.mergeLastSeenTime(var1.getLastSeenTime());
         }

         if (var1.getUnreadCount() != 0) {
            this.setUnreadCount(var1.getUnreadCount());
         }

         if (var1.getPinned()) {
            this.setPinned(var1.getPinned());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UserConversationState.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLastSeenTimeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.unreadCount_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.pinned_ = var1.readBool();
                     this.bitField0_ |= 4;
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
      public boolean hasLastSeenTime() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Timestamp getLastSeenTime() {
         if (this.lastSeenTimeBuilder_ == null) {
            return this.lastSeenTime_ == null ? Timestamp.getDefaultInstance() : this.lastSeenTime_;
         } else {
            return this.lastSeenTimeBuilder_.getMessage();
         }
      }

      public UserConversationState.Builder setLastSeenTime(Timestamp var1) {
         if (this.lastSeenTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lastSeenTime_ = var1;
         } else {
            this.lastSeenTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UserConversationState.Builder setLastSeenTime(Timestamp.Builder var1) {
         if (this.lastSeenTimeBuilder_ == null) {
            this.lastSeenTime_ = var1.build();
         } else {
            this.lastSeenTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UserConversationState.Builder mergeLastSeenTime(Timestamp var1) {
         if (this.lastSeenTimeBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.lastSeenTime_ != null && this.lastSeenTime_ != Timestamp.getDefaultInstance()) {
               this.getLastSeenTimeBuilder().mergeFrom(var1);
            } else {
               this.lastSeenTime_ = var1;
            }
         } else {
            this.lastSeenTimeBuilder_.mergeFrom(var1);
         }

         if (this.lastSeenTime_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UserConversationState.Builder clearLastSeenTime() {
         this.bitField0_ &= -2;
         this.lastSeenTime_ = null;
         if (this.lastSeenTimeBuilder_ != null) {
            this.lastSeenTimeBuilder_.dispose();
            this.lastSeenTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getLastSeenTimeBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getLastSeenTimeFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getLastSeenTimeOrBuilder() {
         if (this.lastSeenTimeBuilder_ != null) {
            return this.lastSeenTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.lastSeenTime_ == null ? Timestamp.getDefaultInstance() : this.lastSeenTime_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastSeenTimeFieldBuilder() {
         if (this.lastSeenTimeBuilder_ == null) {
            this.lastSeenTimeBuilder_ = new SingleFieldBuilderV3<>(this.getLastSeenTime(), this.getParentForChildren(), this.isClean());
            this.lastSeenTime_ = null;
         }

         return this.lastSeenTimeBuilder_;
      }

      @Override
      public int getUnreadCount() {
         return this.unreadCount_;
      }

      public UserConversationState.Builder setUnreadCount(int var1) {
         this.unreadCount_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UserConversationState.Builder clearUnreadCount() {
         this.bitField0_ &= -3;
         this.unreadCount_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPinned() {
         return this.pinned_;
      }

      public UserConversationState.Builder setPinned(boolean var1) {
         this.pinned_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UserConversationState.Builder clearPinned() {
         this.bitField0_ &= -5;
         this.pinned_ = false;
         this.onChanged();
         return this;
      }

      public final UserConversationState.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UserConversationState.Builder)super.setUnknownFields(var1);
      }

      public final UserConversationState.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UserConversationState.Builder)super.mergeUnknownFields(var1);
      }
   }
}
