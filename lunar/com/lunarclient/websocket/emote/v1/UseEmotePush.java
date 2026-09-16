package com.lunarclient.websocket.emote.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UseEmotePush extends GeneratedMessageV3 implements UseEmotePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int EMOTE_ID_FIELD_NUMBER = 2;
   private int emoteId_ = 0;
   public static final int EMOTE_METADATA_FIELD_NUMBER = 3;
   private int emoteMetadata_ = 0;
   public static final int EMOTE_SOUNDTRACK_URL_FIELD_NUMBER = 4;
   private volatile Object emoteSoundtrackUrl_ = "";
   public static final int EMOTE_JAM_ID_FIELD_NUMBER = 5;
   private int emoteJamId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UseEmotePush DEFAULT_INSTANCE = new UseEmotePush();
   private static final Parser<UseEmotePush> PARSER = new AbstractParser<UseEmotePush>() {
      public UseEmotePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UseEmotePush.Builder var3 = UseEmotePush.newBuilder();

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

   private UseEmotePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UseEmotePush() {
      this.emoteSoundtrackUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UseEmotePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_emote_v1_UseEmotePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_emote_v1_UseEmotePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UseEmotePush.class, UseEmotePush.Builder.class);
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

   @Override
   public int getEmoteId() {
      return this.emoteId_;
   }

   @Override
   public int getEmoteMetadata() {
      return this.emoteMetadata_;
   }

   @Override
   public String getEmoteSoundtrackUrl() {
      Object var1 = this.emoteSoundtrackUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.emoteSoundtrackUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getEmoteSoundtrackUrlBytes() {
      Object var1 = this.emoteSoundtrackUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.emoteSoundtrackUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getEmoteJamId() {
      return this.emoteJamId_;
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

      if (this.emoteId_ != 0) {
         var1.writeInt32(2, this.emoteId_);
      }

      if (this.emoteMetadata_ != 0) {
         var1.writeInt32(3, this.emoteMetadata_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.emoteSoundtrackUrl_)) {
         GeneratedMessageV3.writeString(var1, 4, this.emoteSoundtrackUrl_);
      }

      if (this.emoteJamId_ != 0) {
         var1.writeInt32(5, this.emoteJamId_);
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

      if (this.emoteId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.emoteId_);
      }

      if (this.emoteMetadata_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.emoteMetadata_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.emoteSoundtrackUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.emoteSoundtrackUrl_);
      }

      if (this.emoteJamId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.emoteJamId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UseEmotePush)) {
         return super.equals(var1);
      } else {
         UseEmotePush var2 = (UseEmotePush)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.getEmoteId() != var2.getEmoteId()) {
            return false;
         } else if (this.getEmoteMetadata() != var2.getEmoteMetadata()) {
            return false;
         } else if (!this.getEmoteSoundtrackUrl().equals(var2.getEmoteSoundtrackUrl())) {
            return false;
         } else {
            return this.getEmoteJamId() != var2.getEmoteJamId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getEmoteId();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getEmoteMetadata();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getEmoteSoundtrackUrl().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getEmoteJamId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UseEmotePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmotePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmotePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmotePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmotePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmotePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmotePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseEmotePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UseEmotePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UseEmotePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UseEmotePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseEmotePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UseEmotePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UseEmotePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UseEmotePush.Builder newBuilder(UseEmotePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UseEmotePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UseEmotePush.Builder() : new UseEmotePush.Builder().mergeFrom(this);
   }

   protected UseEmotePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UseEmotePush.Builder(var1);
   }

   public static UseEmotePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UseEmotePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<UseEmotePush> getParserForType() {
      return PARSER;
   }

   public UseEmotePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UseEmotePush.Builder> implements UseEmotePushOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private int emoteId_;
      private int emoteMetadata_;
      private Object emoteSoundtrackUrl_ = "";
      private int emoteJamId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_emote_v1_UseEmotePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_emote_v1_UseEmotePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UseEmotePush.class, UseEmotePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UseEmotePush.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public UseEmotePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.emoteId_ = 0;
         this.emoteMetadata_ = 0;
         this.emoteSoundtrackUrl_ = "";
         this.emoteJamId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_emote_v1_UseEmotePush_descriptor;
      }

      public UseEmotePush getDefaultInstanceForType() {
         return UseEmotePush.getDefaultInstance();
      }

      public UseEmotePush build() {
         UseEmotePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UseEmotePush buildPartial() {
         UseEmotePush var1 = new UseEmotePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UseEmotePush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.emoteId_ = this.emoteId_;
         }

         if ((var2 & 4) != 0) {
            var1.emoteMetadata_ = this.emoteMetadata_;
         }

         if ((var2 & 8) != 0) {
            var1.emoteSoundtrackUrl_ = this.emoteSoundtrackUrl_;
         }

         if ((var2 & 16) != 0) {
            var1.emoteJamId_ = this.emoteJamId_;
         }

         UseEmotePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UseEmotePush.Builder clone() {
         return (UseEmotePush.Builder)super.clone();
      }

      public UseEmotePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseEmotePush.Builder)super.setField(var1, var2);
      }

      public UseEmotePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UseEmotePush.Builder)super.clearField(var1);
      }

      public UseEmotePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UseEmotePush.Builder)super.clearOneof(var1);
      }

      public UseEmotePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UseEmotePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UseEmotePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseEmotePush.Builder)super.addRepeatedField(var1, var2);
      }

      public UseEmotePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof UseEmotePush) {
            return this.mergeFrom((UseEmotePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UseEmotePush.Builder mergeFrom(UseEmotePush var1) {
         if (var1 == UseEmotePush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.getEmoteId() != 0) {
            this.setEmoteId(var1.getEmoteId());
         }

         if (var1.getEmoteMetadata() != 0) {
            this.setEmoteMetadata(var1.getEmoteMetadata());
         }

         if (!var1.getEmoteSoundtrackUrl().isEmpty()) {
            this.emoteSoundtrackUrl_ = var1.emoteSoundtrackUrl_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.getEmoteJamId() != 0) {
            this.setEmoteJamId(var1.getEmoteJamId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UseEmotePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.emoteId_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.emoteMetadata_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.emoteSoundtrackUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.emoteJamId_ = var1.readInt32();
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

      public UseEmotePush.Builder setPlayerUuid(Uuid var1) {
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

      public UseEmotePush.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UseEmotePush.Builder mergePlayerUuid(Uuid var1) {
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

      public UseEmotePush.Builder clearPlayerUuid() {
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

      @Override
      public int getEmoteId() {
         return this.emoteId_;
      }

      public UseEmotePush.Builder setEmoteId(int var1) {
         this.emoteId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UseEmotePush.Builder clearEmoteId() {
         this.bitField0_ &= -3;
         this.emoteId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteMetadata() {
         return this.emoteMetadata_;
      }

      public UseEmotePush.Builder setEmoteMetadata(int var1) {
         this.emoteMetadata_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UseEmotePush.Builder clearEmoteMetadata() {
         this.bitField0_ &= -5;
         this.emoteMetadata_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getEmoteSoundtrackUrl() {
         Object var1 = this.emoteSoundtrackUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.emoteSoundtrackUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEmoteSoundtrackUrlBytes() {
         Object var1 = this.emoteSoundtrackUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.emoteSoundtrackUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UseEmotePush.Builder setEmoteSoundtrackUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.emoteSoundtrackUrl_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public UseEmotePush.Builder clearEmoteSoundtrackUrl() {
         this.emoteSoundtrackUrl_ = UseEmotePush.getDefaultInstance().getEmoteSoundtrackUrl();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public UseEmotePush.Builder setEmoteSoundtrackUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UseEmotePush.checkByteStringIsUtf8(var1);
         this.emoteSoundtrackUrl_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteJamId() {
         return this.emoteJamId_;
      }

      public UseEmotePush.Builder setEmoteJamId(int var1) {
         this.emoteJamId_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public UseEmotePush.Builder clearEmoteJamId() {
         this.bitField0_ &= -17;
         this.emoteJamId_ = 0;
         this.onChanged();
         return this;
      }

      public final UseEmotePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UseEmotePush.Builder)super.setUnknownFields(var1);
      }

      public final UseEmotePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UseEmotePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
