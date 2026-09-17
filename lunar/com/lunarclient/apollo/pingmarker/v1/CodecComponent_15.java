package com.lunarclient.apollo.pingmarker.v1;

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
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SetPingMarkerTypeMessage extends GeneratedMessageV3 implements SetPingMarkerTypeMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int ICON_FIELD_NUMBER = 2;
   private Icon icon_;
   private byte memoizedIsInitialized = -1;
   private static final SetPingMarkerTypeMessage DEFAULT_INSTANCE = new SetPingMarkerTypeMessage();
   private static final Parser<SetPingMarkerTypeMessage> PARSER = new AbstractParser<SetPingMarkerTypeMessage>() {
      public SetPingMarkerTypeMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetPingMarkerTypeMessage.Builder var3 = SetPingMarkerTypeMessage.newBuilder();

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

   private SetPingMarkerTypeMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetPingMarkerTypeMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetPingMarkerTypeMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetPingMarkerTypeMessage.class, SetPingMarkerTypeMessage.Builder.class);
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
   public boolean hasIcon() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Icon getIcon() {
      return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
   }

   @Override
   public IconOrBuilder getIconOrBuilder() {
      return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
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
         var1.writeMessage(2, this.getIcon());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getIcon());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SetPingMarkerTypeMessage)) {
         return super.equals(var1);
      } else {
         SetPingMarkerTypeMessage var2 = (SetPingMarkerTypeMessage)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasIcon() != var2.hasIcon()) {
            return false;
         } else {
            return this.hasIcon() && !this.getIcon().equals(var2.getIcon()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasIcon()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getIcon().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetPingMarkerTypeMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPingMarkerTypeMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPingMarkerTypeMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPingMarkerTypeMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPingMarkerTypeMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPingMarkerTypeMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPingMarkerTypeMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetPingMarkerTypeMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetPingMarkerTypeMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetPingMarkerTypeMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetPingMarkerTypeMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetPingMarkerTypeMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetPingMarkerTypeMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetPingMarkerTypeMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetPingMarkerTypeMessage.Builder newBuilder(SetPingMarkerTypeMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetPingMarkerTypeMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetPingMarkerTypeMessage.Builder() : new SetPingMarkerTypeMessage.Builder().mergeFrom(this);
   }

   protected SetPingMarkerTypeMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetPingMarkerTypeMessage.Builder(var1);
   }

   public static SetPingMarkerTypeMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetPingMarkerTypeMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetPingMarkerTypeMessage> getParserForType() {
      return PARSER;
   }

   public SetPingMarkerTypeMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetPingMarkerTypeMessage.Builder> implements SetPingMarkerTypeMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Icon icon_;
      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetPingMarkerTypeMessage.class, SetPingMarkerTypeMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SetPingMarkerTypeMessage.alwaysUseFieldBuilders) {
            this.getIconFieldBuilder();
         }
      }

      public SetPingMarkerTypeMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypeMessage_descriptor;
      }

      public SetPingMarkerTypeMessage getDefaultInstanceForType() {
         return SetPingMarkerTypeMessage.getDefaultInstance();
      }

      public SetPingMarkerTypeMessage build() {
         SetPingMarkerTypeMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetPingMarkerTypeMessage buildPartial() {
         SetPingMarkerTypeMessage var1 = new SetPingMarkerTypeMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetPingMarkerTypeMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.icon_ = this.iconBuilder_ == null ? this.icon_ : this.iconBuilder_.build();
            var3 |= 1;
         }

         SetPingMarkerTypeMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SetPingMarkerTypeMessage.Builder clone() {
         return (SetPingMarkerTypeMessage.Builder)super.clone();
      }

      public SetPingMarkerTypeMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetPingMarkerTypeMessage.Builder)super.setField(var1, var2);
      }

      public SetPingMarkerTypeMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetPingMarkerTypeMessage.Builder)super.clearField(var1);
      }

      public SetPingMarkerTypeMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetPingMarkerTypeMessage.Builder)super.clearOneof(var1);
      }

      public SetPingMarkerTypeMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetPingMarkerTypeMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetPingMarkerTypeMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetPingMarkerTypeMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public SetPingMarkerTypeMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetPingMarkerTypeMessage) {
            return this.mergeFrom((SetPingMarkerTypeMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetPingMarkerTypeMessage.Builder mergeFrom(SetPingMarkerTypeMessage var1) {
         if (var1 == SetPingMarkerTypeMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasIcon()) {
            this.mergeIcon(var1.getIcon());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetPingMarkerTypeMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIconFieldBuilder().getBuilder(), var2);
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

      public SetPingMarkerTypeMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetPingMarkerTypeMessage.Builder clearId() {
         this.id_ = SetPingMarkerTypeMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public SetPingMarkerTypeMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SetPingMarkerTypeMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasIcon() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Icon getIcon() {
         if (this.iconBuilder_ == null) {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         } else {
            return this.iconBuilder_.getMessage();
         }
      }

      public SetPingMarkerTypeMessage.Builder setIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.icon_ = var1;
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SetPingMarkerTypeMessage.Builder setIcon(Icon.Builder var1) {
         if (this.iconBuilder_ == null) {
            this.icon_ = var1.build();
         } else {
            this.iconBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SetPingMarkerTypeMessage.Builder mergeIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.icon_ != null && this.icon_ != Icon.getDefaultInstance()) {
               this.getIconBuilder().mergeFrom(var1);
            } else {
               this.icon_ = var1;
            }
         } else {
            this.iconBuilder_.mergeFrom(var1);
         }

         if (this.icon_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public SetPingMarkerTypeMessage.Builder clearIcon() {
         this.bitField0_ &= -3;
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Icon.Builder getIconBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getIconFieldBuilder().getBuilder();
      }

      @Override
      public IconOrBuilder getIconOrBuilder() {
         if (this.iconBuilder_ != null) {
            return this.iconBuilder_.getMessageOrBuilder();
         } else {
            return this.icon_ == null ? Icon.getDefaultInstance() : this.icon_;
         }
      }

      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getIconFieldBuilder() {
         if (this.iconBuilder_ == null) {
            this.iconBuilder_ = new SingleFieldBuilderV3<>(this.getIcon(), this.getParentForChildren(), this.isClean());
            this.icon_ = null;
         }

         return this.iconBuilder_;
      }

      public final SetPingMarkerTypeMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetPingMarkerTypeMessage.Builder)super.setUnknownFields(var1);
      }

      public final SetPingMarkerTypeMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetPingMarkerTypeMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
