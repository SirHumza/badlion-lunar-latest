package com.lunarclient.websocket.skyblock.v1;

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
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EarlyInUnknown extends GeneratedMessageV3 implements EarlyInUnknownOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int POSITION_FIELD_NUMBER = 1;
   private Vector2i position_;
   private byte memoizedIsInitialized = -1;
   private static final EarlyInUnknown DEFAULT_INSTANCE = new EarlyInUnknown();
   private static final Parser<EarlyInUnknown> PARSER = new AbstractParser<EarlyInUnknown>() {
      public EarlyInUnknown parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EarlyInUnknown.Builder var3 = EarlyInUnknown.newBuilder();

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

   private EarlyInUnknown(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EarlyInUnknown() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EarlyInUnknown();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EarlyInUnknown.class, EarlyInUnknown.Builder.class);
   }

   @Override
   public boolean hasPosition() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Vector2i getPosition() {
      return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
   }

   @Override
   public Vector2iOrBuilder getPositionOrBuilder() {
      return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
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
         var1.writeMessage(1, this.getPosition());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPosition());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EarlyInUnknown)) {
         return super.equals(var1);
      } else {
         EarlyInUnknown var2 = (EarlyInUnknown)var1;
         if (this.hasPosition() != var2.hasPosition()) {
            return false;
         } else {
            return this.hasPosition() && !this.getPosition().equals(var2.getPosition()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPosition()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPosition().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EarlyInUnknown parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInUnknown parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInUnknown parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInUnknown parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInUnknown parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EarlyInUnknown parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EarlyInUnknown parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EarlyInUnknown parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EarlyInUnknown parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EarlyInUnknown parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EarlyInUnknown parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EarlyInUnknown parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EarlyInUnknown.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EarlyInUnknown.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EarlyInUnknown.Builder newBuilder(EarlyInUnknown var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EarlyInUnknown.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EarlyInUnknown.Builder() : new EarlyInUnknown.Builder().mergeFrom(this);
   }

   protected EarlyInUnknown.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EarlyInUnknown.Builder(var1);
   }

   public static EarlyInUnknown getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EarlyInUnknown> parser() {
      return PARSER;
   }

   @Override
   public Parser<EarlyInUnknown> getParserForType() {
      return PARSER;
   }

   public EarlyInUnknown getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EarlyInUnknown.Builder> implements EarlyInUnknownOrBuilder {
      private int bitField0_;
      private Vector2i position_;
      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> positionBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EarlyInUnknown.class, EarlyInUnknown.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EarlyInUnknown.alwaysUseFieldBuilders) {
            this.getPositionFieldBuilder();
         }
      }

      public EarlyInUnknown.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_EarlyInUnknown_descriptor;
      }

      public EarlyInUnknown getDefaultInstanceForType() {
         return EarlyInUnknown.getDefaultInstance();
      }

      public EarlyInUnknown build() {
         EarlyInUnknown var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EarlyInUnknown buildPartial() {
         EarlyInUnknown var1 = new EarlyInUnknown(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EarlyInUnknown var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.position_ = this.positionBuilder_ == null ? this.position_ : this.positionBuilder_.build();
            var3 |= 1;
         }

         EarlyInUnknown var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EarlyInUnknown.Builder clone() {
         return (EarlyInUnknown.Builder)super.clone();
      }

      public EarlyInUnknown.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EarlyInUnknown.Builder)super.setField(var1, var2);
      }

      public EarlyInUnknown.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EarlyInUnknown.Builder)super.clearField(var1);
      }

      public EarlyInUnknown.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EarlyInUnknown.Builder)super.clearOneof(var1);
      }

      public EarlyInUnknown.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EarlyInUnknown.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EarlyInUnknown.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EarlyInUnknown.Builder)super.addRepeatedField(var1, var2);
      }

      public EarlyInUnknown.Builder mergeFrom(Message var1) {
         if (var1 instanceof EarlyInUnknown) {
            return this.mergeFrom((EarlyInUnknown)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EarlyInUnknown.Builder mergeFrom(EarlyInUnknown var1) {
         if (var1 == EarlyInUnknown.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPosition()) {
            this.mergePosition(var1.getPosition());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EarlyInUnknown.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPositionFieldBuilder().getBuilder(), var2);
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
      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Vector2i getPosition() {
         if (this.positionBuilder_ == null) {
            return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
         } else {
            return this.positionBuilder_.getMessage();
         }
      }

      public EarlyInUnknown.Builder setPosition(Vector2i var1) {
         if (this.positionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position_ = var1;
         } else {
            this.positionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EarlyInUnknown.Builder setPosition(Vector2i.Builder var1) {
         if (this.positionBuilder_ == null) {
            this.position_ = var1.build();
         } else {
            this.positionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EarlyInUnknown.Builder mergePosition(Vector2i var1) {
         if (this.positionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != Vector2i.getDefaultInstance()) {
               this.getPositionBuilder().mergeFrom(var1);
            } else {
               this.position_ = var1;
            }
         } else {
            this.positionBuilder_.mergeFrom(var1);
         }

         if (this.position_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public EarlyInUnknown.Builder clearPosition() {
         this.bitField0_ &= -2;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector2i.Builder getPositionBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPositionFieldBuilder().getBuilder();
      }

      @Override
      public Vector2iOrBuilder getPositionOrBuilder() {
         if (this.positionBuilder_ != null) {
            return this.positionBuilder_.getMessageOrBuilder();
         } else {
            return this.position_ == null ? Vector2i.getDefaultInstance() : this.position_;
         }
      }

      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> getPositionFieldBuilder() {
         if (this.positionBuilder_ == null) {
            this.positionBuilder_ = new SingleFieldBuilderV3<>(this.getPosition(), this.getParentForChildren(), this.isClean());
            this.position_ = null;
         }

         return this.positionBuilder_;
      }

      public final EarlyInUnknown.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EarlyInUnknown.Builder)super.setUnknownFields(var1);
      }

      public final EarlyInUnknown.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EarlyInUnknown.Builder)super.mergeUnknownFields(var1);
      }
   }
}
