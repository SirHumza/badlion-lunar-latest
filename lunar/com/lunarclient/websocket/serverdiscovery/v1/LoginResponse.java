package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoginResponse extends GeneratedMessageV3 implements LoginResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TOTAL_SERVERS_FIELD_NUMBER = 1;
   private int totalServers_ = 0;
   public static final int ANNOUNCEMENT_FIELD_NUMBER = 2;
   private GlobalAnnouncement announcement_;
   public static final int GAME_TYPES_FIELD_NUMBER = 3;
   private List<ServerGameType> gameTypes_;
   private byte memoizedIsInitialized = -1;
   private static final LoginResponse DEFAULT_INSTANCE = new LoginResponse();
   private static final Parser<LoginResponse> PARSER = new AbstractParser<LoginResponse>() {
      public LoginResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoginResponse.Builder var3 = LoginResponse.newBuilder();

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

   private LoginResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoginResponse() {
      this.gameTypes_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public int getTotalServers() {
      return this.totalServers_;
   }

   @Override
   public boolean hasAnnouncement() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public GlobalAnnouncement getAnnouncement() {
      return this.announcement_ == null ? GlobalAnnouncement.getDefaultInstance() : this.announcement_;
   }

   @Override
   public GlobalAnnouncementOrBuilder getAnnouncementOrBuilder() {
      return this.announcement_ == null ? GlobalAnnouncement.getDefaultInstance() : this.announcement_;
   }

   @Override
   public List<ServerGameType> getGameTypesList() {
      return this.gameTypes_;
   }

   @Override
   public List<? extends ServerGameTypeOrBuilder> getGameTypesOrBuilderList() {
      return this.gameTypes_;
   }

   @Override
   public int getGameTypesCount() {
      return this.gameTypes_.size();
   }

   @Override
   public ServerGameType getGameTypes(int var1) {
      return this.gameTypes_.get(var1);
   }

   @Override
   public ServerGameTypeOrBuilder getGameTypesOrBuilder(int var1) {
      return this.gameTypes_.get(var1);
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
      if (this.totalServers_ != 0) {
         var1.writeInt32(1, this.totalServers_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getAnnouncement());
      }

      for (int var2 = 0; var2 < this.gameTypes_.size(); var2++) {
         var1.writeMessage(3, this.gameTypes_.get(var2));
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
      if (this.totalServers_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.totalServers_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getAnnouncement());
      }

      for (int var2 = 0; var2 < this.gameTypes_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.gameTypes_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoginResponse)) {
         return super.equals(var1);
      } else {
         LoginResponse var2 = (LoginResponse)var1;
         if (this.getTotalServers() != var2.getTotalServers()) {
            return false;
         } else if (this.hasAnnouncement() != var2.hasAnnouncement()) {
            return false;
         } else if (this.hasAnnouncement() && !this.getAnnouncement().equals(var2.getAnnouncement())) {
            return false;
         } else {
            return !this.getGameTypesList().equals(var2.getGameTypesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getTotalServers();
      if (this.hasAnnouncement()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getAnnouncement().hashCode();
      }

      if (this.getGameTypesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getGameTypesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoginResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoginResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoginResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoginResponse.Builder newBuilder(LoginResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoginResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoginResponse.Builder() : new LoginResponse.Builder().mergeFrom(this);
   }

   protected LoginResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoginResponse.Builder(var1);
   }

   public static LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoginResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoginResponse> getParserForType() {
      return PARSER;
   }

   public LoginResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoginResponse.Builder> implements LoginResponseOrBuilder {
      private int bitField0_;
      private int totalServers_;
      private GlobalAnnouncement announcement_;
      private SingleFieldBuilderV3<GlobalAnnouncement, GlobalAnnouncement.Builder, GlobalAnnouncementOrBuilder> announcementBuilder_;
      private List<ServerGameType> gameTypes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerGameType, ServerGameType.Builder, ServerGameTypeOrBuilder> gameTypesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LoginResponse.alwaysUseFieldBuilders) {
            this.getAnnouncementFieldBuilder();
            this.getGameTypesFieldBuilder();
         }
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.totalServers_ = 0;
         this.announcement_ = null;
         if (this.announcementBuilder_ != null) {
            this.announcementBuilder_.dispose();
            this.announcementBuilder_ = null;
         }

         if (this.gameTypesBuilder_ == null) {
            this.gameTypes_ = Collections.emptyList();
         } else {
            this.gameTypes_ = null;
            this.gameTypesBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_descriptor;
      }

      public LoginResponse getDefaultInstanceForType() {
         return LoginResponse.getDefaultInstance();
      }

      public LoginResponse build() {
         LoginResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoginResponse buildPartial() {
         LoginResponse var1 = new LoginResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoginResponse var1) {
         if (this.gameTypesBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.gameTypes_ = Collections.unmodifiableList(this.gameTypes_);
               this.bitField0_ &= -5;
            }

            var1.gameTypes_ = this.gameTypes_;
         } else {
            var1.gameTypes_ = this.gameTypesBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.totalServers_ = this.totalServers_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.announcement_ = this.announcementBuilder_ == null ? this.announcement_ : this.announcementBuilder_.build();
            var3 |= 1;
         }

         LoginResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LoginResponse.Builder clone() {
         return (LoginResponse.Builder)super.clone();
      }

      public LoginResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.setField(var1, var2);
      }

      public LoginResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoginResponse.Builder)super.clearField(var1);
      }

      public LoginResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoginResponse.Builder)super.clearOneof(var1);
      }

      public LoginResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoginResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoginResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoginResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoginResponse) {
            return this.mergeFrom((LoginResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoginResponse.Builder mergeFrom(LoginResponse var1) {
         if (var1 == LoginResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.getTotalServers() != 0) {
            this.setTotalServers(var1.getTotalServers());
         }

         if (var1.hasAnnouncement()) {
            this.mergeAnnouncement(var1.getAnnouncement());
         }

         if (this.gameTypesBuilder_ == null) {
            if (!var1.gameTypes_.isEmpty()) {
               if (this.gameTypes_.isEmpty()) {
                  this.gameTypes_ = var1.gameTypes_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureGameTypesIsMutable();
                  this.gameTypes_.addAll(var1.gameTypes_);
               }

               this.onChanged();
            }
         } else if (!var1.gameTypes_.isEmpty()) {
            if (this.gameTypesBuilder_.isEmpty()) {
               this.gameTypesBuilder_.dispose();
               this.gameTypesBuilder_ = null;
               this.gameTypes_ = var1.gameTypes_;
               this.bitField0_ &= -5;
               this.gameTypesBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getGameTypesFieldBuilder() : null;
            } else {
               this.gameTypesBuilder_.addAllMessages(var1.gameTypes_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoginResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.totalServers_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getAnnouncementFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     ServerGameType var5 = var1.readMessage(ServerGameType.parser(), var2);
                     if (this.gameTypesBuilder_ == null) {
                        this.ensureGameTypesIsMutable();
                        this.gameTypes_.add(var5);
                     } else {
                        this.gameTypesBuilder_.addMessage(var5);
                     }
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
      public int getTotalServers() {
         return this.totalServers_;
      }

      public LoginResponse.Builder setTotalServers(int var1) {
         this.totalServers_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearTotalServers() {
         this.bitField0_ &= -2;
         this.totalServers_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasAnnouncement() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public GlobalAnnouncement getAnnouncement() {
         if (this.announcementBuilder_ == null) {
            return this.announcement_ == null ? GlobalAnnouncement.getDefaultInstance() : this.announcement_;
         } else {
            return this.announcementBuilder_.getMessage();
         }
      }

      public LoginResponse.Builder setAnnouncement(GlobalAnnouncement var1) {
         if (this.announcementBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.announcement_ = var1;
         } else {
            this.announcementBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder setAnnouncement(GlobalAnnouncement.Builder var1) {
         if (this.announcementBuilder_ == null) {
            this.announcement_ = var1.build();
         } else {
            this.announcementBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder mergeAnnouncement(GlobalAnnouncement var1) {
         if (this.announcementBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.announcement_ != null && this.announcement_ != GlobalAnnouncement.getDefaultInstance()) {
               this.getAnnouncementBuilder().mergeFrom(var1);
            } else {
               this.announcement_ = var1;
            }
         } else {
            this.announcementBuilder_.mergeFrom(var1);
         }

         if (this.announcement_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public LoginResponse.Builder clearAnnouncement() {
         this.bitField0_ &= -3;
         this.announcement_ = null;
         if (this.announcementBuilder_ != null) {
            this.announcementBuilder_.dispose();
            this.announcementBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public GlobalAnnouncement.Builder getAnnouncementBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getAnnouncementFieldBuilder().getBuilder();
      }

      @Override
      public GlobalAnnouncementOrBuilder getAnnouncementOrBuilder() {
         if (this.announcementBuilder_ != null) {
            return this.announcementBuilder_.getMessageOrBuilder();
         } else {
            return this.announcement_ == null ? GlobalAnnouncement.getDefaultInstance() : this.announcement_;
         }
      }

      private SingleFieldBuilderV3<GlobalAnnouncement, GlobalAnnouncement.Builder, GlobalAnnouncementOrBuilder> getAnnouncementFieldBuilder() {
         if (this.announcementBuilder_ == null) {
            this.announcementBuilder_ = new SingleFieldBuilderV3<>(this.getAnnouncement(), this.getParentForChildren(), this.isClean());
            this.announcement_ = null;
         }

         return this.announcementBuilder_;
      }

      private void ensureGameTypesIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.gameTypes_ = new ArrayList<>(this.gameTypes_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<ServerGameType> getGameTypesList() {
         return this.gameTypesBuilder_ == null ? Collections.unmodifiableList(this.gameTypes_) : this.gameTypesBuilder_.getMessageList();
      }

      @Override
      public int getGameTypesCount() {
         return this.gameTypesBuilder_ == null ? this.gameTypes_.size() : this.gameTypesBuilder_.getCount();
      }

      @Override
      public ServerGameType getGameTypes(int var1) {
         return this.gameTypesBuilder_ == null ? this.gameTypes_.get(var1) : this.gameTypesBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setGameTypes(int var1, ServerGameType var2) {
         if (this.gameTypesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureGameTypesIsMutable();
            this.gameTypes_.set(var1, var2);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setGameTypes(int var1, ServerGameType.Builder var2) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.gameTypesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addGameTypes(ServerGameType var1) {
         if (this.gameTypesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addGameTypes(int var1, ServerGameType var2) {
         if (this.gameTypesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1, var2);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addGameTypes(ServerGameType.Builder var1) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1.build());
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addGameTypes(int var1, ServerGameType.Builder var2) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllGameTypes(Iterable<? extends ServerGameType> var1) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.gameTypes_);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearGameTypes() {
         if (this.gameTypesBuilder_ == null) {
            this.gameTypes_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.gameTypesBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeGameTypes(int var1) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.remove(var1);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.remove(var1);
         }

         return this;
      }

      public ServerGameType.Builder getGameTypesBuilder(int var1) {
         return this.getGameTypesFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerGameTypeOrBuilder getGameTypesOrBuilder(int var1) {
         return this.gameTypesBuilder_ == null ? this.gameTypes_.get(var1) : this.gameTypesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerGameTypeOrBuilder> getGameTypesOrBuilderList() {
         return this.gameTypesBuilder_ != null ? this.gameTypesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gameTypes_);
      }

      public ServerGameType.Builder addGameTypesBuilder() {
         return this.getGameTypesFieldBuilder().addBuilder(ServerGameType.getDefaultInstance());
      }

      public ServerGameType.Builder addGameTypesBuilder(int var1) {
         return this.getGameTypesFieldBuilder().addBuilder(var1, ServerGameType.getDefaultInstance());
      }

      public List<ServerGameType.Builder> getGameTypesBuilderList() {
         return this.getGameTypesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerGameType, ServerGameType.Builder, ServerGameTypeOrBuilder> getGameTypesFieldBuilder() {
         if (this.gameTypesBuilder_ == null) {
            this.gameTypesBuilder_ = new RepeatedFieldBuilderV3<>(this.gameTypes_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.gameTypes_ = null;
         }

         return this.gameTypesBuilder_;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
