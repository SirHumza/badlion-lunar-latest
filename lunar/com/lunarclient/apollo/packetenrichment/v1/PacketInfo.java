package com.lunarclient.apollo.packetenrichment.v1;

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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PacketInfo extends GeneratedMessageV3 implements PacketInfoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int INSTANTIATION_TIME_FIELD_NUMBER = 1;
   private Timestamp instantiationTime_;
   private byte memoizedIsInitialized = -1;
   private static final PacketInfo DEFAULT_INSTANCE = new PacketInfo();
   private static final Parser<PacketInfo> PARSER = new AbstractParser<PacketInfo>() {
      public PacketInfo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PacketInfo.Builder var3 = PacketInfo.newBuilder();

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

   private PacketInfo(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PacketInfo() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PacketInfo();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PacketProto.internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PacketProto.internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PacketInfo.class, PacketInfo.Builder.class);
   }

   @Override
   public boolean hasInstantiationTime() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getInstantiationTime() {
      return this.instantiationTime_ == null ? Timestamp.getDefaultInstance() : this.instantiationTime_;
   }

   @Override
   public TimestampOrBuilder getInstantiationTimeOrBuilder() {
      return this.instantiationTime_ == null ? Timestamp.getDefaultInstance() : this.instantiationTime_;
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
         var1.writeMessage(1, this.getInstantiationTime());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getInstantiationTime());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PacketInfo)) {
         return super.equals(var1);
      } else {
         PacketInfo var2 = (PacketInfo)var1;
         if (this.hasInstantiationTime() != var2.hasInstantiationTime()) {
            return false;
         } else {
            return this.hasInstantiationTime() && !this.getInstantiationTime().equals(var2.getInstantiationTime())
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
      if (this.hasInstantiationTime()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getInstantiationTime().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PacketInfo parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PacketInfo parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PacketInfo parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PacketInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PacketInfo parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PacketInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PacketInfo parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PacketInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PacketInfo parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PacketInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PacketInfo parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PacketInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PacketInfo.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PacketInfo.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PacketInfo.Builder newBuilder(PacketInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PacketInfo.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PacketInfo.Builder() : new PacketInfo.Builder().mergeFrom(this);
   }

   protected PacketInfo.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PacketInfo.Builder(var1);
   }

   public static PacketInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PacketInfo> parser() {
      return PARSER;
   }

   @Override
   public Parser<PacketInfo> getParserForType() {
      return PARSER;
   }

   public PacketInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PacketInfo.Builder> implements PacketInfoOrBuilder {
      private int bitField0_;
      private Timestamp instantiationTime_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> instantiationTimeBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PacketProto.internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PacketProto.internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PacketInfo.class, PacketInfo.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PacketInfo.alwaysUseFieldBuilders) {
            this.getInstantiationTimeFieldBuilder();
         }
      }

      public PacketInfo.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.instantiationTime_ = null;
         if (this.instantiationTimeBuilder_ != null) {
            this.instantiationTimeBuilder_.dispose();
            this.instantiationTimeBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PacketProto.internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_descriptor;
      }

      public PacketInfo getDefaultInstanceForType() {
         return PacketInfo.getDefaultInstance();
      }

      public PacketInfo build() {
         PacketInfo var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PacketInfo buildPartial() {
         PacketInfo var1 = new PacketInfo(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PacketInfo var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.instantiationTime_ = this.instantiationTimeBuilder_ == null ? this.instantiationTime_ : this.instantiationTimeBuilder_.build();
            var3 |= 1;
         }

         PacketInfo var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PacketInfo.Builder clone() {
         return (PacketInfo.Builder)super.clone();
      }

      public PacketInfo.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PacketInfo.Builder)super.setField(var1, var2);
      }

      public PacketInfo.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PacketInfo.Builder)super.clearField(var1);
      }

      public PacketInfo.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PacketInfo.Builder)super.clearOneof(var1);
      }

      public PacketInfo.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PacketInfo.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PacketInfo.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PacketInfo.Builder)super.addRepeatedField(var1, var2);
      }

      public PacketInfo.Builder mergeFrom(Message var1) {
         if (var1 instanceof PacketInfo) {
            return this.mergeFrom((PacketInfo)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PacketInfo.Builder mergeFrom(PacketInfo var1) {
         if (var1 == PacketInfo.getDefaultInstance()) {
            return this;
         }

         if (var1.hasInstantiationTime()) {
            this.mergeInstantiationTime(var1.getInstantiationTime());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PacketInfo.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getInstantiationTimeFieldBuilder().getBuilder(), var2);
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
      public boolean hasInstantiationTime() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Timestamp getInstantiationTime() {
         if (this.instantiationTimeBuilder_ == null) {
            return this.instantiationTime_ == null ? Timestamp.getDefaultInstance() : this.instantiationTime_;
         } else {
            return this.instantiationTimeBuilder_.getMessage();
         }
      }

      public PacketInfo.Builder setInstantiationTime(Timestamp var1) {
         if (this.instantiationTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.instantiationTime_ = var1;
         } else {
            this.instantiationTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PacketInfo.Builder setInstantiationTime(Timestamp.Builder var1) {
         if (this.instantiationTimeBuilder_ == null) {
            this.instantiationTime_ = var1.build();
         } else {
            this.instantiationTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PacketInfo.Builder mergeInstantiationTime(Timestamp var1) {
         if (this.instantiationTimeBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.instantiationTime_ != null && this.instantiationTime_ != Timestamp.getDefaultInstance()) {
               this.getInstantiationTimeBuilder().mergeFrom(var1);
            } else {
               this.instantiationTime_ = var1;
            }
         } else {
            this.instantiationTimeBuilder_.mergeFrom(var1);
         }

         if (this.instantiationTime_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PacketInfo.Builder clearInstantiationTime() {
         this.bitField0_ &= -2;
         this.instantiationTime_ = null;
         if (this.instantiationTimeBuilder_ != null) {
            this.instantiationTimeBuilder_.dispose();
            this.instantiationTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getInstantiationTimeBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getInstantiationTimeFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getInstantiationTimeOrBuilder() {
         if (this.instantiationTimeBuilder_ != null) {
            return this.instantiationTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.instantiationTime_ == null ? Timestamp.getDefaultInstance() : this.instantiationTime_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getInstantiationTimeFieldBuilder() {
         if (this.instantiationTimeBuilder_ == null) {
            this.instantiationTimeBuilder_ = new SingleFieldBuilderV3<>(this.getInstantiationTime(), this.getParentForChildren(), this.isClean());
            this.instantiationTime_ = null;
         }

         return this.instantiationTimeBuilder_;
      }

      public final PacketInfo.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PacketInfo.Builder)super.setUnknownFields(var1);
      }

      public final PacketInfo.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PacketInfo.Builder)super.mergeUnknownFields(var1);
      }
   }
}
