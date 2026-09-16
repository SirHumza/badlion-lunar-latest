package com.lunarclient.websocket.screenshot.v1;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ScreenshotMessage extends GeneratedMessageV3 implements ScreenshotMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int AUTHOR_FIELD_NUMBER = 1;
   private UuidAndUsername author_;
   public static final int STATES_FIELD_NUMBER = 2;
   private List<Integer> states_;
   private static final Internal.ListAdapter.Converter<Integer, PlayerState> states_converter_ = new Internal.ListAdapter.Converter<Integer, PlayerState>() {
      public PlayerState convert(Integer var1) {
         PlayerState var2 = PlayerState.forNumber(var1);
         return var2 == null ? PlayerState.UNRECOGNIZED : var2;
      }
   };
   private int statesMemoizedSerializedSize;
   public static final int PLAYERS_FIELD_NUMBER = 3;
   private List<ScreenshotPlayer> players_;
   public static final int DIMENSION_FIELD_NUMBER = 4;
   private volatile Object dimension_ = "";
   public static final int BIOME_FIELD_NUMBER = 5;
   private volatile Object biome_ = "";
   public static final int YAW_FIELD_NUMBER = 6;
   private float yaw_ = 0.0F;
   public static final int PITCH_FIELD_NUMBER = 7;
   private float pitch_ = 0.0F;
   public static final int POS_FIELD_NUMBER = 8;
   private Vector3f pos_;
   public static final int SIZE_FIELD_NUMBER = 9;
   private Dimensions size_;
   public static final int PERSPECTIVE_FIELD_NUMBER = 10;
   private int perspective_ = 0;
   public static final int HAS_HUD_FIELD_NUMBER = 11;
   private boolean hasHud_ = false;
   public static final int DAY_TIME_FIELD_NUMBER = 12;
   private long dayTime_ = 0L;
   public static final int WEATHER_FIELD_NUMBER = 13;
   private int weather_ = 0;
   public static final int HEALTH_FIELD_NUMBER = 14;
   private float health_ = 0.0F;
   public static final int MAX_HEALTH_FIELD_NUMBER = 15;
   private float maxHealth_ = 0.0F;
   public static final int FOOD_LEVEL_FIELD_NUMBER = 16;
   private float foodLevel_ = 0.0F;
   public static final int SATURATION_LEVEL_FIELD_NUMBER = 17;
   private float saturationLevel_ = 0.0F;
   public static final int LOCAL_ID_FIELD_NUMBER = 18;
   private Uuid localId_;
   private byte memoizedIsInitialized = -1;
   private static final ScreenshotMessage DEFAULT_INSTANCE = new ScreenshotMessage();
   private static final Parser<ScreenshotMessage> PARSER = new AbstractParser<ScreenshotMessage>() {
      public ScreenshotMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ScreenshotMessage.Builder var3 = ScreenshotMessage.newBuilder();

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

   private ScreenshotMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ScreenshotMessage() {
      this.states_ = Collections.emptyList();
      this.players_ = Collections.emptyList();
      this.dimension_ = "";
      this.biome_ = "";
      this.perspective_ = 0;
      this.weather_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ScreenshotMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ScreenshotMessage.class, ScreenshotMessage.Builder.class);
   }

   @Override
   public boolean hasAuthor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getAuthor() {
      return this.author_ == null ? UuidAndUsername.getDefaultInstance() : this.author_;
   }

   @Override
   public UuidAndUsernameOrBuilder getAuthorOrBuilder() {
      return this.author_ == null ? UuidAndUsername.getDefaultInstance() : this.author_;
   }

   @Override
   public List<PlayerState> getStatesList() {
      return new Internal.ListAdapter<>(this.states_, states_converter_);
   }

   @Override
   public int getStatesCount() {
      return this.states_.size();
   }

   @Override
   public PlayerState getStates(int var1) {
      return states_converter_.convert(this.states_.get(var1));
   }

   @Override
   public List<Integer> getStatesValueList() {
      return this.states_;
   }

   @Override
   public int getStatesValue(int var1) {
      return this.states_.get(var1);
   }

   @Override
   public List<ScreenshotPlayer> getPlayersList() {
      return this.players_;
   }

   @Override
   public List<? extends ScreenshotPlayerOrBuilder> getPlayersOrBuilderList() {
      return this.players_;
   }

   @Override
   public int getPlayersCount() {
      return this.players_.size();
   }

   @Override
   public ScreenshotPlayer getPlayers(int var1) {
      return this.players_.get(var1);
   }

   @Override
   public ScreenshotPlayerOrBuilder getPlayersOrBuilder(int var1) {
      return this.players_.get(var1);
   }

   @Override
   public String getDimension() {
      Object var1 = this.dimension_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.dimension_ = var3;
      return var3;
   }

   @Override
   public ByteString getDimensionBytes() {
      Object var1 = this.dimension_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.dimension_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getBiome() {
      Object var1 = this.biome_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.biome_ = var3;
      return var3;
   }

   @Override
   public ByteString getBiomeBytes() {
      Object var1 = this.biome_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.biome_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public float getYaw() {
      return this.yaw_;
   }

   @Override
   public float getPitch() {
      return this.pitch_;
   }

   @Override
   public boolean hasPos() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Vector3f getPos() {
      return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
   }

   @Override
   public Vector3fOrBuilder getPosOrBuilder() {
      return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
   }

   @Override
   public boolean hasSize() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Dimensions getSize() {
      return this.size_ == null ? Dimensions.getDefaultInstance() : this.size_;
   }

   @Override
   public DimensionsOrBuilder getSizeOrBuilder() {
      return this.size_ == null ? Dimensions.getDefaultInstance() : this.size_;
   }

   @Override
   public int getPerspectiveValue() {
      return this.perspective_;
   }

   @Override
   public Perspective getPerspective() {
      Perspective var1 = Perspective.forNumber(this.perspective_);
      return var1 == null ? Perspective.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getHasHud() {
      return this.hasHud_;
   }

   @Override
   public long getDayTime() {
      return this.dayTime_;
   }

   @Override
   public int getWeatherValue() {
      return this.weather_;
   }

   @Override
   public Weather getWeather() {
      Weather var1 = Weather.forNumber(this.weather_);
      return var1 == null ? Weather.UNRECOGNIZED : var1;
   }

   @Override
   public float getHealth() {
      return this.health_;
   }

   @Override
   public float getMaxHealth() {
      return this.maxHealth_;
   }

   @Override
   public float getFoodLevel() {
      return this.foodLevel_;
   }

   @Override
   public float getSaturationLevel() {
      return this.saturationLevel_;
   }

   @Override
   public boolean hasLocalId() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Uuid getLocalId() {
      return this.localId_ == null ? Uuid.getDefaultInstance() : this.localId_;
   }

   @Override
   public UuidOrBuilder getLocalIdOrBuilder() {
      return this.localId_ == null ? Uuid.getDefaultInstance() : this.localId_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getAuthor());
      }

      if (this.getStatesList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.statesMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.states_.size(); var2++) {
         var1.writeEnumNoTag(this.states_.get(var2));
      }

      for (int var3 = 0; var3 < this.players_.size(); var3++) {
         var1.writeMessage(3, this.players_.get(var3));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.dimension_)) {
         GeneratedMessageV3.writeString(var1, 4, this.dimension_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.biome_)) {
         GeneratedMessageV3.writeString(var1, 5, this.biome_);
      }

      if (Float.floatToRawIntBits(this.yaw_) != 0) {
         var1.writeFloat(6, this.yaw_);
      }

      if (Float.floatToRawIntBits(this.pitch_) != 0) {
         var1.writeFloat(7, this.pitch_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(8, this.getPos());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(9, this.getSize());
      }

      if (this.perspective_ != Perspective.PERSPECTIVE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(10, this.perspective_);
      }

      if (this.hasHud_) {
         var1.writeBool(11, this.hasHud_);
      }

      if (this.dayTime_ != 0L) {
         var1.writeInt64(12, this.dayTime_);
      }

      if (this.weather_ != Weather.WEATHER_UNSPECIFIED.getNumber()) {
         var1.writeEnum(13, this.weather_);
      }

      if (Float.floatToRawIntBits(this.health_) != 0) {
         var1.writeFloat(14, this.health_);
      }

      if (Float.floatToRawIntBits(this.maxHealth_) != 0) {
         var1.writeFloat(15, this.maxHealth_);
      }

      if (Float.floatToRawIntBits(this.foodLevel_) != 0) {
         var1.writeFloat(16, this.foodLevel_);
      }

      if (Float.floatToRawIntBits(this.saturationLevel_) != 0) {
         var1.writeFloat(17, this.saturationLevel_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(18, this.getLocalId());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getAuthor());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.states_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.states_.get(var3));
      }

      var1 += var2;
      if (!this.getStatesList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.statesMemoizedSerializedSize = var2;

      for (int var8 = 0; var8 < this.players_.size(); var8++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.players_.get(var8));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.dimension_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.dimension_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.biome_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.biome_);
      }

      if (Float.floatToRawIntBits(this.yaw_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(6, this.yaw_);
      }

      if (Float.floatToRawIntBits(this.pitch_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(7, this.pitch_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getPos());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(9, this.getSize());
      }

      if (this.perspective_ != Perspective.PERSPECTIVE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(10, this.perspective_);
      }

      if (this.hasHud_) {
         var1 += CodedOutputStream.computeBoolSize(11, this.hasHud_);
      }

      if (this.dayTime_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(12, this.dayTime_);
      }

      if (this.weather_ != Weather.WEATHER_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(13, this.weather_);
      }

      if (Float.floatToRawIntBits(this.health_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(14, this.health_);
      }

      if (Float.floatToRawIntBits(this.maxHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(15, this.maxHealth_);
      }

      if (Float.floatToRawIntBits(this.foodLevel_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(16, this.foodLevel_);
      }

      if (Float.floatToRawIntBits(this.saturationLevel_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(17, this.saturationLevel_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(18, this.getLocalId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ScreenshotMessage)) {
         return super.equals(var1);
      } else {
         ScreenshotMessage var2 = (ScreenshotMessage)var1;
         if (this.hasAuthor() != var2.hasAuthor()) {
            return false;
         } else if (this.hasAuthor() && !this.getAuthor().equals(var2.getAuthor())) {
            return false;
         } else if (!this.states_.equals(var2.states_)) {
            return false;
         } else if (!this.getPlayersList().equals(var2.getPlayersList())) {
            return false;
         } else if (!this.getDimension().equals(var2.getDimension())) {
            return false;
         } else if (!this.getBiome().equals(var2.getBiome())) {
            return false;
         } else if (Float.floatToIntBits(this.getYaw()) != Float.floatToIntBits(var2.getYaw())) {
            return false;
         } else if (Float.floatToIntBits(this.getPitch()) != Float.floatToIntBits(var2.getPitch())) {
            return false;
         } else if (this.hasPos() != var2.hasPos()) {
            return false;
         } else if (this.hasPos() && !this.getPos().equals(var2.getPos())) {
            return false;
         } else if (this.hasSize() != var2.hasSize()) {
            return false;
         } else if (this.hasSize() && !this.getSize().equals(var2.getSize())) {
            return false;
         } else if (this.perspective_ != var2.perspective_) {
            return false;
         } else if (this.getHasHud() != var2.getHasHud()) {
            return false;
         } else if (this.getDayTime() != var2.getDayTime()) {
            return false;
         } else if (this.weather_ != var2.weather_) {
            return false;
         } else if (Float.floatToIntBits(this.getHealth()) != Float.floatToIntBits(var2.getHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getMaxHealth()) != Float.floatToIntBits(var2.getMaxHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getFoodLevel()) != Float.floatToIntBits(var2.getFoodLevel())) {
            return false;
         } else if (Float.floatToIntBits(this.getSaturationLevel()) != Float.floatToIntBits(var2.getSaturationLevel())) {
            return false;
         } else if (this.hasLocalId() != var2.hasLocalId()) {
            return false;
         } else {
            return this.hasLocalId() && !this.getLocalId().equals(var2.getLocalId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasAuthor()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getAuthor().hashCode();
      }

      if (this.getStatesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.states_.hashCode();
      }

      if (this.getPlayersCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPlayersList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getDimension().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getBiome().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Float.floatToIntBits(this.getYaw());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Float.floatToIntBits(this.getPitch());
      if (this.hasPos()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getPos().hashCode();
      }

      if (this.hasSize()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getSize().hashCode();
      }

      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.perspective_;
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHasHud());
      var1 = 37 * var1 + 12;
      var1 = 53 * var1 + Internal.hashLong(this.getDayTime());
      var1 = 37 * var1 + 13;
      var1 = 53 * var1 + this.weather_;
      var1 = 37 * var1 + 14;
      var1 = 53 * var1 + Float.floatToIntBits(this.getHealth());
      var1 = 37 * var1 + 15;
      var1 = 53 * var1 + Float.floatToIntBits(this.getMaxHealth());
      var1 = 37 * var1 + 16;
      var1 = 53 * var1 + Float.floatToIntBits(this.getFoodLevel());
      var1 = 37 * var1 + 17;
      var1 = 53 * var1 + Float.floatToIntBits(this.getSaturationLevel());
      if (this.hasLocalId()) {
         var1 = 37 * var1 + 18;
         var1 = 53 * var1 + this.getLocalId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ScreenshotMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ScreenshotMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ScreenshotMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ScreenshotMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ScreenshotMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ScreenshotMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ScreenshotMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ScreenshotMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ScreenshotMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ScreenshotMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ScreenshotMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ScreenshotMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ScreenshotMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ScreenshotMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ScreenshotMessage.Builder newBuilder(ScreenshotMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ScreenshotMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ScreenshotMessage.Builder() : new ScreenshotMessage.Builder().mergeFrom(this);
   }

   protected ScreenshotMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ScreenshotMessage.Builder(var1);
   }

   public static ScreenshotMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ScreenshotMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ScreenshotMessage> getParserForType() {
      return PARSER;
   }

   public ScreenshotMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ScreenshotMessage.Builder> implements ScreenshotMessageOrBuilder {
      private int bitField0_;
      private UuidAndUsername author_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> authorBuilder_;
      private List<Integer> states_ = Collections.emptyList();
      private List<ScreenshotPlayer> players_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ScreenshotPlayer, ScreenshotPlayer.Builder, ScreenshotPlayerOrBuilder> playersBuilder_;
      private Object dimension_ = "";
      private Object biome_ = "";
      private float yaw_;
      private float pitch_;
      private Vector3f pos_;
      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> posBuilder_;
      private Dimensions size_;
      private SingleFieldBuilderV3<Dimensions, Dimensions.Builder, DimensionsOrBuilder> sizeBuilder_;
      private int perspective_ = 0;
      private boolean hasHud_;
      private long dayTime_;
      private int weather_ = 0;
      private float health_;
      private float maxHealth_;
      private float foodLevel_;
      private float saturationLevel_;
      private Uuid localId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> localIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ScreenshotMessage.class, ScreenshotMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ScreenshotMessage.alwaysUseFieldBuilders) {
            this.getAuthorFieldBuilder();
            this.getPlayersFieldBuilder();
            this.getPosFieldBuilder();
            this.getSizeFieldBuilder();
            this.getLocalIdFieldBuilder();
         }
      }

      public ScreenshotMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.author_ = null;
         if (this.authorBuilder_ != null) {
            this.authorBuilder_.dispose();
            this.authorBuilder_ = null;
         }

         this.states_ = Collections.emptyList();
         this.bitField0_ &= -3;
         if (this.playersBuilder_ == null) {
            this.players_ = Collections.emptyList();
         } else {
            this.players_ = null;
            this.playersBuilder_.clear();
         }

         this.bitField0_ &= -5;
         this.dimension_ = "";
         this.biome_ = "";
         this.yaw_ = 0.0F;
         this.pitch_ = 0.0F;
         this.pos_ = null;
         if (this.posBuilder_ != null) {
            this.posBuilder_.dispose();
            this.posBuilder_ = null;
         }

         this.size_ = null;
         if (this.sizeBuilder_ != null) {
            this.sizeBuilder_.dispose();
            this.sizeBuilder_ = null;
         }

         this.perspective_ = 0;
         this.hasHud_ = false;
         this.dayTime_ = 0L;
         this.weather_ = 0;
         this.health_ = 0.0F;
         this.maxHealth_ = 0.0F;
         this.foodLevel_ = 0.0F;
         this.saturationLevel_ = 0.0F;
         this.localId_ = null;
         if (this.localIdBuilder_ != null) {
            this.localIdBuilder_.dispose();
            this.localIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_descriptor;
      }

      public ScreenshotMessage getDefaultInstanceForType() {
         return ScreenshotMessage.getDefaultInstance();
      }

      public ScreenshotMessage build() {
         ScreenshotMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ScreenshotMessage buildPartial() {
         ScreenshotMessage var1 = new ScreenshotMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ScreenshotMessage var1) {
         if ((this.bitField0_ & 2) != 0) {
            this.states_ = Collections.unmodifiableList(this.states_);
            this.bitField0_ &= -3;
         }

         var1.states_ = this.states_;
         if (this.playersBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.players_ = Collections.unmodifiableList(this.players_);
               this.bitField0_ &= -5;
            }

            var1.players_ = this.players_;
         } else {
            var1.players_ = this.playersBuilder_.build();
         }
      }

      private void buildPartial0(ScreenshotMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.author_ = this.authorBuilder_ == null ? this.author_ : this.authorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 8) != 0) {
            var1.dimension_ = this.dimension_;
         }

         if ((var2 & 16) != 0) {
            var1.biome_ = this.biome_;
         }

         if ((var2 & 32) != 0) {
            var1.yaw_ = this.yaw_;
         }

         if ((var2 & 64) != 0) {
            var1.pitch_ = this.pitch_;
         }

         if ((var2 & 128) != 0) {
            var1.pos_ = this.posBuilder_ == null ? this.pos_ : this.posBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 256) != 0) {
            var1.size_ = this.sizeBuilder_ == null ? this.size_ : this.sizeBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 512) != 0) {
            var1.perspective_ = this.perspective_;
         }

         if ((var2 & 1024) != 0) {
            var1.hasHud_ = this.hasHud_;
         }

         if ((var2 & 2048) != 0) {
            var1.dayTime_ = this.dayTime_;
         }

         if ((var2 & 4096) != 0) {
            var1.weather_ = this.weather_;
         }

         if ((var2 & 8192) != 0) {
            var1.health_ = this.health_;
         }

         if ((var2 & 16384) != 0) {
            var1.maxHealth_ = this.maxHealth_;
         }

         if ((var2 & 32768) != 0) {
            var1.foodLevel_ = this.foodLevel_;
         }

         if ((var2 & 65536) != 0) {
            var1.saturationLevel_ = this.saturationLevel_;
         }

         if ((var2 & 131072) != 0) {
            var1.localId_ = this.localIdBuilder_ == null ? this.localId_ : this.localIdBuilder_.build();
            var3 |= 8;
         }

         ScreenshotMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ScreenshotMessage.Builder clone() {
         return (ScreenshotMessage.Builder)super.clone();
      }

      public ScreenshotMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ScreenshotMessage.Builder)super.setField(var1, var2);
      }

      public ScreenshotMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ScreenshotMessage.Builder)super.clearField(var1);
      }

      public ScreenshotMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ScreenshotMessage.Builder)super.clearOneof(var1);
      }

      public ScreenshotMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ScreenshotMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ScreenshotMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ScreenshotMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ScreenshotMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ScreenshotMessage) {
            return this.mergeFrom((ScreenshotMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ScreenshotMessage.Builder mergeFrom(ScreenshotMessage var1) {
         if (var1 == ScreenshotMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasAuthor()) {
            this.mergeAuthor(var1.getAuthor());
         }

         if (!var1.states_.isEmpty()) {
            if (this.states_.isEmpty()) {
               this.states_ = var1.states_;
               this.bitField0_ &= -3;
            } else {
               this.ensureStatesIsMutable();
               this.states_.addAll(var1.states_);
            }

            this.onChanged();
         }

         if (this.playersBuilder_ == null) {
            if (!var1.players_.isEmpty()) {
               if (this.players_.isEmpty()) {
                  this.players_ = var1.players_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensurePlayersIsMutable();
                  this.players_.addAll(var1.players_);
               }

               this.onChanged();
            }
         } else if (!var1.players_.isEmpty()) {
            if (this.playersBuilder_.isEmpty()) {
               this.playersBuilder_.dispose();
               this.playersBuilder_ = null;
               this.players_ = var1.players_;
               this.bitField0_ &= -5;
               this.playersBuilder_ = ScreenshotMessage.alwaysUseFieldBuilders ? this.getPlayersFieldBuilder() : null;
            } else {
               this.playersBuilder_.addAllMessages(var1.players_);
            }
         }

         if (!var1.getDimension().isEmpty()) {
            this.dimension_ = var1.dimension_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getBiome().isEmpty()) {
            this.biome_ = var1.biome_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (var1.getYaw() != 0.0F) {
            this.setYaw(var1.getYaw());
         }

         if (var1.getPitch() != 0.0F) {
            this.setPitch(var1.getPitch());
         }

         if (var1.hasPos()) {
            this.mergePos(var1.getPos());
         }

         if (var1.hasSize()) {
            this.mergeSize(var1.getSize());
         }

         if (var1.perspective_ != 0) {
            this.setPerspectiveValue(var1.getPerspectiveValue());
         }

         if (var1.getHasHud()) {
            this.setHasHud(var1.getHasHud());
         }

         if (var1.getDayTime() != 0L) {
            this.setDayTime(var1.getDayTime());
         }

         if (var1.weather_ != 0) {
            this.setWeatherValue(var1.getWeatherValue());
         }

         if (var1.getHealth() != 0.0F) {
            this.setHealth(var1.getHealth());
         }

         if (var1.getMaxHealth() != 0.0F) {
            this.setMaxHealth(var1.getMaxHealth());
         }

         if (var1.getFoodLevel() != 0.0F) {
            this.setFoodLevel(var1.getFoodLevel());
         }

         if (var1.getSaturationLevel() != 0.0F) {
            this.setSaturationLevel(var1.getSaturationLevel());
         }

         if (var1.hasLocalId()) {
            this.mergeLocalId(var1.getLocalId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ScreenshotMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getAuthorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     int var14 = var1.readEnum();
                     this.ensureStatesIsMutable();
                     this.states_.add(var14);
                     break;
                  case 18:
                     int var13 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var13);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureStatesIsMutable();
                        this.states_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  case 26:
                     ScreenshotPlayer var5 = var1.readMessage(ScreenshotPlayer.parser(), var2);
                     if (this.playersBuilder_ == null) {
                        this.ensurePlayersIsMutable();
                        this.players_.add(var5);
                     } else {
                        this.playersBuilder_.addMessage(var5);
                     }
                     break;
                  case 34:
                     this.dimension_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.biome_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 53:
                     this.yaw_ = var1.readFloat();
                     this.bitField0_ |= 32;
                     break;
                  case 61:
                     this.pitch_ = var1.readFloat();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getPosFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     var1.readMessage(this.getSizeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.perspective_ = var1.readEnum();
                     this.bitField0_ |= 512;
                     break;
                  case 88:
                     this.hasHud_ = var1.readBool();
                     this.bitField0_ |= 1024;
                     break;
                  case 96:
                     this.dayTime_ = var1.readInt64();
                     this.bitField0_ |= 2048;
                     break;
                  case 104:
                     this.weather_ = var1.readEnum();
                     this.bitField0_ |= 4096;
                     break;
                  case 117:
                     this.health_ = var1.readFloat();
                     this.bitField0_ |= 8192;
                     break;
                  case 125:
                     this.maxHealth_ = var1.readFloat();
                     this.bitField0_ |= 16384;
                     break;
                  case 133:
                     this.foodLevel_ = var1.readFloat();
                     this.bitField0_ |= 32768;
                     break;
                  case 141:
                     this.saturationLevel_ = var1.readFloat();
                     this.bitField0_ |= 65536;
                     break;
                  case 146:
                     var1.readMessage(this.getLocalIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 131072;
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

      @Override
      public boolean hasAuthor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getAuthor() {
         if (this.authorBuilder_ == null) {
            return this.author_ == null ? UuidAndUsername.getDefaultInstance() : this.author_;
         } else {
            return this.authorBuilder_.getMessage();
         }
      }

      public ScreenshotMessage.Builder setAuthor(UuidAndUsername var1) {
         if (this.authorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.author_ = var1;
         } else {
            this.authorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder setAuthor(UuidAndUsername.Builder var1) {
         if (this.authorBuilder_ == null) {
            this.author_ = var1.build();
         } else {
            this.authorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder mergeAuthor(UuidAndUsername var1) {
         if (this.authorBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.author_ != null && this.author_ != UuidAndUsername.getDefaultInstance()) {
               this.getAuthorBuilder().mergeFrom(var1);
            } else {
               this.author_ = var1;
            }
         } else {
            this.authorBuilder_.mergeFrom(var1);
         }

         if (this.author_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ScreenshotMessage.Builder clearAuthor() {
         this.bitField0_ &= -2;
         this.author_ = null;
         if (this.authorBuilder_ != null) {
            this.authorBuilder_.dispose();
            this.authorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getAuthorBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getAuthorFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getAuthorOrBuilder() {
         if (this.authorBuilder_ != null) {
            return this.authorBuilder_.getMessageOrBuilder();
         } else {
            return this.author_ == null ? UuidAndUsername.getDefaultInstance() : this.author_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getAuthorFieldBuilder() {
         if (this.authorBuilder_ == null) {
            this.authorBuilder_ = new SingleFieldBuilderV3<>(this.getAuthor(), this.getParentForChildren(), this.isClean());
            this.author_ = null;
         }

         return this.authorBuilder_;
      }

      private void ensureStatesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.states_ = new ArrayList<>(this.states_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PlayerState> getStatesList() {
         return new Internal.ListAdapter<>(this.states_, ScreenshotMessage.states_converter_);
      }

      @Override
      public int getStatesCount() {
         return this.states_.size();
      }

      @Override
      public PlayerState getStates(int var1) {
         return ScreenshotMessage.states_converter_.convert(this.states_.get(var1));
      }

      public ScreenshotMessage.Builder setStates(int var1, PlayerState var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStatesIsMutable();
         this.states_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder addStates(PlayerState var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStatesIsMutable();
         this.states_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder addAllStates(Iterable<? extends PlayerState> var1) {
         this.ensureStatesIsMutable();

         for (PlayerState var3 : var1) {
            this.states_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearStates() {
         this.states_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getStatesValueList() {
         return Collections.unmodifiableList(this.states_);
      }

      @Override
      public int getStatesValue(int var1) {
         return this.states_.get(var1);
      }

      public ScreenshotMessage.Builder setStatesValue(int var1, int var2) {
         this.ensureStatesIsMutable();
         this.states_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder addStatesValue(int var1) {
         this.ensureStatesIsMutable();
         this.states_.add(var1);
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder addAllStatesValue(Iterable<Integer> var1) {
         this.ensureStatesIsMutable();

         for (int var3 : var1) {
            this.states_.add(var3);
         }

         this.onChanged();
         return this;
      }

      private void ensurePlayersIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.players_ = new ArrayList<>(this.players_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<ScreenshotPlayer> getPlayersList() {
         return this.playersBuilder_ == null ? Collections.unmodifiableList(this.players_) : this.playersBuilder_.getMessageList();
      }

      @Override
      public int getPlayersCount() {
         return this.playersBuilder_ == null ? this.players_.size() : this.playersBuilder_.getCount();
      }

      @Override
      public ScreenshotPlayer getPlayers(int var1) {
         return this.playersBuilder_ == null ? this.players_.get(var1) : this.playersBuilder_.getMessage(var1);
      }

      public ScreenshotMessage.Builder setPlayers(int var1, ScreenshotPlayer var2) {
         if (this.playersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayersIsMutable();
            this.players_.set(var1, var2);
            this.onChanged();
         } else {
            this.playersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ScreenshotMessage.Builder setPlayers(int var1, ScreenshotPlayer.Builder var2) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.playersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ScreenshotMessage.Builder addPlayers(ScreenshotPlayer var1) {
         if (this.playersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayersIsMutable();
            this.players_.add(var1);
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1);
         }

         return this;
      }

      public ScreenshotMessage.Builder addPlayers(int var1, ScreenshotPlayer var2) {
         if (this.playersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayersIsMutable();
            this.players_.add(var1, var2);
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ScreenshotMessage.Builder addPlayers(ScreenshotPlayer.Builder var1) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.add(var1.build());
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ScreenshotMessage.Builder addPlayers(int var1, ScreenshotPlayer.Builder var2) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ScreenshotMessage.Builder addAllPlayers(Iterable<? extends ScreenshotPlayer> var1) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.players_);
            this.onChanged();
         } else {
            this.playersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ScreenshotMessage.Builder clearPlayers() {
         if (this.playersBuilder_ == null) {
            this.players_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.playersBuilder_.clear();
         }

         return this;
      }

      public ScreenshotMessage.Builder removePlayers(int var1) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.remove(var1);
            this.onChanged();
         } else {
            this.playersBuilder_.remove(var1);
         }

         return this;
      }

      public ScreenshotPlayer.Builder getPlayersBuilder(int var1) {
         return this.getPlayersFieldBuilder().getBuilder(var1);
      }

      @Override
      public ScreenshotPlayerOrBuilder getPlayersOrBuilder(int var1) {
         return this.playersBuilder_ == null ? this.players_.get(var1) : this.playersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ScreenshotPlayerOrBuilder> getPlayersOrBuilderList() {
         return this.playersBuilder_ != null ? this.playersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.players_);
      }

      public ScreenshotPlayer.Builder addPlayersBuilder() {
         return this.getPlayersFieldBuilder().addBuilder(ScreenshotPlayer.getDefaultInstance());
      }

      public ScreenshotPlayer.Builder addPlayersBuilder(int var1) {
         return this.getPlayersFieldBuilder().addBuilder(var1, ScreenshotPlayer.getDefaultInstance());
      }

      public List<ScreenshotPlayer.Builder> getPlayersBuilderList() {
         return this.getPlayersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ScreenshotPlayer, ScreenshotPlayer.Builder, ScreenshotPlayerOrBuilder> getPlayersFieldBuilder() {
         if (this.playersBuilder_ == null) {
            this.playersBuilder_ = new RepeatedFieldBuilderV3<>(this.players_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.players_ = null;
         }

         return this.playersBuilder_;
      }

      @Override
      public String getDimension() {
         Object var1 = this.dimension_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.dimension_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDimensionBytes() {
         Object var1 = this.dimension_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.dimension_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ScreenshotMessage.Builder setDimension(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.dimension_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearDimension() {
         this.dimension_ = ScreenshotMessage.getDefaultInstance().getDimension();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder setDimensionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ScreenshotMessage.checkByteStringIsUtf8(var1);
         this.dimension_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getBiome() {
         Object var1 = this.biome_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.biome_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getBiomeBytes() {
         Object var1 = this.biome_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.biome_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ScreenshotMessage.Builder setBiome(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.biome_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearBiome() {
         this.biome_ = ScreenshotMessage.getDefaultInstance().getBiome();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder setBiomeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ScreenshotMessage.checkByteStringIsUtf8(var1);
         this.biome_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public float getYaw() {
         return this.yaw_;
      }

      public ScreenshotMessage.Builder setYaw(float var1) {
         this.yaw_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearYaw() {
         this.bitField0_ &= -33;
         this.yaw_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getPitch() {
         return this.pitch_;
      }

      public ScreenshotMessage.Builder setPitch(float var1) {
         this.pitch_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearPitch() {
         this.bitField0_ &= -65;
         this.pitch_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPos() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public Vector3f getPos() {
         if (this.posBuilder_ == null) {
            return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
         } else {
            return this.posBuilder_.getMessage();
         }
      }

      public ScreenshotMessage.Builder setPos(Vector3f var1) {
         if (this.posBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.pos_ = var1;
         } else {
            this.posBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder setPos(Vector3f.Builder var1) {
         if (this.posBuilder_ == null) {
            this.pos_ = var1.build();
         } else {
            this.posBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder mergePos(Vector3f var1) {
         if (this.posBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.pos_ != null && this.pos_ != Vector3f.getDefaultInstance()) {
               this.getPosBuilder().mergeFrom(var1);
            } else {
               this.pos_ = var1;
            }
         } else {
            this.posBuilder_.mergeFrom(var1);
         }

         if (this.pos_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public ScreenshotMessage.Builder clearPos() {
         this.bitField0_ &= -129;
         this.pos_ = null;
         if (this.posBuilder_ != null) {
            this.posBuilder_.dispose();
            this.posBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector3f.Builder getPosBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getPosFieldBuilder().getBuilder();
      }

      @Override
      public Vector3fOrBuilder getPosOrBuilder() {
         if (this.posBuilder_ != null) {
            return this.posBuilder_.getMessageOrBuilder();
         } else {
            return this.pos_ == null ? Vector3f.getDefaultInstance() : this.pos_;
         }
      }

      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> getPosFieldBuilder() {
         if (this.posBuilder_ == null) {
            this.posBuilder_ = new SingleFieldBuilderV3<>(this.getPos(), this.getParentForChildren(), this.isClean());
            this.pos_ = null;
         }

         return this.posBuilder_;
      }

      @Override
      public boolean hasSize() {
         return (this.bitField0_ & 256) != 0;
      }

      @Override
      public Dimensions getSize() {
         if (this.sizeBuilder_ == null) {
            return this.size_ == null ? Dimensions.getDefaultInstance() : this.size_;
         } else {
            return this.sizeBuilder_.getMessage();
         }
      }

      public ScreenshotMessage.Builder setSize(Dimensions var1) {
         if (this.sizeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.size_ = var1;
         } else {
            this.sizeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder setSize(Dimensions.Builder var1) {
         if (this.sizeBuilder_ == null) {
            this.size_ = var1.build();
         } else {
            this.sizeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder mergeSize(Dimensions var1) {
         if (this.sizeBuilder_ == null) {
            if ((this.bitField0_ & 256) != 0 && this.size_ != null && this.size_ != Dimensions.getDefaultInstance()) {
               this.getSizeBuilder().mergeFrom(var1);
            } else {
               this.size_ = var1;
            }
         } else {
            this.sizeBuilder_.mergeFrom(var1);
         }

         if (this.size_ != null) {
            this.bitField0_ |= 256;
            this.onChanged();
         }

         return this;
      }

      public ScreenshotMessage.Builder clearSize() {
         this.bitField0_ &= -257;
         this.size_ = null;
         if (this.sizeBuilder_ != null) {
            this.sizeBuilder_.dispose();
            this.sizeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Dimensions.Builder getSizeBuilder() {
         this.bitField0_ |= 256;
         this.onChanged();
         return this.getSizeFieldBuilder().getBuilder();
      }

      @Override
      public DimensionsOrBuilder getSizeOrBuilder() {
         if (this.sizeBuilder_ != null) {
            return this.sizeBuilder_.getMessageOrBuilder();
         } else {
            return this.size_ == null ? Dimensions.getDefaultInstance() : this.size_;
         }
      }

      private SingleFieldBuilderV3<Dimensions, Dimensions.Builder, DimensionsOrBuilder> getSizeFieldBuilder() {
         if (this.sizeBuilder_ == null) {
            this.sizeBuilder_ = new SingleFieldBuilderV3<>(this.getSize(), this.getParentForChildren(), this.isClean());
            this.size_ = null;
         }

         return this.sizeBuilder_;
      }

      @Override
      public int getPerspectiveValue() {
         return this.perspective_;
      }

      public ScreenshotMessage.Builder setPerspectiveValue(int var1) {
         this.perspective_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public Perspective getPerspective() {
         Perspective var1 = Perspective.forNumber(this.perspective_);
         return var1 == null ? Perspective.UNRECOGNIZED : var1;
      }

      public ScreenshotMessage.Builder setPerspective(Perspective var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 512;
         this.perspective_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearPerspective() {
         this.bitField0_ &= -513;
         this.perspective_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHasHud() {
         return this.hasHud_;
      }

      public ScreenshotMessage.Builder setHasHud(boolean var1) {
         this.hasHud_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearHasHud() {
         this.bitField0_ &= -1025;
         this.hasHud_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public long getDayTime() {
         return this.dayTime_;
      }

      public ScreenshotMessage.Builder setDayTime(long var1) {
         this.dayTime_ = var1;
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearDayTime() {
         this.bitField0_ &= -2049;
         this.dayTime_ = 0L;
         this.onChanged();
         return this;
      }

      @Override
      public int getWeatherValue() {
         return this.weather_;
      }

      public ScreenshotMessage.Builder setWeatherValue(int var1) {
         this.weather_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      @Override
      public Weather getWeather() {
         Weather var1 = Weather.forNumber(this.weather_);
         return var1 == null ? Weather.UNRECOGNIZED : var1;
      }

      public ScreenshotMessage.Builder setWeather(Weather var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4096;
         this.weather_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearWeather() {
         this.bitField0_ &= -4097;
         this.weather_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public float getHealth() {
         return this.health_;
      }

      public ScreenshotMessage.Builder setHealth(float var1) {
         this.health_ = var1;
         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearHealth() {
         this.bitField0_ &= -8193;
         this.health_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getMaxHealth() {
         return this.maxHealth_;
      }

      public ScreenshotMessage.Builder setMaxHealth(float var1) {
         this.maxHealth_ = var1;
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearMaxHealth() {
         this.bitField0_ &= -16385;
         this.maxHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getFoodLevel() {
         return this.foodLevel_;
      }

      public ScreenshotMessage.Builder setFoodLevel(float var1) {
         this.foodLevel_ = var1;
         this.bitField0_ |= 32768;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearFoodLevel() {
         this.bitField0_ &= -32769;
         this.foodLevel_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getSaturationLevel() {
         return this.saturationLevel_;
      }

      public ScreenshotMessage.Builder setSaturationLevel(float var1) {
         this.saturationLevel_ = var1;
         this.bitField0_ |= 65536;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder clearSaturationLevel() {
         this.bitField0_ &= -65537;
         this.saturationLevel_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocalId() {
         return (this.bitField0_ & 131072) != 0;
      }

      @Override
      public Uuid getLocalId() {
         if (this.localIdBuilder_ == null) {
            return this.localId_ == null ? Uuid.getDefaultInstance() : this.localId_;
         } else {
            return this.localIdBuilder_.getMessage();
         }
      }

      public ScreenshotMessage.Builder setLocalId(Uuid var1) {
         if (this.localIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.localId_ = var1;
         } else {
            this.localIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 131072;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder setLocalId(Uuid.Builder var1) {
         if (this.localIdBuilder_ == null) {
            this.localId_ = var1.build();
         } else {
            this.localIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 131072;
         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder mergeLocalId(Uuid var1) {
         if (this.localIdBuilder_ == null) {
            if ((this.bitField0_ & 131072) != 0 && this.localId_ != null && this.localId_ != Uuid.getDefaultInstance()) {
               this.getLocalIdBuilder().mergeFrom(var1);
            } else {
               this.localId_ = var1;
            }
         } else {
            this.localIdBuilder_.mergeFrom(var1);
         }

         if (this.localId_ != null) {
            this.bitField0_ |= 131072;
            this.onChanged();
         }

         return this;
      }

      public ScreenshotMessage.Builder clearLocalId() {
         this.bitField0_ &= -131073;
         this.localId_ = null;
         if (this.localIdBuilder_ != null) {
            this.localIdBuilder_.dispose();
            this.localIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getLocalIdBuilder() {
         this.bitField0_ |= 131072;
         this.onChanged();
         return this.getLocalIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getLocalIdOrBuilder() {
         if (this.localIdBuilder_ != null) {
            return this.localIdBuilder_.getMessageOrBuilder();
         } else {
            return this.localId_ == null ? Uuid.getDefaultInstance() : this.localId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getLocalIdFieldBuilder() {
         if (this.localIdBuilder_ == null) {
            this.localIdBuilder_ = new SingleFieldBuilderV3<>(this.getLocalId(), this.getParentForChildren(), this.isClean());
            this.localId_ = null;
         }

         return this.localIdBuilder_;
      }

      public final ScreenshotMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ScreenshotMessage.Builder)super.setUnknownFields(var1);
      }

      public final ScreenshotMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ScreenshotMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
