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

public final class SetLastSeenVisibilityRequest extends GeneratedMessageV3 implements SetLastSeenVisibilityRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VISIBILITY_FIELD_NUMBER = 1;
   private int visibility_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetLastSeenVisibilityRequest DEFAULT_INSTANCE = new SetLastSeenVisibilityRequest();
   private static final Parser<SetLastSeenVisibilityRequest> PARSER = new AbstractParser<SetLastSeenVisibilityRequest>() {
      public SetLastSeenVisibilityRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetLastSeenVisibilityRequest.Builder var3 = SetLastSeenVisibilityRequest.newBuilder();

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

   private SetLastSeenVisibilityRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetLastSeenVisibilityRequest() {
      this.visibility_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetLastSeenVisibilityRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetLastSeenVisibilityRequest.class, SetLastSeenVisibilityRequest.Builder.class);
   }

   @Override
   public int getVisibilityValue() {
      return this.visibility_;
   }

   @Override
   public LastSeenVisibility getVisibility() {
      LastSeenVisibility var1 = LastSeenVisibility.forNumber(this.visibility_);
      return var1 == null ? LastSeenVisibility.UNRECOGNIZED : var1;
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
      if (this.visibility_ != LastSeenVisibility.LAST_SEEN_VISIBILITY_UNSPECIFIED.getNumber()) {
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
      if (this.visibility_ != LastSeenVisibility.LAST_SEEN_VISIBILITY_UNSPECIFIED.getNumber()) {
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

      if (!(var1 instanceof SetLastSeenVisibilityRequest)) {
         return super.equals(var1);
      }

      SetLastSeenVisibilityRequest var2 = (SetLastSeenVisibilityRequest)var1;
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

   public static SetLastSeenVisibilityRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetLastSeenVisibilityRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetLastSeenVisibilityRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetLastSeenVisibilityRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetLastSeenVisibilityRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetLastSeenVisibilityRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetLastSeenVisibilityRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetLastSeenVisibilityRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetLastSeenVisibilityRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetLastSeenVisibilityRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetLastSeenVisibilityRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetLastSeenVisibilityRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetLastSeenVisibilityRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetLastSeenVisibilityRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetLastSeenVisibilityRequest.Builder newBuilder(SetLastSeenVisibilityRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetLastSeenVisibilityRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetLastSeenVisibilityRequest.Builder() : new SetLastSeenVisibilityRequest.Builder().mergeFrom(this);
   }

   protected SetLastSeenVisibilityRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetLastSeenVisibilityRequest.Builder(var1);
   }

   public static SetLastSeenVisibilityRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetLastSeenVisibilityRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetLastSeenVisibilityRequest> getParserForType() {
      return PARSER;
   }

   public SetLastSeenVisibilityRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetLastSeenVisibilityRequest.Builder> implements SetLastSeenVisibilityRequestOrBuilder {
      private int bitField0_;
      private int visibility_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetLastSeenVisibilityRequest.class, SetLastSeenVisibilityRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetLastSeenVisibilityRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.visibility_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SetLastSeenVisibilityRequest_descriptor;
      }

      public SetLastSeenVisibilityRequest getDefaultInstanceForType() {
         return SetLastSeenVisibilityRequest.getDefaultInstance();
      }

      public SetLastSeenVisibilityRequest build() {
         SetLastSeenVisibilityRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetLastSeenVisibilityRequest buildPartial() {
         SetLastSeenVisibilityRequest var1 = new SetLastSeenVisibilityRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetLastSeenVisibilityRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.visibility_ = this.visibility_;
         }
      }

      public SetLastSeenVisibilityRequest.Builder clone() {
         return (SetLastSeenVisibilityRequest.Builder)super.clone();
      }

      public SetLastSeenVisibilityRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetLastSeenVisibilityRequest.Builder)super.setField(var1, var2);
      }

      public SetLastSeenVisibilityRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetLastSeenVisibilityRequest.Builder)super.clearField(var1);
      }

      public SetLastSeenVisibilityRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetLastSeenVisibilityRequest.Builder)super.clearOneof(var1);
      }

      public SetLastSeenVisibilityRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetLastSeenVisibilityRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetLastSeenVisibilityRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetLastSeenVisibilityRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetLastSeenVisibilityRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetLastSeenVisibilityRequest) {
            return this.mergeFrom((SetLastSeenVisibilityRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetLastSeenVisibilityRequest.Builder mergeFrom(SetLastSeenVisibilityRequest var1) {
         if (var1 == SetLastSeenVisibilityRequest.getDefaultInstance()) {
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

      public SetLastSeenVisibilityRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public SetLastSeenVisibilityRequest.Builder setVisibilityValue(int var1) {
         this.visibility_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public LastSeenVisibility getVisibility() {
         LastSeenVisibility var1 = LastSeenVisibility.forNumber(this.visibility_);
         return var1 == null ? LastSeenVisibility.UNRECOGNIZED : var1;
      }

      public SetLastSeenVisibilityRequest.Builder setVisibility(LastSeenVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.visibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetLastSeenVisibilityRequest.Builder clearVisibility() {
         this.bitField0_ &= -2;
         this.visibility_ = 0;
         this.onChanged();
         return this;
      }

      public final SetLastSeenVisibilityRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetLastSeenVisibilityRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetLastSeenVisibilityRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetLastSeenVisibilityRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
