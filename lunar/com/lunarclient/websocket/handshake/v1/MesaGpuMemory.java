package com.lunarclient.websocket.handshake.v1;

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

public final class MesaGpuMemory extends GeneratedMessageV3 implements MesaGpuMemoryOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TOTAL_VRAM_MB_FIELD_NUMBER = 1;
   private int totalVramMb_ = 0;
   public static final int UNIFIED_MEMORY_FIELD_NUMBER = 2;
   private boolean unifiedMemory_ = false;
   private byte memoizedIsInitialized = -1;
   private static final MesaGpuMemory DEFAULT_INSTANCE = new MesaGpuMemory();
   private static final Parser<MesaGpuMemory> PARSER = new AbstractParser<MesaGpuMemory>() {
      public MesaGpuMemory parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MesaGpuMemory.Builder var3 = MesaGpuMemory.newBuilder();

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

   private MesaGpuMemory(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MesaGpuMemory() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MesaGpuMemory();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MesaGpuMemory.class, MesaGpuMemory.Builder.class);
   }

   @Override
   public int getTotalVramMb() {
      return this.totalVramMb_;
   }

   @Override
   public boolean getUnifiedMemory() {
      return this.unifiedMemory_;
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
      if (this.totalVramMb_ != 0) {
         var1.writeInt32(1, this.totalVramMb_);
      }

      if (this.unifiedMemory_) {
         var1.writeBool(2, this.unifiedMemory_);
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
      if (this.totalVramMb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.totalVramMb_);
      }

      if (this.unifiedMemory_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.unifiedMemory_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MesaGpuMemory)) {
         return super.equals(var1);
      } else {
         MesaGpuMemory var2 = (MesaGpuMemory)var1;
         if (this.getTotalVramMb() != var2.getTotalVramMb()) {
            return false;
         } else {
            return this.getUnifiedMemory() != var2.getUnifiedMemory() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getTotalVramMb();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getUnifiedMemory());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MesaGpuMemory parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MesaGpuMemory parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MesaGpuMemory parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MesaGpuMemory parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MesaGpuMemory parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MesaGpuMemory parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MesaGpuMemory parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MesaGpuMemory parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MesaGpuMemory parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MesaGpuMemory parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MesaGpuMemory parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MesaGpuMemory parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MesaGpuMemory.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MesaGpuMemory.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MesaGpuMemory.Builder newBuilder(MesaGpuMemory var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MesaGpuMemory.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MesaGpuMemory.Builder() : new MesaGpuMemory.Builder().mergeFrom(this);
   }

   protected MesaGpuMemory.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MesaGpuMemory.Builder(var1);
   }

   public static MesaGpuMemory getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MesaGpuMemory> parser() {
      return PARSER;
   }

   @Override
   public Parser<MesaGpuMemory> getParserForType() {
      return PARSER;
   }

   public MesaGpuMemory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MesaGpuMemory.Builder> implements MesaGpuMemoryOrBuilder {
      private int bitField0_;
      private int totalVramMb_;
      private boolean unifiedMemory_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MesaGpuMemory.class, MesaGpuMemory.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MesaGpuMemory.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.totalVramMb_ = 0;
         this.unifiedMemory_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_MesaGpuMemory_descriptor;
      }

      public MesaGpuMemory getDefaultInstanceForType() {
         return MesaGpuMemory.getDefaultInstance();
      }

      public MesaGpuMemory build() {
         MesaGpuMemory var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MesaGpuMemory buildPartial() {
         MesaGpuMemory var1 = new MesaGpuMemory(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MesaGpuMemory var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.totalVramMb_ = this.totalVramMb_;
         }

         if ((var2 & 2) != 0) {
            var1.unifiedMemory_ = this.unifiedMemory_;
         }
      }

      public MesaGpuMemory.Builder clone() {
         return (MesaGpuMemory.Builder)super.clone();
      }

      public MesaGpuMemory.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MesaGpuMemory.Builder)super.setField(var1, var2);
      }

      public MesaGpuMemory.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MesaGpuMemory.Builder)super.clearField(var1);
      }

      public MesaGpuMemory.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MesaGpuMemory.Builder)super.clearOneof(var1);
      }

      public MesaGpuMemory.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MesaGpuMemory.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MesaGpuMemory.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MesaGpuMemory.Builder)super.addRepeatedField(var1, var2);
      }

      public MesaGpuMemory.Builder mergeFrom(Message var1) {
         if (var1 instanceof MesaGpuMemory) {
            return this.mergeFrom((MesaGpuMemory)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MesaGpuMemory.Builder mergeFrom(MesaGpuMemory var1) {
         if (var1 == MesaGpuMemory.getDefaultInstance()) {
            return this;
         }

         if (var1.getTotalVramMb() != 0) {
            this.setTotalVramMb(var1.getTotalVramMb());
         }

         if (var1.getUnifiedMemory()) {
            this.setUnifiedMemory(var1.getUnifiedMemory());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MesaGpuMemory.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.totalVramMb_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.unifiedMemory_ = var1.readBool();
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
      public int getTotalVramMb() {
         return this.totalVramMb_;
      }

      public MesaGpuMemory.Builder setTotalVramMb(int var1) {
         this.totalVramMb_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public MesaGpuMemory.Builder clearTotalVramMb() {
         this.bitField0_ &= -2;
         this.totalVramMb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getUnifiedMemory() {
         return this.unifiedMemory_;
      }

      public MesaGpuMemory.Builder setUnifiedMemory(boolean var1) {
         this.unifiedMemory_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public MesaGpuMemory.Builder clearUnifiedMemory() {
         this.bitField0_ &= -3;
         this.unifiedMemory_ = false;
         this.onChanged();
         return this;
      }

      public final MesaGpuMemory.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MesaGpuMemory.Builder)super.setUnknownFields(var1);
      }

      public final MesaGpuMemory.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MesaGpuMemory.Builder)super.mergeUnknownFields(var1);
      }
   }
}
