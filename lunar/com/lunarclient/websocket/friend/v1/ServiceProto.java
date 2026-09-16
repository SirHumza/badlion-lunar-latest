package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.InboundLocationProto;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_LoginResponse_descriptor,
      new String[]{
         "CurrentStatus",
         "OnlineFriends",
         "OfflineFriends",
         "AllowFriendRequests",
         "OutboundFriendRequests",
         "InboundFriendRequests",
         "OutboundFriendAddRequests",
         "InboundFriendAddRequests",
         "PinnedFriends",
         "LastSeenVisibility",
         "CountryFlagVisibility",
         "UserCreatedAt"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeRequest_descriptor, new String[]{"NewLocation", "Trigger"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_BroadcastLocationChangeResponse_descriptor, new String[]{"NewLocation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_descriptor, new String[]{"NewStatus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_BroadcastServerKickRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_BroadcastServerKickRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_BroadcastServerKickRequest_descriptor, new String[]{"KickReason"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_BroadcastServerKickResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_BroadcastServerKickResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_BroadcastServerKickResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_RemoveFriendRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_RemoveFriendRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_RemoveFriendRequest_descriptor, new String[]{"FriendUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_RemoveFriendResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_RemoveFriendResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_RemoveFriendResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_descriptor, new String[]{"AllowFriendRequests"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_descriptor, new String[]{"TargetUsername"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_descriptor,
      new String[]{"Status", "Target", "TargetLogoColor", "TargetPlusColor", "TargetRankName", "TargetBadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_CancelFriendRequestRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_CancelFriendRequestRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_CancelFriendRequestRequest_descriptor, new String[]{"TargetUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_CancelFriendRequestResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(15);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_CancelFriendRequestResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_CancelFriendRequestResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(16);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_descriptor, new String[]{"SenderUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(17);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_descriptor, new String[]{"Status", "OfflineFriend"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_DenyFriendRequestRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(18);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_DenyFriendRequestRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_DenyFriendRequestRequest_descriptor, new String[]{"SenderUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_DenyFriendRequestResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(19);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_DenyFriendRequestResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_DenyFriendRequestResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(20);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_descriptor, new String[]{"TargetUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_AddFriendPinResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(21);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_AddFriendPinResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_AddFriendPinResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(22);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinRequest_descriptor, new String[]{"TargetUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(23);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_descriptor, new String[]{"Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(24);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_descriptor, new String[]{"Visibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(25);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(26);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_descriptor, new String[]{"Visibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(27);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(28);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyRequest_descriptor, new String[]{"Privacy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(29);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_SetGroupChatInvitePrivacyResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n-lunarclient/websocket/friend/v1/service.proto\u0012\u001flunarclient.websocket.friend.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a$lunarclient/common/v1/location.proto\u001a lunarclient/common/v1/uuid.proto\u001a,lunarclient/websocket/friend/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a!lunarclient/common/v1/color.proto\u001a,lunarclient/common/v1/inbound_location.proto\"\u000e\n\fLoginRequest\"×\b\n\rLoginResponse\u0012Z\n\u000ecurrent_status\u0018\u0001 \u0001(\u000e23.lunarclient.websocket.friend.v1.OnlineFriendStatusR\rcurrentStatus\u0012T\n\u000eonline_friends\u0018\u000b \u0003(\u000b2-.lunarclient.websocket.friend.v1.OnlineFriendR\ronlineFriends\u0012W\n\u000foffline_friends\u0018\u0002 \u0003(\u000b2..lunarclient.websocket.friend.v1.OfflineFriendR\u000eofflineFriends\u00122\n\u0015allow_friend_requests\u0018\u0003 \u0001(\bR\u0013allowFriendRequests\u0012d\n\u0018outbound_friend_requests\u0018\u0004 \u0003(\u000b2&.lunarclient.common.v1.UuidAndUsernameB\u0002\u0018\u0001R\u0016outboundFriendRequests\u0012b\n\u0017inbound_friend_requests\u0018\u0005 \u0003(\u000b2&.lunarclient.common.v1.UuidAndUsernameB\u0002\u0018\u0001R\u0015inboundFriendRequests\u0012o\n\u001coutbound_friend_add_requests\u0018\u0006 \u0003(\u000b2..lunarclient.websocket.friend.v1.FriendRequestR\u0019outboundFriendAddRequests\u0012m\n\u001binbound_friend_add_requests\u0018\u0007 \u0003(\u000b2..lunarclient.websocket.friend.v1.FriendRequestR\u0018inboundFriendAddRequests\u0012B\n\u000epinned_friends\u0018\b \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\rpinnedFriends\u0012e\n\u0014last_seen_visibility\u0018\t \u0001(\u000e23.lunarclient.websocket.friend.v1.LastSeenVisibilityR\u0012lastSeenVisibility\u0012n\n\u0017country_flag_visibility\u0018\n \u0001(\u000e26.lunarclient.websocket.friend.v1.CountryFlagVisibilityR\u0015countryFlagVisibility\u0012B\n\u000fuser_created_at\u0018\f \u0001(\u000b2\u001a.google.protobuf.TimestampR\ruserCreatedAt\"\u0088\u0003\n\u001eBroadcastLocationChangeRequest\u0012I\n\fnew_location\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.InboundLocationR\u000bnewLocation\u0012a\n\u0007trigger\u0018\u0002 \u0001(\u000e2G.lunarclient.websocket.friend.v1.BroadcastLocationChangeRequest.TriggerR\u0007trigger\"·\u0001\n\u0007Trigger\u0012\u0017\n\u0013TRIGGER_UNSPECIFIED\u0010\u0000\u0012\u0016\n\u0012TRIGGER_JOIN_EVENT\u0010\u0001\u0012\u001c\n\u0018TRIGGER_DISCONNECT_EVENT\u0010\u0002\u0012\u001e\n\u001aTRIGGER_HOSTED_WORLD_START\u0010\u0003\u0012\u001d\n\u0019TRIGGER_HOSTED_WORLD_STOP\u0010\u0004\u0012\u001e\n\u001aTRIGGER_SERVER_RICH_STATUS\u0010\u0005\"e\n\u001fBroadcastLocationChangeResponse\u0012B\n\fnew_location\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.LocationR\u000bnewLocation\"r\n\u001cBroadcastStatusChangeRequest\u0012R\n\nnew_status\u0018\u0001 \u0001(\u000e23.lunarclient.websocket.friend.v1.OnlineFriendStatusR\tnewStatus\"\u001f\n\u001dBroadcastStatusChangeResponse\"=\n\u001aBroadcastServerKickRequest\u0012\u001f\n\u000bkick_reason\u0018\u0001 \u0001(\tR\nkickReason\"\u001d\n\u001bBroadcastServerKickResponse\"S\n\u0013RemoveFriendRequest\u0012<\n\u000bfriend_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nfriendUuid\"\u0016\n\u0014RemoveFriendResponse\"Q\n\u001bToggleFriendRequestsRequest\u00122\n\u0015allow_friend_requests\u0018\u0001 \u0001(\bR\u0013allowFriendRequests\"\u001e\n\u001cToggleFriendRequestsResponse\"C\n\u0018SendFriendRequestRequest\u0012'\n\u000ftarget_username\u0018\u0001 \u0001(\tR\u000etargetUsername\"Ç\u0005\n\u0019SendFriendRequestResponse\u0012Y\n\u0006status\u0018\u0001 \u0001(\u000e2A.lunarclient.websocket.friend.v1.SendFriendRequestResponse.StatusR\u0006status\u0012>\n\u0006target\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006target\u0012H\n\u0011target_logo_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u000ftargetLogoColor\u0012H\n\u0011target_plus_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u000ftargetPlusColor\u0012(\n\u0010target_rank_name\u0018\u0005 \u0001(\tR\u000etargetRankName\u0012&\n\u000ftarget_badge_id\u0018\u0006 \u0001(\u0005R\rtargetBadgeId\"¨\u0002\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\"\n\u001eSTATUS_TARGET_INVALID_USERNAME\u0010\u0002\u0012\u001b\n\u0017STATUS_TARGET_NOT_FOUND\u0010\u0003\u0012*\n&STATUS_TARGET_FRIEND_REQUESTS_DISABLED\u0010\u0004\u0012\u001b\n\u0017STATUS_TARGET_IS_SENDER\u0010\u0005\u0012\u001a\n\u0016STATUS_ALREADY_FRIENDS\u0010\u0006\u0012'\n#STATUS_ALREADY_HAVE_INBOUND_REQUEST\u0010\u0007\u0012(\n$STATUS_ALREADY_HAVE_OUTBOUND_REQUEST\u0010\b\"Z\n\u001aCancelFriendRequestRequest\u0012<\n\u000btarget_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\ntargetUuid\"\u001d\n\u001bCancelFriendRequestResponse\"Z\n\u001aAcceptFriendRequestRequest\u0012<\n\u000bsender_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nsenderUuid\"\u008a\u0003\n\u001bAcceptFriendRequestResponse\u0012[\n\u0006status\u0018\u0001 \u0001(\u000e2C.lunarclient.websocket.friend.v1.AcceptFriendRequestResponse.StatusR\u0006status\u0012U\n\u000eoffline_friend\u0018\u0002 \u0001(\u000b2..lunarclient.websocket.friend.v1.OfflineFriendR\rofflineFriend\"¶\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012 \n\u001cSTATUS_YOUR_FRIEND_LIST_FULL\u0010\u0002\u0012\"\n\u001eSTATUS_TARGET_FRIEND_LIST_FULL\u0010\u0003\u0012\u001a\n\u0016STATUS_ALREADY_FRIENDS\u0010\u0004\u0012#\n\u001fSTATUS_FRIEND_REQUEST_NOT_FOUND\u0010\u0005\"X\n\u0018DenyFriendRequestRequest\u0012<\n\u000bsender_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nsenderUuid\"\u001b\n\u0019DenyFriendRequestResponse\"S\n\u0013AddFriendPinRequest\u0012<\n\u000btarget_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\ntargetUuid\"\u0098\u0002\n\u0014AddFriendPinResponse\u0012T\n\u0006status\u0018\u0001 \u0001(\u000e2<.lunarclient.websocket.friend.v1.AddFriendPinResponse.StatusR\u0006status\"©\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012 \n\u001cSTATUS_FRIEND_ALREADY_PINNED\u0010\u0002\u0012\u001f\n\u001bSTATUS_TARGET_IS_NOT_FRIEND\u0010\u0003\u0012\u001b\n\u0017STATUS_TARGET_NOT_FOUND\u0010\u0004\u0012\u0018\n\u0014STATUS_LIMIT_REACHED\u0010\u0005\"V\n\u0016RemoveFriendPinRequest\u0012<\n\u000btarget_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\ntargetUuid\"\u0080\u0002\n\u0017RemoveFriendPinResponse\u0012W\n\u0006status\u0018\u0001 \u0001(\u000e2?.lunarclient.websocket.friend.v1.RemoveFriendPinResponse.StatusR\u0006status\"\u008b\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001c\n\u0018STATUS_FRIEND_NOT_PINNED\u0010\u0002\u0012\u001f\n\u001bSTATUS_TARGET_IS_NOT_FRIEND\u0010\u0003\u0012\u001b\n\u0017STATUS_TARGET_NOT_FOUND\u0010\u0004\"s\n\u001cSetLastSeenVisibilityRequest\u0012S\n\nvisibility\u0018\u0001 \u0001(\u000e23.lunarclient.websocket.friend.v1.LastSeenVisibilityR\nvisibility\"\u001f\n\u001dSetLastSeenVisibilityResponse\"y\n\u001fSetCountryFlagVisibilityRequest\u0012V\n\nvisibility\u0018\u0001 \u0001(\u000e26.lunarclient.websocket.friend.v1.CountryFlagVisibilityR\nvisibility\"\"\n SetCountryFlagVisibilityResponse\"u\n SetGroupChatInvitePrivacyRequest\u0012Q\n\u0007privacy\u0018\u0001 \u0001(\u000e27.lunarclient.websocket.friend.v1.GroupChatInvitePrivacyR\u0007privacy\"#\n!SetGroupChatInvitePrivacyResponse2Õ\u0011\n\rFriendService\u0012l\n\u0005Login\u0012-.lunarclient.websocket.friend.v1.LoginRequest\u001a..lunarclient.websocket.friend.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012¢\u0001\n\u0017BroadcastLocationChange\u0012?.lunarclient.websocket.friend.v1.BroadcastLocationChangeRequest\u001a@.lunarclient.websocket.friend.v1.BroadcastLocationChangeResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009c\u0001\n\u0015BroadcastStatusChange\u0012=.lunarclient.websocket.friend.v1.BroadcastStatusChangeRequest\u001a>.lunarclient.websocket.friend.v1.BroadcastStatusChangeResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0096\u0001\n\u0013BroadcastServerKick\u0012;.lunarclient.websocket.friend.v1.BroadcastServerKickRequest\u001a<.lunarclient.websocket.friend.v1.BroadcastServerKickResponse\"\u0004\u0088µ\u0018\u0001\u0012\u0081\u0001\n\fRemoveFriend\u00124.lunarclient.websocket.friend.v1.RemoveFriendRequest\u001a5.lunarclient.websocket.friend.v1.RemoveFriendResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0099\u0001\n\u0014ToggleFriendRequests\u0012<.lunarclient.websocket.friend.v1.ToggleFriendRequestsRequest\u001a=.lunarclient.websocket.friend.v1.ToggleFriendRequestsResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0090\u0001\n\u0011SendFriendRequest\u00129.lunarclient.websocket.friend.v1.SendFriendRequestRequest\u001a:.lunarclient.websocket.friend.v1.SendFriendRequestResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0096\u0001\n\u0013CancelFriendRequest\u0012;.lunarclient.websocket.friend.v1.CancelFriendRequestRequest\u001a<.lunarclient.websocket.friend.v1.CancelFriendRequestResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0096\u0001\n\u0013AcceptFriendRequest\u0012;.lunarclient.websocket.friend.v1.AcceptFriendRequestRequest\u001a<.lunarclient.websocket.friend.v1.AcceptFriendRequestResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0090\u0001\n\u0011DenyFriendRequest\u00129.lunarclient.websocket.friend.v1.DenyFriendRequestRequest\u001a:.lunarclient.websocket.friend.v1.DenyFriendRequestResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0081\u0001\n\fAddFriendPin\u00124.lunarclient.websocket.friend.v1.AddFriendPinRequest\u001a5.lunarclient.websocket.friend.v1.AddFriendPinResponse\"\u0004\u0088µ\u0018\u0003\u0012\u008a\u0001\n\u000fRemoveFriendPin\u00127.lunarclient.websocket.friend.v1.RemoveFriendPinRequest\u001a8.lunarclient.websocket.friend.v1.RemoveFriendPinResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009c\u0001\n\u0015SetLastSeenVisibility\u0012=.lunarclient.websocket.friend.v1.SetLastSeenVisibilityRequest\u001a>.lunarclient.websocket.friend.v1.SetLastSeenVisibilityResponse\"\u0004\u0088µ\u0018\u0003\u0012¥\u0001\n\u0018SetCountryFlagVisibility\u0012@.lunarclient.websocket.friend.v1.SetCountryFlagVisibilityRequest\u001aA.lunarclient.websocket.friend.v1.SetCountryFlagVisibilityResponse\"\u0004\u0088µ\u0018\u0003\u0012¨\u0001\n\u0019SetGroupChatInvitePrivacy\u0012A.lunarclient.websocket.friend.v1.SetGroupChatInvitePrivacyRequest\u001aB.lunarclient.websocket.friend.v1.SetGroupChatInvitePrivacyResponse\"\u0004\u0088µ\u0018\u0003BÕ\u0001\n#com.lunarclient.websocket.friend.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWFª\u0002\u001fLunarclient.Websocket.Friend.V1Ê\u0002\u001fLunarclient\\Websocket\\Friend\\V1â\u0002+Lunarclient\\Websocket\\Friend\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Friend::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            TimestampProto.getDescriptor(),
            com.lunarclient.common.v1.LocationProto.getDescriptor(),
            UuidProto.getDescriptor(),
            CommonProto.getDescriptor(),
            com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(),
            ColorProto.getDescriptor(),
            InboundLocationProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      TimestampProto.getDescriptor();
      com.lunarclient.common.v1.LocationProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      ColorProto.getDescriptor();
      InboundLocationProto.getDescriptor();
   }
}
