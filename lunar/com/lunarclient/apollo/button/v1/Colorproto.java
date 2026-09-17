package com.lunarclient.apollo.button.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.IconProto;
import com.lunarclient.apollo.hud.v1.PositionProto;

public final class ButtonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_button_v1_ButtonSize_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_button_v1_ButtonSize_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_button_v1_ButtonSize_descriptor, new String[]{"Width", "Height"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_button_v1_ButtonContentPart_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_button_v1_ButtonContentPart_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_button_v1_ButtonContentPart_descriptor, new String[]{"AdventureJsonText", "Icon", "Part"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_button_v1_ButtonTooltip_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_button_v1_ButtonTooltip_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_button_v1_ButtonTooltip_descriptor, new String[]{"AdventureJsonLines"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_button_v1_ButtonContent_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_button_v1_ButtonContent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_button_v1_ButtonContent_descriptor, new String[]{"Parts", "Scale"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_button_v1_Button_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_button_v1_Button_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_button_v1_Button_descriptor,
      new String[]{
         "Id",
         "Position",
         "Size",
         "Shape",
         "BackgroundColor",
         "BorderColor",
         "Content",
         "Tooltip",
         "RunCommand",
         "OpenUrl",
         "ClientAction",
         "HoveredBackgroundColor",
         "HoveredBorderColor",
         "OnClick"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_button_v1_ButtonUpdate_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_button_v1_ButtonUpdate_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_button_v1_ButtonUpdate_descriptor, new String[]{"Content", "Tooltip"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ButtonProto() {
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
         "\n)lunarclient/apollo/button/v1/button.proto\u0012\u001clunarclient.apollo.button.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/icon.proto\u001a(lunarclient/apollo/hud/v1/position.proto\":\n\nButtonSize\u0012\u0014\n\u0005width\u0018\u0001 \u0001(\u0002R\u0005width\u0012\u0016\n\u0006height\u0018\u0002 \u0001(\u0002R\u0006height\"\u0087\u0001\n\u0011ButtonContentPart\u00120\n\u0013adventure_json_text\u0018\u0001 \u0001(\tH\u0000R\u0011adventureJsonText\u00128\n\u0004icon\u0018\u0002 \u0001(\u000b2\".lunarclient.apollo.common.v1.IconH\u0000R\u0004iconB\u0006\n\u0004part\"A\n\rButtonTooltip\u00120\n\u0014adventure_json_lines\u0018\u0001 \u0003(\tR\u0012adventureJsonLines\"l\n\rButtonContent\u0012E\n\u0005parts\u0018\u0001 \u0003(\u000b2/.lunarclient.apollo.button.v1.ButtonContentPartR\u0005parts\u0012\u0014\n\u0005scale\u0018\u0002 \u0001(\u0002R\u0005scale\"Ü\u0006\n\u0006Button\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012B\n\bposition\u0018\u0002 \u0001(\u000b2&.lunarclient.apollo.hud.v1.HudPositionR\bposition\u0012<\n\u0004size\u0018\u0003 \u0001(\u000b2(.lunarclient.apollo.button.v1.ButtonSizeR\u0004size\u0012?\n\u0005shape\u0018\u0004 \u0001(\u000e2).lunarclient.apollo.button.v1.ButtonShapeR\u0005shape\u0012N\n\u0010background_color\u0018\u0005 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u000fbackgroundColor\u0012F\n\fborder_color\u0018\u0006 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u000bborderColor\u0012E\n\u0007content\u0018\u0007 \u0001(\u000b2+.lunarclient.apollo.button.v1.ButtonContentR\u0007content\u0012E\n\u0007tooltip\u0018\b \u0001(\u000b2+.lunarclient.apollo.button.v1.ButtonTooltipR\u0007tooltip\u0012!\n\u000brun_command\u0018\t \u0001(\tH\u0000R\nrunCommand\u0012\u001b\n\bopen_url\u0018\n \u0001(\tH\u0000R\u0007openUrl\u0012W\n\rclient_action\u0018\u000b \u0001(\u000e20.lunarclient.apollo.button.v1.ButtonClientActionH\u0000R\fclientAction\u0012]\n\u0018hovered_background_color\u0018\f \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0016hoveredBackgroundColor\u0012U\n\u0014hovered_border_color\u0018\r \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0012hoveredBorderColorB\n\n\bon_click\"\u009c\u0001\n\fButtonUpdate\u0012E\n\u0007content\u0018\u0001 \u0001(\u000b2+.lunarclient.apollo.button.v1.ButtonContentR\u0007content\u0012E\n\u0007tooltip\u0018\u0002 \u0001(\u000b2+.lunarclient.apollo.button.v1.ButtonTooltipR\u0007tooltip*e\n\u000bButtonShape\u0012\u001c\n\u0018BUTTON_SHAPE_UNSPECIFIED\u0010\u0000\u0012\u001f\n\u001bBUTTON_SHAPE_ROUNDED_SQUARE\u0010\u0001\u0012\u0017\n\u0013BUTTON_SHAPE_CIRCLE\u0010\u0002*\u0094\u0001\n\u0012ButtonClientAction\u0012$\n BUTTON_CLIENT_ACTION_UNSPECIFIED\u0010\u0000\u0012*\n&BUTTON_CLIENT_ACTION_OPEN_MINIMAP_VIEW\u0010\u0001\u0012,\n(BUTTON_CLIENT_ACTION_OPEN_WAYPOINTS_MENU\u0010\u0002BÂ\u0001\n com.lunarclient.apollo.button.v1B\u000bButtonProtoP\u0001¢\u0002\u0003LABª\u0002\u001cLunarclient.Apollo.Button.V1Ê\u0002\u001cLunarclient\\Apollo\\Button\\V1â\u0002(Lunarclient\\Apollo\\Button\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Button::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), IconProto.getDescriptor(), PositionProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      IconProto.getDescriptor();
      PositionProto.getDescriptor();
   }
}
