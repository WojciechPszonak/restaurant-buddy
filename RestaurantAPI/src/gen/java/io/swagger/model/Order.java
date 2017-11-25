
/*
 * WMAP application
 *  Manage your restaurant like a boss
 *
 * OpenAPI spec version: 1.0.0
 * Contact: WMAP@gmail.pl
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-24T19:28:58.171Z")
public class Order   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tableId")
  private String tableId = null;

  @JsonProperty("listOfDishes")
  private List<Dish> listOfDishes = null;

  
  public Order() {
	this.listOfDishes = new LinkedList<>();
}

  public Order(String id, String tableId, List<Dish> listOfDishes) {
	this.id = id;
	this.tableId = tableId;
	this.listOfDishes = listOfDishes;
}

public Order id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Get tableId
   * @return tableId
   **/
  @JsonProperty("tableId")
  @ApiModelProperty(value = "")
  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }

  public Order listOfDishes(List<Dish> listOfDishes) {
    this.listOfDishes = listOfDishes;
    return this;
  }

  public Order addListOfDishesItem(Dish listOfDishesItem) {
    if (this.listOfDishes == null) {
      this.listOfDishes = new ArrayList<Dish>();
    }
    this.listOfDishes.add(listOfDishesItem);
    return this;
  }

  /**
   * Get listOfDishes
   * @return listOfDishes
   **/
  @JsonProperty("listOfDishes")
  @ApiModelProperty(value = "")
  public List<Dish> getListOfDishes() {
    return listOfDishes;
  }

  public void setListOfDishes(List<Dish> listOfDishes) {
    this.listOfDishes = listOfDishes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.tableId, order.tableId) &&
        Objects.equals(this.listOfDishes, order.listOfDishes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tableId, listOfDishes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    listOfDishes: ").append(toIndentedString(listOfDishes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}