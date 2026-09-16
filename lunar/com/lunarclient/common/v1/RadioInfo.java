package com.lunarclient.common.v1;

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

public final class RadioInfo extends GeneratedMessageV3 implements RadioInfoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TRACK_FIELD_NUMBER = 1;
   private RadioTrack track_;
   public static final int STATION_FIELD_NUMBER = 2;
   private RadioStation station_;
   private byte memoizedIsInitialized = -1;
   private static final RadioInfo DEFAULT_INSTANCE = new RadioInfo();
   private static final Parser<RadioInfo> PARSER = new AbstractParser<RadioInfo>() {
      public RadioInfo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RadioInfo.Builder var3 = RadioInfo.newBuilder();

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

   private RadioInfo(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RadioInfo() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RadioInfo();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RadioProto.internal_static_lunarclient_common_v1_RadioInfo_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RadioProto.internal_static_lunarclient_common_v1_RadioInfo_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RadioInfo.class, RadioInfo.Builder.class);
   }

   @Override
   public boolean hasTrack() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public RadioTrack getTrack() {
      return this.track_ == null ? RadioTrack.getDefaultInstance() : this.track_;
   }

   @Override
   public RadioTrackOrBuilder getTrackOrBuilder() {
      return this.track_ == null ? RadioTrack.getDefaultInstance() : this.track_;
   }

   @Override
   public boolean hasStation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public RadioStation getStation() {
      return this.station_ == null ? RadioStation.getDefaultInstance() : this.station_;
   }

   @Override
   public RadioStationOrBuilder getStationOrBuilder() {
      return this.station_ == null ? RadioStation.getDefaultInstance() : this.station_;
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
      } else if (!(var1 instanceof RadioInfo)) {
         return super.equals(var1);
      } else {
         RadioInfo var2 = (RadioInfo)var1;
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

   public static RadioInfo parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioInfo parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioInfo parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioInfo parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioInfo parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RadioInfo parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RadioInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RadioInfo parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RadioInfo.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RadioInfo.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RadioInfo.Builder newBuilder(RadioInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RadioInfo.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RadioInfo.Builder() : new RadioInfo.Builder().mergeFrom(this);
   }

   protected RadioInfo.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RadioInfo.Builder(var1);
   }

   public static RadioInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RadioInfo> parser() {
      return PARSER;
   }

   @Override
   public Parser<RadioInfo> getParserForType() {
      return PARSER;
   }

   public RadioInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RadioInfo.Builder> implements RadioInfoOrBuilder {
      private int bitField0_;
      private RadioTrack track_;
      private SingleFieldBuilderV3<RadioTrack, RadioTrack.Builder, RadioTrackOrBuilder> trackBuilder_;
      private RadioStation station_;
      private SingleFieldBuilderV3<RadioStation, RadioStation.Builder, RadioStationOrBuilder> stationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioInfo_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RadioInfo.class, RadioInfo.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RadioInfo.alwaysUseFieldBuilders) {
            this.getTrackFieldBuilder();
            this.getStationFieldBuilder();
         }
      }

      public RadioInfo.Builder clear() {
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
         return RadioProto.internal_static_lunarclient_common_v1_RadioInfo_descriptor;
      }

      public RadioInfo getDefaultInstanceForType() {
         return RadioInfo.getDefaultInstance();
      }

      public RadioInfo build() {
         RadioInfo var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RadioInfo buildPartial() {
         RadioInfo var1 = new RadioInfo(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RadioInfo var1) {
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

         RadioInfo var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RadioInfo.Builder clone() {
         return (RadioInfo.Builder)super.clone();
      }

      public RadioInfo.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioInfo.Builder)super.setField(var1, var2);
      }

      public RadioInfo.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RadioInfo.Builder)super.clearField(var1);
      }

      public RadioInfo.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RadioInfo.Builder)super.clearOneof(var1);
      }

      public RadioInfo.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RadioInfo.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RadioInfo.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioInfo.Builder)super.addRepeatedField(var1, var2);
      }

      public RadioInfo.Builder mergeFrom(Message var1) {
         if (var1 instanceof RadioInfo) {
            return this.mergeFrom((RadioInfo)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RadioInfo.Builder mergeFrom(RadioInfo var1) {
         if (var1 == RadioInfo.getDefaultInstance()) {
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

      public RadioInfo.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
      public RadioTrack getTrack() {
         if (this.trackBuilder_ == null) {
            return this.track_ == null ? RadioTrack.getDefaultInstance() : this.track_;
         } else {
            return this.trackBuilder_.getMessage();
         }
      }

      public RadioInfo.Builder setTrack(RadioTrack var1) {
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

      public RadioInfo.Builder setTrack(RadioTrack.Builder var1) {
         if (this.trackBuilder_ == null) {
            this.track_ = var1.build();
         } else {
            this.trackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RadioInfo.Builder mergeTrack(RadioTrack var1) {
         if (this.trackBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.track_ != null && this.track_ != RadioTrack.getDefaultInstance()) {
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

      public RadioInfo.Builder clearTrack() {
         this.bitField0_ &= -2;
         this.track_ = null;
         if (this.trackBuilder_ != null) {
            this.trackBuilder_.dispose();
            this.trackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RadioTrack.Builder getTrackBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTrackFieldBuilder().getBuilder();
      }

      @Override
      public RadioTrackOrBuilder getTrackOrBuilder() {
         if (this.trackBuilder_ != null) {
            return this.trackBuilder_.getMessageOrBuilder();
         } else {
            return this.track_ == null ? RadioTrack.getDefaultInstance() : this.track_;
         }
      }

      private SingleFieldBuilderV3<RadioTrack, RadioTrack.Builder, RadioTrackOrBuilder> getTrackFieldBuilder() {
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
      public RadioStation getStation() {
         if (this.stationBuilder_ == null) {
            return this.station_ == null ? RadioStation.getDefaultInstance() : this.station_;
         } else {
            return this.stationBuilder_.getMessage();
         }
      }

      public RadioInfo.Builder setStation(RadioStation var1) {
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

      public RadioInfo.Builder setStation(RadioStation.Builder var1) {
         if (this.stationBuilder_ == null) {
            this.station_ = var1.build();
         } else {
            this.stationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RadioInfo.Builder mergeStation(RadioStation var1) {
         if (this.stationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.station_ != null && this.station_ != RadioStation.getDefaultInstance()) {
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

      public RadioInfo.Builder clearStation() {
         this.bitField0_ &= -3;
         this.station_ = null;
         if (this.stationBuilder_ != null) {
            this.stationBuilder_.dispose();
            this.stationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RadioStation.Builder getStationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getStationFieldBuilder().getBuilder();
      }

      @Override
      public RadioStationOrBuilder getStationOrBuilder() {
         if (this.stationBuilder_ != null) {
            return this.stationBuilder_.getMessageOrBuilder();
         } else {
            return this.station_ == null ? RadioStation.getDefaultInstance() : this.station_;
         }
      }

      private SingleFieldBuilderV3<RadioStation, RadioStation.Builder, RadioStationOrBuilder> getStationFieldBuilder() {
         if (this.stationBuilder_ == null) {
            this.stationBuilder_ = new SingleFieldBuilderV3<>(this.getStation(), this.getParentForChildren(), this.isClean());
            this.station_ = null;
         }

         return this.stationBuilder_;
      }

      public final RadioInfo.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RadioInfo.Builder)super.setUnknownFields(var1);
      }

      public final RadioInfo.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RadioInfo.Builder)super.mergeUnknownFields(var1);
      }
   }
}
