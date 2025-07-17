public class Student implements Comparable {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Object o) {

        // int id1 = this.getId();
        // int id2 = ((Student) o).getId();
        // return (id1 < id2) ? -1 : (id1 > id2) ? +1 : 0;

        String s1 = this.getName();
        String s2 = ((Student) o).getName();
        return -s1.compareTo(s2);

    }

}