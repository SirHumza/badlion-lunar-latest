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
import com.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2;
import com.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2OrBuilder;
import com.lunarclient.websocket.radio.v1.PlayerRadioPush;
import com.lunarclient.websocket.radio.v1.PlayerRadioPushOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubscribeV2Response extends GeneratedMessageV3 implements SubscribeV2ResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COSMETIC_PUSHES_FIELD_NUMBER = 1;
   private List<PlayerCosmeticsPushV2> cosmeticPushes_;
   public static final int RADIO_PUSHES_FIELD_NUMBER = 2;
   private List<PlayerRadioPush> radioPushes_;
   private byte memoizedIsInitialized = -1;
   private static final SubscribeV2Response DEFAULT_INSTANCE = new SubscribeV2Response();
   private static final Parser<SubscribeV2Response> PARSER = new AbstractParser<SubscribeV2Response>() {
      public SubscribeV2Response parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SubscribeV2Response.Builder var3 = SubscribeV2Response.newBuilder();

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

   private SubscribeV2Response(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SubscribeV2Response() {
      this.cosmeticPushes_ = Collections.emptyList();
      this.radioPushes_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SubscribeV2Response();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SubscribeV2Response.class, SubscribeV2Response.Builder.class);
   }

   @Override
   public List<PlayerCosmeticsPushV2> getCosmeticPushesList() {
      return this.cosmeticPushes_;
   }

   @Override
   public List<? extends PlayerCosmeticsPushV2OrBuilder> getCosmeticPushesOrBuilderList() {
      return this.cosmeticPushes_;
   }

   @Override
   public int getCosmeticPushesCount() {
      return this.cosmeticPushes_.size();
   }

   @Override
   public PlayerCosmeticsPushV2 getCosmeticPushes(int var1) {
      return this.cosmeticPushes_.get(var1);
   }

   @Override
   public PlayerCosmeticsPushV2OrBuilder getCosmeticPushesOrBuilder(int var1) {
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
      } else if (!(var1 instanceof SubscribeV2Response)) {
         return super.equals(var1);
      } else {
         SubscribeV2Response var2 = (SubscribeV2Response)var1;
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

   public static SubscribeV2Response parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SubscribeV2Response parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SubscribeV2Response parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SubscribeV2Response parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SubscribeV2Response parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SubscribeV2Response parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SubscribeV2Response parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SubscribeV2Response parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SubscribeV2Response parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SubscribeV2Response parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SubscribeV2Response parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SubscribeV2Response parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SubscribeV2Response.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SubscribeV2Response.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SubscribeV2Response.Builder newBuilder(SubscribeV2Response var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SubscribeV2Response.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SubscribeV2Response.Builder() : new SubscribeV2Response.Builder().mergeFrom(this);
   }

   protected SubscribeV2Response.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SubscribeV2Response.Builder(var1);
   }

   public static SubscribeV2Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SubscribeV2Response> parser() {
      return PARSER;
   }

   @Override
   public Parser<SubscribeV2Response> getParserForType() {
      return PARSER;
   }

   public SubscribeV2Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SubscribeV2Response.Builder> implements SubscribeV2ResponseOrBuilder {
      private int bitField0_;
      private List<PlayerCosmeticsPushV2> cosmeticPushes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PlayerCosmeticsPushV2, PlayerCosmeticsPushV2.Builder, PlayerCosmeticsPushV2OrBuilder> cosmeticPushesBuilder_;
      private List<PlayerRadioPush> radioPushes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PlayerRadioPush, PlayerRadioPush.Builder, PlayerRadioPushOrBuilder> radioPushesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SubscribeV2Response.class, SubscribeV2Response.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SubscribeV2Response.Builder clear() {
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
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_descriptor;
      }

      public SubscribeV2Response getDefaultInstanceForType() {
         return SubscribeV2Response.getDefaultInstance();
      }

      public SubscribeV2Response build() {
         SubscribeV2Response var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SubscribeV2Response buildPartial() {
         SubscribeV2Response var1 = new SubscribeV2Response(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(SubscribeV2Response var1) {
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

      private void buildPartial0(SubscribeV2Response var1) {
         int var2 = this.bitField0_;
      }

      public SubscribeV2Response.Builder clone() {
         return (SubscribeV2Response.Builder)super.clone();
      }

      public SubscribeV2Response.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SubscribeV2Response.Builder)super.setField(var1, var2);
      }

      public SubscribeV2Response.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SubscribeV2Response.Builder)super.clearField(var1);
      }

      public SubscribeV2Response.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SubscribeV2Response.Builder)super.clearOneof(var1);
      }

      public SubscribeV2Response.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SubscribeV2Response.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SubscribeV2Response.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SubscribeV2Response.Builder)super.addRepeatedField(var1, var2);
      }

      public SubscribeV2Response.Builder mergeFrom(Message var1) {
         if (var1 instanceof SubscribeV2Response) {
            return this.mergeFrom((SubscribeV2Response)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SubscribeV2Response.Builder mergeFrom(SubscribeV2Response var1) {
         if (var1 == SubscribeV2Response.getDefaultInstance()) {
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
               this.cosmeticPushesBuilder_ = SubscribeV2Response.alwaysUseFieldBuilders ? this.getCosmeticPushesFieldBuilder() : null;
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
               this.radioPushesBuilder_ = SubscribeV2Response.alwaysUseFieldBuilders ? this.getRadioPushesFieldBuilder() : null;
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

      public SubscribeV2Response.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     PlayerCosmeticsPushV2 var11 = var1.readMessage(PlayerCosmeticsPushV2.parser(), var2);
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
      public List<PlayerCosmeticsPushV2> getCosmeticPushesList() {
         return this.cosmeticPushesBuilder_ == null ? Collections.unmodifiableList(this.cosmeticPushes_) : this.cosmeticPushesBuilder_.getMessageList();
      }

      @Override
      public int getCosmeticPushesCount() {
         return this.cosmeticPushesBuilder_ == null ? this.cosmeticPushes_.size() : this.cosmeticPushesBuilder_.getCount();
      }

      @Override
      public PlayerCosmeticsPushV2 getCosmeticPushes(int var1) {
         return this.cosmeticPushesBuilder_ == null ? this.cosmeticPushes_.get(var1) : this.cosmeticPushesBuilder_.getMessage(var1);
      }

      public SubscribeV2Response.Builder setCosmeticPushes(int var1, PlayerCosmeticsPushV2 var2) {
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

      public SubscribeV2Response.Builder setCosmeticPushes(int var1, PlayerCosmeticsPushV2.Builder var2) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeV2Response.Builder addCosmeticPushes(PlayerCosmeticsPushV2 var1) {
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

      public SubscribeV2Response.Builder addCosmeticPushes(int var1, PlayerCosmeticsPushV2 var2) {
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

      public SubscribeV2Response.Builder addCosmeticPushes(PlayerCosmeticsPushV2.Builder var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.add(var1.build());
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SubscribeV2Response.Builder addCosmeticPushes(int var1, PlayerCosmeticsPushV2.Builder var2) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeV2Response.Builder addAllCosmeticPushes(Iterable<? extends PlayerCosmeticsPushV2> var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.cosmeticPushes_);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SubscribeV2Response.Builder clearCosmeticPushes() {
         if (this.cosmeticPushesBuilder_ == null) {
            this.cosmeticPushes_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.clear();
         }

         return this;
      }

      public SubscribeV2Response.Builder removeCosmeticPushes(int var1) {
         if (this.cosmeticPushesBuilder_ == null) {
            this.ensureCosmeticPushesIsMutable();
            this.cosmeticPushes_.remove(var1);
            this.onChanged();
         } else {
            this.cosmeticPushesBuilder_.remove(var1);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder getCosmeticPushesBuilder(int var1) {
         return this.getCosmeticPushesFieldBuilder().getBuilder(var1);
      }

      @Override
      public PlayerCosmeticsPushV2OrBuilder getCosmeticPushesOrBuilder(int var1) {
         return this.cosmeticPushesBuilder_ == null ? this.cosmeticPushes_.get(var1) : this.cosmeticPushesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PlayerCosmeticsPushV2OrBuilder> getCosmeticPushesOrBuilderList() {
         return this.cosmeticPushesBuilder_ != null
            ? this.cosmeticPushesBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.cosmeticPushes_);
      }

      public PlayerCosmeticsPushV2.Builder addCosmeticPushesBuilder() {
         return this.getCosmeticPushesFieldBuilder().addBuilder(PlayerCosmeticsPushV2.getDefaultInstance());
      }

      public PlayerCosmeticsPushV2.Builder addCosmeticPushesBuilder(int var1) {
         return this.getCosmeticPushesFieldBuilder().addBuilder(var1, PlayerCosmeticsPushV2.getDefaultInstance());
      }

      public List<PlayerCosmeticsPushV2.Builder> getCosmeticPushesBuilderList() {
         return this.getCosmeticPushesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PlayerCosmeticsPushV2, PlayerCosmeticsPushV2.Builder, PlayerCosmeticsPushV2OrBuilder> getCosmeticPushesFieldBuilder() {
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

      public SubscribeV2Response.Builder setRadioPushes(int var1, PlayerRadioPush var2) {
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

      public SubscribeV2Response.Builder setRadioPushes(int var1, PlayerRadioPush.Builder var2) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.radioPushesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeV2Response.Builder addRadioPushes(PlayerRadioPush var1) {
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

      public SubscribeV2Response.Builder addRadioPushes(int var1, PlayerRadioPush var2) {
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

      public SubscribeV2Response.Builder addRadioPushes(PlayerRadioPush.Builder var1) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.add(var1.build());
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SubscribeV2Response.Builder addRadioPushes(int var1, PlayerRadioPush.Builder var2) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            this.radioPushes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SubscribeV2Response.Builder addAllRadioPushes(Iterable<? extends PlayerRadioPush> var1) {
         if (this.radioPushesBuilder_ == null) {
            this.ensureRadioPushesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.radioPushes_);
            this.onChanged();
         } else {
            this.radioPushesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SubscribeV2Response.Builder clearRadioPushes() {
         if (this.radioPushesBuilder_ == null) {
            this.radioPushes_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.radioPushesBuilder_.clear();
         }

         return this;
      }

      public SubscribeV2Response.Builder removeRadioPushes(int var1) {
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

      public final SubscribeV2Response.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SubscribeV2Response.Builder)super.setUnknownFields(var1);
      }

      public final SubscribeV2Response.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SubscribeV2Response.Builder)super.mergeUnknownFields(var1);
      }
   }
}
