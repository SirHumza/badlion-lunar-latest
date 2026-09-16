package com.typesafe.config.impl;

final class ResolveMemos {
   private final BadMap<MemoKey, AbstractConfigValue> memos;

   private ResolveMemos(BadMap<MemoKey, AbstractConfigValue> var1) {
      this.memos = var1;
   }

   ResolveMemos() {
      this(new BadMap<>());
   }

   AbstractConfigValue get(MemoKey var1) {
      return this.memos.get(var1);
   }

   ResolveMemos put(MemoKey var1, AbstractConfigValue var2) {
      return new ResolveMemos(this.memos.copyingPut(var1, var2));
   }
}
