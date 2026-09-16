package com.lunarclient.gameipc.location.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundLocationOrBuilder;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateLocationRequest extends GeneratedMessageV3 implements UpdateLocationRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LOCATION_FIELD_NUMBER = 1;
   private Location location_;
   public static final int INBOUND_LOCATION_FIELD_NUMBER = 2;
   private InboundLocation inboundLocation_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateLocationRequest DEFAULT_INSTANCE = new UpdateLocationRequest();
   private static final Parser<UpdateLocationRequest> PARSER = new AbstractParser<UpdateLocationRequest>() {
      public UpdateLocationRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateLocationRequest.Builder var3 = UpdateLocationRequest.newBuilder();

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

   private UpdateLocationRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateLocationRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateLocationRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateLocationRequest.class, UpdateLocationRequest.Builder.class);
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean hasInboundLocation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public InboundLocation getInboundLocation() {
      return this.inboundLocation_ == null ? InboundLocation.getDefaultInstance() : this.inboundLocation_;
   }

   @Override
   public InboundLocationOrBuilder getInboundLocationOrBuilder() {
      return this.inboundLocation_ == null ? InboundLocation.getDefaultInstance() : this.inboundLocation_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getInboundLocation());
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getLocation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getInboundLocation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateLocationRequest)) {
         return super.equals(var1);
      } else {
         UpdateLocationRequest var2 = (UpdateLocationRequest)var1;
         if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasInboundLocation() != var2.hasInboundLocation()) {
            return false;
         } else {
            return this.hasInboundLocation() && !this.getInboundLocation().equals(var2.getInboundLocation())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.hasLocation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasInboundLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getInboundLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateLocationRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLocationRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLocationRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLocationRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLocationRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLocationRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLocationRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLocationRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateLocationRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateLocationRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateLocationRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLocationRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateLocationRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateLocationRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateLocationRequest.Builder newBuilder(UpdateLocationRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateLocationRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateLocationRequest.Builder() : new UpdateLocationRequest.Builder().mergeFrom(this);
   }

   protected UpdateLocationRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateLocationRequest.Builder(var1);
   }

   public static UpdateLocationRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateLocationRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateLocationRequest> getParserForType() {
      return PARSER;
   }

   public UpdateLocationRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateLocationRequest.Builder> implements UpdateLocationRequestOrBuilder {
      private int bitField0_;
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private InboundLocation inboundLocation_;
      private SingleFieldBuilderV3<InboundLocation, InboundLocation.Builder, InboundLocationOrBuilder> inboundLocationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateLocationRequest.class, UpdateLocationRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateLocationRequest.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
            this.getInboundLocationFieldBuilder();
         }
      }

      public UpdateLocationRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.inboundLocation_ = null;
         if (this.inboundLocationBuilder_ != null) {
            this.inboundLocationBuilder_.dispose();
            this.inboundLocationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_descriptor;
      }

      public UpdateLocationRequest getDefaultInstanceForType() {
         return UpdateLocationRequest.getDefaultInstance();
      }

      public UpdateLocationRequest build() {
         UpdateLocationRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateLocationRequest buildPartial() {
         UpdateLocationRequest var1 = new UpdateLocationRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateLocationRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.inboundLocation_ = this.inboundLocationBuilder_ == null ? this.inboundLocation_ : this.inboundLocationBuilder_.build();
            var3 |= 2;
         }

         UpdateLocationRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateLocationRequest.Builder clone() {
         return (UpdateLocationRequest.Builder)super.clone();
      }

      public UpdateLocationRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLocationRequest.Builder)super.setField(var1, var2);
      }

      public UpdateLocationRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateLocationRequest.Builder)super.clearField(var1);
      }

      public UpdateLocationRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateLocationRequest.Builder)super.clearOneof(var1);
      }

      public UpdateLocationRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateLocationRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateLocationRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLocationRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateLocationRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateLocationRequest) {
            return this.mergeFrom((UpdateLocationRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateLocationRequest.Builder mergeFrom(UpdateLocationRequest var1) {
         if (var1 == UpdateLocationRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasInboundLocation()) {
            this.mergeInboundLocation(var1.getInboundLocation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateLocationRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getInboundLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public boolean hasLocation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public UpdateLocationRequest.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLocationRequest.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLocationRequest.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UpdateLocationRequest.Builder clearLocation() {
         this.bitField0_ &= -2;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public boolean hasInboundLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public InboundLocation getInboundLocation() {
         if (this.inboundLocationBuilder_ == null) {
            return this.inboundLocation_ == null ? InboundLocation.getDefaultInstance() : this.inboundLocation_;
         } else {
            return this.inboundLocationBuilder_.getMessage();
         }
      }

      public UpdateLocationRequest.Builder setInboundLocation(InboundLocation var1) {
         if (this.inboundLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.inboundLocation_ = var1;
         } else {
            this.inboundLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateLocationRequest.Builder setInboundLocation(InboundLocation.Builder var1) {
         if (this.inboundLocationBuilder_ == null) {
            this.inboundLocation_ = var1.build();
         } else {
            this.inboundLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateLocationRequest.Builder mergeInboundLocation(InboundLocation var1) {
         if (this.inboundLocationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.inboundLocation_ != null && this.inboundLocation_ != InboundLocation.getDefaultInstance()) {
               this.getInboundLocationBuilder().mergeFrom(var1);
            } else {
               this.inboundLocation_ = var1;
            }
         } else {
            this.inboundLocationBuilder_.mergeFrom(var1);
         }

         if (this.inboundLocation_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public UpdateLocationRequest.Builder clearInboundLocation() {
         this.bitField0_ &= -3;
         this.inboundLocation_ = null;
         if (this.inboundLocationBuilder_ != null) {
            this.inboundLocationBuilder_.dispose();
            this.inboundLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public InboundLocation.Builder getInboundLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getInboundLocationFieldBuilder().getBuilder();
      }

      @Override
      public InboundLocationOrBuilder getInboundLocationOrBuilder() {
         if (this.inboundLocationBuilder_ != null) {
            return this.inboundLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.inboundLocation_ == null ? InboundLocation.getDefaultInstance() : this.inboundLocation_;
         }
      }

      private SingleFieldBuilderV3<InboundLocation, InboundLocation.Builder, InboundLocationOrBuilder> getInboundLocationFieldBuilder() {
         if (this.inboundLocationBuilder_ == null) {
            this.inboundLocationBuilder_ = new SingleFieldBuilderV3<>(this.getInboundLocation(), this.getParentForChildren(), this.isClean());
            this.inboundLocation_ = null;
         }

         return this.inboundLocationBuilder_;
      }

      public final UpdateLocationRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateLocationRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateLocationRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateLocationRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
