package com.lunarclient.websocket.hostedworld.v1;

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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HostedWorldStatusPush extends GeneratedMessageV3 implements HostedWorldStatusPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ONLINE_PLAYERS_FIELD_NUMBER = 1;
   private List<HostedWorldStatusPush.OnlinePlayer> onlinePlayers_;
   public static final int OFFLINE_PLAYERS_FIELD_NUMBER = 2;
   private List<HostedWorldStatusPush.OfflinePlayer> offlinePlayers_;
   public static final int ALLOWED_JOIN_SOURCES_FIELD_NUMBER = 3;
   private List<Integer> allowedJoinSources_;
   private static final Internal.ListAdapter.Converter<Integer, JoinSource> allowedJoinSources_converter_ = new Internal.ListAdapter.Converter<Integer, JoinSource>() {
      public JoinSource convert(Integer var1) {
         JoinSource var2 = JoinSource.forNumber(var1);
         return var2 == null ? JoinSource.UNRECOGNIZED : var2;
      }
   };
   private int allowedJoinSourcesMemoizedSerializedSize;
   public static final int MAX_PLAYERS_FIELD_NUMBER = 4;
   private int maxPlayers_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final HostedWorldStatusPush DEFAULT_INSTANCE = new HostedWorldStatusPush();
   private static final Parser<HostedWorldStatusPush> PARSER = new AbstractParser<HostedWorldStatusPush>() {
      public HostedWorldStatusPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HostedWorldStatusPush.Builder var3 = HostedWorldStatusPush.newBuilder();

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

   private HostedWorldStatusPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HostedWorldStatusPush() {
      this.onlinePlayers_ = Collections.emptyList();
      this.offlinePlayers_ = Collections.emptyList();
      this.allowedJoinSources_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HostedWorldStatusPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HostedWorldStatusPush.class, HostedWorldStatusPush.Builder.class);
   }

   @Override
   public List<HostedWorldStatusPush.OnlinePlayer> getOnlinePlayersList() {
      return this.onlinePlayers_;
   }

   @Override
   public List<? extends HostedWorldStatusPush.OnlinePlayerOrBuilder> getOnlinePlayersOrBuilderList() {
      return this.onlinePlayers_;
   }

   @Override
   public int getOnlinePlayersCount() {
      return this.onlinePlayers_.size();
   }

   @Override
   public HostedWorldStatusPush.OnlinePlayer getOnlinePlayers(int var1) {
      return this.onlinePlayers_.get(var1);
   }

   @Override
   public HostedWorldStatusPush.OnlinePlayerOrBuilder getOnlinePlayersOrBuilder(int var1) {
      return this.onlinePlayers_.get(var1);
   }

   @Override
   public List<HostedWorldStatusPush.OfflinePlayer> getOfflinePlayersList() {
      return this.offlinePlayers_;
   }

   @Override
   public List<? extends HostedWorldStatusPush.OfflinePlayerOrBuilder> getOfflinePlayersOrBuilderList() {
      return this.offlinePlayers_;
   }

   @Override
   public int getOfflinePlayersCount() {
      return this.offlinePlayers_.size();
   }

   @Override
   public HostedWorldStatusPush.OfflinePlayer getOfflinePlayers(int var1) {
      return this.offlinePlayers_.get(var1);
   }

   @Override
   public HostedWorldStatusPush.OfflinePlayerOrBuilder getOfflinePlayersOrBuilder(int var1) {
      return this.offlinePlayers_.get(var1);
   }

   @Override
   public List<JoinSource> getAllowedJoinSourcesList() {
      return new Internal.ListAdapter<>(this.allowedJoinSources_, allowedJoinSources_converter_);
   }

   @Override
   public int getAllowedJoinSourcesCount() {
      return this.allowedJoinSources_.size();
   }

   @Override
   public JoinSource getAllowedJoinSources(int var1) {
      return allowedJoinSources_converter_.convert(this.allowedJoinSources_.get(var1));
   }

   @Override
   public List<Integer> getAllowedJoinSourcesValueList() {
      return this.allowedJoinSources_;
   }

   @Override
   public int getAllowedJoinSourcesValue(int var1) {
      return this.allowedJoinSources_.get(var1);
   }

   @Override
   public int getMaxPlayers() {
      return this.maxPlayers_;
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
      this.getSerializedSize();

      for (int var2 = 0; var2 < this.onlinePlayers_.size(); var2++) {
         var1.writeMessage(1, this.onlinePlayers_.get(var2));
      }

      for (int var3 = 0; var3 < this.offlinePlayers_.size(); var3++) {
         var1.writeMessage(2, this.offlinePlayers_.get(var3));
      }

      if (this.getAllowedJoinSourcesList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.allowedJoinSourcesMemoizedSerializedSize);
      }

      for (int var4 = 0; var4 < this.allowedJoinSources_.size(); var4++) {
         var1.writeEnumNoTag(this.allowedJoinSources_.get(var4));
      }

      if (this.maxPlayers_ != 0) {
         var1.writeInt32(4, this.maxPlayers_);
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

      for (int var2 = 0; var2 < this.onlinePlayers_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.onlinePlayers_.get(var2));
      }

      for (int var8 = 0; var8 < this.offlinePlayers_.size(); var8++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.offlinePlayers_.get(var8));
      }

      int var9 = 0;

      for (int var3 = 0; var3 < this.allowedJoinSources_.size(); var3++) {
         var9 += CodedOutputStream.computeEnumSizeNoTag(this.allowedJoinSources_.get(var3));
      }

      var1 += var9;
      if (!this.getAllowedJoinSourcesList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeUInt32SizeNoTag(var9);
      }

      this.allowedJoinSourcesMemoizedSerializedSize = var9;
      if (this.maxPlayers_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.maxPlayers_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HostedWorldStatusPush)) {
         return super.equals(var1);
      } else {
         HostedWorldStatusPush var2 = (HostedWorldStatusPush)var1;
         if (!this.getOnlinePlayersList().equals(var2.getOnlinePlayersList())) {
            return false;
         } else if (!this.getOfflinePlayersList().equals(var2.getOfflinePlayersList())) {
            return false;
         } else if (!this.allowedJoinSources_.equals(var2.allowedJoinSources_)) {
            return false;
         } else {
            return this.getMaxPlayers() != var2.getMaxPlayers() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getOnlinePlayersCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOnlinePlayersList().hashCode();
      }

      if (this.getOfflinePlayersCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getOfflinePlayersList().hashCode();
      }

      if (this.getAllowedJoinSourcesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.allowedJoinSources_.hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getMaxPlayers();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HostedWorldStatusPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldStatusPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldStatusPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldStatusPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldStatusPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldStatusPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldStatusPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldStatusPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldStatusPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HostedWorldStatusPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldStatusPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldStatusPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HostedWorldStatusPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HostedWorldStatusPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HostedWorldStatusPush.Builder newBuilder(HostedWorldStatusPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HostedWorldStatusPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HostedWorldStatusPush.Builder() : new HostedWorldStatusPush.Builder().mergeFrom(this);
   }

   protected HostedWorldStatusPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HostedWorldStatusPush.Builder(var1);
   }

   public static HostedWorldStatusPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HostedWorldStatusPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<HostedWorldStatusPush> getParserForType() {
      return PARSER;
   }

   public HostedWorldStatusPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HostedWorldStatusPush.Builder> implements HostedWorldStatusPushOrBuilder {
      private int bitField0_;
      private List<HostedWorldStatusPush.OnlinePlayer> onlinePlayers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<HostedWorldStatusPush.OnlinePlayer, HostedWorldStatusPush.OnlinePlayer.Builder, HostedWorldStatusPush.OnlinePlayerOrBuilder> onlinePlayersBuilder_;
      private List<HostedWorldStatusPush.OfflinePlayer> offlinePlayers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<HostedWorldStatusPush.OfflinePlayer, HostedWorldStatusPush.OfflinePlayer.Builder, HostedWorldStatusPush.OfflinePlayerOrBuilder> offlinePlayersBuilder_;
      private List<Integer> allowedJoinSources_ = Collections.emptyList();
      private int maxPlayers_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HostedWorldStatusPush.class, HostedWorldStatusPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public HostedWorldStatusPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.onlinePlayersBuilder_ == null) {
            this.onlinePlayers_ = Collections.emptyList();
         } else {
            this.onlinePlayers_ = null;
            this.onlinePlayersBuilder_.clear();
         }

         this.bitField0_ &= -2;
         if (this.offlinePlayersBuilder_ == null) {
            this.offlinePlayers_ = Collections.emptyList();
         } else {
            this.offlinePlayers_ = null;
            this.offlinePlayersBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.allowedJoinSources_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.maxPlayers_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_descriptor;
      }

      public HostedWorldStatusPush getDefaultInstanceForType() {
         return HostedWorldStatusPush.getDefaultInstance();
      }

      public HostedWorldStatusPush build() {
         HostedWorldStatusPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HostedWorldStatusPush buildPartial() {
         HostedWorldStatusPush var1 = new HostedWorldStatusPush(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(HostedWorldStatusPush var1) {
         if (this.onlinePlayersBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.onlinePlayers_ = Collections.unmodifiableList(this.onlinePlayers_);
               this.bitField0_ &= -2;
            }

            var1.onlinePlayers_ = this.onlinePlayers_;
         } else {
            var1.onlinePlayers_ = this.onlinePlayersBuilder_.build();
         }

         if (this.offlinePlayersBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.offlinePlayers_ = Collections.unmodifiableList(this.offlinePlayers_);
               this.bitField0_ &= -3;
            }

            var1.offlinePlayers_ = this.offlinePlayers_;
         } else {
            var1.offlinePlayers_ = this.offlinePlayersBuilder_.build();
         }

         if ((this.bitField0_ & 4) != 0) {
            this.allowedJoinSources_ = Collections.unmodifiableList(this.allowedJoinSources_);
            this.bitField0_ &= -5;
         }

         var1.allowedJoinSources_ = this.allowedJoinSources_;
      }

      private void buildPartial0(HostedWorldStatusPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 8) != 0) {
            var1.maxPlayers_ = this.maxPlayers_;
         }
      }

      public HostedWorldStatusPush.Builder clone() {
         return (HostedWorldStatusPush.Builder)super.clone();
      }

      public HostedWorldStatusPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldStatusPush.Builder)super.setField(var1, var2);
      }

      public HostedWorldStatusPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HostedWorldStatusPush.Builder)super.clearField(var1);
      }

      public HostedWorldStatusPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HostedWorldStatusPush.Builder)super.clearOneof(var1);
      }

      public HostedWorldStatusPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HostedWorldStatusPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HostedWorldStatusPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldStatusPush.Builder)super.addRepeatedField(var1, var2);
      }

      public HostedWorldStatusPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof HostedWorldStatusPush) {
            return this.mergeFrom((HostedWorldStatusPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HostedWorldStatusPush.Builder mergeFrom(HostedWorldStatusPush var1) {
         if (var1 == HostedWorldStatusPush.getDefaultInstance()) {
            return this;
         }

         if (this.onlinePlayersBuilder_ == null) {
            if (!var1.onlinePlayers_.isEmpty()) {
               if (this.onlinePlayers_.isEmpty()) {
                  this.onlinePlayers_ = var1.onlinePlayers_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureOnlinePlayersIsMutable();
                  this.onlinePlayers_.addAll(var1.onlinePlayers_);
               }

               this.onChanged();
            }
         } else if (!var1.onlinePlayers_.isEmpty()) {
            if (this.onlinePlayersBuilder_.isEmpty()) {
               this.onlinePlayersBuilder_.dispose();
               this.onlinePlayersBuilder_ = null;
               this.onlinePlayers_ = var1.onlinePlayers_;
               this.bitField0_ &= -2;
               this.onlinePlayersBuilder_ = HostedWorldStatusPush.alwaysUseFieldBuilders ? this.getOnlinePlayersFieldBuilder() : null;
            } else {
               this.onlinePlayersBuilder_.addAllMessages(var1.onlinePlayers_);
            }
         }

         if (this.offlinePlayersBuilder_ == null) {
            if (!var1.offlinePlayers_.isEmpty()) {
               if (this.offlinePlayers_.isEmpty()) {
                  this.offlinePlayers_ = var1.offlinePlayers_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureOfflinePlayersIsMutable();
                  this.offlinePlayers_.addAll(var1.offlinePlayers_);
               }

               this.onChanged();
            }
         } else if (!var1.offlinePlayers_.isEmpty()) {
            if (this.offlinePlayersBuilder_.isEmpty()) {
               this.offlinePlayersBuilder_.dispose();
               this.offlinePlayersBuilder_ = null;
               this.offlinePlayers_ = var1.offlinePlayers_;
               this.bitField0_ &= -3;
               this.offlinePlayersBuilder_ = HostedWorldStatusPush.alwaysUseFieldBuilders ? this.getOfflinePlayersFieldBuilder() : null;
            } else {
               this.offlinePlayersBuilder_.addAllMessages(var1.offlinePlayers_);
            }
         }

         if (!var1.allowedJoinSources_.isEmpty()) {
            if (this.allowedJoinSources_.isEmpty()) {
               this.allowedJoinSources_ = var1.allowedJoinSources_;
               this.bitField0_ &= -5;
            } else {
               this.ensureAllowedJoinSourcesIsMutable();
               this.allowedJoinSources_.addAll(var1.allowedJoinSources_);
            }

            this.onChanged();
         }

         if (var1.getMaxPlayers() != 0) {
            this.setMaxPlayers(var1.getMaxPlayers());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public HostedWorldStatusPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     HostedWorldStatusPush.OnlinePlayer var15 = var1.readMessage(HostedWorldStatusPush.OnlinePlayer.parser(), var2);
                     if (this.onlinePlayersBuilder_ == null) {
                        this.ensureOnlinePlayersIsMutable();
                        this.onlinePlayers_.add(var15);
                     } else {
                        this.onlinePlayersBuilder_.addMessage(var15);
                     }
                     break;
                  case 18:
                     HostedWorldStatusPush.OfflinePlayer var14 = var1.readMessage(HostedWorldStatusPush.OfflinePlayer.parser(), var2);
                     if (this.offlinePlayersBuilder_ == null) {
                        this.ensureOfflinePlayersIsMutable();
                        this.offlinePlayers_.add(var14);
                     } else {
                        this.offlinePlayersBuilder_.addMessage(var14);
                     }
                     break;
                  case 24:
                     int var13 = var1.readEnum();
                     this.ensureAllowedJoinSourcesIsMutable();
                     this.allowedJoinSources_.add(var13);
                     break;
                  case 26:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureAllowedJoinSourcesIsMutable();
                        this.allowedJoinSources_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  case 32:
                     this.maxPlayers_ = var1.readInt32();
                     this.bitField0_ |= 8;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensureOnlinePlayersIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.onlinePlayers_ = new ArrayList<>(this.onlinePlayers_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<HostedWorldStatusPush.OnlinePlayer> getOnlinePlayersList() {
         return this.onlinePlayersBuilder_ == null ? Collections.unmodifiableList(this.onlinePlayers_) : this.onlinePlayersBuilder_.getMessageList();
      }

      @Override
      public int getOnlinePlayersCount() {
         return this.onlinePlayersBuilder_ == null ? this.onlinePlayers_.size() : this.onlinePlayersBuilder_.getCount();
      }

      @Override
      public HostedWorldStatusPush.OnlinePlayer getOnlinePlayers(int var1) {
         return this.onlinePlayersBuilder_ == null ? this.onlinePlayers_.get(var1) : this.onlinePlayersBuilder_.getMessage(var1);
      }

      public HostedWorldStatusPush.Builder setOnlinePlayers(int var1, HostedWorldStatusPush.OnlinePlayer var2) {
         if (this.onlinePlayersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.set(var1, var2);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder setOnlinePlayers(int var1, HostedWorldStatusPush.OnlinePlayer.Builder var2) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOnlinePlayers(HostedWorldStatusPush.OnlinePlayer var1) {
         if (this.onlinePlayersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.add(var1);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addMessage(var1);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOnlinePlayers(int var1, HostedWorldStatusPush.OnlinePlayer var2) {
         if (this.onlinePlayersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.add(var1, var2);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOnlinePlayers(HostedWorldStatusPush.OnlinePlayer.Builder var1) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.add(var1.build());
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOnlinePlayers(int var1, HostedWorldStatusPush.OnlinePlayer.Builder var2) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addAllOnlinePlayers(Iterable<? extends HostedWorldStatusPush.OnlinePlayer> var1) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.onlinePlayers_);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder clearOnlinePlayers() {
         if (this.onlinePlayersBuilder_ == null) {
            this.onlinePlayers_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.clear();
         }

         return this;
      }

      public HostedWorldStatusPush.Builder removeOnlinePlayers(int var1) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.remove(var1);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.remove(var1);
         }

         return this;
      }

      public HostedWorldStatusPush.OnlinePlayer.Builder getOnlinePlayersBuilder(int var1) {
         return this.getOnlinePlayersFieldBuilder().getBuilder(var1);
      }

      @Override
      public HostedWorldStatusPush.OnlinePlayerOrBuilder getOnlinePlayersOrBuilder(int var1) {
         return this.onlinePlayersBuilder_ == null ? this.onlinePlayers_.get(var1) : this.onlinePlayersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends HostedWorldStatusPush.OnlinePlayerOrBuilder> getOnlinePlayersOrBuilderList() {
         return this.onlinePlayersBuilder_ != null ? this.onlinePlayersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.onlinePlayers_);
      }

      public HostedWorldStatusPush.OnlinePlayer.Builder addOnlinePlayersBuilder() {
         return this.getOnlinePlayersFieldBuilder().addBuilder(HostedWorldStatusPush.OnlinePlayer.getDefaultInstance());
      }

      public HostedWorldStatusPush.OnlinePlayer.Builder addOnlinePlayersBuilder(int var1) {
         return this.getOnlinePlayersFieldBuilder().addBuilder(var1, HostedWorldStatusPush.OnlinePlayer.getDefaultInstance());
      }

      public List<HostedWorldStatusPush.OnlinePlayer.Builder> getOnlinePlayersBuilderList() {
         return this.getOnlinePlayersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<HostedWorldStatusPush.OnlinePlayer, HostedWorldStatusPush.OnlinePlayer.Builder, HostedWorldStatusPush.OnlinePlayerOrBuilder> getOnlinePlayersFieldBuilder() {
         if (this.onlinePlayersBuilder_ == null) {
            this.onlinePlayersBuilder_ = new RepeatedFieldBuilderV3<>(
               this.onlinePlayers_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.onlinePlayers_ = null;
         }

         return this.onlinePlayersBuilder_;
      }

      private void ensureOfflinePlayersIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.offlinePlayers_ = new ArrayList<>(this.offlinePlayers_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<HostedWorldStatusPush.OfflinePlayer> getOfflinePlayersList() {
         return this.offlinePlayersBuilder_ == null ? Collections.unmodifiableList(this.offlinePlayers_) : this.offlinePlayersBuilder_.getMessageList();
      }

      @Override
      public int getOfflinePlayersCount() {
         return this.offlinePlayersBuilder_ == null ? this.offlinePlayers_.size() : this.offlinePlayersBuilder_.getCount();
      }

      @Override
      public HostedWorldStatusPush.OfflinePlayer getOfflinePlayers(int var1) {
         return this.offlinePlayersBuilder_ == null ? this.offlinePlayers_.get(var1) : this.offlinePlayersBuilder_.getMessage(var1);
      }

      public HostedWorldStatusPush.Builder setOfflinePlayers(int var1, HostedWorldStatusPush.OfflinePlayer var2) {
         if (this.offlinePlayersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.set(var1, var2);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder setOfflinePlayers(int var1, HostedWorldStatusPush.OfflinePlayer.Builder var2) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOfflinePlayers(HostedWorldStatusPush.OfflinePlayer var1) {
         if (this.offlinePlayersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.add(var1);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addMessage(var1);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOfflinePlayers(int var1, HostedWorldStatusPush.OfflinePlayer var2) {
         if (this.offlinePlayersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.add(var1, var2);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOfflinePlayers(HostedWorldStatusPush.OfflinePlayer.Builder var1) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.add(var1.build());
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addOfflinePlayers(int var1, HostedWorldStatusPush.OfflinePlayer.Builder var2) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public HostedWorldStatusPush.Builder addAllOfflinePlayers(Iterable<? extends HostedWorldStatusPush.OfflinePlayer> var1) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.offlinePlayers_);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public HostedWorldStatusPush.Builder clearOfflinePlayers() {
         if (this.offlinePlayersBuilder_ == null) {
            this.offlinePlayers_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.clear();
         }

         return this;
      }

      public HostedWorldStatusPush.Builder removeOfflinePlayers(int var1) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.remove(var1);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.remove(var1);
         }

         return this;
      }

      public HostedWorldStatusPush.OfflinePlayer.Builder getOfflinePlayersBuilder(int var1) {
         return this.getOfflinePlayersFieldBuilder().getBuilder(var1);
      }

      @Override
      public HostedWorldStatusPush.OfflinePlayerOrBuilder getOfflinePlayersOrBuilder(int var1) {
         return this.offlinePlayersBuilder_ == null ? this.offlinePlayers_.get(var1) : this.offlinePlayersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends HostedWorldStatusPush.OfflinePlayerOrBuilder> getOfflinePlayersOrBuilderList() {
         return this.offlinePlayersBuilder_ != null
            ? this.offlinePlayersBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.offlinePlayers_);
      }

      public HostedWorldStatusPush.OfflinePlayer.Builder addOfflinePlayersBuilder() {
         return this.getOfflinePlayersFieldBuilder().addBuilder(HostedWorldStatusPush.OfflinePlayer.getDefaultInstance());
      }

      public HostedWorldStatusPush.OfflinePlayer.Builder addOfflinePlayersBuilder(int var1) {
         return this.getOfflinePlayersFieldBuilder().addBuilder(var1, HostedWorldStatusPush.OfflinePlayer.getDefaultInstance());
      }

      public List<HostedWorldStatusPush.OfflinePlayer.Builder> getOfflinePlayersBuilderList() {
         return this.getOfflinePlayersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<HostedWorldStatusPush.OfflinePlayer, HostedWorldStatusPush.OfflinePlayer.Builder, HostedWorldStatusPush.OfflinePlayerOrBuilder> getOfflinePlayersFieldBuilder() {
         if (this.offlinePlayersBuilder_ == null) {
            this.offlinePlayersBuilder_ = new RepeatedFieldBuilderV3<>(
               this.offlinePlayers_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.offlinePlayers_ = null;
         }

         return this.offlinePlayersBuilder_;
      }

      private void ensureAllowedJoinSourcesIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.allowedJoinSources_ = new ArrayList<>(this.allowedJoinSources_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<JoinSource> getAllowedJoinSourcesList() {
         return new Internal.ListAdapter<>(this.allowedJoinSources_, HostedWorldStatusPush.allowedJoinSources_converter_);
      }

      @Override
      public int getAllowedJoinSourcesCount() {
         return this.allowedJoinSources_.size();
      }

      @Override
      public JoinSource getAllowedJoinSources(int var1) {
         return HostedWorldStatusPush.allowedJoinSources_converter_.convert(this.allowedJoinSources_.get(var1));
      }

      public HostedWorldStatusPush.Builder setAllowedJoinSources(int var1, JoinSource var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public HostedWorldStatusPush.Builder addAllowedJoinSources(JoinSource var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public HostedWorldStatusPush.Builder addAllAllowedJoinSources(Iterable<? extends JoinSource> var1) {
         this.ensureAllowedJoinSourcesIsMutable();

         for (JoinSource var3 : var1) {
            this.allowedJoinSources_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public HostedWorldStatusPush.Builder clearAllowedJoinSources() {
         this.allowedJoinSources_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getAllowedJoinSourcesValueList() {
         return Collections.unmodifiableList(this.allowedJoinSources_);
      }

      @Override
      public int getAllowedJoinSourcesValue(int var1) {
         return this.allowedJoinSources_.get(var1);
      }

      public HostedWorldStatusPush.Builder setAllowedJoinSourcesValue(int var1, int var2) {
         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public HostedWorldStatusPush.Builder addAllowedJoinSourcesValue(int var1) {
         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.add(var1);
         this.onChanged();
         return this;
      }

      public HostedWorldStatusPush.Builder addAllAllowedJoinSourcesValue(Iterable<Integer> var1) {
         this.ensureAllowedJoinSourcesIsMutable();

         for (int var3 : var1) {
            this.allowedJoinSources_.add(var3);
         }

         this.onChanged();
         return this;
      }

      @Override
      public int getMaxPlayers() {
         return this.maxPlayers_;
      }

      public HostedWorldStatusPush.Builder setMaxPlayers(int var1) {
         this.maxPlayers_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public HostedWorldStatusPush.Builder clearMaxPlayers() {
         this.bitField0_ &= -9;
         this.maxPlayers_ = 0;
         this.onChanged();
         return this;
      }

      public final HostedWorldStatusPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldStatusPush.Builder)super.setUnknownFields(var1);
      }

      public final HostedWorldStatusPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldStatusPush.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class OfflinePlayer extends GeneratedMessageV3 implements HostedWorldStatusPush.OfflinePlayerOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYER_FIELD_NUMBER = 1;
      private UuidAndUsername player_;
      public static final int LAST_ONLINE_FIELD_NUMBER = 2;
      private Timestamp lastOnline_;
      private byte memoizedIsInitialized = -1;
      private static final HostedWorldStatusPush.OfflinePlayer DEFAULT_INSTANCE = new HostedWorldStatusPush.OfflinePlayer();
      private static final Parser<HostedWorldStatusPush.OfflinePlayer> PARSER = new AbstractParser<HostedWorldStatusPush.OfflinePlayer>() {
         public HostedWorldStatusPush.OfflinePlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            HostedWorldStatusPush.OfflinePlayer.Builder var3 = HostedWorldStatusPush.OfflinePlayer.newBuilder();

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

      private OfflinePlayer(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private OfflinePlayer() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new HostedWorldStatusPush.OfflinePlayer();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HostedWorldStatusPush.OfflinePlayer.class, HostedWorldStatusPush.OfflinePlayer.Builder.class);
      }

      @Override
      public boolean hasPlayer() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getPlayer() {
         return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
      }

      @Override
      public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
         return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
      }

      @Override
      public boolean hasLastOnline() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getLastOnline() {
         return this.lastOnline_ == null ? Timestamp.getDefaultInstance() : this.lastOnline_;
      }

      @Override
      public TimestampOrBuilder getLastOnlineOrBuilder() {
         return this.lastOnline_ == null ? Timestamp.getDefaultInstance() : this.lastOnline_;
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
            var1.writeMessage(1, this.getPlayer());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(2, this.getLastOnline());
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getPlayer());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(2, this.getLastOnline());
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof HostedWorldStatusPush.OfflinePlayer)) {
            return super.equals(var1);
         } else {
            HostedWorldStatusPush.OfflinePlayer var2 = (HostedWorldStatusPush.OfflinePlayer)var1;
            if (this.hasPlayer() != var2.hasPlayer()) {
               return false;
            } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
               return false;
            } else if (this.hasLastOnline() != var2.hasLastOnline()) {
               return false;
            } else {
               return this.hasLastOnline() && !this.getLastOnline().equals(var2.getLastOnline())
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
         if (this.hasPlayer()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getPlayer().hashCode();
         }

         if (this.hasLastOnline()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getLastOnline().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static HostedWorldStatusPush.OfflinePlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public HostedWorldStatusPush.OfflinePlayer.Builder newBuilderForType() {
         return newBuilder();
      }

      public static HostedWorldStatusPush.OfflinePlayer.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static HostedWorldStatusPush.OfflinePlayer.Builder newBuilder(HostedWorldStatusPush.OfflinePlayer var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public HostedWorldStatusPush.OfflinePlayer.Builder toBuilder() {
         return this == DEFAULT_INSTANCE
            ? new HostedWorldStatusPush.OfflinePlayer.Builder()
            : new HostedWorldStatusPush.OfflinePlayer.Builder().mergeFrom(this);
      }

      protected HostedWorldStatusPush.OfflinePlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new HostedWorldStatusPush.OfflinePlayer.Builder(var1);
      }

      public static HostedWorldStatusPush.OfflinePlayer getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HostedWorldStatusPush.OfflinePlayer> parser() {
         return PARSER;
      }

      @Override
      public Parser<HostedWorldStatusPush.OfflinePlayer> getParserForType() {
         return PARSER;
      }

      public HostedWorldStatusPush.OfflinePlayer getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<HostedWorldStatusPush.OfflinePlayer.Builder>
         implements HostedWorldStatusPush.OfflinePlayerOrBuilder {
         private int bitField0_;
         private UuidAndUsername player_;
         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
         private Timestamp lastOnline_;
         private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastOnlineBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_fieldAccessorTable
               .ensureFieldAccessorsInitialized(HostedWorldStatusPush.OfflinePlayer.class, HostedWorldStatusPush.OfflinePlayer.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HostedWorldStatusPush.OfflinePlayer.alwaysUseFieldBuilders) {
               this.getPlayerFieldBuilder();
               this.getLastOnlineFieldBuilder();
            }
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.player_ = null;
            if (this.playerBuilder_ != null) {
               this.playerBuilder_.dispose();
               this.playerBuilder_ = null;
            }

            this.lastOnline_ = null;
            if (this.lastOnlineBuilder_ != null) {
               this.lastOnlineBuilder_.dispose();
               this.lastOnlineBuilder_ = null;
            }

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OfflinePlayer_descriptor;
         }

         public HostedWorldStatusPush.OfflinePlayer getDefaultInstanceForType() {
            return HostedWorldStatusPush.OfflinePlayer.getDefaultInstance();
         }

         public HostedWorldStatusPush.OfflinePlayer build() {
            HostedWorldStatusPush.OfflinePlayer var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public HostedWorldStatusPush.OfflinePlayer buildPartial() {
            HostedWorldStatusPush.OfflinePlayer var1 = new HostedWorldStatusPush.OfflinePlayer(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(HostedWorldStatusPush.OfflinePlayer var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.lastOnline_ = this.lastOnlineBuilder_ == null ? this.lastOnline_ : this.lastOnlineBuilder_.build();
               var3 |= 2;
            }

            HostedWorldStatusPush.OfflinePlayer var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder clone() {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.clone();
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.setField(var1, var2);
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.clearField(var1);
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.clearOneof(var1);
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.addRepeatedField(var1, var2);
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder mergeFrom(Message var1) {
            if (var1 instanceof HostedWorldStatusPush.OfflinePlayer) {
               return this.mergeFrom((HostedWorldStatusPush.OfflinePlayer)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder mergeFrom(HostedWorldStatusPush.OfflinePlayer var1) {
            if (var1 == HostedWorldStatusPush.OfflinePlayer.getDefaultInstance()) {
               return this;
            }

            if (var1.hasPlayer()) {
               this.mergePlayer(var1.getPlayer());
            }

            if (var1.hasLastOnline()) {
               this.mergeLastOnline(var1.getLastOnline());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getPlayerFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        var1.readMessage(this.getLastOnlineFieldBuilder().getBuilder(), var2);
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
         public boolean hasPlayer() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public UuidAndUsername getPlayer() {
            if (this.playerBuilder_ == null) {
               return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
            } else {
               return this.playerBuilder_.getMessage();
            }
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder setPlayer(UuidAndUsername var1) {
            if (this.playerBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.player_ = var1;
            } else {
               this.playerBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder setPlayer(UuidAndUsername.Builder var1) {
            if (this.playerBuilder_ == null) {
               this.player_ = var1.build();
            } else {
               this.playerBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder mergePlayer(UuidAndUsername var1) {
            if (this.playerBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.player_ != null && this.player_ != UuidAndUsername.getDefaultInstance()) {
                  this.getPlayerBuilder().mergeFrom(var1);
               } else {
                  this.player_ = var1;
               }
            } else {
               this.playerBuilder_.mergeFrom(var1);
            }

            if (this.player_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder clearPlayer() {
            this.bitField0_ &= -2;
            this.player_ = null;
            if (this.playerBuilder_ != null) {
               this.playerBuilder_.dispose();
               this.playerBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public UuidAndUsername.Builder getPlayerBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getPlayerFieldBuilder().getBuilder();
         }

         @Override
         public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
            if (this.playerBuilder_ != null) {
               return this.playerBuilder_.getMessageOrBuilder();
            } else {
               return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
            }
         }

         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getPlayerFieldBuilder() {
            if (this.playerBuilder_ == null) {
               this.playerBuilder_ = new SingleFieldBuilderV3<>(this.getPlayer(), this.getParentForChildren(), this.isClean());
               this.player_ = null;
            }

            return this.playerBuilder_;
         }

         @Override
         public boolean hasLastOnline() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public Timestamp getLastOnline() {
            if (this.lastOnlineBuilder_ == null) {
               return this.lastOnline_ == null ? Timestamp.getDefaultInstance() : this.lastOnline_;
            } else {
               return this.lastOnlineBuilder_.getMessage();
            }
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder setLastOnline(Timestamp var1) {
            if (this.lastOnlineBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.lastOnline_ = var1;
            } else {
               this.lastOnlineBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder setLastOnline(Timestamp.Builder var1) {
            if (this.lastOnlineBuilder_ == null) {
               this.lastOnline_ = var1.build();
            } else {
               this.lastOnlineBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder mergeLastOnline(Timestamp var1) {
            if (this.lastOnlineBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.lastOnline_ != null && this.lastOnline_ != Timestamp.getDefaultInstance()) {
                  this.getLastOnlineBuilder().mergeFrom(var1);
               } else {
                  this.lastOnline_ = var1;
               }
            } else {
               this.lastOnlineBuilder_.mergeFrom(var1);
            }

            if (this.lastOnline_ != null) {
               this.bitField0_ |= 2;
               this.onChanged();
            }

            return this;
         }

         public HostedWorldStatusPush.OfflinePlayer.Builder clearLastOnline() {
            this.bitField0_ &= -3;
            this.lastOnline_ = null;
            if (this.lastOnlineBuilder_ != null) {
               this.lastOnlineBuilder_.dispose();
               this.lastOnlineBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Timestamp.Builder getLastOnlineBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return this.getLastOnlineFieldBuilder().getBuilder();
         }

         @Override
         public TimestampOrBuilder getLastOnlineOrBuilder() {
            if (this.lastOnlineBuilder_ != null) {
               return this.lastOnlineBuilder_.getMessageOrBuilder();
            } else {
               return this.lastOnline_ == null ? Timestamp.getDefaultInstance() : this.lastOnline_;
            }
         }

         private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastOnlineFieldBuilder() {
            if (this.lastOnlineBuilder_ == null) {
               this.lastOnlineBuilder_ = new SingleFieldBuilderV3<>(this.getLastOnline(), this.getParentForChildren(), this.isClean());
               this.lastOnline_ = null;
            }

            return this.lastOnlineBuilder_;
         }

         public final HostedWorldStatusPush.OfflinePlayer.Builder setUnknownFields(UnknownFieldSet var1) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.setUnknownFields(var1);
         }

         public final HostedWorldStatusPush.OfflinePlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (HostedWorldStatusPush.OfflinePlayer.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface OfflinePlayerOrBuilder extends MessageOrBuilder {
      boolean hasPlayer();

      UuidAndUsername getPlayer();

      UuidAndUsernameOrBuilder getPlayerOrBuilder();

      boolean hasLastOnline();

      Timestamp getLastOnline();

      TimestampOrBuilder getLastOnlineOrBuilder();
   }

   public static final class OnlinePlayer extends GeneratedMessageV3 implements HostedWorldStatusPush.OnlinePlayerOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYER_FIELD_NUMBER = 1;
      private UuidAndUsername player_;
      public static final int ROLE_FIELD_NUMBER = 2;
      private int role_ = 0;
      public static final int LOGO_COLOR_FIELD_NUMBER = 3;
      private Color logoColor_;
      public static final int PLUS_COLOR_FIELD_NUMBER = 4;
      private Color plusColor_;
      private byte memoizedIsInitialized = -1;
      private static final HostedWorldStatusPush.OnlinePlayer DEFAULT_INSTANCE = new HostedWorldStatusPush.OnlinePlayer();
      private static final Parser<HostedWorldStatusPush.OnlinePlayer> PARSER = new AbstractParser<HostedWorldStatusPush.OnlinePlayer>() {
         public HostedWorldStatusPush.OnlinePlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            HostedWorldStatusPush.OnlinePlayer.Builder var3 = HostedWorldStatusPush.OnlinePlayer.newBuilder();

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

      private OnlinePlayer(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private OnlinePlayer() {
         this.role_ = 0;
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new HostedWorldStatusPush.OnlinePlayer();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HostedWorldStatusPush.OnlinePlayer.class, HostedWorldStatusPush.OnlinePlayer.Builder.class);
      }

      @Override
      public boolean hasPlayer() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getPlayer() {
         return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
      }

      @Override
      public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
         return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
      }

      @Override
      public int getRoleValue() {
         return this.role_;
      }

      @Override
      public Role getRole() {
         Role var1 = Role.forNumber(this.role_);
         return var1 == null ? Role.UNRECOGNIZED : var1;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getLogoColor() {
         return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
      }

      @Override
      public ColorOrBuilder getLogoColorOrBuilder() {
         return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
      }

      @Override
      public boolean hasPlusColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getPlusColor() {
         return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
      }

      @Override
      public ColorOrBuilder getPlusColorOrBuilder() {
         return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
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
            var1.writeMessage(1, this.getPlayer());
         }

         if (this.role_ != Role.ROLE_UNSPECIFIED.getNumber()) {
            var1.writeEnum(2, this.role_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(3, this.getLogoColor());
         }

         if ((this.bitField0_ & 4) != 0) {
            var1.writeMessage(4, this.getPlusColor());
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getPlayer());
         }

         if (this.role_ != Role.ROLE_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(2, this.role_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(3, this.getLogoColor());
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeMessageSize(4, this.getPlusColor());
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof HostedWorldStatusPush.OnlinePlayer)) {
            return super.equals(var1);
         } else {
            HostedWorldStatusPush.OnlinePlayer var2 = (HostedWorldStatusPush.OnlinePlayer)var1;
            if (this.hasPlayer() != var2.hasPlayer()) {
               return false;
            } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
               return false;
            } else if (this.role_ != var2.role_) {
               return false;
            } else if (this.hasLogoColor() != var2.hasLogoColor()) {
               return false;
            } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
               return false;
            } else if (this.hasPlusColor() != var2.hasPlusColor()) {
               return false;
            } else {
               return this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasPlayer()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getPlayer().hashCode();
         }

         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.role_;
         if (this.hasLogoColor()) {
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getLogoColor().hashCode();
         }

         if (this.hasPlusColor()) {
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getPlusColor().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static HostedWorldStatusPush.OnlinePlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public HostedWorldStatusPush.OnlinePlayer.Builder newBuilderForType() {
         return newBuilder();
      }

      public static HostedWorldStatusPush.OnlinePlayer.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static HostedWorldStatusPush.OnlinePlayer.Builder newBuilder(HostedWorldStatusPush.OnlinePlayer var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public HostedWorldStatusPush.OnlinePlayer.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new HostedWorldStatusPush.OnlinePlayer.Builder() : new HostedWorldStatusPush.OnlinePlayer.Builder().mergeFrom(this);
      }

      protected HostedWorldStatusPush.OnlinePlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new HostedWorldStatusPush.OnlinePlayer.Builder(var1);
      }

      public static HostedWorldStatusPush.OnlinePlayer getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HostedWorldStatusPush.OnlinePlayer> parser() {
         return PARSER;
      }

      @Override
      public Parser<HostedWorldStatusPush.OnlinePlayer> getParserForType() {
         return PARSER;
      }

      public HostedWorldStatusPush.OnlinePlayer getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<HostedWorldStatusPush.OnlinePlayer.Builder>
         implements HostedWorldStatusPush.OnlinePlayerOrBuilder {
         private int bitField0_;
         private UuidAndUsername player_;
         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
         private int role_ = 0;
         private Color logoColor_;
         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
         private Color plusColor_;
         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_fieldAccessorTable
               .ensureFieldAccessorsInitialized(HostedWorldStatusPush.OnlinePlayer.class, HostedWorldStatusPush.OnlinePlayer.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HostedWorldStatusPush.OnlinePlayer.alwaysUseFieldBuilders) {
               this.getPlayerFieldBuilder();
               this.getLogoColorFieldBuilder();
               this.getPlusColorFieldBuilder();
            }
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.player_ = null;
            if (this.playerBuilder_ != null) {
               this.playerBuilder_.dispose();
               this.playerBuilder_ = null;
            }

            this.role_ = 0;
            this.logoColor_ = null;
            if (this.logoColorBuilder_ != null) {
               this.logoColorBuilder_.dispose();
               this.logoColorBuilder_ = null;
            }

            this.plusColor_ = null;
            if (this.plusColorBuilder_ != null) {
               this.plusColorBuilder_.dispose();
               this.plusColorBuilder_ = null;
            }

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldStatusPush_OnlinePlayer_descriptor;
         }

         public HostedWorldStatusPush.OnlinePlayer getDefaultInstanceForType() {
            return HostedWorldStatusPush.OnlinePlayer.getDefaultInstance();
         }

         public HostedWorldStatusPush.OnlinePlayer build() {
            HostedWorldStatusPush.OnlinePlayer var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public HostedWorldStatusPush.OnlinePlayer buildPartial() {
            HostedWorldStatusPush.OnlinePlayer var1 = new HostedWorldStatusPush.OnlinePlayer(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(HostedWorldStatusPush.OnlinePlayer var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.role_ = this.role_;
            }

            if ((var2 & 4) != 0) {
               var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
               var3 |= 2;
            }

            if ((var2 & 8) != 0) {
               var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
               var3 |= 4;
            }

            HostedWorldStatusPush.OnlinePlayer var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clone() {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.clone();
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.setField(var1, var2);
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.clearField(var1);
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.clearOneof(var1);
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.addRepeatedField(var1, var2);
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder mergeFrom(Message var1) {
            if (var1 instanceof HostedWorldStatusPush.OnlinePlayer) {
               return this.mergeFrom((HostedWorldStatusPush.OnlinePlayer)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder mergeFrom(HostedWorldStatusPush.OnlinePlayer var1) {
            if (var1 == HostedWorldStatusPush.OnlinePlayer.getDefaultInstance()) {
               return this;
            }

            if (var1.hasPlayer()) {
               this.mergePlayer(var1.getPlayer());
            }

            if (var1.role_ != 0) {
               this.setRoleValue(var1.getRoleValue());
            }

            if (var1.hasLogoColor()) {
               this.mergeLogoColor(var1.getLogoColor());
            }

            if (var1.hasPlusColor()) {
               this.mergePlusColor(var1.getPlusColor());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getPlayerFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.role_ = var1.readEnum();
                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 4;
                        break;
                     case 34:
                        var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 8;
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
         public boolean hasPlayer() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public UuidAndUsername getPlayer() {
            if (this.playerBuilder_ == null) {
               return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
            } else {
               return this.playerBuilder_.getMessage();
            }
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setPlayer(UuidAndUsername var1) {
            if (this.playerBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.player_ = var1;
            } else {
               this.playerBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setPlayer(UuidAndUsername.Builder var1) {
            if (this.playerBuilder_ == null) {
               this.player_ = var1.build();
            } else {
               this.playerBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder mergePlayer(UuidAndUsername var1) {
            if (this.playerBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.player_ != null && this.player_ != UuidAndUsername.getDefaultInstance()) {
                  this.getPlayerBuilder().mergeFrom(var1);
               } else {
                  this.player_ = var1;
               }
            } else {
               this.playerBuilder_.mergeFrom(var1);
            }

            if (this.player_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clearPlayer() {
            this.bitField0_ &= -2;
            this.player_ = null;
            if (this.playerBuilder_ != null) {
               this.playerBuilder_.dispose();
               this.playerBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public UuidAndUsername.Builder getPlayerBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getPlayerFieldBuilder().getBuilder();
         }

         @Override
         public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
            if (this.playerBuilder_ != null) {
               return this.playerBuilder_.getMessageOrBuilder();
            } else {
               return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
            }
         }

         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getPlayerFieldBuilder() {
            if (this.playerBuilder_ == null) {
               this.playerBuilder_ = new SingleFieldBuilderV3<>(this.getPlayer(), this.getParentForChildren(), this.isClean());
               this.player_ = null;
            }

            return this.playerBuilder_;
         }

         @Override
         public int getRoleValue() {
            return this.role_;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setRoleValue(int var1) {
            this.role_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         @Override
         public Role getRole() {
            Role var1 = Role.forNumber(this.role_);
            return var1 == null ? Role.UNRECOGNIZED : var1;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setRole(Role var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 2;
            this.role_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clearRole() {
            this.bitField0_ &= -3;
            this.role_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasLogoColor() {
            return (this.bitField0_ & 4) != 0;
         }

         @Override
         public Color getLogoColor() {
            if (this.logoColorBuilder_ == null) {
               return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
            } else {
               return this.logoColorBuilder_.getMessage();
            }
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setLogoColor(Color var1) {
            if (this.logoColorBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.logoColor_ = var1;
            } else {
               this.logoColorBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setLogoColor(Color.Builder var1) {
            if (this.logoColorBuilder_ == null) {
               this.logoColor_ = var1.build();
            } else {
               this.logoColorBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder mergeLogoColor(Color var1) {
            if (this.logoColorBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
                  this.getLogoColorBuilder().mergeFrom(var1);
               } else {
                  this.logoColor_ = var1;
               }
            } else {
               this.logoColorBuilder_.mergeFrom(var1);
            }

            if (this.logoColor_ != null) {
               this.bitField0_ |= 4;
               this.onChanged();
            }

            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clearLogoColor() {
            this.bitField0_ &= -5;
            this.logoColor_ = null;
            if (this.logoColorBuilder_ != null) {
               this.logoColorBuilder_.dispose();
               this.logoColorBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Color.Builder getLogoColorBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return this.getLogoColorFieldBuilder().getBuilder();
         }

         @Override
         public ColorOrBuilder getLogoColorOrBuilder() {
            if (this.logoColorBuilder_ != null) {
               return this.logoColorBuilder_.getMessageOrBuilder();
            } else {
               return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
            }
         }

         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getLogoColorFieldBuilder() {
            if (this.logoColorBuilder_ == null) {
               this.logoColorBuilder_ = new SingleFieldBuilderV3<>(this.getLogoColor(), this.getParentForChildren(), this.isClean());
               this.logoColor_ = null;
            }

            return this.logoColorBuilder_;
         }

         @Override
         public boolean hasPlusColor() {
            return (this.bitField0_ & 8) != 0;
         }

         @Override
         public Color getPlusColor() {
            if (this.plusColorBuilder_ == null) {
               return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
            } else {
               return this.plusColorBuilder_.getMessage();
            }
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setPlusColor(Color var1) {
            if (this.plusColorBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.plusColor_ = var1;
            } else {
               this.plusColorBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder setPlusColor(Color.Builder var1) {
            if (this.plusColorBuilder_ == null) {
               this.plusColor_ = var1.build();
            } else {
               this.plusColorBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder mergePlusColor(Color var1) {
            if (this.plusColorBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
                  this.getPlusColorBuilder().mergeFrom(var1);
               } else {
                  this.plusColor_ = var1;
               }
            } else {
               this.plusColorBuilder_.mergeFrom(var1);
            }

            if (this.plusColor_ != null) {
               this.bitField0_ |= 8;
               this.onChanged();
            }

            return this;
         }

         public HostedWorldStatusPush.OnlinePlayer.Builder clearPlusColor() {
            this.bitField0_ &= -9;
            this.plusColor_ = null;
            if (this.plusColorBuilder_ != null) {
               this.plusColorBuilder_.dispose();
               this.plusColorBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Color.Builder getPlusColorBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return this.getPlusColorFieldBuilder().getBuilder();
         }

         @Override
         public ColorOrBuilder getPlusColorOrBuilder() {
            if (this.plusColorBuilder_ != null) {
               return this.plusColorBuilder_.getMessageOrBuilder();
            } else {
               return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
            }
         }

         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlusColorFieldBuilder() {
            if (this.plusColorBuilder_ == null) {
               this.plusColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlusColor(), this.getParentForChildren(), this.isClean());
               this.plusColor_ = null;
            }

            return this.plusColorBuilder_;
         }

         public final HostedWorldStatusPush.OnlinePlayer.Builder setUnknownFields(UnknownFieldSet var1) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.setUnknownFields(var1);
         }

         public final HostedWorldStatusPush.OnlinePlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (HostedWorldStatusPush.OnlinePlayer.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface OnlinePlayerOrBuilder extends MessageOrBuilder {
      boolean hasPlayer();

      UuidAndUsername getPlayer();

      UuidAndUsernameOrBuilder getPlayerOrBuilder();

      int getRoleValue();

      Role getRole();

      boolean hasLogoColor();

      Color getLogoColor();

      ColorOrBuilder getLogoColorOrBuilder();

      boolean hasPlusColor();

      Color getPlusColor();

      ColorOrBuilder getPlusColorOrBuilder();
   }
}
