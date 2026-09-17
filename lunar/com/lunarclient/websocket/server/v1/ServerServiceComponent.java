package com.lunarclient.websocket.server.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class ServerService implements Service {
   protected ServerService() {
   }

   public static Service newReflectiveService(final ServerService.Interface var0) {
      return new ServerService() {
         @Override
         public void getPlayerCounts(RpcController var1, GetPlayerCountsRequest var2, RpcCallback<GetPlayerCountsResponse> var3) {
            var0.getPlayerCounts(var1, var2, var3);
         }

         @Override
         public void checkServerRecommendations(
            RpcController var1, CheckServerRecommendationsRequest var2, RpcCallback<CheckServerRecommendationsResponse> var3
         ) {
            var0.checkServerRecommendations(var1, var2, var3);
         }

         @Override
         public void getServerRecommendations(RpcController var1, GetServerRecommendationsRequest var2, RpcCallback<GetServerRecommendationsResponse> var3) {
            var0.getServerRecommendations(var1, var2, var3);
         }

         @Override
         public void checkAuthorizedFeatures(RpcController var1, CheckAuthorizedFeaturesRequest var2, RpcCallback<CheckAuthorizedFeaturesResponse> var3) {
            var0.checkAuthorizedFeatures(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final ServerService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return ServerService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != ServerService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.getPlayerCounts(var2, (GetPlayerCountsRequest)var3);
               case 1:
                  return var0.checkServerRecommendations(var2, (CheckServerRecommendationsRequest)var3);
               case 2:
                  return var0.getServerRecommendations(var2, (GetServerRecommendationsRequest)var3);
               case 3:
                  return var0.checkAuthorizedFeatures(var2, (CheckAuthorizedFeaturesRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ServerService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return GetPlayerCountsRequest.getDefaultInstance();
               case 1:
                  return CheckServerRecommendationsRequest.getDefaultInstance();
               case 2:
                  return GetServerRecommendationsRequest.getDefaultInstance();
               case 3:
                  return CheckAuthorizedFeaturesRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ServerService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return GetPlayerCountsResponse.getDefaultInstance();
               case 1:
                  return CheckServerRecommendationsResponse.getDefaultInstance();
               case 2:
                  return GetServerRecommendationsResponse.getDefaultInstance();
               case 3:
                  return CheckAuthorizedFeaturesResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void getPlayerCounts(RpcController var1, GetPlayerCountsRequest var2, RpcCallback<GetPlayerCountsResponse> var3);

   public abstract void checkServerRecommendations(
      RpcController var1, CheckServerRecommendationsRequest var2, RpcCallback<CheckServerRecommendationsResponse> var3
   );

   public abstract void getServerRecommendations(RpcController var1, GetServerRecommendationsRequest var2, RpcCallback<GetServerRecommendationsResponse> var3);

   public abstract void checkAuthorizedFeatures(RpcController var1, CheckAuthorizedFeaturesRequest var2, RpcCallback<CheckAuthorizedFeaturesResponse> var3);

   public static final Descriptors.ServiceDescriptor getDescriptor() {
      return ServiceProto.getDescriptor().getServices().get(0);
   }

   @Override
   public final Descriptors.ServiceDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   @Override
   public final void callMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3, RpcCallback<Message> var4) {
      if (var1.getService() != getDescriptor()) {
         throw new IllegalArgumentException("Service.callMethod() given method descriptor for wrong service type.");
      }

      switch (var1.getIndex()) {
         case 0:
            this.getPlayerCounts(var2, (GetPlayerCountsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.checkServerRecommendations(var2, (CheckServerRecommendationsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.getServerRecommendations(var2, (GetServerRecommendationsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.checkAuthorizedFeatures(var2, (CheckAuthorizedFeaturesRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   @Override
   public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
      if (var1.getService() != getDescriptor()) {
         throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
      }

      switch (var1.getIndex()) {
         case 0:
            return GetPlayerCountsRequest.getDefaultInstance();
         case 1:
            return CheckServerRecommendationsRequest.getDefaultInstance();
         case 2:
            return GetServerRecommendationsRequest.getDefaultInstance();
         case 3:
            return CheckAuthorizedFeaturesRequest.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   @Override
   public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
      if (var1.getService() != getDescriptor()) {
         throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
      }

      switch (var1.getIndex()) {
         case 0:
            return GetPlayerCountsResponse.getDefaultInstance();
         case 1:
            return CheckServerRecommendationsResponse.getDefaultInstance();
         case 2:
            return GetServerRecommendationsResponse.getDefaultInstance();
         case 3:
            return CheckAuthorizedFeaturesResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static ServerService.Stub newStub(RpcChannel var0) {
      return new ServerService.Stub(var0);
   }

   public static ServerService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new ServerService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      GetPlayerCountsResponse getPlayerCounts(RpcController var1, GetPlayerCountsRequest var2);

      CheckServerRecommendationsResponse checkServerRecommendations(RpcController var1, CheckServerRecommendationsRequest var2);

      GetServerRecommendationsResponse getServerRecommendations(RpcController var1, GetServerRecommendationsRequest var2);

      CheckAuthorizedFeaturesResponse checkAuthorizedFeatures(RpcController var1, CheckAuthorizedFeaturesRequest var2);
   }

   private static final class BlockingStub implements ServerService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public GetPlayerCountsResponse getPlayerCounts(RpcController var1, GetPlayerCountsRequest var2) {
         return (GetPlayerCountsResponse)this.channel
            .callBlockingMethod(ServerService.getDescriptor().getMethods().get(0), var1, var2, GetPlayerCountsResponse.getDefaultInstance());
      }

      @Override
      public CheckServerRecommendationsResponse checkServerRecommendations(RpcController var1, CheckServerRecommendationsRequest var2) {
         return (CheckServerRecommendationsResponse)this.channel
            .callBlockingMethod(ServerService.getDescriptor().getMethods().get(1), var1, var2, CheckServerRecommendationsResponse.getDefaultInstance());
      }

      @Override
      public GetServerRecommendationsResponse getServerRecommendations(RpcController var1, GetServerRecommendationsRequest var2) {
         return (GetServerRecommendationsResponse)this.channel
            .callBlockingMethod(ServerService.getDescriptor().getMethods().get(2), var1, var2, GetServerRecommendationsResponse.getDefaultInstance());
      }

      @Override
      public CheckAuthorizedFeaturesResponse checkAuthorizedFeatures(RpcController var1, CheckAuthorizedFeaturesRequest var2) {
         return (CheckAuthorizedFeaturesResponse)this.channel
            .callBlockingMethod(ServerService.getDescriptor().getMethods().get(3), var1, var2, CheckAuthorizedFeaturesResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void getPlayerCounts(RpcController var1, GetPlayerCountsRequest var2, RpcCallback<GetPlayerCountsResponse> var3);

      void checkServerRecommendations(RpcController var1, CheckServerRecommendationsRequest var2, RpcCallback<CheckServerRecommendationsResponse> var3);

      void getServerRecommendations(RpcController var1, GetServerRecommendationsRequest var2, RpcCallback<GetServerRecommendationsResponse> var3);

      void checkAuthorizedFeatures(RpcController var1, CheckAuthorizedFeaturesRequest var2, RpcCallback<CheckAuthorizedFeaturesResponse> var3);
   }

   public static final class Stub extends ServerService implements ServerService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void getPlayerCounts(RpcController var1, GetPlayerCountsRequest var2, RpcCallback<GetPlayerCountsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               GetPlayerCountsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, GetPlayerCountsResponse.class, GetPlayerCountsResponse.getDefaultInstance())
            );
      }

      @Override
      public void checkServerRecommendations(RpcController var1, CheckServerRecommendationsRequest var2, RpcCallback<CheckServerRecommendationsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               CheckServerRecommendationsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CheckServerRecommendationsResponse.class, CheckServerRecommendationsResponse.getDefaultInstance())
            );
      }

      @Override
      public void getServerRecommendations(RpcController var1, GetServerRecommendationsRequest var2, RpcCallback<GetServerRecommendationsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               GetServerRecommendationsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, GetServerRecommendationsResponse.class, GetServerRecommendationsResponse.getDefaultInstance())
            );
      }

      @Override
      public void checkAuthorizedFeatures(RpcController var1, CheckAuthorizedFeaturesRequest var2, RpcCallback<CheckAuthorizedFeaturesResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               CheckAuthorizedFeaturesResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CheckAuthorizedFeaturesResponse.class, CheckAuthorizedFeaturesResponse.getDefaultInstance())
            );
      }
   }
}
