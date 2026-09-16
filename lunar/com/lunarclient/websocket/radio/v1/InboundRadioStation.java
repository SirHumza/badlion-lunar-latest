package com.lunarclient.websocket.radio.v1;

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

public final class InboundRadioStation extends GeneratedMessageV3 implements InboundRadioStationOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int DESCRIPTION_FIELD_NUMBER = 2;
   private volatile Object description_ = "";
   public static final int STATION_ID_FIELD_NUMBER = 3;
   private volatile Object stationId_ = "";
   public static final int TRACK_COUNT_FIELD_NUMBER = 4;
   private int trackCount_ = 0;
   public static final int STATION_TYPE_FIELD_NUMBER = 5;
   private int stationType_ = 0;
   public static final int MONETIZATION_TYPE_FIELD_NUMBER = 6;
   private int monetizationType_ = 0;
   public static final int DURATION_FIELD_NUMBER = 7;
   private int duration_ = 0;
   public static final int LICENSED_SESSION_ID_FIELD_NUMBER = 8;
   private volatile Object licensedSessionId_ = "";
   public static final int IMAGE_URL_FIELD_NUMBER = 9;
   private volatile Object imageUrl_ = "";
   private byte memoizedIsInitialized = -1;
   private static final InboundRadioStation DEFAULT_INSTANCE = new InboundRadioStation();
   private static final Parser<InboundRadioStation> PARSER = new AbstractParser<InboundRadioStation>() {
      public InboundRadioStation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundRadioStation.Builder var3 = InboundRadioStation.newBuilder();

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

   private InboundRadioStation(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundRadioStation() {
      this.name_ = "";
      this.description_ = "";
      this.stationId_ = "";
      this.stationType_ = 0;
      this.monetizationType_ = 0;
      this.licensedSessionId_ = "";
      this.imageUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundRadioStation();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundRadioStation.class, InboundRadioStation.Builder.class);
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
   public String getStationId() {
      Object var1 = this.stationId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.stationId_ = var3;
      return var3;
   }

   @Override
   public ByteString getStationIdBytes() {
      Object var1 = this.stationId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.stationId_ = var2;
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
   public int getStationTypeValue() {
      return this.stationType_;
   }

   @Override
   public InboundRadioStation.StationType getStationType() {
      InboundRadioStation.StationType var1 = InboundRadioStation.StationType.forNumber(this.stationType_);
      return var1 == null ? InboundRadioStation.StationType.UNRECOGNIZED : var1;
   }

   @Override
   public int getMonetizationTypeValue() {
      return this.monetizationType_;
   }

   @Override
   public InboundRadioStation.MonetizationType getMonetizationType() {
      InboundRadioStation.MonetizationType var1 = InboundRadioStation.MonetizationType.forNumber(this.monetizationType_);
      return var1 == null ? InboundRadioStation.MonetizationType.UNRECOGNIZED : var1;
   }

   @Override
   public int getDuration() {
      return this.duration_;
   }

   @Override
   public String getLicensedSessionId() {
      Object var1 = this.licensedSessionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.licensedSessionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getLicensedSessionIdBytes() {
      Object var1 = this.licensedSessionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.licensedSessionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getImageUrl() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.imageUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getImageUrlBytes() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.imageUrl_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         GeneratedMessageV3.writeString(var1, 2, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.stationId_)) {
         GeneratedMessageV3.writeString(var1, 3, this.stationId_);
      }

      if (this.trackCount_ != 0) {
         var1.writeInt32(4, this.trackCount_);
      }

      if (this.stationType_ != InboundRadioStation.StationType.STATION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(5, this.stationType_);
      }

      if (this.monetizationType_ != InboundRadioStation.MonetizationType.MONETIZATION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(6, this.monetizationType_);
      }

      if (this.duration_ != 0) {
         var1.writeInt32(7, this.duration_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.licensedSessionId_)) {
         GeneratedMessageV3.writeString(var1, 8, this.licensedSessionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         GeneratedMessageV3.writeString(var1, 9, this.imageUrl_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.stationId_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.stationId_);
      }

      if (this.trackCount_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.trackCount_);
      }

      if (this.stationType_ != InboundRadioStation.StationType.STATION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(5, this.stationType_);
      }

      if (this.monetizationType_ != InboundRadioStation.MonetizationType.MONETIZATION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(6, this.monetizationType_);
      }

      if (this.duration_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.duration_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.licensedSessionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.licensedSessionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.imageUrl_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InboundRadioStation)) {
         return super.equals(var1);
      } else {
         InboundRadioStation var2 = (InboundRadioStation)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getDescription().equals(var2.getDescription())) {
            return false;
         } else if (!this.getStationId().equals(var2.getStationId())) {
            return false;
         } else if (this.getTrackCount() != var2.getTrackCount()) {
            return false;
         } else if (this.stationType_ != var2.stationType_) {
            return false;
         } else if (this.monetizationType_ != var2.monetizationType_) {
            return false;
         } else if (this.getDuration() != var2.getDuration()) {
            return false;
         } else if (!this.getLicensedSessionId().equals(var2.getLicensedSessionId())) {
            return false;
         } else {
            return !this.getImageUrl().equals(var2.getImageUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getDescription().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getStationId().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getTrackCount();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.stationType_;
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.monetizationType_;
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getDuration();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getLicensedSessionId().hashCode();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getImageUrl().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundRadioStation parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioStation parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioStation parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioStation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioStation parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioStation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioStation parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRadioStation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundRadioStation parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundRadioStation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundRadioStation parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRadioStation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundRadioStation.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundRadioStation.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundRadioStation.Builder newBuilder(InboundRadioStation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundRadioStation.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundRadioStation.Builder() : new InboundRadioStation.Builder().mergeFrom(this);
   }

   protected InboundRadioStation.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundRadioStation.Builder(var1);
   }

   public static InboundRadioStation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundRadioStation> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundRadioStation> getParserForType() {
      return PARSER;
   }

   public InboundRadioStation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundRadioStation.Builder> implements InboundRadioStationOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private Object description_ = "";
      private Object stationId_ = "";
      private int trackCount_;
      private int stationType_ = 0;
      private int monetizationType_ = 0;
      private int duration_;
      private Object licensedSessionId_ = "";
      private Object imageUrl_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundRadioStation.class, InboundRadioStation.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundRadioStation.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         this.description_ = "";
         this.stationId_ = "";
         this.trackCount_ = 0;
         this.stationType_ = 0;
         this.monetizationType_ = 0;
         this.duration_ = 0;
         this.licensedSessionId_ = "";
         this.imageUrl_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioStation_descriptor;
      }

      public InboundRadioStation getDefaultInstanceForType() {
         return InboundRadioStation.getDefaultInstance();
      }

      public InboundRadioStation build() {
         InboundRadioStation var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundRadioStation buildPartial() {
         InboundRadioStation var1 = new InboundRadioStation(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundRadioStation var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 2) != 0) {
            var1.description_ = this.description_;
         }

         if ((var2 & 4) != 0) {
            var1.stationId_ = this.stationId_;
         }

         if ((var2 & 8) != 0) {
            var1.trackCount_ = this.trackCount_;
         }

         if ((var2 & 16) != 0) {
            var1.stationType_ = this.stationType_;
         }

         if ((var2 & 32) != 0) {
            var1.monetizationType_ = this.monetizationType_;
         }

         if ((var2 & 64) != 0) {
            var1.duration_ = this.duration_;
         }

         if ((var2 & 128) != 0) {
            var1.licensedSessionId_ = this.licensedSessionId_;
         }

         if ((var2 & 256) != 0) {
            var1.imageUrl_ = this.imageUrl_;
         }
      }

      public InboundRadioStation.Builder clone() {
         return (InboundRadioStation.Builder)super.clone();
      }

      public InboundRadioStation.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRadioStation.Builder)super.setField(var1, var2);
      }

      public InboundRadioStation.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundRadioStation.Builder)super.clearField(var1);
      }

      public InboundRadioStation.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundRadioStation.Builder)super.clearOneof(var1);
      }

      public InboundRadioStation.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundRadioStation.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundRadioStation.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRadioStation.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundRadioStation.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundRadioStation) {
            return this.mergeFrom((InboundRadioStation)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundRadioStation.Builder mergeFrom(InboundRadioStation var1) {
         if (var1 == InboundRadioStation.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getDescription().isEmpty()) {
            this.description_ = var1.description_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getStationId().isEmpty()) {
            this.stationId_ = var1.stationId_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.getTrackCount() != 0) {
            this.setTrackCount(var1.getTrackCount());
         }

         if (var1.stationType_ != 0) {
            this.setStationTypeValue(var1.getStationTypeValue());
         }

         if (var1.monetizationType_ != 0) {
            this.setMonetizationTypeValue(var1.getMonetizationTypeValue());
         }

         if (var1.getDuration() != 0) {
            this.setDuration(var1.getDuration());
         }

         if (!var1.getLicensedSessionId().isEmpty()) {
            this.licensedSessionId_ = var1.licensedSessionId_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (!var1.getImageUrl().isEmpty()) {
            this.imageUrl_ = var1.imageUrl_;
            this.bitField0_ |= 256;
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

      public InboundRadioStation.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.description_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.stationId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.trackCount_ = var1.readInt32();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.stationType_ = var1.readEnum();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.monetizationType_ = var1.readEnum();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.duration_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     this.licensedSessionId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     this.imageUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 256;
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

      public InboundRadioStation.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearName() {
         this.name_ = InboundRadioStation.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioStation.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
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

      public InboundRadioStation.Builder setDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearDescription() {
         this.description_ = InboundRadioStation.getDefaultInstance().getDescription();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder setDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioStation.checkByteStringIsUtf8(var1);
         this.description_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getStationId() {
         Object var1 = this.stationId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.stationId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getStationIdBytes() {
         Object var1 = this.stationId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.stationId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InboundRadioStation.Builder setStationId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearStationId() {
         this.stationId_ = InboundRadioStation.getDefaultInstance().getStationId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder setStationIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioStation.checkByteStringIsUtf8(var1);
         this.stationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public int getTrackCount() {
         return this.trackCount_;
      }

      public InboundRadioStation.Builder setTrackCount(int var1) {
         this.trackCount_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearTrackCount() {
         this.bitField0_ &= -9;
         this.trackCount_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getStationTypeValue() {
         return this.stationType_;
      }

      public InboundRadioStation.Builder setStationTypeValue(int var1) {
         this.stationType_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public InboundRadioStation.StationType getStationType() {
         InboundRadioStation.StationType var1 = InboundRadioStation.StationType.forNumber(this.stationType_);
         return var1 == null ? InboundRadioStation.StationType.UNRECOGNIZED : var1;
      }

      public InboundRadioStation.Builder setStationType(InboundRadioStation.StationType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 16;
         this.stationType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearStationType() {
         this.bitField0_ &= -17;
         this.stationType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getMonetizationTypeValue() {
         return this.monetizationType_;
      }

      public InboundRadioStation.Builder setMonetizationTypeValue(int var1) {
         this.monetizationType_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public InboundRadioStation.MonetizationType getMonetizationType() {
         InboundRadioStation.MonetizationType var1 = InboundRadioStation.MonetizationType.forNumber(this.monetizationType_);
         return var1 == null ? InboundRadioStation.MonetizationType.UNRECOGNIZED : var1;
      }

      public InboundRadioStation.Builder setMonetizationType(InboundRadioStation.MonetizationType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 32;
         this.monetizationType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearMonetizationType() {
         this.bitField0_ &= -33;
         this.monetizationType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getDuration() {
         return this.duration_;
      }

      public InboundRadioStation.Builder setDuration(int var1) {
         this.duration_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearDuration() {
         this.bitField0_ &= -65;
         this.duration_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getLicensedSessionId() {
         Object var1 = this.licensedSessionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.licensedSessionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLicensedSessionIdBytes() {
         Object var1 = this.licensedSessionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.licensedSessionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InboundRadioStation.Builder setLicensedSessionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.licensedSessionId_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearLicensedSessionId() {
         this.licensedSessionId_ = InboundRadioStation.getDefaultInstance().getLicensedSessionId();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder setLicensedSessionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioStation.checkByteStringIsUtf8(var1);
         this.licensedSessionId_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public String getImageUrl() {
         Object var1 = this.imageUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.imageUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getImageUrlBytes() {
         Object var1 = this.imageUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.imageUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InboundRadioStation.Builder setImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.imageUrl_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder clearImageUrl() {
         this.imageUrl_ = InboundRadioStation.getDefaultInstance().getImageUrl();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder setImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundRadioStation.checkByteStringIsUtf8(var1);
         this.imageUrl_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public final InboundRadioStation.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundRadioStation.Builder)super.setUnknownFields(var1);
      }

      public final InboundRadioStation.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundRadioStation.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum MonetizationType implements ProtocolMessageEnum {
      MONETIZATION_TYPE_UNSPECIFIED(0),
      MONETIZATION_TYPE_INTERNAL_AD_FUNDED(1),
      MONETIZATION_TYPE_EXTERNAL_AD_FUNDED(2),
      MONETIZATION_TYPE_PREMIUM(3),
      UNRECOGNIZED(-1);

      public static final int MONETIZATION_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int MONETIZATION_TYPE_INTERNAL_AD_FUNDED_VALUE = 1;
      public static final int MONETIZATION_TYPE_EXTERNAL_AD_FUNDED_VALUE = 2;
      public static final int MONETIZATION_TYPE_PREMIUM_VALUE = 3;
      private static final Internal.EnumLiteMap<InboundRadioStation.MonetizationType> internalValueMap = new Internal.EnumLiteMap<InboundRadioStation.MonetizationType>() {
         public InboundRadioStation.MonetizationType findValueByNumber(int var1) {
            return InboundRadioStation.MonetizationType.forNumber(var1);
         }
      };
      private static final InboundRadioStation.MonetizationType[] VALUES = values();
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
      public static InboundRadioStation.MonetizationType valueOf(int var0) {
         return forNumber(var0);
      }

      public static InboundRadioStation.MonetizationType forNumber(int var0) {
         switch (var0) {
            case 0:
               return MONETIZATION_TYPE_UNSPECIFIED;
            case 1:
               return MONETIZATION_TYPE_INTERNAL_AD_FUNDED;
            case 2:
               return MONETIZATION_TYPE_EXTERNAL_AD_FUNDED;
            case 3:
               return MONETIZATION_TYPE_PREMIUM;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<InboundRadioStation.MonetizationType> internalGetValueMap() {
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
         return InboundRadioStation.getDescriptor().getEnumTypes().get(1);
      }

      public static InboundRadioStation.MonetizationType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      MonetizationType(int var3) {
         this.value = var3;
      }
   }

   public enum StationType implements ProtocolMessageEnum {
      STATION_TYPE_UNSPECIFIED(0),
      STATION_TYPE_LICENSED(1),
      STATION_TYPE_ROYALTY_FREE(2),
      UNRECOGNIZED(-1);

      public static final int STATION_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int STATION_TYPE_LICENSED_VALUE = 1;
      public static final int STATION_TYPE_ROYALTY_FREE_VALUE = 2;
      private static final Internal.EnumLiteMap<InboundRadioStation.StationType> internalValueMap = new Internal.EnumLiteMap<InboundRadioStation.StationType>() {
         public InboundRadioStation.StationType findValueByNumber(int var1) {
            return InboundRadioStation.StationType.forNumber(var1);
         }
      };
      private static final InboundRadioStation.StationType[] VALUES = values();
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
      public static InboundRadioStation.StationType valueOf(int var0) {
         return forNumber(var0);
      }

      public static InboundRadioStation.StationType forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATION_TYPE_UNSPECIFIED;
            case 1:
               return STATION_TYPE_LICENSED;
            case 2:
               return STATION_TYPE_ROYALTY_FREE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<InboundRadioStation.StationType> internalGetValueMap() {
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
         return InboundRadioStation.getDescriptor().getEnumTypes().get(0);
      }

      public static InboundRadioStation.StationType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      StationType(int var3) {
         this.value = var3;
      }
   }
}
