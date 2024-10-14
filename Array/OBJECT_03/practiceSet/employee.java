package Array.OBJECT_03.practiceSet;

class employee {

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }


    public static void main(String[] args) {

        employee obj = new employee();
        obj.salary = 500000;
        obj.name = "nayan";
        System.out.println(obj.getName());

        obj.setName("kundan");
        System.out.println(obj.name);
        System.out.println(obj.salary);

    }
}

