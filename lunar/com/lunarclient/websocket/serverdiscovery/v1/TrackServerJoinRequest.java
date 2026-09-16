package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class TrackServerJoinRequest extends GeneratedMessageV3 implements TrackServerJoinRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SECTION_ID_FIELD_NUMBER = 1;
   private volatile Object sectionId_ = "";
   public static final int CARD_SERVER_MAPPINGS_ID_FIELD_NUMBER = 2;
   private volatile Object cardServerMappingsId_ = "";
   public static final int CARD_RECOMMENDATION_ID_FIELD_NUMBER = 3;
   private volatile Object cardRecommendationId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final TrackServerJoinRequest DEFAULT_INSTANCE = new TrackServerJoinRequest();
   private static final Parser<TrackServerJoinRequest> PARSER = new AbstractParser<TrackServerJoinRequest>() {
      public TrackServerJoinRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TrackServerJoinRequest.Builder var3 = TrackServerJoinRequest.newBuilder();

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

   private TrackServerJoinRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TrackServerJoinRequest() {
      this.sectionId_ = "";
      this.cardServerMappingsId_ = "";
      this.cardRecommendationId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TrackServerJoinRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TrackServerJoinRequest.class, TrackServerJoinRequest.Builder.class);
   }

   @Override
   public String getSectionId() {
      Object var1 = this.sectionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.sectionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getSectionIdBytes() {
      Object var1 = this.sectionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.sectionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCardServerMappingsId() {
      Object var1 = this.cardServerMappingsId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.cardServerMappingsId_ = var3;
      return var3;
   }

   @Override
   public ByteString getCardServerMappingsIdBytes() {
      Object var1 = this.cardServerMappingsId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.cardServerMappingsId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCardRecommendationId() {
      Object var1 = this.cardRecommendationId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.cardRecommendationId_ = var3;
      return var3;
   }

   @Override
   public ByteString getCardRecommendationIdBytes() {
      Object var1 = this.cardRecommendationId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.cardRecommendationId_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.sectionId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.sectionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cardServerMappingsId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.cardServerMappingsId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cardRecommendationId_)) {
         GeneratedMessageV3.writeString(var1, 3, this.cardRecommendationId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.sectionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.sectionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cardServerMappingsId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.cardServerMappingsId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cardRecommendationId_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.cardRecommendationId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof TrackServerJoinRequest)) {
         return super.equals(var1);
      } else {
         TrackServerJoinRequest var2 = (TrackServerJoinRequest)var1;
         if (!this.getSectionId().equals(var2.getSectionId())) {
            return false;
         } else if (!this.getCardServerMappingsId().equals(var2.getCardServerMappingsId())) {
            return false;
         } else {
            return !this.getCardRecommendationId().equals(var2.getCardRecommendationId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSectionId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getCardServerMappingsId().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getCardRecommendationId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static TrackServerJoinRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackServerJoinRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackServerJoinRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackServerJoinRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackServerJoinRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TrackServerJoinRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TrackServerJoinRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrackServerJoinRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrackServerJoinRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrackServerJoinRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrackServerJoinRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrackServerJoinRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TrackServerJoinRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TrackServerJoinRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrackServerJoinRequest.Builder newBuilder(TrackServerJoinRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TrackServerJoinRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TrackServerJoinRequest.Builder() : new TrackServerJoinRequest.Builder().mergeFrom(this);
   }

   protected TrackServerJoinRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TrackServerJoinRequest.Builder(var1);
   }

   public static TrackServerJoinRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TrackServerJoinRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<TrackServerJoinRequest> getParserForType() {
      return PARSER;
   }

   public TrackServerJoinRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TrackServerJoinRequest.Builder> implements TrackServerJoinRequestOrBuilder {
      private int bitField0_;
      private Object sectionId_ = "";
      private Object cardServerMappingsId_ = "";
      private Object cardRecommendationId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TrackServerJoinRequest.class, TrackServerJoinRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TrackServerJoinRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sectionId_ = "";
         this.cardServerMappingsId_ = "";
         this.cardRecommendationId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_descriptor;
      }

      public TrackServerJoinRequest getDefaultInstanceForType() {
         return TrackServerJoinRequest.getDefaultInstance();
      }

      public TrackServerJoinRequest build() {
         TrackServerJoinRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TrackServerJoinRequest buildPartial() {
         TrackServerJoinRequest var1 = new TrackServerJoinRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(TrackServerJoinRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.sectionId_ = this.sectionId_;
         }

         if ((var2 & 2) != 0) {
            var1.cardServerMappingsId_ = this.cardServerMappingsId_;
         }

         if ((var2 & 4) != 0) {
            var1.cardRecommendationId_ = this.cardRecommendationId_;
         }
      }

      public TrackServerJoinRequest.Builder clone() {
         return (TrackServerJoinRequest.Builder)super.clone();
      }

      public TrackServerJoinRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TrackServerJoinRequest.Builder)super.setField(var1, var2);
      }

      public TrackServerJoinRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TrackServerJoinRequest.Builder)super.clearField(var1);
      }

      public TrackServerJoinRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TrackServerJoinRequest.Builder)super.clearOneof(var1);
      }

      public TrackServerJoinRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TrackServerJoinRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TrackServerJoinRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TrackServerJoinRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public TrackServerJoinRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof TrackServerJoinRequest) {
            return this.mergeFrom((TrackServerJoinRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TrackServerJoinRequest.Builder mergeFrom(TrackServerJoinRequest var1) {
         if (var1 == TrackServerJoinRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getSectionId().isEmpty()) {
            this.sectionId_ = var1.sectionId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getCardServerMappingsId().isEmpty()) {
            this.cardServerMappingsId_ = var1.cardServerMappingsId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getCardRecommendationId().isEmpty()) {
            this.cardRecommendationId_ = var1.cardRecommendationId_;
            this.bitField0_ |= 4;
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

      public TrackServerJoinRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.sectionId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.cardServerMappingsId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.cardRecommendationId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
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
      public String getSectionId() {
         Object var1 = this.sectionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.sectionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSectionIdBytes() {
         Object var1 = this.sectionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.sectionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TrackServerJoinRequest.Builder setSectionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sectionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public TrackServerJoinRequest.Builder clearSectionId() {
         this.sectionId_ = TrackServerJoinRequest.getDefaultInstance().getSectionId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public TrackServerJoinRequest.Builder setSectionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TrackServerJoinRequest.checkByteStringIsUtf8(var1);
         this.sectionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getCardServerMappingsId() {
         Object var1 = this.cardServerMappingsId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.cardServerMappingsId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCardServerMappingsIdBytes() {
         Object var1 = this.cardServerMappingsId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.cardServerMappingsId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TrackServerJoinRequest.Builder setCardServerMappingsId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.cardServerMappingsId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public TrackServerJoinRequest.Builder clearCardServerMappingsId() {
         this.cardServerMappingsId_ = TrackServerJoinRequest.getDefaultInstance().getCardServerMappingsId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public TrackServerJoinRequest.Builder setCardServerMappingsIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TrackServerJoinRequest.checkByteStringIsUtf8(var1);
         this.cardServerMappingsId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getCardRecommendationId() {
         Object var1 = this.cardRecommendationId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.cardRecommendationId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCardRecommendationIdBytes() {
         Object var1 = this.cardRecommendationId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.cardRecommendationId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TrackServerJoinRequest.Builder setCardRecommendationId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.cardRecommendationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public TrackServerJoinRequest.Builder clearCardRecommendationId() {
         this.cardRecommendationId_ = TrackServerJoinRequest.getDefaultInstance().getCardRecommendationId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public TrackServerJoinRequest.Builder setCardRecommendationIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TrackServerJoinRequest.checkByteStringIsUtf8(var1);
         this.cardRecommendationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final TrackServerJoinRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TrackServerJoinRequest.Builder)super.setUnknownFields(var1);
      }

      public final TrackServerJoinRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TrackServerJoinRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
