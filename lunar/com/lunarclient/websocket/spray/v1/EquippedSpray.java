package com.lunarclient.websocket.spray.v1;

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

public final class EquippedSpray extends GeneratedMessageV3 implements EquippedSprayOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SPRAY_ID_FIELD_NUMBER = 1;
   private int sprayId_ = 0;
   public static final int SLOT_NUMBER_FIELD_NUMBER = 2;
   private int slotNumber_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final EquippedSpray DEFAULT_INSTANCE = new EquippedSpray();
   private static final Parser<EquippedSpray> PARSER = new AbstractParser<EquippedSpray>() {
      public EquippedSpray parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquippedSpray.Builder var3 = EquippedSpray.newBuilder();

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

   private EquippedSpray(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquippedSpray() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquippedSpray();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_spray_v1_EquippedSpray_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_spray_v1_EquippedSpray_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquippedSpray.class, EquippedSpray.Builder.class);
   }

   @Override
   public int getSprayId() {
      return this.sprayId_;
   }

   @Override
   public int getSlotNumber() {
      return this.slotNumber_;
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

      if (this.slotNumber_ != 0) {
         var1.writeInt32(2, this.slotNumber_);
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

      if (this.slotNumber_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.slotNumber_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EquippedSpray)) {
         return super.equals(var1);
      } else {
         EquippedSpray var2 = (EquippedSpray)var1;
         if (this.getSprayId() != var2.getSprayId()) {
            return false;
         } else {
            return this.getSlotNumber() != var2.getSlotNumber() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getSlotNumber();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquippedSpray parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedSpray parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedSpray parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedSpray parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedSpray parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedSpray parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedSpray parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedSpray parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquippedSpray parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquippedSpray parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquippedSpray parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedSpray parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquippedSpray.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquippedSpray.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquippedSpray.Builder newBuilder(EquippedSpray var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquippedSpray.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquippedSpray.Builder() : new EquippedSpray.Builder().mergeFrom(this);
   }

   protected EquippedSpray.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquippedSpray.Builder(var1);
   }

   public static EquippedSpray getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquippedSpray> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquippedSpray> getParserForType() {
      return PARSER;
   }

   public EquippedSpray getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquippedSpray.Builder> implements EquippedSprayOrBuilder {
      private int bitField0_;
      private int sprayId_;
      private int slotNumber_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_spray_v1_EquippedSpray_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_spray_v1_EquippedSpray_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquippedSpray.class, EquippedSpray.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EquippedSpray.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sprayId_ = 0;
         this.slotNumber_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_spray_v1_EquippedSpray_descriptor;
      }

      public EquippedSpray getDefaultInstanceForType() {
         return EquippedSpray.getDefaultInstance();
      }

      public EquippedSpray build() {
         EquippedSpray var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquippedSpray buildPartial() {
         EquippedSpray var1 = new EquippedSpray(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EquippedSpray var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.sprayId_ = this.sprayId_;
         }

         if ((var2 & 2) != 0) {
            var1.slotNumber_ = this.slotNumber_;
         }
      }

      public EquippedSpray.Builder clone() {
         return (EquippedSpray.Builder)super.clone();
      }

      public EquippedSpray.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedSpray.Builder)super.setField(var1, var2);
      }

      public EquippedSpray.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquippedSpray.Builder)super.clearField(var1);
      }

      public EquippedSpray.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquippedSpray.Builder)super.clearOneof(var1);
      }

      public EquippedSpray.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquippedSpray.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquippedSpray.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedSpray.Builder)super.addRepeatedField(var1, var2);
      }

      public EquippedSpray.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquippedSpray) {
            return this.mergeFrom((EquippedSpray)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquippedSpray.Builder mergeFrom(EquippedSpray var1) {
         if (var1 == EquippedSpray.getDefaultInstance()) {
            return this;
         }

         if (var1.getSprayId() != 0) {
            this.setSprayId(var1.getSprayId());
         }

         if (var1.getSlotNumber() != 0) {
            this.setSlotNumber(var1.getSlotNumber());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquippedSpray.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.slotNumber_ = var1.readInt32();
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

      public EquippedSpray.Builder setSprayId(int var1) {
         this.sprayId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquippedSpray.Builder clearSprayId() {
         this.bitField0_ &= -2;
         this.sprayId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getSlotNumber() {
         return this.slotNumber_;
      }

      public EquippedSpray.Builder setSlotNumber(int var1) {
         this.slotNumber_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EquippedSpray.Builder clearSlotNumber() {
         this.bitField0_ &= -3;
         this.slotNumber_ = 0;
         this.onChanged();
         return this;
      }

      public final EquippedSpray.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquippedSpray.Builder)super.setUnknownFields(var1);
      }

      public final EquippedSpray.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquippedSpray.Builder)super.mergeUnknownFields(var1);
      }
   }
}
