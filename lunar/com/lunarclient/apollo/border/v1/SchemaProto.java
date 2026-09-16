package com.lunarclient.apollo.border.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.CuboidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_border_v1_DisplayBorderMessage_descriptor,
      new String[]{"Id", "World", "CancelEntry", "CancelExit", "CanShrinkOrExpand", "Color", "Bounds", "DurationTicks"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_border_v1_RemoveBorderMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_border_v1_RemoveBorderMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_border_v1_RemoveBorderMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_border_v1_ResetBordersMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_border_v1_ResetBordersMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_border_v1_ResetBordersMessage_descriptor, new String[0]
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
         "\n)lunarclient/apollo/border/v1/schema.proto\u0012\u001clunarclient.apollo.border.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a)lunarclient/apollo/common/v1/cuboid.proto\"Ó\u0002\n\u0014DisplayBorderMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0014\n\u0005world\u0018\u0002 \u0001(\tR\u0005world\u0012!\n\fcancel_entry\u0018\u0003 \u0001(\bR\u000bcancelEntry\u0012\u001f\n\u000bcancel_exit\u0018\u0004 \u0001(\bR\ncancelExit\u0012/\n\u0014can_shrink_or_expand\u0018\u0005 \u0001(\bR\u0011canShrinkOrExpand\u00129\n\u0005color\u0018\u0006 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\u0012>\n\u0006bounds\u0018\u0007 \u0001(\u000b2&.lunarclient.apollo.common.v1.Cuboid2DR\u0006bounds\u0012%\n\u000eduration_ticks\u0018\b \u0001(\u0005R\rdurationTicks\"%\n\u0013RemoveBorderMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u0015\n\u0013ResetBordersMessageBÂ\u0001\n com.lunarclient.apollo.border.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LABª\u0002\u001cLunarclient.Apollo.Border.V1Ê\u0002\u001cLunarclient\\Apollo\\Border\\V1â\u0002(Lunarclient\\Apollo\\Border\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Border::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), CuboidProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      CuboidProto.getDescriptor();
   }
}
