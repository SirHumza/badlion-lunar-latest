package com.lunarclient.common.v1;

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

public final class InboundInGame extends GeneratedMessageV3 implements InboundInGameOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MINECRAFT_VERSION_FIELD_NUMBER = 1;
   private MinecraftVersion minecraftVersion_;
   public static final int IS_LAUNCH_FIELD_NUMBER = 2;
   private boolean isLaunch_ = false;
   public static final int MODPACK_FIELD_NUMBER = 3;
   private PlayerModpack modpack_;
   public static final int IS_BADLION_FIELD_NUMBER = 4;
   private boolean isBadlion_ = false;
   private byte memoizedIsInitialized = -1;
   private static final InboundInGame DEFAULT_INSTANCE = new InboundInGame();
   private static final Parser<InboundInGame> PARSER = new AbstractParser<InboundInGame>() {
      public InboundInGame parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundInGame.Builder var3 = InboundInGame.newBuilder();

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

   private InboundInGame(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundInGame() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundInGame();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInGame_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInGame_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundInGame.class, InboundInGame.Builder.class);
   }

   @Override
   public boolean hasMinecraftVersion() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public MinecraftVersion getMinecraftVersion() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public boolean getIsLaunch() {
      return this.isLaunch_;
   }

   @Override
   public boolean hasModpack() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public PlayerModpack getModpack() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   @Override
   public PlayerModpackOrBuilder getModpackOrBuilder() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   @Override
   public boolean getIsBadlion() {
      return this.isBadlion_;
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
         var1.writeMessage(1, this.getMinecraftVersion());
      }

      if (this.isLaunch_) {
         var1.writeBool(2, this.isLaunch_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getModpack());
      }

      if (this.isBadlion_) {
         var1.writeBool(4, this.isBadlion_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getMinecraftVersion());
      }

      if (this.isLaunch_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.isLaunch_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getModpack());
      }

      if (this.isBadlion_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.isBadlion_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InboundInGame)) {
         return super.equals(var1);
      } else {
         InboundInGame var2 = (InboundInGame)var1;
         if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
            return false;
         } else if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
            return false;
         } else if (this.getIsLaunch() != var2.getIsLaunch()) {
            return false;
         } else if (this.hasModpack() != var2.hasModpack()) {
            return false;
         } else if (this.hasModpack() && !this.getModpack().equals(var2.getModpack())) {
            return false;
         } else {
            return this.getIsBadlion() != var2.getIsBadlion() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasMinecraftVersion()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMinecraftVersion().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsLaunch());
      if (this.hasModpack()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsBadlion());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundInGame parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInGame parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInGame parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInGame parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInGame parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundInGame parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundInGame parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundInGame parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundInGame parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundInGame parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundInGame parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundInGame parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundInGame.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundInGame.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundInGame.Builder newBuilder(InboundInGame var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundInGame.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundInGame.Builder() : new InboundInGame.Builder().mergeFrom(this);
   }

   protected InboundInGame.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundInGame.Builder(var1);
   }

   public static InboundInGame getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundInGame> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundInGame> getParserForType() {
      return PARSER;
   }

   public InboundInGame getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundInGame.Builder> implements InboundInGameOrBuilder {
      private int bitField0_;
      private MinecraftVersion minecraftVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
      private boolean isLaunch_;
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;
      private boolean isBadlion_;

      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInGame_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInGame_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundInGame.class, InboundInGame.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InboundInGame.alwaysUseFieldBuilders) {
            this.getMinecraftVersionFieldBuilder();
            this.getModpackFieldBuilder();
         }
      }

      public InboundInGame.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.isLaunch_ = false;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.isBadlion_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundInGame_descriptor;
      }

      public InboundInGame getDefaultInstanceForType() {
         return InboundInGame.getDefaultInstance();
      }

      public InboundInGame build() {
         InboundInGame var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundInGame buildPartial() {
         InboundInGame var1 = new InboundInGame(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundInGame var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.isLaunch_ = this.isLaunch_;
         }

         if ((var2 & 4) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.isBadlion_ = this.isBadlion_;
         }

         InboundInGame var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InboundInGame.Builder clone() {
         return (InboundInGame.Builder)super.clone();
      }

      public InboundInGame.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundInGame.Builder)super.setField(var1, var2);
      }

      public InboundInGame.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundInGame.Builder)super.clearField(var1);
      }

      public InboundInGame.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundInGame.Builder)super.clearOneof(var1);
      }

      public InboundInGame.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundInGame.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundInGame.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundInGame.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundInGame.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundInGame) {
            return this.mergeFrom((InboundInGame)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundInGame.Builder mergeFrom(InboundInGame var1) {
         if (var1 == InboundInGame.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMinecraftVersion()) {
            this.mergeMinecraftVersion(var1.getMinecraftVersion());
         }

         if (var1.getIsLaunch()) {
            this.setIsLaunch(var1.getIsLaunch());
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
         }

         if (var1.getIsBadlion()) {
            this.setIsBadlion(var1.getIsBadlion());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InboundInGame.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMinecraftVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.isLaunch_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.isBadlion_ = var1.readBool();
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
      public boolean hasMinecraftVersion() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public MinecraftVersion getMinecraftVersion() {
         if (this.minecraftVersionBuilder_ == null) {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         } else {
            return this.minecraftVersionBuilder_.getMessage();
         }
      }

      public InboundInGame.Builder setMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.minecraftVersion_ = var1;
         } else {
            this.minecraftVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundInGame.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersion_ = var1.build();
         } else {
            this.minecraftVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundInGame.Builder mergeMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.minecraftVersion_ != null && this.minecraftVersion_ != MinecraftVersion.getDefaultInstance()) {
               this.getMinecraftVersionBuilder().mergeFrom(var1);
            } else {
               this.minecraftVersion_ = var1;
            }
         } else {
            this.minecraftVersionBuilder_.mergeFrom(var1);
         }

         if (this.minecraftVersion_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public InboundInGame.Builder clearMinecraftVersion() {
         this.bitField0_ &= -2;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getMinecraftVersionBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getMinecraftVersionFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
         if (this.minecraftVersionBuilder_ != null) {
            return this.minecraftVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         }
      }

      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getMinecraftVersionFieldBuilder() {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersionBuilder_ = new SingleFieldBuilderV3<>(this.getMinecraftVersion(), this.getParentForChildren(), this.isClean());
            this.minecraftVersion_ = null;
         }

         return this.minecraftVersionBuilder_;
      }

      @Override
      public boolean getIsLaunch() {
         return this.isLaunch_;
      }

      public InboundInGame.Builder setIsLaunch(boolean var1) {
         this.isLaunch_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundInGame.Builder clearIsLaunch() {
         this.bitField0_ &= -3;
         this.isLaunch_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasModpack() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public InboundInGame.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InboundInGame.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InboundInGame.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public InboundInGame.Builder clearModpack() {
         this.bitField0_ &= -5;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getModpackFieldBuilder().getBuilder();
      }

      @Override
      public PlayerModpackOrBuilder getModpackOrBuilder() {
         if (this.modpackBuilder_ != null) {
            return this.modpackBuilder_.getMessageOrBuilder();
         } else {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         }
      }

      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> getModpackFieldBuilder() {
         if (this.modpackBuilder_ == null) {
            this.modpackBuilder_ = new SingleFieldBuilderV3<>(this.getModpack(), this.getParentForChildren(), this.isClean());
            this.modpack_ = null;
         }

         return this.modpackBuilder_;
      }

      @Override
      public boolean getIsBadlion() {
         return this.isBadlion_;
      }

      public InboundInGame.Builder setIsBadlion(boolean var1) {
         this.isBadlion_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public InboundInGame.Builder clearIsBadlion() {
         this.bitField0_ &= -9;
         this.isBadlion_ = false;
         this.onChanged();
         return this;
      }

      public final InboundInGame.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundInGame.Builder)super.setUnknownFields(var1);
      }

      public final InboundInGame.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundInGame.Builder)super.mergeUnknownFields(var1);
      }
   }
}
