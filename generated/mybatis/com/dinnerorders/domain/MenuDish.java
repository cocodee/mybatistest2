package com.dinnerorders.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MenuDish {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.menu_id
     *
     * @mbggenerated
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.dish_id
     *
     * @mbggenerated
     */
    private Integer dishId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.added_by
     *
     * @mbggenerated
     */
    private Integer addedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_dishes.added_time
     *
     * @mbggenerated
     */
    private Date addedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.id
     *
     * @return the value of menu_dishes.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.id
     *
     * @param id the value for menu_dishes.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.menu_id
     *
     * @return the value of menu_dishes.menu_id
     *
     * @mbggenerated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.menu_id
     *
     * @param menuId the value for menu_dishes.menu_id
     *
     * @mbggenerated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.dish_id
     *
     * @return the value of menu_dishes.dish_id
     *
     * @mbggenerated
     */
    public Integer getDishId() {
        return dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.dish_id
     *
     * @param dishId the value for menu_dishes.dish_id
     *
     * @mbggenerated
     */
    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.count
     *
     * @return the value of menu_dishes.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.count
     *
     * @param count the value for menu_dishes.count
     *
     * @mbggenerated
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.price
     *
     * @return the value of menu_dishes.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.price
     *
     * @param price the value for menu_dishes.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.added_by
     *
     * @return the value of menu_dishes.added_by
     *
     * @mbggenerated
     */
    public Integer getAddedBy() {
        return addedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.added_by
     *
     * @param addedBy the value for menu_dishes.added_by
     *
     * @mbggenerated
     */
    public void setAddedBy(Integer addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_dishes.added_time
     *
     * @return the value of menu_dishes.added_time
     *
     * @mbggenerated
     */
    public Date getAddedTime() {
        return addedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_dishes.added_time
     *
     * @param addedTime the value for menu_dishes.added_time
     *
     * @mbggenerated
     */
    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }
}