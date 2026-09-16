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

public final class InboundLocation extends GeneratedMessageV3 implements InboundLocationOrBuilder {
   private static final long serialVersionUID = 0L;
   private int locationCase_ = 0;
   private Object location_;
   public static final int SERVER_FIELD_NUMBER = 1;
   public static final int SINGLE_PLAYER_FIELD_NUMBER = 2;
   public static final int MINECRAFT_REALMS_FIELD_NUMBER = 3;
   public static final int IN_MENUS_FIELD_NUMBER = 4;
   public static final int IN_LAUNCHER_FIELD_NUMBER = 5;
   public static final int HOSTED_WORLD_FIELD_NUMBER = 6;
   public static final int REPLAY_WORLD_FIELD_NUMBER = 7;
   public static final int IN_GAME_FIELD_NUMBER = 8;
   public static final int REWIND_WORLD_FIELD_NUMBER = 9;
   private byte memoizedIsInitialized = -1;
   private static final InboundLocation DEFAULT_INSTANCE = new InboundLocation();
   private static final Parser<InboundLocation> PARSER = new AbstractParser<InboundLocation>() {
      public InboundLocation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundLocation.Builder var3 = InboundLocation.newBuilder();

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

   private InboundLocation(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundLocation() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundLocation();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundLocation_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundLocation_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundLocation.class, InboundLocation.Builder.class);
   }

   @Override
   public InboundLocation.LocationCase getLocationCase() {
      return InboundLocation.LocationCase.forNumber(this.locationCase_);
   }

   @Override
   public boolean hasServer() {
      return this.locationCase_ == 1;
   }

   @Override
   public InboundServer getServer() {
      return this.locationCase_ == 1 ? (InboundServer)this.location_ : InboundServer.getDefaultInstance();
   }

   @Override
   public InboundServerOrBuilder getServerOrBuilder() {
      return this.locationCase_ == 1 ? (InboundServer)this.location_ : InboundServer.getDefaultInstance();
   }

   @Override
   public boolean hasSinglePlayer() {
      return this.locationCase_ == 2;
   }

   @Override
   public InboundSinglePlayer getSinglePlayer() {
      return this.locationCase_ == 2 ? (InboundSinglePlayer)this.location_ : InboundSinglePlayer.getDefaultInstance();
   }

   @Override
   public InboundSinglePlayerOrBuilder getSinglePlayerOrBuilder() {
      return this.locationCase_ == 2 ? (InboundSinglePlayer)this.location_ : InboundSinglePlayer.getDefaultInstance();
   }

   @Override
   public boolean hasMinecraftRealms() {
      return this.locationCase_ == 3;
   }

   @Override
   public InboundMinecraftRealms getMinecraftRealms() {
      return this.locationCase_ == 3 ? (InboundMinecraftRealms)this.location_ : InboundMinecraftRealms.getDefaultInstance();
   }

   @Override
   public InboundMinecraftRealmsOrBuilder getMinecraftRealmsOrBuilder() {
      return this.locationCase_ == 3 ? (InboundMinecraftRealms)this.location_ : InboundMinecraftRealms.getDefaultInstance();
   }

   @Override
   public boolean hasInMenus() {
      return this.locationCase_ == 4;
   }

   @Override
   public InboundInMenus getInMenus() {
      return this.locationCase_ == 4 ? (InboundInMenus)this.location_ : InboundInMenus.getDefaultInstance();
   }

   @Override
   public InboundInMenusOrBuilder getInMenusOrBuilder() {
      return this.locationCase_ == 4 ? (InboundInMenus)this.location_ : InboundInMenus.getDefaultInstance();
   }

   @Override
   public boolean hasInLauncher() {
      return this.locationCase_ == 5;
   }

   @Override
   public InboundInLauncher getInLauncher() {
      return this.locationCase_ == 5 ? (InboundInLauncher)this.location_ : InboundInLauncher.getDefaultInstance();
   }

   @Override
   public InboundInLauncherOrBuilder getInLauncherOrBuilder() {
      return this.locationCase_ == 5 ? (InboundInLauncher)this.location_ : InboundInLauncher.getDefaultInstance();
   }

   @Override
   public boolean hasHostedWorld() {
      return this.locationCase_ == 6;
   }

   @Override
   public InboundHostedWorld getHostedWorld() {
      return this.locationCase_ == 6 ? (InboundHostedWorld)this.location_ : InboundHostedWorld.getDefaultInstance();
   }

   @Override
   public InboundHostedWorldOrBuilder getHostedWorldOrBuilder() {
      return this.locationCase_ == 6 ? (InboundHostedWorld)this.location_ : InboundHostedWorld.getDefaultInstance();
   }

   @Override
   public boolean hasReplayWorld() {
      return this.locationCase_ == 7;
   }

   @Override
   public InboundReplayWorld getReplayWorld() {
      return this.locationCase_ == 7 ? (InboundReplayWorld)this.location_ : InboundReplayWorld.getDefaultInstance();
   }

