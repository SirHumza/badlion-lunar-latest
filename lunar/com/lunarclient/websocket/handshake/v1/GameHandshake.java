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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundLocationOrBuilder;
import com.lunarclient.common.v1.LunarClientUiVersion;
import com.lunarclient.common.v1.LunarClientUiVersionOrBuilder;
import com.lunarclient.common.v1.LunarClientVersion;
import com.lunarclient.common.v1.LunarClientVersionOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import com.lunarclient.websocket.setting.v1.ClientSetting;
import com.lunarclient.websocket.setting.v1.ClientSettingOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GameHandshake extends GeneratedMessageV3 implements GameHandshakeOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int gpuMemoryCase_ = 0;
   private Object gpuMemory_;
   public static final int MINECRAFT_VERSION_FIELD_NUMBER = 1;
   private MinecraftVersion minecraftVersion_;
   public static final int LUNAR_CLIENT_VERSION_FIELD_NUMBER = 2;
   private LunarClientVersion lunarClientVersion_;
   public static final int LOCATION_FIELD_NUMBER = 3;
   private InboundLocation location_;
   public static final int ICHOR_MODULES_FIELD_NUMBER = 4;
   private LazyStringArrayList ichorModules_ = LazyStringArrayList.emptyList();
   public static final int INSTALLED_MODS_FIELD_NUMBER = 5;
   private List<InstalledMod> installedMods_;
   public static final int MODPACK_FIELD_NUMBER = 6;
   private PlayerModpack modpack_;
   public static final int GL_EXTENSIONS_FIELD_NUMBER = 7;
   private LazyStringArrayList glExtensions_ = LazyStringArrayList.emptyList();
   public static final int LAUNCH_ID_FIELD_NUMBER = 8;
   private volatile Object launchId_ = "";
   public static final int NVIDIA_MEMORY_FIELD_NUMBER = 9;
   public static final int MESA_MEMORY_FIELD_NUMBER = 10;
   public static final int SETTINGS_FIELD_NUMBER = 11;
   private List<ClientSetting> settings_;
   public static final int LUNAR_CLIENT_UI_VERSION_FIELD_NUMBER = 12;
   private LunarClientUiVersion lunarClientUiVersion_;
   private byte memoizedIsInitialized = -1;
   private static final GameHandshake DEFAULT_INSTANCE = new GameHandshake();
   private static final Parser<GameHandshake> PARSER = new AbstractParser<GameHandshake>() {
      public GameHandshake parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GameHandshake.Builder var3 = GameHandshake.newBuilder();

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

   private GameHandshake(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GameHandshake() {
      this.ichorModules_ = LazyStringArrayList.emptyList();
      this.installedMods_ = Collections.emptyList();
      this.glExtensions_ = LazyStringArrayList.emptyList();
      this.launchId_ = "";
      this.settings_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GameHandshake();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_GameHandshake_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_GameHandshake_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GameHandshake.class, GameHandshake.Builder.class);
   }

   @Override
   public GameHandshake.GpuMemoryCase getGpuMemoryCase() {
      return GameHandshake.GpuMemoryCase.forNumber(this.gpuMemoryCase_);
   }

   @Override
   public boolean hasMinecraftVersion() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public MinecraftVersion getMinecraftVersion() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public boolean hasLunarClientVersion() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public LunarClientVersion getLunarClientVersion() {
      return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
   }

   @Override
   public LunarClientVersionOrBuilder getLunarClientVersionOrBuilder() {
      return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public InboundLocation getLocation() {
      return this.location_ == null ? InboundLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public InboundLocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? InboundLocation.getDefaultInstance() : this.location_;
   }

   public ProtocolStringList getIchorModulesList() {
      return this.ichorModules_;
   }

   @Override
   public int getIchorModulesCount() {
      return this.ichorModules_.size();
   }

   @Override
   public String getIchorModules(int var1) {
      return this.ichorModules_.get(var1);
   }

   @Override
   public ByteString getIchorModulesBytes(int var1) {
      return this.ichorModules_.getByteString(var1);
   }

   @Override
   public List<InstalledMod> getInstalledModsList() {
      return this.installedMods_;
   }

   @Override
   public List<? extends InstalledModOrBuilder> getInstalledModsOrBuilderList() {
      return this.installedMods_;
   }

   @Override
   public int getInstalledModsCount() {
      return this.installedMods_.size();
   }

   @Override
   public InstalledMod getInstalledMods(int var1) {
      return this.installedMods_.get(var1);
   }

   @Override
   public InstalledModOrBuilder getInstalledModsOrBuilder(int var1) {
      return this.installedMods_.get(var1);
   }

   @Override
   public boolean hasModpack() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public PlayerModpack getModpack() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   @Override
   public PlayerModpackOrBuilder getModpackOrBuilder() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   public ProtocolStringList getGlExtensionsList() {
      return this.glExtensions_;
   }

   @Override
   public int getGlExtensionsCount() {
      return this.glExtensions_.size();
   }

   @Override
   public String getGlExtensions(int var1) {
      return this.glExtensions_.get(var1);
   }

   @Override
   public ByteString getGlExtensionsBytes(int var1) {
      return this.glExtensions_.getByteString(var1);
   }

   @Override
   public String getLaunchId() {
      Object var1 = this.launchId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.launchId_ = var3;
      return var3;
   }

   @Override
   public ByteString getLaunchIdBytes() {
      Object var1 = this.launchId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.launchId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasNvidiaMemory() {
      return this.gpuMemoryCase_ == 9;
   }

   @Override
   public NvidiaGpuMemory getNvidiaMemory() {
      return this.gpuMemoryCase_ == 9 ? (NvidiaGpuMemory)this.gpuMemory_ : NvidiaGpuMemory.getDefaultInstance();
   }

   @Override
   public NvidiaGpuMemoryOrBuilder getNvidiaMemoryOrBuilder() {
      return this.gpuMemoryCase_ == 9 ? (NvidiaGpuMemory)this.gpuMemory_ : NvidiaGpuMemory.getDefaultInstance();
   }

   @Override
   public boolean hasMesaMemory() {
      return this.gpuMemoryCase_ == 10;
   }

   @Override
   public MesaGpuMemory getMesaMemory() {
      return this.gpuMemoryCase_ == 10 ? (MesaGpuMemory)this.gpuMemory_ : MesaGpuMemory.getDefaultInstance();
   }

   @Override
   public MesaGpuMemoryOrBuilder getMesaMemoryOrBuilder() {
      return this.gpuMemoryCase_ == 10 ? (MesaGpuMemory)this.gpuMemory_ : MesaGpuMemory.getDefaultInstance();
   }

   @Override
   public List<ClientSetting> getSettingsList() {
      return this.settings_;
   }

   @Override
   public List<? extends ClientSettingOrBuilder> getSettingsOrBuilderList() {
      return this.settings_;
   }

   @Override
   public int getSettingsCount() {
      return this.settings_.size();
   }

   @Override
   public ClientSetting getSettings(int var1) {
      return this.settings_.get(var1);
   }

   @Override
   public ClientSettingOrBuilder getSettingsOrBuilder(int var1) {
      return this.settings_.get(var1);
   }

   @Override
   public boolean hasLunarClientUiVersion() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public LunarClientUiVersion getLunarClientUiVersion() {
      return this.lunarClientUiVersion_ == null ? LunarClientUiVersion.getDefaultInstance() : this.lunarClientUiVersion_;
   }

   @Override
   public LunarClientUiVersionOrBuilder getLunarClientUiVersionOrBuilder() {
      return this.lunarClientUiVersion_ == null ? LunarClientUiVersion.getDefaultInstance() : this.lunarClientUiVersion_;
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
         var1.writeMessage(1, this.getMinecraftVersion());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getLunarClientVersion());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getLocation());
      }

      for (int var2 = 0; var2 < this.ichorModules_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 4, this.ichorModules_.getRaw(var2));
      }

      for (int var3 = 0; var3 < this.installedMods_.size(); var3++) {
         var1.writeMessage(5, this.installedMods_.get(var3));
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(6, this.getModpack());
      }

      for (int var4 = 0; var4 < this.glExtensions_.size(); var4++) {
         GeneratedMessageV3.writeString(var1, 7, this.glExtensions_.getRaw(var4));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.launchId_)) {
         GeneratedMessageV3.writeString(var1, 8, this.launchId_);
      }

      if (this.gpuMemoryCase_ == 9) {
         var1.writeMessage(9, (NvidiaGpuMemory)this.gpuMemory_);
      }

      if (this.gpuMemoryCase_ == 10) {
         var1.writeMessage(10, (MesaGpuMemory)this.gpuMemory_);
      }

      for (int var5 = 0; var5 < this.settings_.size(); var5++) {
         var1.writeMessage(11, this.settings_.get(var5));
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(12, this.getLunarClientUiVersion());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getMinecraftVersion());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLunarClientVersion());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLocation());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.ichorModules_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.ichorModules_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getIchorModulesList().size();

      for (int var10 = 0; var10 < this.installedMods_.size(); var10++) {
         var1 += CodedOutputStream.computeMessageSize(5, this.installedMods_.get(var10));
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getModpack());
      }

      var2 = 0;

      for (int var13 = 0; var13 < this.glExtensions_.size(); var13++) {
         var2 += computeStringSizeNoTag(this.glExtensions_.getRaw(var13));
      }

      var1 += var2;
      var1 += 1 * this.getGlExtensionsList().size();
      if (!GeneratedMessageV3.isStringEmpty(this.launchId_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.launchId_);
      }

      if (this.gpuMemoryCase_ == 9) {
         var1 += CodedOutputStream.computeMessageSize(9, (NvidiaGpuMemory)this.gpuMemory_);
      }

      if (this.gpuMemoryCase_ == 10) {
         var1 += CodedOutputStream.computeMessageSize(10, (MesaGpuMemory)this.gpuMemory_);
      }

      for (int var12 = 0; var12 < this.settings_.size(); var12++) {
         var1 += CodedOutputStream.computeMessageSize(11, this.settings_.get(var12));
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(12, this.getLunarClientUiVersion());
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

      if (!(var1 instanceof GameHandshake)) {
         return super.equals(var1);
      }

      GameHandshake var2 = (GameHandshake)var1;
      if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
         return false;
      }

      if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
         return false;
      }

      if (this.hasLunarClientVersion() != var2.hasLunarClientVersion()) {
         return false;
      }

      if (this.hasLunarClientVersion() && !this.getLunarClientVersion().equals(var2.getLunarClientVersion())) {
         return false;
      }

      if (this.hasLocation() != var2.hasLocation()) {
         return false;
      }

      if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
         return false;
      }

      if (!this.getIchorModulesList().equals(var2.getIchorModulesList())) {
         return false;
      }

      if (!this.getInstalledModsList().equals(var2.getInstalledModsList())) {
         return false;
      }

      if (this.hasModpack() != var2.hasModpack()) {
         return false;
      }

      if (this.hasModpack() && !this.getModpack().equals(var2.getModpack())) {
         return false;
      }

      if (!this.getGlExtensionsList().equals(var2.getGlExtensionsList())) {
         return false;
      }

      if (!this.getLaunchId().equals(var2.getLaunchId())) {
         return false;
      }

      if (!this.getSettingsList().equals(var2.getSettingsList())) {
         return false;
      }

      if (this.hasLunarClientUiVersion() != var2.hasLunarClientUiVersion()) {
         return false;
      }

      if (this.hasLunarClientUiVersion() && !this.getLunarClientUiVersion().equals(var2.getLunarClientUiVersion())) {
         return false;
      }

      if (!this.getGpuMemoryCase().equals(var2.getGpuMemoryCase())) {
         return false;
      }

      switch (this.gpuMemoryCase_) {
         case 0:
         default:
            break;
         case 9:
            if (!this.getNvidiaMemory().equals(var2.getNvidiaMemory())) {
               return false;
            }
            break;
         case 10:
            if (!this.getMesaMemory().equals(var2.getMesaMemory())) {
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
      if (this.hasMinecraftVersion()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMinecraftVersion().hashCode();
      }

      if (this.hasLunarClientVersion()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLunarClientVersion().hashCode();
      }

      if (this.hasLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.getIchorModulesCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getIchorModulesList().hashCode();
      }

      if (this.getInstalledModsCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getInstalledModsList().hashCode();
      }

      if (this.hasModpack()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      if (this.getGlExtensionsCount() > 0) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getGlExtensionsList().hashCode();
      }

      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getLaunchId().hashCode();
      if (this.getSettingsCount() > 0) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getSettingsList().hashCode();
      }

      if (this.hasLunarClientUiVersion()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.getLunarClientUiVersion().hashCode();
      }

      switch (this.gpuMemoryCase_) {
         case 0:
         default:
            break;
         case 9:
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getNvidiaMemory().hashCode();
            break;
         case 10:
            var1 = 37 * var1 + 10;
            var1 = 53 * var1 + this.getMesaMemory().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GameHandshake parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameHandshake parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameHandshake parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameHandshake parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameHandshake parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GameHandshake parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GameHandshake parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GameHandshake parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GameHandshake parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GameHandshake parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GameHandshake parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GameHandshake parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GameHandshake.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GameHandshake.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GameHandshake.Builder newBuilder(GameHandshake var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GameHandshake.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GameHandshake.Builder() : new GameHandshake.Builder().mergeFrom(this);
   }

   protected GameHandshake.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GameHandshake.Builder(var1);
   }

   public static GameHandshake getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GameHandshake> parser() {
      return PARSER;
   }

   @Override
   public Parser<GameHandshake> getParserForType() {
      return PARSER;
   }

   public GameHandshake getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GameHandshake.Builder> implements GameHandshakeOrBuilder {
      private int gpuMemoryCase_ = 0;
      private Object gpuMemory_;
      private int bitField0_;
      private MinecraftVersion minecraftVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
      private LunarClientVersion lunarClientVersion_;
      private SingleFieldBuilderV3<LunarClientVersion, LunarClientVersion.Builder, LunarClientVersionOrBuilder> lunarClientVersionBuilder_;
      private InboundLocation location_;
      private SingleFieldBuilderV3<InboundLocation, InboundLocation.Builder, InboundLocationOrBuilder> locationBuilder_;
      private LazyStringArrayList ichorModules_ = LazyStringArrayList.emptyList();
      private List<InstalledMod> installedMods_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<InstalledMod, InstalledMod.Builder, InstalledModOrBuilder> installedModsBuilder_;
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;
      private LazyStringArrayList glExtensions_ = LazyStringArrayList.emptyList();
      private Object launchId_ = "";
      private SingleFieldBuilderV3<NvidiaGpuMemory, NvidiaGpuMemory.Builder, NvidiaGpuMemoryOrBuilder> nvidiaMemoryBuilder_;
      private SingleFieldBuilderV3<MesaGpuMemory, MesaGpuMemory.Builder, MesaGpuMemoryOrBuilder> mesaMemoryBuilder_;
      private List<ClientSetting> settings_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ClientSetting, ClientSetting.Builder, ClientSettingOrBuilder> settingsBuilder_;
      private LunarClientUiVersion lunarClientUiVersion_;
      private SingleFieldBuilderV3<LunarClientUiVersion, LunarClientUiVersion.Builder, LunarClientUiVersionOrBuilder> lunarClientUiVersionBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_GameHandshake_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_GameHandshake_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GameHandshake.class, GameHandshake.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GameHandshake.alwaysUseFieldBuilders) {
            this.getMinecraftVersionFieldBuilder();
            this.getLunarClientVersionFieldBuilder();
            this.getLocationFieldBuilder();
            this.getInstalledModsFieldBuilder();
            this.getModpackFieldBuilder();
            this.getSettingsFieldBuilder();
            this.getLunarClientUiVersionFieldBuilder();
         }
      }

      public GameHandshake.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.lunarClientVersion_ = null;
         if (this.lunarClientVersionBuilder_ != null) {
            this.lunarClientVersionBuilder_.dispose();
            this.lunarClientVersionBuilder_ = null;
         }

         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.ichorModules_ = LazyStringArrayList.emptyList();
         if (this.installedModsBuilder_ == null) {
            this.installedMods_ = Collections.emptyList();
         } else {
            this.installedMods_ = null;
            this.installedModsBuilder_.clear();
         }

         this.bitField0_ &= -17;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.glExtensions_ = LazyStringArrayList.emptyList();
         this.launchId_ = "";
         if (this.nvidiaMemoryBuilder_ != null) {
            this.nvidiaMemoryBuilder_.clear();
         }

         if (this.mesaMemoryBuilder_ != null) {
            this.mesaMemoryBuilder_.clear();
         }

         if (this.settingsBuilder_ == null) {
            this.settings_ = Collections.emptyList();
         } else {
            this.settings_ = null;
            this.settingsBuilder_.clear();
         }

         this.bitField0_ &= -1025;
         this.lunarClientUiVersion_ = null;
         if (this.lunarClientUiVersionBuilder_ != null) {
            this.lunarClientUiVersionBuilder_.dispose();
            this.lunarClientUiVersionBuilder_ = null;
         }

         this.gpuMemoryCase_ = 0;
         this.gpuMemory_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_GameHandshake_descriptor;
      }

      public GameHandshake getDefaultInstanceForType() {
         return GameHandshake.getDefaultInstance();
      }

      public GameHandshake build() {
         GameHandshake var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GameHandshake buildPartial() {
         GameHandshake var1 = new GameHandshake(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(GameHandshake var1) {
         if (this.installedModsBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0) {
               this.installedMods_ = Collections.unmodifiableList(this.installedMods_);
               this.bitField0_ &= -17;
            }

            var1.installedMods_ = this.installedMods_;
         } else {
            var1.installedMods_ = this.installedModsBuilder_.build();
         }

         if (this.settingsBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0) {
               this.settings_ = Collections.unmodifiableList(this.settings_);
               this.bitField0_ &= -1025;
            }

            var1.settings_ = this.settings_;
         } else {
            var1.settings_ = this.settingsBuilder_.build();
         }
      }

      private void buildPartial0(GameHandshake var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.lunarClientVersion_ = this.lunarClientVersionBuilder_ == null ? this.lunarClientVersion_ : this.lunarClientVersionBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            this.ichorModules_.makeImmutable();
            var1.ichorModules_ = this.ichorModules_;
         }

         if ((var2 & 32) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 64) != 0) {
            this.glExtensions_.makeImmutable();
            var1.glExtensions_ = this.glExtensions_;
         }

         if ((var2 & 128) != 0) {
            var1.launchId_ = this.launchId_;
         }

         if ((var2 & 2048) != 0) {
            var1.lunarClientUiVersion_ = this.lunarClientUiVersionBuilder_ == null ? this.lunarClientUiVersion_ : this.lunarClientUiVersionBuilder_.build();
            var3 |= 16;
         }

         GameHandshake var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(GameHandshake var1) {
         var1.gpuMemoryCase_ = this.gpuMemoryCase_;
         var1.gpuMemory_ = this.gpuMemory_;
         if (this.gpuMemoryCase_ == 9 && this.nvidiaMemoryBuilder_ != null) {
            var1.gpuMemory_ = this.nvidiaMemoryBuilder_.build();
         }

         if (this.gpuMemoryCase_ == 10 && this.mesaMemoryBuilder_ != null) {
            var1.gpuMemory_ = this.mesaMemoryBuilder_.build();
         }
      }

      public GameHandshake.Builder clone() {
         return (GameHandshake.Builder)super.clone();
      }

      public GameHandshake.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GameHandshake.Builder)super.setField(var1, var2);
      }

      public GameHandshake.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GameHandshake.Builder)super.clearField(var1);
      }

      public GameHandshake.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GameHandshake.Builder)super.clearOneof(var1);
      }

      public GameHandshake.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GameHandshake.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GameHandshake.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GameHandshake.Builder)super.addRepeatedField(var1, var2);
      }

      public GameHandshake.Builder mergeFrom(Message var1) {
         if (var1 instanceof GameHandshake) {
            return this.mergeFrom((GameHandshake)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GameHandshake.Builder mergeFrom(GameHandshake var1) {
         if (var1 == GameHandshake.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMinecraftVersion()) {
            this.mergeMinecraftVersion(var1.getMinecraftVersion());
         }

         if (var1.hasLunarClientVersion()) {
            this.mergeLunarClientVersion(var1.getLunarClientVersion());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (!var1.ichorModules_.isEmpty()) {
            if (this.ichorModules_.isEmpty()) {
               this.ichorModules_ = var1.ichorModules_;
               this.bitField0_ |= 8;
            } else {
               this.ensureIchorModulesIsMutable();
               this.ichorModules_.addAll(var1.ichorModules_);
            }

            this.onChanged();
         }

         if (this.installedModsBuilder_ == null) {
            if (!var1.installedMods_.isEmpty()) {
               if (this.installedMods_.isEmpty()) {
                  this.installedMods_ = var1.installedMods_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureInstalledModsIsMutable();
                  this.installedMods_.addAll(var1.installedMods_);
               }

               this.onChanged();
            }
         } else if (!var1.installedMods_.isEmpty()) {
            if (this.installedModsBuilder_.isEmpty()) {
               this.installedModsBuilder_.dispose();
               this.installedModsBuilder_ = null;
               this.installedMods_ = var1.installedMods_;
               this.bitField0_ &= -17;
               this.installedModsBuilder_ = GameHandshake.alwaysUseFieldBuilders ? this.getInstalledModsFieldBuilder() : null;
            } else {
               this.installedModsBuilder_.addAllMessages(var1.installedMods_);
            }
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
         }

         if (!var1.glExtensions_.isEmpty()) {
            if (this.glExtensions_.isEmpty()) {
               this.glExtensions_ = var1.glExtensions_;
               this.bitField0_ |= 64;
            } else {
               this.ensureGlExtensionsIsMutable();
               this.glExtensions_.addAll(var1.glExtensions_);
            }

            this.onChanged();
         }

         if (!var1.getLaunchId().isEmpty()) {
            this.launchId_ = var1.launchId_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (this.settingsBuilder_ == null) {
            if (!var1.settings_.isEmpty()) {
               if (this.settings_.isEmpty()) {
                  this.settings_ = var1.settings_;
                  this.bitField0_ &= -1025;
               } else {
                  this.ensureSettingsIsMutable();
                  this.settings_.addAll(var1.settings_);
               }

               this.onChanged();
            }
         } else if (!var1.settings_.isEmpty()) {
            if (this.settingsBuilder_.isEmpty()) {
               this.settingsBuilder_.dispose();
               this.settingsBuilder_ = null;
               this.settings_ = var1.settings_;
               this.bitField0_ &= -1025;
               this.settingsBuilder_ = GameHandshake.alwaysUseFieldBuilders ? this.getSettingsFieldBuilder() : null;
            } else {
               this.settingsBuilder_.addAllMessages(var1.settings_);
            }
         }

         if (var1.hasLunarClientUiVersion()) {
            this.mergeLunarClientUiVersion(var1.getLunarClientUiVersion());
         }

         switch (var1.getGpuMemoryCase()) {
            case NVIDIA_MEMORY:
               this.mergeNvidiaMemory(var1.getNvidiaMemory());
               break;
            case MESA_MEMORY:
               this.mergeMesaMemory(var1.getMesaMemory());
            case GPUMEMORY_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GameHandshake.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMinecraftVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLunarClientVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     String var13 = var1.readStringRequireUtf8();
                     this.ensureIchorModulesIsMutable();
                     this.ichorModules_.add(var13);
                     break;
                  case 42:
                     InstalledMod var12 = var1.readMessage(InstalledMod.parser(), var2);
                     if (this.installedModsBuilder_ == null) {
                        this.ensureInstalledModsIsMutable();
                        this.installedMods_.add(var12);
                     } else {
                        this.installedModsBuilder_.addMessage(var12);
                     }
                     break;
                  case 50:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     String var11 = var1.readStringRequireUtf8();
                     this.ensureGlExtensionsIsMutable();
                     this.glExtensions_.add(var11);
                     break;
                  case 66:
                     this.launchId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     var1.readMessage(this.getNvidiaMemoryFieldBuilder().getBuilder(), var2);
                     this.gpuMemoryCase_ = 9;
                     break;
                  case 82:
                     var1.readMessage(this.getMesaMemoryFieldBuilder().getBuilder(), var2);
                     this.gpuMemoryCase_ = 10;
                     break;
                  case 90:
                     ClientSetting var5 = var1.readMessage(ClientSetting.parser(), var2);
                     if (this.settingsBuilder_ == null) {
                        this.ensureSettingsIsMutable();
                        this.settings_.add(var5);
                     } else {
                        this.settingsBuilder_.addMessage(var5);
                     }
                     break;
                  case 98:
                     var1.readMessage(this.getLunarClientUiVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2048;
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
      public GameHandshake.GpuMemoryCase getGpuMemoryCase() {
         return GameHandshake.GpuMemoryCase.forNumber(this.gpuMemoryCase_);
      }

      public GameHandshake.Builder clearGpuMemory() {
         this.gpuMemoryCase_ = 0;
         this.gpuMemory_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasMinecraftVersion() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public MinecraftVersion getMinecraftVersion() {
         if (this.minecraftVersionBuilder_ == null) {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         } else {
            return this.minecraftVersionBuilder_.getMessage();
         }
      }

      public GameHandshake.Builder setMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.minecraftVersion_ = var1;
         } else {
            this.minecraftVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersion_ = var1.build();
         } else {
            this.minecraftVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder mergeMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.minecraftVersion_ != null && this.minecraftVersion_ != MinecraftVersion.getDefaultInstance()) {
               this.getMinecraftVersionBuilder().mergeFrom(var1);
            } else {
               this.minecraftVersion_ = var1;
            }
         } else {
            this.minecraftVersionBuilder_.mergeFrom(var1);
         }

         if (this.minecraftVersion_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public GameHandshake.Builder clearMinecraftVersion() {
         this.bitField0_ &= -2;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getMinecraftVersionBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getMinecraftVersionFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
         if (this.minecraftVersionBuilder_ != null) {
            return this.minecraftVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         }
      }

      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getMinecraftVersionFieldBuilder() {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersionBuilder_ = new SingleFieldBuilderV3<>(this.getMinecraftVersion(), this.getParentForChildren(), this.isClean());
            this.minecraftVersion_ = null;
         }

         return this.minecraftVersionBuilder_;
      }

      @Override
      public boolean hasLunarClientVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public LunarClientVersion getLunarClientVersion() {
         if (this.lunarClientVersionBuilder_ == null) {
            return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
         } else {
            return this.lunarClientVersionBuilder_.getMessage();
         }
      }

      public GameHandshake.Builder setLunarClientVersion(LunarClientVersion var1) {
         if (this.lunarClientVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lunarClientVersion_ = var1;
         } else {
            this.lunarClientVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder setLunarClientVersion(LunarClientVersion.Builder var1) {
         if (this.lunarClientVersionBuilder_ == null) {
            this.lunarClientVersion_ = var1.build();
         } else {
            this.lunarClientVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder mergeLunarClientVersion(LunarClientVersion var1) {
         if (this.lunarClientVersionBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.lunarClientVersion_ != null && this.lunarClientVersion_ != LunarClientVersion.getDefaultInstance()) {
               this.getLunarClientVersionBuilder().mergeFrom(var1);
            } else {
               this.lunarClientVersion_ = var1;
            }
         } else {
            this.lunarClientVersionBuilder_.mergeFrom(var1);
         }

         if (this.lunarClientVersion_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public GameHandshake.Builder clearLunarClientVersion() {
         this.bitField0_ &= -3;
         this.lunarClientVersion_ = null;
         if (this.lunarClientVersionBuilder_ != null) {
            this.lunarClientVersionBuilder_.dispose();
            this.lunarClientVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder getLunarClientVersionBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLunarClientVersionFieldBuilder().getBuilder();
      }

      @Override
      public LunarClientVersionOrBuilder getLunarClientVersionOrBuilder() {
         if (this.lunarClientVersionBuilder_ != null) {
            return this.lunarClientVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.lunarClientVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarClientVersion_;
         }
      }

      private SingleFieldBuilderV3<LunarClientVersion, LunarClientVersion.Builder, LunarClientVersionOrBuilder> getLunarClientVersionFieldBuilder() {
         if (this.lunarClientVersionBuilder_ == null) {
            this.lunarClientVersionBuilder_ = new SingleFieldBuilderV3<>(this.getLunarClientVersion(), this.getParentForChildren(), this.isClean());
            this.lunarClientVersion_ = null;
         }

         return this.lunarClientVersionBuilder_;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public InboundLocation getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? InboundLocation.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public GameHandshake.Builder setLocation(InboundLocation var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder setLocation(InboundLocation.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder mergeLocation(InboundLocation var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.location_ != null && this.location_ != InboundLocation.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public GameHandshake.Builder clearLocation() {
         this.bitField0_ &= -5;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundLocation.Builder getLocationBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public InboundLocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? InboundLocation.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<InboundLocation, InboundLocation.Builder, InboundLocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      private void ensureIchorModulesIsMutable() {
         if (!this.ichorModules_.isModifiable()) {
            this.ichorModules_ = new LazyStringArrayList(this.ichorModules_);
         }

         this.bitField0_ |= 8;
      }

      public ProtocolStringList getIchorModulesList() {
         this.ichorModules_.makeImmutable();
         return this.ichorModules_;
      }

      @Override
      public int getIchorModulesCount() {
         return this.ichorModules_.size();
      }

      @Override
      public String getIchorModules(int var1) {
         return this.ichorModules_.get(var1);
      }

      @Override
      public ByteString getIchorModulesBytes(int var1) {
         return this.ichorModules_.getByteString(var1);
      }

      public GameHandshake.Builder setIchorModules(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureIchorModulesIsMutable();
         this.ichorModules_.set(var1, var2);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder addIchorModules(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureIchorModulesIsMutable();
         this.ichorModules_.add(var1);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder addAllIchorModules(Iterable<String> var1) {
         this.ensureIchorModulesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.ichorModules_);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder clearIchorModules() {
         this.ichorModules_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder addIchorModulesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GameHandshake.checkByteStringIsUtf8(var1);
         this.ensureIchorModulesIsMutable();
         this.ichorModules_.add(var1);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      private void ensureInstalledModsIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.installedMods_ = new ArrayList<>(this.installedMods_);
            this.bitField0_ |= 16;
         }
      }

      @Override
      public List<InstalledMod> getInstalledModsList() {
         return this.installedModsBuilder_ == null ? Collections.unmodifiableList(this.installedMods_) : this.installedModsBuilder_.getMessageList();
      }

      @Override
      public int getInstalledModsCount() {
         return this.installedModsBuilder_ == null ? this.installedMods_.size() : this.installedModsBuilder_.getCount();
      }

      @Override
      public InstalledMod getInstalledMods(int var1) {
         return this.installedModsBuilder_ == null ? this.installedMods_.get(var1) : this.installedModsBuilder_.getMessage(var1);
      }

      public GameHandshake.Builder setInstalledMods(int var1, InstalledMod var2) {
         if (this.installedModsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInstalledModsIsMutable();
            this.installedMods_.set(var1, var2);
            this.onChanged();
         } else {
            this.installedModsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GameHandshake.Builder setInstalledMods(int var1, InstalledMod.Builder var2) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.installedModsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GameHandshake.Builder addInstalledMods(InstalledMod var1) {
         if (this.installedModsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1);
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1);
         }

         return this;
      }

      public GameHandshake.Builder addInstalledMods(int var1, InstalledMod var2) {
         if (this.installedModsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1, var2);
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GameHandshake.Builder addInstalledMods(InstalledMod.Builder var1) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1.build());
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GameHandshake.Builder addInstalledMods(int var1, InstalledMod.Builder var2) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.installedModsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GameHandshake.Builder addAllInstalledMods(Iterable<? extends InstalledMod> var1) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.installedMods_);
            this.onChanged();
         } else {
            this.installedModsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GameHandshake.Builder clearInstalledMods() {
         if (this.installedModsBuilder_ == null) {
            this.installedMods_ = Collections.emptyList();
            this.bitField0_ &= -17;
            this.onChanged();
         } else {
            this.installedModsBuilder_.clear();
         }

         return this;
      }

      public GameHandshake.Builder removeInstalledMods(int var1) {
         if (this.installedModsBuilder_ == null) {
            this.ensureInstalledModsIsMutable();
            this.installedMods_.remove(var1);
            this.onChanged();
         } else {
            this.installedModsBuilder_.remove(var1);
         }

         return this;
      }

      public InstalledMod.Builder getInstalledModsBuilder(int var1) {
         return this.getInstalledModsFieldBuilder().getBuilder(var1);
      }

      @Override
      public InstalledModOrBuilder getInstalledModsOrBuilder(int var1) {
         return this.installedModsBuilder_ == null ? this.installedMods_.get(var1) : this.installedModsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends InstalledModOrBuilder> getInstalledModsOrBuilderList() {
         return this.installedModsBuilder_ != null ? this.installedModsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.installedMods_);
      }

      public InstalledMod.Builder addInstalledModsBuilder() {
         return this.getInstalledModsFieldBuilder().addBuilder(InstalledMod.getDefaultInstance());
      }

      public InstalledMod.Builder addInstalledModsBuilder(int var1) {
         return this.getInstalledModsFieldBuilder().addBuilder(var1, InstalledMod.getDefaultInstance());
      }

      public List<InstalledMod.Builder> getInstalledModsBuilderList() {
         return this.getInstalledModsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<InstalledMod, InstalledMod.Builder, InstalledModOrBuilder> getInstalledModsFieldBuilder() {
         if (this.installedModsBuilder_ == null) {
            this.installedModsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.installedMods_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean()
            );
            this.installedMods_ = null;
         }

         return this.installedModsBuilder_;
      }

      @Override
      public boolean hasModpack() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public GameHandshake.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public GameHandshake.Builder clearModpack() {
         this.bitField0_ &= -33;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getModpackFieldBuilder().getBuilder();
      }

      @Override
      public PlayerModpackOrBuilder getModpackOrBuilder() {
         if (this.modpackBuilder_ != null) {
            return this.modpackBuilder_.getMessageOrBuilder();
         } else {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         }
      }

      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> getModpackFieldBuilder() {
         if (this.modpackBuilder_ == null) {
            this.modpackBuilder_ = new SingleFieldBuilderV3<>(this.getModpack(), this.getParentForChildren(), this.isClean());
            this.modpack_ = null;
         }

         return this.modpackBuilder_;
      }

      private void ensureGlExtensionsIsMutable() {
         if (!this.glExtensions_.isModifiable()) {
            this.glExtensions_ = new LazyStringArrayList(this.glExtensions_);
         }

         this.bitField0_ |= 64;
      }

      public ProtocolStringList getGlExtensionsList() {
         this.glExtensions_.makeImmutable();
         return this.glExtensions_;
      }

      @Override
      public int getGlExtensionsCount() {
         return this.glExtensions_.size();
      }

      @Override
      public String getGlExtensions(int var1) {
         return this.glExtensions_.get(var1);
      }

      @Override
      public ByteString getGlExtensionsBytes(int var1) {
         return this.glExtensions_.getByteString(var1);
      }

      public GameHandshake.Builder setGlExtensions(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureGlExtensionsIsMutable();
         this.glExtensions_.set(var1, var2);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder addGlExtensions(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureGlExtensionsIsMutable();
         this.glExtensions_.add(var1);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder addAllGlExtensions(Iterable<String> var1) {
         this.ensureGlExtensionsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.glExtensions_);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder clearGlExtensions() {
         this.glExtensions_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder addGlExtensionsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GameHandshake.checkByteStringIsUtf8(var1);
         this.ensureGlExtensionsIsMutable();
         this.glExtensions_.add(var1);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public String getLaunchId() {
         Object var1 = this.launchId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.launchId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLaunchIdBytes() {
         Object var1 = this.launchId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.launchId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public GameHandshake.Builder setLaunchId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.launchId_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder clearLaunchId() {
         this.launchId_ = GameHandshake.getDefaultInstance().getLaunchId();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder setLaunchIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         GameHandshake.checkByteStringIsUtf8(var1);
         this.launchId_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasNvidiaMemory() {
         return this.gpuMemoryCase_ == 9;
      }

      @Override
      public NvidiaGpuMemory getNvidiaMemory() {
         if (this.nvidiaMemoryBuilder_ == null) {
            return this.gpuMemoryCase_ == 9 ? (NvidiaGpuMemory)this.gpuMemory_ : NvidiaGpuMemory.getDefaultInstance();
         } else {
            return this.gpuMemoryCase_ == 9 ? this.nvidiaMemoryBuilder_.getMessage() : NvidiaGpuMemory.getDefaultInstance();
         }
      }

      public GameHandshake.Builder setNvidiaMemory(NvidiaGpuMemory var1) {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.gpuMemory_ = var1;
            this.onChanged();
         } else {
            this.nvidiaMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryCase_ = 9;
         return this;
      }

      public GameHandshake.Builder setNvidiaMemory(NvidiaGpuMemory.Builder var1) {
         if (this.nvidiaMemoryBuilder_ == null) {
            this.gpuMemory_ = var1.build();
            this.onChanged();
         } else {
            this.nvidiaMemoryBuilder_.setMessage(var1.build());
         }

         this.gpuMemoryCase_ = 9;
         return this;
      }

      public GameHandshake.Builder mergeNvidiaMemory(NvidiaGpuMemory var1) {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (this.gpuMemoryCase_ == 9 && this.gpuMemory_ != NvidiaGpuMemory.getDefaultInstance()) {
               this.gpuMemory_ = NvidiaGpuMemory.newBuilder((NvidiaGpuMemory)this.gpuMemory_).mergeFrom(var1).buildPartial();
            } else {
               this.gpuMemory_ = var1;
            }

            this.onChanged();
         } else if (this.gpuMemoryCase_ == 9) {
            this.nvidiaMemoryBuilder_.mergeFrom(var1);
         } else {
            this.nvidiaMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryCase_ = 9;
         return this;
      }

      public GameHandshake.Builder clearNvidiaMemory() {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (this.gpuMemoryCase_ == 9) {
               this.gpuMemoryCase_ = 0;
               this.gpuMemory_ = null;
               this.onChanged();
            }
         } else {
            if (this.gpuMemoryCase_ == 9) {
               this.gpuMemoryCase_ = 0;
               this.gpuMemory_ = null;
            }

            this.nvidiaMemoryBuilder_.clear();
         }

         return this;
      }

      public NvidiaGpuMemory.Builder getNvidiaMemoryBuilder() {
         return this.getNvidiaMemoryFieldBuilder().getBuilder();
      }

      @Override
      public NvidiaGpuMemoryOrBuilder getNvidiaMemoryOrBuilder() {
         if (this.gpuMemoryCase_ == 9 && this.nvidiaMemoryBuilder_ != null) {
            return this.nvidiaMemoryBuilder_.getMessageOrBuilder();
         } else {
            return this.gpuMemoryCase_ == 9 ? (NvidiaGpuMemory)this.gpuMemory_ : NvidiaGpuMemory.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<NvidiaGpuMemory, NvidiaGpuMemory.Builder, NvidiaGpuMemoryOrBuilder> getNvidiaMemoryFieldBuilder() {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (this.gpuMemoryCase_ != 9) {
               this.gpuMemory_ = NvidiaGpuMemory.getDefaultInstance();
            }

            this.nvidiaMemoryBuilder_ = new SingleFieldBuilderV3<>((NvidiaGpuMemory)this.gpuMemory_, this.getParentForChildren(), this.isClean());
            this.gpuMemory_ = null;
         }

         this.gpuMemoryCase_ = 9;
         this.onChanged();
         return this.nvidiaMemoryBuilder_;
      }

      @Override
      public boolean hasMesaMemory() {
         return this.gpuMemoryCase_ == 10;
      }

      @Override
      public MesaGpuMemory getMesaMemory() {
         if (this.mesaMemoryBuilder_ == null) {
            return this.gpuMemoryCase_ == 10 ? (MesaGpuMemory)this.gpuMemory_ : MesaGpuMemory.getDefaultInstance();
         } else {
            return this.gpuMemoryCase_ == 10 ? this.mesaMemoryBuilder_.getMessage() : MesaGpuMemory.getDefaultInstance();
         }
      }

      public GameHandshake.Builder setMesaMemory(MesaGpuMemory var1) {
         if (this.mesaMemoryBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.gpuMemory_ = var1;
            this.onChanged();
         } else {
            this.mesaMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryCase_ = 10;
         return this;
      }

      public GameHandshake.Builder setMesaMemory(MesaGpuMemory.Builder var1) {
         if (this.mesaMemoryBuilder_ == null) {
            this.gpuMemory_ = var1.build();
            this.onChanged();
         } else {
            this.mesaMemoryBuilder_.setMessage(var1.build());
         }

         this.gpuMemoryCase_ = 10;
         return this;
      }

      public GameHandshake.Builder mergeMesaMemory(MesaGpuMemory var1) {
         if (this.mesaMemoryBuilder_ == null) {
            if (this.gpuMemoryCase_ == 10 && this.gpuMemory_ != MesaGpuMemory.getDefaultInstance()) {
               this.gpuMemory_ = MesaGpuMemory.newBuilder((MesaGpuMemory)this.gpuMemory_).mergeFrom(var1).buildPartial();
            } else {
               this.gpuMemory_ = var1;
            }

            this.onChanged();
         } else if (this.gpuMemoryCase_ == 10) {
            this.mesaMemoryBuilder_.mergeFrom(var1);
         } else {
            this.mesaMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryCase_ = 10;
         return this;
      }

      public GameHandshake.Builder clearMesaMemory() {
         if (this.mesaMemoryBuilder_ == null) {
            if (this.gpuMemoryCase_ == 10) {
               this.gpuMemoryCase_ = 0;
               this.gpuMemory_ = null;
               this.onChanged();
            }
         } else {
            if (this.gpuMemoryCase_ == 10) {
               this.gpuMemoryCase_ = 0;
               this.gpuMemory_ = null;
            }

            this.mesaMemoryBuilder_.clear();
         }

         return this;
      }

      public MesaGpuMemory.Builder getMesaMemoryBuilder() {
         return this.getMesaMemoryFieldBuilder().getBuilder();
      }

      @Override
      public MesaGpuMemoryOrBuilder getMesaMemoryOrBuilder() {
         if (this.gpuMemoryCase_ == 10 && this.mesaMemoryBuilder_ != null) {
            return this.mesaMemoryBuilder_.getMessageOrBuilder();
         } else {
            return this.gpuMemoryCase_ == 10 ? (MesaGpuMemory)this.gpuMemory_ : MesaGpuMemory.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<MesaGpuMemory, MesaGpuMemory.Builder, MesaGpuMemoryOrBuilder> getMesaMemoryFieldBuilder() {
         if (this.mesaMemoryBuilder_ == null) {
            if (this.gpuMemoryCase_ != 10) {
               this.gpuMemory_ = MesaGpuMemory.getDefaultInstance();
            }

            this.mesaMemoryBuilder_ = new SingleFieldBuilderV3<>((MesaGpuMemory)this.gpuMemory_, this.getParentForChildren(), this.isClean());
            this.gpuMemory_ = null;
         }

         this.gpuMemoryCase_ = 10;
         this.onChanged();
         return this.mesaMemoryBuilder_;
      }

      private void ensureSettingsIsMutable() {
         if ((this.bitField0_ & 1024) == 0) {
            this.settings_ = new ArrayList<>(this.settings_);
            this.bitField0_ |= 1024;
         }
      }

      @Override
      public List<ClientSetting> getSettingsList() {
         return this.settingsBuilder_ == null ? Collections.unmodifiableList(this.settings_) : this.settingsBuilder_.getMessageList();
      }

      @Override
      public int getSettingsCount() {
         return this.settingsBuilder_ == null ? this.settings_.size() : this.settingsBuilder_.getCount();
      }

      @Override
      public ClientSetting getSettings(int var1) {
         return this.settingsBuilder_ == null ? this.settings_.get(var1) : this.settingsBuilder_.getMessage(var1);
      }

      public GameHandshake.Builder setSettings(int var1, ClientSetting var2) {
         if (this.settingsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSettingsIsMutable();
            this.settings_.set(var1, var2);
            this.onChanged();
         } else {
            this.settingsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GameHandshake.Builder setSettings(int var1, ClientSetting.Builder var2) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.settingsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GameHandshake.Builder addSettings(ClientSetting var1) {
         if (this.settingsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureSettingsIsMutable();
            this.settings_.add(var1);
            this.onChanged();
         } else {
            this.settingsBuilder_.addMessage(var1);
         }

         return this;
      }

      public GameHandshake.Builder addSettings(int var1, ClientSetting var2) {
         if (this.settingsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSettingsIsMutable();
            this.settings_.add(var1, var2);
            this.onChanged();
         } else {
            this.settingsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GameHandshake.Builder addSettings(ClientSetting.Builder var1) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.add(var1.build());
            this.onChanged();
         } else {
            this.settingsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GameHandshake.Builder addSettings(int var1, ClientSetting.Builder var2) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.settingsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GameHandshake.Builder addAllSettings(Iterable<? extends ClientSetting> var1) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.settings_);
            this.onChanged();
         } else {
            this.settingsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GameHandshake.Builder clearSettings() {
         if (this.settingsBuilder_ == null) {
            this.settings_ = Collections.emptyList();
            this.bitField0_ &= -1025;
            this.onChanged();
         } else {
            this.settingsBuilder_.clear();
         }

         return this;
      }

      public GameHandshake.Builder removeSettings(int var1) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.remove(var1);
            this.onChanged();
         } else {
            this.settingsBuilder_.remove(var1);
         }

         return this;
      }

      public ClientSetting.Builder getSettingsBuilder(int var1) {
         return this.getSettingsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ClientSettingOrBuilder getSettingsOrBuilder(int var1) {
         return this.settingsBuilder_ == null ? this.settings_.get(var1) : this.settingsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ClientSettingOrBuilder> getSettingsOrBuilderList() {
         return this.settingsBuilder_ != null ? this.settingsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.settings_);
      }

      public ClientSetting.Builder addSettingsBuilder() {
         return this.getSettingsFieldBuilder().addBuilder(ClientSetting.getDefaultInstance());
      }

      public ClientSetting.Builder addSettingsBuilder(int var1) {
         return this.getSettingsFieldBuilder().addBuilder(var1, ClientSetting.getDefaultInstance());
      }

      public List<ClientSetting.Builder> getSettingsBuilderList() {
         return this.getSettingsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ClientSetting, ClientSetting.Builder, ClientSettingOrBuilder> getSettingsFieldBuilder() {
         if (this.settingsBuilder_ == null) {
            this.settingsBuilder_ = new RepeatedFieldBuilderV3<>(this.settings_, (this.bitField0_ & 1024) != 0, this.getParentForChildren(), this.isClean());
            this.settings_ = null;
         }

         return this.settingsBuilder_;
      }

      @Override
      public boolean hasLunarClientUiVersion() {
         return (this.bitField0_ & 2048) != 0;
      }

      @Override
      public LunarClientUiVersion getLunarClientUiVersion() {
         if (this.lunarClientUiVersionBuilder_ == null) {
            return this.lunarClientUiVersion_ == null ? LunarClientUiVersion.getDefaultInstance() : this.lunarClientUiVersion_;
         } else {
            return this.lunarClientUiVersionBuilder_.getMessage();
         }
      }

      public GameHandshake.Builder setLunarClientUiVersion(LunarClientUiVersion var1) {
         if (this.lunarClientUiVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lunarClientUiVersion_ = var1;
         } else {
            this.lunarClientUiVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder setLunarClientUiVersion(LunarClientUiVersion.Builder var1) {
         if (this.lunarClientUiVersionBuilder_ == null) {
            this.lunarClientUiVersion_ = var1.build();
         } else {
            this.lunarClientUiVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public GameHandshake.Builder mergeLunarClientUiVersion(LunarClientUiVersion var1) {
         if (this.lunarClientUiVersionBuilder_ == null) {
            if ((this.bitField0_ & 2048) != 0 && this.lunarClientUiVersion_ != null && this.lunarClientUiVersion_ != LunarClientUiVersion.getDefaultInstance()) {
               this.getLunarClientUiVersionBuilder().mergeFrom(var1);
            } else {
               this.lunarClientUiVersion_ = var1;
            }
         } else {
            this.lunarClientUiVersionBuilder_.mergeFrom(var1);
         }

         if (this.lunarClientUiVersion_ != null) {
            this.bitField0_ |= 2048;
            this.onChanged();
         }

         return this;
      }

      public GameHandshake.Builder clearLunarClientUiVersion() {
         this.bitField0_ &= -2049;
         this.lunarClientUiVersion_ = null;
         if (this.lunarClientUiVersionBuilder_ != null) {
            this.lunarClientUiVersionBuilder_.dispose();
            this.lunarClientUiVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LunarClientUiVersion.Builder getLunarClientUiVersionBuilder() {
         this.bitField0_ |= 2048;
         this.onChanged();
         return this.getLunarClientUiVersionFieldBuilder().getBuilder();
      }

      @Override
      public LunarClientUiVersionOrBuilder getLunarClientUiVersionOrBuilder() {
         if (this.lunarClientUiVersionBuilder_ != null) {
            return this.lunarClientUiVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.lunarClientUiVersion_ == null ? LunarClientUiVersion.getDefaultInstance() : this.lunarClientUiVersion_;
         }
      }

      private SingleFieldBuilderV3<LunarClientUiVersion, LunarClientUiVersion.Builder, LunarClientUiVersionOrBuilder> getLunarClientUiVersionFieldBuilder() {
         if (this.lunarClientUiVersionBuilder_ == null) {
            this.lunarClientUiVersionBuilder_ = new SingleFieldBuilderV3<>(this.getLunarClientUiVersion(), this.getParentForChildren(), this.isClean());
            this.lunarClientUiVersion_ = null;
         }

         return this.lunarClientUiVersionBuilder_;
      }

      public final GameHandshake.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GameHandshake.Builder)super.setUnknownFields(var1);
      }

      public final GameHandshake.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GameHandshake.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum GpuMemoryCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      NVIDIA_MEMORY(9),
      MESA_MEMORY(10),
      GPUMEMORY_NOT_SET(0);

      private final int value;

      GpuMemoryCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static GameHandshake.GpuMemoryCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static GameHandshake.GpuMemoryCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return GPUMEMORY_NOT_SET;
            case 9:
               return NVIDIA_MEMORY;
            case 10:
               return MESA_MEMORY;
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
