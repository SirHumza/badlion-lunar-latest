package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class HostedWorldService implements Service {
   protected HostedWorldService() {
   }

   public static Service newReflectiveService(final HostedWorldService.Interface var0) {
      return new HostedWorldService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void startHostingWorld(RpcController var1, StartHostingWorldRequest var2, RpcCallback<StartHostingWorldResponse> var3) {
            var0.startHostingWorld(var1, var2, var3);
         }

         @Override
         public void stopHostingWorld(RpcController var1, StopHostingWorldRequest var2, RpcCallback<StopHostingWorldResponse> var3) {
            var0.stopHostingWorld(var1, var2, var3);
         }

         @Override
         public void hostedWorldHeartbeat(RpcController var1, HostedWorldHeartbeatRequest var2, RpcCallback<HostedWorldHeartbeatResponse> var3) {
            var0.hostedWorldHeartbeat(var1, var2, var3);
         }

         @Override
         public void listHostedWorlds(RpcController var1, ListHostedWorldsRequest var2, RpcCallback<ListHostedWorldsResponse> var3) {
            var0.listHostedWorlds(var1, var2, var3);
         }

         @Override
         public void preJoinHostedWorld(RpcController var1, PreJoinHostedWorldRequest var2, RpcCallback<PreJoinHostedWorldResponse> var3) {
            var0.preJoinHostedWorld(var1, var2, var3);
         }

         @Override
         public void joinHostedWorld(RpcController var1, JoinHostedWorldRequest var2, RpcCallback<JoinHostedWorldResponse> var3) {
            var0.joinHostedWorld(var1, var2, var3);
         }

         @Override
         public void confirmHostedWorldJoin(RpcController var1, ConfirmHostedWorldJoinRequest var2, RpcCallback<ConfirmHostedWorldJoinResponse> var3) {
            var0.confirmHostedWorldJoin(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final HostedWorldService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return HostedWorldService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != HostedWorldService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.startHostingWorld(var2, (StartHostingWorldRequest)var3);
               case 2:
                  return var0.stopHostingWorld(var2, (StopHostingWorldRequest)var3);
               case 3:
                  return var0.hostedWorldHeartbeat(var2, (HostedWorldHeartbeatRequest)var3);
               case 4:
                  return var0.listHostedWorlds(var2, (ListHostedWorldsRequest)var3);
               case 5:
                  return var0.preJoinHostedWorld(var2, (PreJoinHostedWorldRequest)var3);
               case 6:
                  return var0.joinHostedWorld(var2, (JoinHostedWorldRequest)var3);
               case 7:
                  return var0.confirmHostedWorldJoin(var2, (ConfirmHostedWorldJoinRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != HostedWorldService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return StartHostingWorldRequest.getDefaultInstance();
               case 2:
                  return StopHostingWorldRequest.getDefaultInstance();
               case 3:
                  return HostedWorldHeartbeatRequest.getDefaultInstance();
               case 4:
                  return ListHostedWorldsRequest.getDefaultInstance();
               case 5:
                  return PreJoinHostedWorldRequest.getDefaultInstance();
               case 6:
                  return JoinHostedWorldRequest.getDefaultInstance();
               case 7:
                  return ConfirmHostedWorldJoinRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != HostedWorldService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return StartHostingWorldResponse.getDefaultInstance();
               case 2:
                  return StopHostingWorldResponse.getDefaultInstance();
               case 3:
                  return HostedWorldHeartbeatResponse.getDefaultInstance();
               case 4:
                  return ListHostedWorldsResponse.getDefaultInstance();
               case 5:
                  return PreJoinHostedWorldResponse.getDefaultInstance();
               case 6:
                  return JoinHostedWorldResponse.getDefaultInstance();
               case 7:
                  return ConfirmHostedWorldJoinResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void startHostingWorld(RpcController var1, StartHostingWorldRequest var2, RpcCallback<StartHostingWorldResponse> var3);

   public abstract void stopHostingWorld(RpcController var1, StopHostingWorldRequest var2, RpcCallback<StopHostingWorldResponse> var3);

   public abstract void hostedWorldHeartbeat(RpcController var1, HostedWorldHeartbeatRequest var2, RpcCallback<HostedWorldHeartbeatResponse> var3);

   public abstract void listHostedWorlds(RpcController var1, ListHostedWorldsRequest var2, RpcCallback<ListHostedWorldsResponse> var3);

   public abstract void preJoinHostedWorld(RpcController var1, PreJoinHostedWorldRequest var2, RpcCallback<PreJoinHostedWorldResponse> var3);

   public abstract void joinHostedWorld(RpcController var1, JoinHostedWorldRequest var2, RpcCallback<JoinHostedWorldResponse> var3);

   public abstract void confirmHostedWorldJoin(RpcController var1, ConfirmHostedWorldJoinRequest var2, RpcCallback<ConfirmHostedWorldJoinResponse> var3);

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
            this.startHostingWorld(var2, (StartHostingWorldRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.stopHostingWorld(var2, (StopHostingWorldRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.hostedWorldHeartbeat(var2, (HostedWorldHeartbeatRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.listHostedWorlds(var2, (ListHostedWorldsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.preJoinHostedWorld(var2, (PreJoinHostedWorldRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 6:
            this.joinHostedWorld(var2, (JoinHostedWorldRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 7:
            this.confirmHostedWorldJoin(var2, (ConfirmHostedWorldJoinRequest)var3, RpcUtil.specializeCallback(var4));
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
            return StartHostingWorldRequest.getDefaultInstance();
         case 2:
            return StopHostingWorldRequest.getDefaultInstance();
         case 3:
            return HostedWorldHeartbeatRequest.getDefaultInstance();
         case 4:
            return ListHostedWorldsRequest.getDefaultInstance();
         case 5:
            return PreJoinHostedWorldRequest.getDefaultInstance();
         case 6:
            return JoinHostedWorldRequest.getDefaultInstance();
         case 7:
            return ConfirmHostedWorldJoinRequest.getDefaultInstance();
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
            return StartHostingWorldResponse.getDefaultInstance();
         case 2:
            return StopHostingWorldResponse.getDefaultInstance();
         case 3:
            return HostedWorldHeartbeatResponse.getDefaultInstance();
         case 4:
            return ListHostedWorldsResponse.getDefaultInstance();
         case 5:
            return PreJoinHostedWorldResponse.getDefaultInstance();
         case 6:
            return JoinHostedWorldResponse.getDefaultInstance();
         case 7:
            return ConfirmHostedWorldJoinResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static HostedWorldService.Stub newStub(RpcChannel var0) {
      return new HostedWorldService.Stub(var0);
   }

   public static HostedWorldService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new HostedWorldService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      StartHostingWorldResponse startHostingWorld(RpcController var1, StartHostingWorldRequest var2);

      StopHostingWorldResponse stopHostingWorld(RpcController var1, StopHostingWorldRequest var2);

      HostedWorldHeartbeatResponse hostedWorldHeartbeat(RpcController var1, HostedWorldHeartbeatRequest var2);

      ListHostedWorldsResponse listHostedWorlds(RpcController var1, ListHostedWorldsRequest var2);

      PreJoinHostedWorldResponse preJoinHostedWorld(RpcController var1, PreJoinHostedWorldRequest var2);

      JoinHostedWorldResponse joinHostedWorld(RpcController var1, JoinHostedWorldRequest var2);

      ConfirmHostedWorldJoinResponse confirmHostedWorldJoin(RpcController var1, ConfirmHostedWorldJoinRequest var2);
   }

   private static final class BlockingStub implements HostedWorldService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public StartHostingWorldResponse startHostingWorld(RpcController var1, StartHostingWorldRequest var2) {
         return (StartHostingWorldResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(1), var1, var2, StartHostingWorldResponse.getDefaultInstance());
      }

      @Override
      public StopHostingWorldResponse stopHostingWorld(RpcController var1, StopHostingWorldRequest var2) {
         return (StopHostingWorldResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(2), var1, var2, StopHostingWorldResponse.getDefaultInstance());
      }

      @Override
      public HostedWorldHeartbeatResponse hostedWorldHeartbeat(RpcController var1, HostedWorldHeartbeatRequest var2) {
         return (HostedWorldHeartbeatResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(3), var1, var2, HostedWorldHeartbeatResponse.getDefaultInstance());
      }

      @Override
      public ListHostedWorldsResponse listHostedWorlds(RpcController var1, ListHostedWorldsRequest var2) {
         return (ListHostedWorldsResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(4), var1, var2, ListHostedWorldsResponse.getDefaultInstance());
      }

      @Override
      public PreJoinHostedWorldResponse preJoinHostedWorld(RpcController var1, PreJoinHostedWorldRequest var2) {
         return (PreJoinHostedWorldResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(5), var1, var2, PreJoinHostedWorldResponse.getDefaultInstance());
      }

      @Override
      public JoinHostedWorldResponse joinHostedWorld(RpcController var1, JoinHostedWorldRequest var2) {
         return (JoinHostedWorldResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(6), var1, var2, JoinHostedWorldResponse.getDefaultInstance());
      }

      @Override
      public ConfirmHostedWorldJoinResponse confirmHostedWorldJoin(RpcController var1, ConfirmHostedWorldJoinRequest var2) {
         return (ConfirmHostedWorldJoinResponse)this.channel
            .callBlockingMethod(HostedWorldService.getDescriptor().getMethods().get(7), var1, var2, ConfirmHostedWorldJoinResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void startHostingWorld(RpcController var1, StartHostingWorldRequest var2, RpcCallback<StartHostingWorldResponse> var3);

      void stopHostingWorld(RpcController var1, StopHostingWorldRequest var2, RpcCallback<StopHostingWorldResponse> var3);

      void hostedWorldHeartbeat(RpcController var1, HostedWorldHeartbeatRequest var2, RpcCallback<HostedWorldHeartbeatResponse> var3);

      void listHostedWorlds(RpcController var1, ListHostedWorldsRequest var2, RpcCallback<ListHostedWorldsResponse> var3);

      void preJoinHostedWorld(RpcController var1, PreJoinHostedWorldRequest var2, RpcCallback<PreJoinHostedWorldResponse> var3);

      void joinHostedWorld(RpcController var1, JoinHostedWorldRequest var2, RpcCallback<JoinHostedWorldResponse> var3);

      void confirmHostedWorldJoin(RpcController var1, ConfirmHostedWorldJoinRequest var2, RpcCallback<ConfirmHostedWorldJoinResponse> var3);
   }

   public static final class Stub extends HostedWorldService implements HostedWorldService.Interface {
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
      public void startHostingWorld(RpcController var1, StartHostingWorldRequest var2, RpcCallback<StartHostingWorldResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               StartHostingWorldResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StartHostingWorldResponse.class, StartHostingWorldResponse.getDefaultInstance())
            );
      }

      @Override
      public void stopHostingWorld(RpcController var1, StopHostingWorldRequest var2, RpcCallback<StopHostingWorldResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               StopHostingWorldResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StopHostingWorldResponse.class, StopHostingWorldResponse.getDefaultInstance())
            );
      }

      @Override
      public void hostedWorldHeartbeat(RpcController var1, HostedWorldHeartbeatRequest var2, RpcCallback<HostedWorldHeartbeatResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               HostedWorldHeartbeatResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, HostedWorldHeartbeatResponse.class, HostedWorldHeartbeatResponse.getDefaultInstance())
            );
      }

      @Override
      public void listHostedWorlds(RpcController var1, ListHostedWorldsRequest var2, RpcCallback<ListHostedWorldsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               ListHostedWorldsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ListHostedWorldsResponse.class, ListHostedWorldsResponse.getDefaultInstance())
            );
      }

      @Override
      public void preJoinHostedWorld(RpcController var1, PreJoinHostedWorldRequest var2, RpcCallback<PreJoinHostedWorldResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               PreJoinHostedWorldResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, PreJoinHostedWorldResponse.class, PreJoinHostedWorldResponse.getDefaultInstance())
            );
      }

      @Override
      public void joinHostedWorld(RpcController var1, JoinHostedWorldRequest var2, RpcCallback<JoinHostedWorldResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(6),
               var1,
               var2,
               JoinHostedWorldResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, JoinHostedWorldResponse.class, JoinHostedWorldResponse.getDefaultInstance())
            );
      }

      @Override
      public void confirmHostedWorldJoin(RpcController var1, ConfirmHostedWorldJoinRequest var2, RpcCallback<ConfirmHostedWorldJoinResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(7),
               var1,
               var2,
               ConfirmHostedWorldJoinResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ConfirmHostedWorldJoinResponse.class, ConfirmHostedWorldJoinResponse.getDefaultInstance())
            );
      }
   }
}
