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

public final class SetVolumeRequest extends GeneratedMessageV3 implements SetVolumeRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VOLUME_FIELD_NUMBER = 1;
   private float volume_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final SetVolumeRequest DEFAULT_INSTANCE = new SetVolumeRequest();
   private static final Parser<SetVolumeRequest> PARSER = new AbstractParser<SetVolumeRequest>() {
      public SetVolumeRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetVolumeRequest.Builder var3 = SetVolumeRequest.newBuilder();

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

   private SetVolumeRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetVolumeRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetVolumeRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetVolumeRequest.class, SetVolumeRequest.Builder.class);
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
      if (Float.floatToRawIntBits(this.volume_) != 0) {
         var1.writeFloat(1, this.volume_);
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
      if (Float.floatToRawIntBits(this.volume_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.volume_);
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

      if (!(var1 instanceof SetVolumeRequest)) {
         return super.equals(var1);
      }

      SetVolumeRequest var2 = (SetVolumeRequest)var1;
      return Float.floatToIntBits(this.getVolume()) != Float.floatToIntBits(var2.getVolume()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Float.floatToIntBits(this.getVolume());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetVolumeRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetVolumeRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetVolumeRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetVolumeRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetVolumeRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetVolumeRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetVolumeRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetVolumeRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetVolumeRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetVolumeRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetVolumeRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetVolumeRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetVolumeRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetVolumeRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetVolumeRequest.Builder newBuilder(SetVolumeRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetVolumeRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetVolumeRequest.Builder() : new SetVolumeRequest.Builder().mergeFrom(this);
   }

   protected SetVolumeRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetVolumeRequest.Builder(var1);
   }

   public static SetVolumeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetVolumeRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetVolumeRequest> getParserForType() {
      return PARSER;
   }

   public SetVolumeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetVolumeRequest.Builder> implements SetVolumeRequestOrBuilder {
      private int bitField0_;
      private float volume_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetVolumeRequest.class, SetVolumeRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetVolumeRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.volume_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeRequest_descriptor;
      }

      public SetVolumeRequest getDefaultInstanceForType() {
         return SetVolumeRequest.getDefaultInstance();
      }

      public SetVolumeRequest build() {
         SetVolumeRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetVolumeRequest buildPartial() {
         SetVolumeRequest var1 = new SetVolumeRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetVolumeRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.volume_ = this.volume_;
         }
      }

      public SetVolumeRequest.Builder clone() {
         return (SetVolumeRequest.Builder)super.clone();
      }

      public SetVolumeRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetVolumeRequest.Builder)super.setField(var1, var2);
      }

      public SetVolumeRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetVolumeRequest.Builder)super.clearField(var1);
      }

      public SetVolumeRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetVolumeRequest.Builder)super.clearOneof(var1);
      }

      public SetVolumeRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetVolumeRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetVolumeRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetVolumeRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetVolumeRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetVolumeRequest) {
            return this.mergeFrom((SetVolumeRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetVolumeRequest.Builder mergeFrom(SetVolumeRequest var1) {
         if (var1 == SetVolumeRequest.getDefaultInstance()) {
            return this;
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

      public SetVolumeRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.volume_ = var1.readFloat();
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
      public float getVolume() {
         return this.volume_;
      }

      public SetVolumeRequest.Builder setVolume(float var1) {
         this.volume_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetVolumeRequest.Builder clearVolume() {
         this.bitField0_ &= -2;
         this.volume_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final SetVolumeRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetVolumeRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetVolumeRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetVolumeRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
