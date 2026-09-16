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

public final class InboundSinglePlayer extends GeneratedMessageV3 implements InboundSinglePlayerOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final InboundSinglePlayer DEFAULT_INSTANCE = new InboundSinglePlayer();
   private static final Parser<InboundSinglePlayer> PARSER = new AbstractParser<InboundSinglePlayer>() {
      public InboundSinglePlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundSinglePlayer.Builder var3 = InboundSinglePlayer.newBuilder();

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

   private InboundSinglePlayer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundSinglePlayer() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundSinglePlayer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundSinglePlayer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundSinglePlayer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundSinglePlayer.class, InboundSinglePlayer.Builder.class);
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

      if (!(var1 instanceof InboundSinglePlayer)) {
         return super.equals(var1);
      }

      InboundSinglePlayer var2 = (InboundSinglePlayer)var1;
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

   public static InboundSinglePlayer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundSinglePlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundSinglePlayer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundSinglePlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundSinglePlayer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundSinglePlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundSinglePlayer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundSinglePlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundSinglePlayer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundSinglePlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundSinglePlayer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundSinglePlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundSinglePlayer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundSinglePlayer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundSinglePlayer.Builder newBuilder(InboundSinglePlayer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundSinglePlayer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundSinglePlayer.Builder() : new InboundSinglePlayer.Builder().mergeFrom(this);
   }

   protected InboundSinglePlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundSinglePlayer.Builder(var1);
   }

   public static InboundSinglePlayer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundSinglePlayer> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundSinglePlayer> getParserForType() {
      return PARSER;
   }

   public InboundSinglePlayer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundSinglePlayer.Builder> implements InboundSinglePlayerOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundSinglePlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundSinglePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundSinglePlayer.class, InboundSinglePlayer.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundSinglePlayer.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundSinglePlayer_descriptor;
      }

      public InboundSinglePlayer getDefaultInstanceForType() {
         return InboundSinglePlayer.getDefaultInstance();
      }

      public InboundSinglePlayer build() {
         InboundSinglePlayer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundSinglePlayer buildPartial() {
         InboundSinglePlayer var1 = new InboundSinglePlayer(this);
         this.onBuilt();
         return var1;
      }

      public InboundSinglePlayer.Builder clone() {
         return (InboundSinglePlayer.Builder)super.clone();
      }

      public InboundSinglePlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundSinglePlayer.Builder)super.setField(var1, var2);
      }

      public InboundSinglePlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundSinglePlayer.Builder)super.clearField(var1);
      }

      public InboundSinglePlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundSinglePlayer.Builder)super.clearOneof(var1);
      }

      public InboundSinglePlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundSinglePlayer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundSinglePlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundSinglePlayer.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundSinglePlayer.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundSinglePlayer) {
            return this.mergeFrom((InboundSinglePlayer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundSinglePlayer.Builder mergeFrom(InboundSinglePlayer var1) {
         if (var1 == InboundSinglePlayer.getDefaultInstance()) {
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

      public InboundSinglePlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final InboundSinglePlayer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundSinglePlayer.Builder)super.setUnknownFields(var1);
      }

      public final InboundSinglePlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundSinglePlayer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
