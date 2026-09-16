package net.kyori.ansi;

import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class ANSIComponentRendererImpl<S> implements ANSIComponentRenderer<S> {
   private static final int MAX_DEPTH = 128;
   private static final int UNSET = -1;
   private final StyleOps<S> ops;
   private final ColorLevel color;
   protected StringBuilder builder;
   private final ANSIComponentRendererImpl.Frame active = new ANSIComponentRendererImpl.Frame();
   private ANSIComponentRendererImpl.Frame[] styles = new ANSIComponentRendererImpl.Frame[8];
   private int head = -1;
   private boolean stylePending;

   protected ANSIComponentRendererImpl(StyleOps<S> var1, ColorLevel var2) {
      this.ops = Objects.requireNonNull(var1, "ops");
      this.color = Objects.requireNonNull(var2, "colorLevel");
      this.active.clear();
   }

   @Nullable
   private ANSIComponentRendererImpl.Frame peek() {
      return this.head < 0 ? null : this.styles[this.head];
   }

   private ANSIComponentRendererImpl.Frame push() {
      int var1 = ++this.head;
      if (var1 >= 128) {
         throw new IllegalStateException("Too many styles! Maximum depth of 128 exceeded");
      }

      if (var1 >= this.styles.length) {
         this.styles = Arrays.copyOf(this.styles, this.styles.length * 2);
      }

      ANSIComponentRendererImpl.Frame var2 = this.styles[var1];
      if (var2 == null) {
         var2 = this.styles[var1] = new ANSIComponentRendererImpl.Frame();
      }

      if (var1 > 0) {
         var2.set(this.styles[var1 - 1]);
      } else {
         var2.clear();
      }

      return var2;
   }

   private ANSIComponentRendererImpl.Frame pop() {
      if (this.head < 0) {
         throw new IllegalStateException("Tried to pop beyond what was pushed!");
      } else {
         return this.styles[this.head--];
      }
   }

   @NotNull
   @Override
   public ANSIComponentRenderer<S> pushStyle(@NotNull S var1) {
      ANSIComponentRendererImpl.Frame var2 = this.push();
      var2.apply(var1, this.ops);
      this.stylePending = true;
      return this;
   }

   @NotNull
   @Override
   public ANSIComponentRenderer<S> text(@NotNull String var1) {
      this.appendUpdatedStyle();
      this.builder.append(var1);
      return this;
   }

   private void appendUpdatedStyle() {
      if (this.stylePending) {
         ANSIComponentRendererImpl.Frame var1 = this.peek();
         this.printDifferences(this.active, var1);
         if (var1 == null) {
            this.active.clear();
         } else {
            this.active.set(var1);
         }

         this.stylePending = false;
      }
   }

   @NotNull
   @Override
   public ANSIComponentRenderer<S> popStyle(@NotNull S var1) {
      this.pop();
      this.stylePending = true;
      return this;
   }

   @NotNull
   @Override
   public ANSIComponentRenderer<S> complete() {
      if (this.head != -1) {
         throw new IllegalStateException(
            "Ended build with unbalanced stack. Remaining items are: " + Arrays.toString(Arrays.copyOf(this.styles, this.head + 1))
         );
      }

      this.appendUpdatedStyle();
      return this;
   }

   private void printDifferences(@NotNull ANSIComponentRendererImpl.Frame var1, @Nullable ANSIComponentRendererImpl.Frame var2) {
      if (this.color != ColorLevel.NONE) {
         StringBuilder var3 = this.builder;
         if (var2 == null) {
            if (var1.style != 0 || var1.color != -1) {
               Formats.emit(Formats.reset(), var3);
            }
         } else if (var1.style == var2.style && var2.color != -1) {
            if (var1.color != var2.color) {
               Formats.emit(this.color.determineEscape(var2.color), var3);
            }
         } else {
            if (var1.style != 0 || var1.color != -1 && var2.color == -1) {
               Formats.emit(Formats.reset(), var3);
            }

            if ((var2.style & 1) != 0) {
               Formats.emit(Formats.bold(true), var3);
            }

            if ((var2.style & 2) != 0) {
               Formats.emit(Formats.italics(true), var3);
            }

            if ((var2.style & 4) != 0) {
               Formats.emit(Formats.obfuscated(true), var3);
            }

            if ((var2.style & 8) != 0) {
               Formats.emit(Formats.strikethrough(true), var3);
            }

            if ((var2.style & 16) != 0) {
               Formats.emit(Formats.underlined(true), var3);
            }

            if (var2.color != -1) {
               Formats.emit(this.color.determineEscape(var2.color), var3);
            }
         }
      }
   }

   static final class Frame {
      static final int BOLD = 1;
      static final int ITALICS = 2;
      static final int OBFUSCATED = 4;
      static final int STRIKETHROUGH = 8;
      static final int UNDERLINED = 16;
      int color;
      int style;

      void set(@NotNull ANSIComponentRendererImpl.Frame var1) {
         this.color = var1.color;
         this.style = var1.style;
      }

      <S> void apply(@NotNull S var1, @NotNull StyleOps<S> var2) {
         int var3 = var2.color(var1);
         if (var3 != -1) {
            this.color = var2.color(var1);
         }

         this.apply(1, var2.bold(var1));
         this.apply(2, var2.italics(var1));
         this.apply(4, var2.obfuscated(var1));
         this.apply(8, var2.strikethrough(var1));
         this.apply(16, var2.underlined(var1));
      }

      private void apply(int var1, StyleOps.State var2) {
         switch (var2) {
            case TRUE:
               this.style |= var1;
               break;
            case FALSE:
               this.style &= ~var1;
            case UNSET:
         }
      }

      public void clear() {
         this.color = -1;
         this.style = 0;
      }
   }

   static final class ToString<S> extends ANSIComponentRendererImpl<S> implements ANSIComponentRenderer.ToString<S> {
      ToString(StyleOps<S> var1, ColorLevel var2) {
         super(var1, var2);
         this.builder = new StringBuilder();
      }

      @NotNull
      @Override
      public String asString() {
         String var1 = this.builder.toString();
         this.builder.delete(0, this.builder.length());
         return var1;
      }
   }

   static final class ToStringBuilder<S> extends ANSIComponentRendererImpl<S> implements ANSIComponentRenderer.ToStringBuilder<S> {
      ToStringBuilder(StyleOps<S> var1, ColorLevel var2) {
         super(var1, var2);
      }

      @Override
      public void builder(@NotNull StringBuilder var1) {
         this.builder = Objects.requireNonNull(var1, "builder");
      }

      @NotNull
      @Override
      public StringBuilder builder() {
         if (this.builder == null) {
            throw new IllegalStateException("String builder has not yet been initialized");
         } else {
            return this.builder;
         }
      }
   }
}
