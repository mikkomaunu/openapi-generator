/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonPropertyOrder({
  FormatTest.JSON_PROPERTY_INTEGER,
  FormatTest.JSON_PROPERTY_INT32,
  FormatTest.JSON_PROPERTY_INT64,
  FormatTest.JSON_PROPERTY_NUMBER,
  FormatTest.JSON_PROPERTY_FLOAT,
  FormatTest.JSON_PROPERTY_DOUBLE,
  FormatTest.JSON_PROPERTY_DECIMAL,
  FormatTest.JSON_PROPERTY_STRING,
  FormatTest.JSON_PROPERTY_BYTE,
  FormatTest.JSON_PROPERTY_BINARY,
  FormatTest.JSON_PROPERTY_DATE,
  FormatTest.JSON_PROPERTY_DATE_TIME,
  FormatTest.JSON_PROPERTY_UUID,
  FormatTest.JSON_PROPERTY_PASSWORD,
  FormatTest.JSON_PROPERTY_PATTERN_WITH_DIGITS,
  FormatTest.JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER
})
@JsonTypeName("format_test")

public class FormatTest  {
  
  public static final String JSON_PROPERTY_INTEGER = "integer";
  
  private Integer integer;

  public static final String JSON_PROPERTY_INT32 = "int32";
  
  private Integer int32;

  public static final String JSON_PROPERTY_INT64 = "int64";
  
  private Long int64;

  public static final String JSON_PROPERTY_NUMBER = "number";
  
  private BigDecimal number;

  public static final String JSON_PROPERTY_FLOAT = "float";
  
  private Float _float;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  
  private Double _double;

  public static final String JSON_PROPERTY_DECIMAL = "decimal";
  
  private BigDecimal decimal;

  public static final String JSON_PROPERTY_STRING = "string";
  
  private String string;

  public static final String JSON_PROPERTY_BYTE = "byte";
  
  private byte[] _byte;

  public static final String JSON_PROPERTY_BINARY = "binary";
  
  private File binary;

  public static final String JSON_PROPERTY_DATE = "date";
  
  private Date date;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  
  private Date dateTime;

  public static final String JSON_PROPERTY_UUID = "uuid";
  
  private UUID uuid;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  
  private String password;

  public static final String JSON_PROPERTY_PATTERN_WITH_DIGITS = "pattern_with_digits";
 /**
  * A string that is a 10 digit number. Can have leading zeros.
  */
  
  private String patternWithDigits;

  public static final String JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER = "pattern_with_digits_and_delimiter";
 /**
  * A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.
  */
  
  private String patternWithDigitsAndDelimiter;


  /**
   * Get integer
   * minimum: 10
   * maximum: 100
   * @return integer
   **/
  @JsonProperty(JSON_PROPERTY_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getInteger() {
    return integer;
  }

  /**
   * Set integer
   */
  @JsonProperty(JSON_PROPERTY_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public FormatTest integer(Integer integer) {
    this.integer = integer;
    return this;
  }

  /**
   * Get int32
   * minimum: 20
   * maximum: 200
   * @return int32
   **/
  @JsonProperty(JSON_PROPERTY_INT32)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getInt32() {
    return int32;
  }

  /**
   * Set int32
   */
  @JsonProperty(JSON_PROPERTY_INT32)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  public FormatTest int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

  /**
   * Get int64
   * @return int64
   **/
  @JsonProperty(JSON_PROPERTY_INT64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInt64() {
    return int64;
  }

  /**
   * Set int64
   */
  @JsonProperty(JSON_PROPERTY_INT64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  public FormatTest int64(Long int64) {
    this.int64 = int64;
    return this;
  }

  /**
   * Get number
   * minimum: 32.1
   * maximum: 543.2
   * @return number
   **/
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getNumber() {
    return number;
  }

  /**
   * Set number
   */
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public FormatTest number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Get _float
   * minimum: 54.3
   * maximum: 987.6
   * @return _float
   **/
  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getFloat() {
    return _float;
  }

  /**
   * Set _float
   */
  @JsonProperty(JSON_PROPERTY_FLOAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloat(Float _float) {
    this._float = _float;
  }

  public FormatTest _float(Float _float) {
    this._float = _float;
    return this;
  }

  /**
   * Get _double
   * minimum: 67.8
   * maximum: 123.4
   * @return _double
   **/
  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDouble() {
    return _double;
  }

  /**
   * Set _double
   */
  @JsonProperty(JSON_PROPERTY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDouble(Double _double) {
    this._double = _double;
  }

  public FormatTest _double(Double _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get decimal
   * @return decimal
   **/
  @JsonProperty(JSON_PROPERTY_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getDecimal() {
    return decimal;
  }

  /**
   * Set decimal
   */
  @JsonProperty(JSON_PROPERTY_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecimal(BigDecimal decimal) {
    this.decimal = decimal;
  }

  public FormatTest decimal(BigDecimal decimal) {
    this.decimal = decimal;
    return this;
  }

  /**
   * Get string
   * @return string
   **/
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getString() {
    return string;
  }

  /**
   * Set string
   */
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setString(String string) {
    this.string = string;
  }

  public FormatTest string(String string) {
    this.string = string;
    return this;
  }

  /**
   * Get _byte
   * @return _byte
   **/
  @JsonProperty(JSON_PROPERTY_BYTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public byte[] getByte() {
    return _byte;
  }

  /**
   * Set _byte
   */
  @JsonProperty(JSON_PROPERTY_BYTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  public FormatTest _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

  /**
   * Get binary
   * @return binary
   **/
  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public File getBinary() {
    return binary;
  }

  /**
   * Set binary
   */
  @JsonProperty(JSON_PROPERTY_BINARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinary(File binary) {
    this.binary = binary;
  }

  public FormatTest binary(File binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Date getDate() {
    return date;
  }

  /**
   * Set date
   */
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(Date date) {
    this.date = date;
  }

  public FormatTest date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   **/
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Date getDateTime() {
    return dateTime;
  }

  /**
   * Set dateTime
   */
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public FormatTest dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   **/
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUuid() {
    return uuid;
  }

  /**
   * Set uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public FormatTest uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPassword() {
    return password;
  }

  /**
   * Set password
   */
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }

  public FormatTest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * A string that is a 10 digit number. Can have leading zeros.
   * @return patternWithDigits
   **/
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPatternWithDigits() {
    return patternWithDigits;
  }

  /**
   * Set patternWithDigits
   */
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatternWithDigits(String patternWithDigits) {
    this.patternWithDigits = patternWithDigits;
  }

  public FormatTest patternWithDigits(String patternWithDigits) {
    this.patternWithDigits = patternWithDigits;
    return this;
  }

  /**
   * A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.
   * @return patternWithDigitsAndDelimiter
   **/
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPatternWithDigitsAndDelimiter() {
    return patternWithDigitsAndDelimiter;
  }

  /**
   * Set patternWithDigitsAndDelimiter
   */
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatternWithDigitsAndDelimiter(String patternWithDigitsAndDelimiter) {
    this.patternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
  }

  public FormatTest patternWithDigitsAndDelimiter(String patternWithDigitsAndDelimiter) {
    this.patternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    patternWithDigits: ").append(toIndentedString(patternWithDigits)).append("\n");
    sb.append("    patternWithDigitsAndDelimiter: ").append(toIndentedString(patternWithDigitsAndDelimiter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

