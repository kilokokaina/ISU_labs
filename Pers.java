class Obj {
    String first_name, second_name;

    Obj(String first_name, String second_name) {
        this.first_name = first_name;
        this.second_name = second_name;
    }
}

public class Pers {
    public static void main(String[] args) {
        Obj[] pers_array = new Obj[5];

        pers_array[0] = new Obj("Jack", "Warington");
        pers_array[1] = new Obj("Jack", "Geits");
        pers_array[2] = new Obj("Bob", "Davidson");
        pers_array[3] = new Obj("Cristy", "Johnson");
        pers_array[4] = new Obj("Alan", "Clouding");

        for (Obj pers : pers_array) System.out.print(pers.first_name + " " + pers.second_name +"\n");
    }
}