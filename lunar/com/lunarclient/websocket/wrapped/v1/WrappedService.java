package com.lunarclient.websocket.wrapped.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class WrappedService implements Service {
   protected WrappedService() {
   }

   public static Service newReflectiveService(final WrappedService.Interface var0) {
      return new WrappedService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3) {
            var0.recordCounters(var1, var2, var3);
         }

         @Override
         public void setLeaderboardVisibility(RpcController var1, SetLeaderboardVisibilityRequest var2, RpcCallback<SetLeaderboardVisibilityResponse> var3) {
            var0.setLeaderboardVisibility(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final WrappedService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return WrappedService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != WrappedService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.recordCounters(var2, (RecordCountersRequest)var3);
               case 2:
                  return var0.setLeaderboardVisibility(var2, (SetLeaderboardVisibilityRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != WrappedService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return RecordCountersRequest.getDefaultInstance();
               case 2:
                  return SetLeaderboardVisibilityRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != WrappedService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return RecordCountersResponse.getDefaultInstance();
               case 2:
                  return SetLeaderboardVisibilityResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3);

   public abstract void setLeaderboardVisibility(RpcController var1, SetLeaderboardVisibilityRequest var2, RpcCallback<SetLeaderboardVisibilityResponse> var3);

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
            this.recordCounters(var2, (RecordCountersRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.setLeaderboardVisibility(var2, (SetLeaderboardVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
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
            return RecordCountersRequest.getDefaultInstance();
         case 2:
            return SetLeaderboardVisibilityRequest.getDefaultInstance();
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
            return RecordCountersResponse.getDefaultInstance();
         case 2:
            return SetLeaderboardVisibilityResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static WrappedService.Stub newStub(RpcChannel var0) {
      return new WrappedService.Stub(var0);
   }

   public static WrappedService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new WrappedService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      RecordCountersResponse recordCounters(RpcController var1, RecordCountersRequest var2);

      SetLeaderboardVisibilityResponse setLeaderboardVisibility(RpcController var1, SetLeaderboardVisibilityRequest var2);
   }

   private static final class BlockingStub implements WrappedService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(WrappedService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public RecordCountersResponse recordCounters(RpcController var1, RecordCountersRequest var2) {
         return (RecordCountersResponse)this.channel
            .callBlockingMethod(WrappedService.getDescriptor().getMethods().get(1), var1, var2, RecordCountersResponse.getDefaultInstance());
      }

      @Override
      public SetLeaderboardVisibilityResponse setLeaderboardVisibility(RpcController var1, SetLeaderboardVisibilityRequest var2) {
         return (SetLeaderboardVisibilityResponse)this.channel
            .callBlockingMethod(WrappedService.getDescriptor().getMethods().get(2), var1, var2, SetLeaderboardVisibilityResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3);

      void setLeaderboardVisibility(RpcController var1, SetLeaderboardVisibilityRequest var2, RpcCallback<SetLeaderboardVisibilityResponse> var3);
   }

   public static final class Stub extends WrappedService implements WrappedService.Interface {
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
      public void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               RecordCountersResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordCountersResponse.class, RecordCountersResponse.getDefaultInstance())
            );
      }

      @Override
      public void setLeaderboardVisibility(RpcController var1, SetLeaderboardVisibilityRequest var2, RpcCallback<SetLeaderboardVisibilityResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               SetLeaderboardVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetLeaderboardVisibilityResponse.class, SetLeaderboardVisibilityResponse.getDefaultInstance())
            );
      }
   }
}
