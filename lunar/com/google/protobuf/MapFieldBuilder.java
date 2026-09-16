package com.google.protobuf;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapFieldBuilder<KeyT, MessageOrBuilderT extends MessageOrBuilder, MessageT extends MessageOrBuilderT, BuilderT extends MessageOrBuilderT>
   extends MapFieldReflectionAccessor {
   Map<KeyT, MessageOrBuilderT> builderMap = new LinkedHashMap<>();
   Map<KeyT, MessageT> messageMap = null;
   List<Message> messageList = null;
   MapFieldBuilder.Converter<KeyT, MessageOrBuilderT, MessageT> converter;

   public MapFieldBuilder(MapFieldBuilder.Converter<KeyT, MessageOrBuilderT, MessageT> var1) {
      this.converter = var1;
   }

   private List<MapEntry<KeyT, MessageT>> getMapEntryList() {
      ArrayList var1 = new ArrayList(this.messageList.size());
      Class var2 = ((MessageOrBuilder)this.converter.defaultEntry().getValue()).getClass();

      for (Message var4 : this.messageList) {
         MapEntry var5 = (MapEntry)var4;
         if (var2.isInstance(var5.getValue())) {
            var1.add(var5);
         } else {
            var1.add(this.converter.defaultEntry().toBuilder().mergeFrom(var4).build());
         }
      }

      return var1;
   }

   public Map<KeyT, MessageOrBuilderT> ensureBuilderMap() {
      if (this.builderMap != null) {
         return this.builderMap;
      }

      if (this.messageMap != null) {
         this.builderMap = new LinkedHashMap<>(this.messageMap.size());

         for (Entry var4 : this.messageMap.entrySet()) {
            this.builderMap.put((KeyT)var4.getKey(), (MessageOrBuilderT)var4.getValue());
         }

         this.messageMap = null;
         return this.builderMap;
      } else {
         this.builderMap = new LinkedHashMap<>(this.messageList.size());

         for (MapEntry var2 : this.getMapEntryList()) {
            this.builderMap.put((KeyT)var2.getKey(), (MessageOrBuilderT)var2.getValue());
         }

         this.messageList = null;
         return this.builderMap;
      }
   }

   public List<Message> ensureMessageList() {
      if (this.messageList != null) {
         return this.messageList;
      }

      if (this.builderMap != null) {
         this.messageList = new ArrayList<>(this.builderMap.size());

         for (Entry var4 : this.builderMap.entrySet()) {
            this.messageList
               .add(
                  this.converter
                     .defaultEntry()
                     .toBuilder()
                     .setKey((KeyT)var4.getKey())
                     .setValue(this.converter.build((MessageOrBuilderT)var4.getValue()))
                     .build()
               );
         }

         this.builderMap = null;
         return this.messageList;
      } else {
         this.messageList = new ArrayList<>(this.messageMap.size());

         for (Entry var2 : this.messageMap.entrySet()) {
            this.messageList
               .add(this.converter.defaultEntry().toBuilder().setKey((KeyT)var2.getKey()).setValue((MessageT)((MessageOrBuilder)var2.getValue())).build());
         }

         this.messageMap = null;
         return this.messageList;
      }
   }

   public Map<KeyT, MessageT> ensureMessageMap() {
      this.messageMap = this.populateMutableMap();
      this.builderMap = null;
      this.messageList = null;
      return this.messageMap;
   }

   public Map<KeyT, MessageT> getImmutableMap() {
      return new MapField.MutabilityAwareMap<>(MutabilityOracle.IMMUTABLE, this.populateMutableMap());
   }

   private Map<KeyT, MessageT> populateMutableMap() {
      if (this.messageMap != null) {
         return this.messageMap;
      }

      if (this.builderMap != null) {
         LinkedHashMap var4 = new LinkedHashMap(this.builderMap.size());

         for (Entry var6 : this.builderMap.entrySet()) {
            var4.put(var6.getKey(), this.converter.build((MessageOrBuilderT)var6.getValue()));
         }

         return var4;
      } else {
         LinkedHashMap var1 = new LinkedHashMap(this.messageList.size());

         for (MapEntry var3 : this.getMapEntryList()) {
            var1.put(var3.getKey(), (MessageOrBuilder)var3.getValue());
         }

         return var1;
      }
   }

   public void mergeFrom(MapField<KeyT, MessageT> var1) {
      this.ensureBuilderMap().putAll(MapFieldLite.copy(var1.getMap()));
   }

   public void clear() {
      this.builderMap = new LinkedHashMap<>();
      this.messageMap = null;
      this.messageList = null;
   }

   private boolean typedEquals(MapFieldBuilder<KeyT, MessageOrBuilderT, MessageT, BuilderT> var1) {
      return MapFieldLite.equals(this.ensureBuilderMap(), var1.ensureBuilderMap());
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof MapFieldBuilder) ? false : this.typedEquals((MapFieldBuilder<KeyT, MessageOrBuilderT, MessageT, BuilderT>)var1);
   }

   @Override
   public int hashCode() {
      return MapFieldLite.calculateHashCodeForMap(this.ensureBuilderMap());
   }

   public MapFieldBuilder<KeyT, MessageOrBuilderT, MessageT, BuilderT> copy() {
      MapFieldBuilder var1 = new MapFieldBuilder<>(this.converter);
      var1.ensureBuilderMap().putAll(this.ensureBuilderMap());
      return var1;
   }

   public MapField<KeyT, MessageT> build(MapEntry<KeyT, MessageT> var1) {
      MapField var2 = MapField.newMapField(var1);
      Map var3 = var2.getMutableMap();

      for (Entry var5 : this.ensureBuilderMap().entrySet()) {
         var3.put(var5.getKey(), this.converter.build((MessageOrBuilderT)var5.getValue()));
      }

      var2.makeImmutable();
      return var2;
   }

   @Override
   List<Message> getList() {
      return this.ensureMessageList();
   }

   @Override
   List<Message> getMutableList() {
      return this.ensureMessageList();
   }

   @Override
   Message getMapEntryMessageDefaultInstance() {
      return this.converter.defaultEntry();
   }

   public interface Converter<KeyT, MessageOrBuilderT extends MessageOrBuilder, MessageT extends MessageOrBuilderT> {
      MessageT build(MessageOrBuilderT var1);

      MapEntry<KeyT, MessageT> defaultEntry();
   }
}
