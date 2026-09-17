package com.lunarclient.apollo.chat.v1;

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

public final class DisplayChatButtonsMessage extends GeneratedMessageV3 implements DisplayChatButtonsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CHAT_BUTTONS_FIELD_NUMBER = 1;
   private List<ChatButton> chatButtons_;
   private byte memoizedIsInitialized = -1;
   private static final DisplayChatButtonsMessage DEFAULT_INSTANCE = new DisplayChatButtonsMessage();
   private static final Parser<DisplayChatButtonsMessage> PARSER = new AbstractParser<DisplayChatButtonsMessage>() {
      public DisplayChatButtonsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayChatButtonsMessage.Builder var3 = DisplayChatButtonsMessage.newBuilder();

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

   private DisplayChatButtonsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayChatButtonsMessage() {
      this.chatButtons_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayChatButtonsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayChatButtonsMessage.class, DisplayChatButtonsMessage.Builder.class);
   }

   @Override
   public List<ChatButton> getChatButtonsList() {
      return this.chatButtons_;
   }

   @Override
   public List<? extends ChatButtonOrBuilder> getChatButtonsOrBuilderList() {
      return this.chatButtons_;
   }

   @Override
   public int getChatButtonsCount() {
      return this.chatButtons_.size();
   }

   @Override
   public ChatButton getChatButtons(int var1) {
      return this.chatButtons_.get(var1);
   }

   @Override
   public ChatButtonOrBuilder getChatButtonsOrBuilder(int var1) {
      return this.chatButtons_.get(var1);
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
      for (int var2 = 0; var2 < this.chatButtons_.size(); var2++) {
         var1.writeMessage(1, this.chatButtons_.get(var2));
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

      for (int var2 = 0; var2 < this.chatButtons_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.chatButtons_.get(var2));
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

      if (!(var1 instanceof DisplayChatButtonsMessage)) {
         return super.equals(var1);
      }

      DisplayChatButtonsMessage var2 = (DisplayChatButtonsMessage)var1;
      return !this.getChatButtonsList().equals(var2.getChatButtonsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getChatButtonsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getChatButtonsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayChatButtonsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayChatButtonsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayChatButtonsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayChatButtonsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayChatButtonsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayChatButtonsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayChatButtonsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayChatButtonsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayChatButtonsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayChatButtonsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayChatButtonsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayChatButtonsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayChatButtonsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayChatButtonsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayChatButtonsMessage.Builder newBuilder(DisplayChatButtonsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayChatButtonsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayChatButtonsMessage.Builder() : new DisplayChatButtonsMessage.Builder().mergeFrom(this);
   }

   protected DisplayChatButtonsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayChatButtonsMessage.Builder(var1);
   }

   public static DisplayChatButtonsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayChatButtonsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayChatButtonsMessage> getParserForType() {
      return PARSER;
   }

   public DisplayChatButtonsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayChatButtonsMessage.Builder> implements DisplayChatButtonsMessageOrBuilder {
      private int bitField0_;
      private List<ChatButton> chatButtons_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ChatButton, ChatButton.Builder, ChatButtonOrBuilder> chatButtonsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayChatButtonsMessage.class, DisplayChatButtonsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DisplayChatButtonsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.chatButtonsBuilder_ == null) {
            this.chatButtons_ = Collections.emptyList();
         } else {
            this.chatButtons_ = null;
            this.chatButtonsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayChatButtonsMessage_descriptor;
      }

      public DisplayChatButtonsMessage getDefaultInstanceForType() {
         return DisplayChatButtonsMessage.getDefaultInstance();
      }

      public DisplayChatButtonsMessage build() {
         DisplayChatButtonsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayChatButtonsMessage buildPartial() {
         DisplayChatButtonsMessage var1 = new DisplayChatButtonsMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(DisplayChatButtonsMessage var1) {
         if (this.chatButtonsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.chatButtons_ = Collections.unmodifiableList(this.chatButtons_);
               this.bitField0_ &= -2;
            }

            var1.chatButtons_ = this.chatButtons_;
         } else {
            var1.chatButtons_ = this.chatButtonsBuilder_.build();
         }
      }

      private void buildPartial0(DisplayChatButtonsMessage var1) {
         int var2 = this.bitField0_;
      }

      public DisplayChatButtonsMessage.Builder clone() {
         return (DisplayChatButtonsMessage.Builder)super.clone();
      }

      public DisplayChatButtonsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayChatButtonsMessage.Builder)super.setField(var1, var2);
      }

      public DisplayChatButtonsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayChatButtonsMessage.Builder)super.clearField(var1);
      }

      public DisplayChatButtonsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayChatButtonsMessage.Builder)super.clearOneof(var1);
      }

      public DisplayChatButtonsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayChatButtonsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayChatButtonsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayChatButtonsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayChatButtonsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayChatButtonsMessage) {
            return this.mergeFrom((DisplayChatButtonsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayChatButtonsMessage.Builder mergeFrom(DisplayChatButtonsMessage var1) {
         if (var1 == DisplayChatButtonsMessage.getDefaultInstance()) {
            return this;
         }

         if (this.chatButtonsBuilder_ == null) {
            if (!var1.chatButtons_.isEmpty()) {
               if (this.chatButtons_.isEmpty()) {
                  this.chatButtons_ = var1.chatButtons_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureChatButtonsIsMutable();
                  this.chatButtons_.addAll(var1.chatButtons_);
               }

               this.onChanged();
            }
         } else if (!var1.chatButtons_.isEmpty()) {
            if (this.chatButtonsBuilder_.isEmpty()) {
               this.chatButtonsBuilder_.dispose();
               this.chatButtonsBuilder_ = null;
               this.chatButtons_ = var1.chatButtons_;
               this.bitField0_ &= -2;
               this.chatButtonsBuilder_ = DisplayChatButtonsMessage.alwaysUseFieldBuilders ? this.getChatButtonsFieldBuilder() : null;
            } else {
               this.chatButtonsBuilder_.addAllMessages(var1.chatButtons_);
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

      public DisplayChatButtonsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ChatButton var5 = var1.readMessage(ChatButton.parser(), var2);
                     if (this.chatButtonsBuilder_ == null) {
                        this.ensureChatButtonsIsMutable();
                        this.chatButtons_.add(var5);
                     } else {
                        this.chatButtonsBuilder_.addMessage(var5);
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

      private void ensureChatButtonsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.chatButtons_ = new ArrayList<>(this.chatButtons_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ChatButton> getChatButtonsList() {
         return this.chatButtonsBuilder_ == null ? Collections.unmodifiableList(this.chatButtons_) : this.chatButtonsBuilder_.getMessageList();
      }

      @Override
      public int getChatButtonsCount() {
         return this.chatButtonsBuilder_ == null ? this.chatButtons_.size() : this.chatButtonsBuilder_.getCount();
      }

      @Override
      public ChatButton getChatButtons(int var1) {
         return this.chatButtonsBuilder_ == null ? this.chatButtons_.get(var1) : this.chatButtonsBuilder_.getMessage(var1);
      }

      public DisplayChatButtonsMessage.Builder setChatButtons(int var1, ChatButton var2) {
         if (this.chatButtonsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureChatButtonsIsMutable();
            this.chatButtons_.set(var1, var2);
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder setChatButtons(int var1, ChatButton.Builder var2) {
         if (this.chatButtonsBuilder_ == null) {
            this.ensureChatButtonsIsMutable();
            this.chatButtons_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder addChatButtons(ChatButton var1) {
         if (this.chatButtonsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureChatButtonsIsMutable();
            this.chatButtons_.add(var1);
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.addMessage(var1);
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder addChatButtons(int var1, ChatButton var2) {
         if (this.chatButtonsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureChatButtonsIsMutable();
            this.chatButtons_.add(var1, var2);
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder addChatButtons(ChatButton.Builder var1) {
         if (this.chatButtonsBuilder_ == null) {
            this.ensureChatButtonsIsMutable();
            this.chatButtons_.add(var1.build());
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder addChatButtons(int var1, ChatButton.Builder var2) {
         if (this.chatButtonsBuilder_ == null) {
            this.ensureChatButtonsIsMutable();
            this.chatButtons_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder addAllChatButtons(Iterable<? extends ChatButton> var1) {
         if (this.chatButtonsBuilder_ == null) {
            this.ensureChatButtonsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.chatButtons_);
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder clearChatButtons() {
         if (this.chatButtonsBuilder_ == null) {
            this.chatButtons_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.clear();
         }

         return this;
      }

      public DisplayChatButtonsMessage.Builder removeChatButtons(int var1) {
         if (this.chatButtonsBuilder_ == null) {
            this.ensureChatButtonsIsMutable();
            this.chatButtons_.remove(var1);
            this.onChanged();
         } else {
            this.chatButtonsBuilder_.remove(var1);
         }

         return this;
      }

      public ChatButton.Builder getChatButtonsBuilder(int var1) {
         return this.getChatButtonsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ChatButtonOrBuilder getChatButtonsOrBuilder(int var1) {
         return this.chatButtonsBuilder_ == null ? this.chatButtons_.get(var1) : this.chatButtonsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ChatButtonOrBuilder> getChatButtonsOrBuilderList() {
         return this.chatButtonsBuilder_ != null ? this.chatButtonsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.chatButtons_);
      }

      public ChatButton.Builder addChatButtonsBuilder() {
         return this.getChatButtonsFieldBuilder().addBuilder(ChatButton.getDefaultInstance());
      }

      public ChatButton.Builder addChatButtonsBuilder(int var1) {
         return this.getChatButtonsFieldBuilder().addBuilder(var1, ChatButton.getDefaultInstance());
      }

      public List<ChatButton.Builder> getChatButtonsBuilderList() {
         return this.getChatButtonsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ChatButton, ChatButton.Builder, ChatButtonOrBuilder> getChatButtonsFieldBuilder() {
         if (this.chatButtonsBuilder_ == null) {
            this.chatButtonsBuilder_ = new RepeatedFieldBuilderV3<>(this.chatButtons_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.chatButtons_ = null;
         }

         return this.chatButtonsBuilder_;
      }

      public final DisplayChatButtonsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayChatButtonsMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayChatButtonsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayChatButtonsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
