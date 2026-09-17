package com.lunarclient.apollo.team.v1;

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
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TeamMember extends GeneratedMessageV3 implements TeamMemberOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int PLAYER_DISPLAY_NAME_FIELD_NUMBER = 2;
   private Component playerDisplayName_;
   public static final int LOCATION_FIELD_NUMBER = 3;
   private Location location_;
   public static final int MARKER_COLOR_FIELD_NUMBER = 4;
   private Color markerColor_;
   public static final int ADVENTURE_JSON_PLAYER_NAME_FIELD_NUMBER = 5;
   private volatile Object adventureJsonPlayerName_ = "";
   private byte memoizedIsInitialized = -1;
   private static final TeamMember DEFAULT_INSTANCE = new TeamMember();
   private static final Parser<TeamMember> PARSER = new AbstractParser<TeamMember>() {
      public TeamMember parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TeamMember.Builder var3 = TeamMember.newBuilder();

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

   private TeamMember(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TeamMember() {
      this.adventureJsonPlayerName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TeamMember();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_team_v1_TeamMember_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_team_v1_TeamMember_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TeamMember.class, TeamMember.Builder.class);
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
   public boolean hasPlayerDisplayName() {
      return (this.bitField0_ & 2) != 0;
   }

   @Deprecated
   @Override
   public Component getPlayerDisplayName() {
      return this.playerDisplayName_ == null ? Component.getDefaultInstance() : this.playerDisplayName_;
   }

   @Deprecated
   @Override
   public ComponentOrBuilder getPlayerDisplayNameOrBuilder() {
      return this.playerDisplayName_ == null ? Component.getDefaultInstance() : this.playerDisplayName_;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean hasMarkerColor() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Color getMarkerColor() {
      return this.markerColor_ == null ? Color.getDefaultInstance() : this.markerColor_;
   }

   @Override
   public ColorOrBuilder getMarkerColorOrBuilder() {
      return this.markerColor_ == null ? Color.getDefaultInstance() : this.markerColor_;
   }

   @Override
   public String getAdventureJsonPlayerName() {
      Object var1 = this.adventureJsonPlayerName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.adventureJsonPlayerName_ = var3;
      return var3;
   }

   @Override
   public ByteString getAdventureJsonPlayerNameBytes() {
      Object var1 = this.adventureJsonPlayerName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.adventureJsonPlayerName_ = var2;
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
         var1.writeMessage(1, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getPlayerDisplayName());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getLocation());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getMarkerColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.adventureJsonPlayerName_)) {
         GeneratedMessageV3.writeString(var1, 5, this.adventureJsonPlayerName_);
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

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getPlayerDisplayName());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLocation());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getMarkerColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.adventureJsonPlayerName_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.adventureJsonPlayerName_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof TeamMember)) {
         return super.equals(var1);
      } else {
         TeamMember var2 = (TeamMember)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.hasPlayerDisplayName() != var2.hasPlayerDisplayName()) {
            return false;
         } else if (this.hasPlayerDisplayName() && !this.getPlayerDisplayName().equals(var2.getPlayerDisplayName())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasMarkerColor() != var2.hasMarkerColor()) {
            return false;
         } else if (this.hasMarkerColor() && !this.getMarkerColor().equals(var2.getMarkerColor())) {
            return false;
         } else {
            return !this.getAdventureJsonPlayerName().equals(var2.getAdventureJsonPlayerName())
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      if (this.hasPlayerDisplayName()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPlayerDisplayName().hashCode();
      }

      if (this.hasLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasMarkerColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getMarkerColor().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getAdventureJsonPlayerName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static TeamMember parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TeamMember parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TeamMember parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TeamMember parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TeamMember parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TeamMember parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TeamMember parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TeamMember parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TeamMember parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TeamMember parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TeamMember parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TeamMember parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TeamMember.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TeamMember.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TeamMember.Builder newBuilder(TeamMember var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TeamMember.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TeamMember.Builder() : new TeamMember.Builder().mergeFrom(this);
   }

   protected TeamMember.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TeamMember.Builder(var1);
   }

   public static TeamMember getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TeamMember> parser() {
      return PARSER;
   }

   @Override
   public Parser<TeamMember> getParserForType() {
      return PARSER;
   }

   public TeamMember getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TeamMember.Builder> implements TeamMemberOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private Component playerDisplayName_;
      private SingleFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> playerDisplayNameBuilder_;
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private Color markerColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> markerColorBuilder_;
      private Object adventureJsonPlayerName_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_team_v1_TeamMember_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_team_v1_TeamMember_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TeamMember.class, TeamMember.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (TeamMember.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getPlayerDisplayNameFieldBuilder();
            this.getLocationFieldBuilder();
            this.getMarkerColorFieldBuilder();
         }
      }

      public TeamMember.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.playerDisplayName_ = null;
         if (this.playerDisplayNameBuilder_ != null) {
            this.playerDisplayNameBuilder_.dispose();
            this.playerDisplayNameBuilder_ = null;
         }

         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.markerColor_ = null;
         if (this.markerColorBuilder_ != null) {
            this.markerColorBuilder_.dispose();
            this.markerColorBuilder_ = null;
         }

         this.adventureJsonPlayerName_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_team_v1_TeamMember_descriptor;
      }

      public TeamMember getDefaultInstanceForType() {
         return TeamMember.getDefaultInstance();
      }

      public TeamMember build() {
         TeamMember var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TeamMember buildPartial() {
         TeamMember var1 = new TeamMember(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(TeamMember var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.playerDisplayName_ = this.playerDisplayNameBuilder_ == null ? this.playerDisplayName_ : this.playerDisplayNameBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.markerColor_ = this.markerColorBuilder_ == null ? this.markerColor_ : this.markerColorBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 16) != 0) {
            var1.adventureJsonPlayerName_ = this.adventureJsonPlayerName_;
         }

         TeamMember var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public TeamMember.Builder clone() {
         return (TeamMember.Builder)super.clone();
      }

      public TeamMember.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TeamMember.Builder)super.setField(var1, var2);
      }

      public TeamMember.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TeamMember.Builder)super.clearField(var1);
      }

      public TeamMember.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TeamMember.Builder)super.clearOneof(var1);
      }

      public TeamMember.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TeamMember.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TeamMember.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TeamMember.Builder)super.addRepeatedField(var1, var2);
      }

      public TeamMember.Builder mergeFrom(Message var1) {
         if (var1 instanceof TeamMember) {
            return this.mergeFrom((TeamMember)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TeamMember.Builder mergeFrom(TeamMember var1) {
         if (var1 == TeamMember.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.hasPlayerDisplayName()) {
            this.mergePlayerDisplayName(var1.getPlayerDisplayName());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasMarkerColor()) {
            this.mergeMarkerColor(var1.getMarkerColor());
         }

         if (!var1.getAdventureJsonPlayerName().isEmpty()) {
            this.adventureJsonPlayerName_ = var1.adventureJsonPlayerName_;
            this.bitField0_ |= 16;
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

      public TeamMember.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerDisplayNameFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getMarkerColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.adventureJsonPlayerName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
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

      public TeamMember.Builder setPlayerUuid(Uuid var1) {
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

      public TeamMember.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public TeamMember.Builder mergePlayerUuid(Uuid var1) {
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

      public TeamMember.Builder clearPlayerUuid() {
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

      @Deprecated
      @Override
      public boolean hasPlayerDisplayName() {
         return (this.bitField0_ & 2) != 0;
      }

      @Deprecated
      @Override
      public Component getPlayerDisplayName() {
         if (this.playerDisplayNameBuilder_ == null) {
            return this.playerDisplayName_ == null ? Component.getDefaultInstance() : this.playerDisplayName_;
         } else {
            return this.playerDisplayNameBuilder_.getMessage();
         }
      }

      @Deprecated
      public TeamMember.Builder setPlayerDisplayName(Component var1) {
         if (this.playerDisplayNameBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerDisplayName_ = var1;
         } else {
            this.playerDisplayNameBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public TeamMember.Builder setPlayerDisplayName(Component.Builder var1) {
         if (this.playerDisplayNameBuilder_ == null) {
            this.playerDisplayName_ = var1.build();
         } else {
            this.playerDisplayNameBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public TeamMember.Builder mergePlayerDisplayName(Component var1) {
         if (this.playerDisplayNameBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.playerDisplayName_ != null && this.playerDisplayName_ != Component.getDefaultInstance()) {
               this.getPlayerDisplayNameBuilder().mergeFrom(var1);
            } else {
               this.playerDisplayName_ = var1;
            }
         } else {
            this.playerDisplayNameBuilder_.mergeFrom(var1);
         }

         if (this.playerDisplayName_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      @Deprecated
      public TeamMember.Builder clearPlayerDisplayName() {
         this.bitField0_ &= -3;
         this.playerDisplayName_ = null;
         if (this.playerDisplayNameBuilder_ != null) {
            this.playerDisplayNameBuilder_.dispose();
            this.playerDisplayNameBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      @Deprecated
      public Component.Builder getPlayerDisplayNameBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getPlayerDisplayNameFieldBuilder().getBuilder();
      }

      @Deprecated
      @Override
      public ComponentOrBuilder getPlayerDisplayNameOrBuilder() {
         if (this.playerDisplayNameBuilder_ != null) {
            return this.playerDisplayNameBuilder_.getMessageOrBuilder();
         } else {
            return this.playerDisplayName_ == null ? Component.getDefaultInstance() : this.playerDisplayName_;
         }
      }

      private SingleFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> getPlayerDisplayNameFieldBuilder() {
         if (this.playerDisplayNameBuilder_ == null) {
            this.playerDisplayNameBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerDisplayName(), this.getParentForChildren(), this.isClean());
            this.playerDisplayName_ = null;
         }

         return this.playerDisplayNameBuilder_;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public TeamMember.Builder setLocation(Location var1) {
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

      public TeamMember.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public TeamMember.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
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

      public TeamMember.Builder clearLocation() {
         this.bitField0_ &= -5;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 4;
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

      @Override
      public boolean hasMarkerColor() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Color getMarkerColor() {
         if (this.markerColorBuilder_ == null) {
            return this.markerColor_ == null ? Color.getDefaultInstance() : this.markerColor_;
         } else {
            return this.markerColorBuilder_.getMessage();
         }
      }

      public TeamMember.Builder setMarkerColor(Color var1) {
         if (this.markerColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.markerColor_ = var1;
         } else {
            this.markerColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public TeamMember.Builder setMarkerColor(Color.Builder var1) {
         if (this.markerColorBuilder_ == null) {
            this.markerColor_ = var1.build();
         } else {
            this.markerColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public TeamMember.Builder mergeMarkerColor(Color var1) {
         if (this.markerColorBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.markerColor_ != null && this.markerColor_ != Color.getDefaultInstance()) {
               this.getMarkerColorBuilder().mergeFrom(var1);
            } else {
               this.markerColor_ = var1;
            }
         } else {
            this.markerColorBuilder_.mergeFrom(var1);
         }

         if (this.markerColor_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public TeamMember.Builder clearMarkerColor() {
         this.bitField0_ &= -9;
         this.markerColor_ = null;
         if (this.markerColorBuilder_ != null) {
            this.markerColorBuilder_.dispose();
            this.markerColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getMarkerColorBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getMarkerColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getMarkerColorOrBuilder() {
         if (this.markerColorBuilder_ != null) {
            return this.markerColorBuilder_.getMessageOrBuilder();
         } else {
            return this.markerColor_ == null ? Color.getDefaultInstance() : this.markerColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getMarkerColorFieldBuilder() {
         if (this.markerColorBuilder_ == null) {
            this.markerColorBuilder_ = new SingleFieldBuilderV3<>(this.getMarkerColor(), this.getParentForChildren(), this.isClean());
            this.markerColor_ = null;
         }

         return this.markerColorBuilder_;
      }

      @Override
      public String getAdventureJsonPlayerName() {
         Object var1 = this.adventureJsonPlayerName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.adventureJsonPlayerName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAdventureJsonPlayerNameBytes() {
         Object var1 = this.adventureJsonPlayerName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.adventureJsonPlayerName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TeamMember.Builder setAdventureJsonPlayerName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.adventureJsonPlayerName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public TeamMember.Builder clearAdventureJsonPlayerName() {
         this.adventureJsonPlayerName_ = TeamMember.getDefaultInstance().getAdventureJsonPlayerName();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public TeamMember.Builder setAdventureJsonPlayerNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TeamMember.checkByteStringIsUtf8(var1);
         this.adventureJsonPlayerName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public final TeamMember.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TeamMember.Builder)super.setUnknownFields(var1);
      }

      public final TeamMember.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TeamMember.Builder)super.mergeUnknownFields(var1);
      }
   }
}
