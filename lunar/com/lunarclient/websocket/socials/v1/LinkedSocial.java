package com.lunarclient.websocket.socials.v1;

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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UserSocial;
import com.lunarclient.common.v1.UserSocialOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LinkedSocial extends GeneratedMessageV3 implements LinkedSocialOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SOCIAL_FIELD_NUMBER = 1;
   private UserSocial social_;
   public static final int LINKED_AT_FIELD_NUMBER = 2;
   private Timestamp linkedAt_;
   public static final int COMMUNITY_FIELD_NUMBER = 3;
   private LinkedSocialCommunity community_;
   private byte memoizedIsInitialized = -1;
   private static final LinkedSocial DEFAULT_INSTANCE = new LinkedSocial();
   private static final Parser<LinkedSocial> PARSER = new AbstractParser<LinkedSocial>() {
      public LinkedSocial parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LinkedSocial.Builder var3 = LinkedSocial.newBuilder();

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

   private LinkedSocial(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LinkedSocial() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LinkedSocial();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocial_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocial_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LinkedSocial.class, LinkedSocial.Builder.class);
   }

   @Override
   public boolean hasSocial() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UserSocial getSocial() {
      return this.social_ == null ? UserSocial.getDefaultInstance() : this.social_;
   }

   @Override
   public UserSocialOrBuilder getSocialOrBuilder() {
      return this.social_ == null ? UserSocial.getDefaultInstance() : this.social_;
   }

   @Override
   public boolean hasLinkedAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getLinkedAt() {
      return this.linkedAt_ == null ? Timestamp.getDefaultInstance() : this.linkedAt_;
   }

   @Override
   public TimestampOrBuilder getLinkedAtOrBuilder() {
      return this.linkedAt_ == null ? Timestamp.getDefaultInstance() : this.linkedAt_;
   }

   @Override
   public boolean hasCommunity() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public LinkedSocialCommunity getCommunity() {
      return this.community_ == null ? LinkedSocialCommunity.getDefaultInstance() : this.community_;
   }

   @Override
   public LinkedSocialCommunityOrBuilder getCommunityOrBuilder() {
      return this.community_ == null ? LinkedSocialCommunity.getDefaultInstance() : this.community_;
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
         var1.writeMessage(1, this.getSocial());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getLinkedAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getCommunity());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSocial());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLinkedAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getCommunity());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LinkedSocial)) {
         return super.equals(var1);
      } else {
         LinkedSocial var2 = (LinkedSocial)var1;
         if (this.hasSocial() != var2.hasSocial()) {
            return false;
         } else if (this.hasSocial() && !this.getSocial().equals(var2.getSocial())) {
            return false;
         } else if (this.hasLinkedAt() != var2.hasLinkedAt()) {
            return false;
         } else if (this.hasLinkedAt() && !this.getLinkedAt().equals(var2.getLinkedAt())) {
            return false;
         } else if (this.hasCommunity() != var2.hasCommunity()) {
            return false;
         } else {
            return this.hasCommunity() && !this.getCommunity().equals(var2.getCommunity()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSocial()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSocial().hashCode();
      }

      if (this.hasLinkedAt()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLinkedAt().hashCode();
      }

      if (this.hasCommunity()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getCommunity().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LinkedSocial parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkedSocial parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkedSocial parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkedSocial parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkedSocial parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkedSocial parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkedSocial parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LinkedSocial parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LinkedSocial parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LinkedSocial parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LinkedSocial parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LinkedSocial parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LinkedSocial.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LinkedSocial.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LinkedSocial.Builder newBuilder(LinkedSocial var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LinkedSocial.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LinkedSocial.Builder() : new LinkedSocial.Builder().mergeFrom(this);
   }

   protected LinkedSocial.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LinkedSocial.Builder(var1);
   }

   public static LinkedSocial getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LinkedSocial> parser() {
      return PARSER;
   }

   @Override
   public Parser<LinkedSocial> getParserForType() {
      return PARSER;
   }

   public LinkedSocial getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LinkedSocial.Builder> implements LinkedSocialOrBuilder {
      private int bitField0_;
      private UserSocial social_;
      private SingleFieldBuilderV3<UserSocial, UserSocial.Builder, UserSocialOrBuilder> socialBuilder_;
      private Timestamp linkedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> linkedAtBuilder_;
      private LinkedSocialCommunity community_;
      private SingleFieldBuilderV3<LinkedSocialCommunity, LinkedSocialCommunity.Builder, LinkedSocialCommunityOrBuilder> communityBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocial_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocial_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LinkedSocial.class, LinkedSocial.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LinkedSocial.alwaysUseFieldBuilders) {
            this.getSocialFieldBuilder();
            this.getLinkedAtFieldBuilder();
            this.getCommunityFieldBuilder();
         }
      }

      public LinkedSocial.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.social_ = null;
         if (this.socialBuilder_ != null) {
            this.socialBuilder_.dispose();
            this.socialBuilder_ = null;
         }

         this.linkedAt_ = null;
         if (this.linkedAtBuilder_ != null) {
            this.linkedAtBuilder_.dispose();
            this.linkedAtBuilder_ = null;
         }

         this.community_ = null;
         if (this.communityBuilder_ != null) {
            this.communityBuilder_.dispose();
            this.communityBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_socials_v1_LinkedSocial_descriptor;
      }

      public LinkedSocial getDefaultInstanceForType() {
         return LinkedSocial.getDefaultInstance();
      }

      public LinkedSocial build() {
         LinkedSocial var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LinkedSocial buildPartial() {
         LinkedSocial var1 = new LinkedSocial(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LinkedSocial var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.social_ = this.socialBuilder_ == null ? this.social_ : this.socialBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.linkedAt_ = this.linkedAtBuilder_ == null ? this.linkedAt_ : this.linkedAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.community_ = this.communityBuilder_ == null ? this.community_ : this.communityBuilder_.build();
            var3 |= 4;
         }

         LinkedSocial var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LinkedSocial.Builder clone() {
         return (LinkedSocial.Builder)super.clone();
      }

      public LinkedSocial.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LinkedSocial.Builder)super.setField(var1, var2);
      }

      public LinkedSocial.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LinkedSocial.Builder)super.clearField(var1);
      }

      public LinkedSocial.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LinkedSocial.Builder)super.clearOneof(var1);
      }

      public LinkedSocial.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LinkedSocial.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LinkedSocial.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LinkedSocial.Builder)super.addRepeatedField(var1, var2);
      }

      public LinkedSocial.Builder mergeFrom(Message var1) {
         if (var1 instanceof LinkedSocial) {
            return this.mergeFrom((LinkedSocial)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LinkedSocial.Builder mergeFrom(LinkedSocial var1) {
         if (var1 == LinkedSocial.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSocial()) {
            this.mergeSocial(var1.getSocial());
         }

         if (var1.hasLinkedAt()) {
            this.mergeLinkedAt(var1.getLinkedAt());
         }

         if (var1.hasCommunity()) {
            this.mergeCommunity(var1.getCommunity());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LinkedSocial.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSocialFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLinkedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getCommunityFieldBuilder().getBuilder(), var2);
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
      public boolean hasSocial() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UserSocial getSocial() {
         if (this.socialBuilder_ == null) {
            return this.social_ == null ? UserSocial.getDefaultInstance() : this.social_;
         } else {
            return this.socialBuilder_.getMessage();
         }
      }

      public LinkedSocial.Builder setSocial(UserSocial var1) {
         if (this.socialBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.social_ = var1;
         } else {
            this.socialBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LinkedSocial.Builder setSocial(UserSocial.Builder var1) {
         if (this.socialBuilder_ == null) {
            this.social_ = var1.build();
         } else {
            this.socialBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LinkedSocial.Builder mergeSocial(UserSocial var1) {
         if (this.socialBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.social_ != null && this.social_ != UserSocial.getDefaultInstance()) {
               this.getSocialBuilder().mergeFrom(var1);
            } else {
               this.social_ = var1;
            }
         } else {
            this.socialBuilder_.mergeFrom(var1);
         }

         if (this.social_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public LinkedSocial.Builder clearSocial() {
         this.bitField0_ &= -2;
         this.social_ = null;
         if (this.socialBuilder_ != null) {
            this.socialBuilder_.dispose();
            this.socialBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UserSocial.Builder getSocialBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSocialFieldBuilder().getBuilder();
      }

      @Override
      public UserSocialOrBuilder getSocialOrBuilder() {
         if (this.socialBuilder_ != null) {
            return this.socialBuilder_.getMessageOrBuilder();
         } else {
            return this.social_ == null ? UserSocial.getDefaultInstance() : this.social_;
         }
      }

      private SingleFieldBuilderV3<UserSocial, UserSocial.Builder, UserSocialOrBuilder> getSocialFieldBuilder() {
         if (this.socialBuilder_ == null) {
            this.socialBuilder_ = new SingleFieldBuilderV3<>(this.getSocial(), this.getParentForChildren(), this.isClean());
            this.social_ = null;
         }

         return this.socialBuilder_;
      }

      @Override
      public boolean hasLinkedAt() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getLinkedAt() {
         if (this.linkedAtBuilder_ == null) {
            return this.linkedAt_ == null ? Timestamp.getDefaultInstance() : this.linkedAt_;
         } else {
            return this.linkedAtBuilder_.getMessage();
         }
      }

      public LinkedSocial.Builder setLinkedAt(Timestamp var1) {
         if (this.linkedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.linkedAt_ = var1;
         } else {
            this.linkedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LinkedSocial.Builder setLinkedAt(Timestamp.Builder var1) {
         if (this.linkedAtBuilder_ == null) {
            this.linkedAt_ = var1.build();
         } else {
            this.linkedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LinkedSocial.Builder mergeLinkedAt(Timestamp var1) {
         if (this.linkedAtBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.linkedAt_ != null && this.linkedAt_ != Timestamp.getDefaultInstance()) {
               this.getLinkedAtBuilder().mergeFrom(var1);
            } else {
               this.linkedAt_ = var1;
            }
         } else {
            this.linkedAtBuilder_.mergeFrom(var1);
         }

         if (this.linkedAt_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public LinkedSocial.Builder clearLinkedAt() {
         this.bitField0_ &= -3;
         this.linkedAt_ = null;
         if (this.linkedAtBuilder_ != null) {
            this.linkedAtBuilder_.dispose();
            this.linkedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getLinkedAtBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLinkedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getLinkedAtOrBuilder() {
         if (this.linkedAtBuilder_ != null) {
            return this.linkedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.linkedAt_ == null ? Timestamp.getDefaultInstance() : this.linkedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLinkedAtFieldBuilder() {
         if (this.linkedAtBuilder_ == null) {
            this.linkedAtBuilder_ = new SingleFieldBuilderV3<>(this.getLinkedAt(), this.getParentForChildren(), this.isClean());
            this.linkedAt_ = null;
         }

         return this.linkedAtBuilder_;
      }

      @Override
      public boolean hasCommunity() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public LinkedSocialCommunity getCommunity() {
         if (this.communityBuilder_ == null) {
            return this.community_ == null ? LinkedSocialCommunity.getDefaultInstance() : this.community_;
         } else {
            return this.communityBuilder_.getMessage();
         }
      }

      public LinkedSocial.Builder setCommunity(LinkedSocialCommunity var1) {
         if (this.communityBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.community_ = var1;
         } else {
            this.communityBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LinkedSocial.Builder setCommunity(LinkedSocialCommunity.Builder var1) {
         if (this.communityBuilder_ == null) {
            this.community_ = var1.build();
         } else {
            this.communityBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LinkedSocial.Builder mergeCommunity(LinkedSocialCommunity var1) {
         if (this.communityBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.community_ != null && this.community_ != LinkedSocialCommunity.getDefaultInstance()) {
               this.getCommunityBuilder().mergeFrom(var1);
            } else {
               this.community_ = var1;
            }
         } else {
            this.communityBuilder_.mergeFrom(var1);
         }

         if (this.community_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public LinkedSocial.Builder clearCommunity() {
         this.bitField0_ &= -5;
         this.community_ = null;
         if (this.communityBuilder_ != null) {
            this.communityBuilder_.dispose();
            this.communityBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LinkedSocialCommunity.Builder getCommunityBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getCommunityFieldBuilder().getBuilder();
      }

      @Override
      public LinkedSocialCommunityOrBuilder getCommunityOrBuilder() {
         if (this.communityBuilder_ != null) {
            return this.communityBuilder_.getMessageOrBuilder();
         } else {
            return this.community_ == null ? LinkedSocialCommunity.getDefaultInstance() : this.community_;
         }
      }

      private SingleFieldBuilderV3<LinkedSocialCommunity, LinkedSocialCommunity.Builder, LinkedSocialCommunityOrBuilder> getCommunityFieldBuilder() {
         if (this.communityBuilder_ == null) {
            this.communityBuilder_ = new SingleFieldBuilderV3<>(this.getCommunity(), this.getParentForChildren(), this.isClean());
            this.community_ = null;
         }

         return this.communityBuilder_;
      }

      public final LinkedSocial.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LinkedSocial.Builder)super.setUnknownFields(var1);
      }

      public final LinkedSocial.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LinkedSocial.Builder)super.mergeUnknownFields(var1);
      }
   }
}
