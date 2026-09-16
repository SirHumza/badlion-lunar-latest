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
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HostedWorldHeartbeatResponse extends GeneratedMessageV3 implements HostedWorldHeartbeatResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int RELAYS_TO_PING_FIELD_NUMBER = 2;
   private List<AddressAndPort> relaysToPing_;
   private byte memoizedIsInitialized = -1;
   private static final HostedWorldHeartbeatResponse DEFAULT_INSTANCE = new HostedWorldHeartbeatResponse();
   private static final Parser<HostedWorldHeartbeatResponse> PARSER = new AbstractParser<HostedWorldHeartbeatResponse>() {
      public HostedWorldHeartbeatResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HostedWorldHeartbeatResponse.Builder var3 = HostedWorldHeartbeatResponse.newBuilder();

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

   private HostedWorldHeartbeatResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HostedWorldHeartbeatResponse() {
      this.status_ = 0;
      this.relaysToPing_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HostedWorldHeartbeatResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HostedWorldHeartbeatResponse.class, HostedWorldHeartbeatResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public HostedWorldHeartbeatResponse.Status getStatus() {
      HostedWorldHeartbeatResponse.Status var1 = HostedWorldHeartbeatResponse.Status.forNumber(this.status_);
      return var1 == null ? HostedWorldHeartbeatResponse.Status.UNRECOGNIZED : var1;
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
      if (this.status_ != HostedWorldHeartbeatResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      for (int var2 = 0; var2 < this.relaysToPing_.size(); var2++) {
         var1.writeMessage(2, this.relaysToPing_.get(var2));
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
      if (this.status_ != HostedWorldHeartbeatResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      for (int var2 = 0; var2 < this.relaysToPing_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.relaysToPing_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HostedWorldHeartbeatResponse)) {
         return super.equals(var1);
      } else {
         HostedWorldHeartbeatResponse var2 = (HostedWorldHeartbeatResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return !this.getRelaysToPingList().equals(var2.getRelaysToPingList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.status_;
      if (this.getRelaysToPingCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRelaysToPingList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HostedWorldHeartbeatResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldHeartbeatResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldHeartbeatResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldHeartbeatResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldHeartbeatResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HostedWorldHeartbeatResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HostedWorldHeartbeatResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldHeartbeatResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldHeartbeatResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HostedWorldHeartbeatResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HostedWorldHeartbeatResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HostedWorldHeartbeatResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HostedWorldHeartbeatResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HostedWorldHeartbeatResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HostedWorldHeartbeatResponse.Builder newBuilder(HostedWorldHeartbeatResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HostedWorldHeartbeatResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HostedWorldHeartbeatResponse.Builder() : new HostedWorldHeartbeatResponse.Builder().mergeFrom(this);
   }

   protected HostedWorldHeartbeatResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HostedWorldHeartbeatResponse.Builder(var1);
   }

   public static HostedWorldHeartbeatResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HostedWorldHeartbeatResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<HostedWorldHeartbeatResponse> getParserForType() {
      return PARSER;
   }

   public HostedWorldHeartbeatResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HostedWorldHeartbeatResponse.Builder> implements HostedWorldHeartbeatResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private List<AddressAndPort> relaysToPing_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> relaysToPingBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HostedWorldHeartbeatResponse.class, HostedWorldHeartbeatResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public HostedWorldHeartbeatResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         if (this.relaysToPingBuilder_ == null) {
            this.relaysToPing_ = Collections.emptyList();
         } else {
            this.relaysToPing_ = null;
            this.relaysToPingBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_HostedWorldHeartbeatResponse_descriptor;
      }

      public HostedWorldHeartbeatResponse getDefaultInstanceForType() {
         return HostedWorldHeartbeatResponse.getDefaultInstance();
      }

      public HostedWorldHeartbeatResponse build() {
         HostedWorldHeartbeatResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HostedWorldHeartbeatResponse buildPartial() {
         HostedWorldHeartbeatResponse var1 = new HostedWorldHeartbeatResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(HostedWorldHeartbeatResponse var1) {
         if (this.relaysToPingBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.relaysToPing_ = Collections.unmodifiableList(this.relaysToPing_);
               this.bitField0_ &= -3;
            }

            var1.relaysToPing_ = this.relaysToPing_;
         } else {
            var1.relaysToPing_ = this.relaysToPingBuilder_.build();
         }
      }

      private void buildPartial0(HostedWorldHeartbeatResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }
      }

      public HostedWorldHeartbeatResponse.Builder clone() {
         return (HostedWorldHeartbeatResponse.Builder)super.clone();
      }

      public HostedWorldHeartbeatResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldHeartbeatResponse.Builder)super.setField(var1, var2);
      }

      public HostedWorldHeartbeatResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HostedWorldHeartbeatResponse.Builder)super.clearField(var1);
      }

      public HostedWorldHeartbeatResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HostedWorldHeartbeatResponse.Builder)super.clearOneof(var1);
      }

      public HostedWorldHeartbeatResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HostedWorldHeartbeatResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HostedWorldHeartbeatResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HostedWorldHeartbeatResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public HostedWorldHeartbeatResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof HostedWorldHeartbeatResponse) {
            return this.mergeFrom((HostedWorldHeartbeatResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HostedWorldHeartbeatResponse.Builder mergeFrom(HostedWorldHeartbeatResponse var1) {
         if (var1 == HostedWorldHeartbeatResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (this.relaysToPingBuilder_ == null) {
            if (!var1.relaysToPing_.isEmpty()) {
               if (this.relaysToPing_.isEmpty()) {
                  this.relaysToPing_ = var1.relaysToPing_;
                  this.bitField0_ &= -3;
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
               this.bitField0_ &= -3;
               this.relaysToPingBuilder_ = HostedWorldHeartbeatResponse.alwaysUseFieldBuilders ? this.getRelaysToPingFieldBuilder() : null;
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

      public HostedWorldHeartbeatResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
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

      @Override
      public int getStatusValue() {
         return this.status_;
      }

      public HostedWorldHeartbeatResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public HostedWorldHeartbeatResponse.Status getStatus() {
         HostedWorldHeartbeatResponse.Status var1 = HostedWorldHeartbeatResponse.Status.forNumber(this.status_);
         return var1 == null ? HostedWorldHeartbeatResponse.Status.UNRECOGNIZED : var1;
      }

      public HostedWorldHeartbeatResponse.Builder setStatus(HostedWorldHeartbeatResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public HostedWorldHeartbeatResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureRelaysToPingIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.relaysToPing_ = new ArrayList<>(this.relaysToPing_);
            this.bitField0_ |= 2;
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

      public HostedWorldHeartbeatResponse.Builder setRelaysToPing(int var1, AddressAndPort var2) {
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

      public HostedWorldHeartbeatResponse.Builder setRelaysToPing(int var1, AddressAndPort.Builder var2) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public HostedWorldHeartbeatResponse.Builder addRelaysToPing(AddressAndPort var1) {
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

      public HostedWorldHeartbeatResponse.Builder addRelaysToPing(int var1, AddressAndPort var2) {
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

      public HostedWorldHeartbeatResponse.Builder addRelaysToPing(AddressAndPort.Builder var1) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.add(var1.build());
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public HostedWorldHeartbeatResponse.Builder addRelaysToPing(int var1, AddressAndPort.Builder var2) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            this.relaysToPing_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public HostedWorldHeartbeatResponse.Builder addAllRelaysToPing(Iterable<? extends AddressAndPort> var1) {
         if (this.relaysToPingBuilder_ == null) {
            this.ensureRelaysToPingIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.relaysToPing_);
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public HostedWorldHeartbeatResponse.Builder clearRelaysToPing() {
         if (this.relaysToPingBuilder_ == null) {
            this.relaysToPing_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.relaysToPingBuilder_.clear();
         }

         return this;
      }

      public HostedWorldHeartbeatResponse.Builder removeRelaysToPing(int var1) {
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
               this.relaysToPing_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.relaysToPing_ = null;
         }

         return this.relaysToPingBuilder_;
      }

      public final HostedWorldHeartbeatResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldHeartbeatResponse.Builder)super.setUnknownFields(var1);
      }

      public final HostedWorldHeartbeatResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HostedWorldHeartbeatResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_NOT_HOSTING_WORLD(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_NOT_HOSTING_WORLD_VALUE = 2;
      private static final Internal.EnumLiteMap<HostedWorldHeartbeatResponse.Status> internalValueMap = new Internal.EnumLiteMap<HostedWorldHeartbeatResponse.Status>() {
         public HostedWorldHeartbeatResponse.Status findValueByNumber(int var1) {
            return HostedWorldHeartbeatResponse.Status.forNumber(var1);
         }
      };
      private static final HostedWorldHeartbeatResponse.Status[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static HostedWorldHeartbeatResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static HostedWorldHeartbeatResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_NOT_HOSTING_WORLD;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<HostedWorldHeartbeatResponse.Status> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return HostedWorldHeartbeatResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static HostedWorldHeartbeatResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
