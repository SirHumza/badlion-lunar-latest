package com.lunarclient.websocket.promotion.v1;

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

public final class ClaimRewindPuzzleRewardRequest extends GeneratedMessageV3 implements ClaimRewindPuzzleRewardRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SOLUTION_FIELD_NUMBER = 1;
   private volatile Object solution_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ClaimRewindPuzzleRewardRequest DEFAULT_INSTANCE = new ClaimRewindPuzzleRewardRequest();
   private static final Parser<ClaimRewindPuzzleRewardRequest> PARSER = new AbstractParser<ClaimRewindPuzzleRewardRequest>() {
      public ClaimRewindPuzzleRewardRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClaimRewindPuzzleRewardRequest.Builder var3 = ClaimRewindPuzzleRewardRequest.newBuilder();

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

   private ClaimRewindPuzzleRewardRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClaimRewindPuzzleRewardRequest() {
      this.solution_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClaimRewindPuzzleRewardRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClaimRewindPuzzleRewardRequest.class, ClaimRewindPuzzleRewardRequest.Builder.class);
   }

   @Override
   public String getSolution() {
      Object var1 = this.solution_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.solution_ = var3;
      return var3;
   }

   @Override
   public ByteString getSolutionBytes() {
      Object var1 = this.solution_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.solution_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.solution_)) {
         GeneratedMessageV3.writeString(var1, 1, this.solution_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.solution_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.solution_);
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

      if (!(var1 instanceof ClaimRewindPuzzleRewardRequest)) {
         return super.equals(var1);
      }

      ClaimRewindPuzzleRewardRequest var2 = (ClaimRewindPuzzleRewardRequest)var1;
      return !this.getSolution().equals(var2.getSolution()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getSolution().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClaimRewindPuzzleRewardRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClaimRewindPuzzleRewardRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimRewindPuzzleRewardRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClaimRewindPuzzleRewardRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClaimRewindPuzzleRewardRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClaimRewindPuzzleRewardRequest.Builder newBuilder(ClaimRewindPuzzleRewardRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClaimRewindPuzzleRewardRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClaimRewindPuzzleRewardRequest.Builder() : new ClaimRewindPuzzleRewardRequest.Builder().mergeFrom(this);
   }

   protected ClaimRewindPuzzleRewardRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClaimRewindPuzzleRewardRequest.Builder(var1);
   }

   public static ClaimRewindPuzzleRewardRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClaimRewindPuzzleRewardRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClaimRewindPuzzleRewardRequest> getParserForType() {
      return PARSER;
   }

   public ClaimRewindPuzzleRewardRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ClaimRewindPuzzleRewardRequest.Builder>
      implements ClaimRewindPuzzleRewardRequestOrBuilder {
      private int bitField0_;
      private Object solution_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClaimRewindPuzzleRewardRequest.class, ClaimRewindPuzzleRewardRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ClaimRewindPuzzleRewardRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.solution_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardRequest_descriptor;
      }

      public ClaimRewindPuzzleRewardRequest getDefaultInstanceForType() {
         return ClaimRewindPuzzleRewardRequest.getDefaultInstance();
      }

      public ClaimRewindPuzzleRewardRequest build() {
         ClaimRewindPuzzleRewardRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClaimRewindPuzzleRewardRequest buildPartial() {
         ClaimRewindPuzzleRewardRequest var1 = new ClaimRewindPuzzleRewardRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClaimRewindPuzzleRewardRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.solution_ = this.solution_;
         }
      }

      public ClaimRewindPuzzleRewardRequest.Builder clone() {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.clone();
      }

      public ClaimRewindPuzzleRewardRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.setField(var1, var2);
      }

      public ClaimRewindPuzzleRewardRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.clearField(var1);
      }

      public ClaimRewindPuzzleRewardRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.clearOneof(var1);
      }

      public ClaimRewindPuzzleRewardRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClaimRewindPuzzleRewardRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public ClaimRewindPuzzleRewardRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClaimRewindPuzzleRewardRequest) {
            return this.mergeFrom((ClaimRewindPuzzleRewardRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClaimRewindPuzzleRewardRequest.Builder mergeFrom(ClaimRewindPuzzleRewardRequest var1) {
         if (var1 == ClaimRewindPuzzleRewardRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getSolution().isEmpty()) {
            this.solution_ = var1.solution_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ClaimRewindPuzzleRewardRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.solution_ = var1.readStringRequireUtf8();
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
      public String getSolution() {
         Object var1 = this.solution_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.solution_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSolutionBytes() {
         Object var1 = this.solution_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.solution_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ClaimRewindPuzzleRewardRequest.Builder setSolution(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.solution_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ClaimRewindPuzzleRewardRequest.Builder clearSolution() {
         this.solution_ = ClaimRewindPuzzleRewardRequest.getDefaultInstance().getSolution();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ClaimRewindPuzzleRewardRequest.Builder setSolutionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ClaimRewindPuzzleRewardRequest.checkByteStringIsUtf8(var1);
         this.solution_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final ClaimRewindPuzzleRewardRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.setUnknownFields(var1);
      }

      public final ClaimRewindPuzzleRewardRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClaimRewindPuzzleRewardRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
