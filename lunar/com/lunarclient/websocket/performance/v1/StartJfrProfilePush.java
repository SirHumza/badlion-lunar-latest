package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
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

public final class StartJfrProfilePush extends GeneratedMessageV3 implements StartJfrProfilePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int DURATION_FIELD_NUMBER = 1;
   private Duration duration_;
   private byte memoizedIsInitialized = -1;
   private static final StartJfrProfilePush DEFAULT_INSTANCE = new StartJfrProfilePush();
   private static final Parser<StartJfrProfilePush> PARSER = new AbstractParser<StartJfrProfilePush>() {
      public StartJfrProfilePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartJfrProfilePush.Builder var3 = StartJfrProfilePush.newBuilder();

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

   private StartJfrProfilePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartJfrProfilePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartJfrProfilePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartJfrProfilePush.class, StartJfrProfilePush.Builder.class);
   }

   @Override
   public boolean hasDuration() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Duration getDuration() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
   }

   @Override
   public DurationOrBuilder getDurationOrBuilder() {
      return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
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
         var1.writeMessage(1, this.getDuration());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getDuration());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StartJfrProfilePush)) {
         return super.equals(var1);
      } else {
         StartJfrProfilePush var2 = (StartJfrProfilePush)var1;
         if (this.hasDuration() != var2.hasDuration()) {
            return false;
         } else {
            return this.hasDuration() && !this.getDuration().equals(var2.getDuration()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasDuration()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getDuration().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartJfrProfilePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrProfilePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrProfilePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrProfilePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrProfilePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartJfrProfilePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartJfrProfilePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartJfrProfilePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartJfrProfilePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartJfrProfilePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartJfrProfilePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartJfrProfilePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartJfrProfilePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartJfrProfilePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartJfrProfilePush.Builder newBuilder(StartJfrProfilePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartJfrProfilePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartJfrProfilePush.Builder() : new StartJfrProfilePush.Builder().mergeFrom(this);
   }

   protected StartJfrProfilePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartJfrProfilePush.Builder(var1);
   }

   public static StartJfrProfilePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartJfrProfilePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartJfrProfilePush> getParserForType() {
      return PARSER;
   }

   public StartJfrProfilePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartJfrProfilePush.Builder> implements StartJfrProfilePushOrBuilder {
      private int bitField0_;
      private Duration duration_;
      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> durationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartJfrProfilePush.class, StartJfrProfilePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (StartJfrProfilePush.alwaysUseFieldBuilders) {
            this.getDurationFieldBuilder();
         }
      }

      public StartJfrProfilePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_descriptor;
      }

      public StartJfrProfilePush getDefaultInstanceForType() {
         return StartJfrProfilePush.getDefaultInstance();
      }

      public StartJfrProfilePush build() {
         StartJfrProfilePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartJfrProfilePush buildPartial() {
         StartJfrProfilePush var1 = new StartJfrProfilePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StartJfrProfilePush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.duration_ = this.durationBuilder_ == null ? this.duration_ : this.durationBuilder_.build();
            var3 |= 1;
         }

         StartJfrProfilePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public StartJfrProfilePush.Builder clone() {
         return (StartJfrProfilePush.Builder)super.clone();
      }

      public StartJfrProfilePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartJfrProfilePush.Builder)super.setField(var1, var2);
      }

      public StartJfrProfilePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartJfrProfilePush.Builder)super.clearField(var1);
      }

      public StartJfrProfilePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartJfrProfilePush.Builder)super.clearOneof(var1);
      }

      public StartJfrProfilePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartJfrProfilePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartJfrProfilePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartJfrProfilePush.Builder)super.addRepeatedField(var1, var2);
      }

      public StartJfrProfilePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartJfrProfilePush) {
            return this.mergeFrom((StartJfrProfilePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartJfrProfilePush.Builder mergeFrom(StartJfrProfilePush var1) {
         if (var1 == StartJfrProfilePush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public StartJfrProfilePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getDurationFieldBuilder().getBuilder(), var2);
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
      public boolean hasDuration() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Duration getDuration() {
         if (this.durationBuilder_ == null) {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         } else {
            return this.durationBuilder_.getMessage();
         }
      }

      public StartJfrProfilePush.Builder setDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.duration_ = var1;
         } else {
            this.durationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StartJfrProfilePush.Builder setDuration(Duration.Builder var1) {
         if (this.durationBuilder_ == null) {
            this.duration_ = var1.build();
         } else {
            this.durationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StartJfrProfilePush.Builder mergeDuration(Duration var1) {
         if (this.durationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.duration_ != null && this.duration_ != Duration.getDefaultInstance()) {
               this.getDurationBuilder().mergeFrom(var1);
            } else {
               this.duration_ = var1;
            }
         } else {
            this.durationBuilder_.mergeFrom(var1);
         }

         if (this.duration_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public StartJfrProfilePush.Builder clearDuration() {
         this.bitField0_ &= -2;
         this.duration_ = null;
         if (this.durationBuilder_ != null) {
            this.durationBuilder_.dispose();
            this.durationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Duration.Builder getDurationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getDurationFieldBuilder().getBuilder();
      }

      @Override
      public DurationOrBuilder getDurationOrBuilder() {
         if (this.durationBuilder_ != null) {
            return this.durationBuilder_.getMessageOrBuilder();
         } else {
            return this.duration_ == null ? Duration.getDefaultInstance() : this.duration_;
         }
      }

      private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getDurationFieldBuilder() {
         if (this.durationBuilder_ == null) {
            this.durationBuilder_ = new SingleFieldBuilderV3<>(this.getDuration(), this.getParentForChildren(), this.isClean());
            this.duration_ = null;
         }

         return this.durationBuilder_;
      }

      public final StartJfrProfilePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartJfrProfilePush.Builder)super.setUnknownFields(var1);
      }

      public final StartJfrProfilePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartJfrProfilePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
