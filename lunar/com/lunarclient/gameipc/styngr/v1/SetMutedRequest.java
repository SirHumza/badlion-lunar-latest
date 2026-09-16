package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SetMutedRequest extends GeneratedMessageV3 implements SetMutedRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MUTED_FIELD_NUMBER = 1;
   private boolean muted_ = false;
   private byte memoizedIsInitialized = -1;
   private static final SetMutedRequest DEFAULT_INSTANCE = new SetMutedRequest();
   private static final Parser<SetMutedRequest> PARSER = new AbstractParser<SetMutedRequest>() {
      public SetMutedRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetMutedRequest.Builder var3 = SetMutedRequest.newBuilder();

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

   private SetMutedRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetMutedRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetMutedRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetMutedRequest.class, SetMutedRequest.Builder.class);
   }

   @Override
   public boolean getMuted() {
      return this.muted_;
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
      if (this.muted_) {
         var1.writeBool(1, this.muted_);
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (this.muted_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.muted_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof SetMutedRequest)) {
         return super.equals(var1);
      }

      SetMutedRequest var2 = (SetMutedRequest)var1;
      return this.getMuted() != var2.getMuted() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getMuted());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetMutedRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetMutedRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetMutedRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetMutedRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetMutedRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetMutedRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetMutedRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetMutedRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetMutedRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetMutedRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetMutedRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetMutedRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetMutedRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetMutedRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetMutedRequest.Builder newBuilder(SetMutedRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetMutedRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetMutedRequest.Builder() : new SetMutedRequest.Builder().mergeFrom(this);
   }

   protected SetMutedRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetMutedRequest.Builder(var1);
   }

   public static SetMutedRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetMutedRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetMutedRequest> getParserForType() {
      return PARSER;
   }

   public SetMutedRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetMutedRequest.Builder> implements SetMutedRequestOrBuilder {
      private int bitField0_;
      private boolean muted_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetMutedRequest.class, SetMutedRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetMutedRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.muted_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_SetMutedRequest_descriptor;
      }

      public SetMutedRequest getDefaultInstanceForType() {
         return SetMutedRequest.getDefaultInstance();
      }

      public SetMutedRequest build() {
         SetMutedRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetMutedRequest buildPartial() {
         SetMutedRequest var1 = new SetMutedRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetMutedRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.muted_ = this.muted_;
         }
      }

      public SetMutedRequest.Builder clone() {
         return (SetMutedRequest.Builder)super.clone();
      }

      public SetMutedRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetMutedRequest.Builder)super.setField(var1, var2);
      }

      public SetMutedRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetMutedRequest.Builder)super.clearField(var1);
      }

      public SetMutedRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetMutedRequest.Builder)super.clearOneof(var1);
      }

      public SetMutedRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetMutedRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetMutedRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetMutedRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetMutedRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetMutedRequest) {
            return this.mergeFrom((SetMutedRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetMutedRequest.Builder mergeFrom(SetMutedRequest var1) {
         if (var1 == SetMutedRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getMuted()) {
            this.setMuted(var1.getMuted());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetMutedRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.muted_ = var1.readBool();
                     this.bitField0_ |= 1;
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

      @Override
      public boolean getMuted() {
         return this.muted_;
      }

      public SetMutedRequest.Builder setMuted(boolean var1) {
         this.muted_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetMutedRequest.Builder clearMuted() {
         this.bitField0_ &= -2;
         this.muted_ = false;
         this.onChanged();
         return this;
      }

      public final SetMutedRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetMutedRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetMutedRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetMutedRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
