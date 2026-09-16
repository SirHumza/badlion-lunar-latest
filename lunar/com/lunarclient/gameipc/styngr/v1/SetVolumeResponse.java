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

public final class SetVolumeResponse extends GeneratedMessageV3 implements SetVolumeResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final SetVolumeResponse DEFAULT_INSTANCE = new SetVolumeResponse();
   private static final Parser<SetVolumeResponse> PARSER = new AbstractParser<SetVolumeResponse>() {
      public SetVolumeResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetVolumeResponse.Builder var3 = SetVolumeResponse.newBuilder();

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

   private SetVolumeResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetVolumeResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetVolumeResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetVolumeResponse.class, SetVolumeResponse.Builder.class);
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

      if (!(var1 instanceof SetVolumeResponse)) {
         return super.equals(var1);
      }

      SetVolumeResponse var2 = (SetVolumeResponse)var1;
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

   public static SetVolumeResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetVolumeResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetVolumeResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetVolumeResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetVolumeResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetVolumeResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetVolumeResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetVolumeResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetVolumeResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetVolumeResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetVolumeResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetVolumeResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetVolumeResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetVolumeResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetVolumeResponse.Builder newBuilder(SetVolumeResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetVolumeResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetVolumeResponse.Builder() : new SetVolumeResponse.Builder().mergeFrom(this);
   }

   protected SetVolumeResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetVolumeResponse.Builder(var1);
   }

   public static SetVolumeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetVolumeResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetVolumeResponse> getParserForType() {
      return PARSER;
   }

   public SetVolumeResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetVolumeResponse.Builder> implements SetVolumeResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetVolumeResponse.class, SetVolumeResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetVolumeResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetVolumeResponse_descriptor;
      }

      public SetVolumeResponse getDefaultInstanceForType() {
         return SetVolumeResponse.getDefaultInstance();
      }

      public SetVolumeResponse build() {
         SetVolumeResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetVolumeResponse buildPartial() {
         SetVolumeResponse var1 = new SetVolumeResponse(this);
         this.onBuilt();
         return var1;
      }

      public SetVolumeResponse.Builder clone() {
         return (SetVolumeResponse.Builder)super.clone();
      }

      public SetVolumeResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetVolumeResponse.Builder)super.setField(var1, var2);
      }

      public SetVolumeResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetVolumeResponse.Builder)super.clearField(var1);
      }

      public SetVolumeResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetVolumeResponse.Builder)super.clearOneof(var1);
      }

      public SetVolumeResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetVolumeResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetVolumeResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetVolumeResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public SetVolumeResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetVolumeResponse) {
            return this.mergeFrom((SetVolumeResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetVolumeResponse.Builder mergeFrom(SetVolumeResponse var1) {
         if (var1 == SetVolumeResponse.getDefaultInstance()) {
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

      public SetVolumeResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final SetVolumeResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetVolumeResponse.Builder)super.setUnknownFields(var1);
      }

      public final SetVolumeResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetVolumeResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
