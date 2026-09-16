package com.lunarclient.apollo.beam.v1;

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
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayBeaconBeamMessage extends GeneratedMessageV3 implements DisplayBeaconBeamMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int COLOR_FIELD_NUMBER = 2;
   private Color color_;
   public static final int LOCATION_FIELD_NUMBER = 3;
   private BlockLocation location_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayBeaconBeamMessage DEFAULT_INSTANCE = new DisplayBeaconBeamMessage();
   private static final Parser<DisplayBeaconBeamMessage> PARSER = new AbstractParser<DisplayBeaconBeamMessage>() {
      public DisplayBeaconBeamMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayBeaconBeamMessage.Builder var3 = DisplayBeaconBeamMessage.newBuilder();

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

   private DisplayBeaconBeamMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayBeaconBeamMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayBeaconBeamMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayBeaconBeamMessage.class, DisplayBeaconBeamMessage.Builder.class);
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
   public boolean hasColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getColor() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public ColorOrBuilder getColorOrBuilder() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public BlockLocation getLocation() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public BlockLocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
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

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getLocation());
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

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLocation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayBeaconBeamMessage)) {
         return super.equals(var1);
      } else {
         DisplayBeaconBeamMessage var2 = (DisplayBeaconBeamMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasColor() != var2.hasColor()) {
            return false;
         } else if (this.hasColor() && !this.getColor().equals(var2.getColor())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else {
            return this.hasLocation() && !this.getLocation().equals(var2.getLocation()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasColor()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      if (this.hasLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayBeaconBeamMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayBeaconBeamMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayBeaconBeamMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayBeaconBeamMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayBeaconBeamMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayBeaconBeamMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayBeaconBeamMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayBeaconBeamMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayBeaconBeamMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayBeaconBeamMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayBeaconBeamMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayBeaconBeamMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayBeaconBeamMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayBeaconBeamMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayBeaconBeamMessage.Builder newBuilder(DisplayBeaconBeamMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayBeaconBeamMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayBeaconBeamMessage.Builder() : new DisplayBeaconBeamMessage.Builder().mergeFrom(this);
   }

   protected DisplayBeaconBeamMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayBeaconBeamMessage.Builder(var1);
   }

   public static DisplayBeaconBeamMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayBeaconBeamMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayBeaconBeamMessage> getParserForType() {
      return PARSER;
   }

   public DisplayBeaconBeamMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayBeaconBeamMessage.Builder> implements DisplayBeaconBeamMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
      private BlockLocation location_;
      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> locationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayBeaconBeamMessage.class, DisplayBeaconBeamMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayBeaconBeamMessage.alwaysUseFieldBuilders) {
            this.getColorFieldBuilder();
            this.getLocationFieldBuilder();
         }
      }

      public DisplayBeaconBeamMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_DisplayBeaconBeamMessage_descriptor;
      }

      public DisplayBeaconBeamMessage getDefaultInstanceForType() {
         return DisplayBeaconBeamMessage.getDefaultInstance();
      }

      public DisplayBeaconBeamMessage build() {
         DisplayBeaconBeamMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayBeaconBeamMessage buildPartial() {
         DisplayBeaconBeamMessage var1 = new DisplayBeaconBeamMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayBeaconBeamMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 2;
         }

         DisplayBeaconBeamMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayBeaconBeamMessage.Builder clone() {
         return (DisplayBeaconBeamMessage.Builder)super.clone();
      }

      public DisplayBeaconBeamMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayBeaconBeamMessage.Builder)super.setField(var1, var2);
      }

      public DisplayBeaconBeamMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayBeaconBeamMessage.Builder)super.clearField(var1);
      }

      public DisplayBeaconBeamMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayBeaconBeamMessage.Builder)super.clearOneof(var1);
      }

      public DisplayBeaconBeamMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayBeaconBeamMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayBeaconBeamMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayBeaconBeamMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayBeaconBeamMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayBeaconBeamMessage) {
            return this.mergeFrom((DisplayBeaconBeamMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayBeaconBeamMessage.Builder mergeFrom(DisplayBeaconBeamMessage var1) {
         if (var1 == DisplayBeaconBeamMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayBeaconBeamMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
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

      public DisplayBeaconBeamMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayBeaconBeamMessage.Builder clearId() {
         this.id_ = DisplayBeaconBeamMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayBeaconBeamMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayBeaconBeamMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public DisplayBeaconBeamMessage.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayBeaconBeamMessage.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayBeaconBeamMessage.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DisplayBeaconBeamMessage.Builder clearColor() {
         this.bitField0_ &= -3;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getColorOrBuilder() {
         if (this.colorBuilder_ != null) {
            return this.colorBuilder_.getMessageOrBuilder();
         } else {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getColorFieldBuilder() {
         if (this.colorBuilder_ == null) {
            this.colorBuilder_ = new SingleFieldBuilderV3<>(this.getColor(), this.getParentForChildren(), this.isClean());
            this.color_ = null;
         }

         return this.colorBuilder_;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public BlockLocation getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public DisplayBeaconBeamMessage.Builder setLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayBeaconBeamMessage.Builder setLocation(BlockLocation.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayBeaconBeamMessage.Builder mergeLocation(BlockLocation var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.location_ != null && this.location_ != BlockLocation.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public DisplayBeaconBeamMessage.Builder clearLocation() {
         this.bitField0_ &= -5;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public BlockLocation.Builder getLocationBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public BlockLocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? BlockLocation.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<BlockLocation, BlockLocation.Builder, BlockLocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      public final DisplayBeaconBeamMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayBeaconBeamMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayBeaconBeamMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayBeaconBeamMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
