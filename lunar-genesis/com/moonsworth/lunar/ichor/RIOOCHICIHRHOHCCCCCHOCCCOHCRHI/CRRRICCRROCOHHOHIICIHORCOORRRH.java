package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.objectweb.asm.tree.ClassNode;

public interface CRRRICCRROCOHHOHIICIHORCOORRRH {
   ClassNode transformClassNode(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2, String var3, @Nullable ClassNode var4);

   void registerMixins(List<String> var1);

   void setMixinDecorations(List<String> var1, Map<String, Object> var2);

   void gotoDefaultPhase();

   Set<String> getMixinAndTargetClasses();

   Set<String> getSyntheticClasses();

   void audit(ClassLoader var1);

   Map<String, byte[]> getExtraClassDefinitions();
}
