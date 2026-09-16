package com.lunarclient.common.v1;

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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RadioTrack extends GeneratedMessageV3 implements RadioTrackOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TITLE_FIELD_NUMBER = 1;
   private volatile Object title_ = "";
   public static final int ARTIST_NAMES_FIELD_NUMBER = 2;
   private LazyStringArrayList artistNames_ = LazyStringArrayList.emptyList();
   public static final int DURATION_FIELD_NUMBER = 3;
   private int duration_ = 0;
   public static final int PROGRESS_FIELD_NUMBER = 4;
   private int progress_ = 0;
   public static final int PAUSED_FIELD_NUMBER = 5;
   private boolean paused_ = false;
   public static final int IMAGE_URL_FIELD_NUMBER = 6;
   private volatile Object imageUrl_ = "";
   private byte memoizedIsInitialized = -1;
   private static final RadioTrack DEFAULT_INSTANCE = new RadioTrack();
   private static final Parser<RadioTrack> PARSER = new AbstractParser<RadioTrack>() {
      public RadioTrack parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RadioTrack.Builder var3 = RadioTrack.newBuilder();

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

   private RadioTrack(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RadioTrack() {
      this.title_ = "";
      this.artistNames_ = LazyStringArrayList.emptyList();
      this.imageUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RadioTrack();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RadioProto.internal_static_lunarclient_common_v1_RadioTrack_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RadioProto.internal_static_lunarclient_common_v1_RadioTrack_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RadioTrack.class, RadioTrack.Builder.class);
   }

   @Override
   public String getTitle() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.title_ = var3;
      return var3;
   }

   @Override
   public ByteString getTitleBytes() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.title_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public ProtocolStringList getArtistNamesList() {
      return this.artistNames_;
   }

   @Override
   public int getArtistNamesCount() {
      return this.artistNames_.size();
   }

   @Override
   public String getArtistNames(int var1) {
      return this.artistNames_.get(var1);
   }

   @Override
   public ByteString getArtistNamesBytes(int var1) {
      return this.artistNames_.getByteString(var1);
   }

   @Override
   public int getDuration() {
      return this.duration_;
   }

   @Override
   public int getProgress() {
      return this.progress_;
   }

   @Override
   public boolean getPaused() {
      return this.paused_;
   }

   @Override
   public String getImageUrl() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.imageUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getImageUrlBytes() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.imageUrl_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         GeneratedMessageV3.writeString(var1, 1, this.title_);
      }

      for (int var2 = 0; var2 < this.artistNames_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 2, this.artistNames_.getRaw(var2));
      }

      if (this.duration_ != 0) {
         var1.writeInt32(3, this.duration_);
      }

      if (this.progress_ != 0) {
         var1.writeInt32(4, this.progress_);
      }

      if (this.paused_) {
         var1.writeBool(5, this.paused_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         GeneratedMessageV3.writeString(var1, 6, this.imageUrl_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.title_);
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.artistNames_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.artistNames_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getArtistNamesList().size();
      if (this.duration_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.duration_);
      }

      if (this.progress_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.progress_);
      }

      if (this.paused_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.paused_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.imageUrl_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RadioTrack)) {
         return super.equals(var1);
      } else {
         RadioTrack var2 = (RadioTrack)var1;
         if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (!this.getArtistNamesList().equals(var2.getArtistNamesList())) {
            return false;
         } else if (this.getDuration() != var2.getDuration()) {
            return false;
         } else if (this.getProgress() != var2.getProgress()) {
            return false;
         } else if (this.getPaused() != var2.getPaused()) {
            return false;
         } else {
            return !this.getImageUrl().equals(var2.getImageUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getTitle().hashCode();
      if (this.getArtistNamesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getArtistNamesList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getDuration();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getProgress();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPaused());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getImageUrl().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RadioTrack parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioTrack parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioTrack parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioTrack parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioTrack parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioTrack parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioTrack parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioTrack parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RadioTrack parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RadioTrack parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RadioTrack parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioTrack parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RadioTrack.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RadioTrack.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RadioTrack.Builder newBuilder(RadioTrack var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RadioTrack.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RadioTrack.Builder() : new RadioTrack.Builder().mergeFrom(this);
   }

   protected RadioTrack.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RadioTrack.Builder(var1);
   }

   public static RadioTrack getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RadioTrack> parser() {
      return PARSER;
   }

   @Override
   public Parser<RadioTrack> getParserForType() {
      return PARSER;
   }

   public RadioTrack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RadioTrack.Builder> implements RadioTrackOrBuilder {
      private int bitField0_;
      private Object title_ = "";
      private LazyStringArrayList artistNames_ = LazyStringArrayList.emptyList();
      private int duration_;
      private int progress_;
      private boolean paused_;
      private Object imageUrl_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioTrack_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioTrack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RadioTrack.class, RadioTrack.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RadioTrack.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.title_ = "";
         this.artistNames_ = LazyStringArrayList.emptyList();
         this.duration_ = 0;
         this.progress_ = 0;
         this.paused_ = false;
         this.imageUrl_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioTrack_descriptor;
      }

      public RadioTrack getDefaultInstanceForType() {
         return RadioTrack.getDefaultInstance();
      }

      public RadioTrack build() {
         RadioTrack var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RadioTrack buildPartial() {
         RadioTrack var1 = new RadioTrack(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RadioTrack var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 2) != 0) {
            this.artistNames_.makeImmutable();
            var1.artistNames_ = this.artistNames_;
         }

         if ((var2 & 4) != 0) {
            var1.duration_ = this.duration_;
         }

         if ((var2 & 8) != 0) {
            var1.progress_ = this.progress_;
         }

         if ((var2 & 16) != 0) {
            var1.paused_ = this.paused_;
         }

         if ((var2 & 32) != 0) {
            var1.imageUrl_ = this.imageUrl_;
         }
      }

      public RadioTrack.Builder clone() {
         return (RadioTrack.Builder)super.clone();
      }

      public RadioTrack.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioTrack.Builder)super.setField(var1, var2);
      }

      public RadioTrack.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RadioTrack.Builder)super.clearField(var1);
      }

      public RadioTrack.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RadioTrack.Builder)super.clearOneof(var1);
      }

      public RadioTrack.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RadioTrack.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RadioTrack.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioTrack.Builder)super.addRepeatedField(var1, var2);
      }

      public RadioTrack.Builder mergeFrom(Message var1) {
         if (var1 instanceof RadioTrack) {
            return this.mergeFrom((RadioTrack)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RadioTrack.Builder mergeFrom(RadioTrack var1) {
         if (var1 == RadioTrack.getDefaultInstance()) {
            return this;
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.artistNames_.isEmpty()) {
            if (this.artistNames_.isEmpty()) {
               this.artistNames_ = var1.artistNames_;
               this.bitField0_ |= 2;
            } else {
               this.ensureArtistNamesIsMutable();
               this.artistNames_.addAll(var1.artistNames_);
            }

            this.onChanged();
         }

         if (var1.getDuration() != 0) {
            this.setDuration(var1.getDuration());
         }

         if (var1.getProgress() != 0) {
            this.setProgress(var1.getProgress());
         }

         if (var1.getPaused()) {
            this.setPaused(var1.getPaused());
         }

         if (!var1.getImageUrl().isEmpty()) {
            this.imageUrl_ = var1.imageUrl_;
            this.bitField0_ |= 32;
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

      public RadioTrack.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.title_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureArtistNamesIsMutable();
                     this.artistNames_.add(var5);
                     break;
                  case 24:
                     this.duration_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.progress_ = var1.readInt32();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.paused_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.imageUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
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

      @Override
      public String getTitle() {
         Object var1 = this.title_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.title_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTitleBytes() {
         Object var1 = this.title_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.title_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RadioTrack.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder clearTitle() {
         this.title_ = RadioTrack.getDefaultInstance().getTitle();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioTrack.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      private void ensureArtistNamesIsMutable() {
         if (!this.artistNames_.isModifiable()) {
            this.artistNames_ = new LazyStringArrayList(this.artistNames_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getArtistNamesList() {
         this.artistNames_.makeImmutable();
         return this.artistNames_;
      }

      @Override
      public int getArtistNamesCount() {
         return this.artistNames_.size();
      }

      @Override
      public String getArtistNames(int var1) {
         return this.artistNames_.get(var1);
      }

      @Override
      public ByteString getArtistNamesBytes(int var1) {
         return this.artistNames_.getByteString(var1);
      }

      public RadioTrack.Builder setArtistNames(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureArtistNamesIsMutable();
         this.artistNames_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder addArtistNames(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureArtistNamesIsMutable();
         this.artistNames_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder addAllArtistNames(Iterable<String> var1) {
         this.ensureArtistNamesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.artistNames_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder clearArtistNames() {
         this.artistNames_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder addArtistNamesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioTrack.checkByteStringIsUtf8(var1);
         this.ensureArtistNamesIsMutable();
         this.artistNames_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public int getDuration() {
         return this.duration_;
      }

      public RadioTrack.Builder setDuration(int var1) {
         this.duration_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder clearDuration() {
         this.bitField0_ &= -5;
         this.duration_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getProgress() {
         return this.progress_;
      }

      public RadioTrack.Builder setProgress(int var1) {
         this.progress_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder clearProgress() {
         this.bitField0_ &= -9;
         this.progress_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPaused() {
         return this.paused_;
      }

      public RadioTrack.Builder setPaused(boolean var1) {
         this.paused_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder clearPaused() {
         this.bitField0_ &= -17;
         this.paused_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public String getImageUrl() {
         Object var1 = this.imageUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.imageUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getImageUrlBytes() {
         Object var1 = this.imageUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.imageUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RadioTrack.Builder setImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.imageUrl_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder clearImageUrl() {
         this.imageUrl_ = RadioTrack.getDefaultInstance().getImageUrl();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public RadioTrack.Builder setImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioTrack.checkByteStringIsUtf8(var1);
         this.imageUrl_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public final RadioTrack.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RadioTrack.Builder)super.setUnknownFields(var1);
      }

      public final RadioTrack.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RadioTrack.Builder)super.mergeUnknownFields(var1);
      }
   }
}
