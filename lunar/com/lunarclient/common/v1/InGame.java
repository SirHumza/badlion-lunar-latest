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

public final class InGame extends GeneratedMessageV3 implements InGameOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MINECRAFT_VERSION_FIELD_NUMBER = 1;
   private MinecraftVersion minecraftVersion_;
   public static final int MODPACK_FIELD_NUMBER = 2;
   private PlayerModpack modpack_;
   public static final int IS_BADLION_FIELD_NUMBER = 3;
   private boolean isBadlion_ = false;
   private byte memoizedIsInitialized = -1;
   private static final InGame DEFAULT_INSTANCE = new InGame();
   private static final Parser<InGame> PARSER = new AbstractParser<InGame>() {
      public InGame parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InGame.Builder var3 = InGame.newBuilder();

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

   private InGame(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InGame() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InGame();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_InGame_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_InGame_fieldAccessorTable.ensureFieldAccessorsInitialized(InGame.class, InGame.Builder.class);
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

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getModpack());
      }

      if (this.isBadlion_) {
         var1.writeBool(3, this.isBadlion_);
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

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getModpack());
      }

      if (this.isBadlion_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.isBadlion_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InGame)) {
         return super.equals(var1);
      } else {
         InGame var2 = (InGame)var1;
         if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
            return false;
         } else if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
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

      if (this.hasModpack()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsBadlion());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InGame parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InGame parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InGame parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InGame parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InGame parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InGame parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InGame parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InGame parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InGame parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InGame parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InGame parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InGame parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InGame.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InGame.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InGame.Builder newBuilder(InGame var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InGame.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InGame.Builder() : new InGame.Builder().mergeFrom(this);
   }

   protected InGame.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InGame.Builder(var1);
   }

   public static InGame getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InGame> parser() {
      return PARSER;
   }

   @Override
   public Parser<InGame> getParserForType() {
      return PARSER;
   }

   public InGame getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InGame.Builder> implements InGameOrBuilder {
      private int bitField0_;
      private MinecraftVersion minecraftVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;
      private boolean isBadlion_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_InGame_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_InGame_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InGame.class, InGame.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InGame.alwaysUseFieldBuilders) {
            this.getMinecraftVersionFieldBuilder();
            this.getModpackFieldBuilder();
         }
      }

      public InGame.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

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
         return LocationProto.internal_static_lunarclient_common_v1_InGame_descriptor;
      }

      public InGame getDefaultInstanceForType() {
         return InGame.getDefaultInstance();
      }

      public InGame build() {
         InGame var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InGame buildPartial() {
         InGame var1 = new InGame(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InGame var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.isBadlion_ = this.isBadlion_;
         }

         InGame var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InGame.Builder clone() {
         return (InGame.Builder)super.clone();
      }

      public InGame.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InGame.Builder)super.setField(var1, var2);
      }

      public InGame.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InGame.Builder)super.clearField(var1);
      }

      public InGame.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InGame.Builder)super.clearOneof(var1);
      }

      public InGame.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InGame.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InGame.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InGame.Builder)super.addRepeatedField(var1, var2);
      }

      public InGame.Builder mergeFrom(Message var1) {
         if (var1 instanceof InGame) {
            return this.mergeFrom((InGame)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InGame.Builder mergeFrom(InGame var1) {
         if (var1 == InGame.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMinecraftVersion()) {
            this.mergeMinecraftVersion(var1.getMinecraftVersion());
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

      public InGame.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 18:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.isBadlion_ = var1.readBool();
                     this.bitField0_ |= 4;
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

      public InGame.Builder setMinecraftVersion(MinecraftVersion var1) {
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

      public InGame.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersion_ = var1.build();
         } else {
            this.minecraftVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InGame.Builder mergeMinecraftVersion(MinecraftVersion var1) {
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

      public InGame.Builder clearMinecraftVersion() {
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
      public boolean hasModpack() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public InGame.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InGame.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InGame.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public InGame.Builder clearModpack() {
         this.bitField0_ &= -3;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 2;
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

      public InGame.Builder setIsBadlion(boolean var1) {
         this.isBadlion_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InGame.Builder clearIsBadlion() {
         this.bitField0_ &= -5;
         this.isBadlion_ = false;
         this.onChanged();
         return this;
      }

      public final InGame.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InGame.Builder)super.setUnknownFields(var1);
      }

      public final InGame.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InGame.Builder)super.mergeUnknownFields(var1);
      }
   }
}
