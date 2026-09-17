package com.lunarclient.websocket.hostedworld.v1;

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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ListHostedWorldsResponse extends GeneratedMessageV3 implements ListHostedWorldsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int HOSTED_WORLDS_FIELD_NUMBER = 1;
   private List<ListHostedWorldsResponse.HostedWorld> hostedWorlds_;
   private byte memoizedIsInitialized = -1;
   private static final ListHostedWorldsResponse DEFAULT_INSTANCE = new ListHostedWorldsResponse();
   private static final Parser<ListHostedWorldsResponse> PARSER = new AbstractParser<ListHostedWorldsResponse>() {
      public ListHostedWorldsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ListHostedWorldsResponse.Builder var3 = ListHostedWorldsResponse.newBuilder();

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

   private ListHostedWorldsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ListHostedWorldsResponse() {
      this.hostedWorlds_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ListHostedWorldsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ListHostedWorldsResponse.class, ListHostedWorldsResponse.Builder.class);
   }

   @Override
   public List<ListHostedWorldsResponse.HostedWorld> getHostedWorldsList() {
      return this.hostedWorlds_;
   }

   @Override
   public List<? extends ListHostedWorldsResponse.HostedWorldOrBuilder> getHostedWorldsOrBuilderList() {
      return this.hostedWorlds_;
   }

   @Override
   public int getHostedWorldsCount() {
      return this.hostedWorlds_.size();
   }

   @Override
   public ListHostedWorldsResponse.HostedWorld getHostedWorlds(int var1) {
      return this.hostedWorlds_.get(var1);
   }

   @Override
   public ListHostedWorldsResponse.HostedWorldOrBuilder getHostedWorldsOrBuilder(int var1) {
      return this.hostedWorlds_.get(var1);
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
      for (int var2 = 0; var2 < this.hostedWorlds_.size(); var2++) {
         var1.writeMessage(1, this.hostedWorlds_.get(var2));
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

      for (int var2 = 0; var2 < this.hostedWorlds_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.hostedWorlds_.get(var2));
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

      if (!(var1 instanceof ListHostedWorldsResponse)) {
         return super.equals(var1);
      }

      ListHostedWorldsResponse var2 = (ListHostedWorldsResponse)var1;
      return !this.getHostedWorldsList().equals(var2.getHostedWorldsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getHostedWorldsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getHostedWorldsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ListHostedWorldsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ListHostedWorldsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ListHostedWorldsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ListHostedWorldsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ListHostedWorldsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ListHostedWorldsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ListHostedWorldsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ListHostedWorldsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ListHostedWorldsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ListHostedWorldsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ListHostedWorldsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ListHostedWorldsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ListHostedWorldsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ListHostedWorldsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ListHostedWorldsResponse.Builder newBuilder(ListHostedWorldsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ListHostedWorldsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ListHostedWorldsResponse.Builder() : new ListHostedWorldsResponse.Builder().mergeFrom(this);
   }

   protected ListHostedWorldsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ListHostedWorldsResponse.Builder(var1);
   }

   public static ListHostedWorldsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ListHostedWorldsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<ListHostedWorldsResponse> getParserForType() {
      return PARSER;
   }

   public ListHostedWorldsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ListHostedWorldsResponse.Builder> implements ListHostedWorldsResponseOrBuilder {
      private int bitField0_;
      private List<ListHostedWorldsResponse.HostedWorld> hostedWorlds_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ListHostedWorldsResponse.HostedWorld, ListHostedWorldsResponse.HostedWorld.Builder, ListHostedWorldsResponse.HostedWorldOrBuilder> hostedWorldsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ListHostedWorldsResponse.class, ListHostedWorldsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ListHostedWorldsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.hostedWorldsBuilder_ == null) {
            this.hostedWorlds_ = Collections.emptyList();
         } else {
            this.hostedWorlds_ = null;
            this.hostedWorldsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_descriptor;
      }

      public ListHostedWorldsResponse getDefaultInstanceForType() {
         return ListHostedWorldsResponse.getDefaultInstance();
      }

      public ListHostedWorldsResponse build() {
         ListHostedWorldsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ListHostedWorldsResponse buildPartial() {
         ListHostedWorldsResponse var1 = new ListHostedWorldsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ListHostedWorldsResponse var1) {
         if (this.hostedWorldsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.hostedWorlds_ = Collections.unmodifiableList(this.hostedWorlds_);
               this.bitField0_ &= -2;
            }

            var1.hostedWorlds_ = this.hostedWorlds_;
         } else {
            var1.hostedWorlds_ = this.hostedWorldsBuilder_.build();
         }
      }

      private void buildPartial0(ListHostedWorldsResponse var1) {
         int var2 = this.bitField0_;
      }

      public ListHostedWorldsResponse.Builder clone() {
         return (ListHostedWorldsResponse.Builder)super.clone();
      }

      public ListHostedWorldsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ListHostedWorldsResponse.Builder)super.setField(var1, var2);
      }

      public ListHostedWorldsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ListHostedWorldsResponse.Builder)super.clearField(var1);
      }

      public ListHostedWorldsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ListHostedWorldsResponse.Builder)super.clearOneof(var1);
      }

      public ListHostedWorldsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ListHostedWorldsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ListHostedWorldsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ListHostedWorldsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public ListHostedWorldsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof ListHostedWorldsResponse) {
            return this.mergeFrom((ListHostedWorldsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ListHostedWorldsResponse.Builder mergeFrom(ListHostedWorldsResponse var1) {
         if (var1 == ListHostedWorldsResponse.getDefaultInstance()) {
            return this;
         }

         if (this.hostedWorldsBuilder_ == null) {
            if (!var1.hostedWorlds_.isEmpty()) {
               if (this.hostedWorlds_.isEmpty()) {
                  this.hostedWorlds_ = var1.hostedWorlds_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureHostedWorldsIsMutable();
                  this.hostedWorlds_.addAll(var1.hostedWorlds_);
               }

               this.onChanged();
            }
         } else if (!var1.hostedWorlds_.isEmpty()) {
            if (this.hostedWorldsBuilder_.isEmpty()) {
               this.hostedWorldsBuilder_.dispose();
               this.hostedWorldsBuilder_ = null;
               this.hostedWorlds_ = var1.hostedWorlds_;
               this.bitField0_ &= -2;
               this.hostedWorldsBuilder_ = ListHostedWorldsResponse.alwaysUseFieldBuilders ? this.getHostedWorldsFieldBuilder() : null;
            } else {
               this.hostedWorldsBuilder_.addAllMessages(var1.hostedWorlds_);
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

      public ListHostedWorldsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ListHostedWorldsResponse.HostedWorld var5 = var1.readMessage(ListHostedWorldsResponse.HostedWorld.parser(), var2);
                     if (this.hostedWorldsBuilder_ == null) {
                        this.ensureHostedWorldsIsMutable();
                        this.hostedWorlds_.add(var5);
                     } else {
                        this.hostedWorldsBuilder_.addMessage(var5);
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

      private void ensureHostedWorldsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.hostedWorlds_ = new ArrayList<>(this.hostedWorlds_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ListHostedWorldsResponse.HostedWorld> getHostedWorldsList() {
         return this.hostedWorldsBuilder_ == null ? Collections.unmodifiableList(this.hostedWorlds_) : this.hostedWorldsBuilder_.getMessageList();
      }

      @Override
      public int getHostedWorldsCount() {
         return this.hostedWorldsBuilder_ == null ? this.hostedWorlds_.size() : this.hostedWorldsBuilder_.getCount();
      }

      @Override
      public ListHostedWorldsResponse.HostedWorld getHostedWorlds(int var1) {
         return this.hostedWorldsBuilder_ == null ? this.hostedWorlds_.get(var1) : this.hostedWorldsBuilder_.getMessage(var1);
      }

      public ListHostedWorldsResponse.Builder setHostedWorlds(int var1, ListHostedWorldsResponse.HostedWorld var2) {
         if (this.hostedWorldsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.set(var1, var2);
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder setHostedWorlds(int var1, ListHostedWorldsResponse.HostedWorld.Builder var2) {
         if (this.hostedWorldsBuilder_ == null) {
            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder addHostedWorlds(ListHostedWorldsResponse.HostedWorld var1) {
         if (this.hostedWorldsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.add(var1);
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder addHostedWorlds(int var1, ListHostedWorldsResponse.HostedWorld var2) {
         if (this.hostedWorldsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.add(var1, var2);
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder addHostedWorlds(ListHostedWorldsResponse.HostedWorld.Builder var1) {
         if (this.hostedWorldsBuilder_ == null) {
            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.add(var1.build());
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder addHostedWorlds(int var1, ListHostedWorldsResponse.HostedWorld.Builder var2) {
         if (this.hostedWorldsBuilder_ == null) {
            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder addAllHostedWorlds(Iterable<? extends ListHostedWorldsResponse.HostedWorld> var1) {
         if (this.hostedWorldsBuilder_ == null) {
            this.ensureHostedWorldsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.hostedWorlds_);
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder clearHostedWorlds() {
         if (this.hostedWorldsBuilder_ == null) {
            this.hostedWorlds_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.clear();
         }

         return this;
      }

      public ListHostedWorldsResponse.Builder removeHostedWorlds(int var1) {
         if (this.hostedWorldsBuilder_ == null) {
            this.ensureHostedWorldsIsMutable();
            this.hostedWorlds_.remove(var1);
            this.onChanged();
         } else {
            this.hostedWorldsBuilder_.remove(var1);
         }

         return this;
      }

      public ListHostedWorldsResponse.HostedWorld.Builder getHostedWorldsBuilder(int var1) {
         return this.getHostedWorldsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ListHostedWorldsResponse.HostedWorldOrBuilder getHostedWorldsOrBuilder(int var1) {
         return this.hostedWorldsBuilder_ == null ? this.hostedWorlds_.get(var1) : this.hostedWorldsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ListHostedWorldsResponse.HostedWorldOrBuilder> getHostedWorldsOrBuilderList() {
         return this.hostedWorldsBuilder_ != null ? this.hostedWorldsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hostedWorlds_);
      }

      public ListHostedWorldsResponse.HostedWorld.Builder addHostedWorldsBuilder() {
         return this.getHostedWorldsFieldBuilder().addBuilder(ListHostedWorldsResponse.HostedWorld.getDefaultInstance());
      }

      public ListHostedWorldsResponse.HostedWorld.Builder addHostedWorldsBuilder(int var1) {
         return this.getHostedWorldsFieldBuilder().addBuilder(var1, ListHostedWorldsResponse.HostedWorld.getDefaultInstance());
      }

      public List<ListHostedWorldsResponse.HostedWorld.Builder> getHostedWorldsBuilderList() {
         return this.getHostedWorldsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ListHostedWorldsResponse.HostedWorld, ListHostedWorldsResponse.HostedWorld.Builder, ListHostedWorldsResponse.HostedWorldOrBuilder> getHostedWorldsFieldBuilder() {
         if (this.hostedWorldsBuilder_ == null) {
            this.hostedWorldsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.hostedWorlds_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.hostedWorlds_ = null;
         }

         return this.hostedWorldsBuilder_;
      }

      public final ListHostedWorldsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ListHostedWorldsResponse.Builder)super.setUnknownFields(var1);
      }

      public final ListHostedWorldsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ListHostedWorldsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class HostedWorld extends GeneratedMessageV3 implements ListHostedWorldsResponse.HostedWorldOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HOST_FIELD_NUMBER = 1;
      private UuidAndUsername host_;
      public static final int MINECRAFT_VERSION_FIELD_NUMBER = 2;
      private MinecraftVersion minecraftVersion_;
      public static final int JOINABILITY_FIELD_NUMBER = 3;
      private int joinability_ = 0;
      public static final int ONLINE_PLAYERS_FIELD_NUMBER = 4;
      private int onlinePlayers_ = 0;
      public static final int MAX_PLAYERS_FIELD_NUMBER = 5;
      private int maxPlayers_ = 0;
      public static final int SAMPLE_PLAYERS_FIELD_NUMBER = 6;
      private List<UuidAndUsername> samplePlayers_;
      public static final int LUNAR_PLUS_BOOST_FIELD_NUMBER = 7;
      private boolean lunarPlusBoost_ = false;
      public static final int LOGO_COLOR_FIELD_NUMBER = 8;
      private Color logoColor_;
      public static final int PLUS_COLOR_FIELD_NUMBER = 9;
      private Color plusColor_;
      private byte memoizedIsInitialized = -1;
      private static final ListHostedWorldsResponse.HostedWorld DEFAULT_INSTANCE = new ListHostedWorldsResponse.HostedWorld();
      private static final Parser<ListHostedWorldsResponse.HostedWorld> PARSER = new AbstractParser<ListHostedWorldsResponse.HostedWorld>() {
         public ListHostedWorldsResponse.HostedWorld parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            ListHostedWorldsResponse.HostedWorld.Builder var3 = ListHostedWorldsResponse.HostedWorld.newBuilder();

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

      private HostedWorld(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private HostedWorld() {
         this.joinability_ = 0;
         this.samplePlayers_ = Collections.emptyList();
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new ListHostedWorldsResponse.HostedWorld();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ListHostedWorldsResponse.HostedWorld.class, ListHostedWorldsResponse.HostedWorld.Builder.class);
      }

      @Override
      public boolean hasHost() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getHost() {
         return this.host_ == null ? UuidAndUsername.getDefaultInstance() : this.host_;
      }

      @Override
      public UuidAndUsernameOrBuilder getHostOrBuilder() {
         return this.host_ == null ? UuidAndUsername.getDefaultInstance() : this.host_;
      }

      @Override
      public boolean hasMinecraftVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public MinecraftVersion getMinecraftVersion() {
         return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
      }

      @Override
      public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
         return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
      }

      @Override
      public int getJoinabilityValue() {
         return this.joinability_;
      }

      @Override
      public Joinability getJoinability() {
         Joinability var1 = Joinability.forNumber(this.joinability_);
         return var1 == null ? Joinability.UNRECOGNIZED : var1;
      }

      @Override
      public int getOnlinePlayers() {
         return this.onlinePlayers_;
      }

      @Override
      public int getMaxPlayers() {
         return this.maxPlayers_;
      }

      @Override
      public List<UuidAndUsername> getSamplePlayersList() {
         return this.samplePlayers_;
      }

      @Override
      public List<? extends UuidAndUsernameOrBuilder> getSamplePlayersOrBuilderList() {
         return this.samplePlayers_;
      }

      @Override
      public int getSamplePlayersCount() {
         return this.samplePlayers_.size();
      }

      @Override
      public UuidAndUsername getSamplePlayers(int var1) {
         return this.samplePlayers_.get(var1);
      }

      @Override
      public UuidAndUsernameOrBuilder getSamplePlayersOrBuilder(int var1) {
         return this.samplePlayers_.get(var1);
      }

      @Override
      public boolean getLunarPlusBoost() {
         return this.lunarPlusBoost_;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 4) != 0;
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
         return (this.bitField0_ & 8) != 0;
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
            var1.writeMessage(1, this.getHost());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1.writeMessage(2, this.getMinecraftVersion());
         }

         if (this.joinability_ != Joinability.JOINABILITY_UNSPECIFIED.getNumber()) {
            var1.writeEnum(3, this.joinability_);
         }

         if (this.onlinePlayers_ != 0) {
            var1.writeInt32(4, this.onlinePlayers_);
         }

         if (this.maxPlayers_ != 0) {
            var1.writeInt32(5, this.maxPlayers_);
         }

         for (int var2 = 0; var2 < this.samplePlayers_.size(); var2++) {
            var1.writeMessage(6, this.samplePlayers_.get(var2));
         }

         if (this.lunarPlusBoost_) {
            var1.writeBool(7, this.lunarPlusBoost_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1.writeMessage(8, this.getLogoColor());
         }

         if ((this.bitField0_ & 8) != 0) {
            var1.writeMessage(9, this.getPlusColor());
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getHost());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(2, this.getMinecraftVersion());
         }

         if (this.joinability_ != Joinability.JOINABILITY_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(3, this.joinability_);
         }

         if (this.onlinePlayers_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(4, this.onlinePlayers_);
         }

         if (this.maxPlayers_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(5, this.maxPlayers_);
         }

         for (int var2 = 0; var2 < this.samplePlayers_.size(); var2++) {
            var1 += CodedOutputStream.computeMessageSize(6, this.samplePlayers_.get(var2));
         }

         if (this.lunarPlusBoost_) {
            var1 += CodedOutputStream.computeBoolSize(7, this.lunarPlusBoost_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeMessageSize(8, this.getLogoColor());
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeMessageSize(9, this.getPlusColor());
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof ListHostedWorldsResponse.HostedWorld)) {
            return super.equals(var1);
         } else {
            ListHostedWorldsResponse.HostedWorld var2 = (ListHostedWorldsResponse.HostedWorld)var1;
            if (this.hasHost() != var2.hasHost()) {
               return false;
            } else if (this.hasHost() && !this.getHost().equals(var2.getHost())) {
               return false;
            } else if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
               return false;
            } else if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
               return false;
            } else if (this.joinability_ != var2.joinability_) {
               return false;
            } else if (this.getOnlinePlayers() != var2.getOnlinePlayers()) {
               return false;
            } else if (this.getMaxPlayers() != var2.getMaxPlayers()) {
               return false;
            } else if (!this.getSamplePlayersList().equals(var2.getSamplePlayersList())) {
               return false;
            } else if (this.getLunarPlusBoost() != var2.getLunarPlusBoost()) {
               return false;
            } else if (this.hasLogoColor() != var2.hasLogoColor()) {
               return false;
            } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
               return false;
            } else if (this.hasPlusColor() != var2.hasPlusColor()) {
               return false;
            } else {
               return this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasHost()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getHost().hashCode();
         }

         if (this.hasMinecraftVersion()) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getMinecraftVersion().hashCode();
         }

         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.joinability_;
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getOnlinePlayers();
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getMaxPlayers();
         if (this.getSamplePlayersCount() > 0) {
            var1 = 37 * var1 + 6;
            var1 = 53 * var1 + this.getSamplePlayersList().hashCode();
         }

         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + Internal.hashBoolean(this.getLunarPlusBoost());
         if (this.hasLogoColor()) {
            var1 = 37 * var1 + 8;
            var1 = 53 * var1 + this.getLogoColor().hashCode();
         }

         if (this.hasPlusColor()) {
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getPlusColor().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static ListHostedWorldsResponse.HostedWorld parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static ListHostedWorldsResponse.HostedWorld parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static ListHostedWorldsResponse.HostedWorld parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public ListHostedWorldsResponse.HostedWorld.Builder newBuilderForType() {
         return newBuilder();
      }

      public static ListHostedWorldsResponse.HostedWorld.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static ListHostedWorldsResponse.HostedWorld.Builder newBuilder(ListHostedWorldsResponse.HostedWorld var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public ListHostedWorldsResponse.HostedWorld.Builder toBuilder() {
         return this == DEFAULT_INSTANCE
            ? new ListHostedWorldsResponse.HostedWorld.Builder()
            : new ListHostedWorldsResponse.HostedWorld.Builder().mergeFrom(this);
      }

      protected ListHostedWorldsResponse.HostedWorld.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new ListHostedWorldsResponse.HostedWorld.Builder(var1);
      }

      public static ListHostedWorldsResponse.HostedWorld getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ListHostedWorldsResponse.HostedWorld> parser() {
         return PARSER;
      }

      @Override
      public Parser<ListHostedWorldsResponse.HostedWorld> getParserForType() {
         return PARSER;
      }

      public ListHostedWorldsResponse.HostedWorld getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<ListHostedWorldsResponse.HostedWorld.Builder>
         implements ListHostedWorldsResponse.HostedWorldOrBuilder {
         private int bitField0_;
         private UuidAndUsername host_;
         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> hostBuilder_;
         private MinecraftVersion minecraftVersion_;
         private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
         private int joinability_ = 0;
         private int onlinePlayers_;
         private int maxPlayers_;
         private List<UuidAndUsername> samplePlayers_ = Collections.emptyList();
         private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> samplePlayersBuilder_;
         private boolean lunarPlusBoost_;
         private Color logoColor_;
         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
         private Color plusColor_;
         private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_fieldAccessorTable
               .ensureFieldAccessorsInitialized(ListHostedWorldsResponse.HostedWorld.class, ListHostedWorldsResponse.HostedWorld.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ListHostedWorldsResponse.HostedWorld.alwaysUseFieldBuilders) {
               this.getHostFieldBuilder();
               this.getMinecraftVersionFieldBuilder();
               this.getSamplePlayersFieldBuilder();
               this.getLogoColorFieldBuilder();
               this.getPlusColorFieldBuilder();
            }
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.host_ = null;
            if (this.hostBuilder_ != null) {
               this.hostBuilder_.dispose();
               this.hostBuilder_ = null;
            }

            this.minecraftVersion_ = null;
            if (this.minecraftVersionBuilder_ != null) {
               this.minecraftVersionBuilder_.dispose();
               this.minecraftVersionBuilder_ = null;
            }

            this.joinability_ = 0;
            this.onlinePlayers_ = 0;
            this.maxPlayers_ = 0;
            if (this.samplePlayersBuilder_ == null) {
               this.samplePlayers_ = Collections.emptyList();
            } else {
               this.samplePlayers_ = null;
               this.samplePlayersBuilder_.clear();
            }

            this.bitField0_ &= -33;
            this.lunarPlusBoost_ = false;
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

            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_ListHostedWorldsResponse_HostedWorld_descriptor;
         }

         public ListHostedWorldsResponse.HostedWorld getDefaultInstanceForType() {
            return ListHostedWorldsResponse.HostedWorld.getDefaultInstance();
         }

         public ListHostedWorldsResponse.HostedWorld build() {
            ListHostedWorldsResponse.HostedWorld var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public ListHostedWorldsResponse.HostedWorld buildPartial() {
            ListHostedWorldsResponse.HostedWorld var1 = new ListHostedWorldsResponse.HostedWorld(this);
            this.buildPartialRepeatedFields(var1);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartialRepeatedFields(ListHostedWorldsResponse.HostedWorld var1) {
            if (this.samplePlayersBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.samplePlayers_ = Collections.unmodifiableList(this.samplePlayers_);
                  this.bitField0_ &= -33;
               }

               var1.samplePlayers_ = this.samplePlayers_;
            } else {
               var1.samplePlayers_ = this.samplePlayersBuilder_.build();
            }
         }

         private void buildPartial0(ListHostedWorldsResponse.HostedWorld var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.host_ = this.hostBuilder_ == null ? this.host_ : this.hostBuilder_.build();
               var3 |= 1;
            }

            if ((var2 & 2) != 0) {
               var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
               var3 |= 2;
            }

            if ((var2 & 4) != 0) {
               var1.joinability_ = this.joinability_;
            }

            if ((var2 & 8) != 0) {
               var1.onlinePlayers_ = this.onlinePlayers_;
            }

            if ((var2 & 16) != 0) {
               var1.maxPlayers_ = this.maxPlayers_;
            }

            if ((var2 & 64) != 0) {
               var1.lunarPlusBoost_ = this.lunarPlusBoost_;
            }

            if ((var2 & 128) != 0) {
               var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
               var3 |= 4;
            }

            if ((var2 & 256) != 0) {
               var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
               var3 |= 8;
            }

            ListHostedWorldsResponse.HostedWorld var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clone() {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.clone();
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.setField(var1, var2);
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.clearField(var1);
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.clearOneof(var1);
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public ListHostedWorldsResponse.HostedWorld.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.addRepeatedField(var1, var2);
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergeFrom(Message var1) {
            if (var1 instanceof ListHostedWorldsResponse.HostedWorld) {
               return this.mergeFrom((ListHostedWorldsResponse.HostedWorld)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergeFrom(ListHostedWorldsResponse.HostedWorld var1) {
            if (var1 == ListHostedWorldsResponse.HostedWorld.getDefaultInstance()) {
               return this;
            }

            if (var1.hasHost()) {
               this.mergeHost(var1.getHost());
            }

            if (var1.hasMinecraftVersion()) {
               this.mergeMinecraftVersion(var1.getMinecraftVersion());
            }

            if (var1.joinability_ != 0) {
               this.setJoinabilityValue(var1.getJoinabilityValue());
            }

            if (var1.getOnlinePlayers() != 0) {
               this.setOnlinePlayers(var1.getOnlinePlayers());
            }

            if (var1.getMaxPlayers() != 0) {
               this.setMaxPlayers(var1.getMaxPlayers());
            }

            if (this.samplePlayersBuilder_ == null) {
               if (!var1.samplePlayers_.isEmpty()) {
                  if (this.samplePlayers_.isEmpty()) {
                     this.samplePlayers_ = var1.samplePlayers_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureSamplePlayersIsMutable();
                     this.samplePlayers_.addAll(var1.samplePlayers_);
                  }

                  this.onChanged();
               }
            } else if (!var1.samplePlayers_.isEmpty()) {
               if (this.samplePlayersBuilder_.isEmpty()) {
                  this.samplePlayersBuilder_.dispose();
                  this.samplePlayersBuilder_ = null;
                  this.samplePlayers_ = var1.samplePlayers_;
                  this.bitField0_ &= -33;
                  this.samplePlayersBuilder_ = ListHostedWorldsResponse.HostedWorld.alwaysUseFieldBuilders ? this.getSamplePlayersFieldBuilder() : null;
               } else {
                  this.samplePlayersBuilder_.addAllMessages(var1.samplePlayers_);
               }
            }

            if (var1.getLunarPlusBoost()) {
               this.setLunarPlusBoost(var1.getLunarPlusBoost());
            }

            if (var1.hasLogoColor()) {
               this.mergeLogoColor(var1.getLogoColor());
            }

            if (var1.hasPlusColor()) {
               this.mergePlusColor(var1.getPlusColor());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getHostFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        var1.readMessage(this.getMinecraftVersionFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.joinability_ = var1.readEnum();
                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.onlinePlayers_ = var1.readInt32();
                        this.bitField0_ |= 8;
                        break;
                     case 40:
                        this.maxPlayers_ = var1.readInt32();
                        this.bitField0_ |= 16;
                        break;
                     case 50:
                        UuidAndUsername var5 = var1.readMessage(UuidAndUsername.parser(), var2);
                        if (this.samplePlayersBuilder_ == null) {
                           this.ensureSamplePlayersIsMutable();
                           this.samplePlayers_.add(var5);
                        } else {
                           this.samplePlayersBuilder_.addMessage(var5);
                        }
                        break;
                     case 56:
                        this.lunarPlusBoost_ = var1.readBool();
                        this.bitField0_ |= 64;
                        break;
                     case 66:
                        var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 128;
                        break;
                     case 74:
                        var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 256;
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

         @Override
         public boolean hasHost() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public UuidAndUsername getHost() {
            if (this.hostBuilder_ == null) {
               return this.host_ == null ? UuidAndUsername.getDefaultInstance() : this.host_;
            } else {
               return this.hostBuilder_.getMessage();
            }
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setHost(UuidAndUsername var1) {
            if (this.hostBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.host_ = var1;
            } else {
               this.hostBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setHost(UuidAndUsername.Builder var1) {
            if (this.hostBuilder_ == null) {
               this.host_ = var1.build();
            } else {
               this.hostBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergeHost(UuidAndUsername var1) {
            if (this.hostBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.host_ != null && this.host_ != UuidAndUsername.getDefaultInstance()) {
                  this.getHostBuilder().mergeFrom(var1);
               } else {
                  this.host_ = var1;
               }
            } else {
               this.hostBuilder_.mergeFrom(var1);
            }

            if (this.host_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearHost() {
            this.bitField0_ &= -2;
            this.host_ = null;
            if (this.hostBuilder_ != null) {
               this.hostBuilder_.dispose();
               this.hostBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public UuidAndUsername.Builder getHostBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getHostFieldBuilder().getBuilder();
         }

         @Override
         public UuidAndUsernameOrBuilder getHostOrBuilder() {
            if (this.hostBuilder_ != null) {
               return this.hostBuilder_.getMessageOrBuilder();
            } else {
               return this.host_ == null ? UuidAndUsername.getDefaultInstance() : this.host_;
            }
         }

         private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getHostFieldBuilder() {
            if (this.hostBuilder_ == null) {
               this.hostBuilder_ = new SingleFieldBuilderV3<>(this.getHost(), this.getParentForChildren(), this.isClean());
               this.host_ = null;
            }

            return this.hostBuilder_;
         }

         @Override
         public boolean hasMinecraftVersion() {
            return (this.bitField0_ & 2) != 0;
         }

         @Override
         public MinecraftVersion getMinecraftVersion() {
            if (this.minecraftVersionBuilder_ == null) {
               return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
            } else {
               return this.minecraftVersionBuilder_.getMessage();
            }
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setMinecraftVersion(MinecraftVersion var1) {
            if (this.minecraftVersionBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.minecraftVersion_ = var1;
            } else {
               this.minecraftVersionBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
            if (this.minecraftVersionBuilder_ == null) {
               this.minecraftVersion_ = var1.build();
            } else {
               this.minecraftVersionBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergeMinecraftVersion(MinecraftVersion var1) {
            if (this.minecraftVersionBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.minecraftVersion_ != null && this.minecraftVersion_ != MinecraftVersion.getDefaultInstance()) {
                  this.getMinecraftVersionBuilder().mergeFrom(var1);
               } else {
                  this.minecraftVersion_ = var1;
               }
            } else {
               this.minecraftVersionBuilder_.mergeFrom(var1);
            }

            if (this.minecraftVersion_ != null) {
               this.bitField0_ |= 2;
               this.onChanged();
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearMinecraftVersion() {
            this.bitField0_ &= -3;
            this.minecraftVersion_ = null;
            if (this.minecraftVersionBuilder_ != null) {
               this.minecraftVersionBuilder_.dispose();
               this.minecraftVersionBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public MinecraftVersion.Builder getMinecraftVersionBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return this.getMinecraftVersionFieldBuilder().getBuilder();
         }

         @Override
         public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
            if (this.minecraftVersionBuilder_ != null) {
               return this.minecraftVersionBuilder_.getMessageOrBuilder();
            } else {
               return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
            }
         }

         private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getMinecraftVersionFieldBuilder() {
            if (this.minecraftVersionBuilder_ == null) {
               this.minecraftVersionBuilder_ = new SingleFieldBuilderV3<>(this.getMinecraftVersion(), this.getParentForChildren(), this.isClean());
               this.minecraftVersion_ = null;
            }

            return this.minecraftVersionBuilder_;
         }

         @Override
         public int getJoinabilityValue() {
            return this.joinability_;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setJoinabilityValue(int var1) {
            this.joinability_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         @Override
         public Joinability getJoinability() {
            Joinability var1 = Joinability.forNumber(this.joinability_);
            return var1 == null ? Joinability.UNRECOGNIZED : var1;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setJoinability(Joinability var1) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.bitField0_ |= 4;
            this.joinability_ = var1.getNumber();
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearJoinability() {
            this.bitField0_ &= -5;
            this.joinability_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getOnlinePlayers() {
            return this.onlinePlayers_;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setOnlinePlayers(int var1) {
            this.onlinePlayers_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearOnlinePlayers() {
            this.bitField0_ &= -9;
            this.onlinePlayers_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getMaxPlayers() {
            return this.maxPlayers_;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setMaxPlayers(int var1) {
            this.maxPlayers_ = var1;
            this.bitField0_ |= 16;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearMaxPlayers() {
            this.bitField0_ &= -17;
            this.maxPlayers_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSamplePlayersIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.samplePlayers_ = new ArrayList<>(this.samplePlayers_);
               this.bitField0_ |= 32;
            }
         }

         @Override
         public List<UuidAndUsername> getSamplePlayersList() {
            return this.samplePlayersBuilder_ == null ? Collections.unmodifiableList(this.samplePlayers_) : this.samplePlayersBuilder_.getMessageList();
         }

         @Override
         public int getSamplePlayersCount() {
            return this.samplePlayersBuilder_ == null ? this.samplePlayers_.size() : this.samplePlayersBuilder_.getCount();
         }

         @Override
         public UuidAndUsername getSamplePlayers(int var1) {
            return this.samplePlayersBuilder_ == null ? this.samplePlayers_.get(var1) : this.samplePlayersBuilder_.getMessage(var1);
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setSamplePlayers(int var1, UuidAndUsername var2) {
            if (this.samplePlayersBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.set(var1, var2);
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.setMessage(var1, var2);
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setSamplePlayers(int var1, UuidAndUsername.Builder var2) {
            if (this.samplePlayersBuilder_ == null) {
               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.set(var1, var2.build());
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.setMessage(var1, var2.build());
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder addSamplePlayers(UuidAndUsername var1) {
            if (this.samplePlayersBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.add(var1);
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.addMessage(var1);
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder addSamplePlayers(int var1, UuidAndUsername var2) {
            if (this.samplePlayersBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.add(var1, var2);
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.addMessage(var1, var2);
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder addSamplePlayers(UuidAndUsername.Builder var1) {
            if (this.samplePlayersBuilder_ == null) {
               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.add(var1.build());
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.addMessage(var1.build());
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder addSamplePlayers(int var1, UuidAndUsername.Builder var2) {
            if (this.samplePlayersBuilder_ == null) {
               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.add(var1, var2.build());
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.addMessage(var1, var2.build());
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder addAllSamplePlayers(Iterable<? extends UuidAndUsername> var1) {
            if (this.samplePlayersBuilder_ == null) {
               this.ensureSamplePlayersIsMutable();
               AbstractMessageLite.Builder.addAll(var1, this.samplePlayers_);
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.addAllMessages(var1);
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearSamplePlayers() {
            if (this.samplePlayersBuilder_ == null) {
               this.samplePlayers_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.clear();
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder removeSamplePlayers(int var1) {
            if (this.samplePlayersBuilder_ == null) {
               this.ensureSamplePlayersIsMutable();
               this.samplePlayers_.remove(var1);
               this.onChanged();
            } else {
               this.samplePlayersBuilder_.remove(var1);
            }

            return this;
         }

         public UuidAndUsername.Builder getSamplePlayersBuilder(int var1) {
            return this.getSamplePlayersFieldBuilder().getBuilder(var1);
         }

         @Override
         public UuidAndUsernameOrBuilder getSamplePlayersOrBuilder(int var1) {
            return this.samplePlayersBuilder_ == null ? this.samplePlayers_.get(var1) : this.samplePlayersBuilder_.getMessageOrBuilder(var1);
         }

         @Override
         public List<? extends UuidAndUsernameOrBuilder> getSamplePlayersOrBuilderList() {
            return this.samplePlayersBuilder_ != null
               ? this.samplePlayersBuilder_.getMessageOrBuilderList()
               : Collections.unmodifiableList(this.samplePlayers_);
         }

         public UuidAndUsername.Builder addSamplePlayersBuilder() {
            return this.getSamplePlayersFieldBuilder().addBuilder(UuidAndUsername.getDefaultInstance());
         }

         public UuidAndUsername.Builder addSamplePlayersBuilder(int var1) {
            return this.getSamplePlayersFieldBuilder().addBuilder(var1, UuidAndUsername.getDefaultInstance());
         }

         public List<UuidAndUsername.Builder> getSamplePlayersBuilderList() {
            return this.getSamplePlayersFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getSamplePlayersFieldBuilder() {
            if (this.samplePlayersBuilder_ == null) {
               this.samplePlayersBuilder_ = new RepeatedFieldBuilderV3<>(
                  this.samplePlayers_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean()
               );
               this.samplePlayers_ = null;
            }

            return this.samplePlayersBuilder_;
         }

         @Override
         public boolean getLunarPlusBoost() {
            return this.lunarPlusBoost_;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setLunarPlusBoost(boolean var1) {
            this.lunarPlusBoost_ = var1;
            this.bitField0_ |= 64;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearLunarPlusBoost() {
            this.bitField0_ &= -65;
            this.lunarPlusBoost_ = false;
            this.onChanged();
            return this;
         }

         @Override
         public boolean hasLogoColor() {
            return (this.bitField0_ & 128) != 0;
         }

         @Override
         public Color getLogoColor() {
            if (this.logoColorBuilder_ == null) {
               return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
            } else {
               return this.logoColorBuilder_.getMessage();
            }
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setLogoColor(Color var1) {
            if (this.logoColorBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.logoColor_ = var1;
            } else {
               this.logoColorBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 128;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setLogoColor(Color.Builder var1) {
            if (this.logoColorBuilder_ == null) {
               this.logoColor_ = var1.build();
            } else {
               this.logoColorBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 128;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergeLogoColor(Color var1) {
            if (this.logoColorBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
                  this.getLogoColorBuilder().mergeFrom(var1);
               } else {
                  this.logoColor_ = var1;
               }
            } else {
               this.logoColorBuilder_.mergeFrom(var1);
            }

            if (this.logoColor_ != null) {
               this.bitField0_ |= 128;
               this.onChanged();
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearLogoColor() {
            this.bitField0_ &= -129;
            this.logoColor_ = null;
            if (this.logoColorBuilder_ != null) {
               this.logoColorBuilder_.dispose();
               this.logoColorBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Color.Builder getLogoColorBuilder() {
            this.bitField0_ |= 128;
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
            return (this.bitField0_ & 256) != 0;
         }

         @Override
         public Color getPlusColor() {
            if (this.plusColorBuilder_ == null) {
               return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
            } else {
               return this.plusColorBuilder_.getMessage();
            }
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setPlusColor(Color var1) {
            if (this.plusColorBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.plusColor_ = var1;
            } else {
               this.plusColorBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 256;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder setPlusColor(Color.Builder var1) {
            if (this.plusColorBuilder_ == null) {
               this.plusColor_ = var1.build();
            } else {
               this.plusColorBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 256;
            this.onChanged();
            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder mergePlusColor(Color var1) {
            if (this.plusColorBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
                  this.getPlusColorBuilder().mergeFrom(var1);
               } else {
                  this.plusColor_ = var1;
               }
            } else {
               this.plusColorBuilder_.mergeFrom(var1);
            }

            if (this.plusColor_ != null) {
               this.bitField0_ |= 256;
               this.onChanged();
            }

            return this;
         }

         public ListHostedWorldsResponse.HostedWorld.Builder clearPlusColor() {
            this.bitField0_ &= -257;
            this.plusColor_ = null;
            if (this.plusColorBuilder_ != null) {
               this.plusColorBuilder_.dispose();
               this.plusColorBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public Color.Builder getPlusColorBuilder() {
            this.bitField0_ |= 256;
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

         public final ListHostedWorldsResponse.HostedWorld.Builder setUnknownFields(UnknownFieldSet var1) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.setUnknownFields(var1);
         }

         public final ListHostedWorldsResponse.HostedWorld.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (ListHostedWorldsResponse.HostedWorld.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface HostedWorldOrBuilder extends MessageOrBuilder {
      boolean hasHost();

      UuidAndUsername getHost();

      UuidAndUsernameOrBuilder getHostOrBuilder();

      boolean hasMinecraftVersion();

      MinecraftVersion getMinecraftVersion();

      MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

      int getJoinabilityValue();

      Joinability getJoinability();

      int getOnlinePlayers();

      int getMaxPlayers();

      List<UuidAndUsername> getSamplePlayersList();

      UuidAndUsername getSamplePlayers(int var1);

      int getSamplePlayersCount();

      List<? extends UuidAndUsernameOrBuilder> getSamplePlayersOrBuilderList();

      UuidAndUsernameOrBuilder getSamplePlayersOrBuilder(int var1);

      boolean getLunarPlusBoost();

      boolean hasLogoColor();

      Color getLogoColor();

      ColorOrBuilder getLogoColorOrBuilder();

      boolean hasPlusColor();

      Color getPlusColor();

      ColorOrBuilder getPlusColorOrBuilder();
   }
}