   @Override
   public InboundReplayWorldOrBuilder getReplayWorldOrBuilder() {
      return this.locationCase_ == 7 ? (InboundReplayWorld)this.location_ : InboundReplayWorld.getDefaultInstance();
   }

   @Override
   public boolean hasInGame() {
      return this.locationCase_ == 8;
   }

   @Override
   public InboundInGame getInGame() {
      return this.locationCase_ == 8 ? (InboundInGame)this.location_ : InboundInGame.getDefaultInstance();
   }

   @Override
   public InboundInGameOrBuilder getInGameOrBuilder() {
      return this.locationCase_ == 8 ? (InboundInGame)this.location_ : InboundInGame.getDefaultInstance();
   }

   @Override
   public boolean hasRewindWorld() {
      return this.locationCase_ == 9;
   }

   @Override
   public InboundRewindWorld getRewindWorld() {
      return this.locationCase_ == 9 ? (InboundRewindWorld)this.location_ : InboundRewindWorld.getDefaultInstance();
   }

   @Override
   public InboundRewindWorldOrBuilder getRewindWorldOrBuilder() {
      return this.locationCase_ == 9 ? (InboundRewindWorld)this.location_ : InboundRewindWorld.getDefaultInstance();
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
         var1.writeMessage(1, (InboundServer)this.location_);
      }

      if (this.locationCase_ == 2) {
         var1.writeMessage(2, (InboundSinglePlayer)this.location_);
      }

      if (this.locationCase_ == 3) {
         var1.writeMessage(3, (InboundMinecraftRealms)this.location_);
      }

      if (this.locationCase_ == 4) {
         var1.writeMessage(4, (InboundInMenus)this.location_);
      }

      if (this.locationCase_ == 5) {
         var1.writeMessage(5, (InboundInLauncher)this.location_);
      }

      if (this.locationCase_ == 6) {
         var1.writeMessage(6, (InboundHostedWorld)this.location_);
      }

      if (this.locationCase_ == 7) {
         var1.writeMessage(7, (InboundReplayWorld)this.location_);
      }

      if (this.locationCase_ == 8) {
         var1.writeMessage(8, (InboundInGame)this.location_);
      }

      if (this.locationCase_ == 9) {
         var1.writeMessage(9, (InboundRewindWorld)this.location_);
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
         var1 += CodedOutputStream.computeMessageSize(1, (InboundServer)this.location_);
      }

