package com.lunarclient.websocket.hostedworld.v1;

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
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class HostedWorldAvailablePush extends GeneratedMessageV3 implements HostedWorldAvailablePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int WORLD_HOST_FIELD_NUMBER = 1;
   private UuidAndUsername worldHost_;
   private byte memoizedIsInitialized = -1;
   private static final HostedWorldAvailablePush DEFAULT_INSTANCE = new HostedWorldAvailablePush();
   private static final Parser<HostedWorldAvailablePush> PARSER = new AbstractParser<HostedWorldAvailablePush>() {
      public HostedWorldAvailablePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HostedWorldAvailablePush.Builder var3 = HostedWorldAvailablePush.newBuilder();

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

   private HostedWorldAvailablePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HostedWorldAvailablePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HostedWorldAvailablePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HostedWorldAvailablePush.class, HostedWorldAvailablePush.Builder.class);
   }

   @Override
   public boolean hasWorldHost() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getWorldHost() {
      return this.worldHost_ == null ? UuidAndUsername.getDefaultInstance() : this.worldHost_;
   }

   @Override
   public UuidAndUsernameOrBuilder getWorldHostOrBuilder() {
      return this.worldHost_ == null ? UuidAndUsername.getDefaultInstance() : this.worldHost_;
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
      } else if (!(var1 instanceof HostedWorldAvailablePush)) {
         return super.equals(var1);
      } else {
         HostedWorldAvailablePush var2 = (HostedWorldAvailablePush)var1;
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

   public static HostedWorldAvailablePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldAvailablePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldAvailablePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldAvailablePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldAvailablePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldAvailablePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldAvailablePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldAvailablePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldAvailablePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HostedWorldAvailablePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldAvailablePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldAvailablePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HostedWorldAvailablePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HostedWorldAvailablePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HostedWorldAvailablePush.Builder newBuilder(HostedWorldAvailablePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HostedWorldAvailablePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HostedWorldAvailablePush.Builder() : new HostedWorldAvailablePush.Builder().mergeFrom(this);
   }

   protected HostedWorldAvailablePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HostedWorldAvailablePush.Builder(var1);
   }

   public static HostedWorldAvailablePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HostedWorldAvailablePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<HostedWorldAvailablePush> getParserForType() {
      return PARSER;
   }

   public HostedWorldAvailablePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HostedWorldAvailablePush.Builder> implements HostedWorldAvailablePushOrBuilder {
      private int bitField0_;
      private UuidAndUsername worldHost_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> worldHostBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HostedWorldAvailablePush.class, HostedWorldAvailablePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (HostedWorldAvailablePush.alwaysUseFieldBuilders) {
            this.getWorldHostFieldBuilder();
         }
      }

      public HostedWorldAvailablePush.Builder clear() {
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
         return PushProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldAvailablePush_descriptor;
      }

      public HostedWorldAvailablePush getDefaultInstanceForType() {
         return HostedWorldAvailablePush.getDefaultInstance();
      }

      public HostedWorldAvailablePush build() {
         HostedWorldAvailablePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HostedWorldAvailablePush buildPartial() {
         HostedWorldAvailablePush var1 = new HostedWorldAvailablePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(HostedWorldAvailablePush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.worldHost_ = this.worldHostBuilder_ == null ? this.worldHost_ : this.worldHostBuilder_.build();
            var3 |= 1;
         }

         HostedWorldAvailablePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public HostedWorldAvailablePush.Builder clone() {
         return (HostedWorldAvailablePush.Builder)super.clone();
      }

      public HostedWorldAvailablePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldAvailablePush.Builder)super.setField(var1, var2);
      }

      public HostedWorldAvailablePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HostedWorldAvailablePush.Builder)super.clearField(var1);
      }

      public HostedWorldAvailablePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HostedWorldAvailablePush.Builder)super.clearOneof(var1);
      }

      public HostedWorldAvailablePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HostedWorldAvailablePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HostedWorldAvailablePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldAvailablePush.Builder)super.addRepeatedField(var1, var2);
      }

      public HostedWorldAvailablePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof HostedWorldAvailablePush) {
            return this.mergeFrom((HostedWorldAvailablePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HostedWorldAvailablePush.Builder mergeFrom(HostedWorldAvailablePush var1) {
         if (var1 == HostedWorldAvailablePush.getDefaultInstance()) {
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

      public HostedWorldAvailablePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
      public UuidAndUsername getWorldHost() {
         if (this.worldHostBuilder_ == null) {
            return this.worldHost_ == null ? UuidAndUsername.getDefaultInstance() : this.worldHost_;
         } else {
            return this.worldHostBuilder_.getMessage();
         }
      }

      public HostedWorldAvailablePush.Builder setWorldHost(UuidAndUsername var1) {
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

      public HostedWorldAvailablePush.Builder setWorldHost(UuidAndUsername.Builder var1) {
         if (this.worldHostBuilder_ == null) {
            this.worldHost_ = var1.build();
         } else {
            this.worldHostBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HostedWorldAvailablePush.Builder mergeWorldHost(UuidAndUsername var1) {
         if (this.worldHostBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.worldHost_ != null && this.worldHost_ != UuidAndUsername.getDefaultInstance()) {
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

      public HostedWorldAvailablePush.Builder clearWorldHost() {
         this.bitField0_ &= -2;
         this.worldHost_ = null;
         if (this.worldHostBuilder_ != null) {
            this.worldHostBuilder_.dispose();
            this.worldHostBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getWorldHostBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getWorldHostFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getWorldHostOrBuilder() {
         if (this.worldHostBuilder_ != null) {
            return this.worldHostBuilder_.getMessageOrBuilder();
         } else {
            return this.worldHost_ == null ? UuidAndUsername.getDefaultInstance() : this.worldHost_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getWorldHostFieldBuilder() {
         if (this.worldHostBuilder_ == null) {
            this.worldHostBuilder_ = new SingleFieldBuilderV3<>(this.getWorldHost(), this.getParentForChildren(), this.isClean());
            this.worldHost_ = null;
         }

         return this.worldHostBuilder_;
      }

      public final HostedWorldAvailablePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldAvailablePush.Builder)super.setUnknownFields(var1);
      }

      public final HostedWorldAvailablePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldAvailablePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
