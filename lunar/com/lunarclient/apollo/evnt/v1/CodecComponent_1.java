package com.lunarclient.apollo.evnt.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OverrideHeartTextureMessage extends GeneratedMessageV3 implements OverrideHeartTextureMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LOCATION_X_FIELD_NUMBER = 1;
   private int locationX_ = 0;
   public static final int HARDCORE_FIELD_NUMBER = 2;
   private boolean hardcore_ = false;
   private byte memoizedIsInitialized = -1;
   private static final OverrideHeartTextureMessage DEFAULT_INSTANCE = new OverrideHeartTextureMessage();
   private static final Parser<OverrideHeartTextureMessage> PARSER = new AbstractParser<OverrideHeartTextureMessage>() {
      public OverrideHeartTextureMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideHeartTextureMessage.Builder var3 = OverrideHeartTextureMessage.newBuilder();

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

   private OverrideHeartTextureMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideHeartTextureMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideHeartTextureMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideHeartTextureMessage.class, OverrideHeartTextureMessage.Builder.class);
   }

   @Override
   public int getLocationX() {
      return this.locationX_;
   }

   @Override
   public boolean getHardcore() {
      return this.hardcore_;
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
      if (this.locationX_ != 0) {
         var1.writeInt32(1, this.locationX_);
      }

      if (this.hardcore_) {
         var1.writeBool(2, this.hardcore_);
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
      if (this.locationX_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.locationX_);
      }

      if (this.hardcore_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.hardcore_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideHeartTextureMessage)) {
         return super.equals(var1);
      } else {
         OverrideHeartTextureMessage var2 = (OverrideHeartTextureMessage)var1;
         if (this.getLocationX() != var2.getLocationX()) {
            return false;
         } else {
            return this.getHardcore() != var2.getHardcore() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getLocationX();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHardcore());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideHeartTextureMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideHeartTextureMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideHeartTextureMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideHeartTextureMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideHeartTextureMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideHeartTextureMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideHeartTextureMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideHeartTextureMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideHeartTextureMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideHeartTextureMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideHeartTextureMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideHeartTextureMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideHeartTextureMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideHeartTextureMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideHeartTextureMessage.Builder newBuilder(OverrideHeartTextureMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideHeartTextureMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideHeartTextureMessage.Builder() : new OverrideHeartTextureMessage.Builder().mergeFrom(this);
   }

   protected OverrideHeartTextureMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideHeartTextureMessage.Builder(var1);
   }

   public static OverrideHeartTextureMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideHeartTextureMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideHeartTextureMessage> getParserForType() {
      return PARSER;
   }

   public OverrideHeartTextureMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OverrideHeartTextureMessage.Builder> implements OverrideHeartTextureMessageOrBuilder {
      private int bitField0_;
      private int locationX_;
      private boolean hardcore_;

      public static final Descriptors.Descriptor getDescriptor() {
         return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideHeartTextureMessage.class, OverrideHeartTextureMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OverrideHeartTextureMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.locationX_ = 0;
         this.hardcore_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return HearttextureProto.internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_descriptor;
      }

      public OverrideHeartTextureMessage getDefaultInstanceForType() {
         return OverrideHeartTextureMessage.getDefaultInstance();
      }

      public OverrideHeartTextureMessage build() {
         OverrideHeartTextureMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideHeartTextureMessage buildPartial() {
         OverrideHeartTextureMessage var1 = new OverrideHeartTextureMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideHeartTextureMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.locationX_ = this.locationX_;
         }

         if ((var2 & 2) != 0) {
            var1.hardcore_ = this.hardcore_;
         }
      }

      public OverrideHeartTextureMessage.Builder clone() {
         return (OverrideHeartTextureMessage.Builder)super.clone();
      }

      public OverrideHeartTextureMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideHeartTextureMessage.Builder)super.setField(var1, var2);
      }

      public OverrideHeartTextureMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideHeartTextureMessage.Builder)super.clearField(var1);
      }

      public OverrideHeartTextureMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideHeartTextureMessage.Builder)super.clearOneof(var1);
      }

      public OverrideHeartTextureMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideHeartTextureMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideHeartTextureMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideHeartTextureMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideHeartTextureMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideHeartTextureMessage) {
            return this.mergeFrom((OverrideHeartTextureMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideHeartTextureMessage.Builder mergeFrom(OverrideHeartTextureMessage var1) {
         if (var1 == OverrideHeartTextureMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getLocationX() != 0) {
            this.setLocationX(var1.getLocationX());
         }

         if (var1.getHardcore()) {
            this.setHardcore(var1.getHardcore());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OverrideHeartTextureMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.locationX_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.hardcore_ = var1.readBool();
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
      public int getLocationX() {
         return this.locationX_;
      }

      public OverrideHeartTextureMessage.Builder setLocationX(int var1) {
         this.locationX_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideHeartTextureMessage.Builder clearLocationX() {
         this.bitField0_ &= -2;
         this.locationX_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHardcore() {
         return this.hardcore_;
      }

      public OverrideHeartTextureMessage.Builder setHardcore(boolean var1) {
         this.hardcore_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideHeartTextureMessage.Builder clearHardcore() {
         this.bitField0_ &= -3;
         this.hardcore_ = false;
         this.onChanged();
         return this;
      }

      public final OverrideHeartTextureMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideHeartTextureMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideHeartTextureMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideHeartTextureMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
