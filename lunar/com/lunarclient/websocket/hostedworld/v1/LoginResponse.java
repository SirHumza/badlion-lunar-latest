package com.lunarclient.websocket.hostedworld.v1;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
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
   public static final int HOSTING_ENABLED_FIELD_NUMBER = 1;
   private boolean hostingEnabled_ = false;
   public static final int JOINING_ENABLED_FIELD_NUMBER = 2;
   private boolean joiningEnabled_ = false;
   public static final int MAX_WORLD_PLAYER_COUNT_FIELD_NUMBER = 3;
   private int maxWorldPlayerCount_ = 0;
   public static final int PING_REQUESTS_FIELD_NUMBER = 4;
   private List<AddressAndPort> pingRequests_;
   public static final int MULTIPLAYER_REFRESH_INTERVAL_SECONDS_FIELD_NUMBER = 5;
   private int multiplayerRefreshIntervalSeconds_ = 0;
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
      this.pingRequests_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public boolean getHostingEnabled() {
      return this.hostingEnabled_;
   }

   @Override
   public boolean getJoiningEnabled() {
      return this.joiningEnabled_;
   }

   @Override
   public int getMaxWorldPlayerCount() {
      return this.maxWorldPlayerCount_;
   }

   @Override
   public List<AddressAndPort> getPingRequestsList() {
      return this.pingRequests_;
   }

   @Override
   public List<? extends AddressAndPortOrBuilder> getPingRequestsOrBuilderList() {
      return this.pingRequests_;
   }

   @Override
   public int getPingRequestsCount() {
      return this.pingRequests_.size();
   }

   @Override
   public AddressAndPort getPingRequests(int var1) {
      return this.pingRequests_.get(var1);
   }

   @Override
   public AddressAndPortOrBuilder getPingRequestsOrBuilder(int var1) {
      return this.pingRequests_.get(var1);
   }

   @Override
   public int getMultiplayerRefreshIntervalSeconds() {
      return this.multiplayerRefreshIntervalSeconds_;
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
      if (this.hostingEnabled_) {
         var1.writeBool(1, this.hostingEnabled_);
      }

      if (this.joiningEnabled_) {
         var1.writeBool(2, this.joiningEnabled_);
      }

      if (this.maxWorldPlayerCount_ != 0) {
         var1.writeInt32(3, this.maxWorldPlayerCount_);
      }

      for (int var2 = 0; var2 < this.pingRequests_.size(); var2++) {
         var1.writeMessage(4, this.pingRequests_.get(var2));
      }

      if (this.multiplayerRefreshIntervalSeconds_ != 0) {
         var1.writeInt32(5, this.multiplayerRefreshIntervalSeconds_);
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
      if (this.hostingEnabled_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.hostingEnabled_);
      }

      if (this.joiningEnabled_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.joiningEnabled_);
      }

      if (this.maxWorldPlayerCount_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.maxWorldPlayerCount_);
      }

      for (int var2 = 0; var2 < this.pingRequests_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.pingRequests_.get(var2));
      }

      if (this.multiplayerRefreshIntervalSeconds_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.multiplayerRefreshIntervalSeconds_);
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
         if (this.getHostingEnabled() != var2.getHostingEnabled()) {
            return false;
         } else if (this.getJoiningEnabled() != var2.getJoiningEnabled()) {
            return false;
         } else if (this.getMaxWorldPlayerCount() != var2.getMaxWorldPlayerCount()) {
            return false;
         } else if (!this.getPingRequestsList().equals(var2.getPingRequestsList())) {
            return false;
         } else {
            return this.getMultiplayerRefreshIntervalSeconds() != var2.getMultiplayerRefreshIntervalSeconds()
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHostingEnabled());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getJoiningEnabled());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getMaxWorldPlayerCount();
      if (this.getPingRequestsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getPingRequestsList().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getMultiplayerRefreshIntervalSeconds();
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
      private boolean hostingEnabled_;
      private boolean joiningEnabled_;
      private int maxWorldPlayerCount_;
      private List<AddressAndPort> pingRequests_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> pingRequestsBuilder_;
      private int multiplayerRefreshIntervalSeconds_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.hostingEnabled_ = false;
         this.joiningEnabled_ = false;
         this.maxWorldPlayerCount_ = 0;
         if (this.pingRequestsBuilder_ == null) {
            this.pingRequests_ = Collections.emptyList();
         } else {
            this.pingRequests_ = null;
            this.pingRequestsBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.multiplayerRefreshIntervalSeconds_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_LoginResponse_descriptor;
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
         if (this.pingRequestsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.pingRequests_ = Collections.unmodifiableList(this.pingRequests_);
               this.bitField0_ &= -9;
            }

            var1.pingRequests_ = this.pingRequests_;
         } else {
            var1.pingRequests_ = this.pingRequestsBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.hostingEnabled_ = this.hostingEnabled_;
         }

         if ((var2 & 2) != 0) {
            var1.joiningEnabled_ = this.joiningEnabled_;
         }

         if ((var2 & 4) != 0) {
            var1.maxWorldPlayerCount_ = this.maxWorldPlayerCount_;
         }

         if ((var2 & 16) != 0) {
            var1.multiplayerRefreshIntervalSeconds_ = this.multiplayerRefreshIntervalSeconds_;
         }
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

         if (var1.getHostingEnabled()) {
            this.setHostingEnabled(var1.getHostingEnabled());
         }

         if (var1.getJoiningEnabled()) {
            this.setJoiningEnabled(var1.getJoiningEnabled());
         }

         if (var1.getMaxWorldPlayerCount() != 0) {
            this.setMaxWorldPlayerCount(var1.getMaxWorldPlayerCount());
         }

         if (this.pingRequestsBuilder_ == null) {
            if (!var1.pingRequests_.isEmpty()) {
               if (this.pingRequests_.isEmpty()) {
                  this.pingRequests_ = var1.pingRequests_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensurePingRequestsIsMutable();
                  this.pingRequests_.addAll(var1.pingRequests_);
               }

               this.onChanged();
            }
         } else if (!var1.pingRequests_.isEmpty()) {
            if (this.pingRequestsBuilder_.isEmpty()) {
               this.pingRequestsBuilder_.dispose();
               this.pingRequestsBuilder_ = null;
               this.pingRequests_ = var1.pingRequests_;
               this.bitField0_ &= -9;
               this.pingRequestsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getPingRequestsFieldBuilder() : null;
            } else {
               this.pingRequestsBuilder_.addAllMessages(var1.pingRequests_);
            }
         }

         if (var1.getMultiplayerRefreshIntervalSeconds() != 0) {
            this.setMultiplayerRefreshIntervalSeconds(var1.getMultiplayerRefreshIntervalSeconds());
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
                     this.hostingEnabled_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.joiningEnabled_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.maxWorldPlayerCount_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     AddressAndPort var5 = var1.readMessage(AddressAndPort.parser(), var2);
                     if (this.pingRequestsBuilder_ == null) {
                        this.ensurePingRequestsIsMutable();
                        this.pingRequests_.add(var5);
                     } else {
                        this.pingRequestsBuilder_.addMessage(var5);
                     }
                     break;
                  case 40:
                     this.multiplayerRefreshIntervalSeconds_ = var1.readInt32();
                     this.bitField0_ |= 16;
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
      public boolean getHostingEnabled() {
         return this.hostingEnabled_;
      }

      public LoginResponse.Builder setHostingEnabled(boolean var1) {
         this.hostingEnabled_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearHostingEnabled() {
         this.bitField0_ &= -2;
         this.hostingEnabled_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getJoiningEnabled() {
         return this.joiningEnabled_;
      }

      public LoginResponse.Builder setJoiningEnabled(boolean var1) {
         this.joiningEnabled_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearJoiningEnabled() {
         this.bitField0_ &= -3;
         this.joiningEnabled_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getMaxWorldPlayerCount() {
         return this.maxWorldPlayerCount_;
      }

      public LoginResponse.Builder setMaxWorldPlayerCount(int var1) {
         this.maxWorldPlayerCount_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearMaxWorldPlayerCount() {
         this.bitField0_ &= -5;
         this.maxWorldPlayerCount_ = 0;
         this.onChanged();
         return this;
      }

      private void ensurePingRequestsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.pingRequests_ = new ArrayList<>(this.pingRequests_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<AddressAndPort> getPingRequestsList() {
         return this.pingRequestsBuilder_ == null ? Collections.unmodifiableList(this.pingRequests_) : this.pingRequestsBuilder_.getMessageList();
      }

      @Override
      public int getPingRequestsCount() {
         return this.pingRequestsBuilder_ == null ? this.pingRequests_.size() : this.pingRequestsBuilder_.getCount();
      }

      @Override
      public AddressAndPort getPingRequests(int var1) {
         return this.pingRequestsBuilder_ == null ? this.pingRequests_.get(var1) : this.pingRequestsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setPingRequests(int var1, AddressAndPort var2) {
         if (this.pingRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingRequestsIsMutable();
            this.pingRequests_.set(var1, var2);
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setPingRequests(int var1, AddressAndPort.Builder var2) {
         if (this.pingRequestsBuilder_ == null) {
            this.ensurePingRequestsIsMutable();
            this.pingRequests_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addPingRequests(AddressAndPort var1) {
         if (this.pingRequestsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePingRequestsIsMutable();
            this.pingRequests_.add(var1);
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addPingRequests(int var1, AddressAndPort var2) {
         if (this.pingRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingRequestsIsMutable();
            this.pingRequests_.add(var1, var2);
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addPingRequests(AddressAndPort.Builder var1) {
         if (this.pingRequestsBuilder_ == null) {
            this.ensurePingRequestsIsMutable();
            this.pingRequests_.add(var1.build());
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addPingRequests(int var1, AddressAndPort.Builder var2) {
         if (this.pingRequestsBuilder_ == null) {
            this.ensurePingRequestsIsMutable();
            this.pingRequests_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllPingRequests(Iterable<? extends AddressAndPort> var1) {
         if (this.pingRequestsBuilder_ == null) {
            this.ensurePingRequestsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.pingRequests_);
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearPingRequests() {
         if (this.pingRequestsBuilder_ == null) {
            this.pingRequests_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removePingRequests(int var1) {
         if (this.pingRequestsBuilder_ == null) {
            this.ensurePingRequestsIsMutable();
            this.pingRequests_.remove(var1);
            this.onChanged();
         } else {
            this.pingRequestsBuilder_.remove(var1);
         }

         return this;
      }

      public AddressAndPort.Builder getPingRequestsBuilder(int var1) {
         return this.getPingRequestsFieldBuilder().getBuilder(var1);
      }

      @Override
      public AddressAndPortOrBuilder getPingRequestsOrBuilder(int var1) {
         return this.pingRequestsBuilder_ == null ? this.pingRequests_.get(var1) : this.pingRequestsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends AddressAndPortOrBuilder> getPingRequestsOrBuilderList() {
         return this.pingRequestsBuilder_ != null ? this.pingRequestsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pingRequests_);
      }

      public AddressAndPort.Builder addPingRequestsBuilder() {
         return this.getPingRequestsFieldBuilder().addBuilder(AddressAndPort.getDefaultInstance());
      }

      public AddressAndPort.Builder addPingRequestsBuilder(int var1) {
         return this.getPingRequestsFieldBuilder().addBuilder(var1, AddressAndPort.getDefaultInstance());
      }

      public List<AddressAndPort.Builder> getPingRequestsBuilderList() {
         return this.getPingRequestsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getPingRequestsFieldBuilder() {
         if (this.pingRequestsBuilder_ == null) {
            this.pingRequestsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.pingRequests_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
            );
            this.pingRequests_ = null;
         }

         return this.pingRequestsBuilder_;
      }

      @Override
      public int getMultiplayerRefreshIntervalSeconds() {
         return this.multiplayerRefreshIntervalSeconds_;
      }

      public LoginResponse.Builder setMultiplayerRefreshIntervalSeconds(int var1) {
         this.multiplayerRefreshIntervalSeconds_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearMultiplayerRefreshIntervalSeconds() {
         this.bitField0_ &= -17;
         this.multiplayerRefreshIntervalSeconds_ = 0;
         this.onChanged();
         return this;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
