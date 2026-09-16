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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StyngrTrackUpdate extends GeneratedMessageV3 implements StyngrTrackUpdateOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TRACK_FIELD_NUMBER = 1;
   private StyngrTrackState track_;
   private byte memoizedIsInitialized = -1;
   private static final StyngrTrackUpdate DEFAULT_INSTANCE = new StyngrTrackUpdate();
   private static final Parser<StyngrTrackUpdate> PARSER = new AbstractParser<StyngrTrackUpdate>() {
      public StyngrTrackUpdate parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StyngrTrackUpdate.Builder var3 = StyngrTrackUpdate.newBuilder();

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

   private StyngrTrackUpdate(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StyngrTrackUpdate() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StyngrTrackUpdate();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StyngrTrackUpdate.class, StyngrTrackUpdate.Builder.class);
   }

   @Override
   public boolean hasTrack() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public StyngrTrackState getTrack() {
      return this.track_ == null ? StyngrTrackState.getDefaultInstance() : this.track_;
   }

   @Override
   public StyngrTrackStateOrBuilder getTrackOrBuilder() {
      return this.track_ == null ? StyngrTrackState.getDefaultInstance() : this.track_;
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StyngrTrackUpdate)) {
         return super.equals(var1);
      } else {
         StyngrTrackUpdate var2 = (StyngrTrackUpdate)var1;
         if (this.hasTrack() != var2.hasTrack()) {
            return false;
         } else {
            return this.hasTrack() && !this.getTrack().equals(var2.getTrack()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StyngrTrackUpdate parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackUpdate parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackUpdate parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackUpdate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackUpdate parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StyngrTrackUpdate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StyngrTrackUpdate parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackUpdate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackUpdate parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StyngrTrackUpdate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StyngrTrackUpdate parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StyngrTrackUpdate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StyngrTrackUpdate.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StyngrTrackUpdate.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StyngrTrackUpdate.Builder newBuilder(StyngrTrackUpdate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StyngrTrackUpdate.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StyngrTrackUpdate.Builder() : new StyngrTrackUpdate.Builder().mergeFrom(this);
   }

   protected StyngrTrackUpdate.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StyngrTrackUpdate.Builder(var1);
   }

   public static StyngrTrackUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StyngrTrackUpdate> parser() {
      return PARSER;
   }

   @Override
   public Parser<StyngrTrackUpdate> getParserForType() {
      return PARSER;
   }

   public StyngrTrackUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StyngrTrackUpdate.Builder> implements StyngrTrackUpdateOrBuilder {
      private int bitField0_;
      private StyngrTrackState track_;
      private SingleFieldBuilderV3<StyngrTrackState, StyngrTrackState.Builder, StyngrTrackStateOrBuilder> trackBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StyngrTrackUpdate.class, StyngrTrackUpdate.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (StyngrTrackUpdate.alwaysUseFieldBuilders) {
            this.getTrackFieldBuilder();
         }
      }

      public StyngrTrackUpdate.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.track_ = null;
         if (this.trackBuilder_ != null) {
            this.trackBuilder_.dispose();
            this.trackBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_styngr_v1_StyngrTrackUpdate_descriptor;
      }

      public StyngrTrackUpdate getDefaultInstanceForType() {
         return StyngrTrackUpdate.getDefaultInstance();
      }

      public StyngrTrackUpdate build() {
         StyngrTrackUpdate var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StyngrTrackUpdate buildPartial() {
         StyngrTrackUpdate var1 = new StyngrTrackUpdate(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StyngrTrackUpdate var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.track_ = this.trackBuilder_ == null ? this.track_ : this.trackBuilder_.build();
            var3 |= 1;
         }

         StyngrTrackUpdate var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public StyngrTrackUpdate.Builder clone() {
         return (StyngrTrackUpdate.Builder)super.clone();
      }

      public StyngrTrackUpdate.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackUpdate.Builder)super.setField(var1, var2);
      }

      public StyngrTrackUpdate.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StyngrTrackUpdate.Builder)super.clearField(var1);
      }

      public StyngrTrackUpdate.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StyngrTrackUpdate.Builder)super.clearOneof(var1);
      }

      public StyngrTrackUpdate.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StyngrTrackUpdate.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StyngrTrackUpdate.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StyngrTrackUpdate.Builder)super.addRepeatedField(var1, var2);
      }

      public StyngrTrackUpdate.Builder mergeFrom(Message var1) {
         if (var1 instanceof StyngrTrackUpdate) {
            return this.mergeFrom((StyngrTrackUpdate)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StyngrTrackUpdate.Builder mergeFrom(StyngrTrackUpdate var1) {
         if (var1 == StyngrTrackUpdate.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTrack()) {
            this.mergeTrack(var1.getTrack());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public StyngrTrackUpdate.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
      public StyngrTrackState getTrack() {
         if (this.trackBuilder_ == null) {
            return this.track_ == null ? StyngrTrackState.getDefaultInstance() : this.track_;
         } else {
            return this.trackBuilder_.getMessage();
         }
      }

      public StyngrTrackUpdate.Builder setTrack(StyngrTrackState var1) {
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

      public StyngrTrackUpdate.Builder setTrack(StyngrTrackState.Builder var1) {
         if (this.trackBuilder_ == null) {
            this.track_ = var1.build();
         } else {
            this.trackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StyngrTrackUpdate.Builder mergeTrack(StyngrTrackState var1) {
         if (this.trackBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.track_ != null && this.track_ != StyngrTrackState.getDefaultInstance()) {
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

      public StyngrTrackUpdate.Builder clearTrack() {
         this.bitField0_ &= -2;
         this.track_ = null;
         if (this.trackBuilder_ != null) {
            this.trackBuilder_.dispose();
            this.trackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public StyngrTrackState.Builder getTrackBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTrackFieldBuilder().getBuilder();
      }

      @Override
      public StyngrTrackStateOrBuilder getTrackOrBuilder() {
         if (this.trackBuilder_ != null) {
            return this.trackBuilder_.getMessageOrBuilder();
         } else {
            return this.track_ == null ? StyngrTrackState.getDefaultInstance() : this.track_;
         }
      }

      private SingleFieldBuilderV3<StyngrTrackState, StyngrTrackState.Builder, StyngrTrackStateOrBuilder> getTrackFieldBuilder() {
         if (this.trackBuilder_ == null) {
            this.trackBuilder_ = new SingleFieldBuilderV3<>(this.getTrack(), this.getParentForChildren(), this.isClean());
            this.track_ = null;
         }

         return this.trackBuilder_;
      }

      public final StyngrTrackUpdate.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackUpdate.Builder)super.setUnknownFields(var1);
      }

      public final StyngrTrackUpdate.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StyngrTrackUpdate.Builder)super.mergeUnknownFields(var1);
      }
   }
}
