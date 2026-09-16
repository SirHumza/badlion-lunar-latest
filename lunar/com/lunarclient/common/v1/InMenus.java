package com.lunarclient.common.v1;

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

public final class InMenus extends GeneratedMessageV3 implements InMenusOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final InMenus DEFAULT_INSTANCE = new InMenus();
   private static final Parser<InMenus> PARSER = new AbstractParser<InMenus>() {
      public InMenus parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InMenus.Builder var3 = InMenus.newBuilder();

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

   private InMenus(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InMenus() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InMenus();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_InMenus_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_InMenus_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InMenus.class, InMenus.Builder.class);
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

      if (!(var1 instanceof InMenus)) {
         return super.equals(var1);
      }

      InMenus var2 = (InMenus)var1;
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

   public static InMenus parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InMenus parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InMenus parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InMenus parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InMenus parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InMenus parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InMenus parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InMenus parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InMenus parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InMenus parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InMenus parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InMenus parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InMenus.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InMenus.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InMenus.Builder newBuilder(InMenus var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InMenus.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InMenus.Builder() : new InMenus.Builder().mergeFrom(this);
   }

   protected InMenus.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InMenus.Builder(var1);
   }

   public static InMenus getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InMenus> parser() {
      return PARSER;
   }

   @Override
   public Parser<InMenus> getParserForType() {
      return PARSER;
   }

   public InMenus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InMenus.Builder> implements InMenusOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_InMenus_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_InMenus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InMenus.class, InMenus.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InMenus.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_InMenus_descriptor;
      }

      public InMenus getDefaultInstanceForType() {
         return InMenus.getDefaultInstance();
      }

      public InMenus build() {
         InMenus var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InMenus buildPartial() {
         InMenus var1 = new InMenus(this);
         this.onBuilt();
         return var1;
      }

      public InMenus.Builder clone() {
         return (InMenus.Builder)super.clone();
      }

      public InMenus.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InMenus.Builder)super.setField(var1, var2);
      }

      public InMenus.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InMenus.Builder)super.clearField(var1);
      }

      public InMenus.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InMenus.Builder)super.clearOneof(var1);
      }

      public InMenus.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InMenus.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InMenus.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InMenus.Builder)super.addRepeatedField(var1, var2);
      }

      public InMenus.Builder mergeFrom(Message var1) {
         if (var1 instanceof InMenus) {
            return this.mergeFrom((InMenus)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InMenus.Builder mergeFrom(InMenus var1) {
         if (var1 == InMenus.getDefaultInstance()) {
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

      public InMenus.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final InMenus.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InMenus.Builder)super.setUnknownFields(var1);
      }

      public final InMenus.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InMenus.Builder)super.mergeUnknownFields(var1);
      }
   }
}
