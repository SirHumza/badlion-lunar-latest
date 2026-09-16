package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class SearchServersRequest extends GeneratedMessageV3 implements SearchServersRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int QUERY_FIELD_NUMBER = 1;
   private volatile Object query_ = "";
   private byte memoizedIsInitialized = -1;
   private static final SearchServersRequest DEFAULT_INSTANCE = new SearchServersRequest();
   private static final Parser<SearchServersRequest> PARSER = new AbstractParser<SearchServersRequest>() {
      public SearchServersRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SearchServersRequest.Builder var3 = SearchServersRequest.newBuilder();

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

   private SearchServersRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SearchServersRequest() {
      this.query_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SearchServersRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SearchServersRequest.class, SearchServersRequest.Builder.class);
   }

   @Override
   public String getQuery() {
      Object var1 = this.query_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.query_ = var3;
      return var3;
   }

   @Override
   public ByteString getQueryBytes() {
      Object var1 = this.query_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.query_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.query_)) {
         GeneratedMessageV3.writeString(var1, 1, this.query_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.query_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.query_);
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

      if (!(var1 instanceof SearchServersRequest)) {
         return super.equals(var1);
      }

      SearchServersRequest var2 = (SearchServersRequest)var1;
      return !this.getQuery().equals(var2.getQuery()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getQuery().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SearchServersRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SearchServersRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SearchServersRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SearchServersRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SearchServersRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SearchServersRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SearchServersRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SearchServersRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SearchServersRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SearchServersRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SearchServersRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SearchServersRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SearchServersRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SearchServersRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SearchServersRequest.Builder newBuilder(SearchServersRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SearchServersRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SearchServersRequest.Builder() : new SearchServersRequest.Builder().mergeFrom(this);
   }

   protected SearchServersRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SearchServersRequest.Builder(var1);
   }

   public static SearchServersRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SearchServersRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SearchServersRequest> getParserForType() {
      return PARSER;
   }

   public SearchServersRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SearchServersRequest.Builder> implements SearchServersRequestOrBuilder {
      private int bitField0_;
      private Object query_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SearchServersRequest.class, SearchServersRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SearchServersRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.query_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_descriptor;
      }

      public SearchServersRequest getDefaultInstanceForType() {
         return SearchServersRequest.getDefaultInstance();
      }

      public SearchServersRequest build() {
         SearchServersRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SearchServersRequest buildPartial() {
         SearchServersRequest var1 = new SearchServersRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SearchServersRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.query_ = this.query_;
         }
      }

      public SearchServersRequest.Builder clone() {
         return (SearchServersRequest.Builder)super.clone();
      }

      public SearchServersRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SearchServersRequest.Builder)super.setField(var1, var2);
      }

      public SearchServersRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SearchServersRequest.Builder)super.clearField(var1);
      }

      public SearchServersRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SearchServersRequest.Builder)super.clearOneof(var1);
      }

      public SearchServersRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SearchServersRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SearchServersRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SearchServersRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SearchServersRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SearchServersRequest) {
            return this.mergeFrom((SearchServersRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SearchServersRequest.Builder mergeFrom(SearchServersRequest var1) {
         if (var1 == SearchServersRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getQuery().isEmpty()) {
            this.query_ = var1.query_;
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

      public SearchServersRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.query_ = var1.readStringRequireUtf8();
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
      public String getQuery() {
         Object var1 = this.query_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.query_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getQueryBytes() {
         Object var1 = this.query_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.query_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SearchServersRequest.Builder setQuery(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.query_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SearchServersRequest.Builder clearQuery() {
         this.query_ = SearchServersRequest.getDefaultInstance().getQuery();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public SearchServersRequest.Builder setQueryBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SearchServersRequest.checkByteStringIsUtf8(var1);
         this.query_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final SearchServersRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SearchServersRequest.Builder)super.setUnknownFields(var1);
      }

      public final SearchServersRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SearchServersRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
