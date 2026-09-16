package com.lunarclient.apollo.border.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Cuboid2D;
import com.lunarclient.apollo.common.v1.Cuboid2DOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayBorderMessage extends GeneratedMessageV3 implements DisplayBorderMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int WORLD_FIELD_NUMBER = 2;
   private volatile Object world_ = "";
   public static final int CANCEL_ENTRY_FIELD_NUMBER = 3;
   private boolean cancelEntry_ = false;
   public static final int CANCEL_EXIT_FIELD_NUMBER = 4;
   private boolean cancelExit_ = false;
   public static final int CAN_SHRINK_OR_EXPAND_FIELD_NUMBER = 5;
   private boolean canShrinkOrExpand_ = false;
   public static final int COLOR_FIELD_NUMBER = 6;
   private Color color_;
   public static final int BOUNDS_FIELD_NUMBER = 7;
   private Cuboid2D bounds_;
   public static final int DURATION_TICKS_FIELD_NUMBER = 8;
   private int durationTicks_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final DisplayBorderMessage DEFAULT_INSTANCE = new DisplayBorderMessage();
   private static final Parser<DisplayBorderMessage> PARSER = new AbstractParser<DisplayBorderMessage>() {
      public DisplayBorderMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayBorderMessage.Builder var3 = DisplayBorderMessage.newBuilder();

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

   private DisplayBorderMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayBorderMessage() {
      this.id_ = "";
      this.world_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayBorderMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayBorderMessage.class, DisplayBorderMessage.Builder.class);
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
   public String getWorld() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.world_ = var3;
      return var3;
   }

   @Override
   public ByteString getWorldBytes() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.world_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getCancelEntry() {
      return this.cancelEntry_;
   }

   @Override
   public boolean getCancelExit() {
      return this.cancelExit_;
   }

   @Override
   public boolean getCanShrinkOrExpand() {
      return this.canShrinkOrExpand_;
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
   public boolean hasBounds() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Cuboid2D getBounds() {
      return this.bounds_ == null ? Cuboid2D.getDefaultInstance() : this.bounds_;
   }

   @Override
   public Cuboid2DOrBuilder getBoundsOrBuilder() {
      return this.bounds_ == null ? Cuboid2D.getDefaultInstance() : this.bounds_;
   }

   @Override
   public int getDurationTicks() {
      return this.durationTicks_;
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

      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         GeneratedMessageV3.writeString(var1, 2, this.world_);
      }

      if (this.cancelEntry_) {
         var1.writeBool(3, this.cancelEntry_);
      }

      if (this.cancelExit_) {
         var1.writeBool(4, this.cancelExit_);
      }

      if (this.canShrinkOrExpand_) {
         var1.writeBool(5, this.canShrinkOrExpand_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(6, this.getColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(7, this.getBounds());
      }

      if (this.durationTicks_ != 0) {
         var1.writeInt32(8, this.durationTicks_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.world_);
      }

      if (this.cancelEntry_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.cancelEntry_);
      }

      if (this.cancelExit_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.cancelExit_);
      }

      if (this.canShrinkOrExpand_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.canShrinkOrExpand_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getColor());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getBounds());
      }

      if (this.durationTicks_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(8, this.durationTicks_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayBorderMessage)) {
         return super.equals(var1);
      } else {
         DisplayBorderMessage var2 = (DisplayBorderMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getWorld().equals(var2.getWorld())) {
            return false;
         } else if (this.getCancelEntry() != var2.getCancelEntry()) {
            return false;
         } else if (this.getCancelExit() != var2.getCancelExit()) {
            return false;
         } else if (this.getCanShrinkOrExpand() != var2.getCanShrinkOrExpand()) {
            return false;
         } else if (this.hasColor() != var2.hasColor()) {
            return false;
         } else if (this.hasColor() && !this.getColor().equals(var2.getColor())) {
            return false;
         } else if (this.hasBounds() != var2.hasBounds()) {
            return false;
         } else if (this.hasBounds() && !this.getBounds().equals(var2.getBounds())) {
            return false;
         } else {
            return this.getDurationTicks() != var2.getDurationTicks() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getWorld().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getCancelEntry());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getCancelExit());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getCanShrinkOrExpand());
      if (this.hasColor()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      if (this.hasBounds()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getBounds().hashCode();
      }

      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getDurationTicks();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayBorderMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayBorderMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayBorderMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayBorderMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayBorderMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayBorderMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayBorderMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayBorderMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayBorderMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayBorderMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayBorderMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayBorderMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayBorderMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayBorderMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayBorderMessage.Builder newBuilder(DisplayBorderMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayBorderMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayBorderMessage.Builder() : new DisplayBorderMessage.Builder().mergeFrom(this);
   }

   protected DisplayBorderMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayBorderMessage.Builder(var1);
   }

   public static DisplayBorderMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayBorderMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayBorderMessage> getParserForType() {
      return PARSER;
   }

   public DisplayBorderMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayBorderMessage.Builder> implements DisplayBorderMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object world_ = "";
      private boolean cancelEntry_;
      private boolean cancelExit_;
      private boolean canShrinkOrExpand_;
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
      private Cuboid2D bounds_;
      private SingleFieldBuilderV3<Cuboid2D, Cuboid2D.Builder, Cuboid2DOrBuilder> boundsBuilder_;
      private int durationTicks_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayBorderMessage.class, DisplayBorderMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayBorderMessage.alwaysUseFieldBuilders) {
            this.getColorFieldBuilder();
            this.getBoundsFieldBuilder();
         }
      }

      public DisplayBorderMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.world_ = "";
         this.cancelEntry_ = false;
         this.cancelExit_ = false;
         this.canShrinkOrExpand_ = false;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.bounds_ = null;
         if (this.boundsBuilder_ != null) {
            this.boundsBuilder_.dispose();
            this.boundsBuilder_ = null;
         }

         this.durationTicks_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_descriptor;
      }

      public DisplayBorderMessage getDefaultInstanceForType() {
         return DisplayBorderMessage.getDefaultInstance();
      }

      public DisplayBorderMessage build() {
         DisplayBorderMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayBorderMessage buildPartial() {
         DisplayBorderMessage var1 = new DisplayBorderMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayBorderMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.world_ = this.world_;
         }

         if ((var2 & 4) != 0) {
            var1.cancelEntry_ = this.cancelEntry_;
         }

         if ((var2 & 8) != 0) {
            var1.cancelExit_ = this.cancelExit_;
         }

         if ((var2 & 16) != 0) {
            var1.canShrinkOrExpand_ = this.canShrinkOrExpand_;
         }

         byte var3 = 0;
         if ((var2 & 32) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 64) != 0) {
            var1.bounds_ = this.boundsBuilder_ == null ? this.bounds_ : this.boundsBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 128) != 0) {
            var1.durationTicks_ = this.durationTicks_;
         }

         DisplayBorderMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayBorderMessage.Builder clone() {
         return (DisplayBorderMessage.Builder)super.clone();
      }

      public DisplayBorderMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayBorderMessage.Builder)super.setField(var1, var2);
      }

      public DisplayBorderMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayBorderMessage.Builder)super.clearField(var1);
      }

      public DisplayBorderMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayBorderMessage.Builder)super.clearOneof(var1);
      }

      public DisplayBorderMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayBorderMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayBorderMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayBorderMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayBorderMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayBorderMessage) {
            return this.mergeFrom((DisplayBorderMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayBorderMessage.Builder mergeFrom(DisplayBorderMessage var1) {
         if (var1 == DisplayBorderMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getWorld().isEmpty()) {
            this.world_ = var1.world_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.getCancelEntry()) {
            this.setCancelEntry(var1.getCancelEntry());
         }

         if (var1.getCancelExit()) {
            this.setCancelExit(var1.getCancelExit());
         }

         if (var1.getCanShrinkOrExpand()) {
            this.setCanShrinkOrExpand(var1.getCanShrinkOrExpand());
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         if (var1.hasBounds()) {
            this.mergeBounds(var1.getBounds());
         }

         if (var1.getDurationTicks() != 0) {
            this.setDurationTicks(var1.getDurationTicks());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayBorderMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.world_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.cancelEntry_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.cancelExit_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.canShrinkOrExpand_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getBoundsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.durationTicks_ = var1.readInt32();
                     this.bitField0_ |= 128;
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

      public DisplayBorderMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder clearId() {
         this.id_ = DisplayBorderMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayBorderMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getWorld() {
         Object var1 = this.world_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.world_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getWorldBytes() {
         Object var1 = this.world_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.world_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayBorderMessage.Builder setWorld(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.world_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder clearWorld() {
         this.world_ = DisplayBorderMessage.getDefaultInstance().getWorld();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder setWorldBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayBorderMessage.checkByteStringIsUtf8(var1);
         this.world_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getCancelEntry() {
         return this.cancelEntry_;
      }

      public DisplayBorderMessage.Builder setCancelEntry(boolean var1) {
         this.cancelEntry_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder clearCancelEntry() {
         this.bitField0_ &= -5;
         this.cancelEntry_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getCancelExit() {
         return this.cancelExit_;
      }

      public DisplayBorderMessage.Builder setCancelExit(boolean var1) {
         this.cancelExit_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder clearCancelExit() {
         this.bitField0_ &= -9;
         this.cancelExit_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getCanShrinkOrExpand() {
         return this.canShrinkOrExpand_;
      }

      public DisplayBorderMessage.Builder setCanShrinkOrExpand(boolean var1) {
         this.canShrinkOrExpand_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder clearCanShrinkOrExpand() {
         this.bitField0_ &= -17;
         this.canShrinkOrExpand_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasColor() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public DisplayBorderMessage.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public DisplayBorderMessage.Builder clearColor() {
         this.bitField0_ &= -33;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 32;
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
      public boolean hasBounds() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Cuboid2D getBounds() {
         if (this.boundsBuilder_ == null) {
            return this.bounds_ == null ? Cuboid2D.getDefaultInstance() : this.bounds_;
         } else {
            return this.boundsBuilder_.getMessage();
         }
      }

      public DisplayBorderMessage.Builder setBounds(Cuboid2D var1) {
         if (this.boundsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bounds_ = var1;
         } else {
            this.boundsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder setBounds(Cuboid2D.Builder var1) {
         if (this.boundsBuilder_ == null) {
            this.bounds_ = var1.build();
         } else {
            this.boundsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder mergeBounds(Cuboid2D var1) {
         if (this.boundsBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.bounds_ != null && this.bounds_ != Cuboid2D.getDefaultInstance()) {
               this.getBoundsBuilder().mergeFrom(var1);
            } else {
               this.bounds_ = var1;
            }
         } else {
            this.boundsBuilder_.mergeFrom(var1);
         }

         if (this.bounds_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public DisplayBorderMessage.Builder clearBounds() {
         this.bitField0_ &= -65;
         this.bounds_ = null;
         if (this.boundsBuilder_ != null) {
            this.boundsBuilder_.dispose();
            this.boundsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Cuboid2D.Builder getBoundsBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getBoundsFieldBuilder().getBuilder();
      }

      @Override
      public Cuboid2DOrBuilder getBoundsOrBuilder() {
         if (this.boundsBuilder_ != null) {
            return this.boundsBuilder_.getMessageOrBuilder();
         } else {
            return this.bounds_ == null ? Cuboid2D.getDefaultInstance() : this.bounds_;
         }
      }

      private SingleFieldBuilderV3<Cuboid2D, Cuboid2D.Builder, Cuboid2DOrBuilder> getBoundsFieldBuilder() {
         if (this.boundsBuilder_ == null) {
            this.boundsBuilder_ = new SingleFieldBuilderV3<>(this.getBounds(), this.getParentForChildren(), this.isClean());
            this.bounds_ = null;
         }

         return this.boundsBuilder_;
      }

      @Override
      public int getDurationTicks() {
         return this.durationTicks_;
      }

      public DisplayBorderMessage.Builder setDurationTicks(int var1) {
         this.durationTicks_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public DisplayBorderMessage.Builder clearDurationTicks() {
         this.bitField0_ &= -129;
         this.durationTicks_ = 0;
         this.onChanged();
         return this;
      }

      public final DisplayBorderMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayBorderMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayBorderMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayBorderMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
