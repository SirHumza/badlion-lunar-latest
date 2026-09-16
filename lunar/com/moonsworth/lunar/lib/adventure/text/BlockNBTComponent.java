package com.moonsworth.lunar.lib.adventure.text;

import java.util.regex.Matcher;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface BlockNBTComponent extends NBTComponent<BlockNBTComponent, BlockNBTComponent.Builder>, ScopedComponent<BlockNBTComponent> {
   @NotNull
   BlockNBTComponent.Pos pos();

   @Contract(pure = true)
   @NotNull
   BlockNBTComponent pos(@NotNull BlockNBTComponent.Pos var1);

   @Contract(pure = true)
   @NotNull
   default BlockNBTComponent localPos(double var1, double var3, double var5) {
      return this.pos(BlockNBTComponent.LocalPos.localPos(var1, var3, var5));
   }

   @Contract(pure = true)
   @NotNull
   default BlockNBTComponent worldPos(
      BlockNBTComponent.WorldPos.@NotNull Coordinate var1,
      BlockNBTComponent.WorldPos.@NotNull Coordinate var2,
      BlockNBTComponent.WorldPos.@NotNull Coordinate var3
   ) {
      return this.pos(BlockNBTComponent.WorldPos.worldPos(var1, var2, var3));
   }

   @Contract(pure = true)
   @NotNull
   default BlockNBTComponent absoluteWorldPos(int var1, int var2, int var3) {
      return this.worldPos(
         BlockNBTComponent.WorldPos.Coordinate.absolute(var1),
         BlockNBTComponent.WorldPos.Coordinate.absolute(var2),
         BlockNBTComponent.WorldPos.Coordinate.absolute(var3)
      );
   }

   @Contract(pure = true)
   @NotNull
   default BlockNBTComponent relativeWorldPos(int var1, int var2, int var3) {
      return this.worldPos(
         BlockNBTComponent.WorldPos.Coordinate.relative(var1),
         BlockNBTComponent.WorldPos.Coordinate.relative(var2),
         BlockNBTComponent.WorldPos.Coordinate.relative(var3)
      );
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.concat(Stream.of(ExaminableProperty.of("pos", this.pos())), NBTComponent.super.examinableProperties());
   }

   interface Builder extends NBTComponentBuilder<BlockNBTComponent, BlockNBTComponent.Builder> {
      @Contract("_ -> this")
      @NotNull
      BlockNBTComponent.Builder pos(@NotNull BlockNBTComponent.Pos var1);

      @Contract("_, _, _ -> this")
      @NotNull
      default BlockNBTComponent.Builder localPos(double var1, double var3, double var5) {
         return this.pos(BlockNBTComponent.LocalPos.localPos(var1, var3, var5));
      }

      @Contract("_, _, _ -> this")
      @NotNull
      default BlockNBTComponent.Builder worldPos(
         BlockNBTComponent.WorldPos.@NotNull Coordinate var1,
         BlockNBTComponent.WorldPos.@NotNull Coordinate var2,
         BlockNBTComponent.WorldPos.@NotNull Coordinate var3
      ) {
         return this.pos(BlockNBTComponent.WorldPos.worldPos(var1, var2, var3));
      }

      @Contract("_, _, _ -> this")
      @NotNull
      default BlockNBTComponent.Builder absoluteWorldPos(int var1, int var2, int var3) {
         return this.worldPos(
            BlockNBTComponent.WorldPos.Coordinate.absolute(var1),
            BlockNBTComponent.WorldPos.Coordinate.absolute(var2),
            BlockNBTComponent.WorldPos.Coordinate.absolute(var3)
         );
      }

      @Contract("_, _, _ -> this")
      @NotNull
      default BlockNBTComponent.Builder relativeWorldPos(int var1, int var2, int var3) {
         return this.worldPos(
            BlockNBTComponent.WorldPos.Coordinate.relative(var1),
            BlockNBTComponent.WorldPos.Coordinate.relative(var2),
            BlockNBTComponent.WorldPos.Coordinate.relative(var3)
         );
      }
   }

   interface LocalPos extends BlockNBTComponent.Pos {
      @NotNull
      static BlockNBTComponent.LocalPos localPos(double var0, double var2, double var4) {
         return new BlockNBTComponentImpl.LocalPosImpl(var0, var2, var4);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      static BlockNBTComponent.LocalPos of(double var0, double var2, double var4) {
         return new BlockNBTComponentImpl.LocalPosImpl(var0, var2, var4);
      }

      double left();

      double up();

      double forwards();
   }

   interface Pos extends Examinable {
      @NotNull
      static BlockNBTComponent.Pos fromString(@NotNull String var0) {
         Matcher var1 = BlockNBTComponentImpl.Tokens.LOCAL_PATTERN.matcher(var0);
         if (var1.matches()) {
            return BlockNBTComponent.LocalPos.localPos(Double.parseDouble(var1.group(1)), Double.parseDouble(var1.group(3)), Double.parseDouble(var1.group(5)));
         } else {
            Matcher var2 = BlockNBTComponentImpl.Tokens.WORLD_PATTERN.matcher(var0);
            if (var2.matches()) {
               return BlockNBTComponent.WorldPos.worldPos(
                  BlockNBTComponentImpl.Tokens.deserializeCoordinate(var2.group(1), var2.group(2)),
                  BlockNBTComponentImpl.Tokens.deserializeCoordinate(var2.group(3), var2.group(4)),
                  BlockNBTComponentImpl.Tokens.deserializeCoordinate(var2.group(5), var2.group(6))
               );
            } else {
               throw new IllegalArgumentException("Cannot convert position specification '" + var0 + "' into a position");
            }
         }
      }

      @NotNull
      String asString();
   }

   interface WorldPos extends BlockNBTComponent.Pos {
      @NotNull
      static BlockNBTComponent.WorldPos worldPos(
         @NotNull BlockNBTComponent.WorldPos.Coordinate var0,
         @NotNull BlockNBTComponent.WorldPos.Coordinate var1,
         @NotNull BlockNBTComponent.WorldPos.Coordinate var2
      ) {
         return new BlockNBTComponentImpl.WorldPosImpl(var0, var1, var2);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      static BlockNBTComponent.WorldPos of(
         @NotNull BlockNBTComponent.WorldPos.Coordinate var0,
         @NotNull BlockNBTComponent.WorldPos.Coordinate var1,
         @NotNull BlockNBTComponent.WorldPos.Coordinate var2
      ) {
         return new BlockNBTComponentImpl.WorldPosImpl(var0, var1, var2);
      }

      @NotNull
      BlockNBTComponent.WorldPos.Coordinate x();

      @NotNull
      BlockNBTComponent.WorldPos.Coordinate y();

      @NotNull
      BlockNBTComponent.WorldPos.Coordinate z();

      interface Coordinate extends Examinable {
         @NotNull
         static BlockNBTComponent.WorldPos.Coordinate absolute(int var0) {
            return coordinate(var0, BlockNBTComponent.WorldPos.Coordinate.Type.ABSOLUTE);
         }

         @NotNull
         static BlockNBTComponent.WorldPos.Coordinate relative(int var0) {
            return coordinate(var0, BlockNBTComponent.WorldPos.Coordinate.Type.RELATIVE);
         }

         @NotNull
         static BlockNBTComponent.WorldPos.Coordinate coordinate(int var0, @NotNull BlockNBTComponent.WorldPos.Coordinate.Type var1) {
            return new BlockNBTComponentImpl.WorldPosImpl.CoordinateImpl(var0, var1);
         }

         @Deprecated
         @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
         @NotNull
         static BlockNBTComponent.WorldPos.Coordinate of(int var0, @NotNull BlockNBTComponent.WorldPos.Coordinate.Type var1) {
            return new BlockNBTComponentImpl.WorldPosImpl.CoordinateImpl(var0, var1);
         }

         int value();

         @NotNull
         BlockNBTComponent.WorldPos.Coordinate.Type type();

         enum Type {
            ABSOLUTE,
            RELATIVE;
         }
      }
   }
}
