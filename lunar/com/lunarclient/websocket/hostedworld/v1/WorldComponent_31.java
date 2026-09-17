package com.lunarclient.websocket.hostedworld.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PreJoinHostedWorldResponse extends GeneratedMessageV3 implements PreJoinHostedWorldResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RELAYS_TO_PING_FIELD_NUMBER = 1;
   private List<AddressAndPort> relaysToPing_;
   private byte memoizedIsInitialized = -1;
   private static final PreJoinHostedWorldResponse DEFAULT_INSTANCE = new PreJoinHostedWorldResponse();
   private static final Parser<PreJoinHostedWorldResponse> PARSER = new AbstractParser<PreJoinHostedWorldResponse>() {
      public PreJoinHostedWorldResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PreJoinHostedWorldResponse.Builder var3 = PreJoinHostedWorldResponse.newBuilder();

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

   private PreJoinHostedWorldResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PreJoinHostedWorldResponse() {
      this.relaysToPing_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PreJoinHostedWorldResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PreJoinHostedWorldResponse.class, PreJoinHostedWorldResponse.Builder.class);
   }

   @Override
   public List<AddressAndPort> getRelaysToPingList() {
      return this.relaysToPing_;
   }

   @Override
   public List<? extends AddressAndPortOrBuilder> getRelaysToPingOrBuilderList() {
      return this.relaysToPing_;
   }

   @Override
   public int getRelaysToPingCount() {
      return this.relaysToPing_.size();
   }

   @Override
   public AddressAndPort getRelaysToPing(int var1) {
      return this.relaysToPing_.get(var1);
   }

   @Override
   public AddressAndPortOrBuilder getRelaysToPingOrBuilder(int var1) {
      return this.relaysToPing_.get(var1);
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
      for (int var2 = 0; var2 < this.relaysToPing_.size(); var2++) {
         var1.writeMessage(1, this.relaysToPing_.get(var2));
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

      for (int var2 = 0; var2 < this.relaysToPing_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.relaysToPing_.get(var2));
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

      if (!(var1 instanceof PreJoinHostedWorldResponse)) {
         return super.equals(var1);
      }

      PreJoinHostedWorldResponse var2 = (PreJoinHostedWorldResponse)var1;
      return !this.getRelaysToPingList().equals(var2.getRelaysToPingList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getRelaysToPingCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getRelaysToPingList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PreJoinHostedWorldResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PreJoinHostedWorldResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PreJoinHostedWorldResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PreJoinHostedWorldResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PreJoinHostedWorldResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PreJoinHostedWorldResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PreJoinHostedWorldResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PreJoinHostedWorldResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PreJoinHostedWorldResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PreJoinHostedWorldResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PreJoinHostedWorldResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PreJoinHostedWorldResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PreJoinHostedWorldResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PreJoinHostedWorldResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PreJoinHostedWorldResponse.Builder newBuilder(PreJoinHostedWorldResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PreJoinHostedWorldResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PreJoinHostedWorldResponse.Builder() : new PreJoinHostedWorldResponse.Builder().mergeFrom(this);
   }

   protected PreJoinHostedWorldResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PreJoinHostedWorldResponse.Builder(var1);
   }

   public static PreJoinHostedWorldResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PreJoinHostedWorldResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<PreJoinHostedWorldResponse> getParserForType() {
      return PARSER;
   }

   public PreJoinHostedWorldResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PreJoinHostedWorldResponse.Builder> implements PreJoinHostedWorldResponseOrBuilder {
      private int bitField0_;
      private List<AddressAndPort> relaysToPing_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> relaysToPingBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PreJoinHostedWorldResponse.class, PreJoinHostedWorldResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PreJoinHostedWorldResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.relaysToPingBuilder_ == null) {
            this.relaysToPing_ = Collections.emptyList();
         } else {
            this.relaysToPing_ = null;
            this.relaysToPingBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_PreJoinHostedWorldResponse_descriptor;
      }

      public PreJoinHostedWorldResponse getDefaultInstanceForType() {
         return PreJoinHostedWorldResponse.getDefaultInstance();
      }

      public PreJoinHostedWorldResponse build() {
         PreJoinHostedWorldResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PreJoinHostedWorldResponse buildPartial() {
         PreJoinHostedWorldResponse var1 = new PreJoinHostedWorldResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PreJoinHostedWorldResponse var1) {
         if (this.relaysToPingBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.relaysToPing_ = Collections.unmodifiableList(this.relaysToPing_);
               this.bitField0_ &= -2;
            }

            var1.relaysToPing_ = this.relaysToPing_;
         } else {
            var1.relaysToPing_ = this.relaysToPingBuilder_.build();
         }
      }

      private void buildPartial0(PreJoinHostedWorldResponse var1) {
         int var2 = this.bitField0_;
      }

      public PreJoinHostedWorldResponse.Builder clone() {
         return (PreJoinHostedWorldResponse.Builder)super.clone();
      }

      public PreJoinHostedWorldResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PreJoinHostedWorldResponse.Builder)super.setField(var1, var2);
      }

      public PreJoinHostedWorldResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PreJoinHostedWorldResponse.Builder)super.clearField(var1);
      }

      public PreJoinHostedWorldResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PreJoinHostedWorldResponse.Builder)super.clearOneof(var1);
      }

      public PreJoinHostedWorldResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PreJoinHostedWorldResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PreJoinHostedWorldResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PreJoinHostedWorldResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public PreJoinHostedWorldResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof PreJoinHostedWorldResponse) {
            return this.mergeFrom((PreJoinHostedWorldResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PreJoinHostedWorldResponse.Builder mergeFrom(PreJoinHostedWorldResponse var1) {
         if (var1 == PreJoinHostedWorldResponse.getDefaultInstance()) {
            return this;
         }

         if (this.relaysToPingBuilder_ == null) {
            if (!var1.relaysToPing_.isEmpty()) {
               if (this.relaysToPing_.isEmpty()) {
                  this.relaysToPing_ = var1.relaysToPing_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureRelaysToPingIsMutable();
                  this.relaysToPing_.addAll(var1.relaysToPing_);
               }

               this.onChanged();
            }
         } else if (!var1.relaysToPing_.isEmpty()) {
            if (this.relaysToPingBuilder_.isEmpty()) {
               this.relaysToPingBuilder_.dispose();
               this.relaysToPingBuilder_ = null;
               this.relaysToPing_ = var1.relaysToPing_;
               this.bitField0_ &= -2;
               this.relaysToPingBuilder_ = PreJoinHostedWorldResponse.alwaysUseFieldBuilders ? this.getRelaysToPingFieldBuilder() : null;
            } else {
               this.relaysToPingBuilder_.addAllMessages(var1.relaysToPing_);
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

      public PreJoinHostedWorldResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     AddressAndPort var5 = var1.readMessage(AddressAndPort.parser(), var2);
                     if (this.relaysToPingBuilder_ == null) {
                        this.ensureRelaysToPingIsMutable();
                        this.relaysToPing_.add(var5);
                     } else {
                        this.relaysToPingBuilder_.addMessage(var5);
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

      private void ensureRelaysToPingIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.relaysToPing_ = new ArrayList<>(this.relaysToPing_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<AddressAndPort> getRelaysToPingList() {
         return this.relaysToPingBuilder_ == null ? Collections.unmodifiableList(this.relaysToPing_) : this.relaysToPingBuilder_.getMessageList();
      }

      @Override
      public int getRelaysToPingCount() {
         return this.relaysToPingBuilder_ == null ? this.relaysToPing_.size() : this.relaysToPingBuilder_.getCount();
      }

      @Override
      public AddressAndPort getRelaysToPing(int var1) {
         return this.relaysToPingBuilder_ == null ? this.relaysToPing_.get(var1) : this.relaysToPingBuilder_.getMessage(var1);
      }

      public PreJoinHostedWorldResponse.Builder setRelaysToPing(int var1, AddressAndPort var2) {
         if (this.relaysToPingBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.set(var1, var2);
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder setRelaysToPing(int var1, AddressAndPort.Builder var2) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder addRelaysToPing(AddressAndPort var1) {
         if (this.relaysToPingBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.add(var1);
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addMessage(var1);
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder addRelaysToPing(int var1, AddressAndPort var2) {
         if (this.relaysToPingBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.add(var1, var2);
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder addRelaysToPing(AddressAndPort.Builder var1) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.add(var1.build());
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder addRelaysToPing(int var1, AddressAndPort.Builder var2) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder addAllRelaysToPing(Iterable<? extends AddressAndPort> var1) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.relaysToPing_);
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder clearRelaysToPing() {
         if (this.relaysToPingBuilder_ == null) {
            this.relaysToPing_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.clear();
         }

         return this;
      }

      public PreJoinHostedWorldResponse.Builder removeRelaysToPing(int var1) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.remove(var1);
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.remove(var1);
         }

         return this;
      }

      public AddressAndPort.Builder getRelaysToPingBuilder(int var1) {
         return this.getRelaysToPingFieldBuilder().getBuilder(var1);
      }

      @Override
      public AddressAndPortOrBuilder getRelaysToPingOrBuilder(int var1) {
         return this.relaysToPingBuilder_ == null ? this.relaysToPing_.get(var1) : this.relaysToPingBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends AddressAndPortOrBuilder> getRelaysToPingOrBuilderList() {
         return this.relaysToPingBuilder_ != null ? this.relaysToPingBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.relaysToPing_);
      }

      public AddressAndPort.Builder addRelaysToPingBuilder() {
         return this.getRelaysToPingFieldBuilder().addBuilder(AddressAndPort.getDefaultInstance());
      }

      public AddressAndPort.Builder addRelaysToPingBuilder(int var1) {
         return this.getRelaysToPingFieldBuilder().addBuilder(var1, AddressAndPort.getDefaultInstance());
      }

      public List<AddressAndPort.Builder> getRelaysToPingBuilderList() {
         return this.getRelaysToPingFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getRelaysToPingFieldBuilder() {
         if (this.relaysToPingBuilder_ == null) {
            this.relaysToPingBuilder_ = new RepeatedFieldBuilderV3<>(
               this.relaysToPing_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.relaysToPing_ = null;
         }

         return this.relaysToPingBuilder_;
      }

      public final PreJoinHostedWorldResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PreJoinHostedWorldResponse.Builder)super.setUnknownFields(var1);
      }

      public final PreJoinHostedWorldResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PreJoinHostedWorldResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
