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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Marker extends GeneratedMessageV3 implements MarkerOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int POSITION_FIELD_NUMBER = 1;
   private Vector3f position_;
   public static final int DESCRIPTION_FIELD_NUMBER = 2;
   private LazyStringArrayList description_ = LazyStringArrayList.emptyList();
   public static final int SOURCE_FIELD_NUMBER = 3;
   private volatile Object source_ = "";
   private byte memoizedIsInitialized = -1;
   private static final Marker DEFAULT_INSTANCE = new Marker();
   private static final Parser<Marker> PARSER = new AbstractParser<Marker>() {
      public Marker parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Marker.Builder var3 = Marker.newBuilder();

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

   private Marker(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Marker() {
      this.description_ = LazyStringArrayList.emptyList();
      this.source_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Marker();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_marker_v1_Marker_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_marker_v1_Marker_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Marker.class, Marker.Builder.class);
   }

   @Override
   public boolean hasPosition() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Vector3f getPosition() {
      return this.position_ == null ? Vector3f.getDefaultInstance() : this.position_;
   }

   @Override
   public Vector3fOrBuilder getPositionOrBuilder() {
      return this.position_ == null ? Vector3f.getDefaultInstance() : this.position_;
   }

   public ProtocolStringList getDescriptionList() {
      return this.description_;
   }

   @Override
   public int getDescriptionCount() {
      return this.description_.size();
   }

   @Override
   public String getDescription(int var1) {
      return this.description_.get(var1);
   }

   @Override
   public ByteString getDescriptionBytes(int var1) {
      return this.description_.getByteString(var1);
   }

   @Override
   public String getSource() {
      Object var1 = this.source_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.source_ = var3;
      return var3;
   }

   @Override
   public ByteString getSourceBytes() {
      Object var1 = this.source_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.source_ = var2;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getPosition());
      }

      for (int var2 = 0; var2 < this.description_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 2, this.description_.getRaw(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.source_)) {
         GeneratedMessageV3.writeString(var1, 3, this.source_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPosition());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.description_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.description_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getDescriptionList().size();
      if (!GeneratedMessageV3.isStringEmpty(this.source_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.source_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Marker)) {
         return super.equals(var1);
      } else {
         Marker var2 = (Marker)var1;
         if (this.hasPosition() != var2.hasPosition()) {
            return false;
         } else if (this.hasPosition() && !this.getPosition().equals(var2.getPosition())) {
            return false;
         } else if (!this.getDescriptionList().equals(var2.getDescriptionList())) {
            return false;
         } else {
            return !this.getSource().equals(var2.getSource()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPosition()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPosition().hashCode();
      }

      if (this.getDescriptionCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getDescriptionList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getSource().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Marker parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Marker parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Marker parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Marker parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Marker parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Marker parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Marker parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Marker parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Marker parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Marker parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Marker parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Marker parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Marker.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Marker.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Marker.Builder newBuilder(Marker var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Marker.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Marker.Builder() : new Marker.Builder().mergeFrom(this);
   }

   protected Marker.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Marker.Builder(var1);
   }

   public static Marker getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Marker> parser() {
      return PARSER;
   }

   @Override
   public Parser<Marker> getParserForType() {
      return PARSER;
   }

   public Marker getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Marker.Builder> implements MarkerOrBuilder {
      private int bitField0_;
      private Vector3f position_;
      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> positionBuilder_;
      private LazyStringArrayList description_ = LazyStringArrayList.emptyList();
      private Object source_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_marker_v1_Marker_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_marker_v1_Marker_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Marker.class, Marker.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Marker.alwaysUseFieldBuilders) {
            this.getPositionFieldBuilder();
         }
      }

      public Marker.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.description_ = LazyStringArrayList.emptyList();
         this.source_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_marker_v1_Marker_descriptor;
      }

      public Marker getDefaultInstanceForType() {
         return Marker.getDefaultInstance();
      }

      public Marker build() {
         Marker var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Marker buildPartial() {
         Marker var1 = new Marker(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Marker var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.position_ = this.positionBuilder_ == null ? this.position_ : this.positionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            this.description_.makeImmutable();
            var1.description_ = this.description_;
         }

         if ((var2 & 4) != 0) {
            var1.source_ = this.source_;
         }

         Marker var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public Marker.Builder clone() {
         return (Marker.Builder)super.clone();
      }

      public Marker.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Marker.Builder)super.setField(var1, var2);
      }

      public Marker.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Marker.Builder)super.clearField(var1);
      }

      public Marker.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Marker.Builder)super.clearOneof(var1);
      }

      public Marker.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Marker.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Marker.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Marker.Builder)super.addRepeatedField(var1, var2);
      }

      public Marker.Builder mergeFrom(Message var1) {
         if (var1 instanceof Marker) {
            return this.mergeFrom((Marker)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Marker.Builder mergeFrom(Marker var1) {
         if (var1 == Marker.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPosition()) {
            this.mergePosition(var1.getPosition());
         }

         if (!var1.description_.isEmpty()) {
            if (this.description_.isEmpty()) {
               this.description_ = var1.description_;
               this.bitField0_ |= 2;
            } else {
               this.ensureDescriptionIsMutable();
               this.description_.addAll(var1.description_);
            }

            this.onChanged();
         }

         if (!var1.getSource().isEmpty()) {
            this.source_ = var1.source_;
            this.bitField0_ |= 4;
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

      public Marker.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPositionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureDescriptionIsMutable();
                     this.description_.add(var5);
                     break;
                  case 26:
                     this.source_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
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
      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Vector3f getPosition() {
         if (this.positionBuilder_ == null) {
            return this.position_ == null ? Vector3f.getDefaultInstance() : this.position_;
         } else {
            return this.positionBuilder_.getMessage();
         }
      }

      public Marker.Builder setPosition(Vector3f var1) {
         if (this.positionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position_ = var1;
         } else {
            this.positionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Marker.Builder setPosition(Vector3f.Builder var1) {
         if (this.positionBuilder_ == null) {
            this.position_ = var1.build();
         } else {
            this.positionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Marker.Builder mergePosition(Vector3f var1) {
         if (this.positionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != Vector3f.getDefaultInstance()) {
               this.getPositionBuilder().mergeFrom(var1);
            } else {
               this.position_ = var1;
            }
         } else {
            this.positionBuilder_.mergeFrom(var1);
         }

         if (this.position_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public Marker.Builder clearPosition() {
         this.bitField0_ &= -2;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Vector3f.Builder getPositionBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPositionFieldBuilder().getBuilder();
      }

      @Override
      public Vector3fOrBuilder getPositionOrBuilder() {
         if (this.positionBuilder_ != null) {
            return this.positionBuilder_.getMessageOrBuilder();
         } else {
            return this.position_ == null ? Vector3f.getDefaultInstance() : this.position_;
         }
      }

      private SingleFieldBuilderV3<Vector3f, Vector3f.Builder, Vector3fOrBuilder> getPositionFieldBuilder() {
         if (this.positionBuilder_ == null) {
            this.positionBuilder_ = new SingleFieldBuilderV3<>(this.getPosition(), this.getParentForChildren(), this.isClean());
            this.position_ = null;
         }

         return this.positionBuilder_;
      }

      private void ensureDescriptionIsMutable() {
         if (!this.description_.isModifiable()) {
            this.description_ = new LazyStringArrayList(this.description_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getDescriptionList() {
         this.description_.makeImmutable();
         return this.description_;
      }

      @Override
      public int getDescriptionCount() {
         return this.description_.size();
      }

      @Override
      public String getDescription(int var1) {
         return this.description_.get(var1);
      }

      @Override
      public ByteString getDescriptionBytes(int var1) {
         return this.description_.getByteString(var1);
      }

      public Marker.Builder setDescription(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureDescriptionIsMutable();
         this.description_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Marker.Builder addDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureDescriptionIsMutable();
         this.description_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Marker.Builder addAllDescription(Iterable<String> var1) {
         this.ensureDescriptionIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.description_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Marker.Builder clearDescription() {
         this.description_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public Marker.Builder addDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Marker.checkByteStringIsUtf8(var1);
         this.ensureDescriptionIsMutable();
         this.description_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getSource() {
         Object var1 = this.source_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.source_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSourceBytes() {
         Object var1 = this.source_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.source_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Marker.Builder setSource(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.source_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Marker.Builder clearSource() {
         this.source_ = Marker.getDefaultInstance().getSource();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public Marker.Builder setSourceBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Marker.checkByteStringIsUtf8(var1);
         this.source_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final Marker.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Marker.Builder)super.setUnknownFields(var1);
      }

      public final Marker.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Marker.Builder)super.mergeUnknownFields(var1);
      }
   }
}
