package com.lunarclient.websocket.heartbeat.v1;

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

public final class OnlineCounts extends GeneratedMessageV3 implements OnlineCountsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LAUNCHER_FIELD_NUMBER = 1;
   private int launcher_ = 0;
   public static final int GAME_FIELD_NUMBER = 2;
   private int game_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OnlineCounts DEFAULT_INSTANCE = new OnlineCounts();
   private static final Parser<OnlineCounts> PARSER = new AbstractParser<OnlineCounts>() {
      public OnlineCounts parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OnlineCounts.Builder var3 = OnlineCounts.newBuilder();

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

   private OnlineCounts(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OnlineCounts() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OnlineCounts();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OnlineCounts.class, OnlineCounts.Builder.class);
   }

   @Override
   public int getLauncher() {
      return this.launcher_;
   }

   @Override
   public int getGame() {
      return this.game_;
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
      if (this.launcher_ != 0) {
         var1.writeInt32(1, this.launcher_);
      }

      if (this.game_ != 0) {
         var1.writeInt32(2, this.game_);
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
      if (this.launcher_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.launcher_);
      }

      if (this.game_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.game_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OnlineCounts)) {
         return super.equals(var1);
      } else {
         OnlineCounts var2 = (OnlineCounts)var1;
         if (this.getLauncher() != var2.getLauncher()) {
            return false;
         } else {
            return this.getGame() != var2.getGame() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getLauncher();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getGame();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OnlineCounts parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OnlineCounts parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OnlineCounts parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OnlineCounts parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OnlineCounts parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OnlineCounts parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OnlineCounts parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OnlineCounts parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OnlineCounts parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OnlineCounts parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OnlineCounts parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OnlineCounts parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OnlineCounts.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OnlineCounts.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OnlineCounts.Builder newBuilder(OnlineCounts var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OnlineCounts.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OnlineCounts.Builder() : new OnlineCounts.Builder().mergeFrom(this);
   }

   protected OnlineCounts.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OnlineCounts.Builder(var1);
   }

   public static OnlineCounts getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OnlineCounts> parser() {
      return PARSER;
   }

   @Override
   public Parser<OnlineCounts> getParserForType() {
      return PARSER;
   }

   public OnlineCounts getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OnlineCounts.Builder> implements OnlineCountsOrBuilder {
      private int bitField0_;
      private int launcher_;
      private int game_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OnlineCounts.class, OnlineCounts.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OnlineCounts.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.launcher_ = 0;
         this.game_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_descriptor;
      }

      public OnlineCounts getDefaultInstanceForType() {
         return OnlineCounts.getDefaultInstance();
      }

      public OnlineCounts build() {
         OnlineCounts var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OnlineCounts buildPartial() {
         OnlineCounts var1 = new OnlineCounts(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OnlineCounts var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.launcher_ = this.launcher_;
         }

         if ((var2 & 2) != 0) {
            var1.game_ = this.game_;
         }
      }

      public OnlineCounts.Builder clone() {
         return (OnlineCounts.Builder)super.clone();
      }

      public OnlineCounts.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OnlineCounts.Builder)super.setField(var1, var2);
      }

      public OnlineCounts.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OnlineCounts.Builder)super.clearField(var1);
      }

      public OnlineCounts.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OnlineCounts.Builder)super.clearOneof(var1);
      }

      public OnlineCounts.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OnlineCounts.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OnlineCounts.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OnlineCounts.Builder)super.addRepeatedField(var1, var2);
      }

      public OnlineCounts.Builder mergeFrom(Message var1) {
         if (var1 instanceof OnlineCounts) {
            return this.mergeFrom((OnlineCounts)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OnlineCounts.Builder mergeFrom(OnlineCounts var1) {
         if (var1 == OnlineCounts.getDefaultInstance()) {
            return this;
         }

         if (var1.getLauncher() != 0) {
            this.setLauncher(var1.getLauncher());
         }

         if (var1.getGame() != 0) {
            this.setGame(var1.getGame());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OnlineCounts.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.launcher_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.game_ = var1.readInt32();
                     this.bitField0_ |= 2;
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
      public int getLauncher() {
         return this.launcher_;
      }

      public OnlineCounts.Builder setLauncher(int var1) {
         this.launcher_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OnlineCounts.Builder clearLauncher() {
         this.bitField0_ &= -2;
         this.launcher_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getGame() {
         return this.game_;
      }

      public OnlineCounts.Builder setGame(int var1) {
         this.game_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OnlineCounts.Builder clearGame() {
         this.bitField0_ &= -3;
         this.game_ = 0;
         this.onChanged();
         return this;
      }

      public final OnlineCounts.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OnlineCounts.Builder)super.setUnknownFields(var1);
      }

      public final OnlineCounts.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OnlineCounts.Builder)super.mergeUnknownFields(var1);
      }
   }
}
