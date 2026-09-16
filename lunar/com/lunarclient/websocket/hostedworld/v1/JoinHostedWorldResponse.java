package com.lunarclient.websocket.hostedworld.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class JoinHostedWorldResponse extends GeneratedMessageV3 implements JoinHostedWorldResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int RELAY_FIELD_NUMBER = 2;
   private AddressAndPort relay_;
   public static final int JOINABILITY_FIELD_NUMBER = 3;
   private int joinability_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final JoinHostedWorldResponse DEFAULT_INSTANCE = new JoinHostedWorldResponse();
   private static final Parser<JoinHostedWorldResponse> PARSER = new AbstractParser<JoinHostedWorldResponse>() {
      public JoinHostedWorldResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         JoinHostedWorldResponse.Builder var3 = JoinHostedWorldResponse.newBuilder();

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

   private JoinHostedWorldResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private JoinHostedWorldResponse() {
      this.status_ = 0;
      this.joinability_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new JoinHostedWorldResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(JoinHostedWorldResponse.class, JoinHostedWorldResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public JoinHostedWorldResponse.Status getStatus() {
      JoinHostedWorldResponse.Status var1 = JoinHostedWorldResponse.Status.forNumber(this.status_);
      return var1 == null ? JoinHostedWorldResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasRelay() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public AddressAndPort getRelay() {
      return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
   }

   @Override
   public AddressAndPortOrBuilder getRelayOrBuilder() {
      return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
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
      if (this.status_ != JoinHostedWorldResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getRelay());
      }

      if (this.joinability_ != Joinability.JOINABILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.joinability_);
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
      if (this.status_ != JoinHostedWorldResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getRelay());
      }

      if (this.joinability_ != Joinability.JOINABILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.joinability_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof JoinHostedWorldResponse)) {
         return super.equals(var1);
      } else {
         JoinHostedWorldResponse var2 = (JoinHostedWorldResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (this.hasRelay() != var2.hasRelay()) {
            return false;
         } else if (this.hasRelay() && !this.getRelay().equals(var2.getRelay())) {
            return false;
         } else {
            return this.joinability_ != var2.joinability_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasRelay()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRelay().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.joinability_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static JoinHostedWorldResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static JoinHostedWorldResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static JoinHostedWorldResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public JoinHostedWorldResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static JoinHostedWorldResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static JoinHostedWorldResponse.Builder newBuilder(JoinHostedWorldResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public JoinHostedWorldResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new JoinHostedWorldResponse.Builder() : new JoinHostedWorldResponse.Builder().mergeFrom(this);
   }

   protected JoinHostedWorldResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new JoinHostedWorldResponse.Builder(var1);
   }

   public static JoinHostedWorldResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<JoinHostedWorldResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<JoinHostedWorldResponse> getParserForType() {
      return PARSER;
   }

   public JoinHostedWorldResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<JoinHostedWorldResponse.Builder> implements JoinHostedWorldResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private AddressAndPort relay_;
      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> relayBuilder_;
      private int joinability_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(JoinHostedWorldResponse.class, JoinHostedWorldResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (JoinHostedWorldResponse.alwaysUseFieldBuilders) {
            this.getRelayFieldBuilder();
         }
      }

      public JoinHostedWorldResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.relay_ = null;
         if (this.relayBuilder_ != null) {
            this.relayBuilder_.dispose();
            this.relayBuilder_ = null;
         }

         this.joinability_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldResponse_descriptor;
      }

      public JoinHostedWorldResponse getDefaultInstanceForType() {
         return JoinHostedWorldResponse.getDefaultInstance();
      }

      public JoinHostedWorldResponse build() {
         JoinHostedWorldResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public JoinHostedWorldResponse buildPartial() {
         JoinHostedWorldResponse var1 = new JoinHostedWorldResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(JoinHostedWorldResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.relay_ = this.relayBuilder_ == null ? this.relay_ : this.relayBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.joinability_ = this.joinability_;
         }

         JoinHostedWorldResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public JoinHostedWorldResponse.Builder clone() {
         return (JoinHostedWorldResponse.Builder)super.clone();
      }

      public JoinHostedWorldResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinHostedWorldResponse.Builder)super.setField(var1, var2);
      }

      public JoinHostedWorldResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (JoinHostedWorldResponse.Builder)super.clearField(var1);
      }

      public JoinHostedWorldResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (JoinHostedWorldResponse.Builder)super.clearOneof(var1);
      }

      public JoinHostedWorldResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (JoinHostedWorldResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public JoinHostedWorldResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinHostedWorldResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public JoinHostedWorldResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof JoinHostedWorldResponse) {
            return this.mergeFrom((JoinHostedWorldResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public JoinHostedWorldResponse.Builder mergeFrom(JoinHostedWorldResponse var1) {
         if (var1 == JoinHostedWorldResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.hasRelay()) {
            this.mergeRelay(var1.getRelay());
         }

         if (var1.joinability_ != 0) {
            this.setJoinabilityValue(var1.getJoinabilityValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public JoinHostedWorldResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getRelayFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.joinability_ = var1.readEnum();
                     this.bitField0_ |= 4;
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
      public int getStatusValue() {
         return this.status_;
      }

      public JoinHostedWorldResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public JoinHostedWorldResponse.Status getStatus() {
         JoinHostedWorldResponse.Status var1 = JoinHostedWorldResponse.Status.forNumber(this.status_);
         return var1 == null ? JoinHostedWorldResponse.Status.UNRECOGNIZED : var1;
      }

      public JoinHostedWorldResponse.Builder setStatus(JoinHostedWorldResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public JoinHostedWorldResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasRelay() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public AddressAndPort getRelay() {
         if (this.relayBuilder_ == null) {
            return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
         } else {
            return this.relayBuilder_.getMessage();
         }
      }

      public JoinHostedWorldResponse.Builder setRelay(AddressAndPort var1) {
         if (this.relayBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.relay_ = var1;
         } else {
            this.relayBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldResponse.Builder setRelay(AddressAndPort.Builder var1) {
         if (this.relayBuilder_ == null) {
            this.relay_ = var1.build();
         } else {
            this.relayBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldResponse.Builder mergeRelay(AddressAndPort var1) {
         if (this.relayBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.relay_ != null && this.relay_ != AddressAndPort.getDefaultInstance()) {
               this.getRelayBuilder().mergeFrom(var1);
            } else {
               this.relay_ = var1;
            }
         } else {
            this.relayBuilder_.mergeFrom(var1);
         }

         if (this.relay_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public JoinHostedWorldResponse.Builder clearRelay() {
         this.bitField0_ &= -3;
         this.relay_ = null;
         if (this.relayBuilder_ != null) {
            this.relayBuilder_.dispose();
            this.relayBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder getRelayBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getRelayFieldBuilder().getBuilder();
      }

      @Override
      public AddressAndPortOrBuilder getRelayOrBuilder() {
         if (this.relayBuilder_ != null) {
            return this.relayBuilder_.getMessageOrBuilder();
         } else {
            return this.relay_ == null ? AddressAndPort.getDefaultInstance() : this.relay_;
         }
      }

      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getRelayFieldBuilder() {
         if (this.relayBuilder_ == null) {
            this.relayBuilder_ = new SingleFieldBuilderV3<>(this.getRelay(), this.getParentForChildren(), this.isClean());
            this.relay_ = null;
         }

         return this.relayBuilder_;
      }

      @Override
      public int getJoinabilityValue() {
         return this.joinability_;
      }

      public JoinHostedWorldResponse.Builder setJoinabilityValue(int var1) {
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

      public JoinHostedWorldResponse.Builder setJoinability(Joinability var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.joinability_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public JoinHostedWorldResponse.Builder clearJoinability() {
         this.bitField0_ &= -5;
         this.joinability_ = 0;
         this.onChanged();
         return this;
      }

      public final JoinHostedWorldResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (JoinHostedWorldResponse.Builder)super.setUnknownFields(var1);
      }

      public final JoinHostedWorldResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (JoinHostedWorldResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_NO_ACCESS(2),
      STATUS_NOT_JOINABLE(3),
      STATUS_JOINING_DISABLED(4),
      STATUS_NO_RELAY(5),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_NO_ACCESS_VALUE = 2;
      public static final int STATUS_NOT_JOINABLE_VALUE = 3;
      public static final int STATUS_JOINING_DISABLED_VALUE = 4;
      public static final int STATUS_NO_RELAY_VALUE = 5;
      private static final Internal.EnumLiteMap<JoinHostedWorldResponse.Status> internalValueMap = new Internal.EnumLiteMap<JoinHostedWorldResponse.Status>() {
         public JoinHostedWorldResponse.Status findValueByNumber(int var1) {
            return JoinHostedWorldResponse.Status.forNumber(var1);
         }
      };
      private static final JoinHostedWorldResponse.Status[] VALUES = values();
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
      public static JoinHostedWorldResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static JoinHostedWorldResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_NO_ACCESS;
            case 3:
               return STATUS_NOT_JOINABLE;
            case 4:
               return STATUS_JOINING_DISABLED;
            case 5:
               return STATUS_NO_RELAY;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<JoinHostedWorldResponse.Status> internalGetValueMap() {
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
         return JoinHostedWorldResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static JoinHostedWorldResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
