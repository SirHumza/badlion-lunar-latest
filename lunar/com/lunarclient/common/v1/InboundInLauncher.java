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

public final class InboundInLauncher extends GeneratedMessageV3 implements InboundInLauncherOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final InboundInLauncher DEFAULT_INSTANCE = new InboundInLauncher();
   private static final Parser<InboundInLauncher> PARSER = new AbstractParser<InboundInLauncher>() {
      public InboundInLauncher parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundInLauncher.Builder var3 = InboundInLauncher.newBuilder();

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

   private InboundInLauncher(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundInLauncher() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundInLauncher();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInLauncher_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInLauncher_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundInLauncher.class, InboundInLauncher.Builder.class);
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

      if (!(var1 instanceof InboundInLauncher)) {
         return super.equals(var1);
      }

      InboundInLauncher var2 = (InboundInLauncher)var1;
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

   public static InboundInLauncher parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInLauncher parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInLauncher parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInLauncher parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInLauncher parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInLauncher parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInLauncher parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundInLauncher parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundInLauncher parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundInLauncher parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundInLauncher parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundInLauncher parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundInLauncher.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundInLauncher.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundInLauncher.Builder newBuilder(InboundInLauncher var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundInLauncher.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundInLauncher.Builder() : new InboundInLauncher.Builder().mergeFrom(this);
   }

   protected InboundInLauncher.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundInLauncher.Builder(var1);
   }

   public static InboundInLauncher getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundInLauncher> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundInLauncher> getParserForType() {
      return PARSER;
   }

   public InboundInLauncher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundInLauncher.Builder> implements InboundInLauncherOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInLauncher_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInLauncher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundInLauncher.class, InboundInLauncher.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundInLauncher.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInLauncher_descriptor;
      }

      public InboundInLauncher getDefaultInstanceForType() {
         return InboundInLauncher.getDefaultInstance();
      }

      public InboundInLauncher build() {
         InboundInLauncher var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundInLauncher buildPartial() {
         InboundInLauncher var1 = new InboundInLauncher(this);
         this.onBuilt();
         return var1;
      }

      public InboundInLauncher.Builder clone() {
         return (InboundInLauncher.Builder)super.clone();
      }

      public InboundInLauncher.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundInLauncher.Builder)super.setField(var1, var2);
      }

      public InboundInLauncher.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundInLauncher.Builder)super.clearField(var1);
      }

      public InboundInLauncher.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundInLauncher.Builder)super.clearOneof(var1);
      }

      public InboundInLauncher.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundInLauncher.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundInLauncher.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundInLauncher.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundInLauncher.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundInLauncher) {
            return this.mergeFrom((InboundInLauncher)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundInLauncher.Builder mergeFrom(InboundInLauncher var1) {
         if (var1 == InboundInLauncher.getDefaultInstance()) {
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

      public InboundInLauncher.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final InboundInLauncher.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundInLauncher.Builder)super.setUnknownFields(var1);
      }

      public final InboundInLauncher.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundInLauncher.Builder)super.mergeUnknownFields(var1);
      }
   }
}
