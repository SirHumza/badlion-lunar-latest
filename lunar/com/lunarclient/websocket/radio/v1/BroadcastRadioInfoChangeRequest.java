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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BroadcastRadioInfoChangeRequest extends GeneratedMessageV3 implements BroadcastRadioInfoChangeRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NEW_RADIO_INFO_FIELD_NUMBER = 1;
   private InboundRadioInfo newRadioInfo_;
   public static final int INITIATOR_FIELD_NUMBER = 2;
   private int initiator_ = 0;
   public static final int INITIATOR_SOURCE_FIELD_NUMBER = 3;
   private int initiatorSource_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastRadioInfoChangeRequest DEFAULT_INSTANCE = new BroadcastRadioInfoChangeRequest();
   private static final Parser<BroadcastRadioInfoChangeRequest> PARSER = new AbstractParser<BroadcastRadioInfoChangeRequest>() {
      public BroadcastRadioInfoChangeRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastRadioInfoChangeRequest.Builder var3 = BroadcastRadioInfoChangeRequest.newBuilder();

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

   private BroadcastRadioInfoChangeRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastRadioInfoChangeRequest() {
      this.initiator_ = 0;
      this.initiatorSource_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastRadioInfoChangeRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastRadioInfoChangeRequest.class, BroadcastRadioInfoChangeRequest.Builder.class);
   }

   @Override
   public boolean hasNewRadioInfo() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public InboundRadioInfo getNewRadioInfo() {
      return this.newRadioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.newRadioInfo_;
   }

   @Override
   public InboundRadioInfoOrBuilder getNewRadioInfoOrBuilder() {
      return this.newRadioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.newRadioInfo_;
   }

   @Override
   public int getInitiatorValue() {
      return this.initiator_;
   }

   @Override
   public BroadcastRadioInfoChangeRequest.InfoChangeInitiator getInitiator() {
      BroadcastRadioInfoChangeRequest.InfoChangeInitiator var1 = BroadcastRadioInfoChangeRequest.InfoChangeInitiator.forNumber(this.initiator_);
      return var1 == null ? BroadcastRadioInfoChangeRequest.InfoChangeInitiator.UNRECOGNIZED : var1;
   }

   @Override
   public int getInitiatorSourceValue() {
      return this.initiatorSource_;
   }

   @Override
   public BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource getInitiatorSource() {
      BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource var1 = BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.forNumber(
         this.initiatorSource_
      );
      return var1 == null ? BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getNewRadioInfo());
      }

      if (this.initiator_ != BroadcastRadioInfoChangeRequest.InfoChangeInitiator.INFO_CHANGE_INITIATOR_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.initiator_);
      }

      if (this.initiatorSource_ != BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.INFO_CHANGE_INITIATOR_SOURCE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.initiatorSource_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNewRadioInfo());
      }

      if (this.initiator_ != BroadcastRadioInfoChangeRequest.InfoChangeInitiator.INFO_CHANGE_INITIATOR_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.initiator_);
      }

      if (this.initiatorSource_ != BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.INFO_CHANGE_INITIATOR_SOURCE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.initiatorSource_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BroadcastRadioInfoChangeRequest)) {
         return super.equals(var1);
      } else {
         BroadcastRadioInfoChangeRequest var2 = (BroadcastRadioInfoChangeRequest)var1;
         if (this.hasNewRadioInfo() != var2.hasNewRadioInfo()) {
            return false;
         } else if (this.hasNewRadioInfo() && !this.getNewRadioInfo().equals(var2.getNewRadioInfo())) {
            return false;
         } else if (this.initiator_ != var2.initiator_) {
            return false;
         } else {
            return this.initiatorSource_ != var2.initiatorSource_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasNewRadioInfo()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNewRadioInfo().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.initiator_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.initiatorSource_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastRadioInfoChangeRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastRadioInfoChangeRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastRadioInfoChangeRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastRadioInfoChangeRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastRadioInfoChangeRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastRadioInfoChangeRequest.Builder newBuilder(BroadcastRadioInfoChangeRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastRadioInfoChangeRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastRadioInfoChangeRequest.Builder() : new BroadcastRadioInfoChangeRequest.Builder().mergeFrom(this);
   }

   protected BroadcastRadioInfoChangeRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastRadioInfoChangeRequest.Builder(var1);
   }

   public static BroadcastRadioInfoChangeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastRadioInfoChangeRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastRadioInfoChangeRequest> getParserForType() {
      return PARSER;
   }

   public BroadcastRadioInfoChangeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastRadioInfoChangeRequest.Builder>
      implements BroadcastRadioInfoChangeRequestOrBuilder {
      private int bitField0_;
      private InboundRadioInfo newRadioInfo_;
      private SingleFieldBuilderV3<InboundRadioInfo, InboundRadioInfo.Builder, InboundRadioInfoOrBuilder> newRadioInfoBuilder_;
      private int initiator_ = 0;
      private int initiatorSource_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastRadioInfoChangeRequest.class, BroadcastRadioInfoChangeRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BroadcastRadioInfoChangeRequest.alwaysUseFieldBuilders) {
            this.getNewRadioInfoFieldBuilder();
         }
      }

      public BroadcastRadioInfoChangeRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newRadioInfo_ = null;
         if (this.newRadioInfoBuilder_ != null) {
            this.newRadioInfoBuilder_.dispose();
            this.newRadioInfoBuilder_ = null;
         }

         this.initiator_ = 0;
         this.initiatorSource_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_descriptor;
      }

      public BroadcastRadioInfoChangeRequest getDefaultInstanceForType() {
         return BroadcastRadioInfoChangeRequest.getDefaultInstance();
      }

      public BroadcastRadioInfoChangeRequest build() {
         BroadcastRadioInfoChangeRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastRadioInfoChangeRequest buildPartial() {
         BroadcastRadioInfoChangeRequest var1 = new BroadcastRadioInfoChangeRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BroadcastRadioInfoChangeRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.newRadioInfo_ = this.newRadioInfoBuilder_ == null ? this.newRadioInfo_ : this.newRadioInfoBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.initiator_ = this.initiator_;
         }

         if ((var2 & 4) != 0) {
            var1.initiatorSource_ = this.initiatorSource_;
         }

         BroadcastRadioInfoChangeRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BroadcastRadioInfoChangeRequest.Builder clone() {
         return (BroadcastRadioInfoChangeRequest.Builder)super.clone();
      }

      public BroadcastRadioInfoChangeRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.setField(var1, var2);
      }

      public BroadcastRadioInfoChangeRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.clearField(var1);
      }

      public BroadcastRadioInfoChangeRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.clearOneof(var1);
      }

      public BroadcastRadioInfoChangeRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastRadioInfoChangeRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastRadioInfoChangeRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastRadioInfoChangeRequest) {
            return this.mergeFrom((BroadcastRadioInfoChangeRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastRadioInfoChangeRequest.Builder mergeFrom(BroadcastRadioInfoChangeRequest var1) {
         if (var1 == BroadcastRadioInfoChangeRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNewRadioInfo()) {
            this.mergeNewRadioInfo(var1.getNewRadioInfo());
         }

         if (var1.initiator_ != 0) {
            this.setInitiatorValue(var1.getInitiatorValue());
         }

         if (var1.initiatorSource_ != 0) {
            this.setInitiatorSourceValue(var1.getInitiatorSourceValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastRadioInfoChangeRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNewRadioInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.initiator_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.initiatorSource_ = var1.readEnum();
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
      public boolean hasNewRadioInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public InboundRadioInfo getNewRadioInfo() {
         if (this.newRadioInfoBuilder_ == null) {
            return this.newRadioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.newRadioInfo_;
         } else {
            return this.newRadioInfoBuilder_.getMessage();
         }
      }

      public BroadcastRadioInfoChangeRequest.Builder setNewRadioInfo(InboundRadioInfo var1) {
         if (this.newRadioInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newRadioInfo_ = var1;
         } else {
            this.newRadioInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastRadioInfoChangeRequest.Builder setNewRadioInfo(InboundRadioInfo.Builder var1) {
         if (this.newRadioInfoBuilder_ == null) {
            this.newRadioInfo_ = var1.build();
         } else {
            this.newRadioInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastRadioInfoChangeRequest.Builder mergeNewRadioInfo(InboundRadioInfo var1) {
         if (this.newRadioInfoBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.newRadioInfo_ != null && this.newRadioInfo_ != InboundRadioInfo.getDefaultInstance()) {
               this.getNewRadioInfoBuilder().mergeFrom(var1);
            } else {
               this.newRadioInfo_ = var1;
            }
         } else {
            this.newRadioInfoBuilder_.mergeFrom(var1);
         }

         if (this.newRadioInfo_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BroadcastRadioInfoChangeRequest.Builder clearNewRadioInfo() {
         this.bitField0_ &= -2;
         this.newRadioInfo_ = null;
         if (this.newRadioInfoBuilder_ != null) {
            this.newRadioInfoBuilder_.dispose();
            this.newRadioInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundRadioInfo.Builder getNewRadioInfoBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNewRadioInfoFieldBuilder().getBuilder();
      }

      @Override
      public InboundRadioInfoOrBuilder getNewRadioInfoOrBuilder() {
         if (this.newRadioInfoBuilder_ != null) {
            return this.newRadioInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.newRadioInfo_ == null ? InboundRadioInfo.getDefaultInstance() : this.newRadioInfo_;
         }
      }

      private SingleFieldBuilderV3<InboundRadioInfo, InboundRadioInfo.Builder, InboundRadioInfoOrBuilder> getNewRadioInfoFieldBuilder() {
         if (this.newRadioInfoBuilder_ == null) {
            this.newRadioInfoBuilder_ = new SingleFieldBuilderV3<>(this.getNewRadioInfo(), this.getParentForChildren(), this.isClean());
            this.newRadioInfo_ = null;
         }

         return this.newRadioInfoBuilder_;
      }

      @Override
      public int getInitiatorValue() {
         return this.initiator_;
      }

      public BroadcastRadioInfoChangeRequest.Builder setInitiatorValue(int var1) {
         this.initiator_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public BroadcastRadioInfoChangeRequest.InfoChangeInitiator getInitiator() {
         BroadcastRadioInfoChangeRequest.InfoChangeInitiator var1 = BroadcastRadioInfoChangeRequest.InfoChangeInitiator.forNumber(this.initiator_);
         return var1 == null ? BroadcastRadioInfoChangeRequest.InfoChangeInitiator.UNRECOGNIZED : var1;
      }

      public BroadcastRadioInfoChangeRequest.Builder setInitiator(BroadcastRadioInfoChangeRequest.InfoChangeInitiator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.initiator_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public BroadcastRadioInfoChangeRequest.Builder clearInitiator() {
         this.bitField0_ &= -3;
         this.initiator_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getInitiatorSourceValue() {
         return this.initiatorSource_;
      }

      public BroadcastRadioInfoChangeRequest.Builder setInitiatorSourceValue(int var1) {
         this.initiatorSource_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource getInitiatorSource() {
         BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource var1 = BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.forNumber(
            this.initiatorSource_
         );
         return var1 == null ? BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.UNRECOGNIZED : var1;
      }

      public BroadcastRadioInfoChangeRequest.Builder setInitiatorSource(BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.initiatorSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public BroadcastRadioInfoChangeRequest.Builder clearInitiatorSource() {
         this.bitField0_ &= -5;
         this.initiatorSource_ = 0;
         this.onChanged();
         return this;
      }

      public final BroadcastRadioInfoChangeRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastRadioInfoChangeRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastRadioInfoChangeRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum InfoChangeInitiator implements ProtocolMessageEnum {
      INFO_CHANGE_INITIATOR_UNSPECIFIED(0),
      INFO_CHANGE_INITIATOR_STOP(1),
      INFO_CHANGE_INITIATOR_SKIP(2),
      INFO_CHANGE_INITIATOR_NEXT_TRACK(3),
      INFO_CHANGE_INITIATOR_START_STATION(4),
      INFO_CHANGE_INITIATOR_STATION_COMPLETE(5),
      INFO_CHANGE_INITIATOR_TRACK_PLAY_PAUSE(6),
      INFO_CHANGE_INITIATOR_TRACK_LIKE_TOGGLE(7),
      INFO_CHANGE_INITIATOR_STATION_LIKE_TOGGLE(8),
      INFO_CHANGE_INITIATOR_STATION_LOOP(9),
      INFO_CHANGE_INITIATOR_STATION_AUTO_START(10),
      INFO_CHANGE_INITIATOR_STATION_AUTO_START_RANDOM(11),
      INFO_CHANGE_INITIATOR_START_STATION_RANDOM(12),
      INFO_CHANGE_INITIATOR_INACTIVE(13),
      UNRECOGNIZED(-1);

      public static final int INFO_CHANGE_INITIATOR_UNSPECIFIED_VALUE = 0;
      public static final int INFO_CHANGE_INITIATOR_STOP_VALUE = 1;
      public static final int INFO_CHANGE_INITIATOR_SKIP_VALUE = 2;
      public static final int INFO_CHANGE_INITIATOR_NEXT_TRACK_VALUE = 3;
      public static final int INFO_CHANGE_INITIATOR_START_STATION_VALUE = 4;
      public static final int INFO_CHANGE_INITIATOR_STATION_COMPLETE_VALUE = 5;
      public static final int INFO_CHANGE_INITIATOR_TRACK_PLAY_PAUSE_VALUE = 6;
      public static final int INFO_CHANGE_INITIATOR_TRACK_LIKE_TOGGLE_VALUE = 7;
      public static final int INFO_CHANGE_INITIATOR_STATION_LIKE_TOGGLE_VALUE = 8;
      public static final int INFO_CHANGE_INITIATOR_STATION_LOOP_VALUE = 9;
      public static final int INFO_CHANGE_INITIATOR_STATION_AUTO_START_VALUE = 10;
      public static final int INFO_CHANGE_INITIATOR_STATION_AUTO_START_RANDOM_VALUE = 11;
      public static final int INFO_CHANGE_INITIATOR_START_STATION_RANDOM_VALUE = 12;
      public static final int INFO_CHANGE_INITIATOR_INACTIVE_VALUE = 13;
      private static final Internal.EnumLiteMap<BroadcastRadioInfoChangeRequest.InfoChangeInitiator> internalValueMap = new Internal.EnumLiteMap<BroadcastRadioInfoChangeRequest.InfoChangeInitiator>() {
         public BroadcastRadioInfoChangeRequest.InfoChangeInitiator findValueByNumber(int var1) {
            return BroadcastRadioInfoChangeRequest.InfoChangeInitiator.forNumber(var1);
         }
      };
      private static final BroadcastRadioInfoChangeRequest.InfoChangeInitiator[] VALUES = values();
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
      public static BroadcastRadioInfoChangeRequest.InfoChangeInitiator valueOf(int var0) {
         return forNumber(var0);
      }

      public static BroadcastRadioInfoChangeRequest.InfoChangeInitiator forNumber(int var0) {
         switch (var0) {
            case 0:
               return INFO_CHANGE_INITIATOR_UNSPECIFIED;
            case 1:
               return INFO_CHANGE_INITIATOR_STOP;
            case 2:
               return INFO_CHANGE_INITIATOR_SKIP;
            case 3:
               return INFO_CHANGE_INITIATOR_NEXT_TRACK;
            case 4:
               return INFO_CHANGE_INITIATOR_START_STATION;
            case 5:
               return INFO_CHANGE_INITIATOR_STATION_COMPLETE;
            case 6:
               return INFO_CHANGE_INITIATOR_TRACK_PLAY_PAUSE;
            case 7:
               return INFO_CHANGE_INITIATOR_TRACK_LIKE_TOGGLE;
            case 8:
               return INFO_CHANGE_INITIATOR_STATION_LIKE_TOGGLE;
            case 9:
               return INFO_CHANGE_INITIATOR_STATION_LOOP;
            case 10:
               return INFO_CHANGE_INITIATOR_STATION_AUTO_START;
            case 11:
               return INFO_CHANGE_INITIATOR_STATION_AUTO_START_RANDOM;
            case 12:
               return INFO_CHANGE_INITIATOR_START_STATION_RANDOM;
            case 13:
               return INFO_CHANGE_INITIATOR_INACTIVE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<BroadcastRadioInfoChangeRequest.InfoChangeInitiator> internalGetValueMap() {
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
         return BroadcastRadioInfoChangeRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static BroadcastRadioInfoChangeRequest.InfoChangeInitiator valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      InfoChangeInitiator(int var3) {
         this.value = var3;
      }
   }

   public enum InfoChangeInitiatorSource implements ProtocolMessageEnum {
      INFO_CHANGE_INITIATOR_SOURCE_UNSPECIFIED(0),
      INFO_CHANGE_INITIATOR_SOURCE_GAME(1),
      INFO_CHANGE_INITIATOR_SOURCE_LAUNCHER(2),
      UNRECOGNIZED(-1);

      public static final int INFO_CHANGE_INITIATOR_SOURCE_UNSPECIFIED_VALUE = 0;
      public static final int INFO_CHANGE_INITIATOR_SOURCE_GAME_VALUE = 1;
      public static final int INFO_CHANGE_INITIATOR_SOURCE_LAUNCHER_VALUE = 2;
      private static final Internal.EnumLiteMap<BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource> internalValueMap = new Internal.EnumLiteMap<BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource>() {
         public BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource findValueByNumber(int var1) {
            return BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource.forNumber(var1);
         }
      };
      private static final BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource[] VALUES = values();
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
      public static BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource valueOf(int var0) {
         return forNumber(var0);
      }

      public static BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource forNumber(int var0) {
         switch (var0) {
            case 0:
               return INFO_CHANGE_INITIATOR_SOURCE_UNSPECIFIED;
            case 1:
               return INFO_CHANGE_INITIATOR_SOURCE_GAME;
            case 2:
               return INFO_CHANGE_INITIATOR_SOURCE_LAUNCHER;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource> internalGetValueMap() {
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
         return BroadcastRadioInfoChangeRequest.getDescriptor().getEnumTypes().get(1);
      }

      public static BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      InfoChangeInitiatorSource(int var3) {
         this.value = var3;
      }
   }
}
