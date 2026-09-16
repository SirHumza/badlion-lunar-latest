package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RRHHORICORICIRHICOHHROHIIHICCH;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ResourcePackRepository.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Final
   @Shadow
   public File dirServerResourcepacks;
   @Shadow
   public List<Entry> repositoryEntriesAll;
   @Shadow
   public List<Entry> repositoryEntries;

   @Shadow
   public abstract List<File> getResourcePackFiles();

   @Inject(method = "deleteOldServerResourcesPacks$v1_8", at = @At("HEAD"), cancellable = true)
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   private void impl$deleteOldServerResourcesPacks(CallbackInfo var1) {
      if (!this.dirServerResourcepacks.exists()) {
         var1.cancel();
      }
   }

   @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Ljava/util/Iterator;hasNext()Z"))
   private boolean impl$onIterateResourcePacks(Iterator var1) {
      return false;
   }

   @Inject(method = "<init>", at = @At("TAIL"))
   private void impl$onConstruct(File var1, File var2, IResourcePack var3, MetadataSerializer var4, GameSettings var5, CallbackInfo var6) {
      Constructor var7 = Entry.class.getDeclaredConstructor(ResourcePackRepository.class, File.class);
      var7.setAccessible(true);

      for (String var10 : IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var5.resourcePacks$v1_8 : var5.resourcePacks$v1_7) {
         try {
            boolean var11 = false;
            boolean var12 = false;

            for (Entry var14 : this.repositoryEntriesAll) {
               if (var14.getResourcePackName().equals(var10) || var10.equals("file/" + var14.getResourcePackName())) {
                  var11 = true;
                  if (this.lunar$shouldLoadPack(var5, var14)) {
                     this.repositoryEntries.add(var14);
                     var12 = true;
                  }
               }
            }

            if (!var11) {
               File var16 = RRHHORICORICIRHICOHHROHIIHICCH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var10);
               if (var16 != null) {
                  Entry var17 = (Entry)var7.newInstance(this, var16);
                  var17.updateResourcePack();
                  var11 = true;
                  if (this.lunar$shouldLoadPack(var5, var17)) {
                     this.repositoryEntries.add(var17);
                     var12 = true;
                  }
               }
            }

            if (var11 && !var12) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Not loading resource pack %s because it was made for a newer version", new Object[]{var10}
               );
            }
         } catch (Exception var15) {
            var15.printStackTrace();
         }
      }
   }

   @Unique
   private boolean lunar$shouldLoadPack(GameSettings var1, Entry var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return true;
      }

      int var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var2.getPackFormat$v1_12() : var2.func_183027_f$v1_8();
      int var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? 3 : 1;
      return var3 <= var4 || var1.incompatibleResourcePacks$v1_8.contains(var2.getResourcePackName());
   }

   @Overwrite
   public void updateRepositoryEntriesAll() {
      try {
         Constructor var1 = Entry.class.getDeclaredConstructor(ResourcePackRepository.class, File.class);
         var1.setAccessible(true);
         LinkedHashSet var2 = new LinkedHashSet();
         HashMap var3 = new HashMap();

         for (Entry var5 : this.repositoryEntriesAll) {
            var3.put(var5.hashCode(), var5);
         }

         for (File var14 : this.getResourcePackFiles()) {
            try {
               Entry var6 = (Entry)var1.newInstance(this, var14);
               int var7 = var6.hashCode();
               if (!var3.containsKey(var7)) {
                  try {
                     var6.updateResourcePack();
                     var2.add(var6);
                  } catch (Exception var9) {
                     var2.remove(var6);
                  }
               } else {
                  var2.add((Entry)var3.get(var7));
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }

         for (Entry var15 : var3.values()) {
            if (!var2.contains(var15)) {
               var15.closeResourcePack();
            }
         }

         this.repositoryEntriesAll = new ArrayList<>(var2);
      } catch (Exception var11) {
         var11.printStackTrace();
      }
   }
}
