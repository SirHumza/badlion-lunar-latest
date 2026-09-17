package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class StyngrRadioService implements Service {
   protected StyngrRadioService() {
   }

   public static Service newReflectiveService(final StyngrRadioService.Interface var0) {
      return new StyngrRadioService() {
         @Override
         public void fetchState(RpcController var1, FetchStateRequest var2, RpcCallback<FetchStateResponse> var3) {
            var0.fetchState(var1, var2, var3);
         }

         @Override
         public void fetchPlaylists(RpcController var1, FetchPlaylistsRequest var2, RpcCallback<FetchPlaylistsResponse> var3) {
            var0.fetchPlaylists(var1, var2, var3);
         }

         @Override
         public void startPlaylist(RpcController var1, StartPlaylistRequest var2, RpcCallback<StartPlaylistResponse> var3) {
            var0.startPlaylist(var1, var2, var3);
         }

         @Override
         public void nextTrack(RpcController var1, NextTrackRequest var2, RpcCallback<NextTrackResponse> var3) {
            var0.nextTrack(var1, var2, var3);
         }

         @Override
         public void setPlaying(RpcController var1, SetPlayingRequest var2, RpcCallback<SetPlayingResponse> var3) {
            var0.setPlaying(var1, var2, var3);
         }

         @Override
         public void setMuted(RpcController var1, SetMutedRequest var2, RpcCallback<SetMutedResponse> var3) {
            var0.setMuted(var1, var2, var3);
         }

         @Override
         public void setVolume(RpcController var1, SetVolumeRequest var2, RpcCallback<SetVolumeResponse> var3) {
            var0.setVolume(var1, var2, var3);
         }

         @Override
         public void toggleLiked(RpcController var1, ToggleLikedRequest var2, RpcCallback<ToggleLikedResponse> var3) {
            var0.toggleLiked(var1, var2, var3);
         }

         @Override
         public void openSelector(RpcController var1, OpenSelectorRequest var2, RpcCallback<OpenSelectorResponse> var3) {
            var0.openSelector(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final StyngrRadioService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return StyngrRadioService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != StyngrRadioService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.fetchState(var2, (FetchStateRequest)var3);
               case 1:
                  return var0.fetchPlaylists(var2, (FetchPlaylistsRequest)var3);
               case 2:
                  return var0.startPlaylist(var2, (StartPlaylistRequest)var3);
               case 3:
                  return var0.nextTrack(var2, (NextTrackRequest)var3);
               case 4:
                  return var0.setPlaying(var2, (SetPlayingRequest)var3);
               case 5:
                  return var0.setMuted(var2, (SetMutedRequest)var3);
               case 6:
                  return var0.setVolume(var2, (SetVolumeRequest)var3);
               case 7:
                  return var0.toggleLiked(var2, (ToggleLikedRequest)var3);
               case 8:
                  return var0.openSelector(var2, (OpenSelectorRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != StyngrRadioService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return FetchStateRequest.getDefaultInstance();
               case 1:
                  return FetchPlaylistsRequest.getDefaultInstance();
               case 2:
                  return StartPlaylistRequest.getDefaultInstance();
               case 3:
                  return NextTrackRequest.getDefaultInstance();
               case 4:
                  return SetPlayingRequest.getDefaultInstance();
               case 5:
                  return SetMutedRequest.getDefaultInstance();
               case 6:
                  return SetVolumeRequest.getDefaultInstance();
               case 7:
                  return ToggleLikedRequest.getDefaultInstance();
               case 8:
                  return OpenSelectorRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != StyngrRadioService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return FetchStateResponse.getDefaultInstance();
               case 1:
                  return FetchPlaylistsResponse.getDefaultInstance();
               case 2:
                  return StartPlaylistResponse.getDefaultInstance();
               case 3:
                  return NextTrackResponse.getDefaultInstance();
               case 4:
                  return SetPlayingResponse.getDefaultInstance();
               case 5:
                  return SetMutedResponse.getDefaultInstance();
               case 6:
                  return SetVolumeResponse.getDefaultInstance();
               case 7:
                  return ToggleLikedResponse.getDefaultInstance();
               case 8:
                  return OpenSelectorResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void fetchState(RpcController var1, FetchStateRequest var2, RpcCallback<FetchStateResponse> var3);

   public abstract void fetchPlaylists(RpcController var1, FetchPlaylistsRequest var2, RpcCallback<FetchPlaylistsResponse> var3);

   public abstract void startPlaylist(RpcController var1, StartPlaylistRequest var2, RpcCallback<StartPlaylistResponse> var3);

   public abstract void nextTrack(RpcController var1, NextTrackRequest var2, RpcCallback<NextTrackResponse> var3);

   public abstract void setPlaying(RpcController var1, SetPlayingRequest var2, RpcCallback<SetPlayingResponse> var3);

   public abstract void setMuted(RpcController var1, SetMutedRequest var2, RpcCallback<SetMutedResponse> var3);

   public abstract void setVolume(RpcController var1, SetVolumeRequest var2, RpcCallback<SetVolumeResponse> var3);

   public abstract void toggleLiked(RpcController var1, ToggleLikedRequest var2, RpcCallback<ToggleLikedResponse> var3);

   public abstract void openSelector(RpcController var1, OpenSelectorRequest var2, RpcCallback<OpenSelectorResponse> var3);

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
            this.fetchState(var2, (FetchStateRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.fetchPlaylists(var2, (FetchPlaylistsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.startPlaylist(var2, (StartPlaylistRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.nextTrack(var2, (NextTrackRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.setPlaying(var2, (SetPlayingRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.setMuted(var2, (SetMutedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 6:
            this.setVolume(var2, (SetVolumeRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 7:
            this.toggleLiked(var2, (ToggleLikedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 8:
            this.openSelector(var2, (OpenSelectorRequest)var3, RpcUtil.specializeCallback(var4));
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
            return FetchStateRequest.getDefaultInstance();
         case 1:
            return FetchPlaylistsRequest.getDefaultInstance();
         case 2:
            return StartPlaylistRequest.getDefaultInstance();
         case 3:
            return NextTrackRequest.getDefaultInstance();
         case 4:
            return SetPlayingRequest.getDefaultInstance();
         case 5:
            return SetMutedRequest.getDefaultInstance();
         case 6:
            return SetVolumeRequest.getDefaultInstance();
         case 7:
            return ToggleLikedRequest.getDefaultInstance();
         case 8:
            return OpenSelectorRequest.getDefaultInstance();
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
            return FetchStateResponse.getDefaultInstance();
         case 1:
            return FetchPlaylistsResponse.getDefaultInstance();
         case 2:
            return StartPlaylistResponse.getDefaultInstance();
         case 3:
            return NextTrackResponse.getDefaultInstance();
         case 4:
            return SetPlayingResponse.getDefaultInstance();
         case 5:
            return SetMutedResponse.getDefaultInstance();
         case 6:
            return SetVolumeResponse.getDefaultInstance();
         case 7:
            return ToggleLikedResponse.getDefaultInstance();
         case 8:
            return OpenSelectorResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static StyngrRadioService.Stub newStub(RpcChannel var0) {
      return new StyngrRadioService.Stub(var0);
   }

   public static StyngrRadioService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new StyngrRadioService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      FetchStateResponse fetchState(RpcController var1, FetchStateRequest var2);

      FetchPlaylistsResponse fetchPlaylists(RpcController var1, FetchPlaylistsRequest var2);

      StartPlaylistResponse startPlaylist(RpcController var1, StartPlaylistRequest var2);

      NextTrackResponse nextTrack(RpcController var1, NextTrackRequest var2);

      SetPlayingResponse setPlaying(RpcController var1, SetPlayingRequest var2);

      SetMutedResponse setMuted(RpcController var1, SetMutedRequest var2);

      SetVolumeResponse setVolume(RpcController var1, SetVolumeRequest var2);

      ToggleLikedResponse toggleLiked(RpcController var1, ToggleLikedRequest var2);

      OpenSelectorResponse openSelector(RpcController var1, OpenSelectorRequest var2);
   }

   private static final class BlockingStub implements StyngrRadioService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public FetchStateResponse fetchState(RpcController var1, FetchStateRequest var2) {
         return (FetchStateResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(0), var1, var2, FetchStateResponse.getDefaultInstance());
      }

      @Override
      public FetchPlaylistsResponse fetchPlaylists(RpcController var1, FetchPlaylistsRequest var2) {
         return (FetchPlaylistsResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(1), var1, var2, FetchPlaylistsResponse.getDefaultInstance());
      }

      @Override
      public StartPlaylistResponse startPlaylist(RpcController var1, StartPlaylistRequest var2) {
         return (StartPlaylistResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(2), var1, var2, StartPlaylistResponse.getDefaultInstance());
      }

      @Override
      public NextTrackResponse nextTrack(RpcController var1, NextTrackRequest var2) {
         return (NextTrackResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(3), var1, var2, NextTrackResponse.getDefaultInstance());
      }

      @Override
      public SetPlayingResponse setPlaying(RpcController var1, SetPlayingRequest var2) {
         return (SetPlayingResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(4), var1, var2, SetPlayingResponse.getDefaultInstance());
      }

      @Override
      public SetMutedResponse setMuted(RpcController var1, SetMutedRequest var2) {
         return (SetMutedResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(5), var1, var2, SetMutedResponse.getDefaultInstance());
      }

      @Override
      public SetVolumeResponse setVolume(RpcController var1, SetVolumeRequest var2) {
         return (SetVolumeResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(6), var1, var2, SetVolumeResponse.getDefaultInstance());
      }

      @Override
      public ToggleLikedResponse toggleLiked(RpcController var1, ToggleLikedRequest var2) {
         return (ToggleLikedResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(7), var1, var2, ToggleLikedResponse.getDefaultInstance());
      }

      @Override
      public OpenSelectorResponse openSelector(RpcController var1, OpenSelectorRequest var2) {
         return (OpenSelectorResponse)this.channel
            .callBlockingMethod(StyngrRadioService.getDescriptor().getMethods().get(8), var1, var2, OpenSelectorResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void fetchState(RpcController var1, FetchStateRequest var2, RpcCallback<FetchStateResponse> var3);

      void fetchPlaylists(RpcController var1, FetchPlaylistsRequest var2, RpcCallback<FetchPlaylistsResponse> var3);

      void startPlaylist(RpcController var1, StartPlaylistRequest var2, RpcCallback<StartPlaylistResponse> var3);

      void nextTrack(RpcController var1, NextTrackRequest var2, RpcCallback<NextTrackResponse> var3);

      void setPlaying(RpcController var1, SetPlayingRequest var2, RpcCallback<SetPlayingResponse> var3);

      void setMuted(RpcController var1, SetMutedRequest var2, RpcCallback<SetMutedResponse> var3);

      void setVolume(RpcController var1, SetVolumeRequest var2, RpcCallback<SetVolumeResponse> var3);

      void toggleLiked(RpcController var1, ToggleLikedRequest var2, RpcCallback<ToggleLikedResponse> var3);

      void openSelector(RpcController var1, OpenSelectorRequest var2, RpcCallback<OpenSelectorResponse> var3);
   }

   public static final class Stub extends StyngrRadioService implements StyngrRadioService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void fetchState(RpcController var1, FetchStateRequest var2, RpcCallback<FetchStateResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               FetchStateResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, FetchStateResponse.class, FetchStateResponse.getDefaultInstance())
            );
      }

      @Override
      public void fetchPlaylists(RpcController var1, FetchPlaylistsRequest var2, RpcCallback<FetchPlaylistsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               FetchPlaylistsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, FetchPlaylistsResponse.class, FetchPlaylistsResponse.getDefaultInstance())
            );
      }

      @Override
      public void startPlaylist(RpcController var1, StartPlaylistRequest var2, RpcCallback<StartPlaylistResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               StartPlaylistResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StartPlaylistResponse.class, StartPlaylistResponse.getDefaultInstance())
            );
      }

      @Override
      public void nextTrack(RpcController var1, NextTrackRequest var2, RpcCallback<NextTrackResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               NextTrackResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, NextTrackResponse.class, NextTrackResponse.getDefaultInstance())
            );
      }

      @Override
      public void setPlaying(RpcController var1, SetPlayingRequest var2, RpcCallback<SetPlayingResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               SetPlayingResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetPlayingResponse.class, SetPlayingResponse.getDefaultInstance())
            );
      }

      @Override
      public void setMuted(RpcController var1, SetMutedRequest var2, RpcCallback<SetMutedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               SetMutedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetMutedResponse.class, SetMutedResponse.getDefaultInstance())
            );
      }

      @Override
      public void setVolume(RpcController var1, SetVolumeRequest var2, RpcCallback<SetVolumeResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(6),
               var1,
               var2,
               SetVolumeResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetVolumeResponse.class, SetVolumeResponse.getDefaultInstance())
            );
      }

      @Override
      public void toggleLiked(RpcController var1, ToggleLikedRequest var2, RpcCallback<ToggleLikedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(7),
               var1,
               var2,
               ToggleLikedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ToggleLikedResponse.class, ToggleLikedResponse.getDefaultInstance())
            );
      }

      @Override
      public void openSelector(RpcController var1, OpenSelectorRequest var2, RpcCallback<OpenSelectorResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(8),
               var1,
               var2,
               OpenSelectorResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, OpenSelectorResponse.class, OpenSelectorResponse.getDefaultInstance())
            );
      }
   }
}
