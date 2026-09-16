package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.schemas.Schema;
import com.lunarclient.dfu.serialization.Dynamic;

public interface DataFixer {
   <T> Dynamic<T> update(DSL.TypeReference var1, Dynamic<T> var2, int var3, int var4);

   Schema getSchema(int var1);
}
