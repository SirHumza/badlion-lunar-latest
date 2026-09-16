package com.lunarclient.websocket.liveexperience.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LoadLiveExperienceResponse extends GeneratedMessageV3 implements LoadLiveExperienceResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int EXPERIENCE_FIELD_NUMBER = 1;
   private LiveExperience experience_;
   private byte memoizedIsInitialized = -1;
   private static final LoadLiveExperienceResponse DEFAULT_INSTANCE = new LoadLiveExperienceResponse();
   private static final Parser<LoadLiveExperienceResponse> PARSER = new AbstractParser<LoadLiveExperienceResponse>() {
      public LoadLiveExperienceResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadLiveExperienceResponse.Builder var3 = LoadLiveExperienceResponse.newBuilder();

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

   private LoadLiveExperienceResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadLiveExperienceResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadLiveExperienceResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadLiveExperienceResponse.class, LoadLiveExperienceResponse.Builder.class);
   }

   @Override
   public boolean hasExperience() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public LiveExperience getExperience() {
      return this.experience_ == null ? LiveExperience.getDefaultInstance() : this.experience_;
   }

   @Override
   public LiveExperienceOrBuilder getExperienceOrBuilder() {
      return this.experience_ == null ? LiveExperience.getDefaultInstance() : this.experience_;
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
         var1.writeMessage(1, this.getExperience());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getExperience());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoadLiveExperienceResponse)) {
         return super.equals(var1);
      } else {
         LoadLiveExperienceResponse var2 = (LoadLiveExperienceResponse)var1;
         if (this.hasExperience() != var2.hasExperience()) {
            return false;
         } else {
            return this.hasExperience() && !this.getExperience().equals(var2.getExperience()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasExperience()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getExperience().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadLiveExperienceResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadLiveExperienceResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadLiveExperienceResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadLiveExperienceResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadLiveExperienceResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadLiveExperienceResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadLiveExperienceResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadLiveExperienceResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadLiveExperienceResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadLiveExperienceResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadLiveExperienceResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadLiveExperienceResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadLiveExperienceResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadLiveExperienceResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadLiveExperienceResponse.Builder newBuilder(LoadLiveExperienceResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadLiveExperienceResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadLiveExperienceResponse.Builder() : new LoadLiveExperienceResponse.Builder().mergeFrom(this);
   }

   protected LoadLiveExperienceResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadLiveExperienceResponse.Builder(var1);
   }

   public static LoadLiveExperienceResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadLiveExperienceResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadLiveExperienceResponse> getParserForType() {
      return PARSER;
   }

   public LoadLiveExperienceResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadLiveExperienceResponse.Builder> implements LoadLiveExperienceResponseOrBuilder {
      private int bitField0_;
      private LiveExperience experience_;
      private SingleFieldBuilderV3<LiveExperience, LiveExperience.Builder, LiveExperienceOrBuilder> experienceBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadLiveExperienceResponse.class, LoadLiveExperienceResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LoadLiveExperienceResponse.alwaysUseFieldBuilders) {
            this.getExperienceFieldBuilder();
         }
      }

      public LoadLiveExperienceResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.experience_ = null;
         if (this.experienceBuilder_ != null) {
            this.experienceBuilder_.dispose();
            this.experienceBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_LoadLiveExperienceResponse_descriptor;
      }

      public LoadLiveExperienceResponse getDefaultInstanceForType() {
         return LoadLiveExperienceResponse.getDefaultInstance();
      }

      public LoadLiveExperienceResponse build() {
         LoadLiveExperienceResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadLiveExperienceResponse buildPartial() {
         LoadLiveExperienceResponse var1 = new LoadLiveExperienceResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LoadLiveExperienceResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.experience_ = this.experienceBuilder_ == null ? this.experience_ : this.experienceBuilder_.build();
            var3 |= 1;
         }

         LoadLiveExperienceResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LoadLiveExperienceResponse.Builder clone() {
         return (LoadLiveExperienceResponse.Builder)super.clone();
      }

      public LoadLiveExperienceResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadLiveExperienceResponse.Builder)super.setField(var1, var2);
      }

      public LoadLiveExperienceResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadLiveExperienceResponse.Builder)super.clearField(var1);
      }

      public LoadLiveExperienceResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadLiveExperienceResponse.Builder)super.clearOneof(var1);
      }

      public LoadLiveExperienceResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadLiveExperienceResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadLiveExperienceResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadLiveExperienceResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadLiveExperienceResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadLiveExperienceResponse) {
            return this.mergeFrom((LoadLiveExperienceResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadLiveExperienceResponse.Builder mergeFrom(LoadLiveExperienceResponse var1) {
         if (var1 == LoadLiveExperienceResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasExperience()) {
            this.mergeExperience(var1.getExperience());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoadLiveExperienceResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getExperienceFieldBuilder().getBuilder(), var2);
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
      public boolean hasExperience() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public LiveExperience getExperience() {
         if (this.experienceBuilder_ == null) {
            return this.experience_ == null ? LiveExperience.getDefaultInstance() : this.experience_;
         } else {
            return this.experienceBuilder_.getMessage();
         }
      }

      public LoadLiveExperienceResponse.Builder setExperience(LiveExperience var1) {
         if (this.experienceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.experience_ = var1;
         } else {
            this.experienceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoadLiveExperienceResponse.Builder setExperience(LiveExperience.Builder var1) {
         if (this.experienceBuilder_ == null) {
            this.experience_ = var1.build();
         } else {
            this.experienceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoadLiveExperienceResponse.Builder mergeExperience(LiveExperience var1) {
         if (this.experienceBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.experience_ != null && this.experience_ != LiveExperience.getDefaultInstance()) {
               this.getExperienceBuilder().mergeFrom(var1);
            } else {
               this.experience_ = var1;
            }
         } else {
            this.experienceBuilder_.mergeFrom(var1);
         }

         if (this.experience_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public LoadLiveExperienceResponse.Builder clearExperience() {
         this.bitField0_ &= -2;
         this.experience_ = null;
         if (this.experienceBuilder_ != null) {
            this.experienceBuilder_.dispose();
            this.experienceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LiveExperience.Builder getExperienceBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getExperienceFieldBuilder().getBuilder();
      }

      @Override
      public LiveExperienceOrBuilder getExperienceOrBuilder() {
         if (this.experienceBuilder_ != null) {
            return this.experienceBuilder_.getMessageOrBuilder();
         } else {
            return this.experience_ == null ? LiveExperience.getDefaultInstance() : this.experience_;
         }
      }

      private SingleFieldBuilderV3<LiveExperience, LiveExperience.Builder, LiveExperienceOrBuilder> getExperienceFieldBuilder() {
         if (this.experienceBuilder_ == null) {
            this.experienceBuilder_ = new SingleFieldBuilderV3<>(this.getExperience(), this.getParentForChildren(), this.isClean());
            this.experience_ = null;
         }

         return this.experienceBuilder_;
      }

      public final LoadLiveExperienceResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadLiveExperienceResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoadLiveExperienceResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadLiveExperienceResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
