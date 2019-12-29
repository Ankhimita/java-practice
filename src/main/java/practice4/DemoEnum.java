package practice4;

public enum DemoEnum {

    CUSTOMER_ID("customerId"),
    PRODUCT_COUNT("productCount"),
    ASIN_LIST("asinList");

    private DemoEnum(String jsonKey){
        this.jsonKey = jsonKey;
    }
    private String jsonKey;

    public String getJsonKey() {
        return jsonKey;
    }

    public void setJsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
    }
}
