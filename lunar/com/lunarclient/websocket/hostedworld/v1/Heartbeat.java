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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Heartbeat extends GeneratedMessageV3 implements HeartbeatOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ALLOWED_JOIN_SOURCES_FIELD_NUMBER = 1;
   private List<Integer> allowedJoinSources_;
   private static final Internal.ListAdapter.Converter<Integer, JoinSource> allowedJoinSources_converter_ = new Internal.ListAdapter.Converter<Integer, JoinSource>() {
      public JoinSource convert(Integer var1) {
         JoinSource var2 = JoinSource.forNumber(var1);
         return var2 == null ? JoinSource.UNRECOGNIZED : var2;
      }
   };
   private int allowedJoinSourcesMemoizedSerializedSize;
   public static final int MAX_PLAYERS_FIELD_NUMBER = 2;
   private int maxPlayers_ = 0;
   public static final int WHITELISTED_UUIDS_FIELD_NUMBER = 3;
   private List<Uuid> whitelistedUuids_;
   public static final int ONLINE_PLAYERS_FIELD_NUMBER = 4;
   private List<Heartbeat.OnlinePlayer> onlinePlayers_;
   public static final int OFFLINE_PLAYERS_FIELD_NUMBER = 5;
   private List<Heartbeat.OfflinePlayer> offlinePlayers_;
   public static final int PING_RESPONSES_FIELD_NUMBER = 6;
   private List<PingResponse> pingResponses_;
   private byte memoizedIsInitialized = -1;
   private static final Heartbeat DEFAULT_INSTANCE = new Heartbeat();
   private static final Parser<Heartbeat> PARSER = new AbstractParser<Heartbeat>() {
      public Heartbeat parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Heartbeat.Builder var3 = Heartbeat.newBuilder();

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

   private Heartbeat(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Heartbeat() {
      this.allowedJoinSources_ = Collections.emptyList();
      this.whitelistedUuids_ = Collections.emptyList();
      this.onlinePlayers_ = Collections.emptyList();
      this.offlinePlayers_ = Collections.emptyList();
      this.pingResponses_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Heartbeat();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Heartbeat.class, Heartbeat.Builder.class);
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
   public List<Uuid> getWhitelistedUuidsList() {
      return this.whitelistedUuids_;
   }

   @Override
   public List<? extends UuidOrBuilder> getWhitelistedUuidsOrBuilderList() {
      return this.whitelistedUuids_;
   }

   @Override
   public int getWhitelistedUuidsCount() {
      return this.whitelistedUuids_.size();
   }

   @Override
   public Uuid getWhitelistedUuids(int var1) {
      return this.whitelistedUuids_.get(var1);
   }

   @Override
   public UuidOrBuilder getWhitelistedUuidsOrBuilder(int var1) {
      return this.whitelistedUuids_.get(var1);
   }

   @Override
   public List<Heartbeat.OnlinePlayer> getOnlinePlayersList() {
      return this.onlinePlayers_;
   }

   @Override
   public List<? extends Heartbeat.OnlinePlayerOrBuilder> getOnlinePlayersOrBuilderList() {
      return this.onlinePlayers_;
   }

   @Override
   public int getOnlinePlayersCount() {
      return this.onlinePlayers_.size();
   }

   @Override
   public Heartbeat.OnlinePlayer getOnlinePlayers(int var1) {
      return this.onlinePlayers_.get(var1);
   }

   @Override
   public Heartbeat.OnlinePlayerOrBuilder getOnlinePlayersOrBuilder(int var1) {
      return this.onlinePlayers_.get(var1);
   }

   @Override
   public List<Heartbeat.OfflinePlayer> getOfflinePlayersList() {
      return this.offlinePlayers_;
   }

   @Override
   public List<? extends Heartbeat.OfflinePlayerOrBuilder> getOfflinePlayersOrBuilderList() {
      return this.offlinePlayers_;
   }

   @Override
   public int getOfflinePlayersCount() {
      return this.offlinePlayers_.size();
   }

   @Override
   public Heartbeat.OfflinePlayer getOfflinePlayers(int var1) {
      return this.offlinePlayers_.get(var1);
   }

   @Override
   public Heartbeat.OfflinePlayerOrBuilder getOfflinePlayersOrBuilder(int var1) {
      return this.offlinePlayers_.get(var1);
   }

   @Override
   public List<PingResponse> getPingResponsesList() {
      return this.pingResponses_;
   }

   @Override
   public List<? extends PingResponseOrBuilder> getPingResponsesOrBuilderList() {
      return this.pingResponses_;
   }

   @Override
   public int getPingResponsesCount() {
      return this.pingResponses_.size();
   }

   @Override
   public PingResponse getPingResponses(int var1) {
      return this.pingResponses_.get(var1);
   }

   @Override
   public PingResponseOrBuilder getPingResponsesOrBuilder(int var1) {
      return this.pingResponses_.get(var1);
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
      if (this.getAllowedJoinSourcesList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.allowedJoinSourcesMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.allowedJoinSources_.size(); var2++) {
         var1.writeEnumNoTag(this.allowedJoinSources_.get(var2));
      }

      if (this.maxPlayers_ != 0) {
         var1.writeInt32(2, this.maxPlayers_);
      }

      for (int var3 = 0; var3 < this.whitelistedUuids_.size(); var3++) {
         var1.writeMessage(3, this.whitelistedUuids_.get(var3));
      }

      for (int var4 = 0; var4 < this.onlinePlayers_.size(); var4++) {
         var1.writeMessage(4, this.onlinePlayers_.get(var4));
      }

      for (int var5 = 0; var5 < this.offlinePlayers_.size(); var5++) {
         var1.writeMessage(5, this.offlinePlayers_.get(var5));
      }

      for (int var6 = 0; var6 < this.pingResponses_.size(); var6++) {
         var1.writeMessage(6, this.pingResponses_.get(var6));
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

      for (int var3 = 0; var3 < this.allowedJoinSources_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.allowedJoinSources_.get(var3));
      }

      var4 += var2;
      if (!this.getAllowedJoinSourcesList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.allowedJoinSourcesMemoizedSerializedSize = var2;
      if (this.maxPlayers_ != 0) {
         var4 += CodedOutputStream.computeInt32Size(2, this.maxPlayers_);
      }

      for (int var8 = 0; var8 < this.whitelistedUuids_.size(); var8++) {
         var4 += CodedOutputStream.computeMessageSize(3, this.whitelistedUuids_.get(var8));
      }

      for (int var9 = 0; var9 < this.onlinePlayers_.size(); var9++) {
         var4 += CodedOutputStream.computeMessageSize(4, this.onlinePlayers_.get(var9));
      }

      for (int var10 = 0; var10 < this.offlinePlayers_.size(); var10++) {
         var4 += CodedOutputStream.computeMessageSize(5, this.offlinePlayers_.get(var10));
      }

      for (int var11 = 0; var11 < this.pingResponses_.size(); var11++) {
         var4 += CodedOutputStream.computeMessageSize(6, this.pingResponses_.get(var11));
      }

      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Heartbeat)) {
         return super.equals(var1);
      } else {
         Heartbeat var2 = (Heartbeat)var1;
         if (!this.allowedJoinSources_.equals(var2.allowedJoinSources_)) {
            return false;
         } else if (this.getMaxPlayers() != var2.getMaxPlayers()) {
            return false;
         } else if (!this.getWhitelistedUuidsList().equals(var2.getWhitelistedUuidsList())) {
            return false;
         } else if (!this.getOnlinePlayersList().equals(var2.getOnlinePlayersList())) {
            return false;
         } else if (!this.getOfflinePlayersList().equals(var2.getOfflinePlayersList())) {
            return false;
         } else {
            return !this.getPingResponsesList().equals(var2.getPingResponsesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getAllowedJoinSourcesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.allowedJoinSources_.hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getMaxPlayers();
      if (this.getWhitelistedUuidsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getWhitelistedUuidsList().hashCode();
      }

      if (this.getOnlinePlayersCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getOnlinePlayersList().hashCode();
      }

      if (this.getOfflinePlayersCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getOfflinePlayersList().hashCode();
      }

      if (this.getPingResponsesCount() > 0) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getPingResponsesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Heartbeat parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Heartbeat parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Heartbeat parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Heartbeat parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Heartbeat parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Heartbeat parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Heartbeat parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Heartbeat parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Heartbeat parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Heartbeat parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Heartbeat parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Heartbeat parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Heartbeat.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Heartbeat.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Heartbeat.Builder newBuilder(Heartbeat var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Heartbeat.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Heartbeat.Builder() : new Heartbeat.Builder().mergeFrom(this);
   }

   protected Heartbeat.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Heartbeat.Builder(var1);
   }

   public static Heartbeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Heartbeat> parser() {
      return PARSER;
   }

   @Override
   public Parser<Heartbeat> getParserForType() {
      return PARSER;
   }

   public Heartbeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Heartbeat.Builder> implements HeartbeatOrBuilder {
      private int bitField0_;
      private List<Integer> allowedJoinSources_ = Collections.emptyList();
      private int maxPlayers_;
      private List<Uuid> whitelistedUuids_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> whitelistedUuidsBuilder_;
      private List<Heartbeat.OnlinePlayer> onlinePlayers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Heartbeat.OnlinePlayer, Heartbeat.OnlinePlayer.Builder, Heartbeat.OnlinePlayerOrBuilder> onlinePlayersBuilder_;
      private List<Heartbeat.OfflinePlayer> offlinePlayers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Heartbeat.OfflinePlayer, Heartbeat.OfflinePlayer.Builder, Heartbeat.OfflinePlayerOrBuilder> offlinePlayersBuilder_;
      private List<PingResponse> pingResponses_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PingResponse, PingResponse.Builder, PingResponseOrBuilder> pingResponsesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Heartbeat.class, Heartbeat.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Heartbeat.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.allowedJoinSources_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.maxPlayers_ = 0;
         if (this.whitelistedUuidsBuilder_ == null) {
            this.whitelistedUuids_ = Collections.emptyList();
         } else {
            this.whitelistedUuids_ = null;
            this.whitelistedUuidsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         if (this.onlinePlayersBuilder_ == null) {
            this.onlinePlayers_ = Collections.emptyList();
         } else {
            this.onlinePlayers_ = null;
            this.onlinePlayersBuilder_.clear();
         }

         this.bitField0_ &= -9;
         if (this.offlinePlayersBuilder_ == null) {
            this.offlinePlayers_ = Collections.emptyList();
         } else {
            this.offlinePlayers_ = null;
            this.offlinePlayersBuilder_.clear();
         }

         this.bitField0_ &= -17;
         if (this.pingResponsesBuilder_ == null) {
            this.pingResponses_ = Collections.emptyList();
         } else {
            this.pingResponses_ = null;
            this.pingResponsesBuilder_.clear();
         }

         this.bitField0_ &= -33;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_descriptor;
      }

      public Heartbeat getDefaultInstanceForType() {
         return Heartbeat.getDefaultInstance();
      }

      public Heartbeat build() {
         Heartbeat var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Heartbeat buildPartial() {
         Heartbeat var1 = new Heartbeat(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(Heartbeat var1) {
         if ((this.bitField0_ & 1) != 0) {
            this.allowedJoinSources_ = Collections.unmodifiableList(this.allowedJoinSources_);
            this.bitField0_ &= -2;
         }

         var1.allowedJoinSources_ = this.allowedJoinSources_;
         if (this.whitelistedUuidsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.whitelistedUuids_ = Collections.unmodifiableList(this.whitelistedUuids_);
               this.bitField0_ &= -5;
            }

            var1.whitelistedUuids_ = this.whitelistedUuids_;
         } else {
            var1.whitelistedUuids_ = this.whitelistedUuidsBuilder_.build();
         }

         if (this.onlinePlayersBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.onlinePlayers_ = Collections.unmodifiableList(this.onlinePlayers_);
               this.bitField0_ &= -9;
            }

            var1.onlinePlayers_ = this.onlinePlayers_;
         } else {
            var1.onlinePlayers_ = this.onlinePlayersBuilder_.build();
         }

         if (this.offlinePlayersBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0) {
               this.offlinePlayers_ = Collections.unmodifiableList(this.offlinePlayers_);
               this.bitField0_ &= -17;
            }

            var1.offlinePlayers_ = this.offlinePlayers_;
         } else {
            var1.offlinePlayers_ = this.offlinePlayersBuilder_.build();
         }

         if (this.pingResponsesBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0) {
               this.pingResponses_ = Collections.unmodifiableList(this.pingResponses_);
               this.bitField0_ &= -33;
            }

            var1.pingResponses_ = this.pingResponses_;
         } else {
            var1.pingResponses_ = this.pingResponsesBuilder_.build();
         }
      }

      private void buildPartial0(Heartbeat var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.maxPlayers_ = this.maxPlayers_;
         }
      }

      public Heartbeat.Builder clone() {
         return (Heartbeat.Builder)super.clone();
      }

      public Heartbeat.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Heartbeat.Builder)super.setField(var1, var2);
      }

      public Heartbeat.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Heartbeat.Builder)super.clearField(var1);
      }

      public Heartbeat.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Heartbeat.Builder)super.clearOneof(var1);
      }

      public Heartbeat.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Heartbeat.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Heartbeat.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Heartbeat.Builder)super.addRepeatedField(var1, var2);
      }

      public Heartbeat.Builder mergeFrom(Message var1) {
         if (var1 instanceof Heartbeat) {
            return this.mergeFrom((Heartbeat)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Heartbeat.Builder mergeFrom(Heartbeat var1) {
         if (var1 == Heartbeat.getDefaultInstance()) {
            return this;
         }

         if (!var1.allowedJoinSources_.isEmpty()) {
            if (this.allowedJoinSources_.isEmpty()) {
               this.allowedJoinSources_ = var1.allowedJoinSources_;
               this.bitField0_ &= -2;
            } else {
               this.ensureAllowedJoinSourcesIsMutable();
               this.allowedJoinSources_.addAll(var1.allowedJoinSources_);
            }

            this.onChanged();
         }

         if (var1.getMaxPlayers() != 0) {
            this.setMaxPlayers(var1.getMaxPlayers());
         }

         if (this.whitelistedUuidsBuilder_ == null) {
            if (!var1.whitelistedUuids_.isEmpty()) {
               if (this.whitelistedUuids_.isEmpty()) {
                  this.whitelistedUuids_ = var1.whitelistedUuids_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureWhitelistedUuidsIsMutable();
                  this.whitelistedUuids_.addAll(var1.whitelistedUuids_);
               }

               this.onChanged();
            }
         } else if (!var1.whitelistedUuids_.isEmpty()) {
            if (this.whitelistedUuidsBuilder_.isEmpty()) {
               this.whitelistedUuidsBuilder_.dispose();
               this.whitelistedUuidsBuilder_ = null;
               this.whitelistedUuids_ = var1.whitelistedUuids_;
               this.bitField0_ &= -5;
               this.whitelistedUuidsBuilder_ = Heartbeat.alwaysUseFieldBuilders ? this.getWhitelistedUuidsFieldBuilder() : null;
            } else {
               this.whitelistedUuidsBuilder_.addAllMessages(var1.whitelistedUuids_);
            }
         }

         if (this.onlinePlayersBuilder_ == null) {
            if (!var1.onlinePlayers_.isEmpty()) {
               if (this.onlinePlayers_.isEmpty()) {
                  this.onlinePlayers_ = var1.onlinePlayers_;
                  this.bitField0_ &= -9;
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
               this.bitField0_ &= -9;
               this.onlinePlayersBuilder_ = Heartbeat.alwaysUseFieldBuilders ? this.getOnlinePlayersFieldBuilder() : null;
            } else {
               this.onlinePlayersBuilder_.addAllMessages(var1.onlinePlayers_);
            }
         }

         if (this.offlinePlayersBuilder_ == null) {
            if (!var1.offlinePlayers_.isEmpty()) {
               if (this.offlinePlayers_.isEmpty()) {
                  this.offlinePlayers_ = var1.offlinePlayers_;
                  this.bitField0_ &= -17;
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
               this.bitField0_ &= -17;
               this.offlinePlayersBuilder_ = Heartbeat.alwaysUseFieldBuilders ? this.getOfflinePlayersFieldBuilder() : null;
            } else {
               this.offlinePlayersBuilder_.addAllMessages(var1.offlinePlayers_);
            }
         }

         if (this.pingResponsesBuilder_ == null) {
            if (!var1.pingResponses_.isEmpty()) {
               if (this.pingResponses_.isEmpty()) {
                  this.pingResponses_ = var1.pingResponses_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensurePingResponsesIsMutable();
                  this.pingResponses_.addAll(var1.pingResponses_);
               }

               this.onChanged();
            }
         } else if (!var1.pingResponses_.isEmpty()) {
            if (this.pingResponsesBuilder_.isEmpty()) {
               this.pingResponsesBuilder_.dispose();
               this.pingResponsesBuilder_ = null;
               this.pingResponses_ = var1.pingResponses_;
               this.bitField0_ &= -33;
               this.pingResponsesBuilder_ = Heartbeat.alwaysUseFieldBuilders ? this.getPingResponsesFieldBuilder() : null;
            } else {
               this.pingResponsesBuilder_.addAllMessages(var1.pingResponses_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Heartbeat.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     int var17 = var1.readEnum();
                     this.ensureAllowedJoinSourcesIsMutable();
                     this.allowedJoinSources_.add(var17);
                     break;
                  case 10:
                     int var16 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var16);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureAllowedJoinSourcesIsMutable();
                        this.allowedJoinSources_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  case 16:
                     this.maxPlayers_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     Uuid var15 = var1.readMessage(Uuid.parser(), var2);
                     if (this.whitelistedUuidsBuilder_ == null) {
                        this.ensureWhitelistedUuidsIsMutable();
                        this.whitelistedUuids_.add(var15);
                     } else {
                        this.whitelistedUuidsBuilder_.addMessage(var15);
                     }
                     break;
                  case 34:
                     Heartbeat.OnlinePlayer var14 = var1.readMessage(Heartbeat.OnlinePlayer.parser(), var2);
                     if (this.onlinePlayersBuilder_ == null) {
                        this.ensureOnlinePlayersIsMutable();
                        this.onlinePlayers_.add(var14);
                     } else {
                        this.onlinePlayersBuilder_.addMessage(var14);
                     }
                     break;
                  case 42:
                     Heartbeat.OfflinePlayer var13 = var1.readMessage(Heartbeat.OfflinePlayer.parser(), var2);
                     if (this.offlinePlayersBuilder_ == null) {
                        this.ensureOfflinePlayersIsMutable();
                        this.offlinePlayers_.add(var13);
                     } else {
                        this.offlinePlayersBuilder_.addMessage(var13);
                     }
                     break;
                  case 50:
                     PingResponse var5 = var1.readMessage(PingResponse.parser(), var2);
                     if (this.pingResponsesBuilder_ == null) {
                        this.ensurePingResponsesIsMutable();
                        this.pingResponses_.add(var5);
                     } else {
                        this.pingResponsesBuilder_.addMessage(var5);
                     }
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

      private void ensureAllowedJoinSourcesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.allowedJoinSources_ = new ArrayList<>(this.allowedJoinSources_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<JoinSource> getAllowedJoinSourcesList() {
         return new Internal.ListAdapter<>(this.allowedJoinSources_, Heartbeat.allowedJoinSources_converter_);
      }

      @Override
      public int getAllowedJoinSourcesCount() {
         return this.allowedJoinSources_.size();
      }

      @Override
      public JoinSource getAllowedJoinSources(int var1) {
         return Heartbeat.allowedJoinSources_converter_.convert(this.allowedJoinSources_.get(var1));
      }

      public Heartbeat.Builder setAllowedJoinSources(int var1, JoinSource var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public Heartbeat.Builder addAllowedJoinSources(JoinSource var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public Heartbeat.Builder addAllAllowedJoinSources(Iterable<? extends JoinSource> var1) {
         this.ensureAllowedJoinSourcesIsMutable();

         for (JoinSource var3 : var1) {
            this.allowedJoinSources_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public Heartbeat.Builder clearAllowedJoinSources() {
         this.allowedJoinSources_ = Collections.emptyList();
         this.bitField0_ &= -2;
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

      public Heartbeat.Builder setAllowedJoinSourcesValue(int var1, int var2) {
         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public Heartbeat.Builder addAllowedJoinSourcesValue(int var1) {
         this.ensureAllowedJoinSourcesIsMutable();
         this.allowedJoinSources_.add(var1);
         this.onChanged();
         return this;
      }

      public Heartbeat.Builder addAllAllowedJoinSourcesValue(Iterable<Integer> var1) {
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

      public Heartbeat.Builder setMaxPlayers(int var1) {
         this.maxPlayers_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Heartbeat.Builder clearMaxPlayers() {
         this.bitField0_ &= -3;
         this.maxPlayers_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureWhitelistedUuidsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.whitelistedUuids_ = new ArrayList<>(this.whitelistedUuids_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<Uuid> getWhitelistedUuidsList() {
         return this.whitelistedUuidsBuilder_ == null ? Collections.unmodifiableList(this.whitelistedUuids_) : this.whitelistedUuidsBuilder_.getMessageList();
      }

      @Override
      public int getWhitelistedUuidsCount() {
         return this.whitelistedUuidsBuilder_ == null ? this.whitelistedUuids_.size() : this.whitelistedUuidsBuilder_.getCount();
      }

      @Override
      public Uuid getWhitelistedUuids(int var1) {
         return this.whitelistedUuidsBuilder_ == null ? this.whitelistedUuids_.get(var1) : this.whitelistedUuidsBuilder_.getMessage(var1);
      }

      public Heartbeat.Builder setWhitelistedUuids(int var1, Uuid var2) {
         if (this.whitelistedUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.set(var1, var2);
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Heartbeat.Builder setWhitelistedUuids(int var1, Uuid.Builder var2) {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addWhitelistedUuids(Uuid var1) {
         if (this.whitelistedUuidsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.add(var1);
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.addMessage(var1);
         }

         return this;
      }

      public Heartbeat.Builder addWhitelistedUuids(int var1, Uuid var2) {
         if (this.whitelistedUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.add(var1, var2);
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Heartbeat.Builder addWhitelistedUuids(Uuid.Builder var1) {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.add(var1.build());
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Heartbeat.Builder addWhitelistedUuids(int var1, Uuid.Builder var2) {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addAllWhitelistedUuids(Iterable<? extends Uuid> var1) {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.ensureWhitelistedUuidsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.whitelistedUuids_);
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Heartbeat.Builder clearWhitelistedUuids() {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.whitelistedUuids_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.clear();
         }

         return this;
      }

      public Heartbeat.Builder removeWhitelistedUuids(int var1) {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.ensureWhitelistedUuidsIsMutable();
            this.whitelistedUuids_.remove(var1);
            this.onChanged();
         } else {
            this.whitelistedUuidsBuilder_.remove(var1);
         }

         return this;
      }

      public Uuid.Builder getWhitelistedUuidsBuilder(int var1) {
         return this.getWhitelistedUuidsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidOrBuilder getWhitelistedUuidsOrBuilder(int var1) {
         return this.whitelistedUuidsBuilder_ == null ? this.whitelistedUuids_.get(var1) : this.whitelistedUuidsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidOrBuilder> getWhitelistedUuidsOrBuilderList() {
         return this.whitelistedUuidsBuilder_ != null
            ? this.whitelistedUuidsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.whitelistedUuids_);
      }

      public Uuid.Builder addWhitelistedUuidsBuilder() {
         return this.getWhitelistedUuidsFieldBuilder().addBuilder(Uuid.getDefaultInstance());
      }

      public Uuid.Builder addWhitelistedUuidsBuilder(int var1) {
         return this.getWhitelistedUuidsFieldBuilder().addBuilder(var1, Uuid.getDefaultInstance());
      }

      public List<Uuid.Builder> getWhitelistedUuidsBuilderList() {
         return this.getWhitelistedUuidsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getWhitelistedUuidsFieldBuilder() {
         if (this.whitelistedUuidsBuilder_ == null) {
            this.whitelistedUuidsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.whitelistedUuids_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean()
            );
            this.whitelistedUuids_ = null;
         }

         return this.whitelistedUuidsBuilder_;
      }

      private void ensureOnlinePlayersIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.onlinePlayers_ = new ArrayList<>(this.onlinePlayers_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<Heartbeat.OnlinePlayer> getOnlinePlayersList() {
         return this.onlinePlayersBuilder_ == null ? Collections.unmodifiableList(this.onlinePlayers_) : this.onlinePlayersBuilder_.getMessageList();
      }

      @Override
      public int getOnlinePlayersCount() {
         return this.onlinePlayersBuilder_ == null ? this.onlinePlayers_.size() : this.onlinePlayersBuilder_.getCount();
      }

      @Override
      public Heartbeat.OnlinePlayer getOnlinePlayers(int var1) {
         return this.onlinePlayersBuilder_ == null ? this.onlinePlayers_.get(var1) : this.onlinePlayersBuilder_.getMessage(var1);
      }

      public Heartbeat.Builder setOnlinePlayers(int var1, Heartbeat.OnlinePlayer var2) {
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

      public Heartbeat.Builder setOnlinePlayers(int var1, Heartbeat.OnlinePlayer.Builder var2) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addOnlinePlayers(Heartbeat.OnlinePlayer var1) {
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

      public Heartbeat.Builder addOnlinePlayers(int var1, Heartbeat.OnlinePlayer var2) {
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

      public Heartbeat.Builder addOnlinePlayers(Heartbeat.OnlinePlayer.Builder var1) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.add(var1.build());
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Heartbeat.Builder addOnlinePlayers(int var1, Heartbeat.OnlinePlayer.Builder var2) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addAllOnlinePlayers(Iterable<? extends Heartbeat.OnlinePlayer> var1) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.onlinePlayers_);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Heartbeat.Builder clearOnlinePlayers() {
         if (this.onlinePlayersBuilder_ == null) {
            this.onlinePlayers_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.clear();
         }

         return this;
      }

      public Heartbeat.Builder removeOnlinePlayers(int var1) {
         if (this.onlinePlayersBuilder_ == null) {
            this.ensureOnlinePlayersIsMutable();
            this.onlinePlayers_.remove(var1);
            this.onChanged();
         } else {
            this.onlinePlayersBuilder_.remove(var1);
         }

         return this;
      }

      public Heartbeat.OnlinePlayer.Builder getOnlinePlayersBuilder(int var1) {
         return this.getOnlinePlayersFieldBuilder().getBuilder(var1);
      }

      @Override
      public Heartbeat.OnlinePlayerOrBuilder getOnlinePlayersOrBuilder(int var1) {
         return this.onlinePlayersBuilder_ == null ? this.onlinePlayers_.get(var1) : this.onlinePlayersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends Heartbeat.OnlinePlayerOrBuilder> getOnlinePlayersOrBuilderList() {
         return this.onlinePlayersBuilder_ != null ? this.onlinePlayersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.onlinePlayers_);
      }

      public Heartbeat.OnlinePlayer.Builder addOnlinePlayersBuilder() {
         return this.getOnlinePlayersFieldBuilder().addBuilder(Heartbeat.OnlinePlayer.getDefaultInstance());
      }

      public Heartbeat.OnlinePlayer.Builder addOnlinePlayersBuilder(int var1) {
         return this.getOnlinePlayersFieldBuilder().addBuilder(var1, Heartbeat.OnlinePlayer.getDefaultInstance());
      }

      public List<Heartbeat.OnlinePlayer.Builder> getOnlinePlayersBuilderList() {
         return this.getOnlinePlayersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Heartbeat.OnlinePlayer, Heartbeat.OnlinePlayer.Builder, Heartbeat.OnlinePlayerOrBuilder> getOnlinePlayersFieldBuilder() {
         if (this.onlinePlayersBuilder_ == null) {
            this.onlinePlayersBuilder_ = new RepeatedFieldBuilderV3<>(
               this.onlinePlayers_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
            );
            this.onlinePlayers_ = null;
         }

         return this.onlinePlayersBuilder_;
      }

      private void ensureOfflinePlayersIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.offlinePlayers_ = new ArrayList<>(this.offlinePlayers_);
            this.bitField0_ |= 16;
         }
      }

      @Override
      public List<Heartbeat.OfflinePlayer> getOfflinePlayersList() {
         return this.offlinePlayersBuilder_ == null ? Collections.unmodifiableList(this.offlinePlayers_) : this.offlinePlayersBuilder_.getMessageList();
      }

      @Override
      public int getOfflinePlayersCount() {
         return this.offlinePlayersBuilder_ == null ? this.offlinePlayers_.size() : this.offlinePlayersBuilder_.getCount();
      }

      @Override
      public Heartbeat.OfflinePlayer getOfflinePlayers(int var1) {
         return this.offlinePlayersBuilder_ == null ? this.offlinePlayers_.get(var1) : this.offlinePlayersBuilder_.getMessage(var1);
      }

      public Heartbeat.Builder setOfflinePlayers(int var1, Heartbeat.OfflinePlayer var2) {
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

      public Heartbeat.Builder setOfflinePlayers(int var1, Heartbeat.OfflinePlayer.Builder var2) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addOfflinePlayers(Heartbeat.OfflinePlayer var1) {
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

      public Heartbeat.Builder addOfflinePlayers(int var1, Heartbeat.OfflinePlayer var2) {
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

      public Heartbeat.Builder addOfflinePlayers(Heartbeat.OfflinePlayer.Builder var1) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.add(var1.build());
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Heartbeat.Builder addOfflinePlayers(int var1, Heartbeat.OfflinePlayer.Builder var2) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addAllOfflinePlayers(Iterable<? extends Heartbeat.OfflinePlayer> var1) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.offlinePlayers_);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Heartbeat.Builder clearOfflinePlayers() {
         if (this.offlinePlayersBuilder_ == null) {
            this.offlinePlayers_ = Collections.emptyList();
            this.bitField0_ &= -17;
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.clear();
         }

         return this;
      }

      public Heartbeat.Builder removeOfflinePlayers(int var1) {
         if (this.offlinePlayersBuilder_ == null) {
            this.ensureOfflinePlayersIsMutable();
            this.offlinePlayers_.remove(var1);
            this.onChanged();
         } else {
            this.offlinePlayersBuilder_.remove(var1);
         }

         return this;
      }

      public Heartbeat.OfflinePlayer.Builder getOfflinePlayersBuilder(int var1) {
         return this.getOfflinePlayersFieldBuilder().getBuilder(var1);
      }

      @Override
      public Heartbeat.OfflinePlayerOrBuilder getOfflinePlayersOrBuilder(int var1) {
         return this.offlinePlayersBuilder_ == null ? this.offlinePlayers_.get(var1) : this.offlinePlayersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends Heartbeat.OfflinePlayerOrBuilder> getOfflinePlayersOrBuilderList() {
         return this.offlinePlayersBuilder_ != null
            ? this.offlinePlayersBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.offlinePlayers_);
      }

      public Heartbeat.OfflinePlayer.Builder addOfflinePlayersBuilder() {
         return this.getOfflinePlayersFieldBuilder().addBuilder(Heartbeat.OfflinePlayer.getDefaultInstance());
      }

      public Heartbeat.OfflinePlayer.Builder addOfflinePlayersBuilder(int var1) {
         return this.getOfflinePlayersFieldBuilder().addBuilder(var1, Heartbeat.OfflinePlayer.getDefaultInstance());
      }

      public List<Heartbeat.OfflinePlayer.Builder> getOfflinePlayersBuilderList() {
         return this.getOfflinePlayersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Heartbeat.OfflinePlayer, Heartbeat.OfflinePlayer.Builder, Heartbeat.OfflinePlayerOrBuilder> getOfflinePlayersFieldBuilder() {
         if (this.offlinePlayersBuilder_ == null) {
            this.offlinePlayersBuilder_ = new RepeatedFieldBuilderV3<>(
               this.offlinePlayers_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean()
            );
            this.offlinePlayers_ = null;
         }

         return this.offlinePlayersBuilder_;
      }

      private void ensurePingResponsesIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.pingResponses_ = new ArrayList<>(this.pingResponses_);
            this.bitField0_ |= 32;
         }
      }

      @Override
      public List<PingResponse> getPingResponsesList() {
         return this.pingResponsesBuilder_ == null ? Collections.unmodifiableList(this.pingResponses_) : this.pingResponsesBuilder_.getMessageList();
      }

      @Override
      public int getPingResponsesCount() {
         return this.pingResponsesBuilder_ == null ? this.pingResponses_.size() : this.pingResponsesBuilder_.getCount();
      }

      @Override
      public PingResponse getPingResponses(int var1) {
         return this.pingResponsesBuilder_ == null ? this.pingResponses_.get(var1) : this.pingResponsesBuilder_.getMessage(var1);
      }

      public Heartbeat.Builder setPingResponses(int var1, PingResponse var2) {
         if (this.pingResponsesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingResponsesIsMutable();
            this.pingResponses_.set(var1, var2);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Heartbeat.Builder setPingResponses(int var1, PingResponse.Builder var2) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addPingResponses(PingResponse var1) {
         if (this.pingResponsesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1);
         }

         return this;
      }

      public Heartbeat.Builder addPingResponses(int var1, PingResponse var2) {
         if (this.pingResponsesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1, var2);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Heartbeat.Builder addPingResponses(PingResponse.Builder var1) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1.build());
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Heartbeat.Builder addPingResponses(int var1, PingResponse.Builder var2) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Heartbeat.Builder addAllPingResponses(Iterable<? extends PingResponse> var1) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.pingResponses_);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Heartbeat.Builder clearPingResponses() {
         if (this.pingResponsesBuilder_ == null) {
            this.pingResponses_ = Collections.emptyList();
            this.bitField0_ &= -33;
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.clear();
         }

         return this;
      }

      public Heartbeat.Builder removePingResponses(int var1) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.remove(var1);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.remove(var1);
         }

         return this;
      }

      public PingResponse.Builder getPingResponsesBuilder(int var1) {
         return this.getPingResponsesFieldBuilder().getBuilder(var1);
      }

      @Override
      public PingResponseOrBuilder getPingResponsesOrBuilder(int var1) {
         return this.pingResponsesBuilder_ == null ? this.pingResponses_.get(var1) : this.pingResponsesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PingResponseOrBuilder> getPingResponsesOrBuilderList() {
         return this.pingResponsesBuilder_ != null ? this.pingResponsesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pingResponses_);
      }

      public PingResponse.Builder addPingResponsesBuilder() {
         return this.getPingResponsesFieldBuilder().addBuilder(PingResponse.getDefaultInstance());
      }

      public PingResponse.Builder addPingResponsesBuilder(int var1) {
         return this.getPingResponsesFieldBuilder().addBuilder(var1, PingResponse.getDefaultInstance());
      }

      public List<PingResponse.Builder> getPingResponsesBuilderList() {
         return this.getPingResponsesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PingResponse, PingResponse.Builder, PingResponseOrBuilder> getPingResponsesFieldBuilder() {
         if (this.pingResponsesBuilder_ == null) {
            this.pingResponsesBuilder_ = new RepeatedFieldBuilderV3<>(
               this.pingResponses_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean()
            );
            this.pingResponses_ = null;
         }

         return this.pingResponsesBuilder_;
      }

      public final Heartbeat.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Heartbeat.Builder)super.setUnknownFields(var1);
      }

      public final Heartbeat.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Heartbeat.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class OfflinePlayer extends GeneratedMessageV3 implements Heartbeat.OfflinePlayerOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYER_FIELD_NUMBER = 1;
      private UuidAndUsername player_;
      public static final int LAST_ONLINE_FIELD_NUMBER = 2;
      private Timestamp lastOnline_;
      private byte memoizedIsInitialized = -1;
      private static final Heartbeat.OfflinePlayer DEFAULT_INSTANCE = new Heartbeat.OfflinePlayer();
      private static final Parser<Heartbeat.OfflinePlayer> PARSER = new AbstractParser<Heartbeat.OfflinePlayer>() {
         public Heartbeat.OfflinePlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            Heartbeat.OfflinePlayer.Builder var3 = Heartbeat.OfflinePlayer.newBuilder();

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
         return new Heartbeat.OfflinePlayer();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Heartbeat.OfflinePlayer.class, Heartbeat.OfflinePlayer.Builder.class);
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
         } else if (!(var1 instanceof Heartbeat.OfflinePlayer)) {
            return super.equals(var1);
         } else {
            Heartbeat.OfflinePlayer var2 = (Heartbeat.OfflinePlayer)var1;
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

      public static Heartbeat.OfflinePlayer parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static Heartbeat.OfflinePlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static Heartbeat.OfflinePlayer parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static Heartbeat.OfflinePlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static Heartbeat.OfflinePlayer parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static Heartbeat.OfflinePlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static Heartbeat.OfflinePlayer parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static Heartbeat.OfflinePlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static Heartbeat.OfflinePlayer parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static Heartbeat.OfflinePlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static Heartbeat.OfflinePlayer parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static Heartbeat.OfflinePlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public Heartbeat.OfflinePlayer.Builder newBuilderForType() {
         return newBuilder();
      }

      public static Heartbeat.OfflinePlayer.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Heartbeat.OfflinePlayer.Builder newBuilder(Heartbeat.OfflinePlayer var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public Heartbeat.OfflinePlayer.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Heartbeat.OfflinePlayer.Builder() : new Heartbeat.OfflinePlayer.Builder().mergeFrom(this);
      }

      protected Heartbeat.OfflinePlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new Heartbeat.OfflinePlayer.Builder(var1);
      }

      public static Heartbeat.OfflinePlayer getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Heartbeat.OfflinePlayer> parser() {
         return PARSER;
      }

      @Override
      public Parser<Heartbeat.OfflinePlayer> getParserForType() {
         return PARSER;
      }

      public Heartbeat.OfflinePlayer getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Heartbeat.OfflinePlayer.Builder> implements Heartbeat.OfflinePlayerOrBuilder {
         private int bitField0_;
         private UuidAndUsername player_;
         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
         private Timestamp lastOnline_;
         private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastOnlineBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_fieldAccessorTable
               .ensureFieldAccessorsInitialized(Heartbeat.OfflinePlayer.class, Heartbeat.OfflinePlayer.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (Heartbeat.OfflinePlayer.alwaysUseFieldBuilders) {
               this.getPlayerFieldBuilder();
               this.getLastOnlineFieldBuilder();
            }
         }

         public Heartbeat.OfflinePlayer.Builder clear() {
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
            return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OfflinePlayer_descriptor;
         }

         public Heartbeat.OfflinePlayer getDefaultInstanceForType() {
            return Heartbeat.OfflinePlayer.getDefaultInstance();
         }

         public Heartbeat.OfflinePlayer build() {
            Heartbeat.OfflinePlayer var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public Heartbeat.OfflinePlayer buildPartial() {
            Heartbeat.OfflinePlayer var1 = new Heartbeat.OfflinePlayer(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(Heartbeat.OfflinePlayer var1) {
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

            Heartbeat.OfflinePlayer var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public Heartbeat.OfflinePlayer.Builder clone() {
            return (Heartbeat.OfflinePlayer.Builder)super.clone();
         }

         public Heartbeat.OfflinePlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (Heartbeat.OfflinePlayer.Builder)super.setField(var1, var2);
         }

         public Heartbeat.OfflinePlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (Heartbeat.OfflinePlayer.Builder)super.clearField(var1);
         }

         public Heartbeat.OfflinePlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (Heartbeat.OfflinePlayer.Builder)super.clearOneof(var1);
         }

         public Heartbeat.OfflinePlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (Heartbeat.OfflinePlayer.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public Heartbeat.OfflinePlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (Heartbeat.OfflinePlayer.Builder)super.addRepeatedField(var1, var2);
         }

         public Heartbeat.OfflinePlayer.Builder mergeFrom(Message var1) {
            if (var1 instanceof Heartbeat.OfflinePlayer) {
               return this.mergeFrom((Heartbeat.OfflinePlayer)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public Heartbeat.OfflinePlayer.Builder mergeFrom(Heartbeat.OfflinePlayer var1) {
            if (var1 == Heartbeat.OfflinePlayer.getDefaultInstance()) {
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

         public Heartbeat.OfflinePlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

         public Heartbeat.OfflinePlayer.Builder setPlayer(UuidAndUsername var1) {
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

         public Heartbeat.OfflinePlayer.Builder setPlayer(UuidAndUsername.Builder var1) {
            if (this.playerBuilder_ == null) {
               this.player_ = var1.build();
            } else {
               this.playerBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public Heartbeat.OfflinePlayer.Builder mergePlayer(UuidAndUsername var1) {
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

         public Heartbeat.OfflinePlayer.Builder clearPlayer() {
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

         public Heartbeat.OfflinePlayer.Builder setLastOnline(Timestamp var1) {
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

         public Heartbeat.OfflinePlayer.Builder setLastOnline(Timestamp.Builder var1) {
            if (this.lastOnlineBuilder_ == null) {
               this.lastOnline_ = var1.build();
            } else {
               this.lastOnlineBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public Heartbeat.OfflinePlayer.Builder mergeLastOnline(Timestamp var1) {
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

         public Heartbeat.OfflinePlayer.Builder clearLastOnline() {
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

         public final Heartbeat.OfflinePlayer.Builder setUnknownFields(UnknownFieldSet var1) {
            return (Heartbeat.OfflinePlayer.Builder)super.setUnknownFields(var1);
         }

         public final Heartbeat.OfflinePlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (Heartbeat.OfflinePlayer.Builder)super.mergeUnknownFields(var1);
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

   public static final class OnlinePlayer extends GeneratedMessageV3 implements Heartbeat.OnlinePlayerOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYER_FIELD_NUMBER = 1;
      private UuidAndUsername player_;
      private byte memoizedIsInitialized = -1;
      private static final Heartbeat.OnlinePlayer DEFAULT_INSTANCE = new Heartbeat.OnlinePlayer();
      private static final Parser<Heartbeat.OnlinePlayer> PARSER = new AbstractParser<Heartbeat.OnlinePlayer>() {
         public Heartbeat.OnlinePlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            Heartbeat.OnlinePlayer.Builder var3 = Heartbeat.OnlinePlayer.newBuilder();

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
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new Heartbeat.OnlinePlayer();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Heartbeat.OnlinePlayer.class, Heartbeat.OnlinePlayer.Builder.class);
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

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof Heartbeat.OnlinePlayer)) {
            return super.equals(var1);
         } else {
            Heartbeat.OnlinePlayer var2 = (Heartbeat.OnlinePlayer)var1;
            if (this.hasPlayer() != var2.hasPlayer()) {
               return false;
            } else {
               return this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static Heartbeat.OnlinePlayer parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static Heartbeat.OnlinePlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static Heartbeat.OnlinePlayer parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static Heartbeat.OnlinePlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static Heartbeat.OnlinePlayer parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static Heartbeat.OnlinePlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static Heartbeat.OnlinePlayer parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static Heartbeat.OnlinePlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static Heartbeat.OnlinePlayer parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static Heartbeat.OnlinePlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static Heartbeat.OnlinePlayer parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static Heartbeat.OnlinePlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public Heartbeat.OnlinePlayer.Builder newBuilderForType() {
         return newBuilder();
      }

      public static Heartbeat.OnlinePlayer.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Heartbeat.OnlinePlayer.Builder newBuilder(Heartbeat.OnlinePlayer var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public Heartbeat.OnlinePlayer.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Heartbeat.OnlinePlayer.Builder() : new Heartbeat.OnlinePlayer.Builder().mergeFrom(this);
      }

      protected Heartbeat.OnlinePlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new Heartbeat.OnlinePlayer.Builder(var1);
      }

      public static Heartbeat.OnlinePlayer getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Heartbeat.OnlinePlayer> parser() {
         return PARSER;
      }

      @Override
      public Parser<Heartbeat.OnlinePlayer> getParserForType() {
         return PARSER;
      }

      public Heartbeat.OnlinePlayer getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Heartbeat.OnlinePlayer.Builder> implements Heartbeat.OnlinePlayerOrBuilder {
         private int bitField0_;
         private UuidAndUsername player_;
         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_fieldAccessorTable
               .ensureFieldAccessorsInitialized(Heartbeat.OnlinePlayer.class, Heartbeat.OnlinePlayer.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (Heartbeat.OnlinePlayer.alwaysUseFieldBuilders) {
               this.getPlayerFieldBuilder();
            }
         }

         public Heartbeat.OnlinePlayer.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.player_ = null;
            if (this.playerBuilder_ != null) {
               this.playerBuilder_.dispose();
               this.playerBuilder_ = null;
            }

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return CommonProto.internal_static_lunarclient_websocket_hostedworld_v1_Heartbeat_OnlinePlayer_descriptor;
         }

         public Heartbeat.OnlinePlayer getDefaultInstanceForType() {
            return Heartbeat.OnlinePlayer.getDefaultInstance();
         }

         public Heartbeat.OnlinePlayer build() {
            Heartbeat.OnlinePlayer var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public Heartbeat.OnlinePlayer buildPartial() {
            Heartbeat.OnlinePlayer var1 = new Heartbeat.OnlinePlayer(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(Heartbeat.OnlinePlayer var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
               var3 |= 1;
            }

            Heartbeat.OnlinePlayer var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public Heartbeat.OnlinePlayer.Builder clone() {
            return (Heartbeat.OnlinePlayer.Builder)super.clone();
         }

         public Heartbeat.OnlinePlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (Heartbeat.OnlinePlayer.Builder)super.setField(var1, var2);
         }

         public Heartbeat.OnlinePlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (Heartbeat.OnlinePlayer.Builder)super.clearField(var1);
         }

         public Heartbeat.OnlinePlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (Heartbeat.OnlinePlayer.Builder)super.clearOneof(var1);
         }

         public Heartbeat.OnlinePlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (Heartbeat.OnlinePlayer.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public Heartbeat.OnlinePlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (Heartbeat.OnlinePlayer.Builder)super.addRepeatedField(var1, var2);
         }

         public Heartbeat.OnlinePlayer.Builder mergeFrom(Message var1) {
            if (var1 instanceof Heartbeat.OnlinePlayer) {
               return this.mergeFrom((Heartbeat.OnlinePlayer)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public Heartbeat.OnlinePlayer.Builder mergeFrom(Heartbeat.OnlinePlayer var1) {
            if (var1 == Heartbeat.OnlinePlayer.getDefaultInstance()) {
               return this;
            }

            if (var1.hasPlayer()) {
               this.mergePlayer(var1.getPlayer());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public Heartbeat.OnlinePlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

         public Heartbeat.OnlinePlayer.Builder setPlayer(UuidAndUsername var1) {
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

         public Heartbeat.OnlinePlayer.Builder setPlayer(UuidAndUsername.Builder var1) {
            if (this.playerBuilder_ == null) {
               this.player_ = var1.build();
            } else {
               this.playerBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public Heartbeat.OnlinePlayer.Builder mergePlayer(UuidAndUsername var1) {
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

         public Heartbeat.OnlinePlayer.Builder clearPlayer() {
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

         public final Heartbeat.OnlinePlayer.Builder setUnknownFields(UnknownFieldSet var1) {
            return (Heartbeat.OnlinePlayer.Builder)super.setUnknownFields(var1);
         }

         public final Heartbeat.OnlinePlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (Heartbeat.OnlinePlayer.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface OnlinePlayerOrBuilder extends MessageOrBuilder {
      boolean hasPlayer();

      UuidAndUsername getPlayer();

      UuidAndUsernameOrBuilder getPlayerOrBuilder();
   }
}
