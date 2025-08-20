class Employee {
    // Public Attribute \\
    public String id;
    public String name;
    public int salary;

    // Private Attribute \\
    private String address;
    private String postcode;

    // Create function to *Access private Attribute* \\
    public void setAddress(String addressKey) {
        address = addressKey;
    }

    public void setPostCode(String postcode) {
        this.postcode = postcode; // Second method \\
    }

    // Create function to *Display private Attribute* \\
    public void DisplayEmployee() {
        System.out.println(address + ", " + this.postcode);
    }

    // Create function to *Return selected value to Display* \\
    public String getPostcode(){
        return this.postcode;
    }
}
