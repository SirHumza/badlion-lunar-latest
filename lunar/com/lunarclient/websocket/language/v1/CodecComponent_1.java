package com.lunarclient.websocket.language.v1;

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

public final class UpdateLanguageRequest extends GeneratedMessageV3 implements UpdateLanguageRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NEW_LANGUAGE_FIELD_NUMBER = 1;
   private Language newLanguage_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateLanguageRequest DEFAULT_INSTANCE = new UpdateLanguageRequest();
   private static final Parser<UpdateLanguageRequest> PARSER = new AbstractParser<UpdateLanguageRequest>() {
      public UpdateLanguageRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateLanguageRequest.Builder var3 = UpdateLanguageRequest.newBuilder();

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

   private UpdateLanguageRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateLanguageRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateLanguageRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateLanguageRequest.class, UpdateLanguageRequest.Builder.class);
   }

   @Override
   public boolean hasNewLanguage() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Language getNewLanguage() {
      return this.newLanguage_ == null ? Language.getDefaultInstance() : this.newLanguage_;
   }

   @Override
   public LanguageOrBuilder getNewLanguageOrBuilder() {
      return this.newLanguage_ == null ? Language.getDefaultInstance() : this.newLanguage_;
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
         var1.writeMessage(1, this.getNewLanguage());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNewLanguage());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateLanguageRequest)) {
         return super.equals(var1);
      } else {
         UpdateLanguageRequest var2 = (UpdateLanguageRequest)var1;
         if (this.hasNewLanguage() != var2.hasNewLanguage()) {
            return false;
         } else {
            return this.hasNewLanguage() && !this.getNewLanguage().equals(var2.getNewLanguage())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasNewLanguage()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNewLanguage().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateLanguageRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLanguageRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLanguageRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLanguageRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLanguageRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLanguageRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLanguageRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLanguageRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateLanguageRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateLanguageRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateLanguageRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLanguageRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateLanguageRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateLanguageRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateLanguageRequest.Builder newBuilder(UpdateLanguageRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateLanguageRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateLanguageRequest.Builder() : new UpdateLanguageRequest.Builder().mergeFrom(this);
   }

   protected UpdateLanguageRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateLanguageRequest.Builder(var1);
   }

   public static UpdateLanguageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateLanguageRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateLanguageRequest> getParserForType() {
      return PARSER;
   }

   public UpdateLanguageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateLanguageRequest.Builder> implements UpdateLanguageRequestOrBuilder {
      private int bitField0_;
      private Language newLanguage_;
      private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> newLanguageBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateLanguageRequest.class, UpdateLanguageRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateLanguageRequest.alwaysUseFieldBuilders) {
            this.getNewLanguageFieldBuilder();
         }
      }

      public UpdateLanguageRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newLanguage_ = null;
         if (this.newLanguageBuilder_ != null) {
            this.newLanguageBuilder_.dispose();
            this.newLanguageBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageRequest_descriptor;
      }

      public UpdateLanguageRequest getDefaultInstanceForType() {
         return UpdateLanguageRequest.getDefaultInstance();
      }

      public UpdateLanguageRequest build() {
         UpdateLanguageRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateLanguageRequest buildPartial() {
         UpdateLanguageRequest var1 = new UpdateLanguageRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateLanguageRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.newLanguage_ = this.newLanguageBuilder_ == null ? this.newLanguage_ : this.newLanguageBuilder_.build();
            var3 |= 1;
         }

         UpdateLanguageRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateLanguageRequest.Builder clone() {
         return (UpdateLanguageRequest.Builder)super.clone();
      }

      public UpdateLanguageRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLanguageRequest.Builder)super.setField(var1, var2);
      }

      public UpdateLanguageRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateLanguageRequest.Builder)super.clearField(var1);
      }

      public UpdateLanguageRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateLanguageRequest.Builder)super.clearOneof(var1);
      }

      public UpdateLanguageRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateLanguageRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateLanguageRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLanguageRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateLanguageRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateLanguageRequest) {
            return this.mergeFrom((UpdateLanguageRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateLanguageRequest.Builder mergeFrom(UpdateLanguageRequest var1) {
         if (var1 == UpdateLanguageRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNewLanguage()) {
            this.mergeNewLanguage(var1.getNewLanguage());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateLanguageRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNewLanguageFieldBuilder().getBuilder(), var2);
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
      public boolean hasNewLanguage() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Language getNewLanguage() {
         if (this.newLanguageBuilder_ == null) {
            return this.newLanguage_ == null ? Language.getDefaultInstance() : this.newLanguage_;
         } else {
            return this.newLanguageBuilder_.getMessage();
         }
      }

      public UpdateLanguageRequest.Builder setNewLanguage(Language var1) {
         if (this.newLanguageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newLanguage_ = var1;
         } else {
            this.newLanguageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLanguageRequest.Builder setNewLanguage(Language.Builder var1) {
         if (this.newLanguageBuilder_ == null) {
            this.newLanguage_ = var1.build();
         } else {
            this.newLanguageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateLanguageRequest.Builder mergeNewLanguage(Language var1) {
         if (this.newLanguageBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.newLanguage_ != null && this.newLanguage_ != Language.getDefaultInstance()) {
               this.getNewLanguageBuilder().mergeFrom(var1);
            } else {
               this.newLanguage_ = var1;
            }
         } else {
            this.newLanguageBuilder_.mergeFrom(var1);
         }

         if (this.newLanguage_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public UpdateLanguageRequest.Builder clearNewLanguage() {
         this.bitField0_ &= -2;
         this.newLanguage_ = null;
         if (this.newLanguageBuilder_ != null) {
            this.newLanguageBuilder_.dispose();
            this.newLanguageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Language.Builder getNewLanguageBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNewLanguageFieldBuilder().getBuilder();
      }

      @Override
      public LanguageOrBuilder getNewLanguageOrBuilder() {
         if (this.newLanguageBuilder_ != null) {
            return this.newLanguageBuilder_.getMessageOrBuilder();
         } else {
            return this.newLanguage_ == null ? Language.getDefaultInstance() : this.newLanguage_;
         }
      }

      private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getNewLanguageFieldBuilder() {
         if (this.newLanguageBuilder_ == null) {
            this.newLanguageBuilder_ = new SingleFieldBuilderV3<>(this.getNewLanguage(), this.getParentForChildren(), this.isClean());
            this.newLanguage_ = null;
         }

         return this.newLanguageBuilder_;
      }

      public final UpdateLanguageRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateLanguageRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateLanguageRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateLanguageRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
