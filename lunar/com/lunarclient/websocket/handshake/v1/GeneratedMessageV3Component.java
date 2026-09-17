package com.lunarclient.websocket.handshake.v1;

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

public final class NvidiaGpuMemory extends GeneratedMessageV3 implements NvidiaGpuMemoryOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int DEDICATED_VRAM_KB_FIELD_NUMBER = 1;
   private int dedicatedVramKb_ = 0;
   public static final int TOTAL_AVAILABLE_MEMORY_KB_FIELD_NUMBER = 2;
   private int totalAvailableMemoryKb_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final NvidiaGpuMemory DEFAULT_INSTANCE = new NvidiaGpuMemory();
   private static final Parser<NvidiaGpuMemory> PARSER = new AbstractParser<NvidiaGpuMemory>() {
      public NvidiaGpuMemory parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         NvidiaGpuMemory.Builder var3 = NvidiaGpuMemory.newBuilder();

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

   private NvidiaGpuMemory(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private NvidiaGpuMemory() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new NvidiaGpuMemory();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_fieldAccessorTable
         .ensureFieldAccessorsInitialized(NvidiaGpuMemory.class, NvidiaGpuMemory.Builder.class);
   }

   @Override
   public int getDedicatedVramKb() {
      return this.dedicatedVramKb_;
   }

   @Override
   public int getTotalAvailableMemoryKb() {
      return this.totalAvailableMemoryKb_;
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
      if (this.dedicatedVramKb_ != 0) {
         var1.writeInt32(1, this.dedicatedVramKb_);
      }

      if (this.totalAvailableMemoryKb_ != 0) {
         var1.writeInt32(2, this.totalAvailableMemoryKb_);
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
      if (this.dedicatedVramKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.dedicatedVramKb_);
      }

      if (this.totalAvailableMemoryKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.totalAvailableMemoryKb_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof NvidiaGpuMemory)) {
         return super.equals(var1);
      } else {
         NvidiaGpuMemory var2 = (NvidiaGpuMemory)var1;
         if (this.getDedicatedVramKb() != var2.getDedicatedVramKb()) {
            return false;
         } else {
            return this.getTotalAvailableMemoryKb() != var2.getTotalAvailableMemoryKb() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getDedicatedVramKb();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getTotalAvailableMemoryKb();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static NvidiaGpuMemory parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static NvidiaGpuMemory parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NvidiaGpuMemory parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static NvidiaGpuMemory parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NvidiaGpuMemory parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static NvidiaGpuMemory parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NvidiaGpuMemory parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NvidiaGpuMemory parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static NvidiaGpuMemory parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static NvidiaGpuMemory parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static NvidiaGpuMemory parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NvidiaGpuMemory parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public NvidiaGpuMemory.Builder newBuilderForType() {
      return newBuilder();
   }

   public static NvidiaGpuMemory.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static NvidiaGpuMemory.Builder newBuilder(NvidiaGpuMemory var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public NvidiaGpuMemory.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new NvidiaGpuMemory.Builder() : new NvidiaGpuMemory.Builder().mergeFrom(this);
   }

   protected NvidiaGpuMemory.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new NvidiaGpuMemory.Builder(var1);
   }

   public static NvidiaGpuMemory getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<NvidiaGpuMemory> parser() {
      return PARSER;
   }

   @Override
   public Parser<NvidiaGpuMemory> getParserForType() {
      return PARSER;
   }

   public NvidiaGpuMemory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<NvidiaGpuMemory.Builder> implements NvidiaGpuMemoryOrBuilder {
      private int bitField0_;
      private int dedicatedVramKb_;
      private int totalAvailableMemoryKb_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(NvidiaGpuMemory.class, NvidiaGpuMemory.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public NvidiaGpuMemory.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.dedicatedVramKb_ = 0;
         this.totalAvailableMemoryKb_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_NvidiaGpuMemory_descriptor;
      }

      public NvidiaGpuMemory getDefaultInstanceForType() {
         return NvidiaGpuMemory.getDefaultInstance();
      }

      public NvidiaGpuMemory build() {
         NvidiaGpuMemory var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public NvidiaGpuMemory buildPartial() {
         NvidiaGpuMemory var1 = new NvidiaGpuMemory(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(NvidiaGpuMemory var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.dedicatedVramKb_ = this.dedicatedVramKb_;
         }

         if ((var2 & 2) != 0) {
            var1.totalAvailableMemoryKb_ = this.totalAvailableMemoryKb_;
         }
      }

      public NvidiaGpuMemory.Builder clone() {
         return (NvidiaGpuMemory.Builder)super.clone();
      }

      public NvidiaGpuMemory.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NvidiaGpuMemory.Builder)super.setField(var1, var2);
      }

      public NvidiaGpuMemory.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (NvidiaGpuMemory.Builder)super.clearField(var1);
      }

      public NvidiaGpuMemory.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (NvidiaGpuMemory.Builder)super.clearOneof(var1);
      }

      public NvidiaGpuMemory.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (NvidiaGpuMemory.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public NvidiaGpuMemory.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NvidiaGpuMemory.Builder)super.addRepeatedField(var1, var2);
      }

      public NvidiaGpuMemory.Builder mergeFrom(Message var1) {
         if (var1 instanceof NvidiaGpuMemory) {
            return this.mergeFrom((NvidiaGpuMemory)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public NvidiaGpuMemory.Builder mergeFrom(NvidiaGpuMemory var1) {
         if (var1 == NvidiaGpuMemory.getDefaultInstance()) {
            return this;
         }

         if (var1.getDedicatedVramKb() != 0) {
            this.setDedicatedVramKb(var1.getDedicatedVramKb());
         }

         if (var1.getTotalAvailableMemoryKb() != 0) {
            this.setTotalAvailableMemoryKb(var1.getTotalAvailableMemoryKb());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public NvidiaGpuMemory.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.dedicatedVramKb_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.totalAvailableMemoryKb_ = var1.readInt32();
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
      public int getDedicatedVramKb() {
         return this.dedicatedVramKb_;
      }

      public NvidiaGpuMemory.Builder setDedicatedVramKb(int var1) {
         this.dedicatedVramKb_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public NvidiaGpuMemory.Builder clearDedicatedVramKb() {
         this.bitField0_ &= -2;
         this.dedicatedVramKb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getTotalAvailableMemoryKb() {
         return this.totalAvailableMemoryKb_;
      }

      public NvidiaGpuMemory.Builder setTotalAvailableMemoryKb(int var1) {
         this.totalAvailableMemoryKb_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public NvidiaGpuMemory.Builder clearTotalAvailableMemoryKb() {
         this.bitField0_ &= -3;
         this.totalAvailableMemoryKb_ = 0;
         this.onChanged();
         return this;
      }

      public final NvidiaGpuMemory.Builder setUnknownFields(UnknownFieldSet var1) {
         return (NvidiaGpuMemory.Builder)super.setUnknownFields(var1);
      }

      public final NvidiaGpuMemory.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (NvidiaGpuMemory.Builder)super.mergeUnknownFields(var1);
      }
   }
}
