package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.IconProto;
import com.lunarclient.apollo.common.v1.LocationProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_DisplayMarkerMessage_descriptor,
      new String[]{"Id", "Location", "OwnerId", "OwnerName", "Flag", "Target", "Duration", "InGameNotification", "ChatNotify", "MiddleClickRemove", "Style"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_ResetMarkersMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_MarkerFlag_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_MarkerFlag_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_MarkerFlag_descriptor, new String[]{"Normal", "Danger", "Info", "Interest", "Flag"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_NormalMarker_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_NormalMarker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_NormalMarker_descriptor, new String[]{"Color"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_DangerMarker_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_DangerMarker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_DangerMarker_descriptor, new String[]{"Color"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_InfoMarker_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_InfoMarker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_InfoMarker_descriptor, new String[]{"Color"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_InterestMarker_descriptor = getDescriptor().getMessageTypes().get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_InterestMarker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_InterestMarker_descriptor, new String[]{"Color"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_MarkerTarget_descriptor = getDescriptor().getMessageTypes().get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_MarkerTarget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_MarkerTarget_descriptor, new String[]{"Item", "Block", "Entity", "Player", "Target"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_ItemTarget_descriptor = getDescriptor().getMessageTypes().get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_ItemTarget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_ItemTarget_descriptor, new String[]{"ItemStack"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_BlockTarget_descriptor = getDescriptor().getMessageTypes().get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_BlockTarget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_BlockTarget_descriptor, new String[]{"ItemStack"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_EntityTarget_descriptor = getDescriptor().getMessageTypes().get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_EntityTarget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_EntityTarget_descriptor, new String[]{"EntityType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_PlayerTarget_descriptor = getDescriptor().getMessageTypes().get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_PlayerTarget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_PlayerTarget_descriptor, new String[]{"Uuid", "Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_marker_v1_MarkerStyle_descriptor = getDescriptor().getMessageTypes().get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_marker_v1_MarkerStyle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_marker_v1_MarkerStyle_descriptor,
      new String[]{
         "Scale",
         "AnimateMarkerOnHover",
         "CompactMode",
         "TextShadow",
         "OwnerSuffix",
         "OwnerDisplay",
         "ShowOwner",
         "ShowCoordinates",
         "ShowDistance",
         "ShowDescription",
         "DescriptionDisplay"
      }
   );
   private static Descriptors.FileDescriptor descriptor;

   private SchemaProto() {
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
         "\n)lunarclient/apollo/marker/v1/schema.proto\u0012\u001clunarclient.apollo.marker.v1\u001a\u001egoogle/protobuf/duration.proto\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/icon.proto\u001a+lunarclient/apollo/common/v1/location.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"Å\u0004\n\u0014DisplayMarkerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012B\n\blocation\u0018\u0002 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\blocation\u0012=\n\bowner_id\u0018\u0003 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0007ownerId\u0012\u001d\n\nowner_name\u0018\u0004 \u0001(\tR\townerName\u0012<\n\u0004flag\u0018\u0005 \u0001(\u000b2(.lunarclient.apollo.marker.v1.MarkerFlagR\u0004flag\u0012B\n\u0006target\u0018\u0006 \u0001(\u000b2*.lunarclient.apollo.marker.v1.MarkerTargetR\u0006target\u00125\n\bduration\u0018\u0007 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\u00120\n\u0014in_game_notification\u0018\b \u0001(\bR\u0012inGameNotification\u0012\u001f\n\u000bchat_notify\u0018\t \u0001(\bR\nchatNotify\u0012.\n\u0013middle_click_remove\u0018\n \u0001(\bR\u0011middleClickRemove\u0012?\n\u0005style\u0018\u000b \u0001(\u000b2).lunarclient.apollo.marker.v1.MarkerStyleR\u0005style\"%\n\u0013RemoveMarkerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0015\n\u0013ResetMarkersMessage\"¬\u0002\n\nMarkerFlag\u0012D\n\u0006normal\u0018\u0001 \u0001(\u000b2*.lunarclient.apollo.marker.v1.NormalMarkerH\u0000R\u0006normal\u0012D\n\u0006danger\u0018\u0002 \u0001(\u000b2*.lunarclient.apollo.marker.v1.DangerMarkerH\u0000R\u0006danger\u0012>\n\u0004info\u0018\u0003 \u0001(\u000b2(.lunarclient.apollo.marker.v1.InfoMarkerH\u0000R\u0004info\u0012J\n\binterest\u0018\u0004 \u0001(\u000b2,.lunarclient.apollo.marker.v1.InterestMarkerH\u0000R\binterestB\u0006\n\u0004flag\"I\n\fNormalMarker\u00129\n\u0005color\u0018\u0001 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\"I\n\fDangerMarker\u00129\n\u0005color\u0018\u0001 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\"G\n\nInfoMarker\u00129\n\u0005color\u0018\u0001 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\"K\n\u000eInterestMarker\u00129\n\u0005color\u0018\u0001 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\"§\u0002\n\fMarkerTarget\u0012>\n\u0004item\u0018\u0001 \u0001(\u000b2(.lunarclient.apollo.marker.v1.ItemTargetH\u0000R\u0004item\u0012A\n\u0005block\u0018\u0002 \u0001(\u000b2).lunarclient.apollo.marker.v1.BlockTargetH\u0000R\u0005block\u0012D\n\u0006entity\u0018\u0003 \u0001(\u000b2*.lunarclient.apollo.marker.v1.EntityTargetH\u0000R\u0006entity\u0012D\n\u0006player\u0018\u0004 \u0001(\u000b2*.lunarclient.apollo.marker.v1.PlayerTargetH\u0000R\u0006playerB\b\n\u0006target\"X\n\nItemTarget\u0012J\n\nitem_stack\u0018\u0001 \u0001(\u000b2+.lunarclient.apollo.common.v1.ItemStackIconR\titemStack\"Y\n\u000bBlockTarget\u0012J\n\nitem_stack\u0018\u0001 \u0001(\u000b2+.lunarclient.apollo.common.v1.ItemStackIconR\titemStack\"/\n\fEntityTarget\u0012\u001f\n\u000bentity_type\u0018\u0001 \u0001(\tR\nentityType\"Z\n\fPlayerTarget\u00126\n\u0004uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\u0004uuid\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\"ó\u0005\n\u000bMarkerStyle\u0012\u0014\n\u0005scale\u0018\u0001 \u0001(\u0002R\u0005scale\u00125\n\u0017animate_marker_on_hover\u0018\u0002 \u0001(\bR\u0014animateMarkerOnHover\u0012!\n\fcompact_mode\u0018\u0003 \u0001(\bR\u000bcompactMode\u0012\u001f\n\u000btext_shadow\u0018\u0004 \u0001(\bR\ntextShadow\u0012!\n\fowner_suffix\u0018\u0005 \u0001(\tR\u000bownerSuffix\u0012U\n\rowner_display\u0018\u0006 \u0001(\u000e20.lunarclient.apollo.marker.v1.MarkerOwnerDisplayR\fownerDisplay\u0012S\n\nshow_owner\u0018\u0007 \u0001(\u000e24.lunarclient.apollo.marker.v1.MarkerDisplayConditionR\tshowOwner\u0012_\n\u0010show_coordinates\u0018\b \u0001(\u000e24.lunarclient.apollo.marker.v1.MarkerDisplayConditionR\u000fshowCoordinates\u0012Y\n\rshow_distance\u0018\t \u0001(\u000e24.lunarclient.apollo.marker.v1.MarkerDisplayConditionR\fshowDistance\u0012_\n\u0010show_description\u0018\n \u0001(\u000e24.lunarclient.apollo.marker.v1.MarkerDisplayConditionR\u000fshowDescription\u0012g\n\u0013description_display\u0018\u000b \u0001(\u000e26.lunarclient.apollo.marker.v1.MarkerDescriptionDisplayR\u0012descriptionDisplay*¯\u0001\n\u0016MarkerDisplayCondition\u0012(\n$MARKER_DISPLAY_CONDITION_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eMARKER_DISPLAY_CONDITION_NEVER\u0010\u0001\u0012\"\n\u001eMARKER_DISPLAY_CONDITION_HOVER\u0010\u0002\u0012#\n\u001fMARKER_DISPLAY_CONDITION_ALWAYS\u0010\u0003*x\n\u0012MarkerOwnerDisplay\u0012$\n MARKER_OWNER_DISPLAY_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019MARKER_OWNER_DISPLAY_HEAD\u0010\u0001\u0012\u001d\n\u0019MARKER_OWNER_DISPLAY_NAME\u0010\u0002*\u0090\u0001\n\u0018MarkerDescriptionDisplay\u0012*\n&MARKER_DESCRIPTION_DISPLAY_UNSPECIFIED\u0010\u0000\u0012#\n\u001fMARKER_DESCRIPTION_DISPLAY_ICON\u0010\u0001\u0012#\n\u001fMARKER_DESCRIPTION_DISPLAY_TEXT\u0010\u0002BÂ\u0001\n com.lunarclient.apollo.marker.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAMª\u0002\u001cLunarclient.Apollo.Marker.V1Ê\u0002\u001cLunarclient\\Apollo\\Marker\\V1â\u0002(Lunarclient\\Apollo\\Marker\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Marker::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            DurationProto.getDescriptor(), ColorProto.getDescriptor(), IconProto.getDescriptor(), LocationProto.getDescriptor(), UuidProto.getDescriptor()
         }
      );
      DurationProto.getDescriptor();
      ColorProto.getDescriptor();
      IconProto.getDescriptor();
      LocationProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
