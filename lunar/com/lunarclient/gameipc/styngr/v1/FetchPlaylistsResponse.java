package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
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

public final class FetchPlaylistsResponse extends GeneratedMessageV3 implements FetchPlaylistsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYLISTS_FIELD_NUMBER = 1;
   private List<FetchPlaylistsResponse.Playlist> playlists_;
   public static final int PREMIUM_FIELD_NUMBER = 2;
   private boolean premium_ = false;
   private byte memoizedIsInitialized = -1;
   private static final FetchPlaylistsResponse DEFAULT_INSTANCE = new FetchPlaylistsResponse();
   private static final Parser<FetchPlaylistsResponse> PARSER = new AbstractParser<FetchPlaylistsResponse>() {
      public FetchPlaylistsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FetchPlaylistsResponse.Builder var3 = FetchPlaylistsResponse.newBuilder();

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

   private FetchPlaylistsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FetchPlaylistsResponse() {
      this.playlists_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FetchPlaylistsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FetchPlaylistsResponse.class, FetchPlaylistsResponse.Builder.class);
   }

   @Override
   public List<FetchPlaylistsResponse.Playlist> getPlaylistsList() {
      return this.playlists_;
   }

   @Override
   public List<? extends FetchPlaylistsResponse.PlaylistOrBuilder> getPlaylistsOrBuilderList() {
      return this.playlists_;
   }

   @Override
   public int getPlaylistsCount() {
      return this.playlists_.size();
   }

   @Override
   public FetchPlaylistsResponse.Playlist getPlaylists(int var1) {
      return this.playlists_.get(var1);
   }

   @Override
   public FetchPlaylistsResponse.PlaylistOrBuilder getPlaylistsOrBuilder(int var1) {
      return this.playlists_.get(var1);
   }

   @Override
   public boolean getPremium() {
      return this.premium_;
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
      for (int var2 = 0; var2 < this.playlists_.size(); var2++) {
         var1.writeMessage(1, this.playlists_.get(var2));
      }

      if (this.premium_) {
         var1.writeBool(2, this.premium_);
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

      for (int var2 = 0; var2 < this.playlists_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.playlists_.get(var2));
      }

      if (this.premium_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.premium_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FetchPlaylistsResponse)) {
         return super.equals(var1);
      } else {
         FetchPlaylistsResponse var2 = (FetchPlaylistsResponse)var1;
         if (!this.getPlaylistsList().equals(var2.getPlaylistsList())) {
            return false;
         } else {
            return this.getPremium() != var2.getPremium() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getPlaylistsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlaylistsList().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPremium());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FetchPlaylistsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FetchPlaylistsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FetchPlaylistsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FetchPlaylistsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FetchPlaylistsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FetchPlaylistsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FetchPlaylistsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FetchPlaylistsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FetchPlaylistsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FetchPlaylistsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FetchPlaylistsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FetchPlaylistsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FetchPlaylistsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FetchPlaylistsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FetchPlaylistsResponse.Builder newBuilder(FetchPlaylistsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FetchPlaylistsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FetchPlaylistsResponse.Builder() : new FetchPlaylistsResponse.Builder().mergeFrom(this);
   }

   protected FetchPlaylistsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FetchPlaylistsResponse.Builder(var1);
   }

   public static FetchPlaylistsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FetchPlaylistsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<FetchPlaylistsResponse> getParserForType() {
      return PARSER;
   }

   public FetchPlaylistsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FetchPlaylistsResponse.Builder> implements FetchPlaylistsResponseOrBuilder {
      private int bitField0_;
      private List<FetchPlaylistsResponse.Playlist> playlists_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<FetchPlaylistsResponse.Playlist, FetchPlaylistsResponse.Playlist.Builder, FetchPlaylistsResponse.PlaylistOrBuilder> playlistsBuilder_;
      private boolean premium_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FetchPlaylistsResponse.class, FetchPlaylistsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public FetchPlaylistsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.playlistsBuilder_ == null) {
            this.playlists_ = Collections.emptyList();
         } else {
            this.playlists_ = null;
            this.playlistsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.premium_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_descriptor;
      }

      public FetchPlaylistsResponse getDefaultInstanceForType() {
         return FetchPlaylistsResponse.getDefaultInstance();
      }

      public FetchPlaylistsResponse build() {
         FetchPlaylistsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FetchPlaylistsResponse buildPartial() {
         FetchPlaylistsResponse var1 = new FetchPlaylistsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(FetchPlaylistsResponse var1) {
         if (this.playlistsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.playlists_ = Collections.unmodifiableList(this.playlists_);
               this.bitField0_ &= -2;
            }

            var1.playlists_ = this.playlists_;
         } else {
            var1.playlists_ = this.playlistsBuilder_.build();
         }
      }

      private void buildPartial0(FetchPlaylistsResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.premium_ = this.premium_;
         }
      }

      public FetchPlaylistsResponse.Builder clone() {
         return (FetchPlaylistsResponse.Builder)super.clone();
      }

      public FetchPlaylistsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FetchPlaylistsResponse.Builder)super.setField(var1, var2);
      }

      public FetchPlaylistsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FetchPlaylistsResponse.Builder)super.clearField(var1);
      }

      public FetchPlaylistsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FetchPlaylistsResponse.Builder)super.clearOneof(var1);
      }

      public FetchPlaylistsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FetchPlaylistsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FetchPlaylistsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FetchPlaylistsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public FetchPlaylistsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof FetchPlaylistsResponse) {
            return this.mergeFrom((FetchPlaylistsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FetchPlaylistsResponse.Builder mergeFrom(FetchPlaylistsResponse var1) {
         if (var1 == FetchPlaylistsResponse.getDefaultInstance()) {
            return this;
         }

         if (this.playlistsBuilder_ == null) {
            if (!var1.playlists_.isEmpty()) {
               if (this.playlists_.isEmpty()) {
                  this.playlists_ = var1.playlists_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensurePlaylistsIsMutable();
                  this.playlists_.addAll(var1.playlists_);
               }

               this.onChanged();
            }
         } else if (!var1.playlists_.isEmpty()) {
            if (this.playlistsBuilder_.isEmpty()) {
               this.playlistsBuilder_.dispose();
               this.playlistsBuilder_ = null;
               this.playlists_ = var1.playlists_;
               this.bitField0_ &= -2;
               this.playlistsBuilder_ = FetchPlaylistsResponse.alwaysUseFieldBuilders ? this.getPlaylistsFieldBuilder() : null;
            } else {
               this.playlistsBuilder_.addAllMessages(var1.playlists_);
            }
         }

         if (var1.getPremium()) {
            this.setPremium(var1.getPremium());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FetchPlaylistsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     FetchPlaylistsResponse.Playlist var5 = var1.readMessage(FetchPlaylistsResponse.Playlist.parser(), var2);
                     if (this.playlistsBuilder_ == null) {
                        this.ensurePlaylistsIsMutable();
                        this.playlists_.add(var5);
                     } else {
                        this.playlistsBuilder_.addMessage(var5);
                     }
                     break;
                  case 16:
                     this.premium_ = var1.readBool();
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

      private void ensurePlaylistsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.playlists_ = new ArrayList<>(this.playlists_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<FetchPlaylistsResponse.Playlist> getPlaylistsList() {
         return this.playlistsBuilder_ == null ? Collections.unmodifiableList(this.playlists_) : this.playlistsBuilder_.getMessageList();
      }

      @Override
      public int getPlaylistsCount() {
         return this.playlistsBuilder_ == null ? this.playlists_.size() : this.playlistsBuilder_.getCount();
      }

      @Override
      public FetchPlaylistsResponse.Playlist getPlaylists(int var1) {
         return this.playlistsBuilder_ == null ? this.playlists_.get(var1) : this.playlistsBuilder_.getMessage(var1);
      }

      public FetchPlaylistsResponse.Builder setPlaylists(int var1, FetchPlaylistsResponse.Playlist var2) {
         if (this.playlistsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlaylistsIsMutable();
            this.playlists_.set(var1, var2);
            this.onChanged();
         } else {
            this.playlistsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder setPlaylists(int var1, FetchPlaylistsResponse.Playlist.Builder var2) {
         if (this.playlistsBuilder_ == null) {
            this.ensurePlaylistsIsMutable();
            this.playlists_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.playlistsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder addPlaylists(FetchPlaylistsResponse.Playlist var1) {
         if (this.playlistsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePlaylistsIsMutable();
            this.playlists_.add(var1);
            this.onChanged();
         } else {
            this.playlistsBuilder_.addMessage(var1);
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder addPlaylists(int var1, FetchPlaylistsResponse.Playlist var2) {
         if (this.playlistsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlaylistsIsMutable();
            this.playlists_.add(var1, var2);
            this.onChanged();
         } else {
            this.playlistsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder addPlaylists(FetchPlaylistsResponse.Playlist.Builder var1) {
         if (this.playlistsBuilder_ == null) {
            this.ensurePlaylistsIsMutable();
            this.playlists_.add(var1.build());
            this.onChanged();
         } else {
            this.playlistsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder addPlaylists(int var1, FetchPlaylistsResponse.Playlist.Builder var2) {
         if (this.playlistsBuilder_ == null) {
            this.ensurePlaylistsIsMutable();
            this.playlists_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.playlistsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder addAllPlaylists(Iterable<? extends FetchPlaylistsResponse.Playlist> var1) {
         if (this.playlistsBuilder_ == null) {
            this.ensurePlaylistsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.playlists_);
            this.onChanged();
         } else {
            this.playlistsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder clearPlaylists() {
         if (this.playlistsBuilder_ == null) {
            this.playlists_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.playlistsBuilder_.clear();
         }

         return this;
      }

      public FetchPlaylistsResponse.Builder removePlaylists(int var1) {
         if (this.playlistsBuilder_ == null) {
            this.ensurePlaylistsIsMutable();
            this.playlists_.remove(var1);
            this.onChanged();
         } else {
            this.playlistsBuilder_.remove(var1);
         }

         return this;
      }

      public FetchPlaylistsResponse.Playlist.Builder getPlaylistsBuilder(int var1) {
         return this.getPlaylistsFieldBuilder().getBuilder(var1);
      }

      @Override
      public FetchPlaylistsResponse.PlaylistOrBuilder getPlaylistsOrBuilder(int var1) {
         return this.playlistsBuilder_ == null ? this.playlists_.get(var1) : this.playlistsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends FetchPlaylistsResponse.PlaylistOrBuilder> getPlaylistsOrBuilderList() {
         return this.playlistsBuilder_ != null ? this.playlistsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playlists_);
      }

      public FetchPlaylistsResponse.Playlist.Builder addPlaylistsBuilder() {
         return this.getPlaylistsFieldBuilder().addBuilder(FetchPlaylistsResponse.Playlist.getDefaultInstance());
      }

      public FetchPlaylistsResponse.Playlist.Builder addPlaylistsBuilder(int var1) {
         return this.getPlaylistsFieldBuilder().addBuilder(var1, FetchPlaylistsResponse.Playlist.getDefaultInstance());
      }

      public List<FetchPlaylistsResponse.Playlist.Builder> getPlaylistsBuilderList() {
         return this.getPlaylistsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<FetchPlaylistsResponse.Playlist, FetchPlaylistsResponse.Playlist.Builder, FetchPlaylistsResponse.PlaylistOrBuilder> getPlaylistsFieldBuilder() {
         if (this.playlistsBuilder_ == null) {
            this.playlistsBuilder_ = new RepeatedFieldBuilderV3<>(this.playlists_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.playlists_ = null;
         }

         return this.playlistsBuilder_;
      }

      @Override
      public boolean getPremium() {
         return this.premium_;
      }

      public FetchPlaylistsResponse.Builder setPremium(boolean var1) {
         this.premium_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FetchPlaylistsResponse.Builder clearPremium() {
         this.bitField0_ &= -3;
         this.premium_ = false;
         this.onChanged();
         return this;
      }

      public final FetchPlaylistsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FetchPlaylistsResponse.Builder)super.setUnknownFields(var1);
      }

      public final FetchPlaylistsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FetchPlaylistsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class Playlist extends GeneratedMessageV3 implements FetchPlaylistsResponse.PlaylistOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private volatile Object id_ = "";
      public static final int NAME_FIELD_NUMBER = 2;
      private volatile Object name_ = "";
      public static final int DESCRIPTION_FIELD_NUMBER = 3;
      private volatile Object description_ = "";
      public static final int TRACK_COUNT_FIELD_NUMBER = 4;
      private int trackCount_ = 0;
      public static final int DURATION_FIELD_NUMBER = 5;
      private Duration duration_;
      public static final int LICENSE_FIELD_NUMBER = 6;
      private int license_ = 0;
      public static final int MONETIZATION_FIELD_NUMBER = 7;
      private int monetization_ = 0;
      private byte memoizedIsInitialized = -1;
      private static final FetchPlaylistsResponse.Playlist DEFAULT_INSTANCE = new FetchPlaylistsResponse.Playlist();
      private static final Parser<FetchPlaylistsResponse.Playlist> PARSER = new AbstractParser<FetchPlaylistsResponse.Playlist>() {
         public FetchPlaylistsResponse.Playlist parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            FetchPlaylistsResponse.Playlist.Builder var3 = FetchPlaylistsResponse.Playlist.newBuilder();

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

      private Playlist(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private Playlist() {
         this.id_ = "";
         this.name_ = "";
         this.description_ = "";
         this.license_ = 0;
         this.monetization_ = 0;
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new FetchPlaylistsResponse.Playlist();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FetchPlaylistsResponse.Playlist.class, FetchPlaylistsResponse.Playlist.Builder.class);
      }

      @Override
      public String getId() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.id_ = var3;
         return var3;
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.name_ = var3;
         return var3;
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public boolean hasDescription() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public String getDescription() {
         Object var1 = this.description_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.description_ = var3;
         return var3;
      }

      @Override
      public ByteString getDescriptionBytes() {
         Object var1 = this.description_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.description_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public int getTrackCount() {
         return this.trackCount_;
      }

      @Override
      public boolean hasDuration() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Duration getDuration() {
         return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
      }

      @Override
      public DurationOrBuilder getDurationOrBuilder() {
         return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
      }

      @Override
      public int getLicenseValue() {
         return this.license_;
      }

      @Override
      public PlaylistLicense getLicense() {
         PlaylistLicense var1 = PlaylistLicense.forNumber(this.license_);
         return var1 == null ? PlaylistLicense.UNRECOGNIZED : var1;
      }

      @Override
      public int getMonetizationValue() {
         return this.monetization_;
      }

      @Override
      public PlaylistMonetization getMonetization() {
         PlaylistMonetization var1 = PlaylistMonetization.forNumber(this.monetization_);
         return var1 == null ? PlaylistMonetization.UNRECOGNIZED : var1;
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
         if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
            GeneratedMessageV3.writeString(var1, 1, this.id_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(var1, 2, this.name_);
         }

         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(var1, 3, this.description_);
         }

         if (this.trackCount_ != 0) {
            var1.writeInt32(4, this.trackCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(5, this.getDuration());
         }

         if (this.license_ != PlaylistLicense.PLAYLIST_LICENSE_UNSPECIFIED.getNumber()) {
            var1.writeEnum(6, this.license_);
         }

         if (this.monetization_ != PlaylistMonetization.PLAYLIST_MONETIZATION_UNSPECIFIED.getNumber()) {
            var1.writeEnum(7, this.monetization_);
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
         if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
         }

         if ((this.bitField0_ & 1) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(3, this.description_);
         }

         if (this.trackCount_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(4, this.trackCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(5, this.getDuration());
         }

         if (this.license_ != PlaylistLicense.PLAYLIST_LICENSE_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(6, this.license_);
         }

         if (this.monetization_ != PlaylistMonetization.PLAYLIST_MONETIZATION_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(7, this.monetization_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof FetchPlaylistsResponse.Playlist)) {
            return super.equals(var1);
         } else {
            FetchPlaylistsResponse.Playlist var2 = (FetchPlaylistsResponse.Playlist)var1;
            if (!this.getId().equals(var2.getId())) {
               return false;
            } else if (!this.getName().equals(var2.getName())) {
               return false;
            } else if (this.hasDescription() != var2.hasDescription()) {
               return false;
            } else if (this.hasDescription() && !this.getDescription().equals(var2.getDescription())) {
               return false;
            } else if (this.getTrackCount() != var2.getTrackCount()) {
               return false;
            } else if (this.hasDuration() != var2.hasDuration()) {
               return false;
            } else if (this.hasDuration() && !this.getDuration().equals(var2.getDuration())) {
               return false;
            } else if (this.license_ != var2.license_) {
               return false;
            } else {
               return this.monetization_ != var2.monetization_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 53 * var1 + this.getId().hashCode();
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getName().hashCode();
         if (this.hasDescription()) {
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getDescription().hashCode();
         }

         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getTrackCount();
         if (this.hasDuration()) {
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getDuration().hashCode();
         }

         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.license_;
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.monetization_;
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static FetchPlaylistsResponse.Playlist parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static FetchPlaylistsResponse.Playlist parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static FetchPlaylistsResponse.Playlist parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public FetchPlaylistsResponse.Playlist.Builder newBuilderForType() {
         return newBuilder();
      }

      public static FetchPlaylistsResponse.Playlist.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static FetchPlaylistsResponse.Playlist.Builder newBuilder(FetchPlaylistsResponse.Playlist var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public FetchPlaylistsResponse.Playlist.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new FetchPlaylistsResponse.Playlist.Builder() : new FetchPlaylistsResponse.Playlist.Builder().mergeFrom(this);
      }

      protected FetchPlaylistsResponse.Playlist.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new FetchPlaylistsResponse.Playlist.Builder(var1);
      }

      public static FetchPlaylistsResponse.Playlist getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<FetchPlaylistsResponse.Playlist> parser() {
         return PARSER;
      }

      @Override
      public Parser<FetchPlaylistsResponse.Playlist> getParserForType() {
         return PARSER;
      }

      public FetchPlaylistsResponse.Playlist getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<FetchPlaylistsResponse.Playlist.Builder>
         implements FetchPlaylistsResponse.PlaylistOrBuilder {
         private int bitField0_;
         private Object id_ = "";
         private Object name_ = "";
         private Object description_ = "";
         private int trackCount_;
         private Duration duration_;
         private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;
         private int license_ = 0;
         private int monetization_ = 0;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_fieldAccessorTable
               .ensureFieldAccessorsInitialized(FetchPlaylistsResponse.Playlist.class, FetchPlaylistsResponse.Playlist.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (FetchPlaylistsResponse.Playlist.alwaysUseFieldBuilders) {
               this.getDurationFieldBuilder();
            }
         }

         public FetchPlaylistsResponse.Playlist.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.id_ = "";
            this.name_ = "";
            this.description_ = "";
            this.trackCount_ = 0;
            this.duration_ = null;
            if (this.durationBuilder_ != null) {
               this.durationBuilder_.dispose();
               this.durationBuilder_ = null;
            }

            this.license_ = 0;
            this.monetization_ = 0;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchPlaylistsResponse_Playlist_descriptor;
         }

         public FetchPlaylistsResponse.Playlist getDefaultInstanceForType() {
            return FetchPlaylistsResponse.Playlist.getDefaultInstance();
         }

         public FetchPlaylistsResponse.Playlist build() {
            FetchPlaylistsResponse.Playlist var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public FetchPlaylistsResponse.Playlist buildPartial() {
            FetchPlaylistsResponse.Playlist var1 = new FetchPlaylistsResponse.Playlist(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(FetchPlaylistsResponse.Playlist var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.id_ = this.id_;
            }

            if ((var2 & 2) != 0) {
               var1.name_ = this.name_;
            }

            byte var3 = 0;
            if ((var2 & 4) != 0) {
               var1.description_ = this.description_;
               var3 |= 1;
            }

            if ((var2 & 8) != 0) {
               var1.trackCount_ = this.trackCount_;
            }

            if ((var2 & 16) != 0) {
               var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
               var3 |= 2;
            }

            if ((var2 & 32) != 0) {
               var1.license_ = this.license_;
            }

            if ((var2 & 64) != 0) {
               var1.monetization_ = this.monetization_;
            }

            FetchPlaylistsResponse.Playlist var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public FetchPlaylistsResponse.Playlist.Builder clone() {
            return (FetchPlaylistsResponse.Playlist.Builder)super.clone();
         }

         public FetchPlaylistsResponse.Playlist.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.setField(var1, var2);
         }

         public FetchPlaylistsResponse.Playlist.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.clearField(var1);
         }

         public FetchPlaylistsResponse.Playlist.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.clearOneof(var1);
         }

         public FetchPlaylistsResponse.Playlist.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public FetchPlaylistsResponse.Playlist.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.addRepeatedField(var1, var2);
         }

         public FetchPlaylistsResponse.Playlist.Builder mergeFrom(Message var1) {
            if (var1 instanceof FetchPlaylistsResponse.Playlist) {
               return this.mergeFrom((FetchPlaylistsResponse.Playlist)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder mergeFrom(FetchPlaylistsResponse.Playlist var1) {
            if (var1 == FetchPlaylistsResponse.Playlist.getDefaultInstance()) {
               return this;
            }

            if (!var1.getId().isEmpty()) {
               this.id_ = var1.id_;
               this.bitField0_ |= 1;
               this.onChanged();
            }

            if (!var1.getName().isEmpty()) {
               this.name_ = var1.name_;
               this.bitField0_ |= 2;
               this.onChanged();
            }

            if (var1.hasDescription()) {
               this.description_ = var1.description_;
               this.bitField0_ |= 4;
               this.onChanged();
            }

            if (var1.getTrackCount() != 0) {
               this.setTrackCount(var1.getTrackCount());
            }

            if (var1.hasDuration()) {
               this.mergeDuration(var1.getDuration());
            }

            if (var1.license_ != 0) {
               this.setLicenseValue(var1.getLicenseValue());
            }

            if (var1.monetization_ != 0) {
               this.setMonetizationValue(var1.getMonetizationValue());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public FetchPlaylistsResponse.Playlist.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        this.id_ = var1.readStringRequireUtf8();
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.name_ = var1.readStringRequireUtf8();
                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        this.description_ = var1.readStringRequireUtf8();
                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.trackCount_ = var1.readInt32();
                        this.bitField0_ |= 8;
                        break;
                     case 42:
                        var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 16;
                        break;
                     case 48:
                        this.license_ = var1.readEnum();
                        this.bitField0_ |= 32;
                        break;
                     case 56:
                        this.monetization_ = var1.readEnum();
                        this.bitField0_ |= 64;
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
         public String getId() {
            Object var1 = this.id_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.id_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getIdBytes() {
            Object var1 = this.id_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.id_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public FetchPlaylistsResponse.Playlist.Builder setId(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearId() {
            this.id_ = FetchPlaylistsResponse.Playlist.getDefaultInstance().getId();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder setIdBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            FetchPlaylistsResponse.Playlist.checkByteStringIsUtf8(var1);
            this.id_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         @Override
         public String getName() {
            Object var1 = this.name_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.name_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getNameBytes() {
            Object var1 = this.name_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.name_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public FetchPlaylistsResponse.Playlist.Builder setName(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.name_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearName() {
            this.name_ = FetchPlaylistsResponse.Playlist.getDefaultInstance().getName();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder setNameBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            FetchPlaylistsResponse.Playlist.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasDescription() {
            return (this.bitField0_ & 4) != 0;
         }

         @Override
         public String getDescription() {
            Object var1 = this.description_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.description_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getDescriptionBytes() {
            Object var1 = this.description_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.description_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public FetchPlaylistsResponse.Playlist.Builder setDescription(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.description_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearDescription() {
            this.description_ = FetchPlaylistsResponse.Playlist.getDefaultInstance().getDescription();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder setDescriptionBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            FetchPlaylistsResponse.Playlist.checkByteStringIsUtf8(var1);
            this.description_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         @Override
         public int getTrackCount() {
            return this.trackCount_;
         }

         public FetchPlaylistsResponse.Playlist.Builder setTrackCount(int var1) {
            this.trackCount_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearTrackCount() {
            this.bitField0_ &= -9;
            this.trackCount_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasDuration() {
            return (this.bitField0_ & 16) != 0;
         }

         @Override
         public Duration getDuration() {
            if (this.durationBuilder_ == null) {
               return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
            } else {
               return this.durationBuilder_.getMessage();
            }
         }

         public FetchPlaylistsResponse.Playlist.Builder setDuration(Duration var1) {
            if (this.durationBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.duration_ = var1;
            } else {
               this.durationBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 16;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder setDuration(Duration.Builder var1) {
            if (this.durationBuilder_ == null) {
               this.duration_ = var1.build();
            } else {
               this.durationBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 16;
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder mergeDuration(Duration var1) {
            if (this.durationBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.duration_ != null && this.duration_ != Duration.getDefaultInstance()) {
                  this.getDurationBuilder().mergeFrom(var1);
               } else {
                  this.duration_ = var1;
               }
            } else {
               this.durationBuilder_.mergeFrom(var1);
            }

            if (this.duration_ != null) {
               this.bitField0_ |= 16;
               this.onChanged();
            }

            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearDuration() {
            this.bitField0_ &= -17;
            this.duration_ = null;
            if (this.durationBuilder_ != null) {
               this.durationBuilder_.dispose();
               this.durationBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Duration.Builder getDurationBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return this.getDurationFieldBuilder().getBuilder();
         }

         @Override
         public DurationOrBuilder getDurationOrBuilder() {
            if (this.durationBuilder_ != null) {
               return this.durationBuilder_.getMessageOrBuilder();
            } else {
               return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
            }
         }

         private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDurationFieldBuilder() {
            if (this.durationBuilder_ == null) {
               this.durationBuilder_ = new SingleFieldBuilderV3<>(this.getDuration(), this.getParentForChildren(), this.isClean());
               this.duration_ = null;
            }

            return this.durationBuilder_;
         }

         @Override
         public int getLicenseValue() {
            return this.license_;
         }

         public FetchPlaylistsResponse.Playlist.Builder setLicenseValue(int var1) {
            this.license_ = var1;
            this.bitField0_ |= 32;
            this.onChanged();
            return this;
         }

         @Override
         public PlaylistLicense getLicense() {
            PlaylistLicense var1 = PlaylistLicense.forNumber(this.license_);
            return var1 == null ? PlaylistLicense.UNRECOGNIZED : var1;
         }

         public FetchPlaylistsResponse.Playlist.Builder setLicense(PlaylistLicense var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 32;
            this.license_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearLicense() {
            this.bitField0_ &= -33;
            this.license_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getMonetizationValue() {
            return this.monetization_;
         }

         public FetchPlaylistsResponse.Playlist.Builder setMonetizationValue(int var1) {
            this.monetization_ = var1;
            this.bitField0_ |= 64;
            this.onChanged();
            return this;
         }

         @Override
         public PlaylistMonetization getMonetization() {
            PlaylistMonetization var1 = PlaylistMonetization.forNumber(this.monetization_);
            return var1 == null ? PlaylistMonetization.UNRECOGNIZED : var1;
         }

         public FetchPlaylistsResponse.Playlist.Builder setMonetization(PlaylistMonetization var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 64;
            this.monetization_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public FetchPlaylistsResponse.Playlist.Builder clearMonetization() {
            this.bitField0_ &= -65;
            this.monetization_ = 0;
            this.onChanged();
            return this;
         }

         public final FetchPlaylistsResponse.Playlist.Builder setUnknownFields(UnknownFieldSet var1) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.setUnknownFields(var1);
         }

         public final FetchPlaylistsResponse.Playlist.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (FetchPlaylistsResponse.Playlist.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface PlaylistOrBuilder extends MessageOrBuilder {
      String getId();

      ByteString getIdBytes();

      String getName();

      ByteString getNameBytes();

      boolean hasDescription();

      String getDescription();

      ByteString getDescriptionBytes();

      int getTrackCount();

      boolean hasDuration();

      Duration getDuration();

      DurationOrBuilder getDurationOrBuilder();

      int getLicenseValue();

      PlaylistLicense getLicense();

      int getMonetizationValue();

      PlaylistMonetization getMonetization();
   }
}
