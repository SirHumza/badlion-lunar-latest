package com.lunarclient.common.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Location extends GeneratedMessageV3 implements LocationOrBuilder {
   private static final long serialVersionUID = 0L;
   private int locationCase_ = 0;
   private Object location_;
   public static final int PUBLIC_SERVER_FIELD_NUMBER = 1;
   public static final int PRIVATE_SERVER_FIELD_NUMBER = 2;
   public static final int LOCAL_SERVER_FIELD_NUMBER = 3;
   public static final int SINGLE_PLAYER_FIELD_NUMBER = 4;
   public static final int MINECRAFT_REALMS_FIELD_NUMBER = 5;
   public static final int IN_MENUS_FIELD_NUMBER = 6;
   public static final int IN_LAUNCHER_FIELD_NUMBER = 7;
   public static final int HOSTED_WORLD_FIELD_NUMBER = 8;
   public static final int REPLAY_WORLD_FIELD_NUMBER = 9;
   public static final int IN_GAME_FIELD_NUMBER = 10;
   public static final int REWIND_WORLD_FIELD_NUMBER = 11;
   private byte memoizedIsInitialized = -1;
   private static final Location DEFAULT_INSTANCE = new Location();
   private static final Parser<Location> PARSER = new AbstractParser<Location>() {
      public Location parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Location.Builder var3 = Location.newBuilder();

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

   private Location(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Location() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Location();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_Location_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_Location_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Location.class, Location.Builder.class);
   }

   @Override
   public Location.LocationCase getLocationCase() {
      return Location.LocationCase.forNumber(this.locationCase_);
   }

   @Override
   public boolean hasPublicServer() {
      return this.locationCase_ == 1;
   }

   @Override
   public PublicServer getPublicServer() {
      return this.locationCase_ == 1 ? (PublicServer)this.location_ : PublicServer.getDefaultInstance();
   }

   @Override
   public PublicServerOrBuilder getPublicServerOrBuilder() {
      return this.locationCase_ == 1 ? (PublicServer)this.location_ : PublicServer.getDefaultInstance();
   }

   @Override
   public boolean hasPrivateServer() {
      return this.locationCase_ == 2;
   }

   @Override
   public PrivateServer getPrivateServer() {
      return this.locationCase_ == 2 ? (PrivateServer)this.location_ : PrivateServer.getDefaultInstance();
   }

   @Override
   public PrivateServerOrBuilder getPrivateServerOrBuilder() {
      return this.locationCase_ == 2 ? (PrivateServer)this.location_ : PrivateServer.getDefaultInstance();
   }

   @Override
   public boolean hasLocalServer() {
      return this.locationCase_ == 3;
   }

   @Override
   public LocalServer getLocalServer() {
      return this.locationCase_ == 3 ? (LocalServer)this.location_ : LocalServer.getDefaultInstance();
   }

   @Override
   public LocalServerOrBuilder getLocalServerOrBuilder() {
      return this.locationCase_ == 3 ? (LocalServer)this.location_ : LocalServer.getDefaultInstance();
   }

   @Override
   public boolean hasSinglePlayer() {
      return this.locationCase_ == 4;
   }

   @Override
   public SinglePlayer getSinglePlayer() {
      return this.locationCase_ == 4 ? (SinglePlayer)this.location_ : SinglePlayer.getDefaultInstance();
   }

   @Override
   public SinglePlayerOrBuilder getSinglePlayerOrBuilder() {
      return this.locationCase_ == 4 ? (SinglePlayer)this.location_ : SinglePlayer.getDefaultInstance();
   }

   @Override
   public boolean hasMinecraftRealms() {
      return this.locationCase_ == 5;
   }

   @Override
   public MinecraftRealms getMinecraftRealms() {
      return this.locationCase_ == 5 ? (MinecraftRealms)this.location_ : MinecraftRealms.getDefaultInstance();
   }

   @Override
   public MinecraftRealmsOrBuilder getMinecraftRealmsOrBuilder() {
      return this.locationCase_ == 5 ? (MinecraftRealms)this.location_ : MinecraftRealms.getDefaultInstance();
   }

   @Override
   public boolean hasInMenus() {
      return this.locationCase_ == 6;
   }

   @Override
   public InMenus getInMenus() {
      return this.locationCase_ == 6 ? (InMenus)this.location_ : InMenus.getDefaultInstance();
   }

   @Override
   public InMenusOrBuilder getInMenusOrBuilder() {
      return this.locationCase_ == 6 ? (InMenus)this.location_ : InMenus.getDefaultInstance();
   }

   @Override
   public boolean hasInLauncher() {
      return this.locationCase_ == 7;
   }

   @Override
   public InLauncher getInLauncher() {
      return this.locationCase_ == 7 ? (InLauncher)this.location_ : InLauncher.getDefaultInstance();
   }

   @Override
   public InLauncherOrBuilder getInLauncherOrBuilder() {
      return this.locationCase_ == 7 ? (InLauncher)this.location_ : InLauncher.getDefaultInstance();
   }

   @Override
   public boolean hasHostedWorld() {
      return this.locationCase_ == 8;
   }

   @Override
   public HostedWorld getHostedWorld() {
      return this.locationCase_ == 8 ? (HostedWorld)this.location_ : HostedWorld.getDefaultInstance();
   }

   @Override
   public HostedWorldOrBuilder getHostedWorldOrBuilder() {
      return this.locationCase_ == 8 ? (HostedWorld)this.location_ : HostedWorld.getDefaultInstance();
   }

   @Override
   public boolean hasReplayWorld() {
      return this.locationCase_ == 9;
   }

   @Override
   public ReplayWorld getReplayWorld() {
      return this.locationCase_ == 9 ? (ReplayWorld)this.location_ : ReplayWorld.getDefaultInstance();
   }

   @Override
   public ReplayWorldOrBuilder getReplayWorldOrBuilder() {
      return this.locationCase_ == 9 ? (ReplayWorld)this.location_ : ReplayWorld.getDefaultInstance();
   }

   @Override
   public boolean hasInGame() {
      return this.locationCase_ == 10;
   }

   @Override
   public InGame getInGame() {
      return this.locationCase_ == 10 ? (InGame)this.location_ : InGame.getDefaultInstance();
   }

   @Override
   public InGameOrBuilder getInGameOrBuilder() {
      return this.locationCase_ == 10 ? (InGame)this.location_ : InGame.getDefaultInstance();
   }

   @Override
   public boolean hasRewindWorld() {
      return this.locationCase_ == 11;
   }

   @Override
   public RewindWorld getRewindWorld() {
      return this.locationCase_ == 11 ? (RewindWorld)this.location_ : RewindWorld.getDefaultInstance();
   }

   @Override
   public RewindWorldOrBuilder getRewindWorldOrBuilder() {
      return this.locationCase_ == 11 ? (RewindWorld)this.location_ : RewindWorld.getDefaultInstance();
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
      if (this.locationCase_ == 1) {
         var1.writeMessage(1, (PublicServer)this.location_);
      }

      if (this.locationCase_ == 2) {
         var1.writeMessage(2, (PrivateServer)this.location_);
      }

      if (this.locationCase_ == 3) {
         var1.writeMessage(3, (LocalServer)this.location_);
      }

      if (this.locationCase_ == 4) {
         var1.writeMessage(4, (SinglePlayer)this.location_);
      }

      if (this.locationCase_ == 5) {
         var1.writeMessage(5, (MinecraftRealms)this.location_);
      }

      if (this.locationCase_ == 6) {
         var1.writeMessage(6, (InMenus)this.location_);
      }

      if (this.locationCase_ == 7) {
         var1.writeMessage(7, (InLauncher)this.location_);
      }

      if (this.locationCase_ == 8) {
         var1.writeMessage(8, (HostedWorld)this.location_);
      }

      if (this.locationCase_ == 9) {
         var1.writeMessage(9, (ReplayWorld)this.location_);
      }

      if (this.locationCase_ == 10) {
         var1.writeMessage(10, (InGame)this.location_);
      }

      if (this.locationCase_ == 11) {
         var1.writeMessage(11, (RewindWorld)this.location_);
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
      if (this.locationCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (PublicServer)this.location_);
      }

      if (this.locationCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (PrivateServer)this.location_);
      }

      if (this.locationCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (LocalServer)this.location_);
      }

      if (this.locationCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (SinglePlayer)this.location_);
      }

      if (this.locationCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (MinecraftRealms)this.location_);
      }

      if (this.locationCase_ == 6) {
         var1 += CodedOutputStream.computeMessageSize(6, (InMenus)this.location_);
      }

      if (this.locationCase_ == 7) {
         var1 += CodedOutputStream.computeMessageSize(7, (InLauncher)this.location_);
      }

      if (this.locationCase_ == 8) {
         var1 += CodedOutputStream.computeMessageSize(8, (HostedWorld)this.location_);
      }

      if (this.locationCase_ == 9) {
         var1 += CodedOutputStream.computeMessageSize(9, (ReplayWorld)this.location_);
      }

      if (this.locationCase_ == 10) {
         var1 += CodedOutputStream.computeMessageSize(10, (InGame)this.location_);
      }

      if (this.locationCase_ == 11) {
         var1 += CodedOutputStream.computeMessageSize(11, (RewindWorld)this.location_);
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

      if (!(var1 instanceof Location)) {
         return super.equals(var1);
      }

      Location var2 = (Location)var1;
      if (!this.getLocationCase().equals(var2.getLocationCase())) {
         return false;
      }

      switch (this.locationCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getPublicServer().equals(var2.getPublicServer())) {
               return false;
            }
            break;
         case 2:
            if (!this.getPrivateServer().equals(var2.getPrivateServer())) {
               return false;
            }
            break;
         case 3:
            if (!this.getLocalServer().equals(var2.getLocalServer())) {
               return false;
            }
            break;
         case 4:
            if (!this.getSinglePlayer().equals(var2.getSinglePlayer())) {
               return false;
            }
            break;
         case 5:
            if (!this.getMinecraftRealms().equals(var2.getMinecraftRealms())) {
               return false;
            }
            break;
         case 6:
            if (!this.getInMenus().equals(var2.getInMenus())) {
               return false;
            }
            break;
         case 7:
            if (!this.getInLauncher().equals(var2.getInLauncher())) {
               return false;
            }
            break;
         case 8:
            if (!this.getHostedWorld().equals(var2.getHostedWorld())) {
               return false;
            }
            break;
         case 9:
            if (!this.getReplayWorld().equals(var2.getReplayWorld())) {
               return false;
            }
            break;
         case 10:
            if (!this.getInGame().equals(var2.getInGame())) {
               return false;
            }
            break;
         case 11:
            if (!this.getRewindWorld().equals(var2.getRewindWorld())) {
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
      switch (this.locationCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getPublicServer().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getPrivateServer().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getLocalServer().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getSinglePlayer().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getMinecraftRealms().hashCode();
            break;
         case 6:
            var1 = 37 * var1 + 6;
            var1 = 53 * var1 + this.getInMenus().hashCode();
            break;
         case 7:
            var1 = 37 * var1 + 7;
            var1 = 53 * var1 + this.getInLauncher().hashCode();
            break;
         case 8:
            var1 = 37 * var1 + 8;
            var1 = 53 * var1 + this.getHostedWorld().hashCode();
            break;
         case 9:
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getReplayWorld().hashCode();
            break;
         case 10:
            var1 = 37 * var1 + 10;
            var1 = 53 * var1 + this.getInGame().hashCode();
            break;
         case 11:
            var1 = 37 * var1 + 11;
            var1 = 53 * var1 + this.getRewindWorld().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Location parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Location parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Location parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Location parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Location parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Location parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Location parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Location parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Location parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Location parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Location parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Location parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Location.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Location.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Location.Builder newBuilder(Location var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Location.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Location.Builder() : new Location.Builder().mergeFrom(this);
   }

   protected Location.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Location.Builder(var1);
   }

   public static Location getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Location> parser() {
      return PARSER;
   }

   @Override
   public Parser<Location> getParserForType() {
      return PARSER;
   }

   public Location getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Location.Builder> implements LocationOrBuilder {
      private int locationCase_ = 0;
      private Object location_;
      private int bitField0_;
      private SingleFieldBuilderV3<PublicServer, PublicServer.Builder, PublicServerOrBuilder> publicServerBuilder_;
      private SingleFieldBuilderV3<PrivateServer, PrivateServer.Builder, PrivateServerOrBuilder> privateServerBuilder_;
      private SingleFieldBuilderV3<LocalServer, LocalServer.Builder, LocalServerOrBuilder> localServerBuilder_;
      private SingleFieldBuilderV3<SinglePlayer, SinglePlayer.Builder, SinglePlayerOrBuilder> singlePlayerBuilder_;
      private SingleFieldBuilderV3<MinecraftRealms, MinecraftRealms.Builder, MinecraftRealmsOrBuilder> minecraftRealmsBuilder_;
      private SingleFieldBuilderV3<InMenus, InMenus.Builder, InMenusOrBuilder> inMenusBuilder_;
      private SingleFieldBuilderV3<InLauncher, InLauncher.Builder, InLauncherOrBuilder> inLauncherBuilder_;
      private SingleFieldBuilderV3<HostedWorld, HostedWorld.Builder, HostedWorldOrBuilder> hostedWorldBuilder_;
      private SingleFieldBuilderV3<ReplayWorld, ReplayWorld.Builder, ReplayWorldOrBuilder> replayWorldBuilder_;
      private SingleFieldBuilderV3<InGame, InGame.Builder, InGameOrBuilder> inGameBuilder_;
      private SingleFieldBuilderV3<RewindWorld, RewindWorld.Builder, RewindWorldOrBuilder> rewindWorldBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_Location_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_Location_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Location.class, Location.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Location.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.publicServerBuilder_ != null) {
            this.publicServerBuilder_.clear();
         }

         if (this.privateServerBuilder_ != null) {
            this.privateServerBuilder_.clear();
         }

         if (this.localServerBuilder_ != null) {
            this.localServerBuilder_.clear();
         }

         if (this.singlePlayerBuilder_ != null) {
            this.singlePlayerBuilder_.clear();
         }

         if (this.minecraftRealmsBuilder_ != null) {
            this.minecraftRealmsBuilder_.clear();
         }

         if (this.inMenusBuilder_ != null) {
            this.inMenusBuilder_.clear();
         }

         if (this.inLauncherBuilder_ != null) {
            this.inLauncherBuilder_.clear();
         }

         if (this.hostedWorldBuilder_ != null) {
            this.hostedWorldBuilder_.clear();
         }

         if (this.replayWorldBuilder_ != null) {
            this.replayWorldBuilder_.clear();
         }

         if (this.inGameBuilder_ != null) {
            this.inGameBuilder_.clear();
         }

         if (this.rewindWorldBuilder_ != null) {
            this.rewindWorldBuilder_.clear();
         }

         this.locationCase_ = 0;
         this.location_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_Location_descriptor;
      }

      public Location getDefaultInstanceForType() {
         return Location.getDefaultInstance();
      }

      public Location build() {
         Location var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Location buildPartial() {
         Location var1 = new Location(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Location var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(Location var1) {
         var1.locationCase_ = this.locationCase_;
         var1.location_ = this.location_;
         if (this.locationCase_ == 1 && this.publicServerBuilder_ != null) {
            var1.location_ = this.publicServerBuilder_.build();
         }

         if (this.locationCase_ == 2 && this.privateServerBuilder_ != null) {
            var1.location_ = this.privateServerBuilder_.build();
         }

         if (this.locationCase_ == 3 && this.localServerBuilder_ != null) {
            var1.location_ = this.localServerBuilder_.build();
         }

         if (this.locationCase_ == 4 && this.singlePlayerBuilder_ != null) {
            var1.location_ = this.singlePlayerBuilder_.build();
         }

         if (this.locationCase_ == 5 && this.minecraftRealmsBuilder_ != null) {
            var1.location_ = this.minecraftRealmsBuilder_.build();
         }

         if (this.locationCase_ == 6 && this.inMenusBuilder_ != null) {
            var1.location_ = this.inMenusBuilder_.build();
         }

         if (this.locationCase_ == 7 && this.inLauncherBuilder_ != null) {
            var1.location_ = this.inLauncherBuilder_.build();
         }

         if (this.locationCase_ == 8 && this.hostedWorldBuilder_ != null) {
            var1.location_ = this.hostedWorldBuilder_.build();
         }

         if (this.locationCase_ == 9 && this.replayWorldBuilder_ != null) {
            var1.location_ = this.replayWorldBuilder_.build();
         }

         if (this.locationCase_ == 10 && this.inGameBuilder_ != null) {
            var1.location_ = this.inGameBuilder_.build();
         }

         if (this.locationCase_ == 11 && this.rewindWorldBuilder_ != null) {
            var1.location_ = this.rewindWorldBuilder_.build();
         }
      }

      public Location.Builder clone() {
         return (Location.Builder)super.clone();
      }

      public Location.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Location.Builder)super.setField(var1, var2);
      }

      public Location.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Location.Builder)super.clearField(var1);
      }

      public Location.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Location.Builder)super.clearOneof(var1);
      }

      public Location.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Location.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Location.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Location.Builder)super.addRepeatedField(var1, var2);
      }

      public Location.Builder mergeFrom(Message var1) {
         if (var1 instanceof Location) {
            return this.mergeFrom((Location)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Location.Builder mergeFrom(Location var1) {
         if (var1 == Location.getDefaultInstance()) {
            return this;
         }

         switch (var1.getLocationCase()) {
            case PUBLIC_SERVER:
               this.mergePublicServer(var1.getPublicServer());
               break;
            case PRIVATE_SERVER:
               this.mergePrivateServer(var1.getPrivateServer());
               break;
            case LOCAL_SERVER:
               this.mergeLocalServer(var1.getLocalServer());
               break;
            case SINGLE_PLAYER:
               this.mergeSinglePlayer(var1.getSinglePlayer());
               break;
            case MINECRAFT_REALMS:
               this.mergeMinecraftRealms(var1.getMinecraftRealms());
               break;
            case IN_MENUS:
               this.mergeInMenus(var1.getInMenus());
               break;
            case IN_LAUNCHER:
               this.mergeInLauncher(var1.getInLauncher());
               break;
            case HOSTED_WORLD:
               this.mergeHostedWorld(var1.getHostedWorld());
               break;
            case REPLAY_WORLD:
               this.mergeReplayWorld(var1.getReplayWorld());
               break;
            case IN_GAME:
               this.mergeInGame(var1.getInGame());
               break;
            case REWIND_WORLD:
               this.mergeRewindWorld(var1.getRewindWorld());
            case LOCATION_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Location.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPublicServerFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getPrivateServerFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocalServerFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getSinglePlayerFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 4;
                     break;
                  case 42:
                     var1.readMessage(this.getMinecraftRealmsFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 5;
                     break;
                  case 50:
                     var1.readMessage(this.getInMenusFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 6;
                     break;
                  case 58:
                     var1.readMessage(this.getInLauncherFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 7;
                     break;
                  case 66:
                     var1.readMessage(this.getHostedWorldFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 8;
                     break;
                  case 74:
                     var1.readMessage(this.getReplayWorldFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 9;
                     break;
                  case 82:
                     var1.readMessage(this.getInGameFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 10;
                     break;
                  case 90:
                     var1.readMessage(this.getRewindWorldFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 11;
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
      public Location.LocationCase getLocationCase() {
         return Location.LocationCase.forNumber(this.locationCase_);
      }

      public Location.Builder clearLocation() {
         this.locationCase_ = 0;
         this.location_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPublicServer() {
         return this.locationCase_ == 1;
      }

      @Override
      public PublicServer getPublicServer() {
         if (this.publicServerBuilder_ == null) {
            return this.locationCase_ == 1 ? (PublicServer)this.location_ : PublicServer.getDefaultInstance();
         } else {
            return this.locationCase_ == 1 ? this.publicServerBuilder_.getMessage() : PublicServer.getDefaultInstance();
         }
      }

      public Location.Builder setPublicServer(PublicServer var1) {
         if (this.publicServerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.publicServerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 1;
         return this;
      }

      public Location.Builder setPublicServer(PublicServer.Builder var1) {
         if (this.publicServerBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.publicServerBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 1;
         return this;
      }

      public Location.Builder mergePublicServer(PublicServer var1) {
         if (this.publicServerBuilder_ == null) {
            if (this.locationCase_ == 1 && this.location_ != PublicServer.getDefaultInstance()) {
               this.location_ = PublicServer.newBuilder((PublicServer)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 1) {
            this.publicServerBuilder_.mergeFrom(var1);
         } else {
            this.publicServerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 1;
         return this;
      }

      public Location.Builder clearPublicServer() {
         if (this.publicServerBuilder_ == null) {
            if (this.locationCase_ == 1) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 1) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.publicServerBuilder_.clear();
         }

         return this;
      }

      public PublicServer.Builder getPublicServerBuilder() {
         return this.getPublicServerFieldBuilder().getBuilder();
      }

      @Override
      public PublicServerOrBuilder getPublicServerOrBuilder() {
         if (this.locationCase_ == 1 && this.publicServerBuilder_ != null) {
            return this.publicServerBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 1 ? (PublicServer)this.location_ : PublicServer.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<PublicServer, PublicServer.Builder, PublicServerOrBuilder> getPublicServerFieldBuilder() {
         if (this.publicServerBuilder_ == null) {
            if (this.locationCase_ != 1) {
               this.location_ = PublicServer.getDefaultInstance();
            }

            this.publicServerBuilder_ = new SingleFieldBuilderV3<>((PublicServer)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 1;
         this.onChanged();
         return this.publicServerBuilder_;
      }

      @Override
      public boolean hasPrivateServer() {
         return this.locationCase_ == 2;
      }

      @Override
      public PrivateServer getPrivateServer() {
         if (this.privateServerBuilder_ == null) {
            return this.locationCase_ == 2 ? (PrivateServer)this.location_ : PrivateServer.getDefaultInstance();
         } else {
            return this.locationCase_ == 2 ? this.privateServerBuilder_.getMessage() : PrivateServer.getDefaultInstance();
         }
      }

      public Location.Builder setPrivateServer(PrivateServer var1) {
         if (this.privateServerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.privateServerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 2;
         return this;
      }

      public Location.Builder setPrivateServer(PrivateServer.Builder var1) {
         if (this.privateServerBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.privateServerBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 2;
         return this;
      }

      public Location.Builder mergePrivateServer(PrivateServer var1) {
         if (this.privateServerBuilder_ == null) {
            if (this.locationCase_ == 2 && this.location_ != PrivateServer.getDefaultInstance()) {
               this.location_ = PrivateServer.newBuilder((PrivateServer)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 2) {
            this.privateServerBuilder_.mergeFrom(var1);
         } else {
            this.privateServerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 2;
         return this;
      }

      public Location.Builder clearPrivateServer() {
         if (this.privateServerBuilder_ == null) {
            if (this.locationCase_ == 2) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 2) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.privateServerBuilder_.clear();
         }

         return this;
      }

      public PrivateServer.Builder getPrivateServerBuilder() {
         return this.getPrivateServerFieldBuilder().getBuilder();
      }

      @Override
      public PrivateServerOrBuilder getPrivateServerOrBuilder() {
         if (this.locationCase_ == 2 && this.privateServerBuilder_ != null) {
            return this.privateServerBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 2 ? (PrivateServer)this.location_ : PrivateServer.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<PrivateServer, PrivateServer.Builder, PrivateServerOrBuilder> getPrivateServerFieldBuilder() {
         if (this.privateServerBuilder_ == null) {
            if (this.locationCase_ != 2) {
               this.location_ = PrivateServer.getDefaultInstance();
            }

            this.privateServerBuilder_ = new SingleFieldBuilderV3<>((PrivateServer)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 2;
         this.onChanged();
         return this.privateServerBuilder_;
      }

      @Override
      public boolean hasLocalServer() {
         return this.locationCase_ == 3;
      }

      @Override
      public LocalServer getLocalServer() {
         if (this.localServerBuilder_ == null) {
            return this.locationCase_ == 3 ? (LocalServer)this.location_ : LocalServer.getDefaultInstance();
         } else {
            return this.locationCase_ == 3 ? this.localServerBuilder_.getMessage() : LocalServer.getDefaultInstance();
         }
      }

      public Location.Builder setLocalServer(LocalServer var1) {
         if (this.localServerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.localServerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 3;
         return this;
      }

      public Location.Builder setLocalServer(LocalServer.Builder var1) {
         if (this.localServerBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.localServerBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 3;
         return this;
      }

      public Location.Builder mergeLocalServer(LocalServer var1) {
         if (this.localServerBuilder_ == null) {
            if (this.locationCase_ == 3 && this.location_ != LocalServer.getDefaultInstance()) {
               this.location_ = LocalServer.newBuilder((LocalServer)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 3) {
            this.localServerBuilder_.mergeFrom(var1);
         } else {
            this.localServerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 3;
         return this;
      }

      public Location.Builder clearLocalServer() {
         if (this.localServerBuilder_ == null) {
            if (this.locationCase_ == 3) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 3) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.localServerBuilder_.clear();
         }

         return this;
      }

      public LocalServer.Builder getLocalServerBuilder() {
         return this.getLocalServerFieldBuilder().getBuilder();
      }

      @Override
      public LocalServerOrBuilder getLocalServerOrBuilder() {
         if (this.locationCase_ == 3 && this.localServerBuilder_ != null) {
            return this.localServerBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 3 ? (LocalServer)this.location_ : LocalServer.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<LocalServer, LocalServer.Builder, LocalServerOrBuilder> getLocalServerFieldBuilder() {
         if (this.localServerBuilder_ == null) {
            if (this.locationCase_ != 3) {
               this.location_ = LocalServer.getDefaultInstance();
            }

            this.localServerBuilder_ = new SingleFieldBuilderV3<>((LocalServer)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 3;
         this.onChanged();
         return this.localServerBuilder_;
      }

      @Override
      public boolean hasSinglePlayer() {
         return this.locationCase_ == 4;
      }

      @Override
      public SinglePlayer getSinglePlayer() {
         if (this.singlePlayerBuilder_ == null) {
            return this.locationCase_ == 4 ? (SinglePlayer)this.location_ : SinglePlayer.getDefaultInstance();
         } else {
            return this.locationCase_ == 4 ? this.singlePlayerBuilder_.getMessage() : SinglePlayer.getDefaultInstance();
         }
      }

      public Location.Builder setSinglePlayer(SinglePlayer var1) {
         if (this.singlePlayerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.singlePlayerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 4;
         return this;
      }

      public Location.Builder setSinglePlayer(SinglePlayer.Builder var1) {
         if (this.singlePlayerBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.singlePlayerBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 4;
         return this;
      }

      public Location.Builder mergeSinglePlayer(SinglePlayer var1) {
         if (this.singlePlayerBuilder_ == null) {
            if (this.locationCase_ == 4 && this.location_ != SinglePlayer.getDefaultInstance()) {
               this.location_ = SinglePlayer.newBuilder((SinglePlayer)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 4) {
            this.singlePlayerBuilder_.mergeFrom(var1);
         } else {
            this.singlePlayerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 4;
         return this;
      }

      public Location.Builder clearSinglePlayer() {
         if (this.singlePlayerBuilder_ == null) {
            if (this.locationCase_ == 4) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 4) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.singlePlayerBuilder_.clear();
         }

         return this;
      }

      public SinglePlayer.Builder getSinglePlayerBuilder() {
         return this.getSinglePlayerFieldBuilder().getBuilder();
      }

      @Override
      public SinglePlayerOrBuilder getSinglePlayerOrBuilder() {
         if (this.locationCase_ == 4 && this.singlePlayerBuilder_ != null) {
            return this.singlePlayerBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 4 ? (SinglePlayer)this.location_ : SinglePlayer.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SinglePlayer, SinglePlayer.Builder, SinglePlayerOrBuilder> getSinglePlayerFieldBuilder() {
         if (this.singlePlayerBuilder_ == null) {
            if (this.locationCase_ != 4) {
               this.location_ = SinglePlayer.getDefaultInstance();
            }

            this.singlePlayerBuilder_ = new SingleFieldBuilderV3<>((SinglePlayer)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 4;
         this.onChanged();
         return this.singlePlayerBuilder_;
      }

      @Override
      public boolean hasMinecraftRealms() {
         return this.locationCase_ == 5;
      }

      @Override
      public MinecraftRealms getMinecraftRealms() {
         if (this.minecraftRealmsBuilder_ == null) {
            return this.locationCase_ == 5 ? (MinecraftRealms)this.location_ : MinecraftRealms.getDefaultInstance();
         } else {
            return this.locationCase_ == 5 ? this.minecraftRealmsBuilder_.getMessage() : MinecraftRealms.getDefaultInstance();
         }
      }

      public Location.Builder setMinecraftRealms(MinecraftRealms var1) {
         if (this.minecraftRealmsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.minecraftRealmsBuilder_.setMessage(var1);
         }

         this.locationCase_ = 5;
         return this;
      }

      public Location.Builder setMinecraftRealms(MinecraftRealms.Builder var1) {
         if (this.minecraftRealmsBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.minecraftRealmsBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 5;
         return this;
      }

      public Location.Builder mergeMinecraftRealms(MinecraftRealms var1) {
         if (this.minecraftRealmsBuilder_ == null) {
            if (this.locationCase_ == 5 && this.location_ != MinecraftRealms.getDefaultInstance()) {
               this.location_ = MinecraftRealms.newBuilder((MinecraftRealms)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 5) {
            this.minecraftRealmsBuilder_.mergeFrom(var1);
         } else {
            this.minecraftRealmsBuilder_.setMessage(var1);
         }

         this.locationCase_ = 5;
         return this;
      }

      public Location.Builder clearMinecraftRealms() {
         if (this.minecraftRealmsBuilder_ == null) {
            if (this.locationCase_ == 5) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 5) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.minecraftRealmsBuilder_.clear();
         }

         return this;
      }

      public MinecraftRealms.Builder getMinecraftRealmsBuilder() {
         return this.getMinecraftRealmsFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftRealmsOrBuilder getMinecraftRealmsOrBuilder() {
         if (this.locationCase_ == 5 && this.minecraftRealmsBuilder_ != null) {
            return this.minecraftRealmsBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 5 ? (MinecraftRealms)this.location_ : MinecraftRealms.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<MinecraftRealms, MinecraftRealms.Builder, MinecraftRealmsOrBuilder> getMinecraftRealmsFieldBuilder() {
         if (this.minecraftRealmsBuilder_ == null) {
            if (this.locationCase_ != 5) {
               this.location_ = MinecraftRealms.getDefaultInstance();
            }

            this.minecraftRealmsBuilder_ = new SingleFieldBuilderV3<>((MinecraftRealms)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 5;
         this.onChanged();
         return this.minecraftRealmsBuilder_;
      }

      @Override
      public boolean hasInMenus() {
         return this.locationCase_ == 6;
      }

      @Override
      public InMenus getInMenus() {
         if (this.inMenusBuilder_ == null) {
            return this.locationCase_ == 6 ? (InMenus)this.location_ : InMenus.getDefaultInstance();
         } else {
            return this.locationCase_ == 6 ? this.inMenusBuilder_.getMessage() : InMenus.getDefaultInstance();
         }
      }

      public Location.Builder setInMenus(InMenus var1) {
         if (this.inMenusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.inMenusBuilder_.setMessage(var1);
         }

         this.locationCase_ = 6;
         return this;
      }

      public Location.Builder setInMenus(InMenus.Builder var1) {
         if (this.inMenusBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.inMenusBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 6;
         return this;
      }

      public Location.Builder mergeInMenus(InMenus var1) {
         if (this.inMenusBuilder_ == null) {
            if (this.locationCase_ == 6 && this.location_ != InMenus.getDefaultInstance()) {
               this.location_ = InMenus.newBuilder((InMenus)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 6) {
            this.inMenusBuilder_.mergeFrom(var1);
         } else {
            this.inMenusBuilder_.setMessage(var1);
         }

         this.locationCase_ = 6;
         return this;
      }

      public Location.Builder clearInMenus() {
         if (this.inMenusBuilder_ == null) {
            if (this.locationCase_ == 6) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 6) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.inMenusBuilder_.clear();
         }

         return this;
      }

      public InMenus.Builder getInMenusBuilder() {
         return this.getInMenusFieldBuilder().getBuilder();
      }

      @Override
      public InMenusOrBuilder getInMenusOrBuilder() {
         if (this.locationCase_ == 6 && this.inMenusBuilder_ != null) {
            return this.inMenusBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 6 ? (InMenus)this.location_ : InMenus.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InMenus, InMenus.Builder, InMenusOrBuilder> getInMenusFieldBuilder() {
         if (this.inMenusBuilder_ == null) {
            if (this.locationCase_ != 6) {
               this.location_ = InMenus.getDefaultInstance();
            }

            this.inMenusBuilder_ = new SingleFieldBuilderV3<>((InMenus)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 6;
         this.onChanged();
         return this.inMenusBuilder_;
      }

      @Override
      public boolean hasInLauncher() {
         return this.locationCase_ == 7;
      }

      @Override
      public InLauncher getInLauncher() {
         if (this.inLauncherBuilder_ == null) {
            return this.locationCase_ == 7 ? (InLauncher)this.location_ : InLauncher.getDefaultInstance();
         } else {
            return this.locationCase_ == 7 ? this.inLauncherBuilder_.getMessage() : InLauncher.getDefaultInstance();
         }
      }

      public Location.Builder setInLauncher(InLauncher var1) {
         if (this.inLauncherBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.inLauncherBuilder_.setMessage(var1);
         }

         this.locationCase_ = 7;
         return this;
      }

      public Location.Builder setInLauncher(InLauncher.Builder var1) {
         if (this.inLauncherBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.inLauncherBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 7;
         return this;
      }

      public Location.Builder mergeInLauncher(InLauncher var1) {
         if (this.inLauncherBuilder_ == null) {
            if (this.locationCase_ == 7 && this.location_ != InLauncher.getDefaultInstance()) {
               this.location_ = InLauncher.newBuilder((InLauncher)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 7) {
            this.inLauncherBuilder_.mergeFrom(var1);
         } else {
            this.inLauncherBuilder_.setMessage(var1);
         }

         this.locationCase_ = 7;
         return this;
      }

      public Location.Builder clearInLauncher() {
         if (this.inLauncherBuilder_ == null) {
            if (this.locationCase_ == 7) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 7) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.inLauncherBuilder_.clear();
         }

         return this;
      }

      public InLauncher.Builder getInLauncherBuilder() {
         return this.getInLauncherFieldBuilder().getBuilder();
      }

      @Override
      public InLauncherOrBuilder getInLauncherOrBuilder() {
         if (this.locationCase_ == 7 && this.inLauncherBuilder_ != null) {
            return this.inLauncherBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 7 ? (InLauncher)this.location_ : InLauncher.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InLauncher, InLauncher.Builder, InLauncherOrBuilder> getInLauncherFieldBuilder() {
         if (this.inLauncherBuilder_ == null) {
            if (this.locationCase_ != 7) {
               this.location_ = InLauncher.getDefaultInstance();
            }

            this.inLauncherBuilder_ = new SingleFieldBuilderV3<>((InLauncher)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 7;
         this.onChanged();
         return this.inLauncherBuilder_;
      }

      @Override
      public boolean hasHostedWorld() {
         return this.locationCase_ == 8;
      }

      @Override
      public HostedWorld getHostedWorld() {
         if (this.hostedWorldBuilder_ == null) {
            return this.locationCase_ == 8 ? (HostedWorld)this.location_ : HostedWorld.getDefaultInstance();
         } else {
            return this.locationCase_ == 8 ? this.hostedWorldBuilder_.getMessage() : HostedWorld.getDefaultInstance();
         }
      }

      public Location.Builder setHostedWorld(HostedWorld var1) {
         if (this.hostedWorldBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.hostedWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 8;
         return this;
      }

      public Location.Builder setHostedWorld(HostedWorld.Builder var1) {
         if (this.hostedWorldBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.hostedWorldBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 8;
         return this;
      }

      public Location.Builder mergeHostedWorld(HostedWorld var1) {
         if (this.hostedWorldBuilder_ == null) {
            if (this.locationCase_ == 8 && this.location_ != HostedWorld.getDefaultInstance()) {
               this.location_ = HostedWorld.newBuilder((HostedWorld)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 8) {
            this.hostedWorldBuilder_.mergeFrom(var1);
         } else {
            this.hostedWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 8;
         return this;
      }

      public Location.Builder clearHostedWorld() {
         if (this.hostedWorldBuilder_ == null) {
            if (this.locationCase_ == 8) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 8) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.hostedWorldBuilder_.clear();
         }

         return this;
      }

      public HostedWorld.Builder getHostedWorldBuilder() {
         return this.getHostedWorldFieldBuilder().getBuilder();
      }

      @Override
      public HostedWorldOrBuilder getHostedWorldOrBuilder() {
         if (this.locationCase_ == 8 && this.hostedWorldBuilder_ != null) {
            return this.hostedWorldBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 8 ? (HostedWorld)this.location_ : HostedWorld.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<HostedWorld, HostedWorld.Builder, HostedWorldOrBuilder> getHostedWorldFieldBuilder() {
         if (this.hostedWorldBuilder_ == null) {
            if (this.locationCase_ != 8) {
               this.location_ = HostedWorld.getDefaultInstance();
            }

            this.hostedWorldBuilder_ = new SingleFieldBuilderV3<>((HostedWorld)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 8;
         this.onChanged();
         return this.hostedWorldBuilder_;
      }

      @Override
      public boolean hasReplayWorld() {
         return this.locationCase_ == 9;
      }

      @Override
      public ReplayWorld getReplayWorld() {
         if (this.replayWorldBuilder_ == null) {
            return this.locationCase_ == 9 ? (ReplayWorld)this.location_ : ReplayWorld.getDefaultInstance();
         } else {
            return this.locationCase_ == 9 ? this.replayWorldBuilder_.getMessage() : ReplayWorld.getDefaultInstance();
         }
      }

      public Location.Builder setReplayWorld(ReplayWorld var1) {
         if (this.replayWorldBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.replayWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 9;
         return this;
      }

      public Location.Builder setReplayWorld(ReplayWorld.Builder var1) {
         if (this.replayWorldBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.replayWorldBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 9;
         return this;
      }

      public Location.Builder mergeReplayWorld(ReplayWorld var1) {
         if (this.replayWorldBuilder_ == null) {
            if (this.locationCase_ == 9 && this.location_ != ReplayWorld.getDefaultInstance()) {
               this.location_ = ReplayWorld.newBuilder((ReplayWorld)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 9) {
            this.replayWorldBuilder_.mergeFrom(var1);
         } else {
            this.replayWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 9;
         return this;
      }

      public Location.Builder clearReplayWorld() {
         if (this.replayWorldBuilder_ == null) {
            if (this.locationCase_ == 9) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 9) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.replayWorldBuilder_.clear();
         }

         return this;
      }

      public ReplayWorld.Builder getReplayWorldBuilder() {
         return this.getReplayWorldFieldBuilder().getBuilder();
      }

      @Override
      public ReplayWorldOrBuilder getReplayWorldOrBuilder() {
         if (this.locationCase_ == 9 && this.replayWorldBuilder_ != null) {
            return this.replayWorldBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 9 ? (ReplayWorld)this.location_ : ReplayWorld.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<ReplayWorld, ReplayWorld.Builder, ReplayWorldOrBuilder> getReplayWorldFieldBuilder() {
         if (this.replayWorldBuilder_ == null) {
            if (this.locationCase_ != 9) {
               this.location_ = ReplayWorld.getDefaultInstance();
            }

            this.replayWorldBuilder_ = new SingleFieldBuilderV3<>((ReplayWorld)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 9;
         this.onChanged();
         return this.replayWorldBuilder_;
      }

      @Override
      public boolean hasInGame() {
         return this.locationCase_ == 10;
      }

      @Override
      public InGame getInGame() {
         if (this.inGameBuilder_ == null) {
            return this.locationCase_ == 10 ? (InGame)this.location_ : InGame.getDefaultInstance();
         } else {
            return this.locationCase_ == 10 ? this.inGameBuilder_.getMessage() : InGame.getDefaultInstance();
         }
      }

      public Location.Builder setInGame(InGame var1) {
         if (this.inGameBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.inGameBuilder_.setMessage(var1);
         }

         this.locationCase_ = 10;
         return this;
      }

      public Location.Builder setInGame(InGame.Builder var1) {
         if (this.inGameBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.inGameBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 10;
         return this;
      }

      public Location.Builder mergeInGame(InGame var1) {
         if (this.inGameBuilder_ == null) {
            if (this.locationCase_ == 10 && this.location_ != InGame.getDefaultInstance()) {
               this.location_ = InGame.newBuilder((InGame)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 10) {
            this.inGameBuilder_.mergeFrom(var1);
         } else {
            this.inGameBuilder_.setMessage(var1);
         }

         this.locationCase_ = 10;
         return this;
      }

      public Location.Builder clearInGame() {
         if (this.inGameBuilder_ == null) {
            if (this.locationCase_ == 10) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 10) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.inGameBuilder_.clear();
         }

         return this;
      }

      public InGame.Builder getInGameBuilder() {
         return this.getInGameFieldBuilder().getBuilder();
      }

      @Override
      public InGameOrBuilder getInGameOrBuilder() {
         if (this.locationCase_ == 10 && this.inGameBuilder_ != null) {
            return this.inGameBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 10 ? (InGame)this.location_ : InGame.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InGame, InGame.Builder, InGameOrBuilder> getInGameFieldBuilder() {
         if (this.inGameBuilder_ == null) {
            if (this.locationCase_ != 10) {
               this.location_ = InGame.getDefaultInstance();
            }

            this.inGameBuilder_ = new SingleFieldBuilderV3<>((InGame)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 10;
         this.onChanged();
         return this.inGameBuilder_;
      }

      @Override
      public boolean hasRewindWorld() {
         return this.locationCase_ == 11;
      }

      @Override
      public RewindWorld getRewindWorld() {
         if (this.rewindWorldBuilder_ == null) {
            return this.locationCase_ == 11 ? (RewindWorld)this.location_ : RewindWorld.getDefaultInstance();
         } else {
            return this.locationCase_ == 11 ? this.rewindWorldBuilder_.getMessage() : RewindWorld.getDefaultInstance();
         }
      }

      public Location.Builder setRewindWorld(RewindWorld var1) {
         if (this.rewindWorldBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.rewindWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 11;
         return this;
      }

      public Location.Builder setRewindWorld(RewindWorld.Builder var1) {
         if (this.rewindWorldBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.rewindWorldBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 11;
         return this;
      }

      public Location.Builder mergeRewindWorld(RewindWorld var1) {
         if (this.rewindWorldBuilder_ == null) {
            if (this.locationCase_ == 11 && this.location_ != RewindWorld.getDefaultInstance()) {
               this.location_ = RewindWorld.newBuilder((RewindWorld)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 11) {
            this.rewindWorldBuilder_.mergeFrom(var1);
         } else {
            this.rewindWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 11;
         return this;
      }

      public Location.Builder clearRewindWorld() {
         if (this.rewindWorldBuilder_ == null) {
            if (this.locationCase_ == 11) {
               this.locationCase_ = 0;
               this.location_ = null;
               this.onChanged();
            }
         } else {
            if (this.locationCase_ == 11) {
               this.locationCase_ = 0;
               this.location_ = null;
            }

            this.rewindWorldBuilder_.clear();
         }

         return this;
      }

      public RewindWorld.Builder getRewindWorldBuilder() {
         return this.getRewindWorldFieldBuilder().getBuilder();
      }

      @Override
      public RewindWorldOrBuilder getRewindWorldOrBuilder() {
         if (this.locationCase_ == 11 && this.rewindWorldBuilder_ != null) {
            return this.rewindWorldBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 11 ? (RewindWorld)this.location_ : RewindWorld.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<RewindWorld, RewindWorld.Builder, RewindWorldOrBuilder> getRewindWorldFieldBuilder() {
         if (this.rewindWorldBuilder_ == null) {
            if (this.locationCase_ != 11) {
               this.location_ = RewindWorld.getDefaultInstance();
            }

            this.rewindWorldBuilder_ = new SingleFieldBuilderV3<>((RewindWorld)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 11;
         this.onChanged();
         return this.rewindWorldBuilder_;
      }

      public final Location.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Location.Builder)super.setUnknownFields(var1);
      }

      public final Location.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Location.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum LocationCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      PUBLIC_SERVER(1),
      PRIVATE_SERVER(2),
      LOCAL_SERVER(3),
      SINGLE_PLAYER(4),
      MINECRAFT_REALMS(5),
      IN_MENUS(6),
      IN_LAUNCHER(7),
      HOSTED_WORLD(8),
      REPLAY_WORLD(9),
      IN_GAME(10),
      REWIND_WORLD(11),
      LOCATION_NOT_SET(0);

      private final int value;

      LocationCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Location.LocationCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Location.LocationCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return LOCATION_NOT_SET;
            case 1:
               return PUBLIC_SERVER;
            case 2:
               return PRIVATE_SERVER;
            case 3:
               return LOCAL_SERVER;
            case 4:
               return SINGLE_PLAYER;
            case 5:
               return MINECRAFT_REALMS;
            case 6:
               return IN_MENUS;
            case 7:
               return IN_LAUNCHER;
            case 8:
               return HOSTED_WORLD;
            case 9:
               return REPLAY_WORLD;
            case 10:
               return IN_GAME;
            case 11:
               return REWIND_WORLD;
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
