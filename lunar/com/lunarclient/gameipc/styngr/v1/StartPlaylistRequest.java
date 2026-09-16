package com.lunarclient.gameipc.styngr.v1;

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

public final class StartPlaylistRequest extends GeneratedMessageV3 implements StartPlaylistRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYLIST_TYPE_FIELD_NUMBER = 1;
   private int playlistType_ = 0;
   public static final int PLAYLIST_ID_FIELD_NUMBER = 2;
   private volatile Object playlistId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final StartPlaylistRequest DEFAULT_INSTANCE = new StartPlaylistRequest();
   private static final Parser<StartPlaylistRequest> PARSER = new AbstractParser<StartPlaylistRequest>() {
      public StartPlaylistRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartPlaylistRequest.Builder var3 = StartPlaylistRequest.newBuilder();

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

   private StartPlaylistRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartPlaylistRequest() {
      this.playlistType_ = 0;
      this.playlistId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartPlaylistRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartPlaylistRequest.class, StartPlaylistRequest.Builder.class);
   }

   @Override
   public int getPlaylistTypeValue() {
      return this.playlistType_;
   }

   @Override
   public PlaylistLicense getPlaylistType() {
      PlaylistLicense var1 = PlaylistLicense.forNumber(this.playlistType_);
      return var1 == null ? PlaylistLicense.UNRECOGNIZED : var1;
   }

   @Override
   public String getPlaylistId() {
      Object var1 = this.playlistId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.playlistId_ = var3;
      return var3;
   }

   @Override
   public ByteString getPlaylistIdBytes() {
      Object var1 = this.playlistId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.playlistId_ = var2;
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
      if (this.playlistType_ != PlaylistLicense.PLAYLIST_LICENSE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.playlistType_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playlistId_)) {
         GeneratedMessageV3.writeString(var1, 2, this.playlistId_);
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
      if (this.playlistType_ != PlaylistLicense.PLAYLIST_LICENSE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.playlistType_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playlistId_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.playlistId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StartPlaylistRequest)) {
         return super.equals(var1);
      } else {
         StartPlaylistRequest var2 = (StartPlaylistRequest)var1;
         if (this.playlistType_ != var2.playlistType_) {
            return false;
         } else {
            return !this.getPlaylistId().equals(var2.getPlaylistId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.playlistType_;
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getPlaylistId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartPlaylistRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartPlaylistRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartPlaylistRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartPlaylistRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartPlaylistRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartPlaylistRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartPlaylistRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartPlaylistRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartPlaylistRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartPlaylistRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartPlaylistRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartPlaylistRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartPlaylistRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartPlaylistRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartPlaylistRequest.Builder newBuilder(StartPlaylistRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartPlaylistRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartPlaylistRequest.Builder() : new StartPlaylistRequest.Builder().mergeFrom(this);
   }

   protected StartPlaylistRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartPlaylistRequest.Builder(var1);
   }

   public static StartPlaylistRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartPlaylistRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartPlaylistRequest> getParserForType() {
      return PARSER;
   }

   public StartPlaylistRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartPlaylistRequest.Builder> implements StartPlaylistRequestOrBuilder {
      private int bitField0_;
      private int playlistType_ = 0;
      private Object playlistId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartPlaylistRequest.class, StartPlaylistRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartPlaylistRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playlistType_ = 0;
         this.playlistId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_StartPlaylistRequest_descriptor;
      }

      public StartPlaylistRequest getDefaultInstanceForType() {
         return StartPlaylistRequest.getDefaultInstance();
      }

      public StartPlaylistRequest build() {
         StartPlaylistRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartPlaylistRequest buildPartial() {
         StartPlaylistRequest var1 = new StartPlaylistRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StartPlaylistRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.playlistType_ = this.playlistType_;
         }

         if ((var2 & 2) != 0) {
            var1.playlistId_ = this.playlistId_;
         }
      }

      public StartPlaylistRequest.Builder clone() {
         return (StartPlaylistRequest.Builder)super.clone();
      }

      public StartPlaylistRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartPlaylistRequest.Builder)super.setField(var1, var2);
      }

      public StartPlaylistRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartPlaylistRequest.Builder)super.clearField(var1);
      }

      public StartPlaylistRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartPlaylistRequest.Builder)super.clearOneof(var1);
      }

      public StartPlaylistRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartPlaylistRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartPlaylistRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartPlaylistRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public StartPlaylistRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartPlaylistRequest) {
            return this.mergeFrom((StartPlaylistRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartPlaylistRequest.Builder mergeFrom(StartPlaylistRequest var1) {
         if (var1 == StartPlaylistRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.playlistType_ != 0) {
            this.setPlaylistTypeValue(var1.getPlaylistTypeValue());
         }

         if (!var1.getPlaylistId().isEmpty()) {
            this.playlistId_ = var1.playlistId_;
            this.bitField0_ |= 2;
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

      public StartPlaylistRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.playlistType_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.playlistId_ = var1.readStringRequireUtf8();
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
      public int getPlaylistTypeValue() {
         return this.playlistType_;
      }

      public StartPlaylistRequest.Builder setPlaylistTypeValue(int var1) {
         this.playlistType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public PlaylistLicense getPlaylistType() {
         PlaylistLicense var1 = PlaylistLicense.forNumber(this.playlistType_);
         return var1 == null ? PlaylistLicense.UNRECOGNIZED : var1;
      }

      public StartPlaylistRequest.Builder setPlaylistType(PlaylistLicense var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.playlistType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public StartPlaylistRequest.Builder clearPlaylistType() {
         this.bitField0_ &= -2;
         this.playlistType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getPlaylistId() {
         Object var1 = this.playlistId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.playlistId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlaylistIdBytes() {
         Object var1 = this.playlistId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.playlistId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartPlaylistRequest.Builder setPlaylistId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playlistId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StartPlaylistRequest.Builder clearPlaylistId() {
         this.playlistId_ = StartPlaylistRequest.getDefaultInstance().getPlaylistId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StartPlaylistRequest.Builder setPlaylistIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartPlaylistRequest.checkByteStringIsUtf8(var1);
         this.playlistId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final StartPlaylistRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartPlaylistRequest.Builder)super.setUnknownFields(var1);
      }

      public final StartPlaylistRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartPlaylistRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
