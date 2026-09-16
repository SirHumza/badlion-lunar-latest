package com.lunarclient.gameipc.location.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.InboundLocationProto;
import com.lunarclient.common.v1.LocationProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_location_v1_UpdateLocationRequest_descriptor, new String[]{"Location", "InboundLocation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_location_v1_UpdateFocusRequest_descriptor, new String[]{"Focused"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_location_v1_UpdateFocusResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_location_v1_UpdateFocusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_location_v1_UpdateFocusResponse_descriptor, new String[0]
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
         "\n-lunarclient/gameipc/location/v1/service.proto\u0012\u001flunarclient.gameipc.location.v1\u001a$lunarclient/common/v1/location.proto\u001a,lunarclient/common/v1/inbound_location.proto\"§\u0001\n\u0015UpdateLocationRequest\u0012;\n\blocation\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.LocationR\blocation\u0012Q\n\u0010inbound_location\u0018\u0002 \u0001(\u000b2&.lunarclient.common.v1.InboundLocationR\u000finboundLocation\"\u0018\n\u0016UpdateLocationResponse\".\n\u0012UpdateFocusRequest\u0012\u0018\n\u0007focused\u0018\u0001 \u0001(\bR\u0007focused\"\u0015\n\u0013UpdateFocusResponse2\u008f\u0002\n\u000fLocationService\u0012x\n\u000bUpdateFocus\u00123.lunarclient.gameipc.location.v1.UpdateFocusRequest\u001a4.lunarclient.gameipc.location.v1.UpdateFocusResponse\u0012\u0081\u0001\n\u000eUpdateLocation\u00126.lunarclient.gameipc.location.v1.UpdateLocationRequest\u001a7.lunarclient.gameipc.location.v1.UpdateLocationResponseBÕ\u0001\n#com.lunarclient.gameipc.location.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGLª\u0002\u001fLunarclient.Gameipc.Location.V1Ê\u0002\u001fLunarclient\\Gameipc\\Location\\V1â\u0002+Lunarclient\\Gameipc\\Location\\V1\\GPBMetadataê\u0002\"Lunarclient::Gameipc::Location::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{LocationProto.getDescriptor(), InboundLocationProto.getDescriptor()}
      );
      LocationProto.getDescriptor();
      InboundLocationProto.getDescriptor();
   }
}
