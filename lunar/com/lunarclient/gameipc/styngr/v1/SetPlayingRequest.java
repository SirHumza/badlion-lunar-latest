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

public final class SetPlayingRequest extends GeneratedMessageV3 implements SetPlayingRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYING_FIELD_NUMBER = 1;
   private boolean playing_ = false;
   private byte memoizedIsInitialized = -1;
   private static final SetPlayingRequest DEFAULT_INSTANCE = new SetPlayingRequest();
   private static final Parser<SetPlayingRequest> PARSER = new AbstractParser<SetPlayingRequest>() {
      public SetPlayingRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetPlayingRequest.Builder var3 = SetPlayingRequest.newBuilder();

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

   private SetPlayingRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetPlayingRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetPlayingRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetPlayingRequest.class, SetPlayingRequest.Builder.class);
   }

   @Override
   public boolean getPlaying() {
      return this.playing_;
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof SetPlayingRequest)) {
         return super.equals(var1);
      }

      SetPlayingRequest var2 = (SetPlayingRequest)var1;
      return this.getPlaying() != var2.getPlaying() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetPlayingRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPlayingRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPlayingRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPlayingRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPlayingRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPlayingRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPlayingRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetPlayingRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetPlayingRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetPlayingRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetPlayingRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetPlayingRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetPlayingRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetPlayingRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetPlayingRequest.Builder newBuilder(SetPlayingRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetPlayingRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetPlayingRequest.Builder() : new SetPlayingRequest.Builder().mergeFrom(this);
   }

   protected SetPlayingRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetPlayingRequest.Builder(var1);
   }

   public static SetPlayingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetPlayingRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetPlayingRequest> getParserForType() {
      return PARSER;
   }

   public SetPlayingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetPlayingRequest.Builder> implements SetPlayingRequestOrBuilder {
      private int bitField0_;
      private boolean playing_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetPlayingRequest.class, SetPlayingRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetPlayingRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playing_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetPlayingRequest_descriptor;
      }

      public SetPlayingRequest getDefaultInstanceForType() {
         return SetPlayingRequest.getDefaultInstance();
      }

      public SetPlayingRequest build() {
         SetPlayingRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetPlayingRequest buildPartial() {
         SetPlayingRequest var1 = new SetPlayingRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetPlayingRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.playing_ = this.playing_;
         }
      }

      public SetPlayingRequest.Builder clone() {
         return (SetPlayingRequest.Builder)super.clone();
      }

      public SetPlayingRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetPlayingRequest.Builder)super.setField(var1, var2);
      }

      public SetPlayingRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetPlayingRequest.Builder)super.clearField(var1);
      }

      public SetPlayingRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetPlayingRequest.Builder)super.clearOneof(var1);
      }

      public SetPlayingRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetPlayingRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetPlayingRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetPlayingRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetPlayingRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetPlayingRequest) {
            return this.mergeFrom((SetPlayingRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetPlayingRequest.Builder mergeFrom(SetPlayingRequest var1) {
         if (var1 == SetPlayingRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getPlaying()) {
            this.setPlaying(var1.getPlaying());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetPlayingRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public SetPlayingRequest.Builder setPlaying(boolean var1) {
         this.playing_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetPlayingRequest.Builder clearPlaying() {
         this.bitField0_ &= -2;
         this.playing_ = false;
         this.onChanged();
         return this;
      }

      public final SetPlayingRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetPlayingRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetPlayingRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetPlayingRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
