package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Type extends GeneratedMessageV3 implements TypeOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int FIELDS_FIELD_NUMBER = 2;
   private List<Field> fields_;
   public static final int ONEOFS_FIELD_NUMBER = 3;
   private LazyStringArrayList oneofs_ = LazyStringArrayList.emptyList();
   public static final int OPTIONS_FIELD_NUMBER = 4;
   private List<Option> options_;
   public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
   private SourceContext sourceContext_;
   public static final int SYNTAX_FIELD_NUMBER = 6;
   private int syntax_ = 0;
   public static final int EDITION_FIELD_NUMBER = 7;
   private volatile Object edition_ = "";
   private byte memoizedIsInitialized = -1;
   private static final Type DEFAULT_INSTANCE = new Type();
   private static final Parser<Type> PARSER = new AbstractParser<Type>() {
      public Type parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Type.Builder var3 = Type.newBuilder();

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

   private Type(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Type() {
      this.name_ = "";
      this.fields_ = Collections.emptyList();
      this.oneofs_ = LazyStringArrayList.emptyList();
      this.options_ = Collections.emptyList();
      this.syntax_ = 0;
      this.edition_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Type();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return TypeProto.internal_static_google_protobuf_Type_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return TypeProto.internal_static_google_protobuf_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(Type.class, Type.Builder.class);
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
   public List<Field> getFieldsList() {
      return this.fields_;
   }

   @Override
   public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
      return this.fields_;
   }

   @Override
   public int getFieldsCount() {
      return this.fields_.size();
   }

   @Override
   public Field getFields(int var1) {
      return this.fields_.get(var1);
   }

   @Override
   public FieldOrBuilder getFieldsOrBuilder(int var1) {
      return this.fields_.get(var1);
   }

   public ProtocolStringList getOneofsList() {
      return this.oneofs_;
   }

   @Override
   public int getOneofsCount() {
      return this.oneofs_.size();
   }

   @Override
   public String getOneofs(int var1) {
      return this.oneofs_.get(var1);
   }

   @Override
   public ByteString getOneofsBytes(int var1) {
      return this.oneofs_.getByteString(var1);
   }

   @Override
   public List<Option> getOptionsList() {
      return this.options_;
   }

   @Override
   public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
      return this.options_;
   }

   @Override
   public int getOptionsCount() {
      return this.options_.size();
   }

   @Override
   public Option getOptions(int var1) {
      return this.options_.get(var1);
   }

   @Override
   public OptionOrBuilder getOptionsOrBuilder(int var1) {
      return this.options_.get(var1);
   }

   @Override
   public boolean hasSourceContext() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public SourceContext getSourceContext() {
      return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
   }

   @Override
   public SourceContextOrBuilder getSourceContextOrBuilder() {
      return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
   }

   @Override
   public int getSyntaxValue() {
      return this.syntax_;
   }

   @Override
   public Syntax getSyntax() {
      Syntax var1 = Syntax.forNumber(this.syntax_);
      return var1 == null ? Syntax.UNRECOGNIZED : var1;
   }

   @Override
   public String getEdition() {
      Object var1 = this.edition_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.edition_ = var3;
      return var3;
   }

   @Override
   public ByteString getEditionBytes() {
      Object var1 = this.edition_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.edition_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      for (int var2 = 0; var2 < this.fields_.size(); var2++) {
         var1.writeMessage(2, this.fields_.get(var2));
      }

      for (int var3 = 0; var3 < this.oneofs_.size(); var3++) {
         GeneratedMessageV3.writeString(var1, 3, this.oneofs_.getRaw(var3));
      }

      for (int var4 = 0; var4 < this.options_.size(); var4++) {
         var1.writeMessage(4, this.options_.get(var4));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(5, this.getSourceContext());
      }

      if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
         var1.writeEnum(6, this.syntax_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.edition_)) {
         GeneratedMessageV3.writeString(var1, 7, this.edition_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
      }

      for (int var2 = 0; var2 < this.fields_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.fields_.get(var2));
      }

      int var8 = 0;

      for (int var3 = 0; var3 < this.oneofs_.size(); var3++) {
         var8 += computeStringSizeNoTag(this.oneofs_.getRaw(var3));
      }

      var1 += var8;
      var1 += 1 * this.getOneofsList().size();

      for (int var9 = 0; var9 < this.options_.size(); var9++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.options_.get(var9));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getSourceContext());
      }

      if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(6, this.syntax_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.edition_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.edition_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Type)) {
         return super.equals(var1);
      } else {
         Type var2 = (Type)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getFieldsList().equals(var2.getFieldsList())) {
            return false;
         } else if (!this.getOneofsList().equals(var2.getOneofsList())) {
            return false;
         } else if (!this.getOptionsList().equals(var2.getOptionsList())) {
            return false;
         } else if (this.hasSourceContext() != var2.hasSourceContext()) {
            return false;
         } else if (this.hasSourceContext() && !this.getSourceContext().equals(var2.getSourceContext())) {
            return false;
         } else if (this.syntax_ != var2.syntax_) {
            return false;
         } else {
            return !this.getEdition().equals(var2.getEdition()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getName().hashCode();
      if (this.getFieldsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getFieldsList().hashCode();
      }

      if (this.getOneofsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getOneofsList().hashCode();
      }

      if (this.getOptionsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getOptionsList().hashCode();
      }

      if (this.hasSourceContext()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getSourceContext().hashCode();
      }

      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.syntax_;
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getEdition().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Type parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Type parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Type parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Type parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Type parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Type parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Type parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Type parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Type parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Type parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Type parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Type parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Type.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Type.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Type.Builder newBuilder(Type var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Type.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Type.Builder() : new Type.Builder().mergeFrom(this);
   }

   protected Type.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Type.Builder(var1);
   }

   public static Type getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Type> parser() {
      return PARSER;
   }

   @Override
   public Parser<Type> getParserForType() {
      return PARSER;
   }

   public Type getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Type.Builder> implements TypeOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private List<Field> fields_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Field, Field.Builder, FieldOrBuilder> fieldsBuilder_;
      private LazyStringArrayList oneofs_ = LazyStringArrayList.emptyList();
      private List<Option> options_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
      private SourceContext sourceContext_;
      private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
      private int syntax_ = 0;
      private Object edition_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return TypeProto.internal_static_google_protobuf_Type_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TypeProto.internal_static_google_protobuf_Type_fieldAccessorTable.ensureFieldAccessorsInitialized(Type.class, Type.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            this.getFieldsFieldBuilder();
            this.getOptionsFieldBuilder();
            this.getSourceContextFieldBuilder();
         }
      }

      public Type.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         if (this.fieldsBuilder_ == null) {
            this.fields_ = Collections.emptyList();
         } else {
            this.fields_ = null;
            this.fieldsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.oneofs_ = LazyStringArrayList.emptyList();
         if (this.optionsBuilder_ == null) {
            this.options_ = Collections.emptyList();
         } else {
            this.options_ = null;
            this.optionsBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.sourceContext_ = null;
         if (this.sourceContextBuilder_ != null) {
            this.sourceContextBuilder_.dispose();
            this.sourceContextBuilder_ = null;
         }

         this.syntax_ = 0;
         this.edition_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return TypeProto.internal_static_google_protobuf_Type_descriptor;
      }

      public Type getDefaultInstanceForType() {
         return Type.getDefaultInstance();
      }

      public Type build() {
         Type var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Type buildPartial() {
         Type var1 = new Type(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(Type var1) {
         if (this.fieldsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.fields_ = Collections.unmodifiableList(this.fields_);
               this.bitField0_ &= -3;
            }

            var1.fields_ = this.fields_;
         } else {
            var1.fields_ = this.fieldsBuilder_.build();
         }

         if (this.optionsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.options_ = Collections.unmodifiableList(this.options_);
               this.bitField0_ &= -9;
            }

            var1.options_ = this.options_;
         } else {
            var1.options_ = this.optionsBuilder_.build();
         }
      }

      private void buildPartial0(Type var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            this.oneofs_.makeImmutable();
            var1.oneofs_ = this.oneofs_;
         }

         byte var3 = 0;
         if ((var2 & 16) != 0) {
            var1.sourceContext_ = this.sourceContextBuilder_ == null ? this.sourceContext_ : this.sourceContextBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 32) != 0) {
            var1.syntax_ = this.syntax_;
         }

         if ((var2 & 64) != 0) {
            var1.edition_ = this.edition_;
         }

         var1.bitField0_ |= var3;
      }

      public Type.Builder clone() {
         return (Type.Builder)super.clone();
      }

      public Type.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Type.Builder)super.setField(var1, var2);
      }

      public Type.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Type.Builder)super.clearField(var1);
      }

      public Type.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Type.Builder)super.clearOneof(var1);
      }

      public Type.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Type.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Type.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Type.Builder)super.addRepeatedField(var1, var2);
      }

      public Type.Builder mergeFrom(Message var1) {
         if (var1 instanceof Type) {
            return this.mergeFrom((Type)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Type.Builder mergeFrom(Type var1) {
         if (var1 == Type.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (this.fieldsBuilder_ == null) {
            if (!var1.fields_.isEmpty()) {
               if (this.fields_.isEmpty()) {
                  this.fields_ = var1.fields_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureFieldsIsMutable();
                  this.fields_.addAll(var1.fields_);
               }

               this.onChanged();
            }
         } else if (!var1.fields_.isEmpty()) {
            if (this.fieldsBuilder_.isEmpty()) {
               this.fieldsBuilder_.dispose();
               this.fieldsBuilder_ = null;
               this.fields_ = var1.fields_;
               this.bitField0_ &= -3;
               this.fieldsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? this.getFieldsFieldBuilder() : null;
            } else {
               this.fieldsBuilder_.addAllMessages(var1.fields_);
            }
         }

         if (!var1.oneofs_.isEmpty()) {
            if (this.oneofs_.isEmpty()) {
               this.oneofs_ = var1.oneofs_;
               this.bitField0_ |= 4;
            } else {
               this.ensureOneofsIsMutable();
               this.oneofs_.addAll(var1.oneofs_);
            }

            this.onChanged();
         }

         if (this.optionsBuilder_ == null) {
            if (!var1.options_.isEmpty()) {
               if (this.options_.isEmpty()) {
                  this.options_ = var1.options_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureOptionsIsMutable();
                  this.options_.addAll(var1.options_);
               }

               this.onChanged();
            }
         } else if (!var1.options_.isEmpty()) {
            if (this.optionsBuilder_.isEmpty()) {
               this.optionsBuilder_.dispose();
               this.optionsBuilder_ = null;
               this.options_ = var1.options_;
               this.bitField0_ &= -9;
               this.optionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? this.getOptionsFieldBuilder() : null;
            } else {
               this.optionsBuilder_.addAllMessages(var1.options_);
            }
         }

         if (var1.hasSourceContext()) {
            this.mergeSourceContext(var1.getSourceContext());
         }

         if (var1.syntax_ != 0) {
            this.setSyntaxValue(var1.getSyntaxValue());
         }

         if (!var1.getEdition().isEmpty()) {
            this.edition_ = var1.edition_;
            this.bitField0_ |= 64;
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

      public Type.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     Field var12 = var1.readMessage(Field.parser(), var2);
                     if (this.fieldsBuilder_ == null) {
                        this.ensureFieldsIsMutable();
                        this.fields_.add(var12);
                     } else {
                        this.fieldsBuilder_.addMessage(var12);
                     }
                     break;
                  case 26:
                     String var11 = var1.readStringRequireUtf8();
                     this.ensureOneofsIsMutable();
                     this.oneofs_.add(var11);
                     break;
                  case 34:
                     Option var5 = var1.readMessage(Option.parser(), var2);
                     if (this.optionsBuilder_ == null) {
                        this.ensureOptionsIsMutable();
                        this.options_.add(var5);
                     } else {
                        this.optionsBuilder_.addMessage(var5);
                     }
                     break;
                  case 42:
                     var1.readMessage(this.getSourceContextFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.syntax_ = var1.readEnum();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.edition_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
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

      public Type.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Type.Builder clearName() {
         this.name_ = Type.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Type.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      private void ensureFieldsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.fields_ = new ArrayList<>(this.fields_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<Field> getFieldsList() {
         return this.fieldsBuilder_ == null ? Collections.unmodifiableList(this.fields_) : this.fieldsBuilder_.getMessageList();
      }

      @Override
      public int getFieldsCount() {
         return this.fieldsBuilder_ == null ? this.fields_.size() : this.fieldsBuilder_.getCount();
      }

      @Override
      public Field getFields(int var1) {
         return this.fieldsBuilder_ == null ? this.fields_.get(var1) : this.fieldsBuilder_.getMessage(var1);
      }

      public Type.Builder setFields(int var1, Field var2) {
         if (this.fieldsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureFieldsIsMutable();
            this.fields_.set(var1, var2);
            this.onChanged();
         } else {
            this.fieldsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Type.Builder setFields(int var1, Field.Builder var2) {
         if (this.fieldsBuilder_ == null) {
            this.ensureFieldsIsMutable();
            this.fields_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.fieldsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Type.Builder addFields(Field var1) {
         if (this.fieldsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureFieldsIsMutable();
            this.fields_.add(var1);
            this.onChanged();
         } else {
            this.fieldsBuilder_.addMessage(var1);
         }

         return this;
      }

      public Type.Builder addFields(int var1, Field var2) {
         if (this.fieldsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureFieldsIsMutable();
            this.fields_.add(var1, var2);
            this.onChanged();
         } else {
            this.fieldsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Type.Builder addFields(Field.Builder var1) {
         if (this.fieldsBuilder_ == null) {
            this.ensureFieldsIsMutable();
            this.fields_.add(var1.build());
            this.onChanged();
         } else {
            this.fieldsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Type.Builder addFields(int var1, Field.Builder var2) {
         if (this.fieldsBuilder_ == null) {
            this.ensureFieldsIsMutable();
            this.fields_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.fieldsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Type.Builder addAllFields(Iterable<? extends Field> var1) {
         if (this.fieldsBuilder_ == null) {
            this.ensureFieldsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.fields_);
            this.onChanged();
         } else {
            this.fieldsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Type.Builder clearFields() {
         if (this.fieldsBuilder_ == null) {
            this.fields_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.fieldsBuilder_.clear();
         }

         return this;
      }

      public Type.Builder removeFields(int var1) {
         if (this.fieldsBuilder_ == null) {
            this.ensureFieldsIsMutable();
            this.fields_.remove(var1);
            this.onChanged();
         } else {
            this.fieldsBuilder_.remove(var1);
         }

         return this;
      }

      public Field.Builder getFieldsBuilder(int var1) {
         return this.getFieldsFieldBuilder().getBuilder(var1);
      }

      @Override
      public FieldOrBuilder getFieldsOrBuilder(int var1) {
         return this.fieldsBuilder_ == null ? this.fields_.get(var1) : this.fieldsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
         return this.fieldsBuilder_ != null ? this.fieldsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fields_);
      }

      public Field.Builder addFieldsBuilder() {
         return this.getFieldsFieldBuilder().addBuilder(Field.getDefaultInstance());
      }

      public Field.Builder addFieldsBuilder(int var1) {
         return this.getFieldsFieldBuilder().addBuilder(var1, Field.getDefaultInstance());
      }

      public List<Field.Builder> getFieldsBuilderList() {
         return this.getFieldsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Field, Field.Builder, FieldOrBuilder> getFieldsFieldBuilder() {
         if (this.fieldsBuilder_ == null) {
            this.fieldsBuilder_ = new RepeatedFieldBuilderV3<>(this.fields_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.fields_ = null;
         }

         return this.fieldsBuilder_;
      }

      private void ensureOneofsIsMutable() {
         if (!this.oneofs_.isModifiable()) {
            this.oneofs_ = new LazyStringArrayList(this.oneofs_);
         }

         this.bitField0_ |= 4;
      }

      public ProtocolStringList getOneofsList() {
         this.oneofs_.makeImmutable();
         return this.oneofs_;
      }

      @Override
      public int getOneofsCount() {
         return this.oneofs_.size();
      }

      @Override
      public String getOneofs(int var1) {
         return this.oneofs_.get(var1);
      }

      @Override
      public ByteString getOneofsBytes(int var1) {
         return this.oneofs_.getByteString(var1);
      }

      public Type.Builder setOneofs(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureOneofsIsMutable();
         this.oneofs_.set(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Type.Builder addOneofs(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureOneofsIsMutable();
         this.oneofs_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Type.Builder addAllOneofs(Iterable<String> var1) {
         this.ensureOneofsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.oneofs_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public Type.Builder clearOneofs() {
         this.oneofs_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public Type.Builder addOneofsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.ensureOneofsIsMutable();
         this.oneofs_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      private void ensureOptionsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.options_ = new ArrayList<>(this.options_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<Option> getOptionsList() {
         return this.optionsBuilder_ == null ? Collections.unmodifiableList(this.options_) : this.optionsBuilder_.getMessageList();
      }

      @Override
      public int getOptionsCount() {
         return this.optionsBuilder_ == null ? this.options_.size() : this.optionsBuilder_.getCount();
      }

      @Override
      public Option getOptions(int var1) {
         return this.optionsBuilder_ == null ? this.options_.get(var1) : this.optionsBuilder_.getMessage(var1);
      }

      public Type.Builder setOptions(int var1, Option var2) {
         if (this.optionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOptionsIsMutable();
            this.options_.set(var1, var2);
            this.onChanged();
         } else {
            this.optionsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Type.Builder setOptions(int var1, Option.Builder var2) {
         if (this.optionsBuilder_ == null) {
            this.ensureOptionsIsMutable();
            this.options_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.optionsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Type.Builder addOptions(Option var1) {
         if (this.optionsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOptionsIsMutable();
            this.options_.add(var1);
            this.onChanged();
         } else {
            this.optionsBuilder_.addMessage(var1);
         }

         return this;
      }

      public Type.Builder addOptions(int var1, Option var2) {
         if (this.optionsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOptionsIsMutable();
            this.options_.add(var1, var2);
            this.onChanged();
         } else {
            this.optionsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Type.Builder addOptions(Option.Builder var1) {
         if (this.optionsBuilder_ == null) {
            this.ensureOptionsIsMutable();
            this.options_.add(var1.build());
            this.onChanged();
         } else {
            this.optionsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Type.Builder addOptions(int var1, Option.Builder var2) {
         if (this.optionsBuilder_ == null) {
            this.ensureOptionsIsMutable();
            this.options_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.optionsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Type.Builder addAllOptions(Iterable<? extends Option> var1) {
         if (this.optionsBuilder_ == null) {
            this.ensureOptionsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.options_);
            this.onChanged();
         } else {
            this.optionsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Type.Builder clearOptions() {
         if (this.optionsBuilder_ == null) {
            this.options_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.optionsBuilder_.clear();
         }

         return this;
      }

      public Type.Builder removeOptions(int var1) {
         if (this.optionsBuilder_ == null) {
            this.ensureOptionsIsMutable();
            this.options_.remove(var1);
            this.onChanged();
         } else {
            this.optionsBuilder_.remove(var1);
         }

         return this;
      }

      public Option.Builder getOptionsBuilder(int var1) {
         return this.getOptionsFieldBuilder().getBuilder(var1);
      }

      @Override
      public OptionOrBuilder getOptionsOrBuilder(int var1) {
         return this.optionsBuilder_ == null ? this.options_.get(var1) : this.optionsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
         return this.optionsBuilder_ != null ? this.optionsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.options_);
      }

      public Option.Builder addOptionsBuilder() {
         return this.getOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
      }

      public Option.Builder addOptionsBuilder(int var1) {
         return this.getOptionsFieldBuilder().addBuilder(var1, Option.getDefaultInstance());
      }

      public List<Option.Builder> getOptionsBuilderList() {
         return this.getOptionsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Option, Option.Builder, OptionOrBuilder> getOptionsFieldBuilder() {
         if (this.optionsBuilder_ == null) {
            this.optionsBuilder_ = new RepeatedFieldBuilderV3<>(this.options_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.options_ = null;
         }

         return this.optionsBuilder_;
      }

      @Override
      public boolean hasSourceContext() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public SourceContext getSourceContext() {
         if (this.sourceContextBuilder_ == null) {
            return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
         } else {
            return this.sourceContextBuilder_.getMessage();
         }
      }

      public Type.Builder setSourceContext(SourceContext var1) {
         if (this.sourceContextBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sourceContext_ = var1;
         } else {
            this.sourceContextBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Type.Builder setSourceContext(SourceContext.Builder var1) {
         if (this.sourceContextBuilder_ == null) {
            this.sourceContext_ = var1.build();
         } else {
            this.sourceContextBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Type.Builder mergeSourceContext(SourceContext var1) {
         if (this.sourceContextBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.sourceContext_ != null && this.sourceContext_ != SourceContext.getDefaultInstance()) {
               this.getSourceContextBuilder().mergeFrom(var1);
            } else {
               this.sourceContext_ = var1;
            }
         } else {
            this.sourceContextBuilder_.mergeFrom(var1);
         }

         if (this.sourceContext_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public Type.Builder clearSourceContext() {
         this.bitField0_ &= -17;
         this.sourceContext_ = null;
         if (this.sourceContextBuilder_ != null) {
            this.sourceContextBuilder_.dispose();
            this.sourceContextBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public SourceContext.Builder getSourceContextBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getSourceContextFieldBuilder().getBuilder();
      }

      @Override
      public SourceContextOrBuilder getSourceContextOrBuilder() {
         if (this.sourceContextBuilder_ != null) {
            return this.sourceContextBuilder_.getMessageOrBuilder();
         } else {
            return this.sourceContext_ == null ? SourceContext.getDefaultInstance() : this.sourceContext_;
         }
      }

      private SingleFieldBuilderV3<SourceContext, SourceContext.Builder, SourceContextOrBuilder> getSourceContextFieldBuilder() {
         if (this.sourceContextBuilder_ == null) {
            this.sourceContextBuilder_ = new SingleFieldBuilderV3<>(this.getSourceContext(), this.getParentForChildren(), this.isClean());
            this.sourceContext_ = null;
         }

         return this.sourceContextBuilder_;
      }

      @Override
      public int getSyntaxValue() {
         return this.syntax_;
      }

      public Type.Builder setSyntaxValue(int var1) {
         this.syntax_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public Syntax getSyntax() {
         Syntax var1 = Syntax.forNumber(this.syntax_);
         return var1 == null ? Syntax.UNRECOGNIZED : var1;
      }

      public Type.Builder setSyntax(Syntax var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 32;
         this.syntax_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Type.Builder clearSyntax() {
         this.bitField0_ &= -33;
         this.syntax_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getEdition() {
         Object var1 = this.edition_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.edition_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEditionBytes() {
         Object var1 = this.edition_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.edition_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Type.Builder setEdition(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.edition_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Type.Builder clearEdition() {
         this.edition_ = Type.getDefaultInstance().getEdition();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public Type.Builder setEditionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.edition_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public final Type.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Type.Builder)super.setUnknownFields(var1);
      }

      public final Type.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Type.Builder)super.mergeUnknownFields(var1);
      }
   }
}
