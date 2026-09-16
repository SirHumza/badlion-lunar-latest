package com.lunarclient.websocket.badge.v1;

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

public final class RefreshBadgesPush extends GeneratedMessageV3 implements RefreshBadgesPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshBadgesPush DEFAULT_INSTANCE = new RefreshBadgesPush();
   private static final Parser<RefreshBadgesPush> PARSER = new AbstractParser<RefreshBadgesPush>() {
      public RefreshBadgesPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshBadgesPush.Builder var3 = RefreshBadgesPush.newBuilder();

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

   private RefreshBadgesPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshBadgesPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshBadgesPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_badge_v1_RefreshBadgesPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_badge_v1_RefreshBadgesPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshBadgesPush.class, RefreshBadgesPush.Builder.class);
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

      if (!(var1 instanceof RefreshBadgesPush)) {
         return super.equals(var1);
      }

      RefreshBadgesPush var2 = (RefreshBadgesPush)var1;
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

   public static RefreshBadgesPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshBadgesPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshBadgesPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshBadgesPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshBadgesPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshBadgesPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshBadgesPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshBadgesPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshBadgesPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshBadgesPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshBadgesPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshBadgesPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshBadgesPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshBadgesPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshBadgesPush.Builder newBuilder(RefreshBadgesPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshBadgesPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshBadgesPush.Builder() : new RefreshBadgesPush.Builder().mergeFrom(this);
   }

   protected RefreshBadgesPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshBadgesPush.Builder(var1);
   }

   public static RefreshBadgesPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshBadgesPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshBadgesPush> getParserForType() {
      return PARSER;
   }

   public RefreshBadgesPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshBadgesPush.Builder> implements RefreshBadgesPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_badge_v1_RefreshBadgesPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_badge_v1_RefreshBadgesPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshBadgesPush.class, RefreshBadgesPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshBadgesPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_badge_v1_RefreshBadgesPush_descriptor;
      }

      public RefreshBadgesPush getDefaultInstanceForType() {
         return RefreshBadgesPush.getDefaultInstance();
      }

      public RefreshBadgesPush build() {
         RefreshBadgesPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshBadgesPush buildPartial() {
         RefreshBadgesPush var1 = new RefreshBadgesPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshBadgesPush.Builder clone() {
         return (RefreshBadgesPush.Builder)super.clone();
      }

      public RefreshBadgesPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshBadgesPush.Builder)super.setField(var1, var2);
      }

      public RefreshBadgesPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshBadgesPush.Builder)super.clearField(var1);
      }

      public RefreshBadgesPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshBadgesPush.Builder)super.clearOneof(var1);
      }

      public RefreshBadgesPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshBadgesPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshBadgesPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshBadgesPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshBadgesPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshBadgesPush) {
            return this.mergeFrom((RefreshBadgesPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshBadgesPush.Builder mergeFrom(RefreshBadgesPush var1) {
         if (var1 == RefreshBadgesPush.getDefaultInstance()) {
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

      public RefreshBadgesPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshBadgesPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshBadgesPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshBadgesPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshBadgesPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
