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

public final class PrivateServer extends GeneratedMessageV3 implements PrivateServerOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final PrivateServer DEFAULT_INSTANCE = new PrivateServer();
   private static final Parser<PrivateServer> PARSER = new AbstractParser<PrivateServer>() {
      public PrivateServer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PrivateServer.Builder var3 = PrivateServer.newBuilder();

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

   private PrivateServer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PrivateServer() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PrivateServer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_PrivateServer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_PrivateServer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PrivateServer.class, PrivateServer.Builder.class);
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

      if (!(var1 instanceof PrivateServer)) {
         return super.equals(var1);
      }

      PrivateServer var2 = (PrivateServer)var1;
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

   public static PrivateServer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PrivateServer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PrivateServer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PrivateServer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PrivateServer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PrivateServer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PrivateServer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PrivateServer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PrivateServer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PrivateServer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PrivateServer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PrivateServer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PrivateServer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PrivateServer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PrivateServer.Builder newBuilder(PrivateServer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PrivateServer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PrivateServer.Builder() : new PrivateServer.Builder().mergeFrom(this);
   }

   protected PrivateServer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PrivateServer.Builder(var1);
   }

   public static PrivateServer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PrivateServer> parser() {
      return PARSER;
   }

   @Override
   public Parser<PrivateServer> getParserForType() {
      return PARSER;
   }

   public PrivateServer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PrivateServer.Builder> implements PrivateServerOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_PrivateServer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_PrivateServer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PrivateServer.class, PrivateServer.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PrivateServer.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_PrivateServer_descriptor;
      }

      public PrivateServer getDefaultInstanceForType() {
         return PrivateServer.getDefaultInstance();
      }

      public PrivateServer build() {
         PrivateServer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PrivateServer buildPartial() {
         PrivateServer var1 = new PrivateServer(this);
         this.onBuilt();
         return var1;
      }

      public PrivateServer.Builder clone() {
         return (PrivateServer.Builder)super.clone();
      }

      public PrivateServer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PrivateServer.Builder)super.setField(var1, var2);
      }

      public PrivateServer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PrivateServer.Builder)super.clearField(var1);
      }

      public PrivateServer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PrivateServer.Builder)super.clearOneof(var1);
      }

      public PrivateServer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PrivateServer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PrivateServer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PrivateServer.Builder)super.addRepeatedField(var1, var2);
      }

      public PrivateServer.Builder mergeFrom(Message var1) {
         if (var1 instanceof PrivateServer) {
            return this.mergeFrom((PrivateServer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PrivateServer.Builder mergeFrom(PrivateServer var1) {
         if (var1 == PrivateServer.getDefaultInstance()) {
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

      public PrivateServer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final PrivateServer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PrivateServer.Builder)super.setUnknownFields(var1);
      }

      public final PrivateServer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PrivateServer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
