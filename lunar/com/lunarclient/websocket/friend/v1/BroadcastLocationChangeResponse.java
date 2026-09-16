package com.lunarclient.websocket.friend.v1;

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
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BroadcastLocationChangeResponse extends GeneratedMessageV3 implements BroadcastLocationChangeResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NEW_LOCATION_FIELD_NUMBER = 1;
   private Location newLocation_;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastLocationChangeResponse DEFAULT_INSTANCE = new BroadcastLocationChangeResponse();
   private static final Parser<BroadcastLocationChangeResponse> PARSER = new AbstractParser<BroadcastLocationChangeResponse>() {
      public BroadcastLocationChangeResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastLocationChangeResponse.Builder var3 = BroadcastLocationChangeResponse.newBuilder();

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

   private BroadcastLocationChangeResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastLocationChangeResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastLocationChangeResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastLocationChangeResponse.class, BroadcastLocationChangeResponse.Builder.class);
   }

   @Override
   public boolean hasNewLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getNewLocation() {
      return this.newLocation_ == null ? Location.getDefaultInstance() : this.newLocation_;
   }

   @Override
   public LocationOrBuilder getNewLocationOrBuilder() {
      return this.newLocation_ == null ? Location.getDefaultInstance() : this.newLocation_;
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
         var1.writeMessage(1, this.getNewLocation());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNewLocation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BroadcastLocationChangeResponse)) {
         return super.equals(var1);
      } else {
         BroadcastLocationChangeResponse var2 = (BroadcastLocationChangeResponse)var1;
         if (this.hasNewLocation() != var2.hasNewLocation()) {
            return false;
         } else {
            return this.hasNewLocation() && !this.getNewLocation().equals(var2.getNewLocation())
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
      if (this.hasNewLocation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNewLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastLocationChangeResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastLocationChangeResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastLocationChangeResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastLocationChangeResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastLocationChangeResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastLocationChangeResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastLocationChangeResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastLocationChangeResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastLocationChangeResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastLocationChangeResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastLocationChangeResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastLocationChangeResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastLocationChangeResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastLocationChangeResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastLocationChangeResponse.Builder newBuilder(BroadcastLocationChangeResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastLocationChangeResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastLocationChangeResponse.Builder() : new BroadcastLocationChangeResponse.Builder().mergeFrom(this);
   }

   protected BroadcastLocationChangeResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastLocationChangeResponse.Builder(var1);
   }

   public static BroadcastLocationChangeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastLocationChangeResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastLocationChangeResponse> getParserForType() {
      return PARSER;
   }

   public BroadcastLocationChangeResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastLocationChangeResponse.Builder>
      implements BroadcastLocationChangeResponseOrBuilder {
      private int bitField0_;
      private Location newLocation_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> newLocationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastLocationChangeResponse.class, BroadcastLocationChangeResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BroadcastLocationChangeResponse.alwaysUseFieldBuilders) {
            this.getNewLocationFieldBuilder();
         }
      }

      public BroadcastLocationChangeResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newLocation_ = null;
         if (this.newLocationBuilder_ != null) {
            this.newLocationBuilder_.dispose();
            this.newLocationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_descriptor;
      }

      public BroadcastLocationChangeResponse getDefaultInstanceForType() {
         return BroadcastLocationChangeResponse.getDefaultInstance();
      }

      public BroadcastLocationChangeResponse build() {
         BroadcastLocationChangeResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastLocationChangeResponse buildPartial() {
         BroadcastLocationChangeResponse var1 = new BroadcastLocationChangeResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BroadcastLocationChangeResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.newLocation_ = this.newLocationBuilder_ == null ? this.newLocation_ : this.newLocationBuilder_.build();
            var3 |= 1;
         }

         BroadcastLocationChangeResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BroadcastLocationChangeResponse.Builder clone() {
         return (BroadcastLocationChangeResponse.Builder)super.clone();
      }

      public BroadcastLocationChangeResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastLocationChangeResponse.Builder)super.setField(var1, var2);
      }

      public BroadcastLocationChangeResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastLocationChangeResponse.Builder)super.clearField(var1);
      }

      public BroadcastLocationChangeResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastLocationChangeResponse.Builder)super.clearOneof(var1);
      }

      public BroadcastLocationChangeResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastLocationChangeResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastLocationChangeResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastLocationChangeResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastLocationChangeResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastLocationChangeResponse) {
            return this.mergeFrom((BroadcastLocationChangeResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastLocationChangeResponse.Builder mergeFrom(BroadcastLocationChangeResponse var1) {
         if (var1 == BroadcastLocationChangeResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNewLocation()) {
            this.mergeNewLocation(var1.getNewLocation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastLocationChangeResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNewLocationFieldBuilder().getBuilder(), var2);
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
      public boolean hasNewLocation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Location getNewLocation() {
         if (this.newLocationBuilder_ == null) {
            return this.newLocation_ == null ? Location.getDefaultInstance() : this.newLocation_;
         } else {
            return this.newLocationBuilder_.getMessage();
         }
      }

      public BroadcastLocationChangeResponse.Builder setNewLocation(Location var1) {
         if (this.newLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newLocation_ = var1;
         } else {
            this.newLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastLocationChangeResponse.Builder setNewLocation(Location.Builder var1) {
         if (this.newLocationBuilder_ == null) {
            this.newLocation_ = var1.build();
         } else {
            this.newLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastLocationChangeResponse.Builder mergeNewLocation(Location var1) {
         if (this.newLocationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.newLocation_ != null && this.newLocation_ != Location.getDefaultInstance()) {
               this.getNewLocationBuilder().mergeFrom(var1);
            } else {
               this.newLocation_ = var1;
            }
         } else {
            this.newLocationBuilder_.mergeFrom(var1);
         }

         if (this.newLocation_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BroadcastLocationChangeResponse.Builder clearNewLocation() {
         this.bitField0_ &= -2;
         this.newLocation_ = null;
         if (this.newLocationBuilder_ != null) {
            this.newLocationBuilder_.dispose();
            this.newLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getNewLocationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNewLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getNewLocationOrBuilder() {
         if (this.newLocationBuilder_ != null) {
            return this.newLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.newLocation_ == null ? Location.getDefaultInstance() : this.newLocation_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getNewLocationFieldBuilder() {
         if (this.newLocationBuilder_ == null) {
            this.newLocationBuilder_ = new SingleFieldBuilderV3<>(this.getNewLocation(), this.getParentForChildren(), this.isClean());
            this.newLocation_ = null;
         }

         return this.newLocationBuilder_;
      }

      public final BroadcastLocationChangeResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastLocationChangeResponse.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastLocationChangeResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastLocationChangeResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
