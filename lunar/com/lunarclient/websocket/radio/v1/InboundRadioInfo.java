package com.lunarclient.websocket.radio.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class InboundRadioInfo extends GeneratedMessageV3 implements InboundRadioInfoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TRACK_FIELD_NUMBER = 1;
   private InboundRadioTrack track_;
   public static final int STATION_FIELD_NUMBER = 2;
   private InboundRadioStation station_;
   private byte memoizedIsInitialized = -1;
   private static final InboundRadioInfo DEFAULT_INSTANCE = new InboundRadioInfo();
   private static final Parser<InboundRadioInfo> PARSER = new AbstractParser<InboundRadioInfo>() {
      public InboundRadioInfo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundRadioInfo.Builder var3 = InboundRadioInfo.newBuilder();

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

   private InboundRadioInfo(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundRadioInfo() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundRadioInfo();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundRadioInfo.class, InboundRadioInfo.Builder.class);
   }

   @Override
   public boolean hasTrack() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public InboundRadioTrack getTrack() {
      return this.track_ == null ? InboundRadioTrack.getDefaultInstance() : this.track_;
   }

   @Override
   public InboundRadioTrackOrBuilder getTrackOrBuilder() {
      return this.track_ == null ? InboundRadioTrack.getDefaultInstance() : this.track_;
   }

   @Override
   public boolean hasStation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public InboundRadioStation getStation() {
      return this.station_ == null ? InboundRadioStation.getDefaultInstance() : this.station_;
   }

   @Override
   public InboundRadioStationOrBuilder getStationOrBuilder() {
      return this.station_ == null ? InboundRadioStation.getDefaultInstance() : this.station_;
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
         var1.writeMessage(1, this.getTrack());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getStation());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getTrack());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getStation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InboundRadioInfo)) {
         return super.equals(var1);
      } else {
         InboundRadioInfo var2 = (InboundRadioInfo)var1;
         if (this.hasTrack() != var2.hasTrack()) {
            return false;
         } else if (this.hasTrack() && !this.getTrack().equals(var2.getTrack())) {
            return false;
         } else if (this.hasStation() != var2.hasStation()) {
            return false;
         } else {
            return this.hasStation() && !this.getStation().equals(var2.getStation()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasTrack()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTrack().hashCode();
      }

      if (this.hasStation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getStation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundRadioInfo parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioInfo parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioInfo parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioInfo parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRadioInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRadioInfo parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRadioInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundRadioInfo parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundRadioInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundRadioInfo parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRadioInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundRadioInfo.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundRadioInfo.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundRadioInfo.Builder newBuilder(InboundRadioInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundRadioInfo.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundRadioInfo.Builder() : new InboundRadioInfo.Builder().mergeFrom(this);
   }

   protected InboundRadioInfo.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundRadioInfo.Builder(var1);
   }

   public static InboundRadioInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundRadioInfo> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundRadioInfo> getParserForType() {
      return PARSER;
   }

   public InboundRadioInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundRadioInfo.Builder> implements InboundRadioInfoOrBuilder {
      private int bitField0_;
      private InboundRadioTrack track_;
      private SingleFieldBuilderV3<InboundRadioTrack, InboundRadioTrack.Builder, InboundRadioTrackOrBuilder> trackBuilder_;
      private InboundRadioStation station_;
      private SingleFieldBuilderV3<InboundRadioStation, InboundRadioStation.Builder, InboundRadioStationOrBuilder> stationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundRadioInfo.class, InboundRadioInfo.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InboundRadioInfo.alwaysUseFieldBuilders) {
            this.getTrackFieldBuilder();
            this.getStationFieldBuilder();
         }
      }

      public InboundRadioInfo.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.track_ = null;
         if (this.trackBuilder_ != null) {
            this.trackBuilder_.dispose();
            this.trackBuilder_ = null;
         }

         this.station_ = null;
         if (this.stationBuilder_ != null) {
            this.stationBuilder_.dispose();
            this.stationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_radio_v1_InboundRadioInfo_descriptor;
      }

      public InboundRadioInfo getDefaultInstanceForType() {
         return InboundRadioInfo.getDefaultInstance();
      }

      public InboundRadioInfo build() {
         InboundRadioInfo var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundRadioInfo buildPartial() {
         InboundRadioInfo var1 = new InboundRadioInfo(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundRadioInfo var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.track_ = this.trackBuilder_ == null ? this.track_ : this.trackBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.station_ = this.stationBuilder_ == null ? this.station_ : this.stationBuilder_.build();
            var3 |= 2;
         }

         InboundRadioInfo var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InboundRadioInfo.Builder clone() {
         return (InboundRadioInfo.Builder)super.clone();
      }

      public InboundRadioInfo.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRadioInfo.Builder)super.setField(var1, var2);
      }

      public InboundRadioInfo.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundRadioInfo.Builder)super.clearField(var1);
      }

      public InboundRadioInfo.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundRadioInfo.Builder)super.clearOneof(var1);
      }

      public InboundRadioInfo.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundRadioInfo.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundRadioInfo.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRadioInfo.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundRadioInfo.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundRadioInfo) {
            return this.mergeFrom((InboundRadioInfo)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundRadioInfo.Builder mergeFrom(InboundRadioInfo var1) {
         if (var1 == InboundRadioInfo.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTrack()) {
            this.mergeTrack(var1.getTrack());
         }

         if (var1.hasStation()) {
            this.mergeStation(var1.getStation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InboundRadioInfo.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTrackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getStationFieldBuilder().getBuilder(), var2);
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
      public boolean hasTrack() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public InboundRadioTrack getTrack() {
         if (this.trackBuilder_ == null) {
            return this.track_ == null ? InboundRadioTrack.getDefaultInstance() : this.track_;
         } else {
            return this.trackBuilder_.getMessage();
         }
      }

      public InboundRadioInfo.Builder setTrack(InboundRadioTrack var1) {
         if (this.trackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.track_ = var1;
         } else {
            this.trackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundRadioInfo.Builder setTrack(InboundRadioTrack.Builder var1) {
         if (this.trackBuilder_ == null) {
            this.track_ = var1.build();
         } else {
            this.trackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundRadioInfo.Builder mergeTrack(InboundRadioTrack var1) {
         if (this.trackBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.track_ != null && this.track_ != InboundRadioTrack.getDefaultInstance()) {
               this.getTrackBuilder().mergeFrom(var1);
            } else {
               this.track_ = var1;
            }
         } else {
            this.trackBuilder_.mergeFrom(var1);
         }

         if (this.track_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public InboundRadioInfo.Builder clearTrack() {
         this.bitField0_ &= -2;
         this.track_ = null;
         if (this.trackBuilder_ != null) {
            this.trackBuilder_.dispose();
            this.trackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundRadioTrack.Builder getTrackBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTrackFieldBuilder().getBuilder();
      }

      @Override
      public InboundRadioTrackOrBuilder getTrackOrBuilder() {
         if (this.trackBuilder_ != null) {
            return this.trackBuilder_.getMessageOrBuilder();
         } else {
            return this.track_ == null ? InboundRadioTrack.getDefaultInstance() : this.track_;
         }
      }

      private SingleFieldBuilderV3<InboundRadioTrack, InboundRadioTrack.Builder, InboundRadioTrackOrBuilder> getTrackFieldBuilder() {
         if (this.trackBuilder_ == null) {
            this.trackBuilder_ = new SingleFieldBuilderV3<>(this.getTrack(), this.getParentForChildren(), this.isClean());
            this.track_ = null;
         }

         return this.trackBuilder_;
      }

      @Override
      public boolean hasStation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public InboundRadioStation getStation() {
         if (this.stationBuilder_ == null) {
            return this.station_ == null ? InboundRadioStation.getDefaultInstance() : this.station_;
         } else {
            return this.stationBuilder_.getMessage();
         }
      }

      public InboundRadioInfo.Builder setStation(InboundRadioStation var1) {
         if (this.stationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.station_ = var1;
         } else {
            this.stationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundRadioInfo.Builder setStation(InboundRadioStation.Builder var1) {
         if (this.stationBuilder_ == null) {
            this.station_ = var1.build();
         } else {
            this.stationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundRadioInfo.Builder mergeStation(InboundRadioStation var1) {
         if (this.stationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.station_ != null && this.station_ != InboundRadioStation.getDefaultInstance()) {
               this.getStationBuilder().mergeFrom(var1);
            } else {
               this.station_ = var1;
            }
         } else {
            this.stationBuilder_.mergeFrom(var1);
         }

         if (this.station_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public InboundRadioInfo.Builder clearStation() {
         this.bitField0_ &= -3;
         this.station_ = null;
         if (this.stationBuilder_ != null) {
            this.stationBuilder_.dispose();
            this.stationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundRadioStation.Builder getStationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getStationFieldBuilder().getBuilder();
      }

      @Override
      public InboundRadioStationOrBuilder getStationOrBuilder() {
         if (this.stationBuilder_ != null) {
            return this.stationBuilder_.getMessageOrBuilder();
         } else {
            return this.station_ == null ? InboundRadioStation.getDefaultInstance() : this.station_;
         }
      }

      private SingleFieldBuilderV3<InboundRadioStation, InboundRadioStation.Builder, InboundRadioStationOrBuilder> getStationFieldBuilder() {
         if (this.stationBuilder_ == null) {
            this.stationBuilder_ = new SingleFieldBuilderV3<>(this.getStation(), this.getParentForChildren(), this.isClean());
            this.station_ = null;
         }

         return this.stationBuilder_;
      }

      public final InboundRadioInfo.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundRadioInfo.Builder)super.setUnknownFields(var1);
      }

      public final InboundRadioInfo.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundRadioInfo.Builder)super.mergeUnknownFields(var1);
      }
   }
}
