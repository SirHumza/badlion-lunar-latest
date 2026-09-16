package com.lunarclient.websocket.apollo.v1;

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

public final class TrackFeatureAdoptionResponse extends GeneratedMessageV3 implements TrackFeatureAdoptionResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final TrackFeatureAdoptionResponse DEFAULT_INSTANCE = new TrackFeatureAdoptionResponse();
   private static final Parser<TrackFeatureAdoptionResponse> PARSER = new AbstractParser<TrackFeatureAdoptionResponse>() {
      public TrackFeatureAdoptionResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TrackFeatureAdoptionResponse.Builder var3 = TrackFeatureAdoptionResponse.newBuilder();

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

   private TrackFeatureAdoptionResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TrackFeatureAdoptionResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TrackFeatureAdoptionResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TrackFeatureAdoptionResponse.class, TrackFeatureAdoptionResponse.Builder.class);
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

      if (!(var1 instanceof TrackFeatureAdoptionResponse)) {
         return super.equals(var1);
      }

      TrackFeatureAdoptionResponse var2 = (TrackFeatureAdoptionResponse)var1;
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

   public static TrackFeatureAdoptionResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackFeatureAdoptionResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackFeatureAdoptionResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackFeatureAdoptionResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackFeatureAdoptionResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackFeatureAdoptionResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackFeatureAdoptionResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrackFeatureAdoptionResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrackFeatureAdoptionResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrackFeatureAdoptionResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrackFeatureAdoptionResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrackFeatureAdoptionResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TrackFeatureAdoptionResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TrackFeatureAdoptionResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrackFeatureAdoptionResponse.Builder newBuilder(TrackFeatureAdoptionResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TrackFeatureAdoptionResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TrackFeatureAdoptionResponse.Builder() : new TrackFeatureAdoptionResponse.Builder().mergeFrom(this);
   }

   protected TrackFeatureAdoptionResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TrackFeatureAdoptionResponse.Builder(var1);
   }

   public static TrackFeatureAdoptionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TrackFeatureAdoptionResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<TrackFeatureAdoptionResponse> getParserForType() {
      return PARSER;
   }

   public TrackFeatureAdoptionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TrackFeatureAdoptionResponse.Builder> implements TrackFeatureAdoptionResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TrackFeatureAdoptionResponse.class, TrackFeatureAdoptionResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TrackFeatureAdoptionResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_descriptor;
      }

      public TrackFeatureAdoptionResponse getDefaultInstanceForType() {
         return TrackFeatureAdoptionResponse.getDefaultInstance();
      }

      public TrackFeatureAdoptionResponse build() {
         TrackFeatureAdoptionResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TrackFeatureAdoptionResponse buildPartial() {
         TrackFeatureAdoptionResponse var1 = new TrackFeatureAdoptionResponse(this);
         this.onBuilt();
         return var1;
      }

      public TrackFeatureAdoptionResponse.Builder clone() {
         return (TrackFeatureAdoptionResponse.Builder)super.clone();
      }

      public TrackFeatureAdoptionResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TrackFeatureAdoptionResponse.Builder)super.setField(var1, var2);
      }

      public TrackFeatureAdoptionResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TrackFeatureAdoptionResponse.Builder)super.clearField(var1);
      }

      public TrackFeatureAdoptionResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TrackFeatureAdoptionResponse.Builder)super.clearOneof(var1);
      }

      public TrackFeatureAdoptionResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TrackFeatureAdoptionResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TrackFeatureAdoptionResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TrackFeatureAdoptionResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public TrackFeatureAdoptionResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof TrackFeatureAdoptionResponse) {
            return this.mergeFrom((TrackFeatureAdoptionResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TrackFeatureAdoptionResponse.Builder mergeFrom(TrackFeatureAdoptionResponse var1) {
         if (var1 == TrackFeatureAdoptionResponse.getDefaultInstance()) {
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

      public TrackFeatureAdoptionResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final TrackFeatureAdoptionResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TrackFeatureAdoptionResponse.Builder)super.setUnknownFields(var1);
      }

      public final TrackFeatureAdoptionResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TrackFeatureAdoptionResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
