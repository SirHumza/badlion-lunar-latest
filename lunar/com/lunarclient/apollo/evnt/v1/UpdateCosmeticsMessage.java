package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateCosmeticsMessage extends GeneratedMessageV3 implements UpdateCosmeticsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MODEL_LOCATIONS_FIELD_NUMBER = 1;
   private LazyStringArrayList modelLocations_ = LazyStringArrayList.emptyList();
   public static final int ANIMATION_LOCATIONS_FIELD_NUMBER = 2;
   private LazyStringArrayList animationLocations_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final UpdateCosmeticsMessage DEFAULT_INSTANCE = new UpdateCosmeticsMessage();
   private static final Parser<UpdateCosmeticsMessage> PARSER = new AbstractParser<UpdateCosmeticsMessage>() {
      public UpdateCosmeticsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateCosmeticsMessage.Builder var3 = UpdateCosmeticsMessage.newBuilder();

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

   private UpdateCosmeticsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateCosmeticsMessage() {
      this.modelLocations_ = LazyStringArrayList.emptyList();
      this.animationLocations_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateCosmeticsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateCosmeticsMessage.class, UpdateCosmeticsMessage.Builder.class);
   }

   public ProtocolStringList getModelLocationsList() {
      return this.modelLocations_;
   }

   @Override
   public int getModelLocationsCount() {
      return this.modelLocations_.size();
   }

   @Override
   public String getModelLocations(int var1) {
      return this.modelLocations_.get(var1);
   }

   @Override
   public ByteString getModelLocationsBytes(int var1) {
      return this.modelLocations_.getByteString(var1);
   }

   public ProtocolStringList getAnimationLocationsList() {
      return this.animationLocations_;
   }

   @Override
   public int getAnimationLocationsCount() {
      return this.animationLocations_.size();
   }

   @Override
   public String getAnimationLocations(int var1) {
      return this.animationLocations_.get(var1);
   }

   @Override
   public ByteString getAnimationLocationsBytes(int var1) {
      return this.animationLocations_.getByteString(var1);
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
      for (int var2 = 0; var2 < this.modelLocations_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 1, this.modelLocations_.getRaw(var2));
      }

      for (int var3 = 0; var3 < this.animationLocations_.size(); var3++) {
         GeneratedMessageV3.writeString(var1, 2, this.animationLocations_.getRaw(var3));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var4 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.modelLocations_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.modelLocations_.getRaw(var3));
      }

      var4 += var2;
      var4 += 1 * this.getModelLocationsList().size();
      var2 = 0;

      for (int var11 = 0; var11 < this.animationLocations_.size(); var11++) {
         var2 += computeStringSizeNoTag(this.animationLocations_.getRaw(var11));
      }

      var4 += var2;
      var4 += 1 * this.getAnimationLocationsList().size();
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateCosmeticsMessage)) {
         return super.equals(var1);
      } else {
         UpdateCosmeticsMessage var2 = (UpdateCosmeticsMessage)var1;
         if (!this.getModelLocationsList().equals(var2.getModelLocationsList())) {
            return false;
         } else {
            return !this.getAnimationLocationsList().equals(var2.getAnimationLocationsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getModelLocationsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getModelLocationsList().hashCode();
      }

      if (this.getAnimationLocationsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getAnimationLocationsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateCosmeticsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateCosmeticsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateCosmeticsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateCosmeticsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateCosmeticsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateCosmeticsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateCosmeticsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateCosmeticsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateCosmeticsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateCosmeticsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateCosmeticsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateCosmeticsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateCosmeticsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateCosmeticsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateCosmeticsMessage.Builder newBuilder(UpdateCosmeticsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateCosmeticsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateCosmeticsMessage.Builder() : new UpdateCosmeticsMessage.Builder().mergeFrom(this);
   }

   protected UpdateCosmeticsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateCosmeticsMessage.Builder(var1);
   }

   public static UpdateCosmeticsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateCosmeticsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateCosmeticsMessage> getParserForType() {
      return PARSER;
   }

   public UpdateCosmeticsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateCosmeticsMessage.Builder> implements UpdateCosmeticsMessageOrBuilder {
      private int bitField0_;
      private LazyStringArrayList modelLocations_ = LazyStringArrayList.emptyList();
      private LazyStringArrayList animationLocations_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateCosmeticsMessage.class, UpdateCosmeticsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateCosmeticsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.modelLocations_ = LazyStringArrayList.emptyList();
         this.animationLocations_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_descriptor;
      }

      public UpdateCosmeticsMessage getDefaultInstanceForType() {
         return UpdateCosmeticsMessage.getDefaultInstance();
      }

      public UpdateCosmeticsMessage build() {
         UpdateCosmeticsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateCosmeticsMessage buildPartial() {
         UpdateCosmeticsMessage var1 = new UpdateCosmeticsMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateCosmeticsMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.modelLocations_.makeImmutable();
            var1.modelLocations_ = this.modelLocations_;
         }

         if ((var2 & 2) != 0) {
            this.animationLocations_.makeImmutable();
            var1.animationLocations_ = this.animationLocations_;
         }
      }

      public UpdateCosmeticsMessage.Builder clone() {
         return (UpdateCosmeticsMessage.Builder)super.clone();
      }

      public UpdateCosmeticsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateCosmeticsMessage.Builder)super.setField(var1, var2);
      }

      public UpdateCosmeticsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateCosmeticsMessage.Builder)super.clearField(var1);
      }

      public UpdateCosmeticsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateCosmeticsMessage.Builder)super.clearOneof(var1);
      }

      public UpdateCosmeticsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateCosmeticsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateCosmeticsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateCosmeticsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateCosmeticsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateCosmeticsMessage) {
            return this.mergeFrom((UpdateCosmeticsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateCosmeticsMessage.Builder mergeFrom(UpdateCosmeticsMessage var1) {
         if (var1 == UpdateCosmeticsMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.modelLocations_.isEmpty()) {
            if (this.modelLocations_.isEmpty()) {
               this.modelLocations_ = var1.modelLocations_;
               this.bitField0_ |= 1;
            } else {
               this.ensureModelLocationsIsMutable();
               this.modelLocations_.addAll(var1.modelLocations_);
            }

            this.onChanged();
         }

         if (!var1.animationLocations_.isEmpty()) {
            if (this.animationLocations_.isEmpty()) {
               this.animationLocations_ = var1.animationLocations_;
               this.bitField0_ |= 2;
            } else {
               this.ensureAnimationLocationsIsMutable();
               this.animationLocations_.addAll(var1.animationLocations_);
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

      public UpdateCosmeticsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var11 = var1.readStringRequireUtf8();
                     this.ensureModelLocationsIsMutable();
                     this.modelLocations_.add(var11);
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureAnimationLocationsIsMutable();
                     this.animationLocations_.add(var5);
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

      private void ensureModelLocationsIsMutable() {
         if (!this.modelLocations_.isModifiable()) {
            this.modelLocations_ = new LazyStringArrayList(this.modelLocations_);
         }

         this.bitField0_ |= 1;
      }

      public ProtocolStringList getModelLocationsList() {
         this.modelLocations_.makeImmutable();
         return this.modelLocations_;
      }

      @Override
      public int getModelLocationsCount() {
         return this.modelLocations_.size();
      }

      @Override
      public String getModelLocations(int var1) {
         return this.modelLocations_.get(var1);
      }

      @Override
      public ByteString getModelLocationsBytes(int var1) {
         return this.modelLocations_.getByteString(var1);
      }

      public UpdateCosmeticsMessage.Builder setModelLocations(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureModelLocationsIsMutable();
         this.modelLocations_.set(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder addModelLocations(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureModelLocationsIsMutable();
         this.modelLocations_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder addAllModelLocations(Iterable<String> var1) {
         this.ensureModelLocationsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.modelLocations_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder clearModelLocations() {
         this.modelLocations_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder addModelLocationsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UpdateCosmeticsMessage.checkByteStringIsUtf8(var1);
         this.ensureModelLocationsIsMutable();
         this.modelLocations_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      private void ensureAnimationLocationsIsMutable() {
         if (!this.animationLocations_.isModifiable()) {
            this.animationLocations_ = new LazyStringArrayList(this.animationLocations_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getAnimationLocationsList() {
         this.animationLocations_.makeImmutable();
         return this.animationLocations_;
      }

      @Override
      public int getAnimationLocationsCount() {
         return this.animationLocations_.size();
      }

      @Override
      public String getAnimationLocations(int var1) {
         return this.animationLocations_.get(var1);
      }

      @Override
      public ByteString getAnimationLocationsBytes(int var1) {
         return this.animationLocations_.getByteString(var1);
      }

      public UpdateCosmeticsMessage.Builder setAnimationLocations(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAnimationLocationsIsMutable();
         this.animationLocations_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder addAnimationLocations(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAnimationLocationsIsMutable();
         this.animationLocations_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder addAllAnimationLocations(Iterable<String> var1) {
         this.ensureAnimationLocationsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.animationLocations_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder clearAnimationLocations() {
         this.animationLocations_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public UpdateCosmeticsMessage.Builder addAnimationLocationsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UpdateCosmeticsMessage.checkByteStringIsUtf8(var1);
         this.ensureAnimationLocationsIsMutable();
         this.animationLocations_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final UpdateCosmeticsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateCosmeticsMessage.Builder)super.setUnknownFields(var1);
      }

      public final UpdateCosmeticsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateCosmeticsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
