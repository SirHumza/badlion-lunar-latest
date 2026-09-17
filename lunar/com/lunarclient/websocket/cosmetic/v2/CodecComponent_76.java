package com.lunarclient.websocket.cosmetic.v2;

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

public final class RadioPlayingCondition extends GeneratedMessageV3 implements RadioPlayingConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RadioPlayingCondition DEFAULT_INSTANCE = new RadioPlayingCondition();
   private static final Parser<RadioPlayingCondition> PARSER = new AbstractParser<RadioPlayingCondition>() {
      public RadioPlayingCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RadioPlayingCondition.Builder var3 = RadioPlayingCondition.newBuilder();

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

   private RadioPlayingCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RadioPlayingCondition() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RadioPlayingCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RadioPlayingCondition.class, RadioPlayingCondition.Builder.class);
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
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var2 = 0;
      var2 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var2;
      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof RadioPlayingCondition)) {
         return super.equals(var1);
      }

      RadioPlayingCondition var2 = (RadioPlayingCondition)var1;
      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RadioPlayingCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioPlayingCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioPlayingCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioPlayingCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioPlayingCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioPlayingCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioPlayingCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioPlayingCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RadioPlayingCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RadioPlayingCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RadioPlayingCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioPlayingCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RadioPlayingCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RadioPlayingCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RadioPlayingCondition.Builder newBuilder(RadioPlayingCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RadioPlayingCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RadioPlayingCondition.Builder() : new RadioPlayingCondition.Builder().mergeFrom(this);
   }

   protected RadioPlayingCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RadioPlayingCondition.Builder(var1);
   }

   public static RadioPlayingCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RadioPlayingCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<RadioPlayingCondition> getParserForType() {
      return PARSER;
   }

   public RadioPlayingCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RadioPlayingCondition.Builder> implements RadioPlayingConditionOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RadioPlayingCondition.class, RadioPlayingCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RadioPlayingCondition.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_RadioPlayingCondition_descriptor;
      }

      public RadioPlayingCondition getDefaultInstanceForType() {
         return RadioPlayingCondition.getDefaultInstance();
      }

      public RadioPlayingCondition build() {
         RadioPlayingCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RadioPlayingCondition buildPartial() {
         RadioPlayingCondition var1 = new RadioPlayingCondition(this);
         this.onBuilt();
         return var1;
      }

      public RadioPlayingCondition.Builder clone() {
         return (RadioPlayingCondition.Builder)super.clone();
      }

      public RadioPlayingCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioPlayingCondition.Builder)super.setField(var1, var2);
      }

      public RadioPlayingCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RadioPlayingCondition.Builder)super.clearField(var1);
      }

      public RadioPlayingCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RadioPlayingCondition.Builder)super.clearOneof(var1);
      }

      public RadioPlayingCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RadioPlayingCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RadioPlayingCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioPlayingCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public RadioPlayingCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof RadioPlayingCondition) {
            return this.mergeFrom((RadioPlayingCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RadioPlayingCondition.Builder mergeFrom(RadioPlayingCondition var1) {
         if (var1 == RadioPlayingCondition.getDefaultInstance()) {
            return this;
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RadioPlayingCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RadioPlayingCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RadioPlayingCondition.Builder)super.setUnknownFields(var1);
      }

      public final RadioPlayingCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RadioPlayingCondition.Builder)super.mergeUnknownFields(var1);
      }
   }
}
