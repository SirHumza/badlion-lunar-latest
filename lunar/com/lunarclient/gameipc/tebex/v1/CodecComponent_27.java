package com.lunarclient.gameipc.tebex.v1;

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

public final class TebexJsCheckoutClosed extends GeneratedMessageV3 implements TebexJsCheckoutClosedOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final TebexJsCheckoutClosed DEFAULT_INSTANCE = new TebexJsCheckoutClosed();
   private static final Parser<TebexJsCheckoutClosed> PARSER = new AbstractParser<TebexJsCheckoutClosed>() {
      public TebexJsCheckoutClosed parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TebexJsCheckoutClosed.Builder var3 = TebexJsCheckoutClosed.newBuilder();

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

   private TebexJsCheckoutClosed(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TebexJsCheckoutClosed() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TebexJsCheckoutClosed();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_tebex_v1_TebexJsCheckoutClosed_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_tebex_v1_TebexJsCheckoutClosed_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TebexJsCheckoutClosed.class, TebexJsCheckoutClosed.Builder.class);
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

      if (!(var1 instanceof TebexJsCheckoutClosed)) {
         return super.equals(var1);
      }

      TebexJsCheckoutClosed var2 = (TebexJsCheckoutClosed)var1;
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

   public static TebexJsCheckoutClosed parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TebexJsCheckoutClosed parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TebexJsCheckoutClosed parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TebexJsCheckoutClosed parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TebexJsCheckoutClosed parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TebexJsCheckoutClosed parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TebexJsCheckoutClosed parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TebexJsCheckoutClosed parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TebexJsCheckoutClosed parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TebexJsCheckoutClosed parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TebexJsCheckoutClosed parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TebexJsCheckoutClosed parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TebexJsCheckoutClosed.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TebexJsCheckoutClosed.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TebexJsCheckoutClosed.Builder newBuilder(TebexJsCheckoutClosed var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TebexJsCheckoutClosed.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TebexJsCheckoutClosed.Builder() : new TebexJsCheckoutClosed.Builder().mergeFrom(this);
   }

   protected TebexJsCheckoutClosed.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TebexJsCheckoutClosed.Builder(var1);
   }

   public static TebexJsCheckoutClosed getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TebexJsCheckoutClosed> parser() {
      return PARSER;
   }

   @Override
   public Parser<TebexJsCheckoutClosed> getParserForType() {
      return PARSER;
   }

   public TebexJsCheckoutClosed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TebexJsCheckoutClosed.Builder> implements TebexJsCheckoutClosedOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_tebex_v1_TebexJsCheckoutClosed_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_tebex_v1_TebexJsCheckoutClosed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TebexJsCheckoutClosed.class, TebexJsCheckoutClosed.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TebexJsCheckoutClosed.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_tebex_v1_TebexJsCheckoutClosed_descriptor;
      }

      public TebexJsCheckoutClosed getDefaultInstanceForType() {
         return TebexJsCheckoutClosed.getDefaultInstance();
      }

      public TebexJsCheckoutClosed build() {
         TebexJsCheckoutClosed var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TebexJsCheckoutClosed buildPartial() {
         TebexJsCheckoutClosed var1 = new TebexJsCheckoutClosed(this);
         this.onBuilt();
         return var1;
      }

      public TebexJsCheckoutClosed.Builder clone() {
         return (TebexJsCheckoutClosed.Builder)super.clone();
      }

      public TebexJsCheckoutClosed.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TebexJsCheckoutClosed.Builder)super.setField(var1, var2);
      }

      public TebexJsCheckoutClosed.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TebexJsCheckoutClosed.Builder)super.clearField(var1);
      }

      public TebexJsCheckoutClosed.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TebexJsCheckoutClosed.Builder)super.clearOneof(var1);
      }

      public TebexJsCheckoutClosed.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TebexJsCheckoutClosed.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TebexJsCheckoutClosed.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TebexJsCheckoutClosed.Builder)super.addRepeatedField(var1, var2);
      }

      public TebexJsCheckoutClosed.Builder mergeFrom(Message var1) {
         if (var1 instanceof TebexJsCheckoutClosed) {
            return this.mergeFrom((TebexJsCheckoutClosed)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TebexJsCheckoutClosed.Builder mergeFrom(TebexJsCheckoutClosed var1) {
         if (var1 == TebexJsCheckoutClosed.getDefaultInstance()) {
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

      public TebexJsCheckoutClosed.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final TebexJsCheckoutClosed.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TebexJsCheckoutClosed.Builder)super.setUnknownFields(var1);
      }

      public final TebexJsCheckoutClosed.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TebexJsCheckoutClosed.Builder)super.mergeUnknownFields(var1);
      }
   }
}
