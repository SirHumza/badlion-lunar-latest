package com.lunarclient.apollo.packetenrichment.v1;

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

public final class Miss extends GeneratedMessageV3 implements MissOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final Miss DEFAULT_INSTANCE = new Miss();
   private static final Parser<Miss> PARSER = new AbstractParser<Miss>() {
      public Miss parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Miss.Builder var3 = Miss.newBuilder();

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

   private Miss(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Miss() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Miss();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_Miss_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_Miss_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Miss.class, Miss.Builder.class);
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

      if (!(var1 instanceof Miss)) {
         return super.equals(var1);
      }

      Miss var2 = (Miss)var1;
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

   public static Miss parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Miss parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Miss parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Miss parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Miss parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Miss parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Miss parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Miss parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Miss parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Miss parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Miss parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Miss parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Miss.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Miss.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Miss.Builder newBuilder(Miss var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Miss.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Miss.Builder() : new Miss.Builder().mergeFrom(this);
   }

   protected Miss.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Miss.Builder(var1);
   }

   public static Miss getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Miss> parser() {
      return PARSER;
   }

   @Override
   public Parser<Miss> getParserForType() {
      return PARSER;
   }

   public Miss getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Miss.Builder> implements MissOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_Miss_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_Miss_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Miss.class, Miss.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Miss.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return RaytraceProto.internal_static_lunarclient_apollo_packetenrichment_v1_Miss_descriptor;
      }

      public Miss getDefaultInstanceForType() {
         return Miss.getDefaultInstance();
      }

      public Miss build() {
         Miss var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Miss buildPartial() {
         Miss var1 = new Miss(this);
         this.onBuilt();
         return var1;
      }

      public Miss.Builder clone() {
         return (Miss.Builder)super.clone();
      }

      public Miss.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Miss.Builder)super.setField(var1, var2);
      }

      public Miss.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Miss.Builder)super.clearField(var1);
      }

      public Miss.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Miss.Builder)super.clearOneof(var1);
      }

      public Miss.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Miss.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Miss.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Miss.Builder)super.addRepeatedField(var1, var2);
      }

      public Miss.Builder mergeFrom(Message var1) {
         if (var1 instanceof Miss) {
            return this.mergeFrom((Miss)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Miss.Builder mergeFrom(Miss var1) {
         if (var1 == Miss.getDefaultInstance()) {
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

      public Miss.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final Miss.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Miss.Builder)super.setUnknownFields(var1);
      }

      public final Miss.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Miss.Builder)super.mergeUnknownFields(var1);
      }
   }
}
