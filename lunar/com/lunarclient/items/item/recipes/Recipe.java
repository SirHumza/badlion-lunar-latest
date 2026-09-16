package com.lunarclient.items.item.recipes;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.items.item.recipes.output.Output;
import java.util.Map;

public record Recipe() {
   @SerializedName("output")
   private final Output output;
   @SerializedName("ingredient_symbols")
   private final Map<String, String> ingredientSymbols;
   @SerializedName("matrix")
   private final String[] matrix;
   @SerializedName("allow_quick_crafting")
   private final boolean allowQuickCrafting;

   public Recipe(Output var1, Map<String, String> var2, String[] var3, boolean var4) {
      this.output = var1;
      this.ingredientSymbols = var2;
      this.matrix = var3;
      this.allowQuickCrafting = var4;
   }
}
