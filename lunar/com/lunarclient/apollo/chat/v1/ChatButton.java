package com.lunarclient.apollo.chat.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.button.v1.Button;
import com.lunarclient.apollo.button.v1.ButtonOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ChatButton extends GeneratedMessageV3 implements ChatButtonOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int BUTTON_FIELD_NUMBER = 1;
   private Button button_;
   private byte memoizedIsInitialized = -1;
   private static final ChatButton DEFAULT_INSTANCE = new ChatButton();
   private static final Parser<ChatButton> PARSER = new AbstractParser<ChatButton>() {
      public ChatButton parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ChatButton.Builder var3 = ChatButton.newBuilder();

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

   private ChatButton(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ChatButton() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ChatButton();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ChatButton_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ChatButton_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ChatButton.class, ChatButton.Builder.class);
   }

   @Override
   public boolean hasButton() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Button getButton() {
      return this.button_ == null ? Button.getDefaultInstance() : this.button_;
   }

   @Override
   public ButtonOrBuilder getButtonOrBuilder() {
      return this.button_ == null ? Button.getDefaultInstance() : this.button_;
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
         var1.writeMessage(1, this.getButton());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getButton());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ChatButton)) {
         return super.equals(var1);
      } else {
         ChatButton var2 = (ChatButton)var1;
         if (this.hasButton() != var2.hasButton()) {
            return false;
         } else {
            return this.hasButton() && !this.getButton().equals(var2.getButton()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasButton()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getButton().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ChatButton parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ChatButton parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ChatButton parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ChatButton parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ChatButton parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ChatButton parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ChatButton parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ChatButton parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ChatButton parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ChatButton parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ChatButton parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ChatButton parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ChatButton.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ChatButton.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ChatButton.Builder newBuilder(ChatButton var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ChatButton.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ChatButton.Builder() : new ChatButton.Builder().mergeFrom(this);
   }

   protected ChatButton.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ChatButton.Builder(var1);
   }

   public static ChatButton getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ChatButton> parser() {
      return PARSER;
   }

   @Override
   public Parser<ChatButton> getParserForType() {
      return PARSER;
   }

   public ChatButton getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ChatButton.Builder> implements ChatButtonOrBuilder {
      private int bitField0_;
      private Button button_;
      private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> buttonBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ChatButton_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ChatButton_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ChatButton.class, ChatButton.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ChatButton.alwaysUseFieldBuilders) {
            this.getButtonFieldBuilder();
         }
      }

      public ChatButton.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.button_ = null;
         if (this.buttonBuilder_ != null) {
            this.buttonBuilder_.dispose();
            this.buttonBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ChatButton_descriptor;
      }

      public ChatButton getDefaultInstanceForType() {
         return ChatButton.getDefaultInstance();
      }

      public ChatButton build() {
         ChatButton var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ChatButton buildPartial() {
         ChatButton var1 = new ChatButton(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ChatButton var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.button_ = this.buttonBuilder_ == null ? this.button_ : this.buttonBuilder_.build();
            var3 |= 1;
         }

         ChatButton var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ChatButton.Builder clone() {
         return (ChatButton.Builder)super.clone();
      }

      public ChatButton.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ChatButton.Builder)super.setField(var1, var2);
      }

      public ChatButton.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ChatButton.Builder)super.clearField(var1);
      }

      public ChatButton.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ChatButton.Builder)super.clearOneof(var1);
      }

      public ChatButton.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ChatButton.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ChatButton.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ChatButton.Builder)super.addRepeatedField(var1, var2);
      }

      public ChatButton.Builder mergeFrom(Message var1) {
         if (var1 instanceof ChatButton) {
            return this.mergeFrom((ChatButton)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ChatButton.Builder mergeFrom(ChatButton var1) {
         if (var1 == ChatButton.getDefaultInstance()) {
            return this;
         }

         if (var1.hasButton()) {
            this.mergeButton(var1.getButton());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ChatButton.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getButtonFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
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
      public boolean hasButton() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Button getButton() {
         if (this.buttonBuilder_ == null) {
            return this.button_ == null ? Button.getDefaultInstance() : this.button_;
         } else {
            return this.buttonBuilder_.getMessage();
         }
      }

      public ChatButton.Builder setButton(Button var1) {
         if (this.buttonBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.button_ = var1;
         } else {
            this.buttonBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ChatButton.Builder setButton(Button.Builder var1) {
         if (this.buttonBuilder_ == null) {
            this.button_ = var1.build();
         } else {
            this.buttonBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ChatButton.Builder mergeButton(Button var1) {
         if (this.buttonBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.button_ != null && this.button_ != Button.getDefaultInstance()) {
               this.getButtonBuilder().mergeFrom(var1);
            } else {
               this.button_ = var1;
            }
         } else {
            this.buttonBuilder_.mergeFrom(var1);
         }

         if (this.button_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ChatButton.Builder clearButton() {
         this.bitField0_ &= -2;
         this.button_ = null;
         if (this.buttonBuilder_ != null) {
            this.buttonBuilder_.dispose();
            this.buttonBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Button.Builder getButtonBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getButtonFieldBuilder().getBuilder();
      }

      @Override
      public ButtonOrBuilder getButtonOrBuilder() {
         if (this.buttonBuilder_ != null) {
            return this.buttonBuilder_.getMessageOrBuilder();
         } else {
            return this.button_ == null ? Button.getDefaultInstance() : this.button_;
         }
      }

      private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> getButtonFieldBuilder() {
         if (this.buttonBuilder_ == null) {
            this.buttonBuilder_ = new SingleFieldBuilderV3<>(this.getButton(), this.getParentForChildren(), this.isClean());
            this.button_ = null;
         }

         return this.buttonBuilder_;
      }

      public final ChatButton.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ChatButton.Builder)super.setUnknownFields(var1);
      }

      public final ChatButton.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ChatButton.Builder)super.mergeUnknownFields(var1);
      }
   }
}
