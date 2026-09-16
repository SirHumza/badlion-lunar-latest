package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Announcement extends GeneratedMessageV3 implements AnnouncementOrBuilder {
   private static final long serialVersionUID = 0L;
   private int timerCase_ = 0;
   private Object timer_;
   public static final int TEXT_FIELD_NUMBER = 1;
   private volatile Object text_ = "";
   public static final int COUNT_DOWN_TO_FIELD_NUMBER = 2;
   public static final int COUNT_UP_FROM_FIELD_NUMBER = 3;
   private byte memoizedIsInitialized = -1;
   private static final Announcement DEFAULT_INSTANCE = new Announcement();
   private static final Parser<Announcement> PARSER = new AbstractParser<Announcement>() {
      public Announcement parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Announcement.Builder var3 = Announcement.newBuilder();

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

   private Announcement(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Announcement() {
      this.text_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Announcement();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Announcement.class, Announcement.Builder.class);
   }

   @Override
   public Announcement.TimerCase getTimerCase() {
      return Announcement.TimerCase.forNumber(this.timerCase_);
   }

   @Override
   public String getText() {
      Object var1 = this.text_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.text_ = var3;
      return var3;
   }

   @Override
   public ByteString getTextBytes() {
      Object var1 = this.text_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.text_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasCountDownTo() {
      return this.timerCase_ == 2;
   }

   @Override
   public Timestamp getCountDownTo() {
      return this.timerCase_ == 2 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
   }

   @Override
   public TimestampOrBuilder getCountDownToOrBuilder() {
      return this.timerCase_ == 2 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
   }

   @Override
   public boolean hasCountUpFrom() {
      return this.timerCase_ == 3;
   }

   @Override
   public Timestamp getCountUpFrom() {
      return this.timerCase_ == 3 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
   }

   @Override
   public TimestampOrBuilder getCountUpFromOrBuilder() {
      return this.timerCase_ == 3 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
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
      if (!GeneratedMessageV3.isStringEmpty(this.text_)) {
         GeneratedMessageV3.writeString(var1, 1, this.text_);
      }

      if (this.timerCase_ == 2) {
         var1.writeMessage(2, (Timestamp)this.timer_);
      }

      if (this.timerCase_ == 3) {
         var1.writeMessage(3, (Timestamp)this.timer_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.text_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.text_);
      }

      if (this.timerCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (Timestamp)this.timer_);
      }

      if (this.timerCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (Timestamp)this.timer_);
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

      if (!(var1 instanceof Announcement)) {
         return super.equals(var1);
      }

      Announcement var2 = (Announcement)var1;
      if (!this.getText().equals(var2.getText())) {
         return false;
      }

      if (!this.getTimerCase().equals(var2.getTimerCase())) {
         return false;
      }

      switch (this.timerCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            if (!this.getCountDownTo().equals(var2.getCountDownTo())) {
               return false;
            }
            break;
         case 3:
            if (!this.getCountUpFrom().equals(var2.getCountUpFrom())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getText().hashCode();
      switch (this.timerCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getCountDownTo().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getCountUpFrom().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Announcement parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Announcement parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Announcement parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Announcement parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Announcement parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Announcement parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Announcement parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Announcement parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Announcement parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Announcement parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Announcement parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Announcement parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Announcement.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Announcement.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Announcement.Builder newBuilder(Announcement var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Announcement.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Announcement.Builder() : new Announcement.Builder().mergeFrom(this);
   }

   protected Announcement.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Announcement.Builder(var1);
   }

   public static Announcement getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Announcement> parser() {
      return PARSER;
   }

   @Override
   public Parser<Announcement> getParserForType() {
      return PARSER;
   }

   public Announcement getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Announcement.Builder> implements AnnouncementOrBuilder {
      private int timerCase_ = 0;
      private Object timer_;
      private int bitField0_;
      private Object text_ = "";
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> countDownToBuilder_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> countUpFromBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Announcement.class, Announcement.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Announcement.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.text_ = "";
         if (this.countDownToBuilder_ != null) {
            this.countDownToBuilder_.clear();
         }

         if (this.countUpFromBuilder_ != null) {
            this.countUpFromBuilder_.clear();
         }

         this.timerCase_ = 0;
         this.timer_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_Announcement_descriptor;
      }

      public Announcement getDefaultInstanceForType() {
         return Announcement.getDefaultInstance();
      }

      public Announcement build() {
         Announcement var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Announcement buildPartial() {
         Announcement var1 = new Announcement(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Announcement var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.text_ = this.text_;
         }
      }

      private void buildPartialOneofs(Announcement var1) {
         var1.timerCase_ = this.timerCase_;
         var1.timer_ = this.timer_;
         if (this.timerCase_ == 2 && this.countDownToBuilder_ != null) {
            var1.timer_ = this.countDownToBuilder_.build();
         }

         if (this.timerCase_ == 3 && this.countUpFromBuilder_ != null) {
            var1.timer_ = this.countUpFromBuilder_.build();
         }
      }

      public Announcement.Builder clone() {
         return (Announcement.Builder)super.clone();
      }

      public Announcement.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Announcement.Builder)super.setField(var1, var2);
      }

      public Announcement.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Announcement.Builder)super.clearField(var1);
      }

      public Announcement.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Announcement.Builder)super.clearOneof(var1);
      }

      public Announcement.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Announcement.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Announcement.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Announcement.Builder)super.addRepeatedField(var1, var2);
      }

      public Announcement.Builder mergeFrom(Message var1) {
         if (var1 instanceof Announcement) {
            return this.mergeFrom((Announcement)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Announcement.Builder mergeFrom(Announcement var1) {
         if (var1 == Announcement.getDefaultInstance()) {
            return this;
         }

         if (!var1.getText().isEmpty()) {
            this.text_ = var1.text_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         switch (var1.getTimerCase()) {
            case COUNT_DOWN_TO:
               this.mergeCountDownTo(var1.getCountDownTo());
               break;
            case COUNT_UP_FROM:
               this.mergeCountUpFrom(var1.getCountUpFrom());
            case TIMER_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Announcement.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.text_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getCountDownToFieldBuilder().getBuilder(), var2);
                     this.timerCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getCountUpFromFieldBuilder().getBuilder(), var2);
                     this.timerCase_ = 3;
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
      public Announcement.TimerCase getTimerCase() {
         return Announcement.TimerCase.forNumber(this.timerCase_);
      }

      public Announcement.Builder clearTimer() {
         this.timerCase_ = 0;
         this.timer_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public String getText() {
         Object var1 = this.text_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.text_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTextBytes() {
         Object var1 = this.text_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.text_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Announcement.Builder setText(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.text_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Announcement.Builder clearText() {
         this.text_ = Announcement.getDefaultInstance().getText();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Announcement.Builder setTextBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Announcement.checkByteStringIsUtf8(var1);
         this.text_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasCountDownTo() {
         return this.timerCase_ == 2;
      }

      @Override
      public Timestamp getCountDownTo() {
         if (this.countDownToBuilder_ == null) {
            return this.timerCase_ == 2 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
         } else {
            return this.timerCase_ == 2 ? this.countDownToBuilder_.getMessage() : Timestamp.getDefaultInstance();
         }
      }

      public Announcement.Builder setCountDownTo(Timestamp var1) {
         if (this.countDownToBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.timer_ = var1;
            this.onChanged();
         } else {
            this.countDownToBuilder_.setMessage(var1);
         }

         this.timerCase_ = 2;
         return this;
      }

      public Announcement.Builder setCountDownTo(Timestamp.Builder var1) {
         if (this.countDownToBuilder_ == null) {
            this.timer_ = var1.build();
            this.onChanged();
         } else {
            this.countDownToBuilder_.setMessage(var1.build());
         }

         this.timerCase_ = 2;
         return this;
      }

      public Announcement.Builder mergeCountDownTo(Timestamp var1) {
         if (this.countDownToBuilder_ == null) {
            if (this.timerCase_ == 2 && this.timer_ != Timestamp.getDefaultInstance()) {
               this.timer_ = Timestamp.newBuilder((Timestamp)this.timer_).mergeFrom(var1).buildPartial();
            } else {
               this.timer_ = var1;
            }

            this.onChanged();
         } else if (this.timerCase_ == 2) {
            this.countDownToBuilder_.mergeFrom(var1);
         } else {
            this.countDownToBuilder_.setMessage(var1);
         }

         this.timerCase_ = 2;
         return this;
      }

      public Announcement.Builder clearCountDownTo() {
         if (this.countDownToBuilder_ == null) {
            if (this.timerCase_ == 2) {
               this.timerCase_ = 0;
               this.timer_ = null;
               this.onChanged();
            }
         } else {
            if (this.timerCase_ == 2) {
               this.timerCase_ = 0;
               this.timer_ = null;
            }

            this.countDownToBuilder_.clear();
         }

         return this;
      }

      public Timestamp.Builder getCountDownToBuilder() {
         return this.getCountDownToFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getCountDownToOrBuilder() {
         if (this.timerCase_ == 2 && this.countDownToBuilder_ != null) {
            return this.countDownToBuilder_.getMessageOrBuilder();
         } else {
            return this.timerCase_ == 2 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCountDownToFieldBuilder() {
         if (this.countDownToBuilder_ == null) {
            if (this.timerCase_ != 2) {
               this.timer_ = Timestamp.getDefaultInstance();
            }

            this.countDownToBuilder_ = new SingleFieldBuilderV3<>((Timestamp)this.timer_, this.getParentForChildren(), this.isClean());
            this.timer_ = null;
         }

         this.timerCase_ = 2;
         this.onChanged();
         return this.countDownToBuilder_;
      }

      @Override
      public boolean hasCountUpFrom() {
         return this.timerCase_ == 3;
      }

      @Override
      public Timestamp getCountUpFrom() {
         if (this.countUpFromBuilder_ == null) {
            return this.timerCase_ == 3 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
         } else {
            return this.timerCase_ == 3 ? this.countUpFromBuilder_.getMessage() : Timestamp.getDefaultInstance();
         }
      }

      public Announcement.Builder setCountUpFrom(Timestamp var1) {
         if (this.countUpFromBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.timer_ = var1;
            this.onChanged();
         } else {
            this.countUpFromBuilder_.setMessage(var1);
         }

         this.timerCase_ = 3;
         return this;
      }

      public Announcement.Builder setCountUpFrom(Timestamp.Builder var1) {
         if (this.countUpFromBuilder_ == null) {
            this.timer_ = var1.build();
            this.onChanged();
         } else {
            this.countUpFromBuilder_.setMessage(var1.build());
         }

         this.timerCase_ = 3;
         return this;
      }

      public Announcement.Builder mergeCountUpFrom(Timestamp var1) {
         if (this.countUpFromBuilder_ == null) {
            if (this.timerCase_ == 3 && this.timer_ != Timestamp.getDefaultInstance()) {
               this.timer_ = Timestamp.newBuilder((Timestamp)this.timer_).mergeFrom(var1).buildPartial();
            } else {
               this.timer_ = var1;
            }

            this.onChanged();
         } else if (this.timerCase_ == 3) {
            this.countUpFromBuilder_.mergeFrom(var1);
         } else {
            this.countUpFromBuilder_.setMessage(var1);
         }

         this.timerCase_ = 3;
         return this;
      }

      public Announcement.Builder clearCountUpFrom() {
         if (this.countUpFromBuilder_ == null) {
            if (this.timerCase_ == 3) {
               this.timerCase_ = 0;
               this.timer_ = null;
               this.onChanged();
            }
         } else {
            if (this.timerCase_ == 3) {
               this.timerCase_ = 0;
               this.timer_ = null;
            }

            this.countUpFromBuilder_.clear();
         }

         return this;
      }

      public Timestamp.Builder getCountUpFromBuilder() {
         return this.getCountUpFromFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getCountUpFromOrBuilder() {
         if (this.timerCase_ == 3 && this.countUpFromBuilder_ != null) {
            return this.countUpFromBuilder_.getMessageOrBuilder();
         } else {
            return this.timerCase_ == 3 ? (Timestamp)this.timer_ : Timestamp.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCountUpFromFieldBuilder() {
         if (this.countUpFromBuilder_ == null) {
            if (this.timerCase_ != 3) {
               this.timer_ = Timestamp.getDefaultInstance();
            }

            this.countUpFromBuilder_ = new SingleFieldBuilderV3<>((Timestamp)this.timer_, this.getParentForChildren(), this.isClean());
            this.timer_ = null;
         }

         this.timerCase_ = 3;
         this.onChanged();
         return this.countUpFromBuilder_;
      }

      public final Announcement.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Announcement.Builder)super.setUnknownFields(var1);
      }

      public final Announcement.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Announcement.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum TimerCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      COUNT_DOWN_TO(2),
      COUNT_UP_FROM(3),
      TIMER_NOT_SET(0);

      private final int value;

      TimerCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Announcement.TimerCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Announcement.TimerCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return TIMER_NOT_SET;
            case 1:
            default:
               return null;
            case 2:
               return COUNT_DOWN_TO;
            case 3:
               return COUNT_UP_FROM;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
