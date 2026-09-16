package com.lunarclient.websocket.handshake.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.MinecraftSkin;
import com.lunarclient.common.v1.MinecraftSkinOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MinecraftIdentity extends GeneratedMessageV3 implements MinecraftIdentityOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   public static final int TYPE_FIELD_NUMBER = 2;
   private int type_ = 0;
   public static final int AUTHENTICATOR_JWT_FIELD_NUMBER = 3;
   private volatile Object authenticatorJwt_ = "";
   public static final int SKINS_FIELD_NUMBER = 4;
   private List<MinecraftIdentity.Skin> skins_;
   public static final int CAPES_FIELD_NUMBER = 5;
   private List<MinecraftIdentity.Cape> capes_;
   public static final int ATTRIBUTES_FIELD_NUMBER = 6;
   private MinecraftIdentity.Attributes attributes_;
   public static final int CREATED_AT_FIELD_NUMBER = 8;
   private Timestamp createdAt_;
   public static final int NAME_CHANGE_FIELD_NUMBER = 9;
   private MinecraftIdentity.NameChange nameChange_;
   public static final int OWNS_BEDROCK_EDITION_FIELD_NUMBER = 10;
   private boolean ownsBedrockEdition_ = false;
   private byte memoizedIsInitialized = -1;
   private static final MinecraftIdentity DEFAULT_INSTANCE = new MinecraftIdentity();
   private static final Parser<MinecraftIdentity> PARSER = new AbstractParser<MinecraftIdentity>() {
      public MinecraftIdentity parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MinecraftIdentity.Builder var3 = MinecraftIdentity.newBuilder();

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

   private MinecraftIdentity(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MinecraftIdentity() {
      this.type_ = 0;
      this.authenticatorJwt_ = "";
      this.skins_ = Collections.emptyList();
      this.capes_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MinecraftIdentity();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MinecraftIdentity.class, MinecraftIdentity.Builder.class);
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
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public MinecraftIdentity.Type getType() {
      MinecraftIdentity.Type var1 = MinecraftIdentity.Type.forNumber(this.type_);
      return var1 == null ? MinecraftIdentity.Type.UNRECOGNIZED : var1;
   }

   @Override
   public String getAuthenticatorJwt() {
      Object var1 = this.authenticatorJwt_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.authenticatorJwt_ = var3;
      return var3;
   }

   @Override
   public ByteString getAuthenticatorJwtBytes() {
      Object var1 = this.authenticatorJwt_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.authenticatorJwt_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public List<MinecraftIdentity.Skin> getSkinsList() {
      return this.skins_;
   }

   @Override
   public List<? extends MinecraftIdentity.SkinOrBuilder> getSkinsOrBuilderList() {
      return this.skins_;
   }

   @Override
   public int getSkinsCount() {
      return this.skins_.size();
   }

   @Override
   public MinecraftIdentity.Skin getSkins(int var1) {
      return this.skins_.get(var1);
   }

   @Override
   public MinecraftIdentity.SkinOrBuilder getSkinsOrBuilder(int var1) {
      return this.skins_.get(var1);
   }

   @Override
   public List<MinecraftIdentity.Cape> getCapesList() {
      return this.capes_;
   }

   @Override
   public List<? extends MinecraftIdentity.CapeOrBuilder> getCapesOrBuilderList() {
      return this.capes_;
   }

   @Override
   public int getCapesCount() {
      return this.capes_.size();
   }

   @Override
   public MinecraftIdentity.Cape getCapes(int var1) {
      return this.capes_.get(var1);
   }

   @Override
   public MinecraftIdentity.CapeOrBuilder getCapesOrBuilder(int var1) {
      return this.capes_.get(var1);
   }

   @Override
   public boolean hasAttributes() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public MinecraftIdentity.Attributes getAttributes() {
      return this.attributes_ == null ? MinecraftIdentity.Attributes.getDefaultInstance() : this.attributes_;
   }

   @Override
   public MinecraftIdentity.AttributesOrBuilder getAttributesOrBuilder() {
      return this.attributes_ == null ? MinecraftIdentity.Attributes.getDefaultInstance() : this.attributes_;
   }

   @Override
   public boolean hasCreatedAt() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Timestamp getCreatedAt() {
      return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
   }

   @Override
   public TimestampOrBuilder getCreatedAtOrBuilder() {
      return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
   }

   @Override
   public boolean hasNameChange() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public MinecraftIdentity.NameChange getNameChange() {
      return this.nameChange_ == null ? MinecraftIdentity.NameChange.getDefaultInstance() : this.nameChange_;
   }

   @Override
   public MinecraftIdentity.NameChangeOrBuilder getNameChangeOrBuilder() {
      return this.nameChange_ == null ? MinecraftIdentity.NameChange.getDefaultInstance() : this.nameChange_;
   }

   @Override
   public boolean getOwnsBedrockEdition() {
      return this.ownsBedrockEdition_;
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

      if (this.type_ != MinecraftIdentity.Type.TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.type_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.authenticatorJwt_)) {
         GeneratedMessageV3.writeString(var1, 3, this.authenticatorJwt_);
      }

      for (int var2 = 0; var2 < this.skins_.size(); var2++) {
         var1.writeMessage(4, this.skins_.get(var2));
      }

      for (int var3 = 0; var3 < this.capes_.size(); var3++) {
         var1.writeMessage(5, this.capes_.get(var3));
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(6, this.getAttributes());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(8, this.getCreatedAt());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(9, this.getNameChange());
      }

      if (this.ownsBedrockEdition_) {
         var1.writeBool(10, this.ownsBedrockEdition_);
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

      if (this.type_ != MinecraftIdentity.Type.TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.type_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.authenticatorJwt_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.authenticatorJwt_);
      }

      for (int var2 = 0; var2 < this.skins_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.skins_.get(var2));
      }

      for (int var5 = 0; var5 < this.capes_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(5, this.capes_.get(var5));
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getAttributes());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getCreatedAt());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(9, this.getNameChange());
      }

      if (this.ownsBedrockEdition_) {
         var1 += CodedOutputStream.computeBoolSize(10, this.ownsBedrockEdition_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MinecraftIdentity)) {
         return super.equals(var1);
      } else {
         MinecraftIdentity var2 = (MinecraftIdentity)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
            return false;
         } else if (this.type_ != var2.type_) {
            return false;
         } else if (!this.getAuthenticatorJwt().equals(var2.getAuthenticatorJwt())) {
            return false;
         } else if (!this.getSkinsList().equals(var2.getSkinsList())) {
            return false;
         } else if (!this.getCapesList().equals(var2.getCapesList())) {
            return false;
         } else if (this.hasAttributes() != var2.hasAttributes()) {
            return false;
         } else if (this.hasAttributes() && !this.getAttributes().equals(var2.getAttributes())) {
            return false;
         } else if (this.hasCreatedAt() != var2.hasCreatedAt()) {
            return false;
         } else if (this.hasCreatedAt() && !this.getCreatedAt().equals(var2.getCreatedAt())) {
            return false;
         } else if (this.hasNameChange() != var2.hasNameChange()) {
            return false;
         } else if (this.hasNameChange() && !this.getNameChange().equals(var2.getNameChange())) {
            return false;
         } else {
            return this.getOwnsBedrockEdition() != var2.getOwnsBedrockEdition() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.type_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getAuthenticatorJwt().hashCode();
      if (this.getSkinsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getSkinsList().hashCode();
      }

      if (this.getCapesCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getCapesList().hashCode();
      }

      if (this.hasAttributes()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getAttributes().hashCode();
      }

      if (this.hasCreatedAt()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getCreatedAt().hashCode();
      }

      if (this.hasNameChange()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getNameChange().hashCode();
      }

      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Internal.hashBoolean(this.getOwnsBedrockEdition());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MinecraftIdentity parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftIdentity parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftIdentity parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftIdentity parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftIdentity parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftIdentity parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftIdentity parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MinecraftIdentity parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MinecraftIdentity parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MinecraftIdentity parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MinecraftIdentity parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MinecraftIdentity parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MinecraftIdentity.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MinecraftIdentity.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MinecraftIdentity.Builder newBuilder(MinecraftIdentity var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MinecraftIdentity.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MinecraftIdentity.Builder() : new MinecraftIdentity.Builder().mergeFrom(this);
   }

   protected MinecraftIdentity.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MinecraftIdentity.Builder(var1);
   }

   public static MinecraftIdentity getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MinecraftIdentity> parser() {
      return PARSER;
   }

   @Override
   public Parser<MinecraftIdentity> getParserForType() {
      return PARSER;
   }

   public MinecraftIdentity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Attributes extends GeneratedMessageV3 implements MinecraftIdentity.AttributesOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRIVILEDGE_ONLINE_CHAT_FIELD_NUMBER = 1;
      private boolean priviledgeOnlineChat_ = false;
      public static final int PRIVILEDGE_MULTIPLAYER_SERVER_FIELD_NUMBER = 2;
      private boolean priviledgeMultiplayerServer_ = false;
      public static final int PRIVILEDGE_MULTIPLAYER_REALMS_FIELD_NUMBER = 3;
      private boolean priviledgeMultiplayerRealms_ = false;
      public static final int PRIVILEDGE_TELEMETRY_FIELD_NUMBER = 4;
      private boolean priviledgeTelemetry_ = false;
      public static final int PRIVILEDGE_OPTIONAL_TELEMETRY_FIELD_NUMBER = 5;
      private boolean priviledgeOptionalTelemetry_ = false;
      public static final int PROFANITY_FILTER_REALMS_FIELD_NUMBER = 6;
      private boolean profanityFilterRealms_ = false;
      public static final int BANNED_SCOPES_FIELD_NUMBER = 7;
      private List<MinecraftIdentity.Attributes.BannedScope> bannedScopes_;
      private byte memoizedIsInitialized = -1;
      private static final MinecraftIdentity.Attributes DEFAULT_INSTANCE = new MinecraftIdentity.Attributes();
      private static final Parser<MinecraftIdentity.Attributes> PARSER = new AbstractParser<MinecraftIdentity.Attributes>() {
         public MinecraftIdentity.Attributes parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            MinecraftIdentity.Attributes.Builder var3 = MinecraftIdentity.Attributes.newBuilder();

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

      private Attributes(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private Attributes() {
         this.bannedScopes_ = Collections.emptyList();
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new MinecraftIdentity.Attributes();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftIdentity.Attributes.class, MinecraftIdentity.Attributes.Builder.class);
      }

      @Override
      public boolean getPriviledgeOnlineChat() {
         return this.priviledgeOnlineChat_;
      }

      @Override
      public boolean getPriviledgeMultiplayerServer() {
         return this.priviledgeMultiplayerServer_;
      }

      @Override
      public boolean getPriviledgeMultiplayerRealms() {
         return this.priviledgeMultiplayerRealms_;
      }

      @Override
      public boolean getPriviledgeTelemetry() {
         return this.priviledgeTelemetry_;
      }

      @Override
      public boolean getPriviledgeOptionalTelemetry() {
         return this.priviledgeOptionalTelemetry_;
      }

      @Override
      public boolean getProfanityFilterRealms() {
         return this.profanityFilterRealms_;
      }

      @Override
      public List<MinecraftIdentity.Attributes.BannedScope> getBannedScopesList() {
         return this.bannedScopes_;
      }

      @Override
      public List<? extends MinecraftIdentity.Attributes.BannedScopeOrBuilder> getBannedScopesOrBuilderList() {
         return this.bannedScopes_;
      }

      @Override
      public int getBannedScopesCount() {
         return this.bannedScopes_.size();
      }

      @Override
      public MinecraftIdentity.Attributes.BannedScope getBannedScopes(int var1) {
         return this.bannedScopes_.get(var1);
      }

      @Override
      public MinecraftIdentity.Attributes.BannedScopeOrBuilder getBannedScopesOrBuilder(int var1) {
         return this.bannedScopes_.get(var1);
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
         if (this.priviledgeOnlineChat_) {
            var1.writeBool(1, this.priviledgeOnlineChat_);
         }

         if (this.priviledgeMultiplayerServer_) {
            var1.writeBool(2, this.priviledgeMultiplayerServer_);
         }

         if (this.priviledgeMultiplayerRealms_) {
            var1.writeBool(3, this.priviledgeMultiplayerRealms_);
         }

         if (this.priviledgeTelemetry_) {
            var1.writeBool(4, this.priviledgeTelemetry_);
         }

         if (this.priviledgeOptionalTelemetry_) {
            var1.writeBool(5, this.priviledgeOptionalTelemetry_);
         }

         if (this.profanityFilterRealms_) {
            var1.writeBool(6, this.profanityFilterRealms_);
         }

         for (int var2 = 0; var2 < this.bannedScopes_.size(); var2++) {
            var1.writeMessage(7, this.bannedScopes_.get(var2));
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
         if (this.priviledgeOnlineChat_) {
            var1 += CodedOutputStream.computeBoolSize(1, this.priviledgeOnlineChat_);
         }

         if (this.priviledgeMultiplayerServer_) {
            var1 += CodedOutputStream.computeBoolSize(2, this.priviledgeMultiplayerServer_);
         }

         if (this.priviledgeMultiplayerRealms_) {
            var1 += CodedOutputStream.computeBoolSize(3, this.priviledgeMultiplayerRealms_);
         }

         if (this.priviledgeTelemetry_) {
            var1 += CodedOutputStream.computeBoolSize(4, this.priviledgeTelemetry_);
         }

         if (this.priviledgeOptionalTelemetry_) {
            var1 += CodedOutputStream.computeBoolSize(5, this.priviledgeOptionalTelemetry_);
         }

         if (this.profanityFilterRealms_) {
            var1 += CodedOutputStream.computeBoolSize(6, this.profanityFilterRealms_);
         }

         for (int var2 = 0; var2 < this.bannedScopes_.size(); var2++) {
            var1 += CodedOutputStream.computeMessageSize(7, this.bannedScopes_.get(var2));
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof MinecraftIdentity.Attributes)) {
            return super.equals(var1);
         } else {
            MinecraftIdentity.Attributes var2 = (MinecraftIdentity.Attributes)var1;
            if (this.getPriviledgeOnlineChat() != var2.getPriviledgeOnlineChat()) {
               return false;
            } else if (this.getPriviledgeMultiplayerServer() != var2.getPriviledgeMultiplayerServer()) {
               return false;
            } else if (this.getPriviledgeMultiplayerRealms() != var2.getPriviledgeMultiplayerRealms()) {
               return false;
            } else if (this.getPriviledgeTelemetry() != var2.getPriviledgeTelemetry()) {
               return false;
            } else if (this.getPriviledgeOptionalTelemetry() != var2.getPriviledgeOptionalTelemetry()) {
               return false;
            } else if (this.getProfanityFilterRealms() != var2.getProfanityFilterRealms()) {
               return false;
            } else {
               return !this.getBannedScopesList().equals(var2.getBannedScopesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 53 * var1 + Internal.hashBoolean(this.getPriviledgeOnlineChat());
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + Internal.hashBoolean(this.getPriviledgeMultiplayerServer());
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + Internal.hashBoolean(this.getPriviledgeMultiplayerRealms());
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + Internal.hashBoolean(this.getPriviledgeTelemetry());
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + Internal.hashBoolean(this.getPriviledgeOptionalTelemetry());
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + Internal.hashBoolean(this.getProfanityFilterRealms());
         if (this.getBannedScopesCount() > 0) {
            var1 = 37 * var1 + 7;
            var1 = 53 * var1 + this.getBannedScopesList().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static MinecraftIdentity.Attributes parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Attributes parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Attributes parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Attributes parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Attributes parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Attributes parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Attributes parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Attributes parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.Attributes parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Attributes parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.Attributes parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Attributes parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public MinecraftIdentity.Attributes.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MinecraftIdentity.Attributes.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MinecraftIdentity.Attributes.Builder newBuilder(MinecraftIdentity.Attributes var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public MinecraftIdentity.Attributes.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MinecraftIdentity.Attributes.Builder() : new MinecraftIdentity.Attributes.Builder().mergeFrom(this);
      }

      protected MinecraftIdentity.Attributes.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new MinecraftIdentity.Attributes.Builder(var1);
      }

      public static MinecraftIdentity.Attributes getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MinecraftIdentity.Attributes> parser() {
         return PARSER;
      }

      @Override
      public Parser<MinecraftIdentity.Attributes> getParserForType() {
         return PARSER;
      }

      public MinecraftIdentity.Attributes getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class BannedScope extends GeneratedMessageV3 implements MinecraftIdentity.Attributes.BannedScopeOrBuilder {
         private static final long serialVersionUID = 0L;
         private int bitField0_;
         public static final int TYPE_FIELD_NUMBER = 1;
         private int type_ = 0;
         public static final int BAN_ID_FIELD_NUMBER = 2;
         private volatile Object banId_ = "";
         public static final int EXPIRES_FIELD_NUMBER = 3;
         private Timestamp expires_;
         public static final int REASON_FIELD_NUMBER = 4;
         private volatile Object reason_ = "";
         public static final int REASON_MESSAGE_FIELD_NUMBER = 5;
         private volatile Object reasonMessage_ = "";
         private byte memoizedIsInitialized = -1;
         private static final MinecraftIdentity.Attributes.BannedScope DEFAULT_INSTANCE = new MinecraftIdentity.Attributes.BannedScope();
         private static final Parser<MinecraftIdentity.Attributes.BannedScope> PARSER = new AbstractParser<MinecraftIdentity.Attributes.BannedScope>() {
            public MinecraftIdentity.Attributes.BannedScope parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
               MinecraftIdentity.Attributes.BannedScope.Builder var3 = MinecraftIdentity.Attributes.BannedScope.newBuilder();

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

         private BannedScope(GeneratedMessageV3.Builder<?> var1) {
            super(var1);
         }

         private BannedScope() {
            this.type_ = 0;
            this.banId_ = "";
            this.reason_ = "";
            this.reasonMessage_ = "";
         }

         @Override
         protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
            return new MinecraftIdentity.Attributes.BannedScope();
         }

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_fieldAccessorTable
               .ensureFieldAccessorsInitialized(MinecraftIdentity.Attributes.BannedScope.class, MinecraftIdentity.Attributes.BannedScope.Builder.class);
         }

         @Override
         public int getTypeValue() {
            return this.type_;
         }

         @Override
         public MinecraftIdentity.Attributes.BannedScope.Type getType() {
            MinecraftIdentity.Attributes.BannedScope.Type var1 = MinecraftIdentity.Attributes.BannedScope.Type.forNumber(this.type_);
            return var1 == null ? MinecraftIdentity.Attributes.BannedScope.Type.UNRECOGNIZED : var1;
         }

         @Override
         public String getBanId() {
            Object var1 = this.banId_;
            if (var1 instanceof String) {
               return (String)var1;
            }

            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.banId_ = var3;
            return var3;
         }

         @Override
         public ByteString getBanIdBytes() {
            Object var1 = this.banId_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.banId_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         @Override
         public boolean hasExpires() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public Timestamp getExpires() {
            return this.expires_ == null ? Timestamp.getDefaultInstance() : this.expires_;
         }

         @Override
         public TimestampOrBuilder getExpiresOrBuilder() {
            return this.expires_ == null ? Timestamp.getDefaultInstance() : this.expires_;
         }

         @Override
         public String getReason() {
            Object var1 = this.reason_;
            if (var1 instanceof String) {
               return (String)var1;
            }

            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.reason_ = var3;
            return var3;
         }

         @Override
         public ByteString getReasonBytes() {
            Object var1 = this.reason_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.reason_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         @Override
         public String getReasonMessage() {
            Object var1 = this.reasonMessage_;
            if (var1 instanceof String) {
               return (String)var1;
            }

            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.reasonMessage_ = var3;
            return var3;
         }

         @Override
         public ByteString getReasonMessageBytes() {
            Object var1 = this.reasonMessage_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.reasonMessage_ = var2;
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
            if (this.type_ != MinecraftIdentity.Attributes.BannedScope.Type.TYPE_UNSPECIFIED.getNumber()) {
               var1.writeEnum(1, this.type_);
            }

            if (!GeneratedMessageV3.isStringEmpty(this.banId_)) {
               GeneratedMessageV3.writeString(var1, 2, this.banId_);
            }

            if ((this.bitField0_ & 1) != 0) {
               var1.writeMessage(3, this.getExpires());
            }

            if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
               GeneratedMessageV3.writeString(var1, 4, this.reason_);
            }

            if (!GeneratedMessageV3.isStringEmpty(this.reasonMessage_)) {
               GeneratedMessageV3.writeString(var1, 5, this.reasonMessage_);
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
            if (this.type_ != MinecraftIdentity.Attributes.BannedScope.Type.TYPE_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            if (!GeneratedMessageV3.isStringEmpty(this.banId_)) {
               var1 += GeneratedMessageV3.computeStringSize(2, this.banId_);
            }

            if ((this.bitField0_ & 1) != 0) {
               var1 += CodedOutputStream.computeMessageSize(3, this.getExpires());
            }

            if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
               var1 += GeneratedMessageV3.computeStringSize(4, this.reason_);
            }

            if (!GeneratedMessageV3.isStringEmpty(this.reasonMessage_)) {
               var1 += GeneratedMessageV3.computeStringSize(5, this.reasonMessage_);
            }

            var1 += this.getUnknownFields().getSerializedSize();
            this.memoizedSize = var1;
            return var1;
         }

         @Override
         public boolean equals(Object var1) {
            if (var1 == this) {
               return true;
            } else if (!(var1 instanceof MinecraftIdentity.Attributes.BannedScope)) {
               return super.equals(var1);
            } else {
               MinecraftIdentity.Attributes.BannedScope var2 = (MinecraftIdentity.Attributes.BannedScope)var1;
               if (this.type_ != var2.type_) {
                  return false;
               } else if (!this.getBanId().equals(var2.getBanId())) {
                  return false;
               } else if (this.hasExpires() != var2.hasExpires()) {
                  return false;
               } else if (this.hasExpires() && !this.getExpires().equals(var2.getExpires())) {
                  return false;
               } else if (!this.getReason().equals(var2.getReason())) {
                  return false;
               } else {
                  return !this.getReasonMessage().equals(var2.getReasonMessage()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
            var1 = 53 * var1 + this.type_;
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getBanId().hashCode();
            if (this.hasExpires()) {
               var1 = 37 * var1 + 3;
               var1 = 53 * var1 + this.getExpires().hashCode();
            }

            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getReason().hashCode();
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getReasonMessage().hashCode();
            var1 = 29 * var1 + this.getUnknownFields().hashCode();
            this.memoizedHashCode = var1;
            return var1;
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(ByteBuffer var0) {
            return PARSER.parseFrom(var0);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
            return PARSER.parseFrom(var0, var1);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(ByteString var0) {
            return PARSER.parseFrom(var0);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(ByteString var0, ExtensionRegistryLite var1) {
            return PARSER.parseFrom(var0, var1);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(byte[] var0) {
            return PARSER.parseFrom(var0);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(byte[] var0, ExtensionRegistryLite var1) {
            return PARSER.parseFrom(var0, var1);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(InputStream var0) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(InputStream var0, ExtensionRegistryLite var1) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseDelimitedFrom(InputStream var0) {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(CodedInputStream var0) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0);
         }

         public static MinecraftIdentity.Attributes.BannedScope parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
            return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
         }

         public MinecraftIdentity.Attributes.BannedScope.Builder newBuilderForType() {
            return newBuilder();
         }

         public static MinecraftIdentity.Attributes.BannedScope.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
         }

         public static MinecraftIdentity.Attributes.BannedScope.Builder newBuilder(MinecraftIdentity.Attributes.BannedScope var0) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
         }

         public MinecraftIdentity.Attributes.BannedScope.Builder toBuilder() {
            return this == DEFAULT_INSTANCE
               ? new MinecraftIdentity.Attributes.BannedScope.Builder()
               : new MinecraftIdentity.Attributes.BannedScope.Builder().mergeFrom(this);
         }

         protected MinecraftIdentity.Attributes.BannedScope.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
            return new MinecraftIdentity.Attributes.BannedScope.Builder(var1);
         }

         public static MinecraftIdentity.Attributes.BannedScope getDefaultInstance() {
            return DEFAULT_INSTANCE;
         }

         public static Parser<MinecraftIdentity.Attributes.BannedScope> parser() {
            return PARSER;
         }

         @Override
         public Parser<MinecraftIdentity.Attributes.BannedScope> getParserForType() {
            return PARSER;
         }

         public MinecraftIdentity.Attributes.BannedScope getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
         }

         public static final class Builder
            extends GeneratedMessageV3.Builder<MinecraftIdentity.Attributes.BannedScope.Builder>
            implements MinecraftIdentity.Attributes.BannedScopeOrBuilder {
            private int bitField0_;
            private int type_ = 0;
            private Object banId_ = "";
            private Timestamp expires_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> expiresBuilder_;
            private Object reason_ = "";
            private Object reasonMessage_ = "";

            public static final Descriptors.Descriptor getDescriptor() {
               return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_descriptor;
            }

            @Override
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
               return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_fieldAccessorTable
                  .ensureFieldAccessorsInitialized(MinecraftIdentity.Attributes.BannedScope.class, MinecraftIdentity.Attributes.BannedScope.Builder.class);
            }

            private Builder() {
               this.maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent var1) {
               super(var1);
               this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
               if (MinecraftIdentity.Attributes.BannedScope.alwaysUseFieldBuilders) {
                  this.getExpiresFieldBuilder();
               }
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clear() {
               super.clear();
               this.bitField0_ = 0;
               this.type_ = 0;
               this.banId_ = "";
               this.expires_ = null;
               if (this.expiresBuilder_ != null) {
                  this.expiresBuilder_.dispose();
                  this.expiresBuilder_ = null;
               }

               this.reason_ = "";
               this.reasonMessage_ = "";
               return this;
            }

            @Override
            public Descriptors.Descriptor getDescriptorForType() {
               return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_BannedScope_descriptor;
            }

            public MinecraftIdentity.Attributes.BannedScope getDefaultInstanceForType() {
               return MinecraftIdentity.Attributes.BannedScope.getDefaultInstance();
            }

            public MinecraftIdentity.Attributes.BannedScope build() {
               MinecraftIdentity.Attributes.BannedScope var1 = this.buildPartial();
               if (!var1.isInitialized()) {
                  throw newUninitializedMessageException(var1);
               } else {
                  return var1;
               }
            }

            public MinecraftIdentity.Attributes.BannedScope buildPartial() {
               MinecraftIdentity.Attributes.BannedScope var1 = new MinecraftIdentity.Attributes.BannedScope(this);
               if (this.bitField0_ != 0) {
                  this.buildPartial0(var1);
               }

               this.onBuilt();
               return var1;
            }

            private void buildPartial0(MinecraftIdentity.Attributes.BannedScope var1) {
               int var2 = this.bitField0_;
               if ((var2 & 1) != 0) {
                  var1.type_ = this.type_;
               }

               if ((var2 & 2) != 0) {
                  var1.banId_ = this.banId_;
               }

               byte var3 = 0;
               if ((var2 & 4) != 0) {
                  var1.expires_ = this.expiresBuilder_ == null ? this.expires_ : this.expiresBuilder_.build();
                  var3 |= 1;
               }

               if ((var2 & 8) != 0) {
                  var1.reason_ = this.reason_;
               }

               if ((var2 & 16) != 0) {
                  var1.reasonMessage_ = this.reasonMessage_;
               }

               MinecraftIdentity.Attributes.BannedScope var4 = var1;
               var4.bitField0_ = var4.bitField0_ | var3;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clone() {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.clone();
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.setField(var1, var2);
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearField(Descriptors.FieldDescriptor var1) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.clearField(var1);
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearOneof(Descriptors.OneofDescriptor var1) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.clearOneof(var1);
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.setRepeatedField(var1, var2, var3);
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.addRepeatedField(var1, var2);
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder mergeFrom(Message var1) {
               if (var1 instanceof MinecraftIdentity.Attributes.BannedScope) {
                  return this.mergeFrom((MinecraftIdentity.Attributes.BannedScope)var1);
               }

               super.mergeFrom(var1);
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder mergeFrom(MinecraftIdentity.Attributes.BannedScope var1) {
               if (var1 == MinecraftIdentity.Attributes.BannedScope.getDefaultInstance()) {
                  return this;
               }

               if (var1.type_ != 0) {
                  this.setTypeValue(var1.getTypeValue());
               }

               if (!var1.getBanId().isEmpty()) {
                  this.banId_ = var1.banId_;
                  this.bitField0_ |= 2;
                  this.onChanged();
               }

               if (var1.hasExpires()) {
                  this.mergeExpires(var1.getExpires());
               }

               if (!var1.getReason().isEmpty()) {
                  this.reason_ = var1.reason_;
                  this.bitField0_ |= 8;
                  this.onChanged();
               }

               if (!var1.getReasonMessage().isEmpty()) {
                  this.reasonMessage_ = var1.reasonMessage_;
                  this.bitField0_ |= 16;
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

            public MinecraftIdentity.Attributes.BannedScope.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                           this.type_ = var1.readEnum();
                           this.bitField0_ |= 1;
                           break;
                        case 18:
                           this.banId_ = var1.readStringRequireUtf8();
                           this.bitField0_ |= 2;
                           break;
                        case 26:
                           var1.readMessage(this.getExpiresFieldBuilder().getBuilder(), var2);
                           this.bitField0_ |= 4;
                           break;
                        case 34:
                           this.reason_ = var1.readStringRequireUtf8();
                           this.bitField0_ |= 8;
                           break;
                        case 42:
                           this.reasonMessage_ = var1.readStringRequireUtf8();
                           this.bitField0_ |= 16;
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
            public int getTypeValue() {
               return this.type_;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setTypeValue(int var1) {
               this.type_ = var1;
               this.bitField0_ |= 1;
               this.onChanged();
               return this;
            }

            @Override
            public MinecraftIdentity.Attributes.BannedScope.Type getType() {
               MinecraftIdentity.Attributes.BannedScope.Type var1 = MinecraftIdentity.Attributes.BannedScope.Type.forNumber(this.type_);
               return var1 == null ? MinecraftIdentity.Attributes.BannedScope.Type.UNRECOGNIZED : var1;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setType(MinecraftIdentity.Attributes.BannedScope.Type var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.bitField0_ |= 1;
               this.type_ = var1.getNumber();
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearType() {
               this.bitField0_ &= -2;
               this.type_ = 0;
               this.onChanged();
               return this;
            }

            @Override
            public String getBanId() {
               Object var1 = this.banId_;
               if (!(var1 instanceof String)) {
                  ByteString var2 = (ByteString)var1;
                  String var3 = var2.toStringUtf8();
                  this.banId_ = var3;
                  return var3;
               } else {
                  return (String)var1;
               }
            }

            @Override
            public ByteString getBanIdBytes() {
               Object var1 = this.banId_;
               if (var1 instanceof String) {
                  ByteString var2 = ByteString.copyFromUtf8((String)var1);
                  this.banId_ = var2;
                  return var2;
               } else {
                  return (ByteString)var1;
               }
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setBanId(String var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.banId_ = var1;
               this.bitField0_ |= 2;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearBanId() {
               this.banId_ = MinecraftIdentity.Attributes.BannedScope.getDefaultInstance().getBanId();
               this.bitField0_ &= -3;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setBanIdBytes(ByteString var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               MinecraftIdentity.Attributes.BannedScope.checkByteStringIsUtf8(var1);
               this.banId_ = var1;
               this.bitField0_ |= 2;
               this.onChanged();
               return this;
            }

            @Override
            public boolean hasExpires() {
               return (this.bitField0_ & 4) != 0;
            }

            @Override
            public Timestamp getExpires() {
               if (this.expiresBuilder_ == null) {
                  return this.expires_ == null ? Timestamp.getDefaultInstance() : this.expires_;
               } else {
                  return this.expiresBuilder_.getMessage();
               }
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setExpires(Timestamp var1) {
               if (this.expiresBuilder_ == null) {
                  if (var1 == null) {
                     throw new NullPointerException();
                  }

                  this.expires_ = var1;
               } else {
                  this.expiresBuilder_.setMessage(var1);
               }

               this.bitField0_ |= 4;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setExpires(Timestamp.Builder var1) {
               if (this.expiresBuilder_ == null) {
                  this.expires_ = var1.build();
               } else {
                  this.expiresBuilder_.setMessage(var1.build());
               }

               this.bitField0_ |= 4;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder mergeExpires(Timestamp var1) {
               if (this.expiresBuilder_ == null) {
                  if ((this.bitField0_ & 4) != 0 && this.expires_ != null && this.expires_ != Timestamp.getDefaultInstance()) {
                     this.getExpiresBuilder().mergeFrom(var1);
                  } else {
                     this.expires_ = var1;
                  }
               } else {
                  this.expiresBuilder_.mergeFrom(var1);
               }

               if (this.expires_ != null) {
                  this.bitField0_ |= 4;
                  this.onChanged();
               }

               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearExpires() {
               this.bitField0_ &= -5;
               this.expires_ = null;
               if (this.expiresBuilder_ != null) {
                  this.expiresBuilder_.dispose();
                  this.expiresBuilder_ = null;
               }

               this.onChanged();
               return this;
            }

            public Timestamp.Builder getExpiresBuilder() {
               this.bitField0_ |= 4;
               this.onChanged();
               return this.getExpiresFieldBuilder().getBuilder();
            }

            @Override
            public TimestampOrBuilder getExpiresOrBuilder() {
               if (this.expiresBuilder_ != null) {
                  return this.expiresBuilder_.getMessageOrBuilder();
               } else {
                  return this.expires_ == null ? Timestamp.getDefaultInstance() : this.expires_;
               }
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getExpiresFieldBuilder() {
               if (this.expiresBuilder_ == null) {
                  this.expiresBuilder_ = new SingleFieldBuilderV3<>(this.getExpires(), this.getParentForChildren(), this.isClean());
                  this.expires_ = null;
               }

               return this.expiresBuilder_;
            }

            @Override
            public String getReason() {
               Object var1 = this.reason_;
               if (!(var1 instanceof String)) {
                  ByteString var2 = (ByteString)var1;
                  String var3 = var2.toStringUtf8();
                  this.reason_ = var3;
                  return var3;
               } else {
                  return (String)var1;
               }
            }

            @Override
            public ByteString getReasonBytes() {
               Object var1 = this.reason_;
               if (var1 instanceof String) {
                  ByteString var2 = ByteString.copyFromUtf8((String)var1);
                  this.reason_ = var2;
                  return var2;
               } else {
                  return (ByteString)var1;
               }
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setReason(String var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.reason_ = var1;
               this.bitField0_ |= 8;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearReason() {
               this.reason_ = MinecraftIdentity.Attributes.BannedScope.getDefaultInstance().getReason();
               this.bitField0_ &= -9;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setReasonBytes(ByteString var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               MinecraftIdentity.Attributes.BannedScope.checkByteStringIsUtf8(var1);
               this.reason_ = var1;
               this.bitField0_ |= 8;
               this.onChanged();
               return this;
            }

            @Override
            public String getReasonMessage() {
               Object var1 = this.reasonMessage_;
               if (!(var1 instanceof String)) {
                  ByteString var2 = (ByteString)var1;
                  String var3 = var2.toStringUtf8();
                  this.reasonMessage_ = var3;
                  return var3;
               } else {
                  return (String)var1;
               }
            }

            @Override
            public ByteString getReasonMessageBytes() {
               Object var1 = this.reasonMessage_;
               if (var1 instanceof String) {
                  ByteString var2 = ByteString.copyFromUtf8((String)var1);
                  this.reasonMessage_ = var2;
                  return var2;
               } else {
                  return (ByteString)var1;
               }
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setReasonMessage(String var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.reasonMessage_ = var1;
               this.bitField0_ |= 16;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder clearReasonMessage() {
               this.reasonMessage_ = MinecraftIdentity.Attributes.BannedScope.getDefaultInstance().getReasonMessage();
               this.bitField0_ &= -17;
               this.onChanged();
               return this;
            }

            public MinecraftIdentity.Attributes.BannedScope.Builder setReasonMessageBytes(ByteString var1) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               MinecraftIdentity.Attributes.BannedScope.checkByteStringIsUtf8(var1);
               this.reasonMessage_ = var1;
               this.bitField0_ |= 16;
               this.onChanged();
               return this;
            }

            public final MinecraftIdentity.Attributes.BannedScope.Builder setUnknownFields(UnknownFieldSet var1) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.setUnknownFields(var1);
            }

            public final MinecraftIdentity.Attributes.BannedScope.Builder mergeUnknownFields(UnknownFieldSet var1) {
               return (MinecraftIdentity.Attributes.BannedScope.Builder)super.mergeUnknownFields(var1);
            }
         }

         public enum Type implements ProtocolMessageEnum {
            TYPE_UNSPECIFIED(0),
            TYPE_MULTIPLAYER(1),
            UNRECOGNIZED(-1);

            public static final int TYPE_UNSPECIFIED_VALUE = 0;
            public static final int TYPE_MULTIPLAYER_VALUE = 1;
            private static final Internal.EnumLiteMap<MinecraftIdentity.Attributes.BannedScope.Type> internalValueMap = new Internal.EnumLiteMap<MinecraftIdentity.Attributes.BannedScope.Type>() {
               public MinecraftIdentity.Attributes.BannedScope.Type findValueByNumber(int var1) {
                  return MinecraftIdentity.Attributes.BannedScope.Type.forNumber(var1);
               }
            };
            private static final MinecraftIdentity.Attributes.BannedScope.Type[] VALUES = values();
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
            public static MinecraftIdentity.Attributes.BannedScope.Type valueOf(int var0) {
               return forNumber(var0);
            }

            public static MinecraftIdentity.Attributes.BannedScope.Type forNumber(int var0) {
               switch (var0) {
                  case 0:
                     return TYPE_UNSPECIFIED;
                  case 1:
                     return TYPE_MULTIPLAYER;
                  default:
                     return null;
               }
            }

            public static Internal.EnumLiteMap<MinecraftIdentity.Attributes.BannedScope.Type> internalGetValueMap() {
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
               return MinecraftIdentity.Attributes.BannedScope.getDescriptor().getEnumTypes().get(0);
            }

            public static MinecraftIdentity.Attributes.BannedScope.Type valueOf(Descriptors.EnumValueDescriptor var0) {
               if (var0.getType() != getDescriptor()) {
                  throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
               } else {
                  return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
               }
            }

            Type(int var3) {
               this.value = var3;
            }
         }
      }

      public interface BannedScopeOrBuilder extends MessageOrBuilder {
         int getTypeValue();

         MinecraftIdentity.Attributes.BannedScope.Type getType();

         String getBanId();

         ByteString getBanIdBytes();

         boolean hasExpires();

         Timestamp getExpires();

         TimestampOrBuilder getExpiresOrBuilder();

         String getReason();

         ByteString getReasonBytes();

         String getReasonMessage();

         ByteString getReasonMessageBytes();
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<MinecraftIdentity.Attributes.Builder>
         implements MinecraftIdentity.AttributesOrBuilder {
         private int bitField0_;
         private boolean priviledgeOnlineChat_;
         private boolean priviledgeMultiplayerServer_;
         private boolean priviledgeMultiplayerRealms_;
         private boolean priviledgeTelemetry_;
         private boolean priviledgeOptionalTelemetry_;
         private boolean profanityFilterRealms_;
         private List<MinecraftIdentity.Attributes.BannedScope> bannedScopes_ = Collections.emptyList();
         private RepeatedFieldBuilderV3<MinecraftIdentity.Attributes.BannedScope, MinecraftIdentity.Attributes.BannedScope.Builder, MinecraftIdentity.Attributes.BannedScopeOrBuilder> bannedScopesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_fieldAccessorTable
               .ensureFieldAccessorsInitialized(MinecraftIdentity.Attributes.class, MinecraftIdentity.Attributes.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public MinecraftIdentity.Attributes.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.priviledgeOnlineChat_ = false;
            this.priviledgeMultiplayerServer_ = false;
            this.priviledgeMultiplayerRealms_ = false;
            this.priviledgeTelemetry_ = false;
            this.priviledgeOptionalTelemetry_ = false;
            this.profanityFilterRealms_ = false;
            if (this.bannedScopesBuilder_ == null) {
               this.bannedScopes_ = Collections.emptyList();
            } else {
               this.bannedScopes_ = null;
               this.bannedScopesBuilder_.clear();
            }

            this.bitField0_ &= -65;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Attributes_descriptor;
         }

         public MinecraftIdentity.Attributes getDefaultInstanceForType() {
            return MinecraftIdentity.Attributes.getDefaultInstance();
         }

         public MinecraftIdentity.Attributes build() {
            MinecraftIdentity.Attributes var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public MinecraftIdentity.Attributes buildPartial() {
            MinecraftIdentity.Attributes var1 = new MinecraftIdentity.Attributes(this);
            this.buildPartialRepeatedFields(var1);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartialRepeatedFields(MinecraftIdentity.Attributes var1) {
            if (this.bannedScopesBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.bannedScopes_ = Collections.unmodifiableList(this.bannedScopes_);
                  this.bitField0_ &= -65;
               }

               var1.bannedScopes_ = this.bannedScopes_;
            } else {
               var1.bannedScopes_ = this.bannedScopesBuilder_.build();
            }
         }

         private void buildPartial0(MinecraftIdentity.Attributes var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.priviledgeOnlineChat_ = this.priviledgeOnlineChat_;
            }

            if ((var2 & 2) != 0) {
               var1.priviledgeMultiplayerServer_ = this.priviledgeMultiplayerServer_;
            }

            if ((var2 & 4) != 0) {
               var1.priviledgeMultiplayerRealms_ = this.priviledgeMultiplayerRealms_;
            }

            if ((var2 & 8) != 0) {
               var1.priviledgeTelemetry_ = this.priviledgeTelemetry_;
            }

            if ((var2 & 16) != 0) {
               var1.priviledgeOptionalTelemetry_ = this.priviledgeOptionalTelemetry_;
            }

            if ((var2 & 32) != 0) {
               var1.profanityFilterRealms_ = this.profanityFilterRealms_;
            }
         }

         public MinecraftIdentity.Attributes.Builder clone() {
            return (MinecraftIdentity.Attributes.Builder)super.clone();
         }

         public MinecraftIdentity.Attributes.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.Attributes.Builder)super.setField(var1, var2);
         }

         public MinecraftIdentity.Attributes.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (MinecraftIdentity.Attributes.Builder)super.clearField(var1);
         }

         public MinecraftIdentity.Attributes.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (MinecraftIdentity.Attributes.Builder)super.clearOneof(var1);
         }

         public MinecraftIdentity.Attributes.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (MinecraftIdentity.Attributes.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public MinecraftIdentity.Attributes.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.Attributes.Builder)super.addRepeatedField(var1, var2);
         }

         public MinecraftIdentity.Attributes.Builder mergeFrom(Message var1) {
            if (var1 instanceof MinecraftIdentity.Attributes) {
               return this.mergeFrom((MinecraftIdentity.Attributes)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public MinecraftIdentity.Attributes.Builder mergeFrom(MinecraftIdentity.Attributes var1) {
            if (var1 == MinecraftIdentity.Attributes.getDefaultInstance()) {
               return this;
            }

            if (var1.getPriviledgeOnlineChat()) {
               this.setPriviledgeOnlineChat(var1.getPriviledgeOnlineChat());
            }

            if (var1.getPriviledgeMultiplayerServer()) {
               this.setPriviledgeMultiplayerServer(var1.getPriviledgeMultiplayerServer());
            }

            if (var1.getPriviledgeMultiplayerRealms()) {
               this.setPriviledgeMultiplayerRealms(var1.getPriviledgeMultiplayerRealms());
            }

            if (var1.getPriviledgeTelemetry()) {
               this.setPriviledgeTelemetry(var1.getPriviledgeTelemetry());
            }

            if (var1.getPriviledgeOptionalTelemetry()) {
               this.setPriviledgeOptionalTelemetry(var1.getPriviledgeOptionalTelemetry());
            }

            if (var1.getProfanityFilterRealms()) {
               this.setProfanityFilterRealms(var1.getProfanityFilterRealms());
            }

            if (this.bannedScopesBuilder_ == null) {
               if (!var1.bannedScopes_.isEmpty()) {
                  if (this.bannedScopes_.isEmpty()) {
                     this.bannedScopes_ = var1.bannedScopes_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureBannedScopesIsMutable();
                     this.bannedScopes_.addAll(var1.bannedScopes_);
                  }

                  this.onChanged();
               }
            } else if (!var1.bannedScopes_.isEmpty()) {
               if (this.bannedScopesBuilder_.isEmpty()) {
                  this.bannedScopesBuilder_.dispose();
                  this.bannedScopesBuilder_ = null;
                  this.bannedScopes_ = var1.bannedScopes_;
                  this.bitField0_ &= -65;
                  this.bannedScopesBuilder_ = MinecraftIdentity.Attributes.alwaysUseFieldBuilders ? this.getBannedScopesFieldBuilder() : null;
               } else {
                  this.bannedScopesBuilder_.addAllMessages(var1.bannedScopes_);
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

         public MinecraftIdentity.Attributes.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        this.priviledgeOnlineChat_ = var1.readBool();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.priviledgeMultiplayerServer_ = var1.readBool();
                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.priviledgeMultiplayerRealms_ = var1.readBool();
                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.priviledgeTelemetry_ = var1.readBool();
                        this.bitField0_ |= 8;
                        break;
                     case 40:
                        this.priviledgeOptionalTelemetry_ = var1.readBool();
                        this.bitField0_ |= 16;
                        break;
                     case 48:
                        this.profanityFilterRealms_ = var1.readBool();
                        this.bitField0_ |= 32;
                        break;
                     case 58:
                        MinecraftIdentity.Attributes.BannedScope var5 = var1.readMessage(MinecraftIdentity.Attributes.BannedScope.parser(), var2);
                        if (this.bannedScopesBuilder_ == null) {
                           this.ensureBannedScopesIsMutable();
                           this.bannedScopes_.add(var5);
                        } else {
                           this.bannedScopesBuilder_.addMessage(var5);
                        }
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
         public boolean getPriviledgeOnlineChat() {
            return this.priviledgeOnlineChat_;
         }

         public MinecraftIdentity.Attributes.Builder setPriviledgeOnlineChat(boolean var1) {
            this.priviledgeOnlineChat_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearPriviledgeOnlineChat() {
            this.bitField0_ &= -2;
            this.priviledgeOnlineChat_ = false;
            this.onChanged();
            return this;
         }

         @Override
         public boolean getPriviledgeMultiplayerServer() {
            return this.priviledgeMultiplayerServer_;
         }

         public MinecraftIdentity.Attributes.Builder setPriviledgeMultiplayerServer(boolean var1) {
            this.priviledgeMultiplayerServer_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearPriviledgeMultiplayerServer() {
            this.bitField0_ &= -3;
            this.priviledgeMultiplayerServer_ = false;
            this.onChanged();
            return this;
         }

         @Override
         public boolean getPriviledgeMultiplayerRealms() {
            return this.priviledgeMultiplayerRealms_;
         }

         public MinecraftIdentity.Attributes.Builder setPriviledgeMultiplayerRealms(boolean var1) {
            this.priviledgeMultiplayerRealms_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearPriviledgeMultiplayerRealms() {
            this.bitField0_ &= -5;
            this.priviledgeMultiplayerRealms_ = false;
            this.onChanged();
            return this;
         }

         @Override
         public boolean getPriviledgeTelemetry() {
            return this.priviledgeTelemetry_;
         }

         public MinecraftIdentity.Attributes.Builder setPriviledgeTelemetry(boolean var1) {
            this.priviledgeTelemetry_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearPriviledgeTelemetry() {
            this.bitField0_ &= -9;
            this.priviledgeTelemetry_ = false;
            this.onChanged();
            return this;
         }

         @Override
         public boolean getPriviledgeOptionalTelemetry() {
            return this.priviledgeOptionalTelemetry_;
         }

         public MinecraftIdentity.Attributes.Builder setPriviledgeOptionalTelemetry(boolean var1) {
            this.priviledgeOptionalTelemetry_ = var1;
            this.bitField0_ |= 16;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearPriviledgeOptionalTelemetry() {
            this.bitField0_ &= -17;
            this.priviledgeOptionalTelemetry_ = false;
            this.onChanged();
            return this;
         }

         @Override
         public boolean getProfanityFilterRealms() {
            return this.profanityFilterRealms_;
         }

         public MinecraftIdentity.Attributes.Builder setProfanityFilterRealms(boolean var1) {
            this.profanityFilterRealms_ = var1;
            this.bitField0_ |= 32;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearProfanityFilterRealms() {
            this.bitField0_ &= -33;
            this.profanityFilterRealms_ = false;
            this.onChanged();
            return this;
         }

         private void ensureBannedScopesIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.bannedScopes_ = new ArrayList<>(this.bannedScopes_);
               this.bitField0_ |= 64;
            }
         }

         @Override
         public List<MinecraftIdentity.Attributes.BannedScope> getBannedScopesList() {
            return this.bannedScopesBuilder_ == null ? Collections.unmodifiableList(this.bannedScopes_) : this.bannedScopesBuilder_.getMessageList();
         }

         @Override
         public int getBannedScopesCount() {
            return this.bannedScopesBuilder_ == null ? this.bannedScopes_.size() : this.bannedScopesBuilder_.getCount();
         }

         @Override
         public MinecraftIdentity.Attributes.BannedScope getBannedScopes(int var1) {
            return this.bannedScopesBuilder_ == null ? this.bannedScopes_.get(var1) : this.bannedScopesBuilder_.getMessage(var1);
         }

         public MinecraftIdentity.Attributes.Builder setBannedScopes(int var1, MinecraftIdentity.Attributes.BannedScope var2) {
            if (this.bannedScopesBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.set(var1, var2);
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.setMessage(var1, var2);
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder setBannedScopes(int var1, MinecraftIdentity.Attributes.BannedScope.Builder var2) {
            if (this.bannedScopesBuilder_ == null) {
               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.set(var1, var2.build());
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.setMessage(var1, var2.build());
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder addBannedScopes(MinecraftIdentity.Attributes.BannedScope var1) {
            if (this.bannedScopesBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.add(var1);
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.addMessage(var1);
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder addBannedScopes(int var1, MinecraftIdentity.Attributes.BannedScope var2) {
            if (this.bannedScopesBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.add(var1, var2);
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.addMessage(var1, var2);
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder addBannedScopes(MinecraftIdentity.Attributes.BannedScope.Builder var1) {
            if (this.bannedScopesBuilder_ == null) {
               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.add(var1.build());
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.addMessage(var1.build());
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder addBannedScopes(int var1, MinecraftIdentity.Attributes.BannedScope.Builder var2) {
            if (this.bannedScopesBuilder_ == null) {
               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.add(var1, var2.build());
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.addMessage(var1, var2.build());
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder addAllBannedScopes(Iterable<? extends MinecraftIdentity.Attributes.BannedScope> var1) {
            if (this.bannedScopesBuilder_ == null) {
               this.ensureBannedScopesIsMutable();
               AbstractMessageLite.Builder.addAll(var1, this.bannedScopes_);
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.addAllMessages(var1);
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder clearBannedScopes() {
            if (this.bannedScopesBuilder_ == null) {
               this.bannedScopes_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.clear();
            }

            return this;
         }

         public MinecraftIdentity.Attributes.Builder removeBannedScopes(int var1) {
            if (this.bannedScopesBuilder_ == null) {
               this.ensureBannedScopesIsMutable();
               this.bannedScopes_.remove(var1);
               this.onChanged();
            } else {
               this.bannedScopesBuilder_.remove(var1);
            }

            return this;
         }

         public MinecraftIdentity.Attributes.BannedScope.Builder getBannedScopesBuilder(int var1) {
            return this.getBannedScopesFieldBuilder().getBuilder(var1);
         }

         @Override
         public MinecraftIdentity.Attributes.BannedScopeOrBuilder getBannedScopesOrBuilder(int var1) {
            return this.bannedScopesBuilder_ == null ? this.bannedScopes_.get(var1) : this.bannedScopesBuilder_.getMessageOrBuilder(var1);
         }

         @Override
         public List<? extends MinecraftIdentity.Attributes.BannedScopeOrBuilder> getBannedScopesOrBuilderList() {
            return this.bannedScopesBuilder_ != null ? this.bannedScopesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.bannedScopes_);
         }

         public MinecraftIdentity.Attributes.BannedScope.Builder addBannedScopesBuilder() {
            return this.getBannedScopesFieldBuilder().addBuilder(MinecraftIdentity.Attributes.BannedScope.getDefaultInstance());
         }

         public MinecraftIdentity.Attributes.BannedScope.Builder addBannedScopesBuilder(int var1) {
            return this.getBannedScopesFieldBuilder().addBuilder(var1, MinecraftIdentity.Attributes.BannedScope.getDefaultInstance());
         }

         public List<MinecraftIdentity.Attributes.BannedScope.Builder> getBannedScopesBuilderList() {
            return this.getBannedScopesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MinecraftIdentity.Attributes.BannedScope, MinecraftIdentity.Attributes.BannedScope.Builder, MinecraftIdentity.Attributes.BannedScopeOrBuilder> getBannedScopesFieldBuilder() {
            if (this.bannedScopesBuilder_ == null) {
               this.bannedScopesBuilder_ = new RepeatedFieldBuilderV3<>(
                  this.bannedScopes_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean()
               );
               this.bannedScopes_ = null;
            }

            return this.bannedScopesBuilder_;
         }

         public final MinecraftIdentity.Attributes.Builder setUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.Attributes.Builder)super.setUnknownFields(var1);
         }

         public final MinecraftIdentity.Attributes.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.Attributes.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface AttributesOrBuilder extends MessageOrBuilder {
      boolean getPriviledgeOnlineChat();

      boolean getPriviledgeMultiplayerServer();

      boolean getPriviledgeMultiplayerRealms();

      boolean getPriviledgeTelemetry();

      boolean getPriviledgeOptionalTelemetry();

      boolean getProfanityFilterRealms();

      List<MinecraftIdentity.Attributes.BannedScope> getBannedScopesList();

      MinecraftIdentity.Attributes.BannedScope getBannedScopes(int var1);

      int getBannedScopesCount();

      List<? extends MinecraftIdentity.Attributes.BannedScopeOrBuilder> getBannedScopesOrBuilderList();

      MinecraftIdentity.Attributes.BannedScopeOrBuilder getBannedScopesOrBuilder(int var1);
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MinecraftIdentity.Builder> implements MinecraftIdentityOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
      private int type_ = 0;
      private Object authenticatorJwt_ = "";
      private List<MinecraftIdentity.Skin> skins_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<MinecraftIdentity.Skin, MinecraftIdentity.Skin.Builder, MinecraftIdentity.SkinOrBuilder> skinsBuilder_;
      private List<MinecraftIdentity.Cape> capes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<MinecraftIdentity.Cape, MinecraftIdentity.Cape.Builder, MinecraftIdentity.CapeOrBuilder> capesBuilder_;
      private MinecraftIdentity.Attributes attributes_;
      private SingleFieldBuilderV3<MinecraftIdentity.Attributes, MinecraftIdentity.Attributes.Builder, MinecraftIdentity.AttributesOrBuilder> attributesBuilder_;
      private Timestamp createdAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> createdAtBuilder_;
      private MinecraftIdentity.NameChange nameChange_;
      private SingleFieldBuilderV3<MinecraftIdentity.NameChange, MinecraftIdentity.NameChange.Builder, MinecraftIdentity.NameChangeOrBuilder> nameChangeBuilder_;
      private boolean ownsBedrockEdition_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftIdentity.class, MinecraftIdentity.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MinecraftIdentity.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
            this.getSkinsFieldBuilder();
            this.getCapesFieldBuilder();
            this.getAttributesFieldBuilder();
            this.getCreatedAtFieldBuilder();
            this.getNameChangeFieldBuilder();
         }
      }

      public MinecraftIdentity.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.type_ = 0;
         this.authenticatorJwt_ = "";
         if (this.skinsBuilder_ == null) {
            this.skins_ = Collections.emptyList();
         } else {
            this.skins_ = null;
            this.skinsBuilder_.clear();
         }

         this.bitField0_ &= -9;
         if (this.capesBuilder_ == null) {
            this.capes_ = Collections.emptyList();
         } else {
            this.capes_ = null;
            this.capesBuilder_.clear();
         }

         this.bitField0_ &= -17;
         this.attributes_ = null;
         if (this.attributesBuilder_ != null) {
            this.attributesBuilder_.dispose();
            this.attributesBuilder_ = null;
         }

         this.createdAt_ = null;
         if (this.createdAtBuilder_ != null) {
            this.createdAtBuilder_.dispose();
            this.createdAtBuilder_ = null;
         }

         this.nameChange_ = null;
         if (this.nameChangeBuilder_ != null) {
            this.nameChangeBuilder_.dispose();
            this.nameChangeBuilder_ = null;
         }

         this.ownsBedrockEdition_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_descriptor;
      }

      public MinecraftIdentity getDefaultInstanceForType() {
         return MinecraftIdentity.getDefaultInstance();
      }

      public MinecraftIdentity build() {
         MinecraftIdentity var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MinecraftIdentity buildPartial() {
         MinecraftIdentity var1 = new MinecraftIdentity(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(MinecraftIdentity var1) {
         if (this.skinsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.skins_ = Collections.unmodifiableList(this.skins_);
               this.bitField0_ &= -9;
            }

            var1.skins_ = this.skins_;
         } else {
            var1.skins_ = this.skinsBuilder_.build();
         }

         if (this.capesBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0) {
               this.capes_ = Collections.unmodifiableList(this.capes_);
               this.bitField0_ &= -17;
            }

            var1.capes_ = this.capes_;
         } else {
            var1.capes_ = this.capesBuilder_.build();
         }
      }

      private void buildPartial0(MinecraftIdentity var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.type_ = this.type_;
         }

         if ((var2 & 4) != 0) {
            var1.authenticatorJwt_ = this.authenticatorJwt_;
         }

         if ((var2 & 32) != 0) {
            var1.attributes_ = this.attributesBuilder_ == null ? this.attributes_ : this.attributesBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 64) != 0) {
            var1.createdAt_ = this.createdAtBuilder_ == null ? this.createdAt_ : this.createdAtBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 128) != 0) {
            var1.nameChange_ = this.nameChangeBuilder_ == null ? this.nameChange_ : this.nameChangeBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 256) != 0) {
            var1.ownsBedrockEdition_ = this.ownsBedrockEdition_;
         }

         MinecraftIdentity var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public MinecraftIdentity.Builder clone() {
         return (MinecraftIdentity.Builder)super.clone();
      }

      public MinecraftIdentity.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MinecraftIdentity.Builder)super.setField(var1, var2);
      }

      public MinecraftIdentity.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MinecraftIdentity.Builder)super.clearField(var1);
      }

      public MinecraftIdentity.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MinecraftIdentity.Builder)super.clearOneof(var1);
      }

      public MinecraftIdentity.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MinecraftIdentity.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MinecraftIdentity.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MinecraftIdentity.Builder)super.addRepeatedField(var1, var2);
      }

      public MinecraftIdentity.Builder mergeFrom(Message var1) {
         if (var1 instanceof MinecraftIdentity) {
            return this.mergeFrom((MinecraftIdentity)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MinecraftIdentity.Builder mergeFrom(MinecraftIdentity var1) {
         if (var1 == MinecraftIdentity.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (!var1.getAuthenticatorJwt().isEmpty()) {
            this.authenticatorJwt_ = var1.authenticatorJwt_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (this.skinsBuilder_ == null) {
            if (!var1.skins_.isEmpty()) {
               if (this.skins_.isEmpty()) {
                  this.skins_ = var1.skins_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureSkinsIsMutable();
                  this.skins_.addAll(var1.skins_);
               }

               this.onChanged();
            }
         } else if (!var1.skins_.isEmpty()) {
            if (this.skinsBuilder_.isEmpty()) {
               this.skinsBuilder_.dispose();
               this.skinsBuilder_ = null;
               this.skins_ = var1.skins_;
               this.bitField0_ &= -9;
               this.skinsBuilder_ = MinecraftIdentity.alwaysUseFieldBuilders ? this.getSkinsFieldBuilder() : null;
            } else {
               this.skinsBuilder_.addAllMessages(var1.skins_);
            }
         }

         if (this.capesBuilder_ == null) {
            if (!var1.capes_.isEmpty()) {
               if (this.capes_.isEmpty()) {
                  this.capes_ = var1.capes_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureCapesIsMutable();
                  this.capes_.addAll(var1.capes_);
               }

               this.onChanged();
            }
         } else if (!var1.capes_.isEmpty()) {
            if (this.capesBuilder_.isEmpty()) {
               this.capesBuilder_.dispose();
               this.capesBuilder_ = null;
               this.capes_ = var1.capes_;
               this.bitField0_ &= -17;
               this.capesBuilder_ = MinecraftIdentity.alwaysUseFieldBuilders ? this.getCapesFieldBuilder() : null;
            } else {
               this.capesBuilder_.addAllMessages(var1.capes_);
            }
         }

         if (var1.hasAttributes()) {
            this.mergeAttributes(var1.getAttributes());
         }

         if (var1.hasCreatedAt()) {
            this.mergeCreatedAt(var1.getCreatedAt());
         }

         if (var1.hasNameChange()) {
            this.mergeNameChange(var1.getNameChange());
         }

         if (var1.getOwnsBedrockEdition()) {
            this.setOwnsBedrockEdition(var1.getOwnsBedrockEdition());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MinecraftIdentity.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.authenticatorJwt_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     MinecraftIdentity.Skin var11 = var1.readMessage(MinecraftIdentity.Skin.parser(), var2);
                     if (this.skinsBuilder_ == null) {
                        this.ensureSkinsIsMutable();
                        this.skins_.add(var11);
                     } else {
                        this.skinsBuilder_.addMessage(var11);
                     }
                     break;
                  case 42:
                     MinecraftIdentity.Cape var5 = var1.readMessage(MinecraftIdentity.Cape.parser(), var2);
                     if (this.capesBuilder_ == null) {
                        this.ensureCapesIsMutable();
                        this.capes_.add(var5);
                     } else {
                        this.capesBuilder_.addMessage(var5);
                     }
                     break;
                  case 50:
                     var1.readMessage(this.getAttributesFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 66:
                     var1.readMessage(this.getCreatedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 74:
                     var1.readMessage(this.getNameChangeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 80:
                     this.ownsBedrockEdition_ = var1.readBool();
                     this.bitField0_ |= 256;
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

      public MinecraftIdentity.Builder setPlayer(UuidAndUsername var1) {
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

      public MinecraftIdentity.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder mergePlayer(UuidAndUsername var1) {
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

      public MinecraftIdentity.Builder clearPlayer() {
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
      public int getTypeValue() {
         return this.type_;
      }

      public MinecraftIdentity.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public MinecraftIdentity.Type getType() {
         MinecraftIdentity.Type var1 = MinecraftIdentity.Type.forNumber(this.type_);
         return var1 == null ? MinecraftIdentity.Type.UNRECOGNIZED : var1;
      }

      public MinecraftIdentity.Builder setType(MinecraftIdentity.Type var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder clearType() {
         this.bitField0_ &= -3;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getAuthenticatorJwt() {
         Object var1 = this.authenticatorJwt_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.authenticatorJwt_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAuthenticatorJwtBytes() {
         Object var1 = this.authenticatorJwt_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.authenticatorJwt_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MinecraftIdentity.Builder setAuthenticatorJwt(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.authenticatorJwt_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder clearAuthenticatorJwt() {
         this.authenticatorJwt_ = MinecraftIdentity.getDefaultInstance().getAuthenticatorJwt();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder setAuthenticatorJwtBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         MinecraftIdentity.checkByteStringIsUtf8(var1);
         this.authenticatorJwt_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      private void ensureSkinsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.skins_ = new ArrayList<>(this.skins_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<MinecraftIdentity.Skin> getSkinsList() {
         return this.skinsBuilder_ == null ? Collections.unmodifiableList(this.skins_) : this.skinsBuilder_.getMessageList();
      }

      @Override
      public int getSkinsCount() {
         return this.skinsBuilder_ == null ? this.skins_.size() : this.skinsBuilder_.getCount();
      }

      @Override
      public MinecraftIdentity.Skin getSkins(int var1) {
         return this.skinsBuilder_ == null ? this.skins_.get(var1) : this.skinsBuilder_.getMessage(var1);
      }

      public MinecraftIdentity.Builder setSkins(int var1, MinecraftIdentity.Skin var2) {
         if (this.skinsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSkinsIsMutable();
            this.skins_.set(var1, var2);
            this.onChanged();
         } else {
            this.skinsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public MinecraftIdentity.Builder setSkins(int var1, MinecraftIdentity.Skin.Builder var2) {
         if (this.skinsBuilder_ == null) {
            this.ensureSkinsIsMutable();
            this.skins_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.skinsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public MinecraftIdentity.Builder addSkins(MinecraftIdentity.Skin var1) {
         if (this.skinsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureSkinsIsMutable();
            this.skins_.add(var1);
            this.onChanged();
         } else {
            this.skinsBuilder_.addMessage(var1);
         }

         return this;
      }

      public MinecraftIdentity.Builder addSkins(int var1, MinecraftIdentity.Skin var2) {
         if (this.skinsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSkinsIsMutable();
            this.skins_.add(var1, var2);
            this.onChanged();
         } else {
            this.skinsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public MinecraftIdentity.Builder addSkins(MinecraftIdentity.Skin.Builder var1) {
         if (this.skinsBuilder_ == null) {
            this.ensureSkinsIsMutable();
            this.skins_.add(var1.build());
            this.onChanged();
         } else {
            this.skinsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public MinecraftIdentity.Builder addSkins(int var1, MinecraftIdentity.Skin.Builder var2) {
         if (this.skinsBuilder_ == null) {
            this.ensureSkinsIsMutable();
            this.skins_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.skinsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public MinecraftIdentity.Builder addAllSkins(Iterable<? extends MinecraftIdentity.Skin> var1) {
         if (this.skinsBuilder_ == null) {
            this.ensureSkinsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.skins_);
            this.onChanged();
         } else {
            this.skinsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public MinecraftIdentity.Builder clearSkins() {
         if (this.skinsBuilder_ == null) {
            this.skins_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.skinsBuilder_.clear();
         }

         return this;
      }

      public MinecraftIdentity.Builder removeSkins(int var1) {
         if (this.skinsBuilder_ == null) {
            this.ensureSkinsIsMutable();
            this.skins_.remove(var1);
            this.onChanged();
         } else {
            this.skinsBuilder_.remove(var1);
         }

         return this;
      }

      public MinecraftIdentity.Skin.Builder getSkinsBuilder(int var1) {
         return this.getSkinsFieldBuilder().getBuilder(var1);
      }

      @Override
      public MinecraftIdentity.SkinOrBuilder getSkinsOrBuilder(int var1) {
         return this.skinsBuilder_ == null ? this.skins_.get(var1) : this.skinsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends MinecraftIdentity.SkinOrBuilder> getSkinsOrBuilderList() {
         return this.skinsBuilder_ != null ? this.skinsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.skins_);
      }

      public MinecraftIdentity.Skin.Builder addSkinsBuilder() {
         return this.getSkinsFieldBuilder().addBuilder(MinecraftIdentity.Skin.getDefaultInstance());
      }

      public MinecraftIdentity.Skin.Builder addSkinsBuilder(int var1) {
         return this.getSkinsFieldBuilder().addBuilder(var1, MinecraftIdentity.Skin.getDefaultInstance());
      }

      public List<MinecraftIdentity.Skin.Builder> getSkinsBuilderList() {
         return this.getSkinsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<MinecraftIdentity.Skin, MinecraftIdentity.Skin.Builder, MinecraftIdentity.SkinOrBuilder> getSkinsFieldBuilder() {
         if (this.skinsBuilder_ == null) {
            this.skinsBuilder_ = new RepeatedFieldBuilderV3<>(this.skins_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.skins_ = null;
         }

         return this.skinsBuilder_;
      }

      private void ensureCapesIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.capes_ = new ArrayList<>(this.capes_);
            this.bitField0_ |= 16;
         }
      }

      @Override
      public List<MinecraftIdentity.Cape> getCapesList() {
         return this.capesBuilder_ == null ? Collections.unmodifiableList(this.capes_) : this.capesBuilder_.getMessageList();
      }

      @Override
      public int getCapesCount() {
         return this.capesBuilder_ == null ? this.capes_.size() : this.capesBuilder_.getCount();
      }

      @Override
      public MinecraftIdentity.Cape getCapes(int var1) {
         return this.capesBuilder_ == null ? this.capes_.get(var1) : this.capesBuilder_.getMessage(var1);
      }

      public MinecraftIdentity.Builder setCapes(int var1, MinecraftIdentity.Cape var2) {
         if (this.capesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCapesIsMutable();
            this.capes_.set(var1, var2);
            this.onChanged();
         } else {
            this.capesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public MinecraftIdentity.Builder setCapes(int var1, MinecraftIdentity.Cape.Builder var2) {
         if (this.capesBuilder_ == null) {
            this.ensureCapesIsMutable();
            this.capes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.capesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public MinecraftIdentity.Builder addCapes(MinecraftIdentity.Cape var1) {
         if (this.capesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureCapesIsMutable();
            this.capes_.add(var1);
            this.onChanged();
         } else {
            this.capesBuilder_.addMessage(var1);
         }

         return this;
      }

      public MinecraftIdentity.Builder addCapes(int var1, MinecraftIdentity.Cape var2) {
         if (this.capesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCapesIsMutable();
            this.capes_.add(var1, var2);
            this.onChanged();
         } else {
            this.capesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public MinecraftIdentity.Builder addCapes(MinecraftIdentity.Cape.Builder var1) {
         if (this.capesBuilder_ == null) {
            this.ensureCapesIsMutable();
            this.capes_.add(var1.build());
            this.onChanged();
         } else {
            this.capesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public MinecraftIdentity.Builder addCapes(int var1, MinecraftIdentity.Cape.Builder var2) {
         if (this.capesBuilder_ == null) {
            this.ensureCapesIsMutable();
            this.capes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.capesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public MinecraftIdentity.Builder addAllCapes(Iterable<? extends MinecraftIdentity.Cape> var1) {
         if (this.capesBuilder_ == null) {
            this.ensureCapesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.capes_);
            this.onChanged();
         } else {
            this.capesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public MinecraftIdentity.Builder clearCapes() {
         if (this.capesBuilder_ == null) {
            this.capes_ = Collections.emptyList();
            this.bitField0_ &= -17;
            this.onChanged();
         } else {
            this.capesBuilder_.clear();
         }

         return this;
      }

      public MinecraftIdentity.Builder removeCapes(int var1) {
         if (this.capesBuilder_ == null) {
            this.ensureCapesIsMutable();
            this.capes_.remove(var1);
            this.onChanged();
         } else {
            this.capesBuilder_.remove(var1);
         }

         return this;
      }

      public MinecraftIdentity.Cape.Builder getCapesBuilder(int var1) {
         return this.getCapesFieldBuilder().getBuilder(var1);
      }

      @Override
      public MinecraftIdentity.CapeOrBuilder getCapesOrBuilder(int var1) {
         return this.capesBuilder_ == null ? this.capes_.get(var1) : this.capesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends MinecraftIdentity.CapeOrBuilder> getCapesOrBuilderList() {
         return this.capesBuilder_ != null ? this.capesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.capes_);
      }

      public MinecraftIdentity.Cape.Builder addCapesBuilder() {
         return this.getCapesFieldBuilder().addBuilder(MinecraftIdentity.Cape.getDefaultInstance());
      }

      public MinecraftIdentity.Cape.Builder addCapesBuilder(int var1) {
         return this.getCapesFieldBuilder().addBuilder(var1, MinecraftIdentity.Cape.getDefaultInstance());
      }

      public List<MinecraftIdentity.Cape.Builder> getCapesBuilderList() {
         return this.getCapesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<MinecraftIdentity.Cape, MinecraftIdentity.Cape.Builder, MinecraftIdentity.CapeOrBuilder> getCapesFieldBuilder() {
         if (this.capesBuilder_ == null) {
            this.capesBuilder_ = new RepeatedFieldBuilderV3<>(this.capes_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
            this.capes_ = null;
         }

         return this.capesBuilder_;
      }

      @Override
      public boolean hasAttributes() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public MinecraftIdentity.Attributes getAttributes() {
         if (this.attributesBuilder_ == null) {
            return this.attributes_ == null ? MinecraftIdentity.Attributes.getDefaultInstance() : this.attributes_;
         } else {
            return this.attributesBuilder_.getMessage();
         }
      }

      public MinecraftIdentity.Builder setAttributes(MinecraftIdentity.Attributes var1) {
         if (this.attributesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.attributes_ = var1;
         } else {
            this.attributesBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder setAttributes(MinecraftIdentity.Attributes.Builder var1) {
         if (this.attributesBuilder_ == null) {
            this.attributes_ = var1.build();
         } else {
            this.attributesBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder mergeAttributes(MinecraftIdentity.Attributes var1) {
         if (this.attributesBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.attributes_ != null && this.attributes_ != MinecraftIdentity.Attributes.getDefaultInstance()) {
               this.getAttributesBuilder().mergeFrom(var1);
            } else {
               this.attributes_ = var1;
            }
         } else {
            this.attributesBuilder_.mergeFrom(var1);
         }

         if (this.attributes_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public MinecraftIdentity.Builder clearAttributes() {
         this.bitField0_ &= -33;
         this.attributes_ = null;
         if (this.attributesBuilder_ != null) {
            this.attributesBuilder_.dispose();
            this.attributesBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Attributes.Builder getAttributesBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getAttributesFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftIdentity.AttributesOrBuilder getAttributesOrBuilder() {
         if (this.attributesBuilder_ != null) {
            return this.attributesBuilder_.getMessageOrBuilder();
         } else {
            return this.attributes_ == null ? MinecraftIdentity.Attributes.getDefaultInstance() : this.attributes_;
         }
      }

      private SingleFieldBuilderV3<MinecraftIdentity.Attributes, MinecraftIdentity.Attributes.Builder, MinecraftIdentity.AttributesOrBuilder> getAttributesFieldBuilder() {
         if (this.attributesBuilder_ == null) {
            this.attributesBuilder_ = new SingleFieldBuilderV3<>(this.getAttributes(), this.getParentForChildren(), this.isClean());
            this.attributes_ = null;
         }

         return this.attributesBuilder_;
      }

      @Override
      public boolean hasCreatedAt() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Timestamp getCreatedAt() {
         if (this.createdAtBuilder_ == null) {
            return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
         } else {
            return this.createdAtBuilder_.getMessage();
         }
      }

      public MinecraftIdentity.Builder setCreatedAt(Timestamp var1) {
         if (this.createdAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.createdAt_ = var1;
         } else {
            this.createdAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder setCreatedAt(Timestamp.Builder var1) {
         if (this.createdAtBuilder_ == null) {
            this.createdAt_ = var1.build();
         } else {
            this.createdAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder mergeCreatedAt(Timestamp var1) {
         if (this.createdAtBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.createdAt_ != null && this.createdAt_ != Timestamp.getDefaultInstance()) {
               this.getCreatedAtBuilder().mergeFrom(var1);
            } else {
               this.createdAt_ = var1;
            }
         } else {
            this.createdAtBuilder_.mergeFrom(var1);
         }

         if (this.createdAt_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public MinecraftIdentity.Builder clearCreatedAt() {
         this.bitField0_ &= -65;
         this.createdAt_ = null;
         if (this.createdAtBuilder_ != null) {
            this.createdAtBuilder_.dispose();
            this.createdAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getCreatedAtBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getCreatedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getCreatedAtOrBuilder() {
         if (this.createdAtBuilder_ != null) {
            return this.createdAtBuilder_.getMessageOrBuilder();
         } else {
            return this.createdAt_ == null ? Timestamp.getDefaultInstance() : this.createdAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCreatedAtFieldBuilder() {
         if (this.createdAtBuilder_ == null) {
            this.createdAtBuilder_ = new SingleFieldBuilderV3<>(this.getCreatedAt(), this.getParentForChildren(), this.isClean());
            this.createdAt_ = null;
         }

         return this.createdAtBuilder_;
      }

      @Override
      public boolean hasNameChange() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public MinecraftIdentity.NameChange getNameChange() {
         if (this.nameChangeBuilder_ == null) {
            return this.nameChange_ == null ? MinecraftIdentity.NameChange.getDefaultInstance() : this.nameChange_;
         } else {
            return this.nameChangeBuilder_.getMessage();
         }
      }

      public MinecraftIdentity.Builder setNameChange(MinecraftIdentity.NameChange var1) {
         if (this.nameChangeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.nameChange_ = var1;
         } else {
            this.nameChangeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder setNameChange(MinecraftIdentity.NameChange.Builder var1) {
         if (this.nameChangeBuilder_ == null) {
            this.nameChange_ = var1.build();
         } else {
            this.nameChangeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder mergeNameChange(MinecraftIdentity.NameChange var1) {
         if (this.nameChangeBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.nameChange_ != null && this.nameChange_ != MinecraftIdentity.NameChange.getDefaultInstance()) {
               this.getNameChangeBuilder().mergeFrom(var1);
            } else {
               this.nameChange_ = var1;
            }
         } else {
            this.nameChangeBuilder_.mergeFrom(var1);
         }

         if (this.nameChange_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public MinecraftIdentity.Builder clearNameChange() {
         this.bitField0_ &= -129;
         this.nameChange_ = null;
         if (this.nameChangeBuilder_ != null) {
            this.nameChangeBuilder_.dispose();
            this.nameChangeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftIdentity.NameChange.Builder getNameChangeBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getNameChangeFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftIdentity.NameChangeOrBuilder getNameChangeOrBuilder() {
         if (this.nameChangeBuilder_ != null) {
            return this.nameChangeBuilder_.getMessageOrBuilder();
         } else {
            return this.nameChange_ == null ? MinecraftIdentity.NameChange.getDefaultInstance() : this.nameChange_;
         }
      }

      private SingleFieldBuilderV3<MinecraftIdentity.NameChange, MinecraftIdentity.NameChange.Builder, MinecraftIdentity.NameChangeOrBuilder> getNameChangeFieldBuilder() {
         if (this.nameChangeBuilder_ == null) {
            this.nameChangeBuilder_ = new SingleFieldBuilderV3<>(this.getNameChange(), this.getParentForChildren(), this.isClean());
            this.nameChange_ = null;
         }

         return this.nameChangeBuilder_;
      }

      @Override
      public boolean getOwnsBedrockEdition() {
         return this.ownsBedrockEdition_;
      }

      public MinecraftIdentity.Builder setOwnsBedrockEdition(boolean var1) {
         this.ownsBedrockEdition_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder clearOwnsBedrockEdition() {
         this.bitField0_ &= -257;
         this.ownsBedrockEdition_ = false;
         this.onChanged();
         return this;
      }

      public final MinecraftIdentity.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MinecraftIdentity.Builder)super.setUnknownFields(var1);
      }

      public final MinecraftIdentity.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MinecraftIdentity.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class Cape extends GeneratedMessageV3 implements MinecraftIdentity.CapeOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ID_FIELD_NUMBER = 1;
      private volatile Object id_ = "";
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_ = 0;
      public static final int TEXTURE_ID_FIELD_NUMBER = 3;
      private volatile Object textureId_ = "";
      public static final int ALIAS_FIELD_NUMBER = 4;
      private volatile Object alias_ = "";
      private byte memoizedIsInitialized = -1;
      private static final MinecraftIdentity.Cape DEFAULT_INSTANCE = new MinecraftIdentity.Cape();
      private static final Parser<MinecraftIdentity.Cape> PARSER = new AbstractParser<MinecraftIdentity.Cape>() {
         public MinecraftIdentity.Cape parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            MinecraftIdentity.Cape.Builder var3 = MinecraftIdentity.Cape.newBuilder();

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

      private Cape(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private Cape() {
         this.id_ = "";
         this.state_ = 0;
         this.textureId_ = "";
         this.alias_ = "";
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new MinecraftIdentity.Cape();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftIdentity.Cape.class, MinecraftIdentity.Cape.Builder.class);
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
      public int getStateValue() {
         return this.state_;
      }

      @Override
      public MinecraftIdentity.TextureState getState() {
         MinecraftIdentity.TextureState var1 = MinecraftIdentity.TextureState.forNumber(this.state_);
         return var1 == null ? MinecraftIdentity.TextureState.UNRECOGNIZED : var1;
      }

      @Override
      public String getTextureId() {
         Object var1 = this.textureId_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.textureId_ = var3;
         return var3;
      }

      @Override
      public ByteString getTextureIdBytes() {
         Object var1 = this.textureId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.textureId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Override
      public String getAlias() {
         Object var1 = this.alias_;
         if (var1 instanceof String) {
            return (String)var1;
         }

         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.alias_ = var3;
         return var3;
      }

      @Override
      public ByteString getAliasBytes() {
         Object var1 = this.alias_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.alias_ = var2;
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
         if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
            GeneratedMessageV3.writeString(var1, 1, this.id_);
         }

         if (this.state_ != MinecraftIdentity.TextureState.TEXTURE_STATE_UNSPECIFIED.getNumber()) {
            var1.writeEnum(2, this.state_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.textureId_)) {
            GeneratedMessageV3.writeString(var1, 3, this.textureId_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.alias_)) {
            GeneratedMessageV3.writeString(var1, 4, this.alias_);
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

         if (this.state_ != MinecraftIdentity.TextureState.TEXTURE_STATE_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(2, this.state_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.textureId_)) {
            var1 += GeneratedMessageV3.computeStringSize(3, this.textureId_);
         }

         if (!GeneratedMessageV3.isStringEmpty(this.alias_)) {
            var1 += GeneratedMessageV3.computeStringSize(4, this.alias_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof MinecraftIdentity.Cape)) {
            return super.equals(var1);
         } else {
            MinecraftIdentity.Cape var2 = (MinecraftIdentity.Cape)var1;
            if (!this.getId().equals(var2.getId())) {
               return false;
            } else if (this.state_ != var2.state_) {
               return false;
            } else if (!this.getTextureId().equals(var2.getTextureId())) {
               return false;
            } else {
               return !this.getAlias().equals(var2.getAlias()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 53 * var1 + this.state_;
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getTextureId().hashCode();
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getAlias().hashCode();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static MinecraftIdentity.Cape parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Cape parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Cape parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Cape parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Cape parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Cape parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Cape parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Cape parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.Cape parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Cape parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.Cape parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Cape parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public MinecraftIdentity.Cape.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MinecraftIdentity.Cape.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MinecraftIdentity.Cape.Builder newBuilder(MinecraftIdentity.Cape var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public MinecraftIdentity.Cape.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MinecraftIdentity.Cape.Builder() : new MinecraftIdentity.Cape.Builder().mergeFrom(this);
      }

      protected MinecraftIdentity.Cape.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new MinecraftIdentity.Cape.Builder(var1);
      }

      public static MinecraftIdentity.Cape getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MinecraftIdentity.Cape> parser() {
         return PARSER;
      }

      @Override
      public Parser<MinecraftIdentity.Cape> getParserForType() {
         return PARSER;
      }

      public MinecraftIdentity.Cape getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<MinecraftIdentity.Cape.Builder> implements MinecraftIdentity.CapeOrBuilder {
         private int bitField0_;
         private Object id_ = "";
         private int state_ = 0;
         private Object textureId_ = "";
         private Object alias_ = "";

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_fieldAccessorTable
               .ensureFieldAccessorsInitialized(MinecraftIdentity.Cape.class, MinecraftIdentity.Cape.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public MinecraftIdentity.Cape.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.id_ = "";
            this.state_ = 0;
            this.textureId_ = "";
            this.alias_ = "";
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Cape_descriptor;
         }

         public MinecraftIdentity.Cape getDefaultInstanceForType() {
            return MinecraftIdentity.Cape.getDefaultInstance();
         }

         public MinecraftIdentity.Cape build() {
            MinecraftIdentity.Cape var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public MinecraftIdentity.Cape buildPartial() {
            MinecraftIdentity.Cape var1 = new MinecraftIdentity.Cape(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(MinecraftIdentity.Cape var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.id_ = this.id_;
            }

            if ((var2 & 2) != 0) {
               var1.state_ = this.state_;
            }

            if ((var2 & 4) != 0) {
               var1.textureId_ = this.textureId_;
            }

            if ((var2 & 8) != 0) {
               var1.alias_ = this.alias_;
            }
         }

         public MinecraftIdentity.Cape.Builder clone() {
            return (MinecraftIdentity.Cape.Builder)super.clone();
         }

         public MinecraftIdentity.Cape.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.Cape.Builder)super.setField(var1, var2);
         }

         public MinecraftIdentity.Cape.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (MinecraftIdentity.Cape.Builder)super.clearField(var1);
         }

         public MinecraftIdentity.Cape.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (MinecraftIdentity.Cape.Builder)super.clearOneof(var1);
         }

         public MinecraftIdentity.Cape.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (MinecraftIdentity.Cape.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public MinecraftIdentity.Cape.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.Cape.Builder)super.addRepeatedField(var1, var2);
         }

         public MinecraftIdentity.Cape.Builder mergeFrom(Message var1) {
            if (var1 instanceof MinecraftIdentity.Cape) {
               return this.mergeFrom((MinecraftIdentity.Cape)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public MinecraftIdentity.Cape.Builder mergeFrom(MinecraftIdentity.Cape var1) {
            if (var1 == MinecraftIdentity.Cape.getDefaultInstance()) {
               return this;
            }

            if (!var1.getId().isEmpty()) {
               this.id_ = var1.id_;
               this.bitField0_ |= 1;
               this.onChanged();
            }

            if (var1.state_ != 0) {
               this.setStateValue(var1.getStateValue());
            }

            if (!var1.getTextureId().isEmpty()) {
               this.textureId_ = var1.textureId_;
               this.bitField0_ |= 4;
               this.onChanged();
            }

            if (!var1.getAlias().isEmpty()) {
               this.alias_ = var1.alias_;
               this.bitField0_ |= 8;
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

         public MinecraftIdentity.Cape.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     case 16:
                        this.state_ = var1.readEnum();
                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        this.textureId_ = var1.readStringRequireUtf8();
                        this.bitField0_ |= 4;
                        break;
                     case 34:
                        this.alias_ = var1.readStringRequireUtf8();
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

         public MinecraftIdentity.Cape.Builder setId(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder clearId() {
            this.id_ = MinecraftIdentity.Cape.getDefaultInstance().getId();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder setIdBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            MinecraftIdentity.Cape.checkByteStringIsUtf8(var1);
            this.id_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         @Override
         public int getStateValue() {
            return this.state_;
         }

         public MinecraftIdentity.Cape.Builder setStateValue(int var1) {
            this.state_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         @Override
         public MinecraftIdentity.TextureState getState() {
            MinecraftIdentity.TextureState var1 = MinecraftIdentity.TextureState.forNumber(this.state_);
            return var1 == null ? MinecraftIdentity.TextureState.UNRECOGNIZED : var1;
         }

         public MinecraftIdentity.Cape.Builder setState(MinecraftIdentity.TextureState var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 2;
            this.state_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public String getTextureId() {
            Object var1 = this.textureId_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.textureId_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getTextureIdBytes() {
            Object var1 = this.textureId_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.textureId_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public MinecraftIdentity.Cape.Builder setTextureId(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.textureId_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder clearTextureId() {
            this.textureId_ = MinecraftIdentity.Cape.getDefaultInstance().getTextureId();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder setTextureIdBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            MinecraftIdentity.Cape.checkByteStringIsUtf8(var1);
            this.textureId_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         @Override
         public String getAlias() {
            Object var1 = this.alias_;
            if (!(var1 instanceof String)) {
               ByteString var2 = (ByteString)var1;
               String var3 = var2.toStringUtf8();
               this.alias_ = var3;
               return var3;
            } else {
               return (String)var1;
            }
         }

         @Override
         public ByteString getAliasBytes() {
            Object var1 = this.alias_;
            if (var1 instanceof String) {
               ByteString var2 = ByteString.copyFromUtf8((String)var1);
               this.alias_ = var2;
               return var2;
            } else {
               return (ByteString)var1;
            }
         }

         public MinecraftIdentity.Cape.Builder setAlias(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.alias_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder clearAlias() {
            this.alias_ = MinecraftIdentity.Cape.getDefaultInstance().getAlias();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Cape.Builder setAliasBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            MinecraftIdentity.Cape.checkByteStringIsUtf8(var1);
            this.alias_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public final MinecraftIdentity.Cape.Builder setUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.Cape.Builder)super.setUnknownFields(var1);
         }

         public final MinecraftIdentity.Cape.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.Cape.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface CapeOrBuilder extends MessageOrBuilder {
      String getId();

      ByteString getIdBytes();

      int getStateValue();

      MinecraftIdentity.TextureState getState();

      String getTextureId();

      ByteString getTextureIdBytes();

      String getAlias();

      ByteString getAliasBytes();
   }

   public static final class NameChange extends GeneratedMessageV3 implements MinecraftIdentity.NameChangeOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LAST_CHANGED_AT_FIELD_NUMBER = 1;
      private Timestamp lastChangedAt_;
      public static final int ALLOWED_FIELD_NUMBER = 2;
      private boolean allowed_ = false;
      private byte memoizedIsInitialized = -1;
      private static final MinecraftIdentity.NameChange DEFAULT_INSTANCE = new MinecraftIdentity.NameChange();
      private static final Parser<MinecraftIdentity.NameChange> PARSER = new AbstractParser<MinecraftIdentity.NameChange>() {
         public MinecraftIdentity.NameChange parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            MinecraftIdentity.NameChange.Builder var3 = MinecraftIdentity.NameChange.newBuilder();

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

      private NameChange(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private NameChange() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new MinecraftIdentity.NameChange();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftIdentity.NameChange.class, MinecraftIdentity.NameChange.Builder.class);
      }

      @Override
      public boolean hasLastChangedAt() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Timestamp getLastChangedAt() {
         return this.lastChangedAt_ == null ? Timestamp.getDefaultInstance() : this.lastChangedAt_;
      }

      @Override
      public TimestampOrBuilder getLastChangedAtOrBuilder() {
         return this.lastChangedAt_ == null ? Timestamp.getDefaultInstance() : this.lastChangedAt_;
      }

      @Override
      public boolean getAllowed() {
         return this.allowed_;
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
            var1.writeMessage(1, this.getLastChangedAt());
         }

         if (this.allowed_) {
            var1.writeBool(2, this.allowed_);
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getLastChangedAt());
         }

         if (this.allowed_) {
            var1 += CodedOutputStream.computeBoolSize(2, this.allowed_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof MinecraftIdentity.NameChange)) {
            return super.equals(var1);
         } else {
            MinecraftIdentity.NameChange var2 = (MinecraftIdentity.NameChange)var1;
            if (this.hasLastChangedAt() != var2.hasLastChangedAt()) {
               return false;
            } else if (this.hasLastChangedAt() && !this.getLastChangedAt().equals(var2.getLastChangedAt())) {
               return false;
            } else {
               return this.getAllowed() != var2.getAllowed() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasLastChangedAt()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getLastChangedAt().hashCode();
         }

         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + Internal.hashBoolean(this.getAllowed());
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static MinecraftIdentity.NameChange parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.NameChange parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.NameChange parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.NameChange parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.NameChange parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.NameChange parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.NameChange parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.NameChange parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.NameChange parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.NameChange parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.NameChange parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.NameChange parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public MinecraftIdentity.NameChange.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MinecraftIdentity.NameChange.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MinecraftIdentity.NameChange.Builder newBuilder(MinecraftIdentity.NameChange var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public MinecraftIdentity.NameChange.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MinecraftIdentity.NameChange.Builder() : new MinecraftIdentity.NameChange.Builder().mergeFrom(this);
      }

      protected MinecraftIdentity.NameChange.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new MinecraftIdentity.NameChange.Builder(var1);
      }

      public static MinecraftIdentity.NameChange getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MinecraftIdentity.NameChange> parser() {
         return PARSER;
      }

      @Override
      public Parser<MinecraftIdentity.NameChange> getParserForType() {
         return PARSER;
      }

      public MinecraftIdentity.NameChange getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<MinecraftIdentity.NameChange.Builder>
         implements MinecraftIdentity.NameChangeOrBuilder {
         private int bitField0_;
         private Timestamp lastChangedAt_;
         private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastChangedAtBuilder_;
         private boolean allowed_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_fieldAccessorTable
               .ensureFieldAccessorsInitialized(MinecraftIdentity.NameChange.class, MinecraftIdentity.NameChange.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MinecraftIdentity.NameChange.alwaysUseFieldBuilders) {
               this.getLastChangedAtFieldBuilder();
            }
         }

         public MinecraftIdentity.NameChange.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.lastChangedAt_ = null;
            if (this.lastChangedAtBuilder_ != null) {
               this.lastChangedAtBuilder_.dispose();
               this.lastChangedAtBuilder_ = null;
            }

            this.allowed_ = false;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_NameChange_descriptor;
         }

         public MinecraftIdentity.NameChange getDefaultInstanceForType() {
            return MinecraftIdentity.NameChange.getDefaultInstance();
         }

         public MinecraftIdentity.NameChange build() {
            MinecraftIdentity.NameChange var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public MinecraftIdentity.NameChange buildPartial() {
            MinecraftIdentity.NameChange var1 = new MinecraftIdentity.NameChange(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(MinecraftIdentity.NameChange var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.lastChangedAt_ = this.lastChangedAtBuilder_ == null ? this.lastChangedAt_ : this.lastChangedAtBuilder_.build();
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.allowed_ = this.allowed_;
            }

            MinecraftIdentity.NameChange var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public MinecraftIdentity.NameChange.Builder clone() {
            return (MinecraftIdentity.NameChange.Builder)super.clone();
         }

         public MinecraftIdentity.NameChange.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.NameChange.Builder)super.setField(var1, var2);
         }

         public MinecraftIdentity.NameChange.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (MinecraftIdentity.NameChange.Builder)super.clearField(var1);
         }

         public MinecraftIdentity.NameChange.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (MinecraftIdentity.NameChange.Builder)super.clearOneof(var1);
         }

         public MinecraftIdentity.NameChange.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (MinecraftIdentity.NameChange.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public MinecraftIdentity.NameChange.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.NameChange.Builder)super.addRepeatedField(var1, var2);
         }

         public MinecraftIdentity.NameChange.Builder mergeFrom(Message var1) {
            if (var1 instanceof MinecraftIdentity.NameChange) {
               return this.mergeFrom((MinecraftIdentity.NameChange)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public MinecraftIdentity.NameChange.Builder mergeFrom(MinecraftIdentity.NameChange var1) {
            if (var1 == MinecraftIdentity.NameChange.getDefaultInstance()) {
               return this;
            }

            if (var1.hasLastChangedAt()) {
               this.mergeLastChangedAt(var1.getLastChangedAt());
            }

            if (var1.getAllowed()) {
               this.setAllowed(var1.getAllowed());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public MinecraftIdentity.NameChange.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getLastChangedAtFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.allowed_ = var1.readBool();
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
         public boolean hasLastChangedAt() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public Timestamp getLastChangedAt() {
            if (this.lastChangedAtBuilder_ == null) {
               return this.lastChangedAt_ == null ? Timestamp.getDefaultInstance() : this.lastChangedAt_;
            } else {
               return this.lastChangedAtBuilder_.getMessage();
            }
         }

         public MinecraftIdentity.NameChange.Builder setLastChangedAt(Timestamp var1) {
            if (this.lastChangedAtBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.lastChangedAt_ = var1;
            } else {
               this.lastChangedAtBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.NameChange.Builder setLastChangedAt(Timestamp.Builder var1) {
            if (this.lastChangedAtBuilder_ == null) {
               this.lastChangedAt_ = var1.build();
            } else {
               this.lastChangedAtBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.NameChange.Builder mergeLastChangedAt(Timestamp var1) {
            if (this.lastChangedAtBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.lastChangedAt_ != null && this.lastChangedAt_ != Timestamp.getDefaultInstance()) {
                  this.getLastChangedAtBuilder().mergeFrom(var1);
               } else {
                  this.lastChangedAt_ = var1;
               }
            } else {
               this.lastChangedAtBuilder_.mergeFrom(var1);
            }

            if (this.lastChangedAt_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public MinecraftIdentity.NameChange.Builder clearLastChangedAt() {
            this.bitField0_ &= -2;
            this.lastChangedAt_ = null;
            if (this.lastChangedAtBuilder_ != null) {
               this.lastChangedAtBuilder_.dispose();
               this.lastChangedAtBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Timestamp.Builder getLastChangedAtBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getLastChangedAtFieldBuilder().getBuilder();
         }

         @Override
         public TimestampOrBuilder getLastChangedAtOrBuilder() {
            if (this.lastChangedAtBuilder_ != null) {
               return this.lastChangedAtBuilder_.getMessageOrBuilder();
            } else {
               return this.lastChangedAt_ == null ? Timestamp.getDefaultInstance() : this.lastChangedAt_;
            }
         }

         private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastChangedAtFieldBuilder() {
            if (this.lastChangedAtBuilder_ == null) {
               this.lastChangedAtBuilder_ = new SingleFieldBuilderV3<>(this.getLastChangedAt(), this.getParentForChildren(), this.isClean());
               this.lastChangedAt_ = null;
            }

            return this.lastChangedAtBuilder_;
         }

         @Override
         public boolean getAllowed() {
            return this.allowed_;
         }

         public MinecraftIdentity.NameChange.Builder setAllowed(boolean var1) {
            this.allowed_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.NameChange.Builder clearAllowed() {
            this.bitField0_ &= -3;
            this.allowed_ = false;
            this.onChanged();
            return this;
         }

         public final MinecraftIdentity.NameChange.Builder setUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.NameChange.Builder)super.setUnknownFields(var1);
         }

         public final MinecraftIdentity.NameChange.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.NameChange.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface NameChangeOrBuilder extends MessageOrBuilder {
      boolean hasLastChangedAt();

      Timestamp getLastChangedAt();

      TimestampOrBuilder getLastChangedAtOrBuilder();

      boolean getAllowed();
   }

   public static final class Skin extends GeneratedMessageV3 implements MinecraftIdentity.SkinOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private volatile Object id_ = "";
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_ = 0;
      public static final int SKIN_FIELD_NUMBER = 3;
      private MinecraftSkin skin_;
      private byte memoizedIsInitialized = -1;
      private static final MinecraftIdentity.Skin DEFAULT_INSTANCE = new MinecraftIdentity.Skin();
      private static final Parser<MinecraftIdentity.Skin> PARSER = new AbstractParser<MinecraftIdentity.Skin>() {
         public MinecraftIdentity.Skin parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            MinecraftIdentity.Skin.Builder var3 = MinecraftIdentity.Skin.newBuilder();

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

      private Skin(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private Skin() {
         this.id_ = "";
         this.state_ = 0;
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new MinecraftIdentity.Skin();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftIdentity.Skin.class, MinecraftIdentity.Skin.Builder.class);
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
      public int getStateValue() {
         return this.state_;
      }

      @Override
      public MinecraftIdentity.TextureState getState() {
         MinecraftIdentity.TextureState var1 = MinecraftIdentity.TextureState.forNumber(this.state_);
         return var1 == null ? MinecraftIdentity.TextureState.UNRECOGNIZED : var1;
      }

      @Override
      public boolean hasSkin() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public MinecraftSkin getSkin() {
         return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
      }

      @Override
      public MinecraftSkinOrBuilder getSkinOrBuilder() {
         return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
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

         if (this.state_ != MinecraftIdentity.TextureState.TEXTURE_STATE_UNSPECIFIED.getNumber()) {
            var1.writeEnum(2, this.state_);
         }

         if ((this.bitField0_ & 1) != 0) {
            var1.writeMessage(3, this.getSkin());
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

         if (this.state_ != MinecraftIdentity.TextureState.TEXTURE_STATE_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(2, this.state_);
         }

         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeMessageSize(3, this.getSkin());
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof MinecraftIdentity.Skin)) {
            return super.equals(var1);
         } else {
            MinecraftIdentity.Skin var2 = (MinecraftIdentity.Skin)var1;
            if (!this.getId().equals(var2.getId())) {
               return false;
            } else if (this.state_ != var2.state_) {
               return false;
            } else if (this.hasSkin() != var2.hasSkin()) {
               return false;
            } else {
               return this.hasSkin() && !this.getSkin().equals(var2.getSkin()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         var1 = 53 * var1 + this.state_;
         if (this.hasSkin()) {
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getSkin().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static MinecraftIdentity.Skin parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Skin parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Skin parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Skin parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Skin parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static MinecraftIdentity.Skin parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static MinecraftIdentity.Skin parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Skin parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.Skin parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Skin parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static MinecraftIdentity.Skin parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static MinecraftIdentity.Skin parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public MinecraftIdentity.Skin.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MinecraftIdentity.Skin.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MinecraftIdentity.Skin.Builder newBuilder(MinecraftIdentity.Skin var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public MinecraftIdentity.Skin.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MinecraftIdentity.Skin.Builder() : new MinecraftIdentity.Skin.Builder().mergeFrom(this);
      }

      protected MinecraftIdentity.Skin.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new MinecraftIdentity.Skin.Builder(var1);
      }

      public static MinecraftIdentity.Skin getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MinecraftIdentity.Skin> parser() {
         return PARSER;
      }

      @Override
      public Parser<MinecraftIdentity.Skin> getParserForType() {
         return PARSER;
      }

      public MinecraftIdentity.Skin getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<MinecraftIdentity.Skin.Builder> implements MinecraftIdentity.SkinOrBuilder {
         private int bitField0_;
         private Object id_ = "";
         private int state_ = 0;
         private MinecraftSkin skin_;
         private SingleFieldBuilderV3<MinecraftSkin, MinecraftSkin.Builder, MinecraftSkinOrBuilder> skinBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_fieldAccessorTable
               .ensureFieldAccessorsInitialized(MinecraftIdentity.Skin.class, MinecraftIdentity.Skin.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MinecraftIdentity.Skin.alwaysUseFieldBuilders) {
               this.getSkinFieldBuilder();
            }
         }

         public MinecraftIdentity.Skin.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.id_ = "";
            this.state_ = 0;
            this.skin_ = null;
            if (this.skinBuilder_ != null) {
               this.skinBuilder_.dispose();
               this.skinBuilder_ = null;
            }

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MinecraftIdentity_Skin_descriptor;
         }

         public MinecraftIdentity.Skin getDefaultInstanceForType() {
            return MinecraftIdentity.Skin.getDefaultInstance();
         }

         public MinecraftIdentity.Skin build() {
            MinecraftIdentity.Skin var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public MinecraftIdentity.Skin buildPartial() {
            MinecraftIdentity.Skin var1 = new MinecraftIdentity.Skin(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(MinecraftIdentity.Skin var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.id_ = this.id_;
            }

            if ((var2 & 2) != 0) {
               var1.state_ = this.state_;
            }

            byte var3 = 0;
            if ((var2 & 4) != 0) {
               var1.skin_ = this.skinBuilder_ == null ? this.skin_ : this.skinBuilder_.build();
               var3 |= 1;
            }

            MinecraftIdentity.Skin var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public MinecraftIdentity.Skin.Builder clone() {
            return (MinecraftIdentity.Skin.Builder)super.clone();
         }

         public MinecraftIdentity.Skin.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.Skin.Builder)super.setField(var1, var2);
         }

         public MinecraftIdentity.Skin.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (MinecraftIdentity.Skin.Builder)super.clearField(var1);
         }

         public MinecraftIdentity.Skin.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (MinecraftIdentity.Skin.Builder)super.clearOneof(var1);
         }

         public MinecraftIdentity.Skin.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (MinecraftIdentity.Skin.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public MinecraftIdentity.Skin.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (MinecraftIdentity.Skin.Builder)super.addRepeatedField(var1, var2);
         }

         public MinecraftIdentity.Skin.Builder mergeFrom(Message var1) {
            if (var1 instanceof MinecraftIdentity.Skin) {
               return this.mergeFrom((MinecraftIdentity.Skin)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public MinecraftIdentity.Skin.Builder mergeFrom(MinecraftIdentity.Skin var1) {
            if (var1 == MinecraftIdentity.Skin.getDefaultInstance()) {
               return this;
            }

            if (!var1.getId().isEmpty()) {
               this.id_ = var1.id_;
               this.bitField0_ |= 1;
               this.onChanged();
            }

            if (var1.state_ != 0) {
               this.setStateValue(var1.getStateValue());
            }

            if (var1.hasSkin()) {
               this.mergeSkin(var1.getSkin());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public MinecraftIdentity.Skin.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     case 16:
                        this.state_ = var1.readEnum();
                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        var1.readMessage(this.getSkinFieldBuilder().getBuilder(), var2);
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

         public MinecraftIdentity.Skin.Builder setId(String var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Skin.Builder clearId() {
            this.id_ = MinecraftIdentity.Skin.getDefaultInstance().getId();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Skin.Builder setIdBytes(ByteString var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            MinecraftIdentity.Skin.checkByteStringIsUtf8(var1);
            this.id_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         @Override
         public int getStateValue() {
            return this.state_;
         }

         public MinecraftIdentity.Skin.Builder setStateValue(int var1) {
            this.state_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         @Override
         public MinecraftIdentity.TextureState getState() {
            MinecraftIdentity.TextureState var1 = MinecraftIdentity.TextureState.forNumber(this.state_);
            return var1 == null ? MinecraftIdentity.TextureState.UNRECOGNIZED : var1;
         }

         public MinecraftIdentity.Skin.Builder setState(MinecraftIdentity.TextureState var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 2;
            this.state_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Skin.Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasSkin() {
            return (this.bitField0_ & 4) != 0;
         }

         @Override
         public MinecraftSkin getSkin() {
            if (this.skinBuilder_ == null) {
               return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
            } else {
               return this.skinBuilder_.getMessage();
            }
         }

         public MinecraftIdentity.Skin.Builder setSkin(MinecraftSkin var1) {
            if (this.skinBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.skin_ = var1;
            } else {
               this.skinBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Skin.Builder setSkin(MinecraftSkin.Builder var1) {
            if (this.skinBuilder_ == null) {
               this.skin_ = var1.build();
            } else {
               this.skinBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public MinecraftIdentity.Skin.Builder mergeSkin(MinecraftSkin var1) {
            if (this.skinBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.skin_ != null && this.skin_ != MinecraftSkin.getDefaultInstance()) {
                  this.getSkinBuilder().mergeFrom(var1);
               } else {
                  this.skin_ = var1;
               }
            } else {
               this.skinBuilder_.mergeFrom(var1);
            }

            if (this.skin_ != null) {
               this.bitField0_ |= 4;
               this.onChanged();
            }

            return this;
         }

         public MinecraftIdentity.Skin.Builder clearSkin() {
            this.bitField0_ &= -5;
            this.skin_ = null;
            if (this.skinBuilder_ != null) {
               this.skinBuilder_.dispose();
               this.skinBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public MinecraftSkin.Builder getSkinBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return this.getSkinFieldBuilder().getBuilder();
         }

         @Override
         public MinecraftSkinOrBuilder getSkinOrBuilder() {
            if (this.skinBuilder_ != null) {
               return this.skinBuilder_.getMessageOrBuilder();
            } else {
               return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
            }
         }

         private SingleFieldBuilderV3<MinecraftSkin, MinecraftSkin.Builder, MinecraftSkinOrBuilder> getSkinFieldBuilder() {
            if (this.skinBuilder_ == null) {
               this.skinBuilder_ = new SingleFieldBuilderV3<>(this.getSkin(), this.getParentForChildren(), this.isClean());
               this.skin_ = null;
            }

            return this.skinBuilder_;
         }

         public final MinecraftIdentity.Skin.Builder setUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.Skin.Builder)super.setUnknownFields(var1);
         }

         public final MinecraftIdentity.Skin.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (MinecraftIdentity.Skin.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface SkinOrBuilder extends MessageOrBuilder {
      String getId();

      ByteString getIdBytes();

      int getStateValue();

      MinecraftIdentity.TextureState getState();

      boolean hasSkin();

      MinecraftSkin getSkin();

      MinecraftSkinOrBuilder getSkinOrBuilder();
   }

   public enum TextureState implements ProtocolMessageEnum {
      TEXTURE_STATE_UNSPECIFIED(0),
      TEXTURE_STATE_ACTIVE(1),
      TEXTURE_STATE_INACTIVE(2),
      UNRECOGNIZED(-1);

      public static final int TEXTURE_STATE_UNSPECIFIED_VALUE = 0;
      public static final int TEXTURE_STATE_ACTIVE_VALUE = 1;
      public static final int TEXTURE_STATE_INACTIVE_VALUE = 2;
      private static final Internal.EnumLiteMap<MinecraftIdentity.TextureState> internalValueMap = new Internal.EnumLiteMap<MinecraftIdentity.TextureState>() {
         public MinecraftIdentity.TextureState findValueByNumber(int var1) {
            return MinecraftIdentity.TextureState.forNumber(var1);
         }
      };
      private static final MinecraftIdentity.TextureState[] VALUES = values();
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
      public static MinecraftIdentity.TextureState valueOf(int var0) {
         return forNumber(var0);
      }

      public static MinecraftIdentity.TextureState forNumber(int var0) {
         switch (var0) {
            case 0:
               return TEXTURE_STATE_UNSPECIFIED;
            case 1:
               return TEXTURE_STATE_ACTIVE;
            case 2:
               return TEXTURE_STATE_INACTIVE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<MinecraftIdentity.TextureState> internalGetValueMap() {
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
         return MinecraftIdentity.getDescriptor().getEnumTypes().get(1);
      }

      public static MinecraftIdentity.TextureState valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      TextureState(int var3) {
         this.value = var3;
      }
   }

   public enum Type implements ProtocolMessageEnum {
      TYPE_UNSPECIFIED(0),
      TYPE_MOJANG(1),
      TYPE_MICROSOFT(2),
      UNRECOGNIZED(-1);

      public static final int TYPE_UNSPECIFIED_VALUE = 0;
      public static final int TYPE_MOJANG_VALUE = 1;
      public static final int TYPE_MICROSOFT_VALUE = 2;
      private static final Internal.EnumLiteMap<MinecraftIdentity.Type> internalValueMap = new Internal.EnumLiteMap<MinecraftIdentity.Type>() {
         public MinecraftIdentity.Type findValueByNumber(int var1) {
            return MinecraftIdentity.Type.forNumber(var1);
         }
      };
      private static final MinecraftIdentity.Type[] VALUES = values();
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
      public static MinecraftIdentity.Type valueOf(int var0) {
         return forNumber(var0);
      }

      public static MinecraftIdentity.Type forNumber(int var0) {
         switch (var0) {
            case 0:
               return TYPE_UNSPECIFIED;
            case 1:
               return TYPE_MOJANG;
            case 2:
               return TYPE_MICROSOFT;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<MinecraftIdentity.Type> internalGetValueMap() {
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
         return MinecraftIdentity.getDescriptor().getEnumTypes().get(0);
      }

      public static MinecraftIdentity.Type valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Type(int var3) {
         this.value = var3;
      }
   }
}
