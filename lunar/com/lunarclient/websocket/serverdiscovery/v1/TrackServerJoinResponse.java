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

public final class TrackServerJoinResponse extends GeneratedMessageV3 implements TrackServerJoinResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final TrackServerJoinResponse DEFAULT_INSTANCE = new TrackServerJoinResponse();
   private static final Parser<TrackServerJoinResponse> PARSER = new AbstractParser<TrackServerJoinResponse>() {
      public TrackServerJoinResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TrackServerJoinResponse.Builder var3 = TrackServerJoinResponse.newBuilder();

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

   private TrackServerJoinResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TrackServerJoinResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TrackServerJoinResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TrackServerJoinResponse.class, TrackServerJoinResponse.Builder.class);
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

      if (!(var1 instanceof TrackServerJoinResponse)) {
         return super.equals(var1);
      }

      TrackServerJoinResponse var2 = (TrackServerJoinResponse)var1;
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

   public static TrackServerJoinResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackServerJoinResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackServerJoinResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackServerJoinResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackServerJoinResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackServerJoinResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackServerJoinResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrackServerJoinResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrackServerJoinResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrackServerJoinResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrackServerJoinResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrackServerJoinResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TrackServerJoinResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TrackServerJoinResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrackServerJoinResponse.Builder newBuilder(TrackServerJoinResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TrackServerJoinResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TrackServerJoinResponse.Builder() : new TrackServerJoinResponse.Builder().mergeFrom(this);
   }

   protected TrackServerJoinResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TrackServerJoinResponse.Builder(var1);
   }

   public static TrackServerJoinResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TrackServerJoinResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<TrackServerJoinResponse> getParserForType() {
      return PARSER;
   }

   public TrackServerJoinResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TrackServerJoinResponse.Builder> implements TrackServerJoinResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TrackServerJoinResponse.class, TrackServerJoinResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TrackServerJoinResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_descriptor;
      }

      public TrackServerJoinResponse getDefaultInstanceForType() {
         return TrackServerJoinResponse.getDefaultInstance();
      }

      public TrackServerJoinResponse build() {
         TrackServerJoinResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TrackServerJoinResponse buildPartial() {
         TrackServerJoinResponse var1 = new TrackServerJoinResponse(this);
         this.onBuilt();
         return var1;
      }

      public TrackServerJoinResponse.Builder clone() {
         return (TrackServerJoinResponse.Builder)super.clone();
      }

      public TrackServerJoinResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TrackServerJoinResponse.Builder)super.setField(var1, var2);
      }

      public TrackServerJoinResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TrackServerJoinResponse.Builder)super.clearField(var1);
      }

      public TrackServerJoinResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TrackServerJoinResponse.Builder)super.clearOneof(var1);
      }

      public TrackServerJoinResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TrackServerJoinResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TrackServerJoinResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TrackServerJoinResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public TrackServerJoinResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof TrackServerJoinResponse) {
            return this.mergeFrom((TrackServerJoinResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TrackServerJoinResponse.Builder mergeFrom(TrackServerJoinResponse var1) {
         if (var1 == TrackServerJoinResponse.getDefaultInstance()) {
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

      public TrackServerJoinResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final TrackServerJoinResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TrackServerJoinResponse.Builder)super.setUnknownFields(var1);
      }

      public final TrackServerJoinResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TrackServerJoinResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
