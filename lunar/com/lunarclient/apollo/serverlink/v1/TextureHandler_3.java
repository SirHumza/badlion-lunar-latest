package com.lunarclient.apollo.serverlink.v1;

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
import com.lunarclient.apollo.common.v1.ResourceLocationIcon;
import com.lunarclient.apollo.common.v1.ResourceLocationIconOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OverrideServerLinkResourceMessage extends GeneratedMessageV3 implements OverrideServerLinkResourceMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ICON_FIELD_NUMBER = 1;
   private ResourceLocationIcon icon_;
   private byte memoizedIsInitialized = -1;
   private static final OverrideServerLinkResourceMessage DEFAULT_INSTANCE = new OverrideServerLinkResourceMessage();
   private static final Parser<OverrideServerLinkResourceMessage> PARSER = new AbstractParser<OverrideServerLinkResourceMessage>() {
      public OverrideServerLinkResourceMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideServerLinkResourceMessage.Builder var3 = OverrideServerLinkResourceMessage.newBuilder();

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

   private OverrideServerLinkResourceMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideServerLinkResourceMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideServerLinkResourceMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideServerLinkResourceMessage.class, OverrideServerLinkResourceMessage.Builder.class);
   }

   @Override
   public boolean hasIcon() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ResourceLocationIcon getIcon() {
      return this.icon_ == null ? ResourceLocationIcon.getDefaultInstance() : this.icon_;
   }

   @Override
   public ResourceLocationIconOrBuilder getIconOrBuilder() {
      return this.icon_ == null ? ResourceLocationIcon.getDefaultInstance() : this.icon_;
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
         var1.writeMessage(1, this.getIcon());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getIcon());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideServerLinkResourceMessage)) {
         return super.equals(var1);
      } else {
         OverrideServerLinkResourceMessage var2 = (OverrideServerLinkResourceMessage)var1;
         if (this.hasIcon() != var2.hasIcon()) {
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
      if (this.hasIcon()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getIcon().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideServerLinkResourceMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideServerLinkResourceMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideServerLinkResourceMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideServerLinkResourceMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideServerLinkResourceMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideServerLinkResourceMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideServerLinkResourceMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideServerLinkResourceMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideServerLinkResourceMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideServerLinkResourceMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideServerLinkResourceMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideServerLinkResourceMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideServerLinkResourceMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideServerLinkResourceMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideServerLinkResourceMessage.Builder newBuilder(OverrideServerLinkResourceMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideServerLinkResourceMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideServerLinkResourceMessage.Builder() : new OverrideServerLinkResourceMessage.Builder().mergeFrom(this);
   }

   protected OverrideServerLinkResourceMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideServerLinkResourceMessage.Builder(var1);
   }

   public static OverrideServerLinkResourceMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideServerLinkResourceMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideServerLinkResourceMessage> getParserForType() {
      return PARSER;
   }

   public OverrideServerLinkResourceMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OverrideServerLinkResourceMessage.Builder>
      implements OverrideServerLinkResourceMessageOrBuilder {
      private int bitField0_;
      private ResourceLocationIcon icon_;
      private SingleFieldBuilderV3<ResourceLocationIcon, ResourceLocationIcon.Builder, ResourceLocationIconOrBuilder> iconBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideServerLinkResourceMessage.class, OverrideServerLinkResourceMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OverrideServerLinkResourceMessage.alwaysUseFieldBuilders) {
            this.getIconFieldBuilder();
         }
      }

      public OverrideServerLinkResourceMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_descriptor;
      }

      public OverrideServerLinkResourceMessage getDefaultInstanceForType() {
         return OverrideServerLinkResourceMessage.getDefaultInstance();
      }

      public OverrideServerLinkResourceMessage build() {
         OverrideServerLinkResourceMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideServerLinkResourceMessage buildPartial() {
         OverrideServerLinkResourceMessage var1 = new OverrideServerLinkResourceMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideServerLinkResourceMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.icon_ = this.iconBuilder_ == null ? this.icon_ : this.iconBuilder_.build();
            var3 |= 1;
         }

         OverrideServerLinkResourceMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OverrideServerLinkResourceMessage.Builder clone() {
         return (OverrideServerLinkResourceMessage.Builder)super.clone();
      }

      public OverrideServerLinkResourceMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideServerLinkResourceMessage.Builder)super.setField(var1, var2);
      }

      public OverrideServerLinkResourceMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideServerLinkResourceMessage.Builder)super.clearField(var1);
      }

      public OverrideServerLinkResourceMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideServerLinkResourceMessage.Builder)super.clearOneof(var1);
      }

      public OverrideServerLinkResourceMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideServerLinkResourceMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideServerLinkResourceMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideServerLinkResourceMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideServerLinkResourceMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideServerLinkResourceMessage) {
            return this.mergeFrom((OverrideServerLinkResourceMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideServerLinkResourceMessage.Builder mergeFrom(OverrideServerLinkResourceMessage var1) {
         if (var1 == OverrideServerLinkResourceMessage.getDefaultInstance()) {
            return this;
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

      public OverrideServerLinkResourceMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIconFieldBuilder().getBuilder(), var2);
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
      public boolean hasIcon() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ResourceLocationIcon getIcon() {
         if (this.iconBuilder_ == null) {
            return this.icon_ == null ? ResourceLocationIcon.getDefaultInstance() : this.icon_;
         } else {
            return this.iconBuilder_.getMessage();
         }
      }

      public OverrideServerLinkResourceMessage.Builder setIcon(ResourceLocationIcon var1) {
         if (this.iconBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.icon_ = var1;
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideServerLinkResourceMessage.Builder setIcon(ResourceLocationIcon.Builder var1) {
         if (this.iconBuilder_ == null) {
            this.icon_ = var1.build();
         } else {
            this.iconBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideServerLinkResourceMessage.Builder mergeIcon(ResourceLocationIcon var1) {
         if (this.iconBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.icon_ != null && this.icon_ != ResourceLocationIcon.getDefaultInstance()) {
               this.getIconBuilder().mergeFrom(var1);
            } else {
               this.icon_ = var1;
            }
         } else {
            this.iconBuilder_.mergeFrom(var1);
         }

         if (this.icon_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public OverrideServerLinkResourceMessage.Builder clearIcon() {
         this.bitField0_ &= -2;
         this.icon_ = null;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.dispose();
            this.iconBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ResourceLocationIcon.Builder getIconBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIconFieldBuilder().getBuilder();
      }

      @Override
      public ResourceLocationIconOrBuilder getIconOrBuilder() {
         if (this.iconBuilder_ != null) {
            return this.iconBuilder_.getMessageOrBuilder();
         } else {
            return this.icon_ == null ? ResourceLocationIcon.getDefaultInstance() : this.icon_;
         }
      }

      private SingleFieldBuilderV3<ResourceLocationIcon, ResourceLocationIcon.Builder, ResourceLocationIconOrBuilder> getIconFieldBuilder() {
         if (this.iconBuilder_ == null) {
            this.iconBuilder_ = new SingleFieldBuilderV3<>(this.getIcon(), this.getParentForChildren(), this.isClean());
            this.icon_ = null;
         }

         return this.iconBuilder_;
      }

      public final OverrideServerLinkResourceMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideServerLinkResourceMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideServerLinkResourceMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideServerLinkResourceMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
