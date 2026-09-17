package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class CosmeticService implements Service {
   protected CosmeticService() {
   }

   public static Service newReflectiveService(final CosmeticService.Interface var0) {
      return new CosmeticService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void createOutfit(RpcController var1, CreateOutfitRequest var2, RpcCallback<CreateOutfitResponse> var3) {
            var0.createOutfit(var1, var2, var3);
         }

         @Override
         public void updateOutfit(RpcController var1, UpdateOutfitRequest var2, RpcCallback<UpdateOutfitResponse> var3) {
            var0.updateOutfit(var1, var2, var3);
         }

         @Override
         public void deleteOutfit(RpcController var1, DeleteOutfitRequest var2, RpcCallback<DeleteOutfitResponse> var3) {
            var0.deleteOutfit(var1, var2, var3);
         }

         @Override
         public void selectOutfit(RpcController var1, SelectOutfitRequest var2, RpcCallback<SelectOutfitResponse> var3) {
            var0.selectOutfit(var1, var2, var3);
         }

         @Override
         public void favoriteCosmetic(RpcController var1, FavoriteCosmeticRequest var2, RpcCallback<FavoriteCosmeticResponse> var3) {
            var0.favoriteCosmetic(var1, var2, var3);
         }

         @Override
         public void unfavoriteCosmetic(RpcController var1, UnfavoriteCosmeticRequest var2, RpcCallback<UnfavoriteCosmeticResponse> var3) {
            var0.unfavoriteCosmetic(var1, var2, var3);
         }

         @Override
         public void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3) {
            var0.loadTabLogos(var1, var2, var3);
         }

         @Override
         public void setCosmeticOwnershipVisibility(
            RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
         ) {
            var0.setCosmeticOwnershipVisibility(var1, var2, var3);
         }

         @Override
         public void updateLunarPlusColor(RpcController var1, UpdateLunarPlusColorRequest var2, RpcCallback<UpdateLunarPlusColorResponse> var3) {
            var0.updateLunarPlusColor(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final CosmeticService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return CosmeticService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != CosmeticService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.createOutfit(var2, (CreateOutfitRequest)var3);
               case 2:
                  return var0.updateOutfit(var2, (UpdateOutfitRequest)var3);
               case 3:
                  return var0.deleteOutfit(var2, (DeleteOutfitRequest)var3);
               case 4:
                  return var0.selectOutfit(var2, (SelectOutfitRequest)var3);
               case 5:
                  return var0.favoriteCosmetic(var2, (FavoriteCosmeticRequest)var3);
               case 6:
                  return var0.unfavoriteCosmetic(var2, (UnfavoriteCosmeticRequest)var3);
               case 7:
                  return var0.loadTabLogos(var2, (LoadTabLogosRequest)var3);
               case 8:
                  return var0.setCosmeticOwnershipVisibility(var2, (SetCosmeticOwnershipVisibilityRequest)var3);
               case 9:
                  return var0.updateLunarPlusColor(var2, (UpdateLunarPlusColorRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != CosmeticService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return CreateOutfitRequest.getDefaultInstance();
               case 2:
                  return UpdateOutfitRequest.getDefaultInstance();
               case 3:
                  return DeleteOutfitRequest.getDefaultInstance();
               case 4:
                  return SelectOutfitRequest.getDefaultInstance();
               case 5:
                  return FavoriteCosmeticRequest.getDefaultInstance();
               case 6:
                  return UnfavoriteCosmeticRequest.getDefaultInstance();
               case 7:
                  return LoadTabLogosRequest.getDefaultInstance();
               case 8:
                  return SetCosmeticOwnershipVisibilityRequest.getDefaultInstance();
               case 9:
                  return UpdateLunarPlusColorRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != CosmeticService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return CreateOutfitResponse.getDefaultInstance();
               case 2:
                  return UpdateOutfitResponse.getDefaultInstance();
               case 3:
                  return DeleteOutfitResponse.getDefaultInstance();
               case 4:
                  return SelectOutfitResponse.getDefaultInstance();
               case 5:
                  return FavoriteCosmeticResponse.getDefaultInstance();
               case 6:
                  return UnfavoriteCosmeticResponse.getDefaultInstance();
               case 7:
                  return LoadTabLogosResponse.getDefaultInstance();
               case 8:
                  return SetCosmeticOwnershipVisibilityResponse.getDefaultInstance();
               case 9:
                  return UpdateLunarPlusColorResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void createOutfit(RpcController var1, CreateOutfitRequest var2, RpcCallback<CreateOutfitResponse> var3);

   public abstract void updateOutfit(RpcController var1, UpdateOutfitRequest var2, RpcCallback<UpdateOutfitResponse> var3);

   public abstract void deleteOutfit(RpcController var1, DeleteOutfitRequest var2, RpcCallback<DeleteOutfitResponse> var3);

   public abstract void selectOutfit(RpcController var1, SelectOutfitRequest var2, RpcCallback<SelectOutfitResponse> var3);

   public abstract void favoriteCosmetic(RpcController var1, FavoriteCosmeticRequest var2, RpcCallback<FavoriteCosmeticResponse> var3);

   public abstract void unfavoriteCosmetic(RpcController var1, UnfavoriteCosmeticRequest var2, RpcCallback<UnfavoriteCosmeticResponse> var3);

   public abstract void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3);

   public abstract void setCosmeticOwnershipVisibility(
      RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
   );

   public abstract void updateLunarPlusColor(RpcController var1, UpdateLunarPlusColorRequest var2, RpcCallback<UpdateLunarPlusColorResponse> var3);

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
            this.login(var2, (LoginRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.createOutfit(var2, (CreateOutfitRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.updateOutfit(var2, (UpdateOutfitRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.deleteOutfit(var2, (DeleteOutfitRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.selectOutfit(var2, (SelectOutfitRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.favoriteCosmetic(var2, (FavoriteCosmeticRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 6:
            this.unfavoriteCosmetic(var2, (UnfavoriteCosmeticRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 7:
            this.loadTabLogos(var2, (LoadTabLogosRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 8:
            this.setCosmeticOwnershipVisibility(var2, (SetCosmeticOwnershipVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 9:
            this.updateLunarPlusColor(var2, (UpdateLunarPlusColorRequest)var3, RpcUtil.specializeCallback(var4));
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
            return LoginRequest.getDefaultInstance();
         case 1:
            return CreateOutfitRequest.getDefaultInstance();
         case 2:
            return UpdateOutfitRequest.getDefaultInstance();
         case 3:
            return DeleteOutfitRequest.getDefaultInstance();
         case 4:
            return SelectOutfitRequest.getDefaultInstance();
         case 5:
            return FavoriteCosmeticRequest.getDefaultInstance();
         case 6:
            return UnfavoriteCosmeticRequest.getDefaultInstance();
         case 7:
            return LoadTabLogosRequest.getDefaultInstance();
         case 8:
            return SetCosmeticOwnershipVisibilityRequest.getDefaultInstance();
         case 9:
            return UpdateLunarPlusColorRequest.getDefaultInstance();
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
            return LoginResponse.getDefaultInstance();
         case 1:
            return CreateOutfitResponse.getDefaultInstance();
         case 2:
            return UpdateOutfitResponse.getDefaultInstance();
         case 3:
            return DeleteOutfitResponse.getDefaultInstance();
         case 4:
            return SelectOutfitResponse.getDefaultInstance();
         case 5:
            return FavoriteCosmeticResponse.getDefaultInstance();
         case 6:
            return UnfavoriteCosmeticResponse.getDefaultInstance();
         case 7:
            return LoadTabLogosResponse.getDefaultInstance();
         case 8:
            return SetCosmeticOwnershipVisibilityResponse.getDefaultInstance();
         case 9:
            return UpdateLunarPlusColorResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static CosmeticService.Stub newStub(RpcChannel var0) {
      return new CosmeticService.Stub(var0);
   }

   public static CosmeticService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new CosmeticService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      CreateOutfitResponse createOutfit(RpcController var1, CreateOutfitRequest var2);

      UpdateOutfitResponse updateOutfit(RpcController var1, UpdateOutfitRequest var2);

      DeleteOutfitResponse deleteOutfit(RpcController var1, DeleteOutfitRequest var2);

      SelectOutfitResponse selectOutfit(RpcController var1, SelectOutfitRequest var2);

      FavoriteCosmeticResponse favoriteCosmetic(RpcController var1, FavoriteCosmeticRequest var2);

      UnfavoriteCosmeticResponse unfavoriteCosmetic(RpcController var1, UnfavoriteCosmeticRequest var2);

      LoadTabLogosResponse loadTabLogos(RpcController var1, LoadTabLogosRequest var2);

      SetCosmeticOwnershipVisibilityResponse setCosmeticOwnershipVisibility(RpcController var1, SetCosmeticOwnershipVisibilityRequest var2);

      UpdateLunarPlusColorResponse updateLunarPlusColor(RpcController var1, UpdateLunarPlusColorRequest var2);
   }

   private static final class BlockingStub implements CosmeticService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public CreateOutfitResponse createOutfit(RpcController var1, CreateOutfitRequest var2) {
         return (CreateOutfitResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(1), var1, var2, CreateOutfitResponse.getDefaultInstance());
      }

      @Override
      public UpdateOutfitResponse updateOutfit(RpcController var1, UpdateOutfitRequest var2) {
         return (UpdateOutfitResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(2), var1, var2, UpdateOutfitResponse.getDefaultInstance());
      }

      @Override
      public DeleteOutfitResponse deleteOutfit(RpcController var1, DeleteOutfitRequest var2) {
         return (DeleteOutfitResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(3), var1, var2, DeleteOutfitResponse.getDefaultInstance());
      }

      @Override
      public SelectOutfitResponse selectOutfit(RpcController var1, SelectOutfitRequest var2) {
         return (SelectOutfitResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(4), var1, var2, SelectOutfitResponse.getDefaultInstance());
      }

      @Override
      public FavoriteCosmeticResponse favoriteCosmetic(RpcController var1, FavoriteCosmeticRequest var2) {
         return (FavoriteCosmeticResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(5), var1, var2, FavoriteCosmeticResponse.getDefaultInstance());
      }

      @Override
      public UnfavoriteCosmeticResponse unfavoriteCosmetic(RpcController var1, UnfavoriteCosmeticRequest var2) {
         return (UnfavoriteCosmeticResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(6), var1, var2, UnfavoriteCosmeticResponse.getDefaultInstance());
      }

      @Override
      public LoadTabLogosResponse loadTabLogos(RpcController var1, LoadTabLogosRequest var2) {
         return (LoadTabLogosResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(7), var1, var2, LoadTabLogosResponse.getDefaultInstance());
      }

      @Override
      public SetCosmeticOwnershipVisibilityResponse setCosmeticOwnershipVisibility(RpcController var1, SetCosmeticOwnershipVisibilityRequest var2) {
         return (SetCosmeticOwnershipVisibilityResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(8), var1, var2, SetCosmeticOwnershipVisibilityResponse.getDefaultInstance());
      }

      @Override
      public UpdateLunarPlusColorResponse updateLunarPlusColor(RpcController var1, UpdateLunarPlusColorRequest var2) {
         return (UpdateLunarPlusColorResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(9), var1, var2, UpdateLunarPlusColorResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void createOutfit(RpcController var1, CreateOutfitRequest var2, RpcCallback<CreateOutfitResponse> var3);

      void updateOutfit(RpcController var1, UpdateOutfitRequest var2, RpcCallback<UpdateOutfitResponse> var3);

      void deleteOutfit(RpcController var1, DeleteOutfitRequest var2, RpcCallback<DeleteOutfitResponse> var3);

      void selectOutfit(RpcController var1, SelectOutfitRequest var2, RpcCallback<SelectOutfitResponse> var3);

      void favoriteCosmetic(RpcController var1, FavoriteCosmeticRequest var2, RpcCallback<FavoriteCosmeticResponse> var3);

      void unfavoriteCosmetic(RpcController var1, UnfavoriteCosmeticRequest var2, RpcCallback<UnfavoriteCosmeticResponse> var3);

      void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3);

      void setCosmeticOwnershipVisibility(
         RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
      );

      void updateLunarPlusColor(RpcController var1, UpdateLunarPlusColorRequest var2, RpcCallback<UpdateLunarPlusColorResponse> var3);
   }

   public static final class Stub extends CosmeticService implements CosmeticService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               LoginResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoginResponse.class, LoginResponse.getDefaultInstance())
            );
      }

      @Override
      public void createOutfit(RpcController var1, CreateOutfitRequest var2, RpcCallback<CreateOutfitResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               CreateOutfitResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CreateOutfitResponse.class, CreateOutfitResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateOutfit(RpcController var1, UpdateOutfitRequest var2, RpcCallback<UpdateOutfitResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               UpdateOutfitResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateOutfitResponse.class, UpdateOutfitResponse.getDefaultInstance())
            );
      }

      @Override
      public void deleteOutfit(RpcController var1, DeleteOutfitRequest var2, RpcCallback<DeleteOutfitResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               DeleteOutfitResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DeleteOutfitResponse.class, DeleteOutfitResponse.getDefaultInstance())
            );
      }

      @Override
      public void selectOutfit(RpcController var1, SelectOutfitRequest var2, RpcCallback<SelectOutfitResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               SelectOutfitResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SelectOutfitResponse.class, SelectOutfitResponse.getDefaultInstance())
            );
      }

      @Override
      public void favoriteCosmetic(RpcController var1, FavoriteCosmeticRequest var2, RpcCallback<FavoriteCosmeticResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               FavoriteCosmeticResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, FavoriteCosmeticResponse.class, FavoriteCosmeticResponse.getDefaultInstance())
            );
      }

      @Override
      public void unfavoriteCosmetic(RpcController var1, UnfavoriteCosmeticRequest var2, RpcCallback<UnfavoriteCosmeticResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(6),
               var1,
               var2,
               UnfavoriteCosmeticResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UnfavoriteCosmeticResponse.class, UnfavoriteCosmeticResponse.getDefaultInstance())
            );
      }

      @Override
      public void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(7),
               var1,
               var2,
               LoadTabLogosResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadTabLogosResponse.class, LoadTabLogosResponse.getDefaultInstance())
            );
      }

      @Override
      public void setCosmeticOwnershipVisibility(
         RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(8),
               var1,
               var2,
               SetCosmeticOwnershipVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetCosmeticOwnershipVisibilityResponse.class, SetCosmeticOwnershipVisibilityResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateLunarPlusColor(RpcController var1, UpdateLunarPlusColorRequest var2, RpcCallback<UpdateLunarPlusColorResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(9),
               var1,
               var2,
               UpdateLunarPlusColorResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateLunarPlusColorResponse.class, UpdateLunarPlusColorResponse.getDefaultInstance())
            );
      }
   }
}
