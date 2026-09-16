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

public final class ReplayWorld extends GeneratedMessageV3 implements ReplayWorldOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ReplayWorld DEFAULT_INSTANCE = new ReplayWorld();
   private static final Parser<ReplayWorld> PARSER = new AbstractParser<ReplayWorld>() {
      public ReplayWorld parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ReplayWorld.Builder var3 = ReplayWorld.newBuilder();

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

   private ReplayWorld(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ReplayWorld() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ReplayWorld();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_ReplayWorld_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_ReplayWorld_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ReplayWorld.class, ReplayWorld.Builder.class);
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

      if (!(var1 instanceof ReplayWorld)) {
         return super.equals(var1);
      }

      ReplayWorld var2 = (ReplayWorld)var1;
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

   public static ReplayWorld parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReplayWorld parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReplayWorld parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReplayWorld parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReplayWorld parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReplayWorld parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReplayWorld parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReplayWorld parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ReplayWorld parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ReplayWorld parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ReplayWorld parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReplayWorld parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ReplayWorld.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ReplayWorld.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ReplayWorld.Builder newBuilder(ReplayWorld var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ReplayWorld.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ReplayWorld.Builder() : new ReplayWorld.Builder().mergeFrom(this);
   }

   protected ReplayWorld.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ReplayWorld.Builder(var1);
   }

   public static ReplayWorld getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ReplayWorld> parser() {
      return PARSER;
   }

   @Override
   public Parser<ReplayWorld> getParserForType() {
      return PARSER;
   }

   public ReplayWorld getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ReplayWorld.Builder> implements ReplayWorldOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_ReplayWorld_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_ReplayWorld_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ReplayWorld.class, ReplayWorld.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ReplayWorld.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_ReplayWorld_descriptor;
      }

      public ReplayWorld getDefaultInstanceForType() {
         return ReplayWorld.getDefaultInstance();
      }

      public ReplayWorld build() {
         ReplayWorld var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ReplayWorld buildPartial() {
         ReplayWorld var1 = new ReplayWorld(this);
         this.onBuilt();
         return var1;
      }

      public ReplayWorld.Builder clone() {
         return (ReplayWorld.Builder)super.clone();
      }

      public ReplayWorld.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReplayWorld.Builder)super.setField(var1, var2);
      }

      public ReplayWorld.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ReplayWorld.Builder)super.clearField(var1);
      }

      public ReplayWorld.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ReplayWorld.Builder)super.clearOneof(var1);
      }

      public ReplayWorld.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ReplayWorld.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ReplayWorld.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReplayWorld.Builder)super.addRepeatedField(var1, var2);
      }

      public ReplayWorld.Builder mergeFrom(Message var1) {
         if (var1 instanceof ReplayWorld) {
            return this.mergeFrom((ReplayWorld)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ReplayWorld.Builder mergeFrom(ReplayWorld var1) {
         if (var1 == ReplayWorld.getDefaultInstance()) {
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

      public ReplayWorld.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ReplayWorld.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ReplayWorld.Builder)super.setUnknownFields(var1);
      }

      public final ReplayWorld.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ReplayWorld.Builder)super.mergeUnknownFields(var1);
      }
   }
}
