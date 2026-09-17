package com.lunarclient.apollo.notification.v1;

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

public final class DisplayNotificationMessage extends GeneratedMessageV3 implements DisplayNotificationMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TITLE_FIELD_NUMBER = 1;
   private volatile Object title_ = "";
   public static final int DESCRIPTION_FIELD_NUMBER = 2;
   private volatile Object description_ = "";
   public static final int RESOURCE_LOCATION_FIELD_NUMBER = 3;
   private volatile Object resourceLocation_ = "";
   public static final int DISPLAY_TIME_FIELD_NUMBER = 4;
   private Duration displayTime_;
   public static final int TITLE_ADVENTURE_JSON_LINES_FIELD_NUMBER = 5;
   private volatile Object titleAdventureJsonLines_ = "";
   public static final int DESCRIPTION_ADVENTURE_JSON_LINES_FIELD_NUMBER = 6;
   private volatile Object descriptionAdventureJsonLines_ = "";
   public static final int ICON_FIELD_NUMBER = 7;
   private Icon icon_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayNotificationMessage DEFAULT_INSTANCE = new DisplayNotificationMessage();
   private static final Parser<DisplayNotificationMessage> PARSER = new AbstractParser<DisplayNotificationMessage>() {
      public DisplayNotificationMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayNotificationMessage.Builder var3 = DisplayNotificationMessage.newBuilder();

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

   private DisplayNotificationMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayNotificationMessage() {
      this.title_ = "";
      this.description_ = "";
      this.resourceLocation_ = "";
      this.titleAdventureJsonLines_ = "";
      this.descriptionAdventureJsonLines_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayNotificationMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayNotificationMessage.class, DisplayNotificationMessage.Builder.class);
   }

   @Deprecated
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

   @Deprecated
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

   @Deprecated
   @Override
   public String getDescription() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.description_ = var3;
      return var3;
   }

   @Deprecated
   @Override
   public ByteString getDescriptionBytes() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.description_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Deprecated
   @Override
   public String getResourceLocation() {
      Object var1 = this.resourceLocation_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.resourceLocation_ = var3;
      return var3;
   }

   @Deprecated
   @Override
   public ByteString getResourceLocationBytes() {
      Object var1 = this.resourceLocation_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.resourceLocation_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasDisplayTime() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Duration getDisplayTime() {
      return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
   }

   @Override
   public DurationOrBuilder getDisplayTimeOrBuilder() {
      return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
   }

   @Override
   public String getTitleAdventureJsonLines() {
      Object var1 = this.titleAdventureJsonLines_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.titleAdventureJsonLines_ = var3;
      return var3;
   }

   @Override
   public ByteString getTitleAdventureJsonLinesBytes() {
      Object var1 = this.titleAdventureJsonLines_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.titleAdventureJsonLines_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getDescriptionAdventureJsonLines() {
      Object var1 = this.descriptionAdventureJsonLines_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.descriptionAdventureJsonLines_ = var3;
      return var3;
   }

   @Override
   public ByteString getDescriptionAdventureJsonLinesBytes() {
      Object var1 = this.descriptionAdventureJsonLines_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.descriptionAdventureJsonLines_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         GeneratedMessageV3.writeString(var1, 1, this.title_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         GeneratedMessageV3.writeString(var1, 2, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.resourceLocation_)) {
         GeneratedMessageV3.writeString(var1, 3, this.resourceLocation_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(4, this.getDisplayTime());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.titleAdventureJsonLines_)) {
         GeneratedMessageV3.writeString(var1, 5, this.titleAdventureJsonLines_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.descriptionAdventureJsonLines_)) {
         GeneratedMessageV3.writeString(var1, 6, this.descriptionAdventureJsonLines_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(7, this.getIcon());
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
      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.title_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.resourceLocation_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.resourceLocation_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getDisplayTime());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.titleAdventureJsonLines_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.titleAdventureJsonLines_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.descriptionAdventureJsonLines_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.descriptionAdventureJsonLines_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getIcon());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayNotificationMessage)) {
         return super.equals(var1);
      } else {
         DisplayNotificationMessage var2 = (DisplayNotificationMessage)var1;
         if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (!this.getDescription().equals(var2.getDescription())) {
            return false;
         } else if (!this.getResourceLocation().equals(var2.getResourceLocation())) {
            return false;
         } else if (this.hasDisplayTime() != var2.hasDisplayTime()) {
            return false;
         } else if (this.hasDisplayTime() && !this.getDisplayTime().equals(var2.getDisplayTime())) {
            return false;
         } else if (!this.getTitleAdventureJsonLines().equals(var2.getTitleAdventureJsonLines())) {
            return false;
         } else if (!this.getDescriptionAdventureJsonLines().equals(var2.getDescriptionAdventureJsonLines())) {
            return false;
         } else if (this.hasIcon() != var2.hasIcon()) {
            return false;
         } else {
            return this.hasIcon() && !this.getIcon().equals(var2.getIcon()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getTitle().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getDescription().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getResourceLocation().hashCode();
      if (this.hasDisplayTime()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getDisplayTime().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getTitleAdventureJsonLines().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getDescriptionAdventureJsonLines().hashCode();
      if (this.hasIcon()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getIcon().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayNotificationMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayNotificationMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayNotificationMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayNotificationMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayNotificationMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayNotificationMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayNotificationMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayNotificationMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayNotificationMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayNotificationMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayNotificationMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayNotificationMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayNotificationMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayNotificationMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayNotificationMessage.Builder newBuilder(DisplayNotificationMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayNotificationMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayNotificationMessage.Builder() : new DisplayNotificationMessage.Builder().mergeFrom(this);
   }

   protected DisplayNotificationMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayNotificationMessage.Builder(var1);
   }

   public static DisplayNotificationMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayNotificationMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayNotificationMessage> getParserForType() {
      return PARSER;
   }

   public DisplayNotificationMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayNotificationMessage.Builder> implements DisplayNotificationMessageOrBuilder {
      private int bitField0_;
      private Object title_ = "";
      private Object description_ = "";
      private Object resourceLocation_ = "";
      private Duration displayTime_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> displayTimeBuilder_;
      private Object titleAdventureJsonLines_ = "";
      private Object descriptionAdventureJsonLines_ = "";
      private Icon icon_;
      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayNotificationMessage.class, DisplayNotificationMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayNotificationMessage.alwaysUseFieldBuilders) {
            this.getDisplayTimeFieldBuilder();
            this.getIconFieldBuilder();
         }
      }

      public DisplayNotificationMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.title_ = "";
         this.description_ = "";
         this.resourceLocation_ = "";
         this.displayTime_ = null;
         if (this.displayTimeBuilder_ != null) {
            this.displayTimeBuilder_.dispose();
            this.displayTimeBuilder_ = null;
         }

         this.titleAdventureJsonLines_ = "";
         this.descriptionAdventureJsonLines_ = "";
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_descriptor;
      }

      public DisplayNotificationMessage getDefaultInstanceForType() {
         return DisplayNotificationMessage.getDefaultInstance();
      }

      public DisplayNotificationMessage build() {
         DisplayNotificationMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayNotificationMessage buildPartial() {
         DisplayNotificationMessage var1 = new DisplayNotificationMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayNotificationMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 2) != 0) {
            var1.description_ = this.description_;
         }

         if ((var2 & 4) != 0) {
            var1.resourceLocation_ = this.resourceLocation_;
         }

         byte var3 = 0;
         if ((var2 & 8) != 0) {
            var1.displayTime_ = this.displayTimeBuilder_ == null ? this.displayTime_ : this.displayTimeBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 16) != 0) {
            var1.titleAdventureJsonLines_ = this.titleAdventureJsonLines_;
         }

         if ((var2 & 32) != 0) {
            var1.descriptionAdventureJsonLines_ = this.descriptionAdventureJsonLines_;
         }

         if ((var2 & 64) != 0) {
            var1.icon_ = this.iconBuilder_ == null ? this.icon_ : this.iconBuilder_.build();
            var3 |= 2;
         }

         DisplayNotificationMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayNotificationMessage.Builder clone() {
         return (DisplayNotificationMessage.Builder)super.clone();
      }

      public DisplayNotificationMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayNotificationMessage.Builder)super.setField(var1, var2);
      }

      public DisplayNotificationMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayNotificationMessage.Builder)super.clearField(var1);
      }

      public DisplayNotificationMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayNotificationMessage.Builder)super.clearOneof(var1);
      }

      public DisplayNotificationMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayNotificationMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayNotificationMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayNotificationMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayNotificationMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayNotificationMessage) {
            return this.mergeFrom((DisplayNotificationMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayNotificationMessage.Builder mergeFrom(DisplayNotificationMessage var1) {
         if (var1 == DisplayNotificationMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getDescription().isEmpty()) {
            this.description_ = var1.description_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getResourceLocation().isEmpty()) {
            this.resourceLocation_ = var1.resourceLocation_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.hasDisplayTime()) {
            this.mergeDisplayTime(var1.getDisplayTime());
         }

         if (!var1.getTitleAdventureJsonLines().isEmpty()) {
            this.titleAdventureJsonLines_ = var1.titleAdventureJsonLines_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getDescriptionAdventureJsonLines().isEmpty()) {
            this.descriptionAdventureJsonLines_ = var1.descriptionAdventureJsonLines_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (var1.hasIcon()) {
            this.mergeIcon(var1.getIcon());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayNotificationMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.title_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.description_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.resourceLocation_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getDisplayTimeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.titleAdventureJsonLines_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.descriptionAdventureJsonLines_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getIconFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
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

      @Deprecated
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

      @Deprecated
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

      @Deprecated
      public DisplayNotificationMessage.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayNotificationMessage.Builder clearTitle() {
         this.title_ = DisplayNotificationMessage.getDefaultInstance().getTitle();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayNotificationMessage.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationMessage.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public String getDescription() {
         Object var1 = this.description_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.description_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Deprecated
      @Override
      public ByteString getDescriptionBytes() {
         Object var1 = this.description_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.description_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Deprecated
      public DisplayNotificationMessage.Builder setDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayNotificationMessage.Builder clearDescription() {
         this.description_ = DisplayNotificationMessage.getDefaultInstance().getDescription();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayNotificationMessage.Builder setDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationMessage.checkByteStringIsUtf8(var1);
         this.description_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public String getResourceLocation() {
         Object var1 = this.resourceLocation_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.resourceLocation_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Deprecated
      @Override
      public ByteString getResourceLocationBytes() {
         Object var1 = this.resourceLocation_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.resourceLocation_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      @Deprecated
      public DisplayNotificationMessage.Builder setResourceLocation(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.resourceLocation_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayNotificationMessage.Builder clearResourceLocation() {
         this.resourceLocation_ = DisplayNotificationMessage.getDefaultInstance().getResourceLocation();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      @Deprecated
      public DisplayNotificationMessage.Builder setResourceLocationBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationMessage.checkByteStringIsUtf8(var1);
         this.resourceLocation_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasDisplayTime() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Duration getDisplayTime() {
         if (this.displayTimeBuilder_ == null) {
            return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
         } else {
            return this.displayTimeBuilder_.getMessage();
         }
      }

      public DisplayNotificationMessage.Builder setDisplayTime(Duration var1) {
         if (this.displayTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.displayTime_ = var1;
         } else {
            this.displayTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder setDisplayTime(Duration.Builder var1) {
         if (this.displayTimeBuilder_ == null) {
            this.displayTime_ = var1.build();
         } else {
            this.displayTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder mergeDisplayTime(Duration var1) {
         if (this.displayTimeBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.displayTime_ != null && this.displayTime_ != Duration.getDefaultInstance()) {
               this.getDisplayTimeBuilder().mergeFrom(var1);
            } else {
               this.displayTime_ = var1;
            }
         } else {
            this.displayTimeBuilder_.mergeFrom(var1);
         }

         if (this.displayTime_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public DisplayNotificationMessage.Builder clearDisplayTime() {
         this.bitField0_ &= -9;
         this.displayTime_ = null;
         if (this.displayTimeBuilder_ != null) {
            this.displayTimeBuilder_.dispose();
            this.displayTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDisplayTimeBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getDisplayTimeFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getDisplayTimeOrBuilder() {
         if (this.displayTimeBuilder_ != null) {
            return this.displayTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.displayTime_ == null ? Duration.getDefaultInstance() : this.displayTime_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDisplayTimeFieldBuilder() {
         if (this.displayTimeBuilder_ == null) {
            this.displayTimeBuilder_ = new SingleFieldBuilderV3<>(this.getDisplayTime(), this.getParentForChildren(), this.isClean());
            this.displayTime_ = null;
         }

         return this.displayTimeBuilder_;
      }

      @Override
      public String getTitleAdventureJsonLines() {
         Object var1 = this.titleAdventureJsonLines_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.titleAdventureJsonLines_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTitleAdventureJsonLinesBytes() {
         Object var1 = this.titleAdventureJsonLines_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.titleAdventureJsonLines_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayNotificationMessage.Builder setTitleAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.titleAdventureJsonLines_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder clearTitleAdventureJsonLines() {
         this.titleAdventureJsonLines_ = DisplayNotificationMessage.getDefaultInstance().getTitleAdventureJsonLines();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder setTitleAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationMessage.checkByteStringIsUtf8(var1);
         this.titleAdventureJsonLines_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getDescriptionAdventureJsonLines() {
         Object var1 = this.descriptionAdventureJsonLines_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.descriptionAdventureJsonLines_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDescriptionAdventureJsonLinesBytes() {
         Object var1 = this.descriptionAdventureJsonLines_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.descriptionAdventureJsonLines_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayNotificationMessage.Builder setDescriptionAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.descriptionAdventureJsonLines_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder clearDescriptionAdventureJsonLines() {
         this.descriptionAdventureJsonLines_ = DisplayNotificationMessage.getDefaultInstance().getDescriptionAdventureJsonLines();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder setDescriptionAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationMessage.checkByteStringIsUtf8(var1);
         this.descriptionAdventureJsonLines_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasIcon() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Icon getIcon() {
         if (this.iconBuilder_ == null) {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         } else {
            return this.iconBuilder_.getMessage();
         }
      }

      public DisplayNotificationMessage.Builder setIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.icon_ = var1;
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder setIcon(Icon.Builder var1) {
         if (this.iconBuilder_ == null) {
            this.icon_ = var1.build();
         } else {
            this.iconBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayNotificationMessage.Builder mergeIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.icon_ != null && this.icon_ != Icon.getDefaultInstance()) {
               this.getIconBuilder().mergeFrom(var1);
            } else {
               this.icon_ = var1;
            }
         } else {
            this.iconBuilder_.mergeFrom(var1);
         }

         if (this.icon_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public DisplayNotificationMessage.Builder clearIcon() {
         this.bitField0_ &= -65;
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Icon.Builder getIconBuilder() {
         this.bitField0_ |= 64;
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

      public final DisplayNotificationMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayNotificationMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayNotificationMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayNotificationMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
