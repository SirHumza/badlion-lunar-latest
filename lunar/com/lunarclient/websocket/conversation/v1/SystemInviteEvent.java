package com.lunarclient.websocket.conversation.v1;

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
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SystemInviteEvent extends GeneratedMessageV3 implements SystemInviteEventOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int INVITEES_FIELD_NUMBER = 1;
   private List<UuidAndUsername> invitees_;
   private byte memoizedIsInitialized = -1;
   private static final SystemInviteEvent DEFAULT_INSTANCE = new SystemInviteEvent();
   private static final Parser<SystemInviteEvent> PARSER = new AbstractParser<SystemInviteEvent>() {
      public SystemInviteEvent parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SystemInviteEvent.Builder var3 = SystemInviteEvent.newBuilder();

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

   private SystemInviteEvent(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SystemInviteEvent() {
      this.invitees_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SystemInviteEvent();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SystemInviteEvent.class, SystemInviteEvent.Builder.class);
   }

   @Override
   public List<UuidAndUsername> getInviteesList() {
      return this.invitees_;
   }

   @Override
   public List<? extends UuidAndUsernameOrBuilder> getInviteesOrBuilderList() {
      return this.invitees_;
   }

   @Override
   public int getInviteesCount() {
      return this.invitees_.size();
   }

   @Override
   public UuidAndUsername getInvitees(int var1) {
      return this.invitees_.get(var1);
   }

   @Override
   public UuidAndUsernameOrBuilder getInviteesOrBuilder(int var1) {
      return this.invitees_.get(var1);
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
      for (int var2 = 0; var2 < this.invitees_.size(); var2++) {
         var1.writeMessage(1, this.invitees_.get(var2));
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

      for (int var2 = 0; var2 < this.invitees_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.invitees_.get(var2));
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

      if (!(var1 instanceof SystemInviteEvent)) {
         return super.equals(var1);
      }

      SystemInviteEvent var2 = (SystemInviteEvent)var1;
      return !this.getInviteesList().equals(var2.getInviteesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getInviteesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getInviteesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SystemInviteEvent parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemInviteEvent parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemInviteEvent parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemInviteEvent parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemInviteEvent parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemInviteEvent parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemInviteEvent parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemInviteEvent parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SystemInviteEvent parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SystemInviteEvent parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SystemInviteEvent parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemInviteEvent parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SystemInviteEvent.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SystemInviteEvent.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SystemInviteEvent.Builder newBuilder(SystemInviteEvent var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SystemInviteEvent.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SystemInviteEvent.Builder() : new SystemInviteEvent.Builder().mergeFrom(this);
   }

   protected SystemInviteEvent.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SystemInviteEvent.Builder(var1);
   }

   public static SystemInviteEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SystemInviteEvent> parser() {
      return PARSER;
   }

   @Override
   public Parser<SystemInviteEvent> getParserForType() {
      return PARSER;
   }

   public SystemInviteEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SystemInviteEvent.Builder> implements SystemInviteEventOrBuilder {
      private int bitField0_;
      private List<UuidAndUsername> invitees_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> inviteesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SystemInviteEvent.class, SystemInviteEvent.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SystemInviteEvent.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.inviteesBuilder_ == null) {
            this.invitees_ = Collections.emptyList();
         } else {
            this.invitees_ = null;
            this.inviteesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemInviteEvent_descriptor;
      }

      public SystemInviteEvent getDefaultInstanceForType() {
         return SystemInviteEvent.getDefaultInstance();
      }

      public SystemInviteEvent build() {
         SystemInviteEvent var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SystemInviteEvent buildPartial() {
         SystemInviteEvent var1 = new SystemInviteEvent(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(SystemInviteEvent var1) {
         if (this.inviteesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.invitees_ = Collections.unmodifiableList(this.invitees_);
               this.bitField0_ &= -2;
            }

            var1.invitees_ = this.invitees_;
         } else {
            var1.invitees_ = this.inviteesBuilder_.build();
         }
      }

      private void buildPartial0(SystemInviteEvent var1) {
         int var2 = this.bitField0_;
      }

      public SystemInviteEvent.Builder clone() {
         return (SystemInviteEvent.Builder)super.clone();
      }

      public SystemInviteEvent.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemInviteEvent.Builder)super.setField(var1, var2);
      }

      public SystemInviteEvent.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SystemInviteEvent.Builder)super.clearField(var1);
      }

      public SystemInviteEvent.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SystemInviteEvent.Builder)super.clearOneof(var1);
      }

      public SystemInviteEvent.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SystemInviteEvent.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SystemInviteEvent.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemInviteEvent.Builder)super.addRepeatedField(var1, var2);
      }

      public SystemInviteEvent.Builder mergeFrom(Message var1) {
         if (var1 instanceof SystemInviteEvent) {
            return this.mergeFrom((SystemInviteEvent)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SystemInviteEvent.Builder mergeFrom(SystemInviteEvent var1) {
         if (var1 == SystemInviteEvent.getDefaultInstance()) {
            return this;
         }

         if (this.inviteesBuilder_ == null) {
            if (!var1.invitees_.isEmpty()) {
               if (this.invitees_.isEmpty()) {
                  this.invitees_ = var1.invitees_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureInviteesIsMutable();
                  this.invitees_.addAll(var1.invitees_);
               }

               this.onChanged();
            }
         } else if (!var1.invitees_.isEmpty()) {
            if (this.inviteesBuilder_.isEmpty()) {
               this.inviteesBuilder_.dispose();
               this.inviteesBuilder_ = null;
               this.invitees_ = var1.invitees_;
               this.bitField0_ &= -2;
               this.inviteesBuilder_ = SystemInviteEvent.alwaysUseFieldBuilders ? this.getInviteesFieldBuilder() : null;
            } else {
               this.inviteesBuilder_.addAllMessages(var1.invitees_);
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

      public SystemInviteEvent.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     UuidAndUsername var5 = var1.readMessage(UuidAndUsername.parser(), var2);
                     if (this.inviteesBuilder_ == null) {
                        this.ensureInviteesIsMutable();
                        this.invitees_.add(var5);
                     } else {
                        this.inviteesBuilder_.addMessage(var5);
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

      private void ensureInviteesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.invitees_ = new ArrayList<>(this.invitees_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<UuidAndUsername> getInviteesList() {
         return this.inviteesBuilder_ == null ? Collections.unmodifiableList(this.invitees_) : this.inviteesBuilder_.getMessageList();
      }

      @Override
      public int getInviteesCount() {
         return this.inviteesBuilder_ == null ? this.invitees_.size() : this.inviteesBuilder_.getCount();
      }

      @Override
      public UuidAndUsername getInvitees(int var1) {
         return this.inviteesBuilder_ == null ? this.invitees_.get(var1) : this.inviteesBuilder_.getMessage(var1);
      }

      public SystemInviteEvent.Builder setInvitees(int var1, UuidAndUsername var2) {
         if (this.inviteesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInviteesIsMutable();
            this.invitees_.set(var1, var2);
            this.onChanged();
         } else {
            this.inviteesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public SystemInviteEvent.Builder setInvitees(int var1, UuidAndUsername.Builder var2) {
         if (this.inviteesBuilder_ == null) {
            this.ensureInviteesIsMutable();
            this.invitees_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.inviteesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SystemInviteEvent.Builder addInvitees(UuidAndUsername var1) {
         if (this.inviteesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureInviteesIsMutable();
            this.invitees_.add(var1);
            this.onChanged();
         } else {
            this.inviteesBuilder_.addMessage(var1);
         }

         return this;
      }

      public SystemInviteEvent.Builder addInvitees(int var1, UuidAndUsername var2) {
         if (this.inviteesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureInviteesIsMutable();
            this.invitees_.add(var1, var2);
            this.onChanged();
         } else {
            this.inviteesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public SystemInviteEvent.Builder addInvitees(UuidAndUsername.Builder var1) {
         if (this.inviteesBuilder_ == null) {
            this.ensureInviteesIsMutable();
            this.invitees_.add(var1.build());
            this.onChanged();
         } else {
            this.inviteesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SystemInviteEvent.Builder addInvitees(int var1, UuidAndUsername.Builder var2) {
         if (this.inviteesBuilder_ == null) {
            this.ensureInviteesIsMutable();
            this.invitees_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.inviteesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SystemInviteEvent.Builder addAllInvitees(Iterable<? extends UuidAndUsername> var1) {
         if (this.inviteesBuilder_ == null) {
            this.ensureInviteesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.invitees_);
            this.onChanged();
         } else {
            this.inviteesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SystemInviteEvent.Builder clearInvitees() {
         if (this.inviteesBuilder_ == null) {
            this.invitees_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.inviteesBuilder_.clear();
         }

         return this;
      }

      public SystemInviteEvent.Builder removeInvitees(int var1) {
         if (this.inviteesBuilder_ == null) {
            this.ensureInviteesIsMutable();
            this.invitees_.remove(var1);
            this.onChanged();
         } else {
            this.inviteesBuilder_.remove(var1);
         }

         return this;
      }

      public UuidAndUsername.Builder getInviteesBuilder(int var1) {
         return this.getInviteesFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidAndUsernameOrBuilder getInviteesOrBuilder(int var1) {
         return this.inviteesBuilder_ == null ? this.invitees_.get(var1) : this.inviteesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidAndUsernameOrBuilder> getInviteesOrBuilderList() {
         return this.inviteesBuilder_ != null ? this.inviteesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.invitees_);
      }

      public UuidAndUsername.Builder addInviteesBuilder() {
         return this.getInviteesFieldBuilder().addBuilder(UuidAndUsername.getDefaultInstance());
      }

      public UuidAndUsername.Builder addInviteesBuilder(int var1) {
         return this.getInviteesFieldBuilder().addBuilder(var1, UuidAndUsername.getDefaultInstance());
      }

      public List<UuidAndUsername.Builder> getInviteesBuilderList() {
         return this.getInviteesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getInviteesFieldBuilder() {
         if (this.inviteesBuilder_ == null) {
            this.inviteesBuilder_ = new RepeatedFieldBuilderV3<>(this.invitees_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.invitees_ = null;
         }

         return this.inviteesBuilder_;
      }

      public final SystemInviteEvent.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SystemInviteEvent.Builder)super.setUnknownFields(var1);
      }

      public final SystemInviteEvent.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SystemInviteEvent.Builder)super.mergeUnknownFields(var1);
      }
   }
}
