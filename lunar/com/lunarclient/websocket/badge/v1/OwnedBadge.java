package com.lunarclient.websocket.badge.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OwnedBadge extends GeneratedMessageV3 implements OwnedBadgeOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int BADGE_ID_FIELD_NUMBER = 1;
   private int badgeId_ = 0;
   public static final int GRANTED_AT_FIELD_NUMBER = 2;
   private Timestamp grantedAt_;
   public static final int EXPIRES_AT_FIELD_NUMBER = 3;
   private Timestamp expiresAt_;
   public static final int EXPIRATION_REASON_FIELD_NUMBER = 4;
   private int expirationReason_ = 0;
   public static final int IS_LUNAR_PLUS_FIELD_NUMBER = 6;
   private boolean isLunarPlus_ = false;
   private byte memoizedIsInitialized = -1;
   private static final OwnedBadge DEFAULT_INSTANCE = new OwnedBadge();
   private static final Parser<OwnedBadge> PARSER = new AbstractParser<OwnedBadge>() {
      public OwnedBadge parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OwnedBadge.Builder var3 = OwnedBadge.newBuilder();

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

   private OwnedBadge(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OwnedBadge() {
      this.expirationReason_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OwnedBadge();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_badge_v1_OwnedBadge_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_badge_v1_OwnedBadge_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OwnedBadge.class, OwnedBadge.Builder.class);
   }

   @Override
   public int getBadgeId() {
      return this.badgeId_;
   }

   @Override
   public boolean hasGrantedAt() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getGrantedAt() {
      return this.grantedAt_ == null ? Timestamp.getDefaultInstance() : this.grantedAt_;
   }

   @Override
   public TimestampOrBuilder getGrantedAtOrBuilder() {
      return this.grantedAt_ == null ? Timestamp.getDefaultInstance() : this.grantedAt_;
   }

   @Override
   public boolean hasExpiresAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getExpiresAt() {
      return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
   }

   @Override
   public TimestampOrBuilder getExpiresAtOrBuilder() {
      return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
   }

   @Override
   public int getExpirationReasonValue() {
      return this.expirationReason_;
   }

   @Override
   public OwnedBadge.ExpirationReason getExpirationReason() {
      OwnedBadge.ExpirationReason var1 = OwnedBadge.ExpirationReason.forNumber(this.expirationReason_);
      return var1 == null ? OwnedBadge.ExpirationReason.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getIsLunarPlus() {
      return this.isLunarPlus_;
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
      if (this.badgeId_ != 0) {
         var1.writeInt32(1, this.badgeId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getGrantedAt());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getExpiresAt());
      }

      if (this.expirationReason_ != OwnedBadge.ExpirationReason.EXPIRATION_REASON_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.expirationReason_);
      }

      if (this.isLunarPlus_) {
         var1.writeBool(6, this.isLunarPlus_);
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
      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.badgeId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getGrantedAt());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getExpiresAt());
      }

      if (this.expirationReason_ != OwnedBadge.ExpirationReason.EXPIRATION_REASON_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.expirationReason_);
      }

      if (this.isLunarPlus_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.isLunarPlus_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OwnedBadge)) {
         return super.equals(var1);
      } else {
         OwnedBadge var2 = (OwnedBadge)var1;
         if (this.getBadgeId() != var2.getBadgeId()) {
            return false;
         } else if (this.hasGrantedAt() != var2.hasGrantedAt()) {
            return false;
         } else if (this.hasGrantedAt() && !this.getGrantedAt().equals(var2.getGrantedAt())) {
            return false;
         } else if (this.hasExpiresAt() != var2.hasExpiresAt()) {
            return false;
         } else if (this.hasExpiresAt() && !this.getExpiresAt().equals(var2.getExpiresAt())) {
            return false;
         } else if (this.expirationReason_ != var2.expirationReason_) {
            return false;
         } else {
            return this.getIsLunarPlus() != var2.getIsLunarPlus() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getBadgeId();
      if (this.hasGrantedAt()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getGrantedAt().hashCode();
      }

      if (this.hasExpiresAt()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getExpiresAt().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.expirationReason_;
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsLunarPlus());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OwnedBadge parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OwnedBadge parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OwnedBadge parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OwnedBadge parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OwnedBadge parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OwnedBadge parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OwnedBadge parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OwnedBadge parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OwnedBadge parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OwnedBadge parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OwnedBadge parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OwnedBadge parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OwnedBadge.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OwnedBadge.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OwnedBadge.Builder newBuilder(OwnedBadge var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OwnedBadge.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OwnedBadge.Builder() : new OwnedBadge.Builder().mergeFrom(this);
   }

   protected OwnedBadge.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OwnedBadge.Builder(var1);
   }

   public static OwnedBadge getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OwnedBadge> parser() {
      return PARSER;
   }

   @Override
   public Parser<OwnedBadge> getParserForType() {
      return PARSER;
   }

   public OwnedBadge getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OwnedBadge.Builder> implements OwnedBadgeOrBuilder {
      private int bitField0_;
      private int badgeId_;
      private Timestamp grantedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> grantedAtBuilder_;
      private Timestamp expiresAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> expiresAtBuilder_;
      private int expirationReason_ = 0;
      private boolean isLunarPlus_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_badge_v1_OwnedBadge_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_badge_v1_OwnedBadge_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OwnedBadge.class, OwnedBadge.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OwnedBadge.alwaysUseFieldBuilders) {
            this.getGrantedAtFieldBuilder();
            this.getExpiresAtFieldBuilder();
         }
      }

      public OwnedBadge.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.badgeId_ = 0;
         this.grantedAt_ = null;
         if (this.grantedAtBuilder_ != null) {
            this.grantedAtBuilder_.dispose();
            this.grantedAtBuilder_ = null;
         }

         this.expiresAt_ = null;
         if (this.expiresAtBuilder_ != null) {
            this.expiresAtBuilder_.dispose();
            this.expiresAtBuilder_ = null;
         }

         this.expirationReason_ = 0;
         this.isLunarPlus_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_badge_v1_OwnedBadge_descriptor;
      }

      public OwnedBadge getDefaultInstanceForType() {
         return OwnedBadge.getDefaultInstance();
      }

      public OwnedBadge build() {
         OwnedBadge var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OwnedBadge buildPartial() {
         OwnedBadge var1 = new OwnedBadge(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OwnedBadge var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.badgeId_ = this.badgeId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.grantedAt_ = this.grantedAtBuilder_ == null ? this.grantedAt_ : this.grantedAtBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.expiresAt_ = this.expiresAtBuilder_ == null ? this.expiresAt_ : this.expiresAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.expirationReason_ = this.expirationReason_;
         }

         if ((var2 & 16) != 0) {
            var1.isLunarPlus_ = this.isLunarPlus_;
         }

         OwnedBadge var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OwnedBadge.Builder clone() {
         return (OwnedBadge.Builder)super.clone();
      }

      public OwnedBadge.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OwnedBadge.Builder)super.setField(var1, var2);
      }

      public OwnedBadge.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OwnedBadge.Builder)super.clearField(var1);
      }

      public OwnedBadge.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OwnedBadge.Builder)super.clearOneof(var1);
      }

      public OwnedBadge.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OwnedBadge.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OwnedBadge.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OwnedBadge.Builder)super.addRepeatedField(var1, var2);
      }

      public OwnedBadge.Builder mergeFrom(Message var1) {
         if (var1 instanceof OwnedBadge) {
            return this.mergeFrom((OwnedBadge)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OwnedBadge.Builder mergeFrom(OwnedBadge var1) {
         if (var1 == OwnedBadge.getDefaultInstance()) {
            return this;
         }

         if (var1.getBadgeId() != 0) {
            this.setBadgeId(var1.getBadgeId());
         }

         if (var1.hasGrantedAt()) {
            this.mergeGrantedAt(var1.getGrantedAt());
         }

         if (var1.hasExpiresAt()) {
            this.mergeExpiresAt(var1.getExpiresAt());
         }

         if (var1.expirationReason_ != 0) {
            this.setExpirationReasonValue(var1.getExpirationReasonValue());
         }

         if (var1.getIsLunarPlus()) {
            this.setIsLunarPlus(var1.getIsLunarPlus());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OwnedBadge.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getGrantedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getExpiresAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.expirationReason_ = var1.readEnum();
                     this.bitField0_ |= 8;
                     break;
                  case 48:
                     this.isLunarPlus_ = var1.readBool();
                     this.bitField0_ |= 16;
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
      public int getBadgeId() {
         return this.badgeId_;
      }

      public OwnedBadge.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder clearBadgeId() {
         this.bitField0_ &= -2;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasGrantedAt() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getGrantedAt() {
         if (this.grantedAtBuilder_ == null) {
            return this.grantedAt_ == null ? Timestamp.getDefaultInstance() : this.grantedAt_;
         } else {
            return this.grantedAtBuilder_.getMessage();
         }
      }

      public OwnedBadge.Builder setGrantedAt(Timestamp var1) {
         if (this.grantedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.grantedAt_ = var1;
         } else {
            this.grantedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder setGrantedAt(Timestamp.Builder var1) {
         if (this.grantedAtBuilder_ == null) {
            this.grantedAt_ = var1.build();
         } else {
            this.grantedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder mergeGrantedAt(Timestamp var1) {
         if (this.grantedAtBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.grantedAt_ != null && this.grantedAt_ != Timestamp.getDefaultInstance()) {
               this.getGrantedAtBuilder().mergeFrom(var1);
            } else {
               this.grantedAt_ = var1;
            }
         } else {
            this.grantedAtBuilder_.mergeFrom(var1);
         }

         if (this.grantedAt_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public OwnedBadge.Builder clearGrantedAt() {
         this.bitField0_ &= -3;
         this.grantedAt_ = null;
         if (this.grantedAtBuilder_ != null) {
            this.grantedAtBuilder_.dispose();
            this.grantedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getGrantedAtBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getGrantedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getGrantedAtOrBuilder() {
         if (this.grantedAtBuilder_ != null) {
            return this.grantedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.grantedAt_ == null ? Timestamp.getDefaultInstance() : this.grantedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getGrantedAtFieldBuilder() {
         if (this.grantedAtBuilder_ == null) {
            this.grantedAtBuilder_ = new SingleFieldBuilderV3<>(this.getGrantedAt(), this.getParentForChildren(), this.isClean());
            this.grantedAt_ = null;
         }

         return this.grantedAtBuilder_;
      }

      @Override
      public boolean hasExpiresAt() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Timestamp getExpiresAt() {
         if (this.expiresAtBuilder_ == null) {
            return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
         } else {
            return this.expiresAtBuilder_.getMessage();
         }
      }

      public OwnedBadge.Builder setExpiresAt(Timestamp var1) {
         if (this.expiresAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.expiresAt_ = var1;
         } else {
            this.expiresAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder setExpiresAt(Timestamp.Builder var1) {
         if (this.expiresAtBuilder_ == null) {
            this.expiresAt_ = var1.build();
         } else {
            this.expiresAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder mergeExpiresAt(Timestamp var1) {
         if (this.expiresAtBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.expiresAt_ != null && this.expiresAt_ != Timestamp.getDefaultInstance()) {
               this.getExpiresAtBuilder().mergeFrom(var1);
            } else {
               this.expiresAt_ = var1;
            }
         } else {
            this.expiresAtBuilder_.mergeFrom(var1);
         }

         if (this.expiresAt_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public OwnedBadge.Builder clearExpiresAt() {
         this.bitField0_ &= -5;
         this.expiresAt_ = null;
         if (this.expiresAtBuilder_ != null) {
            this.expiresAtBuilder_.dispose();
            this.expiresAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getExpiresAtBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getExpiresAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getExpiresAtOrBuilder() {
         if (this.expiresAtBuilder_ != null) {
            return this.expiresAtBuilder_.getMessageOrBuilder();
         } else {
            return this.expiresAt_ == null ? Timestamp.getDefaultInstance() : this.expiresAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getExpiresAtFieldBuilder() {
         if (this.expiresAtBuilder_ == null) {
            this.expiresAtBuilder_ = new SingleFieldBuilderV3<>(this.getExpiresAt(), this.getParentForChildren(), this.isClean());
            this.expiresAt_ = null;
         }

         return this.expiresAtBuilder_;
      }

      @Override
      public int getExpirationReasonValue() {
         return this.expirationReason_;
      }

      public OwnedBadge.Builder setExpirationReasonValue(int var1) {
         this.expirationReason_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public OwnedBadge.ExpirationReason getExpirationReason() {
         OwnedBadge.ExpirationReason var1 = OwnedBadge.ExpirationReason.forNumber(this.expirationReason_);
         return var1 == null ? OwnedBadge.ExpirationReason.UNRECOGNIZED : var1;
      }

      public OwnedBadge.Builder setExpirationReason(OwnedBadge.ExpirationReason var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.expirationReason_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder clearExpirationReason() {
         this.bitField0_ &= -9;
         this.expirationReason_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getIsLunarPlus() {
         return this.isLunarPlus_;
      }

      public OwnedBadge.Builder setIsLunarPlus(boolean var1) {
         this.isLunarPlus_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public OwnedBadge.Builder clearIsLunarPlus() {
         this.bitField0_ &= -17;
         this.isLunarPlus_ = false;
         this.onChanged();
         return this;
      }

      public final OwnedBadge.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OwnedBadge.Builder)super.setUnknownFields(var1);
      }

      public final OwnedBadge.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OwnedBadge.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ExpirationReason implements ProtocolMessageEnum {
      EXPIRATION_REASON_UNSPECIFIED(0),
      EXPIRATION_REASON_TIME_LAPSED(1),
      EXPIRATION_REASON_LEFT_LC_DISCORD(2),
      UNRECOGNIZED(-1);

      public static final int EXPIRATION_REASON_UNSPECIFIED_VALUE = 0;
      public static final int EXPIRATION_REASON_TIME_LAPSED_VALUE = 1;
      public static final int EXPIRATION_REASON_LEFT_LC_DISCORD_VALUE = 2;
      private static final Internal.EnumLiteMap<OwnedBadge.ExpirationReason> internalValueMap = new Internal.EnumLiteMap<OwnedBadge.ExpirationReason>() {
         public OwnedBadge.ExpirationReason findValueByNumber(int var1) {
            return OwnedBadge.ExpirationReason.forNumber(var1);
         }
      };
      private static final OwnedBadge.ExpirationReason[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static OwnedBadge.ExpirationReason valueOf(int var0) {
         return forNumber(var0);
      }

      public static OwnedBadge.ExpirationReason forNumber(int var0) {
         switch (var0) {
            case 0:
               return EXPIRATION_REASON_UNSPECIFIED;
            case 1:
               return EXPIRATION_REASON_TIME_LAPSED;
            case 2:
               return EXPIRATION_REASON_LEFT_LC_DISCORD;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OwnedBadge.ExpirationReason> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return OwnedBadge.getDescriptor().getEnumTypes().get(0);
      }

      public static OwnedBadge.ExpirationReason valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      ExpirationReason(int var3) {
         this.value = var3;
      }
   }
}
