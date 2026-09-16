package com.lunarclient.apollo.team.v1;

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

public final class UpdateTeamMembersMessage extends GeneratedMessageV3 implements UpdateTeamMembersMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MEMBERS_FIELD_NUMBER = 1;
   private List<TeamMember> members_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateTeamMembersMessage DEFAULT_INSTANCE = new UpdateTeamMembersMessage();
   private static final Parser<UpdateTeamMembersMessage> PARSER = new AbstractParser<UpdateTeamMembersMessage>() {
      public UpdateTeamMembersMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateTeamMembersMessage.Builder var3 = UpdateTeamMembersMessage.newBuilder();

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

   private UpdateTeamMembersMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateTeamMembersMessage() {
      this.members_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateTeamMembersMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateTeamMembersMessage.class, UpdateTeamMembersMessage.Builder.class);
   }

   @Override
   public List<TeamMember> getMembersList() {
      return this.members_;
   }

   @Override
   public List<? extends TeamMemberOrBuilder> getMembersOrBuilderList() {
      return this.members_;
   }

   @Override
   public int getMembersCount() {
      return this.members_.size();
   }

   @Override
   public TeamMember getMembers(int var1) {
      return this.members_.get(var1);
   }

   @Override
   public TeamMemberOrBuilder getMembersOrBuilder(int var1) {
      return this.members_.get(var1);
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
      for (int var2 = 0; var2 < this.members_.size(); var2++) {
         var1.writeMessage(1, this.members_.get(var2));
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

      for (int var2 = 0; var2 < this.members_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.members_.get(var2));
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

      if (!(var1 instanceof UpdateTeamMembersMessage)) {
         return super.equals(var1);
      }

      UpdateTeamMembersMessage var2 = (UpdateTeamMembersMessage)var1;
      return !this.getMembersList().equals(var2.getMembersList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getMembersCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMembersList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateTeamMembersMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateTeamMembersMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateTeamMembersMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateTeamMembersMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateTeamMembersMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateTeamMembersMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateTeamMembersMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateTeamMembersMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateTeamMembersMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateTeamMembersMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateTeamMembersMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateTeamMembersMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateTeamMembersMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateTeamMembersMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateTeamMembersMessage.Builder newBuilder(UpdateTeamMembersMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateTeamMembersMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateTeamMembersMessage.Builder() : new UpdateTeamMembersMessage.Builder().mergeFrom(this);
   }

   protected UpdateTeamMembersMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateTeamMembersMessage.Builder(var1);
   }

   public static UpdateTeamMembersMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateTeamMembersMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateTeamMembersMessage> getParserForType() {
      return PARSER;
   }

   public UpdateTeamMembersMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateTeamMembersMessage.Builder> implements UpdateTeamMembersMessageOrBuilder {
      private int bitField0_;
      private List<TeamMember> members_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<TeamMember, TeamMember.Builder, TeamMemberOrBuilder> membersBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateTeamMembersMessage.class, UpdateTeamMembersMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateTeamMembersMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.membersBuilder_ == null) {
            this.members_ = Collections.emptyList();
         } else {
            this.members_ = null;
            this.membersBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_descriptor;
      }

      public UpdateTeamMembersMessage getDefaultInstanceForType() {
         return UpdateTeamMembersMessage.getDefaultInstance();
      }

      public UpdateTeamMembersMessage build() {
         UpdateTeamMembersMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateTeamMembersMessage buildPartial() {
         UpdateTeamMembersMessage var1 = new UpdateTeamMembersMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(UpdateTeamMembersMessage var1) {
         if (this.membersBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.members_ = Collections.unmodifiableList(this.members_);
               this.bitField0_ &= -2;
            }

            var1.members_ = this.members_;
         } else {
            var1.members_ = this.membersBuilder_.build();
         }
      }

      private void buildPartial0(UpdateTeamMembersMessage var1) {
         int var2 = this.bitField0_;
      }

      public UpdateTeamMembersMessage.Builder clone() {
         return (UpdateTeamMembersMessage.Builder)super.clone();
      }

      public UpdateTeamMembersMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateTeamMembersMessage.Builder)super.setField(var1, var2);
      }

      public UpdateTeamMembersMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateTeamMembersMessage.Builder)super.clearField(var1);
      }

      public UpdateTeamMembersMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateTeamMembersMessage.Builder)super.clearOneof(var1);
      }

      public UpdateTeamMembersMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateTeamMembersMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateTeamMembersMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateTeamMembersMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateTeamMembersMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateTeamMembersMessage) {
            return this.mergeFrom((UpdateTeamMembersMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateTeamMembersMessage.Builder mergeFrom(UpdateTeamMembersMessage var1) {
         if (var1 == UpdateTeamMembersMessage.getDefaultInstance()) {
            return this;
         }

         if (this.membersBuilder_ == null) {
            if (!var1.members_.isEmpty()) {
               if (this.members_.isEmpty()) {
                  this.members_ = var1.members_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureMembersIsMutable();
                  this.members_.addAll(var1.members_);
               }

               this.onChanged();
            }
         } else if (!var1.members_.isEmpty()) {
            if (this.membersBuilder_.isEmpty()) {
               this.membersBuilder_.dispose();
               this.membersBuilder_ = null;
               this.members_ = var1.members_;
               this.bitField0_ &= -2;
               this.membersBuilder_ = UpdateTeamMembersMessage.alwaysUseFieldBuilders ? this.getMembersFieldBuilder() : null;
            } else {
               this.membersBuilder_.addAllMessages(var1.members_);
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

      public UpdateTeamMembersMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     TeamMember var5 = var1.readMessage(TeamMember.parser(), var2);
                     if (this.membersBuilder_ == null) {
                        this.ensureMembersIsMutable();
                        this.members_.add(var5);
                     } else {
                        this.membersBuilder_.addMessage(var5);
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

      private void ensureMembersIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.members_ = new ArrayList<>(this.members_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<TeamMember> getMembersList() {
         return this.membersBuilder_ == null ? Collections.unmodifiableList(this.members_) : this.membersBuilder_.getMessageList();
      }

      @Override
      public int getMembersCount() {
         return this.membersBuilder_ == null ? this.members_.size() : this.membersBuilder_.getCount();
      }

      @Override
      public TeamMember getMembers(int var1) {
         return this.membersBuilder_ == null ? this.members_.get(var1) : this.membersBuilder_.getMessage(var1);
      }

      public UpdateTeamMembersMessage.Builder setMembers(int var1, TeamMember var2) {
         if (this.membersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureMembersIsMutable();
            this.members_.set(var1, var2);
            this.onChanged();
         } else {
            this.membersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder setMembers(int var1, TeamMember.Builder var2) {
         if (this.membersBuilder_ == null) {
            this.ensureMembersIsMutable();
            this.members_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.membersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder addMembers(TeamMember var1) {
         if (this.membersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureMembersIsMutable();
            this.members_.add(var1);
            this.onChanged();
         } else {
            this.membersBuilder_.addMessage(var1);
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder addMembers(int var1, TeamMember var2) {
         if (this.membersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureMembersIsMutable();
            this.members_.add(var1, var2);
            this.onChanged();
         } else {
            this.membersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder addMembers(TeamMember.Builder var1) {
         if (this.membersBuilder_ == null) {
            this.ensureMembersIsMutable();
            this.members_.add(var1.build());
            this.onChanged();
         } else {
            this.membersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder addMembers(int var1, TeamMember.Builder var2) {
         if (this.membersBuilder_ == null) {
            this.ensureMembersIsMutable();
            this.members_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.membersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder addAllMembers(Iterable<? extends TeamMember> var1) {
         if (this.membersBuilder_ == null) {
            this.ensureMembersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.members_);
            this.onChanged();
         } else {
            this.membersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder clearMembers() {
         if (this.membersBuilder_ == null) {
            this.members_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.membersBuilder_.clear();
         }

         return this;
      }

      public UpdateTeamMembersMessage.Builder removeMembers(int var1) {
         if (this.membersBuilder_ == null) {
            this.ensureMembersIsMutable();
            this.members_.remove(var1);
            this.onChanged();
         } else {
            this.membersBuilder_.remove(var1);
         }

         return this;
      }

      public TeamMember.Builder getMembersBuilder(int var1) {
         return this.getMembersFieldBuilder().getBuilder(var1);
      }

      @Override
      public TeamMemberOrBuilder getMembersOrBuilder(int var1) {
         return this.membersBuilder_ == null ? this.members_.get(var1) : this.membersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends TeamMemberOrBuilder> getMembersOrBuilderList() {
         return this.membersBuilder_ != null ? this.membersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.members_);
      }

      public TeamMember.Builder addMembersBuilder() {
         return this.getMembersFieldBuilder().addBuilder(TeamMember.getDefaultInstance());
      }

      public TeamMember.Builder addMembersBuilder(int var1) {
         return this.getMembersFieldBuilder().addBuilder(var1, TeamMember.getDefaultInstance());
      }

      public List<TeamMember.Builder> getMembersBuilderList() {
         return this.getMembersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<TeamMember, TeamMember.Builder, TeamMemberOrBuilder> getMembersFieldBuilder() {
         if (this.membersBuilder_ == null) {
            this.membersBuilder_ = new RepeatedFieldBuilderV3<>(this.members_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.members_ = null;
         }

         return this.membersBuilder_;
      }

      public final UpdateTeamMembersMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateTeamMembersMessage.Builder)super.setUnknownFields(var1);
      }

      public final UpdateTeamMembersMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateTeamMembersMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
