package com.lunarclient.apollo.title.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ComponentProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_title_v1_DisplayTitleMessage_descriptor,
      new String[]{
         "TitleType", "Message", "Scale", "FadeInTime", "DisplayTime", "FadeOutTime", "AdventureJsonMessage", "InterpolationScale", "InterpolationRate"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_title_v1_ResetTitlesMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_title_v1_ResetTitlesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_title_v1_ResetTitlesMessage_descriptor, new String[0]
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
         "\n(lunarclient/apollo/title/v1/schema.proto\u0012\u001blunarclient.apollo.title.v1\u001a\u001egoogle/protobuf/duration.proto\u001a,lunarclient/apollo/common/v1/component.proto\"\u0089\u0004\n\u0013DisplayTitleMessage\u0012E\n\ntitle_type\u0018\u0001 \u0001(\u000e2&.lunarclient.apollo.title.v1.TitleTypeR\ttitleType\u0012E\n\u0007message\u0018\u0002 \u0001(\u000b2'.lunarclient.apollo.common.v1.ComponentB\u0002\u0018\u0001R\u0007message\u0012\u0014\n\u0005scale\u0018\u0003 \u0001(\u0002R\u0005scale\u0012;\n\ffade_in_time\u0018\u0004 \u0001(\u000b2\u0019.google.protobuf.DurationR\nfadeInTime\u0012<\n\fdisplay_time\u0018\u0005 \u0001(\u000b2\u0019.google.protobuf.DurationR\u000bdisplayTime\u0012=\n\rfade_out_time\u0018\u0006 \u0001(\u000b2\u0019.google.protobuf.DurationR\u000bfadeOutTime\u00124\n\u0016adventure_json_message\u0018\u0007 \u0001(\tR\u0014adventureJsonMessage\u0012/\n\u0013interpolation_scale\u0018\b \u0001(\u0002R\u0012interpolationScale\u0012-\n\u0012interpolation_rate\u0018\t \u0001(\u0002R\u0011interpolationRate\"\u0014\n\u0012ResetTitlesMessage*V\n\tTitleType\u0012\u001a\n\u0016TITLE_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0014\n\u0010TITLE_TYPE_TITLE\u0010\u0001\u0012\u0017\n\u0013TITLE_TYPE_SUBTITLE\u0010\u0002B½\u0001\n\u001fcom.lunarclient.apollo.title.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LATª\u0002\u001bLunarclient.Apollo.Title.V1Ê\u0002\u001bLunarclient\\Apollo\\Title\\V1â\u0002'Lunarclient\\Apollo\\Title\\V1\\GPBMetadataê\u0002\u001eLunarclient::Apollo::Title::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), ComponentProto.getDescriptor()}
      );
      DurationProto.getDescriptor();
      ComponentProto.getDescriptor();
   }
}
