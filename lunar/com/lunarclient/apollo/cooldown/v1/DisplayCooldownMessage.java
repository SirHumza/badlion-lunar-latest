package com.lunarclient.apollo.cooldown.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DisplayCooldownMessage extends GeneratedMessageV3 implements DisplayCooldownMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int DURATION_FIELD_NUMBER = 2;
   private Duration duration_;
   public static final int ICON_FIELD_NUMBER = 3;
   private Icon icon_;
   public static final int STYLE_FIELD_NUMBER = 4;
   private CooldownStyle style_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayCooldownMessage DEFAULT_INSTANCE = new DisplayCooldownMessage();
   private static final Parser<DisplayCooldownMessage> PARSER = new AbstractParser<DisplayCooldownMessage>() {
      public DisplayCooldownMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayCooldownMessage.Builder var3 = DisplayCooldownMessage.newBuilder();

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

   private DisplayCooldownMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayCooldownMessage() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayCooldownMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayCooldownMessage.class, DisplayCooldownMessage.Builder.class);
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasDuration() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Duration getDuration() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
   }

   @Override
   public DurationOrBuilder getDurationOrBuilder() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
   }

   @Override
   public boolean hasIcon() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Icon getIcon() {
      return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
   }

   @Override
   public IconOrBuilder getIconOrBuilder() {
      return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
   }

   @Override
   public boolean hasStyle() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public CooldownStyle getStyle() {
      return this.style_ == null ? CooldownStyle.getDefaultInstance() : this.style_;
   }

   @Override
   public CooldownStyleOrBuilder getStyleOrBuilder() {
      return this.style_ == null ? CooldownStyle.getDefaultInstance() : this.style_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getDuration());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getIcon());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getStyle());
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getDuration());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getIcon());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getStyle());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayCooldownMessage)) {
         return super.equals(var1);
      } else {
         DisplayCooldownMessage var2 = (DisplayCooldownMessage)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasDuration() != var2.hasDuration()) {
            return false;
         } else if (this.hasDuration() && !this.getDuration().equals(var2.getDuration())) {
            return false;
         } else if (this.hasIcon() != var2.hasIcon()) {
            return false;
         } else if (this.hasIcon() && !this.getIcon().equals(var2.getIcon())) {
            return false;
         } else if (this.hasStyle() != var2.hasStyle()) {
            return false;
         } else {
            return this.hasStyle() && !this.getStyle().equals(var2.getStyle()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getName().hashCode();
      if (this.hasDuration()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getDuration().hashCode();
      }

      if (this.hasIcon()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getIcon().hashCode();
      }

      if (this.hasStyle()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getStyle().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayCooldownMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayCooldownMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayCooldownMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayCooldownMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayCooldownMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayCooldownMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayCooldownMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayCooldownMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayCooldownMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayCooldownMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayCooldownMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayCooldownMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayCooldownMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayCooldownMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayCooldownMessage.Builder newBuilder(DisplayCooldownMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayCooldownMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayCooldownMessage.Builder() : new DisplayCooldownMessage.Builder().mergeFrom(this);
   }

   protected DisplayCooldownMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayCooldownMessage.Builder(var1);
   }

   public static DisplayCooldownMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayCooldownMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayCooldownMessage> getParserForType() {
      return PARSER;
   }

   public DisplayCooldownMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayCooldownMessage.Builder> implements DisplayCooldownMessageOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private Duration duration_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;
      private Icon icon_;
      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;
      private CooldownStyle style_;
      private SingleFieldBuilderV3<CooldownStyle, CooldownStyle.Builder, CooldownStyleOrBuilder> styleBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayCooldownMessage.class, DisplayCooldownMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayCooldownMessage.alwaysUseFieldBuilders) {
            this.getDurationFieldBuilder();
            this.getIconFieldBuilder();
            this.getStyleFieldBuilder();
         }
      }

      public DisplayCooldownMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.style_ = null;
         if (this.styleBuilder_ != null) {
            this.styleBuilder_.dispose();
            this.styleBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_DisplayCooldownMessage_descriptor;
      }

      public DisplayCooldownMessage getDefaultInstanceForType() {
         return DisplayCooldownMessage.getDefaultInstance();
      }

      public DisplayCooldownMessage build() {
         DisplayCooldownMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayCooldownMessage buildPartial() {
         DisplayCooldownMessage var1 = new DisplayCooldownMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayCooldownMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.icon_ = this.iconBuilder_ == null ? this.icon_ : this.iconBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.style_ = this.styleBuilder_ == null ? this.style_ : this.styleBuilder_.build();
            var3 |= 4;
         }

         DisplayCooldownMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayCooldownMessage.Builder clone() {
         return (DisplayCooldownMessage.Builder)super.clone();
      }

      public DisplayCooldownMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayCooldownMessage.Builder)super.setField(var1, var2);
      }

      public DisplayCooldownMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayCooldownMessage.Builder)super.clearField(var1);
      }

      public DisplayCooldownMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayCooldownMessage.Builder)super.clearOneof(var1);
      }

      public DisplayCooldownMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayCooldownMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayCooldownMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayCooldownMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayCooldownMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayCooldownMessage) {
            return this.mergeFrom((DisplayCooldownMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayCooldownMessage.Builder mergeFrom(DisplayCooldownMessage var1) {
         if (var1 == DisplayCooldownMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasIcon()) {
            this.mergeIcon(var1.getIcon());
         }

         if (var1.hasStyle()) {
            this.mergeStyle(var1.getStyle());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayCooldownMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getIconFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getStyleFieldBuilder().getBuilder(), var2);
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
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayCooldownMessage.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder clearName() {
         this.name_ = DisplayCooldownMessage.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayCooldownMessage.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasDuration() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Duration getDuration() {
         if (this.durationBuilder_ == null) {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         } else {
            return this.durationBuilder_.getMessage();
         }
      }

      public DisplayCooldownMessage.Builder setDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.duration_ = var1;
         } else {
            this.durationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder setDuration(Duration.Builder var1) {
         if (this.durationBuilder_ == null) {
            this.duration_ = var1.build();
         } else {
            this.durationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder mergeDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.duration_ != null && this.duration_ != Duration.getDefaultInstance()) {
               this.getDurationBuilder().mergeFrom(var1);
            } else {
               this.duration_ = var1;
            }
         } else {
            this.durationBuilder_.mergeFrom(var1);
         }

         if (this.duration_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DisplayCooldownMessage.Builder clearDuration() {
         this.bitField0_ &= -3;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDurationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getDurationFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getDurationOrBuilder() {
         if (this.durationBuilder_ != null) {
            return this.durationBuilder_.getMessageOrBuilder();
         } else {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDurationFieldBuilder() {
         if (this.durationBuilder_ == null) {
            this.durationBuilder_ = new SingleFieldBuilderV3<>(this.getDuration(), this.getParentForChildren(), this.isClean());
            this.duration_ = null;
         }

         return this.durationBuilder_;
      }

      @Override
      public boolean hasIcon() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Icon getIcon() {
         if (this.iconBuilder_ == null) {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         } else {
            return this.iconBuilder_.getMessage();
         }
      }

      public DisplayCooldownMessage.Builder setIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.icon_ = var1;
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder setIcon(Icon.Builder var1) {
         if (this.iconBuilder_ == null) {
            this.icon_ = var1.build();
         } else {
            this.iconBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder mergeIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.icon_ != null && this.icon_ != Icon.getDefaultInstance()) {
               this.getIconBuilder().mergeFrom(var1);
            } else {
               this.icon_ = var1;
            }
         } else {
            this.iconBuilder_.mergeFrom(var1);
         }

         if (this.icon_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public DisplayCooldownMessage.Builder clearIcon() {
         this.bitField0_ &= -5;
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Icon.Builder getIconBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getIconFieldBuilder().getBuilder();
      }

      @Override
      public IconOrBuilder getIconOrBuilder() {
         if (this.iconBuilder_ != null) {
            return this.iconBuilder_.getMessageOrBuilder();
         } else {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         }
      }

      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getIconFieldBuilder() {
         if (this.iconBuilder_ == null) {
            this.iconBuilder_ = new SingleFieldBuilderV3<>(this.getIcon(), this.getParentForChildren(), this.isClean());
            this.icon_ = null;
         }

         return this.iconBuilder_;
      }

      @Override
      public boolean hasStyle() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public CooldownStyle getStyle() {
         if (this.styleBuilder_ == null) {
            return this.style_ == null ? CooldownStyle.getDefaultInstance() : this.style_;
         } else {
            return this.styleBuilder_.getMessage();
         }
      }

      public DisplayCooldownMessage.Builder setStyle(CooldownStyle var1) {
         if (this.styleBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.style_ = var1;
         } else {
            this.styleBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder setStyle(CooldownStyle.Builder var1) {
         if (this.styleBuilder_ == null) {
            this.style_ = var1.build();
         } else {
            this.styleBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayCooldownMessage.Builder mergeStyle(CooldownStyle var1) {
         if (this.styleBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.style_ != null && this.style_ != CooldownStyle.getDefaultInstance()) {
               this.getStyleBuilder().mergeFrom(var1);
            } else {
               this.style_ = var1;
            }
         } else {
            this.styleBuilder_.mergeFrom(var1);
         }

         if (this.style_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public DisplayCooldownMessage.Builder clearStyle() {
         this.bitField0_ &= -9;
         this.style_ = null;
         if (this.styleBuilder_ != null) {
            this.styleBuilder_.dispose();
            this.styleBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public CooldownStyle.Builder getStyleBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getStyleFieldBuilder().getBuilder();
      }

      @Override
      public CooldownStyleOrBuilder getStyleOrBuilder() {
         if (this.styleBuilder_ != null) {
            return this.styleBuilder_.getMessageOrBuilder();
         } else {
            return this.style_ == null ? CooldownStyle.getDefaultInstance() : this.style_;
         }
      }

      private SingleFieldBuilderV3<CooldownStyle, CooldownStyle.Builder, CooldownStyleOrBuilder> getStyleFieldBuilder() {
         if (this.styleBuilder_ == null) {
            this.styleBuilder_ = new SingleFieldBuilderV3<>(this.getStyle(), this.getParentForChildren(), this.isClean());
            this.style_ = null;
         }

         return this.styleBuilder_;
      }

      public final DisplayCooldownMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayCooldownMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayCooldownMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayCooldownMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
