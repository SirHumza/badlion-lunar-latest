package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class OutfitTree extends GeneratedMessageV3 implements OutfitTreeOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONDITIONAL_OUTFITS_FIELD_NUMBER = 1;
   private List<OutfitTree.ConditionalOutfit> conditionalOutfits_;
   public static final int DEFAULT_OUTFIT_ID_FIELD_NUMBER = 2;
   private Uuid defaultOutfitId_;
   private byte memoizedIsInitialized = -1;
   private static final OutfitTree DEFAULT_INSTANCE = new OutfitTree();
   private static final Parser<OutfitTree> PARSER = new AbstractParser<OutfitTree>() {
      public OutfitTree parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OutfitTree.Builder var3 = OutfitTree.newBuilder();

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

   private OutfitTree(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OutfitTree() {
      this.conditionalOutfits_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OutfitTree();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OutfitTree.class, OutfitTree.Builder.class);
   }

   @Override
   public List<OutfitTree.ConditionalOutfit> getConditionalOutfitsList() {
      return this.conditionalOutfits_;
   }

   @Override
   public List<? extends OutfitTree.ConditionalOutfitOrBuilder> getConditionalOutfitsOrBuilderList() {
      return this.conditionalOutfits_;
   }

   @Override
   public int getConditionalOutfitsCount() {
      return this.conditionalOutfits_.size();
   }

   @Override
   public OutfitTree.ConditionalOutfit getConditionalOutfits(int var1) {
      return this.conditionalOutfits_.get(var1);
   }

   @Override
   public OutfitTree.ConditionalOutfitOrBuilder getConditionalOutfitsOrBuilder(int var1) {
      return this.conditionalOutfits_.get(var1);
   }

   @Override
   public boolean hasDefaultOutfitId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getDefaultOutfitId() {
      return this.defaultOutfitId_ == null ? Uuid.getDefaultInstance() : this.defaultOutfitId_;
   }

   @Override
   public UuidOrBuilder getDefaultOutfitIdOrBuilder() {
      return this.defaultOutfitId_ == null ? Uuid.getDefaultInstance() : this.defaultOutfitId_;
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
      for (int var2 = 0; var2 < this.conditionalOutfits_.size(); var2++) {
         var1.writeMessage(1, this.conditionalOutfits_.get(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getDefaultOutfitId());
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

      for (int var2 = 0; var2 < this.conditionalOutfits_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.conditionalOutfits_.get(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getDefaultOutfitId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OutfitTree)) {
         return super.equals(var1);
      } else {
         OutfitTree var2 = (OutfitTree)var1;
         if (!this.getConditionalOutfitsList().equals(var2.getConditionalOutfitsList())) {
            return false;
         } else if (this.hasDefaultOutfitId() != var2.hasDefaultOutfitId()) {
            return false;
         } else {
            return this.hasDefaultOutfitId() && !this.getDefaultOutfitId().equals(var2.getDefaultOutfitId())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getConditionalOutfitsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConditionalOutfitsList().hashCode();
      }

      if (this.hasDefaultOutfitId()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getDefaultOutfitId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OutfitTree parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OutfitTree parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OutfitTree parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OutfitTree parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OutfitTree parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OutfitTree parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OutfitTree parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OutfitTree parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OutfitTree parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OutfitTree parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OutfitTree parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OutfitTree parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OutfitTree.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OutfitTree.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OutfitTree.Builder newBuilder(OutfitTree var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OutfitTree.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OutfitTree.Builder() : new OutfitTree.Builder().mergeFrom(this);
   }

   protected OutfitTree.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OutfitTree.Builder(var1);
   }

   public static OutfitTree getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OutfitTree> parser() {
      return PARSER;
   }

   @Override
   public Parser<OutfitTree> getParserForType() {
      return PARSER;
   }

   public OutfitTree getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OutfitTree.Builder> implements OutfitTreeOrBuilder {
      private int bitField0_;
      private List<OutfitTree.ConditionalOutfit> conditionalOutfits_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OutfitTree.ConditionalOutfit, OutfitTree.ConditionalOutfit.Builder, OutfitTree.ConditionalOutfitOrBuilder> conditionalOutfitsBuilder_;
      private Uuid defaultOutfitId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> defaultOutfitIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OutfitTree.class, OutfitTree.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OutfitTree.alwaysUseFieldBuilders) {
            this.getConditionalOutfitsFieldBuilder();
            this.getDefaultOutfitIdFieldBuilder();
         }
      }

      public OutfitTree.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.conditionalOutfitsBuilder_ == null) {
            this.conditionalOutfits_ = Collections.emptyList();
         } else {
            this.conditionalOutfits_ = null;
            this.conditionalOutfitsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.defaultOutfitId_ = null;
         if (this.defaultOutfitIdBuilder_ != null) {
            this.defaultOutfitIdBuilder_.dispose();
            this.defaultOutfitIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_descriptor;
      }

      public OutfitTree getDefaultInstanceForType() {
         return OutfitTree.getDefaultInstance();
      }

      public OutfitTree build() {
         OutfitTree var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OutfitTree buildPartial() {
         OutfitTree var1 = new OutfitTree(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(OutfitTree var1) {
         if (this.conditionalOutfitsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.conditionalOutfits_ = Collections.unmodifiableList(this.conditionalOutfits_);
               this.bitField0_ &= -2;
            }

            var1.conditionalOutfits_ = this.conditionalOutfits_;
         } else {
            var1.conditionalOutfits_ = this.conditionalOutfitsBuilder_.build();
         }
      }

      private void buildPartial0(OutfitTree var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.defaultOutfitId_ = this.defaultOutfitIdBuilder_ == null ? this.defaultOutfitId_ : this.defaultOutfitIdBuilder_.build();
            var3 |= 1;
         }

         OutfitTree var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OutfitTree.Builder clone() {
         return (OutfitTree.Builder)super.clone();
      }

      public OutfitTree.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OutfitTree.Builder)super.setField(var1, var2);
      }

      public OutfitTree.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OutfitTree.Builder)super.clearField(var1);
      }

      public OutfitTree.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OutfitTree.Builder)super.clearOneof(var1);
      }

      public OutfitTree.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OutfitTree.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OutfitTree.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OutfitTree.Builder)super.addRepeatedField(var1, var2);
      }

      public OutfitTree.Builder mergeFrom(Message var1) {
         if (var1 instanceof OutfitTree) {
            return this.mergeFrom((OutfitTree)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OutfitTree.Builder mergeFrom(OutfitTree var1) {
         if (var1 == OutfitTree.getDefaultInstance()) {
            return this;
         }

         if (this.conditionalOutfitsBuilder_ == null) {
            if (!var1.conditionalOutfits_.isEmpty()) {
               if (this.conditionalOutfits_.isEmpty()) {
                  this.conditionalOutfits_ = var1.conditionalOutfits_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureConditionalOutfitsIsMutable();
                  this.conditionalOutfits_.addAll(var1.conditionalOutfits_);
               }

               this.onChanged();
            }
         } else if (!var1.conditionalOutfits_.isEmpty()) {
            if (this.conditionalOutfitsBuilder_.isEmpty()) {
               this.conditionalOutfitsBuilder_.dispose();
               this.conditionalOutfitsBuilder_ = null;
               this.conditionalOutfits_ = var1.conditionalOutfits_;
               this.bitField0_ &= -2;
               this.conditionalOutfitsBuilder_ = OutfitTree.alwaysUseFieldBuilders ? this.getConditionalOutfitsFieldBuilder() : null;
            } else {
               this.conditionalOutfitsBuilder_.addAllMessages(var1.conditionalOutfits_);
            }
         }

         if (var1.hasDefaultOutfitId()) {
            this.mergeDefaultOutfitId(var1.getDefaultOutfitId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OutfitTree.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     OutfitTree.ConditionalOutfit var5 = var1.readMessage(OutfitTree.ConditionalOutfit.parser(), var2);
                     if (this.conditionalOutfitsBuilder_ == null) {
                        this.ensureConditionalOutfitsIsMutable();
                        this.conditionalOutfits_.add(var5);
                     } else {
                        this.conditionalOutfitsBuilder_.addMessage(var5);
                     }
                     break;
                  case 18:
                     var1.readMessage(this.getDefaultOutfitIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensureConditionalOutfitsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.conditionalOutfits_ = new ArrayList<>(this.conditionalOutfits_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<OutfitTree.ConditionalOutfit> getConditionalOutfitsList() {
         return this.conditionalOutfitsBuilder_ == null
            ? Collections.unmodifiableList(this.conditionalOutfits_)
            : this.conditionalOutfitsBuilder_.getMessageList();
      }

      @Override
      public int getConditionalOutfitsCount() {
         return this.conditionalOutfitsBuilder_ == null ? this.conditionalOutfits_.size() : this.conditionalOutfitsBuilder_.getCount();
      }

      @Override
      public OutfitTree.ConditionalOutfit getConditionalOutfits(int var1) {
         return this.conditionalOutfitsBuilder_ == null ? this.conditionalOutfits_.get(var1) : this.conditionalOutfitsBuilder_.getMessage(var1);
      }

      public OutfitTree.Builder setConditionalOutfits(int var1, OutfitTree.ConditionalOutfit var2) {
         if (this.conditionalOutfitsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.set(var1, var2);
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public OutfitTree.Builder setConditionalOutfits(int var1, OutfitTree.ConditionalOutfit.Builder var2) {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public OutfitTree.Builder addConditionalOutfits(OutfitTree.ConditionalOutfit var1) {
         if (this.conditionalOutfitsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.add(var1);
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.addMessage(var1);
         }

         return this;
      }

      public OutfitTree.Builder addConditionalOutfits(int var1, OutfitTree.ConditionalOutfit var2) {
         if (this.conditionalOutfitsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.add(var1, var2);
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public OutfitTree.Builder addConditionalOutfits(OutfitTree.ConditionalOutfit.Builder var1) {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.add(var1.build());
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public OutfitTree.Builder addConditionalOutfits(int var1, OutfitTree.ConditionalOutfit.Builder var2) {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public OutfitTree.Builder addAllConditionalOutfits(Iterable<? extends OutfitTree.ConditionalOutfit> var1) {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.ensureConditionalOutfitsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.conditionalOutfits_);
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public OutfitTree.Builder clearConditionalOutfits() {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.conditionalOutfits_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.clear();
         }

         return this;
      }

      public OutfitTree.Builder removeConditionalOutfits(int var1) {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.ensureConditionalOutfitsIsMutable();
            this.conditionalOutfits_.remove(var1);
            this.onChanged();
         } else {
            this.conditionalOutfitsBuilder_.remove(var1);
         }

         return this;
      }

      public OutfitTree.ConditionalOutfit.Builder getConditionalOutfitsBuilder(int var1) {
         return this.getConditionalOutfitsFieldBuilder().getBuilder(var1);
      }

      @Override
      public OutfitTree.ConditionalOutfitOrBuilder getConditionalOutfitsOrBuilder(int var1) {
         return this.conditionalOutfitsBuilder_ == null ? this.conditionalOutfits_.get(var1) : this.conditionalOutfitsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OutfitTree.ConditionalOutfitOrBuilder> getConditionalOutfitsOrBuilderList() {
         return this.conditionalOutfitsBuilder_ != null
            ? this.conditionalOutfitsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.conditionalOutfits_);
      }

      public OutfitTree.ConditionalOutfit.Builder addConditionalOutfitsBuilder() {
         return this.getConditionalOutfitsFieldBuilder().addBuilder(OutfitTree.ConditionalOutfit.getDefaultInstance());
      }

      public OutfitTree.ConditionalOutfit.Builder addConditionalOutfitsBuilder(int var1) {
         return this.getConditionalOutfitsFieldBuilder().addBuilder(var1, OutfitTree.ConditionalOutfit.getDefaultInstance());
      }

      public List<OutfitTree.ConditionalOutfit.Builder> getConditionalOutfitsBuilderList() {
         return this.getConditionalOutfitsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OutfitTree.ConditionalOutfit, OutfitTree.ConditionalOutfit.Builder, OutfitTree.ConditionalOutfitOrBuilder> getConditionalOutfitsFieldBuilder() {
         if (this.conditionalOutfitsBuilder_ == null) {
            this.conditionalOutfitsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.conditionalOutfits_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.conditionalOutfits_ = null;
         }

         return this.conditionalOutfitsBuilder_;
      }

      @Override
      public boolean hasDefaultOutfitId() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getDefaultOutfitId() {
         if (this.defaultOutfitIdBuilder_ == null) {
            return this.defaultOutfitId_ == null ? Uuid.getDefaultInstance() : this.defaultOutfitId_;
         } else {
            return this.defaultOutfitIdBuilder_.getMessage();
         }
      }

      public OutfitTree.Builder setDefaultOutfitId(Uuid var1) {
         if (this.defaultOutfitIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.defaultOutfitId_ = var1;
         } else {
            this.defaultOutfitIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OutfitTree.Builder setDefaultOutfitId(Uuid.Builder var1) {
         if (this.defaultOutfitIdBuilder_ == null) {
            this.defaultOutfitId_ = var1.build();
         } else {
            this.defaultOutfitIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OutfitTree.Builder mergeDefaultOutfitId(Uuid var1) {
         if (this.defaultOutfitIdBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.defaultOutfitId_ != null && this.defaultOutfitId_ != Uuid.getDefaultInstance()) {
               this.getDefaultOutfitIdBuilder().mergeFrom(var1);
            } else {
               this.defaultOutfitId_ = var1;
            }
         } else {
            this.defaultOutfitIdBuilder_.mergeFrom(var1);
         }

         if (this.defaultOutfitId_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public OutfitTree.Builder clearDefaultOutfitId() {
         this.bitField0_ &= -3;
         this.defaultOutfitId_ = null;
         if (this.defaultOutfitIdBuilder_ != null) {
            this.defaultOutfitIdBuilder_.dispose();
            this.defaultOutfitIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getDefaultOutfitIdBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getDefaultOutfitIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getDefaultOutfitIdOrBuilder() {
         if (this.defaultOutfitIdBuilder_ != null) {
            return this.defaultOutfitIdBuilder_.getMessageOrBuilder();
         } else {
            return this.defaultOutfitId_ == null ? Uuid.getDefaultInstance() : this.defaultOutfitId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getDefaultOutfitIdFieldBuilder() {
         if (this.defaultOutfitIdBuilder_ == null) {
            this.defaultOutfitIdBuilder_ = new SingleFieldBuilderV3<>(this.getDefaultOutfitId(), this.getParentForChildren(), this.isClean());
            this.defaultOutfitId_ = null;
         }

         return this.defaultOutfitIdBuilder_;
      }

      public final OutfitTree.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OutfitTree.Builder)super.setUnknownFields(var1);
      }

      public final OutfitTree.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OutfitTree.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class ConditionalOutfit extends GeneratedMessageV3 implements OutfitTree.ConditionalOutfitOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EQUIP_CONDITION_FIELD_NUMBER = 1;
      private EquipCondition equipCondition_;
      public static final int OUTFIT_ID_FIELD_NUMBER = 2;
      private Uuid outfitId_;
      private byte memoizedIsInitialized = -1;
      private static final OutfitTree.ConditionalOutfit DEFAULT_INSTANCE = new OutfitTree.ConditionalOutfit();
      private static final Parser<OutfitTree.ConditionalOutfit> PARSER = new AbstractParser<OutfitTree.ConditionalOutfit>() {
         public OutfitTree.ConditionalOutfit parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            OutfitTree.ConditionalOutfit.Builder var3 = OutfitTree.ConditionalOutfit.newBuilder();

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

      private ConditionalOutfit(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private ConditionalOutfit() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new OutfitTree.ConditionalOutfit();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OutfitTree.ConditionalOutfit.class, OutfitTree.ConditionalOutfit.Builder.class);
      }

      @Override
      public boolean hasEquipCondition() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public EquipCondition getEquipCondition() {
         return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
      }

      @Override
      public EquipConditionOrBuilder getEquipConditionOrBuilder() {
         return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
      }

      @Override
      public boolean hasOutfitId() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getOutfitId() {
         return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
      }

      @Override
      public UuidOrBuilder getOutfitIdOrBuilder() {
         return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
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
            var1.writeMessage(1, this.getEquipCondition());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(2, this.getOutfitId());
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getEquipCondition());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(2, this.getOutfitId());
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof OutfitTree.ConditionalOutfit)) {
            return super.equals(var1);
         } else {
            OutfitTree.ConditionalOutfit var2 = (OutfitTree.ConditionalOutfit)var1;
            if (this.hasEquipCondition() != var2.hasEquipCondition()) {
               return false;
            } else if (this.hasEquipCondition() && !this.getEquipCondition().equals(var2.getEquipCondition())) {
               return false;
            } else if (this.hasOutfitId() != var2.hasOutfitId()) {
               return false;
            } else {
               return this.hasOutfitId() && !this.getOutfitId().equals(var2.getOutfitId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasEquipCondition()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getEquipCondition().hashCode();
         }

         if (this.hasOutfitId()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getOutfitId().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static OutfitTree.ConditionalOutfit parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static OutfitTree.ConditionalOutfit parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static OutfitTree.ConditionalOutfit parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static OutfitTree.ConditionalOutfit parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public OutfitTree.ConditionalOutfit.Builder newBuilderForType() {
         return newBuilder();
      }

      public static OutfitTree.ConditionalOutfit.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static OutfitTree.ConditionalOutfit.Builder newBuilder(OutfitTree.ConditionalOutfit var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public OutfitTree.ConditionalOutfit.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new OutfitTree.ConditionalOutfit.Builder() : new OutfitTree.ConditionalOutfit.Builder().mergeFrom(this);
      }

      protected OutfitTree.ConditionalOutfit.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new OutfitTree.ConditionalOutfit.Builder(var1);
      }

      public static OutfitTree.ConditionalOutfit getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OutfitTree.ConditionalOutfit> parser() {
         return PARSER;
      }

      @Override
      public Parser<OutfitTree.ConditionalOutfit> getParserForType() {
         return PARSER;
      }

      public OutfitTree.ConditionalOutfit getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<OutfitTree.ConditionalOutfit.Builder>
         implements OutfitTree.ConditionalOutfitOrBuilder {
         private int bitField0_;
         private EquipCondition equipCondition_;
         private SingleFieldBuilderV3<EquipCondition, EquipCondition.Builder, EquipConditionOrBuilder> equipConditionBuilder_;
         private Uuid outfitId_;
         private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> outfitIdBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_fieldAccessorTable
               .ensureFieldAccessorsInitialized(OutfitTree.ConditionalOutfit.class, OutfitTree.ConditionalOutfit.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (OutfitTree.ConditionalOutfit.alwaysUseFieldBuilders) {
               this.getEquipConditionFieldBuilder();
               this.getOutfitIdFieldBuilder();
            }
         }

         public OutfitTree.ConditionalOutfit.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.equipCondition_ = null;
            if (this.equipConditionBuilder_ != null) {
               this.equipConditionBuilder_.dispose();
               this.equipConditionBuilder_ = null;
            }

            this.outfitId_ = null;
            if (this.outfitIdBuilder_ != null) {
               this.outfitIdBuilder_.dispose();
               this.outfitIdBuilder_ = null;
            }

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_OutfitTree_ConditionalOutfit_descriptor;
         }

         public OutfitTree.ConditionalOutfit getDefaultInstanceForType() {
            return OutfitTree.ConditionalOutfit.getDefaultInstance();
         }

         public OutfitTree.ConditionalOutfit build() {
            OutfitTree.ConditionalOutfit var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public OutfitTree.ConditionalOutfit buildPartial() {
            OutfitTree.ConditionalOutfit var1 = new OutfitTree.ConditionalOutfit(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(OutfitTree.ConditionalOutfit var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.equipCondition_ = this.equipConditionBuilder_ == null ? this.equipCondition_ : this.equipConditionBuilder_.build();
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.outfitId_ = this.outfitIdBuilder_ == null ? this.outfitId_ : this.outfitIdBuilder_.build();
               var3 |= 2;
            }

            OutfitTree.ConditionalOutfit var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public OutfitTree.ConditionalOutfit.Builder clone() {
            return (OutfitTree.ConditionalOutfit.Builder)super.clone();
         }

         public OutfitTree.ConditionalOutfit.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (OutfitTree.ConditionalOutfit.Builder)super.setField(var1, var2);
         }

         public OutfitTree.ConditionalOutfit.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (OutfitTree.ConditionalOutfit.Builder)super.clearField(var1);
         }

         public OutfitTree.ConditionalOutfit.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (OutfitTree.ConditionalOutfit.Builder)super.clearOneof(var1);
         }

         public OutfitTree.ConditionalOutfit.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (OutfitTree.ConditionalOutfit.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public OutfitTree.ConditionalOutfit.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (OutfitTree.ConditionalOutfit.Builder)super.addRepeatedField(var1, var2);
         }

         public OutfitTree.ConditionalOutfit.Builder mergeFrom(Message var1) {
            if (var1 instanceof OutfitTree.ConditionalOutfit) {
               return this.mergeFrom((OutfitTree.ConditionalOutfit)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder mergeFrom(OutfitTree.ConditionalOutfit var1) {
            if (var1 == OutfitTree.ConditionalOutfit.getDefaultInstance()) {
               return this;
            }

            if (var1.hasEquipCondition()) {
               this.mergeEquipCondition(var1.getEquipCondition());
            }

            if (var1.hasOutfitId()) {
               this.mergeOutfitId(var1.getOutfitId());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public OutfitTree.ConditionalOutfit.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getEquipConditionFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        var1.readMessage(this.getOutfitIdFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 2;
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
         public boolean hasEquipCondition() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public EquipCondition getEquipCondition() {
            if (this.equipConditionBuilder_ == null) {
               return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
            } else {
               return this.equipConditionBuilder_.getMessage();
            }
         }

         public OutfitTree.ConditionalOutfit.Builder setEquipCondition(EquipCondition var1) {
            if (this.equipConditionBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.equipCondition_ = var1;
            } else {
               this.equipConditionBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder setEquipCondition(EquipCondition.Builder var1) {
            if (this.equipConditionBuilder_ == null) {
               this.equipCondition_ = var1.build();
            } else {
               this.equipConditionBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder mergeEquipCondition(EquipCondition var1) {
            if (this.equipConditionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.equipCondition_ != null && this.equipCondition_ != EquipCondition.getDefaultInstance()) {
                  this.getEquipConditionBuilder().mergeFrom(var1);
               } else {
                  this.equipCondition_ = var1;
               }
            } else {
               this.equipConditionBuilder_.mergeFrom(var1);
            }

            if (this.equipCondition_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder clearEquipCondition() {
            this.bitField0_ &= -2;
            this.equipCondition_ = null;
            if (this.equipConditionBuilder_ != null) {
               this.equipConditionBuilder_.dispose();
               this.equipConditionBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public EquipCondition.Builder getEquipConditionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getEquipConditionFieldBuilder().getBuilder();
         }

         @Override
         public EquipConditionOrBuilder getEquipConditionOrBuilder() {
            if (this.equipConditionBuilder_ != null) {
               return this.equipConditionBuilder_.getMessageOrBuilder();
            } else {
               return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
            }
         }

         private SingleFieldBuilderV3<EquipCondition, EquipCondition.Builder, EquipConditionOrBuilder> getEquipConditionFieldBuilder() {
            if (this.equipConditionBuilder_ == null) {
               this.equipConditionBuilder_ = new SingleFieldBuilderV3<>(this.getEquipCondition(), this.getParentForChildren(), this.isClean());
               this.equipCondition_ = null;
            }

            return this.equipConditionBuilder_;
         }

         @Override
         public boolean hasOutfitId() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public Uuid getOutfitId() {
            if (this.outfitIdBuilder_ == null) {
               return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
            } else {
               return this.outfitIdBuilder_.getMessage();
            }
         }

         public OutfitTree.ConditionalOutfit.Builder setOutfitId(Uuid var1) {
            if (this.outfitIdBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.outfitId_ = var1;
            } else {
               this.outfitIdBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder setOutfitId(Uuid.Builder var1) {
            if (this.outfitIdBuilder_ == null) {
               this.outfitId_ = var1.build();
            } else {
               this.outfitIdBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder mergeOutfitId(Uuid var1) {
            if (this.outfitIdBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.outfitId_ != null && this.outfitId_ != Uuid.getDefaultInstance()) {
                  this.getOutfitIdBuilder().mergeFrom(var1);
               } else {
                  this.outfitId_ = var1;
               }
            } else {
               this.outfitIdBuilder_.mergeFrom(var1);
            }

            if (this.outfitId_ != null) {
               this.bitField0_ |= 2;
               this.onChanged();
            }

            return this;
         }

         public OutfitTree.ConditionalOutfit.Builder clearOutfitId() {
            this.bitField0_ &= -3;
            this.outfitId_ = null;
            if (this.outfitIdBuilder_ != null) {
               this.outfitIdBuilder_.dispose();
               this.outfitIdBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Uuid.Builder getOutfitIdBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return this.getOutfitIdFieldBuilder().getBuilder();
         }

         @Override
         public UuidOrBuilder getOutfitIdOrBuilder() {
            if (this.outfitIdBuilder_ != null) {
               return this.outfitIdBuilder_.getMessageOrBuilder();
            } else {
               return this.outfitId_ == null ? Uuid.getDefaultInstance() : this.outfitId_;
            }
         }

         private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getOutfitIdFieldBuilder() {
            if (this.outfitIdBuilder_ == null) {
               this.outfitIdBuilder_ = new SingleFieldBuilderV3<>(this.getOutfitId(), this.getParentForChildren(), this.isClean());
               this.outfitId_ = null;
            }

            return this.outfitIdBuilder_;
         }

         public final OutfitTree.ConditionalOutfit.Builder setUnknownFields(UnknownFieldSet var1) {
            return (OutfitTree.ConditionalOutfit.Builder)super.setUnknownFields(var1);
         }

         public final OutfitTree.ConditionalOutfit.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (OutfitTree.ConditionalOutfit.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface ConditionalOutfitOrBuilder extends MessageOrBuilder {
      boolean hasEquipCondition();

      EquipCondition getEquipCondition();

      EquipConditionOrBuilder getEquipConditionOrBuilder();

      boolean hasOutfitId();

      Uuid getOutfitId();

      UuidOrBuilder getOutfitIdOrBuilder();
   }
}
