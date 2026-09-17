package com.lunarclient.apollo.pingmarker.v1;

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
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RequestPlayerPingMessage extends GeneratedMessageV3 implements RequestPlayerPingMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   public static final int TYPE_FIELD_NUMBER = 2;
   private volatile Object type_ = "";
   public static final int SOURCE_LOCATION_FIELD_NUMBER = 3;
   private Location sourceLocation_;
   public static final int TARGET_LOCATION_FIELD_NUMBER = 4;
   private Location targetLocation_;
   private byte memoizedIsInitialized = -1;
   private static final RequestPlayerPingMessage DEFAULT_INSTANCE = new RequestPlayerPingMessage();
   private static final Parser<RequestPlayerPingMessage> PARSER = new AbstractParser<RequestPlayerPingMessage>() {
      public RequestPlayerPingMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RequestPlayerPingMessage.Builder var3 = RequestPlayerPingMessage.newBuilder();

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

   private RequestPlayerPingMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RequestPlayerPingMessage() {
      this.type_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RequestPlayerPingMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RequestPlayerPingMessage.class, RequestPlayerPingMessage.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public String getType() {
      Object var1 = this.type_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.type_ = var3;
      return var3;
   }

   @Override
   public ByteString getTypeBytes() {
      Object var1 = this.type_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.type_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasSourceLocation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Location getSourceLocation() {
      return this.sourceLocation_ == null ? Location.getDefaultInstance() : this.sourceLocation_;
   }

   @Override
   public LocationOrBuilder getSourceLocationOrBuilder() {
      return this.sourceLocation_ == null ? Location.getDefaultInstance() : this.sourceLocation_;
   }

   @Override
   public boolean hasTargetLocation() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Location getTargetLocation() {
      return this.targetLocation_ == null ? Location.getDefaultInstance() : this.targetLocation_;
   }

   @Override
   public LocationOrBuilder getTargetLocationOrBuilder() {
      return this.targetLocation_ == null ? Location.getDefaultInstance() : this.targetLocation_;
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
         var1.writeMessage(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
         GeneratedMessageV3.writeString(var1, 2, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getSourceLocation());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getTargetLocation());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getSourceLocation());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getTargetLocation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RequestPlayerPingMessage)) {
         return super.equals(var1);
      } else {
         RequestPlayerPingMessage var2 = (RequestPlayerPingMessage)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else if (this.hasId() && !this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getType().equals(var2.getType())) {
            return false;
         } else if (this.hasSourceLocation() != var2.hasSourceLocation()) {
            return false;
         } else if (this.hasSourceLocation() && !this.getSourceLocation().equals(var2.getSourceLocation())) {
            return false;
         } else if (this.hasTargetLocation() != var2.hasTargetLocation()) {
            return false;
         } else {
            return this.hasTargetLocation() && !this.getTargetLocation().equals(var2.getTargetLocation())
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getType().hashCode();
      if (this.hasSourceLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getSourceLocation().hashCode();
      }

      if (this.hasTargetLocation()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getTargetLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RequestPlayerPingMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RequestPlayerPingMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RequestPlayerPingMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RequestPlayerPingMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RequestPlayerPingMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RequestPlayerPingMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RequestPlayerPingMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RequestPlayerPingMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RequestPlayerPingMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RequestPlayerPingMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RequestPlayerPingMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RequestPlayerPingMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RequestPlayerPingMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RequestPlayerPingMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RequestPlayerPingMessage.Builder newBuilder(RequestPlayerPingMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RequestPlayerPingMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RequestPlayerPingMessage.Builder() : new RequestPlayerPingMessage.Builder().mergeFrom(this);
   }

   protected RequestPlayerPingMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RequestPlayerPingMessage.Builder(var1);
   }

   public static RequestPlayerPingMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RequestPlayerPingMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RequestPlayerPingMessage> getParserForType() {
      return PARSER;
   }

   public RequestPlayerPingMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RequestPlayerPingMessage.Builder> implements RequestPlayerPingMessageOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;
      private Object type_ = "";
      private Location sourceLocation_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> sourceLocationBuilder_;
      private Location targetLocation_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> targetLocationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RequestPlayerPingMessage.class, RequestPlayerPingMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RequestPlayerPingMessage.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
            this.getSourceLocationFieldBuilder();
            this.getTargetLocationFieldBuilder();
         }
      }

      public RequestPlayerPingMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.type_ = "";
         this.sourceLocation_ = null;
         if (this.sourceLocationBuilder_ != null) {
            this.sourceLocationBuilder_.dispose();
            this.sourceLocationBuilder_ = null;
         }

         this.targetLocation_ = null;
         if (this.targetLocationBuilder_ != null) {
            this.targetLocationBuilder_.dispose();
            this.targetLocationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RequestPlayerPingMessage_descriptor;
      }

      public RequestPlayerPingMessage getDefaultInstanceForType() {
         return RequestPlayerPingMessage.getDefaultInstance();
      }

      public RequestPlayerPingMessage build() {
         RequestPlayerPingMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RequestPlayerPingMessage buildPartial() {
         RequestPlayerPingMessage var1 = new RequestPlayerPingMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RequestPlayerPingMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.type_ = this.type_;
         }

         if ((var2 & 4) != 0) {
            var1.sourceLocation_ = this.sourceLocationBuilder_ == null ? this.sourceLocation_ : this.sourceLocationBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.targetLocation_ = this.targetLocationBuilder_ == null ? this.targetLocation_ : this.targetLocationBuilder_.build();
            var3 |= 4;
         }

         RequestPlayerPingMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RequestPlayerPingMessage.Builder clone() {
         return (RequestPlayerPingMessage.Builder)super.clone();
      }

      public RequestPlayerPingMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RequestPlayerPingMessage.Builder)super.setField(var1, var2);
      }

      public RequestPlayerPingMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RequestPlayerPingMessage.Builder)super.clearField(var1);
      }

      public RequestPlayerPingMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RequestPlayerPingMessage.Builder)super.clearOneof(var1);
      }

      public RequestPlayerPingMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RequestPlayerPingMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RequestPlayerPingMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RequestPlayerPingMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RequestPlayerPingMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RequestPlayerPingMessage) {
            return this.mergeFrom((RequestPlayerPingMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RequestPlayerPingMessage.Builder mergeFrom(RequestPlayerPingMessage var1) {
         if (var1 == RequestPlayerPingMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (!var1.getType().isEmpty()) {
            this.type_ = var1.type_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.hasSourceLocation()) {
            this.mergeSourceLocation(var1.getSourceLocation());
         }

         if (var1.hasTargetLocation()) {
            this.mergeTargetLocation(var1.getTargetLocation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RequestPlayerPingMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.type_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getSourceLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getTargetLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
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
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public RequestPlayerPingMessage.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public RequestPlayerPingMessage.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      @Override
      public String getType() {
         Object var1 = this.type_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.type_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTypeBytes() {
         Object var1 = this.type_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.type_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RequestPlayerPingMessage.Builder setType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder clearType() {
         this.type_ = RequestPlayerPingMessage.getDefaultInstance().getType();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder setTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RequestPlayerPingMessage.checkByteStringIsUtf8(var1);
         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasSourceLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Location getSourceLocation() {
         if (this.sourceLocationBuilder_ == null) {
            return this.sourceLocation_ == null ? Location.getDefaultInstance() : this.sourceLocation_;
         } else {
            return this.sourceLocationBuilder_.getMessage();
         }
      }

      public RequestPlayerPingMessage.Builder setSourceLocation(Location var1) {
         if (this.sourceLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sourceLocation_ = var1;
         } else {
            this.sourceLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder setSourceLocation(Location.Builder var1) {
         if (this.sourceLocationBuilder_ == null) {
            this.sourceLocation_ = var1.build();
         } else {
            this.sourceLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder mergeSourceLocation(Location var1) {
         if (this.sourceLocationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.sourceLocation_ != null && this.sourceLocation_ != Location.getDefaultInstance()) {
               this.getSourceLocationBuilder().mergeFrom(var1);
            } else {
               this.sourceLocation_ = var1;
            }
         } else {
            this.sourceLocationBuilder_.mergeFrom(var1);
         }

         if (this.sourceLocation_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public RequestPlayerPingMessage.Builder clearSourceLocation() {
         this.bitField0_ &= -5;
         this.sourceLocation_ = null;
         if (this.sourceLocationBuilder_ != null) {
            this.sourceLocationBuilder_.dispose();
            this.sourceLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getSourceLocationBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getSourceLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getSourceLocationOrBuilder() {
         if (this.sourceLocationBuilder_ != null) {
            return this.sourceLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.sourceLocation_ == null ? Location.getDefaultInstance() : this.sourceLocation_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getSourceLocationFieldBuilder() {
         if (this.sourceLocationBuilder_ == null) {
            this.sourceLocationBuilder_ = new SingleFieldBuilderV3<>(this.getSourceLocation(), this.getParentForChildren(), this.isClean());
            this.sourceLocation_ = null;
         }

         return this.sourceLocationBuilder_;
      }

      @Override
      public boolean hasTargetLocation() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Location getTargetLocation() {
         if (this.targetLocationBuilder_ == null) {
            return this.targetLocation_ == null ? Location.getDefaultInstance() : this.targetLocation_;
         } else {
            return this.targetLocationBuilder_.getMessage();
         }
      }

      public RequestPlayerPingMessage.Builder setTargetLocation(Location var1) {
         if (this.targetLocationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetLocation_ = var1;
         } else {
            this.targetLocationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder setTargetLocation(Location.Builder var1) {
         if (this.targetLocationBuilder_ == null) {
            this.targetLocation_ = var1.build();
         } else {
            this.targetLocationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RequestPlayerPingMessage.Builder mergeTargetLocation(Location var1) {
         if (this.targetLocationBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.targetLocation_ != null && this.targetLocation_ != Location.getDefaultInstance()) {
               this.getTargetLocationBuilder().mergeFrom(var1);
            } else {
               this.targetLocation_ = var1;
            }
         } else {
            this.targetLocationBuilder_.mergeFrom(var1);
         }

         if (this.targetLocation_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public RequestPlayerPingMessage.Builder clearTargetLocation() {
         this.bitField0_ &= -9;
         this.targetLocation_ = null;
         if (this.targetLocationBuilder_ != null) {
            this.targetLocationBuilder_.dispose();
            this.targetLocationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getTargetLocationBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getTargetLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getTargetLocationOrBuilder() {
         if (this.targetLocationBuilder_ != null) {
            return this.targetLocationBuilder_.getMessageOrBuilder();
         } else {
            return this.targetLocation_ == null ? Location.getDefaultInstance() : this.targetLocation_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getTargetLocationFieldBuilder() {
         if (this.targetLocationBuilder_ == null) {
            this.targetLocationBuilder_ = new SingleFieldBuilderV3<>(this.getTargetLocation(), this.getParentForChildren(), this.isClean());
            this.targetLocation_ = null;
         }

         return this.targetLocationBuilder_;
      }

      public final RequestPlayerPingMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RequestPlayerPingMessage.Builder)super.setUnknownFields(var1);
      }

      public final RequestPlayerPingMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RequestPlayerPingMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
