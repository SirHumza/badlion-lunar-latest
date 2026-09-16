package com.lunarclient.websocket.cosmetic.v1;

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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoadTabLogosResponse extends GeneratedMessageV3 implements LoadTabLogosResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TAB_LOGOS_FIELD_NUMBER = 1;
   private List<LoadTabLogosResponse.TabLogo> tabLogos_;
   private byte memoizedIsInitialized = -1;
   private static final LoadTabLogosResponse DEFAULT_INSTANCE = new LoadTabLogosResponse();
   private static final Parser<LoadTabLogosResponse> PARSER = new AbstractParser<LoadTabLogosResponse>() {
      public LoadTabLogosResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadTabLogosResponse.Builder var3 = LoadTabLogosResponse.newBuilder();

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

   private LoadTabLogosResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadTabLogosResponse() {
      this.tabLogos_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadTabLogosResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadTabLogosResponse.class, LoadTabLogosResponse.Builder.class);
   }

   @Override
   public List<LoadTabLogosResponse.TabLogo> getTabLogosList() {
      return this.tabLogos_;
   }

   @Override
   public List<? extends LoadTabLogosResponse.TabLogoOrBuilder> getTabLogosOrBuilderList() {
      return this.tabLogos_;
   }

   @Override
   public int getTabLogosCount() {
      return this.tabLogos_.size();
   }

   @Override
   public LoadTabLogosResponse.TabLogo getTabLogos(int var1) {
      return this.tabLogos_.get(var1);
   }

   @Override
   public LoadTabLogosResponse.TabLogoOrBuilder getTabLogosOrBuilder(int var1) {
      return this.tabLogos_.get(var1);
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
      for (int var2 = 0; var2 < this.tabLogos_.size(); var2++) {
         var1.writeMessage(1, this.tabLogos_.get(var2));
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

      for (int var2 = 0; var2 < this.tabLogos_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.tabLogos_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LoadTabLogosResponse)) {
         return super.equals(var1);
      }

      LoadTabLogosResponse var2 = (LoadTabLogosResponse)var1;
      return !this.getTabLogosList().equals(var2.getTabLogosList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getTabLogosCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTabLogosList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadTabLogosResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadTabLogosResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadTabLogosResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadTabLogosResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadTabLogosResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadTabLogosResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadTabLogosResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadTabLogosResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadTabLogosResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadTabLogosResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadTabLogosResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadTabLogosResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadTabLogosResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadTabLogosResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadTabLogosResponse.Builder newBuilder(LoadTabLogosResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadTabLogosResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadTabLogosResponse.Builder() : new LoadTabLogosResponse.Builder().mergeFrom(this);
   }

   protected LoadTabLogosResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadTabLogosResponse.Builder(var1);
   }

   public static LoadTabLogosResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadTabLogosResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadTabLogosResponse> getParserForType() {
      return PARSER;
   }

   public LoadTabLogosResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadTabLogosResponse.Builder> implements LoadTabLogosResponseOrBuilder {
      private int bitField0_;
      private List<LoadTabLogosResponse.TabLogo> tabLogos_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<LoadTabLogosResponse.TabLogo, LoadTabLogosResponse.TabLogo.Builder, LoadTabLogosResponse.TabLogoOrBuilder> tabLogosBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadTabLogosResponse.class, LoadTabLogosResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadTabLogosResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.tabLogosBuilder_ == null) {
            this.tabLogos_ = Collections.emptyList();
         } else {
            this.tabLogos_ = null;
            this.tabLogosBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_descriptor;
      }

      public LoadTabLogosResponse getDefaultInstanceForType() {
         return LoadTabLogosResponse.getDefaultInstance();
      }

      public LoadTabLogosResponse build() {
         LoadTabLogosResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadTabLogosResponse buildPartial() {
         LoadTabLogosResponse var1 = new LoadTabLogosResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoadTabLogosResponse var1) {
         if (this.tabLogosBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.tabLogos_ = Collections.unmodifiableList(this.tabLogos_);
               this.bitField0_ &= -2;
            }

            var1.tabLogos_ = this.tabLogos_;
         } else {
            var1.tabLogos_ = this.tabLogosBuilder_.build();
         }
      }

      private void buildPartial0(LoadTabLogosResponse var1) {
         int var2 = this.bitField0_;
      }

      public LoadTabLogosResponse.Builder clone() {
         return (LoadTabLogosResponse.Builder)super.clone();
      }

      public LoadTabLogosResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadTabLogosResponse.Builder)super.setField(var1, var2);
      }

      public LoadTabLogosResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadTabLogosResponse.Builder)super.clearField(var1);
      }

      public LoadTabLogosResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadTabLogosResponse.Builder)super.clearOneof(var1);
      }

      public LoadTabLogosResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadTabLogosResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadTabLogosResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadTabLogosResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadTabLogosResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadTabLogosResponse) {
            return this.mergeFrom((LoadTabLogosResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadTabLogosResponse.Builder mergeFrom(LoadTabLogosResponse var1) {
         if (var1 == LoadTabLogosResponse.getDefaultInstance()) {
            return this;
         }

         if (this.tabLogosBuilder_ == null) {
            if (!var1.tabLogos_.isEmpty()) {
               if (this.tabLogos_.isEmpty()) {
                  this.tabLogos_ = var1.tabLogos_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureTabLogosIsMutable();
                  this.tabLogos_.addAll(var1.tabLogos_);
               }

               this.onChanged();
            }
         } else if (!var1.tabLogos_.isEmpty()) {
            if (this.tabLogosBuilder_.isEmpty()) {
               this.tabLogosBuilder_.dispose();
               this.tabLogosBuilder_ = null;
               this.tabLogos_ = var1.tabLogos_;
               this.bitField0_ &= -2;
               this.tabLogosBuilder_ = LoadTabLogosResponse.alwaysUseFieldBuilders ? this.getTabLogosFieldBuilder() : null;
            } else {
               this.tabLogosBuilder_.addAllMessages(var1.tabLogos_);
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

      public LoadTabLogosResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     LoadTabLogosResponse.TabLogo var5 = var1.readMessage(LoadTabLogosResponse.TabLogo.parser(), var2);
                     if (this.tabLogosBuilder_ == null) {
                        this.ensureTabLogosIsMutable();
                        this.tabLogos_.add(var5);
                     } else {
                        this.tabLogosBuilder_.addMessage(var5);
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

      private void ensureTabLogosIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.tabLogos_ = new ArrayList<>(this.tabLogos_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<LoadTabLogosResponse.TabLogo> getTabLogosList() {
         return this.tabLogosBuilder_ == null ? Collections.unmodifiableList(this.tabLogos_) : this.tabLogosBuilder_.getMessageList();
      }

      @Override
      public int getTabLogosCount() {
         return this.tabLogosBuilder_ == null ? this.tabLogos_.size() : this.tabLogosBuilder_.getCount();
      }

      @Override
      public LoadTabLogosResponse.TabLogo getTabLogos(int var1) {
         return this.tabLogosBuilder_ == null ? this.tabLogos_.get(var1) : this.tabLogosBuilder_.getMessage(var1);
      }

      public LoadTabLogosResponse.Builder setTabLogos(int var1, LoadTabLogosResponse.TabLogo var2) {
         if (this.tabLogosBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTabLogosIsMutable();
            this.tabLogos_.set(var1, var2);
            this.onChanged();
         } else {
            this.tabLogosBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoadTabLogosResponse.Builder setTabLogos(int var1, LoadTabLogosResponse.TabLogo.Builder var2) {
         if (this.tabLogosBuilder_ == null) {
            this.ensureTabLogosIsMutable();
            this.tabLogos_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.tabLogosBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoadTabLogosResponse.Builder addTabLogos(LoadTabLogosResponse.TabLogo var1) {
         if (this.tabLogosBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTabLogosIsMutable();
            this.tabLogos_.add(var1);
            this.onChanged();
         } else {
            this.tabLogosBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoadTabLogosResponse.Builder addTabLogos(int var1, LoadTabLogosResponse.TabLogo var2) {
         if (this.tabLogosBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTabLogosIsMutable();
            this.tabLogos_.add(var1, var2);
            this.onChanged();
         } else {
            this.tabLogosBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoadTabLogosResponse.Builder addTabLogos(LoadTabLogosResponse.TabLogo.Builder var1) {
         if (this.tabLogosBuilder_ == null) {
            this.ensureTabLogosIsMutable();
            this.tabLogos_.add(var1.build());
            this.onChanged();
         } else {
            this.tabLogosBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoadTabLogosResponse.Builder addTabLogos(int var1, LoadTabLogosResponse.TabLogo.Builder var2) {
         if (this.tabLogosBuilder_ == null) {
            this.ensureTabLogosIsMutable();
            this.tabLogos_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.tabLogosBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoadTabLogosResponse.Builder addAllTabLogos(Iterable<? extends LoadTabLogosResponse.TabLogo> var1) {
         if (this.tabLogosBuilder_ == null) {
            this.ensureTabLogosIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.tabLogos_);
            this.onChanged();
         } else {
            this.tabLogosBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoadTabLogosResponse.Builder clearTabLogos() {
         if (this.tabLogosBuilder_ == null) {
            this.tabLogos_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.tabLogosBuilder_.clear();
         }

         return this;
      }

      public LoadTabLogosResponse.Builder removeTabLogos(int var1) {
         if (this.tabLogosBuilder_ == null) {
            this.ensureTabLogosIsMutable();
            this.tabLogos_.remove(var1);
            this.onChanged();
         } else {
            this.tabLogosBuilder_.remove(var1);
         }

         return this;
      }

      public LoadTabLogosResponse.TabLogo.Builder getTabLogosBuilder(int var1) {
         return this.getTabLogosFieldBuilder().getBuilder(var1);
      }

      @Override
      public LoadTabLogosResponse.TabLogoOrBuilder getTabLogosOrBuilder(int var1) {
         return this.tabLogosBuilder_ == null ? this.tabLogos_.get(var1) : this.tabLogosBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends LoadTabLogosResponse.TabLogoOrBuilder> getTabLogosOrBuilderList() {
         return this.tabLogosBuilder_ != null ? this.tabLogosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tabLogos_);
      }

      public LoadTabLogosResponse.TabLogo.Builder addTabLogosBuilder() {
         return this.getTabLogosFieldBuilder().addBuilder(LoadTabLogosResponse.TabLogo.getDefaultInstance());
      }

      public LoadTabLogosResponse.TabLogo.Builder addTabLogosBuilder(int var1) {
         return this.getTabLogosFieldBuilder().addBuilder(var1, LoadTabLogosResponse.TabLogo.getDefaultInstance());
      }

      public List<LoadTabLogosResponse.TabLogo.Builder> getTabLogosBuilderList() {
         return this.getTabLogosFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<LoadTabLogosResponse.TabLogo, LoadTabLogosResponse.TabLogo.Builder, LoadTabLogosResponse.TabLogoOrBuilder> getTabLogosFieldBuilder() {
         if (this.tabLogosBuilder_ == null) {
            this.tabLogosBuilder_ = new RepeatedFieldBuilderV3<>(this.tabLogos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.tabLogos_ = null;
         }

         return this.tabLogosBuilder_;
      }

      public final LoadTabLogosResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadTabLogosResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoadTabLogosResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadTabLogosResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class TabLogo extends GeneratedMessageV3 implements LoadTabLogosResponse.TabLogoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYER_UUID_FIELD_NUMBER = 1;
      private Uuid playerUuid_;
      public static final int LOGO_COLOR_FIELD_NUMBER = 2;
      private Color logoColor_;
      public static final int PLUS_COLOR_FIELD_NUMBER = 3;
      private Color plusColor_;
      public static final int BADGE_ID_FIELD_NUMBER = 4;
      private int badgeId_ = 0;
      private byte memoizedIsInitialized = -1;
      private static final LoadTabLogosResponse.TabLogo DEFAULT_INSTANCE = new LoadTabLogosResponse.TabLogo();
      private static final Parser<LoadTabLogosResponse.TabLogo> PARSER = new AbstractParser<LoadTabLogosResponse.TabLogo>() {
         public LoadTabLogosResponse.TabLogo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            LoadTabLogosResponse.TabLogo.Builder var3 = LoadTabLogosResponse.TabLogo.newBuilder();

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

      private TabLogo(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private TabLogo() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new LoadTabLogosResponse.TabLogo();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadTabLogosResponse.TabLogo.class, LoadTabLogosResponse.TabLogo.Builder.class);
      }

      @Override
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getLogoColor() {
         return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
      }

      @Override
      public ColorOrBuilder getLogoColorOrBuilder() {
         return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
      }

      @Override
      public boolean hasPlusColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getPlusColor() {
         return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
      }

      @Override
      public ColorOrBuilder getPlusColorOrBuilder() {
         return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
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
         if ((this.bitField0_ & 1) != 0) {
            var1.writeMessage(1, this.getPlayerUuid());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(2, this.getLogoColor());
         }

         if ((this.bitField0_ & 4) != 0) {
            var1.writeMessage(3, this.getPlusColor());
         }

         if (this.badgeId_ != 0) {
            var1.writeInt32(4, this.badgeId_);
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
         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(2, this.getLogoColor());
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeMessageSize(3, this.getPlusColor());
         }

         if (this.badgeId_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(4, this.badgeId_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof LoadTabLogosResponse.TabLogo)) {
            return super.equals(var1);
         } else {
            LoadTabLogosResponse.TabLogo var2 = (LoadTabLogosResponse.TabLogo)var1;
            if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
               return false;
            } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
               return false;
            } else if (this.hasLogoColor() != var2.hasLogoColor()) {
               return false;
            } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
               return false;
            } else if (this.hasPlusColor() != var2.hasPlusColor()) {
               return false;
            } else if (this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor())) {
               return false;
            } else {
               return this.getBadgeId() != var2.getBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasPlayerUuid()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getPlayerUuid().hashCode();
         }

         if (this.hasLogoColor()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getLogoColor().hashCode();
         }

         if (this.hasPlusColor()) {
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getPlusColor().hashCode();
         }

         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getBadgeId();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static LoadTabLogosResponse.TabLogo parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static LoadTabLogosResponse.TabLogo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static LoadTabLogosResponse.TabLogo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public LoadTabLogosResponse.TabLogo.Builder newBuilderForType() {
         return newBuilder();
      }

      public static LoadTabLogosResponse.TabLogo.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static LoadTabLogosResponse.TabLogo.Builder newBuilder(LoadTabLogosResponse.TabLogo var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public LoadTabLogosResponse.TabLogo.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new LoadTabLogosResponse.TabLogo.Builder() : new LoadTabLogosResponse.TabLogo.Builder().mergeFrom(this);
      }

      protected LoadTabLogosResponse.TabLogo.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new LoadTabLogosResponse.TabLogo.Builder(var1);
      }

      public static LoadTabLogosResponse.TabLogo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<LoadTabLogosResponse.TabLogo> parser() {
         return PARSER;
      }

      @Override
      public Parser<LoadTabLogosResponse.TabLogo> getParserForType() {
         return PARSER;
      }

      public LoadTabLogosResponse.TabLogo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<LoadTabLogosResponse.TabLogo.Builder>
         implements LoadTabLogosResponse.TabLogoOrBuilder {
         private int bitField0_;
         private Uuid playerUuid_;
         private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
         private Color logoColor_;
         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
         private Color plusColor_;
         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;
         private int badgeId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_fieldAccessorTable
               .ensureFieldAccessorsInitialized(LoadTabLogosResponse.TabLogo.class, LoadTabLogosResponse.TabLogo.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoadTabLogosResponse.TabLogo.alwaysUseFieldBuilders) {
               this.getPlayerUuidFieldBuilder();
               this.getLogoColorFieldBuilder();
               this.getPlusColorFieldBuilder();
            }
         }

         public LoadTabLogosResponse.TabLogo.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.playerUuid_ = null;
            if (this.playerUuidBuilder_ != null) {
               this.playerUuidBuilder_.dispose();
               this.playerUuidBuilder_ = null;
            }

            this.logoColor_ = null;
            if (this.logoColorBuilder_ != null) {
               this.logoColorBuilder_.dispose();
               this.logoColorBuilder_ = null;
            }

            this.plusColor_ = null;
            if (this.plusColorBuilder_ != null) {
               this.plusColorBuilder_.dispose();
               this.plusColorBuilder_ = null;
            }

            this.badgeId_ = 0;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosResponse_TabLogo_descriptor;
         }

         public LoadTabLogosResponse.TabLogo getDefaultInstanceForType() {
            return LoadTabLogosResponse.TabLogo.getDefaultInstance();
         }

         public LoadTabLogosResponse.TabLogo build() {
            LoadTabLogosResponse.TabLogo var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public LoadTabLogosResponse.TabLogo buildPartial() {
            LoadTabLogosResponse.TabLogo var1 = new LoadTabLogosResponse.TabLogo(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(LoadTabLogosResponse.TabLogo var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
               var3 |= 2;
            }

            if ((var2 & 4) != 0) {
               var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
               var3 |= 4;
            }

            if ((var2 & 8) != 0) {
               var1.badgeId_ = this.badgeId_;
            }

            LoadTabLogosResponse.TabLogo var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public LoadTabLogosResponse.TabLogo.Builder clone() {
            return (LoadTabLogosResponse.TabLogo.Builder)super.clone();
         }

         public LoadTabLogosResponse.TabLogo.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.setField(var1, var2);
         }

         public LoadTabLogosResponse.TabLogo.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.clearField(var1);
         }

         public LoadTabLogosResponse.TabLogo.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.clearOneof(var1);
         }

         public LoadTabLogosResponse.TabLogo.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public LoadTabLogosResponse.TabLogo.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.addRepeatedField(var1, var2);
         }

         public LoadTabLogosResponse.TabLogo.Builder mergeFrom(Message var1) {
            if (var1 instanceof LoadTabLogosResponse.TabLogo) {
               return this.mergeFrom((LoadTabLogosResponse.TabLogo)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder mergeFrom(LoadTabLogosResponse.TabLogo var1) {
            if (var1 == LoadTabLogosResponse.TabLogo.getDefaultInstance()) {
               return this;
            }

            if (var1.hasPlayerUuid()) {
               this.mergePlayerUuid(var1.getPlayerUuid());
            }

            if (var1.hasLogoColor()) {
               this.mergeLogoColor(var1.getLogoColor());
            }

            if (var1.hasPlusColor()) {
               this.mergePlusColor(var1.getPlusColor());
            }

            if (var1.getBadgeId() != 0) {
               this.setBadgeId(var1.getBadgeId());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public LoadTabLogosResponse.TabLogo.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.badgeId_ = var1.readInt32();
                        this.bitField0_ |= 8;
                        break;
                     default:
                        if (!super.parseUnknownField(var1, var2, var4)) {
                           var3 = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException var8) {
               throw var8.unwrapIOException();
            } finally {
               this.onChanged();
            }

            return this;
         }

         @Override
         public boolean hasPlayerUuid() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public Uuid getPlayerUuid() {
            if (this.playerUuidBuilder_ == null) {
               return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
            } else {
               return this.playerUuidBuilder_.getMessage();
            }
         }

         public LoadTabLogosResponse.TabLogo.Builder setPlayerUuid(Uuid var1) {
            if (this.playerUuidBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.playerUuid_ = var1;
            } else {
               this.playerUuidBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder setPlayerUuid(Uuid.Builder var1) {
            if (this.playerUuidBuilder_ == null) {
               this.playerUuid_ = var1.build();
            } else {
               this.playerUuidBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder mergePlayerUuid(Uuid var1) {
            if (this.playerUuidBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
                  this.getPlayerUuidBuilder().mergeFrom(var1);
               } else {
                  this.playerUuid_ = var1;
               }
            } else {
               this.playerUuidBuilder_.mergeFrom(var1);
            }

            if (this.playerUuid_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder clearPlayerUuid() {
            this.bitField0_ &= -2;
            this.playerUuid_ = null;
            if (this.playerUuidBuilder_ != null) {
               this.playerUuidBuilder_.dispose();
               this.playerUuidBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Uuid.Builder getPlayerUuidBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getPlayerUuidFieldBuilder().getBuilder();
         }

         @Override
         public UuidOrBuilder getPlayerUuidOrBuilder() {
            if (this.playerUuidBuilder_ != null) {
               return this.playerUuidBuilder_.getMessageOrBuilder();
            } else {
               return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
            }
         }

         private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
            if (this.playerUuidBuilder_ == null) {
               this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
               this.playerUuid_ = null;
            }

            return this.playerUuidBuilder_;
         }

         @Override
         public boolean hasLogoColor() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public Color getLogoColor() {
            if (this.logoColorBuilder_ == null) {
               return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
            } else {
               return this.logoColorBuilder_.getMessage();
            }
         }

         public LoadTabLogosResponse.TabLogo.Builder setLogoColor(Color var1) {
            if (this.logoColorBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.logoColor_ = var1;
            } else {
               this.logoColorBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder setLogoColor(Color.Builder var1) {
            if (this.logoColorBuilder_ == null) {
               this.logoColor_ = var1.build();
            } else {
               this.logoColorBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder mergeLogoColor(Color var1) {
            if (this.logoColorBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
                  this.getLogoColorBuilder().mergeFrom(var1);
               } else {
                  this.logoColor_ = var1;
               }
            } else {
               this.logoColorBuilder_.mergeFrom(var1);
            }

            if (this.logoColor_ != null) {
               this.bitField0_ |= 2;
               this.onChanged();
            }

            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder clearLogoColor() {
            this.bitField0_ &= -3;
            this.logoColor_ = null;
            if (this.logoColorBuilder_ != null) {
               this.logoColorBuilder_.dispose();
               this.logoColorBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Color.Builder getLogoColorBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return this.getLogoColorFieldBuilder().getBuilder();
         }

         @Override
         public ColorOrBuilder getLogoColorOrBuilder() {
            if (this.logoColorBuilder_ != null) {
               return this.logoColorBuilder_.getMessageOrBuilder();
            } else {
               return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
            }
         }

         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getLogoColorFieldBuilder() {
            if (this.logoColorBuilder_ == null) {
               this.logoColorBuilder_ = new SingleFieldBuilderV3<>(this.getLogoColor(), this.getParentForChildren(), this.isClean());
               this.logoColor_ = null;
            }

            return this.logoColorBuilder_;
         }

         @Override
         public boolean hasPlusColor() {
            return (this.bitField0_ & 4) != 0;
         }

         @Override
         public Color getPlusColor() {
            if (this.plusColorBuilder_ == null) {
               return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
            } else {
               return this.plusColorBuilder_.getMessage();
            }
         }

         public LoadTabLogosResponse.TabLogo.Builder setPlusColor(Color var1) {
            if (this.plusColorBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.plusColor_ = var1;
            } else {
               this.plusColorBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder setPlusColor(Color.Builder var1) {
            if (this.plusColorBuilder_ == null) {
               this.plusColor_ = var1.build();
            } else {
               this.plusColorBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder mergePlusColor(Color var1) {
            if (this.plusColorBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
                  this.getPlusColorBuilder().mergeFrom(var1);
               } else {
                  this.plusColor_ = var1;
               }
            } else {
               this.plusColorBuilder_.mergeFrom(var1);
            }

            if (this.plusColor_ != null) {
               this.bitField0_ |= 4;
               this.onChanged();
            }

            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder clearPlusColor() {
            this.bitField0_ &= -5;
            this.plusColor_ = null;
            if (this.plusColorBuilder_ != null) {
               this.plusColorBuilder_.dispose();
               this.plusColorBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Color.Builder getPlusColorBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return this.getPlusColorFieldBuilder().getBuilder();
         }

         @Override
         public ColorOrBuilder getPlusColorOrBuilder() {
            if (this.plusColorBuilder_ != null) {
               return this.plusColorBuilder_.getMessageOrBuilder();
            } else {
               return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
            }
         }

         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlusColorFieldBuilder() {
            if (this.plusColorBuilder_ == null) {
               this.plusColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlusColor(), this.getParentForChildren(), this.isClean());
               this.plusColor_ = null;
            }

            return this.plusColorBuilder_;
         }

         @Override
         public int getBadgeId() {
            return this.badgeId_;
         }

         public LoadTabLogosResponse.TabLogo.Builder setBadgeId(int var1) {
            this.badgeId_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public LoadTabLogosResponse.TabLogo.Builder clearBadgeId() {
            this.bitField0_ &= -9;
            this.badgeId_ = 0;
            this.onChanged();
            return this;
         }

         public final LoadTabLogosResponse.TabLogo.Builder setUnknownFields(UnknownFieldSet var1) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.setUnknownFields(var1);
         }

         public final LoadTabLogosResponse.TabLogo.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (LoadTabLogosResponse.TabLogo.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface TabLogoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerUuid();

      Uuid getPlayerUuid();

      UuidOrBuilder getPlayerUuidOrBuilder();

      boolean hasLogoColor();

      Color getLogoColor();

      ColorOrBuilder getLogoColorOrBuilder();

      boolean hasPlusColor();

      Color getPlusColor();

      ColorOrBuilder getPlusColorOrBuilder();

      int getBadgeId();
   }
}
