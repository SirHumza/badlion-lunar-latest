package com.lunarclient.websocket.serverdiscovery.v1;

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
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ServerModalDetails extends GeneratedMessageV3 implements ServerModalDetailsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int DESCRIPTION_FIELD_NUMBER = 1;
   private volatile Object description_ = "";
   public static final int TWITTER_FIELD_NUMBER = 2;
   private volatile Object twitter_ = "";
   public static final int DISCORD_FIELD_NUMBER = 3;
   private volatile Object discord_ = "";
   public static final int YOUTUBE_FIELD_NUMBER = 4;
   private volatile Object youtube_ = "";
   public static final int INSTAGRAM_FIELD_NUMBER = 5;
   private volatile Object instagram_ = "";
   public static final int TWITCH_FIELD_NUMBER = 6;
   private volatile Object twitch_ = "";
   public static final int TELEGRAM_FIELD_NUMBER = 7;
   private volatile Object telegram_ = "";
   public static final int REDDIT_FIELD_NUMBER = 8;
   private volatile Object reddit_ = "";
   public static final int TIKTOK_FIELD_NUMBER = 9;
   private volatile Object tiktok_ = "";
   public static final int FACEBOOK_FIELD_NUMBER = 10;
   private volatile Object facebook_ = "";
   public static final int MODPACK_FIELD_NUMBER = 11;
   private PlayerModpack modpack_;
   private byte memoizedIsInitialized = -1;
   private static final ServerModalDetails DEFAULT_INSTANCE = new ServerModalDetails();
   private static final Parser<ServerModalDetails> PARSER = new AbstractParser<ServerModalDetails>() {
      public ServerModalDetails parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerModalDetails.Builder var3 = ServerModalDetails.newBuilder();

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

   private ServerModalDetails(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerModalDetails() {
      this.description_ = "";
      this.twitter_ = "";
      this.discord_ = "";
      this.youtube_ = "";
      this.instagram_ = "";
      this.twitch_ = "";
      this.telegram_ = "";
      this.reddit_ = "";
      this.tiktok_ = "";
      this.facebook_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerModalDetails();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerModalDetails.class, ServerModalDetails.Builder.class);
   }

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

   @Override
   public String getTwitter() {
      Object var1 = this.twitter_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.twitter_ = var3;
      return var3;
   }

   @Override
   public ByteString getTwitterBytes() {
      Object var1 = this.twitter_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.twitter_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getDiscord() {
      Object var1 = this.discord_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.discord_ = var3;
      return var3;
   }

   @Override
   public ByteString getDiscordBytes() {
      Object var1 = this.discord_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.discord_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getYoutube() {
      Object var1 = this.youtube_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.youtube_ = var3;
      return var3;
   }

   @Override
   public ByteString getYoutubeBytes() {
      Object var1 = this.youtube_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.youtube_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getInstagram() {
      Object var1 = this.instagram_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.instagram_ = var3;
      return var3;
   }

   @Override
   public ByteString getInstagramBytes() {
      Object var1 = this.instagram_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.instagram_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getTwitch() {
      Object var1 = this.twitch_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.twitch_ = var3;
      return var3;
   }

   @Override
   public ByteString getTwitchBytes() {
      Object var1 = this.twitch_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.twitch_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getTelegram() {
      Object var1 = this.telegram_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.telegram_ = var3;
      return var3;
   }

   @Override
   public ByteString getTelegramBytes() {
      Object var1 = this.telegram_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.telegram_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getReddit() {
      Object var1 = this.reddit_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.reddit_ = var3;
      return var3;
   }

   @Override
   public ByteString getRedditBytes() {
      Object var1 = this.reddit_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.reddit_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getTiktok() {
      Object var1 = this.tiktok_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.tiktok_ = var3;
      return var3;
   }

   @Override
   public ByteString getTiktokBytes() {
      Object var1 = this.tiktok_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.tiktok_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getFacebook() {
      Object var1 = this.facebook_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.facebook_ = var3;
      return var3;
   }

   @Override
   public ByteString getFacebookBytes() {
      Object var1 = this.facebook_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.facebook_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasModpack() {
      return (this.bitField0_ & 1) != 0;
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
      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         GeneratedMessageV3.writeString(var1, 1, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.twitter_)) {
         GeneratedMessageV3.writeString(var1, 2, this.twitter_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.discord_)) {
         GeneratedMessageV3.writeString(var1, 3, this.discord_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.youtube_)) {
         GeneratedMessageV3.writeString(var1, 4, this.youtube_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.instagram_)) {
         GeneratedMessageV3.writeString(var1, 5, this.instagram_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.twitch_)) {
         GeneratedMessageV3.writeString(var1, 6, this.twitch_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.telegram_)) {
         GeneratedMessageV3.writeString(var1, 7, this.telegram_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.reddit_)) {
         GeneratedMessageV3.writeString(var1, 8, this.reddit_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.tiktok_)) {
         GeneratedMessageV3.writeString(var1, 9, this.tiktok_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.facebook_)) {
         GeneratedMessageV3.writeString(var1, 10, this.facebook_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(11, this.getModpack());
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
      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.twitter_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.twitter_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.discord_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.discord_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.youtube_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.youtube_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.instagram_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.instagram_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.twitch_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.twitch_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.telegram_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.telegram_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.reddit_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.reddit_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.tiktok_)) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.tiktok_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.facebook_)) {
         var1 += GeneratedMessageV3.computeStringSize(10, this.facebook_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(11, this.getModpack());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerModalDetails)) {
         return super.equals(var1);
      } else {
         ServerModalDetails var2 = (ServerModalDetails)var1;
         if (!this.getDescription().equals(var2.getDescription())) {
            return false;
         } else if (!this.getTwitter().equals(var2.getTwitter())) {
            return false;
         } else if (!this.getDiscord().equals(var2.getDiscord())) {
            return false;
         } else if (!this.getYoutube().equals(var2.getYoutube())) {
            return false;
         } else if (!this.getInstagram().equals(var2.getInstagram())) {
            return false;
         } else if (!this.getTwitch().equals(var2.getTwitch())) {
            return false;
         } else if (!this.getTelegram().equals(var2.getTelegram())) {
            return false;
         } else if (!this.getReddit().equals(var2.getReddit())) {
            return false;
         } else if (!this.getTiktok().equals(var2.getTiktok())) {
            return false;
         } else if (!this.getFacebook().equals(var2.getFacebook())) {
            return false;
         } else if (this.hasModpack() != var2.hasModpack()) {
            return false;
         } else {
            return this.hasModpack() && !this.getModpack().equals(var2.getModpack()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getDescription().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getTwitter().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getDiscord().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getYoutube().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getInstagram().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getTwitch().hashCode();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getTelegram().hashCode();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getReddit().hashCode();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getTiktok().hashCode();
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.getFacebook().hashCode();
      if (this.hasModpack()) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerModalDetails parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerModalDetails parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerModalDetails parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerModalDetails parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerModalDetails parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerModalDetails parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerModalDetails parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerModalDetails parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerModalDetails parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerModalDetails parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerModalDetails parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerModalDetails parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerModalDetails.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerModalDetails.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerModalDetails.Builder newBuilder(ServerModalDetails var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerModalDetails.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerModalDetails.Builder() : new ServerModalDetails.Builder().mergeFrom(this);
   }

   protected ServerModalDetails.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerModalDetails.Builder(var1);
   }

   public static ServerModalDetails getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerModalDetails> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerModalDetails> getParserForType() {
      return PARSER;
   }

   public ServerModalDetails getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerModalDetails.Builder> implements ServerModalDetailsOrBuilder {
      private int bitField0_;
      private Object description_ = "";
      private Object twitter_ = "";
      private Object discord_ = "";
      private Object youtube_ = "";
      private Object instagram_ = "";
      private Object twitch_ = "";
      private Object telegram_ = "";
      private Object reddit_ = "";
      private Object tiktok_ = "";
      private Object facebook_ = "";
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerModalDetails.class, ServerModalDetails.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ServerModalDetails.alwaysUseFieldBuilders) {
            this.getModpackFieldBuilder();
         }
      }

      public ServerModalDetails.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.description_ = "";
         this.twitter_ = "";
         this.discord_ = "";
         this.youtube_ = "";
         this.instagram_ = "";
         this.twitch_ = "";
         this.telegram_ = "";
         this.reddit_ = "";
         this.tiktok_ = "";
         this.facebook_ = "";
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerModalDetails_descriptor;
      }

      public ServerModalDetails getDefaultInstanceForType() {
         return ServerModalDetails.getDefaultInstance();
      }

      public ServerModalDetails build() {
         ServerModalDetails var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerModalDetails buildPartial() {
         ServerModalDetails var1 = new ServerModalDetails(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ServerModalDetails var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.description_ = this.description_;
         }

         if ((var2 & 2) != 0) {
            var1.twitter_ = this.twitter_;
         }

         if ((var2 & 4) != 0) {
            var1.discord_ = this.discord_;
         }

         if ((var2 & 8) != 0) {
            var1.youtube_ = this.youtube_;
         }

         if ((var2 & 16) != 0) {
            var1.instagram_ = this.instagram_;
         }

         if ((var2 & 32) != 0) {
            var1.twitch_ = this.twitch_;
         }

         if ((var2 & 64) != 0) {
            var1.telegram_ = this.telegram_;
         }

         if ((var2 & 128) != 0) {
            var1.reddit_ = this.reddit_;
         }

         if ((var2 & 256) != 0) {
            var1.tiktok_ = this.tiktok_;
         }

         if ((var2 & 512) != 0) {
            var1.facebook_ = this.facebook_;
         }

         byte var3 = 0;
         if ((var2 & 1024) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 1;
         }

         ServerModalDetails var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ServerModalDetails.Builder clone() {
         return (ServerModalDetails.Builder)super.clone();
      }

      public ServerModalDetails.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerModalDetails.Builder)super.setField(var1, var2);
      }

      public ServerModalDetails.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerModalDetails.Builder)super.clearField(var1);
      }

      public ServerModalDetails.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerModalDetails.Builder)super.clearOneof(var1);
      }

      public ServerModalDetails.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerModalDetails.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerModalDetails.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerModalDetails.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerModalDetails.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerModalDetails) {
            return this.mergeFrom((ServerModalDetails)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerModalDetails.Builder mergeFrom(ServerModalDetails var1) {
         if (var1 == ServerModalDetails.getDefaultInstance()) {
            return this;
         }

         if (!var1.getDescription().isEmpty()) {
            this.description_ = var1.description_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getTwitter().isEmpty()) {
            this.twitter_ = var1.twitter_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getDiscord().isEmpty()) {
            this.discord_ = var1.discord_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getYoutube().isEmpty()) {
            this.youtube_ = var1.youtube_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getInstagram().isEmpty()) {
            this.instagram_ = var1.instagram_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getTwitch().isEmpty()) {
            this.twitch_ = var1.twitch_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (!var1.getTelegram().isEmpty()) {
            this.telegram_ = var1.telegram_;
            this.bitField0_ |= 64;
            this.onChanged();
         }

         if (!var1.getReddit().isEmpty()) {
            this.reddit_ = var1.reddit_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (!var1.getTiktok().isEmpty()) {
            this.tiktok_ = var1.tiktok_;
            this.bitField0_ |= 256;
            this.onChanged();
         }

         if (!var1.getFacebook().isEmpty()) {
            this.facebook_ = var1.facebook_;
            this.bitField0_ |= 512;
            this.onChanged();
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ServerModalDetails.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.description_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.twitter_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.discord_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.youtube_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.instagram_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.twitch_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.telegram_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     this.reddit_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     this.tiktok_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 256;
                     break;
                  case 82:
                     this.facebook_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 512;
                     break;
                  case 90:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1024;
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

      public ServerModalDetails.Builder setDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearDescription() {
         this.description_ = ServerModalDetails.getDefaultInstance().getDescription();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.description_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getTwitter() {
         Object var1 = this.twitter_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.twitter_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTwitterBytes() {
         Object var1 = this.twitter_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.twitter_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setTwitter(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.twitter_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearTwitter() {
         this.twitter_ = ServerModalDetails.getDefaultInstance().getTwitter();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setTwitterBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.twitter_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getDiscord() {
         Object var1 = this.discord_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.discord_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDiscordBytes() {
         Object var1 = this.discord_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.discord_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setDiscord(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.discord_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearDiscord() {
         this.discord_ = ServerModalDetails.getDefaultInstance().getDiscord();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setDiscordBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.discord_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getYoutube() {
         Object var1 = this.youtube_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.youtube_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getYoutubeBytes() {
         Object var1 = this.youtube_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.youtube_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setYoutube(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.youtube_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearYoutube() {
         this.youtube_ = ServerModalDetails.getDefaultInstance().getYoutube();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setYoutubeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.youtube_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getInstagram() {
         Object var1 = this.instagram_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.instagram_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getInstagramBytes() {
         Object var1 = this.instagram_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.instagram_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setInstagram(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.instagram_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearInstagram() {
         this.instagram_ = ServerModalDetails.getDefaultInstance().getInstagram();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setInstagramBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.instagram_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getTwitch() {
         Object var1 = this.twitch_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.twitch_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTwitchBytes() {
         Object var1 = this.twitch_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.twitch_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setTwitch(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.twitch_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearTwitch() {
         this.twitch_ = ServerModalDetails.getDefaultInstance().getTwitch();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setTwitchBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.twitch_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public String getTelegram() {
         Object var1 = this.telegram_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.telegram_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTelegramBytes() {
         Object var1 = this.telegram_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.telegram_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setTelegram(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.telegram_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearTelegram() {
         this.telegram_ = ServerModalDetails.getDefaultInstance().getTelegram();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setTelegramBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.telegram_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public String getReddit() {
         Object var1 = this.reddit_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.reddit_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRedditBytes() {
         Object var1 = this.reddit_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.reddit_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setReddit(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.reddit_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearReddit() {
         this.reddit_ = ServerModalDetails.getDefaultInstance().getReddit();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setRedditBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.reddit_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public String getTiktok() {
         Object var1 = this.tiktok_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.tiktok_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTiktokBytes() {
         Object var1 = this.tiktok_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.tiktok_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setTiktok(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.tiktok_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearTiktok() {
         this.tiktok_ = ServerModalDetails.getDefaultInstance().getTiktok();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setTiktokBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.tiktok_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public String getFacebook() {
         Object var1 = this.facebook_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.facebook_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getFacebookBytes() {
         Object var1 = this.facebook_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.facebook_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerModalDetails.Builder setFacebook(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.facebook_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder clearFacebook() {
         this.facebook_ = ServerModalDetails.getDefaultInstance().getFacebook();
         this.bitField0_ &= -513;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setFacebookBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerModalDetails.checkByteStringIsUtf8(var1);
         this.facebook_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasModpack() {
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public ServerModalDetails.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public ServerModalDetails.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         return this;
      }

      public ServerModalDetails.Builder clearModpack() {
         this.bitField0_ &= -1025;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 1024;
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

      public final ServerModalDetails.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerModalDetails.Builder)super.setUnknownFields(var1);
      }

      public final ServerModalDetails.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerModalDetails.Builder)super.mergeUnknownFields(var1);
      }
   }
}
