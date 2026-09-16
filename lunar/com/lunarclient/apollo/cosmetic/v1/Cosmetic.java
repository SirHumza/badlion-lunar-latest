package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.AbstractMessageLite;
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

public final class Cosmetic extends GeneratedMessageV3 implements CosmeticOrBuilder {
   private static final long serialVersionUID = 0L;
   private int optionsCase_ = 0;
   private Object options_;
   public static final int ID_FIELD_NUMBER = 1;
   private int id_ = 0;
   public static final int HAT_OPTIONS_FIELD_NUMBER = 2;
   public static final int CLOAK_OPTIONS_FIELD_NUMBER = 3;
   public static final int PET_OPTIONS_FIELD_NUMBER = 4;
   public static final int BODY_OPTIONS_FIELD_NUMBER = 5;
   private byte memoizedIsInitialized = -1;
   private static final Cosmetic DEFAULT_INSTANCE = new Cosmetic();
   private static final Parser<Cosmetic> PARSER = new AbstractParser<Cosmetic>() {
      public Cosmetic parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Cosmetic.Builder var3 = Cosmetic.newBuilder();

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

   private Cosmetic(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Cosmetic() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Cosmetic();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Cosmetic.class, Cosmetic.Builder.class);
   }

   @Override
   public Cosmetic.OptionsCase getOptionsCase() {
      return Cosmetic.OptionsCase.forNumber(this.optionsCase_);
   }

   @Override
   public int getId() {
      return this.id_;
   }

   @Override
   public boolean hasHatOptions() {
      return this.optionsCase_ == 2;
   }

   @Override
   public HatOptions getHatOptions() {
      return this.optionsCase_ == 2 ? (HatOptions)this.options_ : HatOptions.getDefaultInstance();
   }

   @Override
   public HatOptionsOrBuilder getHatOptionsOrBuilder() {
      return this.optionsCase_ == 2 ? (HatOptions)this.options_ : HatOptions.getDefaultInstance();
   }

   @Override
   public boolean hasCloakOptions() {
      return this.optionsCase_ == 3;
   }

   @Override
   public CloakOptions getCloakOptions() {
      return this.optionsCase_ == 3 ? (CloakOptions)this.options_ : CloakOptions.getDefaultInstance();
   }

   @Override
   public CloakOptionsOrBuilder getCloakOptionsOrBuilder() {
      return this.optionsCase_ == 3 ? (CloakOptions)this.options_ : CloakOptions.getDefaultInstance();
   }

   @Override
   public boolean hasPetOptions() {
      return this.optionsCase_ == 4;
   }

   @Override
   public PetOptions getPetOptions() {
      return this.optionsCase_ == 4 ? (PetOptions)this.options_ : PetOptions.getDefaultInstance();
   }

   @Override
   public PetOptionsOrBuilder getPetOptionsOrBuilder() {
      return this.optionsCase_ == 4 ? (PetOptions)this.options_ : PetOptions.getDefaultInstance();
   }

   @Override
   public boolean hasBodyOptions() {
      return this.optionsCase_ == 5;
   }

   @Override
   public BodyOptions getBodyOptions() {
      return this.optionsCase_ == 5 ? (BodyOptions)this.options_ : BodyOptions.getDefaultInstance();
   }

   @Override
   public BodyOptionsOrBuilder getBodyOptionsOrBuilder() {
      return this.optionsCase_ == 5 ? (BodyOptions)this.options_ : BodyOptions.getDefaultInstance();
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
      if (this.id_ != 0) {
         var1.writeInt32(1, this.id_);
      }

      if (this.optionsCase_ == 2) {
         var1.writeMessage(2, (HatOptions)this.options_);
      }

      if (this.optionsCase_ == 3) {
         var1.writeMessage(3, (CloakOptions)this.options_);
      }

      if (this.optionsCase_ == 4) {
         var1.writeMessage(4, (PetOptions)this.options_);
      }

      if (this.optionsCase_ == 5) {
         var1.writeMessage(5, (BodyOptions)this.options_);
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
      if (this.id_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.id_);
      }

      if (this.optionsCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (HatOptions)this.options_);
      }

