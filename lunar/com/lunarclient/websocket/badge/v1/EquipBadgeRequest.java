package com.lunarclient.websocket.badge.v1;

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

public final class EquipBadgeRequest extends GeneratedMessageV3 implements EquipBadgeRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int BADGE_ID_FIELD_NUMBER = 1;
   private int badgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final EquipBadgeRequest DEFAULT_INSTANCE = new EquipBadgeRequest();
   private static final Parser<EquipBadgeRequest> PARSER = new AbstractParser<EquipBadgeRequest>() {
      public EquipBadgeRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquipBadgeRequest.Builder var3 = EquipBadgeRequest.newBuilder();

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

   private EquipBadgeRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquipBadgeRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquipBadgeRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquipBadgeRequest.class, EquipBadgeRequest.Builder.class);
   }

   @Override
   public int getBadgeId() {
      return this.badgeId_;
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
      if (this.badgeId_ != 0) {
         var1.writeInt32(1, this.badgeId_);
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
      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.badgeId_);
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

      if (!(var1 instanceof EquipBadgeRequest)) {
         return super.equals(var1);
      }

      EquipBadgeRequest var2 = (EquipBadgeRequest)var1;
      return this.getBadgeId() != var2.getBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquipBadgeRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipBadgeRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipBadgeRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipBadgeRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipBadgeRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipBadgeRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipBadgeRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquipBadgeRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquipBadgeRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquipBadgeRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquipBadgeRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquipBadgeRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquipBadgeRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquipBadgeRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquipBadgeRequest.Builder newBuilder(EquipBadgeRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquipBadgeRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquipBadgeRequest.Builder() : new EquipBadgeRequest.Builder().mergeFrom(this);
   }

   protected EquipBadgeRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquipBadgeRequest.Builder(var1);
   }

   public static EquipBadgeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquipBadgeRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquipBadgeRequest> getParserForType() {
      return PARSER;
   }

   public EquipBadgeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquipBadgeRequest.Builder> implements EquipBadgeRequestOrBuilder {
      private int bitField0_;
      private int badgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquipBadgeRequest.class, EquipBadgeRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EquipBadgeRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.badgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_descriptor;
      }

      public EquipBadgeRequest getDefaultInstanceForType() {
         return EquipBadgeRequest.getDefaultInstance();
      }

      public EquipBadgeRequest build() {
         EquipBadgeRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquipBadgeRequest buildPartial() {
         EquipBadgeRequest var1 = new EquipBadgeRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EquipBadgeRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.badgeId_ = this.badgeId_;
         }
      }

      public EquipBadgeRequest.Builder clone() {
         return (EquipBadgeRequest.Builder)super.clone();
      }

      public EquipBadgeRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquipBadgeRequest.Builder)super.setField(var1, var2);
      }

      public EquipBadgeRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquipBadgeRequest.Builder)super.clearField(var1);
      }

      public EquipBadgeRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquipBadgeRequest.Builder)super.clearOneof(var1);
      }

      public EquipBadgeRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquipBadgeRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquipBadgeRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquipBadgeRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public EquipBadgeRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquipBadgeRequest) {
            return this.mergeFrom((EquipBadgeRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquipBadgeRequest.Builder mergeFrom(EquipBadgeRequest var1) {
         if (var1 == EquipBadgeRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getBadgeId() != 0) {
            this.setBadgeId(var1.getBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquipBadgeRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.badgeId_ = var1.readInt32();
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
      public int getBadgeId() {
         return this.badgeId_;
      }

      public EquipBadgeRequest.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquipBadgeRequest.Builder clearBadgeId() {
         this.bitField0_ &= -2;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final EquipBadgeRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquipBadgeRequest.Builder)super.setUnknownFields(var1);
      }

      public final EquipBadgeRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquipBadgeRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
