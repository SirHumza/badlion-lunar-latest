package com.lunarclient.gameipc.styngr.v1;

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

public final class NextTrackResponse extends GeneratedMessageV3 implements NextTrackResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final NextTrackResponse DEFAULT_INSTANCE = new NextTrackResponse();
   private static final Parser<NextTrackResponse> PARSER = new AbstractParser<NextTrackResponse>() {
      public NextTrackResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         NextTrackResponse.Builder var3 = NextTrackResponse.newBuilder();

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

   private NextTrackResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private NextTrackResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new NextTrackResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(NextTrackResponse.class, NextTrackResponse.Builder.class);
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

      if (!(var1 instanceof NextTrackResponse)) {
         return super.equals(var1);
      }

      NextTrackResponse var2 = (NextTrackResponse)var1;
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

   public static NextTrackResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static NextTrackResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NextTrackResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static NextTrackResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NextTrackResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static NextTrackResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NextTrackResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NextTrackResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static NextTrackResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static NextTrackResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static NextTrackResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NextTrackResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public NextTrackResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static NextTrackResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static NextTrackResponse.Builder newBuilder(NextTrackResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public NextTrackResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new NextTrackResponse.Builder() : new NextTrackResponse.Builder().mergeFrom(this);
   }

   protected NextTrackResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new NextTrackResponse.Builder(var1);
   }

   public static NextTrackResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<NextTrackResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<NextTrackResponse> getParserForType() {
      return PARSER;
   }

   public NextTrackResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<NextTrackResponse.Builder> implements NextTrackResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(NextTrackResponse.class, NextTrackResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public NextTrackResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_NextTrackResponse_descriptor;
      }

      public NextTrackResponse getDefaultInstanceForType() {
         return NextTrackResponse.getDefaultInstance();
      }

      public NextTrackResponse build() {
         NextTrackResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public NextTrackResponse buildPartial() {
         NextTrackResponse var1 = new NextTrackResponse(this);
         this.onBuilt();
         return var1;
      }

      public NextTrackResponse.Builder clone() {
         return (NextTrackResponse.Builder)super.clone();
      }

      public NextTrackResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NextTrackResponse.Builder)super.setField(var1, var2);
      }

      public NextTrackResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (NextTrackResponse.Builder)super.clearField(var1);
      }

      public NextTrackResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (NextTrackResponse.Builder)super.clearOneof(var1);
      }

      public NextTrackResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (NextTrackResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public NextTrackResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NextTrackResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public NextTrackResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof NextTrackResponse) {
            return this.mergeFrom((NextTrackResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public NextTrackResponse.Builder mergeFrom(NextTrackResponse var1) {
         if (var1 == NextTrackResponse.getDefaultInstance()) {
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

      public NextTrackResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final NextTrackResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (NextTrackResponse.Builder)super.setUnknownFields(var1);
      }

      public final NextTrackResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (NextTrackResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
