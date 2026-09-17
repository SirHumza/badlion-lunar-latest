package com.lunarclient.apollo.richpresence.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OverrideServerRichPresenceMessage extends GeneratedMessageV3 implements OverrideServerRichPresenceMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int GAME_NAME_FIELD_NUMBER = 1;
   private volatile Object gameName_ = "";
   public static final int GAME_VARIANT_NAME_FIELD_NUMBER = 2;
   private volatile Object gameVariantName_ = "";
   public static final int GAME_STATE_FIELD_NUMBER = 3;
   private volatile Object gameState_ = "";
   public static final int PLAYER_STATE_FIELD_NUMBER = 4;
   private volatile Object playerState_ = "";
   public static final int MAP_NAME_FIELD_NUMBER = 5;
   private volatile Object mapName_ = "";
   public static final int SUB_SERVER_FIELD_NUMBER = 6;
   private volatile Object subServer_ = "";
   public static final int TEAM_CURRENT_SIZE_FIELD_NUMBER = 7;
   private int teamCurrentSize_ = 0;
   public static final int TEAM_MAX_SIZE_FIELD_NUMBER = 8;
   private int teamMaxSize_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OverrideServerRichPresenceMessage DEFAULT_INSTANCE = new OverrideServerRichPresenceMessage();
   private static final Parser<OverrideServerRichPresenceMessage> PARSER = new AbstractParser<OverrideServerRichPresenceMessage>() {
      public OverrideServerRichPresenceMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideServerRichPresenceMessage.Builder var3 = OverrideServerRichPresenceMessage.newBuilder();

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

   private OverrideServerRichPresenceMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideServerRichPresenceMessage() {
      this.gameName_ = "";
      this.gameVariantName_ = "";
      this.gameState_ = "";
      this.playerState_ = "";
      this.mapName_ = "";
      this.subServer_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideServerRichPresenceMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideServerRichPresenceMessage.class, OverrideServerRichPresenceMessage.Builder.class);
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

      if (!GeneratedMessageV3.isStringEmpty(this.gameVariantName_)) {
         GeneratedMessageV3.writeString(var1, 2, this.gameVariantName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gameState_)) {
         GeneratedMessageV3.writeString(var1, 3, this.gameState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playerState_)) {
         GeneratedMessageV3.writeString(var1, 4, this.playerState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mapName_)) {
         GeneratedMessageV3.writeString(var1, 5, this.mapName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.subServer_)) {
         GeneratedMessageV3.writeString(var1, 6, this.subServer_);
      }

      if (this.teamCurrentSize_ != 0) {
         var1.writeInt32(7, this.teamCurrentSize_);
      }

      if (this.teamMaxSize_ != 0) {
         var1.writeInt32(8, this.teamMaxSize_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.gameVariantName_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.gameVariantName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gameState_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.gameState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playerState_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.playerState_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mapName_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.mapName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.subServer_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.subServer_);
      }

      if (this.teamCurrentSize_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.teamCurrentSize_);
      }

      if (this.teamMaxSize_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(8, this.teamMaxSize_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideServerRichPresenceMessage)) {
         return super.equals(var1);
      } else {
         OverrideServerRichPresenceMessage var2 = (OverrideServerRichPresenceMessage)var1;
         if (!this.getGameName().equals(var2.getGameName())) {
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getGameName().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getGameVariantName().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getGameState().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getPlayerState().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getMapName().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getSubServer().hashCode();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getTeamCurrentSize();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getTeamMaxSize();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideServerRichPresenceMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideServerRichPresenceMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideServerRichPresenceMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideServerRichPresenceMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideServerRichPresenceMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideServerRichPresenceMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideServerRichPresenceMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideServerRichPresenceMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideServerRichPresenceMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideServerRichPresenceMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideServerRichPresenceMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideServerRichPresenceMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideServerRichPresenceMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideServerRichPresenceMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideServerRichPresenceMessage.Builder newBuilder(OverrideServerRichPresenceMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideServerRichPresenceMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideServerRichPresenceMessage.Builder() : new OverrideServerRichPresenceMessage.Builder().mergeFrom(this);
   }

   protected OverrideServerRichPresenceMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideServerRichPresenceMessage.Builder(var1);
   }

   public static OverrideServerRichPresenceMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideServerRichPresenceMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideServerRichPresenceMessage> getParserForType() {
      return PARSER;
   }

   public OverrideServerRichPresenceMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OverrideServerRichPresenceMessage.Builder>
      implements OverrideServerRichPresenceMessageOrBuilder {
      private int bitField0_;
      private Object gameName_ = "";
      private Object gameVariantName_ = "";
      private Object gameState_ = "";
      private Object playerState_ = "";
      private Object mapName_ = "";
      private Object subServer_ = "";
      private int teamCurrentSize_;
      private int teamMaxSize_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideServerRichPresenceMessage.class, OverrideServerRichPresenceMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OverrideServerRichPresenceMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
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
         return SchemaProto.internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_descriptor;
      }

      public OverrideServerRichPresenceMessage getDefaultInstanceForType() {
         return OverrideServerRichPresenceMessage.getDefaultInstance();
      }

      public OverrideServerRichPresenceMessage build() {
         OverrideServerRichPresenceMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideServerRichPresenceMessage buildPartial() {
         OverrideServerRichPresenceMessage var1 = new OverrideServerRichPresenceMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideServerRichPresenceMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.gameName_ = this.gameName_;
         }

         if ((var2 & 2) != 0) {
            var1.gameVariantName_ = this.gameVariantName_;
         }

         if ((var2 & 4) != 0) {
            var1.gameState_ = this.gameState_;
         }

         if ((var2 & 8) != 0) {
            var1.playerState_ = this.playerState_;
         }

         if ((var2 & 16) != 0) {
            var1.mapName_ = this.mapName_;
         }

         if ((var2 & 32) != 0) {
            var1.subServer_ = this.subServer_;
         }

         if ((var2 & 64) != 0) {
            var1.teamCurrentSize_ = this.teamCurrentSize_;
         }

         if ((var2 & 128) != 0) {
            var1.teamMaxSize_ = this.teamMaxSize_;
         }
      }

      public OverrideServerRichPresenceMessage.Builder clone() {
         return (OverrideServerRichPresenceMessage.Builder)super.clone();
      }

      public OverrideServerRichPresenceMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideServerRichPresenceMessage.Builder)super.setField(var1, var2);
      }

      public OverrideServerRichPresenceMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideServerRichPresenceMessage.Builder)super.clearField(var1);
      }

      public OverrideServerRichPresenceMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideServerRichPresenceMessage.Builder)super.clearOneof(var1);
      }

      public OverrideServerRichPresenceMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideServerRichPresenceMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideServerRichPresenceMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideServerRichPresenceMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideServerRichPresenceMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideServerRichPresenceMessage) {
            return this.mergeFrom((OverrideServerRichPresenceMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder mergeFrom(OverrideServerRichPresenceMessage var1) {
         if (var1 == OverrideServerRichPresenceMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getGameName().isEmpty()) {
            this.gameName_ = var1.gameName_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getGameVariantName().isEmpty()) {
            this.gameVariantName_ = var1.gameVariantName_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getGameState().isEmpty()) {
            this.gameState_ = var1.gameState_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getPlayerState().isEmpty()) {
            this.playerState_ = var1.playerState_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getMapName().isEmpty()) {
            this.mapName_ = var1.mapName_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getSubServer().isEmpty()) {
            this.subServer_ = var1.subServer_;
            this.bitField0_ |= 32;
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

      public OverrideServerRichPresenceMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.gameVariantName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.gameState_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.playerState_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.mapName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.subServer_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.teamCurrentSize_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.teamMaxSize_ = var1.readInt32();
                     this.bitField0_ |= 128;
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

      public OverrideServerRichPresenceMessage.Builder setGameName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gameName_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearGameName() {
         this.gameName_ = OverrideServerRichPresenceMessage.getDefaultInstance().getGameName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder setGameNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideServerRichPresenceMessage.checkByteStringIsUtf8(var1);
         this.gameName_ = var1;
         this.bitField0_ |= 1;
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

      public OverrideServerRichPresenceMessage.Builder setGameVariantName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gameVariantName_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearGameVariantName() {
         this.gameVariantName_ = OverrideServerRichPresenceMessage.getDefaultInstance().getGameVariantName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder setGameVariantNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideServerRichPresenceMessage.checkByteStringIsUtf8(var1);
         this.gameVariantName_ = var1;
         this.bitField0_ |= 2;
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

      public OverrideServerRichPresenceMessage.Builder setGameState(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gameState_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearGameState() {
         this.gameState_ = OverrideServerRichPresenceMessage.getDefaultInstance().getGameState();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder setGameStateBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideServerRichPresenceMessage.checkByteStringIsUtf8(var1);
         this.gameState_ = var1;
         this.bitField0_ |= 4;
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

      public OverrideServerRichPresenceMessage.Builder setPlayerState(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playerState_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearPlayerState() {
         this.playerState_ = OverrideServerRichPresenceMessage.getDefaultInstance().getPlayerState();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder setPlayerStateBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideServerRichPresenceMessage.checkByteStringIsUtf8(var1);
         this.playerState_ = var1;
         this.bitField0_ |= 8;
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

      public OverrideServerRichPresenceMessage.Builder setMapName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mapName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearMapName() {
         this.mapName_ = OverrideServerRichPresenceMessage.getDefaultInstance().getMapName();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder setMapNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideServerRichPresenceMessage.checkByteStringIsUtf8(var1);
         this.mapName_ = var1;
         this.bitField0_ |= 16;
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

      public OverrideServerRichPresenceMessage.Builder setSubServer(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.subServer_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearSubServer() {
         this.subServer_ = OverrideServerRichPresenceMessage.getDefaultInstance().getSubServer();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder setSubServerBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideServerRichPresenceMessage.checkByteStringIsUtf8(var1);
         this.subServer_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public int getTeamCurrentSize() {
         return this.teamCurrentSize_;
      }

      public OverrideServerRichPresenceMessage.Builder setTeamCurrentSize(int var1) {
         this.teamCurrentSize_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearTeamCurrentSize() {
         this.bitField0_ &= -65;
         this.teamCurrentSize_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getTeamMaxSize() {
         return this.teamMaxSize_;
      }

      public OverrideServerRichPresenceMessage.Builder setTeamMaxSize(int var1) {
         this.teamMaxSize_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public OverrideServerRichPresenceMessage.Builder clearTeamMaxSize() {
         this.bitField0_ &= -129;
         this.teamMaxSize_ = 0;
         this.onChanged();
         return this;
      }

      public final OverrideServerRichPresenceMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideServerRichPresenceMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideServerRichPresenceMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideServerRichPresenceMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
