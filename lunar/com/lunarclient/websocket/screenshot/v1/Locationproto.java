package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.LocationProto;
import com.lunarclient.common.v1.PositionProto;
import com.lunarclient.common.v1.SkinProto;
import com.lunarclient.common.v1.UuidProto;
import com.lunarclient.common.v1.VersionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_ScreenshotMessage_descriptor,
      new String[]{
         "Author",
         "States",
         "Players",
         "Dimension",
         "Biome",
         "Yaw",
         "Pitch",
         "Pos",
         "Size",
         "Perspective",
         "HasHud",
         "DayTime",
         "Weather",
         "Health",
         "MaxHealth",
         "FoodLevel",
         "SaturationLevel",
         "LocalId"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_descriptor,
      new String[]{"Player", "States", "Cosmetics", "Emote", "EmoteJam", "Skin", "Cape"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_descriptor, new String[]{"McVersion", "LunarVersion", "Location"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_Dimensions_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_Dimensions_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_Dimensions_descriptor, new String[]{"Width", "Height"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n0lunarclient/websocket/screenshot/v1/common.proto\u0012#lunarclient.websocket.screenshot.v1\u001a$lunarclient/common/v1/location.proto\u001a$lunarclient/common/v1/position.proto\u001a lunarclient/common/v1/skin.proto\u001a lunarclient/common/v1/uuid.proto\u001a#lunarclient/common/v1/version.proto\"Ë\u0006\n\u0011ScreenshotMessage\u0012>\n\u0006author\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006author\u0012H\n\u0006states\u0018\u0002 \u0003(\u000e20.lunarclient.websocket.screenshot.v1.PlayerStateR\u0006states\u0012O\n\u0007players\u0018\u0003 \u0003(\u000b25.lunarclient.websocket.screenshot.v1.ScreenshotPlayerR\u0007players\u0012\u001c\n\tdimension\u0018\u0004 \u0001(\tR\tdimension\u0012\u0014\n\u0005biome\u0018\u0005 \u0001(\tR\u0005biome\u0012\u0010\n\u0003yaw\u0018\u0006 \u0001(\u0002R\u0003yaw\u0012\u0014\n\u0005pitch\u0018\u0007 \u0001(\u0002R\u0005pitch\u00121\n\u0003pos\u0018\b \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3fR\u0003pos\u0012C\n\u0004size\u0018\t \u0001(\u000b2/.lunarclient.websocket.screenshot.v1.DimensionsR\u0004size\u0012R\n\u000bperspective\u0018\n \u0001(\u000e20.lunarclient.websocket.screenshot.v1.PerspectiveR\u000bperspective\u0012\u0017\n\u0007has_hud\u0018\u000b \u0001(\bR\u0006hasHud\u0012\u0019\n\bday_time\u0018\f \u0001(\u0003R\u0007dayTime\u0012F\n\u0007weather\u0018\r \u0001(\u000e2,.lunarclient.websocket.screenshot.v1.WeatherR\u0007weather\u0012\u0016\n\u0006health\u0018\u000e \u0001(\u0002R\u0006health\u0012\u001d\n\nmax_health\u0018\u000f \u0001(\u0002R\tmaxHealth\u0012\u001d\n\nfood_level\u0018\u0010 \u0001(\u0002R\tfoodLevel\u0012)\n\u0010saturation_level\u0018\u0011 \u0001(\u0002R\u000fsaturationLevel\u00126\n\blocal_id\u0018\u0012 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0007localId\"»\u0002\n\u0010ScreenshotPlayer\u0012>\n\u0006player\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameR\u0006player\u0012H\n\u0006states\u0018\u0002 \u0003(\u000e20.lunarclient.websocket.screenshot.v1.PlayerStateR\u0006states\u0012\u001c\n\tcosmetics\u0018\u0003 \u0003(\u0005R\tcosmetics\u0012\u0014\n\u0005emote\u0018\u0004 \u0001(\u0005R\u0005emote\u0012\u001b\n\temote_jam\u0018\u0005 \u0001(\u0005R\bemoteJam\u00128\n\u0004skin\u0018\u0006 \u0001(\u000b2$.lunarclient.common.v1.MinecraftSkinR\u0004skin\u0012\u0012\n\u0004cape\u0018\u0007 \u0001(\tR\u0004cape\"ê\u0001\n\u0013ExtraScreenshotData\u0012F\n\nmc_version\u0018\u0001 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\tmcVersion\u0012N\n\rlunar_version\u0018\u0002 \u0001(\u000b2).lunarclient.common.v1.LunarClientVersionR\flunarVersion\u0012;\n\blocation\u0018\u0003 \u0001(\u000b2\u001f.lunarclient.common.v1.LocationR\blocation\":\n\nDimensions\u0012\u0014\n\u0005width\u0018\u0001 \u0001(\u0003R\u0005width\u0012\u0016\n\u0006height\u0018\u0002 \u0001(\u0003R\u0006height*n\n\u000bPerspective\u0012\u001b\n\u0017PERSPECTIVE_UNSPECIFIED\u0010\u0000\u0012\u0015\n\u0011PERSPECTIVE_FIRST\u0010\u0001\u0012\u0014\n\u0010PERSPECTIVE_BACK\u0010\u0002\u0012\u0015\n\u0011PERSPECTIVE_FRONT\u0010\u0003*Ó\u0002\n\u000bPlayerState\u0012\u001c\n\u0018PLAYER_STATE_UNSPECIFIED\u0010\u0000\u0012\u0019\n\u0015PLAYER_STATE_SLEEPING\u0010\u0001\u0012\u001e\n\u001aPLAYER_STATE_ELYTRA_FLYING\u0010\u0002\u0012\u0017\n\u0013PLAYER_STATE_FLYING\u0010\u0003\u0012\u001a\n\u0016PLAYER_STATE_SPRINTING\u0010\u0004\u0012\u0019\n\u0015PLAYER_STATE_SNEAKING\u0010\u0005\u0012\u0019\n\u0015PLAYER_STATE_SWIMMING\u0010\u0006\u0012\u0017\n\u0013PLAYER_STATE_RIDING\u0010\u0007\u0012\u0018\n\u0014PLAYER_STATE_JUMPING\u0010\b\u0012\u0018\n\u0014PLAYER_STATE_FALLING\u0010\t\u0012\u0018\n\u0014PLAYER_STATE_WALKING\u0010\n\u0012\u0019\n\u0015PLAYER_STATE_STANDING\u0010\u000b*n\n\u0007Weather\u0012\u0017\n\u0013WEATHER_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rWEATHER_CLEAR\u0010\u0001\u0012\u0010\n\fWEATHER_RAIN\u0010\u0002\u0012\u0010\n\fWEATHER_SNOW\u0010\u0003\u0012\u0013\n\u000fWEATHER_THUNDER\u0010\u0004*\u0097\u0001\n\u0011ScreenshotPrivacy\u0012\"\n\u001eSCREENSHOT_PRIVACY_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019SCREENSHOT_PRIVACY_PUBLIC\u0010\u0001\u0012\u001f\n\u001bSCREENSHOT_PRIVACY_UNLISTED\u0010\u0002\u0012\u001e\n\u001aSCREENSHOT_PRIVACY_PRIVATE\u0010\u0003Bå\u0001\n'com.lunarclient.websocket.screenshot.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002#Lunarclient.Websocket.Screenshot.V1Ê\u0002#Lunarclient\\Websocket\\Screenshot\\V1â\u0002/Lunarclient\\Websocket\\Screenshot\\V1\\GPBMetadataê\u0002&Lunarclient::Websocket::Screenshot::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            LocationProto.getDescriptor(), PositionProto.getDescriptor(), SkinProto.getDescriptor(), UuidProto.getDescriptor(), VersionProto.getDescriptor()
         }
      );
      LocationProto.getDescriptor();
      PositionProto.getDescriptor();
      SkinProto.getDescriptor();
      UuidProto.getDescriptor();
      VersionProto.getDescriptor();
   }
}
