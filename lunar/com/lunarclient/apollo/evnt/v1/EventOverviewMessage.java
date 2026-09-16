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

public final class EventOverviewMessage extends GeneratedMessageV3 implements EventOverviewMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYERS_FIELD_NUMBER = 1;
   private List<EventPlayerMessage> players_;
   private byte memoizedIsInitialized = -1;
   private static final EventOverviewMessage DEFAULT_INSTANCE = new EventOverviewMessage();
   private static final Parser<EventOverviewMessage> PARSER = new AbstractParser<EventOverviewMessage>() {
      public EventOverviewMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EventOverviewMessage.Builder var3 = EventOverviewMessage.newBuilder();

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

   private EventOverviewMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EventOverviewMessage() {
      this.players_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EventOverviewMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EventOverviewMessage.class, EventOverviewMessage.Builder.class);
   }

   @Override
   public List<EventPlayerMessage> getPlayersList() {
      return this.players_;
   }

   @Override
   public List<? extends EventPlayerMessageOrBuilder> getPlayersOrBuilderList() {
      return this.players_;
   }

   @Override
   public int getPlayersCount() {
      return this.players_.size();
   }

   @Override
   public EventPlayerMessage getPlayers(int var1) {
      return this.players_.get(var1);
   }

   @Override
   public EventPlayerMessageOrBuilder getPlayersOrBuilder(int var1) {
      return this.players_.get(var1);
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
      for (int var2 = 0; var2 < this.players_.size(); var2++) {
         var1.writeMessage(1, this.players_.get(var2));
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

      for (int var2 = 0; var2 < this.players_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.players_.get(var2));
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

      if (!(var1 instanceof EventOverviewMessage)) {
         return super.equals(var1);
      }

      EventOverviewMessage var2 = (EventOverviewMessage)var1;
      return !this.getPlayersList().equals(var2.getPlayersList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getPlayersCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayersList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EventOverviewMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventOverviewMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventOverviewMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventOverviewMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventOverviewMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventOverviewMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventOverviewMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventOverviewMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EventOverviewMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EventOverviewMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EventOverviewMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventOverviewMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EventOverviewMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EventOverviewMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EventOverviewMessage.Builder newBuilder(EventOverviewMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EventOverviewMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EventOverviewMessage.Builder() : new EventOverviewMessage.Builder().mergeFrom(this);
   }

   protected EventOverviewMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EventOverviewMessage.Builder(var1);
   }

   public static EventOverviewMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EventOverviewMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EventOverviewMessage> getParserForType() {
      return PARSER;
   }

   public EventOverviewMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EventOverviewMessage.Builder> implements EventOverviewMessageOrBuilder {
      private int bitField0_;
      private List<EventPlayerMessage> players_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EventPlayerMessage, EventPlayerMessage.Builder, EventPlayerMessageOrBuilder> playersBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EventOverviewMessage.class, EventOverviewMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EventOverviewMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.playersBuilder_ == null) {
            this.players_ = Collections.emptyList();
         } else {
            this.players_ = null;
            this.playersBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_descriptor;
      }

      public EventOverviewMessage getDefaultInstanceForType() {
         return EventOverviewMessage.getDefaultInstance();
      }

      public EventOverviewMessage build() {
         EventOverviewMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EventOverviewMessage buildPartial() {
         EventOverviewMessage var1 = new EventOverviewMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(EventOverviewMessage var1) {
         if (this.playersBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.players_ = Collections.unmodifiableList(this.players_);
               this.bitField0_ &= -2;
            }

            var1.players_ = this.players_;
         } else {
            var1.players_ = this.playersBuilder_.build();
         }
      }

      private void buildPartial0(EventOverviewMessage var1) {
         int var2 = this.bitField0_;
      }

      public EventOverviewMessage.Builder clone() {
         return (EventOverviewMessage.Builder)super.clone();
      }

      public EventOverviewMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventOverviewMessage.Builder)super.setField(var1, var2);
      }

      public EventOverviewMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EventOverviewMessage.Builder)super.clearField(var1);
      }

      public EventOverviewMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EventOverviewMessage.Builder)super.clearOneof(var1);
      }

      public EventOverviewMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EventOverviewMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EventOverviewMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventOverviewMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EventOverviewMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EventOverviewMessage) {
            return this.mergeFrom((EventOverviewMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EventOverviewMessage.Builder mergeFrom(EventOverviewMessage var1) {
         if (var1 == EventOverviewMessage.getDefaultInstance()) {
            return this;
         }

         if (this.playersBuilder_ == null) {
            if (!var1.players_.isEmpty()) {
               if (this.players_.isEmpty()) {
                  this.players_ = var1.players_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensurePlayersIsMutable();
                  this.players_.addAll(var1.players_);
               }

               this.onChanged();
            }
         } else if (!var1.players_.isEmpty()) {
            if (this.playersBuilder_.isEmpty()) {
               this.playersBuilder_.dispose();
               this.playersBuilder_ = null;
               this.players_ = var1.players_;
               this.bitField0_ &= -2;
               this.playersBuilder_ = EventOverviewMessage.alwaysUseFieldBuilders ? this.getPlayersFieldBuilder() : null;
            } else {
               this.playersBuilder_.addAllMessages(var1.players_);
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

      public EventOverviewMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     EventPlayerMessage var5 = var1.readMessage(EventPlayerMessage.parser(), var2);
                     if (this.playersBuilder_ == null) {
                        this.ensurePlayersIsMutable();
                        this.players_.add(var5);
                     } else {
                        this.playersBuilder_.addMessage(var5);
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

      private void ensurePlayersIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.players_ = new ArrayList<>(this.players_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<EventPlayerMessage> getPlayersList() {
         return this.playersBuilder_ == null ? Collections.unmodifiableList(this.players_) : this.playersBuilder_.getMessageList();
      }

      @Override
      public int getPlayersCount() {
         return this.playersBuilder_ == null ? this.players_.size() : this.playersBuilder_.getCount();
      }

      @Override
      public EventPlayerMessage getPlayers(int var1) {
         return this.playersBuilder_ == null ? this.players_.get(var1) : this.playersBuilder_.getMessage(var1);
      }

      public EventOverviewMessage.Builder setPlayers(int var1, EventPlayerMessage var2) {
         if (this.playersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayersIsMutable();
            this.players_.set(var1, var2);
            this.onChanged();
         } else {
            this.playersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public EventOverviewMessage.Builder setPlayers(int var1, EventPlayerMessage.Builder var2) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.playersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public EventOverviewMessage.Builder addPlayers(EventPlayerMessage var1) {
         if (this.playersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayersIsMutable();
            this.players_.add(var1);
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1);
         }

         return this;
      }

      public EventOverviewMessage.Builder addPlayers(int var1, EventPlayerMessage var2) {
         if (this.playersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayersIsMutable();
            this.players_.add(var1, var2);
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public EventOverviewMessage.Builder addPlayers(EventPlayerMessage.Builder var1) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.add(var1.build());
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public EventOverviewMessage.Builder addPlayers(int var1, EventPlayerMessage.Builder var2) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.playersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public EventOverviewMessage.Builder addAllPlayers(Iterable<? extends EventPlayerMessage> var1) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.players_);
            this.onChanged();
         } else {
            this.playersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public EventOverviewMessage.Builder clearPlayers() {
         if (this.playersBuilder_ == null) {
            this.players_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.playersBuilder_.clear();
         }

         return this;
      }

      public EventOverviewMessage.Builder removePlayers(int var1) {
         if (this.playersBuilder_ == null) {
            this.ensurePlayersIsMutable();
            this.players_.remove(var1);
            this.onChanged();
         } else {
            this.playersBuilder_.remove(var1);
         }

         return this;
      }

      public EventPlayerMessage.Builder getPlayersBuilder(int var1) {
         return this.getPlayersFieldBuilder().getBuilder(var1);
      }

      @Override
      public EventPlayerMessageOrBuilder getPlayersOrBuilder(int var1) {
         return this.playersBuilder_ == null ? this.players_.get(var1) : this.playersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EventPlayerMessageOrBuilder> getPlayersOrBuilderList() {
         return this.playersBuilder_ != null ? this.playersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.players_);
      }

      public EventPlayerMessage.Builder addPlayersBuilder() {
         return this.getPlayersFieldBuilder().addBuilder(EventPlayerMessage.getDefaultInstance());
      }

      public EventPlayerMessage.Builder addPlayersBuilder(int var1) {
         return this.getPlayersFieldBuilder().addBuilder(var1, EventPlayerMessage.getDefaultInstance());
      }

      public List<EventPlayerMessage.Builder> getPlayersBuilderList() {
         return this.getPlayersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EventPlayerMessage, EventPlayerMessage.Builder, EventPlayerMessageOrBuilder> getPlayersFieldBuilder() {
         if (this.playersBuilder_ == null) {
            this.playersBuilder_ = new RepeatedFieldBuilderV3<>(this.players_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.players_ = null;
         }

         return this.playersBuilder_;
      }

      public final EventOverviewMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EventOverviewMessage.Builder)super.setUnknownFields(var1);
      }

      public final EventOverviewMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EventOverviewMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
