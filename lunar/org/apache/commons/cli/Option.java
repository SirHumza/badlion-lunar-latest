package org.apache.commons.cli;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Option implements Serializable, Cloneable {
   private static final long serialVersionUID = 1L;
   public static final int UNINITIALIZED = -1;
   public static final int UNLIMITED_VALUES = -2;
   private String opt;
   private String longOpt;
   private String argName = "arg";
   private String description;
   private boolean required;
   private boolean optionalArg;
   private int numberOfArgs = -1;
   private Object type;
   private List values = new ArrayList();
   private char valuesep;

   public Option(String var1, String var2) {
      this(var1, null, false, var2);
   }

   public Option(String var1, boolean var2, String var3) {
      this(var1, null, var2, var3);
   }

   public Option(String var1, String var2, boolean var3, String var4) {
      OptionValidator.validateOption(var1);
      this.opt = var1;
      this.longOpt = var2;
      if (var3) {
         this.numberOfArgs = 1;
      }

      this.description = var4;
   }

   public int getId() {
      return this.getKey().charAt(0);
   }

   String getKey() {
      return this.opt == null ? this.longOpt : this.opt;
   }

   public String getOpt() {
      return this.opt;
   }

   public Object getType() {
      return this.type;
   }

   public void setType(Object var1) {
      this.type = var1;
   }

   public String getLongOpt() {
      return this.longOpt;
   }

   public void setLongOpt(String var1) {
      this.longOpt = var1;
   }

   public void setOptionalArg(boolean var1) {
      this.optionalArg = var1;
   }

   public boolean hasOptionalArg() {
      return this.optionalArg;
   }

   public boolean hasLongOpt() {
      return this.longOpt != null;
   }

   public boolean hasArg() {
      return this.numberOfArgs > 0 || this.numberOfArgs == -2;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String var1) {
      this.description = var1;
   }

   public boolean isRequired() {
      return this.required;
   }

   public void setRequired(boolean var1) {
      this.required = var1;
   }

   public void setArgName(String var1) {
      this.argName = var1;
   }

   public String getArgName() {
      return this.argName;
   }

   public boolean hasArgName() {
      return this.argName != null && this.argName.length() > 0;
   }

   public boolean hasArgs() {
      return this.numberOfArgs > 1 || this.numberOfArgs == -2;
   }

   public void setArgs(int var1) {
      this.numberOfArgs = var1;
   }

   public void setValueSeparator(char var1) {
      this.valuesep = var1;
   }

   public char getValueSeparator() {
      return this.valuesep;
   }

   public boolean hasValueSeparator() {
      return this.valuesep > 0;
   }

   public int getArgs() {
      return this.numberOfArgs;
   }

   void addValueForProcessing(String var1) {
      switch (this.numberOfArgs) {
         case -1:
            throw new RuntimeException("NO_ARGS_ALLOWED");
         default:
            this.processValue(var1);
      }
   }

   private void processValue(String var1) {
      if (this.hasValueSeparator()) {
         char var2 = this.getValueSeparator();

         for (int var3 = var1.indexOf(var2); var3 != -1 && this.values.size() != this.numberOfArgs - 1; var3 = var1.indexOf(var2)) {
            this.add(var1.substring(0, var3));
            var1 = var1.substring(var3 + 1);
         }
      }

      this.add(var1);
   }

   private void add(String var1) {
      if (this.numberOfArgs > 0 && this.values.size() > this.numberOfArgs - 1) {
         throw new RuntimeException("Cannot add value, list full.");
      }

      this.values.add(var1);
   }

   public String getValue() {
      return this.hasNoValues() ? null : (String)this.values.get(0);
   }

   public String getValue(int var1) {
      return this.hasNoValues() ? null : (String)this.values.get(var1);
   }

   public String getValue(String var1) {
      String var2 = this.getValue();
      return var2 != null ? var2 : var1;
   }

   public String[] getValues() {
      return this.hasNoValues() ? null : this.values.toArray(new String[this.values.size()]);
   }

   public List getValuesList() {
      return this.values;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer().append("[ option: ");
      var1.append(this.opt);
      if (this.longOpt != null) {
         var1.append(" ").append(this.longOpt);
      }

      var1.append(" ");
      if (this.hasArgs()) {
         var1.append("[ARG...]");
      } else if (this.hasArg()) {
         var1.append(" [ARG]");
      }

      var1.append(" :: ").append(this.description);
      if (this.type != null) {
         var1.append(" :: ").append(this.type);
      }

      var1.append(" ]");
      return var1.toString();
   }

   private boolean hasNoValues() {
      return this.values.isEmpty();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         Option var2 = (Option)var1;
         if (this.opt != null ? this.opt.equals(var2.opt) : var2.opt == null) {
            return this.longOpt != null ? this.longOpt.equals(var2.longOpt) : var2.longOpt == null;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = this.opt != null ? this.opt.hashCode() : 0;
      return 31 * var1 + (this.longOpt != null ? this.longOpt.hashCode() : 0);
   }

   public Object clone() {
      try {
         Option var1 = (Option)super.clone();
         var1.values = new ArrayList(this.values);
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException("A CloneNotSupportedException was thrown: " + var2.getMessage());
      }
   }

   void clearValues() {
      this.values.clear();
   }

   public boolean addValue(String var1) {
      throw new UnsupportedOperationException(
         "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. "
      );
   }
}
