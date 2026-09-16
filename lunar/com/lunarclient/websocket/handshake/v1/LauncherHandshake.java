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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.websocket.radio.v1.InboundRadioInfo;
import com.lunarclient.websocket.radio.v1.InboundRadioInfoOrBuilder;
import com.lunarclient.websocket.setting.v1.LauncherSetting;
import com.lunarclient.websocket.setting.v1.LauncherSettingOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LauncherHandshake extends GeneratedMessageV3 implements LauncherHandshakeOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ENVIRONMENT_FIELD_NUMBER = 1;
   private volatile Object environment_ = "";
   public static final int SESSION_ID_FIELD_NUMBER = 2;
   private volatile Object sessionId_ = "";
   public static final int UPDATER_STREAM_FIELD_NUMBER = 3;
   private volatile Object updaterStream_ = "";
   public static final int ELECTRON_BINARIES_TYPE_FIELD_NUMBER = 4;
   private int electronBinariesType_ = 0;
   public static final int ELEVATED_FIELD_NUMBER = 5;
   private boolean elevated_ = false;
   public static final int SILENT_START_FIELD_NUMBER = 6;
   private boolean silentStart_ = false;
   public static final int UPTIME_SINCE_START_FIELD_NUMBER = 7;
   private int uptimeSinceStart_ = 0;
   public static final int STARTED_AT_FIELD_NUMBER = 8;
   private Timestamp startedAt_;
   public static final int BUILD_NUMBER_FIELD_NUMBER = 9;
   private int buildNumber_ = 0;
   public static final int GIT_COMMIT_HASH_FIELD_NUMBER = 10;
   private volatile Object gitCommitHash_ = "";
   public static final int GIT_SHORT_COMMIT_HASH_FIELD_NUMBER = 11;
   private volatile Object gitShortCommitHash_ = "";
   public static final int RADIO_INFO_FIELD_NUMBER = 12;
   private InboundRadioInfo radioInfo_;
   public static final int OPTIMIZED_ADS_FIELD_NUMBER = 13;
   private boolean optimizedAds_ = false;
   public static final int ANALYTICS_FIELD_NUMBER = 14;
   private boolean analytics_ = false;
   public static final int OWAHE_FIELD_NUMBER = 15;
   private boolean owahe_ = false;
   public static final int SETTINGS_FIELD_NUMBER = 16;
   private List<LauncherSetting> settings_;
   public static final int SAFE_STORAGE_FIELD_NUMBER = 17;
   private boolean safeStorage_ = false;
   private byte memoizedIsInitialized = -1;
   private static final LauncherHandshake DEFAULT_INSTANCE = new LauncherHandshake();
   private static final Parser<LauncherHandshake> PARSER = new AbstractParser<LauncherHandshake>() {
      public LauncherHandshake parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LauncherHandshake.Builder var3 = LauncherHandshake.newBuilder();

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

   private LauncherHandshake(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LauncherHandshake() {
      this.environment_ = "";
      this.sessionId_ = "";
      this.updaterStream_ = "";
      this.electronBinariesType_ = 0;
      this.gitCommitHash_ = "";
      this.gitShortCommitHash_ = "";
      this.settings_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LauncherHandshake();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LauncherHandshake.class, LauncherHandshake.Builder.class);
   }

   @Override
   public String getEnvironment() {
      Object var1 = this.environment_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.environment_ = var3;
      return var3;
   }

   @Override
   public ByteString getEnvironmentBytes() {
      Object var1 = this.environment_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.environment_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getSessionId() {
      Object var1 = this.sessionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.sessionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getSessionIdBytes() {
      Object var1 = this.sessionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.sessionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getUpdaterStream() {
      Object var1 = this.updaterStream_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.updaterStream_ = var3;
      return var3;
   }

   @Override
   public ByteString getUpdaterStreamBytes() {
      Object var1 = this.updaterStream_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.updaterStream_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getElectronBinariesTypeValue() {
      return this.electronBinariesType_;
   }

   @Override
   public LauncherHandshake.ElectronBinariesType getElectronBinariesType() {
      LauncherHandshake.ElectronBinariesType var1 = LauncherHandshake.ElectronBinariesType.forNumber(this.electronBinariesType_);
      return var1 == null ? LauncherHandshake.ElectronBinariesType.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getElevated() {
      return this.elevated_;
   }

   @Override
   public boolean getSilentStart() {
      return this.silentStart_;
   }

   @Override
   public int getUptimeSinceStart() {
      return this.uptimeSinceStart_;
   }

   @Override
   public boolean hasStartedAt() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getStartedAt() {
      return this.startedAt_ == null ? Timestamp.getDefaultInstance() : this.startedAt_;
   }

   @Override
   public TimestampOrBuilder getStartedAtOrBuilder() {
      return this.startedAt_ == null ? Timestamp.getDefaultInstance() : this.startedAt_;
   }

   @Override
   public int getBuildNumber() {
      return this.buildNumber_;
   }

   @Override
   public String getGitCommitHash() {
      Object var1 = this.gitCommitHash_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gitCommitHash_ = var3;
      return var3;
   }

   @Override
   public ByteString getGitCommitHashBytes() {
      Object var1 = this.gitCommitHash_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gitCommitHash_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getGitShortCommitHash() {
      Object var1 = this.gitShortCommitHash_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gitShortCommitHash_ = var3;
      return var3;
   }

   @Override
   public ByteString getGitShortCommitHashBytes() {
      Object var1 = this.gitShortCommitHash_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gitShortCommitHash_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasRadioInfo() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public InboundRadioInfo getRadioInfo() {
      return this.radioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.radioInfo_;
   }

   @Override
   public InboundRadioInfoOrBuilder getRadioInfoOrBuilder() {
      return this.radioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.radioInfo_;
   }

   @Override
   public boolean getOptimizedAds() {
      return this.optimizedAds_;
   }

   @Override
   public boolean getAnalytics() {
      return this.analytics_;
   }

   @Override
   public boolean getOwahe() {
      return this.owahe_;
   }

   @Override
   public List<LauncherSetting> getSettingsList() {
      return this.settings_;
   }

   @Override
   public List<? extends LauncherSettingOrBuilder> getSettingsOrBuilderList() {
      return this.settings_;
   }

   @Override
   public int getSettingsCount() {
      return this.settings_.size();
   }

   @Override
   public LauncherSetting getSettings(int var1) {
      return this.settings_.get(var1);
   }

   @Override
   public LauncherSettingOrBuilder getSettingsOrBuilder(int var1) {
      return this.settings_.get(var1);
   }

   @Override
   public boolean getSafeStorage() {
      return this.safeStorage_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.environment_)) {
         GeneratedMessageV3.writeString(var1, 1, this.environment_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.sessionId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.sessionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.updaterStream_)) {
         GeneratedMessageV3.writeString(var1, 3, this.updaterStream_);
      }

      if (this.electronBinariesType_ != LauncherHandshake.ElectronBinariesType.ELECTRON_BINARIES_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.electronBinariesType_);
      }

      if (this.elevated_) {
         var1.writeBool(5, this.elevated_);
      }

      if (this.silentStart_) {
         var1.writeBool(6, this.silentStart_);
      }

      if (this.uptimeSinceStart_ != 0) {
         var1.writeInt32(7, this.uptimeSinceStart_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(8, this.getStartedAt());
      }

      if (this.buildNumber_ != 0) {
         var1.writeInt32(9, this.buildNumber_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gitCommitHash_)) {
         GeneratedMessageV3.writeString(var1, 10, this.gitCommitHash_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gitShortCommitHash_)) {
         GeneratedMessageV3.writeString(var1, 11, this.gitShortCommitHash_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(12, this.getRadioInfo());
      }

      if (this.optimizedAds_) {
         var1.writeBool(13, this.optimizedAds_);
      }

      if (this.analytics_) {
         var1.writeBool(14, this.analytics_);
      }

      if (this.owahe_) {
         var1.writeBool(15, this.owahe_);
      }

      for (int var2 = 0; var2 < this.settings_.size(); var2++) {
         var1.writeMessage(16, this.settings_.get(var2));
      }

      if (this.safeStorage_) {
         var1.writeBool(17, this.safeStorage_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.environment_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.environment_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.sessionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.sessionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.updaterStream_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.updaterStream_);
      }

      if (this.electronBinariesType_ != LauncherHandshake.ElectronBinariesType.ELECTRON_BINARIES_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.electronBinariesType_);
      }

      if (this.elevated_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.elevated_);
      }

      if (this.silentStart_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.silentStart_);
      }

      if (this.uptimeSinceStart_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.uptimeSinceStart_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getStartedAt());
      }

      if (this.buildNumber_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(9, this.buildNumber_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gitCommitHash_)) {
         var1 += GeneratedMessageV3.computeStringSize(10, this.gitCommitHash_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gitShortCommitHash_)) {
         var1 += GeneratedMessageV3.computeStringSize(11, this.gitShortCommitHash_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(12, this.getRadioInfo());
      }

      if (this.optimizedAds_) {
         var1 += CodedOutputStream.computeBoolSize(13, this.optimizedAds_);
      }

      if (this.analytics_) {
         var1 += CodedOutputStream.computeBoolSize(14, this.analytics_);
      }

      if (this.owahe_) {
         var1 += CodedOutputStream.computeBoolSize(15, this.owahe_);
      }

      for (int var2 = 0; var2 < this.settings_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(16, this.settings_.get(var2));
      }

      if (this.safeStorage_) {
         var1 += CodedOutputStream.computeBoolSize(17, this.safeStorage_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LauncherHandshake)) {
         return super.equals(var1);
      } else {
         LauncherHandshake var2 = (LauncherHandshake)var1;
         if (!this.getEnvironment().equals(var2.getEnvironment())) {
            return false;
         } else if (!this.getSessionId().equals(var2.getSessionId())) {
            return false;
         } else if (!this.getUpdaterStream().equals(var2.getUpdaterStream())) {
            return false;
         } else if (this.electronBinariesType_ != var2.electronBinariesType_) {
            return false;
         } else if (this.getElevated() != var2.getElevated()) {
            return false;
         } else if (this.getSilentStart() != var2.getSilentStart()) {
            return false;
         } else if (this.getUptimeSinceStart() != var2.getUptimeSinceStart()) {
            return false;
         } else if (this.hasStartedAt() != var2.hasStartedAt()) {
            return false;
         } else if (this.hasStartedAt() && !this.getStartedAt().equals(var2.getStartedAt())) {
            return false;
         } else if (this.getBuildNumber() != var2.getBuildNumber()) {
            return false;
         } else if (!this.getGitCommitHash().equals(var2.getGitCommitHash())) {
            return false;
         } else if (!this.getGitShortCommitHash().equals(var2.getGitShortCommitHash())) {
            return false;
         } else if (this.hasRadioInfo() != var2.hasRadioInfo()) {
            return false;
         } else if (this.hasRadioInfo() && !this.getRadioInfo().equals(var2.getRadioInfo())) {
            return false;
         } else if (this.getOptimizedAds() != var2.getOptimizedAds()) {
            return false;
         } else if (this.getAnalytics() != var2.getAnalytics()) {
            return false;
         } else if (this.getOwahe() != var2.getOwahe()) {
            return false;
         } else if (!this.getSettingsList().equals(var2.getSettingsList())) {
            return false;
         } else {
            return this.getSafeStorage() != var2.getSafeStorage() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getEnvironment().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getSessionId().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getUpdaterStream().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.electronBinariesType_;
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getElevated());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSilentStart());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getUptimeSinceStart();
      if (this.hasStartedAt()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getStartedAt().hashCode();
      }

      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getBuildNumber();
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.getGitCommitHash().hashCode();
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + this.getGitShortCommitHash().hashCode();
      if (this.hasRadioInfo()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.getRadioInfo().hashCode();
      }

      var1 = 37 * var1 + 13;
      var1 = 53 * var1 + Internal.hashBoolean(this.getOptimizedAds());
      var1 = 37 * var1 + 14;
      var1 = 53 * var1 + Internal.hashBoolean(this.getAnalytics());
      var1 = 37 * var1 + 15;
      var1 = 53 * var1 + Internal.hashBoolean(this.getOwahe());
      if (this.getSettingsCount() > 0) {
         var1 = 37 * var1 + 16;
         var1 = 53 * var1 + this.getSettingsList().hashCode();
      }

      var1 = 37 * var1 + 17;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSafeStorage());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LauncherHandshake parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHandshake parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHandshake parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHandshake parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHandshake parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHandshake parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHandshake parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherHandshake parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LauncherHandshake parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LauncherHandshake parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LauncherHandshake parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherHandshake parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LauncherHandshake.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LauncherHandshake.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LauncherHandshake.Builder newBuilder(LauncherHandshake var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LauncherHandshake.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LauncherHandshake.Builder() : new LauncherHandshake.Builder().mergeFrom(this);
   }

   protected LauncherHandshake.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LauncherHandshake.Builder(var1);
   }

   public static LauncherHandshake getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LauncherHandshake> parser() {
      return PARSER;
   }

   @Override
   public Parser<LauncherHandshake> getParserForType() {
      return PARSER;
   }

   public LauncherHandshake getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LauncherHandshake.Builder> implements LauncherHandshakeOrBuilder {
      private int bitField0_;
      private Object environment_ = "";
      private Object sessionId_ = "";
      private Object updaterStream_ = "";
      private int electronBinariesType_ = 0;
      private boolean elevated_;
      private boolean silentStart_;
      private int uptimeSinceStart_;
      private Timestamp startedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> startedAtBuilder_;
      private int buildNumber_;
      private Object gitCommitHash_ = "";
      private Object gitShortCommitHash_ = "";
      private InboundRadioInfo radioInfo_;
      private SingleFieldBuilderV3<InboundRadioInfo, InboundRadioInfo.Builder, InboundRadioInfoOrBuilder> radioInfoBuilder_;
      private boolean optimizedAds_;
      private boolean analytics_;
      private boolean owahe_;
      private List<LauncherSetting> settings_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<LauncherSetting, LauncherSetting.Builder, LauncherSettingOrBuilder> settingsBuilder_;
      private boolean safeStorage_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LauncherHandshake.class, LauncherHandshake.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LauncherHandshake.alwaysUseFieldBuilders) {
            this.getStartedAtFieldBuilder();
            this.getRadioInfoFieldBuilder();
            this.getSettingsFieldBuilder();
         }
      }

      public LauncherHandshake.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.environment_ = "";
         this.sessionId_ = "";
         this.updaterStream_ = "";
         this.electronBinariesType_ = 0;
         this.elevated_ = false;
         this.silentStart_ = false;
         this.uptimeSinceStart_ = 0;
         this.startedAt_ = null;
         if (this.startedAtBuilder_ != null) {
            this.startedAtBuilder_.dispose();
            this.startedAtBuilder_ = null;
         }

         this.buildNumber_ = 0;
         this.gitCommitHash_ = "";
         this.gitShortCommitHash_ = "";
         this.radioInfo_ = null;
         if (this.radioInfoBuilder_ != null) {
            this.radioInfoBuilder_.dispose();
            this.radioInfoBuilder_ = null;
         }

         this.optimizedAds_ = false;
         this.analytics_ = false;
         this.owahe_ = false;
         if (this.settingsBuilder_ == null) {
            this.settings_ = Collections.emptyList();
         } else {
            this.settings_ = null;
            this.settingsBuilder_.clear();
         }

         this.bitField0_ &= -32769;
         this.safeStorage_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_LauncherHandshake_descriptor;
      }

      public LauncherHandshake getDefaultInstanceForType() {
         return LauncherHandshake.getDefaultInstance();
      }

      public LauncherHandshake build() {
         LauncherHandshake var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LauncherHandshake buildPartial() {
         LauncherHandshake var1 = new LauncherHandshake(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LauncherHandshake var1) {
         if (this.settingsBuilder_ == null) {
            if ((this.bitField0_ & 32768) != 0) {
               this.settings_ = Collections.unmodifiableList(this.settings_);
               this.bitField0_ &= -32769;
            }

            var1.settings_ = this.settings_;
         } else {
            var1.settings_ = this.settingsBuilder_.build();
         }
      }

      private void buildPartial0(LauncherHandshake var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.environment_ = this.environment_;
         }

         if ((var2 & 2) != 0) {
            var1.sessionId_ = this.sessionId_;
         }

         if ((var2 & 4) != 0) {
            var1.updaterStream_ = this.updaterStream_;
         }

         if ((var2 & 8) != 0) {
            var1.electronBinariesType_ = this.electronBinariesType_;
         }

         if ((var2 & 16) != 0) {
            var1.elevated_ = this.elevated_;
         }

         if ((var2 & 32) != 0) {
            var1.silentStart_ = this.silentStart_;
         }

         if ((var2 & 64) != 0) {
            var1.uptimeSinceStart_ = this.uptimeSinceStart_;
         }

         byte var3 = 0;
         if ((var2 & 128) != 0) {
            var1.startedAt_ = this.startedAtBuilder_ == null ? this.startedAt_ : this.startedAtBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 256) != 0) {
            var1.buildNumber_ = this.buildNumber_;
         }

         if ((var2 & 512) != 0) {
            var1.gitCommitHash_ = this.gitCommitHash_;
         }

         if ((var2 & 1024) != 0) {
            var1.gitShortCommitHash_ = this.gitShortCommitHash_;
         }

         if ((var2 & 2048) != 0) {
            var1.radioInfo_ = this.radioInfoBuilder_ == null ? this.radioInfo_ : this.radioInfoBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4096) != 0) {
            var1.optimizedAds_ = this.optimizedAds_;
         }

         if ((var2 & 8192) != 0) {
            var1.analytics_ = this.analytics_;
         }

         if ((var2 & 16384) != 0) {
            var1.owahe_ = this.owahe_;
         }

         if ((var2 & 65536) != 0) {
            var1.safeStorage_ = this.safeStorage_;
         }

         LauncherHandshake var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LauncherHandshake.Builder clone() {
         return (LauncherHandshake.Builder)super.clone();
      }

      public LauncherHandshake.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherHandshake.Builder)super.setField(var1, var2);
      }

      public LauncherHandshake.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LauncherHandshake.Builder)super.clearField(var1);
      }

      public LauncherHandshake.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LauncherHandshake.Builder)super.clearOneof(var1);
      }

      public LauncherHandshake.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LauncherHandshake.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LauncherHandshake.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherHandshake.Builder)super.addRepeatedField(var1, var2);
      }

      public LauncherHandshake.Builder mergeFrom(Message var1) {
         if (var1 instanceof LauncherHandshake) {
            return this.mergeFrom((LauncherHandshake)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LauncherHandshake.Builder mergeFrom(LauncherHandshake var1) {
         if (var1 == LauncherHandshake.getDefaultInstance()) {
            return this;
         }

         if (!var1.getEnvironment().isEmpty()) {
            this.environment_ = var1.environment_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getSessionId().isEmpty()) {
            this.sessionId_ = var1.sessionId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getUpdaterStream().isEmpty()) {
            this.updaterStream_ = var1.updaterStream_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.electronBinariesType_ != 0) {
            this.setElectronBinariesTypeValue(var1.getElectronBinariesTypeValue());
         }

         if (var1.getElevated()) {
            this.setElevated(var1.getElevated());
         }

         if (var1.getSilentStart()) {
            this.setSilentStart(var1.getSilentStart());
         }

         if (var1.getUptimeSinceStart() != 0) {
            this.setUptimeSinceStart(var1.getUptimeSinceStart());
         }

         if (var1.hasStartedAt()) {
            this.mergeStartedAt(var1.getStartedAt());
         }

         if (var1.getBuildNumber() != 0) {
            this.setBuildNumber(var1.getBuildNumber());
         }

         if (!var1.getGitCommitHash().isEmpty()) {
            this.gitCommitHash_ = var1.gitCommitHash_;
            this.bitField0_ |= 512;
            this.onChanged();
         }

         if (!var1.getGitShortCommitHash().isEmpty()) {
            this.gitShortCommitHash_ = var1.gitShortCommitHash_;
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         if (var1.hasRadioInfo()) {
            this.mergeRadioInfo(var1.getRadioInfo());
         }

         if (var1.getOptimizedAds()) {
            this.setOptimizedAds(var1.getOptimizedAds());
         }

         if (var1.getAnalytics()) {
            this.setAnalytics(var1.getAnalytics());
         }

         if (var1.getOwahe()) {
            this.setOwahe(var1.getOwahe());
         }

         if (this.settingsBuilder_ == null) {
            if (!var1.settings_.isEmpty()) {
               if (this.settings_.isEmpty()) {
                  this.settings_ = var1.settings_;
                  this.bitField0_ &= -32769;
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
               this.bitField0_ &= -32769;
               this.settingsBuilder_ = LauncherHandshake.alwaysUseFieldBuilders ? this.getSettingsFieldBuilder() : null;
            } else {
               this.settingsBuilder_.addAllMessages(var1.settings_);
            }
         }

         if (var1.getSafeStorage()) {
            this.setSafeStorage(var1.getSafeStorage());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LauncherHandshake.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.environment_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.sessionId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.updaterStream_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.electronBinariesType_ = var1.readEnum();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.elevated_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.silentStart_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.uptimeSinceStart_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getStartedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.buildNumber_ = var1.readInt32();
                     this.bitField0_ |= 256;
                     break;
                  case 82:
                     this.gitCommitHash_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 512;
                     break;
                  case 90:
                     this.gitShortCommitHash_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1024;
                     break;
                  case 98:
                     var1.readMessage(this.getRadioInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2048;
                     break;
                  case 104:
                     this.optimizedAds_ = var1.readBool();
                     this.bitField0_ |= 4096;
                     break;
                  case 112:
                     this.analytics_ = var1.readBool();
                     this.bitField0_ |= 8192;
                     break;
                  case 120:
                     this.owahe_ = var1.readBool();
                     this.bitField0_ |= 16384;
                     break;
                  case 130:
                     LauncherSetting var5 = var1.readMessage(LauncherSetting.parser(), var2);
                     if (this.settingsBuilder_ == null) {
                        this.ensureSettingsIsMutable();
                        this.settings_.add(var5);
                     } else {
                        this.settingsBuilder_.addMessage(var5);
                     }
                     break;
                  case 136:
                     this.safeStorage_ = var1.readBool();
                     this.bitField0_ |= 65536;
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
      public String getEnvironment() {
         Object var1 = this.environment_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.environment_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEnvironmentBytes() {
         Object var1 = this.environment_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.environment_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherHandshake.Builder setEnvironment(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.environment_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearEnvironment() {
         this.environment_ = LauncherHandshake.getDefaultInstance().getEnvironment();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setEnvironmentBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherHandshake.checkByteStringIsUtf8(var1);
         this.environment_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getSessionId() {
         Object var1 = this.sessionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.sessionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSessionIdBytes() {
         Object var1 = this.sessionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.sessionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherHandshake.Builder setSessionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sessionId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearSessionId() {
         this.sessionId_ = LauncherHandshake.getDefaultInstance().getSessionId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setSessionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherHandshake.checkByteStringIsUtf8(var1);
         this.sessionId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getUpdaterStream() {
         Object var1 = this.updaterStream_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.updaterStream_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUpdaterStreamBytes() {
         Object var1 = this.updaterStream_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.updaterStream_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherHandshake.Builder setUpdaterStream(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.updaterStream_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearUpdaterStream() {
         this.updaterStream_ = LauncherHandshake.getDefaultInstance().getUpdaterStream();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setUpdaterStreamBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherHandshake.checkByteStringIsUtf8(var1);
         this.updaterStream_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public int getElectronBinariesTypeValue() {
         return this.electronBinariesType_;
      }

      public LauncherHandshake.Builder setElectronBinariesTypeValue(int var1) {
         this.electronBinariesType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public LauncherHandshake.ElectronBinariesType getElectronBinariesType() {
         LauncherHandshake.ElectronBinariesType var1 = LauncherHandshake.ElectronBinariesType.forNumber(this.electronBinariesType_);
         return var1 == null ? LauncherHandshake.ElectronBinariesType.UNRECOGNIZED : var1;
      }

      public LauncherHandshake.Builder setElectronBinariesType(LauncherHandshake.ElectronBinariesType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.electronBinariesType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearElectronBinariesType() {
         this.bitField0_ &= -9;
         this.electronBinariesType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getElevated() {
         return this.elevated_;
      }

      public LauncherHandshake.Builder setElevated(boolean var1) {
         this.elevated_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearElevated() {
         this.bitField0_ &= -17;
         this.elevated_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getSilentStart() {
         return this.silentStart_;
      }

      public LauncherHandshake.Builder setSilentStart(boolean var1) {
         this.silentStart_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearSilentStart() {
         this.bitField0_ &= -33;
         this.silentStart_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getUptimeSinceStart() {
         return this.uptimeSinceStart_;
      }

      public LauncherHandshake.Builder setUptimeSinceStart(int var1) {
         this.uptimeSinceStart_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearUptimeSinceStart() {
         this.bitField0_ &= -65;
         this.uptimeSinceStart_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasStartedAt() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public Timestamp getStartedAt() {
         if (this.startedAtBuilder_ == null) {
            return this.startedAt_ == null ? Timestamp.getDefaultInstance() : this.startedAt_;
         } else {
            return this.startedAtBuilder_.getMessage();
         }
      }

      public LauncherHandshake.Builder setStartedAt(Timestamp var1) {
         if (this.startedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.startedAt_ = var1;
         } else {
            this.startedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setStartedAt(Timestamp.Builder var1) {
         if (this.startedAtBuilder_ == null) {
            this.startedAt_ = var1.build();
         } else {
            this.startedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder mergeStartedAt(Timestamp var1) {
         if (this.startedAtBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.startedAt_ != null && this.startedAt_ != Timestamp.getDefaultInstance()) {
               this.getStartedAtBuilder().mergeFrom(var1);
            } else {
               this.startedAt_ = var1;
            }
         } else {
            this.startedAtBuilder_.mergeFrom(var1);
         }

         if (this.startedAt_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public LauncherHandshake.Builder clearStartedAt() {
         this.bitField0_ &= -129;
         this.startedAt_ = null;
         if (this.startedAtBuilder_ != null) {
            this.startedAtBuilder_.dispose();
            this.startedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getStartedAtBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getStartedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getStartedAtOrBuilder() {
         if (this.startedAtBuilder_ != null) {
            return this.startedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.startedAt_ == null ? Timestamp.getDefaultInstance() : this.startedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getStartedAtFieldBuilder() {
         if (this.startedAtBuilder_ == null) {
            this.startedAtBuilder_ = new SingleFieldBuilderV3<>(this.getStartedAt(), this.getParentForChildren(), this.isClean());
            this.startedAt_ = null;
         }

         return this.startedAtBuilder_;
      }

      @Override
      public int getBuildNumber() {
         return this.buildNumber_;
      }

      public LauncherHandshake.Builder setBuildNumber(int var1) {
         this.buildNumber_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearBuildNumber() {
         this.bitField0_ &= -257;
         this.buildNumber_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getGitCommitHash() {
         Object var1 = this.gitCommitHash_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gitCommitHash_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGitCommitHashBytes() {
         Object var1 = this.gitCommitHash_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gitCommitHash_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherHandshake.Builder setGitCommitHash(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gitCommitHash_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearGitCommitHash() {
         this.gitCommitHash_ = LauncherHandshake.getDefaultInstance().getGitCommitHash();
         this.bitField0_ &= -513;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setGitCommitHashBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherHandshake.checkByteStringIsUtf8(var1);
         this.gitCommitHash_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public String getGitShortCommitHash() {
         Object var1 = this.gitShortCommitHash_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gitShortCommitHash_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGitShortCommitHashBytes() {
         Object var1 = this.gitShortCommitHash_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gitShortCommitHash_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherHandshake.Builder setGitShortCommitHash(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gitShortCommitHash_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearGitShortCommitHash() {
         this.gitShortCommitHash_ = LauncherHandshake.getDefaultInstance().getGitShortCommitHash();
         this.bitField0_ &= -1025;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setGitShortCommitHashBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherHandshake.checkByteStringIsUtf8(var1);
         this.gitShortCommitHash_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasRadioInfo() {
         return (this.bitField0_ & 2048) != 0;
      }

      @Override
      public InboundRadioInfo getRadioInfo() {
         if (this.radioInfoBuilder_ == null) {
            return this.radioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.radioInfo_;
         } else {
            return this.radioInfoBuilder_.getMessage();
         }
      }

      public LauncherHandshake.Builder setRadioInfo(InboundRadioInfo var1) {
         if (this.radioInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.radioInfo_ = var1;
         } else {
            this.radioInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder setRadioInfo(InboundRadioInfo.Builder var1) {
         if (this.radioInfoBuilder_ == null) {
            this.radioInfo_ = var1.build();
         } else {
            this.radioInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder mergeRadioInfo(InboundRadioInfo var1) {
         if (this.radioInfoBuilder_ == null) {
            if ((this.bitField0_ & 2048) != 0 && this.radioInfo_ != null && this.radioInfo_ != InboundRadioInfo.getDefaultInstance()) {
               this.getRadioInfoBuilder().mergeFrom(var1);
            } else {
               this.radioInfo_ = var1;
            }
         } else {
            this.radioInfoBuilder_.mergeFrom(var1);
         }

         if (this.radioInfo_ != null) {
            this.bitField0_ |= 2048;
            this.onChanged();
         }

         return this;
      }

      public LauncherHandshake.Builder clearRadioInfo() {
         this.bitField0_ &= -2049;
         this.radioInfo_ = null;
         if (this.radioInfoBuilder_ != null) {
            this.radioInfoBuilder_.dispose();
            this.radioInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundRadioInfo.Builder getRadioInfoBuilder() {
         this.bitField0_ |= 2048;
         this.onChanged();
         return this.getRadioInfoFieldBuilder().getBuilder();
      }

      @Override
      public InboundRadioInfoOrBuilder getRadioInfoOrBuilder() {
         if (this.radioInfoBuilder_ != null) {
            return this.radioInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.radioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.radioInfo_;
         }
      }

      private SingleFieldBuilderV3<InboundRadioInfo, InboundRadioInfo.Builder, InboundRadioInfoOrBuilder> getRadioInfoFieldBuilder() {
         if (this.radioInfoBuilder_ == null) {
            this.radioInfoBuilder_ = new SingleFieldBuilderV3<>(this.getRadioInfo(), this.getParentForChildren(), this.isClean());
            this.radioInfo_ = null;
         }

         return this.radioInfoBuilder_;
      }

      @Override
      public boolean getOptimizedAds() {
         return this.optimizedAds_;
      }

      public LauncherHandshake.Builder setOptimizedAds(boolean var1) {
         this.optimizedAds_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearOptimizedAds() {
         this.bitField0_ &= -4097;
         this.optimizedAds_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getAnalytics() {
         return this.analytics_;
      }

      public LauncherHandshake.Builder setAnalytics(boolean var1) {
         this.analytics_ = var1;
         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearAnalytics() {
         this.bitField0_ &= -8193;
         this.analytics_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getOwahe() {
         return this.owahe_;
      }

      public LauncherHandshake.Builder setOwahe(boolean var1) {
         this.owahe_ = var1;
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearOwahe() {
         this.bitField0_ &= -16385;
         this.owahe_ = false;
         this.onChanged();
         return this;
      }

      private void ensureSettingsIsMutable() {
         if ((this.bitField0_ & 32768) == 0) {
            this.settings_ = new ArrayList<>(this.settings_);
            this.bitField0_ |= 32768;
         }
      }

      @Override
      public List<LauncherSetting> getSettingsList() {
         return this.settingsBuilder_ == null ? Collections.unmodifiableList(this.settings_) : this.settingsBuilder_.getMessageList();
      }

      @Override
      public int getSettingsCount() {
         return this.settingsBuilder_ == null ? this.settings_.size() : this.settingsBuilder_.getCount();
      }

      @Override
      public LauncherSetting getSettings(int var1) {
         return this.settingsBuilder_ == null ? this.settings_.get(var1) : this.settingsBuilder_.getMessage(var1);
      }

      public LauncherHandshake.Builder setSettings(int var1, LauncherSetting var2) {
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

      public LauncherHandshake.Builder setSettings(int var1, LauncherSetting.Builder var2) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.settingsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LauncherHandshake.Builder addSettings(LauncherSetting var1) {
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

      public LauncherHandshake.Builder addSettings(int var1, LauncherSetting var2) {
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

      public LauncherHandshake.Builder addSettings(LauncherSetting.Builder var1) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.add(var1.build());
            this.onChanged();
         } else {
            this.settingsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LauncherHandshake.Builder addSettings(int var1, LauncherSetting.Builder var2) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.settingsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LauncherHandshake.Builder addAllSettings(Iterable<? extends LauncherSetting> var1) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.settings_);
            this.onChanged();
         } else {
            this.settingsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LauncherHandshake.Builder clearSettings() {
         if (this.settingsBuilder_ == null) {
            this.settings_ = Collections.emptyList();
            this.bitField0_ &= -32769;
            this.onChanged();
         } else {
            this.settingsBuilder_.clear();
         }

         return this;
      }

      public LauncherHandshake.Builder removeSettings(int var1) {
         if (this.settingsBuilder_ == null) {
            this.ensureSettingsIsMutable();
            this.settings_.remove(var1);
            this.onChanged();
         } else {
            this.settingsBuilder_.remove(var1);
         }

         return this;
      }

      public LauncherSetting.Builder getSettingsBuilder(int var1) {
         return this.getSettingsFieldBuilder().getBuilder(var1);
      }

      @Override
      public LauncherSettingOrBuilder getSettingsOrBuilder(int var1) {
         return this.settingsBuilder_ == null ? this.settings_.get(var1) : this.settingsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends LauncherSettingOrBuilder> getSettingsOrBuilderList() {
         return this.settingsBuilder_ != null ? this.settingsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.settings_);
      }

      public LauncherSetting.Builder addSettingsBuilder() {
         return this.getSettingsFieldBuilder().addBuilder(LauncherSetting.getDefaultInstance());
      }

      public LauncherSetting.Builder addSettingsBuilder(int var1) {
         return this.getSettingsFieldBuilder().addBuilder(var1, LauncherSetting.getDefaultInstance());
      }

      public List<LauncherSetting.Builder> getSettingsBuilderList() {
         return this.getSettingsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<LauncherSetting, LauncherSetting.Builder, LauncherSettingOrBuilder> getSettingsFieldBuilder() {
         if (this.settingsBuilder_ == null) {
            this.settingsBuilder_ = new RepeatedFieldBuilderV3<>(this.settings_, (this.bitField0_ & 32768) != 0, this.getParentForChildren(), this.isClean());
            this.settings_ = null;
         }

         return this.settingsBuilder_;
      }

      @Override
      public boolean getSafeStorage() {
         return this.safeStorage_;
      }

      public LauncherHandshake.Builder setSafeStorage(boolean var1) {
         this.safeStorage_ = var1;
         this.bitField0_ |= 65536;
         this.onChanged();
         return this;
      }

      public LauncherHandshake.Builder clearSafeStorage() {
         this.bitField0_ &= -65537;
         this.safeStorage_ = false;
         this.onChanged();
         return this;
      }

      public final LauncherHandshake.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LauncherHandshake.Builder)super.setUnknownFields(var1);
      }

      public final LauncherHandshake.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LauncherHandshake.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ElectronBinariesType implements ProtocolMessageEnum {
      ELECTRON_BINARIES_TYPE_UNSPECIFIED(0),
      ELECTRON_BINARIES_TYPE_OVERWOLF_OW_ELECTRON(1),
      ELECTRON_BINARIES_TYPE_ELECTRON(2),
      UNRECOGNIZED(-1);

      public static final int ELECTRON_BINARIES_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int ELECTRON_BINARIES_TYPE_OVERWOLF_OW_ELECTRON_VALUE = 1;
      public static final int ELECTRON_BINARIES_TYPE_ELECTRON_VALUE = 2;
      private static final Internal.EnumLiteMap<LauncherHandshake.ElectronBinariesType> internalValueMap = new Internal.EnumLiteMap<LauncherHandshake.ElectronBinariesType>() {
         public LauncherHandshake.ElectronBinariesType findValueByNumber(int var1) {
            return LauncherHandshake.ElectronBinariesType.forNumber(var1);
         }
      };
      private static final LauncherHandshake.ElectronBinariesType[] VALUES = values();
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
      public static LauncherHandshake.ElectronBinariesType valueOf(int var0) {
         return forNumber(var0);
      }

      public static LauncherHandshake.ElectronBinariesType forNumber(int var0) {
         switch (var0) {
            case 0:
               return ELECTRON_BINARIES_TYPE_UNSPECIFIED;
            case 1:
               return ELECTRON_BINARIES_TYPE_OVERWOLF_OW_ELECTRON;
            case 2:
               return ELECTRON_BINARIES_TYPE_ELECTRON;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<LauncherHandshake.ElectronBinariesType> internalGetValueMap() {
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
         return LauncherHandshake.getDescriptor().getEnumTypes().get(0);
      }

      public static LauncherHandshake.ElectronBinariesType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      ElectronBinariesType(int var3) {
         this.value = var3;
      }
   }
}
