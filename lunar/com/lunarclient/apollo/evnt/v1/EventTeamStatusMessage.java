package com.lunarclient.apollo.evnt.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EventTeamStatusMessage extends GeneratedMessageV3 implements EventTeamStatusMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TOP_WITHER_HEALTH_FIELD_NUMBER = 1;
   private float topWitherHealth_ = 0.0F;
   public static final int TOP_CRYSTAL_HEALTH_FIELD_NUMBER = 2;
   private float topCrystalHealth_ = 0.0F;
   public static final int MIDDLE_WITHER_HEALTH_FIELD_NUMBER = 3;
   private float middleWitherHealth_ = 0.0F;
   public static final int MIDDLE_CRYSTAL_HEALTH_FIELD_NUMBER = 4;
   private float middleCrystalHealth_ = 0.0F;
   public static final int BOTTOM_WITHER_HEALTH_FIELD_NUMBER = 5;
   private float bottomWitherHealth_ = 0.0F;
   public static final int BOTTOM_CRYSTAL_HEALTH_FIELD_NUMBER = 6;
   private float bottomCrystalHealth_ = 0.0F;
   public static final int DRAGON_HEALTH_FIELD_NUMBER = 7;
   private float dragonHealth_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final EventTeamStatusMessage DEFAULT_INSTANCE = new EventTeamStatusMessage();
   private static final Parser<EventTeamStatusMessage> PARSER = new AbstractParser<EventTeamStatusMessage>() {
      public EventTeamStatusMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EventTeamStatusMessage.Builder var3 = EventTeamStatusMessage.newBuilder();

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

   private EventTeamStatusMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EventTeamStatusMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EventTeamStatusMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EventTeamStatusMessage.class, EventTeamStatusMessage.Builder.class);
   }

   @Override
   public float getTopWitherHealth() {
      return this.topWitherHealth_;
   }

   @Override
   public float getTopCrystalHealth() {
      return this.topCrystalHealth_;
   }

   @Override
   public float getMiddleWitherHealth() {
      return this.middleWitherHealth_;
   }

   @Override
   public float getMiddleCrystalHealth() {
      return this.middleCrystalHealth_;
   }

   @Override
   public float getBottomWitherHealth() {
      return this.bottomWitherHealth_;
   }

   @Override
   public float getBottomCrystalHealth() {
      return this.bottomCrystalHealth_;
   }

   @Override
   public float getDragonHealth() {
      return this.dragonHealth_;
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
      if (Float.floatToRawIntBits(this.topWitherHealth_) != 0) {
         var1.writeFloat(1, this.topWitherHealth_);
      }

      if (Float.floatToRawIntBits(this.topCrystalHealth_) != 0) {
         var1.writeFloat(2, this.topCrystalHealth_);
      }

      if (Float.floatToRawIntBits(this.middleWitherHealth_) != 0) {
         var1.writeFloat(3, this.middleWitherHealth_);
      }

      if (Float.floatToRawIntBits(this.middleCrystalHealth_) != 0) {
         var1.writeFloat(4, this.middleCrystalHealth_);
      }

      if (Float.floatToRawIntBits(this.bottomWitherHealth_) != 0) {
         var1.writeFloat(5, this.bottomWitherHealth_);
      }

      if (Float.floatToRawIntBits(this.bottomCrystalHealth_) != 0) {
         var1.writeFloat(6, this.bottomCrystalHealth_);
      }

      if (Float.floatToRawIntBits(this.dragonHealth_) != 0) {
         var1.writeFloat(7, this.dragonHealth_);
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
      if (Float.floatToRawIntBits(this.topWitherHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.topWitherHealth_);
      }

      if (Float.floatToRawIntBits(this.topCrystalHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.topCrystalHealth_);
      }

      if (Float.floatToRawIntBits(this.middleWitherHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.middleWitherHealth_);
      }

      if (Float.floatToRawIntBits(this.middleCrystalHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(4, this.middleCrystalHealth_);
      }

      if (Float.floatToRawIntBits(this.bottomWitherHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(5, this.bottomWitherHealth_);
      }

      if (Float.floatToRawIntBits(this.bottomCrystalHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(6, this.bottomCrystalHealth_);
      }

      if (Float.floatToRawIntBits(this.dragonHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(7, this.dragonHealth_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EventTeamStatusMessage)) {
         return super.equals(var1);
      } else {
         EventTeamStatusMessage var2 = (EventTeamStatusMessage)var1;
         if (Float.floatToIntBits(this.getTopWitherHealth()) != Float.floatToIntBits(var2.getTopWitherHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getTopCrystalHealth()) != Float.floatToIntBits(var2.getTopCrystalHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getMiddleWitherHealth()) != Float.floatToIntBits(var2.getMiddleWitherHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getMiddleCrystalHealth()) != Float.floatToIntBits(var2.getMiddleCrystalHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getBottomWitherHealth()) != Float.floatToIntBits(var2.getBottomWitherHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getBottomCrystalHealth()) != Float.floatToIntBits(var2.getBottomCrystalHealth())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getDragonHealth()) != Float.floatToIntBits(var2.getDragonHealth())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Float.floatToIntBits(this.getTopWitherHealth());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getTopCrystalHealth());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getMiddleWitherHealth());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Float.floatToIntBits(this.getMiddleCrystalHealth());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Float.floatToIntBits(this.getBottomWitherHealth());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Float.floatToIntBits(this.getBottomCrystalHealth());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Float.floatToIntBits(this.getDragonHealth());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EventTeamStatusMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventTeamStatusMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventTeamStatusMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventTeamStatusMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventTeamStatusMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventTeamStatusMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventTeamStatusMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventTeamStatusMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EventTeamStatusMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EventTeamStatusMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EventTeamStatusMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventTeamStatusMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EventTeamStatusMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EventTeamStatusMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EventTeamStatusMessage.Builder newBuilder(EventTeamStatusMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EventTeamStatusMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EventTeamStatusMessage.Builder() : new EventTeamStatusMessage.Builder().mergeFrom(this);
   }

   protected EventTeamStatusMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EventTeamStatusMessage.Builder(var1);
   }

   public static EventTeamStatusMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EventTeamStatusMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EventTeamStatusMessage> getParserForType() {
      return PARSER;
   }

   public EventTeamStatusMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EventTeamStatusMessage.Builder> implements EventTeamStatusMessageOrBuilder {
      private int bitField0_;
      private float topWitherHealth_;
      private float topCrystalHealth_;
      private float middleWitherHealth_;
      private float middleCrystalHealth_;
      private float bottomWitherHealth_;
      private float bottomCrystalHealth_;
      private float dragonHealth_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EventTeamStatusMessage.class, EventTeamStatusMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EventTeamStatusMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.topWitherHealth_ = 0.0F;
         this.topCrystalHealth_ = 0.0F;
         this.middleWitherHealth_ = 0.0F;
         this.middleCrystalHealth_ = 0.0F;
         this.bottomWitherHealth_ = 0.0F;
         this.bottomCrystalHealth_ = 0.0F;
         this.dragonHealth_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_descriptor;
      }

      public EventTeamStatusMessage getDefaultInstanceForType() {
         return EventTeamStatusMessage.getDefaultInstance();
      }

      public EventTeamStatusMessage build() {
         EventTeamStatusMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EventTeamStatusMessage buildPartial() {
         EventTeamStatusMessage var1 = new EventTeamStatusMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EventTeamStatusMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.topWitherHealth_ = this.topWitherHealth_;
         }

         if ((var2 & 2) != 0) {
            var1.topCrystalHealth_ = this.topCrystalHealth_;
         }

         if ((var2 & 4) != 0) {
            var1.middleWitherHealth_ = this.middleWitherHealth_;
         }

         if ((var2 & 8) != 0) {
            var1.middleCrystalHealth_ = this.middleCrystalHealth_;
         }

         if ((var2 & 16) != 0) {
            var1.bottomWitherHealth_ = this.bottomWitherHealth_;
         }

         if ((var2 & 32) != 0) {
            var1.bottomCrystalHealth_ = this.bottomCrystalHealth_;
         }

         if ((var2 & 64) != 0) {
            var1.dragonHealth_ = this.dragonHealth_;
         }
      }

      public EventTeamStatusMessage.Builder clone() {
         return (EventTeamStatusMessage.Builder)super.clone();
      }

      public EventTeamStatusMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventTeamStatusMessage.Builder)super.setField(var1, var2);
      }

      public EventTeamStatusMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EventTeamStatusMessage.Builder)super.clearField(var1);
      }

      public EventTeamStatusMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EventTeamStatusMessage.Builder)super.clearOneof(var1);
      }

      public EventTeamStatusMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EventTeamStatusMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EventTeamStatusMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventTeamStatusMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EventTeamStatusMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EventTeamStatusMessage) {
            return this.mergeFrom((EventTeamStatusMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EventTeamStatusMessage.Builder mergeFrom(EventTeamStatusMessage var1) {
         if (var1 == EventTeamStatusMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getTopWitherHealth() != 0.0F) {
            this.setTopWitherHealth(var1.getTopWitherHealth());
         }

         if (var1.getTopCrystalHealth() != 0.0F) {
            this.setTopCrystalHealth(var1.getTopCrystalHealth());
         }

         if (var1.getMiddleWitherHealth() != 0.0F) {
            this.setMiddleWitherHealth(var1.getMiddleWitherHealth());
         }

         if (var1.getMiddleCrystalHealth() != 0.0F) {
            this.setMiddleCrystalHealth(var1.getMiddleCrystalHealth());
         }

         if (var1.getBottomWitherHealth() != 0.0F) {
            this.setBottomWitherHealth(var1.getBottomWitherHealth());
         }

         if (var1.getBottomCrystalHealth() != 0.0F) {
            this.setBottomCrystalHealth(var1.getBottomCrystalHealth());
         }

         if (var1.getDragonHealth() != 0.0F) {
            this.setDragonHealth(var1.getDragonHealth());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EventTeamStatusMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 13:
                     this.topWitherHealth_ = var1.readFloat();
                     this.bitField0_ |= 1;
                     break;
                  case 21:
                     this.topCrystalHealth_ = var1.readFloat();
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.middleWitherHealth_ = var1.readFloat();
                     this.bitField0_ |= 4;
                     break;
                  case 37:
                     this.middleCrystalHealth_ = var1.readFloat();
                     this.bitField0_ |= 8;
                     break;
                  case 45:
                     this.bottomWitherHealth_ = var1.readFloat();
                     this.bitField0_ |= 16;
                     break;
                  case 53:
                     this.bottomCrystalHealth_ = var1.readFloat();
                     this.bitField0_ |= 32;
                     break;
                  case 61:
                     this.dragonHealth_ = var1.readFloat();
                     this.bitField0_ |= 64;
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
      public float getTopWitherHealth() {
         return this.topWitherHealth_;
      }

      public EventTeamStatusMessage.Builder setTopWitherHealth(float var1) {
         this.topWitherHealth_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearTopWitherHealth() {
         this.bitField0_ &= -2;
         this.topWitherHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getTopCrystalHealth() {
         return this.topCrystalHealth_;
      }

      public EventTeamStatusMessage.Builder setTopCrystalHealth(float var1) {
         this.topCrystalHealth_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearTopCrystalHealth() {
         this.bitField0_ &= -3;
         this.topCrystalHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getMiddleWitherHealth() {
         return this.middleWitherHealth_;
      }

      public EventTeamStatusMessage.Builder setMiddleWitherHealth(float var1) {
         this.middleWitherHealth_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearMiddleWitherHealth() {
         this.bitField0_ &= -5;
         this.middleWitherHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getMiddleCrystalHealth() {
         return this.middleCrystalHealth_;
      }

      public EventTeamStatusMessage.Builder setMiddleCrystalHealth(float var1) {
         this.middleCrystalHealth_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearMiddleCrystalHealth() {
         this.bitField0_ &= -9;
         this.middleCrystalHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getBottomWitherHealth() {
         return this.bottomWitherHealth_;
      }

      public EventTeamStatusMessage.Builder setBottomWitherHealth(float var1) {
         this.bottomWitherHealth_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearBottomWitherHealth() {
         this.bitField0_ &= -17;
         this.bottomWitherHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getBottomCrystalHealth() {
         return this.bottomCrystalHealth_;
      }

      public EventTeamStatusMessage.Builder setBottomCrystalHealth(float var1) {
         this.bottomCrystalHealth_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearBottomCrystalHealth() {
         this.bitField0_ &= -33;
         this.bottomCrystalHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getDragonHealth() {
         return this.dragonHealth_;
      }

      public EventTeamStatusMessage.Builder setDragonHealth(float var1) {
         this.dragonHealth_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder clearDragonHealth() {
         this.bitField0_ &= -65;
         this.dragonHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final EventTeamStatusMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EventTeamStatusMessage.Builder)super.setUnknownFields(var1);
      }

      public final EventTeamStatusMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EventTeamStatusMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
