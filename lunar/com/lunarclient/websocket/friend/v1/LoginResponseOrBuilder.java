package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   int getCurrentStatusValue();

   OnlineFriendStatus getCurrentStatus();

   List<OnlineFriend> getOnlineFriendsList();

   OnlineFriend getOnlineFriends(int var1);

   int getOnlineFriendsCount();

   List<? extends OnlineFriendOrBuilder> getOnlineFriendsOrBuilderList();

   OnlineFriendOrBuilder getOnlineFriendsOrBuilder(int var1);

   List<OfflineFriend> getOfflineFriendsList();

   OfflineFriend getOfflineFriends(int var1);

   int getOfflineFriendsCount();

   List<? extends OfflineFriendOrBuilder> getOfflineFriendsOrBuilderList();

   OfflineFriendOrBuilder getOfflineFriendsOrBuilder(int var1);

   boolean getAllowFriendRequests();

   @Deprecated
   List<UuidAndUsername> getOutboundFriendRequestsList();

   @Deprecated
   UuidAndUsername getOutboundFriendRequests(int var1);

   @Deprecated
   int getOutboundFriendRequestsCount();

   @Deprecated
   List<? extends UuidAndUsernameOrBuilder> getOutboundFriendRequestsOrBuilderList();

   @Deprecated
   UuidAndUsernameOrBuilder getOutboundFriendRequestsOrBuilder(int var1);

   @Deprecated
   List<UuidAndUsername> getInboundFriendRequestsList();

   @Deprecated
   UuidAndUsername getInboundFriendRequests(int var1);

   @Deprecated
   int getInboundFriendRequestsCount();

   @Deprecated
   List<? extends UuidAndUsernameOrBuilder> getInboundFriendRequestsOrBuilderList();

   @Deprecated
   UuidAndUsernameOrBuilder getInboundFriendRequestsOrBuilder(int var1);

   List<FriendRequest> getOutboundFriendAddRequestsList();

   FriendRequest getOutboundFriendAddRequests(int var1);

   int getOutboundFriendAddRequestsCount();

   List<? extends FriendRequestOrBuilder> getOutboundFriendAddRequestsOrBuilderList();

   FriendRequestOrBuilder getOutboundFriendAddRequestsOrBuilder(int var1);

   List<FriendRequest> getInboundFriendAddRequestsList();

   FriendRequest getInboundFriendAddRequests(int var1);

   int getInboundFriendAddRequestsCount();

   List<? extends FriendRequestOrBuilder> getInboundFriendAddRequestsOrBuilderList();

   FriendRequestOrBuilder getInboundFriendAddRequestsOrBuilder(int var1);

   List<Uuid> getPinnedFriendsList();

   Uuid getPinnedFriends(int var1);

   int getPinnedFriendsCount();

   List<? extends UuidOrBuilder> getPinnedFriendsOrBuilderList();

   UuidOrBuilder getPinnedFriendsOrBuilder(int var1);

   int getLastSeenVisibilityValue();

   LastSeenVisibility getLastSeenVisibility();

   int getCountryFlagVisibilityValue();

   CountryFlagVisibility getCountryFlagVisibility();

   boolean hasUserCreatedAt();

   Timestamp getUserCreatedAt();

   TimestampOrBuilder getUserCreatedAtOrBuilder();
}
