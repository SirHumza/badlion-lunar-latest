package com.lunarclient.common.v1;

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

public final class SinglePlayer extends GeneratedMessageV3 implements SinglePlayerOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final SinglePlayer DEFAULT_INSTANCE = new SinglePlayer();
   private static final Parser<SinglePlayer> PARSER = new AbstractParser<SinglePlayer>() {
      public SinglePlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SinglePlayer.Builder var3 = SinglePlayer.newBuilder();

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

   private SinglePlayer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SinglePlayer() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SinglePlayer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_SinglePlayer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_SinglePlayer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SinglePlayer.class, SinglePlayer.Builder.class);
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

      if (!(var1 instanceof SinglePlayer)) {
         return super.equals(var1);
      }

      SinglePlayer var2 = (SinglePlayer)var1;
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

   public static SinglePlayer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SinglePlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SinglePlayer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SinglePlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SinglePlayer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SinglePlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SinglePlayer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SinglePlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SinglePlayer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SinglePlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SinglePlayer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SinglePlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SinglePlayer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SinglePlayer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SinglePlayer.Builder newBuilder(SinglePlayer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SinglePlayer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SinglePlayer.Builder() : new SinglePlayer.Builder().mergeFrom(this);
   }

   protected SinglePlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SinglePlayer.Builder(var1);
   }

   public static SinglePlayer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SinglePlayer> parser() {
      return PARSER;
   }

   @Override
   public Parser<SinglePlayer> getParserForType() {
      return PARSER;
   }

   public SinglePlayer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SinglePlayer.Builder> implements SinglePlayerOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_SinglePlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_SinglePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SinglePlayer.class, SinglePlayer.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SinglePlayer.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_SinglePlayer_descriptor;
      }

      public SinglePlayer getDefaultInstanceForType() {
         return SinglePlayer.getDefaultInstance();
      }

      public SinglePlayer build() {
         SinglePlayer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SinglePlayer buildPartial() {
         SinglePlayer var1 = new SinglePlayer(this);
         this.onBuilt();
         return var1;
      }

      public SinglePlayer.Builder clone() {
         return (SinglePlayer.Builder)super.clone();
      }

      public SinglePlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SinglePlayer.Builder)super.setField(var1, var2);
      }

      public SinglePlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SinglePlayer.Builder)super.clearField(var1);
      }

      public SinglePlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SinglePlayer.Builder)super.clearOneof(var1);
      }

      public SinglePlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SinglePlayer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SinglePlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SinglePlayer.Builder)super.addRepeatedField(var1, var2);
      }

      public SinglePlayer.Builder mergeFrom(Message var1) {
         if (var1 instanceof SinglePlayer) {
            return this.mergeFrom((SinglePlayer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SinglePlayer.Builder mergeFrom(SinglePlayer var1) {
         if (var1 == SinglePlayer.getDefaultInstance()) {
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

      public SinglePlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final SinglePlayer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SinglePlayer.Builder)super.setUnknownFields(var1);
      }

      public final SinglePlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SinglePlayer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
