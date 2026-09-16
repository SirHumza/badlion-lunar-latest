package com.lunarclient.websocket.heartbeat.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OpenRenderer extends GeneratedMessageV3 implements OpenRendererOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int ROUTE_FIELD_NUMBER = 2;
   private volatile Object route_ = "";
   public static final int TITLE_FIELD_NUMBER = 3;
   private volatile Object title_ = "";
   public static final int FOCUSED_FIELD_NUMBER = 4;
   private boolean focused_ = false;
   public static final int VISIBLE_FIELD_NUMBER = 5;
   private boolean visible_ = false;
   public static final int FULLSCREENED_FIELD_NUMBER = 6;
   private boolean fullscreened_ = false;
   public static final int MINIMIZED_FIELD_NUMBER = 7;
   private boolean minimized_ = false;
   public static final int POSITION_FIELD_NUMBER = 8;
   private RendererPosition position_;
   public static final int CONTENT_TYPE_FIELD_NUMBER = 9;
   private int contentType_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OpenRenderer DEFAULT_INSTANCE = new OpenRenderer();
   private static final Parser<OpenRenderer> PARSER = new AbstractParser<OpenRenderer>() {
      public OpenRenderer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenRenderer.Builder var3 = OpenRenderer.newBuilder();

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

   private OpenRenderer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenRenderer() {
      this.id_ = "";
      this.route_ = "";
      this.title_ = "";
      this.contentType_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenRenderer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenRenderer.class, OpenRenderer.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getRoute() {
      Object var1 = this.route_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.route_ = var3;
      return var3;
   }

   @Override
   public ByteString getRouteBytes() {
      Object var1 = this.route_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.route_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getTitle() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.title_ = var3;
      return var3;
   }

   @Override
   public ByteString getTitleBytes() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.title_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getFocused() {
      return this.focused_;
   }

   @Override
   public boolean getVisible() {
      return this.visible_;
   }

   @Override
   public boolean getFullscreened() {
      return this.fullscreened_;
   }

   @Override
   public boolean getMinimized() {
      return this.minimized_;
   }

   @Override
   public boolean hasPosition() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public RendererPosition getPosition() {
      return this.position_ == null ? RendererPosition.getDefaultInstance() : this.position_;
   }

   @Override
   public RendererPositionOrBuilder getPositionOrBuilder() {
      return this.position_ == null ? RendererPosition.getDefaultInstance() : this.position_;
   }

   @Override
   public int getContentTypeValue() {
      return this.contentType_;
   }

   @Override
   public OpenRenderer.ContentType getContentType() {
      OpenRenderer.ContentType var1 = OpenRenderer.ContentType.forNumber(this.contentType_);
      return var1 == null ? OpenRenderer.ContentType.UNRECOGNIZED : var1;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.route_)) {
         GeneratedMessageV3.writeString(var1, 2, this.route_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         GeneratedMessageV3.writeString(var1, 3, this.title_);
      }

      if (this.focused_) {
         var1.writeBool(4, this.focused_);
      }

      if (this.visible_) {
         var1.writeBool(5, this.visible_);
      }

      if (this.fullscreened_) {
         var1.writeBool(6, this.fullscreened_);
      }

      if (this.minimized_) {
         var1.writeBool(7, this.minimized_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(8, this.getPosition());
      }

      if (this.contentType_ != OpenRenderer.ContentType.CONTENT_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(9, this.contentType_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.route_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.route_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.title_);
      }

      if (this.focused_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.focused_);
      }

      if (this.visible_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.visible_);
      }

      if (this.fullscreened_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.fullscreened_);
      }

      if (this.minimized_) {
         var1 += CodedOutputStream.computeBoolSize(7, this.minimized_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getPosition());
      }

      if (this.contentType_ != OpenRenderer.ContentType.CONTENT_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(9, this.contentType_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OpenRenderer)) {
         return super.equals(var1);
      } else {
         OpenRenderer var2 = (OpenRenderer)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getRoute().equals(var2.getRoute())) {
            return false;
         } else if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (this.getFocused() != var2.getFocused()) {
            return false;
         } else if (this.getVisible() != var2.getVisible()) {
            return false;
         } else if (this.getFullscreened() != var2.getFullscreened()) {
            return false;
         } else if (this.getMinimized() != var2.getMinimized()) {
            return false;
         } else if (this.hasPosition() != var2.hasPosition()) {
            return false;
         } else if (this.hasPosition() && !this.getPosition().equals(var2.getPosition())) {
            return false;
         } else {
            return this.contentType_ != var2.contentType_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getRoute().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getTitle().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFocused());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getVisible());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFullscreened());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getMinimized());
      if (this.hasPosition()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getPosition().hashCode();
      }

      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.contentType_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenRenderer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenRenderer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenRenderer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenRenderer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenRenderer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenRenderer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenRenderer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenRenderer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenRenderer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenRenderer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenRenderer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenRenderer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenRenderer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenRenderer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenRenderer.Builder newBuilder(OpenRenderer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenRenderer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenRenderer.Builder() : new OpenRenderer.Builder().mergeFrom(this);
   }

   protected OpenRenderer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenRenderer.Builder(var1);
   }

   public static OpenRenderer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenRenderer> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenRenderer> getParserForType() {
      return PARSER;
   }

   public OpenRenderer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenRenderer.Builder> implements OpenRendererOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object route_ = "";
      private Object title_ = "";
      private boolean focused_;
      private boolean visible_;
      private boolean fullscreened_;
      private boolean minimized_;
      private RendererPosition position_;
      private SingleFieldBuilderV3<RendererPosition, RendererPosition.Builder, RendererPositionOrBuilder> positionBuilder_;
      private int contentType_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenRenderer.class, OpenRenderer.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OpenRenderer.alwaysUseFieldBuilders) {
            this.getPositionFieldBuilder();
         }
      }

      public OpenRenderer.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.route_ = "";
         this.title_ = "";
         this.focused_ = false;
         this.visible_ = false;
         this.fullscreened_ = false;
         this.minimized_ = false;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.contentType_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_descriptor;
      }

      public OpenRenderer getDefaultInstanceForType() {
         return OpenRenderer.getDefaultInstance();
      }

      public OpenRenderer build() {
         OpenRenderer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenRenderer buildPartial() {
         OpenRenderer var1 = new OpenRenderer(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenRenderer var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.route_ = this.route_;
         }

         if ((var2 & 4) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 8) != 0) {
            var1.focused_ = this.focused_;
         }

         if ((var2 & 16) != 0) {
            var1.visible_ = this.visible_;
         }

         if ((var2 & 32) != 0) {
            var1.fullscreened_ = this.fullscreened_;
         }

         if ((var2 & 64) != 0) {
            var1.minimized_ = this.minimized_;
         }

         byte var3 = 0;
         if ((var2 & 128) != 0) {
            var1.position_ = this.positionBuilder_ == null ? this.position_ : this.positionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 256) != 0) {
            var1.contentType_ = this.contentType_;
         }

         OpenRenderer var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OpenRenderer.Builder clone() {
         return (OpenRenderer.Builder)super.clone();
      }

      public OpenRenderer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenRenderer.Builder)super.setField(var1, var2);
      }

      public OpenRenderer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenRenderer.Builder)super.clearField(var1);
      }

      public OpenRenderer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenRenderer.Builder)super.clearOneof(var1);
      }

      public OpenRenderer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenRenderer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenRenderer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenRenderer.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenRenderer.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenRenderer) {
            return this.mergeFrom((OpenRenderer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenRenderer.Builder mergeFrom(OpenRenderer var1) {
         if (var1 == OpenRenderer.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getRoute().isEmpty()) {
            this.route_ = var1.route_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.getFocused()) {
            this.setFocused(var1.getFocused());
         }

         if (var1.getVisible()) {
            this.setVisible(var1.getVisible());
         }

         if (var1.getFullscreened()) {
            this.setFullscreened(var1.getFullscreened());
         }

         if (var1.getMinimized()) {
            this.setMinimized(var1.getMinimized());
         }

         if (var1.hasPosition()) {
            this.mergePosition(var1.getPosition());
         }

         if (var1.contentType_ != 0) {
            this.setContentTypeValue(var1.getContentTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OpenRenderer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.route_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.title_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.focused_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.visible_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.fullscreened_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.minimized_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getPositionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.contentType_ = var1.readEnum();
                     this.bitField0_ |= 256;
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
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OpenRenderer.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearId() {
         this.id_ = OpenRenderer.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenRenderer.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getRoute() {
         Object var1 = this.route_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.route_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRouteBytes() {
         Object var1 = this.route_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.route_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OpenRenderer.Builder setRoute(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.route_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearRoute() {
         this.route_ = OpenRenderer.getDefaultInstance().getRoute();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder setRouteBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenRenderer.checkByteStringIsUtf8(var1);
         this.route_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getTitle() {
         Object var1 = this.title_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.title_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTitleBytes() {
         Object var1 = this.title_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.title_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OpenRenderer.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearTitle() {
         this.title_ = OpenRenderer.getDefaultInstance().getTitle();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenRenderer.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getFocused() {
         return this.focused_;
      }

      public OpenRenderer.Builder setFocused(boolean var1) {
         this.focused_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearFocused() {
         this.bitField0_ &= -9;
         this.focused_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getVisible() {
         return this.visible_;
      }

      public OpenRenderer.Builder setVisible(boolean var1) {
         this.visible_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearVisible() {
         this.bitField0_ &= -17;
         this.visible_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getFullscreened() {
         return this.fullscreened_;
      }

      public OpenRenderer.Builder setFullscreened(boolean var1) {
         this.fullscreened_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearFullscreened() {
         this.bitField0_ &= -33;
         this.fullscreened_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getMinimized() {
         return this.minimized_;
      }

      public OpenRenderer.Builder setMinimized(boolean var1) {
         this.minimized_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearMinimized() {
         this.bitField0_ &= -65;
         this.minimized_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPosition() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public RendererPosition getPosition() {
         if (this.positionBuilder_ == null) {
            return this.position_ == null ? RendererPosition.getDefaultInstance() : this.position_;
         } else {
            return this.positionBuilder_.getMessage();
         }
      }

      public OpenRenderer.Builder setPosition(RendererPosition var1) {
         if (this.positionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position_ = var1;
         } else {
            this.positionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder setPosition(RendererPosition.Builder var1) {
         if (this.positionBuilder_ == null) {
            this.position_ = var1.build();
         } else {
            this.positionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder mergePosition(RendererPosition var1) {
         if (this.positionBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.position_ != null && this.position_ != RendererPosition.getDefaultInstance()) {
               this.getPositionBuilder().mergeFrom(var1);
            } else {
               this.position_ = var1;
            }
         } else {
            this.positionBuilder_.mergeFrom(var1);
         }

         if (this.position_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public OpenRenderer.Builder clearPosition() {
         this.bitField0_ &= -129;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RendererPosition.Builder getPositionBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getPositionFieldBuilder().getBuilder();
      }

      @Override
      public RendererPositionOrBuilder getPositionOrBuilder() {
         if (this.positionBuilder_ != null) {
            return this.positionBuilder_.getMessageOrBuilder();
         } else {
            return this.position_ == null ? RendererPosition.getDefaultInstance() : this.position_;
         }
      }

      private SingleFieldBuilderV3<RendererPosition, RendererPosition.Builder, RendererPositionOrBuilder> getPositionFieldBuilder() {
         if (this.positionBuilder_ == null) {
            this.positionBuilder_ = new SingleFieldBuilderV3<>(this.getPosition(), this.getParentForChildren(), this.isClean());
            this.position_ = null;
         }

         return this.positionBuilder_;
      }

      @Override
      public int getContentTypeValue() {
         return this.contentType_;
      }

      public OpenRenderer.Builder setContentTypeValue(int var1) {
         this.contentType_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public OpenRenderer.ContentType getContentType() {
         OpenRenderer.ContentType var1 = OpenRenderer.ContentType.forNumber(this.contentType_);
         return var1 == null ? OpenRenderer.ContentType.UNRECOGNIZED : var1;
      }

      public OpenRenderer.Builder setContentType(OpenRenderer.ContentType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 256;
         this.contentType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OpenRenderer.Builder clearContentType() {
         this.bitField0_ &= -257;
         this.contentType_ = 0;
         this.onChanged();
         return this;
      }

      public final OpenRenderer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenRenderer.Builder)super.setUnknownFields(var1);
      }

      public final OpenRenderer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenRenderer.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentType implements ProtocolMessageEnum {
      CONTENT_TYPE_UNSPECIFIED(0),
      CONTENT_TYPE_MAIN(1),
      CONTENT_TYPE_MISSION_CONTROL(2),
      CONTENT_TYPE_CHAT(3),
      CONTENT_TYPE_FRIENDS(4),
      CONTENT_TYPE_SATELLITE(5),
      CONTENT_TYPE_EMBEDDED_BROWSER(6),
      CONTENT_TYPE_UPDATER(7),
      CONTENT_TYPE_VISUALISE_RESOLUTION(8),
      CONTENT_TYPE_CHECKOUT(9),
      UNRECOGNIZED(-1);

      public static final int CONTENT_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int CONTENT_TYPE_MAIN_VALUE = 1;
      public static final int CONTENT_TYPE_MISSION_CONTROL_VALUE = 2;
      public static final int CONTENT_TYPE_CHAT_VALUE = 3;
      public static final int CONTENT_TYPE_FRIENDS_VALUE = 4;
      public static final int CONTENT_TYPE_SATELLITE_VALUE = 5;
      public static final int CONTENT_TYPE_EMBEDDED_BROWSER_VALUE = 6;
      public static final int CONTENT_TYPE_UPDATER_VALUE = 7;
      public static final int CONTENT_TYPE_VISUALISE_RESOLUTION_VALUE = 8;
      public static final int CONTENT_TYPE_CHECKOUT_VALUE = 9;
      private static final Internal.EnumLiteMap<OpenRenderer.ContentType> internalValueMap = new Internal.EnumLiteMap<OpenRenderer.ContentType>() {
         public OpenRenderer.ContentType findValueByNumber(int var1) {
            return OpenRenderer.ContentType.forNumber(var1);
         }
      };
      private static final OpenRenderer.ContentType[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static OpenRenderer.ContentType valueOf(int var0) {
         return forNumber(var0);
      }

      public static OpenRenderer.ContentType forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENT_TYPE_UNSPECIFIED;
            case 1:
               return CONTENT_TYPE_MAIN;
            case 2:
               return CONTENT_TYPE_MISSION_CONTROL;
            case 3:
               return CONTENT_TYPE_CHAT;
            case 4:
               return CONTENT_TYPE_FRIENDS;
            case 5:
               return CONTENT_TYPE_SATELLITE;
            case 6:
               return CONTENT_TYPE_EMBEDDED_BROWSER;
            case 7:
               return CONTENT_TYPE_UPDATER;
            case 8:
               return CONTENT_TYPE_VISUALISE_RESOLUTION;
            case 9:
               return CONTENT_TYPE_CHECKOUT;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OpenRenderer.ContentType> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return OpenRenderer.getDescriptor().getEnumTypes().get(0);
      }

      public static OpenRenderer.ContentType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      ContentType(int var3) {
         this.value = var3;
      }
   }
}
