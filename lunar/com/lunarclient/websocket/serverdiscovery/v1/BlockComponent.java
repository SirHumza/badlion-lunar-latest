package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class ServerDiscoveryService implements Service {
   protected ServerDiscoveryService() {
   }

   public static Service newReflectiveService(final ServerDiscoveryService.Interface var0) {
      return new ServerDiscoveryService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void discoverServers(RpcController var1, DiscoverServersRequest var2, RpcCallback<DiscoverServersResponse> var3) {
            var0.discoverServers(var1, var2, var3);
         }

         @Override
         public void searchServers(RpcController var1, SearchServersRequest var2, RpcCallback<SearchServersResponse> var3) {
            var0.searchServers(var1, var2, var3);
         }

         @Override
         public void loadAutocompleteSuggestions(
            RpcController var1, LoadAutocompleteSuggestionsRequest var2, RpcCallback<LoadAutocompleteSuggestionsResponse> var3
         ) {
            var0.loadAutocompleteSuggestions(var1, var2, var3);
         }

         @Override
         public void loadServerModal(RpcController var1, LoadServerModalRequest var2, RpcCallback<LoadServerModalResponse> var3) {
            var0.loadServerModal(var1, var2, var3);
         }

         @Override
         public void trackSectionNotInterested(RpcController var1, TrackSectionNotInterestedRequest var2, RpcCallback<TrackSectionNotInterestedResponse> var3) {
            var0.trackSectionNotInterested(var1, var2, var3);
         }

         @Override
         public void trackServerJoin(RpcController var1, TrackServerJoinRequest var2, RpcCallback<TrackServerJoinResponse> var3) {
            var0.trackServerJoin(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final ServerDiscoveryService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return ServerDiscoveryService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != ServerDiscoveryService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.discoverServers(var2, (DiscoverServersRequest)var3);
               case 2:
                  return var0.searchServers(var2, (SearchServersRequest)var3);
               case 3:
                  return var0.loadAutocompleteSuggestions(var2, (LoadAutocompleteSuggestionsRequest)var3);
               case 4:
                  return var0.loadServerModal(var2, (LoadServerModalRequest)var3);
               case 5:
                  return var0.trackSectionNotInterested(var2, (TrackSectionNotInterestedRequest)var3);
               case 6:
                  return var0.trackServerJoin(var2, (TrackServerJoinRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ServerDiscoveryService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return DiscoverServersRequest.getDefaultInstance();
               case 2:
                  return SearchServersRequest.getDefaultInstance();
               case 3:
                  return LoadAutocompleteSuggestionsRequest.getDefaultInstance();
               case 4:
                  return LoadServerModalRequest.getDefaultInstance();
               case 5:
                  return TrackSectionNotInterestedRequest.getDefaultInstance();
               case 6:
                  return TrackServerJoinRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ServerDiscoveryService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return DiscoverServersResponse.getDefaultInstance();
               case 2:
                  return SearchServersResponse.getDefaultInstance();
               case 3:
                  return LoadAutocompleteSuggestionsResponse.getDefaultInstance();
               case 4:
                  return LoadServerModalResponse.getDefaultInstance();
               case 5:
                  return TrackSectionNotInterestedResponse.getDefaultInstance();
               case 6:
                  return TrackServerJoinResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void discoverServers(RpcController var1, DiscoverServersRequest var2, RpcCallback<DiscoverServersResponse> var3);

   public abstract void searchServers(RpcController var1, SearchServersRequest var2, RpcCallback<SearchServersResponse> var3);

   public abstract void loadAutocompleteSuggestions(
      RpcController var1, LoadAutocompleteSuggestionsRequest var2, RpcCallback<LoadAutocompleteSuggestionsResponse> var3
   );

   public abstract void loadServerModal(RpcController var1, LoadServerModalRequest var2, RpcCallback<LoadServerModalResponse> var3);

   public abstract void trackSectionNotInterested(
      RpcController var1, TrackSectionNotInterestedRequest var2, RpcCallback<TrackSectionNotInterestedResponse> var3
   );

   public abstract void trackServerJoin(RpcController var1, TrackServerJoinRequest var2, RpcCallback<TrackServerJoinResponse> var3);

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
            this.discoverServers(var2, (DiscoverServersRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.searchServers(var2, (SearchServersRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.loadAutocompleteSuggestions(var2, (LoadAutocompleteSuggestionsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.loadServerModal(var2, (LoadServerModalRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.trackSectionNotInterested(var2, (TrackSectionNotInterestedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 6:
            this.trackServerJoin(var2, (TrackServerJoinRequest)var3, RpcUtil.specializeCallback(var4));
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
            return DiscoverServersRequest.getDefaultInstance();
         case 2:
            return SearchServersRequest.getDefaultInstance();
         case 3:
            return LoadAutocompleteSuggestionsRequest.getDefaultInstance();
         case 4:
            return LoadServerModalRequest.getDefaultInstance();
         case 5:
            return TrackSectionNotInterestedRequest.getDefaultInstance();
         case 6:
            return TrackServerJoinRequest.getDefaultInstance();
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
            return DiscoverServersResponse.getDefaultInstance();
         case 2:
            return SearchServersResponse.getDefaultInstance();
         case 3:
            return LoadAutocompleteSuggestionsResponse.getDefaultInstance();
         case 4:
            return LoadServerModalResponse.getDefaultInstance();
         case 5:
            return TrackSectionNotInterestedResponse.getDefaultInstance();
         case 6:
            return TrackServerJoinResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static ServerDiscoveryService.Stub newStub(RpcChannel var0) {
      return new ServerDiscoveryService.Stub(var0);
   }

   public static ServerDiscoveryService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new ServerDiscoveryService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      DiscoverServersResponse discoverServers(RpcController var1, DiscoverServersRequest var2);

      SearchServersResponse searchServers(RpcController var1, SearchServersRequest var2);

      LoadAutocompleteSuggestionsResponse loadAutocompleteSuggestions(RpcController var1, LoadAutocompleteSuggestionsRequest var2);

      LoadServerModalResponse loadServerModal(RpcController var1, LoadServerModalRequest var2);

      TrackSectionNotInterestedResponse trackSectionNotInterested(RpcController var1, TrackSectionNotInterestedRequest var2);

      TrackServerJoinResponse trackServerJoin(RpcController var1, TrackServerJoinRequest var2);
   }

   private static final class BlockingStub implements ServerDiscoveryService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(ServerDiscoveryService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public DiscoverServersResponse discoverServers(RpcController var1, DiscoverServersRequest var2) {
         return (DiscoverServersResponse)this.channel
            .callBlockingMethod(ServerDiscoveryService.getDescriptor().getMethods().get(1), var1, var2, DiscoverServersResponse.getDefaultInstance());
      }

      @Override
      public SearchServersResponse searchServers(RpcController var1, SearchServersRequest var2) {
         return (SearchServersResponse)this.channel
            .callBlockingMethod(ServerDiscoveryService.getDescriptor().getMethods().get(2), var1, var2, SearchServersResponse.getDefaultInstance());
      }

      @Override
      public LoadAutocompleteSuggestionsResponse loadAutocompleteSuggestions(RpcController var1, LoadAutocompleteSuggestionsRequest var2) {
         return (LoadAutocompleteSuggestionsResponse)this.channel
            .callBlockingMethod(
               ServerDiscoveryService.getDescriptor().getMethods().get(3), var1, var2, LoadAutocompleteSuggestionsResponse.getDefaultInstance()
            );
      }

      @Override
      public LoadServerModalResponse loadServerModal(RpcController var1, LoadServerModalRequest var2) {
         return (LoadServerModalResponse)this.channel
            .callBlockingMethod(ServerDiscoveryService.getDescriptor().getMethods().get(4), var1, var2, LoadServerModalResponse.getDefaultInstance());
      }

      @Override
      public TrackSectionNotInterestedResponse trackSectionNotInterested(RpcController var1, TrackSectionNotInterestedRequest var2) {
         return (TrackSectionNotInterestedResponse)this.channel
            .callBlockingMethod(ServerDiscoveryService.getDescriptor().getMethods().get(5), var1, var2, TrackSectionNotInterestedResponse.getDefaultInstance());
      }

      @Override
      public TrackServerJoinResponse trackServerJoin(RpcController var1, TrackServerJoinRequest var2) {
         return (TrackServerJoinResponse)this.channel
            .callBlockingMethod(ServerDiscoveryService.getDescriptor().getMethods().get(6), var1, var2, TrackServerJoinResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void discoverServers(RpcController var1, DiscoverServersRequest var2, RpcCallback<DiscoverServersResponse> var3);

      void searchServers(RpcController var1, SearchServersRequest var2, RpcCallback<SearchServersResponse> var3);

      void loadAutocompleteSuggestions(RpcController var1, LoadAutocompleteSuggestionsRequest var2, RpcCallback<LoadAutocompleteSuggestionsResponse> var3);

      void loadServerModal(RpcController var1, LoadServerModalRequest var2, RpcCallback<LoadServerModalResponse> var3);

      void trackSectionNotInterested(RpcController var1, TrackSectionNotInterestedRequest var2, RpcCallback<TrackSectionNotInterestedResponse> var3);

      void trackServerJoin(RpcController var1, TrackServerJoinRequest var2, RpcCallback<TrackServerJoinResponse> var3);
   }

   public static final class Stub extends ServerDiscoveryService implements ServerDiscoveryService.Interface {
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
      public void discoverServers(RpcController var1, DiscoverServersRequest var2, RpcCallback<DiscoverServersResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               DiscoverServersResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DiscoverServersResponse.class, DiscoverServersResponse.getDefaultInstance())
            );
      }

      @Override
      public void searchServers(RpcController var1, SearchServersRequest var2, RpcCallback<SearchServersResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               SearchServersResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SearchServersResponse.class, SearchServersResponse.getDefaultInstance())
            );
      }

      @Override
      public void loadAutocompleteSuggestions(
         RpcController var1, LoadAutocompleteSuggestionsRequest var2, RpcCallback<LoadAutocompleteSuggestionsResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               LoadAutocompleteSuggestionsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadAutocompleteSuggestionsResponse.class, LoadAutocompleteSuggestionsResponse.getDefaultInstance())
            );
      }

      @Override
      public void loadServerModal(RpcController var1, LoadServerModalRequest var2, RpcCallback<LoadServerModalResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               LoadServerModalResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadServerModalResponse.class, LoadServerModalResponse.getDefaultInstance())
            );
      }

      @Override
      public void trackSectionNotInterested(RpcController var1, TrackSectionNotInterestedRequest var2, RpcCallback<TrackSectionNotInterestedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               TrackSectionNotInterestedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, TrackSectionNotInterestedResponse.class, TrackSectionNotInterestedResponse.getDefaultInstance())
            );
      }

      @Override
      public void trackServerJoin(RpcController var1, TrackServerJoinRequest var2, RpcCallback<TrackServerJoinResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(6),
               var1,
               var2,
               TrackServerJoinResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, TrackServerJoinResponse.class, TrackServerJoinResponse.getDefaultInstance())
            );
      }
   }
}
