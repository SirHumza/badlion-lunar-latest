package com.lunarclient.apollo.waypoint.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.LocationProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_waypoint_v1_DisplayWaypointMessage_descriptor,
      new String[]{"Name", "Location", "Color", "PreventRemoval", "Hidden", "ShowBeam", "HighlightBlock", "HighlightBlockLineWidth", "Style"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_waypoint_v1_ShowWaypointMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_waypoint_v1_ShowWaypointMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_waypoint_v1_ShowWaypointMessage_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_waypoint_v1_HideWaypointMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_waypoint_v1_HideWaypointMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_waypoint_v1_HideWaypointMessage_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_waypoint_v1_RemoveWaypointMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_waypoint_v1_RemoveWaypointMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_waypoint_v1_RemoveWaypointMessage_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_waypoint_v1_ResetWaypointsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_waypoint_v1_ResetWaypointsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_waypoint_v1_ResetWaypointsMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_waypoint_v1_WaypointTextStyle_descriptor,
      new String[]{
         "ShowText", "OnlyShowTextWhenLookingNear", "ShowIcons", "TextIconScale", "LabelScale", "BoxPadding", "BoxBorders", "TextShadow", "ShowDistance"
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
         "\n+lunarclient/apollo/waypoint/v1/schema.proto\u0012\u001elunarclient.apollo.waypoint.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a+lunarclient/apollo/common/v1/location.proto\"½\u0003\n\u0016DisplayWaypointMessage\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012G\n\blocation\u0018\u0002 \u0001(\u000b2+.lunarclient.apollo.common.v1.BlockLocationR\blocation\u00129\n\u0005color\u0018\u0003 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\u0012'\n\u000fprevent_removal\u0018\u0004 \u0001(\bR\u000epreventRemoval\u0012\u0016\n\u0006hidden\u0018\u0005 \u0001(\bR\u0006hidden\u0012\u001b\n\tshow_beam\u0018\u0006 \u0001(\bR\bshowBeam\u0012'\n\u000fhighlight_block\u0018\u0007 \u0001(\bR\u000ehighlightBlock\u0012;\n\u001ahighlight_block_line_width\u0018\b \u0001(\u0002R\u0017highlightBlockLineWidth\u0012G\n\u0005style\u0018\t \u0001(\u000b21.lunarclient.apollo.waypoint.v1.WaypointTextStyleR\u0005style\")\n\u0013ShowWaypointMessage\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\")\n\u0013HideWaypointMessage\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\"+\n\u0015RemoveWaypointMessage\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\"\u0017\n\u0015ResetWaypointsMessage\"ç\u0002\n\u0011WaypointTextStyle\u0012\u001b\n\tshow_text\u0018\u0001 \u0001(\bR\bshowText\u0012E\n only_show_text_when_looking_near\u0018\u0002 \u0001(\bR\u001bonlyShowTextWhenLookingNear\u0012\u001d\n\nshow_icons\u0018\u0003 \u0001(\bR\tshowIcons\u0012&\n\u000ftext_icon_scale\u0018\u0004 \u0001(\u0002R\rtextIconScale\u0012\u001f\n\u000blabel_scale\u0018\u0005 \u0001(\u0002R\nlabelScale\u0012\u001f\n\u000bbox_padding\u0018\u0006 \u0001(\u0002R\nboxPadding\u0012\u001f\n\u000bbox_borders\u0018\u0007 \u0001(\bR\nboxBorders\u0012\u001f\n\u000btext_shadow\u0018\b \u0001(\bR\ntextShadow\u0012#\n\rshow_distance\u0018\t \u0001(\bR\fshowDistanceBÌ\u0001\n\"com.lunarclient.apollo.waypoint.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAWª\u0002\u001eLunarclient.Apollo.Waypoint.V1Ê\u0002\u001eLunarclient\\Apollo\\Waypoint\\V1â\u0002*Lunarclient\\Apollo\\Waypoint\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Waypoint::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), LocationProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      LocationProto.getDescriptor();
   }
}
