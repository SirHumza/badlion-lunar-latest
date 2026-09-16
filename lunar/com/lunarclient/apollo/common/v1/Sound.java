package com.lunarclient.apollo.common.v1;

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

public final class Sound extends GeneratedMessageV3 implements SoundOrBuilder {
   private static final long serialVersionUID = 0L;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int SIMPLE_RESOURCE_LOCATION_FIELD_NUMBER = 1;
   private byte memoizedIsInitialized = -1;
   private static final Sound DEFAULT_INSTANCE = new Sound();
   private static final Parser<Sound> PARSER = new AbstractParser<Sound>() {
      public Sound parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Sound.Builder var3 = Sound.newBuilder();

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

   private Sound(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Sound() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Sound();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SoundProto.internal_static_lunarclient_apollo_common_v1_Sound_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SoundProto.internal_static_lunarclient_apollo_common_v1_Sound_fieldAccessorTable.ensureFieldAccessorsInitialized(Sound.class, Sound.Builder.class);
   }

   @Override
   public Sound.ContentsCase getContentsCase() {
      return Sound.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasSimpleResourceLocation() {
      return this.contentsCase_ == 1;
   }

   @Override
   public SimpleResourceLocationSound getSimpleResourceLocation() {
      return this.contentsCase_ == 1 ? (SimpleResourceLocationSound)this.contents_ : SimpleResourceLocationSound.getDefaultInstance();
   }

   @Override
   public SimpleResourceLocationSoundOrBuilder getSimpleResourceLocationOrBuilder() {
      return this.contentsCase_ == 1 ? (SimpleResourceLocationSound)this.contents_ : SimpleResourceLocationSound.getDefaultInstance();
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
      if (this.contentsCase_ == 1) {
         var1.writeMessage(1, (SimpleResourceLocationSound)this.contents_);
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
      if (this.contentsCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (SimpleResourceLocationSound)this.contents_);
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

      if (!(var1 instanceof Sound)) {
         return super.equals(var1);
      }

      Sound var2 = (Sound)var1;
      if (!this.getContentsCase().equals(var2.getContentsCase())) {
         return false;
      }

      switch (this.contentsCase_) {
         case 1:
            if (!this.getSimpleResourceLocation().equals(var2.getSimpleResourceLocation())) {
               return false;
            }
         case 0:
         default:
            return this.getUnknownFields().equals(var2.getUnknownFields());
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.contentsCase_) {
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getSimpleResourceLocation().hashCode();
         case 0:
         default:
            var1 = 29 * var1 + this.getUnknownFields().hashCode();
            this.memoizedHashCode = var1;
            return var1;
      }
   }

   public static Sound parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Sound parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Sound parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Sound parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Sound parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Sound parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Sound parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Sound parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Sound parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Sound parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Sound parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Sound parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Sound.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Sound.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Sound.Builder newBuilder(Sound var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Sound.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Sound.Builder() : new Sound.Builder().mergeFrom(this);
   }

   protected Sound.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Sound.Builder(var1);
   }

   public static Sound getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Sound> parser() {
      return PARSER;
   }

   @Override
   public Parser<Sound> getParserForType() {
      return PARSER;
   }

   public Sound getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Sound.Builder> implements SoundOrBuilder {
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<SimpleResourceLocationSound, SimpleResourceLocationSound.Builder, SimpleResourceLocationSoundOrBuilder> simpleResourceLocationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SoundProto.internal_static_lunarclient_apollo_common_v1_Sound_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SoundProto.internal_static_lunarclient_apollo_common_v1_Sound_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Sound.class, Sound.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Sound.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.simpleResourceLocationBuilder_ != null) {
            this.simpleResourceLocationBuilder_.clear();
         }

         this.contentsCase_ = 0;
         this.contents_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SoundProto.internal_static_lunarclient_apollo_common_v1_Sound_descriptor;
      }

      public Sound getDefaultInstanceForType() {
         return Sound.getDefaultInstance();
      }

      public Sound build() {
         Sound var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Sound buildPartial() {
         Sound var1 = new Sound(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Sound var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(Sound var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 1 && this.simpleResourceLocationBuilder_ != null) {
            var1.contents_ = this.simpleResourceLocationBuilder_.build();
         }
      }

      public Sound.Builder clone() {
         return (Sound.Builder)super.clone();
      }

      public Sound.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Sound.Builder)super.setField(var1, var2);
      }

      public Sound.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Sound.Builder)super.clearField(var1);
      }

      public Sound.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Sound.Builder)super.clearOneof(var1);
      }

      public Sound.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Sound.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Sound.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Sound.Builder)super.addRepeatedField(var1, var2);
      }

      public Sound.Builder mergeFrom(Message var1) {
         if (var1 instanceof Sound) {
            return this.mergeFrom((Sound)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Sound.Builder mergeFrom(Sound var1) {
         if (var1 == Sound.getDefaultInstance()) {
            return this;
         }

         switch (var1.getContentsCase()) {
            case SIMPLE_RESOURCE_LOCATION:
               this.mergeSimpleResourceLocation(var1.getSimpleResourceLocation());
            case CONTENTS_NOT_SET:
            default:
               this.mergeUnknownFields(var1.getUnknownFields());
               this.onChanged();
               return this;
         }
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Sound.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSimpleResourceLocationFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 1;
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
      public Sound.ContentsCase getContentsCase() {
         return Sound.ContentsCase.forNumber(this.contentsCase_);
      }

      public Sound.Builder clearContents() {
         this.contentsCase_ = 0;
         this.contents_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasSimpleResourceLocation() {
         return this.contentsCase_ == 1;
      }

      @Override
      public SimpleResourceLocationSound getSimpleResourceLocation() {
         if (this.simpleResourceLocationBuilder_ == null) {
            return this.contentsCase_ == 1 ? (SimpleResourceLocationSound)this.contents_ : SimpleResourceLocationSound.getDefaultInstance();
         } else {
            return this.contentsCase_ == 1 ? this.simpleResourceLocationBuilder_.getMessage() : SimpleResourceLocationSound.getDefaultInstance();
         }
      }

      public Sound.Builder setSimpleResourceLocation(SimpleResourceLocationSound var1) {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.simpleResourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public Sound.Builder setSimpleResourceLocation(SimpleResourceLocationSound.Builder var1) {
         if (this.simpleResourceLocationBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.simpleResourceLocationBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 1;
         return this;
      }

      public Sound.Builder mergeSimpleResourceLocation(SimpleResourceLocationSound var1) {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 1 && this.contents_ != SimpleResourceLocationSound.getDefaultInstance()) {
               this.contents_ = SimpleResourceLocationSound.newBuilder((SimpleResourceLocationSound)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 1) {
            this.simpleResourceLocationBuilder_.mergeFrom(var1);
         } else {
            this.simpleResourceLocationBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public Sound.Builder clearSimpleResourceLocation() {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.simpleResourceLocationBuilder_.clear();
         }

         return this;
      }

      public SimpleResourceLocationSound.Builder getSimpleResourceLocationBuilder() {
         return this.getSimpleResourceLocationFieldBuilder().getBuilder();
      }

      @Override
      public SimpleResourceLocationSoundOrBuilder getSimpleResourceLocationOrBuilder() {
         if (this.contentsCase_ == 1 && this.simpleResourceLocationBuilder_ != null) {
            return this.simpleResourceLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 1 ? (SimpleResourceLocationSound)this.contents_ : SimpleResourceLocationSound.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SimpleResourceLocationSound, SimpleResourceLocationSound.Builder, SimpleResourceLocationSoundOrBuilder> getSimpleResourceLocationFieldBuilder() {
         if (this.simpleResourceLocationBuilder_ == null) {
            if (this.contentsCase_ != 1) {
               this.contents_ = SimpleResourceLocationSound.getDefaultInstance();
            }

            this.simpleResourceLocationBuilder_ = new SingleFieldBuilderV3<>(
               (SimpleResourceLocationSound)this.contents_, this.getParentForChildren(), this.isClean()
            );
            this.contents_ = null;
         }

         this.contentsCase_ = 1;
         this.onChanged();
         return this.simpleResourceLocationBuilder_;
      }

      public final Sound.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Sound.Builder)super.setUnknownFields(var1);
      }

      public final Sound.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Sound.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      SIMPLE_RESOURCE_LOCATION(1),
      CONTENTS_NOT_SET(0);

      private final int value;

      ContentsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Sound.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Sound.ContentsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENTS_NOT_SET;
            case 1:
               return SIMPLE_RESOURCE_LOCATION;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
