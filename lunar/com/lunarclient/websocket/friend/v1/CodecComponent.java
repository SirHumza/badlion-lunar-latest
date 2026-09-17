package com.lunarclient.websocket.friend.v1;

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
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundLocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BroadcastLocationChangeRequest extends GeneratedMessageV3 implements BroadcastLocationChangeRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NEW_LOCATION_FIELD_NUMBER = 1;
   private InboundLocation newLocation_;
   public static final int TRIGGER_FIELD_NUMBER = 2;
   private int trigger_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastLocationChangeRequest DEFAULT_INSTANCE = new BroadcastLocationChangeRequest();
   private static final Parser<BroadcastLocationChangeRequest> PARSER = new AbstractParser<BroadcastLocationChangeRequest>() {
      public BroadcastLocationChangeRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastLocationChangeRequest.Builder var3 = BroadcastLocationChangeRequest.newBuilder();

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

   private BroadcastLocationChangeRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastLocationChangeRequest() {
      this.trigger_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastLocationChangeRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastLocationChangeRequest.class, BroadcastLocationChangeRequest.Builder.class);
   }

   @Override
   public boolean hasNewLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public InboundLocation getNewLocation() {
      return this.newLocation_ == null ? InboundLocation.getDefaultInstance() : this.newLocation_;
   }

   @Override
   public InboundLocationOrBuilder getNewLocationOrBuilder() {
      return this.newLocation_ == null ? InboundLocation.getDefaultInstance() : this.newLocation_;
   }

   @Override
   public int getTriggerValue() {
      return this.trigger_;
   }

   @Override
   public BroadcastLocationChangeRequest.Trigger getTrigger() {
      BroadcastLocationChangeRequest.Trigger var1 = BroadcastLocationChangeRequest.Trigger.forNumber(this.trigger_);
      return var1 == null ? BroadcastLocationChangeRequest.Trigger.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getNewLocation());
      }

      if (this.trigger_ != BroadcastLocationChangeRequest.Trigger.TRIGGER_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.trigger_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNewLocation());
      }

      if (this.trigger_ != BroadcastLocationChangeRequest.Trigger.TRIGGER_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.trigger_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BroadcastLocationChangeRequest)) {
         return super.equals(var1);
      } else {
         BroadcastLocationChangeRequest var2 = (BroadcastLocationChangeRequest)var1;
         if (this.hasNewLocation() != var2.hasNewLocation()) {
            return false;
         } else if (this.hasNewLocation() && !this.getNewLocation().equals(var2.getNewLocation())) {
            return false;
         } else {
            return this.trigger_ != var2.trigger_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasNewLocation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNewLocation().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.trigger_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastLocationChangeRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastLocationChangeRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastLocationChangeRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastLocationChangeRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastLocationChangeRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastLocationChangeRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastLocationChangeRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastLocationChangeRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastLocationChangeRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastLocationChangeRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastLocationChangeRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastLocationChangeRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastLocationChangeRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastLocationChangeRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastLocationChangeRequest.Builder newBuilder(BroadcastLocationChangeRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastLocationChangeRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastLocationChangeRequest.Builder() : new BroadcastLocationChangeRequest.Builder().mergeFrom(this);
   }

   protected BroadcastLocationChangeRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastLocationChangeRequest.Builder(var1);
   }

   public static BroadcastLocationChangeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastLocationChangeRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastLocationChangeRequest> getParserForType() {
      return PARSER;
   }

   public BroadcastLocationChangeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastLocationChangeRequest.Builder>
      implements BroadcastLocationChangeRequestOrBuilder {
      private int bitField0_;
      private InboundLocation newLocation_;
      private SingleFieldBuilderV3<InboundLocation, InboundLocation.Builder, InboundLocationOrBuilder> newLocationBuilder_;
      private int trigger_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastLocationChangeRequest.class, BroadcastLocationChangeRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BroadcastLocationChangeRequest.alwaysUseFieldBuilders) {
            this.getNewLocationFieldBuilder();
         }
      }

      public BroadcastLocationChangeRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newLocation_ = null;
         if (this.newLocationBuilder_ != null) {
            this.newLocationBuilder_.dispose();
            this.newLocationBuilder_ = null;
         }

         this.trigger_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_descriptor;
      }

      public BroadcastLocationChangeRequest getDefaultInstanceForType() {
         return BroadcastLocationChangeRequest.getDefaultInstance();
      }

      public BroadcastLocationChangeRequest build() {
         BroadcastLocationChangeRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastLocationChangeRequest buildPartial() {
         BroadcastLocationChangeRequest var1 = new BroadcastLocationChangeRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BroadcastLocationChangeRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.newLocation_ = this.newLocationBuilder_ == null ? this.newLocation_ : this.newLocationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.trigger_ = this.trigger_;
         }

         BroadcastLocationChangeRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BroadcastLocationChangeRequest.Builder clone() {
         return (BroadcastLocationChangeRequest.Builder)super.clone();
      }

      public BroadcastLocationChangeRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastLocationChangeRequest.Builder)super.setField(var1, var2);
      }

      public BroadcastLocationChangeRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastLocationChangeRequest.Builder)super.clearField(var1);
      }

      public BroadcastLocationChangeRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastLocationChangeRequest.Builder)super.clearOneof(var1);
      }

      public BroadcastLocationChangeRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastLocationChangeRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastLocationChangeRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastLocationChangeRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastLocationChangeRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastLocationChangeRequest) {
            return this.mergeFrom((BroadcastLocationChangeRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastLocationChangeRequest.Builder mergeFrom(BroadcastLocationChangeRequest var1) {
         if (var1 == BroadcastLocationChangeRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNewLocation()) {
            this.mergeNewLocation(var1.getNewLocation());
         }

         if (var1.trigger_ != 0) {
            this.setTriggerValue(var1.getTriggerValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastLocationChangeRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNewLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.trigger_ = var1.readEnum();
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
      public boolean hasNewLocation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public InboundLocation getNewLocation() {
         if (this.newLocationBuilder_ == null) {
            return this.newLocation_ == null ? InboundLocation.getDefaultInstance() : this.newLocation_;
         } else {
            return this.newLocationBuilder_.getMessage();
         }
      }

      public BroadcastLocationChangeRequest.Builder setNewLocation(InboundLocation var1) {
         if (this.newLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newLocation_ = var1;
         } else {
            this.newLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastLocationChangeRequest.Builder setNewLocation(InboundLocation.Builder var1) {
         if (this.newLocationBuilder_ == null) {
            this.newLocation_ = var1.build();
         } else {
            this.newLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastLocationChangeRequest.Builder mergeNewLocation(InboundLocation var1) {
         if (this.newLocationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.newLocation_ != null && this.newLocation_ != InboundLocation.getDefaultInstance()) {
               this.getNewLocationBuilder().mergeFrom(var1);
            } else {
               this.newLocation_ = var1;
            }
         } else {
            this.newLocationBuilder_.mergeFrom(var1);
         }

         if (this.newLocation_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BroadcastLocationChangeRequest.Builder clearNewLocation() {
         this.bitField0_ &= -2;
         this.newLocation_ = null;
         if (this.newLocationBuilder_ != null) {
            this.newLocationBuilder_.dispose();
            this.newLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundLocation.Builder getNewLocationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNewLocationFieldBuilder().getBuilder();
      }

      @Override
      public InboundLocationOrBuilder getNewLocationOrBuilder() {
         if (this.newLocationBuilder_ != null) {
            return this.newLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.newLocation_ == null ? InboundLocation.getDefaultInstance() : this.newLocation_;
         }
      }

      private SingleFieldBuilderV3<InboundLocation, InboundLocation.Builder, InboundLocationOrBuilder> getNewLocationFieldBuilder() {
         if (this.newLocationBuilder_ == null) {
            this.newLocationBuilder_ = new SingleFieldBuilderV3<>(this.getNewLocation(), this.getParentForChildren(), this.isClean());
            this.newLocation_ = null;
         }

         return this.newLocationBuilder_;
      }

      @Override
      public int getTriggerValue() {
         return this.trigger_;
      }

      public BroadcastLocationChangeRequest.Builder setTriggerValue(int var1) {
         this.trigger_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public BroadcastLocationChangeRequest.Trigger getTrigger() {
         BroadcastLocationChangeRequest.Trigger var1 = BroadcastLocationChangeRequest.Trigger.forNumber(this.trigger_);
         return var1 == null ? BroadcastLocationChangeRequest.Trigger.UNRECOGNIZED : var1;
      }

      public BroadcastLocationChangeRequest.Builder setTrigger(BroadcastLocationChangeRequest.Trigger var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.trigger_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public BroadcastLocationChangeRequest.Builder clearTrigger() {
         this.bitField0_ &= -3;
         this.trigger_ = 0;
         this.onChanged();
         return this;
      }

      public final BroadcastLocationChangeRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastLocationChangeRequest.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastLocationChangeRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastLocationChangeRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Trigger implements ProtocolMessageEnum {
      TRIGGER_UNSPECIFIED(0),
      TRIGGER_JOIN_EVENT(1),
      TRIGGER_DISCONNECT_EVENT(2),
      TRIGGER_HOSTED_WORLD_START(3),
      TRIGGER_HOSTED_WORLD_STOP(4),
      TRIGGER_SERVER_RICH_STATUS(5),
      UNRECOGNIZED(-1);

      public static final int TRIGGER_UNSPECIFIED_VALUE = 0;
      public static final int TRIGGER_JOIN_EVENT_VALUE = 1;
      public static final int TRIGGER_DISCONNECT_EVENT_VALUE = 2;
      public static final int TRIGGER_HOSTED_WORLD_START_VALUE = 3;
      public static final int TRIGGER_HOSTED_WORLD_STOP_VALUE = 4;
      public static final int TRIGGER_SERVER_RICH_STATUS_VALUE = 5;
      private static final Internal.EnumLiteMap<BroadcastLocationChangeRequest.Trigger> internalValueMap = new Internal.EnumLiteMap<BroadcastLocationChangeRequest.Trigger>() {
         public BroadcastLocationChangeRequest.Trigger findValueByNumber(int var1) {
            return BroadcastLocationChangeRequest.Trigger.forNumber(var1);
         }
      };
      private static final BroadcastLocationChangeRequest.Trigger[] VALUES = values();
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
      public static BroadcastLocationChangeRequest.Trigger valueOf(int var0) {
         return forNumber(var0);
      }

      public static BroadcastLocationChangeRequest.Trigger forNumber(int var0) {
         switch (var0) {
            case 0:
               return TRIGGER_UNSPECIFIED;
            case 1:
               return TRIGGER_JOIN_EVENT;
            case 2:
               return TRIGGER_DISCONNECT_EVENT;
            case 3:
               return TRIGGER_HOSTED_WORLD_START;
            case 4:
               return TRIGGER_HOSTED_WORLD_STOP;
            case 5:
               return TRIGGER_SERVER_RICH_STATUS;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<BroadcastLocationChangeRequest.Trigger> internalGetValueMap() {
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
         return BroadcastLocationChangeRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static BroadcastLocationChangeRequest.Trigger valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Trigger(int var3) {
         this.value = var3;
      }
   }
}
