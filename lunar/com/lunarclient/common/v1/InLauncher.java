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

public final class InLauncher extends GeneratedMessageV3 implements InLauncherOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final InLauncher DEFAULT_INSTANCE = new InLauncher();
   private static final Parser<InLauncher> PARSER = new AbstractParser<InLauncher>() {
      public InLauncher parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InLauncher.Builder var3 = InLauncher.newBuilder();

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

   private InLauncher(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InLauncher() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InLauncher();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_InLauncher_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_InLauncher_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InLauncher.class, InLauncher.Builder.class);
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

      if (!(var1 instanceof InLauncher)) {
         return super.equals(var1);
      }

      InLauncher var2 = (InLauncher)var1;
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

   public static InLauncher parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InLauncher parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InLauncher parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InLauncher parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InLauncher parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InLauncher parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InLauncher parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InLauncher parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InLauncher parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InLauncher parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InLauncher parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InLauncher parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InLauncher.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InLauncher.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InLauncher.Builder newBuilder(InLauncher var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InLauncher.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InLauncher.Builder() : new InLauncher.Builder().mergeFrom(this);
   }

   protected InLauncher.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InLauncher.Builder(var1);
   }

   public static InLauncher getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InLauncher> parser() {
      return PARSER;
   }

   @Override
   public Parser<InLauncher> getParserForType() {
      return PARSER;
   }

   public InLauncher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InLauncher.Builder> implements InLauncherOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_InLauncher_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_InLauncher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InLauncher.class, InLauncher.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InLauncher.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_InLauncher_descriptor;
      }

      public InLauncher getDefaultInstanceForType() {
         return InLauncher.getDefaultInstance();
      }

      public InLauncher build() {
         InLauncher var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InLauncher buildPartial() {
         InLauncher var1 = new InLauncher(this);
         this.onBuilt();
         return var1;
      }

      public InLauncher.Builder clone() {
         return (InLauncher.Builder)super.clone();
      }

      public InLauncher.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InLauncher.Builder)super.setField(var1, var2);
      }

      public InLauncher.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InLauncher.Builder)super.clearField(var1);
      }

      public InLauncher.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InLauncher.Builder)super.clearOneof(var1);
      }

      public InLauncher.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InLauncher.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InLauncher.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InLauncher.Builder)super.addRepeatedField(var1, var2);
      }

      public InLauncher.Builder mergeFrom(Message var1) {
         if (var1 instanceof InLauncher) {
            return this.mergeFrom((InLauncher)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InLauncher.Builder mergeFrom(InLauncher var1) {
         if (var1 == InLauncher.getDefaultInstance()) {
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

      public InLauncher.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final InLauncher.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InLauncher.Builder)super.setUnknownFields(var1);
      }

      public final InLauncher.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InLauncher.Builder)super.mergeUnknownFields(var1);
      }
   }
}
