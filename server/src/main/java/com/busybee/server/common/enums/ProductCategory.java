package com.busybee.server.common.enums;

/**
 * The product category consists of an ID to differentiate them, a name or title, and a brief description of what the
 * contents are in the category.
 */

public enum ProductCategory {

    OFFICE_SUPPLIES(1, "Office Supplies", "Basic filing supplies and "),
    FURNITURE(2, "Office Furniture", "Office chairs, desks, and filing cabinets."),
    HARDWARE(3, "Hardware", "Electronics, computers, and printers.");

    private int id;

    private String categoryName;
    private String categoryDesc;

    ProductCategory(int id, String categoryName, String categoryDesc) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    /**
     * Returns the associated Product Category from the ID entered.
     * @param id - the int ID to specify the category.
     * @return - a ProductCategory object or null.
     */
    public ProductCategory getCategory(int id) {
        switch (id) {
            case 1:
                return OFFICE_SUPPLIES;
            case 2:
                return FURNITURE;
            case 3:
                return HARDWARE;
            default:
                return null;
        }
    }
}
