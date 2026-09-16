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

public final class FetchStateResponse extends GeneratedMessageV3 implements FetchStateResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TRACK_FIELD_NUMBER = 1;
   private StyngrTrackState track_;
   public static final int CONTROLS_FIELD_NUMBER = 2;
   private StyngrControlsState controls_;
   public static final int PROGRESS_FIELD_NUMBER = 3;
   private StyngrProgressState progress_;
   private byte memoizedIsInitialized = -1;
   private static final FetchStateResponse DEFAULT_INSTANCE = new FetchStateResponse();
   private static final Parser<FetchStateResponse> PARSER = new AbstractParser<FetchStateResponse>() {
      public FetchStateResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FetchStateResponse.Builder var3 = FetchStateResponse.newBuilder();

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

   private FetchStateResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FetchStateResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FetchStateResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FetchStateResponse.class, FetchStateResponse.Builder.class);
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
   public boolean hasControls() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public StyngrControlsState getControls() {
      return this.controls_ == null ? StyngrControlsState.getDefaultInstance() : this.controls_;
   }

   @Override
   public StyngrControlsStateOrBuilder getControlsOrBuilder() {
      return this.controls_ == null ? StyngrControlsState.getDefaultInstance() : this.controls_;
   }

   @Override
   public boolean hasProgress() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public StyngrProgressState getProgress() {
      return this.progress_ == null ? StyngrProgressState.getDefaultInstance() : this.progress_;
   }

   @Override
   public StyngrProgressStateOrBuilder getProgressOrBuilder() {
      return this.progress_ == null ? StyngrProgressState.getDefaultInstance() : this.progress_;
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
         var1.writeMessage(2, this.getControls());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getProgress());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getControls());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getProgress());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FetchStateResponse)) {
         return super.equals(var1);
      } else {
         FetchStateResponse var2 = (FetchStateResponse)var1;
         if (this.hasTrack() != var2.hasTrack()) {
            return false;
         } else if (this.hasTrack() && !this.getTrack().equals(var2.getTrack())) {
            return false;
         } else if (this.hasControls() != var2.hasControls()) {
            return false;
         } else if (this.hasControls() && !this.getControls().equals(var2.getControls())) {
            return false;
         } else if (this.hasProgress() != var2.hasProgress()) {
            return false;
         } else {
            return this.hasProgress() && !this.getProgress().equals(var2.getProgress()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasControls()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getControls().hashCode();
      }

      if (this.hasProgress()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getProgress().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FetchStateResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FetchStateResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FetchStateResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FetchStateResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FetchStateResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FetchStateResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FetchStateResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FetchStateResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FetchStateResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FetchStateResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FetchStateResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FetchStateResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FetchStateResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FetchStateResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FetchStateResponse.Builder newBuilder(FetchStateResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FetchStateResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FetchStateResponse.Builder() : new FetchStateResponse.Builder().mergeFrom(this);
   }

   protected FetchStateResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FetchStateResponse.Builder(var1);
   }

   public static FetchStateResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FetchStateResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<FetchStateResponse> getParserForType() {
      return PARSER;
   }

   public FetchStateResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FetchStateResponse.Builder> implements FetchStateResponseOrBuilder {
      private int bitField0_;
      private StyngrTrackState track_;
      private SingleFieldBuilderV3<StyngrTrackState, StyngrTrackState.Builder, StyngrTrackStateOrBuilder> trackBuilder_;
      private StyngrControlsState controls_;
      private SingleFieldBuilderV3<StyngrControlsState, StyngrControlsState.Builder, StyngrControlsStateOrBuilder> controlsBuilder_;
      private StyngrProgressState progress_;
      private SingleFieldBuilderV3<StyngrProgressState, StyngrProgressState.Builder, StyngrProgressStateOrBuilder> progressBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FetchStateResponse.class, FetchStateResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FetchStateResponse.alwaysUseFieldBuilders) {
            this.getTrackFieldBuilder();
            this.getControlsFieldBuilder();
            this.getProgressFieldBuilder();
         }
      }

      public FetchStateResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.track_ = null;
         if (this.trackBuilder_ != null) {
            this.trackBuilder_.dispose();
            this.trackBuilder_ = null;
         }

         this.controls_ = null;
         if (this.controlsBuilder_ != null) {
            this.controlsBuilder_.dispose();
            this.controlsBuilder_ = null;
         }

         this.progress_ = null;
         if (this.progressBuilder_ != null) {
            this.progressBuilder_.dispose();
            this.progressBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_FetchStateResponse_descriptor;
      }

      public FetchStateResponse getDefaultInstanceForType() {
         return FetchStateResponse.getDefaultInstance();
      }

      public FetchStateResponse build() {
         FetchStateResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FetchStateResponse buildPartial() {
         FetchStateResponse var1 = new FetchStateResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FetchStateResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.track_ = this.trackBuilder_ == null ? this.track_ : this.trackBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.controls_ = this.controlsBuilder_ == null ? this.controls_ : this.controlsBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.progress_ = this.progressBuilder_ == null ? this.progress_ : this.progressBuilder_.build();
            var3 |= 4;
         }

         FetchStateResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FetchStateResponse.Builder clone() {
         return (FetchStateResponse.Builder)super.clone();
      }

      public FetchStateResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FetchStateResponse.Builder)super.setField(var1, var2);
      }

      public FetchStateResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FetchStateResponse.Builder)super.clearField(var1);
      }

      public FetchStateResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FetchStateResponse.Builder)super.clearOneof(var1);
      }

      public FetchStateResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FetchStateResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FetchStateResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FetchStateResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public FetchStateResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof FetchStateResponse) {
            return this.mergeFrom((FetchStateResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FetchStateResponse.Builder mergeFrom(FetchStateResponse var1) {
         if (var1 == FetchStateResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTrack()) {
            this.mergeTrack(var1.getTrack());
         }

         if (var1.hasControls()) {
            this.mergeControls(var1.getControls());
         }

         if (var1.hasProgress()) {
            this.mergeProgress(var1.getProgress());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FetchStateResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getControlsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getProgressFieldBuilder().getBuilder(), var2);
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

      public FetchStateResponse.Builder setTrack(StyngrTrackState var1) {
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

      public FetchStateResponse.Builder setTrack(StyngrTrackState.Builder var1) {
         if (this.trackBuilder_ == null) {
            this.track_ = var1.build();
         } else {
            this.trackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FetchStateResponse.Builder mergeTrack(StyngrTrackState var1) {
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

      public FetchStateResponse.Builder clearTrack() {
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

      @Override
      public boolean hasControls() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public StyngrControlsState getControls() {
         if (this.controlsBuilder_ == null) {
            return this.controls_ == null ? StyngrControlsState.getDefaultInstance() : this.controls_;
         } else {
            return this.controlsBuilder_.getMessage();
         }
      }

      public FetchStateResponse.Builder setControls(StyngrControlsState var1) {
         if (this.controlsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.controls_ = var1;
         } else {
            this.controlsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FetchStateResponse.Builder setControls(StyngrControlsState.Builder var1) {
         if (this.controlsBuilder_ == null) {
            this.controls_ = var1.build();
         } else {
            this.controlsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FetchStateResponse.Builder mergeControls(StyngrControlsState var1) {
         if (this.controlsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.controls_ != null && this.controls_ != StyngrControlsState.getDefaultInstance()) {
               this.getControlsBuilder().mergeFrom(var1);
            } else {
               this.controls_ = var1;
            }
         } else {
            this.controlsBuilder_.mergeFrom(var1);
         }

         if (this.controls_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public FetchStateResponse.Builder clearControls() {
         this.bitField0_ &= -3;
         this.controls_ = null;
         if (this.controlsBuilder_ != null) {
            this.controlsBuilder_.dispose();
            this.controlsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public StyngrControlsState.Builder getControlsBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getControlsFieldBuilder().getBuilder();
      }

      @Override
      public StyngrControlsStateOrBuilder getControlsOrBuilder() {
         if (this.controlsBuilder_ != null) {
            return this.controlsBuilder_.getMessageOrBuilder();
         } else {
            return this.controls_ == null ? StyngrControlsState.getDefaultInstance() : this.controls_;
         }
      }

      private SingleFieldBuilderV3<StyngrControlsState, StyngrControlsState.Builder, StyngrControlsStateOrBuilder> getControlsFieldBuilder() {
         if (this.controlsBuilder_ == null) {
            this.controlsBuilder_ = new SingleFieldBuilderV3<>(this.getControls(), this.getParentForChildren(), this.isClean());
            this.controls_ = null;
         }

         return this.controlsBuilder_;
      }

      @Override
      public boolean hasProgress() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public StyngrProgressState getProgress() {
         if (this.progressBuilder_ == null) {
            return this.progress_ == null ? StyngrProgressState.getDefaultInstance() : this.progress_;
         } else {
            return this.progressBuilder_.getMessage();
         }
      }

      public FetchStateResponse.Builder setProgress(StyngrProgressState var1) {
         if (this.progressBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.progress_ = var1;
         } else {
            this.progressBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public FetchStateResponse.Builder setProgress(StyngrProgressState.Builder var1) {
         if (this.progressBuilder_ == null) {
            this.progress_ = var1.build();
         } else {
            this.progressBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public FetchStateResponse.Builder mergeProgress(StyngrProgressState var1) {
         if (this.progressBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.progress_ != null && this.progress_ != StyngrProgressState.getDefaultInstance()) {
               this.getProgressBuilder().mergeFrom(var1);
            } else {
               this.progress_ = var1;
            }
         } else {
            this.progressBuilder_.mergeFrom(var1);
         }

         if (this.progress_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public FetchStateResponse.Builder clearProgress() {
         this.bitField0_ &= -5;
         this.progress_ = null;
         if (this.progressBuilder_ != null) {
            this.progressBuilder_.dispose();
            this.progressBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public StyngrProgressState.Builder getProgressBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getProgressFieldBuilder().getBuilder();
      }

      @Override
      public StyngrProgressStateOrBuilder getProgressOrBuilder() {
         if (this.progressBuilder_ != null) {
            return this.progressBuilder_.getMessageOrBuilder();
         } else {
            return this.progress_ == null ? StyngrProgressState.getDefaultInstance() : this.progress_;
         }
      }

      private SingleFieldBuilderV3<StyngrProgressState, StyngrProgressState.Builder, StyngrProgressStateOrBuilder> getProgressFieldBuilder() {
         if (this.progressBuilder_ == null) {
            this.progressBuilder_ = new SingleFieldBuilderV3<>(this.getProgress(), this.getParentForChildren(), this.isClean());
            this.progress_ = null;
         }

         return this.progressBuilder_;
      }

      public final FetchStateResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FetchStateResponse.Builder)super.setUnknownFields(var1);
      }

      public final FetchStateResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FetchStateResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
