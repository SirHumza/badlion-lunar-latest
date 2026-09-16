package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.RadioProto;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_descriptor, new String[]{"OnlineFriend", "OfflineFriend", "Friend"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_descriptor, new String[]{"FriendUuid", "RadioInfo"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_descriptor, new String[]{"FriendUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_descriptor,
      new String[]{"Sender", "SenderLogoColor", "SenderPlusColor", "SenderRankName", "SenderBadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_descriptor, new String[]{"NewFriendUuid", "NewFriend"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_descriptor, new String[]{"DenierUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_descriptor, new String[]{"SenderUuid"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n*lunarclient/websocket/friend/v1/push.proto\u0012\u001flunarclient.websocket.friend.v1\u001a!lunarclient/common/v1/color.proto\u001a!lunarclient/common/v1/radio.proto\u001a lunarclient/common/v1/uuid.proto\u001a,lunarclient/websocket/friend/v1/common.proto\"Ë\u0001\n\u0010FriendStatusPush\u0012T\n\ronline_friend\u0018\u0001 \u0001(\u000b2-.lunarclient.websocket.friend.v1.OnlineFriendH\u0000R\fonlineFriend\u0012W\n\u000eoffline_friend\u0018\u0002 \u0001(\u000b2..lunarclient.websocket.friend.v1.OfflineFriendH\u0000R\rofflineFriendB\b\n\u0006friend\"\u0094\u0001\n\u0013FriendRadioInfoPush\u0012<\n\u000bfriend_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nfriendUuid\u0012?\n\nradio_info\u0018\u0002 \u0001(\u000b2 .lunarclient.common.v1.RadioInfoR\tradioInfo\"T\n\u0014FriendRemovedYouPush\u0012<\n\u000bfriend_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nfriendUuid\"Á\u0002\n\u0019FriendRequestReceivedPush\u0012>\n\u0006sender\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006sender\u0012H\n\u0011sender_logo_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u000fsenderLogoColor\u0012H\n\u0011sender_plus_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\u000fsenderPlusColor\u0012(\n\u0010sender_rank_name\u0018\u0005 \u0001(\tR\u000esenderRankName\u0012&\n\u000fsender_badge_id\u0018\u0006 \u0001(\u0005R\rsenderBadgeId\"«\u0001\n\u0019FriendRequestAcceptedPush\u0012G\n\u000fnew_friend_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidB\u0002\u0018\u0001R\rnewFriendUuid\u0012E\n\nnew_friend\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\tnewFriend\"W\n\u0017FriendRequestDeniedPush\u0012<\n\u000bdenier_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\ndenierUuid\"Y\n\u0019FriendRequestCanceledPush\u0012<\n\u000bsender_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nsenderUuidBÏ\u0001\n#com.lunarclient.websocket.friend.v1B\tPushProtoP\u0001¢\u0002\u0003LWFª\u0002\u001fLunarclient.Websocket.Friend.V1Ê\u0002\u001fLunarclient\\Websocket\\Friend\\V1â\u0002+Lunarclient\\Websocket\\Friend\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Friend::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), RadioProto.getDescriptor(), UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      RadioProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
