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

public final class InboundReplayWorld extends GeneratedMessageV3 implements InboundReplayWorldOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final InboundReplayWorld DEFAULT_INSTANCE = new InboundReplayWorld();
   private static final Parser<InboundReplayWorld> PARSER = new AbstractParser<InboundReplayWorld>() {
      public InboundReplayWorld parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundReplayWorld.Builder var3 = InboundReplayWorld.newBuilder();

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

   private InboundReplayWorld(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundReplayWorld() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundReplayWorld();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundReplayWorld_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundReplayWorld_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundReplayWorld.class, InboundReplayWorld.Builder.class);
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

      if (!(var1 instanceof InboundReplayWorld)) {
         return super.equals(var1);
      }

      InboundReplayWorld var2 = (InboundReplayWorld)var1;
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

   public static InboundReplayWorld parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundReplayWorld parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundReplayWorld parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundReplayWorld parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundReplayWorld parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundReplayWorld parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundReplayWorld parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundReplayWorld parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundReplayWorld parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundReplayWorld parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundReplayWorld parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundReplayWorld parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundReplayWorld.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundReplayWorld.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundReplayWorld.Builder newBuilder(InboundReplayWorld var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundReplayWorld.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundReplayWorld.Builder() : new InboundReplayWorld.Builder().mergeFrom(this);
   }

   protected InboundReplayWorld.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundReplayWorld.Builder(var1);
   }

   public static InboundReplayWorld getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundReplayWorld> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundReplayWorld> getParserForType() {
      return PARSER;
   }

   public InboundReplayWorld getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundReplayWorld.Builder> implements InboundReplayWorldOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundReplayWorld_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundReplayWorld_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundReplayWorld.class, InboundReplayWorld.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundReplayWorld.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundReplayWorld_descriptor;
      }

      public InboundReplayWorld getDefaultInstanceForType() {
         return InboundReplayWorld.getDefaultInstance();
      }

      public InboundReplayWorld build() {
         InboundReplayWorld var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundReplayWorld buildPartial() {
         InboundReplayWorld var1 = new InboundReplayWorld(this);
         this.onBuilt();
         return var1;
      }

      public InboundReplayWorld.Builder clone() {
         return (InboundReplayWorld.Builder)super.clone();
      }

      public InboundReplayWorld.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundReplayWorld.Builder)super.setField(var1, var2);
      }

      public InboundReplayWorld.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundReplayWorld.Builder)super.clearField(var1);
      }

      public InboundReplayWorld.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundReplayWorld.Builder)super.clearOneof(var1);
      }

      public InboundReplayWorld.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundReplayWorld.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundReplayWorld.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundReplayWorld.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundReplayWorld.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundReplayWorld) {
            return this.mergeFrom((InboundReplayWorld)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundReplayWorld.Builder mergeFrom(InboundReplayWorld var1) {
         if (var1 == InboundReplayWorld.getDefaultInstance()) {
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

      public InboundReplayWorld.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final InboundReplayWorld.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundReplayWorld.Builder)super.setUnknownFields(var1);
      }

      public final InboundReplayWorld.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundReplayWorld.Builder)super.mergeUnknownFields(var1);
      }
   }
}
