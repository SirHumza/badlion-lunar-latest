package com.lunarclient.gameipc.handshake.v1;

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

public final class Handshake extends GeneratedMessageV3 implements HandshakeOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LAUNCH_ID_FIELD_NUMBER = 1;
   private volatile Object launchId_ = "";
   public static final int PROCESS_ID_FIELD_NUMBER = 2;
   private volatile Object processId_ = "";
   public static final int INSTALLATION_ID_FIELD_NUMBER = 3;
   private volatile Object installationId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final Handshake DEFAULT_INSTANCE = new Handshake();
   private static final Parser<Handshake> PARSER = new AbstractParser<Handshake>() {
      public Handshake parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Handshake.Builder var3 = Handshake.newBuilder();

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

   private Handshake(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Handshake() {
      this.launchId_ = "";
      this.processId_ = "";
      this.installationId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Handshake();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_gameipc_handshake_v1_Handshake_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_gameipc_handshake_v1_Handshake_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Handshake.class, Handshake.Builder.class);
   }

   @Override
   public String getLaunchId() {
      Object var1 = this.launchId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.launchId_ = var3;
      return var3;
   }

   @Override
   public ByteString getLaunchIdBytes() {
      Object var1 = this.launchId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.launchId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getProcessId() {
      Object var1 = this.processId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.processId_ = var3;
      return var3;
   }

   @Override
   public ByteString getProcessIdBytes() {
      Object var1 = this.processId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.processId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getInstallationId() {
      Object var1 = this.installationId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.installationId_ = var3;
      return var3;
   }

   @Override
   public ByteString getInstallationIdBytes() {
      Object var1 = this.installationId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.installationId_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.launchId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.launchId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.processId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.processId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.installationId_)) {
         GeneratedMessageV3.writeString(var1, 3, this.installationId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.launchId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.launchId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.processId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.processId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.installationId_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.installationId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Handshake)) {
         return super.equals(var1);
      } else {
         Handshake var2 = (Handshake)var1;
         if (!this.getLaunchId().equals(var2.getLaunchId())) {
            return false;
         } else if (!this.getProcessId().equals(var2.getProcessId())) {
            return false;
         } else {
            return !this.getInstallationId().equals(var2.getInstallationId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getLaunchId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getProcessId().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getInstallationId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Handshake parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Handshake parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Handshake parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Handshake parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Handshake parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Handshake parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Handshake parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Handshake parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Handshake parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Handshake parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Handshake parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Handshake parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Handshake.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Handshake.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Handshake.Builder newBuilder(Handshake var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Handshake.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Handshake.Builder() : new Handshake.Builder().mergeFrom(this);
   }

   protected Handshake.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Handshake.Builder(var1);
   }

   public static Handshake getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Handshake> parser() {
      return PARSER;
   }

   @Override
   public Parser<Handshake> getParserForType() {
      return PARSER;
   }

   public Handshake getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Handshake.Builder> implements HandshakeOrBuilder {
      private int bitField0_;
      private Object launchId_ = "";
      private Object processId_ = "";
      private Object installationId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_gameipc_handshake_v1_Handshake_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_gameipc_handshake_v1_Handshake_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Handshake.class, Handshake.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Handshake.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.launchId_ = "";
         this.processId_ = "";
         this.installationId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_gameipc_handshake_v1_Handshake_descriptor;
      }

      public Handshake getDefaultInstanceForType() {
         return Handshake.getDefaultInstance();
      }

      public Handshake build() {
         Handshake var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Handshake buildPartial() {
         Handshake var1 = new Handshake(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Handshake var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.launchId_ = this.launchId_;
         }

         if ((var2 & 2) != 0) {
            var1.processId_ = this.processId_;
         }

         if ((var2 & 4) != 0) {
            var1.installationId_ = this.installationId_;
         }
      }

      public Handshake.Builder clone() {
         return (Handshake.Builder)super.clone();
      }

      public Handshake.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Handshake.Builder)super.setField(var1, var2);
      }

      public Handshake.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Handshake.Builder)super.clearField(var1);
      }

      public Handshake.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Handshake.Builder)super.clearOneof(var1);
      }

      public Handshake.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Handshake.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Handshake.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Handshake.Builder)super.addRepeatedField(var1, var2);
      }

      public Handshake.Builder mergeFrom(Message var1) {
         if (var1 instanceof Handshake) {
            return this.mergeFrom((Handshake)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Handshake.Builder mergeFrom(Handshake var1) {
         if (var1 == Handshake.getDefaultInstance()) {
            return this;
         }

         if (!var1.getLaunchId().isEmpty()) {
            this.launchId_ = var1.launchId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getProcessId().isEmpty()) {
            this.processId_ = var1.processId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getInstallationId().isEmpty()) {
            this.installationId_ = var1.installationId_;
            this.bitField0_ |= 4;
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

      public Handshake.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.launchId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.processId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.installationId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
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
      public String getLaunchId() {
         Object var1 = this.launchId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.launchId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLaunchIdBytes() {
         Object var1 = this.launchId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.launchId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setLaunchId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.launchId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearLaunchId() {
         this.launchId_ = Handshake.getDefaultInstance().getLaunchId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setLaunchIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.launchId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getProcessId() {
         Object var1 = this.processId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.processId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getProcessIdBytes() {
         Object var1 = this.processId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.processId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setProcessId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.processId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearProcessId() {
         this.processId_ = Handshake.getDefaultInstance().getProcessId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setProcessIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.processId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getInstallationId() {
         Object var1 = this.installationId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.installationId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getInstallationIdBytes() {
         Object var1 = this.installationId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.installationId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Handshake.Builder setInstallationId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.installationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Handshake.Builder clearInstallationId() {
         this.installationId_ = Handshake.getDefaultInstance().getInstallationId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public Handshake.Builder setInstallationIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Handshake.checkByteStringIsUtf8(var1);
         this.installationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final Handshake.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Handshake.Builder)super.setUnknownFields(var1);
      }

      public final Handshake.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Handshake.Builder)super.mergeUnknownFields(var1);
      }
   }
}
