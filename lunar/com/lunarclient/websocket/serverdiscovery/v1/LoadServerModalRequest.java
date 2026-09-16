package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class LoadServerModalRequest extends GeneratedMessageV3 implements LoadServerModalRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_MAPPINGS_ID_FIELD_NUMBER = 1;
   private volatile Object serverMappingsId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LoadServerModalRequest DEFAULT_INSTANCE = new LoadServerModalRequest();
   private static final Parser<LoadServerModalRequest> PARSER = new AbstractParser<LoadServerModalRequest>() {
      public LoadServerModalRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadServerModalRequest.Builder var3 = LoadServerModalRequest.newBuilder();

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

   private LoadServerModalRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadServerModalRequest() {
      this.serverMappingsId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadServerModalRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadServerModalRequest.class, LoadServerModalRequest.Builder.class);
   }

   @Override
   public String getServerMappingsId() {
      Object var1 = this.serverMappingsId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverMappingsId_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerMappingsIdBytes() {
      Object var1 = this.serverMappingsId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverMappingsId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverMappingsId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.serverMappingsId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverMappingsId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.serverMappingsId_);
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

      if (!(var1 instanceof LoadServerModalRequest)) {
         return super.equals(var1);
      }

      LoadServerModalRequest var2 = (LoadServerModalRequest)var1;
      return !this.getServerMappingsId().equals(var2.getServerMappingsId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getServerMappingsId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadServerModalRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadServerModalRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadServerModalRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadServerModalRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadServerModalRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadServerModalRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadServerModalRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadServerModalRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadServerModalRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadServerModalRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadServerModalRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadServerModalRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadServerModalRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadServerModalRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadServerModalRequest.Builder newBuilder(LoadServerModalRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadServerModalRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadServerModalRequest.Builder() : new LoadServerModalRequest.Builder().mergeFrom(this);
   }

   protected LoadServerModalRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadServerModalRequest.Builder(var1);
   }

   public static LoadServerModalRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadServerModalRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadServerModalRequest> getParserForType() {
      return PARSER;
   }

   public LoadServerModalRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadServerModalRequest.Builder> implements LoadServerModalRequestOrBuilder {
      private int bitField0_;
      private Object serverMappingsId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadServerModalRequest.class, LoadServerModalRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadServerModalRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverMappingsId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_descriptor;
      }

      public LoadServerModalRequest getDefaultInstanceForType() {
         return LoadServerModalRequest.getDefaultInstance();
      }

      public LoadServerModalRequest build() {
         LoadServerModalRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadServerModalRequest buildPartial() {
         LoadServerModalRequest var1 = new LoadServerModalRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LoadServerModalRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.serverMappingsId_ = this.serverMappingsId_;
         }
      }

      public LoadServerModalRequest.Builder clone() {
         return (LoadServerModalRequest.Builder)super.clone();
      }

      public LoadServerModalRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadServerModalRequest.Builder)super.setField(var1, var2);
      }

      public LoadServerModalRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadServerModalRequest.Builder)super.clearField(var1);
      }

      public LoadServerModalRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadServerModalRequest.Builder)super.clearOneof(var1);
      }

      public LoadServerModalRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadServerModalRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadServerModalRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadServerModalRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadServerModalRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadServerModalRequest) {
            return this.mergeFrom((LoadServerModalRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadServerModalRequest.Builder mergeFrom(LoadServerModalRequest var1) {
         if (var1 == LoadServerModalRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getServerMappingsId().isEmpty()) {
            this.serverMappingsId_ = var1.serverMappingsId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoadServerModalRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     this.serverMappingsId_ = var1.readStringRequireUtf8();
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
      public String getServerMappingsId() {
         Object var1 = this.serverMappingsId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverMappingsId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerMappingsIdBytes() {
         Object var1 = this.serverMappingsId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverMappingsId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LoadServerModalRequest.Builder setServerMappingsId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverMappingsId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoadServerModalRequest.Builder clearServerMappingsId() {
         this.serverMappingsId_ = LoadServerModalRequest.getDefaultInstance().getServerMappingsId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LoadServerModalRequest.Builder setServerMappingsIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LoadServerModalRequest.checkByteStringIsUtf8(var1);
         this.serverMappingsId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final LoadServerModalRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadServerModalRequest.Builder)super.setUnknownFields(var1);
      }

      public final LoadServerModalRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadServerModalRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
