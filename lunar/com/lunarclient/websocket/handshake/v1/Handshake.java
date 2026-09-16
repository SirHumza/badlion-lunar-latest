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
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.LauncherVersion;
import com.lunarclient.common.v1.LauncherVersionOrBuilder;
import com.lunarclient.websocket.language.v1.Language;
import com.lunarclient.websocket.language.v1.LanguageOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Handshake extends GeneratedMessageV3 implements HandshakeOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int clientCase_ = 0;
   private Object client_;
   public static final int IDENTITY_FIELD_NUMBER = 1;
   private MinecraftIdentity identity_;
   public static final int LAUNCHER_VERSION_FIELD_NUMBER = 2;
   private LauncherVersion launcherVersion_;
   public static final int INSTALLATION_ID_FIELD_NUMBER = 3;
   private volatile Object installationId_ = "";
   public static final int HWID_FIELD_NUMBER = 4;
   private volatile Object hwid_ = "";
   public static final int OPERATING_SYSTEM_FIELD_NUMBER = 5;
   private volatile Object operatingSystem_ = "";
   public static final int OPERATING_SYSTEM_RELEASE_FIELD_NUMBER = 11;
   private volatile Object operatingSystemRelease_ = "";
   public static final int CPU_ARCHITECTURE_FIELD_NUMBER = 6;
   private volatile Object cpuArchitecture_ = "";
   public static final int LANGUAGE_FIELD_NUMBER = 7;
   private Language language_;
   public static final int CANARY_TOKEN_FIELD_NUMBER = 10;
   private volatile Object canaryToken_ = "";
   public static final int OVERWOLF_MUID_FIELD_NUMBER = 12;
   private volatile Object overwolfMuid_ = "";
   public static final int GAME_HANDSHAKE_FIELD_NUMBER = 8;
   public static final int LAUNCHER_HANDSHAKE_FIELD_NUMBER = 9;
   private byte memoizedIsInitialized = -1;
   private static final Handshake DEFAULT_INSTANCE = new Handshake();
   private static final Parser<Handshake> PARSER = new AbstractParser<Handshake>() {
      public Handshake parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Handshake.Builder var3 = Handshake.newBuilder();

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

   private Handshake(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Handshake() {
      this.installationId_ = "";
      this.hwid_ = "";
      this.operatingSystem_ = "";
      this.operatingSystemRelease_ = "";
      this.cpuArchitecture_ = "";
      this.canaryToken_ = "";
      this.overwolfMuid_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Handshake();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_Handshake_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_Handshake_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Handshake.class, Handshake.Builder.class);
   }

   @Override
   public Handshake.ClientCase getClientCase() {
      return Handshake.ClientCase.forNumber(this.clientCase_);
   }

   @Override
   public boolean hasIdentity() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public MinecraftIdentity getIdentity() {
      return this.identity_ == null ? MinecraftIdentity.getDefaultInstance() : this.identity_;
   }

   @Override
   public MinecraftIdentityOrBuilder getIdentityOrBuilder() {
      return this.identity_ == null ? MinecraftIdentity.getDefaultInstance() : this.identity_;
   }

   @Override
   public boolean hasLauncherVersion() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public LauncherVersion getLauncherVersion() {
      return this.launcherVersion_ == null ? LauncherVersion.getDefaultInstance() : this.launcherVersion_;
   }

   @Override
   public LauncherVersionOrBuilder getLauncherVersionOrBuilder() {
      return this.launcherVersion_ == null ? LauncherVersion.getDefaultInstance() : this.launcherVersion_;
   }

   @Override
   public String getInstallationId() {
      Object var1 = this.installationId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.installationId_ = var3;
      return var3;
   }

   @Override
   public ByteString getInstallationIdBytes() {
      Object var1 = this.installationId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.installationId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Deprecated
   @Override
   public String getHwid() {
      Object var1 = this.hwid_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.hwid_ = var3;
      return var3;
   }

   @Deprecated
   @Override
   public ByteString getHwidBytes() {
      Object var1 = this.hwid_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.hwid_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getOperatingSystem() {
      Object var1 = this.operatingSystem_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.operatingSystem_ = var3;
      return var3;
   }

   @Override
   public ByteString getOperatingSystemBytes() {
      Object var1 = this.operatingSystem_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.operatingSystem_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getOperatingSystemRelease() {
      Object var1 = this.operatingSystemRelease_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.operatingSystemRelease_ = var3;
      return var3;
   }

   @Override
   public ByteString getOperatingSystemReleaseBytes() {
      Object var1 = this.operatingSystemRelease_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.operatingSystemRelease_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCpuArchitecture() {
      Object var1 = this.cpuArchitecture_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.cpuArchitecture_ = var3;
      return var3;
   }

   @Override
   public ByteString getCpuArchitectureBytes() {
      Object var1 = this.cpuArchitecture_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.cpuArchitecture_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasLanguage() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Language getLanguage() {
      return this.language_ == null ? Language.getDefaultInstance() : this.language_;
   }

   @Override
   public LanguageOrBuilder getLanguageOrBuilder() {
      return this.language_ == null ? Language.getDefaultInstance() : this.language_;
   }

   @Override
   public String getCanaryToken() {
      Object var1 = this.canaryToken_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.canaryToken_ = var3;
      return var3;
   }

   @Override
   public ByteString getCanaryTokenBytes() {
      Object var1 = this.canaryToken_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.canaryToken_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getOverwolfMuid() {
      Object var1 = this.overwolfMuid_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.overwolfMuid_ = var3;
      return var3;
   }

   @Override
   public ByteString getOverwolfMuidBytes() {
      Object var1 = this.overwolfMuid_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.overwolfMuid_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasGameHandshake() {
      return this.clientCase_ == 8;
   }

   @Override
   public GameHandshake getGameHandshake() {
      return this.clientCase_ == 8 ? (GameHandshake)this.client_ : GameHandshake.getDefaultInstance();
   }

   @Override
   public GameHandshakeOrBuilder getGameHandshakeOrBuilder() {
      return this.clientCase_ == 8 ? (GameHandshake)this.client_ : GameHandshake.getDefaultInstance();
   }

   @Override
   public boolean hasLauncherHandshake() {
      return this.clientCase_ == 9;
   }

   @Override
   public LauncherHandshake getLauncherHandshake() {
      return this.clientCase_ == 9 ? (LauncherHandshake)this.client_ : LauncherHandshake.getDefaultInstance();
   }

   @Override
   public LauncherHandshakeOrBuilder getLauncherHandshakeOrBuilder() {
      return this.clientCase_ == 9 ? (LauncherHandshake)this.client_ : LauncherHandshake.getDefaultInstance();
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
         var1.writeMessage(1, this.getIdentity());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getLauncherVersion());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.installationId_)) {
         GeneratedMessageV3.writeString(var1, 3, this.installationId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.hwid_)) {
         GeneratedMessageV3.writeString(var1, 4, this.hwid_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.operatingSystem_)) {
         GeneratedMessageV3.writeString(var1, 5, this.operatingSystem_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cpuArchitecture_)) {
         GeneratedMessageV3.writeString(var1, 6, this.cpuArchitecture_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(7, this.getLanguage());
      }

      if (this.clientCase_ == 8) {
         var1.writeMessage(8, (GameHandshake)this.client_);
      }

      if (this.clientCase_ == 9) {
         var1.writeMessage(9, (LauncherHandshake)this.client_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.canaryToken_)) {
         GeneratedMessageV3.writeString(var1, 10, this.canaryToken_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.operatingSystemRelease_)) {
         GeneratedMessageV3.writeString(var1, 11, this.operatingSystemRelease_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.overwolfMuid_)) {
         GeneratedMessageV3.writeString(var1, 12, this.overwolfMuid_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getIdentity());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLauncherVersion());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.installationId_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.installationId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.hwid_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.hwid_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.operatingSystem_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.operatingSystem_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cpuArchitecture_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.cpuArchitecture_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getLanguage());
      }

      if (this.clientCase_ == 8) {
         var1 += CodedOutputStream.computeMessageSize(8, (GameHandshake)this.client_);
      }

      if (this.clientCase_ == 9) {
         var1 += CodedOutputStream.computeMessageSize(9, (LauncherHandshake)this.client_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.canaryToken_)) {
         var1 += GeneratedMessageV3.computeStringSize(10, this.canaryToken_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.operatingSystemRelease_)) {
         var1 += GeneratedMessageV3.computeStringSize(11, this.operatingSystemRelease_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.overwolfMuid_)) {
         var1 += GeneratedMessageV3.computeStringSize(12, this.overwolfMuid_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Handshake)) {
         return super.equals(var1);
      }

      Handshake var2 = (Handshake)var1;
      if (this.hasIdentity() != var2.hasIdentity()) {
         return false;
      }

      if (this.hasIdentity() && !this.getIdentity().equals(var2.getIdentity())) {
         return false;
      }

      if (this.hasLauncherVersion() != var2.hasLauncherVersion()) {
         return false;
      }

      if (this.hasLauncherVersion() && !this.getLauncherVersion().equals(var2.getLauncherVersion())) {
         return false;
      }

      if (!this.getInstallationId().equals(var2.getInstallationId())) {
         return false;
      }

      if (!this.getHwid().equals(var2.getHwid())) {
         return false;
      }

      if (!this.getOperatingSystem().equals(var2.getOperatingSystem())) {
         return false;
      }

      if (!this.getOperatingSystemRelease().equals(var2.getOperatingSystemRelease())) {
         return false;
      }

      if (!this.getCpuArchitecture().equals(var2.getCpuArchitecture())) {
         return false;
      }

      if (this.hasLanguage() != var2.hasLanguage()) {
         return false;
      }

      if (this.hasLanguage() && !this.getLanguage().equals(var2.getLanguage())) {
         return false;
      }

      if (!this.getCanaryToken().equals(var2.getCanaryToken())) {
         return false;
      }

      if (!this.getOverwolfMuid().equals(var2.getOverwolfMuid())) {
         return false;
      }

      if (!this.getClientCase().equals(var2.getClientCase())) {
         return false;
      }

      switch (this.clientCase_) {
         case 0:
         default:
            break;
         case 8:
            if (!this.getGameHandshake().equals(var2.getGameHandshake())) {
               return false;
            }
            break;
         case 9:
            if (!this.getLauncherHandshake().equals(var2.getLauncherHandshake())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.hasIdentity()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getIdentity().hashCode();
      }

      if (this.hasLauncherVersion()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLauncherVersion().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getInstallationId().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getHwid().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getOperatingSystem().hashCode();
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + this.getOperatingSystemRelease().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getCpuArchitecture().hashCode();
      if (this.hasLanguage()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getLanguage().hashCode();
      }

      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.getCanaryToken().hashCode();
      var1 = 37 * var1 + 12;
      var1 = 53 * var1 + this.getOverwolfMuid().hashCode();
      switch (this.clientCase_) {
         case 0:
         default:
            break;
         case 8:
            var1 = 37 * var1 + 8;
            var1 = 53 * var1 + this.getGameHandshake().hashCode();
            break;
         case 9:
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getLauncherHandshake().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Handshake parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Handshake parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Handshake parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Handshake parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Handshake parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Handshake parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Handshake parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Handshake parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Handshake parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Handshake parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Handshake parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Handshake parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Handshake.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Handshake.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Handshake.Builder newBuilder(Handshake var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Handshake.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Handshake.Builder() : new Handshake.Builder().mergeFrom(this);
   }

   protected Handshake.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Handshake.Builder(var1);
   }

   public static Handshake getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Handshake> parser() {
      return PARSER;
   }

   @Override
   public Parser<Handshake> getParserForType() {
      return PARSER;
   }

   public Handshake getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Handshake.Builder> implements HandshakeOrBuilder {
      private int clientCase_ = 0;
      private Object client_;
      private int bitField0_;
      private MinecraftIdentity identity_;
      private SingleFieldBuilderV3<MinecraftIdentity, MinecraftIdentity.Builder, MinecraftIdentityOrBuilder> identityBuilder_;
      private LauncherVersion launcherVersion_;
      private SingleFieldBuilderV3<LauncherVersion, LauncherVersion.Builder, LauncherVersionOrBuilder> launcherVersionBuilder_;
      private Object installationId_ = "";
      private Object hwid_ = "";
      private Object operatingSystem_ = "";
      private Object operatingSystemRelease_ = "";
      private Object cpuArchitecture_ = "";
      private Language language_;
      private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> languageBuilder_;
      private Object canaryToken_ = "";
      private Object overwolfMuid_ = "";
      private SingleFieldBuilderV3<GameHandshake, GameHandshake.Builder, GameHandshakeOrBuilder> gameHandshakeBuilder_;
      private SingleFieldBuilderV3<LauncherHandshake, LauncherHandshake.Builder, LauncherHandshakeOrBuilder> launcherHandshakeBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_Handshake_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_Handshake_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Handshake.class, Handshake.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Handshake.alwaysUseFieldBuilders) {
            this.getIdentityFieldBuilder();
            this.getLauncherVersionFieldBuilder();
            this.getLanguageFieldBuilder();
         }
      }

      public Handshake.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.identity_ = null;
         if (this.identityBuilder_ != null) {
            this.identityBuilder_.dispose();
            this.identityBuilder_ = null;
         }

         this.launcherVersion_ = null;
         if (this.launcherVersionBuilder_ != null) {
            this.launcherVersionBuilder_.dispose();
            this.launcherVersionBuilder_ = null;
         }

         this.installationId_ = "";
         this.hwid_ = "";
         this.operatingSystem_ = "";
         this.operatingSystemRelease_ = "";
         this.cpuArchitecture_ = "";
         this.language_ = null;
         if (this.languageBuilder_ != null) {
            this.languageBuilder_.dispose();
            this.languageBuilder_ = null;
         }

         this.canaryToken_ = "";
         this.overwolfMuid_ = "";
         if (this.gameHandshakeBuilder_ != null) {
            this.gameHandshakeBuilder_.clear();
         }

         if (this.launcherHandshakeBuilder_ != null) {
            this.launcherHandshakeBuilder_.clear();
         }

         this.clientCase_ = 0;
         this.client_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_Handshake_descriptor;
      }

      public Handshake getDefaultInstanceForType() {
         return Handshake.getDefaultInstance();
      }

      public Handshake build() {
         Handshake var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Handshake buildPartial() {
         Handshake var1 = new Handshake(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Handshake var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.identity_ = this.identityBuilder_ == null ? this.identity_ : this.identityBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.launcherVersion_ = this.launcherVersionBuilder_ == null ? this.launcherVersion_ : this.launcherVersionBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.installationId_ = this.installationId_;
         }

         if ((var2 & 8) != 0) {
            var1.hwid_ = this.hwid_;
         }

         if ((var2 & 16) != 0) {
            var1.operatingSystem_ = this.operatingSystem_;
         }

         if ((var2 & 32) != 0) {
            var1.operatingSystemRelease_ = this.operatingSystemRelease_;
         }

         if ((var2 & 64) != 0) {
            var1.cpuArchitecture_ = this.cpuArchitecture_;
         }

         if ((var2 & 128) != 0) {
            var1.language_ = this.languageBuilder_ == null ? this.language_ : this.languageBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 256) != 0) {
            var1.canaryToken_ = this.canaryToken_;
         }

         if ((var2 & 512) != 0) {
            var1.overwolfMuid_ = this.overwolfMuid_;
         }

         Handshake var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(Handshake var1) {
         var1.clientCase_ = this.clientCase_;
         var1.client_ = this.client_;
         if (this.clientCase_ == 8 && this.gameHandshakeBuilder_ != null) {
            var1.client_ = this.gameHandshakeBuilder_.build();
         }

         if (this.clientCase_ == 9 && this.launcherHandshakeBuilder_ != null) {
            var1.client_ = this.launcherHandshakeBuilder_.build();
         }
      }

      public Handshake.Builder clone() {
         return (Handshake.Builder)super.clone();
      }

      public Handshake.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Handshake.Builder)super.setField(var1, var2);
      }

      public Handshake.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Handshake.Builder)super.clearField(var1);
      }

      public Handshake.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Handshake.Builder)super.clearOneof(var1);
      }

      public Handshake.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Handshake.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Handshake.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Handshake.Builder)super.addRepeatedField(var1, var2);
      }

      public Handshake.Builder mergeFrom(Message var1) {
         if (var1 instanceof Handshake) {
            return this.mergeFrom((Handshake)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Handshake.Builder mergeFrom(Handshake var1) {
         if (var1 == Handshake.getDefaultInstance()) {
            return this;
         }

         if (var1.hasIdentity()) {
            this.mergeIdentity(var1.getIdentity());
         }

         if (var1.hasLauncherVersion()) {
            this.mergeLauncherVersion(var1.getLauncherVersion());
         }

         if (!var1.getInstallationId().isEmpty()) {
            this.installationId_ = var1.installationId_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getHwid().isEmpty()) {
            this.hwid_ = var1.hwid_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getOperatingSystem().isEmpty()) {
            this.operatingSystem_ = var1.operatingSystem_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getOperatingSystemRelease().isEmpty()) {
            this.operatingSystemRelease_ = var1.operatingSystemRelease_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (!var1.getCpuArchitecture().isEmpty()) {
            this.cpuArchitecture_ = var1.cpuArchitecture_;
            this.bitField0_ |= 64;
            this.onChanged();
         }

         if (var1.hasLanguage()) {
            this.mergeLanguage(var1.getLanguage());
         }

         if (!var1.getCanaryToken().isEmpty()) {
            this.canaryToken_ = var1.canaryToken_;
            this.bitField0_ |= 256;
            this.onChanged();
         }

         if (!var1.getOverwolfMuid().isEmpty()) {
            this.overwolfMuid_ = var1.overwolfMuid_;
            this.bitField0_ |= 512;
            this.onChanged();
         }

         switch (var1.getClientCase()) {
            case GAME_HANDSHAKE:
               this.mergeGameHandshake(var1.getGameHandshake());
               break;
            case LAUNCHER_HANDSHAKE:
               this.mergeLauncherHandshake(var1.getLauncherHandshake());
            case CLIENT_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Handshake.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdentityFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLauncherVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.installationId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.hwid_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.operatingSystem_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.cpuArchitecture_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  case 58:
                     var1.readMessage(this.getLanguageFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 66:
                     var1.readMessage(this.getGameHandshakeFieldBuilder().getBuilder(), var2);
                     this.clientCase_ = 8;
                     break;
                  case 74:
                     var1.readMessage(this.getLauncherHandshakeFieldBuilder().getBuilder(), var2);
                     this.clientCase_ = 9;
                     break;
                  case 82:
                     this.canaryToken_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 256;
                     break;
                  case 90:
                     this.operatingSystemRelease_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 98:
                     this.overwolfMuid_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 512;
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
      public Handshake.ClientCase getClientCase() {
         return Handshake.ClientCase.forNumber(this.clientCase_);
      }

      public Handshake.Builder clearClient() {
         this.clientCase_ = 0;
         this.client_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasIdentity() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public MinecraftIdentity getIdentity() {
         if (this.identityBuilder_ == null) {
            return this.identity_ == null ? MinecraftIdentity.getDefaultInstance() : this.identity_;
         } else {
            return this.identityBuilder_.getMessage();
         }
      }

      public Handshake.Builder setIdentity(MinecraftIdentity var1) {
         if (this.identityBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.identity_ = var1;
         } else {
            this.identityBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setIdentity(MinecraftIdentity.Builder var1) {
         if (this.identityBuilder_ == null) {
            this.identity_ = var1.build();
         } else {
            this.identityBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Handshake.Builder mergeIdentity(MinecraftIdentity var1) {
         if (this.identityBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.identity_ != null && this.identity_ != MinecraftIdentity.getDefaultInstance()) {
               this.getIdentityBuilder().mergeFrom(var1);
            } else {
               this.identity_ = var1;
            }
         } else {
            this.identityBuilder_.mergeFrom(var1);
         }

         if (this.identity_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public Handshake.Builder clearIdentity() {
         this.bitField0_ &= -2;
         this.identity_ = null;
         if (this.identityBuilder_ != null) {
            this.identityBuilder_.dispose();
            this.identityBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftIdentity.Builder getIdentityBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdentityFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftIdentityOrBuilder getIdentityOrBuilder() {
         if (this.identityBuilder_ != null) {
            return this.identityBuilder_.getMessageOrBuilder();
         } else {
            return this.identity_ == null ? MinecraftIdentity.getDefaultInstance() : this.identity_;
         }
      }

      private SingleFieldBuilderV3<MinecraftIdentity, MinecraftIdentity.Builder, MinecraftIdentityOrBuilder> getIdentityFieldBuilder() {
         if (this.identityBuilder_ == null) {
            this.identityBuilder_ = new SingleFieldBuilderV3<>(this.getIdentity(), this.getParentForChildren(), this.isClean());
            this.identity_ = null;
         }

         return this.identityBuilder_;
      }

      @Override
      public boolean hasLauncherVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public LauncherVersion getLauncherVersion() {
         if (this.launcherVersionBuilder_ == null) {
            return this.launcherVersion_ == null ? LauncherVersion.getDefaultInstance() : this.launcherVersion_;
         } else {
            return this.launcherVersionBuilder_.getMessage();
         }
      }

      public Handshake.Builder setLauncherVersion(LauncherVersion var1) {
         if (this.launcherVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.launcherVersion_ = var1;
         } else {
            this.launcherVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setLauncherVersion(LauncherVersion.Builder var1) {
         if (this.launcherVersionBuilder_ == null) {
            this.launcherVersion_ = var1.build();
         } else {
            this.launcherVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Handshake.Builder mergeLauncherVersion(LauncherVersion var1) {
         if (this.launcherVersionBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.launcherVersion_ != null && this.launcherVersion_ != LauncherVersion.getDefaultInstance()) {
               this.getLauncherVersionBuilder().mergeFrom(var1);
            } else {
               this.launcherVersion_ = var1;
            }
         } else {
            this.launcherVersionBuilder_.mergeFrom(var1);
         }

         if (this.launcherVersion_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public Handshake.Builder clearLauncherVersion() {
         this.bitField0_ &= -3;
         this.launcherVersion_ = null;
         if (this.launcherVersionBuilder_ != null) {
            this.launcherVersionBuilder_.dispose();
            this.launcherVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LauncherVersion.Builder getLauncherVersionBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLauncherVersionFieldBuilder().getBuilder();
      }

      @Override
      public LauncherVersionOrBuilder getLauncherVersionOrBuilder() {
         if (this.launcherVersionBuilder_ != null) {
            return this.launcherVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.launcherVersion_ == null ? LauncherVersion.getDefaultInstance() : this.launcherVersion_;
         }
      }

      private SingleFieldBuilderV3<LauncherVersion, LauncherVersion.Builder, LauncherVersionOrBuilder> getLauncherVersionFieldBuilder() {
         if (this.launcherVersionBuilder_ == null) {
            this.launcherVersionBuilder_ = new SingleFieldBuilderV3<>(this.getLauncherVersion(), this.getParentForChildren(), this.isClean());
            this.launcherVersion_ = null;
         }

         return this.launcherVersionBuilder_;
      }

      @Override
      public String getInstallationId() {
         Object var1 = this.installationId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.installationId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getInstallationIdBytes() {
         Object var1 = this.installationId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.installationId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setInstallationId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.installationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearInstallationId() {
         this.installationId_ = Handshake.getDefaultInstance().getInstallationId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setInstallationIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.installationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public String getHwid() {
         Object var1 = this.hwid_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.hwid_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Deprecated
      @Override
      public ByteString getHwidBytes() {
         Object var1 = this.hwid_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.hwid_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Deprecated
      public Handshake.Builder setHwid(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.hwid_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Deprecated
      public Handshake.Builder clearHwid() {
         this.hwid_ = Handshake.getDefaultInstance().getHwid();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      @Deprecated
      public Handshake.Builder setHwidBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.hwid_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getOperatingSystem() {
         Object var1 = this.operatingSystem_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.operatingSystem_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOperatingSystemBytes() {
         Object var1 = this.operatingSystem_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.operatingSystem_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setOperatingSystem(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.operatingSystem_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearOperatingSystem() {
         this.operatingSystem_ = Handshake.getDefaultInstance().getOperatingSystem();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setOperatingSystemBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.operatingSystem_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getOperatingSystemRelease() {
         Object var1 = this.operatingSystemRelease_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.operatingSystemRelease_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOperatingSystemReleaseBytes() {
         Object var1 = this.operatingSystemRelease_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.operatingSystemRelease_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setOperatingSystemRelease(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.operatingSystemRelease_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearOperatingSystemRelease() {
         this.operatingSystemRelease_ = Handshake.getDefaultInstance().getOperatingSystemRelease();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setOperatingSystemReleaseBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.operatingSystemRelease_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public String getCpuArchitecture() {
         Object var1 = this.cpuArchitecture_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.cpuArchitecture_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCpuArchitectureBytes() {
         Object var1 = this.cpuArchitecture_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.cpuArchitecture_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setCpuArchitecture(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.cpuArchitecture_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearCpuArchitecture() {
         this.cpuArchitecture_ = Handshake.getDefaultInstance().getCpuArchitecture();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setCpuArchitectureBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.cpuArchitecture_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLanguage() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public Language getLanguage() {
         if (this.languageBuilder_ == null) {
            return this.language_ == null ? Language.getDefaultInstance() : this.language_;
         } else {
            return this.languageBuilder_.getMessage();
         }
      }

      public Handshake.Builder setLanguage(Language var1) {
         if (this.languageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.language_ = var1;
         } else {
            this.languageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setLanguage(Language.Builder var1) {
         if (this.languageBuilder_ == null) {
            this.language_ = var1.build();
         } else {
            this.languageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Handshake.Builder mergeLanguage(Language var1) {
         if (this.languageBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.language_ != null && this.language_ != Language.getDefaultInstance()) {
               this.getLanguageBuilder().mergeFrom(var1);
            } else {
               this.language_ = var1;
            }
         } else {
            this.languageBuilder_.mergeFrom(var1);
         }

         if (this.language_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public Handshake.Builder clearLanguage() {
         this.bitField0_ &= -129;
         this.language_ = null;
         if (this.languageBuilder_ != null) {
            this.languageBuilder_.dispose();
            this.languageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Language.Builder getLanguageBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getLanguageFieldBuilder().getBuilder();
      }

      @Override
      public LanguageOrBuilder getLanguageOrBuilder() {
         if (this.languageBuilder_ != null) {
            return this.languageBuilder_.getMessageOrBuilder();
         } else {
            return this.language_ == null ? Language.getDefaultInstance() : this.language_;
         }
      }

      private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getLanguageFieldBuilder() {
         if (this.languageBuilder_ == null) {
            this.languageBuilder_ = new SingleFieldBuilderV3<>(this.getLanguage(), this.getParentForChildren(), this.isClean());
            this.language_ = null;
         }

         return this.languageBuilder_;
      }

      @Override
      public String getCanaryToken() {
         Object var1 = this.canaryToken_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.canaryToken_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCanaryTokenBytes() {
         Object var1 = this.canaryToken_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.canaryToken_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setCanaryToken(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.canaryToken_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearCanaryToken() {
         this.canaryToken_ = Handshake.getDefaultInstance().getCanaryToken();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setCanaryTokenBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.canaryToken_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public String getOverwolfMuid() {
         Object var1 = this.overwolfMuid_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.overwolfMuid_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOverwolfMuidBytes() {
         Object var1 = this.overwolfMuid_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.overwolfMuid_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setOverwolfMuid(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.overwolfMuid_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearOverwolfMuid() {
         this.overwolfMuid_ = Handshake.getDefaultInstance().getOverwolfMuid();
         this.bitField0_ &= -513;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setOverwolfMuidBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.overwolfMuid_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasGameHandshake() {
         return this.clientCase_ == 8;
      }

      @Override
      public GameHandshake getGameHandshake() {
         if (this.gameHandshakeBuilder_ == null) {
            return this.clientCase_ == 8 ? (GameHandshake)this.client_ : GameHandshake.getDefaultInstance();
         } else {
            return this.clientCase_ == 8 ? this.gameHandshakeBuilder_.getMessage() : GameHandshake.getDefaultInstance();
         }
      }

      public Handshake.Builder setGameHandshake(GameHandshake var1) {
         if (this.gameHandshakeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.client_ = var1;
            this.onChanged();
         } else {
            this.gameHandshakeBuilder_.setMessage(var1);
         }

         this.clientCase_ = 8;
         return this;
      }

      public Handshake.Builder setGameHandshake(GameHandshake.Builder var1) {
         if (this.gameHandshakeBuilder_ == null) {
            this.client_ = var1.build();
            this.onChanged();
         } else {
            this.gameHandshakeBuilder_.setMessage(var1.build());
         }

         this.clientCase_ = 8;
         return this;
      }

      public Handshake.Builder mergeGameHandshake(GameHandshake var1) {
         if (this.gameHandshakeBuilder_ == null) {
            if (this.clientCase_ == 8 && this.client_ != GameHandshake.getDefaultInstance()) {
               this.client_ = GameHandshake.newBuilder((GameHandshake)this.client_).mergeFrom(var1).buildPartial();
            } else {
               this.client_ = var1;
            }

            this.onChanged();
         } else if (this.clientCase_ == 8) {
            this.gameHandshakeBuilder_.mergeFrom(var1);
         } else {
            this.gameHandshakeBuilder_.setMessage(var1);
         }

         this.clientCase_ = 8;
         return this;
      }

      public Handshake.Builder clearGameHandshake() {
         if (this.gameHandshakeBuilder_ == null) {
            if (this.clientCase_ == 8) {
               this.clientCase_ = 0;
               this.client_ = null;
               this.onChanged();
            }
         } else {
            if (this.clientCase_ == 8) {
               this.clientCase_ = 0;
               this.client_ = null;
            }

            this.gameHandshakeBuilder_.clear();
         }

         return this;
      }

      public GameHandshake.Builder getGameHandshakeBuilder() {
         return this.getGameHandshakeFieldBuilder().getBuilder();
      }

      @Override
      public GameHandshakeOrBuilder getGameHandshakeOrBuilder() {
         if (this.clientCase_ == 8 && this.gameHandshakeBuilder_ != null) {
            return this.gameHandshakeBuilder_.getMessageOrBuilder();
         } else {
            return this.clientCase_ == 8 ? (GameHandshake)this.client_ : GameHandshake.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<GameHandshake, GameHandshake.Builder, GameHandshakeOrBuilder> getGameHandshakeFieldBuilder() {
         if (this.gameHandshakeBuilder_ == null) {
            if (this.clientCase_ != 8) {
               this.client_ = GameHandshake.getDefaultInstance();
            }

            this.gameHandshakeBuilder_ = new SingleFieldBuilderV3<>((GameHandshake)this.client_, this.getParentForChildren(), this.isClean());
            this.client_ = null;
         }

         this.clientCase_ = 8;
         this.onChanged();
         return this.gameHandshakeBuilder_;
      }

      @Override
      public boolean hasLauncherHandshake() {
         return this.clientCase_ == 9;
      }

      @Override
      public LauncherHandshake getLauncherHandshake() {
         if (this.launcherHandshakeBuilder_ == null) {
            return this.clientCase_ == 9 ? (LauncherHandshake)this.client_ : LauncherHandshake.getDefaultInstance();
         } else {
            return this.clientCase_ == 9 ? this.launcherHandshakeBuilder_.getMessage() : LauncherHandshake.getDefaultInstance();
         }
      }

      public Handshake.Builder setLauncherHandshake(LauncherHandshake var1) {
         if (this.launcherHandshakeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.client_ = var1;
            this.onChanged();
         } else {
            this.launcherHandshakeBuilder_.setMessage(var1);
         }

         this.clientCase_ = 9;
         return this;
      }

      public Handshake.Builder setLauncherHandshake(LauncherHandshake.Builder var1) {
         if (this.launcherHandshakeBuilder_ == null) {
            this.client_ = var1.build();
            this.onChanged();
         } else {
            this.launcherHandshakeBuilder_.setMessage(var1.build());
         }

         this.clientCase_ = 9;
         return this;
      }

      public Handshake.Builder mergeLauncherHandshake(LauncherHandshake var1) {
         if (this.launcherHandshakeBuilder_ == null) {
            if (this.clientCase_ == 9 && this.client_ != LauncherHandshake.getDefaultInstance()) {
               this.client_ = LauncherHandshake.newBuilder((LauncherHandshake)this.client_).mergeFrom(var1).buildPartial();
            } else {
               this.client_ = var1;
            }

            this.onChanged();
         } else if (this.clientCase_ == 9) {
            this.launcherHandshakeBuilder_.mergeFrom(var1);
         } else {
            this.launcherHandshakeBuilder_.setMessage(var1);
         }

         this.clientCase_ = 9;
         return this;
      }

      public Handshake.Builder clearLauncherHandshake() {
         if (this.launcherHandshakeBuilder_ == null) {
            if (this.clientCase_ == 9) {
               this.clientCase_ = 0;
               this.client_ = null;
               this.onChanged();
            }
         } else {
            if (this.clientCase_ == 9) {
               this.clientCase_ = 0;
               this.client_ = null;
            }

            this.launcherHandshakeBuilder_.clear();
         }

         return this;
      }

      public LauncherHandshake.Builder getLauncherHandshakeBuilder() {
         return this.getLauncherHandshakeFieldBuilder().getBuilder();
      }

      @Override
      public LauncherHandshakeOrBuilder getLauncherHandshakeOrBuilder() {
         if (this.clientCase_ == 9 && this.launcherHandshakeBuilder_ != null) {
            return this.launcherHandshakeBuilder_.getMessageOrBuilder();
         } else {
            return this.clientCase_ == 9 ? (LauncherHandshake)this.client_ : LauncherHandshake.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<LauncherHandshake, LauncherHandshake.Builder, LauncherHandshakeOrBuilder> getLauncherHandshakeFieldBuilder() {
         if (this.launcherHandshakeBuilder_ == null) {
            if (this.clientCase_ != 9) {
               this.client_ = LauncherHandshake.getDefaultInstance();
            }

            this.launcherHandshakeBuilder_ = new SingleFieldBuilderV3<>((LauncherHandshake)this.client_, this.getParentForChildren(), this.isClean());
            this.client_ = null;
         }

         this.clientCase_ = 9;
         this.onChanged();
         return this.launcherHandshakeBuilder_;
      }

      public final Handshake.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Handshake.Builder)super.setUnknownFields(var1);
      }

      public final Handshake.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Handshake.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ClientCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      GAME_HANDSHAKE(8),
      LAUNCHER_HANDSHAKE(9),
      CLIENT_NOT_SET(0);

      private final int value;

      ClientCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Handshake.ClientCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Handshake.ClientCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CLIENT_NOT_SET;
            case 8:
               return GAME_HANDSHAKE;
            case 9:
               return LAUNCHER_HANDSHAKE;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
