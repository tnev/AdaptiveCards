/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum ForegroundColor {
  Default(0),
  Dark,
  Light,
  Accent,
  Good,
  Warning,
  Attention;

  public final int swigValue() {
    return swigValue;
  }

  public static ForegroundColor swigToEnum(int swigValue) {
    ForegroundColor[] swigValues = ForegroundColor.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ForegroundColor swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ForegroundColor.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ForegroundColor() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ForegroundColor(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ForegroundColor(ForegroundColor swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

