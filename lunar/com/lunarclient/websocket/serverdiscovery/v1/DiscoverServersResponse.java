package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class DiscoverServersResponse extends GeneratedMessageV3 implements DiscoverServersResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SECTIONS_FIELD_NUMBER = 1;
   private List<ServerSection> sections_;
   private byte memoizedIsInitialized = -1;
   private static final DiscoverServersResponse DEFAULT_INSTANCE = new DiscoverServersResponse();
   private static final Parser<DiscoverServersResponse> PARSER = new AbstractParser<DiscoverServersResponse>() {
      public DiscoverServersResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DiscoverServersResponse.Builder var3 = DiscoverServersResponse.newBuilder();

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

   private DiscoverServersResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DiscoverServersResponse() {
      this.sections_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DiscoverServersResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DiscoverServersResponse.class, DiscoverServersResponse.Builder.class);
   }

   @Override
   public List<ServerSection> getSectionsList() {
      return this.sections_;
   }

   @Override
   public List<? extends ServerSectionOrBuilder> getSectionsOrBuilderList() {
      return this.sections_;
   }

   @Override
   public int getSectionsCount() {
      return this.sections_.size();
   }

   @Override
   public ServerSection getSections(int var1) {
      return this.sections_.get(var1);
   }

   @Override
   public ServerSectionOrBuilder getSectionsOrBuilder(int var1) {
      return this.sections_.get(var1);
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
      for (int var2 = 0; var2 < this.sections_.size(); var2++) {
         var1.writeMessage(1, this.sections_.get(var2));
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

      for (int var2 = 0; var2 < this.sections_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.sections_.get(var2));
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

      if (!(var1 instanceof DiscoverServersResponse)) {
         return super.equals(var1);
      }

      DiscoverServersResponse var2 = (DiscoverServersResponse)var1;
      return !this.getSectionsList().equals(var2.getSectionsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getSectionsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSectionsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DiscoverServersResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DiscoverServersResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DiscoverServersResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DiscoverServersResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DiscoverServersResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DiscoverServersResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DiscoverServersResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DiscoverServersResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DiscoverServersResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DiscoverServersResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DiscoverServersResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DiscoverServersResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DiscoverServersResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DiscoverServersResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DiscoverServersResponse.Builder newBuilder(DiscoverServersResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DiscoverServersResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DiscoverServersResponse.Builder() : new DiscoverServersResponse.Builder().mergeFrom(this);
   }

   protected DiscoverServersResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DiscoverServersResponse.Builder(var1);
   }

   public static DiscoverServersResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DiscoverServersResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<DiscoverServersResponse> getParserForType() {
      return PARSER;
   }

   public DiscoverServersResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DiscoverServersResponse.Builder> implements DiscoverServersResponseOrBuilder {
      private int bitField0_;
      private List<ServerSection> sections_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerSection, ServerSection.Builder, ServerSectionOrBuilder> sectionsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DiscoverServersResponse.class, DiscoverServersResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DiscoverServersResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.sectionsBuilder_ == null) {
            this.sections_ = Collections.emptyList();
         } else {
            this.sections_ = null;
            this.sectionsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_descriptor;
      }

      public DiscoverServersResponse getDefaultInstanceForType() {
         return DiscoverServersResponse.getDefaultInstance();
      }

      public DiscoverServersResponse build() {
         DiscoverServersResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DiscoverServersResponse buildPartial() {
         DiscoverServersResponse var1 = new DiscoverServersResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(DiscoverServersResponse var1) {
         if (this.sectionsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.sections_ = Collections.unmodifiableList(this.sections_);
               this.bitField0_ &= -2;
            }

            var1.sections_ = this.sections_;
         } else {
            var1.sections_ = this.sectionsBuilder_.build();
         }
      }

      private void buildPartial0(DiscoverServersResponse var1) {
         int var2 = this.bitField0_;
      }

      public DiscoverServersResponse.Builder clone() {
         return (DiscoverServersResponse.Builder)super.clone();
      }

      public DiscoverServersResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DiscoverServersResponse.Builder)super.setField(var1, var2);
      }

      public DiscoverServersResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DiscoverServersResponse.Builder)super.clearField(var1);
      }

      public DiscoverServersResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DiscoverServersResponse.Builder)super.clearOneof(var1);
      }

      public DiscoverServersResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DiscoverServersResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DiscoverServersResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DiscoverServersResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public DiscoverServersResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof DiscoverServersResponse) {
            return this.mergeFrom((DiscoverServersResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DiscoverServersResponse.Builder mergeFrom(DiscoverServersResponse var1) {
         if (var1 == DiscoverServersResponse.getDefaultInstance()) {
            return this;
         }

         if (this.sectionsBuilder_ == null) {
            if (!var1.sections_.isEmpty()) {
               if (this.sections_.isEmpty()) {
                  this.sections_ = var1.sections_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureSectionsIsMutable();
                  this.sections_.addAll(var1.sections_);
               }

               this.onChanged();
            }
         } else if (!var1.sections_.isEmpty()) {
            if (this.sectionsBuilder_.isEmpty()) {
               this.sectionsBuilder_.dispose();
               this.sectionsBuilder_ = null;
               this.sections_ = var1.sections_;
               this.bitField0_ &= -2;
               this.sectionsBuilder_ = DiscoverServersResponse.alwaysUseFieldBuilders ? this.getSectionsFieldBuilder() : null;
            } else {
               this.sectionsBuilder_.addAllMessages(var1.sections_);
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

      public DiscoverServersResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ServerSection var5 = var1.readMessage(ServerSection.parser(), var2);
                     if (this.sectionsBuilder_ == null) {
                        this.ensureSectionsIsMutable();
                        this.sections_.add(var5);
                     } else {
                        this.sectionsBuilder_.addMessage(var5);
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

      private void ensureSectionsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.sections_ = new ArrayList<>(this.sections_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ServerSection> getSectionsList() {
         return this.sectionsBuilder_ == null ? Collections.unmodifiableList(this.sections_) : this.sectionsBuilder_.getMessageList();
      }

      @Override
      public int getSectionsCount() {
         return this.sectionsBuilder_ == null ? this.sections_.size() : this.sectionsBuilder_.getCount();
      }

      @Override
      public ServerSection getSections(int var1) {
         return this.sectionsBuilder_ == null ? this.sections_.get(var1) : this.sectionsBuilder_.getMessage(var1);
      }

      public DiscoverServersResponse.Builder setSections(int var1, ServerSection var2) {
         if (this.sectionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSectionsIsMutable();
            this.sections_.set(var1, var2);
            this.onChanged();
         } else {
            this.sectionsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public DiscoverServersResponse.Builder setSections(int var1, ServerSection.Builder var2) {
         if (this.sectionsBuilder_ == null) {
            this.ensureSectionsIsMutable();
            this.sections_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.sectionsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public DiscoverServersResponse.Builder addSections(ServerSection var1) {
         if (this.sectionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureSectionsIsMutable();
            this.sections_.add(var1);
            this.onChanged();
         } else {
            this.sectionsBuilder_.addMessage(var1);
         }

         return this;
      }

      public DiscoverServersResponse.Builder addSections(int var1, ServerSection var2) {
         if (this.sectionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSectionsIsMutable();
            this.sections_.add(var1, var2);
            this.onChanged();
         } else {
            this.sectionsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public DiscoverServersResponse.Builder addSections(ServerSection.Builder var1) {
         if (this.sectionsBuilder_ == null) {
            this.ensureSectionsIsMutable();
            this.sections_.add(var1.build());
            this.onChanged();
         } else {
            this.sectionsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public DiscoverServersResponse.Builder addSections(int var1, ServerSection.Builder var2) {
         if (this.sectionsBuilder_ == null) {
            this.ensureSectionsIsMutable();
            this.sections_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.sectionsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public DiscoverServersResponse.Builder addAllSections(Iterable<? extends ServerSection> var1) {
         if (this.sectionsBuilder_ == null) {
            this.ensureSectionsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.sections_);
            this.onChanged();
         } else {
            this.sectionsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public DiscoverServersResponse.Builder clearSections() {
         if (this.sectionsBuilder_ == null) {
            this.sections_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.sectionsBuilder_.clear();
         }

         return this;
      }

      public DiscoverServersResponse.Builder removeSections(int var1) {
         if (this.sectionsBuilder_ == null) {
            this.ensureSectionsIsMutable();
            this.sections_.remove(var1);
            this.onChanged();
         } else {
            this.sectionsBuilder_.remove(var1);
         }

         return this;
      }

      public ServerSection.Builder getSectionsBuilder(int var1) {
         return this.getSectionsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerSectionOrBuilder getSectionsOrBuilder(int var1) {
         return this.sectionsBuilder_ == null ? this.sections_.get(var1) : this.sectionsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerSectionOrBuilder> getSectionsOrBuilderList() {
         return this.sectionsBuilder_ != null ? this.sectionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.sections_);
      }

      public ServerSection.Builder addSectionsBuilder() {
         return this.getSectionsFieldBuilder().addBuilder(ServerSection.getDefaultInstance());
      }

      public ServerSection.Builder addSectionsBuilder(int var1) {
         return this.getSectionsFieldBuilder().addBuilder(var1, ServerSection.getDefaultInstance());
      }

      public List<ServerSection.Builder> getSectionsBuilderList() {
         return this.getSectionsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerSection, ServerSection.Builder, ServerSectionOrBuilder> getSectionsFieldBuilder() {
         if (this.sectionsBuilder_ == null) {
            this.sectionsBuilder_ = new RepeatedFieldBuilderV3<>(this.sections_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.sections_ = null;
         }

         return this.sectionsBuilder_;
      }

      public final DiscoverServersResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DiscoverServersResponse.Builder)super.setUnknownFields(var1);
      }

      public final DiscoverServersResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DiscoverServersResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
