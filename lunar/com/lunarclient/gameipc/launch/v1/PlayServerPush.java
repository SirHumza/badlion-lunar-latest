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

public final class PlayServerPush extends GeneratedMessageV3 implements PlayServerPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int AUTO_JOIN_SERVER_IP_FIELD_NUMBER = 1;
   private volatile Object autoJoinServerIp_ = "";
   private byte memoizedIsInitialized = -1;
   private static final PlayServerPush DEFAULT_INSTANCE = new PlayServerPush();
   private static final Parser<PlayServerPush> PARSER = new AbstractParser<PlayServerPush>() {
      public PlayServerPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayServerPush.Builder var3 = PlayServerPush.newBuilder();

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

   private PlayServerPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayServerPush() {
      this.autoJoinServerIp_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayServerPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayServerPush.class, PlayServerPush.Builder.class);
   }

   @Override
   public String getAutoJoinServerIp() {
      Object var1 = this.autoJoinServerIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.autoJoinServerIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getAutoJoinServerIpBytes() {
      Object var1 = this.autoJoinServerIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.autoJoinServerIp_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.autoJoinServerIp_)) {
         GeneratedMessageV3.writeString(var1, 1, this.autoJoinServerIp_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.autoJoinServerIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.autoJoinServerIp_);
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

      if (!(var1 instanceof PlayServerPush)) {
         return super.equals(var1);
      }

      PlayServerPush var2 = (PlayServerPush)var1;
      return !this.getAutoJoinServerIp().equals(var2.getAutoJoinServerIp()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getAutoJoinServerIp().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayServerPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayServerPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayServerPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayServerPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayServerPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayServerPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayServerPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayServerPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayServerPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayServerPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayServerPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayServerPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayServerPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayServerPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayServerPush.Builder newBuilder(PlayServerPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayServerPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayServerPush.Builder() : new PlayServerPush.Builder().mergeFrom(this);
   }

   protected PlayServerPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayServerPush.Builder(var1);
   }

   public static PlayServerPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayServerPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayServerPush> getParserForType() {
      return PARSER;
   }

   public PlayServerPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayServerPush.Builder> implements PlayServerPushOrBuilder {
      private int bitField0_;
      private Object autoJoinServerIp_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayServerPush.class, PlayServerPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PlayServerPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.autoJoinServerIp_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_launch_v1_PlayServerPush_descriptor;
      }

      public PlayServerPush getDefaultInstanceForType() {
         return PlayServerPush.getDefaultInstance();
      }

      public PlayServerPush build() {
         PlayServerPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayServerPush buildPartial() {
         PlayServerPush var1 = new PlayServerPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayServerPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.autoJoinServerIp_ = this.autoJoinServerIp_;
         }
      }

      public PlayServerPush.Builder clone() {
         return (PlayServerPush.Builder)super.clone();
      }

      public PlayServerPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayServerPush.Builder)super.setField(var1, var2);
      }

      public PlayServerPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayServerPush.Builder)super.clearField(var1);
      }

      public PlayServerPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayServerPush.Builder)super.clearOneof(var1);
      }

      public PlayServerPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayServerPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayServerPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayServerPush.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayServerPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayServerPush) {
            return this.mergeFrom((PlayServerPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayServerPush.Builder mergeFrom(PlayServerPush var1) {
         if (var1 == PlayServerPush.getDefaultInstance()) {
            return this;
         }

         if (!var1.getAutoJoinServerIp().isEmpty()) {
            this.autoJoinServerIp_ = var1.autoJoinServerIp_;
            this.bitField0_ |= 1;
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

      public PlayServerPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.autoJoinServerIp_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
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
      public String getAutoJoinServerIp() {
         Object var1 = this.autoJoinServerIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.autoJoinServerIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAutoJoinServerIpBytes() {
         Object var1 = this.autoJoinServerIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.autoJoinServerIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayServerPush.Builder setAutoJoinServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autoJoinServerIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayServerPush.Builder clearAutoJoinServerIp() {
         this.autoJoinServerIp_ = PlayServerPush.getDefaultInstance().getAutoJoinServerIp();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public PlayServerPush.Builder setAutoJoinServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayServerPush.checkByteStringIsUtf8(var1);
         this.autoJoinServerIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final PlayServerPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayServerPush.Builder)super.setUnknownFields(var1);
      }

      public final PlayServerPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayServerPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
