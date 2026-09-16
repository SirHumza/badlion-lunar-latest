package com.lunarclient.apollo.limb.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HideBodyPartMessage extends GeneratedMessageV3 implements HideBodyPartMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int BODY_PARTS_FIELD_NUMBER = 2;
   private List<Integer> bodyParts_;
   private static final Internal.ListAdapter.Converter<Integer, BodyPart> bodyParts_converter_ = new Internal.ListAdapter.Converter<Integer, BodyPart>() {
      public BodyPart convert(Integer var1) {
         BodyPart var2 = BodyPart.forNumber(var1);
         return var2 == null ? BodyPart.UNRECOGNIZED : var2;
      }
   };
   private int bodyPartsMemoizedSerializedSize;
   private byte memoizedIsInitialized = -1;
   private static final HideBodyPartMessage DEFAULT_INSTANCE = new HideBodyPartMessage();
   private static final Parser<HideBodyPartMessage> PARSER = new AbstractParser<HideBodyPartMessage>() {
      public HideBodyPartMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HideBodyPartMessage.Builder var3 = HideBodyPartMessage.newBuilder();

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

   private HideBodyPartMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HideBodyPartMessage() {
      this.bodyParts_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HideBodyPartMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HideBodyPartMessage.class, HideBodyPartMessage.Builder.class);
   }

   @Override
   public boolean hasPlayerUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPlayerUuid() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public UuidOrBuilder getPlayerUuidOrBuilder() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public List<BodyPart> getBodyPartsList() {
      return new Internal.ListAdapter<>(this.bodyParts_, bodyParts_converter_);
   }

   @Override
   public int getBodyPartsCount() {
      return this.bodyParts_.size();
   }

   @Override
   public BodyPart getBodyParts(int var1) {
      return bodyParts_converter_.convert(this.bodyParts_.get(var1));
   }

   @Override
   public List<Integer> getBodyPartsValueList() {
      return this.bodyParts_;
   }

   @Override
   public int getBodyPartsValue(int var1) {
      return this.bodyParts_.get(var1);
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
      this.getSerializedSize();
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getPlayerUuid());
      }

      if (this.getBodyPartsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.bodyPartsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.bodyParts_.size(); var2++) {
         var1.writeEnumNoTag(this.bodyParts_.get(var2));
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.bodyParts_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.bodyParts_.get(var3));
      }

      var1 += var2;
      if (!this.getBodyPartsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.bodyPartsMemoizedSerializedSize = var2;
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HideBodyPartMessage)) {
         return super.equals(var1);
      } else {
         HideBodyPartMessage var2 = (HideBodyPartMessage)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else {
            return !this.bodyParts_.equals(var2.bodyParts_) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      if (this.getBodyPartsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.bodyParts_.hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HideBodyPartMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HideBodyPartMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HideBodyPartMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HideBodyPartMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HideBodyPartMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HideBodyPartMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HideBodyPartMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HideBodyPartMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HideBodyPartMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HideBodyPartMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HideBodyPartMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HideBodyPartMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HideBodyPartMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HideBodyPartMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HideBodyPartMessage.Builder newBuilder(HideBodyPartMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HideBodyPartMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HideBodyPartMessage.Builder() : new HideBodyPartMessage.Builder().mergeFrom(this);
   }

   protected HideBodyPartMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HideBodyPartMessage.Builder(var1);
   }

   public static HideBodyPartMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HideBodyPartMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<HideBodyPartMessage> getParserForType() {
      return PARSER;
   }

   public HideBodyPartMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HideBodyPartMessage.Builder> implements HideBodyPartMessageOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private List<Integer> bodyParts_ = Collections.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HideBodyPartMessage.class, HideBodyPartMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (HideBodyPartMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public HideBodyPartMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.bodyParts_ = Collections.emptyList();
         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_limb_v1_HideBodyPartMessage_descriptor;
      }

      public HideBodyPartMessage getDefaultInstanceForType() {
         return HideBodyPartMessage.getDefaultInstance();
      }

      public HideBodyPartMessage build() {
         HideBodyPartMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HideBodyPartMessage buildPartial() {
         HideBodyPartMessage var1 = new HideBodyPartMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(HideBodyPartMessage var1) {
         if ((this.bitField0_ & 2) != 0) {
            this.bodyParts_ = Collections.unmodifiableList(this.bodyParts_);
            this.bitField0_ &= -3;
         }

         var1.bodyParts_ = this.bodyParts_;
      }

      private void buildPartial0(HideBodyPartMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         HideBodyPartMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public HideBodyPartMessage.Builder clone() {
         return (HideBodyPartMessage.Builder)super.clone();
      }

      public HideBodyPartMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HideBodyPartMessage.Builder)super.setField(var1, var2);
      }

      public HideBodyPartMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HideBodyPartMessage.Builder)super.clearField(var1);
      }

      public HideBodyPartMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HideBodyPartMessage.Builder)super.clearOneof(var1);
      }

      public HideBodyPartMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HideBodyPartMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HideBodyPartMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HideBodyPartMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public HideBodyPartMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof HideBodyPartMessage) {
            return this.mergeFrom((HideBodyPartMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HideBodyPartMessage.Builder mergeFrom(HideBodyPartMessage var1) {
         if (var1 == HideBodyPartMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (!var1.bodyParts_.isEmpty()) {
            if (this.bodyParts_.isEmpty()) {
               this.bodyParts_ = var1.bodyParts_;
               this.bitField0_ &= -3;
            } else {
               this.ensureBodyPartsIsMutable();
               this.bodyParts_.addAll(var1.bodyParts_);
            }

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

      public HideBodyPartMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     int var13 = var1.readEnum();
                     this.ensureBodyPartsIsMutable();
                     this.bodyParts_.add(var13);
                     break;
                  case 18:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureBodyPartsIsMutable();
                        this.bodyParts_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public HideBodyPartMessage.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public HideBodyPartMessage.Builder clearPlayerUuid() {
         this.bitField0_ &= -2;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         if (this.playerUuidBuilder_ != null) {
            return this.playerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
            this.playerUuid_ = null;
         }

         return this.playerUuidBuilder_;
      }

      private void ensureBodyPartsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.bodyParts_ = new ArrayList<>(this.bodyParts_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<BodyPart> getBodyPartsList() {
         return new Internal.ListAdapter<>(this.bodyParts_, HideBodyPartMessage.bodyParts_converter_);
      }

      @Override
      public int getBodyPartsCount() {
         return this.bodyParts_.size();
      }

      @Override
      public BodyPart getBodyParts(int var1) {
         return HideBodyPartMessage.bodyParts_converter_.convert(this.bodyParts_.get(var1));
      }

      public HideBodyPartMessage.Builder setBodyParts(int var1, BodyPart var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureBodyPartsIsMutable();
         this.bodyParts_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder addBodyParts(BodyPart var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureBodyPartsIsMutable();
         this.bodyParts_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder addAllBodyParts(Iterable<? extends BodyPart> var1) {
         this.ensureBodyPartsIsMutable();

         for (BodyPart var3 : var1) {
            this.bodyParts_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder clearBodyParts() {
         this.bodyParts_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getBodyPartsValueList() {
         return Collections.unmodifiableList(this.bodyParts_);
      }

      @Override
      public int getBodyPartsValue(int var1) {
         return this.bodyParts_.get(var1);
      }

      public HideBodyPartMessage.Builder setBodyPartsValue(int var1, int var2) {
         this.ensureBodyPartsIsMutable();
         this.bodyParts_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder addBodyPartsValue(int var1) {
         this.ensureBodyPartsIsMutable();
         this.bodyParts_.add(var1);
         this.onChanged();
         return this;
      }

      public HideBodyPartMessage.Builder addAllBodyPartsValue(Iterable<Integer> var1) {
         this.ensureBodyPartsIsMutable();

         for (int var3 : var1) {
            this.bodyParts_.add(var3);
         }

         this.onChanged();
         return this;
      }

      public final HideBodyPartMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HideBodyPartMessage.Builder)super.setUnknownFields(var1);
      }

      public final HideBodyPartMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HideBodyPartMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
