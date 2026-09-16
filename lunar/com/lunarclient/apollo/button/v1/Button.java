package com.lunarclient.apollo.button.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.lunarclient.apollo.hud.v1.HudPosition;
import com.lunarclient.apollo.hud.v1.HudPositionOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Button extends GeneratedMessageV3 implements ButtonOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int onClickCase_ = 0;
   private Object onClick_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int POSITION_FIELD_NUMBER = 2;
   private HudPosition position_;
   public static final int SIZE_FIELD_NUMBER = 3;
   private ButtonSize size_;
   public static final int SHAPE_FIELD_NUMBER = 4;
   private int shape_ = 0;
   public static final int BACKGROUND_COLOR_FIELD_NUMBER = 5;
   private Color backgroundColor_;
   public static final int BORDER_COLOR_FIELD_NUMBER = 6;
   private Color borderColor_;
   public static final int CONTENT_FIELD_NUMBER = 7;
   private ButtonContent content_;
   public static final int TOOLTIP_FIELD_NUMBER = 8;
   private ButtonTooltip tooltip_;
   public static final int RUN_COMMAND_FIELD_NUMBER = 9;
   public static final int OPEN_URL_FIELD_NUMBER = 10;
   public static final int CLIENT_ACTION_FIELD_NUMBER = 11;
   public static final int HOVERED_BACKGROUND_COLOR_FIELD_NUMBER = 12;
   private Color hoveredBackgroundColor_;
   public static final int HOVERED_BORDER_COLOR_FIELD_NUMBER = 13;
   private Color hoveredBorderColor_;
   private byte memoizedIsInitialized = -1;
   private static final Button DEFAULT_INSTANCE = new Button();
   private static final Parser<Button> PARSER = new AbstractParser<Button>() {
      public Button parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Button.Builder var3 = Button.newBuilder();

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

   private Button(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Button() {
      this.id_ = "";
      this.shape_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Button();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_Button_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_Button_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Button.class, Button.Builder.class);
   }

   @Override
   public Button.OnClickCase getOnClickCase() {
      return Button.OnClickCase.forNumber(this.onClickCase_);
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
   public boolean hasPosition() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public HudPosition getPosition() {
      return this.position_ == null ? HudPosition.getDefaultInstance() : this.position_;
   }

   @Override
   public HudPositionOrBuilder getPositionOrBuilder() {
      return this.position_ == null ? HudPosition.getDefaultInstance() : this.position_;
   }

   @Override
   public boolean hasSize() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public ButtonSize getSize() {
      return this.size_ == null ? ButtonSize.getDefaultInstance() : this.size_;
   }

   @Override
   public ButtonSizeOrBuilder getSizeOrBuilder() {
      return this.size_ == null ? ButtonSize.getDefaultInstance() : this.size_;
   }

   @Override
   public int getShapeValue() {
      return this.shape_;
   }

   @Override
   public ButtonShape getShape() {
      ButtonShape var1 = ButtonShape.forNumber(this.shape_);
      return var1 == null ? ButtonShape.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasBackgroundColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getBackgroundColor() {
      return this.backgroundColor_ == null ? Color.getDefaultInstance() : this.backgroundColor_;
   }

   @Override
   public ColorOrBuilder getBackgroundColorOrBuilder() {
      return this.backgroundColor_ == null ? Color.getDefaultInstance() : this.backgroundColor_;
   }

   @Override
   public boolean hasBorderColor() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Color getBorderColor() {
      return this.borderColor_ == null ? Color.getDefaultInstance() : this.borderColor_;
   }

   @Override
   public ColorOrBuilder getBorderColorOrBuilder() {
      return this.borderColor_ == null ? Color.getDefaultInstance() : this.borderColor_;
   }

   @Override
   public boolean hasContent() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public ButtonContent getContent() {
      return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
   }

   @Override
   public ButtonContentOrBuilder getContentOrBuilder() {
      return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
   }

   @Override
   public boolean hasTooltip() {
      return (this.bitField0_ & 32) != 0;
   }

   @Override
   public ButtonTooltip getTooltip() {
      return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
   }

   @Override
   public ButtonTooltipOrBuilder getTooltipOrBuilder() {
      return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
   }

   @Override
   public boolean hasRunCommand() {
      return this.onClickCase_ == 9;
   }

   @Override
   public String getRunCommand() {
      Object var1 = "";
      if (this.onClickCase_ == 9) {
         var1 = this.onClick_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.onClickCase_ == 9) {
         this.onClick_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getRunCommandBytes() {
      Object var1 = "";
      if (this.onClickCase_ == 9) {
         var1 = this.onClick_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.onClickCase_ == 9) {
            this.onClick_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasOpenUrl() {
      return this.onClickCase_ == 10;
   }

   @Override
   public String getOpenUrl() {
      Object var1 = "";
      if (this.onClickCase_ == 10) {
         var1 = this.onClick_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.onClickCase_ == 10) {
         this.onClick_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getOpenUrlBytes() {
      Object var1 = "";
      if (this.onClickCase_ == 10) {
         var1 = this.onClick_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.onClickCase_ == 10) {
            this.onClick_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasClientAction() {
      return this.onClickCase_ == 11;
   }

   @Override
   public int getClientActionValue() {
      return this.onClickCase_ == 11 ? (Integer)this.onClick_ : 0;
   }

   @Override
   public ButtonClientAction getClientAction() {
      if (this.onClickCase_ == 11) {
         ButtonClientAction var1 = ButtonClientAction.forNumber((Integer)this.onClick_);
         return var1 == null ? ButtonClientAction.UNRECOGNIZED : var1;
      } else {
         return ButtonClientAction.BUTTON_CLIENT_ACTION_UNSPECIFIED;
      }
   }

   @Override
   public boolean hasHoveredBackgroundColor() {
      return (this.bitField0_ & 64) != 0;
   }

   @Override
   public Color getHoveredBackgroundColor() {
      return this.hoveredBackgroundColor_ == null ? Color.getDefaultInstance() : this.hoveredBackgroundColor_;
   }

   @Override
   public ColorOrBuilder getHoveredBackgroundColorOrBuilder() {
      return this.hoveredBackgroundColor_ == null ? Color.getDefaultInstance() : this.hoveredBackgroundColor_;
   }

   @Override
   public boolean hasHoveredBorderColor() {
      return (this.bitField0_ & 128) != 0;
   }

   @Override
   public Color getHoveredBorderColor() {
      return this.hoveredBorderColor_ == null ? Color.getDefaultInstance() : this.hoveredBorderColor_;
   }

   @Override
   public ColorOrBuilder getHoveredBorderColorOrBuilder() {
      return this.hoveredBorderColor_ == null ? Color.getDefaultInstance() : this.hoveredBorderColor_;
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
         var1.writeMessage(2, this.getPosition());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getSize());
      }

      if (this.shape_ != ButtonShape.BUTTON_SHAPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.shape_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(5, this.getBackgroundColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(6, this.getBorderColor());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(7, this.getContent());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(8, this.getTooltip());
      }

      if (this.onClickCase_ == 9) {
         GeneratedMessageV3.writeString(var1, 9, this.onClick_);
      }

      if (this.onClickCase_ == 10) {
         GeneratedMessageV3.writeString(var1, 10, this.onClick_);
      }

      if (this.onClickCase_ == 11) {
         var1.writeEnum(11, (Integer)this.onClick_);
      }

      if ((this.bitField0_ & 64) != 0) {
         var1.writeMessage(12, this.getHoveredBackgroundColor());
      }

      if ((this.bitField0_ & 128) != 0) {
         var1.writeMessage(13, this.getHoveredBorderColor());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getPosition());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getSize());
      }

      if (this.shape_ != ButtonShape.BUTTON_SHAPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.shape_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getBackgroundColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getBorderColor());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getContent());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getTooltip());
      }

      if (this.onClickCase_ == 9) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.onClick_);
      }

      if (this.onClickCase_ == 10) {
         var1 += GeneratedMessageV3.computeStringSize(10, this.onClick_);
      }

      if (this.onClickCase_ == 11) {
         var1 += CodedOutputStream.computeEnumSize(11, (Integer)this.onClick_);
      }

      if ((this.bitField0_ & 64) != 0) {
         var1 += CodedOutputStream.computeMessageSize(12, this.getHoveredBackgroundColor());
      }

      if ((this.bitField0_ & 128) != 0) {
         var1 += CodedOutputStream.computeMessageSize(13, this.getHoveredBorderColor());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Button)) {
         return super.equals(var1);
      }

      Button var2 = (Button)var1;
      if (!this.getId().equals(var2.getId())) {
         return false;
      }

      if (this.hasPosition() != var2.hasPosition()) {
         return false;
      }

      if (this.hasPosition() && !this.getPosition().equals(var2.getPosition())) {
         return false;
      }

      if (this.hasSize() != var2.hasSize()) {
         return false;
      }

      if (this.hasSize() && !this.getSize().equals(var2.getSize())) {
         return false;
      }

      if (this.shape_ != var2.shape_) {
         return false;
      }

      if (this.hasBackgroundColor() != var2.hasBackgroundColor()) {
         return false;
      }

      if (this.hasBackgroundColor() && !this.getBackgroundColor().equals(var2.getBackgroundColor())) {
         return false;
      }

      if (this.hasBorderColor() != var2.hasBorderColor()) {
         return false;
      }

      if (this.hasBorderColor() && !this.getBorderColor().equals(var2.getBorderColor())) {
         return false;
      }

      if (this.hasContent() != var2.hasContent()) {
         return false;
      }

      if (this.hasContent() && !this.getContent().equals(var2.getContent())) {
         return false;
      }

      if (this.hasTooltip() != var2.hasTooltip()) {
         return false;
      }

      if (this.hasTooltip() && !this.getTooltip().equals(var2.getTooltip())) {
         return false;
      }

      if (this.hasHoveredBackgroundColor() != var2.hasHoveredBackgroundColor()) {
         return false;
      }

      if (this.hasHoveredBackgroundColor() && !this.getHoveredBackgroundColor().equals(var2.getHoveredBackgroundColor())) {
         return false;
      }

      if (this.hasHoveredBorderColor() != var2.hasHoveredBorderColor()) {
         return false;
      }

      if (this.hasHoveredBorderColor() && !this.getHoveredBorderColor().equals(var2.getHoveredBorderColor())) {
         return false;
      }

      if (!this.getOnClickCase().equals(var2.getOnClickCase())) {
         return false;
      }

      switch (this.onClickCase_) {
         case 0:
         default:
            break;
         case 9:
            if (!this.getRunCommand().equals(var2.getRunCommand())) {
               return false;
            }
            break;
         case 10:
            if (!this.getOpenUrl().equals(var2.getOpenUrl())) {
               return false;
            }
            break;
         case 11:
            if (this.getClientActionValue() != var2.getClientActionValue()) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPosition()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPosition().hashCode();
      }

      if (this.hasSize()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getSize().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.shape_;
      if (this.hasBackgroundColor()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getBackgroundColor().hashCode();
      }

      if (this.hasBorderColor()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getBorderColor().hashCode();
      }

      if (this.hasContent()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getContent().hashCode();
      }

      if (this.hasTooltip()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getTooltip().hashCode();
      }

      if (this.hasHoveredBackgroundColor()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.getHoveredBackgroundColor().hashCode();
      }

      if (this.hasHoveredBorderColor()) {
         var1 = 37 * var1 + 13;
         var1 = 53 * var1 + this.getHoveredBorderColor().hashCode();
      }

      switch (this.onClickCase_) {
         case 0:
         default:
            break;
         case 9:
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getRunCommand().hashCode();
            break;
         case 10:
            var1 = 37 * var1 + 10;
            var1 = 53 * var1 + this.getOpenUrl().hashCode();
            break;
         case 11:
            var1 = 37 * var1 + 11;
            var1 = 53 * var1 + this.getClientActionValue();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Button parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Button parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Button parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Button parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Button parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Button parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Button parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Button parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Button parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Button parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Button parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Button parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Button.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Button.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Button.Builder newBuilder(Button var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Button.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Button.Builder() : new Button.Builder().mergeFrom(this);
   }

   protected Button.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Button.Builder(var1);
   }

   public static Button getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Button> parser() {
      return PARSER;
   }

   @Override
   public Parser<Button> getParserForType() {
      return PARSER;
   }

   public Button getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Button.Builder> implements ButtonOrBuilder {
      private int onClickCase_ = 0;
      private Object onClick_;
      private int bitField0_;
      private Object id_ = "";
      private HudPosition position_;
      private SingleFieldBuilderV3<HudPosition, HudPosition.Builder, HudPositionOrBuilder> positionBuilder_;
      private ButtonSize size_;
      private SingleFieldBuilderV3<ButtonSize, ButtonSize.Builder, ButtonSizeOrBuilder> sizeBuilder_;
      private int shape_ = 0;
      private Color backgroundColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> backgroundColorBuilder_;
      private Color borderColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> borderColorBuilder_;
      private ButtonContent content_;
      private SingleFieldBuilderV3<ButtonContent, ButtonContent.Builder, ButtonContentOrBuilder> contentBuilder_;
      private ButtonTooltip tooltip_;
      private SingleFieldBuilderV3<ButtonTooltip, ButtonTooltip.Builder, ButtonTooltipOrBuilder> tooltipBuilder_;
      private Color hoveredBackgroundColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> hoveredBackgroundColorBuilder_;
      private Color hoveredBorderColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> hoveredBorderColorBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_Button_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_Button_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Button.class, Button.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Button.alwaysUseFieldBuilders) {
            this.getPositionFieldBuilder();
            this.getSizeFieldBuilder();
            this.getBackgroundColorFieldBuilder();
            this.getBorderColorFieldBuilder();
            this.getContentFieldBuilder();
            this.getTooltipFieldBuilder();
            this.getHoveredBackgroundColorFieldBuilder();
            this.getHoveredBorderColorFieldBuilder();
         }
      }

      public Button.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.size_ = null;
         if (this.sizeBuilder_ != null) {
            this.sizeBuilder_.dispose();
            this.sizeBuilder_ = null;
         }

         this.shape_ = 0;
         this.backgroundColor_ = null;
         if (this.backgroundColorBuilder_ != null) {
            this.backgroundColorBuilder_.dispose();
            this.backgroundColorBuilder_ = null;
         }

         this.borderColor_ = null;
         if (this.borderColorBuilder_ != null) {
            this.borderColorBuilder_.dispose();
            this.borderColorBuilder_ = null;
         }

         this.content_ = null;
         if (this.contentBuilder_ != null) {
            this.contentBuilder_.dispose();
            this.contentBuilder_ = null;
         }

         this.tooltip_ = null;
         if (this.tooltipBuilder_ != null) {
            this.tooltipBuilder_.dispose();
            this.tooltipBuilder_ = null;
         }

         this.hoveredBackgroundColor_ = null;
         if (this.hoveredBackgroundColorBuilder_ != null) {
            this.hoveredBackgroundColorBuilder_.dispose();
            this.hoveredBackgroundColorBuilder_ = null;
         }

         this.hoveredBorderColor_ = null;
         if (this.hoveredBorderColorBuilder_ != null) {
            this.hoveredBorderColorBuilder_.dispose();
            this.hoveredBorderColorBuilder_ = null;
         }

         this.onClickCase_ = 0;
         this.onClick_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_Button_descriptor;
      }

      public Button getDefaultInstanceForType() {
         return Button.getDefaultInstance();
      }

      public Button build() {
         Button var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Button buildPartial() {
         Button var1 = new Button(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Button var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         short var3 = 0;
         if ((var2 & 2) != 0) {
            var1.position_ = this.positionBuilder_ == null ? this.position_ : this.positionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.size_ = this.sizeBuilder_ == null ? this.size_ : this.sizeBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.shape_ = this.shape_;
         }

         if ((var2 & 16) != 0) {
            var1.backgroundColor_ = this.backgroundColorBuilder_ == null ? this.backgroundColor_ : this.backgroundColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 32) != 0) {
            var1.borderColor_ = this.borderColorBuilder_ == null ? this.borderColor_ : this.borderColorBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 64) != 0) {
            var1.content_ = this.contentBuilder_ == null ? this.content_ : this.contentBuilder_.build();
            var3 |= 16;
         }

         if ((var2 & 128) != 0) {
            var1.tooltip_ = this.tooltipBuilder_ == null ? this.tooltip_ : this.tooltipBuilder_.build();
            var3 |= 32;
         }

         if ((var2 & 2048) != 0) {
            var1.hoveredBackgroundColor_ = this.hoveredBackgroundColorBuilder_ == null
               ? this.hoveredBackgroundColor_
               : this.hoveredBackgroundColorBuilder_.build();
            var3 |= 64;
         }

         if ((var2 & 4096) != 0) {
            var1.hoveredBorderColor_ = this.hoveredBorderColorBuilder_ == null ? this.hoveredBorderColor_ : this.hoveredBorderColorBuilder_.build();
            var3 |= 128;
         }

         Button var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(Button var1) {
         var1.onClickCase_ = this.onClickCase_;
         var1.onClick_ = this.onClick_;
      }

      public Button.Builder clone() {
         return (Button.Builder)super.clone();
      }

      public Button.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Button.Builder)super.setField(var1, var2);
      }

      public Button.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Button.Builder)super.clearField(var1);
      }

      public Button.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Button.Builder)super.clearOneof(var1);
      }

      public Button.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Button.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Button.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Button.Builder)super.addRepeatedField(var1, var2);
      }

      public Button.Builder mergeFrom(Message var1) {
         if (var1 instanceof Button) {
            return this.mergeFrom((Button)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Button.Builder mergeFrom(Button var1) {
         if (var1 == Button.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasPosition()) {
            this.mergePosition(var1.getPosition());
         }

         if (var1.hasSize()) {
            this.mergeSize(var1.getSize());
         }

         if (var1.shape_ != 0) {
            this.setShapeValue(var1.getShapeValue());
         }

         if (var1.hasBackgroundColor()) {
            this.mergeBackgroundColor(var1.getBackgroundColor());
         }

         if (var1.hasBorderColor()) {
            this.mergeBorderColor(var1.getBorderColor());
         }

         if (var1.hasContent()) {
            this.mergeContent(var1.getContent());
         }

         if (var1.hasTooltip()) {
            this.mergeTooltip(var1.getTooltip());
         }

         if (var1.hasHoveredBackgroundColor()) {
            this.mergeHoveredBackgroundColor(var1.getHoveredBackgroundColor());
         }

         if (var1.hasHoveredBorderColor()) {
            this.mergeHoveredBorderColor(var1.getHoveredBorderColor());
         }

         switch (var1.getOnClickCase()) {
            case RUN_COMMAND:
               this.onClickCase_ = 9;
               this.onClick_ = var1.onClick_;
               this.onChanged();
               break;
            case OPEN_URL:
               this.onClickCase_ = 10;
               this.onClick_ = var1.onClick_;
               this.onChanged();
               break;
            case CLIENT_ACTION:
               this.setClientActionValue(var1.getClientActionValue());
            case ONCLICK_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Button.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPositionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getSizeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.shape_ = var1.readEnum();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getBackgroundColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getBorderColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getContentFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getTooltipFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     String var12 = var1.readStringRequireUtf8();
                     this.onClickCase_ = 9;
                     this.onClick_ = var12;
                     break;
                  case 82:
                     String var11 = var1.readStringRequireUtf8();
                     this.onClickCase_ = 10;
                     this.onClick_ = var11;
                     break;
                  case 88:
                     int var5 = var1.readEnum();
                     this.onClickCase_ = 11;
                     this.onClick_ = var5;
                     break;
                  case 98:
                     var1.readMessage(this.getHoveredBackgroundColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2048;
                     break;
                  case 106:
                     var1.readMessage(this.getHoveredBorderColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4096;
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
      public Button.OnClickCase getOnClickCase() {
         return Button.OnClickCase.forNumber(this.onClickCase_);
      }

      public Button.Builder clearOnClick() {
         this.onClickCase_ = 0;
         this.onClick_ = null;
         this.onChanged();
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

      public Button.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Button.Builder clearId() {
         this.id_ = Button.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Button.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Button.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public HudPosition getPosition() {
         if (this.positionBuilder_ == null) {
            return this.position_ == null ? HudPosition.getDefaultInstance() : this.position_;
         } else {
            return this.positionBuilder_.getMessage();
         }
      }

      public Button.Builder setPosition(HudPosition var1) {
         if (this.positionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.position_ = var1;
         } else {
            this.positionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Button.Builder setPosition(HudPosition.Builder var1) {
         if (this.positionBuilder_ == null) {
            this.position_ = var1.build();
         } else {
            this.positionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Button.Builder mergePosition(HudPosition var1) {
         if (this.positionBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.position_ != null && this.position_ != HudPosition.getDefaultInstance()) {
               this.getPositionBuilder().mergeFrom(var1);
            } else {
               this.position_ = var1;
            }
         } else {
            this.positionBuilder_.mergeFrom(var1);
         }

         if (this.position_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearPosition() {
         this.bitField0_ &= -3;
         this.position_ = null;
         if (this.positionBuilder_ != null) {
            this.positionBuilder_.dispose();
            this.positionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public HudPosition.Builder getPositionBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getPositionFieldBuilder().getBuilder();
      }

      @Override
      public HudPositionOrBuilder getPositionOrBuilder() {
         if (this.positionBuilder_ != null) {
            return this.positionBuilder_.getMessageOrBuilder();
         } else {
            return this.position_ == null ? HudPosition.getDefaultInstance() : this.position_;
         }
      }

      private SingleFieldBuilderV3<HudPosition, HudPosition.Builder, HudPositionOrBuilder> getPositionFieldBuilder() {
         if (this.positionBuilder_ == null) {
            this.positionBuilder_ = new SingleFieldBuilderV3<>(this.getPosition(), this.getParentForChildren(), this.isClean());
            this.position_ = null;
         }

         return this.positionBuilder_;
      }

      @Override
      public boolean hasSize() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public ButtonSize getSize() {
         if (this.sizeBuilder_ == null) {
            return this.size_ == null ? ButtonSize.getDefaultInstance() : this.size_;
         } else {
            return this.sizeBuilder_.getMessage();
         }
      }

      public Button.Builder setSize(ButtonSize var1) {
         if (this.sizeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.size_ = var1;
         } else {
            this.sizeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Button.Builder setSize(ButtonSize.Builder var1) {
         if (this.sizeBuilder_ == null) {
            this.size_ = var1.build();
         } else {
            this.sizeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeSize(ButtonSize var1) {
         if (this.sizeBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.size_ != null && this.size_ != ButtonSize.getDefaultInstance()) {
               this.getSizeBuilder().mergeFrom(var1);
            } else {
               this.size_ = var1;
            }
         } else {
            this.sizeBuilder_.mergeFrom(var1);
         }

         if (this.size_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearSize() {
         this.bitField0_ &= -5;
         this.size_ = null;
         if (this.sizeBuilder_ != null) {
            this.sizeBuilder_.dispose();
            this.sizeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ButtonSize.Builder getSizeBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getSizeFieldBuilder().getBuilder();
      }

      @Override
      public ButtonSizeOrBuilder getSizeOrBuilder() {
         if (this.sizeBuilder_ != null) {
            return this.sizeBuilder_.getMessageOrBuilder();
         } else {
            return this.size_ == null ? ButtonSize.getDefaultInstance() : this.size_;
         }
      }

      private SingleFieldBuilderV3<ButtonSize, ButtonSize.Builder, ButtonSizeOrBuilder> getSizeFieldBuilder() {
         if (this.sizeBuilder_ == null) {
            this.sizeBuilder_ = new SingleFieldBuilderV3<>(this.getSize(), this.getParentForChildren(), this.isClean());
            this.size_ = null;
         }

         return this.sizeBuilder_;
      }

      @Override
      public int getShapeValue() {
         return this.shape_;
      }

      public Button.Builder setShapeValue(int var1) {
         this.shape_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public ButtonShape getShape() {
         ButtonShape var1 = ButtonShape.forNumber(this.shape_);
         return var1 == null ? ButtonShape.UNRECOGNIZED : var1;
      }

      public Button.Builder setShape(ButtonShape var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.shape_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Button.Builder clearShape() {
         this.bitField0_ &= -9;
         this.shape_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasBackgroundColor() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Color getBackgroundColor() {
         if (this.backgroundColorBuilder_ == null) {
            return this.backgroundColor_ == null ? Color.getDefaultInstance() : this.backgroundColor_;
         } else {
            return this.backgroundColorBuilder_.getMessage();
         }
      }

      public Button.Builder setBackgroundColor(Color var1) {
         if (this.backgroundColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.backgroundColor_ = var1;
         } else {
            this.backgroundColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Button.Builder setBackgroundColor(Color.Builder var1) {
         if (this.backgroundColorBuilder_ == null) {
            this.backgroundColor_ = var1.build();
         } else {
            this.backgroundColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeBackgroundColor(Color var1) {
         if (this.backgroundColorBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.backgroundColor_ != null && this.backgroundColor_ != Color.getDefaultInstance()) {
               this.getBackgroundColorBuilder().mergeFrom(var1);
            } else {
               this.backgroundColor_ = var1;
            }
         } else {
            this.backgroundColorBuilder_.mergeFrom(var1);
         }

         if (this.backgroundColor_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearBackgroundColor() {
         this.bitField0_ &= -17;
         this.backgroundColor_ = null;
         if (this.backgroundColorBuilder_ != null) {
            this.backgroundColorBuilder_.dispose();
            this.backgroundColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getBackgroundColorBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getBackgroundColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getBackgroundColorOrBuilder() {
         if (this.backgroundColorBuilder_ != null) {
            return this.backgroundColorBuilder_.getMessageOrBuilder();
         } else {
            return this.backgroundColor_ == null ? Color.getDefaultInstance() : this.backgroundColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getBackgroundColorFieldBuilder() {
         if (this.backgroundColorBuilder_ == null) {
            this.backgroundColorBuilder_ = new SingleFieldBuilderV3<>(this.getBackgroundColor(), this.getParentForChildren(), this.isClean());
            this.backgroundColor_ = null;
         }

         return this.backgroundColorBuilder_;
      }

      @Override
      public boolean hasBorderColor() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Color getBorderColor() {
         if (this.borderColorBuilder_ == null) {
            return this.borderColor_ == null ? Color.getDefaultInstance() : this.borderColor_;
         } else {
            return this.borderColorBuilder_.getMessage();
         }
      }

      public Button.Builder setBorderColor(Color var1) {
         if (this.borderColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.borderColor_ = var1;
         } else {
            this.borderColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Button.Builder setBorderColor(Color.Builder var1) {
         if (this.borderColorBuilder_ == null) {
            this.borderColor_ = var1.build();
         } else {
            this.borderColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeBorderColor(Color var1) {
         if (this.borderColorBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.borderColor_ != null && this.borderColor_ != Color.getDefaultInstance()) {
               this.getBorderColorBuilder().mergeFrom(var1);
            } else {
               this.borderColor_ = var1;
            }
         } else {
            this.borderColorBuilder_.mergeFrom(var1);
         }

         if (this.borderColor_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearBorderColor() {
         this.bitField0_ &= -33;
         this.borderColor_ = null;
         if (this.borderColorBuilder_ != null) {
            this.borderColorBuilder_.dispose();
            this.borderColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getBorderColorBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getBorderColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getBorderColorOrBuilder() {
         if (this.borderColorBuilder_ != null) {
            return this.borderColorBuilder_.getMessageOrBuilder();
         } else {
            return this.borderColor_ == null ? Color.getDefaultInstance() : this.borderColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getBorderColorFieldBuilder() {
         if (this.borderColorBuilder_ == null) {
            this.borderColorBuilder_ = new SingleFieldBuilderV3<>(this.getBorderColor(), this.getParentForChildren(), this.isClean());
            this.borderColor_ = null;
         }

         return this.borderColorBuilder_;
      }

      @Override
      public boolean hasContent() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public ButtonContent getContent() {
         if (this.contentBuilder_ == null) {
            return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
         } else {
            return this.contentBuilder_.getMessage();
         }
      }

      public Button.Builder setContent(ButtonContent var1) {
         if (this.contentBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.content_ = var1;
         } else {
            this.contentBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Button.Builder setContent(ButtonContent.Builder var1) {
         if (this.contentBuilder_ == null) {
            this.content_ = var1.build();
         } else {
            this.contentBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeContent(ButtonContent var1) {
         if (this.contentBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.content_ != null && this.content_ != ButtonContent.getDefaultInstance()) {
               this.getContentBuilder().mergeFrom(var1);
            } else {
               this.content_ = var1;
            }
         } else {
            this.contentBuilder_.mergeFrom(var1);
         }

         if (this.content_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearContent() {
         this.bitField0_ &= -65;
         this.content_ = null;
         if (this.contentBuilder_ != null) {
            this.contentBuilder_.dispose();
            this.contentBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ButtonContent.Builder getContentBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getContentFieldBuilder().getBuilder();
      }

      @Override
      public ButtonContentOrBuilder getContentOrBuilder() {
         if (this.contentBuilder_ != null) {
            return this.contentBuilder_.getMessageOrBuilder();
         } else {
            return this.content_ == null ? ButtonContent.getDefaultInstance() : this.content_;
         }
      }

      private SingleFieldBuilderV3<ButtonContent, ButtonContent.Builder, ButtonContentOrBuilder> getContentFieldBuilder() {
         if (this.contentBuilder_ == null) {
            this.contentBuilder_ = new SingleFieldBuilderV3<>(this.getContent(), this.getParentForChildren(), this.isClean());
            this.content_ = null;
         }

         return this.contentBuilder_;
      }

      @Override
      public boolean hasTooltip() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public ButtonTooltip getTooltip() {
         if (this.tooltipBuilder_ == null) {
            return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
         } else {
            return this.tooltipBuilder_.getMessage();
         }
      }

      public Button.Builder setTooltip(ButtonTooltip var1) {
         if (this.tooltipBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.tooltip_ = var1;
         } else {
            this.tooltipBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Button.Builder setTooltip(ButtonTooltip.Builder var1) {
         if (this.tooltipBuilder_ == null) {
            this.tooltip_ = var1.build();
         } else {
            this.tooltipBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeTooltip(ButtonTooltip var1) {
         if (this.tooltipBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.tooltip_ != null && this.tooltip_ != ButtonTooltip.getDefaultInstance()) {
               this.getTooltipBuilder().mergeFrom(var1);
            } else {
               this.tooltip_ = var1;
            }
         } else {
            this.tooltipBuilder_.mergeFrom(var1);
         }

         if (this.tooltip_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearTooltip() {
         this.bitField0_ &= -129;
         this.tooltip_ = null;
         if (this.tooltipBuilder_ != null) {
            this.tooltipBuilder_.dispose();
            this.tooltipBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ButtonTooltip.Builder getTooltipBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getTooltipFieldBuilder().getBuilder();
      }

      @Override
      public ButtonTooltipOrBuilder getTooltipOrBuilder() {
         if (this.tooltipBuilder_ != null) {
            return this.tooltipBuilder_.getMessageOrBuilder();
         } else {
            return this.tooltip_ == null ? ButtonTooltip.getDefaultInstance() : this.tooltip_;
         }
      }

      private SingleFieldBuilderV3<ButtonTooltip, ButtonTooltip.Builder, ButtonTooltipOrBuilder> getTooltipFieldBuilder() {
         if (this.tooltipBuilder_ == null) {
            this.tooltipBuilder_ = new SingleFieldBuilderV3<>(this.getTooltip(), this.getParentForChildren(), this.isClean());
            this.tooltip_ = null;
         }

         return this.tooltipBuilder_;
      }

      @Override
      public boolean hasRunCommand() {
         return this.onClickCase_ == 9;
      }

      @Override
      public String getRunCommand() {
         Object var1 = "";
         if (this.onClickCase_ == 9) {
            var1 = this.onClick_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.onClickCase_ == 9) {
               this.onClick_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRunCommandBytes() {
         Object var1 = "";
         if (this.onClickCase_ == 9) {
            var1 = this.onClick_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.onClickCase_ == 9) {
               this.onClick_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Button.Builder setRunCommand(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.onClickCase_ = 9;
         this.onClick_ = var1;
         this.onChanged();
         return this;
      }

      public Button.Builder clearRunCommand() {
         if (this.onClickCase_ == 9) {
            this.onClickCase_ = 0;
            this.onClick_ = null;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder setRunCommandBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Button.checkByteStringIsUtf8(var1);
         this.onClickCase_ = 9;
         this.onClick_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOpenUrl() {
         return this.onClickCase_ == 10;
      }

      @Override
      public String getOpenUrl() {
         Object var1 = "";
         if (this.onClickCase_ == 10) {
            var1 = this.onClick_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.onClickCase_ == 10) {
               this.onClick_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOpenUrlBytes() {
         Object var1 = "";
         if (this.onClickCase_ == 10) {
            var1 = this.onClick_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.onClickCase_ == 10) {
               this.onClick_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Button.Builder setOpenUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.onClickCase_ = 10;
         this.onClick_ = var1;
         this.onChanged();
         return this;
      }

      public Button.Builder clearOpenUrl() {
         if (this.onClickCase_ == 10) {
            this.onClickCase_ = 0;
            this.onClick_ = null;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder setOpenUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Button.checkByteStringIsUtf8(var1);
         this.onClickCase_ = 10;
         this.onClick_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasClientAction() {
         return this.onClickCase_ == 11;
      }

      @Override
      public int getClientActionValue() {
         return this.onClickCase_ == 11 ? (Integer)this.onClick_ : 0;
      }

      public Button.Builder setClientActionValue(int var1) {
         this.onClickCase_ = 11;
         this.onClick_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public ButtonClientAction getClientAction() {
         if (this.onClickCase_ == 11) {
            ButtonClientAction var1 = ButtonClientAction.forNumber((Integer)this.onClick_);
            return var1 == null ? ButtonClientAction.UNRECOGNIZED : var1;
         } else {
            return ButtonClientAction.BUTTON_CLIENT_ACTION_UNSPECIFIED;
         }
      }

      public Button.Builder setClientAction(ButtonClientAction var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.onClickCase_ = 11;
         this.onClick_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Button.Builder clearClientAction() {
         if (this.onClickCase_ == 11) {
            this.onClickCase_ = 0;
            this.onClick_ = null;
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasHoveredBackgroundColor() {
         return (this.bitField0_ & 2048) != 0;
      }

      @Override
      public Color getHoveredBackgroundColor() {
         if (this.hoveredBackgroundColorBuilder_ == null) {
            return this.hoveredBackgroundColor_ == null ? Color.getDefaultInstance() : this.hoveredBackgroundColor_;
         } else {
            return this.hoveredBackgroundColorBuilder_.getMessage();
         }
      }

      public Button.Builder setHoveredBackgroundColor(Color var1) {
         if (this.hoveredBackgroundColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hoveredBackgroundColor_ = var1;
         } else {
            this.hoveredBackgroundColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public Button.Builder setHoveredBackgroundColor(Color.Builder var1) {
         if (this.hoveredBackgroundColorBuilder_ == null) {
            this.hoveredBackgroundColor_ = var1.build();
         } else {
            this.hoveredBackgroundColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeHoveredBackgroundColor(Color var1) {
         if (this.hoveredBackgroundColorBuilder_ == null) {
            if ((this.bitField0_ & 2048) != 0 && this.hoveredBackgroundColor_ != null && this.hoveredBackgroundColor_ != Color.getDefaultInstance()) {
               this.getHoveredBackgroundColorBuilder().mergeFrom(var1);
            } else {
               this.hoveredBackgroundColor_ = var1;
            }
         } else {
            this.hoveredBackgroundColorBuilder_.mergeFrom(var1);
         }

         if (this.hoveredBackgroundColor_ != null) {
            this.bitField0_ |= 2048;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearHoveredBackgroundColor() {
         this.bitField0_ &= -2049;
         this.hoveredBackgroundColor_ = null;
         if (this.hoveredBackgroundColorBuilder_ != null) {
            this.hoveredBackgroundColorBuilder_.dispose();
            this.hoveredBackgroundColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getHoveredBackgroundColorBuilder() {
         this.bitField0_ |= 2048;
         this.onChanged();
         return this.getHoveredBackgroundColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getHoveredBackgroundColorOrBuilder() {
         if (this.hoveredBackgroundColorBuilder_ != null) {
            return this.hoveredBackgroundColorBuilder_.getMessageOrBuilder();
         } else {
            return this.hoveredBackgroundColor_ == null ? Color.getDefaultInstance() : this.hoveredBackgroundColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getHoveredBackgroundColorFieldBuilder() {
         if (this.hoveredBackgroundColorBuilder_ == null) {
            this.hoveredBackgroundColorBuilder_ = new SingleFieldBuilderV3<>(this.getHoveredBackgroundColor(), this.getParentForChildren(), this.isClean());
            this.hoveredBackgroundColor_ = null;
         }

         return this.hoveredBackgroundColorBuilder_;
      }

      @Override
      public boolean hasHoveredBorderColor() {
         return (this.bitField0_ & 4096) != 0;
      }

      @Override
      public Color getHoveredBorderColor() {
         if (this.hoveredBorderColorBuilder_ == null) {
            return this.hoveredBorderColor_ == null ? Color.getDefaultInstance() : this.hoveredBorderColor_;
         } else {
            return this.hoveredBorderColorBuilder_.getMessage();
         }
      }

      public Button.Builder setHoveredBorderColor(Color var1) {
         if (this.hoveredBorderColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.hoveredBorderColor_ = var1;
         } else {
            this.hoveredBorderColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public Button.Builder setHoveredBorderColor(Color.Builder var1) {
         if (this.hoveredBorderColorBuilder_ == null) {
            this.hoveredBorderColor_ = var1.build();
         } else {
            this.hoveredBorderColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public Button.Builder mergeHoveredBorderColor(Color var1) {
         if (this.hoveredBorderColorBuilder_ == null) {
            if ((this.bitField0_ & 4096) != 0 && this.hoveredBorderColor_ != null && this.hoveredBorderColor_ != Color.getDefaultInstance()) {
               this.getHoveredBorderColorBuilder().mergeFrom(var1);
            } else {
               this.hoveredBorderColor_ = var1;
            }
         } else {
            this.hoveredBorderColorBuilder_.mergeFrom(var1);
         }

         if (this.hoveredBorderColor_ != null) {
            this.bitField0_ |= 4096;
            this.onChanged();
         }

         return this;
      }

      public Button.Builder clearHoveredBorderColor() {
         this.bitField0_ &= -4097;
         this.hoveredBorderColor_ = null;
         if (this.hoveredBorderColorBuilder_ != null) {
            this.hoveredBorderColorBuilder_.dispose();
            this.hoveredBorderColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getHoveredBorderColorBuilder() {
         this.bitField0_ |= 4096;
         this.onChanged();
         return this.getHoveredBorderColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getHoveredBorderColorOrBuilder() {
         if (this.hoveredBorderColorBuilder_ != null) {
            return this.hoveredBorderColorBuilder_.getMessageOrBuilder();
         } else {
            return this.hoveredBorderColor_ == null ? Color.getDefaultInstance() : this.hoveredBorderColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getHoveredBorderColorFieldBuilder() {
         if (this.hoveredBorderColorBuilder_ == null) {
            this.hoveredBorderColorBuilder_ = new SingleFieldBuilderV3<>(this.getHoveredBorderColor(), this.getParentForChildren(), this.isClean());
            this.hoveredBorderColor_ = null;
         }

         return this.hoveredBorderColorBuilder_;
      }

      public final Button.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Button.Builder)super.setUnknownFields(var1);
      }

      public final Button.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Button.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum OnClickCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      RUN_COMMAND(9),
      OPEN_URL(10),
      CLIENT_ACTION(11),
      ONCLICK_NOT_SET(0);

      private final int value;

      OnClickCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Button.OnClickCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Button.OnClickCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return ONCLICK_NOT_SET;
            case 9:
               return RUN_COMMAND;
            case 10:
               return OPEN_URL;
            case 11:
               return CLIENT_ACTION;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
