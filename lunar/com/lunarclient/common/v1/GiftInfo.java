package com.lunarclient.common.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class GiftInfo extends GeneratedMessageV3 implements GiftInfoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int GIFTED_BY_FIELD_NUMBER = 1;
   private UuidAndUsername giftedBy_;
   public static final int MESSAGE_FIELD_NUMBER = 2;
   private volatile Object message_ = "";
   public static final int IS_ANONYMOUS_FIELD_NUMBER = 3;
   private boolean isAnonymous_ = false;
   private byte memoizedIsInitialized = -1;
   private static final GiftInfo DEFAULT_INSTANCE = new GiftInfo();
   private static final Parser<GiftInfo> PARSER = new AbstractParser<GiftInfo>() {
      public GiftInfo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GiftInfo.Builder var3 = GiftInfo.newBuilder();

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

   private GiftInfo(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GiftInfo() {
      this.message_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GiftInfo();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return GiftProto.internal_static_lunarclient_common_v1_GiftInfo_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return GiftProto.internal_static_lunarclient_common_v1_GiftInfo_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GiftInfo.class, GiftInfo.Builder.class);
   }

   @Override
   public boolean hasGiftedBy() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getGiftedBy() {
      return this.giftedBy_ == null ? UuidAndUsername.getDefaultInstance() : this.giftedBy_;
   }

   @Override
   public UuidAndUsernameOrBuilder getGiftedByOrBuilder() {
      return this.giftedBy_ == null ? UuidAndUsername.getDefaultInstance() : this.giftedBy_;
   }

   @Override
   public boolean hasMessage() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public String getMessage() {
      Object var1 = this.message_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.message_ = var3;
      return var3;
   }

   @Override
   public ByteString getMessageBytes() {
      Object var1 = this.message_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.message_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getIsAnonymous() {
      return this.isAnonymous_;
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
         var1.writeMessage(1, this.getGiftedBy());
      }

      if ((this.bitField0_ & 2) != 0) {
         GeneratedMessageV3.writeString(var1, 2, this.message_);
      }

      if (this.isAnonymous_) {
         var1.writeBool(3, this.isAnonymous_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getGiftedBy());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.message_);
      }

      if (this.isAnonymous_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.isAnonymous_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GiftInfo)) {
         return super.equals(var1);
      } else {
         GiftInfo var2 = (GiftInfo)var1;
         if (this.hasGiftedBy() != var2.hasGiftedBy()) {
            return false;
         } else if (this.hasGiftedBy() && !this.getGiftedBy().equals(var2.getGiftedBy())) {
            return false;
         } else if (this.hasMessage() != var2.hasMessage()) {
            return false;
         } else if (this.hasMessage() && !this.getMessage().equals(var2.getMessage())) {
            return false;
         } else {
            return this.getIsAnonymous() != var2.getIsAnonymous() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasGiftedBy()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getGiftedBy().hashCode();
      }

      if (this.hasMessage()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMessage().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsAnonymous());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GiftInfo parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GiftInfo parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GiftInfo parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GiftInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GiftInfo parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GiftInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GiftInfo parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GiftInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GiftInfo parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GiftInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GiftInfo parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GiftInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GiftInfo.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GiftInfo.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GiftInfo.Builder newBuilder(GiftInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GiftInfo.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GiftInfo.Builder() : new GiftInfo.Builder().mergeFrom(this);
   }

   protected GiftInfo.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GiftInfo.Builder(var1);
   }

   public static GiftInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GiftInfo> parser() {
      return PARSER;
   }

   @Override
   public Parser<GiftInfo> getParserForType() {
      return PARSER;
   }

   public GiftInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GiftInfo.Builder> implements GiftInfoOrBuilder {
      private int bitField0_;
      private UuidAndUsername giftedBy_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> giftedByBuilder_;
      private Object message_ = "";
      private boolean isAnonymous_;

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftProto.internal_static_lunarclient_common_v1_GiftInfo_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftProto.internal_static_lunarclient_common_v1_GiftInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GiftInfo.class, GiftInfo.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GiftInfo.alwaysUseFieldBuilders) {
            this.getGiftedByFieldBuilder();
         }
      }

      public GiftInfo.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.giftedBy_ = null;
         if (this.giftedByBuilder_ != null) {
            this.giftedByBuilder_.dispose();
            this.giftedByBuilder_ = null;
         }

         this.message_ = "";
         this.isAnonymous_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return GiftProto.internal_static_lunarclient_common_v1_GiftInfo_descriptor;
      }

      public GiftInfo getDefaultInstanceForType() {
         return GiftInfo.getDefaultInstance();
      }

      public GiftInfo build() {
         GiftInfo var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GiftInfo buildPartial() {
         GiftInfo var1 = new GiftInfo(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GiftInfo var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.giftedBy_ = this.giftedByBuilder_ == null ? this.giftedBy_ : this.giftedByBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.message_ = this.message_;
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.isAnonymous_ = this.isAnonymous_;
         }

         GiftInfo var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public GiftInfo.Builder clone() {
         return (GiftInfo.Builder)super.clone();
      }

      public GiftInfo.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GiftInfo.Builder)super.setField(var1, var2);
      }

      public GiftInfo.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GiftInfo.Builder)super.clearField(var1);
      }

      public GiftInfo.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GiftInfo.Builder)super.clearOneof(var1);
      }

      public GiftInfo.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GiftInfo.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GiftInfo.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GiftInfo.Builder)super.addRepeatedField(var1, var2);
      }

      public GiftInfo.Builder mergeFrom(Message var1) {
         if (var1 instanceof GiftInfo) {
            return this.mergeFrom((GiftInfo)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GiftInfo.Builder mergeFrom(GiftInfo var1) {
         if (var1 == GiftInfo.getDefaultInstance()) {
            return this;
         }

         if (var1.hasGiftedBy()) {
            this.mergeGiftedBy(var1.getGiftedBy());
         }

         if (var1.hasMessage()) {
            this.message_ = var1.message_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.getIsAnonymous()) {
            this.setIsAnonymous(var1.getIsAnonymous());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GiftInfo.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getGiftedByFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.message_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.isAnonymous_ = var1.readBool();
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
      public boolean hasGiftedBy() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getGiftedBy() {
         if (this.giftedByBuilder_ == null) {
            return this.giftedBy_ == null ? UuidAndUsername.getDefaultInstance() : this.giftedBy_;
         } else {
            return this.giftedByBuilder_.getMessage();
         }
      }

      public GiftInfo.Builder setGiftedBy(UuidAndUsername var1) {
         if (this.giftedByBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.giftedBy_ = var1;
         } else {
            this.giftedByBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GiftInfo.Builder setGiftedBy(UuidAndUsername.Builder var1) {
         if (this.giftedByBuilder_ == null) {
            this.giftedBy_ = var1.build();
         } else {
            this.giftedByBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GiftInfo.Builder mergeGiftedBy(UuidAndUsername var1) {
         if (this.giftedByBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.giftedBy_ != null && this.giftedBy_ != UuidAndUsername.getDefaultInstance()) {
               this.getGiftedByBuilder().mergeFrom(var1);
            } else {
               this.giftedBy_ = var1;
            }
         } else {
            this.giftedByBuilder_.mergeFrom(var1);
         }

         if (this.giftedBy_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public GiftInfo.Builder clearGiftedBy() {
         this.bitField0_ &= -2;
         this.giftedBy_ = null;
         if (this.giftedByBuilder_ != null) {
            this.giftedByBuilder_.dispose();
            this.giftedByBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getGiftedByBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getGiftedByFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getGiftedByOrBuilder() {
         if (this.giftedByBuilder_ != null) {
            return this.giftedByBuilder_.getMessageOrBuilder();
         } else {
            return this.giftedBy_ == null ? UuidAndUsername.getDefaultInstance() : this.giftedBy_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getGiftedByFieldBuilder() {
         if (this.giftedByBuilder_ == null) {
            this.giftedByBuilder_ = new SingleFieldBuilderV3<>(this.getGiftedBy(), this.getParentForChildren(), this.isClean());
            this.giftedBy_ = null;
         }

         return this.giftedByBuilder_;
      }

      @Override
      public boolean hasMessage() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public String getMessage() {
         Object var1 = this.message_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.message_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMessageBytes() {
         Object var1 = this.message_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.message_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public GiftInfo.Builder setMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.message_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GiftInfo.Builder clearMessage() {
         this.message_ = GiftInfo.getDefaultInstance().getMessage();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public GiftInfo.Builder setMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GiftInfo.checkByteStringIsUtf8(var1);
         this.message_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getIsAnonymous() {
         return this.isAnonymous_;
      }

      public GiftInfo.Builder setIsAnonymous(boolean var1) {
         this.isAnonymous_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GiftInfo.Builder clearIsAnonymous() {
         this.bitField0_ &= -5;
         this.isAnonymous_ = false;
         this.onChanged();
         return this;
      }

      public final GiftInfo.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GiftInfo.Builder)super.setUnknownFields(var1);
      }

      public final GiftInfo.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GiftInfo.Builder)super.mergeUnknownFields(var1);
      }
   }
}
