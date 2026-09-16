package com.lunarclient.gameipc.promotion.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PendingPromotionUpdatePush extends GeneratedMessageV3 implements PendingPromotionUpdatePushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int HAS_PENDING_PROMOTION_FIELD_NUMBER = 1;
   private boolean hasPendingPromotion_ = false;
   public static final int PENDING_PROMOTIONS_FIELD_NUMBER = 2;
   private List<Integer> pendingPromotions_;
   private static final Internal.ListAdapter.Converter<Integer, PromotionType> pendingPromotions_converter_ = new Internal.ListAdapter.Converter<Integer, PromotionType>() {
      public PromotionType convert(Integer var1) {
         PromotionType var2 = PromotionType.forNumber(var1);
         return var2 == null ? PromotionType.UNRECOGNIZED : var2;
      }
   };
   private int pendingPromotionsMemoizedSerializedSize;
   private byte memoizedIsInitialized = -1;
   private static final PendingPromotionUpdatePush DEFAULT_INSTANCE = new PendingPromotionUpdatePush();
   private static final Parser<PendingPromotionUpdatePush> PARSER = new AbstractParser<PendingPromotionUpdatePush>() {
      public PendingPromotionUpdatePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PendingPromotionUpdatePush.Builder var3 = PendingPromotionUpdatePush.newBuilder();

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

   private PendingPromotionUpdatePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PendingPromotionUpdatePush() {
      this.pendingPromotions_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PendingPromotionUpdatePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PendingPromotionUpdatePush.class, PendingPromotionUpdatePush.Builder.class);
   }

   @Deprecated
   @Override
   public boolean getHasPendingPromotion() {
      return this.hasPendingPromotion_;
   }

   @Override
   public List<PromotionType> getPendingPromotionsList() {
      return new Internal.ListAdapter<>(this.pendingPromotions_, pendingPromotions_converter_);
   }

   @Override
   public int getPendingPromotionsCount() {
      return this.pendingPromotions_.size();
   }

   @Override
   public PromotionType getPendingPromotions(int var1) {
      return pendingPromotions_converter_.convert(this.pendingPromotions_.get(var1));
   }

   @Override
   public List<Integer> getPendingPromotionsValueList() {
      return this.pendingPromotions_;
   }

   @Override
   public int getPendingPromotionsValue(int var1) {
      return this.pendingPromotions_.get(var1);
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
      this.getSerializedSize();
      if (this.hasPendingPromotion_) {
         var1.writeBool(1, this.hasPendingPromotion_);
      }

      if (this.getPendingPromotionsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.pendingPromotionsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.pendingPromotions_.size(); var2++) {
         var1.writeEnumNoTag(this.pendingPromotions_.get(var2));
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
      if (this.hasPendingPromotion_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.hasPendingPromotion_);
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.pendingPromotions_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.pendingPromotions_.get(var3));
      }

      var1 += var2;
      if (!this.getPendingPromotionsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.pendingPromotionsMemoizedSerializedSize = var2;
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PendingPromotionUpdatePush)) {
         return super.equals(var1);
      } else {
         PendingPromotionUpdatePush var2 = (PendingPromotionUpdatePush)var1;
         if (this.getHasPendingPromotion() != var2.getHasPendingPromotion()) {
            return false;
         } else {
            return !this.pendingPromotions_.equals(var2.pendingPromotions_) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getHasPendingPromotion());
      if (this.getPendingPromotionsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.pendingPromotions_.hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PendingPromotionUpdatePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PendingPromotionUpdatePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PendingPromotionUpdatePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PendingPromotionUpdatePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PendingPromotionUpdatePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PendingPromotionUpdatePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PendingPromotionUpdatePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PendingPromotionUpdatePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PendingPromotionUpdatePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PendingPromotionUpdatePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PendingPromotionUpdatePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PendingPromotionUpdatePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PendingPromotionUpdatePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PendingPromotionUpdatePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PendingPromotionUpdatePush.Builder newBuilder(PendingPromotionUpdatePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PendingPromotionUpdatePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PendingPromotionUpdatePush.Builder() : new PendingPromotionUpdatePush.Builder().mergeFrom(this);
   }

   protected PendingPromotionUpdatePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PendingPromotionUpdatePush.Builder(var1);
   }

   public static PendingPromotionUpdatePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PendingPromotionUpdatePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<PendingPromotionUpdatePush> getParserForType() {
      return PARSER;
   }

   public PendingPromotionUpdatePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PendingPromotionUpdatePush.Builder> implements PendingPromotionUpdatePushOrBuilder {
      private int bitField0_;
      private boolean hasPendingPromotion_;
      private List<Integer> pendingPromotions_ = Collections.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PendingPromotionUpdatePush.class, PendingPromotionUpdatePush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PendingPromotionUpdatePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.hasPendingPromotion_ = false;
         this.pendingPromotions_ = Collections.emptyList();
         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_promotion_v1_PendingPromotionUpdatePush_descriptor;
      }

      public PendingPromotionUpdatePush getDefaultInstanceForType() {
         return PendingPromotionUpdatePush.getDefaultInstance();
      }

      public PendingPromotionUpdatePush build() {
         PendingPromotionUpdatePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PendingPromotionUpdatePush buildPartial() {
         PendingPromotionUpdatePush var1 = new PendingPromotionUpdatePush(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PendingPromotionUpdatePush var1) {
         if ((this.bitField0_ & 2) != 0) {
            this.pendingPromotions_ = Collections.unmodifiableList(this.pendingPromotions_);
            this.bitField0_ &= -3;
         }

         var1.pendingPromotions_ = this.pendingPromotions_;
      }

      private void buildPartial0(PendingPromotionUpdatePush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.hasPendingPromotion_ = this.hasPendingPromotion_;
         }
      }

      public PendingPromotionUpdatePush.Builder clone() {
         return (PendingPromotionUpdatePush.Builder)super.clone();
      }

      public PendingPromotionUpdatePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PendingPromotionUpdatePush.Builder)super.setField(var1, var2);
      }

      public PendingPromotionUpdatePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PendingPromotionUpdatePush.Builder)super.clearField(var1);
      }

      public PendingPromotionUpdatePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PendingPromotionUpdatePush.Builder)super.clearOneof(var1);
      }

      public PendingPromotionUpdatePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PendingPromotionUpdatePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PendingPromotionUpdatePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PendingPromotionUpdatePush.Builder)super.addRepeatedField(var1, var2);
      }

      public PendingPromotionUpdatePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof PendingPromotionUpdatePush) {
            return this.mergeFrom((PendingPromotionUpdatePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PendingPromotionUpdatePush.Builder mergeFrom(PendingPromotionUpdatePush var1) {
         if (var1 == PendingPromotionUpdatePush.getDefaultInstance()) {
            return this;
         }

         if (var1.getHasPendingPromotion()) {
            this.setHasPendingPromotion(var1.getHasPendingPromotion());
         }

         if (!var1.pendingPromotions_.isEmpty()) {
            if (this.pendingPromotions_.isEmpty()) {
               this.pendingPromotions_ = var1.pendingPromotions_;
               this.bitField0_ &= -3;
            } else {
               this.ensurePendingPromotionsIsMutable();
               this.pendingPromotions_.addAll(var1.pendingPromotions_);
            }

            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PendingPromotionUpdatePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.hasPendingPromotion_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     int var13 = var1.readEnum();
                     this.ensurePendingPromotionsIsMutable();
                     this.pendingPromotions_.add(var13);
                     break;
                  case 18:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensurePendingPromotionsIsMutable();
                        this.pendingPromotions_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Deprecated
      @Override
      public boolean getHasPendingPromotion() {
         return this.hasPendingPromotion_;
      }

      @Deprecated
      public PendingPromotionUpdatePush.Builder setHasPendingPromotion(boolean var1) {
         this.hasPendingPromotion_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public PendingPromotionUpdatePush.Builder clearHasPendingPromotion() {
         this.bitField0_ &= -2;
         this.hasPendingPromotion_ = false;
         this.onChanged();
         return this;
      }

      private void ensurePendingPromotionsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.pendingPromotions_ = new ArrayList<>(this.pendingPromotions_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PromotionType> getPendingPromotionsList() {
         return new Internal.ListAdapter<>(this.pendingPromotions_, PendingPromotionUpdatePush.pendingPromotions_converter_);
      }

      @Override
      public int getPendingPromotionsCount() {
         return this.pendingPromotions_.size();
      }

      @Override
      public PromotionType getPendingPromotions(int var1) {
         return PendingPromotionUpdatePush.pendingPromotions_converter_.convert(this.pendingPromotions_.get(var1));
      }

      public PendingPromotionUpdatePush.Builder setPendingPromotions(int var1, PromotionType var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePendingPromotionsIsMutable();
         this.pendingPromotions_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public PendingPromotionUpdatePush.Builder addPendingPromotions(PromotionType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensurePendingPromotionsIsMutable();
         this.pendingPromotions_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public PendingPromotionUpdatePush.Builder addAllPendingPromotions(Iterable<? extends PromotionType> var1) {
         this.ensurePendingPromotionsIsMutable();

         for (PromotionType var3 : var1) {
            this.pendingPromotions_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public PendingPromotionUpdatePush.Builder clearPendingPromotions() {
         this.pendingPromotions_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getPendingPromotionsValueList() {
         return Collections.unmodifiableList(this.pendingPromotions_);
      }

      @Override
      public int getPendingPromotionsValue(int var1) {
         return this.pendingPromotions_.get(var1);
      }

      public PendingPromotionUpdatePush.Builder setPendingPromotionsValue(int var1, int var2) {
         this.ensurePendingPromotionsIsMutable();
         this.pendingPromotions_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public PendingPromotionUpdatePush.Builder addPendingPromotionsValue(int var1) {
         this.ensurePendingPromotionsIsMutable();
         this.pendingPromotions_.add(var1);
         this.onChanged();
         return this;
      }

      public PendingPromotionUpdatePush.Builder addAllPendingPromotionsValue(Iterable<Integer> var1) {
         this.ensurePendingPromotionsIsMutable();

         for (int var3 : var1) {
            this.pendingPromotions_.add(var3);
         }

         this.onChanged();
         return this;
      }

      public final PendingPromotionUpdatePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PendingPromotionUpdatePush.Builder)super.setUnknownFields(var1);
      }

      public final PendingPromotionUpdatePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PendingPromotionUpdatePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
