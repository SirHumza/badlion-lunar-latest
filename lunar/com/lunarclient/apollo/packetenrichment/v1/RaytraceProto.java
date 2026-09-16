package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.EntityidProto;
import com.lunarclient.apollo.common.v1.LocationProto;

public final class RaytraceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_RayTraceResult_descriptor, new String[]{"Block", "Entity", "Miss", "Hit"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_BlockHit_descriptor, new String[]{"HitLocation", "BlockLocation", "Direction"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_EntityHit_descriptor, new String[]{"HitLocation", "EntityId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_Miss_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_Miss_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_Miss_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private RaytraceProto() {
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
         "\n5lunarclient/apollo/packetenrichment/v1/raytrace.proto\u0012&lunarclient.apollo.packetenrichment.v1\u001a+lunarclient/apollo/common/v1/entityid.proto\u001a+lunarclient/apollo/common/v1/location.proto\"ò\u0001\n\u000eRayTraceResult\u0012H\n\u0005block\u0018\u0001 \u0001(\u000b20.lunarclient.apollo.packetenrichment.v1.BlockHitH\u0000R\u0005block\u0012K\n\u0006entity\u0018\u0002 \u0001(\u000b21.lunarclient.apollo.packetenrichment.v1.EntityHitH\u0000R\u0006entity\u0012B\n\u0004miss\u0018\u0003 \u0001(\u000b2,.lunarclient.apollo.packetenrichment.v1.MissH\u0000R\u0004missB\u0005\n\u0003hit\"ú\u0001\n\bBlockHit\u0012I\n\fhit_location\u0018\u0001 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\u000bhitLocation\u0012R\n\u000eblock_location\u0018\u0002 \u0001(\u000b2+.lunarclient.apollo.common.v1.BlockLocationR\rblockLocation\u0012O\n\tdirection\u0018\u0003 \u0001(\u000e21.lunarclient.apollo.packetenrichment.v1.DirectionR\tdirection\"\u009b\u0001\n\tEntityHit\u0012I\n\fhit_location\u0018\u0001 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\u000bhitLocation\u0012C\n\tentity_id\u0018\u0002 \u0001(\u000b2&.lunarclient.apollo.common.v1.EntityIdR\bentityId\"\u0006\n\u0004Miss*\u009e\u0001\n\tDirection\u0012\u0019\n\u0015DIRECTION_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eDIRECTION_DOWN\u0010\u0001\u0012\u0010\n\fDIRECTION_UP\u0010\u0002\u0012\u0013\n\u000fDIRECTION_NORTH\u0010\u0003\u0012\u0013\n\u000fDIRECTION_SOUTH\u0010\u0004\u0012\u0012\n\u000eDIRECTION_WEST\u0010\u0005\u0012\u0012\n\u000eDIRECTION_EAST\u0010\u0006Bö\u0001\n*com.lunarclient.apollo.packetenrichment.v1B\rRaytraceProtoP\u0001¢\u0002\u0003LAPª\u0002&Lunarclient.Apollo.Packetenrichment.V1Ê\u0002&Lunarclient\\Apollo\\Packetenrichment\\V1â\u00022Lunarclient\\Apollo\\Packetenrichment\\V1\\GPBMetadataê\u0002)Lunarclient::Apollo::Packetenrichment::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{EntityidProto.getDescriptor(), LocationProto.getDescriptor()}
      );
      EntityidProto.getDescriptor();
      LocationProto.getDescriptor();
   }
}
