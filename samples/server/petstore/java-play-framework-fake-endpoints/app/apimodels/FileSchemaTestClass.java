package apimodels;

import apimodels.ModelFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FileSchemaTestClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FileSchemaTestClass   {
  @JsonProperty("file")
  @Valid

  private ModelFile _file;

  @JsonProperty("files")
  @Valid

  private List<@Valid ModelFile> files = null;

  public FileSchemaTestClass _file(ModelFile _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  public ModelFile getFile() {
    return _file;
  }

  public void setFile(ModelFile _file) {
    this._file = _file;
  }

  public FileSchemaTestClass files(List<@Valid ModelFile> files) {
    this.files = files;
    return this;
  }

  public FileSchemaTestClass addFilesItem(ModelFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  public List<@Valid ModelFile> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid ModelFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSchemaTestClass fileSchemaTestClass = (FileSchemaTestClass) o;
    return Objects.equals(_file, fileSchemaTestClass._file) &&
        Objects.equals(files, fileSchemaTestClass.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, files);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSchemaTestClass {\n");
    
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

