package com.lunarclient.websocket.radio.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SetRadioPlayingVisibilityRequest extends GeneratedMessageV3 implements SetRadioPlayingVisibilityRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VISIBILITY_FIELD_NUMBER = 1;
   private int visibility_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetRadioPlayingVisibilityRequest DEFAULT_INSTANCE = new SetRadioPlayingVisibilityRequest();
   private static final Parser<SetRadioPlayingVisibilityRequest> PARSER = new AbstractParser<SetRadioPlayingVisibilityRequest>() {
      public SetRadioPlayingVisibilityRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetRadioPlayingVisibilityRequest.Builder var3 = SetRadioPlayingVisibilityRequest.newBuilder();

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

   private SetRadioPlayingVisibilityRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetRadioPlayingVisibilityRequest() {
      this.visibility_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetRadioPlayingVisibilityRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetRadioPlayingVisibilityRequest.class, SetRadioPlayingVisibilityRequest.Builder.class);
   }

   @Override
   public int getVisibilityValue() {
      return this.visibility_;
   }

   @Override
   public RadioPlayingVisibility getVisibility() {
      RadioPlayingVisibility var1 = RadioPlayingVisibility.forNumber(this.visibility_);
      return var1 == null ? RadioPlayingVisibility.UNRECOGNIZED : var1;
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
      if (this.visibility_ != RadioPlayingVisibility.RADIO_PLAYING_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.visibility_);
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
      if (this.visibility_ != RadioPlayingVisibility.RADIO_PLAYING_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.visibility_);
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

      if (!(var1 instanceof SetRadioPlayingVisibilityRequest)) {
         return super.equals(var1);
      }

      SetRadioPlayingVisibilityRequest var2 = (SetRadioPlayingVisibilityRequest)var1;
      return this.visibility_ != var2.visibility_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.visibility_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetRadioPlayingVisibilityRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetRadioPlayingVisibilityRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetRadioPlayingVisibilityRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetRadioPlayingVisibilityRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetRadioPlayingVisibilityRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetRadioPlayingVisibilityRequest.Builder newBuilder(SetRadioPlayingVisibilityRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetRadioPlayingVisibilityRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetRadioPlayingVisibilityRequest.Builder() : new SetRadioPlayingVisibilityRequest.Builder().mergeFrom(this);
   }

   protected SetRadioPlayingVisibilityRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetRadioPlayingVisibilityRequest.Builder(var1);
   }

   public static SetRadioPlayingVisibilityRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetRadioPlayingVisibilityRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetRadioPlayingVisibilityRequest> getParserForType() {
      return PARSER;
   }

   public SetRadioPlayingVisibilityRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetRadioPlayingVisibilityRequest.Builder>
      implements SetRadioPlayingVisibilityRequestOrBuilder {
      private int bitField0_;
      private int visibility_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetRadioPlayingVisibilityRequest.class, SetRadioPlayingVisibilityRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetRadioPlayingVisibilityRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.visibility_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_descriptor;
      }

      public SetRadioPlayingVisibilityRequest getDefaultInstanceForType() {
         return SetRadioPlayingVisibilityRequest.getDefaultInstance();
      }

      public SetRadioPlayingVisibilityRequest build() {
         SetRadioPlayingVisibilityRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetRadioPlayingVisibilityRequest buildPartial() {
         SetRadioPlayingVisibilityRequest var1 = new SetRadioPlayingVisibilityRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetRadioPlayingVisibilityRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.visibility_ = this.visibility_;
         }
      }

      public SetRadioPlayingVisibilityRequest.Builder clone() {
         return (SetRadioPlayingVisibilityRequest.Builder)super.clone();
      }

      public SetRadioPlayingVisibilityRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.setField(var1, var2);
      }

      public SetRadioPlayingVisibilityRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.clearField(var1);
      }

      public SetRadioPlayingVisibilityRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.clearOneof(var1);
      }

      public SetRadioPlayingVisibilityRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetRadioPlayingVisibilityRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetRadioPlayingVisibilityRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetRadioPlayingVisibilityRequest) {
            return this.mergeFrom((SetRadioPlayingVisibilityRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetRadioPlayingVisibilityRequest.Builder mergeFrom(SetRadioPlayingVisibilityRequest var1) {
         if (var1 == SetRadioPlayingVisibilityRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.visibility_ != 0) {
            this.setVisibilityValue(var1.getVisibilityValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetRadioPlayingVisibilityRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.visibility_ = var1.readEnum();
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
      public int getVisibilityValue() {
         return this.visibility_;
      }

      public SetRadioPlayingVisibilityRequest.Builder setVisibilityValue(int var1) {
         this.visibility_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public RadioPlayingVisibility getVisibility() {
         RadioPlayingVisibility var1 = RadioPlayingVisibility.forNumber(this.visibility_);
         return var1 == null ? RadioPlayingVisibility.UNRECOGNIZED : var1;
      }

      public SetRadioPlayingVisibilityRequest.Builder setVisibility(RadioPlayingVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.visibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetRadioPlayingVisibilityRequest.Builder clearVisibility() {
         this.bitField0_ &= -2;
         this.visibility_ = 0;
         this.onChanged();
         return this;
      }

      public final SetRadioPlayingVisibilityRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetRadioPlayingVisibilityRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetRadioPlayingVisibilityRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
