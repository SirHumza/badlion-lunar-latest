package com.lunarclient.websocket.cosmetic.v2;

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
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UpdateLunarPlusColorRequest extends GeneratedMessageV3 implements UpdateLunarPlusColorRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLUS_COLOR_FIELD_NUMBER = 3;
   private Color plusColor_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateLunarPlusColorRequest DEFAULT_INSTANCE = new UpdateLunarPlusColorRequest();
   private static final Parser<UpdateLunarPlusColorRequest> PARSER = new AbstractParser<UpdateLunarPlusColorRequest>() {
      public UpdateLunarPlusColorRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateLunarPlusColorRequest.Builder var3 = UpdateLunarPlusColorRequest.newBuilder();

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

   private UpdateLunarPlusColorRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateLunarPlusColorRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateLunarPlusColorRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateLunarPlusColorRequest.class, UpdateLunarPlusColorRequest.Builder.class);
   }

   @Override
   public boolean hasPlusColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getPlusColor() {
      return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
   }

   @Override
   public ColorOrBuilder getPlusColorOrBuilder() {
      return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
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
         var1.writeMessage(3, this.getPlusColor());
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
         var1 += CodedOutputStream.computeMessageSize(3, this.getPlusColor());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateLunarPlusColorRequest)) {
         return super.equals(var1);
      } else {
         UpdateLunarPlusColorRequest var2 = (UpdateLunarPlusColorRequest)var1;
         if (this.hasPlusColor() != var2.hasPlusColor()) {
            return false;
         } else {
            return this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateLunarPlusColorRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLunarPlusColorRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLunarPlusColorRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLunarPlusColorRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLunarPlusColorRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLunarPlusColorRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLunarPlusColorRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLunarPlusColorRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateLunarPlusColorRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateLunarPlusColorRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateLunarPlusColorRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLunarPlusColorRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateLunarPlusColorRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateLunarPlusColorRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateLunarPlusColorRequest.Builder newBuilder(UpdateLunarPlusColorRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateLunarPlusColorRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateLunarPlusColorRequest.Builder() : new UpdateLunarPlusColorRequest.Builder().mergeFrom(this);
   }

   protected UpdateLunarPlusColorRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateLunarPlusColorRequest.Builder(var1);
   }

   public static UpdateLunarPlusColorRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateLunarPlusColorRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateLunarPlusColorRequest> getParserForType() {
      return PARSER;
   }

   public UpdateLunarPlusColorRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateLunarPlusColorRequest.Builder> implements UpdateLunarPlusColorRequestOrBuilder {
      private int bitField0_;
      private Color plusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateLunarPlusColorRequest.class, UpdateLunarPlusColorRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateLunarPlusColorRequest.alwaysUseFieldBuilders) {
            this.getPlusColorFieldBuilder();
         }
      }

      public UpdateLunarPlusColorRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UpdateLunarPlusColorRequest_descriptor;
      }

      public UpdateLunarPlusColorRequest getDefaultInstanceForType() {
         return UpdateLunarPlusColorRequest.getDefaultInstance();
      }

      public UpdateLunarPlusColorRequest build() {
         UpdateLunarPlusColorRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateLunarPlusColorRequest buildPartial() {
         UpdateLunarPlusColorRequest var1 = new UpdateLunarPlusColorRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateLunarPlusColorRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 1;
         }

         UpdateLunarPlusColorRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateLunarPlusColorRequest.Builder clone() {
         return (UpdateLunarPlusColorRequest.Builder)super.clone();
      }

      public UpdateLunarPlusColorRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLunarPlusColorRequest.Builder)super.setField(var1, var2);
      }

      public UpdateLunarPlusColorRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateLunarPlusColorRequest.Builder)super.clearField(var1);
      }

      public UpdateLunarPlusColorRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateLunarPlusColorRequest.Builder)super.clearOneof(var1);
      }

      public UpdateLunarPlusColorRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateLunarPlusColorRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateLunarPlusColorRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLunarPlusColorRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateLunarPlusColorRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateLunarPlusColorRequest) {
            return this.mergeFrom((UpdateLunarPlusColorRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateLunarPlusColorRequest.Builder mergeFrom(UpdateLunarPlusColorRequest var1) {
         if (var1 == UpdateLunarPlusColorRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlusColor()) {
            this.mergePlusColor(var1.getPlusColor());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateLunarPlusColorRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 26:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
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
      public boolean hasPlusColor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Color getPlusColor() {
         if (this.plusColorBuilder_ == null) {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         } else {
            return this.plusColorBuilder_.getMessage();
         }
      }

      public UpdateLunarPlusColorRequest.Builder setPlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.plusColor_ = var1;
         } else {
            this.plusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLunarPlusColorRequest.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLunarPlusColorRequest.Builder mergePlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
               this.getPlusColorBuilder().mergeFrom(var1);
            } else {
               this.plusColor_ = var1;
            }
         } else {
            this.plusColorBuilder_.mergeFrom(var1);
         }

         if (this.plusColor_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UpdateLunarPlusColorRequest.Builder clearPlusColor() {
         this.bitField0_ &= -2;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPlusColorBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlusColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPlusColorOrBuilder() {
         if (this.plusColorBuilder_ != null) {
            return this.plusColorBuilder_.getMessageOrBuilder();
         } else {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlusColorFieldBuilder() {
         if (this.plusColorBuilder_ == null) {
            this.plusColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlusColor(), this.getParentForChildren(), this.isClean());
            this.plusColor_ = null;
         }

         return this.plusColorBuilder_;
      }

      public final UpdateLunarPlusColorRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateLunarPlusColorRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateLunarPlusColorRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateLunarPlusColorRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
