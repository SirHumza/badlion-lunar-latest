package com.lunarclient.websocket.marker.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class NewMarkerPush extends GeneratedMessageV3 implements NewMarkerPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_UUID_FIELD_NUMBER = 1;
   private Uuid senderUuid_;
   public static final int MARKER_FIELD_NUMBER = 2;
   private Marker marker_;
   private byte memoizedIsInitialized = -1;
   private static final NewMarkerPush DEFAULT_INSTANCE = new NewMarkerPush();
   private static final Parser<NewMarkerPush> PARSER = new AbstractParser<NewMarkerPush>() {
      public NewMarkerPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         NewMarkerPush.Builder var3 = NewMarkerPush.newBuilder();

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

   private NewMarkerPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private NewMarkerPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new NewMarkerPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_marker_v1_NewMarkerPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_marker_v1_NewMarkerPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(NewMarkerPush.class, NewMarkerPush.Builder.class);
   }

   @Override
   public boolean hasSenderUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getSenderUuid() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public UuidOrBuilder getSenderUuidOrBuilder() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public boolean hasMarker() {
      return (this.bitField0_ & 2) != 0;
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
         var1.writeMessage(1, this.getSenderUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getMarker());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSenderUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getMarker());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof NewMarkerPush)) {
         return super.equals(var1);
      } else {
         NewMarkerPush var2 = (NewMarkerPush)var1;
         if (this.hasSenderUuid() != var2.hasSenderUuid()) {
            return false;
         } else if (this.hasSenderUuid() && !this.getSenderUuid().equals(var2.getSenderUuid())) {
            return false;
         } else if (this.hasMarker() != var2.hasMarker()) {
            return false;
         } else {
            return this.hasMarker() && !this.getMarker().equals(var2.getMarker()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSenderUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSenderUuid().hashCode();
      }

      if (this.hasMarker()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMarker().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static NewMarkerPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static NewMarkerPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NewMarkerPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static NewMarkerPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NewMarkerPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static NewMarkerPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NewMarkerPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NewMarkerPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static NewMarkerPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static NewMarkerPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static NewMarkerPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NewMarkerPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public NewMarkerPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static NewMarkerPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static NewMarkerPush.Builder newBuilder(NewMarkerPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public NewMarkerPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new NewMarkerPush.Builder() : new NewMarkerPush.Builder().mergeFrom(this);
   }

   protected NewMarkerPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new NewMarkerPush.Builder(var1);
   }

   public static NewMarkerPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<NewMarkerPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<NewMarkerPush> getParserForType() {
      return PARSER;
   }

   public NewMarkerPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<NewMarkerPush.Builder> implements NewMarkerPushOrBuilder {
      private int bitField0_;
      private Uuid senderUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> senderUuidBuilder_;
      private Marker marker_;
      private SingleFieldBuilderV3<Marker, Marker.Builder, MarkerOrBuilder> markerBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_marker_v1_NewMarkerPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_marker_v1_NewMarkerPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(NewMarkerPush.class, NewMarkerPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (NewMarkerPush.alwaysUseFieldBuilders) {
            this.getSenderUuidFieldBuilder();
            this.getMarkerFieldBuilder();
         }
      }

      public NewMarkerPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.marker_ = null;
         if (this.markerBuilder_ != null) {
            this.markerBuilder_.dispose();
            this.markerBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_marker_v1_NewMarkerPush_descriptor;
      }

      public NewMarkerPush getDefaultInstanceForType() {
         return NewMarkerPush.getDefaultInstance();
      }

      public NewMarkerPush build() {
         NewMarkerPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public NewMarkerPush buildPartial() {
         NewMarkerPush var1 = new NewMarkerPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(NewMarkerPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.senderUuid_ = this.senderUuidBuilder_ == null ? this.senderUuid_ : this.senderUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.marker_ = this.markerBuilder_ == null ? this.marker_ : this.markerBuilder_.build();
            var3 |= 2;
         }

         NewMarkerPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public NewMarkerPush.Builder clone() {
         return (NewMarkerPush.Builder)super.clone();
      }

      public NewMarkerPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NewMarkerPush.Builder)super.setField(var1, var2);
      }

      public NewMarkerPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (NewMarkerPush.Builder)super.clearField(var1);
      }

      public NewMarkerPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (NewMarkerPush.Builder)super.clearOneof(var1);
      }

      public NewMarkerPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (NewMarkerPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public NewMarkerPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NewMarkerPush.Builder)super.addRepeatedField(var1, var2);
      }

      public NewMarkerPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof NewMarkerPush) {
            return this.mergeFrom((NewMarkerPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public NewMarkerPush.Builder mergeFrom(NewMarkerPush var1) {
         if (var1 == NewMarkerPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSenderUuid()) {
            this.mergeSenderUuid(var1.getSenderUuid());
         }

         if (var1.hasMarker()) {
            this.mergeMarker(var1.getMarker());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public NewMarkerPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getMarkerFieldBuilder().getBuilder(), var2);
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
      public boolean hasSenderUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getSenderUuid() {
         if (this.senderUuidBuilder_ == null) {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         } else {
            return this.senderUuidBuilder_.getMessage();
         }
      }

      public NewMarkerPush.Builder setSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderUuid_ = var1;
         } else {
            this.senderUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public NewMarkerPush.Builder setSenderUuid(Uuid.Builder var1) {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuid_ = var1.build();
         } else {
            this.senderUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public NewMarkerPush.Builder mergeSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.senderUuid_ != null && this.senderUuid_ != Uuid.getDefaultInstance()) {
               this.getSenderUuidBuilder().mergeFrom(var1);
            } else {
               this.senderUuid_ = var1;
            }
         } else {
            this.senderUuidBuilder_.mergeFrom(var1);
         }

         if (this.senderUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public NewMarkerPush.Builder clearSenderUuid() {
         this.bitField0_ &= -2;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getSenderUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSenderUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getSenderUuidOrBuilder() {
         if (this.senderUuidBuilder_ != null) {
            return this.senderUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getSenderUuidFieldBuilder() {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuidBuilder_ = new SingleFieldBuilderV3<>(this.getSenderUuid(), this.getParentForChildren(), this.isClean());
            this.senderUuid_ = null;
         }

         return this.senderUuidBuilder_;
      }

      @Override
      public boolean hasMarker() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Marker getMarker() {
         if (this.markerBuilder_ == null) {
            return this.marker_ == null ? Marker.getDefaultInstance() : this.marker_;
         } else {
            return this.markerBuilder_.getMessage();
         }
      }

      public NewMarkerPush.Builder setMarker(Marker var1) {
         if (this.markerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.marker_ = var1;
         } else {
            this.markerBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public NewMarkerPush.Builder setMarker(Marker.Builder var1) {
         if (this.markerBuilder_ == null) {
            this.marker_ = var1.build();
         } else {
            this.markerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public NewMarkerPush.Builder mergeMarker(Marker var1) {
         if (this.markerBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.marker_ != null && this.marker_ != Marker.getDefaultInstance()) {
               this.getMarkerBuilder().mergeFrom(var1);
            } else {
               this.marker_ = var1;
            }
         } else {
            this.markerBuilder_.mergeFrom(var1);
         }

         if (this.marker_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public NewMarkerPush.Builder clearMarker() {
         this.bitField0_ &= -3;
         this.marker_ = null;
         if (this.markerBuilder_ != null) {
            this.markerBuilder_.dispose();
            this.markerBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Marker.Builder getMarkerBuilder() {
         this.bitField0_ |= 2;
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

      public final NewMarkerPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (NewMarkerPush.Builder)super.setUnknownFields(var1);
      }

      public final NewMarkerPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (NewMarkerPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