      if (this.locationCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (InboundSinglePlayer)this.location_);
      }

      if (this.locationCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (InboundMinecraftRealms)this.location_);
      }

      if (this.locationCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (InboundInMenus)this.location_);
      }

      if (this.locationCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (InboundInLauncher)this.location_);
      }

      if (this.locationCase_ == 6) {
         var1 += CodedOutputStream.computeMessageSize(6, (InboundHostedWorld)this.location_);
      }

      if (this.locationCase_ == 7) {
         var1 += CodedOutputStream.computeMessageSize(7, (InboundReplayWorld)this.location_);
      }

      if (this.locationCase_ == 8) {
         var1 += CodedOutputStream.computeMessageSize(8, (InboundInGame)this.location_);
      }

      if (this.locationCase_ == 9) {
         var1 += CodedOutputStream.computeMessageSize(9, (InboundRewindWorld)this.location_);
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

      if (!(var1 instanceof InboundLocation)) {
         return super.equals(var1);
      }

      InboundLocation var2 = (InboundLocation)var1;
      if (!this.getLocationCase().equals(var2.getLocationCase())) {
         return false;
      }

      switch (this.locationCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getServer().equals(var2.getServer())) {
               return false;
            }
            break;
         case 2:
            if (!this.getSinglePlayer().equals(var2.getSinglePlayer())) {
               return false;
            }
            break;
         case 3:
            if (!this.getMinecraftRealms().equals(var2.getMinecraftRealms())) {
               return false;
            }
            break;
         case 4:
            if (!this.getInMenus().equals(var2.getInMenus())) {
               return false;
            }
            break;
         case 5:
            if (!this.getInLauncher().equals(var2.getInLauncher())) {
               return false;
            }
            break;
         case 6:
            if (!this.getHostedWorld().equals(var2.getHostedWorld())) {
               return false;
            }
            break;
         case 7:
            if (!this.getReplayWorld().equals(var2.getReplayWorld())) {
               return false;
            }
            break;
         case 8:
            if (!this.getInGame().equals(var2.getInGame())) {
               return false;
            }
            break;
         case 9:
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
            var1 = 53 * var1 + this.getServer().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getSinglePlayer().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getMinecraftRealms().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getInMenus().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getInLauncher().hashCode();
            break;
         case 6:
            var1 = 37 * var1 + 6;
            var1 = 53 * var1 + this.getHostedWorld().hashCode();
            break;
         case 7:
            var1 = 37 * var1 + 7;
            var1 = 53 * var1 + this.getReplayWorld().hashCode();
            break;
         case 8:
            var1 = 37 * var1 + 8;
            var1 = 53 * var1 + this.getInGame().hashCode();
            break;
         case 9:
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getRewindWorld().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundLocation parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundLocation parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundLocation parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundLocation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundLocation parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundLocation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundLocation parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundLocation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundLocation parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundLocation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundLocation parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundLocation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundLocation.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundLocation.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundLocation.Builder newBuilder(InboundLocation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundLocation.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundLocation.Builder() : new InboundLocation.Builder().mergeFrom(this);
   }

   protected InboundLocation.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundLocation.Builder(var1);
   }

   public static InboundLocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundLocation> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundLocation> getParserForType() {
      return PARSER;
   }

   public InboundLocation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundLocation.Builder> implements InboundLocationOrBuilder {
      private int locationCase_ = 0;
      private Object location_;
      private int bitField0_;
      private SingleFieldBuilderV3<InboundServer, InboundServer.Builder, InboundServerOrBuilder> serverBuilder_;
      private SingleFieldBuilderV3<InboundSinglePlayer, InboundSinglePlayer.Builder, InboundSinglePlayerOrBuilder> singlePlayerBuilder_;
      private SingleFieldBuilderV3<InboundMinecraftRealms, InboundMinecraftRealms.Builder, InboundMinecraftRealmsOrBuilder> minecraftRealmsBuilder_;
      private SingleFieldBuilderV3<InboundInMenus, InboundInMenus.Builder, InboundInMenusOrBuilder> inMenusBuilder_;
      private SingleFieldBuilderV3<InboundInLauncher, InboundInLauncher.Builder, InboundInLauncherOrBuilder> inLauncherBuilder_;
      private SingleFieldBuilderV3<InboundHostedWorld, InboundHostedWorld.Builder, InboundHostedWorldOrBuilder> hostedWorldBuilder_;
      private SingleFieldBuilderV3<InboundReplayWorld, InboundReplayWorld.Builder, InboundReplayWorldOrBuilder> replayWorldBuilder_;
      private SingleFieldBuilderV3<InboundInGame, InboundInGame.Builder, InboundInGameOrBuilder> inGameBuilder_;
      private SingleFieldBuilderV3<InboundRewindWorld, InboundRewindWorld.Builder, InboundRewindWorldOrBuilder> rewindWorldBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundLocation_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundLocation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundLocation.class, InboundLocation.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundLocation.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.serverBuilder_ != null) {
            this.serverBuilder_.clear();
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
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundLocation_descriptor;
      }

      public InboundLocation getDefaultInstanceForType() {
         return InboundLocation.getDefaultInstance();
      }

      public InboundLocation build() {
         InboundLocation var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundLocation buildPartial() {
         InboundLocation var1 = new InboundLocation(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundLocation var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(InboundLocation var1) {
         var1.locationCase_ = this.locationCase_;
         var1.location_ = this.location_;
         if (this.locationCase_ == 1 && this.serverBuilder_ != null) {
            var1.location_ = this.serverBuilder_.build();
         }

         if (this.locationCase_ == 2 && this.singlePlayerBuilder_ != null) {
            var1.location_ = this.singlePlayerBuilder_.build();
         }

         if (this.locationCase_ == 3 && this.minecraftRealmsBuilder_ != null) {
            var1.location_ = this.minecraftRealmsBuilder_.build();
         }

         if (this.locationCase_ == 4 && this.inMenusBuilder_ != null) {
            var1.location_ = this.inMenusBuilder_.build();
         }

         if (this.locationCase_ == 5 && this.inLauncherBuilder_ != null) {
            var1.location_ = this.inLauncherBuilder_.build();
         }

         if (this.locationCase_ == 6 && this.hostedWorldBuilder_ != null) {
            var1.location_ = this.hostedWorldBuilder_.build();
         }

         if (this.locationCase_ == 7 && this.replayWorldBuilder_ != null) {
            var1.location_ = this.replayWorldBuilder_.build();
         }

         if (this.locationCase_ == 8 && this.inGameBuilder_ != null) {
            var1.location_ = this.inGameBuilder_.build();
         }

         if (this.locationCase_ == 9 && this.rewindWorldBuilder_ != null) {
            var1.location_ = this.rewindWorldBuilder_.build();
         }
      }

      public InboundLocation.Builder clone() {
         return (InboundLocation.Builder)super.clone();
      }

      public InboundLocation.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundLocation.Builder)super.setField(var1, var2);
      }

      public InboundLocation.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundLocation.Builder)super.clearField(var1);
      }

      public InboundLocation.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundLocation.Builder)super.clearOneof(var1);
      }

      public InboundLocation.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundLocation.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundLocation.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundLocation.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundLocation.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundLocation) {
            return this.mergeFrom((InboundLocation)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundLocation.Builder mergeFrom(InboundLocation var1) {
         if (var1 == InboundLocation.getDefaultInstance()) {
            return this;
         }

         switch (var1.getLocationCase()) {
            case SERVER:
               this.mergeServer(var1.getServer());
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

      public InboundLocation.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getServerFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSinglePlayerFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getMinecraftRealmsFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getInMenusFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 4;
                     break;
                  case 42:
                     var1.readMessage(this.getInLauncherFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 5;
                     break;
                  case 50:
                     var1.readMessage(this.getHostedWorldFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 6;
                     break;
                  case 58:
                     var1.readMessage(this.getReplayWorldFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 7;
                     break;
                  case 66:
                     var1.readMessage(this.getInGameFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 8;
                     break;
                  case 74:
                     var1.readMessage(this.getRewindWorldFieldBuilder().getBuilder(), var2);
                     this.locationCase_ = 9;
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
      public InboundLocation.LocationCase getLocationCase() {
         return InboundLocation.LocationCase.forNumber(this.locationCase_);
      }

      public InboundLocation.Builder clearLocation() {
         this.locationCase_ = 0;
         this.location_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasServer() {
         return this.locationCase_ == 1;
      }

      @Override
      public InboundServer getServer() {
         if (this.serverBuilder_ == null) {
            return this.locationCase_ == 1 ? (InboundServer)this.location_ : InboundServer.getDefaultInstance();
         } else {
            return this.locationCase_ == 1 ? this.serverBuilder_.getMessage() : InboundServer.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setServer(InboundServer var1) {
         if (this.serverBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.locationCase_ = 1;
         return this;
      }

      public InboundLocation.Builder setServer(InboundServer.Builder var1) {
         if (this.serverBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.serverBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 1;
         return this;
      }

      public InboundLocation.Builder mergeServer(InboundServer var1) {
         if (this.serverBuilder_ == null) {
            if (this.locationCase_ == 1 && this.location_ != InboundServer.getDefaultInstance()) {
               this.location_ = InboundServer.newBuilder((InboundServer)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 1) {
            this.serverBuilder_.mergeFrom(var1);
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.locationCase_ = 1;
         return this;
      }

      public InboundLocation.Builder clearServer() {
         if (this.serverBuilder_ == null) {
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

            this.serverBuilder_.clear();
         }

         return this;
      }

      public InboundServer.Builder getServerBuilder() {
         return this.getServerFieldBuilder().getBuilder();
      }

      @Override
      public InboundServerOrBuilder getServerOrBuilder() {
         if (this.locationCase_ == 1 && this.serverBuilder_ != null) {
            return this.serverBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 1 ? (InboundServer)this.location_ : InboundServer.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundServer, InboundServer.Builder, InboundServerOrBuilder> getServerFieldBuilder() {
         if (this.serverBuilder_ == null) {
            if (this.locationCase_ != 1) {
               this.location_ = InboundServer.getDefaultInstance();
            }

            this.serverBuilder_ = new SingleFieldBuilderV3<>((InboundServer)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 1;
         this.onChanged();
         return this.serverBuilder_;
      }

      @Override
      public boolean hasSinglePlayer() {
         return this.locationCase_ == 2;
      }

      @Override
      public InboundSinglePlayer getSinglePlayer() {
         if (this.singlePlayerBuilder_ == null) {
            return this.locationCase_ == 2 ? (InboundSinglePlayer)this.location_ : InboundSinglePlayer.getDefaultInstance();
         } else {
            return this.locationCase_ == 2 ? this.singlePlayerBuilder_.getMessage() : InboundSinglePlayer.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setSinglePlayer(InboundSinglePlayer var1) {
         if (this.singlePlayerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.singlePlayerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 2;
         return this;
      }

      public InboundLocation.Builder setSinglePlayer(InboundSinglePlayer.Builder var1) {
         if (this.singlePlayerBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.singlePlayerBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 2;
         return this;
      }

      public InboundLocation.Builder mergeSinglePlayer(InboundSinglePlayer var1) {
         if (this.singlePlayerBuilder_ == null) {
            if (this.locationCase_ == 2 && this.location_ != InboundSinglePlayer.getDefaultInstance()) {
               this.location_ = InboundSinglePlayer.newBuilder((InboundSinglePlayer)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 2) {
            this.singlePlayerBuilder_.mergeFrom(var1);
         } else {
            this.singlePlayerBuilder_.setMessage(var1);
         }

         this.locationCase_ = 2;
         return this;
      }

      public InboundLocation.Builder clearSinglePlayer() {
         if (this.singlePlayerBuilder_ == null) {
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

            this.singlePlayerBuilder_.clear();
         }

         return this;
      }

      public InboundSinglePlayer.Builder getSinglePlayerBuilder() {
         return this.getSinglePlayerFieldBuilder().getBuilder();
      }

      @Override
      public InboundSinglePlayerOrBuilder getSinglePlayerOrBuilder() {
         if (this.locationCase_ == 2 && this.singlePlayerBuilder_ != null) {
            return this.singlePlayerBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 2 ? (InboundSinglePlayer)this.location_ : InboundSinglePlayer.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundSinglePlayer, InboundSinglePlayer.Builder, InboundSinglePlayerOrBuilder> getSinglePlayerFieldBuilder() {
         if (this.singlePlayerBuilder_ == null) {
            if (this.locationCase_ != 2) {
               this.location_ = InboundSinglePlayer.getDefaultInstance();
            }

            this.singlePlayerBuilder_ = new SingleFieldBuilderV3<>((InboundSinglePlayer)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 2;
         this.onChanged();
         return this.singlePlayerBuilder_;
      }

      @Override
      public boolean hasMinecraftRealms() {
         return this.locationCase_ == 3;
      }

      @Override
      public InboundMinecraftRealms getMinecraftRealms() {
         if (this.minecraftRealmsBuilder_ == null) {
            return this.locationCase_ == 3 ? (InboundMinecraftRealms)this.location_ : InboundMinecraftRealms.getDefaultInstance();
         } else {
            return this.locationCase_ == 3 ? this.minecraftRealmsBuilder_.getMessage() : InboundMinecraftRealms.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setMinecraftRealms(InboundMinecraftRealms var1) {
         if (this.minecraftRealmsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.minecraftRealmsBuilder_.setMessage(var1);
         }

         this.locationCase_ = 3;
         return this;
      }

      public InboundLocation.Builder setMinecraftRealms(InboundMinecraftRealms.Builder var1) {
         if (this.minecraftRealmsBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.minecraftRealmsBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 3;
         return this;
      }

      public InboundLocation.Builder mergeMinecraftRealms(InboundMinecraftRealms var1) {
         if (this.minecraftRealmsBuilder_ == null) {
            if (this.locationCase_ == 3 && this.location_ != InboundMinecraftRealms.getDefaultInstance()) {
               this.location_ = InboundMinecraftRealms.newBuilder((InboundMinecraftRealms)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 3) {
            this.minecraftRealmsBuilder_.mergeFrom(var1);
         } else {
            this.minecraftRealmsBuilder_.setMessage(var1);
         }

         this.locationCase_ = 3;
         return this;
      }

      public InboundLocation.Builder clearMinecraftRealms() {
         if (this.minecraftRealmsBuilder_ == null) {
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

            this.minecraftRealmsBuilder_.clear();
         }

         return this;
      }

      public InboundMinecraftRealms.Builder getMinecraftRealmsBuilder() {
         return this.getMinecraftRealmsFieldBuilder().getBuilder();
      }

      @Override
      public InboundMinecraftRealmsOrBuilder getMinecraftRealmsOrBuilder() {
         if (this.locationCase_ == 3 && this.minecraftRealmsBuilder_ != null) {
            return this.minecraftRealmsBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 3 ? (InboundMinecraftRealms)this.location_ : InboundMinecraftRealms.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundMinecraftRealms, InboundMinecraftRealms.Builder, InboundMinecraftRealmsOrBuilder> getMinecraftRealmsFieldBuilder() {
         if (this.minecraftRealmsBuilder_ == null) {
            if (this.locationCase_ != 3) {
               this.location_ = InboundMinecraftRealms.getDefaultInstance();
            }

            this.minecraftRealmsBuilder_ = new SingleFieldBuilderV3<>((InboundMinecraftRealms)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 3;
         this.onChanged();
         return this.minecraftRealmsBuilder_;
      }

      @Override
      public boolean hasInMenus() {
         return this.locationCase_ == 4;
      }

      @Override
      public InboundInMenus getInMenus() {
         if (this.inMenusBuilder_ == null) {
            return this.locationCase_ == 4 ? (InboundInMenus)this.location_ : InboundInMenus.getDefaultInstance();
         } else {
            return this.locationCase_ == 4 ? this.inMenusBuilder_.getMessage() : InboundInMenus.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setInMenus(InboundInMenus var1) {
         if (this.inMenusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.inMenusBuilder_.setMessage(var1);
         }

         this.locationCase_ = 4;
         return this;
      }

      public InboundLocation.Builder setInMenus(InboundInMenus.Builder var1) {
         if (this.inMenusBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.inMenusBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 4;
         return this;
      }

      public InboundLocation.Builder mergeInMenus(InboundInMenus var1) {
         if (this.inMenusBuilder_ == null) {
            if (this.locationCase_ == 4 && this.location_ != InboundInMenus.getDefaultInstance()) {
               this.location_ = InboundInMenus.newBuilder((InboundInMenus)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 4) {
            this.inMenusBuilder_.mergeFrom(var1);
         } else {
            this.inMenusBuilder_.setMessage(var1);
         }

         this.locationCase_ = 4;
         return this;
      }

      public InboundLocation.Builder clearInMenus() {
         if (this.inMenusBuilder_ == null) {
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

            this.inMenusBuilder_.clear();
         }

         return this;
      }

      public InboundInMenus.Builder getInMenusBuilder() {
         return this.getInMenusFieldBuilder().getBuilder();
      }

      @Override
      public InboundInMenusOrBuilder getInMenusOrBuilder() {
         if (this.locationCase_ == 4 && this.inMenusBuilder_ != null) {
            return this.inMenusBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 4 ? (InboundInMenus)this.location_ : InboundInMenus.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundInMenus, InboundInMenus.Builder, InboundInMenusOrBuilder> getInMenusFieldBuilder() {
         if (this.inMenusBuilder_ == null) {
            if (this.locationCase_ != 4) {
               this.location_ = InboundInMenus.getDefaultInstance();
            }

            this.inMenusBuilder_ = new SingleFieldBuilderV3<>((InboundInMenus)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 4;
         this.onChanged();
         return this.inMenusBuilder_;
      }

      @Override
      public boolean hasInLauncher() {
         return this.locationCase_ == 5;
      }

      @Override
      public InboundInLauncher getInLauncher() {
         if (this.inLauncherBuilder_ == null) {
            return this.locationCase_ == 5 ? (InboundInLauncher)this.location_ : InboundInLauncher.getDefaultInstance();
         } else {
            return this.locationCase_ == 5 ? this.inLauncherBuilder_.getMessage() : InboundInLauncher.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setInLauncher(InboundInLauncher var1) {
         if (this.inLauncherBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.inLauncherBuilder_.setMessage(var1);
         }

         this.locationCase_ = 5;
         return this;
      }

      public InboundLocation.Builder setInLauncher(InboundInLauncher.Builder var1) {
         if (this.inLauncherBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.inLauncherBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 5;
         return this;
      }

      public InboundLocation.Builder mergeInLauncher(InboundInLauncher var1) {
         if (this.inLauncherBuilder_ == null) {
            if (this.locationCase_ == 5 && this.location_ != InboundInLauncher.getDefaultInstance()) {
               this.location_ = InboundInLauncher.newBuilder((InboundInLauncher)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 5) {
            this.inLauncherBuilder_.mergeFrom(var1);
         } else {
            this.inLauncherBuilder_.setMessage(var1);
         }

         this.locationCase_ = 5;
         return this;
      }

      public InboundLocation.Builder clearInLauncher() {
         if (this.inLauncherBuilder_ == null) {
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

            this.inLauncherBuilder_.clear();
         }

         return this;
      }

      public InboundInLauncher.Builder getInLauncherBuilder() {
         return this.getInLauncherFieldBuilder().getBuilder();
      }

      @Override
      public InboundInLauncherOrBuilder getInLauncherOrBuilder() {
         if (this.locationCase_ == 5 && this.inLauncherBuilder_ != null) {
            return this.inLauncherBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 5 ? (InboundInLauncher)this.location_ : InboundInLauncher.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundInLauncher, InboundInLauncher.Builder, InboundInLauncherOrBuilder> getInLauncherFieldBuilder() {
         if (this.inLauncherBuilder_ == null) {
            if (this.locationCase_ != 5) {
               this.location_ = InboundInLauncher.getDefaultInstance();
            }

            this.inLauncherBuilder_ = new SingleFieldBuilderV3<>((InboundInLauncher)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 5;
         this.onChanged();
         return this.inLauncherBuilder_;
      }

      @Override
      public boolean hasHostedWorld() {
         return this.locationCase_ == 6;
      }

      @Override
      public InboundHostedWorld getHostedWorld() {
         if (this.hostedWorldBuilder_ == null) {
            return this.locationCase_ == 6 ? (InboundHostedWorld)this.location_ : InboundHostedWorld.getDefaultInstance();
         } else {
            return this.locationCase_ == 6 ? this.hostedWorldBuilder_.getMessage() : InboundHostedWorld.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setHostedWorld(InboundHostedWorld var1) {
         if (this.hostedWorldBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.hostedWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 6;
         return this;
      }

      public InboundLocation.Builder setHostedWorld(InboundHostedWorld.Builder var1) {
         if (this.hostedWorldBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.hostedWorldBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 6;
         return this;
      }

      public InboundLocation.Builder mergeHostedWorld(InboundHostedWorld var1) {
         if (this.hostedWorldBuilder_ == null) {
            if (this.locationCase_ == 6 && this.location_ != InboundHostedWorld.getDefaultInstance()) {
               this.location_ = InboundHostedWorld.newBuilder((InboundHostedWorld)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 6) {
            this.hostedWorldBuilder_.mergeFrom(var1);
         } else {
            this.hostedWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 6;
         return this;
      }

      public InboundLocation.Builder clearHostedWorld() {
         if (this.hostedWorldBuilder_ == null) {
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

            this.hostedWorldBuilder_.clear();
         }

         return this;
      }

      public InboundHostedWorld.Builder getHostedWorldBuilder() {
         return this.getHostedWorldFieldBuilder().getBuilder();
      }

      @Override
      public InboundHostedWorldOrBuilder getHostedWorldOrBuilder() {
         if (this.locationCase_ == 6 && this.hostedWorldBuilder_ != null) {
            return this.hostedWorldBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 6 ? (InboundHostedWorld)this.location_ : InboundHostedWorld.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundHostedWorld, InboundHostedWorld.Builder, InboundHostedWorldOrBuilder> getHostedWorldFieldBuilder() {
         if (this.hostedWorldBuilder_ == null) {
            if (this.locationCase_ != 6) {
               this.location_ = InboundHostedWorld.getDefaultInstance();
            }

            this.hostedWorldBuilder_ = new SingleFieldBuilderV3<>((InboundHostedWorld)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 6;
         this.onChanged();
         return this.hostedWorldBuilder_;
      }

      @Override
      public boolean hasReplayWorld() {
         return this.locationCase_ == 7;
      }

      @Override
      public InboundReplayWorld getReplayWorld() {
         if (this.replayWorldBuilder_ == null) {
            return this.locationCase_ == 7 ? (InboundReplayWorld)this.location_ : InboundReplayWorld.getDefaultInstance();
         } else {
            return this.locationCase_ == 7 ? this.replayWorldBuilder_.getMessage() : InboundReplayWorld.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setReplayWorld(InboundReplayWorld var1) {
         if (this.replayWorldBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.replayWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 7;
         return this;
      }

      public InboundLocation.Builder setReplayWorld(InboundReplayWorld.Builder var1) {
         if (this.replayWorldBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.replayWorldBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 7;
         return this;
      }

      public InboundLocation.Builder mergeReplayWorld(InboundReplayWorld var1) {
         if (this.replayWorldBuilder_ == null) {
            if (this.locationCase_ == 7 && this.location_ != InboundReplayWorld.getDefaultInstance()) {
               this.location_ = InboundReplayWorld.newBuilder((InboundReplayWorld)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 7) {
            this.replayWorldBuilder_.mergeFrom(var1);
         } else {
            this.replayWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 7;
         return this;
      }

      public InboundLocation.Builder clearReplayWorld() {
         if (this.replayWorldBuilder_ == null) {
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

            this.replayWorldBuilder_.clear();
         }

         return this;
      }

      public InboundReplayWorld.Builder getReplayWorldBuilder() {
         return this.getReplayWorldFieldBuilder().getBuilder();
      }

      @Override
      public InboundReplayWorldOrBuilder getReplayWorldOrBuilder() {
         if (this.locationCase_ == 7 && this.replayWorldBuilder_ != null) {
            return this.replayWorldBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 7 ? (InboundReplayWorld)this.location_ : InboundReplayWorld.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundReplayWorld, InboundReplayWorld.Builder, InboundReplayWorldOrBuilder> getReplayWorldFieldBuilder() {
         if (this.replayWorldBuilder_ == null) {
            if (this.locationCase_ != 7) {
               this.location_ = InboundReplayWorld.getDefaultInstance();
            }

            this.replayWorldBuilder_ = new SingleFieldBuilderV3<>((InboundReplayWorld)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 7;
         this.onChanged();
         return this.replayWorldBuilder_;
      }

      @Override
      public boolean hasInGame() {
         return this.locationCase_ == 8;
      }

      @Override
      public InboundInGame getInGame() {
         if (this.inGameBuilder_ == null) {
            return this.locationCase_ == 8 ? (InboundInGame)this.location_ : InboundInGame.getDefaultInstance();
         } else {
            return this.locationCase_ == 8 ? this.inGameBuilder_.getMessage() : InboundInGame.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setInGame(InboundInGame var1) {
         if (this.inGameBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.inGameBuilder_.setMessage(var1);
         }

         this.locationCase_ = 8;
         return this;
      }

      public InboundLocation.Builder setInGame(InboundInGame.Builder var1) {
         if (this.inGameBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.inGameBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 8;
         return this;
      }

      public InboundLocation.Builder mergeInGame(InboundInGame var1) {
         if (this.inGameBuilder_ == null) {
            if (this.locationCase_ == 8 && this.location_ != InboundInGame.getDefaultInstance()) {
               this.location_ = InboundInGame.newBuilder((InboundInGame)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 8) {
            this.inGameBuilder_.mergeFrom(var1);
         } else {
            this.inGameBuilder_.setMessage(var1);
         }

         this.locationCase_ = 8;
         return this;
      }

      public InboundLocation.Builder clearInGame() {
         if (this.inGameBuilder_ == null) {
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

            this.inGameBuilder_.clear();
         }

         return this;
      }

      public InboundInGame.Builder getInGameBuilder() {
         return this.getInGameFieldBuilder().getBuilder();
      }

      @Override
      public InboundInGameOrBuilder getInGameOrBuilder() {
         if (this.locationCase_ == 8 && this.inGameBuilder_ != null) {
            return this.inGameBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 8 ? (InboundInGame)this.location_ : InboundInGame.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundInGame, InboundInGame.Builder, InboundInGameOrBuilder> getInGameFieldBuilder() {
         if (this.inGameBuilder_ == null) {
            if (this.locationCase_ != 8) {
               this.location_ = InboundInGame.getDefaultInstance();
            }

            this.inGameBuilder_ = new SingleFieldBuilderV3<>((InboundInGame)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 8;
         this.onChanged();
         return this.inGameBuilder_;
      }

      @Override
      public boolean hasRewindWorld() {
         return this.locationCase_ == 9;
      }

      @Override
      public InboundRewindWorld getRewindWorld() {
         if (this.rewindWorldBuilder_ == null) {
            return this.locationCase_ == 9 ? (InboundRewindWorld)this.location_ : InboundRewindWorld.getDefaultInstance();
         } else {
            return this.locationCase_ == 9 ? this.rewindWorldBuilder_.getMessage() : InboundRewindWorld.getDefaultInstance();
         }
      }

      public InboundLocation.Builder setRewindWorld(InboundRewindWorld var1) {
         if (this.rewindWorldBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
            this.onChanged();
         } else {
            this.rewindWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 9;
         return this;
      }

      public InboundLocation.Builder setRewindWorld(InboundRewindWorld.Builder var1) {
         if (this.rewindWorldBuilder_ == null) {
            this.location_ = var1.build();
            this.onChanged();
         } else {
            this.rewindWorldBuilder_.setMessage(var1.build());
         }

         this.locationCase_ = 9;
         return this;
      }

      public InboundLocation.Builder mergeRewindWorld(InboundRewindWorld var1) {
         if (this.rewindWorldBuilder_ == null) {
            if (this.locationCase_ == 9 && this.location_ != InboundRewindWorld.getDefaultInstance()) {
               this.location_ = InboundRewindWorld.newBuilder((InboundRewindWorld)this.location_).mergeFrom(var1).buildPartial();
            } else {
               this.location_ = var1;
            }

            this.onChanged();
         } else if (this.locationCase_ == 9) {
            this.rewindWorldBuilder_.mergeFrom(var1);
         } else {
            this.rewindWorldBuilder_.setMessage(var1);
         }

         this.locationCase_ = 9;
         return this;
      }

      public InboundLocation.Builder clearRewindWorld() {
         if (this.rewindWorldBuilder_ == null) {
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

            this.rewindWorldBuilder_.clear();
         }

         return this;
      }

      public InboundRewindWorld.Builder getRewindWorldBuilder() {
         return this.getRewindWorldFieldBuilder().getBuilder();
      }

      @Override
      public InboundRewindWorldOrBuilder getRewindWorldOrBuilder() {
         if (this.locationCase_ == 9 && this.rewindWorldBuilder_ != null) {
            return this.rewindWorldBuilder_.getMessageOrBuilder();
         } else {
            return this.locationCase_ == 9 ? (InboundRewindWorld)this.location_ : InboundRewindWorld.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InboundRewindWorld, InboundRewindWorld.Builder, InboundRewindWorldOrBuilder> getRewindWorldFieldBuilder() {
         if (this.rewindWorldBuilder_ == null) {
            if (this.locationCase_ != 9) {
               this.location_ = InboundRewindWorld.getDefaultInstance();
            }

            this.rewindWorldBuilder_ = new SingleFieldBuilderV3<>((InboundRewindWorld)this.location_, this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         this.locationCase_ = 9;
         this.onChanged();
         return this.rewindWorldBuilder_;
      }

      public final InboundLocation.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundLocation.Builder)super.setUnknownFields(var1);
      }

      public final InboundLocation.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundLocation.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum LocationCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      SERVER(1),
      SINGLE_PLAYER(2),
      MINECRAFT_REALMS(3),
      IN_MENUS(4),
      IN_LAUNCHER(5),
      HOSTED_WORLD(6),
      REPLAY_WORLD(7),
      IN_GAME(8),
      REWIND_WORLD(9),
      LOCATION_NOT_SET(0);

      private final int value;

      LocationCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static InboundLocation.LocationCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static InboundLocation.LocationCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return LOCATION_NOT_SET;
            case 1:
               return SERVER;
            case 2:
               return SINGLE_PLAYER;
            case 3:
               return MINECRAFT_REALMS;
            case 4:
               return IN_MENUS;
            case 5:
               return IN_LAUNCHER;
            case 6:
               return HOSTED_WORLD;
            case 7:
               return REPLAY_WORLD;
            case 8:
               return IN_GAME;
            case 9:
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
