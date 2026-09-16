package com.lunarclient.websocket.subscription.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.websocket.cosmetic.v1.PlayerCosmeticsPush;
import com.lunarclient.websocket.cosmetic.v1.PlayerCosmeticsPushOrBuilder;
import com.lunarclient.websocket.radio.v1.PlayerRadioPush;
import com.lunarclient.websocket.radio.v1.PlayerRadioPushOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubscribeResponse extends GeneratedMessageV3 implements SubscribeResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COSMETIC_PUSHES_FIELD_NUMBER = 1;
   private List<PlayerCosmeticsPush> cosmeticPushes_;
   public static final int RADIO_PUSHES_FIELD_NUMBER = 2;
   private List<PlayerRadioPush> radioPushes_;
   private byte memoizedIsInitialized = -1;
   private static final SubscribeResponse DEFAULT_INSTANCE = new SubscribeResponse();
   private static final Parser<SubscribeResponse> PARSER = new AbstractParser<SubscribeResponse>() {
      public SubscribeResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SubscribeResponse.Builder var3 = SubscribeResponse.newBuilder();

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

   private SubscribeResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SubscribeResponse() {
      this.cosmeticPushes_ = Collections.emptyList();
      this.radioPushes_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SubscribeResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SubscribeResponse.class, SubscribeResponse.Builder.class);
   }

   @Override
   public List<PlayerCosmeticsPush> getCosmeticPushesList() {
      return this.cosmeticPushes_;
   }

   @Override
   public List<? extends PlayerCosmeticsPushOrBuilder> getCosmeticPushesOrBuilderList() {
      return this.cosmeticPushes_;
   }

   @Override
   public int getCosmeticPushesCount() {
      return this.cosmeticPushes_.size();
   }

   @Override
   public PlayerCosmeticsPush getCosmeticPushes(int var1) {
      return this.cosmeticPushes_.get(var1);
   }

   @Override
   public PlayerCosmeticsPushOrBuilder getCosmeticPushesOrBuilder(int var1) {
      return this.cosmeticPushes_.get(var1);
   }

   @Override
   public List<PlayerRadioPush> getRadioPushesList() {
      return this.radioPushes_;
   }

   @Override
   public List<? extends PlayerRadioPushOrBuilder> getRadioPushesOrBuilderList() {
      return this.radioPushes_;
   }

   @Override
   public int getRadioPushesCount() {
      return this.radioPushes_.size();
   }

   @Override
   public PlayerRadioPush getRadioPushes(int var1) {
      return this.radioPushes_.get(var1);
   }

   @Override
   public PlayerRadioPushOrBuilder getRadioPushesOrBuilder(int var1) {
      return this.radioPushes_.get(var1);
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
      for (int var2 = 0; var2 < this.cosmeticPushes_.size(); var2++) {
         var1.writeMessage(1, this.cosmeticPushes_.get(var2));
      }

      for (int var3 = 0; var3 < this.radioPushes_.size(); var3++) {
         var1.writeMessage(2, this.radioPushes_.get(var3));
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

      for (int var2 = 0; var2 < this.cosmeticPushes_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.cosmeticPushes_.get(var2));
      }

      for (int var5 = 0; var5 < this.radioPushes_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.radioPushes_.get(var5));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SubscribeResponse)) {
         return super.equals(var1);
      } else {
         SubscribeResponse var2 = (SubscribeResponse)var1;
         if (!this.getCosmeticPushesList().equals(var2.getCosmeticPushesList())) {
            return false;
         } else {
            return !this.getRadioPushesList().equals(var2.getRadioPushesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getCosmeticPushesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getCosmeticPushesList().hashCode();
      }

      if (this.getRadioPushesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRadioPushesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SubscribeResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SubscribeResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SubscribeResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SubscribeResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SubscribeResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SubscribeResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SubscribeResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SubscribeResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SubscribeResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SubscribeResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SubscribeResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SubscribeResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SubscribeResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SubscribeResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SubscribeResponse.Builder newBuilder(SubscribeResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SubscribeResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SubscribeResponse.Builder() : new SubscribeResponse.Builder().mergeFrom(this);
   }

   protected SubscribeResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SubscribeResponse.Builder(var1);
   }

   public static SubscribeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SubscribeResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<SubscribeResponse> getParserForType() {
      return PARSER;
   }

   public SubscribeResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SubscribeResponse.Builder> implements SubscribeResponseOrBuilder {
      private int bitField0_;
      private List<PlayerCosmeticsPush> cosmeticPushes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PlayerCosmeticsPush, PlayerCosmeticsPush.Builder, PlayerCosmeticsPushOrBuilder> cosmeticPushesBuilder_;
      private List<PlayerRadioPush> radioPushes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PlayerRadioPush, PlayerRadioPush.Builder, PlayerRadioPushOrBuilder> radioPushesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SubscribeResponse.class, SubscribeResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SubscribeResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.cosmeticPushesBuilder_ == null) {
            this.cosmeticPushes_ = Collections.emptyList();
         } else {
            this.cosmeticPushes_ = null;
            this.cosmeticPushesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         if (this.radioPushesBuilder_ == null) {
            this.radioPushes_ = Collections.emptyList();
         } else {
            this.radioPushes_ = null;
            this.radioPushesBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_descriptor;
      }

      public SubscribeResponse getDefaultInstanceForType() {
         return SubscribeResponse.getDefaultInstance();
      }

      public SubscribeResponse build() {
         SubscribeResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SubscribeResponse buildPartial() {
         SubscribeResponse var1 = new SubscribeResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(SubscribeResponse var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.cosmeticPushes_ = Collections.unmodifiableList(this.cosmeticPushes_);
               this.bitField0_ &= -2;
            }

            var1.cosmeticPushes_ = this.cosmeticPushes_;
         } else {
            var1.cosmeticPushes_ = this.cosmeticPushesBuilder_.build();
         }

         if (this.radioPushesBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.radioPushes_ = Collections.unmodifiableList(this.radioPushes_);
               this.bitField0_ &= -3;
            }

            var1.radioPushes_ = this.radioPushes_;
         } else {
            var1.radioPushes_ = this.radioPushesBuilder_.build();
         }
      }

      private void buildPartial0(SubscribeResponse var1) {
         int var2 = this.bitField0_;
      }

      public SubscribeResponse.Builder clone() {
         return (SubscribeResponse.Builder)super.clone();
      }

      public SubscribeResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SubscribeResponse.Builder)super.setField(var1, var2);
      }

      public SubscribeResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SubscribeResponse.Builder)super.clearField(var1);
      }

      public SubscribeResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SubscribeResponse.Builder)super.clearOneof(var1);
      }

      public SubscribeResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SubscribeResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SubscribeResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SubscribeResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public SubscribeResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof SubscribeResponse) {
            return this.mergeFrom((SubscribeResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SubscribeResponse.Builder mergeFrom(SubscribeResponse var1) {
         if (var1 == SubscribeResponse.getDefaultInstance()) {
            return this;
         }

         if (this.cosmeticPushesBuilder_ == null) {
            if (!var1.cosmeticPushes_.isEmpty()) {
               if (this.cosmeticPushes_.isEmpty()) {
                  this.cosmeticPushes_ = var1.cosmeticPushes_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureCosmeticPushesIsMutable();
                  this.cosmeticPushes_.addAll(var1.cosmeticPushes_);
               }

               this.onChanged();
            }
         } else if (!var1.cosmeticPushes_.isEmpty()) {
            if (this.cosmeticPushesBuilder_.isEmpty()) {
               this.cosmeticPushesBuilder_.dispose();
               this.cosmeticPushesBuilder_ = null;
               this.cosmeticPushes_ = var1.cosmeticPushes_;
               this.bitField0_ &= -2;
               this.cosmeticPushesBuilder_ = SubscribeResponse.alwaysUseFieldBuilders ? this.getCosmeticPushesFieldBuilder() : null;
            } else {
               this.cosmeticPushesBuilder_.addAllMessages(var1.cosmeticPushes_);
            }
         }

         if (this.radioPushesBuilder_ == null) {
            if (!var1.radioPushes_.isEmpty()) {
               if (this.radioPushes_.isEmpty()) {
                  this.radioPushes_ = var1.radioPushes_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureRadioPushesIsMutable();
                  this.radioPushes_.addAll(var1.radioPushes_);
               }

               this.onChanged();
            }
         } else if (!var1.radioPushes_.isEmpty()) {
            if (this.radioPushesBuilder_.isEmpty()) {
               this.radioPushesBuilder_.dispose();
               this.radioPushesBuilder_ = null;
               this.radioPushes_ = var1.radioPushes_;
               this.bitField0_ &= -3;
               this.radioPushesBuilder_ = SubscribeResponse.alwaysUseFieldBuilders ? this.getRadioPushesFieldBuilder() : null;
            } else {
               this.radioPushesBuilder_.addAllMessages(var1.radioPushes_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SubscribeResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     PlayerCosmeticsPush var11 = var1.readMessage(PlayerCosmeticsPush.parser(), var2);
                     if (this.cosmeticPushesBuilder_ == null) {
                        this.ensureCosmeticPushesIsMutable();
                        this.cosmeticPushes_.add(var11);
                     } else {
                        this.cosmeticPushesBuilder_.addMessage(var11);
                     }
                     break;
                  case 18:
                     PlayerRadioPush var5 = var1.readMessage(PlayerRadioPush.parser(), var2);
                     if (this.radioPushesBuilder_ == null) {
                        this.ensureRadioPushesIsMutable();
                        this.radioPushes_.add(var5);
                     } else {
                        this.radioPushesBuilder_.addMessage(var5);
                     }
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

      private void ensureCosmeticPushesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.cosmeticPushes_ = new ArrayList<>(this.cosmeticPushes_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<PlayerCosmeticsPush> getCosmeticPushesList() {
         return this.cosmeticPushesBuilder_ == null ? Collections.unmodifiableList(this.cosmeticPushes_) : this.cosmeticPushesBuilder_.getMessageList();
      }

      @Override
      public int getCosmeticPushesCount() {
         return this.cosmeticPushesBuilder_ == null ? this.cosmeticPushes_.size() : this.cosmeticPushesBuilder_.getCount();
      }

      @Override
      public PlayerCosmeticsPush getCosmeticPushes(int var1) {
         return this.cosmeticPushesBuilder_ == null ? this.cosmeticPushes_.get(var1) : this.cosmeticPushesBuilder_.getMessage(var1);
      }

      public SubscribeResponse.Builder setCosmeticPushes(int var1, PlayerCosmeticsPush var2) {
         if (this.cosmeticPushesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.set(var1, var2);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public SubscribeResponse.Builder setCosmeticPushes(int var1, PlayerCosmeticsPush.Builder var2) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeResponse.Builder addCosmeticPushes(PlayerCosmeticsPush var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.add(var1);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addMessage(var1);
         }

         return this;
      }

      public SubscribeResponse.Builder addCosmeticPushes(int var1, PlayerCosmeticsPush var2) {
         if (this.cosmeticPushesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.add(var1, var2);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public SubscribeResponse.Builder addCosmeticPushes(PlayerCosmeticsPush.Builder var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.add(var1.build());
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SubscribeResponse.Builder addCosmeticPushes(int var1, PlayerCosmeticsPush.Builder var2) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeResponse.Builder addAllCosmeticPushes(Iterable<? extends PlayerCosmeticsPush> var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.cosmeticPushes_);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SubscribeResponse.Builder clearCosmeticPushes() {
         if (this.cosmeticPushesBuilder_ == null) {
            this.cosmeticPushes_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.clear();
         }

         return this;
      }

      public SubscribeResponse.Builder removeCosmeticPushes(int var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.remove(var1);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.remove(var1);
         }

         return this;
      }

      public PlayerCosmeticsPush.Builder getCosmeticPushesBuilder(int var1) {
         return this.getCosmeticPushesFieldBuilder().getBuilder(var1);
      }

      @Override
      public PlayerCosmeticsPushOrBuilder getCosmeticPushesOrBuilder(int var1) {
         return this.cosmeticPushesBuilder_ == null ? this.cosmeticPushes_.get(var1) : this.cosmeticPushesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PlayerCosmeticsPushOrBuilder> getCosmeticPushesOrBuilderList() {
         return this.cosmeticPushesBuilder_ != null
            ? this.cosmeticPushesBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.cosmeticPushes_);
      }

      public PlayerCosmeticsPush.Builder addCosmeticPushesBuilder() {
         return this.getCosmeticPushesFieldBuilder().addBuilder(PlayerCosmeticsPush.getDefaultInstance());
      }

      public PlayerCosmeticsPush.Builder addCosmeticPushesBuilder(int var1) {
         return this.getCosmeticPushesFieldBuilder().addBuilder(var1, PlayerCosmeticsPush.getDefaultInstance());
      }

      public List<PlayerCosmeticsPush.Builder> getCosmeticPushesBuilderList() {
         return this.getCosmeticPushesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PlayerCosmeticsPush, PlayerCosmeticsPush.Builder, PlayerCosmeticsPushOrBuilder> getCosmeticPushesFieldBuilder() {
         if (this.cosmeticPushesBuilder_ == null) {
            this.cosmeticPushesBuilder_ = new RepeatedFieldBuilderV3<>(
               this.cosmeticPushes_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.cosmeticPushes_ = null;
         }

         return this.cosmeticPushesBuilder_;
      }

      private void ensureRadioPushesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.radioPushes_ = new ArrayList<>(this.radioPushes_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PlayerRadioPush> getRadioPushesList() {
         return this.radioPushesBuilder_ == null ? Collections.unmodifiableList(this.radioPushes_) : this.radioPushesBuilder_.getMessageList();
      }

      @Override
      public int getRadioPushesCount() {
         return this.radioPushesBuilder_ == null ? this.radioPushes_.size() : this.radioPushesBuilder_.getCount();
      }

      @Override
      public PlayerRadioPush getRadioPushes(int var1) {
         return this.radioPushesBuilder_ == null ? this.radioPushes_.get(var1) : this.radioPushesBuilder_.getMessage(var1);
      }

      public SubscribeResponse.Builder setRadioPushes(int var1, PlayerRadioPush var2) {
         if (this.radioPushesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRadioPushesIsMutable();
            this.radioPushes_.set(var1, var2);
            this.onChanged();
         } else {
            this.radioPushesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public SubscribeResponse.Builder setRadioPushes(int var1, PlayerRadioPush.Builder var2) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.radioPushesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeResponse.Builder addRadioPushes(PlayerRadioPush var1) {
         if (this.radioPushesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureRadioPushesIsMutable();
            this.radioPushes_.add(var1);
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addMessage(var1);
         }

         return this;
      }

      public SubscribeResponse.Builder addRadioPushes(int var1, PlayerRadioPush var2) {
         if (this.radioPushesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRadioPushesIsMutable();
            this.radioPushes_.add(var1, var2);
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public SubscribeResponse.Builder addRadioPushes(PlayerRadioPush.Builder var1) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.add(var1.build());
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SubscribeResponse.Builder addRadioPushes(int var1, PlayerRadioPush.Builder var2) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeResponse.Builder addAllRadioPushes(Iterable<? extends PlayerRadioPush> var1) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.radioPushes_);
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SubscribeResponse.Builder clearRadioPushes() {
         if (this.radioPushesBuilder_ == null) {
            this.radioPushes_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.radioPushesBuilder_.clear();
         }

         return this;
      }

      public SubscribeResponse.Builder removeRadioPushes(int var1) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.remove(var1);
            this.onChanged();
         } else {
            this.radioPushesBuilder_.remove(var1);
         }

         return this;
      }

      public PlayerRadioPush.Builder getRadioPushesBuilder(int var1) {
         return this.getRadioPushesFieldBuilder().getBuilder(var1);
      }

      @Override
      public PlayerRadioPushOrBuilder getRadioPushesOrBuilder(int var1) {
         return this.radioPushesBuilder_ == null ? this.radioPushes_.get(var1) : this.radioPushesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PlayerRadioPushOrBuilder> getRadioPushesOrBuilderList() {
         return this.radioPushesBuilder_ != null ? this.radioPushesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.radioPushes_);
      }

      public PlayerRadioPush.Builder addRadioPushesBuilder() {
         return this.getRadioPushesFieldBuilder().addBuilder(PlayerRadioPush.getDefaultInstance());
      }

      public PlayerRadioPush.Builder addRadioPushesBuilder(int var1) {
         return this.getRadioPushesFieldBuilder().addBuilder(var1, PlayerRadioPush.getDefaultInstance());
      }

      public List<PlayerRadioPush.Builder> getRadioPushesBuilderList() {
         return this.getRadioPushesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PlayerRadioPush, PlayerRadioPush.Builder, PlayerRadioPushOrBuilder> getRadioPushesFieldBuilder() {
         if (this.radioPushesBuilder_ == null) {
            this.radioPushesBuilder_ = new RepeatedFieldBuilderV3<>(this.radioPushes_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.radioPushes_ = null;
         }

         return this.radioPushesBuilder_;
      }

      public final SubscribeResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SubscribeResponse.Builder)super.setUnknownFields(var1);
      }

      public final SubscribeResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SubscribeResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
