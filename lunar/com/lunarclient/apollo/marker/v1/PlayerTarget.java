package com.lunarclient.apollo.marker.v1;

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
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerTarget extends GeneratedMessageV3 implements PlayerTargetOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int UUID_FIELD_NUMBER = 1;
   private Uuid uuid_;
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   private byte memoizedIsInitialized = -1;
   private static final PlayerTarget DEFAULT_INSTANCE = new PlayerTarget();
   private static final Parser<PlayerTarget> PARSER = new AbstractParser<PlayerTarget>() {
      public PlayerTarget parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerTarget.Builder var3 = PlayerTarget.newBuilder();

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

   private PlayerTarget(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerTarget() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerTarget();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_PlayerTarget_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_PlayerTarget_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerTarget.class, PlayerTarget.Builder.class);
   }

   @Override
   public boolean hasUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getUuid() {
      return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
   }

   @Override
   public UuidOrBuilder getUuidOrBuilder() {
      return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
         var1.writeMessage(1, this.getUuid());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getUuid());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerTarget)) {
         return super.equals(var1);
      } else {
         PlayerTarget var2 = (PlayerTarget)var1;
         if (this.hasUuid() != var2.hasUuid()) {
            return false;
         } else if (this.hasUuid() && !this.getUuid().equals(var2.getUuid())) {
            return false;
         } else {
            return !this.getName().equals(var2.getName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getUuid().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerTarget parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerTarget parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerTarget parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerTarget parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerTarget parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerTarget parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerTarget parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerTarget.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerTarget.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerTarget.Builder newBuilder(PlayerTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerTarget.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerTarget.Builder() : new PlayerTarget.Builder().mergeFrom(this);
   }

   protected PlayerTarget.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerTarget.Builder(var1);
   }

   public static PlayerTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerTarget> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerTarget> getParserForType() {
      return PARSER;
   }

   public PlayerTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerTarget.Builder> implements PlayerTargetOrBuilder {
      private int bitField0_;
      private Uuid uuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> uuidBuilder_;
      private Object name_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_PlayerTarget_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_PlayerTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerTarget.class, PlayerTarget.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerTarget.alwaysUseFieldBuilders) {
            this.getUuidFieldBuilder();
         }
      }

      public PlayerTarget.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.uuid_ = null;
         if (this.uuidBuilder_ != null) {
            this.uuidBuilder_.dispose();
            this.uuidBuilder_ = null;
         }

         this.name_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_PlayerTarget_descriptor;
      }

      public PlayerTarget getDefaultInstanceForType() {
         return PlayerTarget.getDefaultInstance();
      }

      public PlayerTarget build() {
         PlayerTarget var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerTarget buildPartial() {
         PlayerTarget var1 = new PlayerTarget(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerTarget var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.uuid_ = this.uuidBuilder_ == null ? this.uuid_ : this.uuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         PlayerTarget var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerTarget.Builder clone() {
         return (PlayerTarget.Builder)super.clone();
      }

      public PlayerTarget.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerTarget.Builder)super.setField(var1, var2);
      }

      public PlayerTarget.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerTarget.Builder)super.clearField(var1);
      }

      public PlayerTarget.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerTarget.Builder)super.clearOneof(var1);
      }

      public PlayerTarget.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerTarget.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerTarget.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerTarget.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerTarget.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerTarget) {
            return this.mergeFrom((PlayerTarget)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerTarget.Builder mergeFrom(PlayerTarget var1) {
         if (var1 == PlayerTarget.getDefaultInstance()) {
            return this;
         }

         if (var1.hasUuid()) {
            this.mergeUuid(var1.getUuid());
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerTarget.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
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
      public boolean hasUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getUuid() {
         if (this.uuidBuilder_ == null) {
            return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
         } else {
            return this.uuidBuilder_.getMessage();
         }
      }

      public PlayerTarget.Builder setUuid(Uuid var1) {
         if (this.uuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.uuid_ = var1;
         } else {
            this.uuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerTarget.Builder setUuid(Uuid.Builder var1) {
         if (this.uuidBuilder_ == null) {
            this.uuid_ = var1.build();
         } else {
            this.uuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerTarget.Builder mergeUuid(Uuid var1) {
         if (this.uuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.uuid_ != null && this.uuid_ != Uuid.getDefaultInstance()) {
               this.getUuidBuilder().mergeFrom(var1);
            } else {
               this.uuid_ = var1;
            }
         } else {
            this.uuidBuilder_.mergeFrom(var1);
         }

         if (this.uuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PlayerTarget.Builder clearUuid() {
         this.bitField0_ &= -2;
         this.uuid_ = null;
         if (this.uuidBuilder_ != null) {
            this.uuidBuilder_.dispose();
            this.uuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getUuidOrBuilder() {
         if (this.uuidBuilder_ != null) {
            return this.uuidBuilder_.getMessageOrBuilder();
         } else {
            return this.uuid_ == null ? Uuid.getDefaultInstance() : this.uuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getUuidFieldBuilder() {
         if (this.uuidBuilder_ == null) {
            this.uuidBuilder_ = new SingleFieldBuilderV3<>(this.getUuid(), this.getParentForChildren(), this.isClean());
            this.uuid_ = null;
         }

         return this.uuidBuilder_;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerTarget.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerTarget.Builder clearName() {
         this.name_ = PlayerTarget.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public PlayerTarget.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerTarget.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final PlayerTarget.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerTarget.Builder)super.setUnknownFields(var1);
      }

      public final PlayerTarget.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerTarget.Builder)super.mergeUnknownFields(var1);
      }
   }
}
