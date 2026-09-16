package com.lunarclient.websocket.jam.v1;

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
import com.lunarclient.common.v1.GiftInfo;
import com.lunarclient.common.v1.GiftInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OwnedJam extends GeneratedMessageV3 implements OwnedJamOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int JAM_ID_FIELD_NUMBER = 1;
   private int jamId_ = 0;
   public static final int GRANTED_AT_FIELD_NUMBER = 2;
   private Timestamp grantedAt_;
   public static final int EXPIRES_AT_FIELD_NUMBER = 3;
   private Timestamp expiresAt_;
   public static final int GIFT_INFO_FIELD_NUMBER = 4;
   private GiftInfo giftInfo_;
   private byte memoizedIsInitialized = -1;
   private static final OwnedJam DEFAULT_INSTANCE = new OwnedJam();
   private static final Parser<OwnedJam> PARSER = new AbstractParser<OwnedJam>() {
      public OwnedJam parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OwnedJam.Builder var3 = OwnedJam.newBuilder();

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

   private OwnedJam(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OwnedJam() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OwnedJam();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_jam_v1_OwnedJam_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_jam_v1_OwnedJam_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OwnedJam.class, OwnedJam.Builder.class);
   }

   @Override
   public int getJamId() {
      return this.jamId_;
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
   public boolean hasGiftInfo() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public GiftInfo getGiftInfo() {
      return this.giftInfo_ == null ? GiftInfo.getDefaultInstance() : this.giftInfo_;
   }

   @Override
   public GiftInfoOrBuilder getGiftInfoOrBuilder() {
      return this.giftInfo_ == null ? GiftInfo.getDefaultInstance() : this.giftInfo_;
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
      if (this.jamId_ != 0) {
         var1.writeInt32(1, this.jamId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getGrantedAt());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getExpiresAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getGiftInfo());
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
      if (this.jamId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.jamId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getGrantedAt());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getExpiresAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getGiftInfo());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OwnedJam)) {
         return super.equals(var1);
      } else {
         OwnedJam var2 = (OwnedJam)var1;
         if (this.getJamId() != var2.getJamId()) {
            return false;
         } else if (this.hasGrantedAt() != var2.hasGrantedAt()) {
            return false;
         } else if (this.hasGrantedAt() && !this.getGrantedAt().equals(var2.getGrantedAt())) {
            return false;
         } else if (this.hasExpiresAt() != var2.hasExpiresAt()) {
            return false;
         } else if (this.hasExpiresAt() && !this.getExpiresAt().equals(var2.getExpiresAt())) {
            return false;
         } else if (this.hasGiftInfo() != var2.hasGiftInfo()) {
            return false;
         } else {
            return this.hasGiftInfo() && !this.getGiftInfo().equals(var2.getGiftInfo()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getJamId();
      if (this.hasGrantedAt()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getGrantedAt().hashCode();
      }

      if (this.hasExpiresAt()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getExpiresAt().hashCode();
      }

      if (this.hasGiftInfo()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getGiftInfo().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OwnedJam parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OwnedJam parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OwnedJam parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OwnedJam parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OwnedJam parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OwnedJam parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OwnedJam parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OwnedJam parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OwnedJam parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OwnedJam parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OwnedJam parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OwnedJam parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OwnedJam.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OwnedJam.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OwnedJam.Builder newBuilder(OwnedJam var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OwnedJam.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OwnedJam.Builder() : new OwnedJam.Builder().mergeFrom(this);
   }

   protected OwnedJam.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OwnedJam.Builder(var1);
   }

   public static OwnedJam getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OwnedJam> parser() {
      return PARSER;
   }

   @Override
   public Parser<OwnedJam> getParserForType() {
      return PARSER;
   }

   public OwnedJam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OwnedJam.Builder> implements OwnedJamOrBuilder {
      private int bitField0_;
      private int jamId_;
      private Timestamp grantedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> grantedAtBuilder_;
      private Timestamp expiresAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> expiresAtBuilder_;
      private GiftInfo giftInfo_;
      private SingleFieldBuilderV3<GiftInfo, GiftInfo.Builder, GiftInfoOrBuilder> giftInfoBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_jam_v1_OwnedJam_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_jam_v1_OwnedJam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OwnedJam.class, OwnedJam.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OwnedJam.alwaysUseFieldBuilders) {
            this.getGrantedAtFieldBuilder();
            this.getExpiresAtFieldBuilder();
            this.getGiftInfoFieldBuilder();
         }
      }

      public OwnedJam.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.jamId_ = 0;
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

         this.giftInfo_ = null;
         if (this.giftInfoBuilder_ != null) {
            this.giftInfoBuilder_.dispose();
            this.giftInfoBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_jam_v1_OwnedJam_descriptor;
      }

      public OwnedJam getDefaultInstanceForType() {
         return OwnedJam.getDefaultInstance();
      }

      public OwnedJam build() {
         OwnedJam var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OwnedJam buildPartial() {
         OwnedJam var1 = new OwnedJam(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OwnedJam var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.jamId_ = this.jamId_;
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
            var1.giftInfo_ = this.giftInfoBuilder_ == null ? this.giftInfo_ : this.giftInfoBuilder_.build();
            var3 |= 4;
         }

         OwnedJam var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OwnedJam.Builder clone() {
         return (OwnedJam.Builder)super.clone();
      }

      public OwnedJam.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OwnedJam.Builder)super.setField(var1, var2);
      }

      public OwnedJam.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OwnedJam.Builder)super.clearField(var1);
      }

      public OwnedJam.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OwnedJam.Builder)super.clearOneof(var1);
      }

      public OwnedJam.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OwnedJam.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OwnedJam.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OwnedJam.Builder)super.addRepeatedField(var1, var2);
      }

      public OwnedJam.Builder mergeFrom(Message var1) {
         if (var1 instanceof OwnedJam) {
            return this.mergeFrom((OwnedJam)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OwnedJam.Builder mergeFrom(OwnedJam var1) {
         if (var1 == OwnedJam.getDefaultInstance()) {
            return this;
         }

         if (var1.getJamId() != 0) {
            this.setJamId(var1.getJamId());
         }

         if (var1.hasGrantedAt()) {
            this.mergeGrantedAt(var1.getGrantedAt());
         }

         if (var1.hasExpiresAt()) {
            this.mergeExpiresAt(var1.getExpiresAt());
         }

         if (var1.hasGiftInfo()) {
            this.mergeGiftInfo(var1.getGiftInfo());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OwnedJam.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.jamId_ = var1.readInt32();
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
                  case 34:
                     var1.readMessage(this.getGiftInfoFieldBuilder().getBuilder(), var2);
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
      public int getJamId() {
         return this.jamId_;
      }

      public OwnedJam.Builder setJamId(int var1) {
         this.jamId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OwnedJam.Builder clearJamId() {
         this.bitField0_ &= -2;
         this.jamId_ = 0;
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

      public OwnedJam.Builder setGrantedAt(Timestamp var1) {
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

      public OwnedJam.Builder setGrantedAt(Timestamp.Builder var1) {
         if (this.grantedAtBuilder_ == null) {
            this.grantedAt_ = var1.build();
         } else {
            this.grantedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OwnedJam.Builder mergeGrantedAt(Timestamp var1) {
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

      public OwnedJam.Builder clearGrantedAt() {
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

      public OwnedJam.Builder setExpiresAt(Timestamp var1) {
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

      public OwnedJam.Builder setExpiresAt(Timestamp.Builder var1) {
         if (this.expiresAtBuilder_ == null) {
            this.expiresAt_ = var1.build();
         } else {
            this.expiresAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OwnedJam.Builder mergeExpiresAt(Timestamp var1) {
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

      public OwnedJam.Builder clearExpiresAt() {
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
      public boolean hasGiftInfo() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public GiftInfo getGiftInfo() {
         if (this.giftInfoBuilder_ == null) {
            return this.giftInfo_ == null ? GiftInfo.getDefaultInstance() : this.giftInfo_;
         } else {
            return this.giftInfoBuilder_.getMessage();
         }
      }

      public OwnedJam.Builder setGiftInfo(GiftInfo var1) {
         if (this.giftInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.giftInfo_ = var1;
         } else {
            this.giftInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OwnedJam.Builder setGiftInfo(GiftInfo.Builder var1) {
         if (this.giftInfoBuilder_ == null) {
            this.giftInfo_ = var1.build();
         } else {
            this.giftInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OwnedJam.Builder mergeGiftInfo(GiftInfo var1) {
         if (this.giftInfoBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.giftInfo_ != null && this.giftInfo_ != GiftInfo.getDefaultInstance()) {
               this.getGiftInfoBuilder().mergeFrom(var1);
            } else {
               this.giftInfo_ = var1;
            }
         } else {
            this.giftInfoBuilder_.mergeFrom(var1);
         }

         if (this.giftInfo_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public OwnedJam.Builder clearGiftInfo() {
         this.bitField0_ &= -9;
         this.giftInfo_ = null;
         if (this.giftInfoBuilder_ != null) {
            this.giftInfoBuilder_.dispose();
            this.giftInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public GiftInfo.Builder getGiftInfoBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getGiftInfoFieldBuilder().getBuilder();
      }

      @Override
      public GiftInfoOrBuilder getGiftInfoOrBuilder() {
         if (this.giftInfoBuilder_ != null) {
            return this.giftInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.giftInfo_ == null ? GiftInfo.getDefaultInstance() : this.giftInfo_;
         }
      }

      private SingleFieldBuilderV3<GiftInfo, GiftInfo.Builder, GiftInfoOrBuilder> getGiftInfoFieldBuilder() {
         if (this.giftInfoBuilder_ == null) {
            this.giftInfoBuilder_ = new SingleFieldBuilderV3<>(this.getGiftInfo(), this.getParentForChildren(), this.isClean());
            this.giftInfo_ = null;
         }

         return this.giftInfoBuilder_;
      }

      public final OwnedJam.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OwnedJam.Builder)super.setUnknownFields(var1);
      }

      public final OwnedJam.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OwnedJam.Builder)super.mergeUnknownFields(var1);
      }
   }
}
