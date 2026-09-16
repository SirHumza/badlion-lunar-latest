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

public final class RewindWorld extends GeneratedMessageV3 implements RewindWorldOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RewindWorld DEFAULT_INSTANCE = new RewindWorld();
   private static final Parser<RewindWorld> PARSER = new AbstractParser<RewindWorld>() {
      public RewindWorld parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RewindWorld.Builder var3 = RewindWorld.newBuilder();

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

   private RewindWorld(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RewindWorld() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RewindWorld();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_RewindWorld_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_RewindWorld_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RewindWorld.class, RewindWorld.Builder.class);
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

      if (!(var1 instanceof RewindWorld)) {
         return super.equals(var1);
      }

      RewindWorld var2 = (RewindWorld)var1;
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

   public static RewindWorld parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RewindWorld parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RewindWorld parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RewindWorld parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RewindWorld parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RewindWorld parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RewindWorld parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RewindWorld parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RewindWorld parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RewindWorld parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RewindWorld parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RewindWorld parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RewindWorld.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RewindWorld.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RewindWorld.Builder newBuilder(RewindWorld var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RewindWorld.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RewindWorld.Builder() : new RewindWorld.Builder().mergeFrom(this);
   }

   protected RewindWorld.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RewindWorld.Builder(var1);
   }

   public static RewindWorld getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RewindWorld> parser() {
      return PARSER;
   }

   @Override
   public Parser<RewindWorld> getParserForType() {
      return PARSER;
   }

   public RewindWorld getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RewindWorld.Builder> implements RewindWorldOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_RewindWorld_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_RewindWorld_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RewindWorld.class, RewindWorld.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RewindWorld.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_RewindWorld_descriptor;
      }

      public RewindWorld getDefaultInstanceForType() {
         return RewindWorld.getDefaultInstance();
      }

      public RewindWorld build() {
         RewindWorld var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RewindWorld buildPartial() {
         RewindWorld var1 = new RewindWorld(this);
         this.onBuilt();
         return var1;
      }

      public RewindWorld.Builder clone() {
         return (RewindWorld.Builder)super.clone();
      }

      public RewindWorld.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RewindWorld.Builder)super.setField(var1, var2);
      }

      public RewindWorld.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RewindWorld.Builder)super.clearField(var1);
      }

      public RewindWorld.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RewindWorld.Builder)super.clearOneof(var1);
      }

      public RewindWorld.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RewindWorld.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RewindWorld.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RewindWorld.Builder)super.addRepeatedField(var1, var2);
      }

      public RewindWorld.Builder mergeFrom(Message var1) {
         if (var1 instanceof RewindWorld) {
            return this.mergeFrom((RewindWorld)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RewindWorld.Builder mergeFrom(RewindWorld var1) {
         if (var1 == RewindWorld.getDefaultInstance()) {
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

      public RewindWorld.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RewindWorld.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RewindWorld.Builder)super.setUnknownFields(var1);
      }

      public final RewindWorld.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RewindWorld.Builder)super.mergeUnknownFields(var1);
      }
   }
}
