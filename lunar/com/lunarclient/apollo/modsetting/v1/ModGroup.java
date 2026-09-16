package com.lunarclient.apollo.modsetting.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ModGroup extends GeneratedMessageV3 implements ModGroupOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_ = 0;
   public static final int MODS_FIELD_NUMBER = 2;
   private List<Mod> mods_;
   private byte memoizedIsInitialized = -1;
   private static final ModGroup DEFAULT_INSTANCE = new ModGroup();
   private static final Parser<ModGroup> PARSER = new AbstractParser<ModGroup>() {
      public ModGroup parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ModGroup.Builder var3 = ModGroup.newBuilder();

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

   private ModGroup(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ModGroup() {
      this.type_ = 0;
      this.mods_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ModGroup();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_ModGroup_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_ModGroup_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ModGroup.class, ModGroup.Builder.class);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public ModGroup.Type getType() {
      ModGroup.Type var1 = ModGroup.Type.forNumber(this.type_);
      return var1 == null ? ModGroup.Type.UNRECOGNIZED : var1;
   }

   @Override
   public List<Mod> getModsList() {
      return this.mods_;
   }

   @Override
   public List<? extends ModOrBuilder> getModsOrBuilderList() {
      return this.mods_;
   }

   @Override
   public int getModsCount() {
      return this.mods_.size();
   }

   @Override
   public Mod getMods(int var1) {
      return this.mods_.get(var1);
   }

   @Override
   public ModOrBuilder getModsOrBuilder(int var1) {
      return this.mods_.get(var1);
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
      if (this.type_ != ModGroup.Type.TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.type_);
      }

      for (int var2 = 0; var2 < this.mods_.size(); var2++) {
         var1.writeMessage(2, this.mods_.get(var2));
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
      if (this.type_ != ModGroup.Type.TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.type_);
      }

      for (int var2 = 0; var2 < this.mods_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.mods_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ModGroup)) {
         return super.equals(var1);
      } else {
         ModGroup var2 = (ModGroup)var1;
         if (this.type_ != var2.type_) {
            return false;
         } else {
            return !this.getModsList().equals(var2.getModsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.type_;
      if (this.getModsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getModsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ModGroup parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ModGroup parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ModGroup parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ModGroup parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ModGroup parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ModGroup parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ModGroup parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ModGroup parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ModGroup parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ModGroup parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ModGroup parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ModGroup parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ModGroup.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ModGroup.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ModGroup.Builder newBuilder(ModGroup var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ModGroup.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ModGroup.Builder() : new ModGroup.Builder().mergeFrom(this);
   }

   protected ModGroup.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ModGroup.Builder(var1);
   }

   public static ModGroup getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ModGroup> parser() {
      return PARSER;
   }

   @Override
   public Parser<ModGroup> getParserForType() {
      return PARSER;
   }

   public ModGroup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ModGroup.Builder> implements ModGroupOrBuilder {
      private int bitField0_;
      private int type_ = 0;
      private List<Mod> mods_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Mod, Mod.Builder, ModOrBuilder> modsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_ModGroup_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_ModGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ModGroup.class, ModGroup.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ModGroup.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.type_ = 0;
         if (this.modsBuilder_ == null) {
            this.mods_ = Collections.emptyList();
         } else {
            this.mods_ = null;
            this.modsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_modsetting_v1_ModGroup_descriptor;
      }

      public ModGroup getDefaultInstanceForType() {
         return ModGroup.getDefaultInstance();
      }

      public ModGroup build() {
         ModGroup var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ModGroup buildPartial() {
         ModGroup var1 = new ModGroup(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ModGroup var1) {
         if (this.modsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.mods_ = Collections.unmodifiableList(this.mods_);
               this.bitField0_ &= -3;
            }

            var1.mods_ = this.mods_;
         } else {
            var1.mods_ = this.modsBuilder_.build();
         }
      }

      private void buildPartial0(ModGroup var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.type_ = this.type_;
         }
      }

      public ModGroup.Builder clone() {
         return (ModGroup.Builder)super.clone();
      }

      public ModGroup.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ModGroup.Builder)super.setField(var1, var2);
      }

      public ModGroup.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ModGroup.Builder)super.clearField(var1);
      }

      public ModGroup.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ModGroup.Builder)super.clearOneof(var1);
      }

      public ModGroup.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ModGroup.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ModGroup.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ModGroup.Builder)super.addRepeatedField(var1, var2);
      }

      public ModGroup.Builder mergeFrom(Message var1) {
         if (var1 instanceof ModGroup) {
            return this.mergeFrom((ModGroup)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ModGroup.Builder mergeFrom(ModGroup var1) {
         if (var1 == ModGroup.getDefaultInstance()) {
            return this;
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (this.modsBuilder_ == null) {
            if (!var1.mods_.isEmpty()) {
               if (this.mods_.isEmpty()) {
                  this.mods_ = var1.mods_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureModsIsMutable();
                  this.mods_.addAll(var1.mods_);
               }

               this.onChanged();
            }
         } else if (!var1.mods_.isEmpty()) {
            if (this.modsBuilder_.isEmpty()) {
               this.modsBuilder_.dispose();
               this.modsBuilder_ = null;
               this.mods_ = var1.mods_;
               this.bitField0_ &= -3;
               this.modsBuilder_ = ModGroup.alwaysUseFieldBuilders ? this.getModsFieldBuilder() : null;
            } else {
               this.modsBuilder_.addAllMessages(var1.mods_);
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

      public ModGroup.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     Mod var5 = var1.readMessage(Mod.parser(), var2);
                     if (this.modsBuilder_ == null) {
                        this.ensureModsIsMutable();
                        this.mods_.add(var5);
                     } else {
                        this.modsBuilder_.addMessage(var5);
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
      public int getTypeValue() {
         return this.type_;
      }

      public ModGroup.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ModGroup.Type getType() {
         ModGroup.Type var1 = ModGroup.Type.forNumber(this.type_);
         return var1 == null ? ModGroup.Type.UNRECOGNIZED : var1;
      }

      public ModGroup.Builder setType(ModGroup.Type var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ModGroup.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureModsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.mods_ = new ArrayList<>(this.mods_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<Mod> getModsList() {
         return this.modsBuilder_ == null ? Collections.unmodifiableList(this.mods_) : this.modsBuilder_.getMessageList();
      }

      @Override
      public int getModsCount() {
         return this.modsBuilder_ == null ? this.mods_.size() : this.modsBuilder_.getCount();
      }

      @Override
      public Mod getMods(int var1) {
         return this.modsBuilder_ == null ? this.mods_.get(var1) : this.modsBuilder_.getMessage(var1);
      }

      public ModGroup.Builder setMods(int var1, Mod var2) {
         if (this.modsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureModsIsMutable();
            this.mods_.set(var1, var2);
            this.onChanged();
         } else {
            this.modsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ModGroup.Builder setMods(int var1, Mod.Builder var2) {
         if (this.modsBuilder_ == null) {
            this.ensureModsIsMutable();
            this.mods_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.modsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ModGroup.Builder addMods(Mod var1) {
         if (this.modsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureModsIsMutable();
            this.mods_.add(var1);
            this.onChanged();
         } else {
            this.modsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ModGroup.Builder addMods(int var1, Mod var2) {
         if (this.modsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureModsIsMutable();
            this.mods_.add(var1, var2);
            this.onChanged();
         } else {
            this.modsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ModGroup.Builder addMods(Mod.Builder var1) {
         if (this.modsBuilder_ == null) {
            this.ensureModsIsMutable();
            this.mods_.add(var1.build());
            this.onChanged();
         } else {
            this.modsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ModGroup.Builder addMods(int var1, Mod.Builder var2) {
         if (this.modsBuilder_ == null) {
            this.ensureModsIsMutable();
            this.mods_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.modsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ModGroup.Builder addAllMods(Iterable<? extends Mod> var1) {
         if (this.modsBuilder_ == null) {
            this.ensureModsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.mods_);
            this.onChanged();
         } else {
            this.modsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ModGroup.Builder clearMods() {
         if (this.modsBuilder_ == null) {
            this.mods_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.modsBuilder_.clear();
         }

         return this;
      }

      public ModGroup.Builder removeMods(int var1) {
         if (this.modsBuilder_ == null) {
            this.ensureModsIsMutable();
            this.mods_.remove(var1);
            this.onChanged();
         } else {
            this.modsBuilder_.remove(var1);
         }

         return this;
      }

      public Mod.Builder getModsBuilder(int var1) {
         return this.getModsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ModOrBuilder getModsOrBuilder(int var1) {
         return this.modsBuilder_ == null ? this.mods_.get(var1) : this.modsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ModOrBuilder> getModsOrBuilderList() {
         return this.modsBuilder_ != null ? this.modsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.mods_);
      }

      public Mod.Builder addModsBuilder() {
         return this.getModsFieldBuilder().addBuilder(Mod.getDefaultInstance());
      }

      public Mod.Builder addModsBuilder(int var1) {
         return this.getModsFieldBuilder().addBuilder(var1, Mod.getDefaultInstance());
      }

      public List<Mod.Builder> getModsBuilderList() {
         return this.getModsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Mod, Mod.Builder, ModOrBuilder> getModsFieldBuilder() {
         if (this.modsBuilder_ == null) {
            this.modsBuilder_ = new RepeatedFieldBuilderV3<>(this.mods_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.mods_ = null;
         }

         return this.modsBuilder_;
      }

      public final ModGroup.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ModGroup.Builder)super.setUnknownFields(var1);
      }

      public final ModGroup.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ModGroup.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Type implements ProtocolMessageEnum {
      TYPE_UNSPECIFIED(0),
      TYPE_FABRIC_INTERNAL(1),
      TYPE_FABRIC_EXTERNAL(2),
      TYPE_FORGE_INTERNAL(3),
      TYPE_FORGE_EXTERNAL(4),
      UNRECOGNIZED(-1);

      public static final int TYPE_UNSPECIFIED_VALUE = 0;
      public static final int TYPE_FABRIC_INTERNAL_VALUE = 1;
      public static final int TYPE_FABRIC_EXTERNAL_VALUE = 2;
      public static final int TYPE_FORGE_INTERNAL_VALUE = 3;
      public static final int TYPE_FORGE_EXTERNAL_VALUE = 4;
      private static final Internal.EnumLiteMap<ModGroup.Type> internalValueMap = new Internal.EnumLiteMap<ModGroup.Type>() {
         public ModGroup.Type findValueByNumber(int var1) {
            return ModGroup.Type.forNumber(var1);
         }
      };
      private static final ModGroup.Type[] VALUES = values();
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
      public static ModGroup.Type valueOf(int var0) {
         return forNumber(var0);
      }

      public static ModGroup.Type forNumber(int var0) {
         switch (var0) {
            case 0:
               return TYPE_UNSPECIFIED;
            case 1:
               return TYPE_FABRIC_INTERNAL;
            case 2:
               return TYPE_FABRIC_EXTERNAL;
            case 3:
               return TYPE_FORGE_INTERNAL;
            case 4:
               return TYPE_FORGE_EXTERNAL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ModGroup.Type> internalGetValueMap() {
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
         return ModGroup.getDescriptor().getEnumTypes().get(0);
      }

      public static ModGroup.Type valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Type(int var3) {
         this.value = var3;
      }
   }
}
