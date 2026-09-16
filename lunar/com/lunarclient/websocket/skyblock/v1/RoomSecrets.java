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

public final class RoomSecrets extends GeneratedMessageV3 implements RoomSecretsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int POSITION_FIELD_NUMBER = 1;
   private Vector2i position_;
   public static final int CURRENT_FIELD_NUMBER = 2;
   private int current_ = 0;
   public static final int MAX_FIELD_NUMBER = 3;
   private int max_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RoomSecrets DEFAULT_INSTANCE = new RoomSecrets();
   private static final Parser<RoomSecrets> PARSER = new AbstractParser<RoomSecrets>() {
      public RoomSecrets parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RoomSecrets.Builder var3 = RoomSecrets.newBuilder();

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

   private RoomSecrets(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RoomSecrets() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RoomSecrets();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RoomSecrets.class, RoomSecrets.Builder.class);
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
   public int getCurrent() {
      return this.current_;
   }

   @Override
   public int getMax() {
      return this.max_;
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

      if (this.current_ != 0) {
         var1.writeInt32(2, this.current_);
      }

      if (this.max_ != 0) {
         var1.writeInt32(3, this.max_);
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

      if (this.current_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.current_);
      }

      if (this.max_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.max_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RoomSecrets)) {
         return super.equals(var1);
      } else {
         RoomSecrets var2 = (RoomSecrets)var1;
         if (this.hasPosition() != var2.hasPosition()) {
            return false;
         } else if (this.hasPosition() && !this.getPosition().equals(var2.getPosition())) {
            return false;
         } else if (this.getCurrent() != var2.getCurrent()) {
            return false;
         } else {
            return this.getMax() != var2.getMax() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getCurrent();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getMax();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RoomSecrets parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RoomSecrets parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RoomSecrets parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RoomSecrets parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RoomSecrets parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RoomSecrets parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RoomSecrets parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoomSecrets parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RoomSecrets parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RoomSecrets parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RoomSecrets parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoomSecrets parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RoomSecrets.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RoomSecrets.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RoomSecrets.Builder newBuilder(RoomSecrets var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RoomSecrets.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RoomSecrets.Builder() : new RoomSecrets.Builder().mergeFrom(this);
   }

   protected RoomSecrets.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RoomSecrets.Builder(var1);
   }

   public static RoomSecrets getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RoomSecrets> parser() {
      return PARSER;
   }

   @Override
   public Parser<RoomSecrets> getParserForType() {
      return PARSER;
   }

   public RoomSecrets getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RoomSecrets.Builder> implements RoomSecretsOrBuilder {
      private int bitField0_;
      private Vector2i position_;
      private SingleFieldBuilderV3<Vector2i, Vector2i.Builder, Vector2iOrBuilder> positionBuilder_;
      private int current_;
      private int max_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RoomSecrets.class, RoomSecrets.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RoomSecrets.alwaysUseFieldBuilders) {
            this.getPositionFieldBuilder();
         }
      }

      public RoomSecrets.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.current_ = 0;
         this.max_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_skyblock_v1_RoomSecrets_descriptor;
      }

      public RoomSecrets getDefaultInstanceForType() {
         return RoomSecrets.getDefaultInstance();
      }

      public RoomSecrets build() {
         RoomSecrets var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RoomSecrets buildPartial() {
         RoomSecrets var1 = new RoomSecrets(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RoomSecrets var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.position_ = this.positionBuilder_ == null ? this.position_ : this.positionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.current_ = this.current_;
         }

         if ((var2 & 4) != 0) {
            var1.max_ = this.max_;
         }

         RoomSecrets var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RoomSecrets.Builder clone() {
         return (RoomSecrets.Builder)super.clone();
      }

      public RoomSecrets.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RoomSecrets.Builder)super.setField(var1, var2);
      }

      public RoomSecrets.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RoomSecrets.Builder)super.clearField(var1);
      }

      public RoomSecrets.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RoomSecrets.Builder)super.clearOneof(var1);
      }

      public RoomSecrets.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RoomSecrets.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RoomSecrets.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RoomSecrets.Builder)super.addRepeatedField(var1, var2);
      }

      public RoomSecrets.Builder mergeFrom(Message var1) {
         if (var1 instanceof RoomSecrets) {
            return this.mergeFrom((RoomSecrets)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RoomSecrets.Builder mergeFrom(RoomSecrets var1) {
         if (var1 == RoomSecrets.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPosition()) {
            this.mergePosition(var1.getPosition());
         }

         if (var1.getCurrent() != 0) {
            this.setCurrent(var1.getCurrent());
         }

         if (var1.getMax() != 0) {
            this.setMax(var1.getMax());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RoomSecrets.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.current_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.max_ = var1.readInt32();
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

      public RoomSecrets.Builder setPosition(Vector2i var1) {
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

      public RoomSecrets.Builder setPosition(Vector2i.Builder var1) {
         if (this.positionBuilder_ == null) {
            this.position_ = var1.build();
         } else {
            this.positionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RoomSecrets.Builder mergePosition(Vector2i var1) {
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

      public RoomSecrets.Builder clearPosition() {
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

      @Override
      public int getCurrent() {
         return this.current_;
      }

      public RoomSecrets.Builder setCurrent(int var1) {
         this.current_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RoomSecrets.Builder clearCurrent() {
         this.bitField0_ &= -3;
         this.current_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getMax() {
         return this.max_;
      }

      public RoomSecrets.Builder setMax(int var1) {
         this.max_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RoomSecrets.Builder clearMax() {
         this.bitField0_ &= -5;
         this.max_ = 0;
         this.onChanged();
         return this;
      }

      public final RoomSecrets.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RoomSecrets.Builder)super.setUnknownFields(var1);
      }

      public final RoomSecrets.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RoomSecrets.Builder)super.mergeUnknownFields(var1);
      }
   }
}
