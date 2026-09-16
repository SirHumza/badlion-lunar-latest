package com.lunarclient.gameipc.launch.v1;

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

public final class ExitGamePush extends GeneratedMessageV3 implements ExitGamePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ExitGamePush DEFAULT_INSTANCE = new ExitGamePush();
   private static final Parser<ExitGamePush> PARSER = new AbstractParser<ExitGamePush>() {
      public ExitGamePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ExitGamePush.Builder var3 = ExitGamePush.newBuilder();

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

   private ExitGamePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ExitGamePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ExitGamePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ExitGamePush.class, ExitGamePush.Builder.class);
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

      if (!(var1 instanceof ExitGamePush)) {
         return super.equals(var1);
      }

      ExitGamePush var2 = (ExitGamePush)var1;
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

   public static ExitGamePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ExitGamePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ExitGamePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ExitGamePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ExitGamePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ExitGamePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ExitGamePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExitGamePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExitGamePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExitGamePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExitGamePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExitGamePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ExitGamePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ExitGamePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExitGamePush.Builder newBuilder(ExitGamePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ExitGamePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ExitGamePush.Builder() : new ExitGamePush.Builder().mergeFrom(this);
   }

   protected ExitGamePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ExitGamePush.Builder(var1);
   }

   public static ExitGamePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ExitGamePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ExitGamePush> getParserForType() {
      return PARSER;
   }

   public ExitGamePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ExitGamePush.Builder> implements ExitGamePushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ExitGamePush.class, ExitGamePush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ExitGamePush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_launch_v1_ExitGamePush_descriptor;
      }

      public ExitGamePush getDefaultInstanceForType() {
         return ExitGamePush.getDefaultInstance();
      }

      public ExitGamePush build() {
         ExitGamePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ExitGamePush buildPartial() {
         ExitGamePush var1 = new ExitGamePush(this);
         this.onBuilt();
         return var1;
      }

      public ExitGamePush.Builder clone() {
         return (ExitGamePush.Builder)super.clone();
      }

      public ExitGamePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ExitGamePush.Builder)super.setField(var1, var2);
      }

      public ExitGamePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ExitGamePush.Builder)super.clearField(var1);
      }

      public ExitGamePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ExitGamePush.Builder)super.clearOneof(var1);
      }

      public ExitGamePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ExitGamePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ExitGamePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ExitGamePush.Builder)super.addRepeatedField(var1, var2);
      }

      public ExitGamePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ExitGamePush) {
            return this.mergeFrom((ExitGamePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ExitGamePush.Builder mergeFrom(ExitGamePush var1) {
         if (var1 == ExitGamePush.getDefaultInstance()) {
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

      public ExitGamePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ExitGamePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ExitGamePush.Builder)super.setUnknownFields(var1);
      }

      public final ExitGamePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ExitGamePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
