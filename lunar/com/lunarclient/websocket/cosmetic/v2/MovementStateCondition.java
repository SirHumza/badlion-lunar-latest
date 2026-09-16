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

public final class MovementStateCondition extends GeneratedMessageV3 implements MovementStateConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATE_FIELD_NUMBER = 1;
   private int state_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final MovementStateCondition DEFAULT_INSTANCE = new MovementStateCondition();
   private static final Parser<MovementStateCondition> PARSER = new AbstractParser<MovementStateCondition>() {
      public MovementStateCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MovementStateCondition.Builder var3 = MovementStateCondition.newBuilder();

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

   private MovementStateCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MovementStateCondition() {
      this.state_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MovementStateCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MovementStateCondition.class, MovementStateCondition.Builder.class);
   }

   @Override
   public int getStateValue() {
      return this.state_;
   }

   @Override
   public MovementStateCondition.State getState() {
      MovementStateCondition.State var1 = MovementStateCondition.State.forNumber(this.state_);
      return var1 == null ? MovementStateCondition.State.UNRECOGNIZED : var1;
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
      if (this.state_ != MovementStateCondition.State.STATE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.state_);
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
      if (this.state_ != MovementStateCondition.State.STATE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.state_);
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

      if (!(var1 instanceof MovementStateCondition)) {
         return super.equals(var1);
      }

      MovementStateCondition var2 = (MovementStateCondition)var1;
      return this.state_ != var2.state_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.state_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MovementStateCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MovementStateCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MovementStateCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MovementStateCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MovementStateCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MovementStateCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MovementStateCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MovementStateCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MovementStateCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MovementStateCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MovementStateCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MovementStateCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MovementStateCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MovementStateCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MovementStateCondition.Builder newBuilder(MovementStateCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MovementStateCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MovementStateCondition.Builder() : new MovementStateCondition.Builder().mergeFrom(this);
   }

   protected MovementStateCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MovementStateCondition.Builder(var1);
   }

   public static MovementStateCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MovementStateCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<MovementStateCondition> getParserForType() {
      return PARSER;
   }

   public MovementStateCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MovementStateCondition.Builder> implements MovementStateConditionOrBuilder {
      private int bitField0_;
      private int state_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MovementStateCondition.class, MovementStateCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MovementStateCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.state_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_MovementStateCondition_descriptor;
      }

      public MovementStateCondition getDefaultInstanceForType() {
         return MovementStateCondition.getDefaultInstance();
      }

      public MovementStateCondition build() {
         MovementStateCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MovementStateCondition buildPartial() {
         MovementStateCondition var1 = new MovementStateCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MovementStateCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.state_ = this.state_;
         }
      }

      public MovementStateCondition.Builder clone() {
         return (MovementStateCondition.Builder)super.clone();
      }

      public MovementStateCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MovementStateCondition.Builder)super.setField(var1, var2);
      }

      public MovementStateCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MovementStateCondition.Builder)super.clearField(var1);
      }

      public MovementStateCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MovementStateCondition.Builder)super.clearOneof(var1);
      }

      public MovementStateCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MovementStateCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MovementStateCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MovementStateCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public MovementStateCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof MovementStateCondition) {
            return this.mergeFrom((MovementStateCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MovementStateCondition.Builder mergeFrom(MovementStateCondition var1) {
         if (var1 == MovementStateCondition.getDefaultInstance()) {
            return this;
         }

         if (var1.state_ != 0) {
            this.setStateValue(var1.getStateValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MovementStateCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.state_ = var1.readEnum();
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
      public int getStateValue() {
         return this.state_;
      }

      public MovementStateCondition.Builder setStateValue(int var1) {
         this.state_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public MovementStateCondition.State getState() {
         MovementStateCondition.State var1 = MovementStateCondition.State.forNumber(this.state_);
         return var1 == null ? MovementStateCondition.State.UNRECOGNIZED : var1;
      }

      public MovementStateCondition.Builder setState(MovementStateCondition.State var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.state_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MovementStateCondition.Builder clearState() {
         this.bitField0_ &= -2;
         this.state_ = 0;
         this.onChanged();
         return this;
      }

      public final MovementStateCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MovementStateCondition.Builder)super.setUnknownFields(var1);
      }

      public final MovementStateCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MovementStateCondition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum State implements ProtocolMessageEnum {
      STATE_UNSPECIFIED(0),
      STATE_SWIMMING(1),
      STATE_CREATIVE_FLYING(2),
      STATE_ELYTRA_FLYING(3),
      UNRECOGNIZED(-1);

      public static final int STATE_UNSPECIFIED_VALUE = 0;
      public static final int STATE_SWIMMING_VALUE = 1;
      public static final int STATE_CREATIVE_FLYING_VALUE = 2;
      public static final int STATE_ELYTRA_FLYING_VALUE = 3;
      private static final Internal.EnumLiteMap<MovementStateCondition.State> internalValueMap = new Internal.EnumLiteMap<MovementStateCondition.State>() {
         public MovementStateCondition.State findValueByNumber(int var1) {
            return MovementStateCondition.State.forNumber(var1);
         }
      };
      private static final MovementStateCondition.State[] VALUES = values();
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
      public static MovementStateCondition.State valueOf(int var0) {
         return forNumber(var0);
      }

      public static MovementStateCondition.State forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATE_UNSPECIFIED;
            case 1:
               return STATE_SWIMMING;
            case 2:
               return STATE_CREATIVE_FLYING;
            case 3:
               return STATE_ELYTRA_FLYING;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<MovementStateCondition.State> internalGetValueMap() {
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
         return MovementStateCondition.getDescriptor().getEnumTypes().get(0);
      }

      public static MovementStateCondition.State valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      State(int var3) {
         this.value = var3;
      }
   }
}
