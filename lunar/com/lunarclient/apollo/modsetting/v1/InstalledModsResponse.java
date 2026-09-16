package com.lunarclient.apollo.modsetting.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class InstalledModsResponse extends GeneratedMessageV3 implements InstalledModsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int PAGE_FIELD_NUMBER = 2;
   private int page_ = 0;
   public static final int TOTAL_PAGES_FIELD_NUMBER = 3;
   private int totalPages_ = 0;
   public static final int MOD_GROUPS_FIELD_NUMBER = 4;
   private List<ModGroup> modGroups_;
   private byte memoizedIsInitialized = -1;
   private static final InstalledModsResponse DEFAULT_INSTANCE = new InstalledModsResponse();
   private static final Parser<InstalledModsResponse> PARSER = new AbstractParser<InstalledModsResponse>() {
      public InstalledModsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InstalledModsResponse.Builder var3 = InstalledModsResponse.newBuilder();

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

   private InstalledModsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InstalledModsResponse() {
      this.requestId_ = ByteString.EMPTY;
      this.modGroups_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InstalledModsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InstalledModsResponse.class, InstalledModsResponse.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
   }

   @Override
   public int getPage() {
      return this.page_;
   }

   @Override
   public int getTotalPages() {
      return this.totalPages_;
   }

   @Override
   public List<ModGroup> getModGroupsList() {
      return this.modGroups_;
   }

   @Override
   public List<? extends ModGroupOrBuilder> getModGroupsOrBuilderList() {
      return this.modGroups_;
   }

   @Override
   public int getModGroupsCount() {
      return this.modGroups_.size();
   }

   @Override
   public ModGroup getModGroups(int var1) {
      return this.modGroups_.get(var1);
   }

   @Override
   public ModGroupOrBuilder getModGroupsOrBuilder(int var1) {
      return this.modGroups_.get(var1);
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
      if (!this.requestId_.isEmpty()) {
         var1.writeBytes(1, this.requestId_);
      }

      if (this.page_ != 0) {
         var1.writeInt32(2, this.page_);
      }

      if (this.totalPages_ != 0) {
         var1.writeInt32(3, this.totalPages_);
      }

      for (int var2 = 0; var2 < this.modGroups_.size(); var2++) {
         var1.writeMessage(4, this.modGroups_.get(var2));
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
      if (!this.requestId_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(1, this.requestId_);
      }

      if (this.page_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.page_);
      }

      if (this.totalPages_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.totalPages_);
      }

      for (int var2 = 0; var2 < this.modGroups_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.modGroups_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InstalledModsResponse)) {
         return super.equals(var1);
      } else {
         InstalledModsResponse var2 = (InstalledModsResponse)var1;
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else if (this.getPage() != var2.getPage()) {
            return false;
         } else if (this.getTotalPages() != var2.getTotalPages()) {
            return false;
         } else {
            return !this.getModGroupsList().equals(var2.getModGroupsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getRequestId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getPage();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getTotalPages();
      if (this.getModGroupsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getModGroupsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InstalledModsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledModsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledModsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledModsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledModsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledModsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledModsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InstalledModsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InstalledModsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InstalledModsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InstalledModsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InstalledModsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InstalledModsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InstalledModsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InstalledModsResponse.Builder newBuilder(InstalledModsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InstalledModsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InstalledModsResponse.Builder() : new InstalledModsResponse.Builder().mergeFrom(this);
   }

   protected InstalledModsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InstalledModsResponse.Builder(var1);
   }

   public static InstalledModsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InstalledModsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<InstalledModsResponse> getParserForType() {
      return PARSER;
   }

   public InstalledModsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InstalledModsResponse.Builder> implements InstalledModsResponseOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private int page_;
      private int totalPages_;
      private List<ModGroup> modGroups_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ModGroup, ModGroup.Builder, ModGroupOrBuilder> modGroupsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InstalledModsResponse.class, InstalledModsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InstalledModsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.page_ = 0;
         this.totalPages_ = 0;
         if (this.modGroupsBuilder_ == null) {
            this.modGroups_ = Collections.emptyList();
         } else {
            this.modGroups_ = null;
            this.modGroupsBuilder_.clear();
         }

         this.bitField0_ &= -9;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_descriptor;
      }

      public InstalledModsResponse getDefaultInstanceForType() {
         return InstalledModsResponse.getDefaultInstance();
      }

      public InstalledModsResponse build() {
         InstalledModsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InstalledModsResponse buildPartial() {
         InstalledModsResponse var1 = new InstalledModsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(InstalledModsResponse var1) {
         if (this.modGroupsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.modGroups_ = Collections.unmodifiableList(this.modGroups_);
               this.bitField0_ &= -9;
            }

            var1.modGroups_ = this.modGroups_;
         } else {
            var1.modGroups_ = this.modGroupsBuilder_.build();
         }
      }

      private void buildPartial0(InstalledModsResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }

         if ((var2 & 2) != 0) {
            var1.page_ = this.page_;
         }

         if ((var2 & 4) != 0) {
            var1.totalPages_ = this.totalPages_;
         }
      }

      public InstalledModsResponse.Builder clone() {
         return (InstalledModsResponse.Builder)super.clone();
      }

      public InstalledModsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InstalledModsResponse.Builder)super.setField(var1, var2);
      }

      public InstalledModsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InstalledModsResponse.Builder)super.clearField(var1);
      }

      public InstalledModsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InstalledModsResponse.Builder)super.clearOneof(var1);
      }

      public InstalledModsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InstalledModsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InstalledModsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InstalledModsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public InstalledModsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof InstalledModsResponse) {
            return this.mergeFrom((InstalledModsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InstalledModsResponse.Builder mergeFrom(InstalledModsResponse var1) {
         if (var1 == InstalledModsResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         if (var1.getPage() != 0) {
            this.setPage(var1.getPage());
         }

         if (var1.getTotalPages() != 0) {
            this.setTotalPages(var1.getTotalPages());
         }

         if (this.modGroupsBuilder_ == null) {
            if (!var1.modGroups_.isEmpty()) {
               if (this.modGroups_.isEmpty()) {
                  this.modGroups_ = var1.modGroups_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureModGroupsIsMutable();
                  this.modGroups_.addAll(var1.modGroups_);
               }

               this.onChanged();
            }
         } else if (!var1.modGroups_.isEmpty()) {
            if (this.modGroupsBuilder_.isEmpty()) {
               this.modGroupsBuilder_.dispose();
               this.modGroupsBuilder_ = null;
               this.modGroups_ = var1.modGroups_;
               this.bitField0_ &= -9;
               this.modGroupsBuilder_ = InstalledModsResponse.alwaysUseFieldBuilders ? this.getModGroupsFieldBuilder() : null;
            } else {
               this.modGroupsBuilder_.addAllMessages(var1.modGroups_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InstalledModsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.requestId_ = var1.readBytes();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.page_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.totalPages_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     ModGroup var5 = var1.readMessage(ModGroup.parser(), var2);
                     if (this.modGroupsBuilder_ == null) {
                        this.ensureModGroupsIsMutable();
                        this.modGroups_.add(var5);
                     } else {
                        this.modGroupsBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public ByteString getRequestId() {
         return this.requestId_;
      }

      public InstalledModsResponse.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InstalledModsResponse.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = InstalledModsResponse.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      @Override
      public int getPage() {
         return this.page_;
      }

      public InstalledModsResponse.Builder setPage(int var1) {
         this.page_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InstalledModsResponse.Builder clearPage() {
         this.bitField0_ &= -3;
         this.page_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getTotalPages() {
         return this.totalPages_;
      }

      public InstalledModsResponse.Builder setTotalPages(int var1) {
         this.totalPages_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InstalledModsResponse.Builder clearTotalPages() {
         this.bitField0_ &= -5;
         this.totalPages_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureModGroupsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.modGroups_ = new ArrayList<>(this.modGroups_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<ModGroup> getModGroupsList() {
         return this.modGroupsBuilder_ == null ? Collections.unmodifiableList(this.modGroups_) : this.modGroupsBuilder_.getMessageList();
      }

      @Override
      public int getModGroupsCount() {
         return this.modGroupsBuilder_ == null ? this.modGroups_.size() : this.modGroupsBuilder_.getCount();
      }

      @Override
      public ModGroup getModGroups(int var1) {
         return this.modGroupsBuilder_ == null ? this.modGroups_.get(var1) : this.modGroupsBuilder_.getMessage(var1);
      }

      public InstalledModsResponse.Builder setModGroups(int var1, ModGroup var2) {
         if (this.modGroupsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureModGroupsIsMutable();
            this.modGroups_.set(var1, var2);
            this.onChanged();
         } else {
            this.modGroupsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public InstalledModsResponse.Builder setModGroups(int var1, ModGroup.Builder var2) {
         if (this.modGroupsBuilder_ == null) {
            this.ensureModGroupsIsMutable();
            this.modGroups_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.modGroupsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public InstalledModsResponse.Builder addModGroups(ModGroup var1) {
         if (this.modGroupsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureModGroupsIsMutable();
            this.modGroups_.add(var1);
            this.onChanged();
         } else {
            this.modGroupsBuilder_.addMessage(var1);
         }

         return this;
      }

      public InstalledModsResponse.Builder addModGroups(int var1, ModGroup var2) {
         if (this.modGroupsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureModGroupsIsMutable();
            this.modGroups_.add(var1, var2);
            this.onChanged();
         } else {
            this.modGroupsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public InstalledModsResponse.Builder addModGroups(ModGroup.Builder var1) {
         if (this.modGroupsBuilder_ == null) {
            this.ensureModGroupsIsMutable();
            this.modGroups_.add(var1.build());
            this.onChanged();
         } else {
            this.modGroupsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public InstalledModsResponse.Builder addModGroups(int var1, ModGroup.Builder var2) {
         if (this.modGroupsBuilder_ == null) {
            this.ensureModGroupsIsMutable();
            this.modGroups_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.modGroupsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public InstalledModsResponse.Builder addAllModGroups(Iterable<? extends ModGroup> var1) {
         if (this.modGroupsBuilder_ == null) {
            this.ensureModGroupsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.modGroups_);
            this.onChanged();
         } else {
            this.modGroupsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public InstalledModsResponse.Builder clearModGroups() {
         if (this.modGroupsBuilder_ == null) {
            this.modGroups_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.modGroupsBuilder_.clear();
         }

         return this;
      }

      public InstalledModsResponse.Builder removeModGroups(int var1) {
         if (this.modGroupsBuilder_ == null) {
            this.ensureModGroupsIsMutable();
            this.modGroups_.remove(var1);
            this.onChanged();
         } else {
            this.modGroupsBuilder_.remove(var1);
         }

         return this;
      }

      public ModGroup.Builder getModGroupsBuilder(int var1) {
         return this.getModGroupsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ModGroupOrBuilder getModGroupsOrBuilder(int var1) {
         return this.modGroupsBuilder_ == null ? this.modGroups_.get(var1) : this.modGroupsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ModGroupOrBuilder> getModGroupsOrBuilderList() {
         return this.modGroupsBuilder_ != null ? this.modGroupsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.modGroups_);
      }

      public ModGroup.Builder addModGroupsBuilder() {
         return this.getModGroupsFieldBuilder().addBuilder(ModGroup.getDefaultInstance());
      }

      public ModGroup.Builder addModGroupsBuilder(int var1) {
         return this.getModGroupsFieldBuilder().addBuilder(var1, ModGroup.getDefaultInstance());
      }

      public List<ModGroup.Builder> getModGroupsBuilderList() {
         return this.getModGroupsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ModGroup, ModGroup.Builder, ModGroupOrBuilder> getModGroupsFieldBuilder() {
         if (this.modGroupsBuilder_ == null) {
            this.modGroupsBuilder_ = new RepeatedFieldBuilderV3<>(this.modGroups_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.modGroups_ = null;
         }

         return this.modGroupsBuilder_;
      }

      public final InstalledModsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InstalledModsResponse.Builder)super.setUnknownFields(var1);
      }

      public final InstalledModsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InstalledModsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
