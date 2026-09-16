package com.lunarclient.websocket.cosmetic.v2;

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

public final class TimeCondition extends GeneratedMessageV3 implements TimeConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TIME_FIELD_NUMBER = 1;
   private int time_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final TimeCondition DEFAULT_INSTANCE = new TimeCondition();
   private static final Parser<TimeCondition> PARSER = new AbstractParser<TimeCondition>() {
      public TimeCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TimeCondition.Builder var3 = TimeCondition.newBuilder();

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

   private TimeCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TimeCondition() {
      this.time_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TimeCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TimeCondition.class, TimeCondition.Builder.class);
   }

   @Override
   public int getTimeValue() {
      return this.time_;
   }

   @Override
   public TimeCondition.Time getTime() {
      TimeCondition.Time var1 = TimeCondition.Time.forNumber(this.time_);
      return var1 == null ? TimeCondition.Time.UNRECOGNIZED : var1;
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
      if (this.time_ != TimeCondition.Time.TIME_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.time_);
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
      if (this.time_ != TimeCondition.Time.TIME_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.time_);
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

      if (!(var1 instanceof TimeCondition)) {
         return super.equals(var1);
      }

      TimeCondition var2 = (TimeCondition)var1;
      return this.time_ != var2.time_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.time_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static TimeCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TimeCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TimeCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TimeCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TimeCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TimeCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TimeCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TimeCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TimeCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TimeCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TimeCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TimeCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TimeCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TimeCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TimeCondition.Builder newBuilder(TimeCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TimeCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TimeCondition.Builder() : new TimeCondition.Builder().mergeFrom(this);
   }

   protected TimeCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TimeCondition.Builder(var1);
   }

   public static TimeCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TimeCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<TimeCondition> getParserForType() {
      return PARSER;
   }

   public TimeCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TimeCondition.Builder> implements TimeConditionOrBuilder {
      private int bitField0_;
      private int time_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TimeCondition.class, TimeCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TimeCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.time_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_TimeCondition_descriptor;
      }

      public TimeCondition getDefaultInstanceForType() {
         return TimeCondition.getDefaultInstance();
      }

      public TimeCondition build() {
         TimeCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TimeCondition buildPartial() {
         TimeCondition var1 = new TimeCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(TimeCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.time_ = this.time_;
         }
      }

      public TimeCondition.Builder clone() {
         return (TimeCondition.Builder)super.clone();
      }

      public TimeCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TimeCondition.Builder)super.setField(var1, var2);
      }

      public TimeCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TimeCondition.Builder)super.clearField(var1);
      }

      public TimeCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TimeCondition.Builder)super.clearOneof(var1);
      }

      public TimeCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TimeCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TimeCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TimeCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public TimeCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof TimeCondition) {
            return this.mergeFrom((TimeCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TimeCondition.Builder mergeFrom(TimeCondition var1) {
         if (var1 == TimeCondition.getDefaultInstance()) {
            return this;
         }

         if (var1.time_ != 0) {
            this.setTimeValue(var1.getTimeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public TimeCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.time_ = var1.readEnum();
                     this.bitField0_ |= 1;
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
      public int getTimeValue() {
         return this.time_;
      }

      public TimeCondition.Builder setTimeValue(int var1) {
         this.time_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public TimeCondition.Time getTime() {
         TimeCondition.Time var1 = TimeCondition.Time.forNumber(this.time_);
         return var1 == null ? TimeCondition.Time.UNRECOGNIZED : var1;
      }

      public TimeCondition.Builder setTime(TimeCondition.Time var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.time_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public TimeCondition.Builder clearTime() {
         this.bitField0_ &= -2;
         this.time_ = 0;
         this.onChanged();
         return this;
      }

      public final TimeCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TimeCondition.Builder)super.setUnknownFields(var1);
      }

      public final TimeCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TimeCondition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Time implements ProtocolMessageEnum {
      TIME_UNSPECIFIED(0),
      TIME_DAY(1),
      TIME_NIGHT(2),
      UNRECOGNIZED(-1);

      public static final int TIME_UNSPECIFIED_VALUE = 0;
      public static final int TIME_DAY_VALUE = 1;
      public static final int TIME_NIGHT_VALUE = 2;
      private static final Internal.EnumLiteMap<TimeCondition.Time> internalValueMap = new Internal.EnumLiteMap<TimeCondition.Time>() {
         public TimeCondition.Time findValueByNumber(int var1) {
            return TimeCondition.Time.forNumber(var1);
         }
      };
      private static final TimeCondition.Time[] VALUES = values();
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
      public static TimeCondition.Time valueOf(int var0) {
         return forNumber(var0);
      }

      public static TimeCondition.Time forNumber(int var0) {
         switch (var0) {
            case 0:
               return TIME_UNSPECIFIED;
            case 1:
               return TIME_DAY;
            case 2:
               return TIME_NIGHT;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<TimeCondition.Time> internalGetValueMap() {
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
         return TimeCondition.getDescriptor().getEnumTypes().get(0);
      }

      public static TimeCondition.Time valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Time(int var3) {
         this.value = var3;
      }
   }
}
