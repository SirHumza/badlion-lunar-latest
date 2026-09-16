package com.lunarclient.websocket.socials.v1;

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

public final class LinkedSocialCommunity extends GeneratedMessageV3 implements LinkedSocialCommunityOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int IS_MEMBER_FIELD_NUMBER = 1;
   private boolean isMember_ = false;
   public static final int JOINED_AT_FIELD_NUMBER = 2;
   private Timestamp joinedAt_;
   public static final int LEFT_AT_FIELD_NUMBER = 3;
   private Timestamp leftAt_;
   public static final int HAS_FLAIR_FIELD_NUMBER = 4;
   private boolean hasFlair_ = false;
   private byte memoizedIsInitialized = -1;
   private static final LinkedSocialCommunity DEFAULT_INSTANCE = new LinkedSocialCommunity();
   private static final Parser<LinkedSocialCommunity> PARSER = new AbstractParser<LinkedSocialCommunity>() {
      public LinkedSocialCommunity parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LinkedSocialCommunity.Builder var3 = LinkedSocialCommunity.newBuilder();

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

   private LinkedSocialCommunity(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LinkedSocialCommunity() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LinkedSocialCommunity();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LinkedSocialCommunity.class, LinkedSocialCommunity.Builder.class);
   }

   @Override
   public boolean getIsMember() {
      return this.isMember_;
   }

   @Override
   public boolean hasJoinedAt() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getJoinedAt() {
      return this.joinedAt_ == null ? Timestamp.getDefaultInstance() : this.joinedAt_;
   }

   @Override
   public TimestampOrBuilder getJoinedAtOrBuilder() {
      return this.joinedAt_ == null ? Timestamp.getDefaultInstance() : this.joinedAt_;
   }

   @Override
   public boolean hasLeftAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getLeftAt() {
      return this.leftAt_ == null ? Timestamp.getDefaultInstance() : this.leftAt_;
   }

   @Override
   public TimestampOrBuilder getLeftAtOrBuilder() {
      return this.leftAt_ == null ? Timestamp.getDefaultInstance() : this.leftAt_;
   }

   @Override
   public boolean getHasFlair() {
      return this.hasFlair_;
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
      if (this.isMember_) {
         var1.writeBool(1, this.isMember_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getJoinedAt());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getLeftAt());
      }

      if (this.hasFlair_) {
         var1.writeBool(4, this.hasFlair_);
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
      if (this.isMember_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.isMember_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getJoinedAt());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLeftAt());
      }

      if (this.hasFlair_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.hasFlair_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LinkedSocialCommunity)) {
         return super.equals(var1);
      } else {
         LinkedSocialCommunity var2 = (LinkedSocialCommunity)var1;
         if (this.getIsMember() != var2.getIsMember()) {
            return false;
         } else if (this.hasJoinedAt() != var2.hasJoinedAt()) {
            return false;
         } else if (this.hasJoinedAt() && !this.getJoinedAt().equals(var2.getJoinedAt())) {
            return false;
         } else if (this.hasLeftAt() != var2.hasLeftAt()) {
            return false;
         } else if (this.hasLeftAt() && !this.getLeftAt().equals(var2.getLeftAt())) {
            return false;
         } else {
            return this.getHasFlair() != var2.getHasFlair() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsMember());
      if (this.hasJoinedAt()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getJoinedAt().hashCode();
      }

      if (this.hasLeftAt()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLeftAt().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHasFlair());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LinkedSocialCommunity parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkedSocialCommunity parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkedSocialCommunity parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkedSocialCommunity parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkedSocialCommunity parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkedSocialCommunity parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkedSocialCommunity parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LinkedSocialCommunity parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LinkedSocialCommunity parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LinkedSocialCommunity parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LinkedSocialCommunity parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LinkedSocialCommunity parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LinkedSocialCommunity.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LinkedSocialCommunity.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LinkedSocialCommunity.Builder newBuilder(LinkedSocialCommunity var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LinkedSocialCommunity.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LinkedSocialCommunity.Builder() : new LinkedSocialCommunity.Builder().mergeFrom(this);
   }

   protected LinkedSocialCommunity.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LinkedSocialCommunity.Builder(var1);
   }

   public static LinkedSocialCommunity getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LinkedSocialCommunity> parser() {
      return PARSER;
   }

   @Override
   public Parser<LinkedSocialCommunity> getParserForType() {
      return PARSER;
   }

   public LinkedSocialCommunity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LinkedSocialCommunity.Builder> implements LinkedSocialCommunityOrBuilder {
      private int bitField0_;
      private boolean isMember_;
      private Timestamp joinedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> joinedAtBuilder_;
      private Timestamp leftAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> leftAtBuilder_;
      private boolean hasFlair_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LinkedSocialCommunity.class, LinkedSocialCommunity.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LinkedSocialCommunity.alwaysUseFieldBuilders) {
            this.getJoinedAtFieldBuilder();
            this.getLeftAtFieldBuilder();
         }
      }

      public LinkedSocialCommunity.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.isMember_ = false;
         this.joinedAt_ = null;
         if (this.joinedAtBuilder_ != null) {
            this.joinedAtBuilder_.dispose();
            this.joinedAtBuilder_ = null;
         }

         this.leftAt_ = null;
         if (this.leftAtBuilder_ != null) {
            this.leftAtBuilder_.dispose();
            this.leftAtBuilder_ = null;
         }

         this.hasFlair_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_descriptor;
      }

      public LinkedSocialCommunity getDefaultInstanceForType() {
         return LinkedSocialCommunity.getDefaultInstance();
      }

      public LinkedSocialCommunity build() {
         LinkedSocialCommunity var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LinkedSocialCommunity buildPartial() {
         LinkedSocialCommunity var1 = new LinkedSocialCommunity(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LinkedSocialCommunity var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.isMember_ = this.isMember_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.joinedAt_ = this.joinedAtBuilder_ == null ? this.joinedAt_ : this.joinedAtBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.leftAt_ = this.leftAtBuilder_ == null ? this.leftAt_ : this.leftAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.hasFlair_ = this.hasFlair_;
         }

         LinkedSocialCommunity var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LinkedSocialCommunity.Builder clone() {
         return (LinkedSocialCommunity.Builder)super.clone();
      }

      public LinkedSocialCommunity.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LinkedSocialCommunity.Builder)super.setField(var1, var2);
      }

      public LinkedSocialCommunity.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LinkedSocialCommunity.Builder)super.clearField(var1);
      }

      public LinkedSocialCommunity.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LinkedSocialCommunity.Builder)super.clearOneof(var1);
      }

      public LinkedSocialCommunity.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LinkedSocialCommunity.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LinkedSocialCommunity.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LinkedSocialCommunity.Builder)super.addRepeatedField(var1, var2);
      }

      public LinkedSocialCommunity.Builder mergeFrom(Message var1) {
         if (var1 instanceof LinkedSocialCommunity) {
            return this.mergeFrom((LinkedSocialCommunity)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LinkedSocialCommunity.Builder mergeFrom(LinkedSocialCommunity var1) {
         if (var1 == LinkedSocialCommunity.getDefaultInstance()) {
            return this;
         }

         if (var1.getIsMember()) {
            this.setIsMember(var1.getIsMember());
         }

         if (var1.hasJoinedAt()) {
            this.mergeJoinedAt(var1.getJoinedAt());
         }

         if (var1.hasLeftAt()) {
            this.mergeLeftAt(var1.getLeftAt());
         }

         if (var1.getHasFlair()) {
            this.setHasFlair(var1.getHasFlair());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LinkedSocialCommunity.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.isMember_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getJoinedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLeftAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.hasFlair_ = var1.readBool();
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
      public boolean getIsMember() {
         return this.isMember_;
      }

      public LinkedSocialCommunity.Builder setIsMember(boolean var1) {
         this.isMember_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder clearIsMember() {
         this.bitField0_ &= -2;
         this.isMember_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasJoinedAt() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getJoinedAt() {
         if (this.joinedAtBuilder_ == null) {
            return this.joinedAt_ == null ? Timestamp.getDefaultInstance() : this.joinedAt_;
         } else {
            return this.joinedAtBuilder_.getMessage();
         }
      }

      public LinkedSocialCommunity.Builder setJoinedAt(Timestamp var1) {
         if (this.joinedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.joinedAt_ = var1;
         } else {
            this.joinedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder setJoinedAt(Timestamp.Builder var1) {
         if (this.joinedAtBuilder_ == null) {
            this.joinedAt_ = var1.build();
         } else {
            this.joinedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder mergeJoinedAt(Timestamp var1) {
         if (this.joinedAtBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.joinedAt_ != null && this.joinedAt_ != Timestamp.getDefaultInstance()) {
               this.getJoinedAtBuilder().mergeFrom(var1);
            } else {
               this.joinedAt_ = var1;
            }
         } else {
            this.joinedAtBuilder_.mergeFrom(var1);
         }

         if (this.joinedAt_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public LinkedSocialCommunity.Builder clearJoinedAt() {
         this.bitField0_ &= -3;
         this.joinedAt_ = null;
         if (this.joinedAtBuilder_ != null) {
            this.joinedAtBuilder_.dispose();
            this.joinedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getJoinedAtBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getJoinedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getJoinedAtOrBuilder() {
         if (this.joinedAtBuilder_ != null) {
            return this.joinedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.joinedAt_ == null ? Timestamp.getDefaultInstance() : this.joinedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getJoinedAtFieldBuilder() {
         if (this.joinedAtBuilder_ == null) {
            this.joinedAtBuilder_ = new SingleFieldBuilderV3<>(this.getJoinedAt(), this.getParentForChildren(), this.isClean());
            this.joinedAt_ = null;
         }

         return this.joinedAtBuilder_;
      }

      @Override
      public boolean hasLeftAt() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Timestamp getLeftAt() {
         if (this.leftAtBuilder_ == null) {
            return this.leftAt_ == null ? Timestamp.getDefaultInstance() : this.leftAt_;
         } else {
            return this.leftAtBuilder_.getMessage();
         }
      }

      public LinkedSocialCommunity.Builder setLeftAt(Timestamp var1) {
         if (this.leftAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.leftAt_ = var1;
         } else {
            this.leftAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder setLeftAt(Timestamp.Builder var1) {
         if (this.leftAtBuilder_ == null) {
            this.leftAt_ = var1.build();
         } else {
            this.leftAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder mergeLeftAt(Timestamp var1) {
         if (this.leftAtBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.leftAt_ != null && this.leftAt_ != Timestamp.getDefaultInstance()) {
               this.getLeftAtBuilder().mergeFrom(var1);
            } else {
               this.leftAt_ = var1;
            }
         } else {
            this.leftAtBuilder_.mergeFrom(var1);
         }

         if (this.leftAt_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public LinkedSocialCommunity.Builder clearLeftAt() {
         this.bitField0_ &= -5;
         this.leftAt_ = null;
         if (this.leftAtBuilder_ != null) {
            this.leftAtBuilder_.dispose();
            this.leftAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getLeftAtBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLeftAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getLeftAtOrBuilder() {
         if (this.leftAtBuilder_ != null) {
            return this.leftAtBuilder_.getMessageOrBuilder();
         } else {
            return this.leftAt_ == null ? Timestamp.getDefaultInstance() : this.leftAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLeftAtFieldBuilder() {
         if (this.leftAtBuilder_ == null) {
            this.leftAtBuilder_ = new SingleFieldBuilderV3<>(this.getLeftAt(), this.getParentForChildren(), this.isClean());
            this.leftAt_ = null;
         }

         return this.leftAtBuilder_;
      }

      @Override
      public boolean getHasFlair() {
         return this.hasFlair_;
      }

      public LinkedSocialCommunity.Builder setHasFlair(boolean var1) {
         this.hasFlair_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder clearHasFlair() {
         this.bitField0_ &= -9;
         this.hasFlair_ = false;
         this.onChanged();
         return this;
      }

      public final LinkedSocialCommunity.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LinkedSocialCommunity.Builder)super.setUnknownFields(var1);
      }

      public final LinkedSocialCommunity.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LinkedSocialCommunity.Builder)super.mergeUnknownFields(var1);
      }
   }
}
