package com.lunarclient.gameipc.location.v1;

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

public final class UpdateFocusRequest extends GeneratedMessageV3 implements UpdateFocusRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FOCUSED_FIELD_NUMBER = 1;
   private boolean focused_ = false;
   private byte memoizedIsInitialized = -1;
   private static final UpdateFocusRequest DEFAULT_INSTANCE = new UpdateFocusRequest();
   private static final Parser<UpdateFocusRequest> PARSER = new AbstractParser<UpdateFocusRequest>() {
      public UpdateFocusRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateFocusRequest.Builder var3 = UpdateFocusRequest.newBuilder();

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

   private UpdateFocusRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateFocusRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateFocusRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateFocusRequest.class, UpdateFocusRequest.Builder.class);
   }

   @Override
   public boolean getFocused() {
      return this.focused_;
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
      if (this.focused_) {
         var1.writeBool(1, this.focused_);
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
      if (this.focused_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.focused_);
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

      if (!(var1 instanceof UpdateFocusRequest)) {
         return super.equals(var1);
      }

      UpdateFocusRequest var2 = (UpdateFocusRequest)var1;
      return this.getFocused() != var2.getFocused() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFocused());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateFocusRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateFocusRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateFocusRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateFocusRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateFocusRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateFocusRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateFocusRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateFocusRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateFocusRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateFocusRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateFocusRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateFocusRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateFocusRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateFocusRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateFocusRequest.Builder newBuilder(UpdateFocusRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateFocusRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateFocusRequest.Builder() : new UpdateFocusRequest.Builder().mergeFrom(this);
   }

   protected UpdateFocusRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateFocusRequest.Builder(var1);
   }

   public static UpdateFocusRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateFocusRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateFocusRequest> getParserForType() {
      return PARSER;
   }

   public UpdateFocusRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateFocusRequest.Builder> implements UpdateFocusRequestOrBuilder {
      private int bitField0_;
      private boolean focused_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateFocusRequest.class, UpdateFocusRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateFocusRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.focused_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_descriptor;
      }

      public UpdateFocusRequest getDefaultInstanceForType() {
         return UpdateFocusRequest.getDefaultInstance();
      }

      public UpdateFocusRequest build() {
         UpdateFocusRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateFocusRequest buildPartial() {
         UpdateFocusRequest var1 = new UpdateFocusRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateFocusRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.focused_ = this.focused_;
         }
      }

      public UpdateFocusRequest.Builder clone() {
         return (UpdateFocusRequest.Builder)super.clone();
      }

      public UpdateFocusRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateFocusRequest.Builder)super.setField(var1, var2);
      }

      public UpdateFocusRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateFocusRequest.Builder)super.clearField(var1);
      }

      public UpdateFocusRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateFocusRequest.Builder)super.clearOneof(var1);
      }

      public UpdateFocusRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateFocusRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateFocusRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateFocusRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateFocusRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateFocusRequest) {
            return this.mergeFrom((UpdateFocusRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateFocusRequest.Builder mergeFrom(UpdateFocusRequest var1) {
         if (var1 == UpdateFocusRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getFocused()) {
            this.setFocused(var1.getFocused());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateFocusRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.focused_ = var1.readBool();
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
      public boolean getFocused() {
         return this.focused_;
      }

      public UpdateFocusRequest.Builder setFocused(boolean var1) {
         this.focused_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateFocusRequest.Builder clearFocused() {
         this.bitField0_ &= -2;
         this.focused_ = false;
         this.onChanged();
         return this;
      }

      public final UpdateFocusRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateFocusRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateFocusRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateFocusRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
