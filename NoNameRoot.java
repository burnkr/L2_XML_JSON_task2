package L2_XML_JSON.task2;

import com.google.gson.annotations.SerializedName;

public class NoNameRoot {
    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    @SerializedName("address")
    public Address addresses;
}
