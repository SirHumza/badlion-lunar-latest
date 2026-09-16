package com.lunarclient.apollo.module.inventory;

import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.module.button.ApolloButtonSerializer;
import java.awt.Color;
import org.spongepowered.configurate.ConfigurationNode;

public final class InventoryButtonSerializer extends ApolloButtonSerializer<InventoryButton> {
   @Override
   protected ApolloButton.ApolloButtonBuilder<? extends InventoryButton, ?> createBuilder(ConfigurationNode var1) {
      InventoryButton.InventoryButtonBuilder var2 = InventoryButton.builder()
         .inventoryType(this.parseEnum(InventoryType.class, this.virtualNode(var1, "inventory-type").getString(), "inventory-type"))
         .box(this.parseEnum(InventoryButtonBox.class, this.virtualNode(var1, "box").getString(), "box"));
      Color var3 = (Color)var1.node(new Object[]{"background-color"}).get(Color.class);
      if (var3 != null) {
         var2.backgroundColor(var3);
      }

      Color var4 = (Color)var1.node(new Object[]{"border-color"}).get(Color.class);
      if (var4 != null) {
         var2.borderColor(var4);
      }

      return var2;
   }

   protected void serializeSurface(InventoryButton var1, ConfigurationNode var2) {
      var2.node(new Object[]{"inventory-type"}).set(var1.getInventoryType().name());
      var2.node(new Object[]{"box"}).set(var1.getBox().name());
   }
}
