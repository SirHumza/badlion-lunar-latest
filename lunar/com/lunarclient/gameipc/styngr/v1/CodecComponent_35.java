package com.lunarclient.gameipc.styngr.v1;

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

public final class StyngrTrackProgressUpdate extends GeneratedMessageV3 implements StyngrTrackProgressUpdateOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int DURATION_FIELD_NUMBER = 1;
   private float duration_ = 0.0F;
   public static final int POSITION_FIELD_NUMBER = 2;
   private float position_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final StyngrTrackProgressUpdate DEFAULT_INSTANCE = new StyngrTrackProgressUpdate();
   private static final Parser<StyngrTrackProgressUpdate> PARSER = new AbstractParser<StyngrTrackProgressUpdate>() {
      public StyngrTrackProgressUpdate parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StyngrTrackProgressUpdate.Builder var3 = StyngrTrackProgressUpdate.newBuilder();

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

   private StyngrTrackProgressUpdate(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StyngrTrackProgressUpdate() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StyngrTrackProgressUpdate();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StyngrTrackProgressUpdate.class, StyngrTrackProgressUpdate.Builder.class);
   }

   @Override
   public float getDuration() {
      return this.duration_;
   }

   @Override
   public float getPosition() {
      return this.position_;
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
      if (Float.floatToRawIntBits(this.duration_) != 0) {
         var1.writeFloat(1, this.duration_);
      }

      if (Float.floatToRawIntBits(this.position_) != 0) {
         var1.writeFloat(2, this.position_);
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
      if (Float.floatToRawIntBits(this.duration_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.duration_);
      }

      if (Float.floatToRawIntBits(this.position_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.position_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StyngrTrackProgressUpdate)) {
         return super.equals(var1);
      } else {
         StyngrTrackProgressUpdate var2 = (StyngrTrackProgressUpdate)var1;
         if (Float.floatToIntBits(this.getDuration()) != Float.floatToIntBits(var2.getDuration())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getPosition()) != Float.floatToIntBits(var2.getPosition())
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
      var1 = 53 * var1 + Float.floatToIntBits(this.getDuration());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Float.floatToIntBits(this.getPosition());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StyngrTrackProgressUpdate parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackProgressUpdate parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackProgressUpdate parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackProgressUpdate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackProgressUpdate parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackProgressUpdate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackProgressUpdate parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackProgressUpdate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackProgressUpdate parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StyngrTrackProgressUpdate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackProgressUpdate parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackProgressUpdate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StyngrTrackProgressUpdate.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StyngrTrackProgressUpdate.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StyngrTrackProgressUpdate.Builder newBuilder(StyngrTrackProgressUpdate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StyngrTrackProgressUpdate.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StyngrTrackProgressUpdate.Builder() : new StyngrTrackProgressUpdate.Builder().mergeFrom(this);
   }

   protected StyngrTrackProgressUpdate.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StyngrTrackProgressUpdate.Builder(var1);
   }

   public static StyngrTrackProgressUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StyngrTrackProgressUpdate> parser() {
      return PARSER;
   }

   @Override
   public Parser<StyngrTrackProgressUpdate> getParserForType() {
      return PARSER;
   }

   public StyngrTrackProgressUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StyngrTrackProgressUpdate.Builder> implements StyngrTrackProgressUpdateOrBuilder {
      private int bitField0_;
      private float duration_;
      private float position_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StyngrTrackProgressUpdate.class, StyngrTrackProgressUpdate.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StyngrTrackProgressUpdate.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.duration_ = 0.0F;
         this.position_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackProgressUpdate_descriptor;
      }

      public StyngrTrackProgressUpdate getDefaultInstanceForType() {
         return StyngrTrackProgressUpdate.getDefaultInstance();
      }

      public StyngrTrackProgressUpdate build() {
         StyngrTrackProgressUpdate var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StyngrTrackProgressUpdate buildPartial() {
         StyngrTrackProgressUpdate var1 = new StyngrTrackProgressUpdate(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StyngrTrackProgressUpdate var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.duration_ = this.duration_;
         }

         if ((var2 & 2) != 0) {
            var1.position_ = this.position_;
         }
      }

      public StyngrTrackProgressUpdate.Builder clone() {
         return (StyngrTrackProgressUpdate.Builder)super.clone();
      }

      public StyngrTrackProgressUpdate.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackProgressUpdate.Builder)super.setField(var1, var2);
      }

      public StyngrTrackProgressUpdate.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StyngrTrackProgressUpdate.Builder)super.clearField(var1);
      }

      public StyngrTrackProgressUpdate.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StyngrTrackProgressUpdate.Builder)super.clearOneof(var1);
      }

      public StyngrTrackProgressUpdate.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StyngrTrackProgressUpdate.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StyngrTrackProgressUpdate.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackProgressUpdate.Builder)super.addRepeatedField(var1, var2);
      }

      public StyngrTrackProgressUpdate.Builder mergeFrom(Message var1) {
         if (var1 instanceof StyngrTrackProgressUpdate) {
            return this.mergeFrom((StyngrTrackProgressUpdate)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StyngrTrackProgressUpdate.Builder mergeFrom(StyngrTrackProgressUpdate var1) {
         if (var1 == StyngrTrackProgressUpdate.getDefaultInstance()) {
            return this;
         }

         if (var1.getDuration() != 0.0F) {
            this.setDuration(var1.getDuration());
         }

         if (var1.getPosition() != 0.0F) {
            this.setPosition(var1.getPosition());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public StyngrTrackProgressUpdate.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.duration_ = var1.readFloat();
                     this.bitField0_ |= 1;
                     break;
                  case 21:
                     this.position_ = var1.readFloat();
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
      public float getDuration() {
         return this.duration_;
      }

      public StyngrTrackProgressUpdate.Builder setDuration(float var1) {
         this.duration_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StyngrTrackProgressUpdate.Builder clearDuration() {
         this.bitField0_ &= -2;
         this.duration_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getPosition() {
         return this.position_;
      }

      public StyngrTrackProgressUpdate.Builder setPosition(float var1) {
         this.position_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StyngrTrackProgressUpdate.Builder clearPosition() {
         this.bitField0_ &= -3;
         this.position_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final StyngrTrackProgressUpdate.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackProgressUpdate.Builder)super.setUnknownFields(var1);
      }

      public final StyngrTrackProgressUpdate.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackProgressUpdate.Builder)super.mergeUnknownFields(var1);
      }
   }
}
