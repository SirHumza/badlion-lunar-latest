package com.llamalad7.mixinextras.service;

class Versioned<T> {
   final int version;
   final T value;

   Versioned(int var1, T var2) {
      this.version = var1;
      this.value = (T)var2;
   }
}
