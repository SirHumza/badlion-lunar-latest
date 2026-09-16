package com.lunarclient.websocket.socials.v1;

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

public final class RefreshSocialsPush extends GeneratedMessageV3 implements RefreshSocialsPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshSocialsPush DEFAULT_INSTANCE = new RefreshSocialsPush();
   private static final Parser<RefreshSocialsPush> PARSER = new AbstractParser<RefreshSocialsPush>() {
      public RefreshSocialsPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshSocialsPush.Builder var3 = RefreshSocialsPush.newBuilder();

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

   private RefreshSocialsPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshSocialsPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshSocialsPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_socials_v1_RefreshSocialsPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_socials_v1_RefreshSocialsPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshSocialsPush.class, RefreshSocialsPush.Builder.class);
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

      if (!(var1 instanceof RefreshSocialsPush)) {
         return super.equals(var1);
      }

      RefreshSocialsPush var2 = (RefreshSocialsPush)var1;
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

   public static RefreshSocialsPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshSocialsPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshSocialsPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshSocialsPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshSocialsPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshSocialsPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshSocialsPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshSocialsPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshSocialsPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshSocialsPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshSocialsPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshSocialsPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshSocialsPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshSocialsPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshSocialsPush.Builder newBuilder(RefreshSocialsPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshSocialsPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshSocialsPush.Builder() : new RefreshSocialsPush.Builder().mergeFrom(this);
   }

   protected RefreshSocialsPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshSocialsPush.Builder(var1);
   }

   public static RefreshSocialsPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshSocialsPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshSocialsPush> getParserForType() {
      return PARSER;
   }

   public RefreshSocialsPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshSocialsPush.Builder> implements RefreshSocialsPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_socials_v1_RefreshSocialsPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_socials_v1_RefreshSocialsPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshSocialsPush.class, RefreshSocialsPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshSocialsPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_socials_v1_RefreshSocialsPush_descriptor;
      }

      public RefreshSocialsPush getDefaultInstanceForType() {
         return RefreshSocialsPush.getDefaultInstance();
      }

      public RefreshSocialsPush build() {
         RefreshSocialsPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshSocialsPush buildPartial() {
         RefreshSocialsPush var1 = new RefreshSocialsPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshSocialsPush.Builder clone() {
         return (RefreshSocialsPush.Builder)super.clone();
      }

      public RefreshSocialsPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshSocialsPush.Builder)super.setField(var1, var2);
      }

      public RefreshSocialsPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshSocialsPush.Builder)super.clearField(var1);
      }

      public RefreshSocialsPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshSocialsPush.Builder)super.clearOneof(var1);
      }

      public RefreshSocialsPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshSocialsPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshSocialsPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshSocialsPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshSocialsPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshSocialsPush) {
            return this.mergeFrom((RefreshSocialsPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshSocialsPush.Builder mergeFrom(RefreshSocialsPush var1) {
         if (var1 == RefreshSocialsPush.getDefaultInstance()) {
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

      public RefreshSocialsPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshSocialsPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshSocialsPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshSocialsPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshSocialsPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
