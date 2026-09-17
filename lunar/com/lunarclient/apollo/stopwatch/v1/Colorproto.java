package com.lunarclient.apollo.stopwatch.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.hud.v1.PositionProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_AddStopwatchMessage_descriptor,
      new String[]{"Id", "Name", "ResetOnStart", "PreventModification", "HideWhenStopped", "DisplayFormat", "TextColor", "HudPosition"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_RemoveStopwatchMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_RemoveStopwatchMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_RemoveStopwatchMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_StartStopwatchMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_StartStopwatchMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_StartStopwatchMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_StopStopwatchMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_StopStopwatchMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_StopStopwatchMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_ResetStopwatchMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_ResetStopwatchMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_ResetStopwatchMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_ResetStopwatchesMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_ResetStopwatchesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_ResetStopwatchesMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_descriptor = getDescriptor().getMessageTypes().get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_AddTimerMessage_descriptor,
      new String[]{
         "Id",
         "Name",
         "Duration",
         "Loop",
         "PreventModification",
         "InGameNotification",
         "HideWhenStopped",
         "DisplayFormat",
         "TitleTextAdventureJsonLines",
         "TextColor",
         "HudPosition"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_RemoveTimerMessage_descriptor = getDescriptor().getMessageTypes().get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_RemoveTimerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_RemoveTimerMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_StartTimerMessage_descriptor = getDescriptor().getMessageTypes().get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_StartTimerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_StartTimerMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_StopTimerMessage_descriptor = getDescriptor().getMessageTypes().get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_StopTimerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_StopTimerMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_descriptor = getDescriptor().getMessageTypes().get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_stopwatch_v1_ResetTimersMessage_descriptor, new String[0]
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
         "\n,lunarclient/apollo/stopwatch/v1/schema.proto\u0012\u001flunarclient.apollo.stopwatch.v1\u001a\u001egoogle/protobuf/duration.proto\u001a(lunarclient/apollo/common/v1/color.proto\u001a(lunarclient/apollo/hud/v1/position.proto\"ô\u0002\n\u0013AddStopwatchMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012$\n\u000ereset_on_start\u0018\u0003 \u0001(\bR\fresetOnStart\u00121\n\u0014prevent_modification\u0018\u0004 \u0001(\bR\u0013preventModification\u0012*\n\u0011hide_when_stopped\u0018\u0005 \u0001(\bR\u000fhideWhenStopped\u0012%\n\u000edisplay_format\u0018\u0006 \u0001(\tR\rdisplayFormat\u0012B\n\ntext_color\u0018\u0007 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\ttextColor\u0012I\n\fhud_position\u0018\b \u0001(\u000b2&.lunarclient.apollo.hud.v1.HudPositionR\u000bhudPosition\"(\n\u0016RemoveStopwatchMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"'\n\u0015StartStopwatchMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"&\n\u0014StopStopwatchMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"'\n\u0015ResetStopwatchMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0019\n\u0017ResetStopwatchesMessage\"\u008d\u0004\n\u000fAddTimerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u00125\n\bduration\u0018\u0003 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\u0012\u0012\n\u0004loop\u0018\u0004 \u0001(\bR\u0004loop\u00121\n\u0014prevent_modification\u0018\u0005 \u0001(\bR\u0013preventModification\u00120\n\u0014in_game_notification\u0018\u0006 \u0001(\bR\u0012inGameNotification\u0012*\n\u0011hide_when_stopped\u0018\u0007 \u0001(\bR\u000fhideWhenStopped\u0012%\n\u000edisplay_format\u0018\b \u0001(\tR\rdisplayFormat\u0012D\n\u001ftitle_text_adventure_json_lines\u0018\t \u0001(\tR\u001btitleTextAdventureJsonLines\u0012B\n\ntext_color\u0018\n \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\ttextColor\u0012I\n\fhud_position\u0018\u000b \u0001(\u000b2&.lunarclient.apollo.hud.v1.HudPositionR\u000bhudPosition\"$\n\u0012RemoveTimerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"#\n\u0011StartTimerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\"\n\u0010StopTimerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"#\n\u0011ResetTimerMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0014\n\u0012ResetTimersMessageBÑ\u0001\n#com.lunarclient.apollo.stopwatch.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LASª\u0002\u001fLunarclient.Apollo.Stopwatch.V1Ê\u0002\u001fLunarclient\\Apollo\\Stopwatch\\V1â\u0002+Lunarclient\\Apollo\\Stopwatch\\V1\\GPBMetadataê\u0002\"Lunarclient::Apollo::Stopwatch::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), ColorProto.getDescriptor(), PositionProto.getDescriptor()}
      );
      DurationProto.getDescriptor();
      ColorProto.getDescriptor();
      PositionProto.getDescriptor();
   }
}
