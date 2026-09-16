package com.lunarclient.apollo.evnt.v1;

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

public final class OpenGuiMessage extends GeneratedMessageV3 implements OpenGuiMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int GUI_TYPE_FIELD_NUMBER = 1;
   private int guiType_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OpenGuiMessage DEFAULT_INSTANCE = new OpenGuiMessage();
   private static final Parser<OpenGuiMessage> PARSER = new AbstractParser<OpenGuiMessage>() {
      public OpenGuiMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenGuiMessage.Builder var3 = OpenGuiMessage.newBuilder();

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

   private OpenGuiMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenGuiMessage() {
      this.guiType_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenGuiMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return GuiProto.internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return GuiProto.internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenGuiMessage.class, OpenGuiMessage.Builder.class);
   }

   @Override
   public int getGuiTypeValue() {
      return this.guiType_;
   }

   @Override
   public GuiType getGuiType() {
      GuiType var1 = GuiType.forNumber(this.guiType_);
      return var1 == null ? GuiType.UNRECOGNIZED : var1;
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
      if (this.guiType_ != GuiType.GUI_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.guiType_);
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
      if (this.guiType_ != GuiType.GUI_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.guiType_);
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

      if (!(var1 instanceof OpenGuiMessage)) {
         return super.equals(var1);
      }

      OpenGuiMessage var2 = (OpenGuiMessage)var1;
      return this.guiType_ != var2.guiType_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.guiType_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenGuiMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenGuiMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenGuiMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenGuiMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenGuiMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenGuiMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenGuiMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenGuiMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenGuiMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenGuiMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenGuiMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenGuiMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenGuiMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenGuiMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenGuiMessage.Builder newBuilder(OpenGuiMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenGuiMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenGuiMessage.Builder() : new OpenGuiMessage.Builder().mergeFrom(this);
   }

   protected OpenGuiMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenGuiMessage.Builder(var1);
   }

   public static OpenGuiMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenGuiMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenGuiMessage> getParserForType() {
      return PARSER;
   }

   public OpenGuiMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenGuiMessage.Builder> implements OpenGuiMessageOrBuilder {
      private int bitField0_;
      private int guiType_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return GuiProto.internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuiProto.internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenGuiMessage.class, OpenGuiMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenGuiMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.guiType_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return GuiProto.internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_descriptor;
      }

      public OpenGuiMessage getDefaultInstanceForType() {
         return OpenGuiMessage.getDefaultInstance();
      }

      public OpenGuiMessage build() {
         OpenGuiMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenGuiMessage buildPartial() {
         OpenGuiMessage var1 = new OpenGuiMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenGuiMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.guiType_ = this.guiType_;
         }
      }

      public OpenGuiMessage.Builder clone() {
         return (OpenGuiMessage.Builder)super.clone();
      }

      public OpenGuiMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenGuiMessage.Builder)super.setField(var1, var2);
      }

      public OpenGuiMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenGuiMessage.Builder)super.clearField(var1);
      }

      public OpenGuiMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenGuiMessage.Builder)super.clearOneof(var1);
      }

      public OpenGuiMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenGuiMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenGuiMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenGuiMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenGuiMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenGuiMessage) {
            return this.mergeFrom((OpenGuiMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenGuiMessage.Builder mergeFrom(OpenGuiMessage var1) {
         if (var1 == OpenGuiMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.guiType_ != 0) {
            this.setGuiTypeValue(var1.getGuiTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OpenGuiMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.guiType_ = var1.readEnum();
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
      public int getGuiTypeValue() {
         return this.guiType_;
      }

      public OpenGuiMessage.Builder setGuiTypeValue(int var1) {
         this.guiType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public GuiType getGuiType() {
         GuiType var1 = GuiType.forNumber(this.guiType_);
         return var1 == null ? GuiType.UNRECOGNIZED : var1;
      }

      public OpenGuiMessage.Builder setGuiType(GuiType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.guiType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OpenGuiMessage.Builder clearGuiType() {
         this.bitField0_ &= -2;
         this.guiType_ = 0;
         this.onChanged();
         return this;
      }

      public final OpenGuiMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenGuiMessage.Builder)super.setUnknownFields(var1);
      }

      public final OpenGuiMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenGuiMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
