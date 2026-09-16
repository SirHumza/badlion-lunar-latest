package com.lunarclient.apollo.inventory.v1;

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

public final class UpdateInventoryButtonMessage extends GeneratedMessageV3 implements UpdateInventoryButtonMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int UPDATE_FIELD_NUMBER = 2;
   private ButtonUpdate update_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateInventoryButtonMessage DEFAULT_INSTANCE = new UpdateInventoryButtonMessage();
   private static final Parser<UpdateInventoryButtonMessage> PARSER = new AbstractParser<UpdateInventoryButtonMessage>() {
      public UpdateInventoryButtonMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateInventoryButtonMessage.Builder var3 = UpdateInventoryButtonMessage.newBuilder();

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

   private UpdateInventoryButtonMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateInventoryButtonMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateInventoryButtonMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateInventoryButtonMessage.class, UpdateInventoryButtonMessage.Builder.class);
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
      } else if (!(var1 instanceof UpdateInventoryButtonMessage)) {
         return super.equals(var1);
      } else {
         UpdateInventoryButtonMessage var2 = (UpdateInventoryButtonMessage)var1;
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

   public static UpdateInventoryButtonMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateInventoryButtonMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateInventoryButtonMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateInventoryButtonMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateInventoryButtonMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateInventoryButtonMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateInventoryButtonMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateInventoryButtonMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateInventoryButtonMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateInventoryButtonMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateInventoryButtonMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateInventoryButtonMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateInventoryButtonMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateInventoryButtonMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateInventoryButtonMessage.Builder newBuilder(UpdateInventoryButtonMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateInventoryButtonMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateInventoryButtonMessage.Builder() : new UpdateInventoryButtonMessage.Builder().mergeFrom(this);
   }

   protected UpdateInventoryButtonMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateInventoryButtonMessage.Builder(var1);
   }

   public static UpdateInventoryButtonMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateInventoryButtonMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateInventoryButtonMessage> getParserForType() {
      return PARSER;
   }

   public UpdateInventoryButtonMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateInventoryButtonMessage.Builder> implements UpdateInventoryButtonMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private ButtonUpdate update_;
      private SingleFieldBuilderV3<ButtonUpdate, ButtonUpdate.Builder, ButtonUpdateOrBuilder> updateBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateInventoryButtonMessage.class, UpdateInventoryButtonMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateInventoryButtonMessage.alwaysUseFieldBuilders) {
            this.getUpdateFieldBuilder();
         }
      }

      public UpdateInventoryButtonMessage.Builder clear() {
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
         return SchemaProto.internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_descriptor;
      }

      public UpdateInventoryButtonMessage getDefaultInstanceForType() {
         return UpdateInventoryButtonMessage.getDefaultInstance();
      }

      public UpdateInventoryButtonMessage build() {
         UpdateInventoryButtonMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateInventoryButtonMessage buildPartial() {
         UpdateInventoryButtonMessage var1 = new UpdateInventoryButtonMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateInventoryButtonMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.update_ = this.updateBuilder_ == null ? this.update_ : this.updateBuilder_.build();
            var3 |= 1;
         }

         UpdateInventoryButtonMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateInventoryButtonMessage.Builder clone() {
         return (UpdateInventoryButtonMessage.Builder)super.clone();
      }

      public UpdateInventoryButtonMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateInventoryButtonMessage.Builder)super.setField(var1, var2);
      }

      public UpdateInventoryButtonMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateInventoryButtonMessage.Builder)super.clearField(var1);
      }

      public UpdateInventoryButtonMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateInventoryButtonMessage.Builder)super.clearOneof(var1);
      }

      public UpdateInventoryButtonMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateInventoryButtonMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateInventoryButtonMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateInventoryButtonMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateInventoryButtonMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateInventoryButtonMessage) {
            return this.mergeFrom((UpdateInventoryButtonMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateInventoryButtonMessage.Builder mergeFrom(UpdateInventoryButtonMessage var1) {
         if (var1 == UpdateInventoryButtonMessage.getDefaultInstance()) {
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

      public UpdateInventoryButtonMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public UpdateInventoryButtonMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateInventoryButtonMessage.Builder clearId() {
         this.id_ = UpdateInventoryButtonMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public UpdateInventoryButtonMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UpdateInventoryButtonMessage.checkByteStringIsUtf8(var1);
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

      public UpdateInventoryButtonMessage.Builder setUpdate(ButtonUpdate var1) {
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

      public UpdateInventoryButtonMessage.Builder setUpdate(ButtonUpdate.Builder var1) {
         if (this.updateBuilder_ == null) {
            this.update_ = var1.build();
         } else {
            this.updateBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateInventoryButtonMessage.Builder mergeUpdate(ButtonUpdate var1) {
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

      public UpdateInventoryButtonMessage.Builder clearUpdate() {
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

      public final UpdateInventoryButtonMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateInventoryButtonMessage.Builder)super.setUnknownFields(var1);
      }

      public final UpdateInventoryButtonMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateInventoryButtonMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
