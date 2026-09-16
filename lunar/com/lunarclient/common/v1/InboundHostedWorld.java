package com.lunarclient.common.v1;

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

public final class InboundHostedWorld extends GeneratedMessageV3 implements InboundHostedWorldOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int WORLD_HOST_FIELD_NUMBER = 1;
   private Uuid worldHost_;
   private byte memoizedIsInitialized = -1;
   private static final InboundHostedWorld DEFAULT_INSTANCE = new InboundHostedWorld();
   private static final Parser<InboundHostedWorld> PARSER = new AbstractParser<InboundHostedWorld>() {
      public InboundHostedWorld parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundHostedWorld.Builder var3 = InboundHostedWorld.newBuilder();

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

   private InboundHostedWorld(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundHostedWorld() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundHostedWorld();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundHostedWorld_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundHostedWorld_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundHostedWorld.class, InboundHostedWorld.Builder.class);
   }

   @Override
   public boolean hasWorldHost() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getWorldHost() {
      return this.worldHost_ == null ? Uuid.getDefaultInstance() : this.worldHost_;
   }

   @Override
   public UuidOrBuilder getWorldHostOrBuilder() {
      return this.worldHost_ == null ? Uuid.getDefaultInstance() : this.worldHost_;
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
         var1.writeMessage(1, this.getWorldHost());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getWorldHost());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InboundHostedWorld)) {
         return super.equals(var1);
      } else {
         InboundHostedWorld var2 = (InboundHostedWorld)var1;
         if (this.hasWorldHost() != var2.hasWorldHost()) {
            return false;
         } else {
            return this.hasWorldHost() && !this.getWorldHost().equals(var2.getWorldHost()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasWorldHost()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getWorldHost().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundHostedWorld parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundHostedWorld parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundHostedWorld parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundHostedWorld parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundHostedWorld parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundHostedWorld parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundHostedWorld parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundHostedWorld parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundHostedWorld parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundHostedWorld parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundHostedWorld parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundHostedWorld parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundHostedWorld.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundHostedWorld.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundHostedWorld.Builder newBuilder(InboundHostedWorld var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundHostedWorld.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundHostedWorld.Builder() : new InboundHostedWorld.Builder().mergeFrom(this);
   }

   protected InboundHostedWorld.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundHostedWorld.Builder(var1);
   }

   public static InboundHostedWorld getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundHostedWorld> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundHostedWorld> getParserForType() {
      return PARSER;
   }

   public InboundHostedWorld getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundHostedWorld.Builder> implements InboundHostedWorldOrBuilder {
      private int bitField0_;
      private Uuid worldHost_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> worldHostBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundHostedWorld_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundHostedWorld_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundHostedWorld.class, InboundHostedWorld.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InboundHostedWorld.alwaysUseFieldBuilders) {
            this.getWorldHostFieldBuilder();
         }
      }

      public InboundHostedWorld.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.worldHost_ = null;
         if (this.worldHostBuilder_ != null) {
            this.worldHostBuilder_.dispose();
            this.worldHostBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundHostedWorld_descriptor;
      }

      public InboundHostedWorld getDefaultInstanceForType() {
         return InboundHostedWorld.getDefaultInstance();
      }

      public InboundHostedWorld build() {
         InboundHostedWorld var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundHostedWorld buildPartial() {
         InboundHostedWorld var1 = new InboundHostedWorld(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundHostedWorld var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.worldHost_ = this.worldHostBuilder_ == null ? this.worldHost_ : this.worldHostBuilder_.build();
            var3 |= 1;
         }

         InboundHostedWorld var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InboundHostedWorld.Builder clone() {
         return (InboundHostedWorld.Builder)super.clone();
      }

      public InboundHostedWorld.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundHostedWorld.Builder)super.setField(var1, var2);
      }

      public InboundHostedWorld.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundHostedWorld.Builder)super.clearField(var1);
      }

      public InboundHostedWorld.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundHostedWorld.Builder)super.clearOneof(var1);
      }

      public InboundHostedWorld.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundHostedWorld.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundHostedWorld.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundHostedWorld.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundHostedWorld.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundHostedWorld) {
            return this.mergeFrom((InboundHostedWorld)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundHostedWorld.Builder mergeFrom(InboundHostedWorld var1) {
         if (var1 == InboundHostedWorld.getDefaultInstance()) {
            return this;
         }

         if (var1.hasWorldHost()) {
            this.mergeWorldHost(var1.getWorldHost());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InboundHostedWorld.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getWorldHostFieldBuilder().getBuilder(), var2);
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
      public boolean hasWorldHost() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getWorldHost() {
         if (this.worldHostBuilder_ == null) {
            return this.worldHost_ == null ? Uuid.getDefaultInstance() : this.worldHost_;
         } else {
            return this.worldHostBuilder_.getMessage();
         }
      }

      public InboundHostedWorld.Builder setWorldHost(Uuid var1) {
         if (this.worldHostBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.worldHost_ = var1;
         } else {
            this.worldHostBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundHostedWorld.Builder setWorldHost(Uuid.Builder var1) {
         if (this.worldHostBuilder_ == null) {
            this.worldHost_ = var1.build();
         } else {
            this.worldHostBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundHostedWorld.Builder mergeWorldHost(Uuid var1) {
         if (this.worldHostBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.worldHost_ != null && this.worldHost_ != Uuid.getDefaultInstance()) {
               this.getWorldHostBuilder().mergeFrom(var1);
            } else {
               this.worldHost_ = var1;
            }
         } else {
            this.worldHostBuilder_.mergeFrom(var1);
         }

         if (this.worldHost_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public InboundHostedWorld.Builder clearWorldHost() {
         this.bitField0_ &= -2;
         this.worldHost_ = null;
         if (this.worldHostBuilder_ != null) {
            this.worldHostBuilder_.dispose();
            this.worldHostBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getWorldHostBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getWorldHostFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getWorldHostOrBuilder() {
         if (this.worldHostBuilder_ != null) {
            return this.worldHostBuilder_.getMessageOrBuilder();
         } else {
            return this.worldHost_ == null ? Uuid.getDefaultInstance() : this.worldHost_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getWorldHostFieldBuilder() {
         if (this.worldHostBuilder_ == null) {
            this.worldHostBuilder_ = new SingleFieldBuilderV3<>(this.getWorldHost(), this.getParentForChildren(), this.isClean());
            this.worldHost_ = null;
         }

         return this.worldHostBuilder_;
      }

      public final InboundHostedWorld.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundHostedWorld.Builder)super.setUnknownFields(var1);
      }

      public final InboundHostedWorld.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundHostedWorld.Builder)super.mergeUnknownFields(var1);
      }
   }
}
