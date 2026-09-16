package com.lunarclient.gameipc.styngr.v1;

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

public final class StyngrTrackState extends GeneratedMessageV3 implements StyngrTrackStateOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int IMAGE_URL_FIELD_NUMBER = 1;
   private volatile Object imageUrl_ = "";
   public static final int TITLE_FIELD_NUMBER = 2;
   private volatile Object title_ = "";
   public static final int ARTIST_NAMES_FIELD_NUMBER = 3;
   private LazyStringArrayList artistNames_ = LazyStringArrayList.emptyList();
   public static final int LIKED_FIELD_NUMBER = 4;
   private boolean liked_ = false;
   public static final int REMAINING_SKIPS_FIELD_NUMBER = 5;
   private int remainingSkips_ = 0;
   public static final int PLAYLIST_ID_FIELD_NUMBER = 6;
   private volatile Object playlistId_ = "";
   public static final int PLAYLIST_NAME_FIELD_NUMBER = 7;
   private volatile Object playlistName_ = "";
   private byte memoizedIsInitialized = -1;
   private static final StyngrTrackState DEFAULT_INSTANCE = new StyngrTrackState();
   private static final Parser<StyngrTrackState> PARSER = new AbstractParser<StyngrTrackState>() {
      public StyngrTrackState parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StyngrTrackState.Builder var3 = StyngrTrackState.newBuilder();

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

   private StyngrTrackState(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StyngrTrackState() {
      this.imageUrl_ = "";
      this.title_ = "";
      this.artistNames_ = LazyStringArrayList.emptyList();
      this.playlistId_ = "";
      this.playlistName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StyngrTrackState();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StyngrTrackState.class, StyngrTrackState.Builder.class);
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
   public boolean getLiked() {
      return this.liked_;
   }

   @Override
   public int getRemainingSkips() {
      return this.remainingSkips_;
   }

   @Override
   public String getPlaylistId() {
      Object var1 = this.playlistId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.playlistId_ = var3;
      return var3;
   }

   @Override
   public ByteString getPlaylistIdBytes() {
      Object var1 = this.playlistId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.playlistId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getPlaylistName() {
      Object var1 = this.playlistName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.playlistName_ = var3;
      return var3;
   }

   @Override
   public ByteString getPlaylistNameBytes() {
      Object var1 = this.playlistName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.playlistName_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         GeneratedMessageV3.writeString(var1, 1, this.imageUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         GeneratedMessageV3.writeString(var1, 2, this.title_);
      }

      for (int var2 = 0; var2 < this.artistNames_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 3, this.artistNames_.getRaw(var2));
      }

      if (this.liked_) {
         var1.writeBool(4, this.liked_);
      }

      if (this.remainingSkips_ != 0) {
         var1.writeInt32(5, this.remainingSkips_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playlistId_)) {
         GeneratedMessageV3.writeString(var1, 6, this.playlistId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playlistName_)) {
         GeneratedMessageV3.writeString(var1, 7, this.playlistName_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.imageUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.title_);
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.artistNames_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.artistNames_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getArtistNamesList().size();
      if (this.liked_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.liked_);
      }

      if (this.remainingSkips_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.remainingSkips_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playlistId_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.playlistId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playlistName_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.playlistName_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StyngrTrackState)) {
         return super.equals(var1);
      } else {
         StyngrTrackState var2 = (StyngrTrackState)var1;
         if (!this.getImageUrl().equals(var2.getImageUrl())) {
            return false;
         } else if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (!this.getArtistNamesList().equals(var2.getArtistNamesList())) {
            return false;
         } else if (this.getLiked() != var2.getLiked()) {
            return false;
         } else if (this.getRemainingSkips() != var2.getRemainingSkips()) {
            return false;
         } else if (!this.getPlaylistId().equals(var2.getPlaylistId())) {
            return false;
         } else {
            return !this.getPlaylistName().equals(var2.getPlaylistName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getImageUrl().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getTitle().hashCode();
      if (this.getArtistNamesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getArtistNamesList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLiked());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getRemainingSkips();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getPlaylistId().hashCode();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getPlaylistName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StyngrTrackState parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackState parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackState parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackState parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackState parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackState parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackState parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackState parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackState parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StyngrTrackState parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackState parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackState parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StyngrTrackState.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StyngrTrackState.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StyngrTrackState.Builder newBuilder(StyngrTrackState var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StyngrTrackState.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StyngrTrackState.Builder() : new StyngrTrackState.Builder().mergeFrom(this);
   }

   protected StyngrTrackState.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StyngrTrackState.Builder(var1);
   }

   public static StyngrTrackState getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StyngrTrackState> parser() {
      return PARSER;
   }

   @Override
   public Parser<StyngrTrackState> getParserForType() {
      return PARSER;
   }

   public StyngrTrackState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StyngrTrackState.Builder> implements StyngrTrackStateOrBuilder {
      private int bitField0_;
      private Object imageUrl_ = "";
      private Object title_ = "";
      private LazyStringArrayList artistNames_ = LazyStringArrayList.emptyList();
      private boolean liked_;
      private int remainingSkips_;
      private Object playlistId_ = "";
      private Object playlistName_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StyngrTrackState.class, StyngrTrackState.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StyngrTrackState.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.imageUrl_ = "";
         this.title_ = "";
         this.artistNames_ = LazyStringArrayList.emptyList();
         this.liked_ = false;
         this.remainingSkips_ = 0;
         this.playlistId_ = "";
         this.playlistName_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackState_descriptor;
      }

      public StyngrTrackState getDefaultInstanceForType() {
         return StyngrTrackState.getDefaultInstance();
      }

      public StyngrTrackState build() {
         StyngrTrackState var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StyngrTrackState buildPartial() {
         StyngrTrackState var1 = new StyngrTrackState(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StyngrTrackState var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.imageUrl_ = this.imageUrl_;
         }

         if ((var2 & 2) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 4) != 0) {
            this.artistNames_.makeImmutable();
            var1.artistNames_ = this.artistNames_;
         }

         if ((var2 & 8) != 0) {
            var1.liked_ = this.liked_;
         }

         if ((var2 & 16) != 0) {
            var1.remainingSkips_ = this.remainingSkips_;
         }

         if ((var2 & 32) != 0) {
            var1.playlistId_ = this.playlistId_;
         }

         if ((var2 & 64) != 0) {
            var1.playlistName_ = this.playlistName_;
         }
      }

      public StyngrTrackState.Builder clone() {
         return (StyngrTrackState.Builder)super.clone();
      }

      public StyngrTrackState.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackState.Builder)super.setField(var1, var2);
      }

      public StyngrTrackState.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StyngrTrackState.Builder)super.clearField(var1);
      }

      public StyngrTrackState.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StyngrTrackState.Builder)super.clearOneof(var1);
      }

      public StyngrTrackState.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StyngrTrackState.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StyngrTrackState.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackState.Builder)super.addRepeatedField(var1, var2);
      }

      public StyngrTrackState.Builder mergeFrom(Message var1) {
         if (var1 instanceof StyngrTrackState) {
            return this.mergeFrom((StyngrTrackState)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StyngrTrackState.Builder mergeFrom(StyngrTrackState var1) {
         if (var1 == StyngrTrackState.getDefaultInstance()) {
            return this;
         }

         if (!var1.getImageUrl().isEmpty()) {
            this.imageUrl_ = var1.imageUrl_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.artistNames_.isEmpty()) {
            if (this.artistNames_.isEmpty()) {
               this.artistNames_ = var1.artistNames_;
               this.bitField0_ |= 4;
            } else {
               this.ensureArtistNamesIsMutable();
               this.artistNames_.addAll(var1.artistNames_);
            }

            this.onChanged();
         }

         if (var1.getLiked()) {
            this.setLiked(var1.getLiked());
         }

         if (var1.getRemainingSkips() != 0) {
            this.setRemainingSkips(var1.getRemainingSkips());
         }

         if (!var1.getPlaylistId().isEmpty()) {
            this.playlistId_ = var1.playlistId_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (!var1.getPlaylistName().isEmpty()) {
            this.playlistName_ = var1.playlistName_;
            this.bitField0_ |= 64;
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

      public StyngrTrackState.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.imageUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.title_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureArtistNamesIsMutable();
                     this.artistNames_.add(var5);
                     break;
                  case 32:
                     this.liked_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.remainingSkips_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.playlistId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.playlistName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
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

      public StyngrTrackState.Builder setImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.imageUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearImageUrl() {
         this.imageUrl_ = StyngrTrackState.getDefaultInstance().getImageUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder setImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StyngrTrackState.checkByteStringIsUtf8(var1);
         this.imageUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
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

      public StyngrTrackState.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearTitle() {
         this.title_ = StyngrTrackState.getDefaultInstance().getTitle();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StyngrTrackState.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      private void ensureArtistNamesIsMutable() {
         if (!this.artistNames_.isModifiable()) {
            this.artistNames_ = new LazyStringArrayList(this.artistNames_);
         }

         this.bitField0_ |= 4;
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

      public StyngrTrackState.Builder setArtistNames(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureArtistNamesIsMutable();
         this.artistNames_.set(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder addArtistNames(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureArtistNamesIsMutable();
         this.artistNames_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder addAllArtistNames(Iterable<String> var1) {
         this.ensureArtistNamesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.artistNames_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearArtistNames() {
         this.artistNames_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder addArtistNamesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StyngrTrackState.checkByteStringIsUtf8(var1);
         this.ensureArtistNamesIsMutable();
         this.artistNames_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getLiked() {
         return this.liked_;
      }

      public StyngrTrackState.Builder setLiked(boolean var1) {
         this.liked_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearLiked() {
         this.bitField0_ &= -9;
         this.liked_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getRemainingSkips() {
         return this.remainingSkips_;
      }

      public StyngrTrackState.Builder setRemainingSkips(int var1) {
         this.remainingSkips_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearRemainingSkips() {
         this.bitField0_ &= -17;
         this.remainingSkips_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getPlaylistId() {
         Object var1 = this.playlistId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.playlistId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlaylistIdBytes() {
         Object var1 = this.playlistId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.playlistId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StyngrTrackState.Builder setPlaylistId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playlistId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearPlaylistId() {
         this.playlistId_ = StyngrTrackState.getDefaultInstance().getPlaylistId();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder setPlaylistIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StyngrTrackState.checkByteStringIsUtf8(var1);
         this.playlistId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public String getPlaylistName() {
         Object var1 = this.playlistName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.playlistName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlaylistNameBytes() {
         Object var1 = this.playlistName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.playlistName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StyngrTrackState.Builder setPlaylistName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playlistName_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder clearPlaylistName() {
         this.playlistName_ = StyngrTrackState.getDefaultInstance().getPlaylistName();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder setPlaylistNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StyngrTrackState.checkByteStringIsUtf8(var1);
         this.playlistName_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public final StyngrTrackState.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackState.Builder)super.setUnknownFields(var1);
      }

      public final StyngrTrackState.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackState.Builder)super.mergeUnknownFields(var1);
      }
   }
}
