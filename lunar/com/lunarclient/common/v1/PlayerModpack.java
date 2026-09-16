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

public final class PlayerModpack extends GeneratedMessageV3 implements PlayerModpackOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MODRINTH_ID_FIELD_NUMBER = 1;
   private volatile Object modrinthId_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int ICON_URL_FIELD_NUMBER = 3;
   private volatile Object iconUrl_ = "";
   public static final int MODRINTH_VERSION_ID_FIELD_NUMBER = 4;
   private volatile Object modrinthVersionId_ = "";
   public static final int CURSEFORGE_ID_FIELD_NUMBER = 5;
   private volatile Object curseforgeId_ = "";
   public static final int CURSEFORGE_FILE_ID_FIELD_NUMBER = 6;
   private volatile Object curseforgeFileId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final PlayerModpack DEFAULT_INSTANCE = new PlayerModpack();
   private static final Parser<PlayerModpack> PARSER = new AbstractParser<PlayerModpack>() {
      public PlayerModpack parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerModpack.Builder var3 = PlayerModpack.newBuilder();

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

   private PlayerModpack(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerModpack() {
      this.modrinthId_ = "";
      this.name_ = "";
      this.iconUrl_ = "";
      this.modrinthVersionId_ = "";
      this.curseforgeId_ = "";
      this.curseforgeFileId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerModpack();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ModpackProto.internal_static_lunarclient_common_v1_PlayerModpack_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ModpackProto.internal_static_lunarclient_common_v1_PlayerModpack_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerModpack.class, PlayerModpack.Builder.class);
   }

   @Override
   public String getModrinthId() {
      Object var1 = this.modrinthId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.modrinthId_ = var3;
      return var3;
   }

   @Override
   public ByteString getModrinthIdBytes() {
      Object var1 = this.modrinthId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.modrinthId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getIconUrl() {
      Object var1 = this.iconUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.iconUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getIconUrlBytes() {
      Object var1 = this.iconUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.iconUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getModrinthVersionId() {
      Object var1 = this.modrinthVersionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.modrinthVersionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getModrinthVersionIdBytes() {
      Object var1 = this.modrinthVersionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.modrinthVersionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCurseforgeId() {
      Object var1 = this.curseforgeId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.curseforgeId_ = var3;
      return var3;
   }

   @Override
   public ByteString getCurseforgeIdBytes() {
      Object var1 = this.curseforgeId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.curseforgeId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCurseforgeFileId() {
      Object var1 = this.curseforgeFileId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.curseforgeFileId_ = var3;
      return var3;
   }

   @Override
   public ByteString getCurseforgeFileIdBytes() {
      Object var1 = this.curseforgeFileId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.curseforgeFileId_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.modrinthId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.modrinthId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.iconUrl_)) {
         GeneratedMessageV3.writeString(var1, 3, this.iconUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.modrinthVersionId_)) {
         GeneratedMessageV3.writeString(var1, 4, this.modrinthVersionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.curseforgeId_)) {
         GeneratedMessageV3.writeString(var1, 5, this.curseforgeId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.curseforgeFileId_)) {
         GeneratedMessageV3.writeString(var1, 6, this.curseforgeFileId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.modrinthId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.modrinthId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.iconUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.iconUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.modrinthVersionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.modrinthVersionId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.curseforgeId_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.curseforgeId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.curseforgeFileId_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.curseforgeFileId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerModpack)) {
         return super.equals(var1);
      } else {
         PlayerModpack var2 = (PlayerModpack)var1;
         if (!this.getModrinthId().equals(var2.getModrinthId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getIconUrl().equals(var2.getIconUrl())) {
            return false;
         } else if (!this.getModrinthVersionId().equals(var2.getModrinthVersionId())) {
            return false;
         } else if (!this.getCurseforgeId().equals(var2.getCurseforgeId())) {
            return false;
         } else {
            return !this.getCurseforgeFileId().equals(var2.getCurseforgeFileId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getModrinthId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getIconUrl().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getModrinthVersionId().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getCurseforgeId().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getCurseforgeFileId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerModpack parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerModpack parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerModpack parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerModpack parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerModpack parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerModpack parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerModpack parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerModpack parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerModpack parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerModpack parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerModpack parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerModpack parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerModpack.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerModpack.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerModpack.Builder newBuilder(PlayerModpack var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerModpack.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerModpack.Builder() : new PlayerModpack.Builder().mergeFrom(this);
   }

   protected PlayerModpack.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerModpack.Builder(var1);
   }

   public static PlayerModpack getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerModpack> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerModpack> getParserForType() {
      return PARSER;
   }

   public PlayerModpack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerModpack.Builder> implements PlayerModpackOrBuilder {
      private int bitField0_;
      private Object modrinthId_ = "";
      private Object name_ = "";
      private Object iconUrl_ = "";
      private Object modrinthVersionId_ = "";
      private Object curseforgeId_ = "";
      private Object curseforgeFileId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ModpackProto.internal_static_lunarclient_common_v1_PlayerModpack_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ModpackProto.internal_static_lunarclient_common_v1_PlayerModpack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerModpack.class, PlayerModpack.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PlayerModpack.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.modrinthId_ = "";
         this.name_ = "";
         this.iconUrl_ = "";
         this.modrinthVersionId_ = "";
         this.curseforgeId_ = "";
         this.curseforgeFileId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ModpackProto.internal_static_lunarclient_common_v1_PlayerModpack_descriptor;
      }

      public PlayerModpack getDefaultInstanceForType() {
         return PlayerModpack.getDefaultInstance();
      }

      public PlayerModpack build() {
         PlayerModpack var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerModpack buildPartial() {
         PlayerModpack var1 = new PlayerModpack(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerModpack var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.modrinthId_ = this.modrinthId_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.iconUrl_ = this.iconUrl_;
         }

         if ((var2 & 8) != 0) {
            var1.modrinthVersionId_ = this.modrinthVersionId_;
         }

         if ((var2 & 16) != 0) {
            var1.curseforgeId_ = this.curseforgeId_;
         }

         if ((var2 & 32) != 0) {
            var1.curseforgeFileId_ = this.curseforgeFileId_;
         }
      }

      public PlayerModpack.Builder clone() {
         return (PlayerModpack.Builder)super.clone();
      }

      public PlayerModpack.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerModpack.Builder)super.setField(var1, var2);
      }

      public PlayerModpack.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerModpack.Builder)super.clearField(var1);
      }

      public PlayerModpack.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerModpack.Builder)super.clearOneof(var1);
      }

      public PlayerModpack.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerModpack.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerModpack.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerModpack.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerModpack.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerModpack) {
            return this.mergeFrom((PlayerModpack)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerModpack.Builder mergeFrom(PlayerModpack var1) {
         if (var1 == PlayerModpack.getDefaultInstance()) {
            return this;
         }

         if (!var1.getModrinthId().isEmpty()) {
            this.modrinthId_ = var1.modrinthId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getIconUrl().isEmpty()) {
            this.iconUrl_ = var1.iconUrl_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getModrinthVersionId().isEmpty()) {
            this.modrinthVersionId_ = var1.modrinthVersionId_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getCurseforgeId().isEmpty()) {
            this.curseforgeId_ = var1.curseforgeId_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getCurseforgeFileId().isEmpty()) {
            this.curseforgeFileId_ = var1.curseforgeFileId_;
            this.bitField0_ |= 32;
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

      public PlayerModpack.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.modrinthId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.iconUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.modrinthVersionId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.curseforgeId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.curseforgeFileId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
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
      public String getModrinthId() {
         Object var1 = this.modrinthId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.modrinthId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getModrinthIdBytes() {
         Object var1 = this.modrinthId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.modrinthId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerModpack.Builder setModrinthId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.modrinthId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder clearModrinthId() {
         this.modrinthId_ = PlayerModpack.getDefaultInstance().getModrinthId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder setModrinthIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerModpack.checkByteStringIsUtf8(var1);
         this.modrinthId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerModpack.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder clearName() {
         this.name_ = PlayerModpack.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerModpack.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getIconUrl() {
         Object var1 = this.iconUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.iconUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIconUrlBytes() {
         Object var1 = this.iconUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.iconUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerModpack.Builder setIconUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.iconUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder clearIconUrl() {
         this.iconUrl_ = PlayerModpack.getDefaultInstance().getIconUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder setIconUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerModpack.checkByteStringIsUtf8(var1);
         this.iconUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getModrinthVersionId() {
         Object var1 = this.modrinthVersionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.modrinthVersionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getModrinthVersionIdBytes() {
         Object var1 = this.modrinthVersionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.modrinthVersionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerModpack.Builder setModrinthVersionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.modrinthVersionId_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder clearModrinthVersionId() {
         this.modrinthVersionId_ = PlayerModpack.getDefaultInstance().getModrinthVersionId();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder setModrinthVersionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerModpack.checkByteStringIsUtf8(var1);
         this.modrinthVersionId_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getCurseforgeId() {
         Object var1 = this.curseforgeId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.curseforgeId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCurseforgeIdBytes() {
         Object var1 = this.curseforgeId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.curseforgeId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerModpack.Builder setCurseforgeId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.curseforgeId_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder clearCurseforgeId() {
         this.curseforgeId_ = PlayerModpack.getDefaultInstance().getCurseforgeId();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder setCurseforgeIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerModpack.checkByteStringIsUtf8(var1);
         this.curseforgeId_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getCurseforgeFileId() {
         Object var1 = this.curseforgeFileId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.curseforgeFileId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCurseforgeFileIdBytes() {
         Object var1 = this.curseforgeFileId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.curseforgeFileId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PlayerModpack.Builder setCurseforgeFileId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.curseforgeFileId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder clearCurseforgeFileId() {
         this.curseforgeFileId_ = PlayerModpack.getDefaultInstance().getCurseforgeFileId();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder setCurseforgeFileIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PlayerModpack.checkByteStringIsUtf8(var1);
         this.curseforgeFileId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public final PlayerModpack.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerModpack.Builder)super.setUnknownFields(var1);
      }

      public final PlayerModpack.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerModpack.Builder)super.mergeUnknownFields(var1);
      }
   }
}
