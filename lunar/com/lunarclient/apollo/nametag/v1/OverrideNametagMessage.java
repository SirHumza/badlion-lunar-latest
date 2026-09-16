package com.lunarclient.apollo.nametag.v1;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class OverrideNametagMessage extends GeneratedMessageV3 implements OverrideNametagMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int LINES_FIELD_NUMBER = 2;
   private List<Component> lines_;
   public static final int ADVENTURE_JSON_LINES_FIELD_NUMBER = 3;
   private LazyStringArrayList adventureJsonLines_ = LazyStringArrayList.emptyList();
   public static final int VISIBILITY_OVERRIDE_FIELD_NUMBER = 4;
   private int visibilityOverride_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OverrideNametagMessage DEFAULT_INSTANCE = new OverrideNametagMessage();
   private static final Parser<OverrideNametagMessage> PARSER = new AbstractParser<OverrideNametagMessage>() {
      public OverrideNametagMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideNametagMessage.Builder var3 = OverrideNametagMessage.newBuilder();

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

   private OverrideNametagMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideNametagMessage() {
      this.lines_ = Collections.emptyList();
      this.adventureJsonLines_ = LazyStringArrayList.emptyList();
      this.visibilityOverride_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideNametagMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideNametagMessage.class, OverrideNametagMessage.Builder.class);
   }

   @Override
   public boolean hasPlayerUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPlayerUuid() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public UuidOrBuilder getPlayerUuidOrBuilder() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
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
   public int getVisibilityOverrideValue() {
      return this.visibilityOverride_;
   }

   @Override
   public NametagVisibilityOverride getVisibilityOverride() {
      NametagVisibilityOverride var1 = NametagVisibilityOverride.forNumber(this.visibilityOverride_);
      return var1 == null ? NametagVisibilityOverride.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getPlayerUuid());
      }

      for (int var2 = 0; var2 < this.lines_.size(); var2++) {
         var1.writeMessage(2, this.lines_.get(var2));
      }

      for (int var3 = 0; var3 < this.adventureJsonLines_.size(); var3++) {
         GeneratedMessageV3.writeString(var1, 3, this.adventureJsonLines_.getRaw(var3));
      }

      if (this.visibilityOverride_ != NametagVisibilityOverride.NAMETAG_VISIBILITY_OVERRIDE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.visibilityOverride_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
      }

      for (int var2 = 0; var2 < this.lines_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.lines_.get(var2));
      }

      int var8 = 0;

      for (int var3 = 0; var3 < this.adventureJsonLines_.size(); var3++) {
         var8 += computeStringSizeNoTag(this.adventureJsonLines_.getRaw(var3));
      }

      var1 += var8;
      var1 += 1 * this.getAdventureJsonLinesList().size();
      if (this.visibilityOverride_ != NametagVisibilityOverride.NAMETAG_VISIBILITY_OVERRIDE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.visibilityOverride_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideNametagMessage)) {
         return super.equals(var1);
      } else {
         OverrideNametagMessage var2 = (OverrideNametagMessage)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (!this.getLinesList().equals(var2.getLinesList())) {
            return false;
         } else if (!this.getAdventureJsonLinesList().equals(var2.getAdventureJsonLinesList())) {
            return false;
         } else {
            return this.visibilityOverride_ != var2.visibilityOverride_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      if (this.getLinesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLinesList().hashCode();
      }

      if (this.getAdventureJsonLinesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getAdventureJsonLinesList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.visibilityOverride_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideNametagMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideNametagMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideNametagMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideNametagMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideNametagMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideNametagMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideNametagMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideNametagMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideNametagMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideNametagMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideNametagMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideNametagMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideNametagMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideNametagMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideNametagMessage.Builder newBuilder(OverrideNametagMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideNametagMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideNametagMessage.Builder() : new OverrideNametagMessage.Builder().mergeFrom(this);
   }

   protected OverrideNametagMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideNametagMessage.Builder(var1);
   }

   public static OverrideNametagMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideNametagMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideNametagMessage> getParserForType() {
      return PARSER;
   }

   public OverrideNametagMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OverrideNametagMessage.Builder> implements OverrideNametagMessageOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private List<Component> lines_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> linesBuilder_;
      private LazyStringArrayList adventureJsonLines_ = LazyStringArrayList.emptyList();
      private int visibilityOverride_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideNametagMessage.class, OverrideNametagMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OverrideNametagMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getLinesFieldBuilder();
         }
      }

      public OverrideNametagMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         if (this.linesBuilder_ == null) {
            this.lines_ = Collections.emptyList();
         } else {
            this.lines_ = null;
            this.linesBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.adventureJsonLines_ = LazyStringArrayList.emptyList();
         this.visibilityOverride_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_nametag_v1_OverrideNametagMessage_descriptor;
      }

      public OverrideNametagMessage getDefaultInstanceForType() {
         return OverrideNametagMessage.getDefaultInstance();
      }

      public OverrideNametagMessage build() {
         OverrideNametagMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideNametagMessage buildPartial() {
         OverrideNametagMessage var1 = new OverrideNametagMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(OverrideNametagMessage var1) {
         if (this.linesBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.lines_ = Collections.unmodifiableList(this.lines_);
               this.bitField0_ &= -3;
            }

            var1.lines_ = this.lines_;
         } else {
            var1.lines_ = this.linesBuilder_.build();
         }
      }

      private void buildPartial0(OverrideNametagMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            this.adventureJsonLines_.makeImmutable();
            var1.adventureJsonLines_ = this.adventureJsonLines_;
         }

         if ((var2 & 8) != 0) {
            var1.visibilityOverride_ = this.visibilityOverride_;
         }

         OverrideNametagMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OverrideNametagMessage.Builder clone() {
         return (OverrideNametagMessage.Builder)super.clone();
      }

      public OverrideNametagMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideNametagMessage.Builder)super.setField(var1, var2);
      }

      public OverrideNametagMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideNametagMessage.Builder)super.clearField(var1);
      }

      public OverrideNametagMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideNametagMessage.Builder)super.clearOneof(var1);
      }

      public OverrideNametagMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideNametagMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideNametagMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideNametagMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideNametagMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideNametagMessage) {
            return this.mergeFrom((OverrideNametagMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideNametagMessage.Builder mergeFrom(OverrideNametagMessage var1) {
         if (var1 == OverrideNametagMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (this.linesBuilder_ == null) {
            if (!var1.lines_.isEmpty()) {
               if (this.lines_.isEmpty()) {
                  this.lines_ = var1.lines_;
                  this.bitField0_ &= -3;
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
               this.bitField0_ &= -3;
               this.linesBuilder_ = OverrideNametagMessage.alwaysUseFieldBuilders ? this.getLinesFieldBuilder() : null;
            } else {
               this.linesBuilder_.addAllMessages(var1.lines_);
            }
         }

         if (!var1.adventureJsonLines_.isEmpty()) {
            if (this.adventureJsonLines_.isEmpty()) {
               this.adventureJsonLines_ = var1.adventureJsonLines_;
               this.bitField0_ |= 4;
            } else {
               this.ensureAdventureJsonLinesIsMutable();
               this.adventureJsonLines_.addAll(var1.adventureJsonLines_);
            }

            this.onChanged();
         }

         if (var1.visibilityOverride_ != 0) {
            this.setVisibilityOverrideValue(var1.getVisibilityOverrideValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OverrideNametagMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     Component var11 = var1.readMessage(Component.parser(), var2);
                     if (this.linesBuilder_ == null) {
                        this.ensureLinesIsMutable();
                        this.lines_.add(var11);
                     } else {
                        this.linesBuilder_.addMessage(var11);
                     }
                     break;
                  case 26:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureAdventureJsonLinesIsMutable();
                     this.adventureJsonLines_.add(var5);
                     break;
                  case 32:
                     this.visibilityOverride_ = var1.readEnum();
                     this.bitField0_ |= 8;
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
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public OverrideNametagMessage.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public OverrideNametagMessage.Builder clearPlayerUuid() {
         this.bitField0_ &= -2;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         if (this.playerUuidBuilder_ != null) {
            return this.playerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
            this.playerUuid_ = null;
         }

         return this.playerUuidBuilder_;
      }

      private void ensureLinesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.lines_ = new ArrayList<>(this.lines_);
            this.bitField0_ |= 2;
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
      public OverrideNametagMessage.Builder setLines(int var1, Component var2) {
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
      public OverrideNametagMessage.Builder setLines(int var1, Component.Builder var2) {
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
      public OverrideNametagMessage.Builder addLines(Component var1) {
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
      public OverrideNametagMessage.Builder addLines(int var1, Component var2) {
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
      public OverrideNametagMessage.Builder addLines(Component.Builder var1) {
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
      public OverrideNametagMessage.Builder addLines(int var1, Component.Builder var2) {
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
      public OverrideNametagMessage.Builder addAllLines(Iterable<? extends Component> var1) {
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
      public OverrideNametagMessage.Builder clearLines() {
         if (this.linesBuilder_ == null) {
            this.lines_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.linesBuilder_.clear();
         }

         return this;
      }

      @Deprecated
      public OverrideNametagMessage.Builder removeLines(int var1) {
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
            this.linesBuilder_ = new RepeatedFieldBuilderV3<>(this.lines_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.lines_ = null;
         }

         return this.linesBuilder_;
      }

      private void ensureAdventureJsonLinesIsMutable() {
         if (!this.adventureJsonLines_.isModifiable()) {
            this.adventureJsonLines_ = new LazyStringArrayList(this.adventureJsonLines_);
         }

         this.bitField0_ |= 4;
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

      public OverrideNametagMessage.Builder setAdventureJsonLines(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.set(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder addAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder addAllAdventureJsonLines(Iterable<String> var1) {
         this.ensureAdventureJsonLinesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.adventureJsonLines_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder clearAdventureJsonLines() {
         this.adventureJsonLines_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder addAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideNametagMessage.checkByteStringIsUtf8(var1);
         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public int getVisibilityOverrideValue() {
         return this.visibilityOverride_;
      }

      public OverrideNametagMessage.Builder setVisibilityOverrideValue(int var1) {
         this.visibilityOverride_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public NametagVisibilityOverride getVisibilityOverride() {
         NametagVisibilityOverride var1 = NametagVisibilityOverride.forNumber(this.visibilityOverride_);
         return var1 == null ? NametagVisibilityOverride.UNRECOGNIZED : var1;
      }

      public OverrideNametagMessage.Builder setVisibilityOverride(NametagVisibilityOverride var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.visibilityOverride_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OverrideNametagMessage.Builder clearVisibilityOverride() {
         this.bitField0_ &= -9;
         this.visibilityOverride_ = 0;
         this.onChanged();
         return this;
      }

      public final OverrideNametagMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideNametagMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideNametagMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideNametagMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
