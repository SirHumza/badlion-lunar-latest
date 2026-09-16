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

public final class LoadAutocompleteSuggestionsResponse extends GeneratedMessageV3 implements LoadAutocompleteSuggestionsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SUGGESTIONS_FIELD_NUMBER = 1;
   private List<AutocompleteSuggestion> suggestions_;
   private byte memoizedIsInitialized = -1;
   private static final LoadAutocompleteSuggestionsResponse DEFAULT_INSTANCE = new LoadAutocompleteSuggestionsResponse();
   private static final Parser<LoadAutocompleteSuggestionsResponse> PARSER = new AbstractParser<LoadAutocompleteSuggestionsResponse>() {
      public LoadAutocompleteSuggestionsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadAutocompleteSuggestionsResponse.Builder var3 = LoadAutocompleteSuggestionsResponse.newBuilder();

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

   private LoadAutocompleteSuggestionsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadAutocompleteSuggestionsResponse() {
      this.suggestions_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadAutocompleteSuggestionsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadAutocompleteSuggestionsResponse.class, LoadAutocompleteSuggestionsResponse.Builder.class);
   }

   @Override
   public List<AutocompleteSuggestion> getSuggestionsList() {
      return this.suggestions_;
   }

   @Override
   public List<? extends AutocompleteSuggestionOrBuilder> getSuggestionsOrBuilderList() {
      return this.suggestions_;
   }

   @Override
   public int getSuggestionsCount() {
      return this.suggestions_.size();
   }

   @Override
   public AutocompleteSuggestion getSuggestions(int var1) {
      return this.suggestions_.get(var1);
   }

   @Override
   public AutocompleteSuggestionOrBuilder getSuggestionsOrBuilder(int var1) {
      return this.suggestions_.get(var1);
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
      for (int var2 = 0; var2 < this.suggestions_.size(); var2++) {
         var1.writeMessage(1, this.suggestions_.get(var2));
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

      for (int var2 = 0; var2 < this.suggestions_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.suggestions_.get(var2));
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

      if (!(var1 instanceof LoadAutocompleteSuggestionsResponse)) {
         return super.equals(var1);
      }

      LoadAutocompleteSuggestionsResponse var2 = (LoadAutocompleteSuggestionsResponse)var1;
      return !this.getSuggestionsList().equals(var2.getSuggestionsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getSuggestionsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSuggestionsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadAutocompleteSuggestionsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadAutocompleteSuggestionsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadAutocompleteSuggestionsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadAutocompleteSuggestionsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadAutocompleteSuggestionsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadAutocompleteSuggestionsResponse.Builder newBuilder(LoadAutocompleteSuggestionsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadAutocompleteSuggestionsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadAutocompleteSuggestionsResponse.Builder() : new LoadAutocompleteSuggestionsResponse.Builder().mergeFrom(this);
   }

   protected LoadAutocompleteSuggestionsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadAutocompleteSuggestionsResponse.Builder(var1);
   }

   public static LoadAutocompleteSuggestionsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadAutocompleteSuggestionsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadAutocompleteSuggestionsResponse> getParserForType() {
      return PARSER;
   }

   public LoadAutocompleteSuggestionsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<LoadAutocompleteSuggestionsResponse.Builder>
      implements LoadAutocompleteSuggestionsResponseOrBuilder {
      private int bitField0_;
      private List<AutocompleteSuggestion> suggestions_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<AutocompleteSuggestion, AutocompleteSuggestion.Builder, AutocompleteSuggestionOrBuilder> suggestionsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadAutocompleteSuggestionsResponse.class, LoadAutocompleteSuggestionsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadAutocompleteSuggestionsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.suggestionsBuilder_ == null) {
            this.suggestions_ = Collections.emptyList();
         } else {
            this.suggestions_ = null;
            this.suggestionsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_descriptor;
      }

      public LoadAutocompleteSuggestionsResponse getDefaultInstanceForType() {
         return LoadAutocompleteSuggestionsResponse.getDefaultInstance();
      }

      public LoadAutocompleteSuggestionsResponse build() {
         LoadAutocompleteSuggestionsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadAutocompleteSuggestionsResponse buildPartial() {
         LoadAutocompleteSuggestionsResponse var1 = new LoadAutocompleteSuggestionsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoadAutocompleteSuggestionsResponse var1) {
         if (this.suggestionsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.suggestions_ = Collections.unmodifiableList(this.suggestions_);
               this.bitField0_ &= -2;
            }

            var1.suggestions_ = this.suggestions_;
         } else {
            var1.suggestions_ = this.suggestionsBuilder_.build();
         }
      }

      private void buildPartial0(LoadAutocompleteSuggestionsResponse var1) {
         int var2 = this.bitField0_;
      }

      public LoadAutocompleteSuggestionsResponse.Builder clone() {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.clone();
      }

      public LoadAutocompleteSuggestionsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.setField(var1, var2);
      }

      public LoadAutocompleteSuggestionsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.clearField(var1);
      }

      public LoadAutocompleteSuggestionsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.clearOneof(var1);
      }

      public LoadAutocompleteSuggestionsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadAutocompleteSuggestionsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadAutocompleteSuggestionsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadAutocompleteSuggestionsResponse) {
            return this.mergeFrom((LoadAutocompleteSuggestionsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder mergeFrom(LoadAutocompleteSuggestionsResponse var1) {
         if (var1 == LoadAutocompleteSuggestionsResponse.getDefaultInstance()) {
            return this;
         }

         if (this.suggestionsBuilder_ == null) {
            if (!var1.suggestions_.isEmpty()) {
               if (this.suggestions_.isEmpty()) {
                  this.suggestions_ = var1.suggestions_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureSuggestionsIsMutable();
                  this.suggestions_.addAll(var1.suggestions_);
               }

               this.onChanged();
            }
         } else if (!var1.suggestions_.isEmpty()) {
            if (this.suggestionsBuilder_.isEmpty()) {
               this.suggestionsBuilder_.dispose();
               this.suggestionsBuilder_ = null;
               this.suggestions_ = var1.suggestions_;
               this.bitField0_ &= -2;
               this.suggestionsBuilder_ = LoadAutocompleteSuggestionsResponse.alwaysUseFieldBuilders ? this.getSuggestionsFieldBuilder() : null;
            } else {
               this.suggestionsBuilder_.addAllMessages(var1.suggestions_);
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

      public LoadAutocompleteSuggestionsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     AutocompleteSuggestion var5 = var1.readMessage(AutocompleteSuggestion.parser(), var2);
                     if (this.suggestionsBuilder_ == null) {
                        this.ensureSuggestionsIsMutable();
                        this.suggestions_.add(var5);
                     } else {
                        this.suggestionsBuilder_.addMessage(var5);
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

      private void ensureSuggestionsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.suggestions_ = new ArrayList<>(this.suggestions_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<AutocompleteSuggestion> getSuggestionsList() {
         return this.suggestionsBuilder_ == null ? Collections.unmodifiableList(this.suggestions_) : this.suggestionsBuilder_.getMessageList();
      }

      @Override
      public int getSuggestionsCount() {
         return this.suggestionsBuilder_ == null ? this.suggestions_.size() : this.suggestionsBuilder_.getCount();
      }

      @Override
      public AutocompleteSuggestion getSuggestions(int var1) {
         return this.suggestionsBuilder_ == null ? this.suggestions_.get(var1) : this.suggestionsBuilder_.getMessage(var1);
      }

      public LoadAutocompleteSuggestionsResponse.Builder setSuggestions(int var1, AutocompleteSuggestion var2) {
         if (this.suggestionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSuggestionsIsMutable();
            this.suggestions_.set(var1, var2);
            this.onChanged();
         } else {
            this.suggestionsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder setSuggestions(int var1, AutocompleteSuggestion.Builder var2) {
         if (this.suggestionsBuilder_ == null) {
            this.ensureSuggestionsIsMutable();
            this.suggestions_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.suggestionsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder addSuggestions(AutocompleteSuggestion var1) {
         if (this.suggestionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureSuggestionsIsMutable();
            this.suggestions_.add(var1);
            this.onChanged();
         } else {
            this.suggestionsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder addSuggestions(int var1, AutocompleteSuggestion var2) {
         if (this.suggestionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSuggestionsIsMutable();
            this.suggestions_.add(var1, var2);
            this.onChanged();
         } else {
            this.suggestionsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder addSuggestions(AutocompleteSuggestion.Builder var1) {
         if (this.suggestionsBuilder_ == null) {
            this.ensureSuggestionsIsMutable();
            this.suggestions_.add(var1.build());
            this.onChanged();
         } else {
            this.suggestionsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder addSuggestions(int var1, AutocompleteSuggestion.Builder var2) {
         if (this.suggestionsBuilder_ == null) {
            this.ensureSuggestionsIsMutable();
            this.suggestions_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.suggestionsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder addAllSuggestions(Iterable<? extends AutocompleteSuggestion> var1) {
         if (this.suggestionsBuilder_ == null) {
            this.ensureSuggestionsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.suggestions_);
            this.onChanged();
         } else {
            this.suggestionsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder clearSuggestions() {
         if (this.suggestionsBuilder_ == null) {
            this.suggestions_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.suggestionsBuilder_.clear();
         }

         return this;
      }

      public LoadAutocompleteSuggestionsResponse.Builder removeSuggestions(int var1) {
         if (this.suggestionsBuilder_ == null) {
            this.ensureSuggestionsIsMutable();
            this.suggestions_.remove(var1);
            this.onChanged();
         } else {
            this.suggestionsBuilder_.remove(var1);
         }

         return this;
      }

      public AutocompleteSuggestion.Builder getSuggestionsBuilder(int var1) {
         return this.getSuggestionsFieldBuilder().getBuilder(var1);
      }

      @Override
      public AutocompleteSuggestionOrBuilder getSuggestionsOrBuilder(int var1) {
         return this.suggestionsBuilder_ == null ? this.suggestions_.get(var1) : this.suggestionsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends AutocompleteSuggestionOrBuilder> getSuggestionsOrBuilderList() {
         return this.suggestionsBuilder_ != null ? this.suggestionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.suggestions_);
      }

      public AutocompleteSuggestion.Builder addSuggestionsBuilder() {
         return this.getSuggestionsFieldBuilder().addBuilder(AutocompleteSuggestion.getDefaultInstance());
      }

      public AutocompleteSuggestion.Builder addSuggestionsBuilder(int var1) {
         return this.getSuggestionsFieldBuilder().addBuilder(var1, AutocompleteSuggestion.getDefaultInstance());
      }

      public List<AutocompleteSuggestion.Builder> getSuggestionsBuilderList() {
         return this.getSuggestionsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<AutocompleteSuggestion, AutocompleteSuggestion.Builder, AutocompleteSuggestionOrBuilder> getSuggestionsFieldBuilder() {
         if (this.suggestionsBuilder_ == null) {
            this.suggestionsBuilder_ = new RepeatedFieldBuilderV3<>(this.suggestions_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.suggestions_ = null;
         }

         return this.suggestionsBuilder_;
      }

      public final LoadAutocompleteSuggestionsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoadAutocompleteSuggestionsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadAutocompleteSuggestionsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
