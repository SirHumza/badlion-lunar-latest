package com.lunarclient.apollo.hologram.v1;

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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DisplayHologramMessage extends GeneratedMessageV3 implements DisplayHologramMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int LOCATION_FIELD_NUMBER = 2;
   private Location location_;
   public static final int LINES_FIELD_NUMBER = 3;
   private List<Component> lines_;
   public static final int SHOW_THROUGH_WALLS_FIELD_NUMBER = 4;
   private boolean showThroughWalls_ = false;
   public static final int SHOW_SHADOW_FIELD_NUMBER = 5;
   private boolean showShadow_ = false;
   public static final int SHOW_BACKGROUND_FIELD_NUMBER = 6;
   private boolean showBackground_ = false;
   public static final int ADVENTURE_JSON_LINES_FIELD_NUMBER = 7;
   private LazyStringArrayList adventureJsonLines_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final DisplayHologramMessage DEFAULT_INSTANCE = new DisplayHologramMessage();
   private static final Parser<DisplayHologramMessage> PARSER = new AbstractParser<DisplayHologramMessage>() {
      public DisplayHologramMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayHologramMessage.Builder var3 = DisplayHologramMessage.newBuilder();

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

   private DisplayHologramMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayHologramMessage() {
      this.id_ = "";
      this.lines_ = Collections.emptyList();
      this.adventureJsonLines_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayHologramMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayHologramMessage.class, DisplayHologramMessage.Builder.class);
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
   public boolean hasLocation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Deprecated
   @Override
   public List<Component> getLinesList() {
      return this.lines_;
   }

   @Deprecated
   @Override
   public List<? extends ComponentOrBuilder> getLinesOrBuilderList() {
      return this.lines_;
   }

   @Deprecated
   @Override
   public int getLinesCount() {
      return this.lines_.size();
   }

   @Deprecated
   @Override
   public Component getLines(int var1) {
      return this.lines_.get(var1);
   }

   @Deprecated
   @Override
   public ComponentOrBuilder getLinesOrBuilder(int var1) {
      return this.lines_.get(var1);
   }

   @Override
   public boolean getShowThroughWalls() {
      return this.showThroughWalls_;
   }

   @Override
   public boolean getShowShadow() {
      return this.showShadow_;
   }

   @Override
   public boolean getShowBackground() {
      return this.showBackground_;
   }

   public ProtocolStringList getAdventureJsonLinesList() {
      return this.adventureJsonLines_;
   }

   @Override
   public int getAdventureJsonLinesCount() {
      return this.adventureJsonLines_.size();
   }

   @Override
   public String getAdventureJsonLines(int var1) {
      return this.adventureJsonLines_.get(var1);
   }

   @Override
   public ByteString getAdventureJsonLinesBytes(int var1) {
      return this.adventureJsonLines_.getByteString(var1);
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
         var1.writeMessage(2, this.getLocation());
      }

      for (int var2 = 0; var2 < this.lines_.size(); var2++) {
         var1.writeMessage(3, this.lines_.get(var2));
      }

      if (this.showThroughWalls_) {
         var1.writeBool(4, this.showThroughWalls_);
      }

      if (this.showShadow_) {
         var1.writeBool(5, this.showShadow_);
      }

      if (this.showBackground_) {
         var1.writeBool(6, this.showBackground_);
      }

      for (int var3 = 0; var3 < this.adventureJsonLines_.size(); var3++) {
         GeneratedMessageV3.writeString(var1, 7, this.adventureJsonLines_.getRaw(var3));
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getLocation());
      }

      for (int var2 = 0; var2 < this.lines_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.lines_.get(var2));
      }

      if (this.showThroughWalls_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.showThroughWalls_);
      }

      if (this.showShadow_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.showShadow_);
      }

      if (this.showBackground_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.showBackground_);
      }

      int var8 = 0;

      for (int var3 = 0; var3 < this.adventureJsonLines_.size(); var3++) {
         var8 += computeStringSizeNoTag(this.adventureJsonLines_.getRaw(var3));
      }

      var1 += var8;
      var1 += 1 * this.getAdventureJsonLinesList().size();
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayHologramMessage)) {
         return super.equals(var1);
      } else {
         DisplayHologramMessage var2 = (DisplayHologramMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (!this.getLinesList().equals(var2.getLinesList())) {
            return false;
         } else if (this.getShowThroughWalls() != var2.getShowThroughWalls()) {
            return false;
         } else if (this.getShowShadow() != var2.getShowShadow()) {
            return false;
         } else if (this.getShowBackground() != var2.getShowBackground()) {
            return false;
         } else {
            return !this.getAdventureJsonLinesList().equals(var2.getAdventureJsonLinesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.getLinesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLinesList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowThroughWalls());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowShadow());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowBackground());
      if (this.getAdventureJsonLinesCount() > 0) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getAdventureJsonLinesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayHologramMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayHologramMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayHologramMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayHologramMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayHologramMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayHologramMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayHologramMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayHologramMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayHologramMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayHologramMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayHologramMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayHologramMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayHologramMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayHologramMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayHologramMessage.Builder newBuilder(DisplayHologramMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayHologramMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayHologramMessage.Builder() : new DisplayHologramMessage.Builder().mergeFrom(this);
   }

   protected DisplayHologramMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayHologramMessage.Builder(var1);
   }

   public static DisplayHologramMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayHologramMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayHologramMessage> getParserForType() {
      return PARSER;
   }

   public DisplayHologramMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayHologramMessage.Builder> implements DisplayHologramMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private List<Component> lines_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> linesBuilder_;
      private boolean showThroughWalls_;
      private boolean showShadow_;
      private boolean showBackground_;
      private LazyStringArrayList adventureJsonLines_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayHologramMessage.class, DisplayHologramMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DisplayHologramMessage.alwaysUseFieldBuilders) {
            this.getLocationFieldBuilder();
            this.getLinesFieldBuilder();
         }
      }

      public DisplayHologramMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         if (this.linesBuilder_ == null) {
            this.lines_ = Collections.emptyList();
         } else {
            this.lines_ = null;
            this.linesBuilder_.clear();
         }

         this.bitField0_ &= -5;
         this.showThroughWalls_ = false;
         this.showShadow_ = false;
         this.showBackground_ = false;
         this.adventureJsonLines_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_DisplayHologramMessage_descriptor;
      }

      public DisplayHologramMessage getDefaultInstanceForType() {
         return DisplayHologramMessage.getDefaultInstance();
      }

      public DisplayHologramMessage build() {
         DisplayHologramMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayHologramMessage buildPartial() {
         DisplayHologramMessage var1 = new DisplayHologramMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(DisplayHologramMessage var1) {
         if (this.linesBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.lines_ = Collections.unmodifiableList(this.lines_);
               this.bitField0_ &= -5;
            }

            var1.lines_ = this.lines_;
         } else {
            var1.lines_ = this.linesBuilder_.build();
         }
      }

      private void buildPartial0(DisplayHologramMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 8) != 0) {
            var1.showThroughWalls_ = this.showThroughWalls_;
         }

         if ((var2 & 16) != 0) {
            var1.showShadow_ = this.showShadow_;
         }

         if ((var2 & 32) != 0) {
            var1.showBackground_ = this.showBackground_;
         }

         if ((var2 & 64) != 0) {
            this.adventureJsonLines_.makeImmutable();
            var1.adventureJsonLines_ = this.adventureJsonLines_;
         }

         DisplayHologramMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DisplayHologramMessage.Builder clone() {
         return (DisplayHologramMessage.Builder)super.clone();
      }

      public DisplayHologramMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayHologramMessage.Builder)super.setField(var1, var2);
      }

      public DisplayHologramMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayHologramMessage.Builder)super.clearField(var1);
      }

      public DisplayHologramMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayHologramMessage.Builder)super.clearOneof(var1);
      }

      public DisplayHologramMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayHologramMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayHologramMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayHologramMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayHologramMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayHologramMessage) {
            return this.mergeFrom((DisplayHologramMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayHologramMessage.Builder mergeFrom(DisplayHologramMessage var1) {
         if (var1 == DisplayHologramMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (this.linesBuilder_ == null) {
            if (!var1.lines_.isEmpty()) {
               if (this.lines_.isEmpty()) {
                  this.lines_ = var1.lines_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureLinesIsMutable();
                  this.lines_.addAll(var1.lines_);
               }

               this.onChanged();
            }
         } else if (!var1.lines_.isEmpty()) {
            if (this.linesBuilder_.isEmpty()) {
               this.linesBuilder_.dispose();
               this.linesBuilder_ = null;
               this.lines_ = var1.lines_;
               this.bitField0_ &= -5;
               this.linesBuilder_ = DisplayHologramMessage.alwaysUseFieldBuilders ? this.getLinesFieldBuilder() : null;
            } else {
               this.linesBuilder_.addAllMessages(var1.lines_);
            }
         }

         if (var1.getShowThroughWalls()) {
            this.setShowThroughWalls(var1.getShowThroughWalls());
         }

         if (var1.getShowShadow()) {
            this.setShowShadow(var1.getShowShadow());
         }

         if (var1.getShowBackground()) {
            this.setShowBackground(var1.getShowBackground());
         }

         if (!var1.adventureJsonLines_.isEmpty()) {
            if (this.adventureJsonLines_.isEmpty()) {
               this.adventureJsonLines_ = var1.adventureJsonLines_;
               this.bitField0_ |= 64;
            } else {
               this.ensureAdventureJsonLinesIsMutable();
               this.adventureJsonLines_.addAll(var1.adventureJsonLines_);
            }

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

      public DisplayHologramMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     Component var11 = var1.readMessage(Component.parser(), var2);
                     if (this.linesBuilder_ == null) {
                        this.ensureLinesIsMutable();
                        this.lines_.add(var11);
                     } else {
                        this.linesBuilder_.addMessage(var11);
                     }
                     break;
                  case 32:
                     this.showThroughWalls_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.showShadow_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.showBackground_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureAdventureJsonLinesIsMutable();
                     this.adventureJsonLines_.add(var5);
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

      public DisplayHologramMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder clearId() {
         this.id_ = DisplayHologramMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayHologramMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public DisplayHologramMessage.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DisplayHologramMessage.Builder clearLocation() {
         this.bitField0_ &= -3;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      private void ensureLinesIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.lines_ = new ArrayList<>(this.lines_);
            this.bitField0_ |= 4;
         }
      }

      @Deprecated
      @Override
      public List<Component> getLinesList() {
         return this.linesBuilder_ == null ? Collections.unmodifiableList(this.lines_) : this.linesBuilder_.getMessageList();
      }

      @Deprecated
      @Override
      public int getLinesCount() {
         return this.linesBuilder_ == null ? this.lines_.size() : this.linesBuilder_.getCount();
      }

      @Deprecated
      @Override
      public Component getLines(int var1) {
         return this.linesBuilder_ == null ? this.lines_.get(var1) : this.linesBuilder_.getMessage(var1);
      }

      @Deprecated
      public DisplayHologramMessage.Builder setLines(int var1, Component var2) {
         if (this.linesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureLinesIsMutable();
            this.lines_.set(var1, var2);
            this.onChanged();
         } else {
            this.linesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder setLines(int var1, Component.Builder var2) {
         if (this.linesBuilder_ == null) {
            this.ensureLinesIsMutable();
            this.lines_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.linesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder addLines(Component var1) {
         if (this.linesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureLinesIsMutable();
            this.lines_.add(var1);
            this.onChanged();
         } else {
            this.linesBuilder_.addMessage(var1);
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder addLines(int var1, Component var2) {
         if (this.linesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureLinesIsMutable();
            this.lines_.add(var1, var2);
            this.onChanged();
         } else {
            this.linesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder addLines(Component.Builder var1) {
         if (this.linesBuilder_ == null) {
            this.ensureLinesIsMutable();
            this.lines_.add(var1.build());
            this.onChanged();
         } else {
            this.linesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder addLines(int var1, Component.Builder var2) {
         if (this.linesBuilder_ == null) {
            this.ensureLinesIsMutable();
            this.lines_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.linesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder addAllLines(Iterable<? extends Component> var1) {
         if (this.linesBuilder_ == null) {
            this.ensureLinesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.lines_);
            this.onChanged();
         } else {
            this.linesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder clearLines() {
         if (this.linesBuilder_ == null) {
            this.lines_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.linesBuilder_.clear();
         }

         return this;
      }

      @Deprecated
      public DisplayHologramMessage.Builder removeLines(int var1) {
         if (this.linesBuilder_ == null) {
            this.ensureLinesIsMutable();
            this.lines_.remove(var1);
            this.onChanged();
         } else {
            this.linesBuilder_.remove(var1);
         }

         return this;
      }

      @Deprecated
      public Component.Builder getLinesBuilder(int var1) {
         return this.getLinesFieldBuilder().getBuilder(var1);
      }

      @Deprecated
      @Override
      public ComponentOrBuilder getLinesOrBuilder(int var1) {
         return this.linesBuilder_ == null ? this.lines_.get(var1) : this.linesBuilder_.getMessageOrBuilder(var1);
      }

      @Deprecated
      @Override
      public List<? extends ComponentOrBuilder> getLinesOrBuilderList() {
         return this.linesBuilder_ != null ? this.linesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lines_);
      }

      @Deprecated
      public Component.Builder addLinesBuilder() {
         return this.getLinesFieldBuilder().addBuilder(Component.getDefaultInstance());
      }

      @Deprecated
      public Component.Builder addLinesBuilder(int var1) {
         return this.getLinesFieldBuilder().addBuilder(var1, Component.getDefaultInstance());
      }

      @Deprecated
      public List<Component.Builder> getLinesBuilderList() {
         return this.getLinesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> getLinesFieldBuilder() {
         if (this.linesBuilder_ == null) {
            this.linesBuilder_ = new RepeatedFieldBuilderV3<>(this.lines_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.lines_ = null;
         }

         return this.linesBuilder_;
      }

      @Override
      public boolean getShowThroughWalls() {
         return this.showThroughWalls_;
      }

      public DisplayHologramMessage.Builder setShowThroughWalls(boolean var1) {
         this.showThroughWalls_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder clearShowThroughWalls() {
         this.bitField0_ &= -9;
         this.showThroughWalls_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowShadow() {
         return this.showShadow_;
      }

      public DisplayHologramMessage.Builder setShowShadow(boolean var1) {
         this.showShadow_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder clearShowShadow() {
         this.bitField0_ &= -17;
         this.showShadow_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowBackground() {
         return this.showBackground_;
      }

      public DisplayHologramMessage.Builder setShowBackground(boolean var1) {
         this.showBackground_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder clearShowBackground() {
         this.bitField0_ &= -33;
         this.showBackground_ = false;
         this.onChanged();
         return this;
      }

      private void ensureAdventureJsonLinesIsMutable() {
         if (!this.adventureJsonLines_.isModifiable()) {
            this.adventureJsonLines_ = new LazyStringArrayList(this.adventureJsonLines_);
         }

         this.bitField0_ |= 64;
      }

      public ProtocolStringList getAdventureJsonLinesList() {
         this.adventureJsonLines_.makeImmutable();
         return this.adventureJsonLines_;
      }

      @Override
      public int getAdventureJsonLinesCount() {
         return this.adventureJsonLines_.size();
      }

      @Override
      public String getAdventureJsonLines(int var1) {
         return this.adventureJsonLines_.get(var1);
      }

      @Override
      public ByteString getAdventureJsonLinesBytes(int var1) {
         return this.adventureJsonLines_.getByteString(var1);
      }

      public DisplayHologramMessage.Builder setAdventureJsonLines(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.set(var1, var2);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder addAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.add(var1);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder addAllAdventureJsonLines(Iterable<String> var1) {
         this.ensureAdventureJsonLinesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.adventureJsonLines_);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder clearAdventureJsonLines() {
         this.adventureJsonLines_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public DisplayHologramMessage.Builder addAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayHologramMessage.checkByteStringIsUtf8(var1);
         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.add(var1);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public final DisplayHologramMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayHologramMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayHologramMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayHologramMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
