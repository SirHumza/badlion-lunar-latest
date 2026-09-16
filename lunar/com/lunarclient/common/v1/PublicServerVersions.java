package com.lunarclient.common.v1;

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
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PublicServerVersions extends GeneratedMessageV3 implements PublicServerVersionsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SUPPORTED_FIELD_NUMBER = 1;
   private List<MinecraftVersion> supported_;
   public static final int RECOMMENDED_FIELD_NUMBER = 2;
   private MinecraftVersion recommended_;
   private byte memoizedIsInitialized = -1;
   private static final PublicServerVersions DEFAULT_INSTANCE = new PublicServerVersions();
   private static final Parser<PublicServerVersions> PARSER = new AbstractParser<PublicServerVersions>() {
      public PublicServerVersions parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PublicServerVersions.Builder var3 = PublicServerVersions.newBuilder();

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

   private PublicServerVersions(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PublicServerVersions() {
      this.supported_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PublicServerVersions();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_PublicServerVersions_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_PublicServerVersions_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PublicServerVersions.class, PublicServerVersions.Builder.class);
   }

   @Override
   public List<MinecraftVersion> getSupportedList() {
      return this.supported_;
   }

   @Override
   public List<? extends MinecraftVersionOrBuilder> getSupportedOrBuilderList() {
      return this.supported_;
   }

   @Override
   public int getSupportedCount() {
      return this.supported_.size();
   }

   @Override
   public MinecraftVersion getSupported(int var1) {
      return this.supported_.get(var1);
   }

   @Override
   public MinecraftVersionOrBuilder getSupportedOrBuilder(int var1) {
      return this.supported_.get(var1);
   }

   @Override
   public boolean hasRecommended() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public MinecraftVersion getRecommended() {
      return this.recommended_ == null ? MinecraftVersion.getDefaultInstance() : this.recommended_;
   }

   @Override
   public MinecraftVersionOrBuilder getRecommendedOrBuilder() {
      return this.recommended_ == null ? MinecraftVersion.getDefaultInstance() : this.recommended_;
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
      for (int var2 = 0; var2 < this.supported_.size(); var2++) {
         var1.writeMessage(1, this.supported_.get(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getRecommended());
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

      for (int var2 = 0; var2 < this.supported_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.supported_.get(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getRecommended());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PublicServerVersions)) {
         return super.equals(var1);
      } else {
         PublicServerVersions var2 = (PublicServerVersions)var1;
         if (!this.getSupportedList().equals(var2.getSupportedList())) {
            return false;
         } else if (this.hasRecommended() != var2.hasRecommended()) {
            return false;
         } else {
            return this.hasRecommended() && !this.getRecommended().equals(var2.getRecommended())
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
      if (this.getSupportedCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSupportedList().hashCode();
      }

      if (this.hasRecommended()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRecommended().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PublicServerVersions parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServerVersions parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServerVersions parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServerVersions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServerVersions parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PublicServerVersions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PublicServerVersions parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PublicServerVersions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PublicServerVersions parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PublicServerVersions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PublicServerVersions parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PublicServerVersions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PublicServerVersions.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PublicServerVersions.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PublicServerVersions.Builder newBuilder(PublicServerVersions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PublicServerVersions.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PublicServerVersions.Builder() : new PublicServerVersions.Builder().mergeFrom(this);
   }

   protected PublicServerVersions.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PublicServerVersions.Builder(var1);
   }

   public static PublicServerVersions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PublicServerVersions> parser() {
      return PARSER;
   }

   @Override
   public Parser<PublicServerVersions> getParserForType() {
      return PARSER;
   }

   public PublicServerVersions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PublicServerVersions.Builder> implements PublicServerVersionsOrBuilder {
      private int bitField0_;
      private List<MinecraftVersion> supported_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> supportedBuilder_;
      private MinecraftVersion recommended_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> recommendedBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServerVersions_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServerVersions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PublicServerVersions.class, PublicServerVersions.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PublicServerVersions.alwaysUseFieldBuilders) {
            this.getSupportedFieldBuilder();
            this.getRecommendedFieldBuilder();
         }
      }

      public PublicServerVersions.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.supportedBuilder_ == null) {
            this.supported_ = Collections.emptyList();
         } else {
            this.supported_ = null;
            this.supportedBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.recommended_ = null;
         if (this.recommendedBuilder_ != null) {
            this.recommendedBuilder_.dispose();
            this.recommendedBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_PublicServerVersions_descriptor;
      }

      public PublicServerVersions getDefaultInstanceForType() {
         return PublicServerVersions.getDefaultInstance();
      }

      public PublicServerVersions build() {
         PublicServerVersions var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PublicServerVersions buildPartial() {
         PublicServerVersions var1 = new PublicServerVersions(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PublicServerVersions var1) {
         if (this.supportedBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.supported_ = Collections.unmodifiableList(this.supported_);
               this.bitField0_ &= -2;
            }

            var1.supported_ = this.supported_;
         } else {
            var1.supported_ = this.supportedBuilder_.build();
         }
      }

      private void buildPartial0(PublicServerVersions var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.recommended_ = this.recommendedBuilder_ == null ? this.recommended_ : this.recommendedBuilder_.build();
            var3 |= 1;
         }

         PublicServerVersions var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PublicServerVersions.Builder clone() {
         return (PublicServerVersions.Builder)super.clone();
      }

      public PublicServerVersions.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PublicServerVersions.Builder)super.setField(var1, var2);
      }

      public PublicServerVersions.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PublicServerVersions.Builder)super.clearField(var1);
      }

      public PublicServerVersions.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PublicServerVersions.Builder)super.clearOneof(var1);
      }

      public PublicServerVersions.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PublicServerVersions.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PublicServerVersions.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PublicServerVersions.Builder)super.addRepeatedField(var1, var2);
      }

      public PublicServerVersions.Builder mergeFrom(Message var1) {
         if (var1 instanceof PublicServerVersions) {
            return this.mergeFrom((PublicServerVersions)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PublicServerVersions.Builder mergeFrom(PublicServerVersions var1) {
         if (var1 == PublicServerVersions.getDefaultInstance()) {
            return this;
         }

         if (this.supportedBuilder_ == null) {
            if (!var1.supported_.isEmpty()) {
               if (this.supported_.isEmpty()) {
                  this.supported_ = var1.supported_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureSupportedIsMutable();
                  this.supported_.addAll(var1.supported_);
               }

               this.onChanged();
            }
         } else if (!var1.supported_.isEmpty()) {
            if (this.supportedBuilder_.isEmpty()) {
               this.supportedBuilder_.dispose();
               this.supportedBuilder_ = null;
               this.supported_ = var1.supported_;
               this.bitField0_ &= -2;
               this.supportedBuilder_ = PublicServerVersions.alwaysUseFieldBuilders ? this.getSupportedFieldBuilder() : null;
            } else {
               this.supportedBuilder_.addAllMessages(var1.supported_);
            }
         }

         if (var1.hasRecommended()) {
            this.mergeRecommended(var1.getRecommended());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PublicServerVersions.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     MinecraftVersion var5 = var1.readMessage(MinecraftVersion.parser(), var2);
                     if (this.supportedBuilder_ == null) {
                        this.ensureSupportedIsMutable();
                        this.supported_.add(var5);
                     } else {
                        this.supportedBuilder_.addMessage(var5);
                     }
                     break;
                  case 18:
                     var1.readMessage(this.getRecommendedFieldBuilder().getBuilder(), var2);
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

      private void ensureSupportedIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.supported_ = new ArrayList<>(this.supported_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<MinecraftVersion> getSupportedList() {
         return this.supportedBuilder_ == null ? Collections.unmodifiableList(this.supported_) : this.supportedBuilder_.getMessageList();
      }

      @Override
      public int getSupportedCount() {
         return this.supportedBuilder_ == null ? this.supported_.size() : this.supportedBuilder_.getCount();
      }

      @Override
      public MinecraftVersion getSupported(int var1) {
         return this.supportedBuilder_ == null ? this.supported_.get(var1) : this.supportedBuilder_.getMessage(var1);
      }

      public PublicServerVersions.Builder setSupported(int var1, MinecraftVersion var2) {
         if (this.supportedBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSupportedIsMutable();
            this.supported_.set(var1, var2);
            this.onChanged();
         } else {
            this.supportedBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public PublicServerVersions.Builder setSupported(int var1, MinecraftVersion.Builder var2) {
         if (this.supportedBuilder_ == null) {
            this.ensureSupportedIsMutable();
            this.supported_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.supportedBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public PublicServerVersions.Builder addSupported(MinecraftVersion var1) {
         if (this.supportedBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureSupportedIsMutable();
            this.supported_.add(var1);
            this.onChanged();
         } else {
            this.supportedBuilder_.addMessage(var1);
         }

         return this;
      }

      public PublicServerVersions.Builder addSupported(int var1, MinecraftVersion var2) {
         if (this.supportedBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSupportedIsMutable();
            this.supported_.add(var1, var2);
            this.onChanged();
         } else {
            this.supportedBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public PublicServerVersions.Builder addSupported(MinecraftVersion.Builder var1) {
         if (this.supportedBuilder_ == null) {
            this.ensureSupportedIsMutable();
            this.supported_.add(var1.build());
            this.onChanged();
         } else {
            this.supportedBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public PublicServerVersions.Builder addSupported(int var1, MinecraftVersion.Builder var2) {
         if (this.supportedBuilder_ == null) {
            this.ensureSupportedIsMutable();
            this.supported_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.supportedBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public PublicServerVersions.Builder addAllSupported(Iterable<? extends MinecraftVersion> var1) {
         if (this.supportedBuilder_ == null) {
            this.ensureSupportedIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.supported_);
            this.onChanged();
         } else {
            this.supportedBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public PublicServerVersions.Builder clearSupported() {
         if (this.supportedBuilder_ == null) {
            this.supported_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.supportedBuilder_.clear();
         }

         return this;
      }

      public PublicServerVersions.Builder removeSupported(int var1) {
         if (this.supportedBuilder_ == null) {
            this.ensureSupportedIsMutable();
            this.supported_.remove(var1);
            this.onChanged();
         } else {
            this.supportedBuilder_.remove(var1);
         }

         return this;
      }

      public MinecraftVersion.Builder getSupportedBuilder(int var1) {
         return this.getSupportedFieldBuilder().getBuilder(var1);
      }

      @Override
      public MinecraftVersionOrBuilder getSupportedOrBuilder(int var1) {
         return this.supportedBuilder_ == null ? this.supported_.get(var1) : this.supportedBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends MinecraftVersionOrBuilder> getSupportedOrBuilderList() {
         return this.supportedBuilder_ != null ? this.supportedBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.supported_);
      }

      public MinecraftVersion.Builder addSupportedBuilder() {
         return this.getSupportedFieldBuilder().addBuilder(MinecraftVersion.getDefaultInstance());
      }

      public MinecraftVersion.Builder addSupportedBuilder(int var1) {
         return this.getSupportedFieldBuilder().addBuilder(var1, MinecraftVersion.getDefaultInstance());
      }

      public List<MinecraftVersion.Builder> getSupportedBuilderList() {
         return this.getSupportedFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getSupportedFieldBuilder() {
         if (this.supportedBuilder_ == null) {
            this.supportedBuilder_ = new RepeatedFieldBuilderV3<>(this.supported_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.supported_ = null;
         }

         return this.supportedBuilder_;
      }

      @Override
      public boolean hasRecommended() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public MinecraftVersion getRecommended() {
         if (this.recommendedBuilder_ == null) {
            return this.recommended_ == null ? MinecraftVersion.getDefaultInstance() : this.recommended_;
         } else {
            return this.recommendedBuilder_.getMessage();
         }
      }

      public PublicServerVersions.Builder setRecommended(MinecraftVersion var1) {
         if (this.recommendedBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.recommended_ = var1;
         } else {
            this.recommendedBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PublicServerVersions.Builder setRecommended(MinecraftVersion.Builder var1) {
         if (this.recommendedBuilder_ == null) {
            this.recommended_ = var1.build();
         } else {
            this.recommendedBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PublicServerVersions.Builder mergeRecommended(MinecraftVersion var1) {
         if (this.recommendedBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.recommended_ != null && this.recommended_ != MinecraftVersion.getDefaultInstance()) {
               this.getRecommendedBuilder().mergeFrom(var1);
            } else {
               this.recommended_ = var1;
            }
         } else {
            this.recommendedBuilder_.mergeFrom(var1);
         }

         if (this.recommended_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PublicServerVersions.Builder clearRecommended() {
         this.bitField0_ &= -3;
         this.recommended_ = null;
         if (this.recommendedBuilder_ != null) {
            this.recommendedBuilder_.dispose();
            this.recommendedBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getRecommendedBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getRecommendedFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftVersionOrBuilder getRecommendedOrBuilder() {
         if (this.recommendedBuilder_ != null) {
            return this.recommendedBuilder_.getMessageOrBuilder();
         } else {
            return this.recommended_ == null ? MinecraftVersion.getDefaultInstance() : this.recommended_;
         }
      }

      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getRecommendedFieldBuilder() {
         if (this.recommendedBuilder_ == null) {
            this.recommendedBuilder_ = new SingleFieldBuilderV3<>(this.getRecommended(), this.getParentForChildren(), this.isClean());
            this.recommended_ = null;
         }

         return this.recommendedBuilder_;
      }

      public final PublicServerVersions.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PublicServerVersions.Builder)super.setUnknownFields(var1);
      }

      public final PublicServerVersions.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PublicServerVersions.Builder)super.mergeUnknownFields(var1);
      }
   }
}
