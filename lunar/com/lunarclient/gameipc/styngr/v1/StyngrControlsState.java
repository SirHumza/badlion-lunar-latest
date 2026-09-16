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

public final class StyngrControlsState extends GeneratedMessageV3 implements StyngrControlsStateOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYING_FIELD_NUMBER = 1;
   private boolean playing_ = false;
   public static final int MUTED_FIELD_NUMBER = 2;
   private boolean muted_ = false;
   public static final int VOLUME_FIELD_NUMBER = 3;
   private float volume_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final StyngrControlsState DEFAULT_INSTANCE = new StyngrControlsState();
   private static final Parser<StyngrControlsState> PARSER = new AbstractParser<StyngrControlsState>() {
      public StyngrControlsState parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StyngrControlsState.Builder var3 = StyngrControlsState.newBuilder();

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

   private StyngrControlsState(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StyngrControlsState() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StyngrControlsState();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StyngrControlsState.class, StyngrControlsState.Builder.class);
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
      } else if (!(var1 instanceof StyngrControlsState)) {
         return super.equals(var1);
      } else {
         StyngrControlsState var2 = (StyngrControlsState)var1;
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

   public static StyngrControlsState parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrControlsState parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrControlsState parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrControlsState parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrControlsState parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrControlsState parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrControlsState parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrControlsState parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StyngrControlsState parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StyngrControlsState parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StyngrControlsState parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrControlsState parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StyngrControlsState.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StyngrControlsState.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StyngrControlsState.Builder newBuilder(StyngrControlsState var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StyngrControlsState.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StyngrControlsState.Builder() : new StyngrControlsState.Builder().mergeFrom(this);
   }

   protected StyngrControlsState.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StyngrControlsState.Builder(var1);
   }

   public static StyngrControlsState getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StyngrControlsState> parser() {
      return PARSER;
   }

   @Override
   public Parser<StyngrControlsState> getParserForType() {
      return PARSER;
   }

   public StyngrControlsState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StyngrControlsState.Builder> implements StyngrControlsStateOrBuilder {
      private int bitField0_;
      private boolean playing_;
      private boolean muted_;
      private float volume_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StyngrControlsState.class, StyngrControlsState.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StyngrControlsState.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playing_ = false;
         this.muted_ = false;
         this.volume_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrControlsState_descriptor;
      }

      public StyngrControlsState getDefaultInstanceForType() {
         return StyngrControlsState.getDefaultInstance();
      }

      public StyngrControlsState build() {
         StyngrControlsState var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StyngrControlsState buildPartial() {
         StyngrControlsState var1 = new StyngrControlsState(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StyngrControlsState var1) {
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

      public StyngrControlsState.Builder clone() {
         return (StyngrControlsState.Builder)super.clone();
      }

      public StyngrControlsState.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrControlsState.Builder)super.setField(var1, var2);
      }

      public StyngrControlsState.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StyngrControlsState.Builder)super.clearField(var1);
      }

      public StyngrControlsState.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StyngrControlsState.Builder)super.clearOneof(var1);
      }

      public StyngrControlsState.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StyngrControlsState.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StyngrControlsState.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrControlsState.Builder)super.addRepeatedField(var1, var2);
      }

      public StyngrControlsState.Builder mergeFrom(Message var1) {
         if (var1 instanceof StyngrControlsState) {
            return this.mergeFrom((StyngrControlsState)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StyngrControlsState.Builder mergeFrom(StyngrControlsState var1) {
         if (var1 == StyngrControlsState.getDefaultInstance()) {
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

      public StyngrControlsState.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public StyngrControlsState.Builder setPlaying(boolean var1) {
         this.playing_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StyngrControlsState.Builder clearPlaying() {
         this.bitField0_ &= -2;
         this.playing_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getMuted() {
         return this.muted_;
      }

      public StyngrControlsState.Builder setMuted(boolean var1) {
         this.muted_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StyngrControlsState.Builder clearMuted() {
         this.bitField0_ &= -3;
         this.muted_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getVolume() {
         return this.volume_;
      }

      public StyngrControlsState.Builder setVolume(float var1) {
         this.volume_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StyngrControlsState.Builder clearVolume() {
         this.bitField0_ &= -5;
         this.volume_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final StyngrControlsState.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StyngrControlsState.Builder)super.setUnknownFields(var1);
      }

      public final StyngrControlsState.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StyngrControlsState.Builder)super.mergeUnknownFields(var1);
      }
   }
}
