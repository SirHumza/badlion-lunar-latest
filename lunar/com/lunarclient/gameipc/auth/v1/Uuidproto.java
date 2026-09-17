package com.lunarclient.gameipc.auth.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_descriptor, new String[]{"Status", "Url"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_RefreshAccountRequest_descriptor, new String[]{"Uuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_descriptor, new String[]{"Success", "Error"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_AddAccountRequest_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_AddAccountRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_AddAccountRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_AddAccountResponse_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_AddAccountResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_AddAccountResponse_descriptor, new String[]{"Success", "Error"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_NotifySwitchAccountRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_NotifySwitchAccountRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_NotifySwitchAccountRequest_descriptor, new String[]{"Uuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_auth_v1_NotifySwitchAccountResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_auth_v1_NotifySwitchAccountResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_auth_v1_NotifySwitchAccountResponse_descriptor, new String[0]
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
         "\n)lunarclient/gameipc/auth/v1/service.proto\u0012\u001blunarclient.gameipc.auth.v1\u001a lunarclient/common/v1/uuid.proto\"\u001b\n\u0019OpenMicrosoftPopupRequest\"æ\u0001\n\u001aOpenMicrosoftPopupResponse\u0012V\n\u0006status\u0018\u0001 \u0001(\u000e2>.lunarclient.gameipc.auth.v1.OpenMicrosoftPopupResponse.StatusR\u0006status\u0012\u0010\n\u0003url\u0018\u0002 \u0001(\tR\u0003url\"^\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019STATUS_MATCHED_TARGET_URL\u0010\u0001\u0012\u001d\n\u0019STATUS_CLOSED_WITH_NO_URL\u0010\u0002\"H\n\u0015RefreshAccountRequest\u0012/\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0004uuid\"Û\u0002\n\u0016RefreshAccountResponse\u0012\u0018\n\u0007success\u0018\u0001 \u0001(\bR\u0007success\u0012V\n\u0005error\u0018\u0002 \u0001(\u000e2@.lunarclient.gameipc.auth.v1.RefreshAccountResponse.AccountErrorR\u0005error\"Î\u0001\n\fAccountError\u0012\u001d\n\u0019ACCOUNT_ERROR_UNSPECIFIED\u0010\u0000\u0012%\n!ACCOUNT_ERROR_ACCOUNTS_FILE_EMPTY\u0010\u0001\u0012)\n%ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT\u0010\u0002\u0012'\n#ACCOUNT_ERROR_MISSING_REFRESH_TOKEN\u0010\u0003\u0012$\n ACCOUNT_ERROR_ALREADY_REFRESHING\u0010\u0004\"\u0013\n\u0011AddAccountRequest\"Ü\u0001\n\u0012AddAccountResponse\u0012\u0018\n\u0007success\u0018\u0001 \u0001(\bR\u0007success\u0012R\n\u0005error\u0018\u0002 \u0001(\u000e2<.lunarclient.gameipc.auth.v1.AddAccountResponse.AccountErrorR\u0005error\"X\n\fAccountError\u0012\u001d\n\u0019ACCOUNT_ERROR_UNSPECIFIED\u0010\u0000\u0012)\n%ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT\u0010\u0001\"M\n\u001aNotifySwitchAccountRequest\u0012/\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0004uuid\"\u001d\n\u001bNotifySwitchAccountResponse2÷\u0001\n\u000bAuthService\u0012y\n\u000eRefreshAccount\u00122.lunarclient.gameipc.auth.v1.RefreshAccountRequest\u001a3.lunarclient.gameipc.auth.v1.RefreshAccountResponse\u0012m\n\nAddAccount\u0012..lunarclient.gameipc.auth.v1.AddAccountRequest\u001a/.lunarclient.gameipc.auth.v1.AddAccountResponseBÁ\u0001\n\u001fcom.lunarclient.gameipc.auth.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGAª\u0002\u001bLunarclient.Gameipc.Auth.V1Ê\u0002\u001bLunarclient\\Gameipc\\Auth\\V1â\u0002'Lunarclient\\Gameipc\\Auth\\V1\\GPBMetadataê\u0002\u001eLunarclient::Gameipc::Auth::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
