package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.util.ShadyPines;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class BlockNBTComponentImpl extends NBTComponentImpl<BlockNBTComponent, BlockNBTComponent.Builder> implements BlockNBTComponent {
   private final BlockNBTComponent.Pos pos;

   static BlockNBTComponent create(
      @NotNull List<? extends ComponentLike> var0,
      @NotNull Style var1,
      String var2,
      boolean var3,
      @Nullable ComponentLike var4,
      @NotNull BlockNBTComponent.Pos var5
   ) {
      return new BlockNBTComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY),
         Objects.requireNonNull(var1, "style"),
         Objects.requireNonNull(var2, "nbtPath"),
         var3,
         ComponentLike.unbox(var4),
         Objects.requireNonNull(var5, "pos")
      );
   }

   BlockNBTComponentImpl(
      @NotNull List<Component> var1, @NotNull Style var2, String var3, boolean var4, @Nullable Component var5, @NotNull BlockNBTComponent.Pos var6
   ) {
      super(var1, var2, var3, var4, var5);
      this.pos = var6;
   }

   @NotNull
   public BlockNBTComponent nbtPath(@NotNull String var1) {
      return Objects.equals(this.nbtPath, var1) ? this : create(this.children, this.style, var1, this.interpret, this.separator, this.pos);
   }

   @NotNull
   public BlockNBTComponent interpret(boolean var1) {
      return this.interpret == var1 ? this : create(this.children, this.style, this.nbtPath, var1, this.separator, this.pos);
   }

   @Nullable
   @Override
   public Component separator() {
      return this.separator;
   }

   @NotNull
   public BlockNBTComponent separator(@Nullable ComponentLike var1) {
      return create(this.children, this.style, this.nbtPath, this.interpret, var1, this.pos);
   }

   @NotNull
   @Override
   public BlockNBTComponent.Pos pos() {
      return this.pos;
   }

   @NotNull
   @Override
   public BlockNBTComponent pos(@NotNull BlockNBTComponent.Pos var1) {
      return create(this.children, this.style, this.nbtPath, this.interpret, this.separator, var1);
   }

   @NotNull
   public BlockNBTComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.nbtPath, this.interpret, this.separator, this.pos);
   }

   @NotNull
   public BlockNBTComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.nbtPath, this.interpret, this.separator, this.pos);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof BlockNBTComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      BlockNBTComponent var2 = (BlockNBTComponent)var1;
      return Objects.equals(this.pos, var2.pos());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.pos.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   public BlockNBTComponent.@NotNull Builder toBuilder() {
      return new BlockNBTComponentImpl.BuilderImpl(this);
   }

   static final class BuilderImpl extends AbstractNBTComponentBuilder<BlockNBTComponent, BlockNBTComponent.Builder> implements BlockNBTComponent.Builder {
      @Nullable
      private BlockNBTComponent.Pos pos;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull BlockNBTComponent var1) {
         super(var1);
         this.pos = var1.pos();
      }

      @Override
      public BlockNBTComponent.@NotNull Builder pos(@NotNull BlockNBTComponent.Pos var1) {
         this.pos = Objects.requireNonNull(var1, "pos");
         return this;
      }

      @NotNull
      public BlockNBTComponent build() {
         if (this.nbtPath == null) {
            throw new IllegalStateException("nbt path must be set");
         } else if (this.pos == null) {
            throw new IllegalStateException("pos must be set");
         } else {
            return BlockNBTComponentImpl.create(this.children, this.buildStyle(), this.nbtPath, this.interpret, this.separator, this.pos);
         }
      }
   }

   static final class LocalPosImpl implements BlockNBTComponent.LocalPos {
      private final double left;
      private final double up;
      private final double forwards;

      LocalPosImpl(double var1, double var3, double var5) {
         this.left = var1;
         this.up = var3;
         this.forwards = var5;
      }

      @Override
      public double left() {
         return this.left;
      }

      @Override
      public double up() {
         return this.up;
      }

      @Override
      public double forwards() {
         return this.forwards;
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("left", this.left), ExaminableProperty.of("up", this.up), ExaminableProperty.of("forwards", this.forwards));
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof BlockNBTComponent.LocalPos)) {
            return false;
         }

         BlockNBTComponent.LocalPos var2 = (BlockNBTComponent.LocalPos)var1;
         return ShadyPines.equals(var2.left(), this.left()) && ShadyPines.equals(var2.up(), this.up()) && ShadyPines.equals(var2.forwards(), this.forwards());
      }

      @Override
      public int hashCode() {
         int var1 = Double.hashCode(this.left);
         var1 = 31 * var1 + Double.hashCode(this.up);
         return 31 * var1 + Double.hashCode(this.forwards);
      }

      @Override
      public String toString() {
         return String.format("^%f ^%f ^%f", this.left, this.up, this.forwards);
      }

      @NotNull
      @Override
      public String asString() {
         return BlockNBTComponentImpl.Tokens.serializeLocal(this.left)
            + ' '
            + BlockNBTComponentImpl.Tokens.serializeLocal(this.up)
            + ' '
            + BlockNBTComponentImpl.Tokens.serializeLocal(this.forwards);
      }
   }

   static final class Tokens {
      static final Pattern LOCAL_PATTERN = Pattern.compile("^\\^(-?\\d+(\\.\\d+)?) \\^(-?\\d+(\\.\\d+)?) \\^(-?\\d+(\\.\\d+)?)$");
      static final Pattern WORLD_PATTERN = Pattern.compile("^(~?)(-?\\d+) (~?)(-?\\d+) (~?)(-?\\d+)$");
      static final String LOCAL_SYMBOL = "^";
      static final String RELATIVE_SYMBOL = "~";
      static final String ABSOLUTE_SYMBOL = "";

      private Tokens() {
      }

      static BlockNBTComponent.WorldPos.Coordinate deserializeCoordinate(String var0, String var1) {
         int var2 = Integer.parseInt(var1);
         if (var0.equals("")) {
            return BlockNBTComponent.WorldPos.Coordinate.absolute(var2);
         } else if (var0.equals("~")) {
            return BlockNBTComponent.WorldPos.Coordinate.relative(var2);
         } else {
            throw new AssertionError();
         }
      }

      static String serializeLocal(double var0) {
         return "^" + var0;
      }

      static String serializeCoordinate(BlockNBTComponent.WorldPos.Coordinate var0) {
         return (var0.type() == BlockNBTComponent.WorldPos.Coordinate.Type.RELATIVE ? "~" : "") + var0.value();
      }
   }

   static final class WorldPosImpl implements BlockNBTComponent.WorldPos {
      private final BlockNBTComponent.WorldPos.Coordinate x;
      private final BlockNBTComponent.WorldPos.Coordinate y;
      private final BlockNBTComponent.WorldPos.Coordinate z;

      WorldPosImpl(BlockNBTComponent.WorldPos.Coordinate var1, BlockNBTComponent.WorldPos.Coordinate var2, BlockNBTComponent.WorldPos.Coordinate var3) {
         this.x = Objects.requireNonNull(var1, "x");
         this.y = Objects.requireNonNull(var2, "y");
         this.z = Objects.requireNonNull(var3, "z");
      }

      @NotNull
      @Override
      public BlockNBTComponent.WorldPos.Coordinate x() {
         return this.x;
      }

      @NotNull
      @Override
      public BlockNBTComponent.WorldPos.Coordinate y() {
         return this.y;
      }

      @NotNull
      @Override
      public BlockNBTComponent.WorldPos.Coordinate z() {
         return this.z;
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("x", this.x), ExaminableProperty.of("y", this.y), ExaminableProperty.of("z", this.z));
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof BlockNBTComponent.WorldPos)) {
            return false;
         }

         BlockNBTComponent.WorldPos var2 = (BlockNBTComponent.WorldPos)var1;
         return this.x.equals(var2.x()) && this.y.equals(var2.y()) && this.z.equals(var2.z());
      }

      @Override
      public int hashCode() {
         int var1 = this.x.hashCode();
         var1 = 31 * var1 + this.y.hashCode();
         return 31 * var1 + this.z.hashCode();
      }

      @Override
      public String toString() {
         return this.x.toString() + ' ' + this.y.toString() + ' ' + this.z.toString();
      }

      @NotNull
      @Override
      public String asString() {
         return BlockNBTComponentImpl.Tokens.serializeCoordinate(this.x())
            + ' '
            + BlockNBTComponentImpl.Tokens.serializeCoordinate(this.y())
            + ' '
            + BlockNBTComponentImpl.Tokens.serializeCoordinate(this.z());
      }

      static final class CoordinateImpl implements BlockNBTComponent.WorldPos.Coordinate {
         private final int value;
         private final BlockNBTComponent.WorldPos.Coordinate.Type type;

         CoordinateImpl(int var1, @NotNull BlockNBTComponent.WorldPos.Coordinate.Type var2) {
            this.value = var1;
            this.type = Objects.requireNonNull(var2, "type");
         }

         @Override
         public int value() {
            return this.value;
         }

         @NotNull
         @Override
         public BlockNBTComponent.WorldPos.Coordinate.Type type() {
            return this.type;
         }

         @NotNull
         @Override
         public Stream<? extends ExaminableProperty> examinableProperties() {
            return Stream.of(ExaminableProperty.of("value", this.value), ExaminableProperty.of("type", this.type));
         }

         @Override
         public boolean equals(@Nullable Object var1) {
            if (this == var1) {
               return true;
            }

            if (!(var1 instanceof BlockNBTComponent.WorldPos.Coordinate)) {
               return false;
            }

            BlockNBTComponent.WorldPos.Coordinate var2 = (BlockNBTComponent.WorldPos.Coordinate)var1;
            return this.value() == var2.value() && this.type() == var2.type();
         }

         @Override
         public int hashCode() {
            int var1 = this.value;
            return 31 * var1 + this.type.hashCode();
         }

         @Override
         public String toString() {
            return (this.type == BlockNBTComponent.WorldPos.Coordinate.Type.RELATIVE ? "~" : "") + this.value;
         }
      }
   }
}
