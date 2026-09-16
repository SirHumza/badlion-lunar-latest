package com.lunarclient.common.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ServerRichStatus extends GeneratedMessageV3 implements ServerRichStatusOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SOURCE_FIELD_NUMBER = 8;
   private int source_ = 0;
   public static final int GAME_NAME_FIELD_NUMBER = 1;
   private volatile Object gameName_ = "";
   public static final int GAME_VARIANT_NAME_FIELD_NUMBER = 9;
   private volatile Object gameVariantName_ = "";
   public static final int GAME_STATE_FIELD_NUMBER = 2;
   private volatile Object gameState_ = "";
   public static final int PLAYER_STATE_FIELD_NUMBER = 3;
   private volatile Object playerState_ = "";
   public static final int MAP_NAME_FIELD_NUMBER = 4;
   private volatile Object mapName_ = "";
   public static final int SUB_SERVER_FIELD_NUMBER = 5;
   private volatile Object subServer_ = "";
   public static final int TEAM_CURRENT_SIZE_FIELD_NUMBER = 6;
   private int teamCurrentSize_ = 0;
   public static final int TEAM_MAX_SIZE_FIELD_NUMBER = 7;
   private int teamMaxSize_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ServerRichStatus DEFAULT_INSTANCE = new ServerRichStatus();
   private static final Parser<ServerRichStatus> PARSER = new AbstractParser<ServerRichStatus>() {
      public ServerRichStatus parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerRichStatus.Builder var3 = ServerRichStatus.newBuilder();

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

   private ServerRichStatus(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerRichStatus() {
      this.source_ = 0;
      this.gameName_ = "";
      this.gameVariantName_ = "";
      this.gameState_ = "";
      this.playerState_ = "";
      this.mapName_ = "";
      this.subServer_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerRichStatus();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_ServerRichStatus_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_ServerRichStatus_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerRichStatus.class, ServerRichStatus.Builder.class);
   }

   @Override
   public int getSourceValue() {
      return this.source_;
   }

   @Override
   public ServerRichStatus.Source getSource() {
      ServerRichStatus.Source var1 = ServerRichStatus.Source.forNumber(this.source_);
      return var1 == null ? ServerRichStatus.Source.UNRECOGNIZED : var1;
   }

   @Override
   public String getGameName() {
      Object var1 = this.gameName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gameName_ = var3;
      return var3;
   }

   @Override
   public ByteString getGameNameBytes() {
      Object var1 = this.gameName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gameName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getGameVariantName() {
      Object var1 = this.gameVariantName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gameVariantName_ = var3;
      return var3;
   }

   @Override
   public ByteString getGameVariantNameBytes() {
      Object var1 = this.gameVariantName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gameVariantName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getGameState() {
      Object var1 = this.gameState_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gameState_ = var3;
      return var3;
   }

   @Override
   public ByteString getGameStateBytes() {
      Object var1 = this.gameState_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gameState_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getPlayerState() {
      Object var1 = this.playerState_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.playerState_ = var3;
      return var3;
   }

   @Override
   public ByteString getPlayerStateBytes() {
      Object var1 = this.playerState_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.playerState_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getMapName() {
      Object var1 = this.mapName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.mapName_ = var3;
      return var3;
   }

   @Override
   public ByteString getMapNameBytes() {
      Object var1 = this.mapName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.mapName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getSubServer() {
      Object var1 = this.subServer_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.subServer_ = var3;
      return var3;
   }

   @Override
   public ByteString getSubServerBytes() {
      Object var1 = this.subServer_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.subServer_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getTeamCurrentSize() {
      return this.teamCurrentSize_;
   }

   @Override
   public int getTeamMaxSize() {
      return this.teamMaxSize_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.gameName_)) {
         GeneratedMessageV3.writeString(var1, 1, this.gameName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gameState_)) {
         GeneratedMessageV3.writeString(var1, 2, this.gameState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playerState_)) {
         GeneratedMessageV3.writeString(var1, 3, this.playerState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mapName_)) {
         GeneratedMessageV3.writeString(var1, 4, this.mapName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.subServer_)) {
         GeneratedMessageV3.writeString(var1, 5, this.subServer_);
      }

      if (this.teamCurrentSize_ != 0) {
         var1.writeInt32(6, this.teamCurrentSize_);
      }

      if (this.teamMaxSize_ != 0) {
         var1.writeInt32(7, this.teamMaxSize_);
      }

      if (this.source_ != ServerRichStatus.Source.SOURCE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(8, this.source_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gameVariantName_)) {
         GeneratedMessageV3.writeString(var1, 9, this.gameVariantName_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.gameName_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.gameName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gameState_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.gameState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playerState_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.playerState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mapName_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.mapName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.subServer_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.subServer_);
      }

      if (this.teamCurrentSize_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.teamCurrentSize_);
      }

      if (this.teamMaxSize_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.teamMaxSize_);
      }

      if (this.source_ != ServerRichStatus.Source.SOURCE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(8, this.source_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gameVariantName_)) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.gameVariantName_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerRichStatus)) {
         return super.equals(var1);
      } else {
         ServerRichStatus var2 = (ServerRichStatus)var1;
         if (this.source_ != var2.source_) {
            return false;
         } else if (!this.getGameName().equals(var2.getGameName())) {
            return false;
         } else if (!this.getGameVariantName().equals(var2.getGameVariantName())) {
            return false;
         } else if (!this.getGameState().equals(var2.getGameState())) {
            return false;
         } else if (!this.getPlayerState().equals(var2.getPlayerState())) {
            return false;
         } else if (!this.getMapName().equals(var2.getMapName())) {
            return false;
         } else if (!this.getSubServer().equals(var2.getSubServer())) {
            return false;
         } else if (this.getTeamCurrentSize() != var2.getTeamCurrentSize()) {
            return false;
         } else {
            return this.getTeamMaxSize() != var2.getTeamMaxSize() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.source_;
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getGameName().hashCode();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getGameVariantName().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getGameState().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getPlayerState().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getMapName().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getSubServer().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getTeamCurrentSize();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getTeamMaxSize();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerRichStatus parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerRichStatus parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerRichStatus parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerRichStatus parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerRichStatus parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerRichStatus parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerRichStatus parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerRichStatus parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerRichStatus parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerRichStatus parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerRichStatus parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerRichStatus parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerRichStatus.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerRichStatus.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerRichStatus.Builder newBuilder(ServerRichStatus var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerRichStatus.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerRichStatus.Builder() : new ServerRichStatus.Builder().mergeFrom(this);
   }

   protected ServerRichStatus.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerRichStatus.Builder(var1);
   }

   public static ServerRichStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerRichStatus> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerRichStatus> getParserForType() {
      return PARSER;
   }

   public ServerRichStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerRichStatus.Builder> implements ServerRichStatusOrBuilder {
      private int bitField0_;
      private int source_ = 0;
      private Object gameName_ = "";
      private Object gameVariantName_ = "";
      private Object gameState_ = "";
      private Object playerState_ = "";
      private Object mapName_ = "";
      private Object subServer_ = "";
      private int teamCurrentSize_;
      private int teamMaxSize_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_ServerRichStatus_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_ServerRichStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerRichStatus.class, ServerRichStatus.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ServerRichStatus.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.source_ = 0;
         this.gameName_ = "";
         this.gameVariantName_ = "";
         this.gameState_ = "";
         this.playerState_ = "";
         this.mapName_ = "";
         this.subServer_ = "";
         this.teamCurrentSize_ = 0;
         this.teamMaxSize_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_ServerRichStatus_descriptor;
      }

      public ServerRichStatus getDefaultInstanceForType() {
         return ServerRichStatus.getDefaultInstance();
      }

      public ServerRichStatus build() {
         ServerRichStatus var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerRichStatus buildPartial() {
         ServerRichStatus var1 = new ServerRichStatus(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ServerRichStatus var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.source_ = this.source_;
         }

         if ((var2 & 2) != 0) {
            var1.gameName_ = this.gameName_;
         }

         if ((var2 & 4) != 0) {
            var1.gameVariantName_ = this.gameVariantName_;
         }

         if ((var2 & 8) != 0) {
            var1.gameState_ = this.gameState_;
         }

         if ((var2 & 16) != 0) {
            var1.playerState_ = this.playerState_;
         }

         if ((var2 & 32) != 0) {
            var1.mapName_ = this.mapName_;
         }

         if ((var2 & 64) != 0) {
            var1.subServer_ = this.subServer_;
         }

         if ((var2 & 128) != 0) {
            var1.teamCurrentSize_ = this.teamCurrentSize_;
         }

         if ((var2 & 256) != 0) {
            var1.teamMaxSize_ = this.teamMaxSize_;
         }
      }

      public ServerRichStatus.Builder clone() {
         return (ServerRichStatus.Builder)super.clone();
      }

      public ServerRichStatus.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerRichStatus.Builder)super.setField(var1, var2);
      }

      public ServerRichStatus.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerRichStatus.Builder)super.clearField(var1);
      }

      public ServerRichStatus.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerRichStatus.Builder)super.clearOneof(var1);
      }

      public ServerRichStatus.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerRichStatus.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerRichStatus.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerRichStatus.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerRichStatus.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerRichStatus) {
            return this.mergeFrom((ServerRichStatus)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerRichStatus.Builder mergeFrom(ServerRichStatus var1) {
         if (var1 == ServerRichStatus.getDefaultInstance()) {
            return this;
         }

         if (var1.source_ != 0) {
            this.setSourceValue(var1.getSourceValue());
         }

         if (!var1.getGameName().isEmpty()) {
            this.gameName_ = var1.gameName_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getGameVariantName().isEmpty()) {
            this.gameVariantName_ = var1.gameVariantName_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getGameState().isEmpty()) {
            this.gameState_ = var1.gameState_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getPlayerState().isEmpty()) {
            this.playerState_ = var1.playerState_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getMapName().isEmpty()) {
            this.mapName_ = var1.mapName_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (!var1.getSubServer().isEmpty()) {
            this.subServer_ = var1.subServer_;
            this.bitField0_ |= 64;
            this.onChanged();
         }

         if (var1.getTeamCurrentSize() != 0) {
            this.setTeamCurrentSize(var1.getTeamCurrentSize());
         }

         if (var1.getTeamMaxSize() != 0) {
            this.setTeamMaxSize(var1.getTeamMaxSize());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ServerRichStatus.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.gameName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 18:
                     this.gameState_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 26:
                     this.playerState_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 34:
                     this.mapName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 42:
                     this.subServer_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  case 48:
                     this.teamCurrentSize_ = var1.readInt32();
                     this.bitField0_ |= 128;
                     break;
                  case 56:
                     this.teamMaxSize_ = var1.readInt32();
                     this.bitField0_ |= 256;
                     break;
                  case 64:
                     this.source_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 74:
                     this.gameVariantName_ = var1.readStringRequireUtf8();
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
      public int getSourceValue() {
         return this.source_;
      }

      public ServerRichStatus.Builder setSourceValue(int var1) {
         this.source_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ServerRichStatus.Source getSource() {
         ServerRichStatus.Source var1 = ServerRichStatus.Source.forNumber(this.source_);
         return var1 == null ? ServerRichStatus.Source.UNRECOGNIZED : var1;
      }

      public ServerRichStatus.Builder setSource(ServerRichStatus.Source var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.source_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearSource() {
         this.bitField0_ &= -2;
         this.source_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getGameName() {
         Object var1 = this.gameName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gameName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGameNameBytes() {
         Object var1 = this.gameName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gameName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerRichStatus.Builder setGameName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gameName_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearGameName() {
         this.gameName_ = ServerRichStatus.getDefaultInstance().getGameName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder setGameNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRichStatus.checkByteStringIsUtf8(var1);
         this.gameName_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getGameVariantName() {
         Object var1 = this.gameVariantName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gameVariantName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGameVariantNameBytes() {
         Object var1 = this.gameVariantName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gameVariantName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerRichStatus.Builder setGameVariantName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gameVariantName_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearGameVariantName() {
         this.gameVariantName_ = ServerRichStatus.getDefaultInstance().getGameVariantName();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder setGameVariantNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRichStatus.checkByteStringIsUtf8(var1);
         this.gameVariantName_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getGameState() {
         Object var1 = this.gameState_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gameState_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGameStateBytes() {
         Object var1 = this.gameState_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gameState_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerRichStatus.Builder setGameState(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gameState_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearGameState() {
         this.gameState_ = ServerRichStatus.getDefaultInstance().getGameState();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder setGameStateBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRichStatus.checkByteStringIsUtf8(var1);
         this.gameState_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getPlayerState() {
         Object var1 = this.playerState_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.playerState_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlayerStateBytes() {
         Object var1 = this.playerState_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.playerState_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerRichStatus.Builder setPlayerState(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playerState_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearPlayerState() {
         this.playerState_ = ServerRichStatus.getDefaultInstance().getPlayerState();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder setPlayerStateBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRichStatus.checkByteStringIsUtf8(var1);
         this.playerState_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getMapName() {
         Object var1 = this.mapName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.mapName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMapNameBytes() {
         Object var1 = this.mapName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.mapName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerRichStatus.Builder setMapName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mapName_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearMapName() {
         this.mapName_ = ServerRichStatus.getDefaultInstance().getMapName();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder setMapNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRichStatus.checkByteStringIsUtf8(var1);
         this.mapName_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public String getSubServer() {
         Object var1 = this.subServer_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.subServer_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSubServerBytes() {
         Object var1 = this.subServer_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.subServer_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerRichStatus.Builder setSubServer(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.subServer_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearSubServer() {
         this.subServer_ = ServerRichStatus.getDefaultInstance().getSubServer();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder setSubServerBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerRichStatus.checkByteStringIsUtf8(var1);
         this.subServer_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public int getTeamCurrentSize() {
         return this.teamCurrentSize_;
      }

      public ServerRichStatus.Builder setTeamCurrentSize(int var1) {
         this.teamCurrentSize_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearTeamCurrentSize() {
         this.bitField0_ &= -129;
         this.teamCurrentSize_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getTeamMaxSize() {
         return this.teamMaxSize_;
      }

      public ServerRichStatus.Builder setTeamMaxSize(int var1) {
         this.teamMaxSize_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder clearTeamMaxSize() {
         this.bitField0_ &= -257;
         this.teamMaxSize_ = 0;
         this.onChanged();
         return this;
      }

      public final ServerRichStatus.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerRichStatus.Builder)super.setUnknownFields(var1);
      }

      public final ServerRichStatus.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerRichStatus.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Source implements ProtocolMessageEnum {
      SOURCE_UNSPECIFIED(0),
      SOURCE_APOLLO(1),
      SOURCE_LUNAR_CLIENT_PARSED(2),
      UNRECOGNIZED(-1);

      public static final int SOURCE_UNSPECIFIED_VALUE = 0;
      public static final int SOURCE_APOLLO_VALUE = 1;
      public static final int SOURCE_LUNAR_CLIENT_PARSED_VALUE = 2;
      private static final Internal.EnumLiteMap<ServerRichStatus.Source> internalValueMap = new Internal.EnumLiteMap<ServerRichStatus.Source>() {
         public ServerRichStatus.Source findValueByNumber(int var1) {
            return ServerRichStatus.Source.forNumber(var1);
         }
      };
      private static final ServerRichStatus.Source[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static ServerRichStatus.Source valueOf(int var0) {
         return forNumber(var0);
      }

      public static ServerRichStatus.Source forNumber(int var0) {
         switch (var0) {
            case 0:
               return SOURCE_UNSPECIFIED;
            case 1:
               return SOURCE_APOLLO;
            case 2:
               return SOURCE_LUNAR_CLIENT_PARSED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ServerRichStatus.Source> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return ServerRichStatus.getDescriptor().getEnumTypes().get(0);
      }

      public static ServerRichStatus.Source valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Source(int var3) {
         this.value = var3;
      }
   }
}
