package com.lunarclient.websocket.wrapped.v1;

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

public final class SetLeaderboardVisibilityRequest extends GeneratedMessageV3 implements SetLeaderboardVisibilityRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LEADERBOARD_VISIBILITY_FIELD_NUMBER = 1;
   private int leaderboardVisibility_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetLeaderboardVisibilityRequest DEFAULT_INSTANCE = new SetLeaderboardVisibilityRequest();
   private static final Parser<SetLeaderboardVisibilityRequest> PARSER = new AbstractParser<SetLeaderboardVisibilityRequest>() {
      public SetLeaderboardVisibilityRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetLeaderboardVisibilityRequest.Builder var3 = SetLeaderboardVisibilityRequest.newBuilder();

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

   private SetLeaderboardVisibilityRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetLeaderboardVisibilityRequest() {
      this.leaderboardVisibility_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetLeaderboardVisibilityRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetLeaderboardVisibilityRequest.class, SetLeaderboardVisibilityRequest.Builder.class);
   }

   @Override
   public int getLeaderboardVisibilityValue() {
      return this.leaderboardVisibility_;
   }

   @Override
   public WrappedLeaderboardVisibility getLeaderboardVisibility() {
      WrappedLeaderboardVisibility var1 = WrappedLeaderboardVisibility.forNumber(this.leaderboardVisibility_);
      return var1 == null ? WrappedLeaderboardVisibility.UNRECOGNIZED : var1;
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
      if (this.leaderboardVisibility_ != WrappedLeaderboardVisibility.WRAPPED_LEADERBOARD_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.leaderboardVisibility_);
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
      if (this.leaderboardVisibility_ != WrappedLeaderboardVisibility.WRAPPED_LEADERBOARD_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.leaderboardVisibility_);
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

      if (!(var1 instanceof SetLeaderboardVisibilityRequest)) {
         return super.equals(var1);
      }

      SetLeaderboardVisibilityRequest var2 = (SetLeaderboardVisibilityRequest)var1;
      return this.leaderboardVisibility_ != var2.leaderboardVisibility_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.leaderboardVisibility_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetLeaderboardVisibilityRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetLeaderboardVisibilityRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetLeaderboardVisibilityRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetLeaderboardVisibilityRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetLeaderboardVisibilityRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetLeaderboardVisibilityRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetLeaderboardVisibilityRequest.Builder newBuilder(SetLeaderboardVisibilityRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetLeaderboardVisibilityRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetLeaderboardVisibilityRequest.Builder() : new SetLeaderboardVisibilityRequest.Builder().mergeFrom(this);
   }

   protected SetLeaderboardVisibilityRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetLeaderboardVisibilityRequest.Builder(var1);
   }

   public static SetLeaderboardVisibilityRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetLeaderboardVisibilityRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetLeaderboardVisibilityRequest> getParserForType() {
      return PARSER;
   }

   public SetLeaderboardVisibilityRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetLeaderboardVisibilityRequest.Builder>
      implements SetLeaderboardVisibilityRequestOrBuilder {
      private int bitField0_;
      private int leaderboardVisibility_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetLeaderboardVisibilityRequest.class, SetLeaderboardVisibilityRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetLeaderboardVisibilityRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.leaderboardVisibility_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_wrapped_v1_SetLeaderboardVisibilityRequest_descriptor;
      }

      public SetLeaderboardVisibilityRequest getDefaultInstanceForType() {
         return SetLeaderboardVisibilityRequest.getDefaultInstance();
      }

      public SetLeaderboardVisibilityRequest build() {
         SetLeaderboardVisibilityRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetLeaderboardVisibilityRequest buildPartial() {
         SetLeaderboardVisibilityRequest var1 = new SetLeaderboardVisibilityRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetLeaderboardVisibilityRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.leaderboardVisibility_ = this.leaderboardVisibility_;
         }
      }

      public SetLeaderboardVisibilityRequest.Builder clone() {
         return (SetLeaderboardVisibilityRequest.Builder)super.clone();
      }

      public SetLeaderboardVisibilityRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetLeaderboardVisibilityRequest.Builder)super.setField(var1, var2);
      }

      public SetLeaderboardVisibilityRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetLeaderboardVisibilityRequest.Builder)super.clearField(var1);
      }

      public SetLeaderboardVisibilityRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetLeaderboardVisibilityRequest.Builder)super.clearOneof(var1);
      }

      public SetLeaderboardVisibilityRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetLeaderboardVisibilityRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetLeaderboardVisibilityRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetLeaderboardVisibilityRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetLeaderboardVisibilityRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetLeaderboardVisibilityRequest) {
            return this.mergeFrom((SetLeaderboardVisibilityRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetLeaderboardVisibilityRequest.Builder mergeFrom(SetLeaderboardVisibilityRequest var1) {
         if (var1 == SetLeaderboardVisibilityRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.leaderboardVisibility_ != 0) {
            this.setLeaderboardVisibilityValue(var1.getLeaderboardVisibilityValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetLeaderboardVisibilityRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.leaderboardVisibility_ = var1.readEnum();
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
      public int getLeaderboardVisibilityValue() {
         return this.leaderboardVisibility_;
      }

      public SetLeaderboardVisibilityRequest.Builder setLeaderboardVisibilityValue(int var1) {
         this.leaderboardVisibility_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public WrappedLeaderboardVisibility getLeaderboardVisibility() {
         WrappedLeaderboardVisibility var1 = WrappedLeaderboardVisibility.forNumber(this.leaderboardVisibility_);
         return var1 == null ? WrappedLeaderboardVisibility.UNRECOGNIZED : var1;
      }

      public SetLeaderboardVisibilityRequest.Builder setLeaderboardVisibility(WrappedLeaderboardVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.leaderboardVisibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetLeaderboardVisibilityRequest.Builder clearLeaderboardVisibility() {
         this.bitField0_ &= -2;
         this.leaderboardVisibility_ = 0;
         this.onChanged();
         return this;
      }

      public final SetLeaderboardVisibilityRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetLeaderboardVisibilityRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetLeaderboardVisibilityRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetLeaderboardVisibilityRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
