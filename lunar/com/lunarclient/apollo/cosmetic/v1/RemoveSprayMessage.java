package com.lunarclient.apollo.cosmetic.v1;

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
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RemoveSprayMessage extends GeneratedMessageV3 implements RemoveSprayMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SPRAY_ID_FIELD_NUMBER = 1;
   private int sprayId_ = 0;
   public static final int LOCATION_FIELD_NUMBER = 2;
   private BlockLocation location_;
   private byte memoizedIsInitialized = -1;
   private static final RemoveSprayMessage DEFAULT_INSTANCE = new RemoveSprayMessage();
   private static final Parser<RemoveSprayMessage> PARSER = new AbstractParser<RemoveSprayMessage>() {
      public RemoveSprayMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveSprayMessage.Builder var3 = RemoveSprayMessage.newBuilder();

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

   private RemoveSprayMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveSprayMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveSprayMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveSprayMessage.class, RemoveSprayMessage.Builder.class);
   }

   @Override
   public int getSprayId() {
      return this.sprayId_;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public BlockLocation getLocation() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public BlockLocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
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
      if (this.sprayId_ != 0) {
         var1.writeInt32(1, this.sprayId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getLocation());
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
      if (this.sprayId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.sprayId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLocation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RemoveSprayMessage)) {
         return super.equals(var1);
      } else {
         RemoveSprayMessage var2 = (RemoveSprayMessage)var1;
         if (this.getSprayId() != var2.getSprayId()) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else {
            return this.hasLocation() && !this.getLocation().equals(var2.getLocation()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSprayId();
      if (this.hasLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveSprayMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveSprayMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveSprayMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveSprayMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveSprayMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveSprayMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveSprayMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveSprayMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveSprayMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveSprayMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveSprayMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveSprayMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveSprayMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveSprayMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveSprayMessage.Builder newBuilder(RemoveSprayMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveSprayMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveSprayMessage.Builder() : new RemoveSprayMessage.Builder().mergeFrom(this);
   }

   protected RemoveSprayMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveSprayMessage.Builder(var1);
   }

   public static RemoveSprayMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveSprayMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveSprayMessage> getParserForType() {
      return PARSER;
   }

   public RemoveSprayMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveSprayMessage.Builder> implements RemoveSprayMessageOrBuilder {
      private int bitField0_;
      private int sprayId_;
      private BlockLocation location_;
      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> locationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveSprayMessage.class, RemoveSprayMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RemoveSprayMessage.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
         }
      }

      public RemoveSprayMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sprayId_ = 0;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_RemoveSprayMessage_descriptor;
      }

      public RemoveSprayMessage getDefaultInstanceForType() {
         return RemoveSprayMessage.getDefaultInstance();
      }

      public RemoveSprayMessage build() {
         RemoveSprayMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveSprayMessage buildPartial() {
         RemoveSprayMessage var1 = new RemoveSprayMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveSprayMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.sprayId_ = this.sprayId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         RemoveSprayMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RemoveSprayMessage.Builder clone() {
         return (RemoveSprayMessage.Builder)super.clone();
      }

      public RemoveSprayMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveSprayMessage.Builder)super.setField(var1, var2);
      }

      public RemoveSprayMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveSprayMessage.Builder)super.clearField(var1);
      }

      public RemoveSprayMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveSprayMessage.Builder)super.clearOneof(var1);
      }

      public RemoveSprayMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveSprayMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveSprayMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveSprayMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveSprayMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveSprayMessage) {
            return this.mergeFrom((RemoveSprayMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveSprayMessage.Builder mergeFrom(RemoveSprayMessage var1) {
         if (var1 == RemoveSprayMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getSprayId() != 0) {
            this.setSprayId(var1.getSprayId());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemoveSprayMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.sprayId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
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
      public int getSprayId() {
         return this.sprayId_;
      }

      public RemoveSprayMessage.Builder setSprayId(int var1) {
         this.sprayId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveSprayMessage.Builder clearSprayId() {
         this.bitField0_ &= -2;
         this.sprayId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public BlockLocation getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public RemoveSprayMessage.Builder setLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemoveSprayMessage.Builder setLocation(BlockLocation.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemoveSprayMessage.Builder mergeLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.location_ != null && this.location_ != BlockLocation.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public RemoveSprayMessage.Builder clearLocation() {
         this.bitField0_ &= -3;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public BlockLocation.Builder getLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public BlockLocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      public final RemoveSprayMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveSprayMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveSprayMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveSprayMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
