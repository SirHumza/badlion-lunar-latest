package com.lunarclient.websocket.friend.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoginResponse extends GeneratedMessageV3 implements LoginResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CURRENT_STATUS_FIELD_NUMBER = 1;
   private int currentStatus_ = 0;
   public static final int ONLINE_FRIENDS_FIELD_NUMBER = 11;
   private List<OnlineFriend> onlineFriends_;
   public static final int OFFLINE_FRIENDS_FIELD_NUMBER = 2;
   private List<OfflineFriend> offlineFriends_;
   public static final int ALLOW_FRIEND_REQUESTS_FIELD_NUMBER = 3;
   private boolean allowFriendRequests_ = false;
   public static final int OUTBOUND_FRIEND_REQUESTS_FIELD_NUMBER = 4;
   private List<UuidAndUsername> outboundFriendRequests_;
   public static final int INBOUND_FRIEND_REQUESTS_FIELD_NUMBER = 5;
   private List<UuidAndUsername> inboundFriendRequests_;
   public static final int OUTBOUND_FRIEND_ADD_REQUESTS_FIELD_NUMBER = 6;
   private List<FriendRequest> outboundFriendAddRequests_;
   public static final int INBOUND_FRIEND_ADD_REQUESTS_FIELD_NUMBER = 7;
   private List<FriendRequest> inboundFriendAddRequests_;
   public static final int PINNED_FRIENDS_FIELD_NUMBER = 8;
   private List<Uuid> pinnedFriends_;
   public static final int LAST_SEEN_VISIBILITY_FIELD_NUMBER = 9;
   private int lastSeenVisibility_ = 0;
   public static final int COUNTRY_FLAG_VISIBILITY_FIELD_NUMBER = 10;
   private int countryFlagVisibility_ = 0;
   public static final int USER_CREATED_AT_FIELD_NUMBER = 12;
   private Timestamp userCreatedAt_;
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
      this.currentStatus_ = 0;
      this.onlineFriends_ = Collections.emptyList();
      this.offlineFriends_ = Collections.emptyList();
      this.outboundFriendRequests_ = Collections.emptyList();
      this.inboundFriendRequests_ = Collections.emptyList();
      this.outboundFriendAddRequests_ = Collections.emptyList();
      this.inboundFriendAddRequests_ = Collections.emptyList();
      this.pinnedFriends_ = Collections.emptyList();
      this.lastSeenVisibility_ = 0;
      this.countryFlagVisibility_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public int getCurrentStatusValue() {
      return this.currentStatus_;
   }

   @Override
   public OnlineFriendStatus getCurrentStatus() {
      OnlineFriendStatus var1 = OnlineFriendStatus.forNumber(this.currentStatus_);
      return var1 == null ? OnlineFriendStatus.UNRECOGNIZED : var1;
   }

   @Override
   public List<OnlineFriend> getOnlineFriendsList() {
      return this.onlineFriends_;
   }

   @Override
   public List<? extends OnlineFriendOrBuilder> getOnlineFriendsOrBuilderList() {
      return this.onlineFriends_;
   }

   @Override
   public int getOnlineFriendsCount() {
      return this.onlineFriends_.size();
   }

   @Override
   public OnlineFriend getOnlineFriends(int var1) {
      return this.onlineFriends_.get(var1);
   }

   @Override
   public OnlineFriendOrBuilder getOnlineFriendsOrBuilder(int var1) {
      return this.onlineFriends_.get(var1);
   }

   @Override
   public List<OfflineFriend> getOfflineFriendsList() {
      return this.offlineFriends_;
   }

   @Override
   public List<? extends OfflineFriendOrBuilder> getOfflineFriendsOrBuilderList() {
      return this.offlineFriends_;
   }

   @Override
   public int getOfflineFriendsCount() {
      return this.offlineFriends_.size();
   }

   @Override
   public OfflineFriend getOfflineFriends(int var1) {
      return this.offlineFriends_.get(var1);
   }

   @Override
   public OfflineFriendOrBuilder getOfflineFriendsOrBuilder(int var1) {
      return this.offlineFriends_.get(var1);
   }

   @Override
   public boolean getAllowFriendRequests() {
      return this.allowFriendRequests_;
   }

   @Deprecated
   @Override
   public List<UuidAndUsername> getOutboundFriendRequestsList() {
      return this.outboundFriendRequests_;
   }

   @Deprecated
   @Override
   public List<? extends UuidAndUsernameOrBuilder> getOutboundFriendRequestsOrBuilderList() {
      return this.outboundFriendRequests_;
   }

   @Deprecated
   @Override
   public int getOutboundFriendRequestsCount() {
      return this.outboundFriendRequests_.size();
   }

   @Deprecated
   @Override
   public UuidAndUsername getOutboundFriendRequests(int var1) {
      return this.outboundFriendRequests_.get(var1);
   }

   @Deprecated
   @Override
   public UuidAndUsernameOrBuilder getOutboundFriendRequestsOrBuilder(int var1) {
      return this.outboundFriendRequests_.get(var1);
   }

   @Deprecated
   @Override
   public List<UuidAndUsername> getInboundFriendRequestsList() {
      return this.inboundFriendRequests_;
   }

   @Deprecated
   @Override
   public List<? extends UuidAndUsernameOrBuilder> getInboundFriendRequestsOrBuilderList() {
      return this.inboundFriendRequests_;
   }

   @Deprecated
   @Override
   public int getInboundFriendRequestsCount() {
      return this.inboundFriendRequests_.size();
   }

   @Deprecated
   @Override
   public UuidAndUsername getInboundFriendRequests(int var1) {
      return this.inboundFriendRequests_.get(var1);
   }

   @Deprecated
   @Override
   public UuidAndUsernameOrBuilder getInboundFriendRequestsOrBuilder(int var1) {
      return this.inboundFriendRequests_.get(var1);
   }

   @Override
   public List<FriendRequest> getOutboundFriendAddRequestsList() {
      return this.outboundFriendAddRequests_;
   }

   @Override
   public List<? extends FriendRequestOrBuilder> getOutboundFriendAddRequestsOrBuilderList() {
      return this.outboundFriendAddRequests_;
   }

   @Override
   public int getOutboundFriendAddRequestsCount() {
      return this.outboundFriendAddRequests_.size();
   }

   @Override
   public FriendRequest getOutboundFriendAddRequests(int var1) {
      return this.outboundFriendAddRequests_.get(var1);
   }

   @Override
   public FriendRequestOrBuilder getOutboundFriendAddRequestsOrBuilder(int var1) {
      return this.outboundFriendAddRequests_.get(var1);
   }

   @Override
   public List<FriendRequest> getInboundFriendAddRequestsList() {
      return this.inboundFriendAddRequests_;
   }

   @Override
   public List<? extends FriendRequestOrBuilder> getInboundFriendAddRequestsOrBuilderList() {
      return this.inboundFriendAddRequests_;
   }

   @Override
   public int getInboundFriendAddRequestsCount() {
      return this.inboundFriendAddRequests_.size();
   }

   @Override
   public FriendRequest getInboundFriendAddRequests(int var1) {
      return this.inboundFriendAddRequests_.get(var1);
   }

   @Override
   public FriendRequestOrBuilder getInboundFriendAddRequestsOrBuilder(int var1) {
      return this.inboundFriendAddRequests_.get(var1);
   }

   @Override
   public List<Uuid> getPinnedFriendsList() {
      return this.pinnedFriends_;
   }

   @Override
   public List<? extends UuidOrBuilder> getPinnedFriendsOrBuilderList() {
      return this.pinnedFriends_;
   }

   @Override
   public int getPinnedFriendsCount() {
      return this.pinnedFriends_.size();
   }

   @Override
   public Uuid getPinnedFriends(int var1) {
      return this.pinnedFriends_.get(var1);
   }

   @Override
   public UuidOrBuilder getPinnedFriendsOrBuilder(int var1) {
      return this.pinnedFriends_.get(var1);
   }

   @Override
   public int getLastSeenVisibilityValue() {
      return this.lastSeenVisibility_;
   }

   @Override
   public LastSeenVisibility getLastSeenVisibility() {
      LastSeenVisibility var1 = LastSeenVisibility.forNumber(this.lastSeenVisibility_);
      return var1 == null ? LastSeenVisibility.UNRECOGNIZED : var1;
   }

   @Override
   public int getCountryFlagVisibilityValue() {
      return this.countryFlagVisibility_;
   }

   @Override
   public CountryFlagVisibility getCountryFlagVisibility() {
      CountryFlagVisibility var1 = CountryFlagVisibility.forNumber(this.countryFlagVisibility_);
      return var1 == null ? CountryFlagVisibility.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasUserCreatedAt() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getUserCreatedAt() {
      return this.userCreatedAt_ == null ? Timestamp.getDefaultInstance() : this.userCreatedAt_;
   }

   @Override
   public TimestampOrBuilder getUserCreatedAtOrBuilder() {
      return this.userCreatedAt_ == null ? Timestamp.getDefaultInstance() : this.userCreatedAt_;
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
      if (this.currentStatus_ != OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.currentStatus_);
      }

      for (int var2 = 0; var2 < this.offlineFriends_.size(); var2++) {
         var1.writeMessage(2, this.offlineFriends_.get(var2));
      }

      if (this.allowFriendRequests_) {
         var1.writeBool(3, this.allowFriendRequests_);
      }

      for (int var3 = 0; var3 < this.outboundFriendRequests_.size(); var3++) {
         var1.writeMessage(4, this.outboundFriendRequests_.get(var3));
      }

      for (int var4 = 0; var4 < this.inboundFriendRequests_.size(); var4++) {
         var1.writeMessage(5, this.inboundFriendRequests_.get(var4));
      }

      for (int var5 = 0; var5 < this.outboundFriendAddRequests_.size(); var5++) {
         var1.writeMessage(6, this.outboundFriendAddRequests_.get(var5));
      }

      for (int var6 = 0; var6 < this.inboundFriendAddRequests_.size(); var6++) {
         var1.writeMessage(7, this.inboundFriendAddRequests_.get(var6));
      }

      for (int var7 = 0; var7 < this.pinnedFriends_.size(); var7++) {
         var1.writeMessage(8, this.pinnedFriends_.get(var7));
      }

      if (this.lastSeenVisibility_ != LastSeenVisibility.LAST_SEEN_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(9, this.lastSeenVisibility_);
      }

      if (this.countryFlagVisibility_ != CountryFlagVisibility.COUNTRY_FLAG_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(10, this.countryFlagVisibility_);
      }

      for (int var8 = 0; var8 < this.onlineFriends_.size(); var8++) {
         var1.writeMessage(11, this.onlineFriends_.get(var8));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(12, this.getUserCreatedAt());
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
      if (this.currentStatus_ != OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.currentStatus_);
      }

      for (int var2 = 0; var2 < this.offlineFriends_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.offlineFriends_.get(var2));
      }

      if (this.allowFriendRequests_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.allowFriendRequests_);
      }

      for (int var5 = 0; var5 < this.outboundFriendRequests_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.outboundFriendRequests_.get(var5));
      }

      for (int var6 = 0; var6 < this.inboundFriendRequests_.size(); var6++) {
         var1 += CodedOutputStream.computeMessageSize(5, this.inboundFriendRequests_.get(var6));
      }

      for (int var7 = 0; var7 < this.outboundFriendAddRequests_.size(); var7++) {
         var1 += CodedOutputStream.computeMessageSize(6, this.outboundFriendAddRequests_.get(var7));
      }

      for (int var8 = 0; var8 < this.inboundFriendAddRequests_.size(); var8++) {
         var1 += CodedOutputStream.computeMessageSize(7, this.inboundFriendAddRequests_.get(var8));
      }

      for (int var9 = 0; var9 < this.pinnedFriends_.size(); var9++) {
         var1 += CodedOutputStream.computeMessageSize(8, this.pinnedFriends_.get(var9));
      }

      if (this.lastSeenVisibility_ != LastSeenVisibility.LAST_SEEN_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(9, this.lastSeenVisibility_);
      }

      if (this.countryFlagVisibility_ != CountryFlagVisibility.COUNTRY_FLAG_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(10, this.countryFlagVisibility_);
      }

      for (int var10 = 0; var10 < this.onlineFriends_.size(); var10++) {
         var1 += CodedOutputStream.computeMessageSize(11, this.onlineFriends_.get(var10));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(12, this.getUserCreatedAt());
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
         if (this.currentStatus_ != var2.currentStatus_) {
            return false;
         } else if (!this.getOnlineFriendsList().equals(var2.getOnlineFriendsList())) {
            return false;
         } else if (!this.getOfflineFriendsList().equals(var2.getOfflineFriendsList())) {
            return false;
         } else if (this.getAllowFriendRequests() != var2.getAllowFriendRequests()) {
            return false;
         } else if (!this.getOutboundFriendRequestsList().equals(var2.getOutboundFriendRequestsList())) {
            return false;
         } else if (!this.getInboundFriendRequestsList().equals(var2.getInboundFriendRequestsList())) {
            return false;
         } else if (!this.getOutboundFriendAddRequestsList().equals(var2.getOutboundFriendAddRequestsList())) {
            return false;
         } else if (!this.getInboundFriendAddRequestsList().equals(var2.getInboundFriendAddRequestsList())) {
            return false;
         } else if (!this.getPinnedFriendsList().equals(var2.getPinnedFriendsList())) {
            return false;
         } else if (this.lastSeenVisibility_ != var2.lastSeenVisibility_) {
            return false;
         } else if (this.countryFlagVisibility_ != var2.countryFlagVisibility_) {
            return false;
         } else if (this.hasUserCreatedAt() != var2.hasUserCreatedAt()) {
            return false;
         } else {
            return this.hasUserCreatedAt() && !this.getUserCreatedAt().equals(var2.getUserCreatedAt())
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
      var1 = 53 * var1 + this.currentStatus_;
      if (this.getOnlineFriendsCount() > 0) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getOnlineFriendsList().hashCode();
      }

      if (this.getOfflineFriendsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getOfflineFriendsList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getAllowFriendRequests());
      if (this.getOutboundFriendRequestsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getOutboundFriendRequestsList().hashCode();
      }

      if (this.getInboundFriendRequestsCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getInboundFriendRequestsList().hashCode();
      }

      if (this.getOutboundFriendAddRequestsCount() > 0) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getOutboundFriendAddRequestsList().hashCode();
      }

      if (this.getInboundFriendAddRequestsCount() > 0) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getInboundFriendAddRequestsList().hashCode();
      }

      if (this.getPinnedFriendsCount() > 0) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getPinnedFriendsList().hashCode();
      }

      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.lastSeenVisibility_;
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.countryFlagVisibility_;
      if (this.hasUserCreatedAt()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.getUserCreatedAt().hashCode();
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
      private int currentStatus_ = 0;
      private List<OnlineFriend> onlineFriends_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OnlineFriend, OnlineFriend.Builder, OnlineFriendOrBuilder> onlineFriendsBuilder_;
      private List<OfflineFriend> offlineFriends_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OfflineFriend, OfflineFriend.Builder, OfflineFriendOrBuilder> offlineFriendsBuilder_;
      private boolean allowFriendRequests_;
      private List<UuidAndUsername> outboundFriendRequests_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> outboundFriendRequestsBuilder_;
      private List<UuidAndUsername> inboundFriendRequests_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> inboundFriendRequestsBuilder_;
      private List<FriendRequest> outboundFriendAddRequests_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<FriendRequest, FriendRequest.Builder, FriendRequestOrBuilder> outboundFriendAddRequestsBuilder_;
      private List<FriendRequest> inboundFriendAddRequests_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<FriendRequest, FriendRequest.Builder, FriendRequestOrBuilder> inboundFriendAddRequestsBuilder_;
      private List<Uuid> pinnedFriends_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> pinnedFriendsBuilder_;
      private int lastSeenVisibility_ = 0;
      private int countryFlagVisibility_ = 0;
      private Timestamp userCreatedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> userCreatedAtBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_LoginResponse_fieldAccessorTable
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
            this.getOnlineFriendsFieldBuilder();
            this.getOfflineFriendsFieldBuilder();
            this.getOutboundFriendRequestsFieldBuilder();
            this.getInboundFriendRequestsFieldBuilder();
            this.getOutboundFriendAddRequestsFieldBuilder();
            this.getInboundFriendAddRequestsFieldBuilder();
            this.getPinnedFriendsFieldBuilder();
            this.getUserCreatedAtFieldBuilder();
         }
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.currentStatus_ = 0;
         if (this.onlineFriendsBuilder_ == null) {
            this.onlineFriends_ = Collections.emptyList();
         } else {
            this.onlineFriends_ = null;
            this.onlineFriendsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         if (this.offlineFriendsBuilder_ == null) {
            this.offlineFriends_ = Collections.emptyList();
         } else {
            this.offlineFriends_ = null;
            this.offlineFriendsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         this.allowFriendRequests_ = false;
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.outboundFriendRequests_ = Collections.emptyList();
         } else {
            this.outboundFriendRequests_ = null;
            this.outboundFriendRequestsBuilder_.clear();
         }

         this.bitField0_ &= -17;
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.inboundFriendRequests_ = Collections.emptyList();
         } else {
            this.inboundFriendRequests_ = null;
            this.inboundFriendRequestsBuilder_.clear();
         }

         this.bitField0_ &= -33;
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.outboundFriendAddRequests_ = Collections.emptyList();
         } else {
            this.outboundFriendAddRequests_ = null;
            this.outboundFriendAddRequestsBuilder_.clear();
         }

         this.bitField0_ &= -65;
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.inboundFriendAddRequests_ = Collections.emptyList();
         } else {
            this.inboundFriendAddRequests_ = null;
            this.inboundFriendAddRequestsBuilder_.clear();
         }

         this.bitField0_ &= -129;
         if (this.pinnedFriendsBuilder_ == null) {
            this.pinnedFriends_ = Collections.emptyList();
         } else {
            this.pinnedFriends_ = null;
            this.pinnedFriendsBuilder_.clear();
         }

         this.bitField0_ &= -257;
         this.lastSeenVisibility_ = 0;
         this.countryFlagVisibility_ = 0;
         this.userCreatedAt_ = null;
         if (this.userCreatedAtBuilder_ != null) {
            this.userCreatedAtBuilder_.dispose();
            this.userCreatedAtBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_LoginResponse_descriptor;
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
         if (this.onlineFriendsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.onlineFriends_ = Collections.unmodifiableList(this.onlineFriends_);
               this.bitField0_ &= -3;
            }

            var1.onlineFriends_ = this.onlineFriends_;
         } else {
            var1.onlineFriends_ = this.onlineFriendsBuilder_.build();
         }

         if (this.offlineFriendsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.offlineFriends_ = Collections.unmodifiableList(this.offlineFriends_);
               this.bitField0_ &= -5;
            }

            var1.offlineFriends_ = this.offlineFriends_;
         } else {
            var1.offlineFriends_ = this.offlineFriendsBuilder_.build();
         }

         if (this.outboundFriendRequestsBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0) {
               this.outboundFriendRequests_ = Collections.unmodifiableList(this.outboundFriendRequests_);
               this.bitField0_ &= -17;
            }

            var1.outboundFriendRequests_ = this.outboundFriendRequests_;
         } else {
            var1.outboundFriendRequests_ = this.outboundFriendRequestsBuilder_.build();
         }

         if (this.inboundFriendRequestsBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0) {
               this.inboundFriendRequests_ = Collections.unmodifiableList(this.inboundFriendRequests_);
               this.bitField0_ &= -33;
            }

            var1.inboundFriendRequests_ = this.inboundFriendRequests_;
         } else {
            var1.inboundFriendRequests_ = this.inboundFriendRequestsBuilder_.build();
         }

         if (this.outboundFriendAddRequestsBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0) {
               this.outboundFriendAddRequests_ = Collections.unmodifiableList(this.outboundFriendAddRequests_);
               this.bitField0_ &= -65;
            }

            var1.outboundFriendAddRequests_ = this.outboundFriendAddRequests_;
         } else {
            var1.outboundFriendAddRequests_ = this.outboundFriendAddRequestsBuilder_.build();
         }

         if (this.inboundFriendAddRequestsBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0) {
               this.inboundFriendAddRequests_ = Collections.unmodifiableList(this.inboundFriendAddRequests_);
               this.bitField0_ &= -129;
            }

            var1.inboundFriendAddRequests_ = this.inboundFriendAddRequests_;
         } else {
            var1.inboundFriendAddRequests_ = this.inboundFriendAddRequestsBuilder_.build();
         }

         if (this.pinnedFriendsBuilder_ == null) {
            if ((this.bitField0_ & 256) != 0) {
               this.pinnedFriends_ = Collections.unmodifiableList(this.pinnedFriends_);
               this.bitField0_ &= -257;
            }

            var1.pinnedFriends_ = this.pinnedFriends_;
         } else {
            var1.pinnedFriends_ = this.pinnedFriendsBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.currentStatus_ = this.currentStatus_;
         }

         if ((var2 & 8) != 0) {
            var1.allowFriendRequests_ = this.allowFriendRequests_;
         }

         if ((var2 & 512) != 0) {
            var1.lastSeenVisibility_ = this.lastSeenVisibility_;
         }

         if ((var2 & 1024) != 0) {
            var1.countryFlagVisibility_ = this.countryFlagVisibility_;
         }

         byte var3 = 0;
         if ((var2 & 2048) != 0) {
            var1.userCreatedAt_ = this.userCreatedAtBuilder_ == null ? this.userCreatedAt_ : this.userCreatedAtBuilder_.build();
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

         if (var1.currentStatus_ != 0) {
            this.setCurrentStatusValue(var1.getCurrentStatusValue());
         }

         if (this.onlineFriendsBuilder_ == null) {
            if (!var1.onlineFriends_.isEmpty()) {
               if (this.onlineFriends_.isEmpty()) {
                  this.onlineFriends_ = var1.onlineFriends_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureOnlineFriendsIsMutable();
                  this.onlineFriends_.addAll(var1.onlineFriends_);
               }

               this.onChanged();
            }
         } else if (!var1.onlineFriends_.isEmpty()) {
            if (this.onlineFriendsBuilder_.isEmpty()) {
               this.onlineFriendsBuilder_.dispose();
               this.onlineFriendsBuilder_ = null;
               this.onlineFriends_ = var1.onlineFriends_;
               this.bitField0_ &= -3;
               this.onlineFriendsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOnlineFriendsFieldBuilder() : null;
            } else {
               this.onlineFriendsBuilder_.addAllMessages(var1.onlineFriends_);
            }
         }

         if (this.offlineFriendsBuilder_ == null) {
            if (!var1.offlineFriends_.isEmpty()) {
               if (this.offlineFriends_.isEmpty()) {
                  this.offlineFriends_ = var1.offlineFriends_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureOfflineFriendsIsMutable();
                  this.offlineFriends_.addAll(var1.offlineFriends_);
               }

               this.onChanged();
            }
         } else if (!var1.offlineFriends_.isEmpty()) {
            if (this.offlineFriendsBuilder_.isEmpty()) {
               this.offlineFriendsBuilder_.dispose();
               this.offlineFriendsBuilder_ = null;
               this.offlineFriends_ = var1.offlineFriends_;
               this.bitField0_ &= -5;
               this.offlineFriendsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOfflineFriendsFieldBuilder() : null;
            } else {
               this.offlineFriendsBuilder_.addAllMessages(var1.offlineFriends_);
            }
         }

         if (var1.getAllowFriendRequests()) {
            this.setAllowFriendRequests(var1.getAllowFriendRequests());
         }

         if (this.outboundFriendRequestsBuilder_ == null) {
            if (!var1.outboundFriendRequests_.isEmpty()) {
               if (this.outboundFriendRequests_.isEmpty()) {
                  this.outboundFriendRequests_ = var1.outboundFriendRequests_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureOutboundFriendRequestsIsMutable();
                  this.outboundFriendRequests_.addAll(var1.outboundFriendRequests_);
               }

               this.onChanged();
            }
         } else if (!var1.outboundFriendRequests_.isEmpty()) {
            if (this.outboundFriendRequestsBuilder_.isEmpty()) {
               this.outboundFriendRequestsBuilder_.dispose();
               this.outboundFriendRequestsBuilder_ = null;
               this.outboundFriendRequests_ = var1.outboundFriendRequests_;
               this.bitField0_ &= -17;
               this.outboundFriendRequestsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOutboundFriendRequestsFieldBuilder() : null;
            } else {
               this.outboundFriendRequestsBuilder_.addAllMessages(var1.outboundFriendRequests_);
            }
         }

         if (this.inboundFriendRequestsBuilder_ == null) {
            if (!var1.inboundFriendRequests_.isEmpty()) {
               if (this.inboundFriendRequests_.isEmpty()) {
                  this.inboundFriendRequests_ = var1.inboundFriendRequests_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensureInboundFriendRequestsIsMutable();
                  this.inboundFriendRequests_.addAll(var1.inboundFriendRequests_);
               }

               this.onChanged();
            }
         } else if (!var1.inboundFriendRequests_.isEmpty()) {
            if (this.inboundFriendRequestsBuilder_.isEmpty()) {
               this.inboundFriendRequestsBuilder_.dispose();
               this.inboundFriendRequestsBuilder_ = null;
               this.inboundFriendRequests_ = var1.inboundFriendRequests_;
               this.bitField0_ &= -33;
               this.inboundFriendRequestsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getInboundFriendRequestsFieldBuilder() : null;
            } else {
               this.inboundFriendRequestsBuilder_.addAllMessages(var1.inboundFriendRequests_);
            }
         }

         if (this.outboundFriendAddRequestsBuilder_ == null) {
            if (!var1.outboundFriendAddRequests_.isEmpty()) {
               if (this.outboundFriendAddRequests_.isEmpty()) {
                  this.outboundFriendAddRequests_ = var1.outboundFriendAddRequests_;
                  this.bitField0_ &= -65;
               } else {
                  this.ensureOutboundFriendAddRequestsIsMutable();
                  this.outboundFriendAddRequests_.addAll(var1.outboundFriendAddRequests_);
               }

               this.onChanged();
            }
         } else if (!var1.outboundFriendAddRequests_.isEmpty()) {
            if (this.outboundFriendAddRequestsBuilder_.isEmpty()) {
               this.outboundFriendAddRequestsBuilder_.dispose();
               this.outboundFriendAddRequestsBuilder_ = null;
               this.outboundFriendAddRequests_ = var1.outboundFriendAddRequests_;
               this.bitField0_ &= -65;
               this.outboundFriendAddRequestsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOutboundFriendAddRequestsFieldBuilder() : null;
            } else {
               this.outboundFriendAddRequestsBuilder_.addAllMessages(var1.outboundFriendAddRequests_);
            }
         }

         if (this.inboundFriendAddRequestsBuilder_ == null) {
            if (!var1.inboundFriendAddRequests_.isEmpty()) {
               if (this.inboundFriendAddRequests_.isEmpty()) {
                  this.inboundFriendAddRequests_ = var1.inboundFriendAddRequests_;
                  this.bitField0_ &= -129;
               } else {
                  this.ensureInboundFriendAddRequestsIsMutable();
                  this.inboundFriendAddRequests_.addAll(var1.inboundFriendAddRequests_);
               }

               this.onChanged();
            }
         } else if (!var1.inboundFriendAddRequests_.isEmpty()) {
            if (this.inboundFriendAddRequestsBuilder_.isEmpty()) {
               this.inboundFriendAddRequestsBuilder_.dispose();
               this.inboundFriendAddRequestsBuilder_ = null;
               this.inboundFriendAddRequests_ = var1.inboundFriendAddRequests_;
               this.bitField0_ &= -129;
               this.inboundFriendAddRequestsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getInboundFriendAddRequestsFieldBuilder() : null;
            } else {
               this.inboundFriendAddRequestsBuilder_.addAllMessages(var1.inboundFriendAddRequests_);
            }
         }

         if (this.pinnedFriendsBuilder_ == null) {
            if (!var1.pinnedFriends_.isEmpty()) {
               if (this.pinnedFriends_.isEmpty()) {
                  this.pinnedFriends_ = var1.pinnedFriends_;
                  this.bitField0_ &= -257;
               } else {
                  this.ensurePinnedFriendsIsMutable();
                  this.pinnedFriends_.addAll(var1.pinnedFriends_);
               }

               this.onChanged();
            }
         } else if (!var1.pinnedFriends_.isEmpty()) {
            if (this.pinnedFriendsBuilder_.isEmpty()) {
               this.pinnedFriendsBuilder_.dispose();
               this.pinnedFriendsBuilder_ = null;
               this.pinnedFriends_ = var1.pinnedFriends_;
               this.bitField0_ &= -257;
               this.pinnedFriendsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getPinnedFriendsFieldBuilder() : null;
            } else {
               this.pinnedFriendsBuilder_.addAllMessages(var1.pinnedFriends_);
            }
         }

         if (var1.lastSeenVisibility_ != 0) {
            this.setLastSeenVisibilityValue(var1.getLastSeenVisibilityValue());
         }

         if (var1.countryFlagVisibility_ != 0) {
            this.setCountryFlagVisibilityValue(var1.getCountryFlagVisibilityValue());
         }

         if (var1.hasUserCreatedAt()) {
            this.mergeUserCreatedAt(var1.getUserCreatedAt());
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
                     this.currentStatus_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     OfflineFriend var16 = var1.readMessage(OfflineFriend.parser(), var2);
                     if (this.offlineFriendsBuilder_ == null) {
                        this.ensureOfflineFriendsIsMutable();
                        this.offlineFriends_.add(var16);
                     } else {
                        this.offlineFriendsBuilder_.addMessage(var16);
                     }
                     break;
                  case 24:
                     this.allowFriendRequests_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 34:
                     UuidAndUsername var15 = var1.readMessage(UuidAndUsername.parser(), var2);
                     if (this.outboundFriendRequestsBuilder_ == null) {
                        this.ensureOutboundFriendRequestsIsMutable();
                        this.outboundFriendRequests_.add(var15);
                     } else {
                        this.outboundFriendRequestsBuilder_.addMessage(var15);
                     }
                     break;
                  case 42:
                     UuidAndUsername var14 = var1.readMessage(UuidAndUsername.parser(), var2);
                     if (this.inboundFriendRequestsBuilder_ == null) {
                        this.ensureInboundFriendRequestsIsMutable();
                        this.inboundFriendRequests_.add(var14);
                     } else {
                        this.inboundFriendRequestsBuilder_.addMessage(var14);
                     }
                     break;
                  case 50:
                     FriendRequest var13 = var1.readMessage(FriendRequest.parser(), var2);
                     if (this.outboundFriendAddRequestsBuilder_ == null) {
                        this.ensureOutboundFriendAddRequestsIsMutable();
                        this.outboundFriendAddRequests_.add(var13);
                     } else {
                        this.outboundFriendAddRequestsBuilder_.addMessage(var13);
                     }
                     break;
                  case 58:
                     FriendRequest var12 = var1.readMessage(FriendRequest.parser(), var2);
                     if (this.inboundFriendAddRequestsBuilder_ == null) {
                        this.ensureInboundFriendAddRequestsIsMutable();
                        this.inboundFriendAddRequests_.add(var12);
                     } else {
                        this.inboundFriendAddRequestsBuilder_.addMessage(var12);
                     }
                     break;
                  case 66:
                     Uuid var11 = var1.readMessage(Uuid.parser(), var2);
                     if (this.pinnedFriendsBuilder_ == null) {
                        this.ensurePinnedFriendsIsMutable();
                        this.pinnedFriends_.add(var11);
                     } else {
                        this.pinnedFriendsBuilder_.addMessage(var11);
                     }
                     break;
                  case 72:
                     this.lastSeenVisibility_ = var1.readEnum();
                     this.bitField0_ |= 512;
                     break;
                  case 80:
                     this.countryFlagVisibility_ = var1.readEnum();
                     this.bitField0_ |= 1024;
                     break;
                  case 90:
                     OnlineFriend var5 = var1.readMessage(OnlineFriend.parser(), var2);
                     if (this.onlineFriendsBuilder_ == null) {
                        this.ensureOnlineFriendsIsMutable();
                        this.onlineFriends_.add(var5);
                     } else {
                        this.onlineFriendsBuilder_.addMessage(var5);
                     }
                     break;
                  case 98:
                     var1.readMessage(this.getUserCreatedAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2048;
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
      public int getCurrentStatusValue() {
         return this.currentStatus_;
      }

      public LoginResponse.Builder setCurrentStatusValue(int var1) {
         this.currentStatus_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public OnlineFriendStatus getCurrentStatus() {
         OnlineFriendStatus var1 = OnlineFriendStatus.forNumber(this.currentStatus_);
         return var1 == null ? OnlineFriendStatus.UNRECOGNIZED : var1;
      }

      public LoginResponse.Builder setCurrentStatus(OnlineFriendStatus var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.currentStatus_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearCurrentStatus() {
         this.bitField0_ &= -2;
         this.currentStatus_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureOnlineFriendsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.onlineFriends_ = new ArrayList<>(this.onlineFriends_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<OnlineFriend> getOnlineFriendsList() {
         return this.onlineFriendsBuilder_ == null ? Collections.unmodifiableList(this.onlineFriends_) : this.onlineFriendsBuilder_.getMessageList();
      }

      @Override
      public int getOnlineFriendsCount() {
         return this.onlineFriendsBuilder_ == null ? this.onlineFriends_.size() : this.onlineFriendsBuilder_.getCount();
      }

      @Override
      public OnlineFriend getOnlineFriends(int var1) {
         return this.onlineFriendsBuilder_ == null ? this.onlineFriends_.get(var1) : this.onlineFriendsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOnlineFriends(int var1, OnlineFriend var2) {
         if (this.onlineFriendsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.set(var1, var2);
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOnlineFriends(int var1, OnlineFriend.Builder var2) {
         if (this.onlineFriendsBuilder_ == null) {
            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOnlineFriends(OnlineFriend var1) {
         if (this.onlineFriendsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.add(var1);
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOnlineFriends(int var1, OnlineFriend var2) {
         if (this.onlineFriendsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.add(var1, var2);
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOnlineFriends(OnlineFriend.Builder var1) {
         if (this.onlineFriendsBuilder_ == null) {
            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.add(var1.build());
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOnlineFriends(int var1, OnlineFriend.Builder var2) {
         if (this.onlineFriendsBuilder_ == null) {
            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOnlineFriends(Iterable<? extends OnlineFriend> var1) {
         if (this.onlineFriendsBuilder_ == null) {
            this.ensureOnlineFriendsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.onlineFriends_);
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOnlineFriends() {
         if (this.onlineFriendsBuilder_ == null) {
            this.onlineFriends_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOnlineFriends(int var1) {
         if (this.onlineFriendsBuilder_ == null) {
            this.ensureOnlineFriendsIsMutable();
            this.onlineFriends_.remove(var1);
            this.onChanged();
         } else {
            this.onlineFriendsBuilder_.remove(var1);
         }

         return this;
      }

      public OnlineFriend.Builder getOnlineFriendsBuilder(int var1) {
         return this.getOnlineFriendsFieldBuilder().getBuilder(var1);
      }

      @Override
      public OnlineFriendOrBuilder getOnlineFriendsOrBuilder(int var1) {
         return this.onlineFriendsBuilder_ == null ? this.onlineFriends_.get(var1) : this.onlineFriendsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OnlineFriendOrBuilder> getOnlineFriendsOrBuilderList() {
         return this.onlineFriendsBuilder_ != null ? this.onlineFriendsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.onlineFriends_);
      }

      public OnlineFriend.Builder addOnlineFriendsBuilder() {
         return this.getOnlineFriendsFieldBuilder().addBuilder(OnlineFriend.getDefaultInstance());
      }

      public OnlineFriend.Builder addOnlineFriendsBuilder(int var1) {
         return this.getOnlineFriendsFieldBuilder().addBuilder(var1, OnlineFriend.getDefaultInstance());
      }

      public List<OnlineFriend.Builder> getOnlineFriendsBuilderList() {
         return this.getOnlineFriendsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OnlineFriend, OnlineFriend.Builder, OnlineFriendOrBuilder> getOnlineFriendsFieldBuilder() {
         if (this.onlineFriendsBuilder_ == null) {
            this.onlineFriendsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.onlineFriends_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.onlineFriends_ = null;
         }

         return this.onlineFriendsBuilder_;
      }

      private void ensureOfflineFriendsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.offlineFriends_ = new ArrayList<>(this.offlineFriends_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<OfflineFriend> getOfflineFriendsList() {
         return this.offlineFriendsBuilder_ == null ? Collections.unmodifiableList(this.offlineFriends_) : this.offlineFriendsBuilder_.getMessageList();
      }

      @Override
      public int getOfflineFriendsCount() {
         return this.offlineFriendsBuilder_ == null ? this.offlineFriends_.size() : this.offlineFriendsBuilder_.getCount();
      }

      @Override
      public OfflineFriend getOfflineFriends(int var1) {
         return this.offlineFriendsBuilder_ == null ? this.offlineFriends_.get(var1) : this.offlineFriendsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOfflineFriends(int var1, OfflineFriend var2) {
         if (this.offlineFriendsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.set(var1, var2);
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOfflineFriends(int var1, OfflineFriend.Builder var2) {
         if (this.offlineFriendsBuilder_ == null) {
            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOfflineFriends(OfflineFriend var1) {
         if (this.offlineFriendsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.add(var1);
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOfflineFriends(int var1, OfflineFriend var2) {
         if (this.offlineFriendsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.add(var1, var2);
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOfflineFriends(OfflineFriend.Builder var1) {
         if (this.offlineFriendsBuilder_ == null) {
            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.add(var1.build());
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOfflineFriends(int var1, OfflineFriend.Builder var2) {
         if (this.offlineFriendsBuilder_ == null) {
            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOfflineFriends(Iterable<? extends OfflineFriend> var1) {
         if (this.offlineFriendsBuilder_ == null) {
            this.ensureOfflineFriendsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.offlineFriends_);
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOfflineFriends() {
         if (this.offlineFriendsBuilder_ == null) {
            this.offlineFriends_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOfflineFriends(int var1) {
         if (this.offlineFriendsBuilder_ == null) {
            this.ensureOfflineFriendsIsMutable();
            this.offlineFriends_.remove(var1);
            this.onChanged();
         } else {
            this.offlineFriendsBuilder_.remove(var1);
         }

         return this;
      }

      public OfflineFriend.Builder getOfflineFriendsBuilder(int var1) {
         return this.getOfflineFriendsFieldBuilder().getBuilder(var1);
      }

      @Override
      public OfflineFriendOrBuilder getOfflineFriendsOrBuilder(int var1) {
         return this.offlineFriendsBuilder_ == null ? this.offlineFriends_.get(var1) : this.offlineFriendsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OfflineFriendOrBuilder> getOfflineFriendsOrBuilderList() {
         return this.offlineFriendsBuilder_ != null
            ? this.offlineFriendsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.offlineFriends_);
      }

      public OfflineFriend.Builder addOfflineFriendsBuilder() {
         return this.getOfflineFriendsFieldBuilder().addBuilder(OfflineFriend.getDefaultInstance());
      }

      public OfflineFriend.Builder addOfflineFriendsBuilder(int var1) {
         return this.getOfflineFriendsFieldBuilder().addBuilder(var1, OfflineFriend.getDefaultInstance());
      }

      public List<OfflineFriend.Builder> getOfflineFriendsBuilderList() {
         return this.getOfflineFriendsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OfflineFriend, OfflineFriend.Builder, OfflineFriendOrBuilder> getOfflineFriendsFieldBuilder() {
         if (this.offlineFriendsBuilder_ == null) {
            this.offlineFriendsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.offlineFriends_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean()
            );
            this.offlineFriends_ = null;
         }

         return this.offlineFriendsBuilder_;
      }

      @Override
      public boolean getAllowFriendRequests() {
         return this.allowFriendRequests_;
      }

      public LoginResponse.Builder setAllowFriendRequests(boolean var1) {
         this.allowFriendRequests_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearAllowFriendRequests() {
         this.bitField0_ &= -9;
         this.allowFriendRequests_ = false;
         this.onChanged();
         return this;
      }

      private void ensureOutboundFriendRequestsIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.outboundFriendRequests_ = new ArrayList<>(this.outboundFriendRequests_);
            this.bitField0_ |= 16;
         }
      }

      @Deprecated
      @Override
      public List<UuidAndUsername> getOutboundFriendRequestsList() {
         return this.outboundFriendRequestsBuilder_ == null
            ? Collections.unmodifiableList(this.outboundFriendRequests_)
            : this.outboundFriendRequestsBuilder_.getMessageList();
      }

      @Deprecated
      @Override
      public int getOutboundFriendRequestsCount() {
         return this.outboundFriendRequestsBuilder_ == null ? this.outboundFriendRequests_.size() : this.outboundFriendRequestsBuilder_.getCount();
      }

      @Deprecated
      @Override
      public UuidAndUsername getOutboundFriendRequests(int var1) {
         return this.outboundFriendRequestsBuilder_ == null ? this.outboundFriendRequests_.get(var1) : this.outboundFriendRequestsBuilder_.getMessage(var1);
      }

      @Deprecated
      public LoginResponse.Builder setOutboundFriendRequests(int var1, UuidAndUsername var2) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.set(var1, var2);
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder setOutboundFriendRequests(int var1, UuidAndUsername.Builder var2) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addOutboundFriendRequests(UuidAndUsername var1) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.add(var1);
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.addMessage(var1);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addOutboundFriendRequests(int var1, UuidAndUsername var2) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.add(var1, var2);
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addOutboundFriendRequests(UuidAndUsername.Builder var1) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.add(var1.build());
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addOutboundFriendRequests(int var1, UuidAndUsername.Builder var2) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addAllOutboundFriendRequests(Iterable<? extends UuidAndUsername> var1) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.ensureOutboundFriendRequestsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.outboundFriendRequests_);
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearOutboundFriendRequests() {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.outboundFriendRequests_ = Collections.emptyList();
            this.bitField0_ &= -17;
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.clear();
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder removeOutboundFriendRequests(int var1) {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.ensureOutboundFriendRequestsIsMutable();
            this.outboundFriendRequests_.remove(var1);
            this.onChanged();
         } else {
            this.outboundFriendRequestsBuilder_.remove(var1);
         }

         return this;
      }

      @Deprecated
      public UuidAndUsername.Builder getOutboundFriendRequestsBuilder(int var1) {
         return this.getOutboundFriendRequestsFieldBuilder().getBuilder(var1);
      }

      @Deprecated
      @Override
      public UuidAndUsernameOrBuilder getOutboundFriendRequestsOrBuilder(int var1) {
         return this.outboundFriendRequestsBuilder_ == null
            ? this.outboundFriendRequests_.get(var1)
            : this.outboundFriendRequestsBuilder_.getMessageOrBuilder(var1);
      }

      @Deprecated
      @Override
      public List<? extends UuidAndUsernameOrBuilder> getOutboundFriendRequestsOrBuilderList() {
         return this.outboundFriendRequestsBuilder_ != null
            ? this.outboundFriendRequestsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.outboundFriendRequests_);
      }

      @Deprecated
      public UuidAndUsername.Builder addOutboundFriendRequestsBuilder() {
         return this.getOutboundFriendRequestsFieldBuilder().addBuilder(UuidAndUsername.getDefaultInstance());
      }

      @Deprecated
      public UuidAndUsername.Builder addOutboundFriendRequestsBuilder(int var1) {
         return this.getOutboundFriendRequestsFieldBuilder().addBuilder(var1, UuidAndUsername.getDefaultInstance());
      }

      @Deprecated
      public List<UuidAndUsername.Builder> getOutboundFriendRequestsBuilderList() {
         return this.getOutboundFriendRequestsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getOutboundFriendRequestsFieldBuilder() {
         if (this.outboundFriendRequestsBuilder_ == null) {
            this.outboundFriendRequestsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.outboundFriendRequests_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean()
            );
            this.outboundFriendRequests_ = null;
         }

         return this.outboundFriendRequestsBuilder_;
      }

      private void ensureInboundFriendRequestsIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.inboundFriendRequests_ = new ArrayList<>(this.inboundFriendRequests_);
            this.bitField0_ |= 32;
         }
      }

      @Deprecated
      @Override
      public List<UuidAndUsername> getInboundFriendRequestsList() {
         return this.inboundFriendRequestsBuilder_ == null
            ? Collections.unmodifiableList(this.inboundFriendRequests_)
            : this.inboundFriendRequestsBuilder_.getMessageList();
      }

      @Deprecated
      @Override
      public int getInboundFriendRequestsCount() {
         return this.inboundFriendRequestsBuilder_ == null ? this.inboundFriendRequests_.size() : this.inboundFriendRequestsBuilder_.getCount();
      }

      @Deprecated
      @Override
      public UuidAndUsername getInboundFriendRequests(int var1) {
         return this.inboundFriendRequestsBuilder_ == null ? this.inboundFriendRequests_.get(var1) : this.inboundFriendRequestsBuilder_.getMessage(var1);
      }

      @Deprecated
      public LoginResponse.Builder setInboundFriendRequests(int var1, UuidAndUsername var2) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.set(var1, var2);
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder setInboundFriendRequests(int var1, UuidAndUsername.Builder var2) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addInboundFriendRequests(UuidAndUsername var1) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.add(var1);
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.addMessage(var1);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addInboundFriendRequests(int var1, UuidAndUsername var2) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.add(var1, var2);
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addInboundFriendRequests(UuidAndUsername.Builder var1) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.add(var1.build());
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addInboundFriendRequests(int var1, UuidAndUsername.Builder var2) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder addAllInboundFriendRequests(Iterable<? extends UuidAndUsername> var1) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.ensureInboundFriendRequestsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.inboundFriendRequests_);
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearInboundFriendRequests() {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.inboundFriendRequests_ = Collections.emptyList();
            this.bitField0_ &= -33;
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.clear();
         }

         return this;
      }

      @Deprecated
      public LoginResponse.Builder removeInboundFriendRequests(int var1) {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.ensureInboundFriendRequestsIsMutable();
            this.inboundFriendRequests_.remove(var1);
            this.onChanged();
         } else {
            this.inboundFriendRequestsBuilder_.remove(var1);
         }

         return this;
      }

      @Deprecated
      public UuidAndUsername.Builder getInboundFriendRequestsBuilder(int var1) {
         return this.getInboundFriendRequestsFieldBuilder().getBuilder(var1);
      }

      @Deprecated
      @Override
      public UuidAndUsernameOrBuilder getInboundFriendRequestsOrBuilder(int var1) {
         return this.inboundFriendRequestsBuilder_ == null
            ? this.inboundFriendRequests_.get(var1)
            : this.inboundFriendRequestsBuilder_.getMessageOrBuilder(var1);
      }

      @Deprecated
      @Override
      public List<? extends UuidAndUsernameOrBuilder> getInboundFriendRequestsOrBuilderList() {
         return this.inboundFriendRequestsBuilder_ != null
            ? this.inboundFriendRequestsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.inboundFriendRequests_);
      }

      @Deprecated
      public UuidAndUsername.Builder addInboundFriendRequestsBuilder() {
         return this.getInboundFriendRequestsFieldBuilder().addBuilder(UuidAndUsername.getDefaultInstance());
      }

      @Deprecated
      public UuidAndUsername.Builder addInboundFriendRequestsBuilder(int var1) {
         return this.getInboundFriendRequestsFieldBuilder().addBuilder(var1, UuidAndUsername.getDefaultInstance());
      }

      @Deprecated
      public List<UuidAndUsername.Builder> getInboundFriendRequestsBuilderList() {
         return this.getInboundFriendRequestsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getInboundFriendRequestsFieldBuilder() {
         if (this.inboundFriendRequestsBuilder_ == null) {
            this.inboundFriendRequestsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.inboundFriendRequests_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean()
            );
            this.inboundFriendRequests_ = null;
         }

         return this.inboundFriendRequestsBuilder_;
      }

      private void ensureOutboundFriendAddRequestsIsMutable() {
         if ((this.bitField0_ & 64) == 0) {
            this.outboundFriendAddRequests_ = new ArrayList<>(this.outboundFriendAddRequests_);
            this.bitField0_ |= 64;
         }
      }

      @Override
      public List<FriendRequest> getOutboundFriendAddRequestsList() {
         return this.outboundFriendAddRequestsBuilder_ == null
            ? Collections.unmodifiableList(this.outboundFriendAddRequests_)
            : this.outboundFriendAddRequestsBuilder_.getMessageList();
      }

      @Override
      public int getOutboundFriendAddRequestsCount() {
         return this.outboundFriendAddRequestsBuilder_ == null ? this.outboundFriendAddRequests_.size() : this.outboundFriendAddRequestsBuilder_.getCount();
      }

      @Override
      public FriendRequest getOutboundFriendAddRequests(int var1) {
         return this.outboundFriendAddRequestsBuilder_ == null
            ? this.outboundFriendAddRequests_.get(var1)
            : this.outboundFriendAddRequestsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOutboundFriendAddRequests(int var1, FriendRequest var2) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.set(var1, var2);
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOutboundFriendAddRequests(int var1, FriendRequest.Builder var2) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOutboundFriendAddRequests(FriendRequest var1) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.add(var1);
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOutboundFriendAddRequests(int var1, FriendRequest var2) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.add(var1, var2);
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOutboundFriendAddRequests(FriendRequest.Builder var1) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.add(var1.build());
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOutboundFriendAddRequests(int var1, FriendRequest.Builder var2) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOutboundFriendAddRequests(Iterable<? extends FriendRequest> var1) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.ensureOutboundFriendAddRequestsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.outboundFriendAddRequests_);
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOutboundFriendAddRequests() {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.outboundFriendAddRequests_ = Collections.emptyList();
            this.bitField0_ &= -65;
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOutboundFriendAddRequests(int var1) {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.ensureOutboundFriendAddRequestsIsMutable();
            this.outboundFriendAddRequests_.remove(var1);
            this.onChanged();
         } else {
            this.outboundFriendAddRequestsBuilder_.remove(var1);
         }

         return this;
      }

      public FriendRequest.Builder getOutboundFriendAddRequestsBuilder(int var1) {
         return this.getOutboundFriendAddRequestsFieldBuilder().getBuilder(var1);
      }

      @Override
      public FriendRequestOrBuilder getOutboundFriendAddRequestsOrBuilder(int var1) {
         return this.outboundFriendAddRequestsBuilder_ == null
            ? this.outboundFriendAddRequests_.get(var1)
            : this.outboundFriendAddRequestsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends FriendRequestOrBuilder> getOutboundFriendAddRequestsOrBuilderList() {
         return this.outboundFriendAddRequestsBuilder_ != null
            ? this.outboundFriendAddRequestsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.outboundFriendAddRequests_);
      }

      public FriendRequest.Builder addOutboundFriendAddRequestsBuilder() {
         return this.getOutboundFriendAddRequestsFieldBuilder().addBuilder(FriendRequest.getDefaultInstance());
      }

      public FriendRequest.Builder addOutboundFriendAddRequestsBuilder(int var1) {
         return this.getOutboundFriendAddRequestsFieldBuilder().addBuilder(var1, FriendRequest.getDefaultInstance());
      }

      public List<FriendRequest.Builder> getOutboundFriendAddRequestsBuilderList() {
         return this.getOutboundFriendAddRequestsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<FriendRequest, FriendRequest.Builder, FriendRequestOrBuilder> getOutboundFriendAddRequestsFieldBuilder() {
         if (this.outboundFriendAddRequestsBuilder_ == null) {
            this.outboundFriendAddRequestsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.outboundFriendAddRequests_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean()
            );
            this.outboundFriendAddRequests_ = null;
         }

         return this.outboundFriendAddRequestsBuilder_;
      }

      private void ensureInboundFriendAddRequestsIsMutable() {
         if ((this.bitField0_ & 128) == 0) {
            this.inboundFriendAddRequests_ = new ArrayList<>(this.inboundFriendAddRequests_);
            this.bitField0_ |= 128;
         }
      }

      @Override
      public List<FriendRequest> getInboundFriendAddRequestsList() {
         return this.inboundFriendAddRequestsBuilder_ == null
            ? Collections.unmodifiableList(this.inboundFriendAddRequests_)
            : this.inboundFriendAddRequestsBuilder_.getMessageList();
      }

      @Override
      public int getInboundFriendAddRequestsCount() {
         return this.inboundFriendAddRequestsBuilder_ == null ? this.inboundFriendAddRequests_.size() : this.inboundFriendAddRequestsBuilder_.getCount();
      }

      @Override
      public FriendRequest getInboundFriendAddRequests(int var1) {
         return this.inboundFriendAddRequestsBuilder_ == null
            ? this.inboundFriendAddRequests_.get(var1)
            : this.inboundFriendAddRequestsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setInboundFriendAddRequests(int var1, FriendRequest var2) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.set(var1, var2);
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setInboundFriendAddRequests(int var1, FriendRequest.Builder var2) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addInboundFriendAddRequests(FriendRequest var1) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.add(var1);
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addInboundFriendAddRequests(int var1, FriendRequest var2) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.add(var1, var2);
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addInboundFriendAddRequests(FriendRequest.Builder var1) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.add(var1.build());
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addInboundFriendAddRequests(int var1, FriendRequest.Builder var2) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllInboundFriendAddRequests(Iterable<? extends FriendRequest> var1) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.ensureInboundFriendAddRequestsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.inboundFriendAddRequests_);
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearInboundFriendAddRequests() {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.inboundFriendAddRequests_ = Collections.emptyList();
            this.bitField0_ &= -129;
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeInboundFriendAddRequests(int var1) {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.ensureInboundFriendAddRequestsIsMutable();
            this.inboundFriendAddRequests_.remove(var1);
            this.onChanged();
         } else {
            this.inboundFriendAddRequestsBuilder_.remove(var1);
         }

         return this;
      }

      public FriendRequest.Builder getInboundFriendAddRequestsBuilder(int var1) {
         return this.getInboundFriendAddRequestsFieldBuilder().getBuilder(var1);
      }

      @Override
      public FriendRequestOrBuilder getInboundFriendAddRequestsOrBuilder(int var1) {
         return this.inboundFriendAddRequestsBuilder_ == null
            ? this.inboundFriendAddRequests_.get(var1)
            : this.inboundFriendAddRequestsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends FriendRequestOrBuilder> getInboundFriendAddRequestsOrBuilderList() {
         return this.inboundFriendAddRequestsBuilder_ != null
            ? this.inboundFriendAddRequestsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.inboundFriendAddRequests_);
      }

      public FriendRequest.Builder addInboundFriendAddRequestsBuilder() {
         return this.getInboundFriendAddRequestsFieldBuilder().addBuilder(FriendRequest.getDefaultInstance());
      }

      public FriendRequest.Builder addInboundFriendAddRequestsBuilder(int var1) {
         return this.getInboundFriendAddRequestsFieldBuilder().addBuilder(var1, FriendRequest.getDefaultInstance());
      }

      public List<FriendRequest.Builder> getInboundFriendAddRequestsBuilderList() {
         return this.getInboundFriendAddRequestsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<FriendRequest, FriendRequest.Builder, FriendRequestOrBuilder> getInboundFriendAddRequestsFieldBuilder() {
         if (this.inboundFriendAddRequestsBuilder_ == null) {
            this.inboundFriendAddRequestsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.inboundFriendAddRequests_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean()
            );
            this.inboundFriendAddRequests_ = null;
         }

         return this.inboundFriendAddRequestsBuilder_;
      }

      private void ensurePinnedFriendsIsMutable() {
         if ((this.bitField0_ & 256) == 0) {
            this.pinnedFriends_ = new ArrayList<>(this.pinnedFriends_);
            this.bitField0_ |= 256;
         }
      }

      @Override
      public List<Uuid> getPinnedFriendsList() {
         return this.pinnedFriendsBuilder_ == null ? Collections.unmodifiableList(this.pinnedFriends_) : this.pinnedFriendsBuilder_.getMessageList();
      }

      @Override
      public int getPinnedFriendsCount() {
         return this.pinnedFriendsBuilder_ == null ? this.pinnedFriends_.size() : this.pinnedFriendsBuilder_.getCount();
      }

      @Override
      public Uuid getPinnedFriends(int var1) {
         return this.pinnedFriendsBuilder_ == null ? this.pinnedFriends_.get(var1) : this.pinnedFriendsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setPinnedFriends(int var1, Uuid var2) {
         if (this.pinnedFriendsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.set(var1, var2);
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setPinnedFriends(int var1, Uuid.Builder var2) {
         if (this.pinnedFriendsBuilder_ == null) {
            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addPinnedFriends(Uuid var1) {
         if (this.pinnedFriendsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.add(var1);
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addPinnedFriends(int var1, Uuid var2) {
         if (this.pinnedFriendsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.add(var1, var2);
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addPinnedFriends(Uuid.Builder var1) {
         if (this.pinnedFriendsBuilder_ == null) {
            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.add(var1.build());
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addPinnedFriends(int var1, Uuid.Builder var2) {
         if (this.pinnedFriendsBuilder_ == null) {
            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllPinnedFriends(Iterable<? extends Uuid> var1) {
         if (this.pinnedFriendsBuilder_ == null) {
            this.ensurePinnedFriendsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.pinnedFriends_);
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearPinnedFriends() {
         if (this.pinnedFriendsBuilder_ == null) {
            this.pinnedFriends_ = Collections.emptyList();
            this.bitField0_ &= -257;
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removePinnedFriends(int var1) {
         if (this.pinnedFriendsBuilder_ == null) {
            this.ensurePinnedFriendsIsMutable();
            this.pinnedFriends_.remove(var1);
            this.onChanged();
         } else {
            this.pinnedFriendsBuilder_.remove(var1);
         }

         return this;
      }

      public Uuid.Builder getPinnedFriendsBuilder(int var1) {
         return this.getPinnedFriendsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidOrBuilder getPinnedFriendsOrBuilder(int var1) {
         return this.pinnedFriendsBuilder_ == null ? this.pinnedFriends_.get(var1) : this.pinnedFriendsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidOrBuilder> getPinnedFriendsOrBuilderList() {
         return this.pinnedFriendsBuilder_ != null ? this.pinnedFriendsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pinnedFriends_);
      }

      public Uuid.Builder addPinnedFriendsBuilder() {
         return this.getPinnedFriendsFieldBuilder().addBuilder(Uuid.getDefaultInstance());
      }

      public Uuid.Builder addPinnedFriendsBuilder(int var1) {
         return this.getPinnedFriendsFieldBuilder().addBuilder(var1, Uuid.getDefaultInstance());
      }

      public List<Uuid.Builder> getPinnedFriendsBuilderList() {
         return this.getPinnedFriendsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPinnedFriendsFieldBuilder() {
         if (this.pinnedFriendsBuilder_ == null) {
            this.pinnedFriendsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.pinnedFriends_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean()
            );
            this.pinnedFriends_ = null;
         }

         return this.pinnedFriendsBuilder_;
      }

      @Override
      public int getLastSeenVisibilityValue() {
         return this.lastSeenVisibility_;
      }

      public LoginResponse.Builder setLastSeenVisibilityValue(int var1) {
         this.lastSeenVisibility_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public LastSeenVisibility getLastSeenVisibility() {
         LastSeenVisibility var1 = LastSeenVisibility.forNumber(this.lastSeenVisibility_);
         return var1 == null ? LastSeenVisibility.UNRECOGNIZED : var1;
      }

      public LoginResponse.Builder setLastSeenVisibility(LastSeenVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 512;
         this.lastSeenVisibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearLastSeenVisibility() {
         this.bitField0_ &= -513;
         this.lastSeenVisibility_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getCountryFlagVisibilityValue() {
         return this.countryFlagVisibility_;
      }

      public LoginResponse.Builder setCountryFlagVisibilityValue(int var1) {
         this.countryFlagVisibility_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      @Override
      public CountryFlagVisibility getCountryFlagVisibility() {
         CountryFlagVisibility var1 = CountryFlagVisibility.forNumber(this.countryFlagVisibility_);
         return var1 == null ? CountryFlagVisibility.UNRECOGNIZED : var1;
      }

      public LoginResponse.Builder setCountryFlagVisibility(CountryFlagVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1024;
         this.countryFlagVisibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearCountryFlagVisibility() {
         this.bitField0_ &= -1025;
         this.countryFlagVisibility_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasUserCreatedAt() {
         return (this.bitField0_ & 2048) != 0;
      }

      @Override
      public Timestamp getUserCreatedAt() {
         if (this.userCreatedAtBuilder_ == null) {
            return this.userCreatedAt_ == null ? Timestamp.getDefaultInstance() : this.userCreatedAt_;
         } else {
            return this.userCreatedAtBuilder_.getMessage();
         }
      }

      public LoginResponse.Builder setUserCreatedAt(Timestamp var1) {
         if (this.userCreatedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.userCreatedAt_ = var1;
         } else {
            this.userCreatedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder setUserCreatedAt(Timestamp.Builder var1) {
         if (this.userCreatedAtBuilder_ == null) {
            this.userCreatedAt_ = var1.build();
         } else {
            this.userCreatedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder mergeUserCreatedAt(Timestamp var1) {
         if (this.userCreatedAtBuilder_ == null) {
            if ((this.bitField0_ & 2048) != 0 && this.userCreatedAt_ != null && this.userCreatedAt_ != Timestamp.getDefaultInstance()) {
               this.getUserCreatedAtBuilder().mergeFrom(var1);
            } else {
               this.userCreatedAt_ = var1;
            }
         } else {
            this.userCreatedAtBuilder_.mergeFrom(var1);
         }

         if (this.userCreatedAt_ != null) {
            this.bitField0_ |= 2048;
            this.onChanged();
         }

         return this;
      }

      public LoginResponse.Builder clearUserCreatedAt() {
         this.bitField0_ &= -2049;
         this.userCreatedAt_ = null;
         if (this.userCreatedAtBuilder_ != null) {
            this.userCreatedAtBuilder_.dispose();
            this.userCreatedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getUserCreatedAtBuilder() {
         this.bitField0_ |= 2048;
         this.onChanged();
         return this.getUserCreatedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getUserCreatedAtOrBuilder() {
         if (this.userCreatedAtBuilder_ != null) {
            return this.userCreatedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.userCreatedAt_ == null ? Timestamp.getDefaultInstance() : this.userCreatedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getUserCreatedAtFieldBuilder() {
         if (this.userCreatedAtBuilder_ == null) {
            this.userCreatedAtBuilder_ = new SingleFieldBuilderV3<>(this.getUserCreatedAt(), this.getParentForChildren(), this.isClean());
            this.userCreatedAt_ = null;
         }

         return this.userCreatedAtBuilder_;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
