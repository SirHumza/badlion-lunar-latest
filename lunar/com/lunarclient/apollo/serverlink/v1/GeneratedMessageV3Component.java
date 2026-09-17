package com.lunarclient.apollo.serverlink.v1;

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

public final class AddServerLinkMessage extends GeneratedMessageV3 implements AddServerLinkMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_LINKS_FIELD_NUMBER = 1;
   private List<ServerLink> serverLinks_;
   private byte memoizedIsInitialized = -1;
   private static final AddServerLinkMessage DEFAULT_INSTANCE = new AddServerLinkMessage();
   private static final Parser<AddServerLinkMessage> PARSER = new AbstractParser<AddServerLinkMessage>() {
      public AddServerLinkMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AddServerLinkMessage.Builder var3 = AddServerLinkMessage.newBuilder();

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

   private AddServerLinkMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AddServerLinkMessage() {
      this.serverLinks_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AddServerLinkMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AddServerLinkMessage.class, AddServerLinkMessage.Builder.class);
   }

   @Override
   public List<ServerLink> getServerLinksList() {
      return this.serverLinks_;
   }

   @Override
   public List<? extends ServerLinkOrBuilder> getServerLinksOrBuilderList() {
      return this.serverLinks_;
   }

   @Override
   public int getServerLinksCount() {
      return this.serverLinks_.size();
   }

   @Override
   public ServerLink getServerLinks(int var1) {
      return this.serverLinks_.get(var1);
   }

   @Override
   public ServerLinkOrBuilder getServerLinksOrBuilder(int var1) {
      return this.serverLinks_.get(var1);
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
      for (int var2 = 0; var2 < this.serverLinks_.size(); var2++) {
         var1.writeMessage(1, this.serverLinks_.get(var2));
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

      for (int var2 = 0; var2 < this.serverLinks_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.serverLinks_.get(var2));
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

      if (!(var1 instanceof AddServerLinkMessage)) {
         return super.equals(var1);
      }

      AddServerLinkMessage var2 = (AddServerLinkMessage)var1;
      return !this.getServerLinksList().equals(var2.getServerLinksList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getServerLinksCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getServerLinksList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AddServerLinkMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddServerLinkMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddServerLinkMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddServerLinkMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddServerLinkMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddServerLinkMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddServerLinkMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddServerLinkMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AddServerLinkMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AddServerLinkMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AddServerLinkMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddServerLinkMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AddServerLinkMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AddServerLinkMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AddServerLinkMessage.Builder newBuilder(AddServerLinkMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AddServerLinkMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AddServerLinkMessage.Builder() : new AddServerLinkMessage.Builder().mergeFrom(this);
   }

   protected AddServerLinkMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AddServerLinkMessage.Builder(var1);
   }

   public static AddServerLinkMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AddServerLinkMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<AddServerLinkMessage> getParserForType() {
      return PARSER;
   }

   public AddServerLinkMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AddServerLinkMessage.Builder> implements AddServerLinkMessageOrBuilder {
      private int bitField0_;
      private List<ServerLink> serverLinks_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerLink, ServerLink.Builder, ServerLinkOrBuilder> serverLinksBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AddServerLinkMessage.class, AddServerLinkMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public AddServerLinkMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.serverLinksBuilder_ == null) {
            this.serverLinks_ = Collections.emptyList();
         } else {
            this.serverLinks_ = null;
            this.serverLinksBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_descriptor;
      }

      public AddServerLinkMessage getDefaultInstanceForType() {
         return AddServerLinkMessage.getDefaultInstance();
      }

      public AddServerLinkMessage build() {
         AddServerLinkMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AddServerLinkMessage buildPartial() {
         AddServerLinkMessage var1 = new AddServerLinkMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(AddServerLinkMessage var1) {
         if (this.serverLinksBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.serverLinks_ = Collections.unmodifiableList(this.serverLinks_);
               this.bitField0_ &= -2;
            }

            var1.serverLinks_ = this.serverLinks_;
         } else {
            var1.serverLinks_ = this.serverLinksBuilder_.build();
         }
      }

      private void buildPartial0(AddServerLinkMessage var1) {
         int var2 = this.bitField0_;
      }

      public AddServerLinkMessage.Builder clone() {
         return (AddServerLinkMessage.Builder)super.clone();
      }

      public AddServerLinkMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddServerLinkMessage.Builder)super.setField(var1, var2);
      }

      public AddServerLinkMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AddServerLinkMessage.Builder)super.clearField(var1);
      }

      public AddServerLinkMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AddServerLinkMessage.Builder)super.clearOneof(var1);
      }

      public AddServerLinkMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AddServerLinkMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AddServerLinkMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddServerLinkMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public AddServerLinkMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof AddServerLinkMessage) {
            return this.mergeFrom((AddServerLinkMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AddServerLinkMessage.Builder mergeFrom(AddServerLinkMessage var1) {
         if (var1 == AddServerLinkMessage.getDefaultInstance()) {
            return this;
         }

         if (this.serverLinksBuilder_ == null) {
            if (!var1.serverLinks_.isEmpty()) {
               if (this.serverLinks_.isEmpty()) {
                  this.serverLinks_ = var1.serverLinks_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureServerLinksIsMutable();
                  this.serverLinks_.addAll(var1.serverLinks_);
               }

               this.onChanged();
            }
         } else if (!var1.serverLinks_.isEmpty()) {
            if (this.serverLinksBuilder_.isEmpty()) {
               this.serverLinksBuilder_.dispose();
               this.serverLinksBuilder_ = null;
               this.serverLinks_ = var1.serverLinks_;
               this.bitField0_ &= -2;
               this.serverLinksBuilder_ = AddServerLinkMessage.alwaysUseFieldBuilders ? this.getServerLinksFieldBuilder() : null;
            } else {
               this.serverLinksBuilder_.addAllMessages(var1.serverLinks_);
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

      public AddServerLinkMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ServerLink var5 = var1.readMessage(ServerLink.parser(), var2);
                     if (this.serverLinksBuilder_ == null) {
                        this.ensureServerLinksIsMutable();
                        this.serverLinks_.add(var5);
                     } else {
                        this.serverLinksBuilder_.addMessage(var5);
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

      private void ensureServerLinksIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.serverLinks_ = new ArrayList<>(this.serverLinks_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ServerLink> getServerLinksList() {
         return this.serverLinksBuilder_ == null ? Collections.unmodifiableList(this.serverLinks_) : this.serverLinksBuilder_.getMessageList();
      }

      @Override
      public int getServerLinksCount() {
         return this.serverLinksBuilder_ == null ? this.serverLinks_.size() : this.serverLinksBuilder_.getCount();
      }

      @Override
      public ServerLink getServerLinks(int var1) {
         return this.serverLinksBuilder_ == null ? this.serverLinks_.get(var1) : this.serverLinksBuilder_.getMessage(var1);
      }

      public AddServerLinkMessage.Builder setServerLinks(int var1, ServerLink var2) {
         if (this.serverLinksBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureServerLinksIsMutable();
            this.serverLinks_.set(var1, var2);
            this.onChanged();
         } else {
            this.serverLinksBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public AddServerLinkMessage.Builder setServerLinks(int var1, ServerLink.Builder var2) {
         if (this.serverLinksBuilder_ == null) {
            this.ensureServerLinksIsMutable();
            this.serverLinks_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.serverLinksBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public AddServerLinkMessage.Builder addServerLinks(ServerLink var1) {
         if (this.serverLinksBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureServerLinksIsMutable();
            this.serverLinks_.add(var1);
            this.onChanged();
         } else {
            this.serverLinksBuilder_.addMessage(var1);
         }

         return this;
      }

      public AddServerLinkMessage.Builder addServerLinks(int var1, ServerLink var2) {
         if (this.serverLinksBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureServerLinksIsMutable();
            this.serverLinks_.add(var1, var2);
            this.onChanged();
         } else {
            this.serverLinksBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public AddServerLinkMessage.Builder addServerLinks(ServerLink.Builder var1) {
         if (this.serverLinksBuilder_ == null) {
            this.ensureServerLinksIsMutable();
            this.serverLinks_.add(var1.build());
            this.onChanged();
         } else {
            this.serverLinksBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public AddServerLinkMessage.Builder addServerLinks(int var1, ServerLink.Builder var2) {
         if (this.serverLinksBuilder_ == null) {
            this.ensureServerLinksIsMutable();
            this.serverLinks_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.serverLinksBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public AddServerLinkMessage.Builder addAllServerLinks(Iterable<? extends ServerLink> var1) {
         if (this.serverLinksBuilder_ == null) {
            this.ensureServerLinksIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.serverLinks_);
            this.onChanged();
         } else {
            this.serverLinksBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public AddServerLinkMessage.Builder clearServerLinks() {
         if (this.serverLinksBuilder_ == null) {
            this.serverLinks_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.serverLinksBuilder_.clear();
         }

         return this;
      }

      public AddServerLinkMessage.Builder removeServerLinks(int var1) {
         if (this.serverLinksBuilder_ == null) {
            this.ensureServerLinksIsMutable();
            this.serverLinks_.remove(var1);
            this.onChanged();
         } else {
            this.serverLinksBuilder_.remove(var1);
         }

         return this;
      }

      public ServerLink.Builder getServerLinksBuilder(int var1) {
         return this.getServerLinksFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerLinkOrBuilder getServerLinksOrBuilder(int var1) {
         return this.serverLinksBuilder_ == null ? this.serverLinks_.get(var1) : this.serverLinksBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerLinkOrBuilder> getServerLinksOrBuilderList() {
         return this.serverLinksBuilder_ != null ? this.serverLinksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.serverLinks_);
      }

      public ServerLink.Builder addServerLinksBuilder() {
         return this.getServerLinksFieldBuilder().addBuilder(ServerLink.getDefaultInstance());
      }

      public ServerLink.Builder addServerLinksBuilder(int var1) {
         return this.getServerLinksFieldBuilder().addBuilder(var1, ServerLink.getDefaultInstance());
      }

      public List<ServerLink.Builder> getServerLinksBuilderList() {
         return this.getServerLinksFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerLink, ServerLink.Builder, ServerLinkOrBuilder> getServerLinksFieldBuilder() {
         if (this.serverLinksBuilder_ == null) {
            this.serverLinksBuilder_ = new RepeatedFieldBuilderV3<>(this.serverLinks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.serverLinks_ = null;
         }

         return this.serverLinksBuilder_;
      }

      public final AddServerLinkMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AddServerLinkMessage.Builder)super.setUnknownFields(var1);
      }

      public final AddServerLinkMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AddServerLinkMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
