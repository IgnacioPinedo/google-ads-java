// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/matching_function.proto

package com.google.ads.googleads.v2.common;

public interface MatchingFunctionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.MatchingFunction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String representation of the Function.
   * Examples:
   * 1. IDENTITY(true) or IDENTITY(false). All or no feed items served.
   * 2. EQUALS(CONTEXT.DEVICE,"Mobile")
   * 3. IN(FEED_ITEM_ID,{1000001,1000002,1000003})
   * 4. CONTAINS_ANY(FeedAttribute[12345678,0],{"Mars cruise","Venus cruise"})
   * 5. AND(IN(FEED_ITEM_ID,{10001,10002}),EQUALS(CONTEXT.DEVICE,"Mobile"))
   * For more details, visit
   * https://developers.google.com/adwords/api/docs/guides/feed-matching-functions
   * Note that because multiple strings may represent the same underlying
   * function (whitespace and single versus double quotation marks, for
   * example), the value returned may not be identical to the string sent in a
   * mutate request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue function_string = 1;</code>
   * @return Whether the functionString field is set.
   */
  boolean hasFunctionString();
  /**
   * <pre>
   * String representation of the Function.
   * Examples:
   * 1. IDENTITY(true) or IDENTITY(false). All or no feed items served.
   * 2. EQUALS(CONTEXT.DEVICE,"Mobile")
   * 3. IN(FEED_ITEM_ID,{1000001,1000002,1000003})
   * 4. CONTAINS_ANY(FeedAttribute[12345678,0],{"Mars cruise","Venus cruise"})
   * 5. AND(IN(FEED_ITEM_ID,{10001,10002}),EQUALS(CONTEXT.DEVICE,"Mobile"))
   * For more details, visit
   * https://developers.google.com/adwords/api/docs/guides/feed-matching-functions
   * Note that because multiple strings may represent the same underlying
   * function (whitespace and single versus double quotation marks, for
   * example), the value returned may not be identical to the string sent in a
   * mutate request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue function_string = 1;</code>
   * @return The functionString.
   */
  com.google.protobuf.StringValue getFunctionString();
  /**
   * <pre>
   * String representation of the Function.
   * Examples:
   * 1. IDENTITY(true) or IDENTITY(false). All or no feed items served.
   * 2. EQUALS(CONTEXT.DEVICE,"Mobile")
   * 3. IN(FEED_ITEM_ID,{1000001,1000002,1000003})
   * 4. CONTAINS_ANY(FeedAttribute[12345678,0],{"Mars cruise","Venus cruise"})
   * 5. AND(IN(FEED_ITEM_ID,{10001,10002}),EQUALS(CONTEXT.DEVICE,"Mobile"))
   * For more details, visit
   * https://developers.google.com/adwords/api/docs/guides/feed-matching-functions
   * Note that because multiple strings may represent the same underlying
   * function (whitespace and single versus double quotation marks, for
   * example), the value returned may not be identical to the string sent in a
   * mutate request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue function_string = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFunctionStringOrBuilder();

  /**
   * <pre>
   * Operator for a function.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator operator = 4;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Operator for a function.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator operator = 4;</code>
   * @return The operator.
   */
  com.google.ads.googleads.v2.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator getOperator();

  /**
   * <pre>
   * The operands on the left hand side of the equation. This is also the
   * operand to be used for single operand expressions such as NOT.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand left_operands = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.Operand> 
      getLeftOperandsList();
  /**
   * <pre>
   * The operands on the left hand side of the equation. This is also the
   * operand to be used for single operand expressions such as NOT.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand left_operands = 2;</code>
   */
  com.google.ads.googleads.v2.common.Operand getLeftOperands(int index);
  /**
   * <pre>
   * The operands on the left hand side of the equation. This is also the
   * operand to be used for single operand expressions such as NOT.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand left_operands = 2;</code>
   */
  int getLeftOperandsCount();
  /**
   * <pre>
   * The operands on the left hand side of the equation. This is also the
   * operand to be used for single operand expressions such as NOT.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand left_operands = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.OperandOrBuilder> 
      getLeftOperandsOrBuilderList();
  /**
   * <pre>
   * The operands on the left hand side of the equation. This is also the
   * operand to be used for single operand expressions such as NOT.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand left_operands = 2;</code>
   */
  com.google.ads.googleads.v2.common.OperandOrBuilder getLeftOperandsOrBuilder(
      int index);

  /**
   * <pre>
   * The operands on the right hand side of the equation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand right_operands = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.Operand> 
      getRightOperandsList();
  /**
   * <pre>
   * The operands on the right hand side of the equation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand right_operands = 3;</code>
   */
  com.google.ads.googleads.v2.common.Operand getRightOperands(int index);
  /**
   * <pre>
   * The operands on the right hand side of the equation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand right_operands = 3;</code>
   */
  int getRightOperandsCount();
  /**
   * <pre>
   * The operands on the right hand side of the equation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand right_operands = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.OperandOrBuilder> 
      getRightOperandsOrBuilderList();
  /**
   * <pre>
   * The operands on the right hand side of the equation.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.Operand right_operands = 3;</code>
   */
  com.google.ads.googleads.v2.common.OperandOrBuilder getRightOperandsOrBuilder(
      int index);
}
