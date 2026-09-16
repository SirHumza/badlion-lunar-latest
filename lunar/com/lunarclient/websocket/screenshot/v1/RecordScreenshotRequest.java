package com.lunarclient.websocket.screenshot.v1;

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

public final class RecordScreenshotRequest extends GeneratedMessageV3 implements RecordScreenshotRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SCREENSHOT_FIELD_NUMBER = 1;
   private ScreenshotMessage screenshot_;
   private byte memoizedIsInitialized = -1;
   private static final RecordScreenshotRequest DEFAULT_INSTANCE = new RecordScreenshotRequest();
   private static final Parser<RecordScreenshotRequest> PARSER = new AbstractParser<RecordScreenshotRequest>() {
      public RecordScreenshotRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecordScreenshotRequest.Builder var3 = RecordScreenshotRequest.newBuilder();

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

   private RecordScreenshotRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecordScreenshotRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecordScreenshotRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecordScreenshotRequest.class, RecordScreenshotRequest.Builder.class);
   }

   @Override
   public boolean hasScreenshot() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ScreenshotMessage getScreenshot() {
      return this.screenshot_ == null ? ScreenshotMessage.getDefaultInstance() : this.screenshot_;
   }

   @Override
   public ScreenshotMessageOrBuilder getScreenshotOrBuilder() {
      return this.screenshot_ == null ? ScreenshotMessage.getDefaultInstance() : this.screenshot_;
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
         var1.writeMessage(1, this.getScreenshot());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getScreenshot());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RecordScreenshotRequest)) {
         return super.equals(var1);
      } else {
         RecordScreenshotRequest var2 = (RecordScreenshotRequest)var1;
         if (this.hasScreenshot() != var2.hasScreenshot()) {
            return false;
         } else {
            return this.hasScreenshot() && !this.getScreenshot().equals(var2.getScreenshot()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasScreenshot()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getScreenshot().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecordScreenshotRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordScreenshotRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordScreenshotRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordScreenshotRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordScreenshotRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordScreenshotRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordScreenshotRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordScreenshotRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecordScreenshotRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecordScreenshotRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecordScreenshotRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordScreenshotRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecordScreenshotRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecordScreenshotRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecordScreenshotRequest.Builder newBuilder(RecordScreenshotRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecordScreenshotRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecordScreenshotRequest.Builder() : new RecordScreenshotRequest.Builder().mergeFrom(this);
   }

   protected RecordScreenshotRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecordScreenshotRequest.Builder(var1);
   }

   public static RecordScreenshotRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecordScreenshotRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecordScreenshotRequest> getParserForType() {
      return PARSER;
   }

   public RecordScreenshotRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RecordScreenshotRequest.Builder> implements RecordScreenshotRequestOrBuilder {
      private int bitField0_;
      private ScreenshotMessage screenshot_;
      private SingleFieldBuilderV3<ScreenshotMessage, ScreenshotMessage.Builder, ScreenshotMessageOrBuilder> screenshotBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordScreenshotRequest.class, RecordScreenshotRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RecordScreenshotRequest.alwaysUseFieldBuilders) {
            this.getScreenshotFieldBuilder();
         }
      }

      public RecordScreenshotRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.screenshot_ = null;
         if (this.screenshotBuilder_ != null) {
            this.screenshotBuilder_.dispose();
            this.screenshotBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_descriptor;
      }

      public RecordScreenshotRequest getDefaultInstanceForType() {
         return RecordScreenshotRequest.getDefaultInstance();
      }

      public RecordScreenshotRequest build() {
         RecordScreenshotRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecordScreenshotRequest buildPartial() {
         RecordScreenshotRequest var1 = new RecordScreenshotRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RecordScreenshotRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.screenshot_ = this.screenshotBuilder_ == null ? this.screenshot_ : this.screenshotBuilder_.build();
            var3 |= 1;
         }

         RecordScreenshotRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RecordScreenshotRequest.Builder clone() {
         return (RecordScreenshotRequest.Builder)super.clone();
      }

      public RecordScreenshotRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordScreenshotRequest.Builder)super.setField(var1, var2);
      }

      public RecordScreenshotRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecordScreenshotRequest.Builder)super.clearField(var1);
      }

      public RecordScreenshotRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecordScreenshotRequest.Builder)super.clearOneof(var1);
      }

      public RecordScreenshotRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecordScreenshotRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecordScreenshotRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordScreenshotRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RecordScreenshotRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecordScreenshotRequest) {
            return this.mergeFrom((RecordScreenshotRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecordScreenshotRequest.Builder mergeFrom(RecordScreenshotRequest var1) {
         if (var1 == RecordScreenshotRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasScreenshot()) {
            this.mergeScreenshot(var1.getScreenshot());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RecordScreenshotRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getScreenshotFieldBuilder().getBuilder(), var2);
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
      public boolean hasScreenshot() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ScreenshotMessage getScreenshot() {
         if (this.screenshotBuilder_ == null) {
            return this.screenshot_ == null ? ScreenshotMessage.getDefaultInstance() : this.screenshot_;
         } else {
            return this.screenshotBuilder_.getMessage();
         }
      }

      public RecordScreenshotRequest.Builder setScreenshot(ScreenshotMessage var1) {
         if (this.screenshotBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.screenshot_ = var1;
         } else {
            this.screenshotBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RecordScreenshotRequest.Builder setScreenshot(ScreenshotMessage.Builder var1) {
         if (this.screenshotBuilder_ == null) {
            this.screenshot_ = var1.build();
         } else {
            this.screenshotBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RecordScreenshotRequest.Builder mergeScreenshot(ScreenshotMessage var1) {
         if (this.screenshotBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.screenshot_ != null && this.screenshot_ != ScreenshotMessage.getDefaultInstance()) {
               this.getScreenshotBuilder().mergeFrom(var1);
            } else {
               this.screenshot_ = var1;
            }
         } else {
            this.screenshotBuilder_.mergeFrom(var1);
         }

         if (this.screenshot_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public RecordScreenshotRequest.Builder clearScreenshot() {
         this.bitField0_ &= -2;
         this.screenshot_ = null;
         if (this.screenshotBuilder_ != null) {
            this.screenshotBuilder_.dispose();
            this.screenshotBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ScreenshotMessage.Builder getScreenshotBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getScreenshotFieldBuilder().getBuilder();
      }

      @Override
      public ScreenshotMessageOrBuilder getScreenshotOrBuilder() {
         if (this.screenshotBuilder_ != null) {
            return this.screenshotBuilder_.getMessageOrBuilder();
         } else {
            return this.screenshot_ == null ? ScreenshotMessage.getDefaultInstance() : this.screenshot_;
         }
      }

      private SingleFieldBuilderV3<ScreenshotMessage, ScreenshotMessage.Builder, ScreenshotMessageOrBuilder> getScreenshotFieldBuilder() {
         if (this.screenshotBuilder_ == null) {
            this.screenshotBuilder_ = new SingleFieldBuilderV3<>(this.getScreenshot(), this.getParentForChildren(), this.isClean());
            this.screenshot_ = null;
         }

         return this.screenshotBuilder_;
      }

      public final RecordScreenshotRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecordScreenshotRequest.Builder)super.setUnknownFields(var1);
      }

      public final RecordScreenshotRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecordScreenshotRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
