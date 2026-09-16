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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LiveExperience extends GeneratedMessageV3 implements LiveExperienceOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 3;
   private volatile Object backgroundImage_ = "";
   public static final int FOREGROUND_IMAGE_FIELD_NUMBER = 4;
   private volatile Object foregroundImage_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LiveExperience DEFAULT_INSTANCE = new LiveExperience();
   private static final Parser<LiveExperience> PARSER = new AbstractParser<LiveExperience>() {
      public LiveExperience parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LiveExperience.Builder var3 = LiveExperience.newBuilder();

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

   private LiveExperience(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LiveExperience() {
      this.id_ = "";
      this.name_ = "";
      this.backgroundImage_ = "";
      this.foregroundImage_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LiveExperience();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LiveExperience.class, LiveExperience.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getBackgroundImage() {
      Object var1 = this.backgroundImage_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.backgroundImage_ = var3;
      return var3;
   }

   @Override
   public ByteString getBackgroundImageBytes() {
      Object var1 = this.backgroundImage_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.backgroundImage_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getForegroundImage() {
      Object var1 = this.foregroundImage_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.foregroundImage_ = var3;
      return var3;
   }

   @Override
   public ByteString getForegroundImageBytes() {
      Object var1 = this.foregroundImage_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.foregroundImage_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.backgroundImage_)) {
         GeneratedMessageV3.writeString(var1, 3, this.backgroundImage_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.foregroundImage_)) {
         GeneratedMessageV3.writeString(var1, 4, this.foregroundImage_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.backgroundImage_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.backgroundImage_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.foregroundImage_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.foregroundImage_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LiveExperience)) {
         return super.equals(var1);
      } else {
         LiveExperience var2 = (LiveExperience)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getBackgroundImage().equals(var2.getBackgroundImage())) {
            return false;
         } else {
            return !this.getForegroundImage().equals(var2.getForegroundImage()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getBackgroundImage().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getForegroundImage().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LiveExperience parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LiveExperience parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LiveExperience parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LiveExperience parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LiveExperience parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LiveExperience parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LiveExperience parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LiveExperience parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LiveExperience parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LiveExperience parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LiveExperience parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LiveExperience parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LiveExperience.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LiveExperience.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LiveExperience.Builder newBuilder(LiveExperience var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LiveExperience.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LiveExperience.Builder() : new LiveExperience.Builder().mergeFrom(this);
   }

   protected LiveExperience.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LiveExperience.Builder(var1);
   }

   public static LiveExperience getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LiveExperience> parser() {
      return PARSER;
   }

   @Override
   public Parser<LiveExperience> getParserForType() {
      return PARSER;
   }

   public LiveExperience getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LiveExperience.Builder> implements LiveExperienceOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private Object backgroundImage_ = "";
      private Object foregroundImage_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LiveExperience.class, LiveExperience.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LiveExperience.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.backgroundImage_ = "";
         this.foregroundImage_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_descriptor;
      }

      public LiveExperience getDefaultInstanceForType() {
         return LiveExperience.getDefaultInstance();
      }

      public LiveExperience build() {
         LiveExperience var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LiveExperience buildPartial() {
         LiveExperience var1 = new LiveExperience(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LiveExperience var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.backgroundImage_ = this.backgroundImage_;
         }

         if ((var2 & 8) != 0) {
            var1.foregroundImage_ = this.foregroundImage_;
         }
      }

      public LiveExperience.Builder clone() {
         return (LiveExperience.Builder)super.clone();
      }

      public LiveExperience.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LiveExperience.Builder)super.setField(var1, var2);
      }

      public LiveExperience.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LiveExperience.Builder)super.clearField(var1);
      }

      public LiveExperience.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LiveExperience.Builder)super.clearOneof(var1);
      }

      public LiveExperience.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LiveExperience.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LiveExperience.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LiveExperience.Builder)super.addRepeatedField(var1, var2);
      }

      public LiveExperience.Builder mergeFrom(Message var1) {
         if (var1 instanceof LiveExperience) {
            return this.mergeFrom((LiveExperience)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LiveExperience.Builder mergeFrom(LiveExperience var1) {
         if (var1 == LiveExperience.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getBackgroundImage().isEmpty()) {
            this.backgroundImage_ = var1.backgroundImage_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getForegroundImage().isEmpty()) {
            this.foregroundImage_ = var1.foregroundImage_;
            this.bitField0_ |= 8;
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

      public LiveExperience.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.backgroundImage_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.foregroundImage_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
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
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LiveExperience.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder clearId() {
         this.id_ = LiveExperience.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LiveExperience.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LiveExperience.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder clearName() {
         this.name_ = LiveExperience.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LiveExperience.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getBackgroundImage() {
         Object var1 = this.backgroundImage_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.backgroundImage_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getBackgroundImageBytes() {
         Object var1 = this.backgroundImage_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.backgroundImage_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LiveExperience.Builder setBackgroundImage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.backgroundImage_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder clearBackgroundImage() {
         this.backgroundImage_ = LiveExperience.getDefaultInstance().getBackgroundImage();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder setBackgroundImageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LiveExperience.checkByteStringIsUtf8(var1);
         this.backgroundImage_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getForegroundImage() {
         Object var1 = this.foregroundImage_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.foregroundImage_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getForegroundImageBytes() {
         Object var1 = this.foregroundImage_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.foregroundImage_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LiveExperience.Builder setForegroundImage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.foregroundImage_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder clearForegroundImage() {
         this.foregroundImage_ = LiveExperience.getDefaultInstance().getForegroundImage();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public LiveExperience.Builder setForegroundImageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LiveExperience.checkByteStringIsUtf8(var1);
         this.foregroundImage_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public final LiveExperience.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LiveExperience.Builder)super.setUnknownFields(var1);
      }

      public final LiveExperience.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LiveExperience.Builder)super.mergeUnknownFields(var1);
      }
   }
}