      if (this.optionsCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (CloakOptions)this.options_);
      }

      if (this.optionsCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (PetOptions)this.options_);
      }

      if (this.optionsCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (BodyOptions)this.options_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Cosmetic)) {
         return super.equals(var1);
      }

      Cosmetic var2 = (Cosmetic)var1;
      if (this.getId() != var2.getId()) {
         return false;
      }

      if (!this.getOptionsCase().equals(var2.getOptionsCase())) {
         return false;
      }

      switch (this.optionsCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            if (!this.getHatOptions().equals(var2.getHatOptions())) {
               return false;
            }
            break;
         case 3:
            if (!this.getCloakOptions().equals(var2.getCloakOptions())) {
               return false;
            }
            break;
         case 4:
            if (!this.getPetOptions().equals(var2.getPetOptions())) {
               return false;
            }
            break;
         case 5:
            if (!this.getBodyOptions().equals(var2.getBodyOptions())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getId();
      switch (this.optionsCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getHatOptions().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getCloakOptions().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getPetOptions().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getBodyOptions().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Cosmetic parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Cosmetic parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Cosmetic parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Cosmetic parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Cosmetic parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Cosmetic parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Cosmetic parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Cosmetic parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Cosmetic parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Cosmetic parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Cosmetic parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Cosmetic parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Cosmetic.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Cosmetic.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Cosmetic.Builder newBuilder(Cosmetic var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Cosmetic.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Cosmetic.Builder() : new Cosmetic.Builder().mergeFrom(this);
   }

   protected Cosmetic.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Cosmetic.Builder(var1);
   }

   public static Cosmetic getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Cosmetic> parser() {
      return PARSER;
   }

   @Override
   public Parser<Cosmetic> getParserForType() {
      return PARSER;
   }

   public Cosmetic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Cosmetic.Builder> implements CosmeticOrBuilder {
      private int optionsCase_ = 0;
      private Object options_;
      private int bitField0_;
      private int id_;
      private SingleFieldBuilderV3<HatOptions, HatOptions.Builder, HatOptionsOrBuilder> hatOptionsBuilder_;
      private SingleFieldBuilderV3<CloakOptions, CloakOptions.Builder, CloakOptionsOrBuilder> cloakOptionsBuilder_;
      private SingleFieldBuilderV3<PetOptions, PetOptions.Builder, PetOptionsOrBuilder> petOptionsBuilder_;
      private SingleFieldBuilderV3<BodyOptions, BodyOptions.Builder, BodyOptionsOrBuilder> bodyOptionsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Cosmetic.class, Cosmetic.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Cosmetic.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = 0;
         if (this.hatOptionsBuilder_ != null) {
            this.hatOptionsBuilder_.clear();
         }

         if (this.cloakOptionsBuilder_ != null) {
            this.cloakOptionsBuilder_.clear();
         }

         if (this.petOptionsBuilder_ != null) {
            this.petOptionsBuilder_.clear();
         }

         if (this.bodyOptionsBuilder_ != null) {
            this.bodyOptionsBuilder_.clear();
         }

         this.optionsCase_ = 0;
         this.options_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Cosmetic_descriptor;
      }

      public Cosmetic getDefaultInstanceForType() {
         return Cosmetic.getDefaultInstance();
      }

      public Cosmetic build() {
         Cosmetic var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Cosmetic buildPartial() {
         Cosmetic var1 = new Cosmetic(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Cosmetic var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }
      }

      private void buildPartialOneofs(Cosmetic var1) {
         var1.optionsCase_ = this.optionsCase_;
         var1.options_ = this.options_;
         if (this.optionsCase_ == 2 && this.hatOptionsBuilder_ != null) {
            var1.options_ = this.hatOptionsBuilder_.build();
         }

         if (this.optionsCase_ == 3 && this.cloakOptionsBuilder_ != null) {
            var1.options_ = this.cloakOptionsBuilder_.build();
         }

         if (this.optionsCase_ == 4 && this.petOptionsBuilder_ != null) {
            var1.options_ = this.petOptionsBuilder_.build();
         }

         if (this.optionsCase_ == 5 && this.bodyOptionsBuilder_ != null) {
            var1.options_ = this.bodyOptionsBuilder_.build();
         }
      }

      public Cosmetic.Builder clone() {
         return (Cosmetic.Builder)super.clone();
      }

      public Cosmetic.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Cosmetic.Builder)super.setField(var1, var2);
      }

      public Cosmetic.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Cosmetic.Builder)super.clearField(var1);
      }

      public Cosmetic.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Cosmetic.Builder)super.clearOneof(var1);
      }

      public Cosmetic.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Cosmetic.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Cosmetic.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Cosmetic.Builder)super.addRepeatedField(var1, var2);
      }

      public Cosmetic.Builder mergeFrom(Message var1) {
         if (var1 instanceof Cosmetic) {
            return this.mergeFrom((Cosmetic)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Cosmetic.Builder mergeFrom(Cosmetic var1) {
         if (var1 == Cosmetic.getDefaultInstance()) {
            return this;
         }

         if (var1.getId() != 0) {
            this.setId(var1.getId());
         }

         switch (var1.getOptionsCase()) {
            case HAT_OPTIONS:
               this.mergeHatOptions(var1.getHatOptions());
               break;
            case CLOAK_OPTIONS:
               this.mergeCloakOptions(var1.getCloakOptions());
               break;
            case PET_OPTIONS:
               this.mergePetOptions(var1.getPetOptions());
               break;
            case BODY_OPTIONS:
               this.mergeBodyOptions(var1.getBodyOptions());
            case OPTIONS_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Cosmetic.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getHatOptionsFieldBuilder().getBuilder(), var2);
                     this.optionsCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getCloakOptionsFieldBuilder().getBuilder(), var2);
                     this.optionsCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getPetOptionsFieldBuilder().getBuilder(), var2);
                     this.optionsCase_ = 4;
                     break;
                  case 42:
                     var1.readMessage(this.getBodyOptionsFieldBuilder().getBuilder(), var2);
                     this.optionsCase_ = 5;
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
      public Cosmetic.OptionsCase getOptionsCase() {
         return Cosmetic.OptionsCase.forNumber(this.optionsCase_);
      }

      public Cosmetic.Builder clearOptions() {
         this.optionsCase_ = 0;
         this.options_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public int getId() {
         return this.id_;
      }

      public Cosmetic.Builder setId(int var1) {
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Cosmetic.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasHatOptions() {
         return this.optionsCase_ == 2;
      }

      @Override
      public HatOptions getHatOptions() {
         if (this.hatOptionsBuilder_ == null) {
            return this.optionsCase_ == 2 ? (HatOptions)this.options_ : HatOptions.getDefaultInstance();
         } else {
            return this.optionsCase_ == 2 ? this.hatOptionsBuilder_.getMessage() : HatOptions.getDefaultInstance();
         }
      }

      public Cosmetic.Builder setHatOptions(HatOptions var1) {
         if (this.hatOptionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.options_ = var1;
            this.onChanged();
         } else {
            this.hatOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 2;
         return this;
      }

      public Cosmetic.Builder setHatOptions(HatOptions.Builder var1) {
         if (this.hatOptionsBuilder_ == null) {
            this.options_ = var1.build();
            this.onChanged();
         } else {
            this.hatOptionsBuilder_.setMessage(var1.build());
         }

         this.optionsCase_ = 2;
         return this;
      }

      public Cosmetic.Builder mergeHatOptions(HatOptions var1) {
         if (this.hatOptionsBuilder_ == null) {
            if (this.optionsCase_ == 2 && this.options_ != HatOptions.getDefaultInstance()) {
               this.options_ = HatOptions.newBuilder((HatOptions)this.options_).mergeFrom(var1).buildPartial();
            } else {
               this.options_ = var1;
            }

            this.onChanged();
         } else if (this.optionsCase_ == 2) {
            this.hatOptionsBuilder_.mergeFrom(var1);
         } else {
            this.hatOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 2;
         return this;
      }

      public Cosmetic.Builder clearHatOptions() {
         if (this.hatOptionsBuilder_ == null) {
            if (this.optionsCase_ == 2) {
               this.optionsCase_ = 0;
               this.options_ = null;
               this.onChanged();
            }
         } else {
            if (this.optionsCase_ == 2) {
               this.optionsCase_ = 0;
               this.options_ = null;
            }

            this.hatOptionsBuilder_.clear();
         }

         return this;
      }

      public HatOptions.Builder getHatOptionsBuilder() {
         return this.getHatOptionsFieldBuilder().getBuilder();
      }

      @Override
      public HatOptionsOrBuilder getHatOptionsOrBuilder() {
         if (this.optionsCase_ == 2 && this.hatOptionsBuilder_ != null) {
            return this.hatOptionsBuilder_.getMessageOrBuilder();
         } else {
            return this.optionsCase_ == 2 ? (HatOptions)this.options_ : HatOptions.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<HatOptions, HatOptions.Builder, HatOptionsOrBuilder> getHatOptionsFieldBuilder() {
         if (this.hatOptionsBuilder_ == null) {
            if (this.optionsCase_ != 2) {
               this.options_ = HatOptions.getDefaultInstance();
            }

            this.hatOptionsBuilder_ = new SingleFieldBuilderV3<>((HatOptions)this.options_, this.getParentForChildren(), this.isClean());
            this.options_ = null;
         }

         this.optionsCase_ = 2;
         this.onChanged();
         return this.hatOptionsBuilder_;
      }

      @Override
      public boolean hasCloakOptions() {
         return this.optionsCase_ == 3;
      }

      @Override
      public CloakOptions getCloakOptions() {
         if (this.cloakOptionsBuilder_ == null) {
            return this.optionsCase_ == 3 ? (CloakOptions)this.options_ : CloakOptions.getDefaultInstance();
         } else {
            return this.optionsCase_ == 3 ? this.cloakOptionsBuilder_.getMessage() : CloakOptions.getDefaultInstance();
         }
      }

      public Cosmetic.Builder setCloakOptions(CloakOptions var1) {
         if (this.cloakOptionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.options_ = var1;
            this.onChanged();
         } else {
            this.cloakOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 3;
         return this;
      }

      public Cosmetic.Builder setCloakOptions(CloakOptions.Builder var1) {
         if (this.cloakOptionsBuilder_ == null) {
            this.options_ = var1.build();
            this.onChanged();
         } else {
            this.cloakOptionsBuilder_.setMessage(var1.build());
         }

         this.optionsCase_ = 3;
         return this;
      }

      public Cosmetic.Builder mergeCloakOptions(CloakOptions var1) {
         if (this.cloakOptionsBuilder_ == null) {
            if (this.optionsCase_ == 3 && this.options_ != CloakOptions.getDefaultInstance()) {
               this.options_ = CloakOptions.newBuilder((CloakOptions)this.options_).mergeFrom(var1).buildPartial();
            } else {
               this.options_ = var1;
            }

            this.onChanged();
         } else if (this.optionsCase_ == 3) {
            this.cloakOptionsBuilder_.mergeFrom(var1);
         } else {
            this.cloakOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 3;
         return this;
      }

      public Cosmetic.Builder clearCloakOptions() {
         if (this.cloakOptionsBuilder_ == null) {
            if (this.optionsCase_ == 3) {
               this.optionsCase_ = 0;
               this.options_ = null;
               this.onChanged();
            }
         } else {
            if (this.optionsCase_ == 3) {
               this.optionsCase_ = 0;
               this.options_ = null;
            }

            this.cloakOptionsBuilder_.clear();
         }

         return this;
      }

      public CloakOptions.Builder getCloakOptionsBuilder() {
         return this.getCloakOptionsFieldBuilder().getBuilder();
      }

      @Override
      public CloakOptionsOrBuilder getCloakOptionsOrBuilder() {
         if (this.optionsCase_ == 3 && this.cloakOptionsBuilder_ != null) {
            return this.cloakOptionsBuilder_.getMessageOrBuilder();
         } else {
            return this.optionsCase_ == 3 ? (CloakOptions)this.options_ : CloakOptions.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<CloakOptions, CloakOptions.Builder, CloakOptionsOrBuilder> getCloakOptionsFieldBuilder() {
         if (this.cloakOptionsBuilder_ == null) {
            if (this.optionsCase_ != 3) {
               this.options_ = CloakOptions.getDefaultInstance();
            }

            this.cloakOptionsBuilder_ = new SingleFieldBuilderV3<>((CloakOptions)this.options_, this.getParentForChildren(), this.isClean());
            this.options_ = null;
         }

         this.optionsCase_ = 3;
         this.onChanged();
         return this.cloakOptionsBuilder_;
      }

      @Override
      public boolean hasPetOptions() {
         return this.optionsCase_ == 4;
      }

      @Override
      public PetOptions getPetOptions() {
         if (this.petOptionsBuilder_ == null) {
            return this.optionsCase_ == 4 ? (PetOptions)this.options_ : PetOptions.getDefaultInstance();
         } else {
            return this.optionsCase_ == 4 ? this.petOptionsBuilder_.getMessage() : PetOptions.getDefaultInstance();
         }
      }

      public Cosmetic.Builder setPetOptions(PetOptions var1) {
         if (this.petOptionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.options_ = var1;
            this.onChanged();
         } else {
            this.petOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 4;
         return this;
      }

      public Cosmetic.Builder setPetOptions(PetOptions.Builder var1) {
         if (this.petOptionsBuilder_ == null) {
            this.options_ = var1.build();
            this.onChanged();
         } else {
            this.petOptionsBuilder_.setMessage(var1.build());
         }

         this.optionsCase_ = 4;
         return this;
      }

      public Cosmetic.Builder mergePetOptions(PetOptions var1) {
         if (this.petOptionsBuilder_ == null) {
            if (this.optionsCase_ == 4 && this.options_ != PetOptions.getDefaultInstance()) {
               this.options_ = PetOptions.newBuilder((PetOptions)this.options_).mergeFrom(var1).buildPartial();
            } else {
               this.options_ = var1;
            }

            this.onChanged();
         } else if (this.optionsCase_ == 4) {
            this.petOptionsBuilder_.mergeFrom(var1);
         } else {
            this.petOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 4;
         return this;
      }

      public Cosmetic.Builder clearPetOptions() {
         if (this.petOptionsBuilder_ == null) {
            if (this.optionsCase_ == 4) {
               this.optionsCase_ = 0;
               this.options_ = null;
               this.onChanged();
            }
         } else {
            if (this.optionsCase_ == 4) {
               this.optionsCase_ = 0;
               this.options_ = null;
            }

            this.petOptionsBuilder_.clear();
         }

         return this;
      }

      public PetOptions.Builder getPetOptionsBuilder() {
         return this.getPetOptionsFieldBuilder().getBuilder();
      }

      @Override
      public PetOptionsOrBuilder getPetOptionsOrBuilder() {
         if (this.optionsCase_ == 4 && this.petOptionsBuilder_ != null) {
            return this.petOptionsBuilder_.getMessageOrBuilder();
         } else {
            return this.optionsCase_ == 4 ? (PetOptions)this.options_ : PetOptions.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<PetOptions, PetOptions.Builder, PetOptionsOrBuilder> getPetOptionsFieldBuilder() {
         if (this.petOptionsBuilder_ == null) {
            if (this.optionsCase_ != 4) {
               this.options_ = PetOptions.getDefaultInstance();
            }

            this.petOptionsBuilder_ = new SingleFieldBuilderV3<>((PetOptions)this.options_, this.getParentForChildren(), this.isClean());
            this.options_ = null;
         }

         this.optionsCase_ = 4;
         this.onChanged();
         return this.petOptionsBuilder_;
      }

      @Override
      public boolean hasBodyOptions() {
         return this.optionsCase_ == 5;
      }

      @Override
      public BodyOptions getBodyOptions() {
         if (this.bodyOptionsBuilder_ == null) {
            return this.optionsCase_ == 5 ? (BodyOptions)this.options_ : BodyOptions.getDefaultInstance();
         } else {
            return this.optionsCase_ == 5 ? this.bodyOptionsBuilder_.getMessage() : BodyOptions.getDefaultInstance();
         }
      }

      public Cosmetic.Builder setBodyOptions(BodyOptions var1) {
         if (this.bodyOptionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.options_ = var1;
            this.onChanged();
         } else {
            this.bodyOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 5;
         return this;
      }

      public Cosmetic.Builder setBodyOptions(BodyOptions.Builder var1) {
         if (this.bodyOptionsBuilder_ == null) {
            this.options_ = var1.build();
            this.onChanged();
         } else {
            this.bodyOptionsBuilder_.setMessage(var1.build());
         }

         this.optionsCase_ = 5;
         return this;
      }

      public Cosmetic.Builder mergeBodyOptions(BodyOptions var1) {
         if (this.bodyOptionsBuilder_ == null) {
            if (this.optionsCase_ == 5 && this.options_ != BodyOptions.getDefaultInstance()) {
               this.options_ = BodyOptions.newBuilder((BodyOptions)this.options_).mergeFrom(var1).buildPartial();
            } else {
               this.options_ = var1;
            }

            this.onChanged();
         } else if (this.optionsCase_ == 5) {
            this.bodyOptionsBuilder_.mergeFrom(var1);
         } else {
            this.bodyOptionsBuilder_.setMessage(var1);
         }

         this.optionsCase_ = 5;
         return this;
      }

      public Cosmetic.Builder clearBodyOptions() {
         if (this.bodyOptionsBuilder_ == null) {
            if (this.optionsCase_ == 5) {
               this.optionsCase_ = 0;
               this.options_ = null;
               this.onChanged();
            }
         } else {
            if (this.optionsCase_ == 5) {
               this.optionsCase_ = 0;
               this.options_ = null;
            }

            this.bodyOptionsBuilder_.clear();
         }

         return this;
      }

      public BodyOptions.Builder getBodyOptionsBuilder() {
         return this.getBodyOptionsFieldBuilder().getBuilder();
      }

      @Override
      public BodyOptionsOrBuilder getBodyOptionsOrBuilder() {
         if (this.optionsCase_ == 5 && this.bodyOptionsBuilder_ != null) {
            return this.bodyOptionsBuilder_.getMessageOrBuilder();
         } else {
            return this.optionsCase_ == 5 ? (BodyOptions)this.options_ : BodyOptions.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<BodyOptions, BodyOptions.Builder, BodyOptionsOrBuilder> getBodyOptionsFieldBuilder() {
         if (this.bodyOptionsBuilder_ == null) {
            if (this.optionsCase_ != 5) {
               this.options_ = BodyOptions.getDefaultInstance();
            }

            this.bodyOptionsBuilder_ = new SingleFieldBuilderV3<>((BodyOptions)this.options_, this.getParentForChildren(), this.isClean());
            this.options_ = null;
         }

         this.optionsCase_ = 5;
         this.onChanged();
         return this.bodyOptionsBuilder_;
      }

      public final Cosmetic.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Cosmetic.Builder)super.setUnknownFields(var1);
      }

      public final Cosmetic.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Cosmetic.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum OptionsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      HAT_OPTIONS(2),
      CLOAK_OPTIONS(3),
      PET_OPTIONS(4),
      BODY_OPTIONS(5),
      OPTIONS_NOT_SET(0);

      private final int value;

      OptionsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Cosmetic.OptionsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Cosmetic.OptionsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return OPTIONS_NOT_SET;
            case 1:
            default:
               return null;
            case 2:
               return HAT_OPTIONS;
            case 3:
               return CLOAK_OPTIONS;
            case 4:
               return PET_OPTIONS;
            case 5:
               return BODY_OPTIONS;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
