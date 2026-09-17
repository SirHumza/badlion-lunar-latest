package com.lunarclient.websocket.liveexperience.v1;

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

public final class LoadLiveExperienceRequest extends GeneratedMessageV3 implements LoadLiveExperienceRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final LoadLiveExperienceRequest DEFAULT_INSTANCE = new LoadLiveExperienceRequest();
   private static final Parser<LoadLiveExperienceRequest> PARSER = new AbstractParser<LoadLiveExperienceRequest>() {
      public LoadLiveExperienceRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadLiveExperienceRequest.Builder var3 = LoadLiveExperienceRequest.newBuilder();

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

   private LoadLiveExperienceRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadLiveExperienceRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadLiveExperienceRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadLiveExperienceRequest.class, LoadLiveExperienceRequest.Builder.class);
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

      if (!(var1 instanceof LoadLiveExperienceRequest)) {
         return super.equals(var1);
      }

      LoadLiveExperienceRequest var2 = (LoadLiveExperienceRequest)var1;
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

   public static LoadLiveExperienceRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadLiveExperienceRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadLiveExperienceRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadLiveExperienceRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadLiveExperienceRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadLiveExperienceRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadLiveExperienceRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadLiveExperienceRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadLiveExperienceRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadLiveExperienceRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadLiveExperienceRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadLiveExperienceRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadLiveExperienceRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadLiveExperienceRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadLiveExperienceRequest.Builder newBuilder(LoadLiveExperienceRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadLiveExperienceRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadLiveExperienceRequest.Builder() : new LoadLiveExperienceRequest.Builder().mergeFrom(this);
   }

   protected LoadLiveExperienceRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadLiveExperienceRequest.Builder(var1);
   }

   public static LoadLiveExperienceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadLiveExperienceRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadLiveExperienceRequest> getParserForType() {
      return PARSER;
   }

   public LoadLiveExperienceRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadLiveExperienceRequest.Builder> implements LoadLiveExperienceRequestOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadLiveExperienceRequest.class, LoadLiveExperienceRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadLiveExperienceRequest.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceRequest_descriptor;
      }

      public LoadLiveExperienceRequest getDefaultInstanceForType() {
         return LoadLiveExperienceRequest.getDefaultInstance();
      }

      public LoadLiveExperienceRequest build() {
         LoadLiveExperienceRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadLiveExperienceRequest buildPartial() {
         LoadLiveExperienceRequest var1 = new LoadLiveExperienceRequest(this);
         this.onBuilt();
         return var1;
      }

      public LoadLiveExperienceRequest.Builder clone() {
         return (LoadLiveExperienceRequest.Builder)super.clone();
      }

      public LoadLiveExperienceRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadLiveExperienceRequest.Builder)super.setField(var1, var2);
      }

      public LoadLiveExperienceRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadLiveExperienceRequest.Builder)super.clearField(var1);
      }

      public LoadLiveExperienceRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadLiveExperienceRequest.Builder)super.clearOneof(var1);
      }

      public LoadLiveExperienceRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadLiveExperienceRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadLiveExperienceRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadLiveExperienceRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadLiveExperienceRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadLiveExperienceRequest) {
            return this.mergeFrom((LoadLiveExperienceRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadLiveExperienceRequest.Builder mergeFrom(LoadLiveExperienceRequest var1) {
         if (var1 == LoadLiveExperienceRequest.getDefaultInstance()) {
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

      public LoadLiveExperienceRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final LoadLiveExperienceRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadLiveExperienceRequest.Builder)super.setUnknownFields(var1);
      }

      public final LoadLiveExperienceRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadLiveExperienceRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
