package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LauncherHeartbeatRequest extends GeneratedMessageV3 implements LauncherHeartbeatRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FOCUSED_FIELD_NUMBER = 1;
   private boolean focused_ = false;
   public static final int GAME_CURRENTLY_LAUNCHED_FIELD_NUMBER = 2;
   private boolean gameCurrentlyLaunched_ = false;
   public static final int RUNNING_INSTANCES_FIELD_NUMBER = 3;
   private List<RunningInstance> runningInstances_;
   public static final int OPEN_RENDERERS_FIELD_NUMBER = 4;
   private List<OpenRenderer> openRenderers_;
   public static final int BADLION_CONNECTED_FIELD_NUMBER = 5;
   private boolean badlionConnected_ = false;
   private byte memoizedIsInitialized = -1;
   private static final LauncherHeartbeatRequest DEFAULT_INSTANCE = new LauncherHeartbeatRequest();
   private static final Parser<LauncherHeartbeatRequest> PARSER = new AbstractParser<LauncherHeartbeatRequest>() {
      public LauncherHeartbeatRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LauncherHeartbeatRequest.Builder var3 = LauncherHeartbeatRequest.newBuilder();

         try {
            var3.mergeFrom(var1, var2);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (UninitializedMessageException var6) {
            throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var7) {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   };

   private LauncherHeartbeatRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LauncherHeartbeatRequest() {
      this.runningInstances_ = Collections.emptyList();
      this.openRenderers_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LauncherHeartbeatRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LauncherHeartbeatRequest.class, LauncherHeartbeatRequest.Builder.class);
   }

   @Deprecated
   @Override
   public boolean getFocused() {
      return this.focused_;
   }

   @Deprecated
   @Override
   public boolean getGameCurrentlyLaunched() {
      return this.gameCurrentlyLaunched_;
   }

   @Override
   public List<RunningInstance> getRunningInstancesList() {
      return this.runningInstances_;
   }

   @Override
   public List<? extends RunningInstanceOrBuilder> getRunningInstancesOrBuilderList() {
      return this.runningInstances_;
   }

   @Override
   public int getRunningInstancesCount() {
      return this.runningInstances_.size();
   }

   @Override
   public RunningInstance getRunningInstances(int var1) {
      return this.runningInstances_.get(var1);
   }

   @Override
   public RunningInstanceOrBuilder getRunningInstancesOrBuilder(int var1) {
      return this.runningInstances_.get(var1);
   }

   @Override
   public List<OpenRenderer> getOpenRenderersList() {
      return this.openRenderers_;
   }

   @Override
   public List<? extends OpenRendererOrBuilder> getOpenRenderersOrBuilderList() {
      return this.openRenderers_;
   }

   @Override
   public int getOpenRenderersCount() {
      return this.openRenderers_.size();
   }

   @Override
   public OpenRenderer getOpenRenderers(int var1) {
      return this.openRenderers_.get(var1);
   }

   @Override
   public OpenRendererOrBuilder getOpenRenderersOrBuilder(int var1) {
      return this.openRenderers_.get(var1);
   }

   @Override
   public boolean getBadlionConnected() {
      return this.badlionConnected_;
   }

   @Override
   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      }

      if (var1 == 0) {
         return false;
      }

      this.memoizedIsInitialized = 1;
      return true;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if (this.focused_) {
         var1.writeBool(1, this.focused_);
      }

      if (this.gameCurrentlyLaunched_) {
         var1.writeBool(2, this.gameCurrentlyLaunched_);
      }

      for (int var2 = 0; var2 < this.runningInstances_.size(); var2++) {
         var1.writeMessage(3, this.runningInstances_.get(var2));
      }

      for (int var3 = 0; var3 < this.openRenderers_.size(); var3++) {
         var1.writeMessage(4, this.openRenderers_.get(var3));
      }

      if (this.badlionConnected_) {
         var1.writeBool(5, this.badlionConnected_);
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (this.focused_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.focused_);
      }

      if (this.gameCurrentlyLaunched_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.gameCurrentlyLaunched_);
      }

      for (int var2 = 0; var2 < this.runningInstances_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.runningInstances_.get(var2));
      }

      for (int var5 = 0; var5 < this.openRenderers_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.openRenderers_.get(var5));
      }

      if (this.badlionConnected_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.badlionConnected_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LauncherHeartbeatRequest)) {
         return super.equals(var1);
      } else {
         LauncherHeartbeatRequest var2 = (LauncherHeartbeatRequest)var1;
         if (this.getFocused() != var2.getFocused()) {
            return false;
         } else if (this.getGameCurrentlyLaunched() != var2.getGameCurrentlyLaunched()) {
            return false;
         } else if (!this.getRunningInstancesList().equals(var2.getRunningInstancesList())) {
            return false;
         } else if (!this.getOpenRenderersList().equals(var2.getOpenRenderersList())) {
            return false;
         } else {
            return this.getBadlionConnected() != var2.getBadlionConnected() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFocused());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getGameCurrentlyLaunched());
      if (this.getRunningInstancesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getRunningInstancesList().hashCode();
      }

      if (this.getOpenRenderersCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getOpenRenderersList().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getBadlionConnected());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LauncherHeartbeatRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHeartbeatRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHeartbeatRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHeartbeatRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHeartbeatRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherHeartbeatRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherHeartbeatRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherHeartbeatRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LauncherHeartbeatRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LauncherHeartbeatRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LauncherHeartbeatRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherHeartbeatRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LauncherHeartbeatRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LauncherHeartbeatRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LauncherHeartbeatRequest.Builder newBuilder(LauncherHeartbeatRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LauncherHeartbeatRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LauncherHeartbeatRequest.Builder() : new LauncherHeartbeatRequest.Builder().mergeFrom(this);
   }

   protected LauncherHeartbeatRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LauncherHeartbeatRequest.Builder(var1);
   }

   public static LauncherHeartbeatRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LauncherHeartbeatRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<LauncherHeartbeatRequest> getParserForType() {
      return PARSER;
   }

   public LauncherHeartbeatRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LauncherHeartbeatRequest.Builder> implements LauncherHeartbeatRequestOrBuilder {
      private int bitField0_;
      private boolean focused_;
      private boolean gameCurrentlyLaunched_;
      private List<RunningInstance> runningInstances_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<RunningInstance, RunningInstance.Builder, RunningInstanceOrBuilder> runningInstancesBuilder_;
      private List<OpenRenderer> openRenderers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OpenRenderer, OpenRenderer.Builder, OpenRendererOrBuilder> openRenderersBuilder_;
      private boolean badlionConnected_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LauncherHeartbeatRequest.class, LauncherHeartbeatRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LauncherHeartbeatRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.focused_ = false;
         this.gameCurrentlyLaunched_ = false;
         if (this.runningInstancesBuilder_ == null) {
            this.runningInstances_ = Collections.emptyList();
         } else {
            this.runningInstances_ = null;
            this.runningInstancesBuilder_.clear();
         }

         this.bitField0_ &= -5;
         if (this.openRenderersBuilder_ == null) {
            this.openRenderers_ = Collections.emptyList();
         } else {
            this.openRenderers_ = null;
            this.openRenderersBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.badlionConnected_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_heartbeat_v1_LauncherHeartbeatRequest_descriptor;
      }

      public LauncherHeartbeatRequest getDefaultInstanceForType() {
         return LauncherHeartbeatRequest.getDefaultInstance();
      }

      public LauncherHeartbeatRequest build() {
         LauncherHeartbeatRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LauncherHeartbeatRequest buildPartial() {
         LauncherHeartbeatRequest var1 = new LauncherHeartbeatRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LauncherHeartbeatRequest var1) {
         if (this.runningInstancesBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.runningInstances_ = Collections.unmodifiableList(this.runningInstances_);
               this.bitField0_ &= -5;
            }

            var1.runningInstances_ = this.runningInstances_;
         } else {
            var1.runningInstances_ = this.runningInstancesBuilder_.build();
         }

         if (this.openRenderersBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.openRenderers_ = Collections.unmodifiableList(this.openRenderers_);
               this.bitField0_ &= -9;
            }

            var1.openRenderers_ = this.openRenderers_;
         } else {
            var1.openRenderers_ = this.openRenderersBuilder_.build();
         }
      }

      private void buildPartial0(LauncherHeartbeatRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.focused_ = this.focused_;
         }

         if ((var2 & 2) != 0) {
            var1.gameCurrentlyLaunched_ = this.gameCurrentlyLaunched_;
         }

         if ((var2 & 16) != 0) {
            var1.badlionConnected_ = this.badlionConnected_;
         }
      }

      public LauncherHeartbeatRequest.Builder clone() {
         return (LauncherHeartbeatRequest.Builder)super.clone();
      }

      public LauncherHeartbeatRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherHeartbeatRequest.Builder)super.setField(var1, var2);
      }

      public LauncherHeartbeatRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LauncherHeartbeatRequest.Builder)super.clearField(var1);
      }

      public LauncherHeartbeatRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LauncherHeartbeatRequest.Builder)super.clearOneof(var1);
      }

      public LauncherHeartbeatRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LauncherHeartbeatRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LauncherHeartbeatRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherHeartbeatRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public LauncherHeartbeatRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof LauncherHeartbeatRequest) {
            return this.mergeFrom((LauncherHeartbeatRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LauncherHeartbeatRequest.Builder mergeFrom(LauncherHeartbeatRequest var1) {
         if (var1 == LauncherHeartbeatRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getFocused()) {
            this.setFocused(var1.getFocused());
         }

         if (var1.getGameCurrentlyLaunched()) {
            this.setGameCurrentlyLaunched(var1.getGameCurrentlyLaunched());
         }

         if (this.runningInstancesBuilder_ == null) {
            if (!var1.runningInstances_.isEmpty()) {
               if (this.runningInstances_.isEmpty()) {
                  this.runningInstances_ = var1.runningInstances_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureRunningInstancesIsMutable();
                  this.runningInstances_.addAll(var1.runningInstances_);
               }

               this.onChanged();
            }
         } else if (!var1.runningInstances_.isEmpty()) {
            if (this.runningInstancesBuilder_.isEmpty()) {
               this.runningInstancesBuilder_.dispose();
               this.runningInstancesBuilder_ = null;
               this.runningInstances_ = var1.runningInstances_;
               this.bitField0_ &= -5;
               this.runningInstancesBuilder_ = LauncherHeartbeatRequest.alwaysUseFieldBuilders ? this.getRunningInstancesFieldBuilder() : null;
            } else {
               this.runningInstancesBuilder_.addAllMessages(var1.runningInstances_);
            }
         }

         if (this.openRenderersBuilder_ == null) {
            if (!var1.openRenderers_.isEmpty()) {
               if (this.openRenderers_.isEmpty()) {
                  this.openRenderers_ = var1.openRenderers_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureOpenRenderersIsMutable();
                  this.openRenderers_.addAll(var1.openRenderers_);
               }

               this.onChanged();
            }
         } else if (!var1.openRenderers_.isEmpty()) {
            if (this.openRenderersBuilder_.isEmpty()) {
               this.openRenderersBuilder_.dispose();
               this.openRenderersBuilder_ = null;
               this.openRenderers_ = var1.openRenderers_;
               this.bitField0_ &= -9;
               this.openRenderersBuilder_ = LauncherHeartbeatRequest.alwaysUseFieldBuilders ? this.getOpenRenderersFieldBuilder() : null;
            } else {
               this.openRenderersBuilder_.addAllMessages(var1.openRenderers_);
            }
         }

         if (var1.getBadlionConnected()) {
            this.setBadlionConnected(var1.getBadlionConnected());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LauncherHeartbeatRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         try {
            boolean var3 = false;

            while (!var3) {
               int var4 = var1.readTag();
               switch (var4) {
                  case 0:
                     var3 = true;
                     break;
                  case 8:
                     this.focused_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.gameCurrentlyLaunched_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     RunningInstance var11 = var1.readMessage(RunningInstance.parser(), var2);
                     if (this.runningInstancesBuilder_ == null) {
                        this.ensureRunningInstancesIsMutable();
                        this.runningInstances_.add(var11);
                     } else {
                        this.runningInstancesBuilder_.addMessage(var11);
                     }
                     break;
                  case 34:
                     OpenRenderer var5 = var1.readMessage(OpenRenderer.parser(), var2);
                     if (this.openRenderersBuilder_ == null) {
                        this.ensureOpenRenderersIsMutable();
                        this.openRenderers_.add(var5);
                     } else {
                        this.openRenderersBuilder_.addMessage(var5);
                     }
                     break;
                  case 40:
                     this.badlionConnected_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Deprecated
      @Override
      public boolean getFocused() {
         return this.focused_;
      }

      @Deprecated
      public LauncherHeartbeatRequest.Builder setFocused(boolean var1) {
         this.focused_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LauncherHeartbeatRequest.Builder clearFocused() {
         this.bitField0_ &= -2;
         this.focused_ = false;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public boolean getGameCurrentlyLaunched() {
         return this.gameCurrentlyLaunched_;
      }

      @Deprecated
      public LauncherHeartbeatRequest.Builder setGameCurrentlyLaunched(boolean var1) {
         this.gameCurrentlyLaunched_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LauncherHeartbeatRequest.Builder clearGameCurrentlyLaunched() {
         this.bitField0_ &= -3;
         this.gameCurrentlyLaunched_ = false;
         this.onChanged();
         return this;
      }

      private void ensureRunningInstancesIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.runningInstances_ = new ArrayList<>(this.runningInstances_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<RunningInstance> getRunningInstancesList() {
         return this.runningInstancesBuilder_ == null ? Collections.unmodifiableList(this.runningInstances_) : this.runningInstancesBuilder_.getMessageList();
      }

      @Override
      public int getRunningInstancesCount() {
         return this.runningInstancesBuilder_ == null ? this.runningInstances_.size() : this.runningInstancesBuilder_.getCount();
      }

      @Override
      public RunningInstance getRunningInstances(int var1) {
         return this.runningInstancesBuilder_ == null ? this.runningInstances_.get(var1) : this.runningInstancesBuilder_.getMessage(var1);
      }

      public LauncherHeartbeatRequest.Builder setRunningInstances(int var1, RunningInstance var2) {
         if (this.runningInstancesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.set(var1, var2);
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder setRunningInstances(int var1, RunningInstance.Builder var2) {
         if (this.runningInstancesBuilder_ == null) {
            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addRunningInstances(RunningInstance var1) {
         if (this.runningInstancesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.add(var1);
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.addMessage(var1);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addRunningInstances(int var1, RunningInstance var2) {
         if (this.runningInstancesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.add(var1, var2);
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addRunningInstances(RunningInstance.Builder var1) {
         if (this.runningInstancesBuilder_ == null) {
            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.add(var1.build());
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addRunningInstances(int var1, RunningInstance.Builder var2) {
         if (this.runningInstancesBuilder_ == null) {
            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addAllRunningInstances(Iterable<? extends RunningInstance> var1) {
         if (this.runningInstancesBuilder_ == null) {
            this.ensureRunningInstancesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.runningInstances_);
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder clearRunningInstances() {
         if (this.runningInstancesBuilder_ == null) {
            this.runningInstances_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.clear();
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder removeRunningInstances(int var1) {
         if (this.runningInstancesBuilder_ == null) {
            this.ensureRunningInstancesIsMutable();
            this.runningInstances_.remove(var1);
            this.onChanged();
         } else {
            this.runningInstancesBuilder_.remove(var1);
         }

         return this;
      }

      public RunningInstance.Builder getRunningInstancesBuilder(int var1) {
         return this.getRunningInstancesFieldBuilder().getBuilder(var1);
      }

      @Override
      public RunningInstanceOrBuilder getRunningInstancesOrBuilder(int var1) {
         return this.runningInstancesBuilder_ == null ? this.runningInstances_.get(var1) : this.runningInstancesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends RunningInstanceOrBuilder> getRunningInstancesOrBuilderList() {
         return this.runningInstancesBuilder_ != null
            ? this.runningInstancesBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.runningInstances_);
      }

      public RunningInstance.Builder addRunningInstancesBuilder() {
         return this.getRunningInstancesFieldBuilder().addBuilder(RunningInstance.getDefaultInstance());
      }

      public RunningInstance.Builder addRunningInstancesBuilder(int var1) {
         return this.getRunningInstancesFieldBuilder().addBuilder(var1, RunningInstance.getDefaultInstance());
      }

      public List<RunningInstance.Builder> getRunningInstancesBuilderList() {
         return this.getRunningInstancesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<RunningInstance, RunningInstance.Builder, RunningInstanceOrBuilder> getRunningInstancesFieldBuilder() {
         if (this.runningInstancesBuilder_ == null) {
            this.runningInstancesBuilder_ = new RepeatedFieldBuilderV3<>(
               this.runningInstances_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean()
            );
            this.runningInstances_ = null;
         }

         return this.runningInstancesBuilder_;
      }

      private void ensureOpenRenderersIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.openRenderers_ = new ArrayList<>(this.openRenderers_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<OpenRenderer> getOpenRenderersList() {
         return this.openRenderersBuilder_ == null ? Collections.unmodifiableList(this.openRenderers_) : this.openRenderersBuilder_.getMessageList();
      }

      @Override
      public int getOpenRenderersCount() {
         return this.openRenderersBuilder_ == null ? this.openRenderers_.size() : this.openRenderersBuilder_.getCount();
      }

      @Override
      public OpenRenderer getOpenRenderers(int var1) {
         return this.openRenderersBuilder_ == null ? this.openRenderers_.get(var1) : this.openRenderersBuilder_.getMessage(var1);
      }

      public LauncherHeartbeatRequest.Builder setOpenRenderers(int var1, OpenRenderer var2) {
         if (this.openRenderersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.set(var1, var2);
            this.onChanged();
         } else {
            this.openRenderersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder setOpenRenderers(int var1, OpenRenderer.Builder var2) {
         if (this.openRenderersBuilder_ == null) {
            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.openRenderersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addOpenRenderers(OpenRenderer var1) {
         if (this.openRenderersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.add(var1);
            this.onChanged();
         } else {
            this.openRenderersBuilder_.addMessage(var1);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addOpenRenderers(int var1, OpenRenderer var2) {
         if (this.openRenderersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.add(var1, var2);
            this.onChanged();
         } else {
            this.openRenderersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addOpenRenderers(OpenRenderer.Builder var1) {
         if (this.openRenderersBuilder_ == null) {
            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.add(var1.build());
            this.onChanged();
         } else {
            this.openRenderersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addOpenRenderers(int var1, OpenRenderer.Builder var2) {
         if (this.openRenderersBuilder_ == null) {
            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.openRenderersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder addAllOpenRenderers(Iterable<? extends OpenRenderer> var1) {
         if (this.openRenderersBuilder_ == null) {
            this.ensureOpenRenderersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.openRenderers_);
            this.onChanged();
         } else {
            this.openRenderersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder clearOpenRenderers() {
         if (this.openRenderersBuilder_ == null) {
            this.openRenderers_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.openRenderersBuilder_.clear();
         }

         return this;
      }

      public LauncherHeartbeatRequest.Builder removeOpenRenderers(int var1) {
         if (this.openRenderersBuilder_ == null) {
            this.ensureOpenRenderersIsMutable();
            this.openRenderers_.remove(var1);
            this.onChanged();
         } else {
            this.openRenderersBuilder_.remove(var1);
         }

         return this;
      }

      public OpenRenderer.Builder getOpenRenderersBuilder(int var1) {
         return this.getOpenRenderersFieldBuilder().getBuilder(var1);
      }

      @Override
      public OpenRendererOrBuilder getOpenRenderersOrBuilder(int var1) {
         return this.openRenderersBuilder_ == null ? this.openRenderers_.get(var1) : this.openRenderersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OpenRendererOrBuilder> getOpenRenderersOrBuilderList() {
         return this.openRenderersBuilder_ != null ? this.openRenderersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.openRenderers_);
      }

      public OpenRenderer.Builder addOpenRenderersBuilder() {
         return this.getOpenRenderersFieldBuilder().addBuilder(OpenRenderer.getDefaultInstance());
      }

      public OpenRenderer.Builder addOpenRenderersBuilder(int var1) {
         return this.getOpenRenderersFieldBuilder().addBuilder(var1, OpenRenderer.getDefaultInstance());
      }

      public List<OpenRenderer.Builder> getOpenRenderersBuilderList() {
         return this.getOpenRenderersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OpenRenderer, OpenRenderer.Builder, OpenRendererOrBuilder> getOpenRenderersFieldBuilder() {
         if (this.openRenderersBuilder_ == null) {
            this.openRenderersBuilder_ = new RepeatedFieldBuilderV3<>(
               this.openRenderers_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
            );
            this.openRenderers_ = null;
         }

         return this.openRenderersBuilder_;
      }

      @Override
      public boolean getBadlionConnected() {
         return this.badlionConnected_;
      }

      public LauncherHeartbeatRequest.Builder setBadlionConnected(boolean var1) {
         this.badlionConnected_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LauncherHeartbeatRequest.Builder clearBadlionConnected() {
         this.bitField0_ &= -17;
         this.badlionConnected_ = false;
         this.onChanged();
         return this;
      }

      public final LauncherHeartbeatRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LauncherHeartbeatRequest.Builder)super.setUnknownFields(var1);
      }

      public final LauncherHeartbeatRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LauncherHeartbeatRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
