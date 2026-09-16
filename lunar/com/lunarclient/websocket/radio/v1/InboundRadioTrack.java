package com.lunarclient.websocket.radio.v1;

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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Map.Entry;

public final class InboundRadioTrack extends GeneratedMessageV3 implements InboundRadioTrackOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TITLE_FIELD_NUMBER = 1;
   private volatile Object title_ = "";
   public static final int TRACK_ID_FIELD_NUMBER = 2;
   private int trackId_ = 0;
   public static final int ASSET_ID_FIELD_NUMBER = 3;
   private int assetId_ = 0;
   public static final int LIKED_FIELD_NUMBER = 4;
   private boolean liked_ = false;
   public static final int ARTIST_NAMES_FIELD_NUMBER = 5;
   private LazyStringArrayList artistNames_ = LazyStringArrayList.emptyList();
   public static final int DURATION_FIELD_NUMBER = 7;
   private int duration_ = 0;
   public static final int PROGRESS_FIELD_NUMBER = 8;
   private int progress_ = 0;
   public static final int POSITION_FIELD_NUMBER = 9;
   private int position_ = 0;
   public static final int PAUSED_FIELD_NUMBER = 10;
   private boolean paused_ = false;
   public static final int IMAGE_URL_FIELD_NUMBER = 11;
   private volatile Object imageUrl_ = "";
   public static final int CUSTOM_METADATA_FIELD_NUMBER = 12;
   private MapField<String, String> customMetadata_;
   public static final int ALBUM_NAME_FIELD_NUMBER = 13;
   private volatile Object albumName_ = "";
   public static final int ROYALTY_FREE_USAGE_REPORT_ID_FIELD_NUMBER = 14;
   private volatile Object royaltyFreeUsageReportId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final InboundRadioTrack DEFAULT_INSTANCE = new InboundRadioTrack();
   private static final Parser<InboundRadioTrack> PARSER = new AbstractParser<InboundRadioTrack>() {
      public InboundRadioTrack parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundRadioTrack.Builder var3 = InboundRadioTrack.newBuilder();

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

   private InboundRadioTrack(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundRadioTrack() {
      this.title_ = "";
      this.artistNames_ = LazyStringArrayList.emptyList();
      this.imageUrl_ = "";
      this.albumName_ = "";
      this.royaltyFreeUsageReportId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundRadioTrack();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 12:
            return this.internalGetCustomMetadata();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundRadioTrack.class, InboundRadioTrack.Builder.class);
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

   @Override
   public int getTrackId() {
      return this.trackId_;
   }

   @Override
   public int getAssetId() {
      return this.assetId_;
   }

   @Override
   public boolean getLiked() {
      return this.liked_;
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
   public int getPosition() {
      return this.position_;
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

   private MapField<String, String> internalGetCustomMetadata() {
      return this.customMetadata_ == null ? MapField.emptyMapField(InboundRadioTrack.CustomMetadataDefaultEntryHolder.defaultEntry) : this.customMetadata_;
   }

   @Override
   public int getCustomMetadataCount() {
      return this.internalGetCustomMetadata().getMap().size();
   }

   @Override
   public boolean containsCustomMetadata(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         return this.internalGetCustomMetadata().getMap().containsKey(var1);
      }
   }

   @Deprecated
   @Override
   public Map<String, String> getCustomMetadata() {
      return this.getCustomMetadataMap();
   }

   @Override
   public Map<String, String> getCustomMetadataMap() {
      return this.internalGetCustomMetadata().getMap();
   }

   @Override
   public String getCustomMetadataOrDefault(String var1, String var2) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      }

      Map var3 = this.internalGetCustomMetadata().getMap();
      return var3.containsKey(var1) ? (String)var3.get(var1) : var2;
   }

   @Override
   public String getCustomMetadataOrThrow(String var1) {
      if (var1 == null) {
         throw new NullPointerException("map key");
      } else {
         Map var2 = this.internalGetCustomMetadata().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (String)var2.get(var1);
         }
      }
   }

   @Override
   public String getAlbumName() {
      Object var1 = this.albumName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.albumName_ = var3;
      return var3;
   }

   @Override
   public ByteString getAlbumNameBytes() {
      Object var1 = this.albumName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.albumName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getRoyaltyFreeUsageReportId() {
      Object var1 = this.royaltyFreeUsageReportId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.royaltyFreeUsageReportId_ = var3;
      return var3;
   }

   @Override
   public ByteString getRoyaltyFreeUsageReportIdBytes() {
      Object var1 = this.royaltyFreeUsageReportId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.royaltyFreeUsageReportId_ = var2;
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

      if (this.trackId_ != 0) {
         var1.writeInt32(2, this.trackId_);
      }

      if (this.assetId_ != 0) {
         var1.writeInt32(3, this.assetId_);
      }

      if (this.liked_) {
         var1.writeBool(4, this.liked_);
      }

      for (int var2 = 0; var2 < this.artistNames_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 5, this.artistNames_.getRaw(var2));
      }

      if (this.duration_ != 0) {
         var1.writeInt32(7, this.duration_);
      }

      if (this.progress_ != 0) {
         var1.writeInt32(8, this.progress_);
      }

      if (this.position_ != 0) {
         var1.writeInt32(9, this.position_);
      }

      if (this.paused_) {
         var1.writeBool(10, this.paused_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         GeneratedMessageV3.writeString(var1, 11, this.imageUrl_);
      }

      GeneratedMessageV3.serializeStringMapTo(var1, this.internalGetCustomMetadata(), InboundRadioTrack.CustomMetadataDefaultEntryHolder.defaultEntry, 12);
      if (!GeneratedMessageV3.isStringEmpty(this.albumName_)) {
         GeneratedMessageV3.writeString(var1, 13, this.albumName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.royaltyFreeUsageReportId_)) {
         GeneratedMessageV3.writeString(var1, 14, this.royaltyFreeUsageReportId_);
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

      if (this.trackId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.trackId_);
      }

      if (this.assetId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.assetId_);
      }

      if (this.liked_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.liked_);
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.artistNames_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.artistNames_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getArtistNamesList().size();
      if (this.duration_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.duration_);
      }

      if (this.progress_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(8, this.progress_);
      }

      if (this.position_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(9, this.position_);
      }

      if (this.paused_) {
         var1 += CodedOutputStream.computeBoolSize(10, this.paused_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(11, this.imageUrl_);
      }

      for (Entry var10 : this.internalGetCustomMetadata().getMap().entrySet()) {
         MapEntry var4 = InboundRadioTrack.CustomMetadataDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((String)var10.getKey())
            .setValue((String)var10.getValue())
            .build();
         var1 += CodedOutputStream.computeMessageSize(12, var4);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.albumName_)) {
         var1 += GeneratedMessageV3.computeStringSize(13, this.albumName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.royaltyFreeUsageReportId_)) {
         var1 += GeneratedMessageV3.computeStringSize(14, this.royaltyFreeUsageReportId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InboundRadioTrack)) {
         return super.equals(var1);
      } else {
         InboundRadioTrack var2 = (InboundRadioTrack)var1;
         if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (this.getTrackId() != var2.getTrackId()) {
            return false;
         } else if (this.getAssetId() != var2.getAssetId()) {
            return false;
         } else if (this.getLiked() != var2.getLiked()) {
            return false;
         } else if (!this.getArtistNamesList().equals(var2.getArtistNamesList())) {
            return false;
         } else if (this.getDuration() != var2.getDuration()) {
            return false;
         } else if (this.getProgress() != var2.getProgress()) {
            return false;
         } else if (this.getPosition() != var2.getPosition()) {
            return false;
         } else if (this.getPaused() != var2.getPaused()) {
            return false;
         } else if (!this.getImageUrl().equals(var2.getImageUrl())) {
            return false;
         } else if (!this.internalGetCustomMetadata().equals(var2.internalGetCustomMetadata())) {
            return false;
         } else if (!this.getAlbumName().equals(var2.getAlbumName())) {
            return false;
         } else {
            return !this.getRoyaltyFreeUsageReportId().equals(var2.getRoyaltyFreeUsageReportId())
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getTitle().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getTrackId();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getAssetId();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLiked());
      if (this.getArtistNamesCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getArtistNamesList().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getDuration();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getProgress();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getPosition();
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPaused());
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + this.getImageUrl().hashCode();
      if (!this.internalGetCustomMetadata().getMap().isEmpty()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.internalGetCustomMetadata().hashCode();
      }

      var1 = 37 * var1 + 13;
      var1 = 53 * var1 + this.getAlbumName().hashCode();
      var1 = 37 * var1 + 14;
      var1 = 53 * var1 + this.getRoyaltyFreeUsageReportId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundRadioTrack parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioTrack parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioTrack parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioTrack parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioTrack parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioTrack parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioTrack parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRadioTrack parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundRadioTrack parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundRadioTrack parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundRadioTrack parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRadioTrack parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundRadioTrack.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundRadioTrack.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundRadioTrack.Builder newBuilder(InboundRadioTrack var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundRadioTrack.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundRadioTrack.Builder() : new InboundRadioTrack.Builder().mergeFrom(this);
   }

   protected InboundRadioTrack.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundRadioTrack.Builder(var1);
   }

   public static InboundRadioTrack getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundRadioTrack> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundRadioTrack> getParserForType() {
      return PARSER;
   }

   public InboundRadioTrack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundRadioTrack.Builder> implements InboundRadioTrackOrBuilder {
      private int bitField0_;
      private Object title_ = "";
      private int trackId_;
      private int assetId_;
      private boolean liked_;
      private LazyStringArrayList artistNames_ = LazyStringArrayList.emptyList();
      private int duration_;
      private int progress_;
      private int position_;
      private boolean paused_;
      private Object imageUrl_ = "";
      private MapField<String, String> customMetadata_;
      private Object albumName_ = "";
      private Object royaltyFreeUsageReportId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 12:
               return this.internalGetCustomMetadata();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 12:
               return this.internalGetMutableCustomMetadata();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundRadioTrack.class, InboundRadioTrack.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundRadioTrack.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.title_ = "";
         this.trackId_ = 0;
         this.assetId_ = 0;
         this.liked_ = false;
         this.artistNames_ = LazyStringArrayList.emptyList();
         this.duration_ = 0;
         this.progress_ = 0;
         this.position_ = 0;
         this.paused_ = false;
         this.imageUrl_ = "";
         this.internalGetMutableCustomMetadata().clear();
         this.albumName_ = "";
         this.royaltyFreeUsageReportId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_descriptor;
      }

      public InboundRadioTrack getDefaultInstanceForType() {
         return InboundRadioTrack.getDefaultInstance();
      }

      public InboundRadioTrack build() {
         InboundRadioTrack var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundRadioTrack buildPartial() {
         InboundRadioTrack var1 = new InboundRadioTrack(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundRadioTrack var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 2) != 0) {
            var1.trackId_ = this.trackId_;
         }

         if ((var2 & 4) != 0) {
            var1.assetId_ = this.assetId_;
         }

         if ((var2 & 8) != 0) {
            var1.liked_ = this.liked_;
         }

         if ((var2 & 16) != 0) {
            this.artistNames_.makeImmutable();
            var1.artistNames_ = this.artistNames_;
         }

         if ((var2 & 32) != 0) {
            var1.duration_ = this.duration_;
         }

         if ((var2 & 64) != 0) {
            var1.progress_ = this.progress_;
         }

         if ((var2 & 128) != 0) {
            var1.position_ = this.position_;
         }

         if ((var2 & 256) != 0) {
            var1.paused_ = this.paused_;
         }

         if ((var2 & 512) != 0) {
            var1.imageUrl_ = this.imageUrl_;
         }

         if ((var2 & 1024) != 0) {
            var1.customMetadata_ = this.internalGetCustomMetadata();
            var1.customMetadata_.makeImmutable();
         }

         if ((var2 & 2048) != 0) {
            var1.albumName_ = this.albumName_;
         }

         if ((var2 & 4096) != 0) {
            var1.royaltyFreeUsageReportId_ = this.royaltyFreeUsageReportId_;
         }
      }

      public InboundRadioTrack.Builder clone() {
         return (InboundRadioTrack.Builder)super.clone();
      }

      public InboundRadioTrack.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRadioTrack.Builder)super.setField(var1, var2);
      }

      public InboundRadioTrack.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundRadioTrack.Builder)super.clearField(var1);
      }

      public InboundRadioTrack.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundRadioTrack.Builder)super.clearOneof(var1);
      }

      public InboundRadioTrack.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundRadioTrack.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundRadioTrack.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRadioTrack.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundRadioTrack.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundRadioTrack) {
            return this.mergeFrom((InboundRadioTrack)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundRadioTrack.Builder mergeFrom(InboundRadioTrack var1) {
         if (var1 == InboundRadioTrack.getDefaultInstance()) {
            return this;
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getTrackId() != 0) {
            this.setTrackId(var1.getTrackId());
         }

         if (var1.getAssetId() != 0) {
            this.setAssetId(var1.getAssetId());
         }

         if (var1.getLiked()) {
            this.setLiked(var1.getLiked());
         }

         if (!var1.artistNames_.isEmpty()) {
            if (this.artistNames_.isEmpty()) {
               this.artistNames_ = var1.artistNames_;
               this.bitField0_ |= 16;
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

         if (var1.getPosition() != 0) {
            this.setPosition(var1.getPosition());
         }

         if (var1.getPaused()) {
            this.setPaused(var1.getPaused());
         }

         if (!var1.getImageUrl().isEmpty()) {
            this.imageUrl_ = var1.imageUrl_;
            this.bitField0_ |= 512;
            this.onChanged();
         }

         this.internalGetMutableCustomMetadata().mergeFrom(var1.internalGetCustomMetadata());
         this.bitField0_ |= 1024;
         if (!var1.getAlbumName().isEmpty()) {
            this.albumName_ = var1.albumName_;
            this.bitField0_ |= 2048;
            this.onChanged();
         }

         if (!var1.getRoyaltyFreeUsageReportId().isEmpty()) {
            this.royaltyFreeUsageReportId_ = var1.royaltyFreeUsageReportId_;
            this.bitField0_ |= 4096;
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

      public InboundRadioTrack.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.trackId_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.assetId_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.liked_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     String var11 = var1.readStringRequireUtf8();
                     this.ensureArtistNamesIsMutable();
                     this.artistNames_.add(var11);
                     break;
                  case 56:
                     this.duration_ = var1.readInt32();
                     this.bitField0_ |= 32;
                     break;
                  case 64:
                     this.progress_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 72:
                     this.position_ = var1.readInt32();
                     this.bitField0_ |= 128;
                     break;
                  case 80:
                     this.paused_ = var1.readBool();
                     this.bitField0_ |= 256;
                     break;
                  case 90:
                     this.imageUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 512;
                     break;
                  case 98:
                     MapEntry var5 = var1.readMessage(InboundRadioTrack.CustomMetadataDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableCustomMetadata().getMutableMap().put((String)var5.getKey(), (String)var5.getValue());
                     this.bitField0_ |= 1024;
                     break;
                  case 106:
                     this.albumName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2048;
                     break;
                  case 114:
                     this.royaltyFreeUsageReportId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4096;
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

      public InboundRadioTrack.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearTitle() {
         this.title_ = InboundRadioTrack.getDefaultInstance().getTitle();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioTrack.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getTrackId() {
         return this.trackId_;
      }

      public InboundRadioTrack.Builder setTrackId(int var1) {
         this.trackId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearTrackId() {
         this.bitField0_ &= -3;
         this.trackId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getAssetId() {
         return this.assetId_;
      }

      public InboundRadioTrack.Builder setAssetId(int var1) {
         this.assetId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearAssetId() {
         this.bitField0_ &= -5;
         this.assetId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getLiked() {
         return this.liked_;
      }

      public InboundRadioTrack.Builder setLiked(boolean var1) {
         this.liked_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearLiked() {
         this.bitField0_ &= -9;
         this.liked_ = false;
         this.onChanged();
         return this;
      }

      private void ensureArtistNamesIsMutable() {
         if (!this.artistNames_.isModifiable()) {
            this.artistNames_ = new LazyStringArrayList(this.artistNames_);
         }

         this.bitField0_ |= 16;
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

      public InboundRadioTrack.Builder setArtistNames(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureArtistNamesIsMutable();
         this.artistNames_.set(var1, var2);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder addArtistNames(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureArtistNamesIsMutable();
         this.artistNames_.add(var1);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder addAllArtistNames(Iterable<String> var1) {
         this.ensureArtistNamesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.artistNames_);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearArtistNames() {
         this.artistNames_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder addArtistNamesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioTrack.checkByteStringIsUtf8(var1);
         this.ensureArtistNamesIsMutable();
         this.artistNames_.add(var1);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public int getDuration() {
         return this.duration_;
      }

      public InboundRadioTrack.Builder setDuration(int var1) {
         this.duration_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearDuration() {
         this.bitField0_ &= -33;
         this.duration_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getProgress() {
         return this.progress_;
      }

      public InboundRadioTrack.Builder setProgress(int var1) {
         this.progress_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearProgress() {
         this.bitField0_ &= -65;
         this.progress_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getPosition() {
         return this.position_;
      }

      public InboundRadioTrack.Builder setPosition(int var1) {
         this.position_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearPosition() {
         this.bitField0_ &= -129;
         this.position_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPaused() {
         return this.paused_;
      }

      public InboundRadioTrack.Builder setPaused(boolean var1) {
         this.paused_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearPaused() {
         this.bitField0_ &= -257;
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

      public InboundRadioTrack.Builder setImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.imageUrl_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearImageUrl() {
         this.imageUrl_ = InboundRadioTrack.getDefaultInstance().getImageUrl();
         this.bitField0_ &= -513;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder setImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioTrack.checkByteStringIsUtf8(var1);
         this.imageUrl_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      private MapField<String, String> internalGetCustomMetadata() {
         return this.customMetadata_ == null ? MapField.emptyMapField(InboundRadioTrack.CustomMetadataDefaultEntryHolder.defaultEntry) : this.customMetadata_;
      }

      private MapField<String, String> internalGetMutableCustomMetadata() {
         if (this.customMetadata_ == null) {
            this.customMetadata_ = MapField.newMapField(InboundRadioTrack.CustomMetadataDefaultEntryHolder.defaultEntry);
         }

         if (!this.customMetadata_.isMutable()) {
            this.customMetadata_ = this.customMetadata_.copy();
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this.customMetadata_;
      }

      @Override
      public int getCustomMetadataCount() {
         return this.internalGetCustomMetadata().getMap().size();
      }

      @Override
      public boolean containsCustomMetadata(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            return this.internalGetCustomMetadata().getMap().containsKey(var1);
         }
      }

      @Deprecated
      @Override
      public Map<String, String> getCustomMetadata() {
         return this.getCustomMetadataMap();
      }

      @Override
      public Map<String, String> getCustomMetadataMap() {
         return this.internalGetCustomMetadata().getMap();
      }

      @Override
      public String getCustomMetadataOrDefault(String var1, String var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         Map var3 = this.internalGetCustomMetadata().getMap();
         return var3.containsKey(var1) ? (String)var3.get(var1) : var2;
      }

      @Override
      public String getCustomMetadataOrThrow(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         } else {
            Map var2 = this.internalGetCustomMetadata().getMap();
            if (!var2.containsKey(var1)) {
               throw new IllegalArgumentException();
            } else {
               return (String)var2.get(var1);
            }
         }
      }

      public InboundRadioTrack.Builder clearCustomMetadata() {
         this.bitField0_ &= -1025;
         this.internalGetMutableCustomMetadata().getMutableMap().clear();
         return this;
      }

      public InboundRadioTrack.Builder removeCustomMetadata(String var1) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         this.internalGetMutableCustomMetadata().getMutableMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<String, String> getMutableCustomMetadata() {
         this.bitField0_ |= 1024;
         return this.internalGetMutableCustomMetadata().getMutableMap();
      }

      public InboundRadioTrack.Builder putCustomMetadata(String var1, String var2) {
         if (var1 == null) {
            throw new NullPointerException("map key");
         }

         if (var2 == null) {
            throw new NullPointerException("map value");
         }

         this.internalGetMutableCustomMetadata().getMutableMap().put(var1, var2);
         this.bitField0_ |= 1024;
         return this;
      }

      public InboundRadioTrack.Builder putAllCustomMetadata(Map<String, String> var1) {
         this.internalGetMutableCustomMetadata().getMutableMap().putAll(var1);
         this.bitField0_ |= 1024;
         return this;
      }

      @Override
      public String getAlbumName() {
         Object var1 = this.albumName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.albumName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAlbumNameBytes() {
         Object var1 = this.albumName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.albumName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InboundRadioTrack.Builder setAlbumName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.albumName_ = var1;
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearAlbumName() {
         this.albumName_ = InboundRadioTrack.getDefaultInstance().getAlbumName();
         this.bitField0_ &= -2049;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder setAlbumNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioTrack.checkByteStringIsUtf8(var1);
         this.albumName_ = var1;
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      @Override
      public String getRoyaltyFreeUsageReportId() {
         Object var1 = this.royaltyFreeUsageReportId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.royaltyFreeUsageReportId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRoyaltyFreeUsageReportIdBytes() {
         Object var1 = this.royaltyFreeUsageReportId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.royaltyFreeUsageReportId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InboundRadioTrack.Builder setRoyaltyFreeUsageReportId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.royaltyFreeUsageReportId_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder clearRoyaltyFreeUsageReportId() {
         this.royaltyFreeUsageReportId_ = InboundRadioTrack.getDefaultInstance().getRoyaltyFreeUsageReportId();
         this.bitField0_ &= -4097;
         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder setRoyaltyFreeUsageReportIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioTrack.checkByteStringIsUtf8(var1);
         this.royaltyFreeUsageReportId_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public final InboundRadioTrack.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundRadioTrack.Builder)super.setUnknownFields(var1);
      }

      public final InboundRadioTrack.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundRadioTrack.Builder)super.mergeUnknownFields(var1);
      }
   }

   private static final class CustomMetadataDefaultEntryHolder {
      static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(
         CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioTrack_CustomMetadataEntry_descriptor,
         WireFormat.FieldType.STRING,
         "",
         WireFormat.FieldType.STRING,
         ""
      );
   }
}
