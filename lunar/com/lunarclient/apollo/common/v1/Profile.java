package com.lunarclient.apollo.common.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Profile extends GeneratedMessageV3 implements ProfileOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   public static final int TEXTURE_FIELD_NUMBER = 2;
   private volatile Object texture_ = "";
   public static final int SIGNATURE_FIELD_NUMBER = 3;
   private volatile Object signature_ = "";
   private byte memoizedIsInitialized = -1;
   private static final Profile DEFAULT_INSTANCE = new Profile();
   private static final Parser<Profile> PARSER = new AbstractParser<Profile>() {
      public Profile parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Profile.Builder var3 = Profile.newBuilder();

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

   private Profile(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Profile() {
      this.texture_ = "";
      this.signature_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Profile();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ProfileProto.internal_static_lunarclient_apollo_common_v1_Profile_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ProfileProto.internal_static_lunarclient_apollo_common_v1_Profile_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Profile.class, Profile.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public String getTexture() {
      Object var1 = this.texture_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.texture_ = var3;
      return var3;
   }

   @Override
   public ByteString getTextureBytes() {
      Object var1 = this.texture_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.texture_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getSignature() {
      Object var1 = this.signature_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.signature_ = var3;
      return var3;
   }

   @Override
   public ByteString getSignatureBytes() {
      Object var1 = this.signature_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.signature_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
         var1.writeMessage(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.texture_)) {
         GeneratedMessageV3.writeString(var1, 2, this.texture_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
         GeneratedMessageV3.writeString(var1, 3, this.signature_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.texture_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.texture_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.signature_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Profile)) {
         return super.equals(var1);
      } else {
         Profile var2 = (Profile)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else if (this.hasId() && !this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getTexture().equals(var2.getTexture())) {
            return false;
         } else {
            return !this.getSignature().equals(var2.getSignature()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getTexture().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getSignature().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Profile parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Profile parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Profile parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Profile parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Profile parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Profile parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Profile parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Profile parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Profile parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Profile parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Profile parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Profile parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Profile.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Profile.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Profile.Builder newBuilder(Profile var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Profile.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Profile.Builder() : new Profile.Builder().mergeFrom(this);
   }

   protected Profile.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Profile.Builder(var1);
   }

   public static Profile getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Profile> parser() {
      return PARSER;
   }

   @Override
   public Parser<Profile> getParserForType() {
      return PARSER;
   }

   public Profile getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Profile.Builder> implements ProfileOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;
      private Object texture_ = "";
      private Object signature_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ProfileProto.internal_static_lunarclient_apollo_common_v1_Profile_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ProfileProto.internal_static_lunarclient_apollo_common_v1_Profile_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Profile.class, Profile.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Profile.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
         }
      }

      public Profile.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.texture_ = "";
         this.signature_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ProfileProto.internal_static_lunarclient_apollo_common_v1_Profile_descriptor;
      }

      public Profile getDefaultInstanceForType() {
         return Profile.getDefaultInstance();
      }

      public Profile build() {
         Profile var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Profile buildPartial() {
         Profile var1 = new Profile(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Profile var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.texture_ = this.texture_;
         }

         if ((var2 & 4) != 0) {
            var1.signature_ = this.signature_;
         }

         Profile var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public Profile.Builder clone() {
         return (Profile.Builder)super.clone();
      }

      public Profile.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Profile.Builder)super.setField(var1, var2);
      }

      public Profile.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Profile.Builder)super.clearField(var1);
      }

      public Profile.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Profile.Builder)super.clearOneof(var1);
      }

      public Profile.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Profile.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Profile.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Profile.Builder)super.addRepeatedField(var1, var2);
      }

      public Profile.Builder mergeFrom(Message var1) {
         if (var1 instanceof Profile) {
            return this.mergeFrom((Profile)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Profile.Builder mergeFrom(Profile var1) {
         if (var1 == Profile.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (!var1.getTexture().isEmpty()) {
            this.texture_ = var1.texture_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getSignature().isEmpty()) {
            this.signature_ = var1.signature_;
            this.bitField0_ |= 4;
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

      public Profile.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.texture_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.signature_ = var1.readStringRequireUtf8();
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
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public Profile.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Profile.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Profile.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public Profile.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      @Override
      public String getTexture() {
         Object var1 = this.texture_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.texture_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTextureBytes() {
         Object var1 = this.texture_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.texture_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Profile.Builder setTexture(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.texture_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Profile.Builder clearTexture() {
         this.texture_ = Profile.getDefaultInstance().getTexture();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public Profile.Builder setTextureBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Profile.checkByteStringIsUtf8(var1);
         this.texture_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getSignature() {
         Object var1 = this.signature_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.signature_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSignatureBytes() {
         Object var1 = this.signature_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.signature_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Profile.Builder setSignature(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.signature_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Profile.Builder clearSignature() {
         this.signature_ = Profile.getDefaultInstance().getSignature();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public Profile.Builder setSignatureBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Profile.checkByteStringIsUtf8(var1);
         this.signature_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final Profile.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Profile.Builder)super.setUnknownFields(var1);
      }

      public final Profile.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Profile.Builder)super.mergeUnknownFields(var1);
      }
   }
}
