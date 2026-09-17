package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BroadcastNewMarkerRequest extends GeneratedMessageV3 implements BroadcastNewMarkerRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MARKER_FIELD_NUMBER = 1;
   private Marker marker_;
   public static final int RECEIVER_UUIDS_FIELD_NUMBER = 2;
   private List<Uuid> receiverUuids_;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastNewMarkerRequest DEFAULT_INSTANCE = new BroadcastNewMarkerRequest();
   private static final Parser<BroadcastNewMarkerRequest> PARSER = new AbstractParser<BroadcastNewMarkerRequest>() {
      public BroadcastNewMarkerRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastNewMarkerRequest.Builder var3 = BroadcastNewMarkerRequest.newBuilder();

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

   private BroadcastNewMarkerRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastNewMarkerRequest() {
      this.receiverUuids_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastNewMarkerRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastNewMarkerRequest.class, BroadcastNewMarkerRequest.Builder.class);
   }

   @Override
   public boolean hasMarker() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Marker getMarker() {
      return this.marker_ == null ? Marker.getDefaultInstance() : this.marker_;
   }

   @Override
   public MarkerOrBuilder getMarkerOrBuilder() {
      return this.marker_ == null ? Marker.getDefaultInstance() : this.marker_;
   }

   @Override
   public List<Uuid> getReceiverUuidsList() {
      return this.receiverUuids_;
   }

   @Override
   public List<? extends UuidOrBuilder> getReceiverUuidsOrBuilderList() {
      return this.receiverUuids_;
   }

   @Override
   public int getReceiverUuidsCount() {
      return this.receiverUuids_.size();
   }

   @Override
   public Uuid getReceiverUuids(int var1) {
      return this.receiverUuids_.get(var1);
   }

   @Override
   public UuidOrBuilder getReceiverUuidsOrBuilder(int var1) {
      return this.receiverUuids_.get(var1);
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
         var1.writeMessage(1, this.getMarker());
      }

      for (int var2 = 0; var2 < this.receiverUuids_.size(); var2++) {
         var1.writeMessage(2, this.receiverUuids_.get(var2));
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getMarker());
      }

      for (int var2 = 0; var2 < this.receiverUuids_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.receiverUuids_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BroadcastNewMarkerRequest)) {
         return super.equals(var1);
      } else {
         BroadcastNewMarkerRequest var2 = (BroadcastNewMarkerRequest)var1;
         if (this.hasMarker() != var2.hasMarker()) {
            return false;
         } else if (this.hasMarker() && !this.getMarker().equals(var2.getMarker())) {
            return false;
         } else {
            return !this.getReceiverUuidsList().equals(var2.getReceiverUuidsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasMarker()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMarker().hashCode();
      }

      if (this.getReceiverUuidsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getReceiverUuidsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastNewMarkerRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastNewMarkerRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastNewMarkerRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastNewMarkerRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastNewMarkerRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastNewMarkerRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastNewMarkerRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastNewMarkerRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastNewMarkerRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastNewMarkerRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastNewMarkerRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastNewMarkerRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastNewMarkerRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastNewMarkerRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastNewMarkerRequest.Builder newBuilder(BroadcastNewMarkerRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastNewMarkerRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastNewMarkerRequest.Builder() : new BroadcastNewMarkerRequest.Builder().mergeFrom(this);
   }

   protected BroadcastNewMarkerRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastNewMarkerRequest.Builder(var1);
   }

   public static BroadcastNewMarkerRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastNewMarkerRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastNewMarkerRequest> getParserForType() {
      return PARSER;
   }

   public BroadcastNewMarkerRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<BroadcastNewMarkerRequest.Builder> implements BroadcastNewMarkerRequestOrBuilder {
      private int bitField0_;
      private Marker marker_;
      private SingleFieldBuilderV3<Marker, Marker.Builder, MarkerOrBuilder> markerBuilder_;
      private List<Uuid> receiverUuids_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> receiverUuidsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastNewMarkerRequest.class, BroadcastNewMarkerRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BroadcastNewMarkerRequest.alwaysUseFieldBuilders) {
            this.getMarkerFieldBuilder();
            this.getReceiverUuidsFieldBuilder();
         }
      }

      public BroadcastNewMarkerRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.marker_ = null;
         if (this.markerBuilder_ != null) {
            this.markerBuilder_.dispose();
            this.markerBuilder_ = null;
         }

         if (this.receiverUuidsBuilder_ == null) {
            this.receiverUuids_ = Collections.emptyList();
         } else {
            this.receiverUuids_ = null;
            this.receiverUuidsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_descriptor;
      }

      public BroadcastNewMarkerRequest getDefaultInstanceForType() {
         return BroadcastNewMarkerRequest.getDefaultInstance();
      }

      public BroadcastNewMarkerRequest build() {
         BroadcastNewMarkerRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastNewMarkerRequest buildPartial() {
         BroadcastNewMarkerRequest var1 = new BroadcastNewMarkerRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(BroadcastNewMarkerRequest var1) {
         if (this.receiverUuidsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.receiverUuids_ = Collections.unmodifiableList(this.receiverUuids_);
               this.bitField0_ &= -3;
            }

            var1.receiverUuids_ = this.receiverUuids_;
         } else {
            var1.receiverUuids_ = this.receiverUuidsBuilder_.build();
         }
      }

      private void buildPartial0(BroadcastNewMarkerRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.marker_ = this.markerBuilder_ == null ? this.marker_ : this.markerBuilder_.build();
            var3 |= 1;
         }

         BroadcastNewMarkerRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public BroadcastNewMarkerRequest.Builder clone() {
         return (BroadcastNewMarkerRequest.Builder)super.clone();
      }

      public BroadcastNewMarkerRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastNewMarkerRequest.Builder)super.setField(var1, var2);
      }

      public BroadcastNewMarkerRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastNewMarkerRequest.Builder)super.clearField(var1);
      }

      public BroadcastNewMarkerRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastNewMarkerRequest.Builder)super.clearOneof(var1);
      }

      public BroadcastNewMarkerRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastNewMarkerRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastNewMarkerRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastNewMarkerRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastNewMarkerRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastNewMarkerRequest) {
            return this.mergeFrom((BroadcastNewMarkerRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastNewMarkerRequest.Builder mergeFrom(BroadcastNewMarkerRequest var1) {
         if (var1 == BroadcastNewMarkerRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMarker()) {
            this.mergeMarker(var1.getMarker());
         }

         if (this.receiverUuidsBuilder_ == null) {
            if (!var1.receiverUuids_.isEmpty()) {
               if (this.receiverUuids_.isEmpty()) {
                  this.receiverUuids_ = var1.receiverUuids_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureReceiverUuidsIsMutable();
                  this.receiverUuids_.addAll(var1.receiverUuids_);
               }

               this.onChanged();
            }
         } else if (!var1.receiverUuids_.isEmpty()) {
            if (this.receiverUuidsBuilder_.isEmpty()) {
               this.receiverUuidsBuilder_.dispose();
               this.receiverUuidsBuilder_ = null;
               this.receiverUuids_ = var1.receiverUuids_;
               this.bitField0_ &= -3;
               this.receiverUuidsBuilder_ = BroadcastNewMarkerRequest.alwaysUseFieldBuilders ? this.getReceiverUuidsFieldBuilder() : null;
            } else {
               this.receiverUuidsBuilder_.addAllMessages(var1.receiverUuids_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastNewMarkerRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMarkerFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     Uuid var5 = var1.readMessage(Uuid.parser(), var2);
                     if (this.receiverUuidsBuilder_ == null) {
                        this.ensureReceiverUuidsIsMutable();
                        this.receiverUuids_.add(var5);
                     } else {
                        this.receiverUuidsBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasMarker() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Marker getMarker() {
         if (this.markerBuilder_ == null) {
            return this.marker_ == null ? Marker.getDefaultInstance() : this.marker_;
         } else {
            return this.markerBuilder_.getMessage();
         }
      }

      public BroadcastNewMarkerRequest.Builder setMarker(Marker var1) {
         if (this.markerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.marker_ = var1;
         } else {
            this.markerBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastNewMarkerRequest.Builder setMarker(Marker.Builder var1) {
         if (this.markerBuilder_ == null) {
            this.marker_ = var1.build();
         } else {
            this.markerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BroadcastNewMarkerRequest.Builder mergeMarker(Marker var1) {
         if (this.markerBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.marker_ != null && this.marker_ != Marker.getDefaultInstance()) {
               this.getMarkerBuilder().mergeFrom(var1);
            } else {
               this.marker_ = var1;
            }
         } else {
            this.markerBuilder_.mergeFrom(var1);
         }

         if (this.marker_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder clearMarker() {
         this.bitField0_ &= -2;
         this.marker_ = null;
         if (this.markerBuilder_ != null) {
            this.markerBuilder_.dispose();
            this.markerBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Marker.Builder getMarkerBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getMarkerFieldBuilder().getBuilder();
      }

      @Override
      public MarkerOrBuilder getMarkerOrBuilder() {
         if (this.markerBuilder_ != null) {
            return this.markerBuilder_.getMessageOrBuilder();
         } else {
            return this.marker_ == null ? Marker.getDefaultInstance() : this.marker_;
         }
      }

      private SingleFieldBuilderV3<Marker, Marker.Builder, MarkerOrBuilder> getMarkerFieldBuilder() {
         if (this.markerBuilder_ == null) {
            this.markerBuilder_ = new SingleFieldBuilderV3<>(this.getMarker(), this.getParentForChildren(), this.isClean());
            this.marker_ = null;
         }

         return this.markerBuilder_;
      }

      private void ensureReceiverUuidsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.receiverUuids_ = new ArrayList<>(this.receiverUuids_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<Uuid> getReceiverUuidsList() {
         return this.receiverUuidsBuilder_ == null ? Collections.unmodifiableList(this.receiverUuids_) : this.receiverUuidsBuilder_.getMessageList();
      }

      @Override
      public int getReceiverUuidsCount() {
         return this.receiverUuidsBuilder_ == null ? this.receiverUuids_.size() : this.receiverUuidsBuilder_.getCount();
      }

      @Override
      public Uuid getReceiverUuids(int var1) {
         return this.receiverUuidsBuilder_ == null ? this.receiverUuids_.get(var1) : this.receiverUuidsBuilder_.getMessage(var1);
      }

      public BroadcastNewMarkerRequest.Builder setReceiverUuids(int var1, Uuid var2) {
         if (this.receiverUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.set(var1, var2);
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder setReceiverUuids(int var1, Uuid.Builder var2) {
         if (this.receiverUuidsBuilder_ == null) {
            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder addReceiverUuids(Uuid var1) {
         if (this.receiverUuidsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.add(var1);
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.addMessage(var1);
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder addReceiverUuids(int var1, Uuid var2) {
         if (this.receiverUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.add(var1, var2);
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder addReceiverUuids(Uuid.Builder var1) {
         if (this.receiverUuidsBuilder_ == null) {
            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.add(var1.build());
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder addReceiverUuids(int var1, Uuid.Builder var2) {
         if (this.receiverUuidsBuilder_ == null) {
            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder addAllReceiverUuids(Iterable<? extends Uuid> var1) {
         if (this.receiverUuidsBuilder_ == null) {
            this.ensureReceiverUuidsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.receiverUuids_);
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder clearReceiverUuids() {
         if (this.receiverUuidsBuilder_ == null) {
            this.receiverUuids_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.clear();
         }

         return this;
      }

      public BroadcastNewMarkerRequest.Builder removeReceiverUuids(int var1) {
         if (this.receiverUuidsBuilder_ == null) {
            this.ensureReceiverUuidsIsMutable();
            this.receiverUuids_.remove(var1);
            this.onChanged();
         } else {
            this.receiverUuidsBuilder_.remove(var1);
         }

         return this;
      }

      public Uuid.Builder getReceiverUuidsBuilder(int var1) {
         return this.getReceiverUuidsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidOrBuilder getReceiverUuidsOrBuilder(int var1) {
         return this.receiverUuidsBuilder_ == null ? this.receiverUuids_.get(var1) : this.receiverUuidsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidOrBuilder> getReceiverUuidsOrBuilderList() {
         return this.receiverUuidsBuilder_ != null ? this.receiverUuidsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.receiverUuids_);
      }

      public Uuid.Builder addReceiverUuidsBuilder() {
         return this.getReceiverUuidsFieldBuilder().addBuilder(Uuid.getDefaultInstance());
      }

      public Uuid.Builder addReceiverUuidsBuilder(int var1) {
         return this.getReceiverUuidsFieldBuilder().addBuilder(var1, Uuid.getDefaultInstance());
      }

      public List<Uuid.Builder> getReceiverUuidsBuilderList() {
         return this.getReceiverUuidsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getReceiverUuidsFieldBuilder() {
         if (this.receiverUuidsBuilder_ == null) {
            this.receiverUuidsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.receiverUuids_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.receiverUuids_ = null;
         }

         return this.receiverUuidsBuilder_;
      }

      public final BroadcastNewMarkerRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastNewMarkerRequest.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastNewMarkerRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastNewMarkerRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
