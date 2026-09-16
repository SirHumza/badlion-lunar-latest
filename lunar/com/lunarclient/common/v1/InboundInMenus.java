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

public final class InboundInMenus extends GeneratedMessageV3 implements InboundInMenusOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final InboundInMenus DEFAULT_INSTANCE = new InboundInMenus();
   private static final Parser<InboundInMenus> PARSER = new AbstractParser<InboundInMenus>() {
      public InboundInMenus parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundInMenus.Builder var3 = InboundInMenus.newBuilder();

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

   private InboundInMenus(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundInMenus() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundInMenus();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInMenus_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInMenus_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundInMenus.class, InboundInMenus.Builder.class);
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

      if (!(var1 instanceof InboundInMenus)) {
         return super.equals(var1);
      }

      InboundInMenus var2 = (InboundInMenus)var1;
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

   public static InboundInMenus parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInMenus parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInMenus parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInMenus parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInMenus parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInMenus parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInMenus parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundInMenus parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundInMenus parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundInMenus parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundInMenus parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundInMenus parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundInMenus.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundInMenus.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundInMenus.Builder newBuilder(InboundInMenus var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundInMenus.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundInMenus.Builder() : new InboundInMenus.Builder().mergeFrom(this);
   }

   protected InboundInMenus.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundInMenus.Builder(var1);
   }

   public static InboundInMenus getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundInMenus> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundInMenus> getParserForType() {
      return PARSER;
   }

   public InboundInMenus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundInMenus.Builder> implements InboundInMenusOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInMenus_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInMenus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundInMenus.class, InboundInMenus.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundInMenus.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInMenus_descriptor;
      }

      public InboundInMenus getDefaultInstanceForType() {
         return InboundInMenus.getDefaultInstance();
      }

      public InboundInMenus build() {
         InboundInMenus var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundInMenus buildPartial() {
         InboundInMenus var1 = new InboundInMenus(this);
         this.onBuilt();
         return var1;
      }

      public InboundInMenus.Builder clone() {
         return (InboundInMenus.Builder)super.clone();
      }

      public InboundInMenus.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundInMenus.Builder)super.setField(var1, var2);
      }

      public InboundInMenus.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundInMenus.Builder)super.clearField(var1);
      }

      public InboundInMenus.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundInMenus.Builder)super.clearOneof(var1);
      }

      public InboundInMenus.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundInMenus.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundInMenus.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundInMenus.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundInMenus.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundInMenus) {
            return this.mergeFrom((InboundInMenus)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundInMenus.Builder mergeFrom(InboundInMenus var1) {
         if (var1 == InboundInMenus.getDefaultInstance()) {
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

      public InboundInMenus.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final InboundInMenus.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundInMenus.Builder)super.setUnknownFields(var1);
      }

      public final InboundInMenus.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundInMenus.Builder)super.mergeUnknownFields(var1);
      }
   }
}
