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
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.button.v1.ButtonUpdateOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateChatButtonMessage extends GeneratedMessageV3 implements UpdateChatButtonMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int UPDATE_FIELD_NUMBER = 2;
   private ButtonUpdate update_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateChatButtonMessage DEFAULT_INSTANCE = new UpdateChatButtonMessage();
   private static final Parser<UpdateChatButtonMessage> PARSER = new AbstractParser<UpdateChatButtonMessage>() {
      public UpdateChatButtonMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateChatButtonMessage.Builder var3 = UpdateChatButtonMessage.newBuilder();

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

   private UpdateChatButtonMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateChatButtonMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateChatButtonMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateChatButtonMessage.class, UpdateChatButtonMessage.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasUpdate() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ButtonUpdate getUpdate() {
      return this.update_ == null ? ButtonUpdate.getDefaultInstance() : this.update_;
   }

   @Override
   public ButtonUpdateOrBuilder getUpdateOrBuilder() {
      return this.update_ == null ? ButtonUpdate.getDefaultInstance() : this.update_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getUpdate());
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getUpdate());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateChatButtonMessage)) {
         return super.equals(var1);
      } else {
         UpdateChatButtonMessage var2 = (UpdateChatButtonMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasUpdate() != var2.hasUpdate()) {
            return false;
         } else {
            return this.hasUpdate() && !this.getUpdate().equals(var2.getUpdate()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getId().hashCode();
      if (this.hasUpdate()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getUpdate().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateChatButtonMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateChatButtonMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateChatButtonMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateChatButtonMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateChatButtonMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateChatButtonMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateChatButtonMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateChatButtonMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateChatButtonMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateChatButtonMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateChatButtonMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateChatButtonMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateChatButtonMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateChatButtonMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateChatButtonMessage.Builder newBuilder(UpdateChatButtonMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateChatButtonMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateChatButtonMessage.Builder() : new UpdateChatButtonMessage.Builder().mergeFrom(this);
   }

   protected UpdateChatButtonMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateChatButtonMessage.Builder(var1);
   }

   public static UpdateChatButtonMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateChatButtonMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateChatButtonMessage> getParserForType() {
      return PARSER;
   }

   public UpdateChatButtonMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateChatButtonMessage.Builder> implements UpdateChatButtonMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private ButtonUpdate update_;
      private SingleFieldBuilderV3<ButtonUpdate, ButtonUpdate.Builder, ButtonUpdateOrBuilder> updateBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateChatButtonMessage.class, UpdateChatButtonMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateChatButtonMessage.alwaysUseFieldBuilders) {
            this.getUpdateFieldBuilder();
         }
      }

      public UpdateChatButtonMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.update_ = null;
         if (this.updateBuilder_ != null) {
            this.updateBuilder_.dispose();
            this.updateBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_UpdateChatButtonMessage_descriptor;
      }

      public UpdateChatButtonMessage getDefaultInstanceForType() {
         return UpdateChatButtonMessage.getDefaultInstance();
      }

      public UpdateChatButtonMessage build() {
         UpdateChatButtonMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateChatButtonMessage buildPartial() {
         UpdateChatButtonMessage var1 = new UpdateChatButtonMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateChatButtonMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.update_ = this.updateBuilder_ == null ? this.update_ : this.updateBuilder_.build();
            var3 |= 1;
         }

         UpdateChatButtonMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateChatButtonMessage.Builder clone() {
         return (UpdateChatButtonMessage.Builder)super.clone();
      }

      public UpdateChatButtonMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateChatButtonMessage.Builder)super.setField(var1, var2);
      }

      public UpdateChatButtonMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateChatButtonMessage.Builder)super.clearField(var1);
      }

      public UpdateChatButtonMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateChatButtonMessage.Builder)super.clearOneof(var1);
      }

      public UpdateChatButtonMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateChatButtonMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateChatButtonMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateChatButtonMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateChatButtonMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateChatButtonMessage) {
            return this.mergeFrom((UpdateChatButtonMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateChatButtonMessage.Builder mergeFrom(UpdateChatButtonMessage var1) {
         if (var1 == UpdateChatButtonMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasUpdate()) {
            this.mergeUpdate(var1.getUpdate());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateChatButtonMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getUpdateFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UpdateChatButtonMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateChatButtonMessage.Builder clearId() {
         this.id_ = UpdateChatButtonMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public UpdateChatButtonMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UpdateChatButtonMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasUpdate() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ButtonUpdate getUpdate() {
         if (this.updateBuilder_ == null) {
            return this.update_ == null ? ButtonUpdate.getDefaultInstance() : this.update_;
         } else {
            return this.updateBuilder_.getMessage();
         }
      }

      public UpdateChatButtonMessage.Builder setUpdate(ButtonUpdate var1) {
         if (this.updateBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.update_ = var1;
         } else {
            this.updateBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateChatButtonMessage.Builder setUpdate(ButtonUpdate.Builder var1) {
         if (this.updateBuilder_ == null) {
            this.update_ = var1.build();
         } else {
            this.updateBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateChatButtonMessage.Builder mergeUpdate(ButtonUpdate var1) {
         if (this.updateBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.update_ != null && this.update_ != ButtonUpdate.getDefaultInstance()) {
               this.getUpdateBuilder().mergeFrom(var1);
            } else {
               this.update_ = var1;
            }
         } else {
            this.updateBuilder_.mergeFrom(var1);
         }

         if (this.update_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public UpdateChatButtonMessage.Builder clearUpdate() {
         this.bitField0_ &= -3;
         this.update_ = null;
         if (this.updateBuilder_ != null) {
            this.updateBuilder_.dispose();
            this.updateBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ButtonUpdate.Builder getUpdateBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getUpdateFieldBuilder().getBuilder();
      }

      @Override
      public ButtonUpdateOrBuilder getUpdateOrBuilder() {
         if (this.updateBuilder_ != null) {
            return this.updateBuilder_.getMessageOrBuilder();
         } else {
            return this.update_ == null ? ButtonUpdate.getDefaultInstance() : this.update_;
         }
      }

      private SingleFieldBuilderV3<ButtonUpdate, ButtonUpdate.Builder, ButtonUpdateOrBuilder> getUpdateFieldBuilder() {
         if (this.updateBuilder_ == null) {
            this.updateBuilder_ = new SingleFieldBuilderV3<>(this.getUpdate(), this.getParentForChildren(), this.isClean());
            this.update_ = null;
         }

         return this.updateBuilder_;
      }

      public final UpdateChatButtonMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateChatButtonMessage.Builder)super.setUnknownFields(var1);
      }

      public final UpdateChatButtonMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateChatButtonMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
