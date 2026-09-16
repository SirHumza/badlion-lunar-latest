package com.lunarclient.websocket.emote.v1;

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

public final class EquippedEmote extends GeneratedMessageV3 implements EquippedEmoteOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EMOTE_ID_FIELD_NUMBER = 1;
   private int emoteId_ = 0;
   public static final int SLOT_NUMBER_FIELD_NUMBER = 2;
   private int slotNumber_ = 0;
   public static final int ATTACHED_JAM_ID_FIELD_NUMBER = 3;
   private int attachedJamId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final EquippedEmote DEFAULT_INSTANCE = new EquippedEmote();
   private static final Parser<EquippedEmote> PARSER = new AbstractParser<EquippedEmote>() {
      public EquippedEmote parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquippedEmote.Builder var3 = EquippedEmote.newBuilder();

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

   private EquippedEmote(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquippedEmote() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquippedEmote();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_emote_v1_EquippedEmote_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_emote_v1_EquippedEmote_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquippedEmote.class, EquippedEmote.Builder.class);
   }

   @Override
   public int getEmoteId() {
      return this.emoteId_;
   }

   @Override
   public int getSlotNumber() {
      return this.slotNumber_;
   }

   @Override
   public int getAttachedJamId() {
      return this.attachedJamId_;
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
      if (this.emoteId_ != 0) {
         var1.writeInt32(1, this.emoteId_);
      }

      if (this.slotNumber_ != 0) {
         var1.writeInt32(2, this.slotNumber_);
      }

      if (this.attachedJamId_ != 0) {
         var1.writeInt32(3, this.attachedJamId_);
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
      if (this.emoteId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.emoteId_);
      }

      if (this.slotNumber_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.slotNumber_);
      }

      if (this.attachedJamId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.attachedJamId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EquippedEmote)) {
         return super.equals(var1);
      } else {
         EquippedEmote var2 = (EquippedEmote)var1;
         if (this.getEmoteId() != var2.getEmoteId()) {
            return false;
         } else if (this.getSlotNumber() != var2.getSlotNumber()) {
            return false;
         } else {
            return this.getAttachedJamId() != var2.getAttachedJamId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getEmoteId();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getSlotNumber();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getAttachedJamId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquippedEmote parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedEmote parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedEmote parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedEmote parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedEmote parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedEmote parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedEmote parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedEmote parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquippedEmote parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquippedEmote parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquippedEmote parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedEmote parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquippedEmote.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquippedEmote.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquippedEmote.Builder newBuilder(EquippedEmote var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquippedEmote.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquippedEmote.Builder() : new EquippedEmote.Builder().mergeFrom(this);
   }

   protected EquippedEmote.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquippedEmote.Builder(var1);
   }

   public static EquippedEmote getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquippedEmote> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquippedEmote> getParserForType() {
      return PARSER;
   }

   public EquippedEmote getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquippedEmote.Builder> implements EquippedEmoteOrBuilder {
      private int bitField0_;
      private int emoteId_;
      private int slotNumber_;
      private int attachedJamId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_emote_v1_EquippedEmote_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_emote_v1_EquippedEmote_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquippedEmote.class, EquippedEmote.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EquippedEmote.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.emoteId_ = 0;
         this.slotNumber_ = 0;
         this.attachedJamId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_emote_v1_EquippedEmote_descriptor;
      }

      public EquippedEmote getDefaultInstanceForType() {
         return EquippedEmote.getDefaultInstance();
      }

      public EquippedEmote build() {
         EquippedEmote var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquippedEmote buildPartial() {
         EquippedEmote var1 = new EquippedEmote(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EquippedEmote var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.emoteId_ = this.emoteId_;
         }

         if ((var2 & 2) != 0) {
            var1.slotNumber_ = this.slotNumber_;
         }

         if ((var2 & 4) != 0) {
            var1.attachedJamId_ = this.attachedJamId_;
         }
      }

      public EquippedEmote.Builder clone() {
         return (EquippedEmote.Builder)super.clone();
      }

      public EquippedEmote.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedEmote.Builder)super.setField(var1, var2);
      }

      public EquippedEmote.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquippedEmote.Builder)super.clearField(var1);
      }

      public EquippedEmote.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquippedEmote.Builder)super.clearOneof(var1);
      }

      public EquippedEmote.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquippedEmote.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquippedEmote.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedEmote.Builder)super.addRepeatedField(var1, var2);
      }

      public EquippedEmote.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquippedEmote) {
            return this.mergeFrom((EquippedEmote)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquippedEmote.Builder mergeFrom(EquippedEmote var1) {
         if (var1 == EquippedEmote.getDefaultInstance()) {
            return this;
         }

         if (var1.getEmoteId() != 0) {
            this.setEmoteId(var1.getEmoteId());
         }

         if (var1.getSlotNumber() != 0) {
            this.setSlotNumber(var1.getSlotNumber());
         }

         if (var1.getAttachedJamId() != 0) {
            this.setAttachedJamId(var1.getAttachedJamId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquippedEmote.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.emoteId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.slotNumber_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.attachedJamId_ = var1.readInt32();
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
      public int getEmoteId() {
         return this.emoteId_;
      }

      public EquippedEmote.Builder setEmoteId(int var1) {
         this.emoteId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquippedEmote.Builder clearEmoteId() {
         this.bitField0_ &= -2;
         this.emoteId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getSlotNumber() {
         return this.slotNumber_;
      }

      public EquippedEmote.Builder setSlotNumber(int var1) {
         this.slotNumber_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EquippedEmote.Builder clearSlotNumber() {
         this.bitField0_ &= -3;
         this.slotNumber_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getAttachedJamId() {
         return this.attachedJamId_;
      }

      public EquippedEmote.Builder setAttachedJamId(int var1) {
         this.attachedJamId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EquippedEmote.Builder clearAttachedJamId() {
         this.bitField0_ &= -5;
         this.attachedJamId_ = 0;
         this.onChanged();
         return this;
      }

      public final EquippedEmote.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquippedEmote.Builder)super.setUnknownFields(var1);
      }

      public final EquippedEmote.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquippedEmote.Builder)super.mergeUnknownFields(var1);
      }
   }
}
