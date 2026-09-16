package com.lunarclient.apollo.evnt.v1;

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

public final class EventStatusOverviewMessage extends GeneratedMessageV3 implements EventStatusOverviewMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TEAM_ONE_STATUS_FIELD_NUMBER = 1;
   private List<EventPlayerStatusMessage> teamOneStatus_;
   public static final int TEAM_TWO_STATUS_FIELD_NUMBER = 2;
   private List<EventPlayerStatusMessage> teamTwoStatus_;
   private byte memoizedIsInitialized = -1;
   private static final EventStatusOverviewMessage DEFAULT_INSTANCE = new EventStatusOverviewMessage();
   private static final Parser<EventStatusOverviewMessage> PARSER = new AbstractParser<EventStatusOverviewMessage>() {
      public EventStatusOverviewMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EventStatusOverviewMessage.Builder var3 = EventStatusOverviewMessage.newBuilder();

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

   private EventStatusOverviewMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EventStatusOverviewMessage() {
      this.teamOneStatus_ = Collections.emptyList();
      this.teamTwoStatus_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EventStatusOverviewMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EventStatusOverviewMessage.class, EventStatusOverviewMessage.Builder.class);
   }

   @Override
   public List<EventPlayerStatusMessage> getTeamOneStatusList() {
      return this.teamOneStatus_;
   }

   @Override
   public List<? extends EventPlayerStatusMessageOrBuilder> getTeamOneStatusOrBuilderList() {
      return this.teamOneStatus_;
   }

   @Override
   public int getTeamOneStatusCount() {
      return this.teamOneStatus_.size();
   }

   @Override
   public EventPlayerStatusMessage getTeamOneStatus(int var1) {
      return this.teamOneStatus_.get(var1);
   }

   @Override
   public EventPlayerStatusMessageOrBuilder getTeamOneStatusOrBuilder(int var1) {
      return this.teamOneStatus_.get(var1);
   }

   @Override
   public List<EventPlayerStatusMessage> getTeamTwoStatusList() {
      return this.teamTwoStatus_;
   }

   @Override
   public List<? extends EventPlayerStatusMessageOrBuilder> getTeamTwoStatusOrBuilderList() {
      return this.teamTwoStatus_;
   }

   @Override
   public int getTeamTwoStatusCount() {
      return this.teamTwoStatus_.size();
   }

   @Override
   public EventPlayerStatusMessage getTeamTwoStatus(int var1) {
      return this.teamTwoStatus_.get(var1);
   }

   @Override
   public EventPlayerStatusMessageOrBuilder getTeamTwoStatusOrBuilder(int var1) {
      return this.teamTwoStatus_.get(var1);
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
      for (int var2 = 0; var2 < this.teamOneStatus_.size(); var2++) {
         var1.writeMessage(1, this.teamOneStatus_.get(var2));
      }

      for (int var3 = 0; var3 < this.teamTwoStatus_.size(); var3++) {
         var1.writeMessage(2, this.teamTwoStatus_.get(var3));
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

      for (int var2 = 0; var2 < this.teamOneStatus_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.teamOneStatus_.get(var2));
      }

      for (int var5 = 0; var5 < this.teamTwoStatus_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.teamTwoStatus_.get(var5));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EventStatusOverviewMessage)) {
         return super.equals(var1);
      } else {
         EventStatusOverviewMessage var2 = (EventStatusOverviewMessage)var1;
         if (!this.getTeamOneStatusList().equals(var2.getTeamOneStatusList())) {
            return false;
         } else {
            return !this.getTeamTwoStatusList().equals(var2.getTeamTwoStatusList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getTeamOneStatusCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTeamOneStatusList().hashCode();
      }

      if (this.getTeamTwoStatusCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTeamTwoStatusList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EventStatusOverviewMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventStatusOverviewMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventStatusOverviewMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventStatusOverviewMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventStatusOverviewMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventStatusOverviewMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventStatusOverviewMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventStatusOverviewMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EventStatusOverviewMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EventStatusOverviewMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EventStatusOverviewMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventStatusOverviewMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EventStatusOverviewMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EventStatusOverviewMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EventStatusOverviewMessage.Builder newBuilder(EventStatusOverviewMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EventStatusOverviewMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EventStatusOverviewMessage.Builder() : new EventStatusOverviewMessage.Builder().mergeFrom(this);
   }

   protected EventStatusOverviewMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EventStatusOverviewMessage.Builder(var1);
   }

   public static EventStatusOverviewMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EventStatusOverviewMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EventStatusOverviewMessage> getParserForType() {
      return PARSER;
   }

   public EventStatusOverviewMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EventStatusOverviewMessage.Builder> implements EventStatusOverviewMessageOrBuilder {
      private int bitField0_;
      private List<EventPlayerStatusMessage> teamOneStatus_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EventPlayerStatusMessage, EventPlayerStatusMessage.Builder, EventPlayerStatusMessageOrBuilder> teamOneStatusBuilder_;
      private List<EventPlayerStatusMessage> teamTwoStatus_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EventPlayerStatusMessage, EventPlayerStatusMessage.Builder, EventPlayerStatusMessageOrBuilder> teamTwoStatusBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EventStatusOverviewMessage.class, EventStatusOverviewMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EventStatusOverviewMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.teamOneStatusBuilder_ == null) {
            this.teamOneStatus_ = Collections.emptyList();
         } else {
            this.teamOneStatus_ = null;
            this.teamOneStatusBuilder_.clear();
         }

         this.bitField0_ &= -2;
         if (this.teamTwoStatusBuilder_ == null) {
            this.teamTwoStatus_ = Collections.emptyList();
         } else {
            this.teamTwoStatus_ = null;
            this.teamTwoStatusBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_descriptor;
      }

      public EventStatusOverviewMessage getDefaultInstanceForType() {
         return EventStatusOverviewMessage.getDefaultInstance();
      }

      public EventStatusOverviewMessage build() {
         EventStatusOverviewMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EventStatusOverviewMessage buildPartial() {
         EventStatusOverviewMessage var1 = new EventStatusOverviewMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(EventStatusOverviewMessage var1) {
         if (this.teamOneStatusBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.teamOneStatus_ = Collections.unmodifiableList(this.teamOneStatus_);
               this.bitField0_ &= -2;
            }

            var1.teamOneStatus_ = this.teamOneStatus_;
         } else {
            var1.teamOneStatus_ = this.teamOneStatusBuilder_.build();
         }

         if (this.teamTwoStatusBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.teamTwoStatus_ = Collections.unmodifiableList(this.teamTwoStatus_);
               this.bitField0_ &= -3;
            }

            var1.teamTwoStatus_ = this.teamTwoStatus_;
         } else {
            var1.teamTwoStatus_ = this.teamTwoStatusBuilder_.build();
         }
      }

      private void buildPartial0(EventStatusOverviewMessage var1) {
         int var2 = this.bitField0_;
      }

      public EventStatusOverviewMessage.Builder clone() {
         return (EventStatusOverviewMessage.Builder)super.clone();
      }

      public EventStatusOverviewMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventStatusOverviewMessage.Builder)super.setField(var1, var2);
      }

      public EventStatusOverviewMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EventStatusOverviewMessage.Builder)super.clearField(var1);
      }

      public EventStatusOverviewMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EventStatusOverviewMessage.Builder)super.clearOneof(var1);
      }

      public EventStatusOverviewMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EventStatusOverviewMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EventStatusOverviewMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventStatusOverviewMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EventStatusOverviewMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EventStatusOverviewMessage) {
            return this.mergeFrom((EventStatusOverviewMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EventStatusOverviewMessage.Builder mergeFrom(EventStatusOverviewMessage var1) {
         if (var1 == EventStatusOverviewMessage.getDefaultInstance()) {
            return this;
         }

         if (this.teamOneStatusBuilder_ == null) {
            if (!var1.teamOneStatus_.isEmpty()) {
               if (this.teamOneStatus_.isEmpty()) {
                  this.teamOneStatus_ = var1.teamOneStatus_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureTeamOneStatusIsMutable();
                  this.teamOneStatus_.addAll(var1.teamOneStatus_);
               }

               this.onChanged();
            }
         } else if (!var1.teamOneStatus_.isEmpty()) {
            if (this.teamOneStatusBuilder_.isEmpty()) {
               this.teamOneStatusBuilder_.dispose();
               this.teamOneStatusBuilder_ = null;
               this.teamOneStatus_ = var1.teamOneStatus_;
               this.bitField0_ &= -2;
               this.teamOneStatusBuilder_ = EventStatusOverviewMessage.alwaysUseFieldBuilders ? this.getTeamOneStatusFieldBuilder() : null;
            } else {
               this.teamOneStatusBuilder_.addAllMessages(var1.teamOneStatus_);
            }
         }

         if (this.teamTwoStatusBuilder_ == null) {
            if (!var1.teamTwoStatus_.isEmpty()) {
               if (this.teamTwoStatus_.isEmpty()) {
                  this.teamTwoStatus_ = var1.teamTwoStatus_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureTeamTwoStatusIsMutable();
                  this.teamTwoStatus_.addAll(var1.teamTwoStatus_);
               }

               this.onChanged();
            }
         } else if (!var1.teamTwoStatus_.isEmpty()) {
            if (this.teamTwoStatusBuilder_.isEmpty()) {
               this.teamTwoStatusBuilder_.dispose();
               this.teamTwoStatusBuilder_ = null;
               this.teamTwoStatus_ = var1.teamTwoStatus_;
               this.bitField0_ &= -3;
               this.teamTwoStatusBuilder_ = EventStatusOverviewMessage.alwaysUseFieldBuilders ? this.getTeamTwoStatusFieldBuilder() : null;
            } else {
               this.teamTwoStatusBuilder_.addAllMessages(var1.teamTwoStatus_);
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

      public EventStatusOverviewMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     EventPlayerStatusMessage var11 = var1.readMessage(EventPlayerStatusMessage.parser(), var2);
                     if (this.teamOneStatusBuilder_ == null) {
                        this.ensureTeamOneStatusIsMutable();
                        this.teamOneStatus_.add(var11);
                     } else {
                        this.teamOneStatusBuilder_.addMessage(var11);
                     }
                     break;
                  case 18:
                     EventPlayerStatusMessage var5 = var1.readMessage(EventPlayerStatusMessage.parser(), var2);
                     if (this.teamTwoStatusBuilder_ == null) {
                        this.ensureTeamTwoStatusIsMutable();
                        this.teamTwoStatus_.add(var5);
                     } else {
                        this.teamTwoStatusBuilder_.addMessage(var5);
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

      private void ensureTeamOneStatusIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.teamOneStatus_ = new ArrayList<>(this.teamOneStatus_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<EventPlayerStatusMessage> getTeamOneStatusList() {
         return this.teamOneStatusBuilder_ == null ? Collections.unmodifiableList(this.teamOneStatus_) : this.teamOneStatusBuilder_.getMessageList();
      }

      @Override
      public int getTeamOneStatusCount() {
         return this.teamOneStatusBuilder_ == null ? this.teamOneStatus_.size() : this.teamOneStatusBuilder_.getCount();
      }

      @Override
      public EventPlayerStatusMessage getTeamOneStatus(int var1) {
         return this.teamOneStatusBuilder_ == null ? this.teamOneStatus_.get(var1) : this.teamOneStatusBuilder_.getMessage(var1);
      }

      public EventStatusOverviewMessage.Builder setTeamOneStatus(int var1, EventPlayerStatusMessage var2) {
         if (this.teamOneStatusBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.set(var1, var2);
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder setTeamOneStatus(int var1, EventPlayerStatusMessage.Builder var2) {
         if (this.teamOneStatusBuilder_ == null) {
            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamOneStatus(EventPlayerStatusMessage var1) {
         if (this.teamOneStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.add(var1);
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.addMessage(var1);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamOneStatus(int var1, EventPlayerStatusMessage var2) {
         if (this.teamOneStatusBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.add(var1, var2);
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamOneStatus(EventPlayerStatusMessage.Builder var1) {
         if (this.teamOneStatusBuilder_ == null) {
            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.add(var1.build());
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamOneStatus(int var1, EventPlayerStatusMessage.Builder var2) {
         if (this.teamOneStatusBuilder_ == null) {
            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addAllTeamOneStatus(Iterable<? extends EventPlayerStatusMessage> var1) {
         if (this.teamOneStatusBuilder_ == null) {
            this.ensureTeamOneStatusIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.teamOneStatus_);
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder clearTeamOneStatus() {
         if (this.teamOneStatusBuilder_ == null) {
            this.teamOneStatus_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.clear();
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder removeTeamOneStatus(int var1) {
         if (this.teamOneStatusBuilder_ == null) {
            this.ensureTeamOneStatusIsMutable();
            this.teamOneStatus_.remove(var1);
            this.onChanged();
         } else {
            this.teamOneStatusBuilder_.remove(var1);
         }

         return this;
      }

      public EventPlayerStatusMessage.Builder getTeamOneStatusBuilder(int var1) {
         return this.getTeamOneStatusFieldBuilder().getBuilder(var1);
      }

      @Override
      public EventPlayerStatusMessageOrBuilder getTeamOneStatusOrBuilder(int var1) {
         return this.teamOneStatusBuilder_ == null ? this.teamOneStatus_.get(var1) : this.teamOneStatusBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EventPlayerStatusMessageOrBuilder> getTeamOneStatusOrBuilderList() {
         return this.teamOneStatusBuilder_ != null ? this.teamOneStatusBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.teamOneStatus_);
      }

      public EventPlayerStatusMessage.Builder addTeamOneStatusBuilder() {
         return this.getTeamOneStatusFieldBuilder().addBuilder(EventPlayerStatusMessage.getDefaultInstance());
      }

      public EventPlayerStatusMessage.Builder addTeamOneStatusBuilder(int var1) {
         return this.getTeamOneStatusFieldBuilder().addBuilder(var1, EventPlayerStatusMessage.getDefaultInstance());
      }

      public List<EventPlayerStatusMessage.Builder> getTeamOneStatusBuilderList() {
         return this.getTeamOneStatusFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EventPlayerStatusMessage, EventPlayerStatusMessage.Builder, EventPlayerStatusMessageOrBuilder> getTeamOneStatusFieldBuilder() {
         if (this.teamOneStatusBuilder_ == null) {
            this.teamOneStatusBuilder_ = new RepeatedFieldBuilderV3<>(
               this.teamOneStatus_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.teamOneStatus_ = null;
         }

         return this.teamOneStatusBuilder_;
      }

      private void ensureTeamTwoStatusIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.teamTwoStatus_ = new ArrayList<>(this.teamTwoStatus_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<EventPlayerStatusMessage> getTeamTwoStatusList() {
         return this.teamTwoStatusBuilder_ == null ? Collections.unmodifiableList(this.teamTwoStatus_) : this.teamTwoStatusBuilder_.getMessageList();
      }

      @Override
      public int getTeamTwoStatusCount() {
         return this.teamTwoStatusBuilder_ == null ? this.teamTwoStatus_.size() : this.teamTwoStatusBuilder_.getCount();
      }

      @Override
      public EventPlayerStatusMessage getTeamTwoStatus(int var1) {
         return this.teamTwoStatusBuilder_ == null ? this.teamTwoStatus_.get(var1) : this.teamTwoStatusBuilder_.getMessage(var1);
      }

      public EventStatusOverviewMessage.Builder setTeamTwoStatus(int var1, EventPlayerStatusMessage var2) {
         if (this.teamTwoStatusBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.set(var1, var2);
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder setTeamTwoStatus(int var1, EventPlayerStatusMessage.Builder var2) {
         if (this.teamTwoStatusBuilder_ == null) {
            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamTwoStatus(EventPlayerStatusMessage var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.add(var1);
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.addMessage(var1);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamTwoStatus(int var1, EventPlayerStatusMessage var2) {
         if (this.teamTwoStatusBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.add(var1, var2);
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamTwoStatus(EventPlayerStatusMessage.Builder var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.add(var1.build());
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addTeamTwoStatus(int var1, EventPlayerStatusMessage.Builder var2) {
         if (this.teamTwoStatusBuilder_ == null) {
            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder addAllTeamTwoStatus(Iterable<? extends EventPlayerStatusMessage> var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            this.ensureTeamTwoStatusIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.teamTwoStatus_);
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder clearTeamTwoStatus() {
         if (this.teamTwoStatusBuilder_ == null) {
            this.teamTwoStatus_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.clear();
         }

         return this;
      }

      public EventStatusOverviewMessage.Builder removeTeamTwoStatus(int var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            this.ensureTeamTwoStatusIsMutable();
            this.teamTwoStatus_.remove(var1);
            this.onChanged();
         } else {
            this.teamTwoStatusBuilder_.remove(var1);
         }

         return this;
      }

      public EventPlayerStatusMessage.Builder getTeamTwoStatusBuilder(int var1) {
         return this.getTeamTwoStatusFieldBuilder().getBuilder(var1);
      }

      @Override
      public EventPlayerStatusMessageOrBuilder getTeamTwoStatusOrBuilder(int var1) {
         return this.teamTwoStatusBuilder_ == null ? this.teamTwoStatus_.get(var1) : this.teamTwoStatusBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EventPlayerStatusMessageOrBuilder> getTeamTwoStatusOrBuilderList() {
         return this.teamTwoStatusBuilder_ != null ? this.teamTwoStatusBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.teamTwoStatus_);
      }

      public EventPlayerStatusMessage.Builder addTeamTwoStatusBuilder() {
         return this.getTeamTwoStatusFieldBuilder().addBuilder(EventPlayerStatusMessage.getDefaultInstance());
      }

      public EventPlayerStatusMessage.Builder addTeamTwoStatusBuilder(int var1) {
         return this.getTeamTwoStatusFieldBuilder().addBuilder(var1, EventPlayerStatusMessage.getDefaultInstance());
      }

      public List<EventPlayerStatusMessage.Builder> getTeamTwoStatusBuilderList() {
         return this.getTeamTwoStatusFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EventPlayerStatusMessage, EventPlayerStatusMessage.Builder, EventPlayerStatusMessageOrBuilder> getTeamTwoStatusFieldBuilder() {
         if (this.teamTwoStatusBuilder_ == null) {
            this.teamTwoStatusBuilder_ = new RepeatedFieldBuilderV3<>(
               this.teamTwoStatus_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.teamTwoStatus_ = null;
         }

         return this.teamTwoStatusBuilder_;
      }

      public final EventStatusOverviewMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EventStatusOverviewMessage.Builder)super.setUnknownFields(var1);
      }

      public final EventStatusOverviewMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EventStatusOverviewMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
