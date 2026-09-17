package com.lunarclient.websocket.analytics.v1;

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

public final class RecordCountersRequest extends GeneratedMessageV3 implements RecordCountersRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int UPDATES_FIELD_NUMBER = 1;
   private List<CounterUpdate> updates_;
   private byte memoizedIsInitialized = -1;
   private static final RecordCountersRequest DEFAULT_INSTANCE = new RecordCountersRequest();
   private static final Parser<RecordCountersRequest> PARSER = new AbstractParser<RecordCountersRequest>() {
      public RecordCountersRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecordCountersRequest.Builder var3 = RecordCountersRequest.newBuilder();

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

   private RecordCountersRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecordCountersRequest() {
      this.updates_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecordCountersRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecordCountersRequest.class, RecordCountersRequest.Builder.class);
   }

   @Override
   public List<CounterUpdate> getUpdatesList() {
      return this.updates_;
   }

   @Override
   public List<? extends CounterUpdateOrBuilder> getUpdatesOrBuilderList() {
      return this.updates_;
   }

   @Override
   public int getUpdatesCount() {
      return this.updates_.size();
   }

   @Override
   public CounterUpdate getUpdates(int var1) {
      return this.updates_.get(var1);
   }

   @Override
   public CounterUpdateOrBuilder getUpdatesOrBuilder(int var1) {
      return this.updates_.get(var1);
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
      for (int var2 = 0; var2 < this.updates_.size(); var2++) {
         var1.writeMessage(1, this.updates_.get(var2));
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

      for (int var2 = 0; var2 < this.updates_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.updates_.get(var2));
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

      if (!(var1 instanceof RecordCountersRequest)) {
         return super.equals(var1);
      }

      RecordCountersRequest var2 = (RecordCountersRequest)var1;
      return !this.getUpdatesList().equals(var2.getUpdatesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getUpdatesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getUpdatesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecordCountersRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordCountersRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordCountersRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordCountersRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordCountersRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordCountersRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordCountersRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordCountersRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecordCountersRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecordCountersRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecordCountersRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordCountersRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecordCountersRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecordCountersRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecordCountersRequest.Builder newBuilder(RecordCountersRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecordCountersRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecordCountersRequest.Builder() : new RecordCountersRequest.Builder().mergeFrom(this);
   }

   protected RecordCountersRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecordCountersRequest.Builder(var1);
   }

   public static RecordCountersRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecordCountersRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecordCountersRequest> getParserForType() {
      return PARSER;
   }

   public RecordCountersRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RecordCountersRequest.Builder> implements RecordCountersRequestOrBuilder {
      private int bitField0_;
      private List<CounterUpdate> updates_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<CounterUpdate, CounterUpdate.Builder, CounterUpdateOrBuilder> updatesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordCountersRequest.class, RecordCountersRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RecordCountersRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.updatesBuilder_ == null) {
            this.updates_ = Collections.emptyList();
         } else {
            this.updates_ = null;
            this.updatesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_descriptor;
      }

      public RecordCountersRequest getDefaultInstanceForType() {
         return RecordCountersRequest.getDefaultInstance();
      }

      public RecordCountersRequest build() {
         RecordCountersRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecordCountersRequest buildPartial() {
         RecordCountersRequest var1 = new RecordCountersRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(RecordCountersRequest var1) {
         if (this.updatesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.updates_ = Collections.unmodifiableList(this.updates_);
               this.bitField0_ &= -2;
            }

            var1.updates_ = this.updates_;
         } else {
            var1.updates_ = this.updatesBuilder_.build();
         }
      }

      private void buildPartial0(RecordCountersRequest var1) {
         int var2 = this.bitField0_;
      }

      public RecordCountersRequest.Builder clone() {
         return (RecordCountersRequest.Builder)super.clone();
      }

      public RecordCountersRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordCountersRequest.Builder)super.setField(var1, var2);
      }

      public RecordCountersRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecordCountersRequest.Builder)super.clearField(var1);
      }

      public RecordCountersRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecordCountersRequest.Builder)super.clearOneof(var1);
      }

      public RecordCountersRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecordCountersRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecordCountersRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordCountersRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RecordCountersRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecordCountersRequest) {
            return this.mergeFrom((RecordCountersRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecordCountersRequest.Builder mergeFrom(RecordCountersRequest var1) {
         if (var1 == RecordCountersRequest.getDefaultInstance()) {
            return this;
         }

         if (this.updatesBuilder_ == null) {
            if (!var1.updates_.isEmpty()) {
               if (this.updates_.isEmpty()) {
                  this.updates_ = var1.updates_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureUpdatesIsMutable();
                  this.updates_.addAll(var1.updates_);
               }

               this.onChanged();
            }
         } else if (!var1.updates_.isEmpty()) {
            if (this.updatesBuilder_.isEmpty()) {
               this.updatesBuilder_.dispose();
               this.updatesBuilder_ = null;
               this.updates_ = var1.updates_;
               this.bitField0_ &= -2;
               this.updatesBuilder_ = RecordCountersRequest.alwaysUseFieldBuilders ? this.getUpdatesFieldBuilder() : null;
            } else {
               this.updatesBuilder_.addAllMessages(var1.updates_);
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

      public RecordCountersRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     CounterUpdate var5 = var1.readMessage(CounterUpdate.parser(), var2);
                     if (this.updatesBuilder_ == null) {
                        this.ensureUpdatesIsMutable();
                        this.updates_.add(var5);
                     } else {
                        this.updatesBuilder_.addMessage(var5);
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

      private void ensureUpdatesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.updates_ = new ArrayList<>(this.updates_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<CounterUpdate> getUpdatesList() {
         return this.updatesBuilder_ == null ? Collections.unmodifiableList(this.updates_) : this.updatesBuilder_.getMessageList();
      }

      @Override
      public int getUpdatesCount() {
         return this.updatesBuilder_ == null ? this.updates_.size() : this.updatesBuilder_.getCount();
      }

      @Override
      public CounterUpdate getUpdates(int var1) {
         return this.updatesBuilder_ == null ? this.updates_.get(var1) : this.updatesBuilder_.getMessage(var1);
      }

      public RecordCountersRequest.Builder setUpdates(int var1, CounterUpdate var2) {
         if (this.updatesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureUpdatesIsMutable();
            this.updates_.set(var1, var2);
            this.onChanged();
         } else {
            this.updatesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public RecordCountersRequest.Builder setUpdates(int var1, CounterUpdate.Builder var2) {
         if (this.updatesBuilder_ == null) {
            this.ensureUpdatesIsMutable();
            this.updates_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.updatesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public RecordCountersRequest.Builder addUpdates(CounterUpdate var1) {
         if (this.updatesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureUpdatesIsMutable();
            this.updates_.add(var1);
            this.onChanged();
         } else {
            this.updatesBuilder_.addMessage(var1);
         }

         return this;
      }

      public RecordCountersRequest.Builder addUpdates(int var1, CounterUpdate var2) {
         if (this.updatesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureUpdatesIsMutable();
            this.updates_.add(var1, var2);
            this.onChanged();
         } else {
            this.updatesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public RecordCountersRequest.Builder addUpdates(CounterUpdate.Builder var1) {
         if (this.updatesBuilder_ == null) {
            this.ensureUpdatesIsMutable();
            this.updates_.add(var1.build());
            this.onChanged();
         } else {
            this.updatesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public RecordCountersRequest.Builder addUpdates(int var1, CounterUpdate.Builder var2) {
         if (this.updatesBuilder_ == null) {
            this.ensureUpdatesIsMutable();
            this.updates_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.updatesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public RecordCountersRequest.Builder addAllUpdates(Iterable<? extends CounterUpdate> var1) {
         if (this.updatesBuilder_ == null) {
            this.ensureUpdatesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.updates_);
            this.onChanged();
         } else {
            this.updatesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public RecordCountersRequest.Builder clearUpdates() {
         if (this.updatesBuilder_ == null) {
            this.updates_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.updatesBuilder_.clear();
         }

         return this;
      }

      public RecordCountersRequest.Builder removeUpdates(int var1) {
         if (this.updatesBuilder_ == null) {
            this.ensureUpdatesIsMutable();
            this.updates_.remove(var1);
            this.onChanged();
         } else {
            this.updatesBuilder_.remove(var1);
         }

         return this;
      }

      public CounterUpdate.Builder getUpdatesBuilder(int var1) {
         return this.getUpdatesFieldBuilder().getBuilder(var1);
      }

      @Override
      public CounterUpdateOrBuilder getUpdatesOrBuilder(int var1) {
         return this.updatesBuilder_ == null ? this.updates_.get(var1) : this.updatesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends CounterUpdateOrBuilder> getUpdatesOrBuilderList() {
         return this.updatesBuilder_ != null ? this.updatesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.updates_);
      }

      public CounterUpdate.Builder addUpdatesBuilder() {
         return this.getUpdatesFieldBuilder().addBuilder(CounterUpdate.getDefaultInstance());
      }

      public CounterUpdate.Builder addUpdatesBuilder(int var1) {
         return this.getUpdatesFieldBuilder().addBuilder(var1, CounterUpdate.getDefaultInstance());
      }

      public List<CounterUpdate.Builder> getUpdatesBuilderList() {
         return this.getUpdatesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<CounterUpdate, CounterUpdate.Builder, CounterUpdateOrBuilder> getUpdatesFieldBuilder() {
         if (this.updatesBuilder_ == null) {
            this.updatesBuilder_ = new RepeatedFieldBuilderV3<>(this.updates_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.updates_ = null;
         }

         return this.updatesBuilder_;
      }

      public final RecordCountersRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecordCountersRequest.Builder)super.setUnknownFields(var1);
      }

      public final RecordCountersRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecordCountersRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
