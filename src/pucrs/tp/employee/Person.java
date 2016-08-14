package pucrs.tp.employee;

/**
 * Created by Lucas on 14/08/2016.
 */
abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
