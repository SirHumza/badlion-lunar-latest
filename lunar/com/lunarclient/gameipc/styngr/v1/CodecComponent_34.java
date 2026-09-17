package com.lunarclient.gameipc.styngr.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StyngrTrackControlsUpdate extends GeneratedMessageV3 implements StyngrTrackControlsUpdateOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYING_FIELD_NUMBER = 1;
   private boolean playing_ = false;
   public static final int MUTED_FIELD_NUMBER = 2;
   private boolean muted_ = false;
   public static final int VOLUME_FIELD_NUMBER = 3;
   private float volume_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final StyngrTrackControlsUpdate DEFAULT_INSTANCE = new StyngrTrackControlsUpdate();
   private static final Parser<StyngrTrackControlsUpdate> PARSER = new AbstractParser<StyngrTrackControlsUpdate>() {
      public StyngrTrackControlsUpdate parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StyngrTrackControlsUpdate.Builder var3 = StyngrTrackControlsUpdate.newBuilder();

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

   private StyngrTrackControlsUpdate(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StyngrTrackControlsUpdate() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StyngrTrackControlsUpdate();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StyngrTrackControlsUpdate.class, StyngrTrackControlsUpdate.Builder.class);
   }

   @Override
   public boolean getPlaying() {
      return this.playing_;
   }

   @Override
   public boolean getMuted() {
      return this.muted_;
   }

   @Override
   public float getVolume() {
      return this.volume_;
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
      if (this.playing_) {
         var1.writeBool(1, this.playing_);
      }

      if (this.muted_) {
         var1.writeBool(2, this.muted_);
      }

      if (Float.floatToRawIntBits(this.volume_) != 0) {
         var1.writeFloat(3, this.volume_);
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
      if (this.playing_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.playing_);
      }

      if (this.muted_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.muted_);
      }

      if (Float.floatToRawIntBits(this.volume_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.volume_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StyngrTrackControlsUpdate)) {
         return super.equals(var1);
      } else {
         StyngrTrackControlsUpdate var2 = (StyngrTrackControlsUpdate)var1;
         if (this.getPlaying() != var2.getPlaying()) {
            return false;
         } else if (this.getMuted() != var2.getMuted()) {
            return false;
         } else {
            return Float.floatToIntBits(this.getVolume()) != Float.floatToIntBits(var2.getVolume())
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getPlaying());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getMuted());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getVolume());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StyngrTrackControlsUpdate parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackControlsUpdate parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackControlsUpdate parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackControlsUpdate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackControlsUpdate parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackControlsUpdate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackControlsUpdate parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackControlsUpdate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackControlsUpdate parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StyngrTrackControlsUpdate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackControlsUpdate parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackControlsUpdate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StyngrTrackControlsUpdate.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StyngrTrackControlsUpdate.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StyngrTrackControlsUpdate.Builder newBuilder(StyngrTrackControlsUpdate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StyngrTrackControlsUpdate.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StyngrTrackControlsUpdate.Builder() : new StyngrTrackControlsUpdate.Builder().mergeFrom(this);
   }

   protected StyngrTrackControlsUpdate.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StyngrTrackControlsUpdate.Builder(var1);
   }

   public static StyngrTrackControlsUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StyngrTrackControlsUpdate> parser() {
      return PARSER;
   }

   @Override
   public Parser<StyngrTrackControlsUpdate> getParserForType() {
      return PARSER;
   }

   public StyngrTrackControlsUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StyngrTrackControlsUpdate.Builder> implements StyngrTrackControlsUpdateOrBuilder {
      private int bitField0_;
      private boolean playing_;
      private boolean muted_;
      private float volume_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StyngrTrackControlsUpdate.class, StyngrTrackControlsUpdate.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StyngrTrackControlsUpdate.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playing_ = false;
         this.muted_ = false;
         this.volume_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackControlsUpdate_descriptor;
      }

      public StyngrTrackControlsUpdate getDefaultInstanceForType() {
         return StyngrTrackControlsUpdate.getDefaultInstance();
      }

      public StyngrTrackControlsUpdate build() {
         StyngrTrackControlsUpdate var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StyngrTrackControlsUpdate buildPartial() {
         StyngrTrackControlsUpdate var1 = new StyngrTrackControlsUpdate(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StyngrTrackControlsUpdate var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.playing_ = this.playing_;
         }

         if ((var2 & 2) != 0) {
            var1.muted_ = this.muted_;
         }

         if ((var2 & 4) != 0) {
            var1.volume_ = this.volume_;
         }
      }

      public StyngrTrackControlsUpdate.Builder clone() {
         return (StyngrTrackControlsUpdate.Builder)super.clone();
      }

      public StyngrTrackControlsUpdate.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackControlsUpdate.Builder)super.setField(var1, var2);
      }

      public StyngrTrackControlsUpdate.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StyngrTrackControlsUpdate.Builder)super.clearField(var1);
      }

      public StyngrTrackControlsUpdate.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StyngrTrackControlsUpdate.Builder)super.clearOneof(var1);
      }

      public StyngrTrackControlsUpdate.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StyngrTrackControlsUpdate.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StyngrTrackControlsUpdate.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackControlsUpdate.Builder)super.addRepeatedField(var1, var2);
      }

      public StyngrTrackControlsUpdate.Builder mergeFrom(Message var1) {
         if (var1 instanceof StyngrTrackControlsUpdate) {
            return this.mergeFrom((StyngrTrackControlsUpdate)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StyngrTrackControlsUpdate.Builder mergeFrom(StyngrTrackControlsUpdate var1) {
         if (var1 == StyngrTrackControlsUpdate.getDefaultInstance()) {
            return this;
         }

         if (var1.getPlaying()) {
            this.setPlaying(var1.getPlaying());
         }

         if (var1.getMuted()) {
            this.setMuted(var1.getMuted());
         }

         if (var1.getVolume() != 0.0F) {
            this.setVolume(var1.getVolume());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public StyngrTrackControlsUpdate.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.playing_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.muted_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.volume_ = var1.readFloat();
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
      public boolean getPlaying() {
         return this.playing_;
      }

      public StyngrTrackControlsUpdate.Builder setPlaying(boolean var1) {
         this.playing_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StyngrTrackControlsUpdate.Builder clearPlaying() {
         this.bitField0_ &= -2;
         this.playing_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getMuted() {
         return this.muted_;
      }

      public StyngrTrackControlsUpdate.Builder setMuted(boolean var1) {
         this.muted_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StyngrTrackControlsUpdate.Builder clearMuted() {
         this.bitField0_ &= -3;
         this.muted_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getVolume() {
         return this.volume_;
      }

      public StyngrTrackControlsUpdate.Builder setVolume(float var1) {
         this.volume_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StyngrTrackControlsUpdate.Builder clearVolume() {
         this.bitField0_ &= -5;
         this.volume_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final StyngrTrackControlsUpdate.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackControlsUpdate.Builder)super.setUnknownFields(var1);
      }

      public final StyngrTrackControlsUpdate.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackControlsUpdate.Builder)super.mergeUnknownFields(var1);
      }
   }
}
