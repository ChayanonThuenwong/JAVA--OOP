class Student {
private String name, surname, university;
    private String id; // ใช้ String แทน long เพื่อความปลอดภัยในการเก็บเลขยาว

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surname) {
        this.surname = surname;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void DisplayStudent() {
        System.out.println("Hello! " + this.name + " " + this.surname + "\nInstitution : " + this.university + "\nID : "
                + this.id+"\n");
    }
}