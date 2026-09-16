package net.minecraftforge.fml.common.registry;

public interface RegistryDelegate<T> {
   T get();

   jy name();

   Class<T> type();
}
