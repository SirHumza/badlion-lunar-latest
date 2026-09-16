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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class GlobalAnnouncement extends GeneratedMessageV3 implements GlobalAnnouncementOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ANNOUNCEMENT_FIELD_NUMBER = 1;
   private Announcement announcement_;
   public static final int SERVER_FIELD_NUMBER = 2;
   private ServerCard server_;
   private byte memoizedIsInitialized = -1;
   private static final GlobalAnnouncement DEFAULT_INSTANCE = new GlobalAnnouncement();
   private static final Parser<GlobalAnnouncement> PARSER = new AbstractParser<GlobalAnnouncement>() {
      public GlobalAnnouncement parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GlobalAnnouncement.Builder var3 = GlobalAnnouncement.newBuilder();

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

   private GlobalAnnouncement(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GlobalAnnouncement() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GlobalAnnouncement();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GlobalAnnouncement.class, GlobalAnnouncement.Builder.class);
   }

   @Override
   public boolean hasAnnouncement() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Announcement getAnnouncement() {
      return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
   }

   @Override
   public AnnouncementOrBuilder getAnnouncementOrBuilder() {
      return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
   }

   @Override
   public boolean hasServer() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public ServerCard getServer() {
      return this.server_ == null ? ServerCard.getDefaultInstance() : this.server_;
   }

   @Override
   public ServerCardOrBuilder getServerOrBuilder() {
      return this.server_ == null ? ServerCard.getDefaultInstance() : this.server_;
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
         var1.writeMessage(1, this.getAnnouncement());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getServer());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getAnnouncement());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getServer());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GlobalAnnouncement)) {
         return super.equals(var1);
      } else {
         GlobalAnnouncement var2 = (GlobalAnnouncement)var1;
         if (this.hasAnnouncement() != var2.hasAnnouncement()) {
            return false;
         } else if (this.hasAnnouncement() && !this.getAnnouncement().equals(var2.getAnnouncement())) {
            return false;
         } else if (this.hasServer() != var2.hasServer()) {
            return false;
         } else {
            return this.hasServer() && !this.getServer().equals(var2.getServer()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasAnnouncement()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getAnnouncement().hashCode();
      }

      if (this.hasServer()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getServer().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GlobalAnnouncement parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GlobalAnnouncement parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GlobalAnnouncement parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GlobalAnnouncement parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GlobalAnnouncement parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GlobalAnnouncement parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GlobalAnnouncement parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GlobalAnnouncement parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GlobalAnnouncement parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GlobalAnnouncement parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GlobalAnnouncement parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GlobalAnnouncement parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GlobalAnnouncement.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GlobalAnnouncement.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GlobalAnnouncement.Builder newBuilder(GlobalAnnouncement var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GlobalAnnouncement.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GlobalAnnouncement.Builder() : new GlobalAnnouncement.Builder().mergeFrom(this);
   }

   protected GlobalAnnouncement.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GlobalAnnouncement.Builder(var1);
   }

   public static GlobalAnnouncement getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GlobalAnnouncement> parser() {
      return PARSER;
   }

   @Override
   public Parser<GlobalAnnouncement> getParserForType() {
      return PARSER;
   }

   public GlobalAnnouncement getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GlobalAnnouncement.Builder> implements GlobalAnnouncementOrBuilder {
      private int bitField0_;
      private Announcement announcement_;
      private SingleFieldBuilderV3<Announcement, Announcement.Builder, AnnouncementOrBuilder> announcementBuilder_;
      private ServerCard server_;
      private SingleFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> serverBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GlobalAnnouncement.class, GlobalAnnouncement.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GlobalAnnouncement.alwaysUseFieldBuilders) {
            this.getAnnouncementFieldBuilder();
            this.getServerFieldBuilder();
         }
      }

      public GlobalAnnouncement.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.announcement_ = null;
         if (this.announcementBuilder_ != null) {
            this.announcementBuilder_.dispose();
            this.announcementBuilder_ = null;
         }

         this.server_ = null;
         if (this.serverBuilder_ != null) {
            this.serverBuilder_.dispose();
            this.serverBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_GlobalAnnouncement_descriptor;
      }

      public GlobalAnnouncement getDefaultInstanceForType() {
         return GlobalAnnouncement.getDefaultInstance();
      }

      public GlobalAnnouncement build() {
         GlobalAnnouncement var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GlobalAnnouncement buildPartial() {
         GlobalAnnouncement var1 = new GlobalAnnouncement(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GlobalAnnouncement var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.announcement_ = this.announcementBuilder_ == null ? this.announcement_ : this.announcementBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.server_ = this.serverBuilder_ == null ? this.server_ : this.serverBuilder_.build();
            var3 |= 2;
         }

         GlobalAnnouncement var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public GlobalAnnouncement.Builder clone() {
         return (GlobalAnnouncement.Builder)super.clone();
      }

      public GlobalAnnouncement.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GlobalAnnouncement.Builder)super.setField(var1, var2);
      }

      public GlobalAnnouncement.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GlobalAnnouncement.Builder)super.clearField(var1);
      }

      public GlobalAnnouncement.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GlobalAnnouncement.Builder)super.clearOneof(var1);
      }

      public GlobalAnnouncement.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GlobalAnnouncement.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GlobalAnnouncement.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GlobalAnnouncement.Builder)super.addRepeatedField(var1, var2);
      }

      public GlobalAnnouncement.Builder mergeFrom(Message var1) {
         if (var1 instanceof GlobalAnnouncement) {
            return this.mergeFrom((GlobalAnnouncement)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GlobalAnnouncement.Builder mergeFrom(GlobalAnnouncement var1) {
         if (var1 == GlobalAnnouncement.getDefaultInstance()) {
            return this;
         }

         if (var1.hasAnnouncement()) {
            this.mergeAnnouncement(var1.getAnnouncement());
         }

         if (var1.hasServer()) {
            this.mergeServer(var1.getServer());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GlobalAnnouncement.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getAnnouncementFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getServerFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public boolean hasAnnouncement() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Announcement getAnnouncement() {
         if (this.announcementBuilder_ == null) {
            return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
         } else {
            return this.announcementBuilder_.getMessage();
         }
      }

      public GlobalAnnouncement.Builder setAnnouncement(Announcement var1) {
         if (this.announcementBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.announcement_ = var1;
         } else {
            this.announcementBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GlobalAnnouncement.Builder setAnnouncement(Announcement.Builder var1) {
         if (this.announcementBuilder_ == null) {
            this.announcement_ = var1.build();
         } else {
            this.announcementBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GlobalAnnouncement.Builder mergeAnnouncement(Announcement var1) {
         if (this.announcementBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.announcement_ != null && this.announcement_ != Announcement.getDefaultInstance()) {
               this.getAnnouncementBuilder().mergeFrom(var1);
            } else {
               this.announcement_ = var1;
            }
         } else {
            this.announcementBuilder_.mergeFrom(var1);
         }

         if (this.announcement_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public GlobalAnnouncement.Builder clearAnnouncement() {
         this.bitField0_ &= -2;
         this.announcement_ = null;
         if (this.announcementBuilder_ != null) {
            this.announcementBuilder_.dispose();
            this.announcementBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Announcement.Builder getAnnouncementBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getAnnouncementFieldBuilder().getBuilder();
      }

      @Override
      public AnnouncementOrBuilder getAnnouncementOrBuilder() {
         if (this.announcementBuilder_ != null) {
            return this.announcementBuilder_.getMessageOrBuilder();
         } else {
            return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
         }
      }

      private SingleFieldBuilderV3<Announcement, Announcement.Builder, AnnouncementOrBuilder> getAnnouncementFieldBuilder() {
         if (this.announcementBuilder_ == null) {
            this.announcementBuilder_ = new SingleFieldBuilderV3<>(this.getAnnouncement(), this.getParentForChildren(), this.isClean());
            this.announcement_ = null;
         }

         return this.announcementBuilder_;
      }

      @Override
      public boolean hasServer() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ServerCard getServer() {
         if (this.serverBuilder_ == null) {
            return this.server_ == null ? ServerCard.getDefaultInstance() : this.server_;
         } else {
            return this.serverBuilder_.getMessage();
         }
      }

      public GlobalAnnouncement.Builder setServer(ServerCard var1) {
         if (this.serverBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.server_ = var1;
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GlobalAnnouncement.Builder setServer(ServerCard.Builder var1) {
         if (this.serverBuilder_ == null) {
            this.server_ = var1.build();
         } else {
            this.serverBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GlobalAnnouncement.Builder mergeServer(ServerCard var1) {
         if (this.serverBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.server_ != null && this.server_ != ServerCard.getDefaultInstance()) {
               this.getServerBuilder().mergeFrom(var1);
            } else {
               this.server_ = var1;
            }
         } else {
            this.serverBuilder_.mergeFrom(var1);
         }

         if (this.server_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public GlobalAnnouncement.Builder clearServer() {
         this.bitField0_ &= -3;
         this.server_ = null;
         if (this.serverBuilder_ != null) {
            this.serverBuilder_.dispose();
            this.serverBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ServerCard.Builder getServerBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getServerFieldBuilder().getBuilder();
      }

      @Override
      public ServerCardOrBuilder getServerOrBuilder() {
         if (this.serverBuilder_ != null) {
            return this.serverBuilder_.getMessageOrBuilder();
         } else {
            return this.server_ == null ? ServerCard.getDefaultInstance() : this.server_;
         }
      }

      private SingleFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> getServerFieldBuilder() {
         if (this.serverBuilder_ == null) {
            this.serverBuilder_ = new SingleFieldBuilderV3<>(this.getServer(), this.getParentForChildren(), this.isClean());
            this.server_ = null;
         }

         return this.serverBuilder_;
      }

      public final GlobalAnnouncement.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GlobalAnnouncement.Builder)super.setUnknownFields(var1);
      }

      public final GlobalAnnouncement.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GlobalAnnouncement.Builder)super.mergeUnknownFields(var1);
      }
   }
}
