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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class JoinHostedWorldRequest extends GeneratedMessageV3 implements JoinHostedWorldRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int WORLD_HOST_UUID_FIELD_NUMBER = 1;
   private Uuid worldHostUuid_;
   public static final int PING_RESPONSES_FIELD_NUMBER = 2;
   private List<PingResponse> pingResponses_;
   public static final int SOURCE_FIELD_NUMBER = 3;
   private int source_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final JoinHostedWorldRequest DEFAULT_INSTANCE = new JoinHostedWorldRequest();
   private static final Parser<JoinHostedWorldRequest> PARSER = new AbstractParser<JoinHostedWorldRequest>() {
      public JoinHostedWorldRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         JoinHostedWorldRequest.Builder var3 = JoinHostedWorldRequest.newBuilder();

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

   private JoinHostedWorldRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private JoinHostedWorldRequest() {
      this.pingResponses_ = Collections.emptyList();
      this.source_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new JoinHostedWorldRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(JoinHostedWorldRequest.class, JoinHostedWorldRequest.Builder.class);
   }

   @Override
   public boolean hasWorldHostUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getWorldHostUuid() {
      return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
   }

   @Override
   public UuidOrBuilder getWorldHostUuidOrBuilder() {
      return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
   }

   @Override
   public List<PingResponse> getPingResponsesList() {
      return this.pingResponses_;
   }

   @Override
   public List<? extends PingResponseOrBuilder> getPingResponsesOrBuilderList() {
      return this.pingResponses_;
   }

   @Override
   public int getPingResponsesCount() {
      return this.pingResponses_.size();
   }

   @Override
   public PingResponse getPingResponses(int var1) {
      return this.pingResponses_.get(var1);
   }

   @Override
   public PingResponseOrBuilder getPingResponsesOrBuilder(int var1) {
      return this.pingResponses_.get(var1);
   }

   @Override
   public int getSourceValue() {
      return this.source_;
   }

   @Override
   public JoinHostedWorldRequest.Source getSource() {
      JoinHostedWorldRequest.Source var1 = JoinHostedWorldRequest.Source.forNumber(this.source_);
      return var1 == null ? JoinHostedWorldRequest.Source.UNRECOGNIZED : var1;
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
         var1.writeMessage(1, this.getWorldHostUuid());
      }

      for (int var2 = 0; var2 < this.pingResponses_.size(); var2++) {
         var1.writeMessage(2, this.pingResponses_.get(var2));
      }

      if (this.source_ != JoinHostedWorldRequest.Source.SOURCE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.source_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getWorldHostUuid());
      }

      for (int var2 = 0; var2 < this.pingResponses_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.pingResponses_.get(var2));
      }

      if (this.source_ != JoinHostedWorldRequest.Source.SOURCE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.source_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof JoinHostedWorldRequest)) {
         return super.equals(var1);
      } else {
         JoinHostedWorldRequest var2 = (JoinHostedWorldRequest)var1;
         if (this.hasWorldHostUuid() != var2.hasWorldHostUuid()) {
            return false;
         } else if (this.hasWorldHostUuid() && !this.getWorldHostUuid().equals(var2.getWorldHostUuid())) {
            return false;
         } else if (!this.getPingResponsesList().equals(var2.getPingResponsesList())) {
            return false;
         } else {
            return this.source_ != var2.source_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasWorldHostUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getWorldHostUuid().hashCode();
      }

      if (this.getPingResponsesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPingResponsesList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.source_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static JoinHostedWorldRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinHostedWorldRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinHostedWorldRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static JoinHostedWorldRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static JoinHostedWorldRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinHostedWorldRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public JoinHostedWorldRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static JoinHostedWorldRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static JoinHostedWorldRequest.Builder newBuilder(JoinHostedWorldRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public JoinHostedWorldRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new JoinHostedWorldRequest.Builder() : new JoinHostedWorldRequest.Builder().mergeFrom(this);
   }

   protected JoinHostedWorldRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new JoinHostedWorldRequest.Builder(var1);
   }

   public static JoinHostedWorldRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<JoinHostedWorldRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<JoinHostedWorldRequest> getParserForType() {
      return PARSER;
   }

   public JoinHostedWorldRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<JoinHostedWorldRequest.Builder> implements JoinHostedWorldRequestOrBuilder {
      private int bitField0_;
      private Uuid worldHostUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> worldHostUuidBuilder_;
      private List<PingResponse> pingResponses_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PingResponse, PingResponse.Builder, PingResponseOrBuilder> pingResponsesBuilder_;
      private int source_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(JoinHostedWorldRequest.class, JoinHostedWorldRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (JoinHostedWorldRequest.alwaysUseFieldBuilders) {
            this.getWorldHostUuidFieldBuilder();
            this.getPingResponsesFieldBuilder();
         }
      }

      public JoinHostedWorldRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.worldHostUuid_ = null;
         if (this.worldHostUuidBuilder_ != null) {
            this.worldHostUuidBuilder_.dispose();
            this.worldHostUuidBuilder_ = null;
         }

         if (this.pingResponsesBuilder_ == null) {
            this.pingResponses_ = Collections.emptyList();
         } else {
            this.pingResponses_ = null;
            this.pingResponsesBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.source_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_JoinHostedWorldRequest_descriptor;
      }

      public JoinHostedWorldRequest getDefaultInstanceForType() {
         return JoinHostedWorldRequest.getDefaultInstance();
      }

      public JoinHostedWorldRequest build() {
         JoinHostedWorldRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public JoinHostedWorldRequest buildPartial() {
         JoinHostedWorldRequest var1 = new JoinHostedWorldRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(JoinHostedWorldRequest var1) {
         if (this.pingResponsesBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.pingResponses_ = Collections.unmodifiableList(this.pingResponses_);
               this.bitField0_ &= -3;
            }

            var1.pingResponses_ = this.pingResponses_;
         } else {
            var1.pingResponses_ = this.pingResponsesBuilder_.build();
         }
      }

      private void buildPartial0(JoinHostedWorldRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.worldHostUuid_ = this.worldHostUuidBuilder_ == null ? this.worldHostUuid_ : this.worldHostUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.source_ = this.source_;
         }

         JoinHostedWorldRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public JoinHostedWorldRequest.Builder clone() {
         return (JoinHostedWorldRequest.Builder)super.clone();
      }

      public JoinHostedWorldRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinHostedWorldRequest.Builder)super.setField(var1, var2);
      }

      public JoinHostedWorldRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (JoinHostedWorldRequest.Builder)super.clearField(var1);
      }

      public JoinHostedWorldRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (JoinHostedWorldRequest.Builder)super.clearOneof(var1);
      }

      public JoinHostedWorldRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (JoinHostedWorldRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public JoinHostedWorldRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinHostedWorldRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public JoinHostedWorldRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof JoinHostedWorldRequest) {
            return this.mergeFrom((JoinHostedWorldRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public JoinHostedWorldRequest.Builder mergeFrom(JoinHostedWorldRequest var1) {
         if (var1 == JoinHostedWorldRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasWorldHostUuid()) {
            this.mergeWorldHostUuid(var1.getWorldHostUuid());
         }

         if (this.pingResponsesBuilder_ == null) {
            if (!var1.pingResponses_.isEmpty()) {
               if (this.pingResponses_.isEmpty()) {
                  this.pingResponses_ = var1.pingResponses_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensurePingResponsesIsMutable();
                  this.pingResponses_.addAll(var1.pingResponses_);
               }

               this.onChanged();
            }
         } else if (!var1.pingResponses_.isEmpty()) {
            if (this.pingResponsesBuilder_.isEmpty()) {
               this.pingResponsesBuilder_.dispose();
               this.pingResponsesBuilder_ = null;
               this.pingResponses_ = var1.pingResponses_;
               this.bitField0_ &= -3;
               this.pingResponsesBuilder_ = JoinHostedWorldRequest.alwaysUseFieldBuilders ? this.getPingResponsesFieldBuilder() : null;
            } else {
               this.pingResponsesBuilder_.addAllMessages(var1.pingResponses_);
            }
         }

         if (var1.source_ != 0) {
            this.setSourceValue(var1.getSourceValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public JoinHostedWorldRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getWorldHostUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     PingResponse var5 = var1.readMessage(PingResponse.parser(), var2);
                     if (this.pingResponsesBuilder_ == null) {
                        this.ensurePingResponsesIsMutable();
                        this.pingResponses_.add(var5);
                     } else {
                        this.pingResponsesBuilder_.addMessage(var5);
                     }
                     break;
                  case 24:
                     this.source_ = var1.readEnum();
                     this.bitField0_ |= 4;
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
      public boolean hasWorldHostUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getWorldHostUuid() {
         if (this.worldHostUuidBuilder_ == null) {
            return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
         } else {
            return this.worldHostUuidBuilder_.getMessage();
         }
      }

      public JoinHostedWorldRequest.Builder setWorldHostUuid(Uuid var1) {
         if (this.worldHostUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.worldHostUuid_ = var1;
         } else {
            this.worldHostUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldRequest.Builder setWorldHostUuid(Uuid.Builder var1) {
         if (this.worldHostUuidBuilder_ == null) {
            this.worldHostUuid_ = var1.build();
         } else {
            this.worldHostUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public JoinHostedWorldRequest.Builder mergeWorldHostUuid(Uuid var1) {
         if (this.worldHostUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.worldHostUuid_ != null && this.worldHostUuid_ != Uuid.getDefaultInstance()) {
               this.getWorldHostUuidBuilder().mergeFrom(var1);
            } else {
               this.worldHostUuid_ = var1;
            }
         } else {
            this.worldHostUuidBuilder_.mergeFrom(var1);
         }

         if (this.worldHostUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder clearWorldHostUuid() {
         this.bitField0_ &= -2;
         this.worldHostUuid_ = null;
         if (this.worldHostUuidBuilder_ != null) {
            this.worldHostUuidBuilder_.dispose();
            this.worldHostUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getWorldHostUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getWorldHostUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getWorldHostUuidOrBuilder() {
         if (this.worldHostUuidBuilder_ != null) {
            return this.worldHostUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.worldHostUuid_ == null ? Uuid.getDefaultInstance() : this.worldHostUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getWorldHostUuidFieldBuilder() {
         if (this.worldHostUuidBuilder_ == null) {
            this.worldHostUuidBuilder_ = new SingleFieldBuilderV3<>(this.getWorldHostUuid(), this.getParentForChildren(), this.isClean());
            this.worldHostUuid_ = null;
         }

         return this.worldHostUuidBuilder_;
      }

      private void ensurePingResponsesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.pingResponses_ = new ArrayList<>(this.pingResponses_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PingResponse> getPingResponsesList() {
         return this.pingResponsesBuilder_ == null ? Collections.unmodifiableList(this.pingResponses_) : this.pingResponsesBuilder_.getMessageList();
      }

      @Override
      public int getPingResponsesCount() {
         return this.pingResponsesBuilder_ == null ? this.pingResponses_.size() : this.pingResponsesBuilder_.getCount();
      }

      @Override
      public PingResponse getPingResponses(int var1) {
         return this.pingResponsesBuilder_ == null ? this.pingResponses_.get(var1) : this.pingResponsesBuilder_.getMessage(var1);
      }

      public JoinHostedWorldRequest.Builder setPingResponses(int var1, PingResponse var2) {
         if (this.pingResponsesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingResponsesIsMutable();
            this.pingResponses_.set(var1, var2);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder setPingResponses(int var1, PingResponse.Builder var2) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder addPingResponses(PingResponse var1) {
         if (this.pingResponsesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1);
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder addPingResponses(int var1, PingResponse var2) {
         if (this.pingResponsesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1, var2);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder addPingResponses(PingResponse.Builder var1) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1.build());
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder addPingResponses(int var1, PingResponse.Builder var2) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder addAllPingResponses(Iterable<? extends PingResponse> var1) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.pingResponses_);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder clearPingResponses() {
         if (this.pingResponsesBuilder_ == null) {
            this.pingResponses_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.clear();
         }

         return this;
      }

      public JoinHostedWorldRequest.Builder removePingResponses(int var1) {
         if (this.pingResponsesBuilder_ == null) {
            this.ensurePingResponsesIsMutable();
            this.pingResponses_.remove(var1);
            this.onChanged();
         } else {
            this.pingResponsesBuilder_.remove(var1);
         }

         return this;
      }

      public PingResponse.Builder getPingResponsesBuilder(int var1) {
         return this.getPingResponsesFieldBuilder().getBuilder(var1);
      }

      @Override
      public PingResponseOrBuilder getPingResponsesOrBuilder(int var1) {
         return this.pingResponsesBuilder_ == null ? this.pingResponses_.get(var1) : this.pingResponsesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PingResponseOrBuilder> getPingResponsesOrBuilderList() {
         return this.pingResponsesBuilder_ != null ? this.pingResponsesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.pingResponses_);
      }

      public PingResponse.Builder addPingResponsesBuilder() {
         return this.getPingResponsesFieldBuilder().addBuilder(PingResponse.getDefaultInstance());
      }

      public PingResponse.Builder addPingResponsesBuilder(int var1) {
         return this.getPingResponsesFieldBuilder().addBuilder(var1, PingResponse.getDefaultInstance());
      }

      public List<PingResponse.Builder> getPingResponsesBuilderList() {
         return this.getPingResponsesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PingResponse, PingResponse.Builder, PingResponseOrBuilder> getPingResponsesFieldBuilder() {
         if (this.pingResponsesBuilder_ == null) {
            this.pingResponsesBuilder_ = new RepeatedFieldBuilderV3<>(
               this.pingResponses_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.pingResponses_ = null;
         }

         return this.pingResponsesBuilder_;
      }

      @Override
      public int getSourceValue() {
         return this.source_;
      }

      public JoinHostedWorldRequest.Builder setSourceValue(int var1) {
         this.source_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public JoinHostedWorldRequest.Source getSource() {
         JoinHostedWorldRequest.Source var1 = JoinHostedWorldRequest.Source.forNumber(this.source_);
         return var1 == null ? JoinHostedWorldRequest.Source.UNRECOGNIZED : var1;
      }

      public JoinHostedWorldRequest.Builder setSource(JoinHostedWorldRequest.Source var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.source_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public JoinHostedWorldRequest.Builder clearSource() {
         this.bitField0_ &= -5;
         this.source_ = 0;
         this.onChanged();
         return this;
      }

      public final JoinHostedWorldRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (JoinHostedWorldRequest.Builder)super.setUnknownFields(var1);
      }

      public final JoinHostedWorldRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (JoinHostedWorldRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Source implements ProtocolMessageEnum {
      SOURCE_UNSPECIFIED(0),
      SOURCE_FRIEND_CHAT_BOX(1),
      SOURCE_FRIEND_LIST_INLINE(2),
      SOURCE_FRIEND_LIST_RIGHT_CLICK(3),
      SOURCE_MULTIPLAYER_SERVER(4),
      UNRECOGNIZED(-1);

      public static final int SOURCE_UNSPECIFIED_VALUE = 0;
      public static final int SOURCE_FRIEND_CHAT_BOX_VALUE = 1;
      public static final int SOURCE_FRIEND_LIST_INLINE_VALUE = 2;
      public static final int SOURCE_FRIEND_LIST_RIGHT_CLICK_VALUE = 3;
      public static final int SOURCE_MULTIPLAYER_SERVER_VALUE = 4;
      private static final Internal.EnumLiteMap<JoinHostedWorldRequest.Source> internalValueMap = new Internal.EnumLiteMap<JoinHostedWorldRequest.Source>() {
         public JoinHostedWorldRequest.Source findValueByNumber(int var1) {
            return JoinHostedWorldRequest.Source.forNumber(var1);
         }
      };
      private static final JoinHostedWorldRequest.Source[] VALUES = values();
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
      public static JoinHostedWorldRequest.Source valueOf(int var0) {
         return forNumber(var0);
      }

      public static JoinHostedWorldRequest.Source forNumber(int var0) {
         switch (var0) {
            case 0:
               return SOURCE_UNSPECIFIED;
            case 1:
               return SOURCE_FRIEND_CHAT_BOX;
            case 2:
               return SOURCE_FRIEND_LIST_INLINE;
            case 3:
               return SOURCE_FRIEND_LIST_RIGHT_CLICK;
            case 4:
               return SOURCE_MULTIPLAYER_SERVER;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<JoinHostedWorldRequest.Source> internalGetValueMap() {
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
         return JoinHostedWorldRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static JoinHostedWorldRequest.Source valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Source(int var3) {
         this.value = var3;
      }
   }
}
