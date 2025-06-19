interface Age {

    int x =21;
    void getAge();
}

public class InnerExample {

    public static void main(String[] args) {

        Age a = new Age() {

            @Override
            public void getAge() {
                System.out.println("Age is : "+x);
            }  
        };

        a.getAge();   
    }
}
