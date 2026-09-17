package com.lunarclient.websocket.friend.v1;

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

public final class SetCountryFlagVisibilityRequest extends GeneratedMessageV3 implements SetCountryFlagVisibilityRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VISIBILITY_FIELD_NUMBER = 1;
   private int visibility_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetCountryFlagVisibilityRequest DEFAULT_INSTANCE = new SetCountryFlagVisibilityRequest();
   private static final Parser<SetCountryFlagVisibilityRequest> PARSER = new AbstractParser<SetCountryFlagVisibilityRequest>() {
      public SetCountryFlagVisibilityRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetCountryFlagVisibilityRequest.Builder var3 = SetCountryFlagVisibilityRequest.newBuilder();

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

   private SetCountryFlagVisibilityRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetCountryFlagVisibilityRequest() {
      this.visibility_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetCountryFlagVisibilityRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetCountryFlagVisibilityRequest.class, SetCountryFlagVisibilityRequest.Builder.class);
   }

   @Override
   public int getVisibilityValue() {
      return this.visibility_;
   }

   @Override
   public CountryFlagVisibility getVisibility() {
      CountryFlagVisibility var1 = CountryFlagVisibility.forNumber(this.visibility_);
      return var1 == null ? CountryFlagVisibility.UNRECOGNIZED : var1;
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
      if (this.visibility_ != CountryFlagVisibility.COUNTRY_FLAG_VISIBILITY_UNSPECIFIED.getNumber()) {
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
      if (this.visibility_ != CountryFlagVisibility.COUNTRY_FLAG_VISIBILITY_UNSPECIFIED.getNumber()) {
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

      if (!(var1 instanceof SetCountryFlagVisibilityRequest)) {
         return super.equals(var1);
      }

      SetCountryFlagVisibilityRequest var2 = (SetCountryFlagVisibilityRequest)var1;
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

   public static SetCountryFlagVisibilityRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetCountryFlagVisibilityRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetCountryFlagVisibilityRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetCountryFlagVisibilityRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetCountryFlagVisibilityRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetCountryFlagVisibilityRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetCountryFlagVisibilityRequest.Builder newBuilder(SetCountryFlagVisibilityRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetCountryFlagVisibilityRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetCountryFlagVisibilityRequest.Builder() : new SetCountryFlagVisibilityRequest.Builder().mergeFrom(this);
   }

   protected SetCountryFlagVisibilityRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetCountryFlagVisibilityRequest.Builder(var1);
   }

   public static SetCountryFlagVisibilityRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetCountryFlagVisibilityRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetCountryFlagVisibilityRequest> getParserForType() {
      return PARSER;
   }

   public SetCountryFlagVisibilityRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetCountryFlagVisibilityRequest.Builder>
      implements SetCountryFlagVisibilityRequestOrBuilder {
      private int bitField0_;
      private int visibility_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetCountryFlagVisibilityRequest.class, SetCountryFlagVisibilityRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetCountryFlagVisibilityRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.visibility_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetCountryFlagVisibilityRequest_descriptor;
      }

      public SetCountryFlagVisibilityRequest getDefaultInstanceForType() {
         return SetCountryFlagVisibilityRequest.getDefaultInstance();
      }

      public SetCountryFlagVisibilityRequest build() {
         SetCountryFlagVisibilityRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetCountryFlagVisibilityRequest buildPartial() {
         SetCountryFlagVisibilityRequest var1 = new SetCountryFlagVisibilityRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetCountryFlagVisibilityRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.visibility_ = this.visibility_;
         }
      }

      public SetCountryFlagVisibilityRequest.Builder clone() {
         return (SetCountryFlagVisibilityRequest.Builder)super.clone();
      }

      public SetCountryFlagVisibilityRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetCountryFlagVisibilityRequest.Builder)super.setField(var1, var2);
      }

      public SetCountryFlagVisibilityRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetCountryFlagVisibilityRequest.Builder)super.clearField(var1);
      }

      public SetCountryFlagVisibilityRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetCountryFlagVisibilityRequest.Builder)super.clearOneof(var1);
      }

      public SetCountryFlagVisibilityRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetCountryFlagVisibilityRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetCountryFlagVisibilityRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetCountryFlagVisibilityRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetCountryFlagVisibilityRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetCountryFlagVisibilityRequest) {
            return this.mergeFrom((SetCountryFlagVisibilityRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetCountryFlagVisibilityRequest.Builder mergeFrom(SetCountryFlagVisibilityRequest var1) {
         if (var1 == SetCountryFlagVisibilityRequest.getDefaultInstance()) {
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

      public SetCountryFlagVisibilityRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public SetCountryFlagVisibilityRequest.Builder setVisibilityValue(int var1) {
         this.visibility_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public CountryFlagVisibility getVisibility() {
         CountryFlagVisibility var1 = CountryFlagVisibility.forNumber(this.visibility_);
         return var1 == null ? CountryFlagVisibility.UNRECOGNIZED : var1;
      }

      public SetCountryFlagVisibilityRequest.Builder setVisibility(CountryFlagVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.visibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetCountryFlagVisibilityRequest.Builder clearVisibility() {
         this.bitField0_ &= -2;
         this.visibility_ = 0;
         this.onChanged();
         return this;
      }

      public final SetCountryFlagVisibilityRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetCountryFlagVisibilityRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetCountryFlagVisibilityRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetCountryFlagVisibilityRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
