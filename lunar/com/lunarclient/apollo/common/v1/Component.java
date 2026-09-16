package com.lunarclient.apollo.common.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
public final class Component extends GeneratedMessageV3 implements ComponentOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONTENT_FIELD_NUMBER = 1;
   private volatile Object content_ = "";
   public static final int COLOR_FIELD_NUMBER = 2;
   private Color color_;
   public static final int DECORATORS_FIELD_NUMBER = 3;
   private List<Integer> decorators_;
   private static final Internal.ListAdapter.Converter<Integer, Component.TextDecorator> decorators_converter_ = new Internal.ListAdapter.Converter<Integer, Component.TextDecorator>() {
      public Component.TextDecorator convert(Integer var1) {
         Component.TextDecorator var2 = Component.TextDecorator.forNumber(var1);
         return var2 == null ? Component.TextDecorator.UNRECOGNIZED : var2;
      }
   };
   private int decoratorsMemoizedSerializedSize;
   public static final int CHILDREN_FIELD_NUMBER = 4;
   private List<Component> children_;
   private byte memoizedIsInitialized = -1;
   private static final Component DEFAULT_INSTANCE = new Component();
   private static final Parser<Component> PARSER = new AbstractParser<Component>() {
      public Component parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Component.Builder var3 = Component.newBuilder();

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

   private Component(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Component() {
      this.content_ = "";
      this.decorators_ = Collections.emptyList();
      this.children_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Component();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ComponentProto.internal_static_lunarclient_apollo_common_v1_Component_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ComponentProto.internal_static_lunarclient_apollo_common_v1_Component_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Component.class, Component.Builder.class);
   }

   @Override
   public String getContent() {
      Object var1 = this.content_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.content_ = var3;
      return var3;
   }

   @Override
   public ByteString getContentBytes() {
      Object var1 = this.content_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.content_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getColor() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public ColorOrBuilder getColorOrBuilder() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public List<Component.TextDecorator> getDecoratorsList() {
      return new Internal.ListAdapter<>(this.decorators_, decorators_converter_);
   }

   @Override
   public int getDecoratorsCount() {
      return this.decorators_.size();
   }

   @Override
   public Component.TextDecorator getDecorators(int var1) {
      return decorators_converter_.convert(this.decorators_.get(var1));
   }

   @Override
   public List<Integer> getDecoratorsValueList() {
      return this.decorators_;
   }

   @Override
   public int getDecoratorsValue(int var1) {
      return this.decorators_.get(var1);
   }

   @Override
   public List<Component> getChildrenList() {
      return this.children_;
   }

   @Override
   public List<? extends ComponentOrBuilder> getChildrenOrBuilderList() {
      return this.children_;
   }

   @Override
   public int getChildrenCount() {
      return this.children_.size();
   }

   @Override
   public Component getChildren(int var1) {
      return this.children_.get(var1);
   }

   @Override
   public ComponentOrBuilder getChildrenOrBuilder(int var1) {
      return this.children_.get(var1);
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
      this.getSerializedSize();
      if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
         GeneratedMessageV3.writeString(var1, 1, this.content_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getColor());
      }

      if (this.getDecoratorsList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.decoratorsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.decorators_.size(); var2++) {
         var1.writeEnumNoTag(this.decorators_.get(var2));
      }

      for (int var3 = 0; var3 < this.children_.size(); var3++) {
         var1.writeMessage(4, this.children_.get(var3));
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
      if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.content_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getColor());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.decorators_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.decorators_.get(var3));
      }

      var1 += var2;
      if (!this.getDecoratorsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.decoratorsMemoizedSerializedSize = var2;

      for (int var8 = 0; var8 < this.children_.size(); var8++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.children_.get(var8));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Component)) {
         return super.equals(var1);
      } else {
         Component var2 = (Component)var1;
         if (!this.getContent().equals(var2.getContent())) {
            return false;
         } else if (this.hasColor() != var2.hasColor()) {
            return false;
         } else if (this.hasColor() && !this.getColor().equals(var2.getColor())) {
            return false;
         } else if (!this.decorators_.equals(var2.decorators_)) {
            return false;
         } else {
            return !this.getChildrenList().equals(var2.getChildrenList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getContent().hashCode();
      if (this.hasColor()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      if (this.getDecoratorsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.decorators_.hashCode();
      }

      if (this.getChildrenCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getChildrenList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Component parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Component parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Component parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Component parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Component parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Component parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Component parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Component parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Component parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Component parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Component parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Component parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Component.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Component.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Component.Builder newBuilder(Component var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Component.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Component.Builder() : new Component.Builder().mergeFrom(this);
   }

   protected Component.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Component.Builder(var1);
   }

   public static Component getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Component> parser() {
      return PARSER;
   }

   @Override
   public Parser<Component> getParserForType() {
      return PARSER;
   }

   public Component getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Component.Builder> implements ComponentOrBuilder {
      private int bitField0_;
      private Object content_ = "";
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
      private List<Integer> decorators_ = Collections.emptyList();
      private List<Component> children_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> childrenBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ComponentProto.internal_static_lunarclient_apollo_common_v1_Component_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ComponentProto.internal_static_lunarclient_apollo_common_v1_Component_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Component.class, Component.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Component.alwaysUseFieldBuilders) {
            this.getColorFieldBuilder();
            this.getChildrenFieldBuilder();
         }
      }

      public Component.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.content_ = "";
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.decorators_ = Collections.emptyList();
         this.bitField0_ &= -5;
         if (this.childrenBuilder_ == null) {
            this.children_ = Collections.emptyList();
         } else {
            this.children_ = null;
            this.childrenBuilder_.clear();
         }

         this.bitField0_ &= -9;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ComponentProto.internal_static_lunarclient_apollo_common_v1_Component_descriptor;
      }

      public Component getDefaultInstanceForType() {
         return Component.getDefaultInstance();
      }

      public Component build() {
         Component var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Component buildPartial() {
         Component var1 = new Component(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(Component var1) {
         if ((this.bitField0_ & 4) != 0) {
            this.decorators_ = Collections.unmodifiableList(this.decorators_);
            this.bitField0_ &= -5;
         }

         var1.decorators_ = this.decorators_;
         if (this.childrenBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.children_ = Collections.unmodifiableList(this.children_);
               this.bitField0_ &= -9;
            }

            var1.children_ = this.children_;
         } else {
            var1.children_ = this.childrenBuilder_.build();
         }
      }

      private void buildPartial0(Component var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.content_ = this.content_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 1;
         }

         Component var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public Component.Builder clone() {
         return (Component.Builder)super.clone();
      }

      public Component.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Component.Builder)super.setField(var1, var2);
      }

      public Component.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Component.Builder)super.clearField(var1);
      }

      public Component.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Component.Builder)super.clearOneof(var1);
      }

      public Component.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Component.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Component.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Component.Builder)super.addRepeatedField(var1, var2);
      }

      public Component.Builder mergeFrom(Message var1) {
         if (var1 instanceof Component) {
            return this.mergeFrom((Component)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Component.Builder mergeFrom(Component var1) {
         if (var1 == Component.getDefaultInstance()) {
            return this;
         }

         if (!var1.getContent().isEmpty()) {
            this.content_ = var1.content_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         if (!var1.decorators_.isEmpty()) {
            if (this.decorators_.isEmpty()) {
               this.decorators_ = var1.decorators_;
               this.bitField0_ &= -5;
            } else {
               this.ensureDecoratorsIsMutable();
               this.decorators_.addAll(var1.decorators_);
            }

            this.onChanged();
         }

         if (this.childrenBuilder_ == null) {
            if (!var1.children_.isEmpty()) {
               if (this.children_.isEmpty()) {
                  this.children_ = var1.children_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureChildrenIsMutable();
                  this.children_.addAll(var1.children_);
               }

               this.onChanged();
            }
         } else if (!var1.children_.isEmpty()) {
            if (this.childrenBuilder_.isEmpty()) {
               this.childrenBuilder_.dispose();
               this.childrenBuilder_ = null;
               this.children_ = var1.children_;
               this.bitField0_ &= -9;
               this.childrenBuilder_ = Component.alwaysUseFieldBuilders ? this.getChildrenFieldBuilder() : null;
            } else {
               this.childrenBuilder_.addAllMessages(var1.children_);
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

      public Component.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.content_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     int var14 = var1.readEnum();
                     this.ensureDecoratorsIsMutable();
                     this.decorators_.add(var14);
                     break;
                  case 26:
                     int var13 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var13);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureDecoratorsIsMutable();
                        this.decorators_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  case 34:
                     Component var5 = var1.readMessage(Component.parser(), var2);
                     if (this.childrenBuilder_ == null) {
                        this.ensureChildrenIsMutable();
                        this.children_.add(var5);
                     } else {
                        this.childrenBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public String getContent() {
         Object var1 = this.content_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.content_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getContentBytes() {
         Object var1 = this.content_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.content_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Component.Builder setContent(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.content_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Component.Builder clearContent() {
         this.content_ = Component.getDefaultInstance().getContent();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Component.Builder setContentBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Component.checkByteStringIsUtf8(var1);
         this.content_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public Component.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Component.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Component.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public Component.Builder clearColor() {
         this.bitField0_ &= -3;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getColorOrBuilder() {
         if (this.colorBuilder_ != null) {
            return this.colorBuilder_.getMessageOrBuilder();
         } else {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getColorFieldBuilder() {
         if (this.colorBuilder_ == null) {
            this.colorBuilder_ = new SingleFieldBuilderV3<>(this.getColor(), this.getParentForChildren(), this.isClean());
            this.color_ = null;
         }

         return this.colorBuilder_;
      }

      private void ensureDecoratorsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.decorators_ = new ArrayList<>(this.decorators_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<Component.TextDecorator> getDecoratorsList() {
         return new Internal.ListAdapter<>(this.decorators_, Component.decorators_converter_);
      }

      @Override
      public int getDecoratorsCount() {
         return this.decorators_.size();
      }

      @Override
      public Component.TextDecorator getDecorators(int var1) {
         return Component.decorators_converter_.convert(this.decorators_.get(var1));
      }

      public Component.Builder setDecorators(int var1, Component.TextDecorator var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureDecoratorsIsMutable();
         this.decorators_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public Component.Builder addDecorators(Component.TextDecorator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureDecoratorsIsMutable();
         this.decorators_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public Component.Builder addAllDecorators(Iterable<? extends Component.TextDecorator> var1) {
         this.ensureDecoratorsIsMutable();

         for (Component.TextDecorator var3 : var1) {
            this.decorators_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public Component.Builder clearDecorators() {
         this.decorators_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getDecoratorsValueList() {
         return Collections.unmodifiableList(this.decorators_);
      }

      @Override
      public int getDecoratorsValue(int var1) {
         return this.decorators_.get(var1);
      }

      public Component.Builder setDecoratorsValue(int var1, int var2) {
         this.ensureDecoratorsIsMutable();
         this.decorators_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public Component.Builder addDecoratorsValue(int var1) {
         this.ensureDecoratorsIsMutable();
         this.decorators_.add(var1);
         this.onChanged();
         return this;
      }

      public Component.Builder addAllDecoratorsValue(Iterable<Integer> var1) {
         this.ensureDecoratorsIsMutable();

         for (int var3 : var1) {
            this.decorators_.add(var3);
         }

         this.onChanged();
         return this;
      }

      private void ensureChildrenIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.children_ = new ArrayList<>(this.children_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<Component> getChildrenList() {
         return this.childrenBuilder_ == null ? Collections.unmodifiableList(this.children_) : this.childrenBuilder_.getMessageList();
      }

      @Override
      public int getChildrenCount() {
         return this.childrenBuilder_ == null ? this.children_.size() : this.childrenBuilder_.getCount();
      }

      @Override
      public Component getChildren(int var1) {
         return this.childrenBuilder_ == null ? this.children_.get(var1) : this.childrenBuilder_.getMessage(var1);
      }

      public Component.Builder setChildren(int var1, Component var2) {
         if (this.childrenBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureChildrenIsMutable();
            this.children_.set(var1, var2);
            this.onChanged();
         } else {
            this.childrenBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Component.Builder setChildren(int var1, Component.Builder var2) {
         if (this.childrenBuilder_ == null) {
            this.ensureChildrenIsMutable();
            this.children_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.childrenBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Component.Builder addChildren(Component var1) {
         if (this.childrenBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureChildrenIsMutable();
            this.children_.add(var1);
            this.onChanged();
         } else {
            this.childrenBuilder_.addMessage(var1);
         }

         return this;
      }

      public Component.Builder addChildren(int var1, Component var2) {
         if (this.childrenBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureChildrenIsMutable();
            this.children_.add(var1, var2);
            this.onChanged();
         } else {
            this.childrenBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Component.Builder addChildren(Component.Builder var1) {
         if (this.childrenBuilder_ == null) {
            this.ensureChildrenIsMutable();
            this.children_.add(var1.build());
            this.onChanged();
         } else {
            this.childrenBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Component.Builder addChildren(int var1, Component.Builder var2) {
         if (this.childrenBuilder_ == null) {
            this.ensureChildrenIsMutable();
            this.children_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.childrenBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Component.Builder addAllChildren(Iterable<? extends Component> var1) {
         if (this.childrenBuilder_ == null) {
            this.ensureChildrenIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.children_);
            this.onChanged();
         } else {
            this.childrenBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Component.Builder clearChildren() {
         if (this.childrenBuilder_ == null) {
            this.children_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.childrenBuilder_.clear();
         }

         return this;
      }

      public Component.Builder removeChildren(int var1) {
         if (this.childrenBuilder_ == null) {
            this.ensureChildrenIsMutable();
            this.children_.remove(var1);
            this.onChanged();
         } else {
            this.childrenBuilder_.remove(var1);
         }

         return this;
      }

      public Component.Builder getChildrenBuilder(int var1) {
         return this.getChildrenFieldBuilder().getBuilder(var1);
      }

      @Override
      public ComponentOrBuilder getChildrenOrBuilder(int var1) {
         return this.childrenBuilder_ == null ? this.children_.get(var1) : this.childrenBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ComponentOrBuilder> getChildrenOrBuilderList() {
         return this.childrenBuilder_ != null ? this.childrenBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.children_);
      }

      public Component.Builder addChildrenBuilder() {
         return this.getChildrenFieldBuilder().addBuilder(Component.getDefaultInstance());
      }

      public Component.Builder addChildrenBuilder(int var1) {
         return this.getChildrenFieldBuilder().addBuilder(var1, Component.getDefaultInstance());
      }

      public List<Component.Builder> getChildrenBuilderList() {
         return this.getChildrenFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Component, Component.Builder, ComponentOrBuilder> getChildrenFieldBuilder() {
         if (this.childrenBuilder_ == null) {
            this.childrenBuilder_ = new RepeatedFieldBuilderV3<>(this.children_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.children_ = null;
         }

         return this.childrenBuilder_;
      }

      public final Component.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Component.Builder)super.setUnknownFields(var1);
      }

      public final Component.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Component.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum TextDecorator implements ProtocolMessageEnum {
      TEXT_DECORATOR_UNSPECIFIED(0),
      TEXT_DECORATOR_OBFUSCATED(1),
      TEXT_DECORATOR_BOLD(2),
      TEXT_DECORATOR_STRIKETHROUGH(3),
      TEXT_DECORATOR_UNDERLINED(4),
      TEXT_DECORATOR_ITALIC(5),
      UNRECOGNIZED(-1);

      public static final int TEXT_DECORATOR_UNSPECIFIED_VALUE = 0;
      public static final int TEXT_DECORATOR_OBFUSCATED_VALUE = 1;
      public static final int TEXT_DECORATOR_BOLD_VALUE = 2;
      public static final int TEXT_DECORATOR_STRIKETHROUGH_VALUE = 3;
      public static final int TEXT_DECORATOR_UNDERLINED_VALUE = 4;
      public static final int TEXT_DECORATOR_ITALIC_VALUE = 5;
      private static final Internal.EnumLiteMap<Component.TextDecorator> internalValueMap = new Internal.EnumLiteMap<Component.TextDecorator>() {
         public Component.TextDecorator findValueByNumber(int var1) {
            return Component.TextDecorator.forNumber(var1);
         }
      };
      private static final Component.TextDecorator[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static Component.TextDecorator valueOf(int var0) {
         return forNumber(var0);
      }

      public static Component.TextDecorator forNumber(int var0) {
         switch (var0) {
            case 0:
               return TEXT_DECORATOR_UNSPECIFIED;
            case 1:
               return TEXT_DECORATOR_OBFUSCATED;
            case 2:
               return TEXT_DECORATOR_BOLD;
            case 3:
               return TEXT_DECORATOR_STRIKETHROUGH;
            case 4:
               return TEXT_DECORATOR_UNDERLINED;
            case 5:
               return TEXT_DECORATOR_ITALIC;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<Component.TextDecorator> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return Component.getDescriptor().getEnumTypes().get(0);
      }

      public static Component.TextDecorator valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      TextDecorator(int var3) {
         this.value = var3;
      }
   }
}
