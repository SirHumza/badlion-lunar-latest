package com.lunarclient.websocket.radio.v1;

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

public final class RefreshRadioPush extends GeneratedMessageV3 implements RefreshRadioPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshRadioPush DEFAULT_INSTANCE = new RefreshRadioPush();
   private static final Parser<RefreshRadioPush> PARSER = new AbstractParser<RefreshRadioPush>() {
      public RefreshRadioPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshRadioPush.Builder var3 = RefreshRadioPush.newBuilder();

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

   private RefreshRadioPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshRadioPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshRadioPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshRadioPush.class, RefreshRadioPush.Builder.class);
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
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var2 = 0;
      var2 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var2;
      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof RefreshRadioPush)) {
         return super.equals(var1);
      }

      RefreshRadioPush var2 = (RefreshRadioPush)var1;
      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RefreshRadioPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshRadioPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshRadioPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshRadioPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshRadioPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshRadioPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshRadioPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshRadioPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshRadioPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshRadioPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshRadioPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshRadioPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshRadioPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshRadioPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshRadioPush.Builder newBuilder(RefreshRadioPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshRadioPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshRadioPush.Builder() : new RefreshRadioPush.Builder().mergeFrom(this);
   }

   protected RefreshRadioPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshRadioPush.Builder(var1);
   }

   public static RefreshRadioPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshRadioPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshRadioPush> getParserForType() {
      return PARSER;
   }

   public RefreshRadioPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshRadioPush.Builder> implements RefreshRadioPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshRadioPush.class, RefreshRadioPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshRadioPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_descriptor;
      }

      public RefreshRadioPush getDefaultInstanceForType() {
         return RefreshRadioPush.getDefaultInstance();
      }

      public RefreshRadioPush build() {
         RefreshRadioPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshRadioPush buildPartial() {
         RefreshRadioPush var1 = new RefreshRadioPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshRadioPush.Builder clone() {
         return (RefreshRadioPush.Builder)super.clone();
      }

      public RefreshRadioPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshRadioPush.Builder)super.setField(var1, var2);
      }

      public RefreshRadioPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshRadioPush.Builder)super.clearField(var1);
      }

      public RefreshRadioPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshRadioPush.Builder)super.clearOneof(var1);
      }

      public RefreshRadioPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshRadioPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshRadioPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshRadioPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshRadioPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshRadioPush) {
            return this.mergeFrom((RefreshRadioPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshRadioPush.Builder mergeFrom(RefreshRadioPush var1) {
         if (var1 == RefreshRadioPush.getDefaultInstance()) {
            return this;
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RefreshRadioPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshRadioPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshRadioPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshRadioPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshRadioPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
